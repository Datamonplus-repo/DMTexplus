package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetintecierrewwp_impl extends GXDataArea
{
   public recetadetintecierrewwp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetintecierrewwp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetintecierrewwp_impl.class ));
   }

   public recetadetintecierrewwp_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGrupodeacciones = new HTMLChoice();
      chkavRecetadetinte_cierre_sdt__seleccionar = UIFactory.getCheckbox(this);
      cmbavRecetadetinte_cierre_sdt__pesado = new HTMLChoice();
      cmbavRecetadetinte_cierre_sdt__adicion = new HTMLChoice();
      cmbavRecetadetinte_cierre_sdt__recnropar = new HTMLChoice();
      cmbavRecetadetinte_cierre_sdt__colorservicedatos = new HTMLChoice();
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
      nRC_GXsfl_150 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_150"))) ;
      nGXsfl_150_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_150_idx"))) ;
      sGXsfl_150_idx = httpContext.GetPar( "sGXsfl_150_idx") ;
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
      AV49ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV22ColumnsSelector);
      AV86LoadGridData = GXutil.strtobool( httpContext.GetPar( "LoadGridData")) ;
      AV95Pgmname = httpContext.GetPar( "Pgmname") ;
      AV36FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV29Emprcod = httpContext.GetPar( "Emprcod") ;
      AV9BarCodIN = (int)(GXutil.lval( httpContext.GetPar( "BarCodIN"))) ;
      AV13BarCodReoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoIN"))) ;
      AV11BarCodParIN = httpContext.GetPar( "BarCodParIN") ;
      AV89inicio = localUtil.parseDTimeParm( httpContext.GetPar( "inicio")) ;
      AV90fin = localUtil.parseDTimeParm( httpContext.GetPar( "fin")) ;
      AV56RecAcab = httpContext.GetPar( "RecAcab") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV57RecetadeTinte_Cierre_SDT);
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      AV21colorservicecontador = (short)(GXutil.lval( httpContext.GetPar( "colorservicecontador"))) ;
      AV19clienteModa21 = (short)(GXutil.lval( httpContext.GetPar( "clienteModa21"))) ;
      AV73SiCSV = (short)(GXutil.lval( httpContext.GetPar( "SiCSV"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
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
      pa28Z2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start28Z2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.recetadetintecierrewwp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV56RecAcab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIENTEMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73SiCSV), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinteCierreWwp");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\recetadetintecierrewwp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Recetadetinte_cierre_sdt", AV57RecetadeTinte_Cierre_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Recetadetinte_cierre_sdt", AV57RecetadeTinte_Cierre_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_150", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_150, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV39GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV40GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV27DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV22ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV49ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV86LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINICIO", localUtil.ttoc( AV89inicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIN", localUtil.ttoc( AV90fin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECACAB", GXutil.rtrim( AV56RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV56RecAcab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vRECETADETINTE_CIERRE_SDT", AV57RecetadeTinte_Cierre_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vRECETADETINTE_CIERRE_SDT", AV57RecetadeTinte_Cierre_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV41GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV41GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLORSERVICECONTADOR", GXutil.ltrim( localUtil.ntoc( AV21colorservicecontador, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIENTEMODA21", GXutil.ltrim( localUtil.ntoc( AV19clienteModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIENTEMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV71UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV66Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECCIETIN", localUtil.dtoc( AV34FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV25Consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCC_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV18Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV37FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFEC", localUtil.dtoc( AV60Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECHAYANY", GXutil.rtrim( AV74RecHayAny));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODUCTOSCONSUMOS", AV54productosconsumos);
      app.GxWebStd.gx_hidden_field( httpContext, "vJ", GXutil.ltrim( localUtil.ntoc( AV47j, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSICSV", GXutil.ltrim( localUtil.ntoc( AV73SiCSV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73SiCSV), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECETADETINTE_CIERRE_SDT_JSON", AV59RecetadeTinte_Cierre_SDT_json);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_NUMEROREGISTROS_Iteminternalname", GXutil.rtrim( Popover_numeroregistros_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_NUMEROREGISTROS_Trigger", GXutil.rtrim( Popover_numeroregistros_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_NUMEROREGISTROS_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_numeroregistros_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_NUMEROREGISTROS_Position", GXutil.rtrim( Popover_numeroregistros_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Title", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result", GXutil.rtrim( Dvelop_confirmpanel_anyadirproductos_Result));
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
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
         we28Z2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt28Z2( ) ;
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
      return formatLink("app.formulaciontinte.recetadetintecierrewwp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.RecetadeTinteCierreWwp" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Receta de Tinte Cierre ", "") ;
   }

   public void wb28Z0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHrefectin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHrefectin_Internalname, httpContext.getMessage( "Fecha Cierre", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHrefectin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHrefectin_Internalname, localUtil.format(AV78HreFecTin, "99/99/99"), localUtil.format( AV78HreFecTin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHrefectin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHrefectin_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHrefectin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHrefectin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodin_Internalname, httpContext.getMessage( "Nº HDR", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodin_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCodIN, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCodIN), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCodIN), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreoin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoin_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoin_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarCodReoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReoIN), "9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReoIN), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparin_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparin_Internalname, GXutil.rtrim( AV11BarCodParIN), GXutil.rtrim( localUtil.format( AV11BarCodParIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechacierre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechacierre_Internalname, httpContext.getMessage( "Fecha Alta Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechacierre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechacierre_Internalname, localUtil.format(AV35FechaCierre, "99/99/99"), localUtil.format( AV35FechaCierre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechacierre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechacierre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechacierre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechacierre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechacierrehasta_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechacierrehasta_Internalname, httpContext.getMessage( "Fecha Alta Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFechacierrehasta_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechacierrehasta_Internalname, localUtil.format(AV75FechaCierreHasta, "99/99/99"), localUtil.format( AV75FechaCierreHasta, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechacierrehasta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechacierrehasta_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFechacierrehasta_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFechacierrehasta_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsearch_Internalname, "gx.evt.setGridEvt("+GXutil.str( 150, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver resultado", ""), bttBtnsearch_Jsonclick, 5, httpContext.getMessage( "GX_BtnSearch", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSEARCH\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 150, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1128z1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop30", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTxtmensaje_Internalname, lblTxtmensaje_Caption, "", "", lblTxtmensaje_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV95Pgmname), GXutil.rtrim( localUtil.format( AV95Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablec_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "HDRs pendientes de Cierre", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab02") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divResultadocontainer_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divResultadoaction_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 150, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 150, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 150, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_105_28Z2( true) ;
      }
      else
      {
         wb_table1_105_28Z2( false) ;
      }
      return  ;
   }

   public void wb_table1_105_28Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittednumeroregistros_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocknumeroregistros_Internalname, httpContext.getMessage( "Nº Registros", ""), "", "", lblTextblocknumeroregistros_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_127_28Z2( true) ;
      }
      else
      {
         wb_table2_127_28Z2( false) ;
      }
      return  ;
   }

   public void wb_table2_127_28Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divResultadogrid_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 150, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCellCellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol150( ) ;
      }
      if ( wbEnd == 150 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_150 = (int)(nGXsfl_150_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV96GXV1 = nGXsfl_150_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV39GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV40GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0187"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0187"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_150_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0187"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         ucPopover_numeroregistros.setProperty("Trigger", Popover_numeroregistros_Trigger);
         ucPopover_numeroregistros.setProperty("PopoverWidth", Popover_numeroregistros_Popoverwidth);
         ucPopover_numeroregistros.setProperty("Position", Popover_numeroregistros_Position);
         ucPopover_numeroregistros.render(context, "dvelop.wwppopover", Popover_numeroregistros_Internalname, "POPOVER_NUMEROREGISTROSContainer");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV27DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV27DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV22ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table3_194_28Z2( true) ;
      }
      else
      {
         wb_table3_194_28Z2( false) ;
      }
      return  ;
   }

   public void wb_table3_194_28Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_199_28Z2( true) ;
      }
      else
      {
         wb_table4_199_28Z2( false) ;
      }
      return  ;
   }

   public void wb_table4_199_28Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0207"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0207"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_150_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0207"+"");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 150 )
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
               AV96GXV1 = nGXsfl_150_idx ;
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

   public void start28Z2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Receta de Tinte Cierre ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup28Z0( ) ;
   }

   public void ws28Z2( )
   {
      start28Z2( ) ;
      evt28Z2( ) ;
   }

   public void evt28Z2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1228Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1328Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1428Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1528Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1628Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1728Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSEARCH'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSearch' */
                           e1828Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e1928Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e2028Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e2128Z2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2228Z2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'DORESULTADOS'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 41), "RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VGRUPODEACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 43), "RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "VDETAILWEBCOMPONENT.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 41), "RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK") == 0 ) )
                        {
                           nGXsfl_150_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1502( ) ;
                           AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && ( AV96GXV1 > 0 ) )
                           {
                              AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
                              cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                              cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                              AV43grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43grupodeacciones), 4, 0));
                              AV28DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV28DetailWebComponent);
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
                                 e2328Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2428Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2528Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2628Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VDETAILWEBCOMPONENT.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2728Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoResultados' */
                                 e2828Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2928Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e3028Z2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e3128Z2 ();
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
                     if ( nCmpId == 187 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0187") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0187", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                     else if ( nCmpId == 207 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0207") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0207", "", sEvt);
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

   public void we28Z2( )
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

   public void pa28Z2( )
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
            GX_FocusControl = edtavHrefectin_Internalname ;
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
      subsflControlProps_1502( ) ;
      while ( nGXsfl_150_idx <= nRC_GXsfl_150 )
      {
         sendrow_1502( ) ;
         nGXsfl_150_idx = ((subGrid_Islastpage==1)&&(nGXsfl_150_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_150_idx+1) ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1502( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV49ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ,
                                 boolean AV86LoadGridData ,
                                 String AV95Pgmname ,
                                 String AV36FilterFullText ,
                                 String AV29Emprcod ,
                                 int AV9BarCodIN ,
                                 byte AV13BarCodReoIN ,
                                 String AV11BarCodParIN ,
                                 java.util.Date AV89inicio ,
                                 java.util.Date AV90fin ,
                                 String AV56RecAcab ,
                                 GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item> AV57RecetadeTinte_Cierre_SDT ,
                                 java.util.Date Gx_date ,
                                 short AV21colorservicecontador ,
                                 short AV19clienteModa21 ,
                                 short AV73SiCSV )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2428Z2 ();
      GRID_nCurrentRecord = 0 ;
      rf28Z2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinteCierreWwp");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\recetadetintecierrewwp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf28Z2( ) ;
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
      AV95Pgmname = "FormulacionTinte.RecetadeTinteCierreWwp" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavNumeroregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNumeroregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumeroregistros_Enabled), 5, 0), true);
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__pesado.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__adicion.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rechayany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rechayany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rechayany_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__incidencias_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barsit_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__baragrest_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barser_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnomcli_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumcli_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__maqcod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recvolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recvolprd_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recfecalt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recfecalt_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumany_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__lconti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__lconti_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__hisreh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__hisreh_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__batchcode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__batchcode_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__weigprodid_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__colorservicedatos.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
   }

   public void rf28Z2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(150) ;
      /* Execute user event: Refresh */
      e2428Z2 ();
      nGXsfl_150_idx = 1 ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1502( ) ;
      bGXsfl_150_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
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
         subsflControlProps_1502( ) ;
         e2528Z2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_150_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2528Z2 ();
         }
         wbEnd = (short)(150) ;
         wb28Z0( ) ;
      }
      bGXsfl_150_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28Z2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vRECACAB", GXutil.rtrim( AV56RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV56RecAcab, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLORSERVICECONTADOR", GXutil.ltrim( localUtil.ntoc( AV21colorservicecontador, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21colorservicecontador), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIENTEMODA21", GXutil.ltrim( localUtil.ntoc( AV19clienteModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIENTEMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19clienteModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSICSV", GXutil.ltrim( localUtil.ntoc( AV73SiCSV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73SiCSV), "ZZZ9")));
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
      return AV57RecetadeTinte_Cierre_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV95Pgmname = "FormulacionTinte.RecetadeTinteCierreWwp" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavNumeroregistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNumeroregistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNumeroregistros_Enabled), 5, 0), true);
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__pesado.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__adicion.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rechayany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rechayany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rechayany_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__incidencias_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barsit_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__baragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__baragrest_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barser_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnomcli_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumcli_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__maqcod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recvolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recvolprd_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recfecalt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recfecalt_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumany_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__lconti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__lconti_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__hisreh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__hisreh_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__batchcode_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__batchcode_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__weigprodid_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__colorservicedatos.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getEnabled(), 5, 0), !bGXsfl_150_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup28Z0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2328Z2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Recetadetinte_cierre_sdt"), AV57RecetadeTinte_Cierre_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV48ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV27DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV22ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vRECETADETINTE_CIERRE_SDT"), AV57RecetadeTinte_Cierre_SDT);
         /* Read saved values. */
         nRC_GXsfl_150 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_150"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV40GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV90fin = localUtil.ctot( httpContext.cgiGet( "vFIN"), 0) ;
         AV89inicio = localUtil.ctot( httpContext.cgiGet( "vINICIO"), 0) ;
         AV29Emprcod = httpContext.cgiGet( "vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
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
         Popover_numeroregistros_Iteminternalname = httpContext.cgiGet( "POPOVER_NUMEROREGISTROS_Iteminternalname") ;
         Popover_numeroregistros_Trigger = httpContext.cgiGet( "POPOVER_NUMEROREGISTROS_Trigger") ;
         Popover_numeroregistros_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_NUMEROREGISTROS_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_numeroregistros_Position = httpContext.cgiGet( "POPOVER_NUMEROREGISTROS_Position") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_anyadirproductos_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Title") ;
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmationtext") ;
         Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_anyadirproductos_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_anyadirproductos_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS_Result") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_150 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_150"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_150_fel_idx = 0 ;
         while ( nGXsfl_150_fel_idx < nRC_GXsfl_150 )
         {
            nGXsfl_150_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_150_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_150_fel_idx+1) ;
            sGXsfl_150_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_1502( ) ;
            AV96GXV1 = (int)(nGXsfl_150_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && ( AV96GXV1 > 0 ) )
            {
               AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
               cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
               cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
               AV43grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
               AV28DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            }
         }
         if ( nGXsfl_150_fel_idx == 0 )
         {
            nGXsfl_150_idx = 1 ;
            sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_1502( ) ;
         }
         nGXsfl_150_fel_idx = 1 ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHrefectin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHREFECTIN");
            GX_FocusControl = edtavHrefectin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78HreFecTin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78HreFecTin", localUtil.format(AV78HreFecTin, "99/99/99"));
         }
         else
         {
            AV78HreFecTin = localUtil.ctod( httpContext.cgiGet( edtavHrefectin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78HreFecTin", localUtil.format(AV78HreFecTin, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODIN");
            GX_FocusControl = edtavBarcodin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarCodIN = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCodIN), 8, 0));
         }
         else
         {
            AV9BarCodIN = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCodIN), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOIN");
            GX_FocusControl = edtavBarcodreoin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarCodReoIN = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodReoIN", GXutil.str( AV13BarCodReoIN, 1, 0));
         }
         else
         {
            AV13BarCodReoIN = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodReoIN", GXutil.str( AV13BarCodReoIN, 1, 0));
         }
         AV11BarCodParIN = httpContext.cgiGet( edtavBarcodparin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodParIN", AV11BarCodParIN);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechacierre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHACIERRE");
            GX_FocusControl = edtavFechacierre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35FechaCierre = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35FechaCierre", localUtil.format(AV35FechaCierre, "99/99/99"));
         }
         else
         {
            AV35FechaCierre = localUtil.ctod( httpContext.cgiGet( edtavFechacierre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35FechaCierre", localUtil.format(AV35FechaCierre, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFechacierrehasta_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHACIERREHASTA");
            GX_FocusControl = edtavFechacierrehasta_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75FechaCierreHasta = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75FechaCierreHasta", localUtil.format(AV75FechaCierreHasta, "99/99/99"));
         }
         else
         {
            AV75FechaCierreHasta = localUtil.ctod( httpContext.cgiGet( edtavFechacierrehasta_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75FechaCierreHasta", localUtil.format(AV75FechaCierreHasta, "99/99/99"));
         }
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
         AV36FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36FilterFullText", AV36FilterFullText);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUMEROREGISTROS");
            GX_FocusControl = edtavNumeroregistros_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52Numeroregistros = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Numeroregistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Numeroregistros), 12, 0));
         }
         else
         {
            AV52Numeroregistros = localUtil.ctol( httpContext.cgiGet( edtavNumeroregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Numeroregistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Numeroregistros), 12, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_150_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1502( ) ;
         AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_150_idx > 0 )
         {
            AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && ( AV96GXV1 > 0 ) )
            {
               AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
               cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
               cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
               AV43grupodeacciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43grupodeacciones), 4, 0));
               AV28DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV28DetailWebComponent);
            }
            if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
            {
               AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinteCierreWwp");
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\recetadetintecierrewwp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2328Z2 ();
      if (returnInSub) return;
   }

   public void e2328Z2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV66Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetintecierrewwp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Station", AV66Station);
      GXv_char2[0] = AV29Emprcod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char4[0] = AV71UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV66Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetintecierrewwp_impl.this.AV29Emprcod = GXv_char2[0] ;
      recetadetintecierrewwp_impl.this.AV31EmprNom = GXv_char3[0] ;
      recetadetintecierrewwp_impl.this.AV71UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Emprcod", AV29Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV71UsurCod", AV71UsurCod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      Popover_numeroregistros_Iteminternalname = edtavNumeroregistros_Internalname ;
      ucPopover_numeroregistros.sendProperty(context, "", false, Popover_numeroregistros_Internalname, "ItemInternalName", Popover_numeroregistros_Iteminternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      if ( GXutil.strcmp(AV44HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Receta de Tinte Cierre ", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV27DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV27DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV19clienteModa21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      recetadetintecierrewwp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV19clienteModa21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19clienteModa21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19clienteModa21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIENTEMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV19clienteModa21), "ZZZ9")));
      GXt_int7 = (byte)(AV21colorservicecontador) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "CSTXP", ""), GXv_int8) ;
      recetadetintecierrewwp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV21colorservicecontador = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21colorservicecontador", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21colorservicecontador), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLORSERVICECONTADOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21colorservicecontador), "ZZZ9")));
      GXt_int9 = AV26ContVal ;
      GXv_char4[0] = AV29Emprcod ;
      GXv_char3[0] = "011100" ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
      recetadetintecierrewwp_impl.this.AV29Emprcod = GXv_char4[0] ;
      recetadetintecierrewwp_impl.this.GXt_int9 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Emprcod", AV29Emprcod);
      AV26ContVal = GXt_int9 ;
      AV25Consumos = (short)(((AV26ContVal==1) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Consumos), 4, 0));
      GXt_int7 = (byte)(AV73SiCSV) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "SICSV", ""), GXv_int8) ;
      recetadetintecierrewwp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV73SiCSV = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73SiCSV", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73SiCSV), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSICSV", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73SiCSV), "ZZZ9")));
      GXt_int7 = AV77SiFecha ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV29Emprcod, httpContext.getMessage( "SIFCTI", ""), GXv_int8) ;
      recetadetintecierrewwp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV77SiFecha = GXt_int7 ;
      edtavHrefectin_Enabled = AV77SiFecha ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHrefectin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrefectin_Enabled), 5, 0), true);
      AV35FechaCierre = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35FechaCierre", localUtil.format(AV35FechaCierre, "99/99/99"));
      AV75FechaCierreHasta = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75FechaCierreHasta", localUtil.format(AV75FechaCierreHasta, "99/99/99"));
      AV78HreFecTin = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78HreFecTin", localUtil.format(AV78HreFecTin, "99/99/99"));
      AV56RecAcab = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56RecAcab", AV56RecAcab);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV56RecAcab, ""))));
      AV89inicio = GXutil.resetTime( AV35FechaCierre );
      httpContext.ajax_rsp_assign_attri("", false, "AV89inicio", localUtil.ttoc( AV89inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV90fin = GXutil.resetTime( GXutil.dadd( AV78HreFecTin , + ( 1 )) );
      httpContext.ajax_rsp_assign_attri("", false, "AV90fin", localUtil.ttoc( AV90fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   public void e2428Z2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV72WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV72WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV49ManageFiltersExecutionStep == 1 )
      {
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV49ManageFiltersExecutionStep == 2 )
      {
         AV49ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV65Session.getValue("FormulacionTinte.RecetadeTinteCierreWwpColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV65Session.getValue("FormulacionTinte.RecetadeTinteCierreWwpColumnsSelector") ;
         AV22ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      chkavRecetadetinte_cierre_sdt__seleccionar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(), "Visible", GXutil.ltrimstr( chkavRecetadetinte_cierre_sdt__seleccionar.getVisible(), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__pesado.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__pesado.getVisible(), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__adicion.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__adicion.getVisible(), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rechayany_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rechayany_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rechayany_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__incidencias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__incidencias_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcod_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodreo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodreo_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodpar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcodpar_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__reclinmaq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__reclinmaq_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barsit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barsit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barsit_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__baragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__baragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__baragrest_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barser_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barserdsc_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnom_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barcolnum_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__bartipcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__bartipcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__bartipcol_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnomcli_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumcli_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__maqcod_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rectotkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__rectotkgm_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recvolprd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recvolprd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recvolprd_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recfecalt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recfecalt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__recfecalt_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumany_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumany_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__barnumany_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__lconti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__lconti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__lconti_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__hisreh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__hisreh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__hisreh_Visible), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__batchcode_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__batchcode_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__batchcode_Visible), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__recnropar.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__recnropar.getVisible(), 5, 0), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecetadetinte_cierre_sdt__weigprodid_Visible), 5, 0), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV22ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__colorservicedatos.getInternalname(), "Visible", GXutil.ltrimstr( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getVisible(), 5, 0), !bGXsfl_150_Refreshing);
      Gridpaginationbar_Emptygridcaption = (AV86LoadGridData ? httpContext.getMessage( "WWP_PagingEmptyGridCaption", "") : httpContext.getMessage( "WWP_PressSearchToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV39GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridCurrentPage), 10, 0));
      AV40GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridPageCount), 10, 0));
      cmbavGrupodeacciones.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Columnheaderclass", cmbavGrupodeacciones.getColumnHeaderClass(), !bGXsfl_150_Refreshing);
      chkavRecetadetinte_cierre_sdt__seleccionar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(), "Columnheaderclass", chkavRecetadetinte_cierre_sdt__seleccionar.getColumnHeaderClass(), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__pesado.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Columnheaderclass", cmbavRecetadetinte_cierre_sdt__pesado.getColumnHeaderClass(), !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__adicion.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Columnheaderclass", cmbavRecetadetinte_cierre_sdt__adicion.getColumnHeaderClass(), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rechayany_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rechayany_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__rechayany_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__incidencias_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavDetailwebcomponent_Columnheaderclass = "WWIconActionColumn WCD_ActionColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Columnheaderclass", edtavDetailwebcomponent_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcod_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodreo_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodreo_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barcodreo_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcodpar_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcodpar_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barcodpar_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__reclinmaq_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__reclinmaq_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barsit_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barsit_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barsit_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__baragrest_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__baragrest_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__baragrest_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barser_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barser_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barser_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barserdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barserdsc_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barserdsc_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnom_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barcolnom_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barcolnum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barcolnum_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barcolnum_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__bartipcol_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__bartipcol_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__bartipcol_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnomcli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnomcli_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barnomcli_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumcli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumcli_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barnumcli_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__maqcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__maqcod_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__maqcod_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__rectotkgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__rectotkgm_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recvolprd_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recvolprd_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__recvolprd_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__recfecalt_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__recfecalt_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__recfecalt_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__barnumany_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__barnumany_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__barnumany_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__lconti_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__lconti_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__lconti_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__hisreh_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__hisreh_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__hisreh_Columnheaderclass, !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__batchcode_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__batchcode_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__batchcode_Columnheaderclass, !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__recnropar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Columnheaderclass", cmbavRecetadetinte_cierre_sdt__recnropar.getColumnHeaderClass(), !bGXsfl_150_Refreshing);
      edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecetadetinte_cierre_sdt__weigprodid_Internalname, "Columnheaderclass", edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass, !bGXsfl_150_Refreshing);
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__colorservicedatos.getInternalname(), "Columnheaderclass", cmbavRecetadetinte_cierre_sdt__colorservicedatos.getColumnHeaderClass(), !bGXsfl_150_Refreshing);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
   }

   public void e1828Z2( )
   {
      /* 'DoSearch' Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78HreFecTin)) )
      {
         lblTxtmensaje_Caption = httpContext.getMessage( "NO hay fecha de Cierre", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
         GX_FocusControl = edtavHrefectin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.resetTime(AV78HreFecTin).after( GXutil.resetTime( GXutil.today( ) )) )
         {
            lblTxtmensaje_Caption = httpContext.getMessage( "La fecha de Cierre ", "")+localUtil.format( AV78HreFecTin, "99/99/99")+httpContext.getMessage( " es superior al dia actual ", "")+localUtil.format( Gx_date, "99/99/99") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
            GX_FocusControl = edtavHrefectin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV86LoadGridData = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86LoadGridData", AV86LoadGridData);
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
      if ( gx_BV150 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
         nGXsfl_150_bak_idx = nGXsfl_150_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
         nGXsfl_150_idx = nGXsfl_150_bak_idx ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1502( ) ;
      }
   }

   public void e1328Z2( )
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
         AV53PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV53PageToGo) ;
      }
   }

   public void e1428Z2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2528Z2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV57RecetadeTinte_Cierre_SDT.size() )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
         cmbavGrupodeacciones.removeAllItems();
         cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGrupodeacciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Añadir Productos (Formato I)", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGrupodeacciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Numero de Añadidas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         AV28DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV28DetailWebComponent);
         if ( ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar() == 999999 ) && ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos() == 1 ) )
         {
            cmbavGrupodeacciones.setColumnClass( "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" );
            chkavRecetadetinte_cierre_sdt__seleccionar.setColumnClass( "WWColumn WWColumnDanger" );
            cmbavRecetadetinte_cierre_sdt__pesado.setColumnClass( "WWColumn WWColumnDanger" );
            cmbavRecetadetinte_cierre_sdt__adicion.setColumnClass( "WWColumn WWColumnDanger" );
            edtavRecetadetinte_cierre_sdt__rechayany_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__incidencias_Columnclass = "WWColumn WWColumnDanger" ;
            edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barcod_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barcodreo_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barcodpar_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__reclinmaq_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barsit_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__baragrest_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barser_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barserdsc_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barcolnom_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barcolnum_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__bartipcol_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barnomcli_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barnumcli_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__maqcod_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__rectotkgm_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__recvolprd_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__recfecalt_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__barnumany_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__lconti_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__hisreh_Columnclass = "WWColumn WWColumnDanger" ;
            edtavRecetadetinte_cierre_sdt__batchcode_Columnclass = "WWColumn WWColumnDanger" ;
            cmbavRecetadetinte_cierre_sdt__recnropar.setColumnClass( "WWColumn WWColumnDanger" );
            edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass = "WWColumn WWColumnDanger" ;
            cmbavRecetadetinte_cierre_sdt__colorservicedatos.setColumnClass( "WWColumn WWColumnDanger" );
         }
         else
         {
            cmbavGrupodeacciones.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
            chkavRecetadetinte_cierre_sdt__seleccionar.setColumnClass( httpContext.getMessage( "WWColumn", "") );
            cmbavRecetadetinte_cierre_sdt__pesado.setColumnClass( httpContext.getMessage( "WWColumn", "") );
            cmbavRecetadetinte_cierre_sdt__adicion.setColumnClass( httpContext.getMessage( "WWColumn", "") );
            edtavRecetadetinte_cierre_sdt__rechayany_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__incidencias_Columnclass = ((((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias()>0) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") ;
            edtavDetailwebcomponent_Columnclass = httpContext.getMessage( "WWIconActionColumn WCD_ActionColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barcod_Columnclass = ((((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos()==1) ? "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" : "WWColumn") ;
            edtavRecetadetinte_cierre_sdt__barcodreo_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barcodpar_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__reclinmaq_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barsit_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__baragrest_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barser_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barserdsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barcolnom_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barcolnum_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__bartipcol_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barnomcli_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barnumcli_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__maqcod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__rectotkgm_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__recvolprd_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__recfecalt_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__barnumany_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__lconti_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__hisreh_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            edtavRecetadetinte_cierre_sdt__batchcode_Columnclass = httpContext.getMessage( "WWColumn", "") ;
            cmbavRecetadetinte_cierre_sdt__recnropar.setColumnClass( httpContext.getMessage( "WWColumn", "") );
            edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass = ((((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos()==1) ? "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" : "WWColumn") ;
            cmbavRecetadetinte_cierre_sdt__colorservicedatos.setColumnClass( httpContext.getMessage( "WWColumn", "") );
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(150) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_1502( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_150_Refreshing )
         {
            httpContext.doAjaxLoad(150, GridRow);
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV43grupodeacciones, 4, 0)) );
   }

   public void e1528Z2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV22ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinteCierreWwpColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV22ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
      if ( gx_BV150 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
         nGXsfl_150_bak_idx = nGXsfl_150_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
         nGXsfl_150_idx = nGXsfl_150_bak_idx ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1502( ) ;
      }
   }

   public void e1228Z2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinteCierreWwpFilters")),GXutil.URLEncode(GXutil.rtrim(AV95Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.RecetadeTinteCierreWwpFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV50ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinteCierreWwpFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         recetadetintecierrewwp_impl.this.GXt_char1 = GXv_char4[0] ;
         AV50ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV50ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV50ManageFiltersXml) ;
            AV41GridState.fromxml(AV50ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            AV86LoadGridData = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86LoadGridData", AV86LoadGridData);
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      if ( gx_BV150 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
         nGXsfl_150_bak_idx = nGXsfl_150_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
         nGXsfl_150_idx = nGXsfl_150_bak_idx ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1502( ) ;
      }
   }

   public void e2628Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* Grupodeacciones_Click Routine */
      returnInSub = false ;
      if ( AV43grupodeacciones == 1 )
      {
         /* Execute user subroutine: 'DO ANYADIRPRODUCTOS' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV43grupodeacciones == 2 )
      {
         /* Execute user subroutine: 'DO NUMERODEANYADIDAS' */
         S192 ();
         if (returnInSub) return;
      }
      AV43grupodeacciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43grupodeacciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV43grupodeacciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
      nGXsfl_150_bak_idx = nGXsfl_150_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
      nGXsfl_150_idx = nGXsfl_150_bak_idx ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1502( ) ;
   }

   public void e1628Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* Dvelop_confirmpanel_anyadirproductos_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_anyadirproductos_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ANYADIRPRODUCTOS' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV55ProgressIndicator", AV55ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
      nGXsfl_150_bak_idx = nGXsfl_150_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
      nGXsfl_150_idx = nGXsfl_150_bak_idx ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1502( ) ;
   }

   public void e1928Z2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      lblTxtmensaje_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78HreFecTin)) )
      {
         lblTxtmensaje_Caption = httpContext.getMessage( "NO hay fecha de Cierre", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
         GX_FocusControl = edtavHrefectin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.resetTime(AV78HreFecTin).after( GXutil.resetTime( GXutil.today( ) )) )
         {
            lblTxtmensaje_Caption = httpContext.getMessage( "La fecha de Cierre ", "")+localUtil.format( AV78HreFecTin, "99/99/99")+httpContext.getMessage( " es superior al dia actual ", "")+localUtil.format( Gx_date, "99/99/99") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTxtmensaje_Internalname, "Caption", lblTxtmensaje_Caption, true);
            GX_FocusControl = edtavHrefectin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.getMessage( "Confirma el Cierre con Fecha =", "")+GXutil.trim( localUtil.dtoc( AV78HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"?" ;
            ucDvelop_confirmpanel_confirmar.sendProperty(context, "", false, Dvelop_confirmpanel_confirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1728Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV55ProgressIndicator", AV55ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
      nGXsfl_150_bak_idx = nGXsfl_150_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
      nGXsfl_150_idx = nGXsfl_150_bak_idx ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1502( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ColumnsSelector", AV22ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
   }

   public void e2028Z2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV5websession.setValue(httpContext.getMessage( "&RecetadeTinte_Cierre_SDT_json", ""), AV59RecetadeTinte_Cierre_SDT_json);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXv_char4[0] = AV33ExcelFilename ;
      GXv_char3[0] = AV32ErrorMessage ;
      new app.formulaciontinte.recetadetintecierrewwpexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      recetadetintecierrewwp_impl.this.AV33ExcelFilename = GXv_char4[0] ;
      recetadetintecierrewwp_impl.this.AV32ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV33ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV33ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV32ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
   }

   public void e2128Z2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV5websession.setValue(httpContext.getMessage( "&RecetadeTinte_Cierre_SDT_json", ""), AV59RecetadeTinte_Cierre_SDT_json);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.formulaciontinte.recetadetintecierrewwpexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
   }

   public void e2728Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* Detailwebcomponent_Click Routine */
      returnInSub = false ;
      AV16BatchCode = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode() ;
      AV8BarCod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV12BarCodReo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV10BarCodPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV61reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Grid_dwc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Grid_dwc_Component), GXutil.lower( "FormulacionTinte.ConsumosColorService_WC")) != 0 )
      {
         WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.consumoscolorservice_wc_impl", remoteHandle, context);
         WebComp_Grid_dwc_Component = "FormulacionTinte.ConsumosColorService_WC" ;
      }
      if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
      {
         WebComp_Grid_dwc.setjustcreated();
         WebComp_Grid_dwc.componentprepare(new Object[] {"W0187","",AV16BatchCode,AV29Emprcod,Integer.valueOf(AV8BarCod),Byte.valueOf(AV12BarCodReo),AV10BarCodPar,Short.valueOf(AV61reclinmaq)});
         WebComp_Grid_dwc.componentbind(new Object[] {"","","","","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Grid_dwc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0187"+"");
         WebComp_Grid_dwc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      GXt_char1 = AV59RecetadeTinte_Cierre_SDT_json ;
      GXv_char4[0] = GXt_char1 ;
      new app.formulaciontinte.recetadetinte_cierre_prc(remoteHandle, context).execute( AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, GXv_char4) ;
      recetadetintecierrewwp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV59RecetadeTinte_Cierre_SDT_json = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59RecetadeTinte_Cierre_SDT_json", AV59RecetadeTinte_Cierre_SDT_json);
      AV57RecetadeTinte_Cierre_SDT.fromJSonString(AV59RecetadeTinte_Cierre_SDT_json, null);
      gx_BV150 = true ;
      AV52Numeroregistros = AV57RecetadeTinte_Cierre_SDT.size() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Numeroregistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Numeroregistros), 12, 0));
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV22ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Seleccionar", "", "Op", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Pesado", "", "P?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Adicion", "", "Ad?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__RecHayAny", "", "PesAut?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Incidencias", "", "Err", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barcod", "", "Nº Hdr", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barcodreo", "", "R", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barcodpar", "", "P", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__RecLinMaq", "", "#", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__BarSit", "", "Sit.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__BarAgrEst", "", "A?", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barser", "", "Articulo", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barserdsc", "", "Descripcion", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barcolnom", "", "Color", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barcolnum", "", "Numero", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Bartipcol", "", "TC", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barnomcli", "", "Color Cliente", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Barnumcli", "", "Numero ", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Maqcod", "", "Maquina", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Rectotkgm", "", "Kilos Tot.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__RecVolprd", "", "Volumen", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__RecFecAlt", "", "Fech. Alta", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__BarNumAny", "", "Nº Añad.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Lconti", "", "Lconti", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Hisreh", "", "Hisreh", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__BatchCode", "Color Service", "Batch Code", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__RecNroPar", "Color Service", "Os Act.", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__WeigProdID", "Color Service", "ID", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV22ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "RecetadeTinte_Cierre_SDT__Colorservicedatos", "Color Service", "Ok", true, "") ;
      AV22ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV70UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinteCierreWwpColumnsSelector", GXv_char4) ;
      recetadetintecierrewwp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV70UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV70UserCustomValue)==0) ) )
      {
         AV23ColumnsSelectorAux.fromxml(AV70UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV23ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV22ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV23ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV22ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV48ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinteCierreWwpFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV48ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV36FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36FilterFullText", AV36FilterFullText);
      AV86LoadGridData = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86LoadGridData", AV86LoadGridData);
   }

   public void S182( )
   {
      /* 'DO ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      AV20Colorservice = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos() ;
      AV62RecNroPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar() ;
      if ( ( AV21colorservicecontador == 1 ) && ( AV20Colorservice == 1 ) && ( AV62RecNroPar == 0 ) )
      {
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.getMessage( "Atenção, este O.S. contém consumos de ColorService. Se continuarmos, o programa atualizará os consumos ColorService no O.S.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, "", false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = Dvelop_confirmpanel_anyadirproductos_Confirmationtext+httpContext.getMessage( "Confirme?", "") ;
         ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, "", false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
      }
      else
      {
         Dvelop_confirmpanel_anyadirproductos_Confirmationtext = httpContext.getMessage( "Confirma?", "") ;
         ucDvelop_confirmpanel_anyadirproductos.sendProperty(context, "", false, Dvelop_confirmpanel_anyadirproductos_Internalname, "ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
      }
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer", "Confirm", "", new Object[] {});
   }

   public void S202( )
   {
      /* 'DO ACTION ANYADIRPRODUCTOS' Routine */
      returnInSub = false ;
      AV20Colorservice = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos() ;
      AV62RecNroPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar() ;
      AV8BarCod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV12BarCodReo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV10BarCodPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV61reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      AV16BatchCode = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode() ;
      AV51MaqCod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod() ;
      AV63RecTotKgm = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm() ;
      AV64RecVolPrd = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd() ;
      AV14barnhdr = GXutil.trim( GXutil.str( AV8BarCod, 8, 0)) + "-" + GXutil.str( AV12BarCodReo, 1, 0) + AV10BarCodPar ;
      AV74RecHayAny = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74RecHayAny", AV74RecHayAny);
      if ( ( AV21colorservicecontador == 1 ) && ( AV20Colorservice == 1 ) && ( AV62RecNroPar == 0 ) && ( AV19clienteModa21 == 1 ) )
      {
         AV55ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
         AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Preparando datos ... ", ""));
         AV55ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciamos Color Service ... ", ""));
         GXv_char4[0] = AV45Inc_obs ;
         GXv_int8[0] = AV76RecNumAny ;
         GXv_objcol_SdtMessages_Message16[0] = AV91messages ;
         new app.formulaciontinte.colorserviceactualizaciondeconsumos(remoteHandle, context).execute( AV16BatchCode, AV29Emprcod, AV8BarCod, AV12BarCodReo, AV10BarCodPar, AV61reclinmaq, httpContext.getMessage( "N", ""), GXv_char4, GXv_int8, GXv_objcol_SdtMessages_Message16) ;
         recetadetintecierrewwp_impl.this.AV45Inc_obs = GXv_char4[0] ;
         recetadetintecierrewwp_impl.this.AV76RecNumAny = GXv_int8[0] ;
         AV91messages = GXv_objcol_SdtMessages_Message16[0] ;
         AV74RecHayAny = ((GXutil.strcmp(AV74RecHayAny, "S")!=0)&&(AV76RecNumAny>0) ? "S" : AV74RecHayAny) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74RecHayAny", AV74RecHayAny);
         AV45Inc_obs = "" ;
         AV127GXV31 = 1 ;
         while ( AV127GXV31 <= AV91messages.size() )
         {
            AV92message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV91messages.elementAt(-1+AV127GXV31));
            AV45Inc_obs = httpContext.getMessage( "RecetadeTinte_Cierre__WC ", "") + GXutil.rtrim( localUtil.format( AV92message.getgxTv_SdtMessages_Message_Id(), "")) ;
            AV45Inc_obs += "/" + AV92message.getgxTv_SdtMessages_Message_Description() ;
            new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV95Pgmname, AV71UsurCod, AV66Station, AV45Inc_obs, AV8BarCod, AV12BarCodReo, AV10BarCodPar) ;
            AV45Inc_obs = "" ;
            AV127GXV31 = (int)(AV127GXV31+1) ;
         }
         AV55ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-sucess", "") );
         AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
         AV55ProgressIndicator.hide();
         new app.pcommit(remoteHandle, context).execute( ) ;
      }
      httpContext.popup(formatLink("app.formulaciontinte.cierrerecetastinte_3_anyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV61reclinmaq,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34FecCieTin)),GXutil.URLEncode(GXutil.ltrimstr(AV25Consumos,4,0)),GXutil.URLEncode(GXutil.rtrim(AV51MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV18Cc_almcod,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV78HreFecTin)),GXutil.URLEncode(GXutil.ltrimstr(AV37FlagM,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV60Recfec)),GXutil.URLEncode(DecimalUtil.decToString(AV63RecTotKgm)),GXutil.URLEncode(GXutil.ltrimstr(AV64RecVolPrd,5,0)),GXutil.URLEncode(GXutil.rtrim(AV14barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV74RecHayAny))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","FecCieTin","consumos","Maqcod","Cc_almcod","fechaCierre","flagM","recfec","rectotkgm","recvolprd","barnhdr","HayAnyadidas"}) , new Object[] {"AV29Emprcod","AV8BarCod","AV12BarCodReo","AV10BarCodPar","AV61reclinmaq","AV34FecCieTin","AV25Consumos","AV51MaqCod","AV18Cc_almcod","AV78HreFecTin","AV37FlagM","AV60Recfec","AV63RecTotKgm","AV64RecVolPrd","AV14barnhdr","AV74RecHayAny"});
      gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
   }

   public void S192( )
   {
      /* 'DO NUMERODEANYADIDAS' Routine */
      returnInSub = false ;
      AV8BarCod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV12BarCodReo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV10BarCodPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV14barnhdr = GXutil.trim( GXutil.str( AV8BarCod, 8, 0)) + "-" + GXutil.str( AV12BarCodReo, 1, 0) + AV10BarCodPar ;
      AV61reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      AV15barnumany = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany() ;
      httpContext.popup(formatLink("app.formulaciontinte.cierrerecetastinte_numerodeanyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV14barnhdr)),GXutil.URLEncode(GXutil.ltrimstr(AV15barnumany,3,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarNHdr","BarNumAny"}) , new Object[] {});
      gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
   }

   public void S212( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV55ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Preparando datos ... ", ""));
      AV55ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciamos lectura ... ", ""));
      AV67t = (short)(0) ;
      AV128GXV32 = 1 ;
      while ( AV128GXV32 <= AV57RecetadeTinte_Cierre_SDT.size() )
      {
         AV58RecetadeTinte_Cierre_SDT_item = (app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV128GXV32));
         if ( AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar() )
         {
            AV16BatchCode = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode() ;
            AV8BarCod = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
            AV12BarCodReo = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
            AV10BarCodPar = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
            AV61reclinmaq = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
            AV20Colorservice = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos() ;
            AV15barnumany = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany() ;
            AV51MaqCod = AV58RecetadeTinte_Cierre_SDT_item.getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod() ;
            if ( AV20Colorservice == 1 )
            {
               AV45Inc_obs = httpContext.getMessage( "Go ColorServiceActualizaciondeConsumos", "") ;
               new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV95Pgmname, AV71UsurCod, AV66Station, AV45Inc_obs, AV8BarCod, AV12BarCodReo, AV10BarCodPar) ;
               GXv_char4[0] = AV45Inc_obs ;
               GXv_int8[0] = AV76RecNumAny ;
               GXv_objcol_SdtMessages_Message16[0] = AV91messages ;
               new app.formulaciontinte.colorserviceactualizaciondeconsumos(remoteHandle, context).execute( AV16BatchCode, AV29Emprcod, AV8BarCod, AV12BarCodReo, AV10BarCodPar, AV61reclinmaq, httpContext.getMessage( "N", ""), GXv_char4, GXv_int8, GXv_objcol_SdtMessages_Message16) ;
               recetadetintecierrewwp_impl.this.AV45Inc_obs = GXv_char4[0] ;
               recetadetintecierrewwp_impl.this.AV76RecNumAny = GXv_int8[0] ;
               AV91messages = GXv_objcol_SdtMessages_Message16[0] ;
               AV74RecHayAny = ((GXutil.strcmp(AV74RecHayAny, "S")!=0)&&(AV76RecNumAny>0) ? "S" : AV74RecHayAny) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV74RecHayAny", AV74RecHayAny);
               new app.pcommit(remoteHandle, context).execute( ) ;
               AV45Inc_obs = "" ;
               AV129GXV33 = 1 ;
               while ( AV129GXV33 <= AV91messages.size() )
               {
                  AV92message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV91messages.elementAt(-1+AV129GXV33));
                  AV45Inc_obs = httpContext.getMessage( "RecetadeTinte_Cierre__WC ", "") + GXutil.rtrim( localUtil.format( AV92message.getgxTv_SdtMessages_Message_Id(), "")) ;
                  AV45Inc_obs += "/" + AV92message.getgxTv_SdtMessages_Message_Description() ;
                  new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV95Pgmname, AV71UsurCod, AV66Station, AV45Inc_obs, AV8BarCod, AV12BarCodReo, AV10BarCodPar) ;
                  AV45Inc_obs = "" ;
                  AV129GXV33 = (int)(AV129GXV33+1) ;
               }
            }
            AV17Ca_diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
            AV45Inc_obs = httpContext.getMessage( "go PCLs999", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV95Pgmname, AV71UsurCod, AV66Station, AV45Inc_obs, AV8BarCod, AV12BarCodReo, AV10BarCodPar) ;
            GXv_char4[0] = AV29Emprcod ;
            GXv_int10[0] = AV8BarCod ;
            GXv_int8[0] = AV12BarCodReo ;
            GXv_char3[0] = AV10BarCodPar ;
            GXv_char2[0] = httpContext.getMessage( "A", "") ;
            GXv_int17[0] = (byte)(AV25Consumos) ;
            GXv_int18[0] = AV15barnumany ;
            GXv_int19[0] = AV61reclinmaq ;
            GXv_char20[0] = AV51MaqCod ;
            GXv_char21[0] = httpContext.getMessage( "M", "") ;
            GXv_char22[0] = httpContext.getMessage( "M", "") ;
            GXv_dtime23[0] = AV17Ca_diahora ;
            GXv_int24[0] = AV18Cc_almcod ;
            GXv_char25[0] = AV54productosconsumos ;
            GXv_int26[0] = AV47j ;
            GXv_char27[0] = AV71UsurCod ;
            GXv_char28[0] = AV66Station ;
            GXv_date29[0] = AV78HreFecTin ;
            new app.pcls999(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_char3, GXv_char2, GXv_int17, GXv_int18, GXv_int19, GXv_char20, GXv_char21, GXv_char22, GXv_dtime23, GXv_int24, GXv_char25, GXv_int26, GXv_char27, GXv_char28, GXv_date29) ;
            recetadetintecierrewwp_impl.this.AV29Emprcod = GXv_char4[0] ;
            recetadetintecierrewwp_impl.this.AV8BarCod = GXv_int10[0] ;
            recetadetintecierrewwp_impl.this.AV12BarCodReo = GXv_int8[0] ;
            recetadetintecierrewwp_impl.this.AV10BarCodPar = GXv_char3[0] ;
            recetadetintecierrewwp_impl.this.AV25Consumos = GXv_int17[0] ;
            recetadetintecierrewwp_impl.this.AV15barnumany = GXv_int18[0] ;
            recetadetintecierrewwp_impl.this.AV61reclinmaq = GXv_int19[0] ;
            recetadetintecierrewwp_impl.this.AV51MaqCod = GXv_char20[0] ;
            recetadetintecierrewwp_impl.this.AV17Ca_diahora = GXv_dtime23[0] ;
            recetadetintecierrewwp_impl.this.AV18Cc_almcod = GXv_int24[0] ;
            recetadetintecierrewwp_impl.this.AV54productosconsumos = GXv_char25[0] ;
            recetadetintecierrewwp_impl.this.AV47j = (short)((short)(GXv_int26[0])) ;
            recetadetintecierrewwp_impl.this.AV71UsurCod = GXv_char27[0] ;
            recetadetintecierrewwp_impl.this.AV66Station = GXv_char28[0] ;
            recetadetintecierrewwp_impl.this.AV78HreFecTin = GXv_date29[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Emprcod", AV29Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV25Consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Consumos), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV18Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Cc_almcod), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV54productosconsumos", AV54productosconsumos);
            httpContext.ajax_rsp_assign_attri("", false, "AV47j", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47j), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV71UsurCod", AV71UsurCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV66Station", AV66Station);
            httpContext.ajax_rsp_assign_attri("", false, "AV78HreFecTin", localUtil.format(AV78HreFecTin, "99/99/99"));
            AV45Inc_obs = httpContext.getMessage( "gReturn PCLs999", "") ;
            new app.pctrinc(remoteHandle, context).execute( AV29Emprcod, AV95Pgmname, AV71UsurCod, AV66Station, AV45Inc_obs, AV8BarCod, AV12BarCodReo, AV10BarCodPar) ;
            AV55ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-warning", "") );
            AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesada N Hdr ", "")+GXutil.str( AV8BarCod, 8, 0)+"-"+GXutil.str( AV12BarCodReo, 1, 0)+AV10BarCodPar);
            AV67t = (short)(AV67t+1) ;
         }
         AV128GXV32 = (int)(AV128GXV32+1) ;
      }
      AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizada lectura ... ", ""));
      if ( ( AV67t > 0 ) && ( AV73SiCSV == 1 ) )
      {
         callWebObject(formatLink("app.pctrlinsumos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV54productosconsumos))}, new String[] {"Emprcod","ProductosConsumos"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
         AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Processando Insumos ... ", ""));
      }
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Actualizando los dadtos ... ", ""));
      AV55ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-sucess", "") );
      AV55ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
      AV55ProgressIndicator.hide();
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV65Session.getValue(AV95Pgmname+"GridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV95Pgmname+"GridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV65Session.getValue(AV95Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV41GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV41GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV41GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV130GXV34 = 1 ;
      while ( AV130GXV34 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV130GXV34));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36FilterFullText", AV36FilterFullText);
         }
         AV130GXV34 = (int)(AV130GXV34+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV41GridState.fromxml(AV65Session.getValue(AV95Pgmname+"GridState"), null, null);
      AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV36FilterFullText)==0), (short)(0), AV36FilterFullText, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      AV41GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV41GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV41GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e2228Z2( )
   {
      /* Barcodin_Isvalid Routine */
      returnInSub = false ;
      if ( ! (0==AV9BarCodIN) )
      {
         AV35FechaCierre = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35FechaCierre", localUtil.format(AV35FechaCierre, "99/99/99"));
         AV75FechaCierreHasta = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75FechaCierreHasta", localUtil.format(AV75FechaCierreHasta, "99/99/99"));
         AV89inicio = GXutil.resetTime( GXutil.nullDate() );
         httpContext.ajax_rsp_assign_attri("", false, "AV89inicio", localUtil.ttoc( AV89inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV90fin = GXutil.resetTime( GXutil.dadd( GXutil.today( ) , + ( 1 )) );
         httpContext.ajax_rsp_assign_attri("", false, "AV90fin", localUtil.ttoc( AV90fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV35FechaCierre = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35FechaCierre", localUtil.format(AV35FechaCierre, "99/99/99"));
         AV75FechaCierreHasta = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75FechaCierreHasta", localUtil.format(AV75FechaCierreHasta, "99/99/99"));
         AV89inicio = GXutil.resetTime( AV35FechaCierre );
         httpContext.ajax_rsp_assign_attri("", false, "AV89inicio", localUtil.ttoc( AV89inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV90fin = GXutil.resetTime( GXutil.dadd( AV75FechaCierreHasta , + ( 1 )) );
         httpContext.ajax_rsp_assign_attri("", false, "AV90fin", localUtil.ttoc( AV90fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      /*  Sending Event outputs  */
   }

   public void e2828Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* 'DoResultados' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      if ( AV52Numeroregistros > 0 )
      {
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Registros localizados! Carregando a Grid.", ""));
      }
      /*  Sending Event outputs  */
      if ( gx_BV150 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57RecetadeTinte_Cierre_SDT", AV57RecetadeTinte_Cierre_SDT);
         nGXsfl_150_bak_idx = nGXsfl_150_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV49ManageFiltersExecutionStep, AV22ColumnsSelector, AV86LoadGridData, AV95Pgmname, AV36FilterFullText, AV29Emprcod, AV9BarCodIN, AV13BarCodReoIN, AV11BarCodParIN, AV89inicio, AV90fin, AV56RecAcab, AV57RecetadeTinte_Cierre_SDT, Gx_date, AV21colorservicecontador, AV19clienteModa21, AV73SiCSV) ;
         nGXsfl_150_idx = nGXsfl_150_bak_idx ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1502( ) ;
      }
   }

   public void e2928Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* Recetadetinte_cierre_sdt__incidencias_Click Routine */
      returnInSub = false ;
      AV8BarCod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV12BarCodReo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV10BarCodPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      AV61reclinmaq = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq() ;
      AV6Window.setAutoresize( 0 );
      AV6Window.setWidth( 1600 );
      AV6Window.setHeight( 900 );
      /* Window Datatype Object Property */
      AV6Window.setUrl( formatLink("app.formulaciontinte.cierrerecetastinteincidencias_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV61reclinmaq,4,0))}, new String[] {"EmprCod","barcod","barcodreo","barcodpar","reclinmaq"})  );
      AV6Window.setReturnParms(new Object[] {});
      httpContext.newWindow(AV6Window);
      /*  Sending Event outputs  */
   }

   public void e3028Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* Recetadetinte_cierre_sdt__baragrest_Click Routine */
      returnInSub = false ;
      AV7BarAgrEst = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest() ;
      AV8BarCod = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod() ;
      AV12BarCodReo = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo() ;
      AV10BarCodPar = ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar() ;
      if ( GXutil.strcmp(AV7BarAgrEst, "S") == 0 )
      {
         AV6Window.setAutoresize( 0 );
         AV6Window.setWidth( 1600 );
         AV6Window.setHeight( 900 );
         /* Window Datatype Object Property */
         AV6Window.setUrl( formatLink("app.formulaciontinte.recetadetinte_agrupacion_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV29Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  );
         AV6Window.setReturnParms(new Object[] {"AV29Emprcod","AV8BarCod","AV12BarCodReo","AV10BarCodPar",});
         httpContext.newWindow(AV6Window);
      }
      /*  Sending Event outputs  */
   }

   public void e3128Z2( )
   {
      AV96GXV1 = (int)(nGXsfl_150_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) )
      {
         AV57RecetadeTinte_Cierre_SDT.currentItem( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)) );
      }
      /* Recetadetinte_cierre_sdt__seleccionar_Click Routine */
      returnInSub = false ;
      if ( ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar() ) && ( ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti() > 0 ) || ( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)(AV57RecetadeTinte_Cierre_SDT.currentItem())).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh() > 0 ) ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion. El sistema ha dectectado que esta OT", "") + GXutil.newLine( ) + httpContext.getMessage( "Ya ha sido cerrada anteriormente. Consulte Historico Recetas", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
   }

   public void wb_table4_199_28Z2( boolean wbgen )
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
         wb_table4_199_28Z2e( true) ;
      }
      else
      {
         wb_table4_199_28Z2e( false) ;
      }
   }

   public void wb_table3_194_28Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_anyadirproductos_Internalname, tblTabledvelop_confirmpanel_anyadirproductos_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_anyadirproductos.setProperty("Title", Dvelop_confirmpanel_anyadirproductos_Title);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("ConfirmationText", Dvelop_confirmpanel_anyadirproductos_Confirmationtext);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("YesButtonCaption", Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("NoButtonCaption", Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("CancelButtonCaption", Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("YesButtonPosition", Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition);
         ucDvelop_confirmpanel_anyadirproductos.setProperty("ConfirmType", Dvelop_confirmpanel_anyadirproductos_Confirmtype);
         ucDvelop_confirmpanel_anyadirproductos.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_anyadirproductos_Internalname, "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_194_28Z2e( true) ;
      }
      else
      {
         wb_table3_194_28Z2e( false) ;
      }
   }

   public void wb_table2_127_28Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergednumeroregistros_Internalname, tblTablemergednumeroregistros_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNumeroregistros_Internalname, httpContext.getMessage( "Numeroregistros", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNumeroregistros_Internalname, GXutil.ltrim( localUtil.ntoc( AV52Numeroregistros, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNumeroregistros_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52Numeroregistros), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV52Numeroregistros), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNumeroregistros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNumeroregistros_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblNumeroregistros_popoverimage_Internalname, httpContext.getMessage( "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down fas fa-info'></i>", ""), "", "", lblNumeroregistros_popoverimage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_127_28Z2e( true) ;
      }
      else
      {
         wb_table2_127_28Z2e( false) ;
      }
   }

   public void wb_table1_105_28Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV48ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_110_28Z2( true) ;
      }
      else
      {
         wb_table5_110_28Z2( false) ;
      }
      return  ;
   }

   public void wb_table5_110_28Z2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_105_28Z2e( true) ;
      }
      else
      {
         wb_table1_105_28Z2e( false) ;
      }
   }

   public void wb_table5_110_28Z2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_150_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV36FilterFullText, GXutil.rtrim( localUtil.format( AV36FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\RecetadeTinteCierreWwp.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_110_28Z2e( true) ;
      }
      else
      {
         wb_table5_110_28Z2e( false) ;
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
      pa28Z2( ) ;
      ws28Z2( ) ;
      we28Z2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269178552588", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/recetadetintecierrewwp.js", "?20269178552589", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1502( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_150_idx );
      chkavRecetadetinte_cierre_sdt__seleccionar.setInternalname( "RECETADETINTE_CIERRE_SDT__SELECCIONAR_"+sGXsfl_150_idx );
      cmbavRecetadetinte_cierre_sdt__pesado.setInternalname( "RECETADETINTE_CIERRE_SDT__PESADO_"+sGXsfl_150_idx );
      cmbavRecetadetinte_cierre_sdt__adicion.setInternalname( "RECETADETINTE_CIERRE_SDT__ADICION_"+sGXsfl_150_idx );
      edtavRecetadetinte_cierre_sdt__rechayany_Internalname = "RECETADETINTE_CIERRE_SDT__RECHAYANY_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__incidencias_Internalname = "RECETADETINTE_CIERRE_SDT__INCIDENCIAS_"+sGXsfl_150_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barcod_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOD_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Internalname = "RECETADETINTE_CIERRE_SDT__BARCODREO_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Internalname = "RECETADETINTE_CIERRE_SDT__BARCODPAR_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname = "RECETADETINTE_CIERRE_SDT__RECLINMAQ_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barsit_Internalname = "RECETADETINTE_CIERRE_SDT__BARSIT_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__baragrest_Internalname = "RECETADETINTE_CIERRE_SDT__BARAGREST_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barser_Internalname = "RECETADETINTE_CIERRE_SDT__BARSER_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Internalname = "RECETADETINTE_CIERRE_SDT__BARSERDSC_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOLNOM_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOLNUM_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Internalname = "RECETADETINTE_CIERRE_SDT__BARTIPCOL_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Internalname = "RECETADETINTE_CIERRE_SDT__BARNOMCLI_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Internalname = "RECETADETINTE_CIERRE_SDT__BARNUMCLI_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__maqcod_Internalname = "RECETADETINTE_CIERRE_SDT__MAQCOD_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname = "RECETADETINTE_CIERRE_SDT__RECTOTKGM_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Internalname = "RECETADETINTE_CIERRE_SDT__RECVOLPRD_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Internalname = "RECETADETINTE_CIERRE_SDT__RECFECALT_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__barnumany_Internalname = "RECETADETINTE_CIERRE_SDT__BARNUMANY_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__lconti_Internalname = "RECETADETINTE_CIERRE_SDT__LCONTI_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__hisreh_Internalname = "RECETADETINTE_CIERRE_SDT__HISREH_"+sGXsfl_150_idx ;
      edtavRecetadetinte_cierre_sdt__batchcode_Internalname = "RECETADETINTE_CIERRE_SDT__BATCHCODE_"+sGXsfl_150_idx ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setInternalname( "RECETADETINTE_CIERRE_SDT__RECNROPAR_"+sGXsfl_150_idx );
      edtavRecetadetinte_cierre_sdt__weigprodid_Internalname = "RECETADETINTE_CIERRE_SDT__WEIGPRODID_"+sGXsfl_150_idx ;
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setInternalname( "RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS_"+sGXsfl_150_idx );
   }

   public void subsflControlProps_fel_1502( )
   {
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES_"+sGXsfl_150_fel_idx );
      chkavRecetadetinte_cierre_sdt__seleccionar.setInternalname( "RECETADETINTE_CIERRE_SDT__SELECCIONAR_"+sGXsfl_150_fel_idx );
      cmbavRecetadetinte_cierre_sdt__pesado.setInternalname( "RECETADETINTE_CIERRE_SDT__PESADO_"+sGXsfl_150_fel_idx );
      cmbavRecetadetinte_cierre_sdt__adicion.setInternalname( "RECETADETINTE_CIERRE_SDT__ADICION_"+sGXsfl_150_fel_idx );
      edtavRecetadetinte_cierre_sdt__rechayany_Internalname = "RECETADETINTE_CIERRE_SDT__RECHAYANY_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__incidencias_Internalname = "RECETADETINTE_CIERRE_SDT__INCIDENCIAS_"+sGXsfl_150_fel_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcod_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOD_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Internalname = "RECETADETINTE_CIERRE_SDT__BARCODREO_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Internalname = "RECETADETINTE_CIERRE_SDT__BARCODPAR_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname = "RECETADETINTE_CIERRE_SDT__RECLINMAQ_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barsit_Internalname = "RECETADETINTE_CIERRE_SDT__BARSIT_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__baragrest_Internalname = "RECETADETINTE_CIERRE_SDT__BARAGREST_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barser_Internalname = "RECETADETINTE_CIERRE_SDT__BARSER_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Internalname = "RECETADETINTE_CIERRE_SDT__BARSERDSC_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOLNOM_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOLNUM_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Internalname = "RECETADETINTE_CIERRE_SDT__BARTIPCOL_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Internalname = "RECETADETINTE_CIERRE_SDT__BARNOMCLI_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Internalname = "RECETADETINTE_CIERRE_SDT__BARNUMCLI_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__maqcod_Internalname = "RECETADETINTE_CIERRE_SDT__MAQCOD_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname = "RECETADETINTE_CIERRE_SDT__RECTOTKGM_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Internalname = "RECETADETINTE_CIERRE_SDT__RECVOLPRD_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Internalname = "RECETADETINTE_CIERRE_SDT__RECFECALT_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__barnumany_Internalname = "RECETADETINTE_CIERRE_SDT__BARNUMANY_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__lconti_Internalname = "RECETADETINTE_CIERRE_SDT__LCONTI_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__hisreh_Internalname = "RECETADETINTE_CIERRE_SDT__HISREH_"+sGXsfl_150_fel_idx ;
      edtavRecetadetinte_cierre_sdt__batchcode_Internalname = "RECETADETINTE_CIERRE_SDT__BATCHCODE_"+sGXsfl_150_fel_idx ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setInternalname( "RECETADETINTE_CIERRE_SDT__RECNROPAR_"+sGXsfl_150_fel_idx );
      edtavRecetadetinte_cierre_sdt__weigprodid_Internalname = "RECETADETINTE_CIERRE_SDT__WEIGPRODID_"+sGXsfl_150_fel_idx ;
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setInternalname( "RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS_"+sGXsfl_150_fel_idx );
   }

   public void sendrow_1502( )
   {
      subsflControlProps_1502( ) ;
      wb28Z0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_150_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_150_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_150_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 151,'',false,'"+sGXsfl_150_idx+"',150)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_150_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (0==AV43grupodeacciones) )
               {
                  AV43grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV43grupodeacciones, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43grupodeacciones), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV43grupodeacciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRUPODEACCIONES.CLICK."+sGXsfl_150_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGrupodeacciones.getColumnClass(),cmbavGrupodeacciones.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,151);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV43grupodeacciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_150_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavRecetadetinte_cierre_sdt__seleccionar.getEnabled()!=0)&&(chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 152,'',false,'"+sGXsfl_150_idx+"',150)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "RECETADETINTE_CIERRE_SDT__SELECCIONAR_" + sGXsfl_150_idx ;
         chkavRecetadetinte_cierre_sdt__seleccionar.setName( GXCCtl );
         chkavRecetadetinte_cierre_sdt__seleccionar.setWebtags( "" );
         chkavRecetadetinte_cierre_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(), "TitleCaption", chkavRecetadetinte_cierre_sdt__seleccionar.getCaption(), !bGXsfl_150_Refreshing);
         chkavRecetadetinte_cierre_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Seleccionar()),"","",Integer.valueOf(chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()),Integer.valueOf(1),"true","",StyleString,ClassString,chkavRecetadetinte_cierre_sdt__seleccionar.getColumnClass(),chkavRecetadetinte_cierre_sdt__seleccionar.getColumnHeaderClass(),TempTags+((chkavRecetadetinte_cierre_sdt__seleccionar.getEnabled()!=0)&&(chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,152);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavRecetadetinte_cierre_sdt__pesado.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecetadetinte_cierre_sdt__pesado.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECETADETINTE_CIERRE_SDT__PESADO_" + sGXsfl_150_idx ;
            cmbavRecetadetinte_cierre_sdt__pesado.setName( GXCCtl );
            cmbavRecetadetinte_cierre_sdt__pesado.setWebtags( "" );
            cmbavRecetadetinte_cierre_sdt__pesado.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbavRecetadetinte_cierre_sdt__pesado.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbavRecetadetinte_cierre_sdt__pesado.getItemCount() > 0 )
            {
               if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado())==0) )
               {
                  ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado( cmbavRecetadetinte_cierre_sdt__pesado.getValidValue(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecetadetinte_cierre_sdt__pesado,cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(),GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado()),Integer.valueOf(1),cmbavRecetadetinte_cierre_sdt__pesado.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavRecetadetinte_cierre_sdt__pesado.getVisible()),Integer.valueOf(cmbavRecetadetinte_cierre_sdt__pesado.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbavRecetadetinte_cierre_sdt__pesado.getColumnClass(),cmbavRecetadetinte_cierre_sdt__pesado.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecetadetinte_cierre_sdt__pesado.setValue( GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__pesado.getInternalname(), "Values", cmbavRecetadetinte_cierre_sdt__pesado.ToJavascriptSource(), !bGXsfl_150_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbavRecetadetinte_cierre_sdt__adicion.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecetadetinte_cierre_sdt__adicion.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECETADETINTE_CIERRE_SDT__ADICION_" + sGXsfl_150_idx ;
            cmbavRecetadetinte_cierre_sdt__adicion.setName( GXCCtl );
            cmbavRecetadetinte_cierre_sdt__adicion.setWebtags( "" );
            cmbavRecetadetinte_cierre_sdt__adicion.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            cmbavRecetadetinte_cierre_sdt__adicion.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            if ( cmbavRecetadetinte_cierre_sdt__adicion.getItemCount() > 0 )
            {
               if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion())==0) )
               {
                  ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion( cmbavRecetadetinte_cierre_sdt__adicion.getValidValue(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion()) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecetadetinte_cierre_sdt__adicion,cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(),GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion()),Integer.valueOf(1),cmbavRecetadetinte_cierre_sdt__adicion.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbavRecetadetinte_cierre_sdt__adicion.getVisible()),Integer.valueOf(cmbavRecetadetinte_cierre_sdt__adicion.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbavRecetadetinte_cierre_sdt__adicion.getColumnClass(),cmbavRecetadetinte_cierre_sdt__adicion.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecetadetinte_cierre_sdt__adicion.setValue( GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion()) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__adicion.getInternalname(), "Values", cmbavRecetadetinte_cierre_sdt__adicion.ToJavascriptSource(), !bGXsfl_150_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__rechayany_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__rechayany_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rechayany()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__rechayany_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__rechayany_Columnclass,edtavRecetadetinte_cierre_sdt__rechayany_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__rechayany_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__rechayany_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__incidencias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__incidencias_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__incidencias_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Incidencias()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ERECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK."+sGXsfl_150_idx+"'","","","","",edtavRecetadetinte_cierre_sdt__incidencias_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__incidencias_Columnclass,edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__incidencias_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__incidencias_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 157,'',false,'"+sGXsfl_150_idx+"',150)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV28DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,157);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVDETAILWEBCOMPONENT.CLICK."+sGXsfl_150_idx+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavDetailwebcomponent_Columnclass,edtavDetailwebcomponent_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barcod_Columnclass,edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcod_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodreo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barcodreo_Columnclass,edtavRecetadetinte_cierre_sdt__barcodreo_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodreo_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodpar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barcodpar_Columnclass,edtavRecetadetinte_cierre_sdt__barcodpar_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodpar_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__reclinmaq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Reclinmaq()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__reclinmaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__reclinmaq_Columnclass,edtavRecetadetinte_cierre_sdt__reclinmaq_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__reclinmaq_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barsit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barsit_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barsit()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barsit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barsit_Columnclass,edtavRecetadetinte_cierre_sdt__barsit_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barsit_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barsit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__baragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__baragrest_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest()),GXutil.rtrim( localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Baragrest(), "@!")),"","'"+""+"'"+",false,"+"'"+"ERECETADETINTE_CIERRE_SDT__BARAGREST.CLICK."+sGXsfl_150_idx+"'","","","","",edtavRecetadetinte_cierre_sdt__baragrest_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__baragrest_Columnclass,edtavRecetadetinte_cierre_sdt__baragrest_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__baragrest_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__baragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barser_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barser_Columnclass,edtavRecetadetinte_cierre_sdt__barser_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barser_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barserdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barserdsc_Columnclass,edtavRecetadetinte_cierre_sdt__barserdsc_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barserdsc_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barcolnom_Columnclass,edtavRecetadetinte_cierre_sdt__barcolnom_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnom_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barcolnum_Columnclass,edtavRecetadetinte_cierre_sdt__barcolnum_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnum_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__bartipcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__bartipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__bartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Bartipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__bartipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__bartipcol_Columnclass,edtavRecetadetinte_cierre_sdt__bartipcol_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__bartipcol_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__bartipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barnomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barnomcli_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barnomcli_Columnclass,edtavRecetadetinte_cierre_sdt__barnomcli_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnomcli_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barnumcli_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumcli()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barnumcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barnumcli_Columnclass,edtavRecetadetinte_cierre_sdt__barnumcli_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumcli_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumcli_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__maqcod_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Maqcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__maqcod_Columnclass,edtavRecetadetinte_cierre_sdt__maqcod_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__maqcod_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__rectotkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled!=0) ? localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm(), "ZZZZZZ9.99") : localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Rectotkgm(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__rectotkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__rectotkgm_Columnclass,edtavRecetadetinte_cierre_sdt__rectotkgm_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__rectotkgm_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__recvolprd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__recvolprd_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd(), (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__recvolprd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd()), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recvolprd()), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__recvolprd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__recvolprd_Columnclass,edtavRecetadetinte_cierre_sdt__recvolprd_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__recvolprd_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__recvolprd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__recfecalt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__recfecalt_Internalname,localUtil.ttoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recfecalt(), "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__recfecalt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__recfecalt_Columnclass,edtavRecetadetinte_cierre_sdt__recfecalt_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__recfecalt_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__recfecalt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumany_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__barnumany_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany(), (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__barnumany_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany()), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Barnumany()), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__barnumany_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__barnumany_Columnclass,edtavRecetadetinte_cierre_sdt__barnumany_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumany_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__barnumany_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__lconti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__lconti_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__lconti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Lconti()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__lconti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__lconti_Columnclass,edtavRecetadetinte_cierre_sdt__lconti_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__lconti_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__lconti_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__hisreh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__hisreh_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__hisreh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Hisreh()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__hisreh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__hisreh_Columnclass,edtavRecetadetinte_cierre_sdt__hisreh_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__hisreh_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__hisreh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__batchcode_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__batchcode_Internalname,GXutil.rtrim( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Batchcode()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__batchcode_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__batchcode_Columnclass,edtavRecetadetinte_cierre_sdt__batchcode_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__batchcode_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__batchcode_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbavRecetadetinte_cierre_sdt__recnropar.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecetadetinte_cierre_sdt__recnropar.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECETADETINTE_CIERRE_SDT__RECNROPAR_" + sGXsfl_150_idx ;
            cmbavRecetadetinte_cierre_sdt__recnropar.setName( GXCCtl );
            cmbavRecetadetinte_cierre_sdt__recnropar.setWebtags( "" );
            cmbavRecetadetinte_cierre_sdt__recnropar.addItem("999999", httpContext.getMessage( "Rec. Act. Cons. Color Service", ""), (short)(0));
            cmbavRecetadetinte_cierre_sdt__recnropar.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            if ( cmbavRecetadetinte_cierre_sdt__recnropar.getItemCount() > 0 )
            {
               if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (0==((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar()) )
               {
                  ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar( (int)(GXutil.lval( cmbavRecetadetinte_cierre_sdt__recnropar.getValidValue(GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(), 6, 0))))) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecetadetinte_cierre_sdt__recnropar,cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(),GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(), 6, 0)),Integer.valueOf(1),cmbavRecetadetinte_cierre_sdt__recnropar.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbavRecetadetinte_cierre_sdt__recnropar.getVisible()),Integer.valueOf(cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbavRecetadetinte_cierre_sdt__recnropar.getColumnClass(),cmbavRecetadetinte_cierre_sdt__recnropar.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecetadetinte_cierre_sdt__recnropar.setValue( GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(), 6, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__recnropar.getInternalname(), "Values", cmbavRecetadetinte_cierre_sdt__recnropar.ToJavascriptSource(), !bGXsfl_150_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecetadetinte_cierre_sdt__weigprodid_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecetadetinte_cierre_sdt__weigprodid_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid(), (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRecetadetinte_cierre_sdt__weigprodid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid()), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Weigprodid()), "ZZZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecetadetinte_cierre_sdt__weigprodid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass,edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass,Integer.valueOf(edtavRecetadetinte_cierre_sdt__weigprodid_Visible),Integer.valueOf(edtavRecetadetinte_cierre_sdt__weigprodid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbavRecetadetinte_cierre_sdt__colorservicedatos.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS_" + sGXsfl_150_idx ;
            cmbavRecetadetinte_cierre_sdt__colorservicedatos.setName( GXCCtl );
            cmbavRecetadetinte_cierre_sdt__colorservicedatos.setWebtags( "" );
            cmbavRecetadetinte_cierre_sdt__colorservicedatos.addItem("999999", httpContext.getMessage( "Rec. Act. Cons. Color Service", ""), (short)(0));
            cmbavRecetadetinte_cierre_sdt__colorservicedatos.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
            if ( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getItemCount() > 0 )
            {
               if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (0==((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos()) )
               {
                  ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos( (short)(GXutil.lval( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getValidValue(GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos(), 4, 0))))) );
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavRecetadetinte_cierre_sdt__colorservicedatos,cmbavRecetadetinte_cierre_sdt__colorservicedatos.getInternalname(),GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos(), 4, 0)),Integer.valueOf(1),cmbavRecetadetinte_cierre_sdt__colorservicedatos.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbavRecetadetinte_cierre_sdt__colorservicedatos.getVisible()),Integer.valueOf(cmbavRecetadetinte_cierre_sdt__colorservicedatos.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbavRecetadetinte_cierre_sdt__colorservicedatos.getColumnClass(),cmbavRecetadetinte_cierre_sdt__colorservicedatos.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavRecetadetinte_cierre_sdt__colorservicedatos.setValue( GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos(), 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavRecetadetinte_cierre_sdt__colorservicedatos.getInternalname(), "Values", cmbavRecetadetinte_cierre_sdt__colorservicedatos.ToJavascriptSource(), !bGXsfl_150_Refreshing);
         send_integrity_lvl_hashes28Z2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_150_idx = ((subGrid_Islastpage==1)&&(nGXsfl_150_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_150_idx+1) ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1502( ) ;
      }
      /* End function sendrow_1502 */
   }

   public void startgridcontrol150( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"150\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavRecetadetinte_cierre_sdt__seleccionar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecetadetinte_cierre_sdt__pesado.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecetadetinte_cierre_sdt__adicion.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ad?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__rechayany_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PesAut?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__incidencias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Err", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodreo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcodpar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__reclinmaq_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barsit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__baragrest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__bartipcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barnomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__rectotkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Tot.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__recvolprd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__recfecalt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fech. Alta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__barnumany_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Añad.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__lconti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lconti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__hisreh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hisreh", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__batchcode_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Batch Code", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecetadetinte_cierre_sdt__recnropar.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Os Act.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecetadetinte_cierre_sdt__weigprodid_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbavRecetadetinte_cierre_sdt__colorservicedatos.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ok", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43grupodeacciones, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGrupodeacciones.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGrupodeacciones.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavRecetadetinte_cierre_sdt__seleccionar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavRecetadetinte_cierre_sdt__seleccionar.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavRecetadetinte_cierre_sdt__seleccionar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__pesado.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__pesado.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__pesado.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__pesado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__adicion.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__adicion.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__adicion.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__adicion.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__rechayany_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__rechayany_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__rechayany_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__rechayany_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__incidencias_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__incidencias_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__incidencias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV28DetailWebComponent));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDetailwebcomponent_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDetailwebcomponent_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcodreo_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcodreo_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcodpar_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcodpar_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__reclinmaq_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__reclinmaq_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__reclinmaq_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barsit_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barsit_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barsit_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barsit_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__baragrest_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__baragrest_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__baragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__baragrest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barser_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barser_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barserdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barserdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcolnom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcolnom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcolnum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barcolnum_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__bartipcol_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__bartipcol_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__bartipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__bartipcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barnomcli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barnomcli_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnomcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barnumcli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barnumcli_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__maqcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__maqcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__rectotkgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__rectotkgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__rectotkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__recvolprd_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__recvolprd_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recvolprd_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recvolprd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__recfecalt_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__recfecalt_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recfecalt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__recfecalt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barnumany_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__barnumany_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumany_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__barnumany_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__lconti_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__lconti_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__lconti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__lconti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__hisreh_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__hisreh_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__hisreh_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__hisreh_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__batchcode_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__batchcode_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__batchcode_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__batchcode_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__recnropar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__recnropar.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__recnropar.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__recnropar.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__weigprodid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecetadetinte_cierre_sdt__weigprodid_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtavHrefectin_Internalname = "vHREFECTIN" ;
      edtavBarcodin_Internalname = "vBARCODIN" ;
      edtavBarcodreoin_Internalname = "vBARCODREOIN" ;
      edtavBarcodparin_Internalname = "vBARCODPARIN" ;
      edtavFechacierre_Internalname = "vFECHACIERRE" ;
      edtavFechacierrehasta_Internalname = "vFECHACIERREHASTA" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnsearch_Internalname = "BTNSEARCH" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      lblTxtmensaje_Internalname = "TXTMENSAJE" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablec_Internalname = "TABLEC" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTextblocknumeroregistros_Internalname = "TEXTBLOCKNUMEROREGISTROS" ;
      edtavNumeroregistros_Internalname = "vNUMEROREGISTROS" ;
      lblNumeroregistros_popoverimage_Internalname = "NUMEROREGISTROS_POPOVERIMAGE" ;
      tblTablemergednumeroregistros_Internalname = "TABLEMERGEDNUMEROREGISTROS" ;
      divTablesplittednumeroregistros_Internalname = "TABLESPLITTEDNUMEROREGISTROS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divResultadoaction_Internalname = "RESULTADOACTION" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbavGrupodeacciones.setInternalname( "vGRUPODEACCIONES" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setInternalname( "RECETADETINTE_CIERRE_SDT__SELECCIONAR" );
      cmbavRecetadetinte_cierre_sdt__pesado.setInternalname( "RECETADETINTE_CIERRE_SDT__PESADO" );
      cmbavRecetadetinte_cierre_sdt__adicion.setInternalname( "RECETADETINTE_CIERRE_SDT__ADICION" );
      edtavRecetadetinte_cierre_sdt__rechayany_Internalname = "RECETADETINTE_CIERRE_SDT__RECHAYANY" ;
      edtavRecetadetinte_cierre_sdt__incidencias_Internalname = "RECETADETINTE_CIERRE_SDT__INCIDENCIAS" ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      edtavRecetadetinte_cierre_sdt__barcod_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOD" ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Internalname = "RECETADETINTE_CIERRE_SDT__BARCODREO" ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Internalname = "RECETADETINTE_CIERRE_SDT__BARCODPAR" ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname = "RECETADETINTE_CIERRE_SDT__RECLINMAQ" ;
      edtavRecetadetinte_cierre_sdt__barsit_Internalname = "RECETADETINTE_CIERRE_SDT__BARSIT" ;
      edtavRecetadetinte_cierre_sdt__baragrest_Internalname = "RECETADETINTE_CIERRE_SDT__BARAGREST" ;
      edtavRecetadetinte_cierre_sdt__barser_Internalname = "RECETADETINTE_CIERRE_SDT__BARSER" ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Internalname = "RECETADETINTE_CIERRE_SDT__BARSERDSC" ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOLNOM" ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Internalname = "RECETADETINTE_CIERRE_SDT__BARCOLNUM" ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Internalname = "RECETADETINTE_CIERRE_SDT__BARTIPCOL" ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Internalname = "RECETADETINTE_CIERRE_SDT__BARNOMCLI" ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Internalname = "RECETADETINTE_CIERRE_SDT__BARNUMCLI" ;
      edtavRecetadetinte_cierre_sdt__maqcod_Internalname = "RECETADETINTE_CIERRE_SDT__MAQCOD" ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname = "RECETADETINTE_CIERRE_SDT__RECTOTKGM" ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Internalname = "RECETADETINTE_CIERRE_SDT__RECVOLPRD" ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Internalname = "RECETADETINTE_CIERRE_SDT__RECFECALT" ;
      edtavRecetadetinte_cierre_sdt__barnumany_Internalname = "RECETADETINTE_CIERRE_SDT__BARNUMANY" ;
      edtavRecetadetinte_cierre_sdt__lconti_Internalname = "RECETADETINTE_CIERRE_SDT__LCONTI" ;
      edtavRecetadetinte_cierre_sdt__hisreh_Internalname = "RECETADETINTE_CIERRE_SDT__HISREH" ;
      edtavRecetadetinte_cierre_sdt__batchcode_Internalname = "RECETADETINTE_CIERRE_SDT__BATCHCODE" ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setInternalname( "RECETADETINTE_CIERRE_SDT__RECNROPAR" );
      edtavRecetadetinte_cierre_sdt__weigprodid_Internalname = "RECETADETINTE_CIERRE_SDT__WEIGPRODID" ;
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setInternalname( "RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divResultadogrid_Internalname = "RESULTADOGRID" ;
      divResultadocontainer_Internalname = "RESULTADOCONTAINER" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Popover_numeroregistros_Internalname = "POPOVER_NUMEROREGISTROS" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_anyadirproductos_Internalname = "DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      tblTabledvelop_confirmpanel_anyadirproductos_Internalname = "TABLEDVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setJsonclick( "" );
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setColumnHeaderClass( "" );
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setColumnClass( "WWColumn" );
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setVisible( -1 );
      edtavRecetadetinte_cierre_sdt__weigprodid_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__weigprodid_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setJsonclick( "" );
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__recnropar.setColumnHeaderClass( "" );
      cmbavRecetadetinte_cierre_sdt__recnropar.setColumnClass( "WWColumn" );
      cmbavRecetadetinte_cierre_sdt__recnropar.setVisible( -1 );
      edtavRecetadetinte_cierre_sdt__batchcode_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__batchcode_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__batchcode_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__batchcode_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__hisreh_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__hisreh_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__lconti_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__lconti_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__lconti_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__lconti_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barnumany_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barnumany_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__maqcod_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__maqcod_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barser_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barser_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barser_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barser_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__baragrest_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__baragrest_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barsit_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barsit_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barsit_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barsit_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcod_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__barcod_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcod_Visible = -1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__incidencias_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__rechayany_Jsonclick = "" ;
      edtavRecetadetinte_cierre_sdt__rechayany_Columnheaderclass = "" ;
      edtavRecetadetinte_cierre_sdt__rechayany_Columnclass = "WWColumn" ;
      edtavRecetadetinte_cierre_sdt__rechayany_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__rechayany_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__adicion.setJsonclick( "" );
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__adicion.setColumnHeaderClass( "" );
      cmbavRecetadetinte_cierre_sdt__adicion.setColumnClass( "WWColumn" );
      cmbavRecetadetinte_cierre_sdt__adicion.setVisible( -1 );
      cmbavRecetadetinte_cierre_sdt__pesado.setJsonclick( "" );
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__pesado.setColumnHeaderClass( "" );
      cmbavRecetadetinte_cierre_sdt__pesado.setColumnClass( "WWColumn" );
      cmbavRecetadetinte_cierre_sdt__pesado.setVisible( -1 );
      chkavRecetadetinte_cierre_sdt__seleccionar.setCaption( "" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setColumnHeaderClass( "" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setColumnClass( "WWColumn" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setEnabled( 1 );
      chkavRecetadetinte_cierre_sdt__seleccionar.setVisible( -1 );
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      cmbavGrupodeacciones.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavNumeroregistros_Jsonclick = "" ;
      edtavNumeroregistros_Enabled = 1 ;
      edtavDetailwebcomponent_Columnheaderclass = "" ;
      cmbavGrupodeacciones.setColumnHeaderClass( "" );
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setVisible( -1 );
      edtavRecetadetinte_cierre_sdt__weigprodid_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setVisible( -1 );
      edtavRecetadetinte_cierre_sdt__batchcode_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__lconti_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barser_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barsit_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__barcod_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Visible = -1 ;
      edtavRecetadetinte_cierre_sdt__rechayany_Visible = -1 ;
      cmbavRecetadetinte_cierre_sdt__adicion.setVisible( -1 );
      cmbavRecetadetinte_cierre_sdt__pesado.setVisible( -1 );
      chkavRecetadetinte_cierre_sdt__seleccionar.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setEnabled( -1 );
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = -1 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( -1 );
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barser_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = -1 ;
      edtavRecetadetinte_cierre_sdt__rechayany_Enabled = -1 ;
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( -1 );
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( -1 );
      divCell_grid_dwc_Class = "col-xs-12" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTxtmensaje_Caption = "" ;
      edtavFechacierrehasta_Jsonclick = "" ;
      edtavFechacierrehasta_Enabled = 1 ;
      edtavFechacierre_Jsonclick = "" ;
      edtavFechacierre_Enabled = 1 ;
      edtavBarcodparin_Jsonclick = "" ;
      edtavBarcodparin_Enabled = 1 ;
      edtavBarcodreoin_Jsonclick = "" ;
      edtavBarcodreoin_Enabled = 1 ;
      edtavBarcodin_Jsonclick = "" ;
      edtavBarcodin_Enabled = 1 ;
      edtavHrefectin_Jsonclick = "" ;
      edtavHrefectin_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;;;;;;;;;;;;;Color Service;Color Service;Color Service;Color Service" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Desea Confirmar?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_anyadirproductos_Confirmtype = "1" ;
      Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_anyadirproductos_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_anyadirproductos_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:RecetadeTinte_Cierre_SDT__Seleccionar|2:RecetadeTinte_Cierre_SDT__Pesado|3:RecetadeTinte_Cierre_SDT__Adicion|4:RecetadeTinte_Cierre_SDT__RecHayAny|5:RecetadeTinte_Cierre_SDT__Incidencias|7:RecetadeTinte_Cierre_SDT__Barcod|8:RecetadeTinte_Cierre_SDT__Barcodreo|9:RecetadeTinte_Cierre_SDT__Barcodpar|10:RecetadeTinte_Cierre_SDT__RecLinMaq|11:RecetadeTinte_Cierre_SDT__BarSit|12:RecetadeTinte_Cierre_SDT__BarAgrEst|13:RecetadeTinte_Cierre_SDT__Barser|14:RecetadeTinte_Cierre_SDT__Barserdsc|15:RecetadeTinte_Cierre_SDT__Barcolnom|16:RecetadeTinte_Cierre_SDT__Barcolnum|17:RecetadeTinte_Cierre_SDT__Bartipcol|18:RecetadeTinte_Cierre_SDT__Barnomcli|19:RecetadeTinte_Cierre_SDT__Barnumcli|20:RecetadeTinte_Cierre_SDT__Maqcod|21:RecetadeTinte_Cierre_SDT__Rectotkgm|22:RecetadeTinte_Cierre_SDT__RecVolprd|23:RecetadeTinte_Cierre_SDT__RecFecAlt|24:RecetadeTinte_Cierre_SDT__BarNumAny|25:RecetadeTinte_Cierre_SDT__Lconti|26:RecetadeTinte_Cierre_SDT__Hisreh|27:RecetadeTinte_Cierre_SDT__BatchCode|28:RecetadeTinte_Cierre_SDT__RecNroPar|29:RecetadeTinte_Cierre_SDT__WeigProdID|30:RecetadeTinte_Cierre_SDT__Colorservicedatos" ;
      Ddo_grid_Gridinternalname = "" ;
      Popover_numeroregistros_Position = "Bottom" ;
      Popover_numeroregistros_Popoverwidth = 800 ;
      Popover_numeroregistros_Trigger = "Click" ;
      Popover_numeroregistros_Iteminternalname = "" ;
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
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      Form.setCaption( httpContext.getMessage( "Receta de Tinte Cierre ", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_150_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
         if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (0==AV43grupodeacciones) )
         {
            AV43grupodeacciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV43grupodeacciones, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43grupodeacciones), 4, 0));
         }
      }
      GXCCtl = "RECETADETINTE_CIERRE_SDT__SELECCIONAR_" + sGXsfl_150_idx ;
      chkavRecetadetinte_cierre_sdt__seleccionar.setName( GXCCtl );
      chkavRecetadetinte_cierre_sdt__seleccionar.setWebtags( "" );
      chkavRecetadetinte_cierre_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavRecetadetinte_cierre_sdt__seleccionar.getInternalname(), "TitleCaption", chkavRecetadetinte_cierre_sdt__seleccionar.getCaption(), !bGXsfl_150_Refreshing);
      chkavRecetadetinte_cierre_sdt__seleccionar.setCheckedValue( "false" );
      GXCCtl = "RECETADETINTE_CIERRE_SDT__PESADO_" + sGXsfl_150_idx ;
      cmbavRecetadetinte_cierre_sdt__pesado.setName( GXCCtl );
      cmbavRecetadetinte_cierre_sdt__pesado.setWebtags( "" );
      cmbavRecetadetinte_cierre_sdt__pesado.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavRecetadetinte_cierre_sdt__pesado.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavRecetadetinte_cierre_sdt__pesado.getItemCount() > 0 )
      {
         if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado())==0) )
         {
            ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado( cmbavRecetadetinte_cierre_sdt__pesado.getValidValue(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Pesado()) );
         }
      }
      GXCCtl = "RECETADETINTE_CIERRE_SDT__ADICION_" + sGXsfl_150_idx ;
      cmbavRecetadetinte_cierre_sdt__adicion.setName( GXCCtl );
      cmbavRecetadetinte_cierre_sdt__adicion.setWebtags( "" );
      cmbavRecetadetinte_cierre_sdt__adicion.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbavRecetadetinte_cierre_sdt__adicion.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbavRecetadetinte_cierre_sdt__adicion.getItemCount() > 0 )
      {
         if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (GXutil.strcmp("", ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion())==0) )
         {
            ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion( cmbavRecetadetinte_cierre_sdt__adicion.getValidValue(((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Adicion()) );
         }
      }
      GXCCtl = "RECETADETINTE_CIERRE_SDT__RECNROPAR_" + sGXsfl_150_idx ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setName( GXCCtl );
      cmbavRecetadetinte_cierre_sdt__recnropar.setWebtags( "" );
      cmbavRecetadetinte_cierre_sdt__recnropar.addItem("999999", httpContext.getMessage( "Rec. Act. Cons. Color Service", ""), (short)(0));
      cmbavRecetadetinte_cierre_sdt__recnropar.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      if ( cmbavRecetadetinte_cierre_sdt__recnropar.getItemCount() > 0 )
      {
         if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (0==((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar()) )
         {
            ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar( (int)(GXutil.lval( cmbavRecetadetinte_cierre_sdt__recnropar.getValidValue(GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Recnropar(), 6, 0))))) );
         }
      }
      GXCCtl = "RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS_" + sGXsfl_150_idx ;
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setName( GXCCtl );
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setWebtags( "" );
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.addItem("999999", httpContext.getMessage( "Rec. Act. Cons. Color Service", ""), (short)(0));
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      if ( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getItemCount() > 0 )
      {
         if ( ( AV96GXV1 > 0 ) && ( AV57RecetadeTinte_Cierre_SDT.size() >= AV96GXV1 ) && (0==((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos()) )
         {
            ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).setgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos( (short)(GXutil.lval( cmbavRecetadetinte_cierre_sdt__colorservicedatos.getValidValue(GXutil.trim( GXutil.str( ((app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item)AV57RecetadeTinte_Cierre_SDT.elementAt(-1+AV96GXV1)).getgxTv_SdtRecetadeTinte_Cierre_SDT_Item_Colorservicedatos(), 4, 0))))) );
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnheaderclass'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("'DOSEARCH'","{handler:'e1828Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV78HreFecTin',fld:'vHREFECTIN',pic:''}]");
      setEventMetadata("'DOSEARCH'",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnheaderclass'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1328Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1428Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2528Z2',iparms:[{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV43grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV28DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnclass'},{av:'edtavDetailwebcomponent_Columnclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1528Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnheaderclass'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1228Z2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnheaderclass'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e2628Z2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV43grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV43grupodeacciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_anyadirproductos_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS',prop:'ConfirmationText'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnheaderclass'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE","{handler:'e1628Z2',iparms:[{av:'Dvelop_confirmpanel_anyadirproductos_Result',ctrl:'DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV71UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV66Station',fld:'vSTATION',pic:''},{av:'AV34FecCieTin',fld:'vFECCIETIN',pic:''},{av:'AV25Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV18Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV78HreFecTin',fld:'vHREFECTIN',pic:''},{av:'AV37FlagM',fld:'vFLAGM',pic:'9'},{av:'AV60Recfec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ANYADIRPRODUCTOS.CLOSE",",oparms:[{av:'AV74RecHayAny',fld:'vRECHAYANY',pic:''},{av:'AV60Recfec',fld:'vRECFEC',pic:''},{av:'AV37FlagM',fld:'vFLAGM',pic:'9'},{av:'AV78HreFecTin',fld:'vHREFECTIN',pic:''},{av:'AV18Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV25Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV34FecCieTin',fld:'vFECCIETIN',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnheaderclass'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1928Z2',iparms:[{av:'AV78HreFecTin',fld:'vHREFECTIN',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'lblTxtmensaje_Caption',ctrl:'TXTMENSAJE',prop:'Caption'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1728Z2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true},{av:'AV71UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV66Station',fld:'vSTATION',pic:''},{av:'AV74RecHayAny',fld:'vRECHAYANY',pic:''},{av:'AV25Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV18Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV54productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'AV47j',fld:'vJ',pic:'ZZZ9'},{av:'AV78HreFecTin',fld:'vHREFECTIN',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV74RecHayAny',fld:'vRECHAYANY',pic:''},{av:'AV78HreFecTin',fld:'vHREFECTIN',pic:''},{av:'AV66Station',fld:'vSTATION',pic:''},{av:'AV71UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV47j',fld:'vJ',pic:'ZZZ9'},{av:'AV54productosconsumos',fld:'vPRODUCTOSCONSUMOS',pic:''},{av:'AV18Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9'},{av:'AV25Consumos',fld:'vCONSUMOS',pic:'ZZZ9'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Visible'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Visible'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{ctrl:'RECETADETINTE_CIERRE_SDT__SELECCIONAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__PESADO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__ADICION',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECHAYANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__INCIDENCIAS',prop:'Columnheaderclass'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECLINMAQ',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSIT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARAGREST',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNOMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMCLI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__MAQCOD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECTOTKGM',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECVOLPRD',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECFECALT',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BARNUMANY',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__LCONTI',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__HISREH',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__BATCHCODE',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__RECNROPAR',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__WEIGPRODID',prop:'Columnheaderclass'},{ctrl:'RECETADETINTE_CIERRE_SDT__COLORSERVICEDATOS',prop:'Columnheaderclass'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1128Z1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e2028Z2',iparms:[{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2128Z2',iparms:[{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e2728Z2',iparms:[{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VBARCODIN.ISVALID","{handler:'e2228Z2',iparms:[{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VBARCODIN.ISVALID",",oparms:[{av:'AV35FechaCierre',fld:'vFECHACIERRE',pic:''},{av:'AV75FechaCierreHasta',fld:'vFECHACIERREHASTA',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e2828Z2',iparms:[{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarCodIN',fld:'vBARCODIN',pic:'ZZZZZZZ9'},{av:'AV13BarCodReoIN',fld:'vBARCODREOIN',pic:'9'},{av:'AV11BarCodParIN',fld:'vBARCODPARIN',pic:''},{av:'AV89inicio',fld:'vINICIO',pic:'99/99/99 99:99'},{av:'AV90fin',fld:'vFIN',pic:'99/99/99 99:99'},{av:'AV56RecAcab',fld:'vRECACAB',pic:'',hsh:true},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'GRID_nEOF'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV22ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV86LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV36FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21colorservicecontador',fld:'vCOLORSERVICECONTADOR',pic:'ZZZ9',hsh:true},{av:'AV19clienteModa21',fld:'vCLIENTEMODA21',pic:'ZZZ9',hsh:true},{av:'AV73SiCSV',fld:'vSICSV',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV59RecetadeTinte_Cierre_SDT_json',fld:'vRECETADETINTE_CIERRE_SDT_JSON',pic:''},{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV52Numeroregistros',fld:'vNUMEROREGISTROS',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK","{handler:'e2928Z2',iparms:[{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__INCIDENCIAS.CLICK",",oparms:[]}");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK","{handler:'e3028Z2',iparms:[{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150},{av:'AV29Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__BARAGREST.CLICK",",oparms:[]}");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK","{handler:'e3128Z2',iparms:[{av:'AV57RecetadeTinte_Cierre_SDT',fld:'vRECETADETINTE_CIERRE_SDT',grid:150,pic:''},{av:'nGXsfl_150_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:150},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_150',ctrl:'GRID',prop:'GridRC',grid:150}]");
      setEventMetadata("RECETADETINTE_CIERRE_SDT__SELECCIONAR.CLICK",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv30',iparms:[]");
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
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_anyadirproductos_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV22ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV95Pgmname = "" ;
      AV36FilterFullText = "" ;
      AV29Emprcod = "" ;
      AV11BarCodParIN = "" ;
      AV89inicio = GXutil.resetTime( GXutil.nullDate() );
      AV90fin = GXutil.resetTime( GXutil.nullDate() );
      AV56RecAcab = "" ;
      AV57RecetadeTinte_Cierre_SDT = new GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item>(app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV48ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV27DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV71UsurCod = "" ;
      AV66Station = "" ;
      AV34FecCieTin = GXutil.nullDate() ;
      AV60Recfec = GXutil.nullDate() ;
      AV74RecHayAny = "" ;
      AV54productosconsumos = "" ;
      AV59RecetadeTinte_Cierre_SDT_json = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV78HreFecTin = GXutil.nullDate() ;
      AV35FechaCierre = GXutil.nullDate() ;
      AV75FechaCierreHasta = GXutil.nullDate() ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnsearch_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTxtmensaje_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab02_title_Jsonclick = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblocknumeroregistros_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucPopover_numeroregistros = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV28DetailWebComponent = "" ;
      hsh = "" ;
      AV31EmprNom = "" ;
      AV44HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV72WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV65Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV50ManageFiltersXml = "" ;
      AV55ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      AV5websession = httpContext.getWebSession();
      AV33ExcelFilename = "" ;
      AV32ErrorMessage = "" ;
      AV16BatchCode = "" ;
      AV10BarCodPar = "" ;
      AV70UserCustomValue = "" ;
      GXt_char1 = "" ;
      AV23ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      ucDvelop_confirmpanel_anyadirproductos = new com.genexus.webpanels.GXUserControl();
      AV51MaqCod = "" ;
      AV63RecTotKgm = DecimalUtil.ZERO ;
      AV14barnhdr = "" ;
      AV45Inc_obs = "" ;
      AV91messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV92message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV58RecetadeTinte_Cierre_SDT_item = new app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item(remoteHandle, context);
      GXv_objcol_SdtMessages_Message16 = new GXBaseCollection[1] ;
      AV17Ca_diahora = GXutil.resetTime( GXutil.nullDate() );
      GXv_char4 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int17 = new byte[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_char20 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_dtime23 = new java.util.Date[1] ;
      GXv_int24 = new byte[1] ;
      GXv_char25 = new String[1] ;
      GXv_int26 = new int[1] ;
      GXv_char27 = new String[1] ;
      GXv_char28 = new String[1] ;
      GXv_date29 = new java.util.Date[1] ;
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV6Window = new com.genexus.webpanels.GXWindow();
      AV7BarAgrEst = "" ;
      Gx_msg = "" ;
      lblNumeroregistros_popoverimage_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetintecierrewwp__default(),
         new Object[] {
         }
      );
      Gx_date = GXutil.today( ) ;
      AV95Pgmname = "FormulacionTinte.RecetadeTinteCierreWwp" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV95Pgmname = "FormulacionTinte.RecetadeTinteCierreWwp" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      edtavNumeroregistros_Enabled = 0 ;
      cmbavRecetadetinte_cierre_sdt__pesado.setEnabled( 0 );
      cmbavRecetadetinte_cierre_sdt__adicion.setEnabled( 0 );
      edtavRecetadetinte_cierre_sdt__rechayany_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__incidencias_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodreo_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcodpar_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barsit_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__baragrest_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barser_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barserdsc_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnom_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barcolnum_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__bartipcol_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnomcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumcli_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__maqcod_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recvolprd_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__recfecalt_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__barnumany_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__lconti_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__hisreh_Enabled = 0 ;
      edtavRecetadetinte_cierre_sdt__batchcode_Enabled = 0 ;
      cmbavRecetadetinte_cierre_sdt__recnropar.setEnabled( 0 );
      edtavRecetadetinte_cierre_sdt__weigprodid_Enabled = 0 ;
      cmbavRecetadetinte_cierre_sdt__colorservicedatos.setEnabled( 0 );
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV49ManageFiltersExecutionStep ;
   private byte AV13BarCodReoIN ;
   private byte gxajaxcallmode ;
   private byte AV18Cc_almcod ;
   private byte AV37FlagM ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV77SiFecha ;
   private byte GXt_int7 ;
   private byte AV12BarCodReo ;
   private byte AV76RecNumAny ;
   private byte GXv_int8[] ;
   private byte GXv_int17[] ;
   private byte GXv_int24[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV21colorservicecontador ;
   private short AV19clienteModa21 ;
   private short AV73SiCSV ;
   private short AV25Consumos ;
   private short AV47j ;
   private short wbEnd ;
   private short wbStart ;
   private short AV43grupodeacciones ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV61reclinmaq ;
   private short AV20Colorservice ;
   private short AV15barnumany ;
   private short AV67t ;
   private short GXv_int18[] ;
   private short GXv_int19[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_150 ;
   private int nGXsfl_150_idx=1 ;
   private int AV9BarCodIN ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int Popover_numeroregistros_Popoverwidth ;
   private int edtavHrefectin_Enabled ;
   private int edtavBarcodin_Enabled ;
   private int edtavBarcodreoin_Enabled ;
   private int edtavBarcodparin_Enabled ;
   private int edtavFechacierre_Enabled ;
   private int edtavFechacierrehasta_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV96GXV1 ;
   private int subGrid_Islastpage ;
   private int edtavNumeroregistros_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__rechayany_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__incidencias_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcod_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcodreo_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcodpar_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__reclinmaq_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barsit_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__baragrest_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barser_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barserdsc_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcolnom_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barcolnum_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__bartipcol_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barnomcli_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barnumcli_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__maqcod_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__rectotkgm_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__recvolprd_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__recfecalt_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__barnumany_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__lconti_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__hisreh_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__batchcode_Enabled ;
   private int edtavRecetadetinte_cierre_sdt__weigprodid_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_150_fel_idx=1 ;
   private int AV26ContVal ;
   private int GXt_int9 ;
   private int edtavRecetadetinte_cierre_sdt__rechayany_Visible ;
   private int edtavRecetadetinte_cierre_sdt__incidencias_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcod_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcodreo_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcodpar_Visible ;
   private int edtavRecetadetinte_cierre_sdt__reclinmaq_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barsit_Visible ;
   private int edtavRecetadetinte_cierre_sdt__baragrest_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barser_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barserdsc_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcolnom_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barcolnum_Visible ;
   private int edtavRecetadetinte_cierre_sdt__bartipcol_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barnomcli_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barnumcli_Visible ;
   private int edtavRecetadetinte_cierre_sdt__maqcod_Visible ;
   private int edtavRecetadetinte_cierre_sdt__rectotkgm_Visible ;
   private int edtavRecetadetinte_cierre_sdt__recvolprd_Visible ;
   private int edtavRecetadetinte_cierre_sdt__recfecalt_Visible ;
   private int edtavRecetadetinte_cierre_sdt__barnumany_Visible ;
   private int edtavRecetadetinte_cierre_sdt__lconti_Visible ;
   private int edtavRecetadetinte_cierre_sdt__hisreh_Visible ;
   private int edtavRecetadetinte_cierre_sdt__batchcode_Visible ;
   private int edtavRecetadetinte_cierre_sdt__weigprodid_Visible ;
   private int nGXsfl_150_bak_idx=1 ;
   private int AV53PageToGo ;
   private int AV8BarCod ;
   private int AV62RecNroPar ;
   private int AV64RecVolPrd ;
   private int AV127GXV31 ;
   private int AV128GXV32 ;
   private int AV129GXV33 ;
   private int GXv_int10[] ;
   private int GXv_int26[] ;
   private int AV130GXV34 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV39GridCurrentPage ;
   private long AV40GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV52Numeroregistros ;
   private java.math.BigDecimal AV63RecTotKgm ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_anyadirproductos_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_150_idx="0001" ;
   private String AV95Pgmname ;
   private String AV29Emprcod ;
   private String AV11BarCodParIN ;
   private String AV56RecAcab ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV71UsurCod ;
   private String AV66Station ;
   private String AV74RecHayAny ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Popover_numeroregistros_Iteminternalname ;
   private String Popover_numeroregistros_Trigger ;
   private String Popover_numeroregistros_Position ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_anyadirproductos_Title ;
   private String Dvelop_confirmpanel_anyadirproductos_Confirmationtext ;
   private String Dvelop_confirmpanel_anyadirproductos_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Nobuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_anyadirproductos_Yesbuttonposition ;
   private String Dvelop_confirmpanel_anyadirproductos_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavHrefectin_Internalname ;
   private String TempTags ;
   private String edtavHrefectin_Jsonclick ;
   private String edtavBarcodin_Internalname ;
   private String edtavBarcodin_Jsonclick ;
   private String edtavBarcodreoin_Internalname ;
   private String edtavBarcodreoin_Jsonclick ;
   private String edtavBarcodparin_Internalname ;
   private String edtavBarcodparin_Jsonclick ;
   private String edtavFechacierre_Internalname ;
   private String edtavFechacierre_Jsonclick ;
   private String edtavFechacierrehasta_Internalname ;
   private String edtavFechacierrehasta_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnsearch_Internalname ;
   private String bttBtnsearch_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTxtmensaje_Internalname ;
   private String lblTxtmensaje_Caption ;
   private String lblTxtmensaje_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divTablec_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divResultadocontainer_Internalname ;
   private String divResultadoaction_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittednumeroregistros_Internalname ;
   private String lblTextblocknumeroregistros_Internalname ;
   private String lblTextblocknumeroregistros_Jsonclick ;
   private String divResultadogrid_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Popover_numeroregistros_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV28DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtavNumeroregistros_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__rechayany_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcodreo_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcodpar_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__reclinmaq_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barsit_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__baragrest_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barser_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barserdsc_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcolnom_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barcolnum_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__bartipcol_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barnomcli_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barnumcli_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__maqcod_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__rectotkgm_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__recvolprd_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__recfecalt_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__barnumany_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__lconti_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__hisreh_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__batchcode_Internalname ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Internalname ;
   private String sGXsfl_150_fel_idx="0001" ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV31EmprNom ;
   private String edtavRecetadetinte_cierre_sdt__rechayany_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Columnheaderclass ;
   private String edtavDetailwebcomponent_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barcodreo_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barcodpar_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__reclinmaq_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barsit_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__baragrest_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barser_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barserdsc_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barcolnom_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barcolnum_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__bartipcol_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barnomcli_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barnumcli_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__maqcod_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__rectotkgm_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__recvolprd_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__recfecalt_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__barnumany_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__lconti_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__hisreh_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__batchcode_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Columnheaderclass ;
   private String edtavRecetadetinte_cierre_sdt__rechayany_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Columnclass ;
   private String edtavDetailwebcomponent_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barcodreo_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barcodpar_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__reclinmaq_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barsit_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__baragrest_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barser_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barserdsc_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barcolnom_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barcolnum_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__bartipcol_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barnomcli_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barnumcli_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__maqcod_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__rectotkgm_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__recvolprd_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__recfecalt_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__barnumany_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__lconti_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__hisreh_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__batchcode_Columnclass ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Columnclass ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String AV16BatchCode ;
   private String AV10BarCodPar ;
   private String GXt_char1 ;
   private String Dvelop_confirmpanel_anyadirproductos_Internalname ;
   private String AV51MaqCod ;
   private String AV14barnhdr ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char20[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char25[] ;
   private String GXv_char27[] ;
   private String GXv_char28[] ;
   private String AV7BarAgrEst ;
   private String Gx_msg ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_anyadirproductos_Internalname ;
   private String tblTablemergednumeroregistros_Internalname ;
   private String edtavNumeroregistros_Jsonclick ;
   private String lblNumeroregistros_popoverimage_Internalname ;
   private String lblNumeroregistros_popoverimage_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavRecetadetinte_cierre_sdt__rechayany_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__incidencias_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcod_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcodreo_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcodpar_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__reclinmaq_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barsit_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__baragrest_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barser_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barserdsc_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcolnom_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barcolnum_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__bartipcol_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barnomcli_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barnumcli_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__maqcod_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__rectotkgm_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__recvolprd_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__recfecalt_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__barnumany_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__lconti_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__hisreh_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__batchcode_Jsonclick ;
   private String edtavRecetadetinte_cierre_sdt__weigprodid_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV89inicio ;
   private java.util.Date AV90fin ;
   private java.util.Date AV17Ca_diahora ;
   private java.util.Date GXv_dtime23[] ;
   private java.util.Date Gx_date ;
   private java.util.Date AV34FecCieTin ;
   private java.util.Date AV60Recfec ;
   private java.util.Date AV78HreFecTin ;
   private java.util.Date AV35FechaCierre ;
   private java.util.Date AV75FechaCierreHasta ;
   private java.util.Date GXv_date29[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV86LoadGridData ;
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
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_150_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean bDynCreated_Grid_dwc ;
   private boolean gx_BV150 ;
   private String AV59RecetadeTinte_Cierre_SDT_json ;
   private String AV24ColumnsSelectorXML ;
   private String AV50ManageFiltersXml ;
   private String AV70UserCustomValue ;
   private String AV36FilterFullText ;
   private String AV54productosconsumos ;
   private String AV33ExcelFilename ;
   private String AV32ErrorMessage ;
   private String AV45Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV6Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV44HTTPRequest ;
   private com.genexus.webpanels.WebSession AV65Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucPopover_numeroregistros ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_anyadirproductos ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGrupodeacciones ;
   private ICheckbox chkavRecetadetinte_cierre_sdt__seleccionar ;
   private HTMLChoice cmbavRecetadetinte_cierre_sdt__pesado ;
   private HTMLChoice cmbavRecetadetinte_cierre_sdt__adicion ;
   private HTMLChoice cmbavRecetadetinte_cierre_sdt__recnropar ;
   private HTMLChoice cmbavRecetadetinte_cierre_sdt__colorservicedatos ;
   private IDataStoreProvider pr_default ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV5websession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV48ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private GXBaseCollection<app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item> AV57RecetadeTinte_Cierre_SDT ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV91messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message16[] ;
   private com.genexus.SdtMessages_Message AV92message ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV27DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV55ProgressIndicator ;
   private app.formulaciontinte.SdtRecetadeTinte_Cierre_SDT_Item AV58RecetadeTinte_Cierre_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV72WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class recetadetintecierrewwp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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

