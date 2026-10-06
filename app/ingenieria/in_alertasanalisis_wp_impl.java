package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class in_alertasanalisis_wp_impl extends GXDataArea
{
   public in_alertasanalisis_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public in_alertasanalisis_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( in_alertasanalisis_wp_impl.class ));
   }

   public in_alertasanalisis_wp_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            gxnrgrid_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            gxgrgrid_refresh_invoke( ) ;
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

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_100 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_100"))) ;
      nGXsfl_100_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_100_idx"))) ;
      sGXsfl_100_idx = httpContext.GetPar( "sGXsfl_100_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9ColumnsSelector);
      AV116Pgmname = httpContext.GetPar( "Pgmname") ;
      AV55TFIn_AlertasAnalisis_SDT__MaqCod = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__MaqCod") ;
      AV42TFIn_AlertasAnalisis_SDT__BarCod = (int)(GXutil.lval( httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarCod"))) ;
      AV43TFIn_AlertasAnalisis_SDT__BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarCodReo"))) ;
      AV44TFIn_AlertasAnalisis_SDT__BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarOrdLin"))) ;
      AV52TFIn_AlertasAnalisis_SDT__Fase = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__Fase") ;
      AV53TFIn_AlertasAnalisis_SDT__HisProDf = localUtil.parseDateParm( httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__HisProDf")) ;
      AV54TFIn_AlertasAnalisis_SDT__HisProHf = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__HisProHf"))) ;
      AV51TFIn_AlertasAnalisis_SDT__CliCod = (int)(GXutil.lval( httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__CliCod"))) ;
      AV48TFIn_AlertasAnalisis_SDT__BarSer = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarSer") ;
      AV56TFIn_AlertasAnalisis_SDT__ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__ParFasCod"))) ;
      AV57TFIn_AlertasAnalisis_SDT__ParFasDsc = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__ParFasDsc") ;
      AV45TFIn_AlertasAnalisis_SDT__BarParVl2 = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarParVl2") ;
      AV46TFIn_AlertasAnalisis_SDT__BarParVMn = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarParVMn") ;
      AV47TFIn_AlertasAnalisis_SDT__BarParVMx = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarParVMx") ;
      AV49TFIn_AlertasAnalisis_SDT__BarValPar = httpContext.GetPar( "TFIn_AlertasAnalisis_SDT__BarValPar") ;
      AV16Desde_HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "Desde_HisProDTF")) ;
      AV29Hasta_HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "Hasta_HisProDTF")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36MaqCod);
      AV7CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5ArtCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20Fase);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39ParFasCod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV31In_AlertasAnalisis_SDT);
      AV69ValueCard2 = (int)(GXutil.lval( httpContext.GetPar( "ValueCard2"))) ;
      AV70ValueCard3 = (int)(GXutil.lval( httpContext.GetPar( "ValueCard3"))) ;
      AV68ValueCard4 = (int)(GXutil.lval( httpContext.GetPar( "ValueCard4"))) ;
      AV17EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
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
      pa1TN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1TN2( ) ;
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
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DVProgressIndicator/DVProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DVProgressIndicator/DVProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DVProgressIndicator/DVProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.in_alertasanalisis_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIN_ALERTASANALISIS_SDT", getSecureSignedToken( "", AV31In_AlertasAnalisis_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"In_AlertasAnalisis_WP");
      forbiddenHiddens.add("ValueCard3", localUtil.format( DecimalUtil.doubleToDec(AV70ValueCard3), "ZZ,ZZZ,ZZ9"));
      forbiddenHiddens.add("ValueCard2", localUtil.format( DecimalUtil.doubleToDec(AV69ValueCard2), "ZZ,ZZZ,ZZ9"));
      forbiddenHiddens.add("ValueCard4", localUtil.format( DecimalUtil.doubleToDec(AV68ValueCard4), "ZZ,ZZZ,ZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV116Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\in_alertasanalisis_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "In_alertasanalisis_sdt", AV31In_AlertasAnalisis_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("In_alertasanalisis_sdt", AV31In_AlertasAnalisis_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_In_alertasanalisis_sdt", getSecureSignedToken( "", AV31In_AlertasAnalisis_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_100", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_100, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV8CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV8CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTCOD_DATA", AV6ArtCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTCOD_DATA", AV6ArtCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV37MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV37MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASE_DATA", AV21Fase_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASE_DATA", AV21Fase_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD_DATA", AV40ParFasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD_DATA", AV40ParFasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vELEMENTS", AV85Elements);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vELEMENTS", AV85Elements);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARAMETERS", AV93Parameters);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARAMETERS", AV93Parameters);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCLICKDATA", AV88ItemClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCLICKDATA", AV88ItemClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMDOUBLECLICKDATA", AV90ItemDoubleClickData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMDOUBLECLICKDATA", AV90ItemDoubleClickData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDRAGANDDROPDATA", AV83DragAndDropData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDRAGANDDROPDATA", AV83DragAndDropData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERCHANGEDDATA", AV86FilterChangedData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERCHANGEDDATA", AV86FilterChangedData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMEXPANDDATA", AV91ItemExpandData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMEXPANDDATA", AV91ItemExpandData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vITEMCOLLAPSEDATA", AV89ItemCollapseData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vITEMCOLLAPSEDATA", AV89ItemCollapseData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__MAQCOD", GXutil.rtrim( AV55TFIn_AlertasAnalisis_SDT__MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARCOD", GXutil.ltrim( localUtil.ntoc( AV42TFIn_AlertasAnalisis_SDT__BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARCODREO", GXutil.ltrim( localUtil.ntoc( AV43TFIn_AlertasAnalisis_SDT__BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARORDLIN", GXutil.ltrim( localUtil.ntoc( AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__FASE", GXutil.rtrim( AV52TFIn_AlertasAnalisis_SDT__Fase));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__HISPRODF", localUtil.dtoc( AV53TFIn_AlertasAnalisis_SDT__HisProDf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__HISPROHF", localUtil.ttoc( AV54TFIn_AlertasAnalisis_SDT__HisProHf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__CLICOD", GXutil.ltrim( localUtil.ntoc( AV51TFIn_AlertasAnalisis_SDT__CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARSER", GXutil.rtrim( AV48TFIn_AlertasAnalisis_SDT__BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__PARFASCOD", GXutil.ltrim( localUtil.ntoc( AV56TFIn_AlertasAnalisis_SDT__ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__PARFASDSC", GXutil.rtrim( AV57TFIn_AlertasAnalisis_SDT__ParFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARPARVL2", GXutil.rtrim( AV45TFIn_AlertasAnalisis_SDT__BarParVl2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARPARVMN", GXutil.rtrim( AV46TFIn_AlertasAnalisis_SDT__BarParVMn));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARPARVMX", GXutil.rtrim( AV47TFIn_AlertasAnalisis_SDT__BarParVMx));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFIN_ALERTASANALISIS_SDT__BARVALPAR", GXutil.rtrim( AV49TFIn_AlertasAnalisis_SDT__BarValPar));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD", AV36MaqCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD", AV36MaqCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vARTCOD", AV5ArtCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vARTCOD", AV5ArtCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASE", AV20Fase);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASE", AV20Fase);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARFASCOD", AV39ParFasCod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARFASCOD", AV39ParFasCod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vIN_ALERTASANALISIS_SDT", AV31In_AlertasAnalisis_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vIN_ALERTASANALISIS_SDT", AV31In_AlertasAnalisis_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIN_ALERTASANALISIS_SDT", getSecureSignedToken( "", AV31In_AlertasAnalisis_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTCOD", GXutil.rtrim( A65ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ARTDSC", GXutil.rtrim( A69ArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitemtext", GXutil.rtrim( Combo_clicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Cls", GXutil.rtrim( Combo_artcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Selectedvalue_set", GXutil.rtrim( Combo_artcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Allowmultipleselection", GXutil.booltostr( Combo_artcod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_artcod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Emptyitem", GXutil.booltostr( Combo_artcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Multiplevaluestype", GXutil.rtrim( Combo_artcod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Allowmultipleselection", GXutil.booltostr( Combo_maqcod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_maqcod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitem", GXutil.booltostr( Combo_maqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Multiplevaluestype", GXutil.rtrim( Combo_maqcod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Cls", GXutil.rtrim( Combo_fase_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Selectedvalue_set", GXutil.rtrim( Combo_fase_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Allowmultipleselection", GXutil.booltostr( Combo_fase_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Includeonlyselectedoption", GXutil.booltostr( Combo_fase_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Emptyitem", GXutil.booltostr( Combo_fase_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Multiplevaluestype", GXutil.rtrim( Combo_fase_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Cls", GXutil.rtrim( Combo_parfascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_set", GXutil.rtrim( Combo_parfascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Allowmultipleselection", GXutil.booltostr( Combo_parfascod_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Includeonlyselectedoption", GXutil.booltostr( Combo_parfascod_Includeonlyselectedoption));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Emptyitem", GXutil.booltostr( Combo_parfascod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Multiplevaluestype", GXutil.rtrim( Combo_parfascod_Multiplevaluestype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD3_Caption", GXutil.rtrim( Progresscard3_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD3_Cls", GXutil.rtrim( Progresscard3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD3_Percentage", GXutil.ltrim( localUtil.ntoc( Progresscard3_Percentage, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD2_Caption", GXutil.rtrim( Progresscard2_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD2_Cls", GXutil.rtrim( Progresscard2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD2_Percentage", GXutil.ltrim( localUtil.ntoc( Progresscard2_Percentage, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD4_Caption", GXutil.rtrim( Progresscard4_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD4_Cls", GXutil.rtrim( Progresscard4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "PROGRESSCARD4_Percentage", GXutil.ltrim( localUtil.ntoc( Progresscard4_Percentage, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UTCHARTSMOOTHAREA_Type", GXutil.rtrim( Utchartsmootharea_Type));
      app.GxWebStd.gx_hidden_field( httpContext, "UTCHARTSMOOTHAREA_Charttype", GXutil.rtrim( Utchartsmootharea_Charttype));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Gridinternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__maqcod_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Iteminternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__maqcod_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Isgriditem", GXutil.booltostr( Popover_in_alertasanalisis_sdt__maqcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Trigger", GXutil.rtrim( Popover_in_alertasanalisis_sdt__maqcod_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_in_alertasanalisis_sdt__maqcod_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Position", GXutil.rtrim( Popover_in_alertasanalisis_sdt__maqcod_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Gridinternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barcod_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Iteminternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barcod_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Isgriditem", GXutil.booltostr( Popover_in_alertasanalisis_sdt__barcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Trigger", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barcod_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_in_alertasanalisis_sdt__barcod_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Position", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barcod_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Gridinternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__clicod_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Iteminternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__clicod_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Isgriditem", GXutil.booltostr( Popover_in_alertasanalisis_sdt__clicod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Trigger", GXutil.rtrim( Popover_in_alertasanalisis_sdt__clicod_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_in_alertasanalisis_sdt__clicod_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Position", GXutil.rtrim( Popover_in_alertasanalisis_sdt__clicod_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Gridinternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barser_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Iteminternalname", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barser_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Isgriditem", GXutil.booltostr( Popover_in_alertasanalisis_sdt__barser_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Trigger", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barser_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_in_alertasanalisis_sdt__barser_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Position", GXutil.rtrim( Popover_in_alertasanalisis_sdt__barser_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_ACTIONNOTIFICAR_Gridinternalname", GXutil.rtrim( Popover_actionnotificar_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_ACTIONNOTIFICAR_Iteminternalname", GXutil.rtrim( Popover_actionnotificar_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_ACTIONNOTIFICAR_Isgriditem", GXutil.booltostr( Popover_actionnotificar_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_ACTIONNOTIFICAR_Trigger", GXutil.rtrim( Popover_actionnotificar_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_ACTIONNOTIFICAR_Triggerelement", GXutil.rtrim( Popover_actionnotificar_Triggerelement));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_ACTIONNOTIFICAR_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_actionnotificar_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_ACTIONNOTIFICAR_Position", GXutil.rtrim( Popover_actionnotificar_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Grid_empowerer_Popoversingrid));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARFASCOD_Selectedvalue_get", GXutil.rtrim( Combo_parfascod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Selectedvalue_get", GXutil.rtrim( Combo_fase_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_ARTCOD_Selectedvalue_get", GXutil.rtrim( Combo_artcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_get", GXutil.rtrim( Combo_clicod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_get", GXutil.rtrim( Combo_clicod_Selectedvalue_get));
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
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
         we1TN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1TN2( ) ;
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
      return formatLink("app.ingenieria.in_alertasanalisis_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.In_AlertasAnalisis_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Análisis | Alertas", "") ;
   }

   public void wb1TN0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_14_1TN2( true) ;
      }
      else
      {
         wb_table1_14_1TN2( false) ;
      }
      return  ;
   }

   public void wb_table1_14_1TN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDesde_hisprodtf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDesde_hisprodtf_Internalname, httpContext.getMessage( "Desde fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDesde_hisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDesde_hisprodtf_Internalname, localUtil.ttoc( AV16Desde_HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV16Desde_HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDesde_hisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDesde_hisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDesde_hisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDesde_hisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHasta_hisprodtf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHasta_hisprodtf_Internalname, httpContext.getMessage( "Hasta fecha", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHasta_hisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHasta_hisprodtf_Internalname, localUtil.ttoc( AV29Hasta_HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV29Hasta_HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHasta_hisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHasta_hisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHasta_hisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHasta_hisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop30", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuscar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 100, 3, 0)+","+"null"+");", httpContext.getMessage( "Buscar", ""), bttBtnbuscar_Jsonclick, 5, httpContext.getMessage( "Buscar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOBUSCAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop30", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 100, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
         ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
         ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
         ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
         ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
         ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
         ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
         ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
         ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
         ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockcombo_clicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
         ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
         ucCombo_clicod.setProperty("EmptyItemText", Combo_clicod_Emptyitemtext);
         ucCombo_clicod.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_clicod.setProperty("DropDownOptionsData", AV8CliCod_Data);
         ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedartcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_artcod_Internalname, httpContext.getMessage( "Artículo", ""), "", "", lblTextblockcombo_artcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_artcod.setProperty("Caption", Combo_artcod_Caption);
         ucCombo_artcod.setProperty("Cls", Combo_artcod_Cls);
         ucCombo_artcod.setProperty("AllowMultipleSelection", Combo_artcod_Allowmultipleselection);
         ucCombo_artcod.setProperty("IncludeOnlySelectedOption", Combo_artcod_Includeonlyselectedoption);
         ucCombo_artcod.setProperty("EmptyItem", Combo_artcod_Emptyitem);
         ucCombo_artcod.setProperty("MultipleValuesType", Combo_artcod_Multiplevaluestype);
         ucCombo_artcod.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_artcod.setProperty("DropDownOptionsData", AV6ArtCod_Data);
         ucCombo_artcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_artcod_Internalname, "COMBO_ARTCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("AllowMultipleSelection", Combo_maqcod_Allowmultipleselection);
         ucCombo_maqcod.setProperty("IncludeOnlySelectedOption", Combo_maqcod_Includeonlyselectedoption);
         ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
         ucCombo_maqcod.setProperty("MultipleValuesType", Combo_maqcod_Multiplevaluestype);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV37MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfase_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fase_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockcombo_fase_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fase.setProperty("Caption", Combo_fase_Caption);
         ucCombo_fase.setProperty("Cls", Combo_fase_Cls);
         ucCombo_fase.setProperty("AllowMultipleSelection", Combo_fase_Allowmultipleselection);
         ucCombo_fase.setProperty("IncludeOnlySelectedOption", Combo_fase_Includeonlyselectedoption);
         ucCombo_fase.setProperty("EmptyItem", Combo_fase_Emptyitem);
         ucCombo_fase.setProperty("MultipleValuesType", Combo_fase_Multiplevaluestype);
         ucCombo_fase.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_fase.setProperty("DropDownOptionsData", AV21Fase_Data);
         ucCombo_fase.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fase_Internalname, "COMBO_FASEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedparfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_parfascod_Internalname, httpContext.getMessage( "Parámetro", ""), "", "", lblTextblockcombo_parfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
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
         ucCombo_parfascod.setProperty("DropDownOptionsData", AV40ParFasCod_Data);
         ucCombo_parfascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parfascod_Internalname, "COMBO_PARFASCODContainer");
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
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab_analisis_title_Internalname, httpContext.getMessage( "Análisis", ""), "", "", lblTab_analisis_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab_Analisis") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol100( ) ;
      }
      if ( wbEnd == 100 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_100 = (int)(nGXsfl_100_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV99GXV1 = nGXsfl_100_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_126_1TN2( true) ;
      }
      else
      {
         wb_table2_126_1TN2( false) ;
      }
      return  ;
   }

   public void wb_table2_126_1TN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab_alertas_title_Internalname, httpContext.getMessage( "Alertas", ""), "", "", lblTab_alertas_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab_Alertas") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         wb_table3_166_1TN2( true) ;
      }
      else
      {
         wb_table3_166_1TN2( false) ;
      }
      return  ;
   }

   public void wb_table3_166_1TN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         wb_table4_184_1TN2( true) ;
      }
      else
      {
         wb_table4_184_1TN2( false) ;
      }
      return  ;
   }

   public void wb_table4_184_1TN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         wb_table5_202_1TN2( true) ;
      }
      else
      {
         wb_table5_202_1TN2( false) ;
      }
      return  ;
   }

   public void wb_table5_202_1TN2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUtchartsmootharea.setProperty("Elements", AV85Elements);
         ucUtchartsmootharea.setProperty("Parameters", AV93Parameters);
         ucUtchartsmootharea.setProperty("Type", Utchartsmootharea_Type);
         ucUtchartsmootharea.setProperty("Title", Utchartsmootharea_Title);
         ucUtchartsmootharea.setProperty("ChartType", Utchartsmootharea_Charttype);
         ucUtchartsmootharea.setProperty("ItemClickData", AV88ItemClickData);
         ucUtchartsmootharea.setProperty("ItemDoubleClickData", AV90ItemDoubleClickData);
         ucUtchartsmootharea.setProperty("DragAndDropData", AV83DragAndDropData);
         ucUtchartsmootharea.setProperty("FilterChangedData", AV86FilterChangedData);
         ucUtchartsmootharea.setProperty("ItemExpandData", AV91ItemExpandData);
         ucUtchartsmootharea.setProperty("ItemCollapseData", AV89ItemCollapseData);
         ucUtchartsmootharea.render(context, "queryviewer", Utchartsmootharea_Internalname, "UTCHARTSMOOTHAREAContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV116Pgmname), GXutil.rtrim( localUtil.format( AV116Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,232);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         /* User Defined Control */
         ucPopover_in_alertasanalisis_sdt__maqcod.setProperty("IsGridItem", Popover_in_alertasanalisis_sdt__maqcod_Isgriditem);
         ucPopover_in_alertasanalisis_sdt__maqcod.setProperty("Trigger", Popover_in_alertasanalisis_sdt__maqcod_Trigger);
         ucPopover_in_alertasanalisis_sdt__maqcod.setProperty("PopoverWidth", Popover_in_alertasanalisis_sdt__maqcod_Popoverwidth);
         ucPopover_in_alertasanalisis_sdt__maqcod.setProperty("Position", Popover_in_alertasanalisis_sdt__maqcod_Position);
         ucPopover_in_alertasanalisis_sdt__maqcod.render(context, "dvelop.wwppopover", Popover_in_alertasanalisis_sdt__maqcod_Internalname, "POPOVER_IN_ALERTASANALISIS_SDT__MAQCODContainer");
         /* User Defined Control */
         ucPopover_in_alertasanalisis_sdt__barcod.setProperty("IsGridItem", Popover_in_alertasanalisis_sdt__barcod_Isgriditem);
         ucPopover_in_alertasanalisis_sdt__barcod.setProperty("Trigger", Popover_in_alertasanalisis_sdt__barcod_Trigger);
         ucPopover_in_alertasanalisis_sdt__barcod.setProperty("PopoverWidth", Popover_in_alertasanalisis_sdt__barcod_Popoverwidth);
         ucPopover_in_alertasanalisis_sdt__barcod.setProperty("Position", Popover_in_alertasanalisis_sdt__barcod_Position);
         ucPopover_in_alertasanalisis_sdt__barcod.render(context, "dvelop.wwppopover", Popover_in_alertasanalisis_sdt__barcod_Internalname, "POPOVER_IN_ALERTASANALISIS_SDT__BARCODContainer");
         /* User Defined Control */
         ucPopover_in_alertasanalisis_sdt__clicod.setProperty("IsGridItem", Popover_in_alertasanalisis_sdt__clicod_Isgriditem);
         ucPopover_in_alertasanalisis_sdt__clicod.setProperty("Trigger", Popover_in_alertasanalisis_sdt__clicod_Trigger);
         ucPopover_in_alertasanalisis_sdt__clicod.setProperty("PopoverWidth", Popover_in_alertasanalisis_sdt__clicod_Popoverwidth);
         ucPopover_in_alertasanalisis_sdt__clicod.setProperty("Position", Popover_in_alertasanalisis_sdt__clicod_Position);
         ucPopover_in_alertasanalisis_sdt__clicod.render(context, "dvelop.wwppopover", Popover_in_alertasanalisis_sdt__clicod_Internalname, "POPOVER_IN_ALERTASANALISIS_SDT__CLICODContainer");
         /* User Defined Control */
         ucPopover_in_alertasanalisis_sdt__barser.setProperty("IsGridItem", Popover_in_alertasanalisis_sdt__barser_Isgriditem);
         ucPopover_in_alertasanalisis_sdt__barser.setProperty("Trigger", Popover_in_alertasanalisis_sdt__barser_Trigger);
         ucPopover_in_alertasanalisis_sdt__barser.setProperty("PopoverWidth", Popover_in_alertasanalisis_sdt__barser_Popoverwidth);
         ucPopover_in_alertasanalisis_sdt__barser.setProperty("Position", Popover_in_alertasanalisis_sdt__barser_Position);
         ucPopover_in_alertasanalisis_sdt__barser.render(context, "dvelop.wwppopover", Popover_in_alertasanalisis_sdt__barser_Internalname, "POPOVER_IN_ALERTASANALISIS_SDT__BARSERContainer");
         /* User Defined Control */
         ucPopover_actionnotificar.setProperty("IsGridItem", Popover_actionnotificar_Isgriditem);
         ucPopover_actionnotificar.setProperty("Trigger", Popover_actionnotificar_Trigger);
         ucPopover_actionnotificar.setProperty("TriggerElement", Popover_actionnotificar_Triggerelement);
         ucPopover_actionnotificar.setProperty("PopoverWidth", Popover_actionnotificar_Popoverwidth);
         ucPopover_actionnotificar.setProperty("Position", Popover_actionnotificar_Position);
         ucPopover_actionnotificar.render(context, "dvelop.wwppopover", Popover_actionnotificar_Internalname, "POPOVER_ACTIONNOTIFICARContainer");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV9ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("PopoversInGrid", Grid_empowerer_Popoversingrid);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0242"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0242"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_100_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0242"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_in_alertasanalisis_sdt__hisprodfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname, localUtil.format(AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate, "99/99/99"), localUtil.format( AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_in_alertasanalisis_sdt__hisprohfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname, localUtil.format(AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate, "99/99/99"), localUtil.format( AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 100 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV99GXV1 = nGXsfl_100_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1TN2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Análisis | Alertas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1TN0( ) ;
   }

   public void ws1TN2( )
   {
      start1TN2( ) ;
      evt1TN2( ) ;
   }

   public void evt1TN2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111TN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121TN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131TN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141TN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151TN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBUSCAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoBuscar' */
                           e161TN2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__BARSER.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__CLICOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__BARCOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__MAQCOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__MAQCOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__BARCOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__CLICOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 36), "IN_ALERTASANALISIS_SDT__BARSER.CLICK") == 0 ) )
                        {
                           nGXsfl_100_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1002( ) ;
                           AV99GXV1 = (int)(nGXsfl_100_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV31In_AlertasAnalisis_SDT.size() >= AV99GXV1 ) && ( AV99GXV1 > 0 ) )
                           {
                              AV31In_AlertasAnalisis_SDT.currentItem( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)) );
                              AV62In_AlertasAnalisis_SDT__MaqCodWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname, AV62In_AlertasAnalisis_SDT__MaqCodWithTags);
                              AV63In_AlertasAnalisis_SDT__BarCodWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname, AV63In_AlertasAnalisis_SDT__BarCodWithTags);
                              AV64In_AlertasAnalisis_SDT__CliCodWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname, AV64In_AlertasAnalisis_SDT__CliCodWithTags);
                              AV65In_AlertasAnalisis_SDT__BarSerWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__barserwithtags_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__barserwithtags_Internalname, AV65In_AlertasAnalisis_SDT__BarSerWithTags);
                              AV67ActionNotificar = httpContext.cgiGet( edtavActionnotificar_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavActionnotificar_Internalname, AV67ActionNotificar);
                              if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavActionnotificar_load_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavActionnotificar_load_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                              {
                                 httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACTIONNOTIFICAR_LOAD");
                                 GX_FocusControl = edtavActionnotificar_load_Internalname ;
                                 httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                 wbErr = true ;
                                 AV66ActionNotificar_Load = (short)(0) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavActionnotificar_load_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66ActionNotificar_Load), 4, 0));
                              }
                              else
                              {
                                 AV66ActionNotificar_Load = (short)(localUtil.ctol( httpContext.cgiGet( edtavActionnotificar_load_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                                 httpContext.ajax_rsp_assign_attri("", false, edtavActionnotificar_load_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66ActionNotificar_Load), 4, 0));
                              }
                              AV24GridBadge = httpContext.cgiGet( edtavGridbadge_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbadge_Internalname, AV24GridBadge);
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
                                 e171TN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e181TN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191TN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "IN_ALERTASANALISIS_SDT__BARSER.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201TN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "IN_ALERTASANALISIS_SDT__CLICOD.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e211TN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "IN_ALERTASANALISIS_SDT__BARCOD.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221TN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "IN_ALERTASANALISIS_SDT__MAQCOD.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231TN2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 242 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0242") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0242", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1TN2( )
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

   public void pa1TN2( )
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
            GX_FocusControl = edtavDesde_hisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1002( ) ;
      while ( nGXsfl_100_idx <= nRC_GXsfl_100 )
      {
         sendrow_1002( ) ;
         nGXsfl_100_idx = ((subGrid_Islastpage==1)&&(nGXsfl_100_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1002( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ,
                                 String AV116Pgmname ,
                                 String AV55TFIn_AlertasAnalisis_SDT__MaqCod ,
                                 int AV42TFIn_AlertasAnalisis_SDT__BarCod ,
                                 byte AV43TFIn_AlertasAnalisis_SDT__BarCodReo ,
                                 short AV44TFIn_AlertasAnalisis_SDT__BarOrdLin ,
                                 String AV52TFIn_AlertasAnalisis_SDT__Fase ,
                                 java.util.Date AV53TFIn_AlertasAnalisis_SDT__HisProDf ,
                                 java.util.Date AV54TFIn_AlertasAnalisis_SDT__HisProHf ,
                                 int AV51TFIn_AlertasAnalisis_SDT__CliCod ,
                                 String AV48TFIn_AlertasAnalisis_SDT__BarSer ,
                                 short AV56TFIn_AlertasAnalisis_SDT__ParFasCod ,
                                 String AV57TFIn_AlertasAnalisis_SDT__ParFasDsc ,
                                 String AV45TFIn_AlertasAnalisis_SDT__BarParVl2 ,
                                 String AV46TFIn_AlertasAnalisis_SDT__BarParVMn ,
                                 String AV47TFIn_AlertasAnalisis_SDT__BarParVMx ,
                                 String AV49TFIn_AlertasAnalisis_SDT__BarValPar ,
                                 java.util.Date AV16Desde_HisProDTF ,
                                 java.util.Date AV29Hasta_HisProDTF ,
                                 GXSimpleCollection<String> AV36MaqCod ,
                                 int AV7CliCod ,
                                 GXSimpleCollection<String> AV5ArtCod ,
                                 GXSimpleCollection<String> AV20Fase ,
                                 GXSimpleCollection<Short> AV39ParFasCod ,
                                 GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> AV31In_AlertasAnalisis_SDT ,
                                 int AV69ValueCard2 ,
                                 int AV70ValueCard3 ,
                                 int AV68ValueCard4 ,
                                 String AV17EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181TN2 ();
      GRID_nCurrentRecord = 0 ;
      rf1TN2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"In_AlertasAnalisis_WP");
      forbiddenHiddens.add("ValueCard3", localUtil.format( DecimalUtil.doubleToDec(AV70ValueCard3), "ZZ,ZZZ,ZZ9"));
      forbiddenHiddens.add("ValueCard2", localUtil.format( DecimalUtil.doubleToDec(AV69ValueCard2), "ZZ,ZZZ,ZZ9"));
      forbiddenHiddens.add("ValueCard4", localUtil.format( DecimalUtil.doubleToDec(AV68ValueCard4), "ZZ,ZZZ,ZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV116Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ingenieria\\in_alertasanalisis_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
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
      rf1TN2( ) ;
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
      AV116Pgmname = "Ingenieria.In_AlertasAnalisis_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
      Gx_err = (short)(0) ;
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__maqcod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barordlin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__fase_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__hisprodf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__hisprodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__hisprodf_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__hisprohf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__hisprohf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__hisprohf_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__clicod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barserwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barserwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barserwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barser_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__parfascod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__parfasdsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvl2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvl2_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvmn_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvmx_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barvalpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barvalpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barvalpar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavActionnotificar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavActionnotificar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavActionnotificar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavActionnotificar_load_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavActionnotificar_load_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavActionnotificar_load_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavGridbadge_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbadge_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbadge_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavTotvalue_maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_maqcod_Enabled), 5, 0), true);
      edtavValuecard3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValuecard3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValuecard3_Enabled), 5, 0), true);
      edtavValuecard2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValuecard2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValuecard2_Enabled), 5, 0), true);
      edtavValuecard4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValuecard4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValuecard4_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1TN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(100) ;
      /* Execute user event: Refresh */
      e181TN2 ();
      nGXsfl_100_idx = 1 ;
      sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1002( ) ;
      bGXsfl_100_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1002( ) ;
         e191TN2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_100_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e191TN2 ();
         }
         wbEnd = (short)(100) ;
         wb1TN0( ) ;
      }
      bGXsfl_100_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1TN2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vIN_ALERTASANALISIS_SDT", AV31In_AlertasAnalisis_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vIN_ALERTASANALISIS_SDT", AV31In_AlertasAnalisis_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIN_ALERTASANALISIS_SDT", getSecureSignedToken( "", AV31In_AlertasAnalisis_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return AV31In_AlertasAnalisis_SDT.size() ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV116Pgmname = "Ingenieria.In_AlertasAnalisis_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
      Gx_err = (short)(0) ;
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__maqcod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barordlin_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__fase_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__hisprodf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__hisprodf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__hisprodf_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__hisprohf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__hisprohf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__hisprohf_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__clicod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barserwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barserwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barserwithtags_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barser_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__parfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__parfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__parfascod_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__parfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__parfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__parfasdsc_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvl2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvl2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvl2_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvmn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvmn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvmn_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvmx_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barvalpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barvalpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barvalpar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavActionnotificar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavActionnotificar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavActionnotificar_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavActionnotificar_load_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavActionnotificar_load_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavActionnotificar_load_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavGridbadge_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbadge_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbadge_Enabled), 5, 0), !bGXsfl_100_Refreshing);
      edtavTotvalue_maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_maqcod_Enabled), 5, 0), true);
      edtavValuecard3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValuecard3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValuecard3_Enabled), 5, 0), true);
      edtavValuecard2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValuecard2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValuecard2_Enabled), 5, 0), true);
      edtavValuecard4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavValuecard4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValuecard4_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1TN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171TN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "In_alertasanalisis_sdt"), AV31In_AlertasAnalisis_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV8CliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vARTCOD_DATA"), AV6ArtCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV37MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASE_DATA"), AV21Fase_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD_DATA"), AV40ParFasCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vELEMENTS"), AV85Elements);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARAMETERS"), AV93Parameters);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCLICKDATA"), AV88ItemClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMDOUBLECLICKDATA"), AV90ItemDoubleClickData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDRAGANDDROPDATA"), AV83DragAndDropData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILTERCHANGEDDATA"), AV86FilterChangedData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMEXPANDDATA"), AV91ItemExpandData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vITEMCOLLAPSEDATA"), AV89ItemCollapseData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV9ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vIN_ALERTASANALISIS_SDT"), AV31In_AlertasAnalisis_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vARTCOD"), AV5ArtCod);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD"), AV36MaqCod);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASE"), AV20Fase);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARFASCOD"), AV39ParFasCod);
         /* Read saved values. */
         nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
         Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
         Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
         Combo_artcod_Cls = httpContext.cgiGet( "COMBO_ARTCOD_Cls") ;
         Combo_artcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_ARTCOD_Selectedvalue_set") ;
         Combo_artcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Allowmultipleselection")) ;
         Combo_artcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Includeonlyselectedoption")) ;
         Combo_artcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_ARTCOD_Emptyitem")) ;
         Combo_artcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_ARTCOD_Multiplevaluestype") ;
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Allowmultipleselection")) ;
         Combo_maqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Includeonlyselectedoption")) ;
         Combo_maqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Emptyitem")) ;
         Combo_maqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQCOD_Multiplevaluestype") ;
         Combo_fase_Cls = httpContext.cgiGet( "COMBO_FASE_Cls") ;
         Combo_fase_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASE_Selectedvalue_set") ;
         Combo_fase_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASE_Allowmultipleselection")) ;
         Combo_fase_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASE_Includeonlyselectedoption")) ;
         Combo_fase_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASE_Emptyitem")) ;
         Combo_fase_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASE_Multiplevaluestype") ;
         Combo_parfascod_Cls = httpContext.cgiGet( "COMBO_PARFASCOD_Cls") ;
         Combo_parfascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARFASCOD_Selectedvalue_set") ;
         Combo_parfascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Allowmultipleselection")) ;
         Combo_parfascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Includeonlyselectedoption")) ;
         Combo_parfascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARFASCOD_Emptyitem")) ;
         Combo_parfascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARFASCOD_Multiplevaluestype") ;
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Progresscard3_Caption = httpContext.cgiGet( "PROGRESSCARD3_Caption") ;
         Progresscard3_Cls = httpContext.cgiGet( "PROGRESSCARD3_Cls") ;
         Progresscard3_Percentage = (int)(localUtil.ctol( httpContext.cgiGet( "PROGRESSCARD3_Percentage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Progresscard2_Caption = httpContext.cgiGet( "PROGRESSCARD2_Caption") ;
         Progresscard2_Cls = httpContext.cgiGet( "PROGRESSCARD2_Cls") ;
         Progresscard2_Percentage = (int)(localUtil.ctol( httpContext.cgiGet( "PROGRESSCARD2_Percentage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Progresscard4_Caption = httpContext.cgiGet( "PROGRESSCARD4_Caption") ;
         Progresscard4_Cls = httpContext.cgiGet( "PROGRESSCARD4_Cls") ;
         Progresscard4_Percentage = (int)(localUtil.ctol( httpContext.cgiGet( "PROGRESSCARD4_Percentage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Utchartsmootharea_Type = httpContext.cgiGet( "UTCHARTSMOOTHAREA_Type") ;
         Utchartsmootharea_Charttype = httpContext.cgiGet( "UTCHARTSMOOTHAREA_Charttype") ;
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
         Popover_in_alertasanalisis_sdt__maqcod_Gridinternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Gridinternalname") ;
         Popover_in_alertasanalisis_sdt__maqcod_Iteminternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Iteminternalname") ;
         Popover_in_alertasanalisis_sdt__maqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Isgriditem")) ;
         Popover_in_alertasanalisis_sdt__maqcod_Trigger = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Trigger") ;
         Popover_in_alertasanalisis_sdt__maqcod_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_in_alertasanalisis_sdt__maqcod_Position = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD_Position") ;
         Popover_in_alertasanalisis_sdt__barcod_Gridinternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Gridinternalname") ;
         Popover_in_alertasanalisis_sdt__barcod_Iteminternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Iteminternalname") ;
         Popover_in_alertasanalisis_sdt__barcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Isgriditem")) ;
         Popover_in_alertasanalisis_sdt__barcod_Trigger = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Trigger") ;
         Popover_in_alertasanalisis_sdt__barcod_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_in_alertasanalisis_sdt__barcod_Position = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD_Position") ;
         Popover_in_alertasanalisis_sdt__clicod_Gridinternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Gridinternalname") ;
         Popover_in_alertasanalisis_sdt__clicod_Iteminternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Iteminternalname") ;
         Popover_in_alertasanalisis_sdt__clicod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Isgriditem")) ;
         Popover_in_alertasanalisis_sdt__clicod_Trigger = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Trigger") ;
         Popover_in_alertasanalisis_sdt__clicod_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_in_alertasanalisis_sdt__clicod_Position = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD_Position") ;
         Popover_in_alertasanalisis_sdt__barser_Gridinternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Gridinternalname") ;
         Popover_in_alertasanalisis_sdt__barser_Iteminternalname = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Iteminternalname") ;
         Popover_in_alertasanalisis_sdt__barser_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Isgriditem")) ;
         Popover_in_alertasanalisis_sdt__barser_Trigger = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Trigger") ;
         Popover_in_alertasanalisis_sdt__barser_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_in_alertasanalisis_sdt__barser_Position = httpContext.cgiGet( "POPOVER_IN_ALERTASANALISIS_SDT__BARSER_Position") ;
         Popover_actionnotificar_Gridinternalname = httpContext.cgiGet( "POPOVER_ACTIONNOTIFICAR_Gridinternalname") ;
         Popover_actionnotificar_Iteminternalname = httpContext.cgiGet( "POPOVER_ACTIONNOTIFICAR_Iteminternalname") ;
         Popover_actionnotificar_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_ACTIONNOTIFICAR_Isgriditem")) ;
         Popover_actionnotificar_Trigger = httpContext.cgiGet( "POPOVER_ACTIONNOTIFICAR_Trigger") ;
         Popover_actionnotificar_Triggerelement = httpContext.cgiGet( "POPOVER_ACTIONNOTIFICAR_Triggerelement") ;
         Popover_actionnotificar_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_ACTIONNOTIFICAR_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_actionnotificar_Position = httpContext.cgiGet( "POPOVER_ACTIONNOTIFICAR_Position") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Popoversingrid = httpContext.cgiGet( "GRID_EMPOWERER_Popoversingrid") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Combo_clicod_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_get") ;
         nRC_GXsfl_100 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_100"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_100_fel_idx = 0 ;
         while ( nGXsfl_100_fel_idx < nRC_GXsfl_100 )
         {
            nGXsfl_100_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_100_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_100_fel_idx+1) ;
            sGXsfl_100_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1002( ) ;
            AV99GXV1 = (int)(nGXsfl_100_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV31In_AlertasAnalisis_SDT.size() >= AV99GXV1 ) && ( AV99GXV1 > 0 ) )
            {
               AV31In_AlertasAnalisis_SDT.currentItem( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)) );
               AV62In_AlertasAnalisis_SDT__MaqCodWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname) ;
               AV63In_AlertasAnalisis_SDT__BarCodWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname) ;
               AV64In_AlertasAnalisis_SDT__CliCodWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname) ;
               AV65In_AlertasAnalisis_SDT__BarSerWithTags = httpContext.cgiGet( edtavIn_alertasanalisis_sdt__barserwithtags_Internalname) ;
               AV67ActionNotificar = httpContext.cgiGet( edtavActionnotificar_Internalname) ;
               if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavActionnotificar_load_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavActionnotificar_load_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACTIONNOTIFICAR_LOAD");
                  GX_FocusControl = edtavActionnotificar_load_Internalname ;
                  wbErr = true ;
                  AV66ActionNotificar_Load = (short)(0) ;
               }
               else
               {
                  AV66ActionNotificar_Load = (short)(localUtil.ctol( httpContext.cgiGet( edtavActionnotificar_load_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               }
               AV24GridBadge = httpContext.cgiGet( edtavGridbadge_Internalname) ;
            }
         }
         if ( nGXsfl_100_fel_idx == 0 )
         {
            nGXsfl_100_idx = 1 ;
            sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1002( ) ;
         }
         nGXsfl_100_fel_idx = 1 ;
         /* Read variables values. */
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavDesde_hisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vDESDE_HISPRODTF");
            GX_FocusControl = edtavDesde_hisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Desde_HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV16Desde_HisProDTF", localUtil.ttoc( AV16Desde_HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV16Desde_HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavDesde_hisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Desde_HisProDTF", localUtil.ttoc( AV16Desde_HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHasta_hisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHASTA_HISPRODTF");
            GX_FocusControl = edtavHasta_hisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29Hasta_HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV29Hasta_HisProDTF", localUtil.ttoc( AV29Hasta_HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV29Hasta_HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHasta_hisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Hasta_HisProDTF", localUtil.ttoc( AV29Hasta_HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV78TotValue_MaqCod = httpContext.cgiGet( edtavTotvalue_maqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78TotValue_MaqCod", AV78TotValue_MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValuecard3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValuecard3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALUECARD3");
            GX_FocusControl = edtavValuecard3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70ValueCard3 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70ValueCard3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70ValueCard3), 8, 0));
         }
         else
         {
            AV70ValueCard3 = (int)(localUtil.ctol( httpContext.cgiGet( edtavValuecard3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70ValueCard3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70ValueCard3), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValuecard2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValuecard2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALUECARD2");
            GX_FocusControl = edtavValuecard2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV69ValueCard2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69ValueCard2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ValueCard2), 8, 0));
         }
         else
         {
            AV69ValueCard2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavValuecard2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69ValueCard2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ValueCard2), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavValuecard4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavValuecard4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALUECARD4");
            GX_FocusControl = edtavValuecard4_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV68ValueCard4 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68ValueCard4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ValueCard4), 8, 0));
         }
         else
         {
            AV68ValueCard4 = (int)(localUtil.ctol( httpContext.cgiGet( edtavValuecard4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68ValueCard4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ValueCard4), 8, 0));
         }
         AV116Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
         }
         else
         {
            AV7CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_IN_ALERTASANALISIS_SDT__HISPRODFAUXDATE");
            GX_FocusControl = edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate", localUtil.format(AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate, "99/99/99"));
         }
         else
         {
            AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate", localUtil.format(AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_IN_ALERTASANALISIS_SDT__HISPROHFAUXDATE");
            GX_FocusControl = edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate", localUtil.format(AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate", localUtil.format(AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"In_AlertasAnalisis_WP");
         AV70ValueCard3 = (int)(localUtil.ctol( httpContext.cgiGet( edtavValuecard3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70ValueCard3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70ValueCard3), 8, 0));
         forbiddenHiddens.add("ValueCard3", localUtil.format( DecimalUtil.doubleToDec(AV70ValueCard3), "ZZ,ZZZ,ZZ9"));
         AV69ValueCard2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavValuecard2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69ValueCard2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ValueCard2), 8, 0));
         forbiddenHiddens.add("ValueCard2", localUtil.format( DecimalUtil.doubleToDec(AV69ValueCard2), "ZZ,ZZZ,ZZ9"));
         AV68ValueCard4 = (int)(localUtil.ctol( httpContext.cgiGet( edtavValuecard4_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68ValueCard4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ValueCard4), 8, 0));
         forbiddenHiddens.add("ValueCard4", localUtil.format( DecimalUtil.doubleToDec(AV68ValueCard4), "ZZ,ZZZ,ZZ9"));
         AV116Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV116Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ingenieria\\in_alertasanalisis_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e171TN2 ();
      if (returnInSub) return;
   }

   public void e171TN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV17EmprCod = "001" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      AV16Desde_HisProDTF = GXutil.resetTime( GXutil.dadd( Gx_date , - ( 15 )) );
      httpContext.ajax_rsp_assign_attri("", false, "AV16Desde_HisProDTF", localUtil.ttoc( AV16Desde_HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV29Hasta_HisProDTF = GXutil.resetTime( Gx_date );
      httpContext.ajax_rsp_assign_attri("", false, "AV29Hasta_HisProDTF", localUtil.ttoc( AV29Hasta_HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXt_char1 = AV118Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      in_alertasanalisis_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV118Station = GXt_char1 ;
      GXv_char2[0] = AV17EmprCod ;
      GXv_char3[0] = AV119Emprnom ;
      GXv_char4[0] = AV120Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV118Station, GXv_char2, GXv_char3, GXv_char4) ;
      in_alertasanalisis_wp_impl.this.AV17EmprCod = GXv_char2[0] ;
      in_alertasanalisis_wp_impl.this.AV119Emprnom = GXv_char3[0] ;
      in_alertasanalisis_wp_impl.this.AV120Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      Popover_actionnotificar_Gridinternalname = subGrid_Internalname ;
      ucPopover_actionnotificar.sendProperty(context, "", false, Popover_actionnotificar_Internalname, "GridInternalName", Popover_actionnotificar_Gridinternalname);
      Popover_actionnotificar_Iteminternalname = edtavActionnotificar_Internalname ;
      ucPopover_actionnotificar.sendProperty(context, "", false, Popover_actionnotificar_Internalname, "ItemInternalName", Popover_actionnotificar_Iteminternalname);
      Popover_in_alertasanalisis_sdt__barser_Gridinternalname = subGrid_Internalname ;
      ucPopover_in_alertasanalisis_sdt__barser.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__barser_Internalname, "GridInternalName", Popover_in_alertasanalisis_sdt__barser_Gridinternalname);
      Popover_in_alertasanalisis_sdt__barser_Iteminternalname = edtavIn_alertasanalisis_sdt__barserwithtags_Internalname ;
      ucPopover_in_alertasanalisis_sdt__barser.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__barser_Internalname, "ItemInternalName", Popover_in_alertasanalisis_sdt__barser_Iteminternalname);
      Popover_in_alertasanalisis_sdt__clicod_Gridinternalname = subGrid_Internalname ;
      ucPopover_in_alertasanalisis_sdt__clicod.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__clicod_Internalname, "GridInternalName", Popover_in_alertasanalisis_sdt__clicod_Gridinternalname);
      Popover_in_alertasanalisis_sdt__clicod_Iteminternalname = edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname ;
      ucPopover_in_alertasanalisis_sdt__clicod.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__clicod_Internalname, "ItemInternalName", Popover_in_alertasanalisis_sdt__clicod_Iteminternalname);
      Popover_in_alertasanalisis_sdt__barcod_Gridinternalname = subGrid_Internalname ;
      ucPopover_in_alertasanalisis_sdt__barcod.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__barcod_Internalname, "GridInternalName", Popover_in_alertasanalisis_sdt__barcod_Gridinternalname);
      Popover_in_alertasanalisis_sdt__barcod_Iteminternalname = edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname ;
      ucPopover_in_alertasanalisis_sdt__barcod.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__barcod_Internalname, "ItemInternalName", Popover_in_alertasanalisis_sdt__barcod_Iteminternalname);
      Popover_in_alertasanalisis_sdt__maqcod_Gridinternalname = subGrid_Internalname ;
      ucPopover_in_alertasanalisis_sdt__maqcod.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__maqcod_Internalname, "GridInternalName", Popover_in_alertasanalisis_sdt__maqcod_Gridinternalname);
      Popover_in_alertasanalisis_sdt__maqcod_Iteminternalname = edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname ;
      ucPopover_in_alertasanalisis_sdt__maqcod.sendProperty(context, "", false, Popover_in_alertasanalisis_sdt__maqcod_Internalname, "ItemInternalName", Popover_in_alertasanalisis_sdt__maqcod_Iteminternalname);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOARTCOD' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASE' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPARFASCOD' */
      S152 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Análisis | Alertas", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV95Axis = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV95Axis.setgxTv_SdtQueryViewerElements_Element_Name( httpContext.getMessage( "ProductStatus", "") );
      AV94Axes.add(AV95Axis, 0);
      AV95Axis = (app.SdtQueryViewerElements_Element)new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV95Axis.setgxTv_SdtQueryViewerElements_Element_Name( httpContext.getMessage( "Check", "") );
      AV94Axes.add(AV95Axis, 0);
   }

   public void e181TN2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV61WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV61WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV41Session.getValue("Ingenieria.In_AlertasAnalisis_WPColumnsSelector"), "") != 0 )
      {
         AV11ColumnsSelectorXML = AV41Session.getValue("Ingenieria.In_AlertasAnalisis_WPColumnsSelector") ;
         AV9ColumnsSelector.fromxml(AV11ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S182 ();
         if (returnInSub) return;
      }
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodwithtags_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodwithtags_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodreo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodreo_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barcodpar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barcodpar_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barordlin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barordlin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barordlin_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__fase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__fase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__fase_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__hisprodf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__hisprodf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__hisprodf_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__hisprohf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__hisprohf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__hisprohf_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__clicodwithtags_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__clicodwithtags_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barserwithtags_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barserwithtags_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barserwithtags_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__parfascod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__parfascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__parfascod_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__parfasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__parfasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__parfasdsc_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvl2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvl2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvl2_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvmn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvmn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvmn_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barparvmx_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barparvmx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barparvmx_Visible), 5, 0), !bGXsfl_100_Refreshing);
      edtavIn_alertasanalisis_sdt__barvalpar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barvalpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIn_alertasanalisis_sdt__barvalpar_Visible), 5, 0), !bGXsfl_100_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S202 ();
      if (returnInSub) return;
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S212 ();
      if (returnInSub) return;
      edtavIn_alertasanalisis_sdt__barvalpar_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIn_alertasanalisis_sdt__barvalpar_Internalname, "Columnheaderclass", edtavIn_alertasanalisis_sdt__barvalpar_Columnheaderclass, !bGXsfl_100_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31In_AlertasAnalisis_SDT", AV31In_AlertasAnalisis_SDT);
   }

   public void e121TN2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV38PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV38PageToGo) ;
      }
   }

   public void e131TN2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141TN2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__MaqCod") == 0 )
         {
            AV55TFIn_AlertasAnalisis_SDT__MaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFIn_AlertasAnalisis_SDT__MaqCod", AV55TFIn_AlertasAnalisis_SDT__MaqCod);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarCod") == 0 )
         {
            AV42TFIn_AlertasAnalisis_SDT__BarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFIn_AlertasAnalisis_SDT__BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFIn_AlertasAnalisis_SDT__BarCod), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarCodReo") == 0 )
         {
            AV43TFIn_AlertasAnalisis_SDT__BarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFIn_AlertasAnalisis_SDT__BarCodReo", GXutil.str( AV43TFIn_AlertasAnalisis_SDT__BarCodReo, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarOrdLin") == 0 )
         {
            AV44TFIn_AlertasAnalisis_SDT__BarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFIn_AlertasAnalisis_SDT__BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFIn_AlertasAnalisis_SDT__BarOrdLin), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__Fase") == 0 )
         {
            AV52TFIn_AlertasAnalisis_SDT__Fase = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFIn_AlertasAnalisis_SDT__Fase", AV52TFIn_AlertasAnalisis_SDT__Fase);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__HisProDf") == 0 )
         {
            AV53TFIn_AlertasAnalisis_SDT__HisProDf = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFIn_AlertasAnalisis_SDT__HisProDf", localUtil.format(AV53TFIn_AlertasAnalisis_SDT__HisProDf, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__HisProHf") == 0 )
         {
            AV54TFIn_AlertasAnalisis_SDT__HisProHf = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFIn_AlertasAnalisis_SDT__HisProHf", localUtil.ttoc( AV54TFIn_AlertasAnalisis_SDT__HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__CliCod") == 0 )
         {
            AV51TFIn_AlertasAnalisis_SDT__CliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFIn_AlertasAnalisis_SDT__CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFIn_AlertasAnalisis_SDT__CliCod), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarSer") == 0 )
         {
            AV48TFIn_AlertasAnalisis_SDT__BarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFIn_AlertasAnalisis_SDT__BarSer", AV48TFIn_AlertasAnalisis_SDT__BarSer);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__ParFasCod") == 0 )
         {
            AV56TFIn_AlertasAnalisis_SDT__ParFasCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFIn_AlertasAnalisis_SDT__ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFIn_AlertasAnalisis_SDT__ParFasCod), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__ParFasDsc") == 0 )
         {
            AV57TFIn_AlertasAnalisis_SDT__ParFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFIn_AlertasAnalisis_SDT__ParFasDsc", AV57TFIn_AlertasAnalisis_SDT__ParFasDsc);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarParVl2") == 0 )
         {
            AV45TFIn_AlertasAnalisis_SDT__BarParVl2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFIn_AlertasAnalisis_SDT__BarParVl2", AV45TFIn_AlertasAnalisis_SDT__BarParVl2);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarParVMn") == 0 )
         {
            AV46TFIn_AlertasAnalisis_SDT__BarParVMn = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFIn_AlertasAnalisis_SDT__BarParVMn", AV46TFIn_AlertasAnalisis_SDT__BarParVMn);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarParVMx") == 0 )
         {
            AV47TFIn_AlertasAnalisis_SDT__BarParVMx = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFIn_AlertasAnalisis_SDT__BarParVMx", AV47TFIn_AlertasAnalisis_SDT__BarParVMx);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "In_AlertasAnalisis_SDT__BarValPar") == 0 )
         {
            AV49TFIn_AlertasAnalisis_SDT__BarValPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFIn_AlertasAnalisis_SDT__BarValPar", AV49TFIn_AlertasAnalisis_SDT__BarValPar);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e191TN2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV31In_AlertasAnalisis_SDT.size() )
      {
         AV31In_AlertasAnalisis_SDT.currentItem( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)) );
         AV67ActionNotificar = "<i class='fa fa-paper-plane'>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavActionnotificar_Internalname, AV67ActionNotificar);
         if ( ! (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn()) < 0 ) )
         {
            AV24GridBadge = GXutil.format( "<i class='fa fa-circle FontColorIconDanger FontColorIconSmall BootstrapTooltipLeft' title='%1'></i>", httpContext.getMessage( "menor al mínimo", ""), "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridbadge_Internalname, AV24GridBadge);
         }
         else if ( ! (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx()) > 0 ) )
         {
            AV24GridBadge = GXutil.format( "<i class='fa fa-circle FontColorIconDanger FontColorIconSmall BootstrapTooltipLeft' title='%1'></i>", httpContext.getMessage( "mayor al máximo", ""), "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridbadge_Internalname, AV24GridBadge);
         }
         else if ( ! (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn()) >= 0 ) && ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx()) <= 0 ) ) )
         {
            AV24GridBadge = GXutil.format( "<i class='fa fa-circle FontColorIconSuccess FontColorIconSmall BootstrapTooltipLeft' title='%1'></i>", httpContext.getMessage( "Valor dentro del rango permitido", ""), "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridbadge_Internalname, AV24GridBadge);
         }
         else if ( (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) )
         {
            AV24GridBadge = GXutil.format( "<i class='fa fa-circle FontColorIconInfoLight FontColorIconSmall BootstrapTooltipLeft' title='%1'></i>", httpContext.getMessage( "Sin valor final", ""), "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridbadge_Internalname, AV24GridBadge);
         }
         else
         {
            AV24GridBadge = "" ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridbadge_Internalname, AV24GridBadge);
         }
         edtavIn_alertasanalisis_sdt__barvalpar_Columnclass = ((GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) ? "WWColumn WWColumnGray WWColumnGraySingleCell" : "WWColumn") ;
         AV62In_AlertasAnalisis_SDT__MaqCodWithTags = ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname, AV62In_AlertasAnalisis_SDT__MaqCodWithTags);
         AV62In_AlertasAnalisis_SDT__MaqCodWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname, AV62In_AlertasAnalisis_SDT__MaqCodWithTags);
         edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment = "Right" ;
         AV63In_AlertasAnalisis_SDT__BarCodWithTags = GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod()), "ZZZZZZZ9")) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname, AV63In_AlertasAnalisis_SDT__BarCodWithTags);
         AV63In_AlertasAnalisis_SDT__BarCodWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname, AV63In_AlertasAnalisis_SDT__BarCodWithTags);
         edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment = "Right" ;
         AV64In_AlertasAnalisis_SDT__CliCodWithTags = GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod()), "ZZZZZ9")) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname, AV64In_AlertasAnalisis_SDT__CliCodWithTags);
         AV64In_AlertasAnalisis_SDT__CliCodWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname, AV64In_AlertasAnalisis_SDT__CliCodWithTags);
         AV65In_AlertasAnalisis_SDT__BarSerWithTags = ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser() ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__barserwithtags_Internalname, AV65In_AlertasAnalisis_SDT__BarSerWithTags);
         AV65In_AlertasAnalisis_SDT__BarSerWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIn_alertasanalisis_sdt__barserwithtags_Internalname, AV65In_AlertasAnalisis_SDT__BarSerWithTags);
         if ( ! (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn()) < 0 ) )
         {
            edtavActionnotificar_Visible = 1 ;
         }
         else if ( ! (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx()) > 0 ) )
         {
            edtavActionnotificar_Visible = 1 ;
         }
         else if ( ! (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn()) >= 0 ) && ( GXutil.strcmp(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx()) <= 0 ) ) )
         {
            edtavActionnotificar_Visible = 0 ;
         }
         else if ( (GXutil.strcmp("", ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) )
         {
            edtavActionnotificar_Visible = 1 ;
         }
         else
         {
            edtavActionnotificar_Visible = 0 ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(100) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1002( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_100_Refreshing )
         {
            httpContext.doAjaxLoad(100, GridRow);
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e151TN2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV11ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV9ColumnsSelector.fromJSonString(AV11ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.In_AlertasAnalisis_WPColumnsSelector", ((GXutil.strcmp("", AV11ColumnsSelectorXML)==0) ? "" : AV9ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9ColumnsSelector", AV9ColumnsSelector);
      if ( gx_BV100 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31In_AlertasAnalisis_SDT", AV31In_AlertasAnalisis_SDT);
         nGXsfl_100_bak_idx = nGXsfl_100_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
         nGXsfl_100_idx = nGXsfl_100_bak_idx ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1002( ) ;
      }
   }

   public void e161TN2( )
   {
      /* 'DoBuscar' Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9ColumnsSelector", AV9ColumnsSelector);
      if ( gx_BV100 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31In_AlertasAnalisis_SDT", AV31In_AlertasAnalisis_SDT);
         nGXsfl_100_bak_idx = nGXsfl_100_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV9ColumnsSelector, AV116Pgmname, AV55TFIn_AlertasAnalisis_SDT__MaqCod, AV42TFIn_AlertasAnalisis_SDT__BarCod, AV43TFIn_AlertasAnalisis_SDT__BarCodReo, AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, AV52TFIn_AlertasAnalisis_SDT__Fase, AV53TFIn_AlertasAnalisis_SDT__HisProDf, AV54TFIn_AlertasAnalisis_SDT__HisProHf, AV51TFIn_AlertasAnalisis_SDT__CliCod, AV48TFIn_AlertasAnalisis_SDT__BarSer, AV56TFIn_AlertasAnalisis_SDT__ParFasCod, AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, AV45TFIn_AlertasAnalisis_SDT__BarParVl2, AV46TFIn_AlertasAnalisis_SDT__BarParVMn, AV47TFIn_AlertasAnalisis_SDT__BarParVMx, AV49TFIn_AlertasAnalisis_SDT__BarValPar, AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, AV31In_AlertasAnalisis_SDT, AV69ValueCard2, AV70ValueCard3, AV68ValueCard4, AV17EmprCod) ;
         nGXsfl_100_idx = nGXsfl_100_bak_idx ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1002( ) ;
      }
   }

   public void e201TN2( )
   {
      AV99GXV1 = (int)(nGXsfl_100_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV99GXV1 > 0 ) && ( AV31In_AlertasAnalisis_SDT.size() >= AV99GXV1 ) )
      {
         AV31In_AlertasAnalisis_SDT.currentItem( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)) );
      }
      /* In_alertasanalisis_sdt__barser_Click Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wwpaux_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wwpaux_wc_Component), GXutil.lower( "Ingenieria.In_AlertasAnalisis_BarSer_WC")) != 0 )
      {
         WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app.ingenieria.in_alertasanalisis_barser_wc_impl", remoteHandle, context);
         WebComp_Wwpaux_wc_Component = "Ingenieria.In_AlertasAnalisis_BarSer_WC" ;
      }
      if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
      {
         WebComp_Wwpaux_wc.setjustcreated();
         WebComp_Wwpaux_wc.componentprepare(new Object[] {"W0242","",AV17EmprCod,((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser()});
         WebComp_Wwpaux_wc.componentbind(new Object[] {"",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wwpaux_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0242"+"");
         WebComp_Wwpaux_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e211TN2( )
   {
      AV99GXV1 = (int)(nGXsfl_100_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV99GXV1 > 0 ) && ( AV31In_AlertasAnalisis_SDT.size() >= AV99GXV1 ) )
      {
         AV31In_AlertasAnalisis_SDT.currentItem( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)) );
      }
      /* In_alertasanalisis_sdt__clicod_Click Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wwpaux_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wwpaux_wc_Component), GXutil.lower( "Ingenieria.In_AlertasAnalisis_CliCod_WC")) != 0 )
      {
         WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app.ingenieria.in_alertasanalisis_clicod_wc_impl", remoteHandle, context);
         WebComp_Wwpaux_wc_Component = "Ingenieria.In_AlertasAnalisis_CliCod_WC" ;
      }
      if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
      {
         WebComp_Wwpaux_wc.setjustcreated();
         WebComp_Wwpaux_wc.componentprepare(new Object[] {"W0242","",AV17EmprCod,((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod()});
         WebComp_Wwpaux_wc.componentbind(new Object[] {"",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wwpaux_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0242"+"");
         WebComp_Wwpaux_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e221TN2( )
   {
      AV99GXV1 = (int)(nGXsfl_100_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV99GXV1 > 0 ) && ( AV31In_AlertasAnalisis_SDT.size() >= AV99GXV1 ) )
      {
         AV31In_AlertasAnalisis_SDT.currentItem( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)) );
      }
      /* In_alertasanalisis_sdt__barcod_Click Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wwpaux_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wwpaux_wc_Component), GXutil.lower( "Ingenieria.In_AlertasAnalisis_BarCod_WC")) != 0 )
      {
         WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app.ingenieria.in_alertasanalisis_barcod_wc_impl", remoteHandle, context);
         WebComp_Wwpaux_wc_Component = "Ingenieria.In_AlertasAnalisis_BarCod_WC" ;
      }
      if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
      {
         WebComp_Wwpaux_wc.setjustcreated();
         WebComp_Wwpaux_wc.componentprepare(new Object[] {"W0242","",AV17EmprCod,((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod(),((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo(),((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar()});
         WebComp_Wwpaux_wc.componentbind(new Object[] {"","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wwpaux_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0242"+"");
         WebComp_Wwpaux_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e231TN2( )
   {
      AV99GXV1 = (int)(nGXsfl_100_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV99GXV1 > 0 ) && ( AV31In_AlertasAnalisis_SDT.size() >= AV99GXV1 ) )
      {
         AV31In_AlertasAnalisis_SDT.currentItem( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)) );
      }
      /* In_alertasanalisis_sdt__maqcod_Click Routine */
      returnInSub = false ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wwpaux_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wwpaux_wc_Component), GXutil.lower( "Ingenieria.In_AlertasAnalisis_MaqCod_WC")) != 0 )
      {
         WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app.ingenieria.in_alertasanalisis_maqcod_wc_impl", remoteHandle, context);
         WebComp_Wwpaux_wc_Component = "Ingenieria.In_AlertasAnalisis_MaqCod_WC" ;
      }
      if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
      {
         WebComp_Wwpaux_wc.setjustcreated();
         WebComp_Wwpaux_wc.componentprepare(new Object[] {"W0242","",AV17EmprCod,((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)(AV31In_AlertasAnalisis_SDT.currentItem())).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod()});
         WebComp_Wwpaux_wc.componentbind(new Object[] {"",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wwpaux_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0242"+"");
         WebComp_Wwpaux_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e111TN2( )
   {
      /* Combo_clicod_Onoptionclicked Routine */
      returnInSub = false ;
      AV7CliCod = (int)(GXutil.lval( Combo_clicod_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      /* Execute user subroutine: 'LOADCOMBOARTCOD' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV6ArtCod_Data", AV6ArtCod_Data);
   }

   public void S202( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      GXt_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem8 = AV31In_AlertasAnalisis_SDT ;
      GXv_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem9[0] = GXt_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem8 ;
      new app.ingenieria.in_alertasanalisis_pr(remoteHandle, context).execute( AV16Desde_HisProDTF, AV29Hasta_HisProDTF, AV36MaqCod, AV7CliCod, AV5ArtCod, AV20Fase, AV39ParFasCod, GXv_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem9) ;
      GXt_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem8 = GXv_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem9[0] ;
      AV31In_AlertasAnalisis_SDT = GXt_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem8 ;
      gx_BV100 = true ;
   }

   public void S182( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV9ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__MaqCod", "", "Máq.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarCod", "", "HDR", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarCodReo", "", "R", false, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarCodPar", "", "P", false, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarOrdLin", "", "Orden", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__Fase", "", "Fase", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__HisProDf", "", "D.fin", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__HisProHf", "", "H.fin", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__CliCod", "", "Cliente", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarSer", "", "Artículo", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__ParFasCod", "", "Cod.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__ParFasDsc", "", "Parámetro", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarParVl2", "", "V.inicial", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarParVMn", "", "V.mín.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarParVMx", "", "V.max.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "In_AlertasAnalisis_SDT__BarValPar", "", "V.final", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV60UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Ingenieria.In_AlertasAnalisis_WPColumnsSelector", GXv_char4) ;
      in_alertasanalisis_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV60UserCustomValue)==0) ) )
      {
         AV10ColumnsSelectorAux.fromxml(AV60UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV10ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV10ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S162( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV116Pgmname+"GridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV116Pgmname+"GridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV41Session.getValue(AV116Pgmname+"GridState"), null, null);
      }
      AV121GXV18 = 1 ;
      while ( AV121GXV18 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV18));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__MAQCOD") == 0 )
         {
            AV55TFIn_AlertasAnalisis_SDT__MaqCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFIn_AlertasAnalisis_SDT__MaqCod", AV55TFIn_AlertasAnalisis_SDT__MaqCod);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARCOD") == 0 )
         {
            AV42TFIn_AlertasAnalisis_SDT__BarCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFIn_AlertasAnalisis_SDT__BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFIn_AlertasAnalisis_SDT__BarCod), 8, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARCODREO") == 0 )
         {
            AV43TFIn_AlertasAnalisis_SDT__BarCodReo = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFIn_AlertasAnalisis_SDT__BarCodReo", GXutil.str( AV43TFIn_AlertasAnalisis_SDT__BarCodReo, 1, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARORDLIN") == 0 )
         {
            AV44TFIn_AlertasAnalisis_SDT__BarOrdLin = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFIn_AlertasAnalisis_SDT__BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFIn_AlertasAnalisis_SDT__BarOrdLin), 4, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__FASE") == 0 )
         {
            AV52TFIn_AlertasAnalisis_SDT__Fase = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFIn_AlertasAnalisis_SDT__Fase", AV52TFIn_AlertasAnalisis_SDT__Fase);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__HISPRODF") == 0 )
         {
            AV53TFIn_AlertasAnalisis_SDT__HisProDf = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFIn_AlertasAnalisis_SDT__HisProDf", localUtil.format(AV53TFIn_AlertasAnalisis_SDT__HisProDf, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__HISPROHF") == 0 )
         {
            AV54TFIn_AlertasAnalisis_SDT__HisProHf = GXutil.resetDate(localUtil.ctot( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFIn_AlertasAnalisis_SDT__HisProHf", localUtil.ttoc( AV54TFIn_AlertasAnalisis_SDT__HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate = GXutil.resetTime(AV54TFIn_AlertasAnalisis_SDT__HisProHf) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate", localUtil.format(AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__CLICOD") == 0 )
         {
            AV51TFIn_AlertasAnalisis_SDT__CliCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFIn_AlertasAnalisis_SDT__CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFIn_AlertasAnalisis_SDT__CliCod), 6, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARSER") == 0 )
         {
            AV48TFIn_AlertasAnalisis_SDT__BarSer = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFIn_AlertasAnalisis_SDT__BarSer", AV48TFIn_AlertasAnalisis_SDT__BarSer);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__PARFASCOD") == 0 )
         {
            AV56TFIn_AlertasAnalisis_SDT__ParFasCod = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFIn_AlertasAnalisis_SDT__ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFIn_AlertasAnalisis_SDT__ParFasCod), 4, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__PARFASDSC") == 0 )
         {
            AV57TFIn_AlertasAnalisis_SDT__ParFasDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFIn_AlertasAnalisis_SDT__ParFasDsc", AV57TFIn_AlertasAnalisis_SDT__ParFasDsc);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARPARVL2") == 0 )
         {
            AV45TFIn_AlertasAnalisis_SDT__BarParVl2 = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFIn_AlertasAnalisis_SDT__BarParVl2", AV45TFIn_AlertasAnalisis_SDT__BarParVl2);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARPARVMN") == 0 )
         {
            AV46TFIn_AlertasAnalisis_SDT__BarParVMn = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFIn_AlertasAnalisis_SDT__BarParVMn", AV46TFIn_AlertasAnalisis_SDT__BarParVMn);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARPARVMX") == 0 )
         {
            AV47TFIn_AlertasAnalisis_SDT__BarParVMx = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFIn_AlertasAnalisis_SDT__BarParVMx", AV47TFIn_AlertasAnalisis_SDT__BarParVMx);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFIN_ALERTASANALISIS_SDT__BARVALPAR") == 0 )
         {
            AV49TFIn_AlertasAnalisis_SDT__BarValPar = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFIn_AlertasAnalisis_SDT__BarValPar", AV49TFIn_AlertasAnalisis_SDT__BarValPar);
         }
         AV121GXV18 = (int)(AV121GXV18+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFIn_AlertasAnalisis_SDT__MaqCod)==0), AV55TFIn_AlertasAnalisis_SDT__MaqCod, GXv_char4) ;
      in_alertasanalisis_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFIn_AlertasAnalisis_SDT__Fase)==0), AV52TFIn_AlertasAnalisis_SDT__Fase, GXv_char3) ;
      in_alertasanalisis_wp_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFIn_AlertasAnalisis_SDT__BarSer)==0), AV48TFIn_AlertasAnalisis_SDT__BarSer, GXv_char2) ;
      in_alertasanalisis_wp_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFIn_AlertasAnalisis_SDT__ParFasDsc)==0), AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, GXv_char15) ;
      in_alertasanalisis_wp_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFIn_AlertasAnalisis_SDT__BarParVl2)==0), AV45TFIn_AlertasAnalisis_SDT__BarParVl2, GXv_char17) ;
      in_alertasanalisis_wp_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFIn_AlertasAnalisis_SDT__BarParVMn)==0), AV46TFIn_AlertasAnalisis_SDT__BarParVMn, GXv_char19) ;
      in_alertasanalisis_wp_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFIn_AlertasAnalisis_SDT__BarParVMx)==0), AV47TFIn_AlertasAnalisis_SDT__BarParVMx, GXv_char21) ;
      in_alertasanalisis_wp_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFIn_AlertasAnalisis_SDT__BarValPar)==0), AV49TFIn_AlertasAnalisis_SDT__BarValPar, GXv_char23) ;
      in_alertasanalisis_wp_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Filteredtext_set = GXt_char1+"|"+((0==AV42TFIn_AlertasAnalisis_SDT__BarCod) ? "" : GXutil.str( AV42TFIn_AlertasAnalisis_SDT__BarCod, 8, 0))+"|"+((0==AV43TFIn_AlertasAnalisis_SDT__BarCodReo) ? "" : GXutil.str( AV43TFIn_AlertasAnalisis_SDT__BarCodReo, 1, 0))+"||"+((0==AV44TFIn_AlertasAnalisis_SDT__BarOrdLin) ? "" : GXutil.str( AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, 4, 0))+"|"+GXt_char12+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFIn_AlertasAnalisis_SDT__HisProDf)) ? "" : localUtil.dtoc( AV53TFIn_AlertasAnalisis_SDT__HisProDf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV54TFIn_AlertasAnalisis_SDT__HisProHf) ? "" : localUtil.dtoc( AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV51TFIn_AlertasAnalisis_SDT__CliCod) ? "" : GXutil.str( AV51TFIn_AlertasAnalisis_SDT__CliCod, 6, 0))+"|"+GXt_char13+"|"+((0==AV56TFIn_AlertasAnalisis_SDT__ParFasCod) ? "" : GXutil.str( AV56TFIn_AlertasAnalisis_SDT__ParFasCod, 4, 0))+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV27GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV27GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV27GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV27GridState.fromxml(AV41Session.getValue(AV116Pgmname+"GridState"), null, null);
      AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__MAQCOD", "", !(GXutil.strcmp("", AV55TFIn_AlertasAnalisis_SDT__MaqCod)==0), (short)(0), AV55TFIn_AlertasAnalisis_SDT__MaqCod, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARCOD", "", !(0==AV42TFIn_AlertasAnalisis_SDT__BarCod), (short)(0), GXutil.trim( GXutil.str( AV42TFIn_AlertasAnalisis_SDT__BarCod, 8, 0)), "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARCODREO", "", !(0==AV43TFIn_AlertasAnalisis_SDT__BarCodReo), (short)(0), GXutil.trim( GXutil.str( AV43TFIn_AlertasAnalisis_SDT__BarCodReo, 1, 0)), "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARORDLIN", "", !(0==AV44TFIn_AlertasAnalisis_SDT__BarOrdLin), (short)(0), GXutil.trim( GXutil.str( AV44TFIn_AlertasAnalisis_SDT__BarOrdLin, 4, 0)), "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__FASE", "", !(GXutil.strcmp("", AV52TFIn_AlertasAnalisis_SDT__Fase)==0), (short)(0), AV52TFIn_AlertasAnalisis_SDT__Fase, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__HISPRODF", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFIn_AlertasAnalisis_SDT__HisProDf)), (short)(0), GXutil.trim( localUtil.dtoc( AV53TFIn_AlertasAnalisis_SDT__HisProDf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__HISPROHF", "", !GXutil.dateCompare(GXutil.nullDate(), AV54TFIn_AlertasAnalisis_SDT__HisProHf), (short)(0), GXutil.trim( localUtil.ttoc( AV54TFIn_AlertasAnalisis_SDT__HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__CLICOD", "", !(0==AV51TFIn_AlertasAnalisis_SDT__CliCod), (short)(0), GXutil.trim( GXutil.str( AV51TFIn_AlertasAnalisis_SDT__CliCod, 6, 0)), "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARSER", "", !(GXutil.strcmp("", AV48TFIn_AlertasAnalisis_SDT__BarSer)==0), (short)(0), AV48TFIn_AlertasAnalisis_SDT__BarSer, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__PARFASCOD", "", !(0==AV56TFIn_AlertasAnalisis_SDT__ParFasCod), (short)(0), GXutil.trim( GXutil.str( AV56TFIn_AlertasAnalisis_SDT__ParFasCod, 4, 0)), "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__PARFASDSC", "", !(GXutil.strcmp("", AV57TFIn_AlertasAnalisis_SDT__ParFasDsc)==0), (short)(0), AV57TFIn_AlertasAnalisis_SDT__ParFasDsc, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARPARVL2", "", !(GXutil.strcmp("", AV45TFIn_AlertasAnalisis_SDT__BarParVl2)==0), (short)(0), AV45TFIn_AlertasAnalisis_SDT__BarParVl2, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARPARVMN", "", !(GXutil.strcmp("", AV46TFIn_AlertasAnalisis_SDT__BarParVMn)==0), (short)(0), AV46TFIn_AlertasAnalisis_SDT__BarParVMn, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARPARVMX", "", !(GXutil.strcmp("", AV47TFIn_AlertasAnalisis_SDT__BarParVMx)==0), (short)(0), AV47TFIn_AlertasAnalisis_SDT__BarParVMx, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFIN_ALERTASANALISIS_SDT__BARVALPAR", "", !(GXutil.strcmp("", AV49TFIn_AlertasAnalisis_SDT__BarValPar)==0), (short)(0), AV49TFIn_AlertasAnalisis_SDT__BarValPar, "") ;
      AV27GridState = GXv_SdtWWPGridState24[0] ;
      AV27GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV27GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV116Pgmname+"GridState", AV27GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S192( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV71ValueCard1 = 0 ;
      AV69ValueCard2 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ValueCard2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ValueCard2), 8, 0));
      AV70ValueCard3 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70ValueCard3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70ValueCard3), 8, 0));
      AV68ValueCard4 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68ValueCard4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ValueCard4), 8, 0));
      AV77Tot_MaqCod = 0 ;
   }

   public void S212( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( subgrid_fnc_recordcount( ) > 0 )
      {
         AV122GXV19 = 1 ;
         while ( AV122GXV19 <= AV31In_AlertasAnalisis_SDT.size() )
         {
            AV72In_AlertasAnalisis_SDTItem = (app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV122GXV19));
            if ( ! (GXutil.strcmp("", AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( GXutil.strcmp(AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn()) < 0 ) )
            {
               AV69ValueCard2 = (int)(AV69ValueCard2+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV69ValueCard2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ValueCard2), 8, 0));
            }
            else if ( ! (GXutil.strcmp("", AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( GXutil.strcmp(AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx()) > 0 ) )
            {
               AV69ValueCard2 = (int)(AV69ValueCard2+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV69ValueCard2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69ValueCard2), 8, 0));
            }
            else if ( ! (GXutil.strcmp("", AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) && ( ( GXutil.strcmp(AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn()) >= 0 ) && ( GXutil.strcmp(AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar(), AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx()) <= 0 ) ) )
            {
               AV70ValueCard3 = (int)(AV70ValueCard3+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70ValueCard3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70ValueCard3), 8, 0));
            }
            else if ( (GXutil.strcmp("", AV72In_AlertasAnalisis_SDTItem.getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar())==0) )
            {
               AV68ValueCard4 = (int)(AV68ValueCard4+1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68ValueCard4", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ValueCard4), 8, 0));
            }
            else
            {
            }
            AV122GXV19 = (int)(AV122GXV19+1) ;
         }
         Progresscard2_Percentage = (int)(GXutil.Int( AV69ValueCard2/ (double) (AV31In_AlertasAnalisis_SDT.size())*100)) ;
         ucProgresscard2.sendProperty(context, "", false, Progresscard2_Internalname, "Percentage", GXutil.ltrimstr( DecimalUtil.doubleToDec(Progresscard2_Percentage), 9, 0));
         Progresscard3_Percentage = (int)(GXutil.Int( AV70ValueCard3/ (double) (AV31In_AlertasAnalisis_SDT.size())*100)) ;
         ucProgresscard3.sendProperty(context, "", false, Progresscard3_Internalname, "Percentage", GXutil.ltrimstr( DecimalUtil.doubleToDec(Progresscard3_Percentage), 9, 0));
         Progresscard4_Percentage = (int)(GXutil.Int( AV68ValueCard4/ (double) (AV31In_AlertasAnalisis_SDT.size())*100)) ;
         ucProgresscard4.sendProperty(context, "", false, Progresscard4_Internalname, "Percentage", GXutil.ltrimstr( DecimalUtil.doubleToDec(Progresscard4_Percentage), 9, 0));
         Progresscard2_Caption = GXutil.trim( GXutil.str( Progresscard2_Percentage, 10, 0))+"%" ;
         ucProgresscard2.sendProperty(context, "", false, Progresscard2_Internalname, "Caption", Progresscard2_Caption);
         Progresscard3_Caption = GXutil.trim( GXutil.str( Progresscard3_Percentage, 10, 0))+"%" ;
         ucProgresscard3.sendProperty(context, "", false, Progresscard3_Internalname, "Caption", Progresscard3_Caption);
         Progresscard4_Caption = GXutil.trim( GXutil.str( Progresscard4_Percentage, 10, 0))+"%" ;
         ucProgresscard4.sendProperty(context, "", false, Progresscard4_Internalname, "Caption", Progresscard4_Caption);
      }
      AV77Tot_MaqCod = subgrid_fnc_recordcount( ) ;
      AV78TotValue_MaqCod = httpContext.getMessage( "WWP_TotalizerCount", "") + localUtil.format( DecimalUtil.doubleToDec(AV77Tot_MaqCod), "ZZZ,ZZZ,ZZZ,ZZZ,ZZZ,ZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TotValue_MaqCod", AV78TotValue_MaqCod);
   }

   public void S152( )
   {
      /* 'LOADCOMBOPARFASCOD' Routine */
      returnInSub = false ;
      AV40ParFasCod_Data.clear();
      /* Using cursor H01TN2 */
      pr_default.execute(0, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01TN2_A396EmprCod[0] ;
         A1664ParFasCod = H01TN2_A1664ParFasCod[0] ;
         A1665ParFasDsc = H01TN2_A1665ParFasDsc[0] ;
         n1665ParFasDsc = H01TN2_n1665ParFasDsc[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.str( A1664ParFasCod, 4, 0) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A1664ParFasCod, 4, 0)), GXutil.trim( A1665ParFasDsc), "", "", "", "", "", "", "") );
         AV40ParFasCod_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV40ParFasCod_Data.sort("Title");
      Combo_parfascod_Selectedvalue_set = AV39ParFasCod.toJSonString(false) ;
      ucCombo_parfascod.sendProperty(context, "", false, Combo_parfascod_Internalname, "SelectedValue_set", Combo_parfascod_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOFASE' Routine */
      returnInSub = false ;
      AV21Fase_Data.clear();
      /* Using cursor H01TN3 */
      pr_default.execute(1, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H01TN3_A396EmprCod[0] ;
         A457FasCod = H01TN3_A457FasCod[0] ;
         A460FasDsc = H01TN3_A460FasDsc[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A457FasCod );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A457FasCod), GXutil.trim( A460FasDsc), "", "", "", "", "", "", "") );
         AV21Fase_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV21Fase_Data.sort("Title");
      Combo_fase_Selectedvalue_set = AV20Fase.toJSonString(false) ;
      ucCombo_fase.sendProperty(context, "", false, Combo_fase_Internalname, "SelectedValue_set", Combo_fase_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV37MaqCod_Data.clear();
      /* Using cursor H01TN4 */
      pr_default.execute(2, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H01TN4_A396EmprCod[0] ;
         A602MaqCod = H01TN4_A602MaqCod[0] ;
         A606MaqDsc = H01TN4_A606MaqDsc[0] ;
         n606MaqDsc = H01TN4_n606MaqDsc[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), GXutil.trim( A606MaqDsc), "", "", "", "", "", "", "") );
         AV37MaqCod_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV37MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV36MaqCod.toJSonString(false) ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOARTCOD' Routine */
      returnInSub = false ;
      AV6ArtCod_Data.clear();
      /* Using cursor H01TN5 */
      pr_default.execute(3, new Object[] {AV17EmprCod, Integer.valueOf(AV7CliCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A252CliCod = H01TN5_A252CliCod[0] ;
         A396EmprCod = H01TN5_A396EmprCod[0] ;
         A65ArtCod = H01TN5_A65ArtCod[0] ;
         A69ArtDsc = H01TN5_A69ArtDsc[0] ;
         n69ArtDsc = H01TN5_n69ArtDsc[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A65ArtCod );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A65ArtCod), GXutil.trim( A69ArtDsc), "", "", "", "", "", "", "") );
         AV6ArtCod_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV6ArtCod_Data.sort("Title");
      Combo_artcod_Selectedvalue_set = AV5ArtCod.toJSonString(false) ;
      ucCombo_artcod.sendProperty(context, "", false, Combo_artcod_Internalname, "SelectedValue_set", Combo_artcod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      AV8CliCod_Data.clear();
      /* Using cursor H01TN6 */
      pr_default.execute(4, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = H01TN6_A396EmprCod[0] ;
         A279CliNom = H01TN6_A279CliNom[0] ;
         A252CliCod = H01TN6_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A13735CliCNom, "", "", "", "", "", "", "") );
         AV8CliCod_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV8CliCod_Data.sort("Title");
      Combo_clicod_Selectedvalue_set = ((0==AV7CliCod) ? "" : GXutil.trim( GXutil.str( AV7CliCod, 6, 0))) ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
   }

   public void wb_table5_202_1TN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblCard4_Internalname, tblCard4_Internalname, "", "TableCardProgressAdmin", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='ProgressCardCellInfoLight'>") ;
         /* User Defined Control */
         ucProgresscard4.setProperty("Caption", Progresscard4_Caption);
         ucProgresscard4.setProperty("Cls", Progresscard4_Cls);
         ucProgresscard4.render(context, "dvelop.gxbootstrap.dvprogressindicator", Progresscard4_Internalname, "PROGRESSCARD4Container");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='ProgressCardContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepcard4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "justify-content:flex-end;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepcardcontent4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavValuecard4_Internalname, httpContext.getMessage( "Value Card4", ""), "col-sm-3 DashboardInfoLightLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavValuecard4_Internalname, GXutil.ltrim( localUtil.ntoc( AV68ValueCard4, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValuecard4_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV68ValueCard4), "ZZ,ZZZ,ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV68ValueCard4), "ZZ,ZZZ,ZZ9"))), TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValuecard4_Jsonclick, 0, "DashboardInfoLight", "", "", "", "", 1, edtavValuecard4_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "KPINumericValue", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDescriptioncard4_Internalname, httpContext.getMessage( "Sin valor", ""), "", "", lblDescriptioncard4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockDashboardDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblProgresscard4icon_Internalname, httpContext.getMessage( "<i class='ProgressCardIconInfoLight fa fa-circle' style='font-size: 19px'></i>", ""), "", "", lblProgresscard4icon_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_202_1TN2e( true) ;
      }
      else
      {
         wb_table5_202_1TN2e( false) ;
      }
   }

   public void wb_table4_184_1TN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblCard2_Internalname, tblCard2_Internalname, "", "TableCardProgressAdmin", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='ProgressCardCellBaseColor'>") ;
         /* User Defined Control */
         ucProgresscard2.setProperty("Caption", Progresscard2_Caption);
         ucProgresscard2.setProperty("Cls", Progresscard2_Cls);
         ucProgresscard2.render(context, "dvelop.gxbootstrap.dvprogressindicator", Progresscard2_Internalname, "PROGRESSCARD2Container");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='ProgressCardContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepcard2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "justify-content:flex-end;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepcardcontent2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavValuecard2_Internalname, httpContext.getMessage( "Value Card2", ""), "col-sm-3 DashboardBaseColorLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 195,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavValuecard2_Internalname, GXutil.ltrim( localUtil.ntoc( AV69ValueCard2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValuecard2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV69ValueCard2), "ZZ,ZZZ,ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV69ValueCard2), "ZZ,ZZZ,ZZ9"))), TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,195);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValuecard2_Jsonclick, 0, "DashboardBaseColor", "", "", "", "", 1, edtavValuecard2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "KPINumericValue", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDescriptioncard2_Internalname, httpContext.getMessage( "Fuera de rango", ""), "", "", lblDescriptioncard2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockDashboardDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblProgresscard2icon_Internalname, httpContext.getMessage( "<i class='ProgressCardIconBaseColor fa fa-circle' style='font-size: 19px'></i>", ""), "", "", lblProgresscard2icon_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_184_1TN2e( true) ;
      }
      else
      {
         wb_table4_184_1TN2e( false) ;
      }
   }

   public void wb_table3_166_1TN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblCard3_Internalname, tblCard3_Internalname, "", "TableCardProgressAdmin", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='ProgressCardCellSuccess'>") ;
         /* User Defined Control */
         ucProgresscard3.setProperty("Caption", Progresscard3_Caption);
         ucProgresscard3.setProperty("Cls", Progresscard3_Cls);
         ucProgresscard3.render(context, "dvelop.gxbootstrap.dvprogressindicator", Progresscard3_Internalname, "PROGRESSCARD3Container");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='ProgressCardContentCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepcard3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "justify-content:flex-end;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepcardcontent3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavValuecard3_Internalname, httpContext.getMessage( "Value Card3", ""), "col-sm-3 DashboardSuccessLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavValuecard3_Internalname, GXutil.ltrim( localUtil.ntoc( AV70ValueCard3, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavValuecard3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70ValueCard3), "ZZ,ZZZ,ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV70ValueCard3), "ZZ,ZZZ,ZZ9"))), TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavValuecard3_Jsonclick, 0, "DashboardSuccess", "", "", "", "", 1, edtavValuecard3_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "KPINumericValue", "right", false, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDescriptioncard3_Internalname, httpContext.getMessage( "Valor en rango", ""), "", "", lblDescriptioncard3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlockDashboardDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblProgresscard3icon_Internalname, httpContext.getMessage( "<i class='ProgressCardIconSuccess fa fa-circle' style='font-size: 19px'></i>", ""), "", "", lblProgresscard3icon_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_166_1TN2e( true) ;
      }
      else
      {
         wb_table3_166_1TN2e( false) ;
      }
   }

   public void wb_table2_126_1TN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_maqcod_Internalname, httpContext.getMessage( "Tot Value_Maq Cod", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'" + sGXsfl_100_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_maqcod_Internalname, AV78TotValue_MaqCod, GXutil.rtrim( localUtil.format( AV78TotValue_MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,130);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_maqcod_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_maqcod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\In_AlertasAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_126_1TN2e( true) ;
      }
      else
      {
         wb_table2_126_1TN2e( false) ;
      }
   }

   public void wb_table1_14_1TN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_1TN2e( true) ;
      }
      else
      {
         wb_table1_14_1TN2e( false) ;
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
      pa1TN2( ) ;
      ws1TN2( ) ;
      we1TN2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/highcharts/css/highcharts.css", "");
      httpContext.AddStyleSheetFile("QueryViewer/QueryViewer.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143662", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("ingenieria/in_alertasanalisis_wp.js", "?202682116143664", false, true);
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
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DVProgressIndicator/DVProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DVProgressIndicator/DVProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DVProgressIndicator/DVProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerCommon.js", "", false, true);
      httpContext.AddJavascriptSource("QueryViewer/QueryViewerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1002( )
   {
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__MAQCODWITHTAGS_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__maqcod_Internalname = "IN_ALERTASANALISIS_SDT__MAQCOD_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barcod_Internalname = "IN_ALERTASANALISIS_SDT__BARCOD_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barcodreo_Internalname = "IN_ALERTASANALISIS_SDT__BARCODREO_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barcodpar_Internalname = "IN_ALERTASANALISIS_SDT__BARCODPAR_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barordlin_Internalname = "IN_ALERTASANALISIS_SDT__BARORDLIN_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__fase_Internalname = "IN_ALERTASANALISIS_SDT__FASE_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__hisprodf_Internalname = "IN_ALERTASANALISIS_SDT__HISPRODF_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__hisprohf_Internalname = "IN_ALERTASANALISIS_SDT__HISPROHF_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__clicod_Internalname = "IN_ALERTASANALISIS_SDT__CLICOD_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barserwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__BARSERWITHTAGS_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barser_Internalname = "IN_ALERTASANALISIS_SDT__BARSER_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__parfascod_Internalname = "IN_ALERTASANALISIS_SDT__PARFASCOD_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Internalname = "IN_ALERTASANALISIS_SDT__PARFASDSC_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barparvl2_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVL2_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barparvmn_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVMN_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barparvmx_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVMX_"+sGXsfl_100_idx ;
      edtavIn_alertasanalisis_sdt__barvalpar_Internalname = "IN_ALERTASANALISIS_SDT__BARVALPAR_"+sGXsfl_100_idx ;
      edtavActionnotificar_Internalname = "vACTIONNOTIFICAR_"+sGXsfl_100_idx ;
      edtavActionnotificar_load_Internalname = "vACTIONNOTIFICAR_LOAD_"+sGXsfl_100_idx ;
      edtavGridbadge_Internalname = "vGRIDBADGE_"+sGXsfl_100_idx ;
   }

   public void subsflControlProps_fel_1002( )
   {
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__MAQCODWITHTAGS_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__maqcod_Internalname = "IN_ALERTASANALISIS_SDT__MAQCOD_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barcod_Internalname = "IN_ALERTASANALISIS_SDT__BARCOD_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barcodreo_Internalname = "IN_ALERTASANALISIS_SDT__BARCODREO_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barcodpar_Internalname = "IN_ALERTASANALISIS_SDT__BARCODPAR_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barordlin_Internalname = "IN_ALERTASANALISIS_SDT__BARORDLIN_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__fase_Internalname = "IN_ALERTASANALISIS_SDT__FASE_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__hisprodf_Internalname = "IN_ALERTASANALISIS_SDT__HISPRODF_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__hisprohf_Internalname = "IN_ALERTASANALISIS_SDT__HISPROHF_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__clicod_Internalname = "IN_ALERTASANALISIS_SDT__CLICOD_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barserwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__BARSERWITHTAGS_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barser_Internalname = "IN_ALERTASANALISIS_SDT__BARSER_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__parfascod_Internalname = "IN_ALERTASANALISIS_SDT__PARFASCOD_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Internalname = "IN_ALERTASANALISIS_SDT__PARFASDSC_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barparvl2_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVL2_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barparvmn_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVMN_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barparvmx_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVMX_"+sGXsfl_100_fel_idx ;
      edtavIn_alertasanalisis_sdt__barvalpar_Internalname = "IN_ALERTASANALISIS_SDT__BARVALPAR_"+sGXsfl_100_fel_idx ;
      edtavActionnotificar_Internalname = "vACTIONNOTIFICAR_"+sGXsfl_100_fel_idx ;
      edtavActionnotificar_load_Internalname = "vACTIONNOTIFICAR_LOAD_"+sGXsfl_100_fel_idx ;
      edtavGridbadge_Internalname = "vGRIDBADGE_"+sGXsfl_100_fel_idx ;
   }

   public void sendrow_1002( )
   {
      subsflControlProps_1002( ) ;
      wb1TN0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_100_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_100_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_100_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname,AV62In_AlertasAnalisis_SDT__MaqCodWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,101);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__maqcodwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__maqcod_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Maqcod()),"","","'"+""+"'"+",false,"+"'"+"EIN_ALERTASANALISIS_SDT__MAQCOD.CLICK."+sGXsfl_100_idx+"'","","","","",edtavIn_alertasanalisis_sdt__maqcod_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavIn_alertasanalisis_sdt__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barcodwithtags_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__barcodwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname,AV63In_AlertasAnalisis_SDT__BarCodWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__barcodwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,103);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barcodwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barcodwithtags_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"",edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment,Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavIn_alertasanalisis_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"EIN_ALERTASANALISIS_SDT__BARCOD.CLICK."+sGXsfl_100_idx+"'","","","","",edtavIn_alertasanalisis_sdt__barcod_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavIn_alertasanalisis_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barcodreo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavIn_alertasanalisis_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barcodreo_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barcodpar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barcodpar_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barordlin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barordlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavIn_alertasanalisis_sdt__barordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barordlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barordlin_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__fase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__fase_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Fase()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__fase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__fase_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__fase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__hisprodf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__hisprodf_Internalname,localUtil.format(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf(), "99/99/99"),localUtil.format( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprodf(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__hisprodf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__hisprodf_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__hisprodf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__hisprohf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__hisprohf_Internalname,localUtil.ttoc( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Hisprohf(), "99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__hisprohf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__hisprohf_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__hisprohf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__clicodwithtags_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__clicodwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname,AV64In_AlertasAnalisis_SDT__CliCodWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__clicodwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,111);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__clicodwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__clicodwithtags_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"",edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment,Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavIn_alertasanalisis_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"EIN_ALERTASANALISIS_SDT__CLICOD.CLICK."+sGXsfl_100_idx+"'","","","","",edtavIn_alertasanalisis_sdt__clicod_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavIn_alertasanalisis_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barserwithtags_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavIn_alertasanalisis_sdt__barserwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__barserwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barserwithtags_Internalname,AV65In_AlertasAnalisis_SDT__BarSerWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavIn_alertasanalisis_sdt__barserwithtags_Enabled!=0)&&(edtavIn_alertasanalisis_sdt__barserwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barserwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barserwithtags_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barserwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barser_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barser()),"","","'"+""+"'"+",false,"+"'"+"EIN_ALERTASANALISIS_SDT__BARSER.CLICK."+sGXsfl_100_idx+"'","","","","",edtavIn_alertasanalisis_sdt__barser_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavIn_alertasanalisis_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__parfascod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__parfascod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavIn_alertasanalisis_sdt__parfascod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfascod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__parfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__parfascod_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__parfascod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__parfasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__parfasdsc_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Parfasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__parfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__parfasdsc_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__parfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barparvl2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barparvl2_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvl2()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barparvl2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barparvl2_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barparvl2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barparvmn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barparvmn_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmn()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barparvmn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barparvmn_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barparvmn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barparvmx_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barparvmx_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barparvmx()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barparvmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavIn_alertasanalisis_sdt__barparvmx_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barparvmx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavIn_alertasanalisis_sdt__barvalpar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavIn_alertasanalisis_sdt__barvalpar_Internalname,GXutil.rtrim( ((app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem)AV31In_AlertasAnalisis_SDT.elementAt(-1+AV99GXV1)).getgxTv_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem_Barvalpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavIn_alertasanalisis_sdt__barvalpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavIn_alertasanalisis_sdt__barvalpar_Columnclass,edtavIn_alertasanalisis_sdt__barvalpar_Columnheaderclass,Integer.valueOf(edtavIn_alertasanalisis_sdt__barvalpar_Visible),Integer.valueOf(edtavIn_alertasanalisis_sdt__barvalpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavActionnotificar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavActionnotificar_Enabled!=0)&&(edtavActionnotificar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 121,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavActionnotificar_Internalname,GXutil.rtrim( AV67ActionNotificar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavActionnotificar_Enabled!=0)&&(edtavActionnotificar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,121);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Notificar", ""),"",edtavActionnotificar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(edtavActionnotificar_Visible),Integer.valueOf(edtavActionnotificar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavActionnotificar_load_Enabled!=0)&&(edtavActionnotificar_load_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 122,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavActionnotificar_load_Internalname,GXutil.ltrim( localUtil.ntoc( AV66ActionNotificar_Load, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavActionnotificar_load_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV66ActionNotificar_Load), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV66ActionNotificar_Load), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavActionnotificar_load_Enabled!=0)&&(edtavActionnotificar_load_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"" : " "),"'"+""+"'"+",false,"+"'"+"e241tn2_client"+"'","","","","",edtavActionnotificar_load_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavActionnotificar_load_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbadge_Enabled!=0)&&(edtavGridbadge_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 123,'',false,'"+sGXsfl_100_idx+"',100)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbadge_Internalname,AV24GridBadge,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGridbadge_Enabled!=0)&&(edtavGridbadge_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,123);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbadge_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbadge_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1TN2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_100_idx = ((subGrid_Islastpage==1)&&(nGXsfl_100_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_100_idx+1) ;
         sGXsfl_100_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_100_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1002( ) ;
      }
      /* End function sendrow_1002 */
   }

   public void startgridcontrol100( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"100\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máq.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barcodwithtags_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barcodreo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barcodpar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barordlin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__fase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__hisprodf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "D.fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__hisprohf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "H.fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__clicodwithtags_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barserwithtags_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__parfascod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__parfasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Parámetro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barparvl2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "V.inicial", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barparvmn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "V.mín.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barparvmx_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "V.max.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavIn_alertasanalisis_sdt__barvalpar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "V.final", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavActionnotificar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV62In_AlertasAnalisis_SDT__MaqCodWithTags);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV63In_AlertasAnalisis_SDT__BarCodWithTags);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barcodwithtags_Visible, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barordlin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__fase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__fase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__hisprodf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__hisprodf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__hisprohf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__hisprohf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV64In_AlertasAnalisis_SDT__CliCodWithTags);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__clicodwithtags_Visible, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV65In_AlertasAnalisis_SDT__BarSerWithTags);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barserwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barserwithtags_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__parfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__parfascod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__parfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__parfasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barparvl2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barparvl2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barparvmn_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barparvmn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barparvmx_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barparvmx_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavIn_alertasanalisis_sdt__barvalpar_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavIn_alertasanalisis_sdt__barvalpar_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barvalpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIn_alertasanalisis_sdt__barvalpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV67ActionNotificar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavActionnotificar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavActionnotificar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV66ActionNotificar_Load, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavActionnotificar_load_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV24GridBadge);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbadge_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      edtavDesde_hisprodtf_Internalname = "vDESDE_HISPRODTF" ;
      edtavHasta_hisprodtf_Internalname = "vHASTA_HISPRODTF" ;
      bttBtnbuscar_Internalname = "BTNBUSCAR" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblockcombo_clicod_Internalname = "TEXTBLOCKCOMBO_CLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockcombo_artcod_Internalname = "TEXTBLOCKCOMBO_ARTCOD" ;
      Combo_artcod_Internalname = "COMBO_ARTCOD" ;
      divTablesplittedartcod_Internalname = "TABLESPLITTEDARTCOD" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblockcombo_fase_Internalname = "TEXTBLOCKCOMBO_FASE" ;
      Combo_fase_Internalname = "COMBO_FASE" ;
      divTablesplittedfase_Internalname = "TABLESPLITTEDFASE" ;
      lblTextblockcombo_parfascod_Internalname = "TEXTBLOCKCOMBO_PARFASCOD" ;
      Combo_parfascod_Internalname = "COMBO_PARFASCOD" ;
      divTablesplittedparfascod_Internalname = "TABLESPLITTEDPARFASCOD" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTab_analisis_title_Internalname = "TAB_ANALISIS_TITLE" ;
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__MAQCODWITHTAGS" ;
      edtavIn_alertasanalisis_sdt__maqcod_Internalname = "IN_ALERTASANALISIS_SDT__MAQCOD" ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS" ;
      edtavIn_alertasanalisis_sdt__barcod_Internalname = "IN_ALERTASANALISIS_SDT__BARCOD" ;
      edtavIn_alertasanalisis_sdt__barcodreo_Internalname = "IN_ALERTASANALISIS_SDT__BARCODREO" ;
      edtavIn_alertasanalisis_sdt__barcodpar_Internalname = "IN_ALERTASANALISIS_SDT__BARCODPAR" ;
      edtavIn_alertasanalisis_sdt__barordlin_Internalname = "IN_ALERTASANALISIS_SDT__BARORDLIN" ;
      edtavIn_alertasanalisis_sdt__fase_Internalname = "IN_ALERTASANALISIS_SDT__FASE" ;
      edtavIn_alertasanalisis_sdt__hisprodf_Internalname = "IN_ALERTASANALISIS_SDT__HISPRODF" ;
      edtavIn_alertasanalisis_sdt__hisprohf_Internalname = "IN_ALERTASANALISIS_SDT__HISPROHF" ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS" ;
      edtavIn_alertasanalisis_sdt__clicod_Internalname = "IN_ALERTASANALISIS_SDT__CLICOD" ;
      edtavIn_alertasanalisis_sdt__barserwithtags_Internalname = "vIN_ALERTASANALISIS_SDT__BARSERWITHTAGS" ;
      edtavIn_alertasanalisis_sdt__barser_Internalname = "IN_ALERTASANALISIS_SDT__BARSER" ;
      edtavIn_alertasanalisis_sdt__parfascod_Internalname = "IN_ALERTASANALISIS_SDT__PARFASCOD" ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Internalname = "IN_ALERTASANALISIS_SDT__PARFASDSC" ;
      edtavIn_alertasanalisis_sdt__barparvl2_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVL2" ;
      edtavIn_alertasanalisis_sdt__barparvmn_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVMN" ;
      edtavIn_alertasanalisis_sdt__barparvmx_Internalname = "IN_ALERTASANALISIS_SDT__BARPARVMX" ;
      edtavIn_alertasanalisis_sdt__barvalpar_Internalname = "IN_ALERTASANALISIS_SDT__BARVALPAR" ;
      edtavActionnotificar_Internalname = "vACTIONNOTIFICAR" ;
      edtavActionnotificar_load_Internalname = "vACTIONNOTIFICAR_LOAD" ;
      edtavGridbadge_Internalname = "vGRIDBADGE" ;
      edtavTotvalue_maqcod_Internalname = "vTOTVALUE_MAQCOD" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTab_alertas_title_Internalname = "TAB_ALERTAS_TITLE" ;
      Progresscard3_Internalname = "PROGRESSCARD3" ;
      edtavValuecard3_Internalname = "vVALUECARD3" ;
      lblDescriptioncard3_Internalname = "DESCRIPTIONCARD3" ;
      divTablepcardcontent3_Internalname = "TABLEPCARDCONTENT3" ;
      lblProgresscard3icon_Internalname = "PROGRESSCARD3ICON" ;
      divTablepcard3_Internalname = "TABLEPCARD3" ;
      tblCard3_Internalname = "CARD3" ;
      Progresscard2_Internalname = "PROGRESSCARD2" ;
      edtavValuecard2_Internalname = "vVALUECARD2" ;
      lblDescriptioncard2_Internalname = "DESCRIPTIONCARD2" ;
      divTablepcardcontent2_Internalname = "TABLEPCARDCONTENT2" ;
      lblProgresscard2icon_Internalname = "PROGRESSCARD2ICON" ;
      divTablepcard2_Internalname = "TABLEPCARD2" ;
      tblCard2_Internalname = "CARD2" ;
      Progresscard4_Internalname = "PROGRESSCARD4" ;
      edtavValuecard4_Internalname = "vVALUECARD4" ;
      lblDescriptioncard4_Internalname = "DESCRIPTIONCARD4" ;
      divTablepcardcontent4_Internalname = "TABLEPCARDCONTENT4" ;
      lblProgresscard4icon_Internalname = "PROGRESSCARD4ICON" ;
      divTablepcard4_Internalname = "TABLEPCARD4" ;
      tblCard4_Internalname = "CARD4" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Utchartsmootharea_Internalname = "UTCHARTSMOOTHAREA" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod_Internalname = "vCLICOD" ;
      Popover_in_alertasanalisis_sdt__maqcod_Internalname = "POPOVER_IN_ALERTASANALISIS_SDT__MAQCOD" ;
      Popover_in_alertasanalisis_sdt__barcod_Internalname = "POPOVER_IN_ALERTASANALISIS_SDT__BARCOD" ;
      Popover_in_alertasanalisis_sdt__clicod_Internalname = "POPOVER_IN_ALERTASANALISIS_SDT__CLICOD" ;
      Popover_in_alertasanalisis_sdt__barser_Internalname = "POPOVER_IN_ALERTASANALISIS_SDT__BARSER" ;
      Popover_actionnotificar_Internalname = "POPOVER_ACTIONNOTIFICAR" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
      edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname = "vDDO_IN_ALERTASANALISIS_SDT__HISPRODFAUXDATE" ;
      divDdo_in_alertasanalisis_sdt__hisprodfauxdates_Internalname = "DDO_IN_ALERTASANALISIS_SDT__HISPRODFAUXDATES" ;
      edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname = "vDDO_IN_ALERTASANALISIS_SDT__HISPROHFAUXDATE" ;
      divDdo_in_alertasanalisis_sdt__hisprohfauxdates_Internalname = "DDO_IN_ALERTASANALISIS_SDT__HISPROHFAUXDATES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavGridbadge_Jsonclick = "" ;
      edtavGridbadge_Visible = -1 ;
      edtavGridbadge_Enabled = 1 ;
      edtavActionnotificar_load_Jsonclick = "" ;
      edtavActionnotificar_load_Visible = 0 ;
      edtavActionnotificar_load_Enabled = 1 ;
      edtavActionnotificar_Jsonclick = "" ;
      edtavActionnotificar_Enabled = 1 ;
      edtavActionnotificar_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barvalpar_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barvalpar_Columnheaderclass = "" ;
      edtavIn_alertasanalisis_sdt__barvalpar_Columnclass = "WWColumn" ;
      edtavIn_alertasanalisis_sdt__barvalpar_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barvalpar_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barparvmx_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barparvmx_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barparvmx_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barparvmn_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barparvmn_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barparvmn_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barparvl2_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barparvl2_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barparvl2_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__parfascod_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__parfascod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__parfascod_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barser_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barser_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barserwithtags_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barserwithtags_Enabled = 1 ;
      edtavIn_alertasanalisis_sdt__clicod_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__clicod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled = 1 ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment = "left" ;
      edtavIn_alertasanalisis_sdt__hisprohf_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__hisprohf_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__hisprohf_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__hisprodf_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__hisprodf_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__hisprodf_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__fase_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__fase_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__fase_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barordlin_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barordlin_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barordlin_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barcodpar_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barcodpar_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barcodpar_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barcodreo_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barcodreo_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barcodreo_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barcod_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barcod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled = 1 ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment = "left" ;
      edtavIn_alertasanalisis_sdt__maqcod_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__maqcod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Jsonclick = "" ;
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled = 1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_maqcod_Jsonclick = "" ;
      edtavTotvalue_maqcod_Enabled = 1 ;
      edtavValuecard3_Jsonclick = "" ;
      edtavValuecard3_Enabled = 1 ;
      edtavValuecard2_Jsonclick = "" ;
      edtavValuecard2_Enabled = 1 ;
      edtavValuecard4_Jsonclick = "" ;
      edtavValuecard4_Enabled = 1 ;
      edtavIn_alertasanalisis_sdt__barvalpar_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barparvmx_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barparvmn_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barparvl2_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__parfascod_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barserwithtags_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__hisprohf_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__hisprodf_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__fase_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barordlin_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barcodpar_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barcodreo_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Visible = -1 ;
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavIn_alertasanalisis_sdt__barvalpar_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barparvmx_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barparvmn_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barparvl2_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__parfascod_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barser_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__clicod_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__hisprohf_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__hisprodf_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__fase_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barordlin_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barcodpar_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barcodreo_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__barcod_Enabled = -1 ;
      edtavIn_alertasanalisis_sdt__maqcod_Enabled = -1 ;
      edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Jsonclick = "" ;
      edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Jsonclick = "" ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Utchartsmootharea_Title = "" ;
      Combo_parfascod_Caption = "" ;
      Combo_fase_Caption = "" ;
      Combo_maqcod_Caption = "" ;
      Combo_artcod_Caption = "" ;
      Combo_clicod_Caption = "" ;
      edtavHasta_hisprodtf_Jsonclick = "" ;
      edtavHasta_hisprodtf_Enabled = 1 ;
      edtavDesde_hisprodtf_Jsonclick = "" ;
      edtavDesde_hisprodtf_Enabled = 1 ;
      Grid_empowerer_Popoversingrid = "Popover_In_AlertasAnalisis_SDT__MaqCod|Popover_In_AlertasAnalisis_SDT__BarCod|Popover_In_AlertasAnalisis_SDT__CliCod|Popover_In_AlertasAnalisis_SDT__BarSer|Popover_ActionNotificar" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric||Numeric|Character|Date|Date|Numeric|Character|Numeric|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T||T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||" ;
      Ddo_grid_Columnids = "0:In_AlertasAnalisis_SDT__MaqCod|2:In_AlertasAnalisis_SDT__BarCod|4:In_AlertasAnalisis_SDT__BarCodReo|5:In_AlertasAnalisis_SDT__BarCodPar|6:In_AlertasAnalisis_SDT__BarOrdLin|7:In_AlertasAnalisis_SDT__Fase|8:In_AlertasAnalisis_SDT__HisProDf|9:In_AlertasAnalisis_SDT__HisProHf|10:In_AlertasAnalisis_SDT__CliCod|12:In_AlertasAnalisis_SDT__BarSer|14:In_AlertasAnalisis_SDT__ParFasCod|15:In_AlertasAnalisis_SDT__ParFasDsc|16:In_AlertasAnalisis_SDT__BarParVl2|17:In_AlertasAnalisis_SDT__BarParVMn|18:In_AlertasAnalisis_SDT__BarParVMx|19:In_AlertasAnalisis_SDT__BarValPar" ;
      Ddo_grid_Gridinternalname = "" ;
      Popover_actionnotificar_Position = "Bottom" ;
      Popover_actionnotificar_Popoverwidth = 400 ;
      Popover_actionnotificar_Triggerelement = "Value" ;
      Popover_actionnotificar_Trigger = "Click" ;
      Popover_actionnotificar_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_actionnotificar_Iteminternalname = "" ;
      Popover_in_alertasanalisis_sdt__barser_Position = "Bottom" ;
      Popover_in_alertasanalisis_sdt__barser_Popoverwidth = 400 ;
      Popover_in_alertasanalisis_sdt__barser_Trigger = "Click" ;
      Popover_in_alertasanalisis_sdt__barser_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_in_alertasanalisis_sdt__barser_Iteminternalname = "" ;
      Popover_in_alertasanalisis_sdt__clicod_Position = "Bottom" ;
      Popover_in_alertasanalisis_sdt__clicod_Popoverwidth = 600 ;
      Popover_in_alertasanalisis_sdt__clicod_Trigger = "Click" ;
      Popover_in_alertasanalisis_sdt__clicod_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_in_alertasanalisis_sdt__clicod_Iteminternalname = "" ;
      Popover_in_alertasanalisis_sdt__barcod_Position = "Bottom" ;
      Popover_in_alertasanalisis_sdt__barcod_Popoverwidth = 400 ;
      Popover_in_alertasanalisis_sdt__barcod_Trigger = "Click" ;
      Popover_in_alertasanalisis_sdt__barcod_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_in_alertasanalisis_sdt__barcod_Iteminternalname = "" ;
      Popover_in_alertasanalisis_sdt__maqcod_Position = "Bottom" ;
      Popover_in_alertasanalisis_sdt__maqcod_Popoverwidth = 600 ;
      Popover_in_alertasanalisis_sdt__maqcod_Trigger = "Click" ;
      Popover_in_alertasanalisis_sdt__maqcod_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_in_alertasanalisis_sdt__maqcod_Iteminternalname = "" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 2 ;
      Utchartsmootharea_Charttype = "SmoothArea" ;
      Utchartsmootharea_Type = "Chart" ;
      Progresscard4_Percentage = 0 ;
      Progresscard4_Cls = "ProgressWhite" ;
      Progresscard4_Caption = "0%" ;
      Progresscard2_Percentage = 0 ;
      Progresscard2_Cls = "ProgressWhite" ;
      Progresscard2_Caption = "0%" ;
      Progresscard3_Percentage = 0 ;
      Progresscard3_Cls = "ProgressWhite" ;
      Progresscard3_Caption = "0%" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "Sin registros a mostrar..." ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Mas filtros", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Combo_parfascod_Multiplevaluestype = "Tags" ;
      Combo_parfascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parfascod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_parfascod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_parfascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fase_Multiplevaluestype = "Tags" ;
      Combo_fase_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fase_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_fase_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_fase_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Multiplevaluestype = "Tags" ;
      Combo_maqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_maqcod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_artcod_Multiplevaluestype = "Tags" ;
      Combo_artcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_artcod_Includeonlyselectedoption = GXutil.toBoolean( -1) ;
      Combo_artcod_Allowmultipleselection = GXutil.toBoolean( -1) ;
      Combo_artcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Emptyitemtext = "" ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Análisis | Alertas", "") );
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV55TFIn_AlertasAnalisis_SDT__MaqCod',fld:'vTFIN_ALERTASANALISIS_SDT__MAQCOD',pic:''},{av:'AV42TFIn_AlertasAnalisis_SDT__BarCod',fld:'vTFIN_ALERTASANALISIS_SDT__BARCOD',pic:'ZZZZZZZ9'},{av:'AV43TFIn_AlertasAnalisis_SDT__BarCodReo',fld:'vTFIN_ALERTASANALISIS_SDT__BARCODREO',pic:'9'},{av:'AV44TFIn_AlertasAnalisis_SDT__BarOrdLin',fld:'vTFIN_ALERTASANALISIS_SDT__BARORDLIN',pic:'ZZZ9'},{av:'AV52TFIn_AlertasAnalisis_SDT__Fase',fld:'vTFIN_ALERTASANALISIS_SDT__FASE',pic:''},{av:'AV53TFIn_AlertasAnalisis_SDT__HisProDf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPRODF',pic:''},{av:'AV54TFIn_AlertasAnalisis_SDT__HisProHf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPROHF',pic:'99:99'},{av:'AV51TFIn_AlertasAnalisis_SDT__CliCod',fld:'vTFIN_ALERTASANALISIS_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV48TFIn_AlertasAnalisis_SDT__BarSer',fld:'vTFIN_ALERTASANALISIS_SDT__BARSER',pic:''},{av:'AV56TFIn_AlertasAnalisis_SDT__ParFasCod',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASCOD',pic:'ZZZ9'},{av:'AV57TFIn_AlertasAnalisis_SDT__ParFasDsc',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASDSC',pic:''},{av:'AV45TFIn_AlertasAnalisis_SDT__BarParVl2',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVL2',pic:''},{av:'AV46TFIn_AlertasAnalisis_SDT__BarParVMn',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMN',pic:''},{av:'AV47TFIn_AlertasAnalisis_SDT__BarParVMx',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMX',pic:''},{av:'AV49TFIn_AlertasAnalisis_SDT__BarValPar',fld:'vTFIN_ALERTASANALISIS_SDT__BARVALPAR',pic:''},{av:'AV16Desde_HisProDTF',fld:'vDESDE_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV29Hasta_HisProDTF',fld:'vHASTA_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV36MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV20Fase',fld:'vFASE',pic:''},{av:'AV39ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__MAQCODWITHTAGS',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__barcodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARCODREO',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARCODPAR',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARORDLIN',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__FASE',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__HISPRODF',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__HISPROHF',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__clicodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__barserwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__BARSERWITHTAGS',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__PARFASCOD',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__PARFASDSC',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVL2',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVMN',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVMX',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARVALPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'IN_ALERTASANALISIS_SDT__BARVALPAR',prop:'Columnheaderclass'},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'Progresscard2_Percentage',ctrl:'PROGRESSCARD2',prop:'Percentage'},{av:'Progresscard3_Percentage',ctrl:'PROGRESSCARD3',prop:'Percentage'},{av:'Progresscard4_Percentage',ctrl:'PROGRESSCARD4',prop:'Percentage'},{av:'Progresscard2_Caption',ctrl:'PROGRESSCARD2',prop:'Caption'},{av:'Progresscard3_Caption',ctrl:'PROGRESSCARD3',prop:'Caption'},{av:'Progresscard4_Caption',ctrl:'PROGRESSCARD4',prop:'Caption'},{av:'AV78TotValue_MaqCod',fld:'vTOTVALUE_MAQCOD',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121TN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV55TFIn_AlertasAnalisis_SDT__MaqCod',fld:'vTFIN_ALERTASANALISIS_SDT__MAQCOD',pic:''},{av:'AV42TFIn_AlertasAnalisis_SDT__BarCod',fld:'vTFIN_ALERTASANALISIS_SDT__BARCOD',pic:'ZZZZZZZ9'},{av:'AV43TFIn_AlertasAnalisis_SDT__BarCodReo',fld:'vTFIN_ALERTASANALISIS_SDT__BARCODREO',pic:'9'},{av:'AV44TFIn_AlertasAnalisis_SDT__BarOrdLin',fld:'vTFIN_ALERTASANALISIS_SDT__BARORDLIN',pic:'ZZZ9'},{av:'AV52TFIn_AlertasAnalisis_SDT__Fase',fld:'vTFIN_ALERTASANALISIS_SDT__FASE',pic:''},{av:'AV53TFIn_AlertasAnalisis_SDT__HisProDf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPRODF',pic:''},{av:'AV54TFIn_AlertasAnalisis_SDT__HisProHf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPROHF',pic:'99:99'},{av:'AV51TFIn_AlertasAnalisis_SDT__CliCod',fld:'vTFIN_ALERTASANALISIS_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV48TFIn_AlertasAnalisis_SDT__BarSer',fld:'vTFIN_ALERTASANALISIS_SDT__BARSER',pic:''},{av:'AV56TFIn_AlertasAnalisis_SDT__ParFasCod',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASCOD',pic:'ZZZ9'},{av:'AV57TFIn_AlertasAnalisis_SDT__ParFasDsc',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASDSC',pic:''},{av:'AV45TFIn_AlertasAnalisis_SDT__BarParVl2',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVL2',pic:''},{av:'AV46TFIn_AlertasAnalisis_SDT__BarParVMn',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMN',pic:''},{av:'AV47TFIn_AlertasAnalisis_SDT__BarParVMx',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMX',pic:''},{av:'AV49TFIn_AlertasAnalisis_SDT__BarValPar',fld:'vTFIN_ALERTASANALISIS_SDT__BARVALPAR',pic:''},{av:'AV16Desde_HisProDTF',fld:'vDESDE_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV29Hasta_HisProDTF',fld:'vHASTA_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV36MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV20Fase',fld:'vFASE',pic:''},{av:'AV39ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131TN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV55TFIn_AlertasAnalisis_SDT__MaqCod',fld:'vTFIN_ALERTASANALISIS_SDT__MAQCOD',pic:''},{av:'AV42TFIn_AlertasAnalisis_SDT__BarCod',fld:'vTFIN_ALERTASANALISIS_SDT__BARCOD',pic:'ZZZZZZZ9'},{av:'AV43TFIn_AlertasAnalisis_SDT__BarCodReo',fld:'vTFIN_ALERTASANALISIS_SDT__BARCODREO',pic:'9'},{av:'AV44TFIn_AlertasAnalisis_SDT__BarOrdLin',fld:'vTFIN_ALERTASANALISIS_SDT__BARORDLIN',pic:'ZZZ9'},{av:'AV52TFIn_AlertasAnalisis_SDT__Fase',fld:'vTFIN_ALERTASANALISIS_SDT__FASE',pic:''},{av:'AV53TFIn_AlertasAnalisis_SDT__HisProDf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPRODF',pic:''},{av:'AV54TFIn_AlertasAnalisis_SDT__HisProHf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPROHF',pic:'99:99'},{av:'AV51TFIn_AlertasAnalisis_SDT__CliCod',fld:'vTFIN_ALERTASANALISIS_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV48TFIn_AlertasAnalisis_SDT__BarSer',fld:'vTFIN_ALERTASANALISIS_SDT__BARSER',pic:''},{av:'AV56TFIn_AlertasAnalisis_SDT__ParFasCod',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASCOD',pic:'ZZZ9'},{av:'AV57TFIn_AlertasAnalisis_SDT__ParFasDsc',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASDSC',pic:''},{av:'AV45TFIn_AlertasAnalisis_SDT__BarParVl2',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVL2',pic:''},{av:'AV46TFIn_AlertasAnalisis_SDT__BarParVMn',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMN',pic:''},{av:'AV47TFIn_AlertasAnalisis_SDT__BarParVMx',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMX',pic:''},{av:'AV49TFIn_AlertasAnalisis_SDT__BarValPar',fld:'vTFIN_ALERTASANALISIS_SDT__BARVALPAR',pic:''},{av:'AV16Desde_HisProDTF',fld:'vDESDE_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV29Hasta_HisProDTF',fld:'vHASTA_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV36MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV20Fase',fld:'vFASE',pic:''},{av:'AV39ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141TN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV55TFIn_AlertasAnalisis_SDT__MaqCod',fld:'vTFIN_ALERTASANALISIS_SDT__MAQCOD',pic:''},{av:'AV42TFIn_AlertasAnalisis_SDT__BarCod',fld:'vTFIN_ALERTASANALISIS_SDT__BARCOD',pic:'ZZZZZZZ9'},{av:'AV43TFIn_AlertasAnalisis_SDT__BarCodReo',fld:'vTFIN_ALERTASANALISIS_SDT__BARCODREO',pic:'9'},{av:'AV44TFIn_AlertasAnalisis_SDT__BarOrdLin',fld:'vTFIN_ALERTASANALISIS_SDT__BARORDLIN',pic:'ZZZ9'},{av:'AV52TFIn_AlertasAnalisis_SDT__Fase',fld:'vTFIN_ALERTASANALISIS_SDT__FASE',pic:''},{av:'AV53TFIn_AlertasAnalisis_SDT__HisProDf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPRODF',pic:''},{av:'AV54TFIn_AlertasAnalisis_SDT__HisProHf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPROHF',pic:'99:99'},{av:'AV51TFIn_AlertasAnalisis_SDT__CliCod',fld:'vTFIN_ALERTASANALISIS_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV48TFIn_AlertasAnalisis_SDT__BarSer',fld:'vTFIN_ALERTASANALISIS_SDT__BARSER',pic:''},{av:'AV56TFIn_AlertasAnalisis_SDT__ParFasCod',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASCOD',pic:'ZZZ9'},{av:'AV57TFIn_AlertasAnalisis_SDT__ParFasDsc',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASDSC',pic:''},{av:'AV45TFIn_AlertasAnalisis_SDT__BarParVl2',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVL2',pic:''},{av:'AV46TFIn_AlertasAnalisis_SDT__BarParVMn',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMN',pic:''},{av:'AV47TFIn_AlertasAnalisis_SDT__BarParVMx',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMX',pic:''},{av:'AV49TFIn_AlertasAnalisis_SDT__BarValPar',fld:'vTFIN_ALERTASANALISIS_SDT__BARVALPAR',pic:''},{av:'AV16Desde_HisProDTF',fld:'vDESDE_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV29Hasta_HisProDTF',fld:'vHASTA_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV36MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV20Fase',fld:'vFASE',pic:''},{av:'AV39ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV49TFIn_AlertasAnalisis_SDT__BarValPar',fld:'vTFIN_ALERTASANALISIS_SDT__BARVALPAR',pic:''},{av:'AV47TFIn_AlertasAnalisis_SDT__BarParVMx',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMX',pic:''},{av:'AV46TFIn_AlertasAnalisis_SDT__BarParVMn',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMN',pic:''},{av:'AV45TFIn_AlertasAnalisis_SDT__BarParVl2',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVL2',pic:''},{av:'AV57TFIn_AlertasAnalisis_SDT__ParFasDsc',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASDSC',pic:''},{av:'AV56TFIn_AlertasAnalisis_SDT__ParFasCod',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASCOD',pic:'ZZZ9'},{av:'AV48TFIn_AlertasAnalisis_SDT__BarSer',fld:'vTFIN_ALERTASANALISIS_SDT__BARSER',pic:''},{av:'AV51TFIn_AlertasAnalisis_SDT__CliCod',fld:'vTFIN_ALERTASANALISIS_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV54TFIn_AlertasAnalisis_SDT__HisProHf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPROHF',pic:'99:99'},{av:'AV53TFIn_AlertasAnalisis_SDT__HisProDf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPRODF',pic:''},{av:'AV52TFIn_AlertasAnalisis_SDT__Fase',fld:'vTFIN_ALERTASANALISIS_SDT__FASE',pic:''},{av:'AV44TFIn_AlertasAnalisis_SDT__BarOrdLin',fld:'vTFIN_ALERTASANALISIS_SDT__BARORDLIN',pic:'ZZZ9'},{av:'AV43TFIn_AlertasAnalisis_SDT__BarCodReo',fld:'vTFIN_ALERTASANALISIS_SDT__BARCODREO',pic:'9'},{av:'AV42TFIn_AlertasAnalisis_SDT__BarCod',fld:'vTFIN_ALERTASANALISIS_SDT__BARCOD',pic:'ZZZZZZZ9'},{av:'AV55TFIn_AlertasAnalisis_SDT__MaqCod',fld:'vTFIN_ALERTASANALISIS_SDT__MAQCOD',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191TN2',iparms:[{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV67ActionNotificar',fld:'vACTIONNOTIFICAR',pic:''},{av:'AV24GridBadge',fld:'vGRIDBADGE',pic:''},{ctrl:'IN_ALERTASANALISIS_SDT__BARVALPAR',prop:'Columnclass'},{av:'AV62In_AlertasAnalisis_SDT__MaqCodWithTags',fld:'vIN_ALERTASANALISIS_SDT__MAQCODWITHTAGS',pic:''},{av:'edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment',ctrl:'vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS',prop:'Horizontalalignment'},{av:'AV63In_AlertasAnalisis_SDT__BarCodWithTags',fld:'vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS',pic:''},{av:'edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment',ctrl:'vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS',prop:'Horizontalalignment'},{av:'AV64In_AlertasAnalisis_SDT__CliCodWithTags',fld:'vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS',pic:''},{av:'AV65In_AlertasAnalisis_SDT__BarSerWithTags',fld:'vIN_ALERTASANALISIS_SDT__BARSERWITHTAGS',pic:''},{av:'edtavActionnotificar_Visible',ctrl:'vACTIONNOTIFICAR',prop:'Visible'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151TN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV55TFIn_AlertasAnalisis_SDT__MaqCod',fld:'vTFIN_ALERTASANALISIS_SDT__MAQCOD',pic:''},{av:'AV42TFIn_AlertasAnalisis_SDT__BarCod',fld:'vTFIN_ALERTASANALISIS_SDT__BARCOD',pic:'ZZZZZZZ9'},{av:'AV43TFIn_AlertasAnalisis_SDT__BarCodReo',fld:'vTFIN_ALERTASANALISIS_SDT__BARCODREO',pic:'9'},{av:'AV44TFIn_AlertasAnalisis_SDT__BarOrdLin',fld:'vTFIN_ALERTASANALISIS_SDT__BARORDLIN',pic:'ZZZ9'},{av:'AV52TFIn_AlertasAnalisis_SDT__Fase',fld:'vTFIN_ALERTASANALISIS_SDT__FASE',pic:''},{av:'AV53TFIn_AlertasAnalisis_SDT__HisProDf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPRODF',pic:''},{av:'AV54TFIn_AlertasAnalisis_SDT__HisProHf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPROHF',pic:'99:99'},{av:'AV51TFIn_AlertasAnalisis_SDT__CliCod',fld:'vTFIN_ALERTASANALISIS_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV48TFIn_AlertasAnalisis_SDT__BarSer',fld:'vTFIN_ALERTASANALISIS_SDT__BARSER',pic:''},{av:'AV56TFIn_AlertasAnalisis_SDT__ParFasCod',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASCOD',pic:'ZZZ9'},{av:'AV57TFIn_AlertasAnalisis_SDT__ParFasDsc',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASDSC',pic:''},{av:'AV45TFIn_AlertasAnalisis_SDT__BarParVl2',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVL2',pic:''},{av:'AV46TFIn_AlertasAnalisis_SDT__BarParVMn',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMN',pic:''},{av:'AV47TFIn_AlertasAnalisis_SDT__BarParVMx',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMX',pic:''},{av:'AV49TFIn_AlertasAnalisis_SDT__BarValPar',fld:'vTFIN_ALERTASANALISIS_SDT__BARVALPAR',pic:''},{av:'AV16Desde_HisProDTF',fld:'vDESDE_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV29Hasta_HisProDTF',fld:'vHASTA_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV36MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV20Fase',fld:'vFASE',pic:''},{av:'AV39ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__MAQCODWITHTAGS',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__barcodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARCODREO',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARCODPAR',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARORDLIN',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__FASE',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__HISPRODF',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__HISPROHF',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__clicodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__barserwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__BARSERWITHTAGS',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__PARFASCOD',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__PARFASDSC',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVL2',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVMN',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVMX',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARVALPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'IN_ALERTASANALISIS_SDT__BARVALPAR',prop:'Columnheaderclass'},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'Progresscard2_Percentage',ctrl:'PROGRESSCARD2',prop:'Percentage'},{av:'Progresscard3_Percentage',ctrl:'PROGRESSCARD3',prop:'Percentage'},{av:'Progresscard4_Percentage',ctrl:'PROGRESSCARD4',prop:'Percentage'},{av:'Progresscard2_Caption',ctrl:'PROGRESSCARD2',prop:'Caption'},{av:'Progresscard3_Caption',ctrl:'PROGRESSCARD3',prop:'Caption'},{av:'Progresscard4_Caption',ctrl:'PROGRESSCARD4',prop:'Caption'},{av:'AV78TotValue_MaqCod',fld:'vTOTVALUE_MAQCOD',pic:''}]}");
      setEventMetadata("'DOBUSCAR'","{handler:'e161TN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV55TFIn_AlertasAnalisis_SDT__MaqCod',fld:'vTFIN_ALERTASANALISIS_SDT__MAQCOD',pic:''},{av:'AV42TFIn_AlertasAnalisis_SDT__BarCod',fld:'vTFIN_ALERTASANALISIS_SDT__BARCOD',pic:'ZZZZZZZ9'},{av:'AV43TFIn_AlertasAnalisis_SDT__BarCodReo',fld:'vTFIN_ALERTASANALISIS_SDT__BARCODREO',pic:'9'},{av:'AV44TFIn_AlertasAnalisis_SDT__BarOrdLin',fld:'vTFIN_ALERTASANALISIS_SDT__BARORDLIN',pic:'ZZZ9'},{av:'AV52TFIn_AlertasAnalisis_SDT__Fase',fld:'vTFIN_ALERTASANALISIS_SDT__FASE',pic:''},{av:'AV53TFIn_AlertasAnalisis_SDT__HisProDf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPRODF',pic:''},{av:'AV54TFIn_AlertasAnalisis_SDT__HisProHf',fld:'vTFIN_ALERTASANALISIS_SDT__HISPROHF',pic:'99:99'},{av:'AV51TFIn_AlertasAnalisis_SDT__CliCod',fld:'vTFIN_ALERTASANALISIS_SDT__CLICOD',pic:'ZZZZZ9'},{av:'AV48TFIn_AlertasAnalisis_SDT__BarSer',fld:'vTFIN_ALERTASANALISIS_SDT__BARSER',pic:''},{av:'AV56TFIn_AlertasAnalisis_SDT__ParFasCod',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASCOD',pic:'ZZZ9'},{av:'AV57TFIn_AlertasAnalisis_SDT__ParFasDsc',fld:'vTFIN_ALERTASANALISIS_SDT__PARFASDSC',pic:''},{av:'AV45TFIn_AlertasAnalisis_SDT__BarParVl2',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVL2',pic:''},{av:'AV46TFIn_AlertasAnalisis_SDT__BarParVMn',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMN',pic:''},{av:'AV47TFIn_AlertasAnalisis_SDT__BarParVMx',fld:'vTFIN_ALERTASANALISIS_SDT__BARPARVMX',pic:''},{av:'AV49TFIn_AlertasAnalisis_SDT__BarValPar',fld:'vTFIN_ALERTASANALISIS_SDT__BARVALPAR',pic:''},{av:'AV16Desde_HisProDTF',fld:'vDESDE_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV29Hasta_HisProDTF',fld:'vHASTA_HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV36MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV20Fase',fld:'vFASE',pic:''},{av:'AV39ParFasCod',fld:'vPARFASCOD',pic:''},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'DOBUSCAR'",",oparms:[{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__MAQCODWITHTAGS',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__barcodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__BARCODWITHTAGS',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARCODREO',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARCODPAR',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARORDLIN',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__FASE',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__HISPRODF',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__HISPROHF',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__clicodwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__CLICODWITHTAGS',prop:'Visible'},{av:'edtavIn_alertasanalisis_sdt__barserwithtags_Visible',ctrl:'vIN_ALERTASANALISIS_SDT__BARSERWITHTAGS',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__PARFASCOD',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__PARFASDSC',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVL2',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVMN',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARPARVMX',prop:'Visible'},{ctrl:'IN_ALERTASANALISIS_SDT__BARVALPAR',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'IN_ALERTASANALISIS_SDT__BARVALPAR',prop:'Columnheaderclass'},{av:'AV69ValueCard2',fld:'vVALUECARD2',pic:'ZZ,ZZZ,ZZ9'},{av:'AV70ValueCard3',fld:'vVALUECARD3',pic:'ZZ,ZZZ,ZZ9'},{av:'AV68ValueCard4',fld:'vVALUECARD4',pic:'ZZ,ZZZ,ZZ9'},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100},{av:'Progresscard2_Percentage',ctrl:'PROGRESSCARD2',prop:'Percentage'},{av:'Progresscard3_Percentage',ctrl:'PROGRESSCARD3',prop:'Percentage'},{av:'Progresscard4_Percentage',ctrl:'PROGRESSCARD4',prop:'Percentage'},{av:'Progresscard2_Caption',ctrl:'PROGRESSCARD2',prop:'Caption'},{av:'Progresscard3_Caption',ctrl:'PROGRESSCARD3',prop:'Caption'},{av:'Progresscard4_Caption',ctrl:'PROGRESSCARD4',prop:'Caption'},{av:'AV78TotValue_MaqCod',fld:'vTOTVALUE_MAQCOD',pic:''}]}");
      setEventMetadata("VACTIONNOTIFICAR_LOAD.CLICK","{handler:'e241TN2',iparms:[]");
      setEventMetadata("VACTIONNOTIFICAR_LOAD.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("IN_ALERTASANALISIS_SDT__BARSER.CLICK","{handler:'e201TN2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100}]");
      setEventMetadata("IN_ALERTASANALISIS_SDT__BARSER.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("IN_ALERTASANALISIS_SDT__CLICOD.CLICK","{handler:'e211TN2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100}]");
      setEventMetadata("IN_ALERTASANALISIS_SDT__CLICOD.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("IN_ALERTASANALISIS_SDT__BARCOD.CLICK","{handler:'e221TN2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100}]");
      setEventMetadata("IN_ALERTASANALISIS_SDT__BARCOD.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("IN_ALERTASANALISIS_SDT__MAQCOD.CLICK","{handler:'e231TN2',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV31In_AlertasAnalisis_SDT',fld:'vIN_ALERTASANALISIS_SDT',grid:100,pic:'',hsh:true},{av:'nGXsfl_100_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:100},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_100',ctrl:'GRID',prop:'GridRC',grid:100}]");
      setEventMetadata("IN_ALERTASANALISIS_SDT__MAQCOD.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED","{handler:'e111TN2',iparms:[{av:'Combo_clicod_Selectedvalue_get',ctrl:'COMBO_CLICOD',prop:'SelectedValue_get'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'A65ArtCod',fld:'ARTCOD',pic:''},{av:'A69ArtDsc',fld:'ARTDSC',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''}]");
      setEventMetadata("COMBO_CLICOD.ONOPTIONCLICKED",",oparms:[{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV6ArtCod_Data',fld:'vARTCOD_DATA',pic:''},{av:'Combo_artcod_Selectedvalue_set',ctrl:'COMBO_ARTCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gridbadge',iparms:[]");
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
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Combo_parfascod_Selectedvalue_get = "" ;
      Combo_fase_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      Combo_artcod_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV9ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV116Pgmname = "" ;
      AV55TFIn_AlertasAnalisis_SDT__MaqCod = "" ;
      AV52TFIn_AlertasAnalisis_SDT__Fase = "" ;
      AV53TFIn_AlertasAnalisis_SDT__HisProDf = GXutil.nullDate() ;
      AV54TFIn_AlertasAnalisis_SDT__HisProHf = GXutil.resetTime( GXutil.nullDate() );
      AV48TFIn_AlertasAnalisis_SDT__BarSer = "" ;
      AV57TFIn_AlertasAnalisis_SDT__ParFasDsc = "" ;
      AV45TFIn_AlertasAnalisis_SDT__BarParVl2 = "" ;
      AV46TFIn_AlertasAnalisis_SDT__BarParVMn = "" ;
      AV47TFIn_AlertasAnalisis_SDT__BarParVMx = "" ;
      AV49TFIn_AlertasAnalisis_SDT__BarValPar = "" ;
      AV16Desde_HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV29Hasta_HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV36MaqCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV5ArtCod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20Fase = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39ParFasCod = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV31In_AlertasAnalisis_SDT = new GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem>(app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem.class, "In_AlertasAnalisis_SDTItem", "TexplusNET", remoteHandle);
      AV17EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV8CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV6ArtCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV37MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV21Fase_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV40ParFasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV85Elements = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV93Parameters = new GXBaseCollection<app.SdtQueryViewerParameters_Parameter>(app.SdtQueryViewerParameters_Parameter.class, "Parameter", "TexplusNET", remoteHandle);
      AV88ItemClickData = new app.SdtQueryViewerItemClickData(remoteHandle, context);
      AV90ItemDoubleClickData = new app.SdtQueryViewerItemDoubleClickData(remoteHandle, context);
      AV83DragAndDropData = new app.SdtQueryViewerDragAndDropData(remoteHandle, context);
      AV86FilterChangedData = new app.SdtQueryViewerFilterChangedData(remoteHandle, context);
      AV91ItemExpandData = new app.SdtQueryViewerItemExpandData(remoteHandle, context);
      AV89ItemCollapseData = new app.SdtQueryViewerItemCollapseData(remoteHandle, context);
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A69ArtDsc = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_artcod_Selectedvalue_set = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_fase_Selectedvalue_set = "" ;
      Combo_parfascod_Selectedvalue_set = "" ;
      Popover_in_alertasanalisis_sdt__maqcod_Gridinternalname = "" ;
      Popover_in_alertasanalisis_sdt__barcod_Gridinternalname = "" ;
      Popover_in_alertasanalisis_sdt__clicod_Gridinternalname = "" ;
      Popover_in_alertasanalisis_sdt__barser_Gridinternalname = "" ;
      Popover_actionnotificar_Gridinternalname = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnbuscar_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_artcod_Jsonclick = "" ;
      ucCombo_artcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fase_Jsonclick = "" ;
      ucCombo_fase = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_parfascod_Jsonclick = "" ;
      ucCombo_parfascod = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab_analisis_title_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      lblTab_alertas_title_Jsonclick = "" ;
      ucUtchartsmootharea = new com.genexus.webpanels.GXUserControl();
      ucPopover_in_alertasanalisis_sdt__maqcod = new com.genexus.webpanels.GXUserControl();
      ucPopover_in_alertasanalisis_sdt__barcod = new com.genexus.webpanels.GXUserControl();
      ucPopover_in_alertasanalisis_sdt__clicod = new com.genexus.webpanels.GXUserControl();
      ucPopover_in_alertasanalisis_sdt__barser = new com.genexus.webpanels.GXUserControl();
      ucPopover_actionnotificar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate = GXutil.nullDate() ;
      AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV62In_AlertasAnalisis_SDT__MaqCodWithTags = "" ;
      AV63In_AlertasAnalisis_SDT__BarCodWithTags = "" ;
      AV64In_AlertasAnalisis_SDT__CliCodWithTags = "" ;
      AV65In_AlertasAnalisis_SDT__BarSerWithTags = "" ;
      AV67ActionNotificar = "" ;
      AV24GridBadge = "" ;
      Gx_date = GXutil.nullDate() ;
      AV78TotValue_MaqCod = "" ;
      hsh = "" ;
      AV118Station = "" ;
      AV119Emprnom = "" ;
      AV120Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV95Axis = new app.SdtQueryViewerElements_Element(remoteHandle, context);
      AV94Axes = new GXBaseCollection<app.SdtQueryViewerElements_Element>(app.SdtQueryViewerElements_Element.class, "Element", "TexplusNET", remoteHandle);
      AV61WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV11ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXt_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem8 = new GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem>(app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem.class, "In_AlertasAnalisis_SDTItem", "TexplusNET", remoteHandle);
      GXv_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem9 = new GXBaseCollection[1] ;
      AV60UserCustomValue = "" ;
      AV10ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV72In_AlertasAnalisis_SDTItem = new app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem(remoteHandle, context);
      ucProgresscard2 = new com.genexus.webpanels.GXUserControl();
      ucProgresscard3 = new com.genexus.webpanels.GXUserControl();
      ucProgresscard4 = new com.genexus.webpanels.GXUserControl();
      scmdbuf = "" ;
      H01TN2_A396EmprCod = new String[] {""} ;
      H01TN2_A1664ParFasCod = new short[1] ;
      H01TN2_A1665ParFasDsc = new String[] {""} ;
      H01TN2_n1665ParFasDsc = new boolean[] {false} ;
      A1665ParFasDsc = "" ;
      AV12Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01TN3_A396EmprCod = new String[] {""} ;
      H01TN3_A457FasCod = new String[] {""} ;
      H01TN3_A460FasDsc = new String[] {""} ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      H01TN4_A396EmprCod = new String[] {""} ;
      H01TN4_A602MaqCod = new String[] {""} ;
      H01TN4_A606MaqDsc = new String[] {""} ;
      H01TN4_n606MaqDsc = new boolean[] {false} ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      H01TN5_A252CliCod = new int[1] ;
      H01TN5_A396EmprCod = new String[] {""} ;
      H01TN5_A65ArtCod = new String[] {""} ;
      H01TN5_A69ArtDsc = new String[] {""} ;
      H01TN5_n69ArtDsc = new boolean[] {false} ;
      H01TN6_A396EmprCod = new String[] {""} ;
      H01TN6_A279CliNom = new String[] {""} ;
      H01TN6_A252CliCod = new int[1] ;
      A279CliNom = "" ;
      A13735CliCNom = "" ;
      lblDescriptioncard4_Jsonclick = "" ;
      lblProgresscard4icon_Jsonclick = "" ;
      lblDescriptioncard2_Jsonclick = "" ;
      lblProgresscard2icon_Jsonclick = "" ;
      lblDescriptioncard3_Jsonclick = "" ;
      lblProgresscard3icon_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.in_alertasanalisis_wp__default(),
         new Object[] {
             new Object[] {
            H01TN2_A396EmprCod, H01TN2_A1664ParFasCod, H01TN2_A1665ParFasDsc, H01TN2_n1665ParFasDsc
            }
            , new Object[] {
            H01TN3_A396EmprCod, H01TN3_A457FasCod, H01TN3_A460FasDsc
            }
            , new Object[] {
            H01TN4_A396EmprCod, H01TN4_A602MaqCod, H01TN4_A606MaqDsc, H01TN4_n606MaqDsc
            }
            , new Object[] {
            H01TN5_A252CliCod, H01TN5_A396EmprCod, H01TN5_A65ArtCod, H01TN5_A69ArtDsc, H01TN5_n69ArtDsc
            }
            , new Object[] {
            H01TN6_A396EmprCod, H01TN6_A279CliNom, H01TN6_A252CliCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV116Pgmname = "Ingenieria.In_AlertasAnalisis_WP" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV116Pgmname = "Ingenieria.In_AlertasAnalisis_WP" ;
      Gx_err = (short)(0) ;
      edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__maqcod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barcod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barcodreo_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barcodpar_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barordlin_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__fase_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__hisprodf_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__hisprohf_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__clicod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barserwithtags_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barser_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__parfascod_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__parfasdsc_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barparvl2_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barparvmn_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barparvmx_Enabled = 0 ;
      edtavIn_alertasanalisis_sdt__barvalpar_Enabled = 0 ;
      edtavActionnotificar_Enabled = 0 ;
      edtavActionnotificar_load_Enabled = 0 ;
      edtavGridbadge_Enabled = 0 ;
      edtavTotvalue_maqcod_Enabled = 0 ;
      edtavValuecard3_Enabled = 0 ;
      edtavValuecard2_Enabled = 0 ;
      edtavValuecard4_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV43TFIn_AlertasAnalisis_SDT__BarCodReo ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV44TFIn_AlertasAnalisis_SDT__BarOrdLin ;
   private short AV56TFIn_AlertasAnalisis_SDT__ParFasCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV66ActionNotificar_Load ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A1664ParFasCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_100 ;
   private int nGXsfl_100_idx=1 ;
   private int AV42TFIn_AlertasAnalisis_SDT__BarCod ;
   private int AV51TFIn_AlertasAnalisis_SDT__CliCod ;
   private int AV7CliCod ;
   private int AV69ValueCard2 ;
   private int AV70ValueCard3 ;
   private int AV68ValueCard4 ;
   private int A252CliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Progresscard3_Percentage ;
   private int Progresscard2_Percentage ;
   private int Progresscard4_Percentage ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int Popover_in_alertasanalisis_sdt__maqcod_Popoverwidth ;
   private int Popover_in_alertasanalisis_sdt__barcod_Popoverwidth ;
   private int Popover_in_alertasanalisis_sdt__clicod_Popoverwidth ;
   private int Popover_in_alertasanalisis_sdt__barser_Popoverwidth ;
   private int Popover_actionnotificar_Popoverwidth ;
   private int edtavDesde_hisprodtf_Enabled ;
   private int edtavHasta_hisprodtf_Enabled ;
   private int AV99GXV1 ;
   private int edtavPgmname_Enabled ;
   private int edtavClicod_Visible ;
   private int subGrid_Islastpage ;
   private int edtavIn_alertasanalisis_sdt__maqcodwithtags_Enabled ;
   private int edtavIn_alertasanalisis_sdt__maqcod_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barcodwithtags_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barcod_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barcodreo_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barcodpar_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barordlin_Enabled ;
   private int edtavIn_alertasanalisis_sdt__fase_Enabled ;
   private int edtavIn_alertasanalisis_sdt__hisprodf_Enabled ;
   private int edtavIn_alertasanalisis_sdt__hisprohf_Enabled ;
   private int edtavIn_alertasanalisis_sdt__clicodwithtags_Enabled ;
   private int edtavIn_alertasanalisis_sdt__clicod_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barserwithtags_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barser_Enabled ;
   private int edtavIn_alertasanalisis_sdt__parfascod_Enabled ;
   private int edtavIn_alertasanalisis_sdt__parfasdsc_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barparvl2_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barparvmn_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barparvmx_Enabled ;
   private int edtavIn_alertasanalisis_sdt__barvalpar_Enabled ;
   private int edtavActionnotificar_Enabled ;
   private int edtavActionnotificar_load_Enabled ;
   private int edtavGridbadge_Enabled ;
   private int edtavTotvalue_maqcod_Enabled ;
   private int edtavValuecard3_Enabled ;
   private int edtavValuecard2_Enabled ;
   private int edtavValuecard4_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_100_fel_idx=1 ;
   private int edtavIn_alertasanalisis_sdt__maqcodwithtags_Visible ;
   private int edtavIn_alertasanalisis_sdt__barcodwithtags_Visible ;
   private int edtavIn_alertasanalisis_sdt__barcodreo_Visible ;
   private int edtavIn_alertasanalisis_sdt__barcodpar_Visible ;
   private int edtavIn_alertasanalisis_sdt__barordlin_Visible ;
   private int edtavIn_alertasanalisis_sdt__fase_Visible ;
   private int edtavIn_alertasanalisis_sdt__hisprodf_Visible ;
   private int edtavIn_alertasanalisis_sdt__hisprohf_Visible ;
   private int edtavIn_alertasanalisis_sdt__clicodwithtags_Visible ;
   private int edtavIn_alertasanalisis_sdt__barserwithtags_Visible ;
   private int edtavIn_alertasanalisis_sdt__parfascod_Visible ;
   private int edtavIn_alertasanalisis_sdt__parfasdsc_Visible ;
   private int edtavIn_alertasanalisis_sdt__barparvl2_Visible ;
   private int edtavIn_alertasanalisis_sdt__barparvmn_Visible ;
   private int edtavIn_alertasanalisis_sdt__barparvmx_Visible ;
   private int edtavIn_alertasanalisis_sdt__barvalpar_Visible ;
   private int AV38PageToGo ;
   private int edtavActionnotificar_Visible ;
   private int nGXsfl_100_bak_idx=1 ;
   private int AV121GXV18 ;
   private int AV71ValueCard1 ;
   private int AV122GXV19 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavActionnotificar_load_Visible ;
   private int edtavGridbadge_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV77Tot_MaqCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Combo_parfascod_Selectedvalue_get ;
   private String Combo_fase_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String Combo_artcod_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_100_idx="0001" ;
   private String AV116Pgmname ;
   private String AV55TFIn_AlertasAnalisis_SDT__MaqCod ;
   private String AV52TFIn_AlertasAnalisis_SDT__Fase ;
   private String AV48TFIn_AlertasAnalisis_SDT__BarSer ;
   private String AV57TFIn_AlertasAnalisis_SDT__ParFasDsc ;
   private String AV45TFIn_AlertasAnalisis_SDT__BarParVl2 ;
   private String AV46TFIn_AlertasAnalisis_SDT__BarParVMn ;
   private String AV47TFIn_AlertasAnalisis_SDT__BarParVMx ;
   private String AV49TFIn_AlertasAnalisis_SDT__BarValPar ;
   private String AV17EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A69ArtDsc ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_artcod_Cls ;
   private String Combo_artcod_Selectedvalue_set ;
   private String Combo_artcod_Multiplevaluestype ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_maqcod_Multiplevaluestype ;
   private String Combo_fase_Cls ;
   private String Combo_fase_Selectedvalue_set ;
   private String Combo_fase_Multiplevaluestype ;
   private String Combo_parfascod_Cls ;
   private String Combo_parfascod_Selectedvalue_set ;
   private String Combo_parfascod_Multiplevaluestype ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Progresscard3_Caption ;
   private String Progresscard3_Cls ;
   private String Progresscard2_Caption ;
   private String Progresscard2_Cls ;
   private String Progresscard4_Caption ;
   private String Progresscard4_Cls ;
   private String Utchartsmootharea_Type ;
   private String Utchartsmootharea_Charttype ;
   private String Gxuitabspanel_tabs_Class ;
   private String Popover_in_alertasanalisis_sdt__maqcod_Gridinternalname ;
   private String Popover_in_alertasanalisis_sdt__maqcod_Iteminternalname ;
   private String Popover_in_alertasanalisis_sdt__maqcod_Trigger ;
   private String Popover_in_alertasanalisis_sdt__maqcod_Position ;
   private String Popover_in_alertasanalisis_sdt__barcod_Gridinternalname ;
   private String Popover_in_alertasanalisis_sdt__barcod_Iteminternalname ;
   private String Popover_in_alertasanalisis_sdt__barcod_Trigger ;
   private String Popover_in_alertasanalisis_sdt__barcod_Position ;
   private String Popover_in_alertasanalisis_sdt__clicod_Gridinternalname ;
   private String Popover_in_alertasanalisis_sdt__clicod_Iteminternalname ;
   private String Popover_in_alertasanalisis_sdt__clicod_Trigger ;
   private String Popover_in_alertasanalisis_sdt__clicod_Position ;
   private String Popover_in_alertasanalisis_sdt__barser_Gridinternalname ;
   private String Popover_in_alertasanalisis_sdt__barser_Iteminternalname ;
   private String Popover_in_alertasanalisis_sdt__barser_Trigger ;
   private String Popover_in_alertasanalisis_sdt__barser_Position ;
   private String Popover_actionnotificar_Gridinternalname ;
   private String Popover_actionnotificar_Iteminternalname ;
   private String Popover_actionnotificar_Trigger ;
   private String Popover_actionnotificar_Triggerelement ;
   private String Popover_actionnotificar_Position ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Popoversingrid ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavDesde_hisprodtf_Internalname ;
   private String TempTags ;
   private String edtavDesde_hisprodtf_Jsonclick ;
   private String edtavHasta_hisprodtf_Internalname ;
   private String edtavHasta_hisprodtf_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnbuscar_Internalname ;
   private String bttBtnbuscar_Jsonclick ;
   private String divTableactions_Internalname ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockcombo_clicod_Internalname ;
   private String lblTextblockcombo_clicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Internalname ;
   private String divTablesplittedartcod_Internalname ;
   private String lblTextblockcombo_artcod_Internalname ;
   private String lblTextblockcombo_artcod_Jsonclick ;
   private String Combo_artcod_Caption ;
   private String Combo_artcod_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divTablesplittedfase_Internalname ;
   private String lblTextblockcombo_fase_Internalname ;
   private String lblTextblockcombo_fase_Jsonclick ;
   private String Combo_fase_Caption ;
   private String Combo_fase_Internalname ;
   private String divTablesplittedparfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Internalname ;
   private String lblTextblockcombo_parfascod_Jsonclick ;
   private String Combo_parfascod_Caption ;
   private String Combo_parfascod_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab_analisis_title_Internalname ;
   private String lblTab_analisis_title_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String lblTab_alertas_title_Internalname ;
   private String lblTab_alertas_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String Utchartsmootharea_Title ;
   private String Utchartsmootharea_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String Popover_in_alertasanalisis_sdt__maqcod_Internalname ;
   private String Popover_in_alertasanalisis_sdt__barcod_Internalname ;
   private String Popover_in_alertasanalisis_sdt__clicod_Internalname ;
   private String Popover_in_alertasanalisis_sdt__barser_Internalname ;
   private String Popover_actionnotificar_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String divDdo_in_alertasanalisis_sdt__hisprodfauxdates_Internalname ;
   private String edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Internalname ;
   private String edtavDdo_in_alertasanalisis_sdt__hisprodfauxdate_Jsonclick ;
   private String divDdo_in_alertasanalisis_sdt__hisprohfauxdates_Internalname ;
   private String edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Internalname ;
   private String edtavDdo_in_alertasanalisis_sdt__hisprohfauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavIn_alertasanalisis_sdt__maqcodwithtags_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barcodwithtags_Internalname ;
   private String edtavIn_alertasanalisis_sdt__clicodwithtags_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barserwithtags_Internalname ;
   private String AV67ActionNotificar ;
   private String edtavActionnotificar_Internalname ;
   private String edtavActionnotificar_load_Internalname ;
   private String edtavGridbadge_Internalname ;
   private String edtavIn_alertasanalisis_sdt__maqcod_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barcod_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barcodreo_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barcodpar_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barordlin_Internalname ;
   private String edtavIn_alertasanalisis_sdt__fase_Internalname ;
   private String edtavIn_alertasanalisis_sdt__hisprodf_Internalname ;
   private String edtavIn_alertasanalisis_sdt__hisprohf_Internalname ;
   private String edtavIn_alertasanalisis_sdt__clicod_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barser_Internalname ;
   private String edtavIn_alertasanalisis_sdt__parfascod_Internalname ;
   private String edtavIn_alertasanalisis_sdt__parfasdsc_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barparvl2_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barparvmn_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barparvmx_Internalname ;
   private String edtavIn_alertasanalisis_sdt__barvalpar_Internalname ;
   private String edtavTotvalue_maqcod_Internalname ;
   private String edtavValuecard3_Internalname ;
   private String edtavValuecard2_Internalname ;
   private String edtavValuecard4_Internalname ;
   private String sGXsfl_100_fel_idx="0001" ;
   private String hsh ;
   private String AV118Station ;
   private String AV119Emprnom ;
   private String AV120Usurcod ;
   private String edtavIn_alertasanalisis_sdt__barvalpar_Columnheaderclass ;
   private String edtavIn_alertasanalisis_sdt__barvalpar_Columnclass ;
   private String edtavIn_alertasanalisis_sdt__barcodwithtags_Horizontalalignment ;
   private String edtavIn_alertasanalisis_sdt__clicodwithtags_Horizontalalignment ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char13 ;
   private String GXv_char2[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String Progresscard2_Internalname ;
   private String Progresscard3_Internalname ;
   private String Progresscard4_Internalname ;
   private String scmdbuf ;
   private String A1665ParFasDsc ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A279CliNom ;
   private String tblCard4_Internalname ;
   private String divTablepcard4_Internalname ;
   private String divTablepcardcontent4_Internalname ;
   private String edtavValuecard4_Jsonclick ;
   private String lblDescriptioncard4_Internalname ;
   private String lblDescriptioncard4_Jsonclick ;
   private String lblProgresscard4icon_Internalname ;
   private String lblProgresscard4icon_Jsonclick ;
   private String tblCard2_Internalname ;
   private String divTablepcard2_Internalname ;
   private String divTablepcardcontent2_Internalname ;
   private String edtavValuecard2_Jsonclick ;
   private String lblDescriptioncard2_Internalname ;
   private String lblDescriptioncard2_Jsonclick ;
   private String lblProgresscard2icon_Internalname ;
   private String lblProgresscard2icon_Jsonclick ;
   private String tblCard3_Internalname ;
   private String divTablepcard3_Internalname ;
   private String divTablepcardcontent3_Internalname ;
   private String edtavValuecard3_Jsonclick ;
   private String lblDescriptioncard3_Internalname ;
   private String lblDescriptioncard3_Jsonclick ;
   private String lblProgresscard3icon_Internalname ;
   private String lblProgresscard3icon_Jsonclick ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_maqcod_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavIn_alertasanalisis_sdt__maqcodwithtags_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__maqcod_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barcodwithtags_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barcod_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barcodreo_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barcodpar_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barordlin_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__fase_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__hisprodf_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__hisprohf_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__clicodwithtags_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__clicod_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barserwithtags_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barser_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__parfascod_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__parfasdsc_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barparvl2_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barparvmn_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barparvmx_Jsonclick ;
   private String edtavIn_alertasanalisis_sdt__barvalpar_Jsonclick ;
   private String edtavActionnotificar_Jsonclick ;
   private String edtavActionnotificar_load_Jsonclick ;
   private String edtavGridbadge_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV54TFIn_AlertasAnalisis_SDT__HisProHf ;
   private java.util.Date AV16Desde_HisProDTF ;
   private java.util.Date AV29Hasta_HisProDTF ;
   private java.util.Date AV53TFIn_AlertasAnalisis_SDT__HisProDf ;
   private java.util.Date AV13DDO_In_AlertasAnalisis_SDT__HisProDfAuxDate ;
   private java.util.Date AV14DDO_In_AlertasAnalisis_SDT__HisProHfAuxDate ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_artcod_Allowmultipleselection ;
   private boolean Combo_artcod_Includeonlyselectedoption ;
   private boolean Combo_artcod_Emptyitem ;
   private boolean Combo_maqcod_Allowmultipleselection ;
   private boolean Combo_maqcod_Includeonlyselectedoption ;
   private boolean Combo_maqcod_Emptyitem ;
   private boolean Combo_fase_Allowmultipleselection ;
   private boolean Combo_fase_Includeonlyselectedoption ;
   private boolean Combo_fase_Emptyitem ;
   private boolean Combo_parfascod_Allowmultipleselection ;
   private boolean Combo_parfascod_Includeonlyselectedoption ;
   private boolean Combo_parfascod_Emptyitem ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Popover_in_alertasanalisis_sdt__maqcod_Isgriditem ;
   private boolean Popover_in_alertasanalisis_sdt__barcod_Isgriditem ;
   private boolean Popover_in_alertasanalisis_sdt__clicod_Isgriditem ;
   private boolean Popover_in_alertasanalisis_sdt__barser_Isgriditem ;
   private boolean Popover_actionnotificar_Isgriditem ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_100_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean bDynCreated_Wwpaux_wc ;
   private boolean gx_BV100 ;
   private boolean n1665ParFasDsc ;
   private boolean n606MaqDsc ;
   private boolean n69ArtDsc ;
   private String AV11ColumnsSelectorXML ;
   private String AV60UserCustomValue ;
   private String AV62In_AlertasAnalisis_SDT__MaqCodWithTags ;
   private String AV63In_AlertasAnalisis_SDT__BarCodWithTags ;
   private String AV64In_AlertasAnalisis_SDT__CliCodWithTags ;
   private String AV65In_AlertasAnalisis_SDT__BarSerWithTags ;
   private String AV24GridBadge ;
   private String AV78TotValue_MaqCod ;
   private String A13735CliCNom ;
   private GXSimpleCollection<Short> AV39ParFasCod ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_artcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_fase ;
   private com.genexus.webpanels.GXUserControl ucCombo_parfascod ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucUtchartsmootharea ;
   private com.genexus.webpanels.GXUserControl ucPopover_in_alertasanalisis_sdt__maqcod ;
   private com.genexus.webpanels.GXUserControl ucPopover_in_alertasanalisis_sdt__barcod ;
   private com.genexus.webpanels.GXUserControl ucPopover_in_alertasanalisis_sdt__clicod ;
   private com.genexus.webpanels.GXUserControl ucPopover_in_alertasanalisis_sdt__barser ;
   private com.genexus.webpanels.GXUserControl ucPopover_actionnotificar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucProgresscard2 ;
   private com.genexus.webpanels.GXUserControl ucProgresscard3 ;
   private com.genexus.webpanels.GXUserControl ucProgresscard4 ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01TN2_A396EmprCod ;
   private short[] H01TN2_A1664ParFasCod ;
   private String[] H01TN2_A1665ParFasDsc ;
   private boolean[] H01TN2_n1665ParFasDsc ;
   private String[] H01TN3_A396EmprCod ;
   private String[] H01TN3_A457FasCod ;
   private String[] H01TN3_A460FasDsc ;
   private String[] H01TN4_A396EmprCod ;
   private String[] H01TN4_A602MaqCod ;
   private String[] H01TN4_A606MaqDsc ;
   private boolean[] H01TN4_n606MaqDsc ;
   private int[] H01TN5_A252CliCod ;
   private String[] H01TN5_A396EmprCod ;
   private String[] H01TN5_A65ArtCod ;
   private String[] H01TN5_A69ArtDsc ;
   private boolean[] H01TN5_n69ArtDsc ;
   private String[] H01TN6_A396EmprCod ;
   private String[] H01TN6_A279CliNom ;
   private int[] H01TN6_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV36MaqCod ;
   private GXSimpleCollection<String> AV5ArtCod ;
   private GXSimpleCollection<String> AV20Fase ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV8CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV6ArtCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV37MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV21Fase_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40ParFasCod_Data ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV85Elements ;
   private GXBaseCollection<app.SdtQueryViewerElements_Element> AV94Axes ;
   private GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> AV31In_AlertasAnalisis_SDT ;
   private GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> GXt_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem8 ;
   private GXBaseCollection<app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem> GXv_objcol_SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem9[] ;
   private GXBaseCollection<app.SdtQueryViewerParameters_Parameter> AV93Parameters ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV12Combo_DataItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.SdtQueryViewerDragAndDropData AV83DragAndDropData ;
   private app.SdtQueryViewerElements_Element AV95Axis ;
   private app.SdtQueryViewerFilterChangedData AV86FilterChangedData ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.ingenieria.SdtIn_AlertasAnalisis_SDT_In_AlertasAnalisis_SDTItem AV72In_AlertasAnalisis_SDTItem ;
   private app.SdtQueryViewerItemClickData AV88ItemClickData ;
   private app.SdtQueryViewerItemCollapseData AV89ItemCollapseData ;
   private app.SdtQueryViewerItemDoubleClickData AV90ItemDoubleClickData ;
   private app.SdtQueryViewerItemExpandData AV91ItemExpandData ;
   private app.wwpbaseobjects.SdtWWPContext AV61WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class in_alertasanalisis_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01TN2", "SELECT EmprCod, ParFasCod, ParFasDsc FROM TXPPARFAS WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TN3", "SELECT EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TN4", "SELECT EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TN5", "SELECT CliCod, EmprCod, ArtCod, ArtDsc FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01TN6", "SELECT EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

