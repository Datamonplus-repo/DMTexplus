package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmordenww_impl extends GXDataArea
{
   public tmordenww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmordenww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmordenww_impl.class ));
   }

   public tmordenww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkavSel = UIFactory.getCheckbox(this);
      cmbOMEst = new HTMLChoice();
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
      nRC_GXsfl_57 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_57"))) ;
      nGXsfl_57_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_57_idx"))) ;
      sGXsfl_57_idx = httpContext.GetPar( "sGXsfl_57_idx") ;
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
      AV34ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV8ColumnsSelector);
      AV25FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV48TFOMCod = (int)(GXutil.lval( httpContext.GetPar( "TFOMCod"))) ;
      AV49TFOMCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFOMCod_To"))) ;
      AV84TFPMCod = (int)(GXutil.lval( httpContext.GetPar( "TFPMCod"))) ;
      AV85TFPMCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPMCod_To"))) ;
      AV139TFPMDsc = httpContext.GetPar( "TFPMDsc") ;
      AV140TFPMDsc_Sel = httpContext.GetPar( "TFPMDsc_Sel") ;
      AV64TFOMMaqCod = httpContext.GetPar( "TFOMMaqCod") ;
      AV65TFOMMaqCod_Sel = httpContext.GetPar( "TFOMMaqCod_Sel") ;
      AV68TFOMMaqDsc = httpContext.GetPar( "TFOMMaqDsc") ;
      AV69TFOMMaqDsc_Sel = httpContext.GetPar( "TFOMMaqDsc_Sel") ;
      AV66TFOMMaqCodFor = httpContext.GetPar( "TFOMMaqCodFor") ;
      AV67TFOMMaqCodFor_Sel = httpContext.GetPar( "TFOMMaqCodFor_Sel") ;
      AV52TFOMDscMqPla = httpContext.GetPar( "TFOMDscMqPla") ;
      AV53TFOMDscMqPla_Sel = httpContext.GetPar( "TFOMDscMqPla_Sel") ;
      AV86TFSMCod = (int)(GXutil.lval( httpContext.GetPar( "TFSMCod"))) ;
      AV87TFSMCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFSMCod_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV56TFOMEst_Sels);
      AV82TFOMUsuCre = httpContext.GetPar( "TFOMUsuCre") ;
      AV83TFOMUsuCre_Sel = httpContext.GetPar( "TFOMUsuCre_Sel") ;
      AV60TFOMFchCre = localUtil.parseDTimeParm( httpContext.GetPar( "TFOMFchCre")) ;
      AV80TFOMTxt = httpContext.GetPar( "TFOMTxt") ;
      AV81TFOMTxt_Sel = httpContext.GetPar( "TFOMTxt_Sel") ;
      AV62TFOMFchPre = localUtil.parseDateParm( httpContext.GetPar( "TFOMFchPre")) ;
      AV58TFOMFchCer = localUtil.parseDTimeParm( httpContext.GetPar( "TFOMFchCer")) ;
      AV54TFOMDuracion = httpContext.GetPar( "TFOMDuracion") ;
      AV55TFOMDuracion_Sel = httpContext.GetPar( "TFOMDuracion_Sel") ;
      AV50TFOMCosRea = CommonUtil.decimalVal( httpContext.GetPar( "TFOMCosRea"), ".") ;
      AV51TFOMCosRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFOMCosRea_To"), ".") ;
      AV78TFOMRRCosT = CommonUtil.decimalVal( httpContext.GetPar( "TFOMRRCosT"), ".") ;
      AV79TFOMRRCosT_To = CommonUtil.decimalVal( httpContext.GetPar( "TFOMRRCosT_To"), ".") ;
      AV76TFOMRCCosT = CommonUtil.decimalVal( httpContext.GetPar( "TFOMRCCosT"), ".") ;
      AV77TFOMRCCosT_To = CommonUtil.decimalVal( httpContext.GetPar( "TFOMRCCosT_To"), ".") ;
      AV72TFOMMRCosT = CommonUtil.decimalVal( httpContext.GetPar( "TFOMMRCosT"), ".") ;
      AV73TFOMMRCosT_To = CommonUtil.decimalVal( httpContext.GetPar( "TFOMMRCosT_To"), ".") ;
      AV70TFOMMCCosT = CommonUtil.decimalVal( httpContext.GetPar( "TFOMMCCosT"), ".") ;
      AV71TFOMMCCosT_To = CommonUtil.decimalVal( httpContext.GetPar( "TFOMMCCosT_To"), ".") ;
      AV74TFOMNot = httpContext.GetPar( "TFOMNot") ;
      AV75TFOMNot_Sel = httpContext.GetPar( "TFOMNot_Sel") ;
      AV189Pgmname = httpContext.GetPar( "Pgmname") ;
      AV38OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV40OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV124GroupBy = httpContext.GetPar( "GroupBy") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV129GridCollapsedRecords);
      AV126GroupKey = httpContext.GetPar( "GroupKey") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV128GridCollapsedRecordsChildren);
      AV20EmprCod = httpContext.GetPar( "EmprCod") ;
      AV92UsurCod = httpContext.GetPar( "UsurCod") ;
      AV43Station = httpContext.GetPar( "Station") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV34ManageFiltersExecutionStep, AV8ColumnsSelector, AV25FilterFullText, AV48TFOMCod, AV49TFOMCod_To, AV84TFPMCod, AV85TFPMCod_To, AV139TFPMDsc, AV140TFPMDsc_Sel, AV64TFOMMaqCod, AV65TFOMMaqCod_Sel, AV68TFOMMaqDsc, AV69TFOMMaqDsc_Sel, AV66TFOMMaqCodFor, AV67TFOMMaqCodFor_Sel, AV52TFOMDscMqPla, AV53TFOMDscMqPla_Sel, AV86TFSMCod, AV87TFSMCod_To, AV56TFOMEst_Sels, AV82TFOMUsuCre, AV83TFOMUsuCre_Sel, AV60TFOMFchCre, AV80TFOMTxt, AV81TFOMTxt_Sel, AV62TFOMFchPre, AV58TFOMFchCer, AV54TFOMDuracion, AV55TFOMDuracion_Sel, AV50TFOMCosRea, AV51TFOMCosRea_To, AV78TFOMRRCosT, AV79TFOMRRCosT_To, AV76TFOMRCCosT, AV77TFOMRCCosT_To, AV72TFOMMRCosT, AV73TFOMMRCosT_To, AV70TFOMMCCosT, AV71TFOMMCCosT_To, AV74TFOMNot, AV75TFOMNot_Sel, AV189Pgmname, AV38OrderedBy, AV40OrderedDsc, AV124GroupBy, AV129GridCollapsedRecords, AV126GroupKey, AV128GridCollapsedRecordsChildren, AV20EmprCod, AV92UsurCod, AV43Station) ;
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
      paYH2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startYH2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmordenww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_57", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV33ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV8ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV8ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV34ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMCOD", GXutil.ltrim( localUtil.ntoc( AV48TFOMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV49TFOMCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMCOD", GXutil.ltrim( localUtil.ntoc( AV84TFPMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV85TFPMCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDSC", GXutil.rtrim( AV139TFPMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDSC_SEL", GXutil.rtrim( AV140TFPMDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMAQCOD", GXutil.rtrim( AV64TFOMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMAQCOD_SEL", GXutil.rtrim( AV65TFOMMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMAQDSC", GXutil.rtrim( AV68TFOMMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMAQDSC_SEL", GXutil.rtrim( AV69TFOMMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMAQCODFOR", GXutil.rtrim( AV66TFOMMaqCodFor));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMAQCODFOR_SEL", GXutil.rtrim( AV67TFOMMaqCodFor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMDSCMQPLA", GXutil.rtrim( AV52TFOMDscMqPla));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMDSCMQPLA_SEL", GXutil.rtrim( AV53TFOMDscMqPla_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMCOD", GXutil.ltrim( localUtil.ntoc( AV86TFSMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV87TFSMCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFOMEST_SELS", AV56TFOMEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFOMEST_SELS", AV56TFOMEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMUSUCRE", GXutil.rtrim( AV82TFOMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMUSUCRE_SEL", GXutil.rtrim( AV83TFOMUsuCre_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMFCHCRE", localUtil.ttoc( AV60TFOMFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMTXT", AV80TFOMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMTXT_SEL", AV81TFOMTxt_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMFCHPRE", localUtil.dtoc( AV62TFOMFchPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMFCHCER", localUtil.ttoc( AV58TFOMFchCer, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMDURACION", AV54TFOMDuracion);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMDURACION_SEL", AV55TFOMDuracion_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMCOSREA", GXutil.ltrim( localUtil.ntoc( AV50TFOMCosRea, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMCOSREA_TO", GXutil.ltrim( localUtil.ntoc( AV51TFOMCosRea_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMRRCOST", GXutil.ltrim( localUtil.ntoc( AV78TFOMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMRRCOST_TO", GXutil.ltrim( localUtil.ntoc( AV79TFOMRRCosT_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMRCCOST", GXutil.ltrim( localUtil.ntoc( AV76TFOMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMRCCOST_TO", GXutil.ltrim( localUtil.ntoc( AV77TFOMRCCosT_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMRCOST", GXutil.ltrim( localUtil.ntoc( AV72TFOMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMRCOST_TO", GXutil.ltrim( localUtil.ntoc( AV73TFOMMRCosT_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMCCOST", GXutil.ltrim( localUtil.ntoc( AV70TFOMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMMCCOST_TO", GXutil.ltrim( localUtil.ntoc( AV71TFOMMCCosT_To, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMNOT", AV74TFOMNot);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMNOT_SEL", AV75TFOMNot_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV189Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV38OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV40OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPBY", AV124GroupBy);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDS", AV129GridCollapsedRecords);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDS", AV129GridCollapsedRecords);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPKEY", AV126GroupKey);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDSCHILDREN", AV128GridCollapsedRecordsChildren);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDSCHILDREN", AV128GridCollapsedRecordsChildren);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV28GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV28GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFOMEST_SELSJSON", AV57TFOMEst_SelsJson);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vADDCHILDREN", AV133AddChildren);
      app.GxWebStd.gx_hidden_field( httpContext, "vACCION", GXutil.rtrim( AV6Accion));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV21EmprCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vOMCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV36OMCod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV92UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV43Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCAR", AV144Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV145ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV145ObjetoRefrescar);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vDELETE", GXutil.rtrim( AV19Delete));
      app.GxWebStd.gx_hidden_field( httpContext, "vUPDATE", GXutil.rtrim( AV90Update));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowgroup", GXutil.rtrim( Ddo_grid_Allowgroup));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Title", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Title", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Title", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Gridinternalname", GXutil.rtrim( Grid_group_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Columnindex", GXutil.ltrim( localUtil.ntoc( Grid_group_Columnindex, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hasrowgroups", GXutil.booltostr( Grid_empowerer_Hasrowgroups));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedtext_get", GXutil.rtrim( Ddo_grid_Selectedtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Result", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Result", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedtext_get", GXutil.rtrim( Ddo_grid_Selectedtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Result", GXutil.rtrim( Dvelop_confirmpanel_imprimirorden_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Result", GXutil.rtrim( Dvelop_confirmpanel_modificarordencerrada_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRARORDEN_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrarorden_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarordenes_Result));
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
         weYH2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtYH2( ) ;
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
      return formatLink("app.tmordenww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMOrdenWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Ordenes de Mantenimiento", "") ;
   }

   public void wbYH0( )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarordenes_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Ordenes", ""), bttBtneliminarordenes_Jsonclick, 7, httpContext.getMessage( "Eliminar Ordenes", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11yh1_client"+"'", TempTags, "", 2, "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlistado_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Listado", ""), bttBtnlistado_Jsonclick, 5, httpContext.getMessage( "Listado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLISTADO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlistadodetalle_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Listado Detalle", ""), bttBtnlistadodetalle_Jsonclick, 5, httpContext.getMessage( "Listado Detalle", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLISTADODETALLE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlistadotrabajo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Listado Trabajo", ""), bttBtnlistadotrabajo_Jsonclick, 7, httpContext.getMessage( "Listado Trabajo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12yh1_client"+"'", TempTags, "", 2, "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcelwin_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel (Win)", ""), bttBtnexcelwin_Jsonclick, 5, httpContext.getMessage( "Excel (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXCELWIN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_39_YH2( true) ;
      }
      else
      {
         wb_table1_39_YH2( false) ;
      }
      return  ;
   }

   public void wb_table1_39_YH2e( boolean wbgen )
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol57( ) ;
      }
      if ( wbEnd == 57 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_57 = (int)(nGXsfl_57_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("AllowGroup", Ddo_grid_Allowgroup);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV8ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_94_YH2( true) ;
      }
      else
      {
         wb_table2_94_YH2( false) ;
      }
      return  ;
   }

   public void wb_table2_94_YH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_99_YH2( true) ;
      }
      else
      {
         wb_table3_99_YH2( false) ;
      }
      return  ;
   }

   public void wb_table3_99_YH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_104_YH2( true) ;
      }
      else
      {
         wb_table4_104_YH2( false) ;
      }
      return  ;
   }

   public void wb_table4_104_YH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_109_YH2( true) ;
      }
      else
      {
         wb_table5_109_YH2( false) ;
      }
      return  ;
   }

   public void wb_table5_109_YH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_group.setProperty("ColumnIndex", Grid_group_Columnindex);
         ucGrid_group.render(context, "dvelop.dvgroupby", Grid_group_Internalname, "GRID_GROUPContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("HasRowGroups", Grid_empowerer_Hasrowgroups);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_omfchcreauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_omfchcreauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_omfchcreauxdate_Internalname, localUtil.format(AV14DDO_OMFchCreAuxDate, "99/99/99"), localUtil.format( AV14DDO_OMFchCreAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,117);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_omfchcreauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_omfchcreauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrdenWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_omfchpreauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_omfchpreauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_omfchpreauxdate_Internalname, localUtil.format(AV16DDO_OMFchPreAuxDate, "99/99/99"), localUtil.format( AV16DDO_OMFchPreAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_omfchpreauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_omfchpreauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrdenWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_omfchcerauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_omfchcerauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_omfchcerauxdate_Internalname, localUtil.format(AV12DDO_OMFchCerAuxDate, "99/99/99"), localUtil.format( AV12DDO_OMFchCerAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_omfchcerauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_omfchcerauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMOrdenWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 57 )
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

   public void startYH2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Ordenes de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupYH0( ) ;
   }

   public void wsYH2( )
   {
      startYH2( ) ;
      evtYH2( ) ;
   }

   public void evtYH2( )
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
                           e13YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CERRARORDEN.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARORDENES.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e21YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e22YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExcel' */
                           e23YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLISTADO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoListado' */
                           e24YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLISTADODETALLE'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoListadoDetalle' */
                           e25YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCELWIN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExcelWin' */
                           e26YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e27YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e28YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e29YH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e30YH2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) )
                        {
                           nGXsfl_57_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_572( ) ;
                           AV134Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV134Expand);
                           AV123Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV123Grid_GroupCaption);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV122GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122GridActions), 4, 0));
                           AV146Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV146Sel);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9429PMCod = false ;
                           A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
                           n9473PMDsc = false ;
                           A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
                           A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
                           n9427OMMaqDsc = false ;
                           A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
                           n13679OMMaqCodFo = false ;
                           A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
                           n13678OMDscMqPla = false ;
                           A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9428SMCod = false ;
                           cmbOMEst.setName( cmbOMEst.getInternalname() );
                           cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
                           A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
                           A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
                           A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname), 0) ;
                           A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
                           A9438OMFchPre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtOMFchPre_Internalname), 0)) ;
                           A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname), 0) ;
                           A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
                           A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
                           A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
                           A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
                           A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
                           A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
                           A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e31YH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e32YH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e33YH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXPAND.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e34YH2 ();
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

   public void weYH2( )
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

   public void paYH2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_572( ) ;
      while ( nGXsfl_57_idx <= nRC_GXsfl_57 )
      {
         sendrow_572( ) ;
         nGXsfl_57_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV34ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelector ,
                                 String AV25FilterFullText ,
                                 int AV48TFOMCod ,
                                 int AV49TFOMCod_To ,
                                 int AV84TFPMCod ,
                                 int AV85TFPMCod_To ,
                                 String AV139TFPMDsc ,
                                 String AV140TFPMDsc_Sel ,
                                 String AV64TFOMMaqCod ,
                                 String AV65TFOMMaqCod_Sel ,
                                 String AV68TFOMMaqDsc ,
                                 String AV69TFOMMaqDsc_Sel ,
                                 String AV66TFOMMaqCodFor ,
                                 String AV67TFOMMaqCodFor_Sel ,
                                 String AV52TFOMDscMqPla ,
                                 String AV53TFOMDscMqPla_Sel ,
                                 int AV86TFSMCod ,
                                 int AV87TFSMCod_To ,
                                 GXSimpleCollection<String> AV56TFOMEst_Sels ,
                                 String AV82TFOMUsuCre ,
                                 String AV83TFOMUsuCre_Sel ,
                                 java.util.Date AV60TFOMFchCre ,
                                 String AV80TFOMTxt ,
                                 String AV81TFOMTxt_Sel ,
                                 java.util.Date AV62TFOMFchPre ,
                                 java.util.Date AV58TFOMFchCer ,
                                 String AV54TFOMDuracion ,
                                 String AV55TFOMDuracion_Sel ,
                                 java.math.BigDecimal AV50TFOMCosRea ,
                                 java.math.BigDecimal AV51TFOMCosRea_To ,
                                 java.math.BigDecimal AV78TFOMRRCosT ,
                                 java.math.BigDecimal AV79TFOMRRCosT_To ,
                                 java.math.BigDecimal AV76TFOMRCCosT ,
                                 java.math.BigDecimal AV77TFOMRCCosT_To ,
                                 java.math.BigDecimal AV72TFOMMRCosT ,
                                 java.math.BigDecimal AV73TFOMMRCosT_To ,
                                 java.math.BigDecimal AV70TFOMMCCosT ,
                                 java.math.BigDecimal AV71TFOMMCCosT_To ,
                                 String AV74TFOMNot ,
                                 String AV75TFOMNot_Sel ,
                                 String AV189Pgmname ,
                                 short AV38OrderedBy ,
                                 boolean AV40OrderedDsc ,
                                 String AV124GroupBy ,
                                 GXSimpleCollection<String> AV129GridCollapsedRecords ,
                                 String AV126GroupKey ,
                                 GXSimpleCollection<String> AV128GridCollapsedRecordsChildren ,
                                 String AV20EmprCod ,
                                 String AV92UsurCod ,
                                 String AV43Station )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e32YH2 ();
      GRID_nCurrentRecord = 0 ;
      rfYH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      rfYH2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV189Pgmname = "TMOrdenWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_57_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV167Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV151Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV152Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV153Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV154Tmordenwwds_5_tfpmcod_to) ,
                                           AV156Tmordenwwds_7_tfpmdsc_sel ,
                                           AV155Tmordenwwds_6_tfpmdsc ,
                                           AV158Tmordenwwds_9_tfommaqcod_sel ,
                                           AV157Tmordenwwds_8_tfommaqcod ,
                                           AV160Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV159Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV165Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV166Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV167Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV169Tmordenwwds_20_tfomusucre_sel ,
                                           AV168Tmordenwwds_19_tfomusucre ,
                                           AV170Tmordenwwds_21_tfomfchcre ,
                                           AV172Tmordenwwds_23_tfomtxt_sel ,
                                           AV171Tmordenwwds_22_tfomtxt ,
                                           AV173Tmordenwwds_24_tfomfchpre ,
                                           AV174Tmordenwwds_25_tfomfchcer ,
                                           AV179Tmordenwwds_30_tfomrrcost ,
                                           AV180Tmordenwwds_31_tfomrrcost_to ,
                                           AV181Tmordenwwds_32_tfomrccost ,
                                           AV182Tmordenwwds_33_tfomrccost_to ,
                                           AV183Tmordenwwds_34_tfommrcost ,
                                           AV184Tmordenwwds_35_tfommrcost_to ,
                                           AV185Tmordenwwds_36_tfommccost ,
                                           AV186Tmordenwwds_37_tfommccost_to ,
                                           AV188Tmordenwwds_39_tfomnot_sel ,
                                           AV187Tmordenwwds_38_tfomnot ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           Short.valueOf(AV38OrderedBy) ,
                                           Boolean.valueOf(AV40OrderedDsc) ,
                                           AV150Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV162Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV161Tmordenwwds_12_tfommaqcodfor ,
                                           AV164Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV163Tmordenwwds_14_tfomdscmqpla ,
                                           AV176Tmordenwwds_27_tfomduracion_sel ,
                                           AV175Tmordenwwds_26_tfomduracion ,
                                           AV177Tmordenwwds_28_tfomcosrea ,
                                           AV178Tmordenwwds_29_tfomcosrea_to ,
                                           Integer.valueOf(AV128GridCollapsedRecordsChildren.size()) ,
                                           A396EmprCod ,
                                           AV128GridCollapsedRecordsChildren } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV161Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV161Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV163Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV163Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV155Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV155Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV157Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV157Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV159Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV159Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV168Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV168Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV171Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV171Tmordenwwds_22_tfomtxt), "%", "") ;
      lV187Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV187Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor H00YH7 */
      pr_default.execute(0, new Object[] {AV162Tmordenwwds_13_tfommaqcodfor_sel, AV161Tmordenwwds_12_tfommaqcodfor, lV161Tmordenwwds_12_tfommaqcodfor, AV162Tmordenwwds_13_tfommaqcodfor_sel, AV162Tmordenwwds_13_tfommaqcodfor_sel, AV164Tmordenwwds_15_tfomdscmqpla_sel, AV163Tmordenwwds_14_tfomdscmqpla, lV163Tmordenwwds_14_tfomdscmqpla, AV164Tmordenwwds_15_tfomdscmqpla_sel, AV164Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV151Tmordenwwds_2_tfomcod), Integer.valueOf(AV152Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV153Tmordenwwds_4_tfpmcod), Integer.valueOf(AV154Tmordenwwds_5_tfpmcod_to), lV155Tmordenwwds_6_tfpmdsc, AV156Tmordenwwds_7_tfpmdsc_sel, lV157Tmordenwwds_8_tfommaqcod, AV158Tmordenwwds_9_tfommaqcod_sel, lV159Tmordenwwds_10_tfommaqdsc, AV160Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV165Tmordenwwds_16_tfsmcod), Integer.valueOf(AV166Tmordenwwds_17_tfsmcod_to), lV168Tmordenwwds_19_tfomusucre, AV169Tmordenwwds_20_tfomusucre_sel, AV170Tmordenwwds_21_tfomfchcre, lV171Tmordenwwds_22_tfomtxt, AV172Tmordenwwds_23_tfomtxt_sel, AV173Tmordenwwds_24_tfomfchpre, AV174Tmordenwwds_25_tfomfchcer, AV179Tmordenwwds_30_tfomrrcost, AV180Tmordenwwds_31_tfomrrcost_to, AV181Tmordenwwds_32_tfomrccost, AV182Tmordenwwds_33_tfomrccost_to, AV183Tmordenwwds_34_tfommrcost, AV184Tmordenwwds_35_tfommrcost_to, AV185Tmordenwwds_36_tfommccost, AV186Tmordenwwds_37_tfommccost_to, lV187Tmordenwwds_38_tfomnot, AV188Tmordenwwds_39_tfomnot_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9464OMNot = H00YH7_A9464OMNot[0] ;
         A9439OMFchCer = H00YH7_A9439OMFchCer[0] ;
         A9438OMFchPre = H00YH7_A9438OMFchPre[0] ;
         A9433OMTxt = H00YH7_A9433OMTxt[0] ;
         A9436OMFchCre = H00YH7_A9436OMFchCre[0] ;
         A9437OMUsuCre = H00YH7_A9437OMUsuCre[0] ;
         A9428SMCod = H00YH7_A9428SMCod[0] ;
         n9428SMCod = H00YH7_n9428SMCod[0] ;
         A9427OMMaqDsc = H00YH7_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H00YH7_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = H00YH7_A9426OMMaqCod[0] ;
         A9473PMDsc = H00YH7_A9473PMDsc[0] ;
         n9473PMDsc = H00YH7_n9473PMDsc[0] ;
         A9429PMCod = H00YH7_A9429PMCod[0] ;
         n9429PMCod = H00YH7_n9429PMCod[0] ;
         A9425OMCod = H00YH7_A9425OMCod[0] ;
         A407EmprNom = H00YH7_A407EmprNom[0] ;
         n407EmprNom = H00YH7_n407EmprNom[0] ;
         A396EmprCod = H00YH7_A396EmprCod[0] ;
         A13678OMDscMqPla = H00YH7_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = H00YH7_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = H00YH7_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = H00YH7_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = H00YH7_A9441OMMCCosT[0] ;
         A9443OMRCCosT = H00YH7_A9443OMRCCosT[0] ;
         A9445OMEst = H00YH7_A9445OMEst[0] ;
         A9442OMMRCosT = H00YH7_A9442OMMRCosT[0] ;
         A9444OMRRCosT = H00YH7_A9444OMRRCosT[0] ;
         A407EmprNom = H00YH7_A407EmprNom[0] ;
         n407EmprNom = H00YH7_n407EmprNom[0] ;
         A9427OMMaqDsc = H00YH7_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H00YH7_n9427OMMaqDsc[0] ;
         A9473PMDsc = H00YH7_A9473PMDsc[0] ;
         n9473PMDsc = H00YH7_n9473PMDsc[0] ;
         A9441OMMCCosT = H00YH7_A9441OMMCCosT[0] ;
         A9442OMMRCosT = H00YH7_A9442OMMRCosT[0] ;
         A9443OMRCCosT = H00YH7_A9443OMRCCosT[0] ;
         A9444OMRRCosT = H00YH7_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = H00YH7_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = H00YH7_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = H00YH7_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = H00YH7_n13679OMMaqCodFo[0] ;
         if ( ! ( (GXutil.strcmp("", AV176Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV175Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV175Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV176Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV176Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( ( AV128GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9425OMCod, 8, 0)), AV128GridCollapsedRecordsChildren) ) )
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
                  {
                     A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
                  }
                  else
                  {
                     if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                     {
                        A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                     }
                     else
                     {
                        A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  if ( (GXutil.strcmp("", AV150Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pendiente", "") , GXutil.padr( "%" + GXutil.lower( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "realizada", "") , GXutil.padr( "%" + GXutil.lower( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "R") == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV177Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV178Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                        {
                           GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfYH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(57) ;
      /* Execute user event: Refresh */
      e32YH2 ();
      nGXsfl_57_idx = 1 ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_572( ) ;
      bGXsfl_57_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_572( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A9445OMEst ,
                                              AV167Tmordenwwds_18_tfomest_sels ,
                                              Integer.valueOf(AV151Tmordenwwds_2_tfomcod) ,
                                              Integer.valueOf(AV152Tmordenwwds_3_tfomcod_to) ,
                                              Integer.valueOf(AV153Tmordenwwds_4_tfpmcod) ,
                                              Integer.valueOf(AV154Tmordenwwds_5_tfpmcod_to) ,
                                              AV156Tmordenwwds_7_tfpmdsc_sel ,
                                              AV155Tmordenwwds_6_tfpmdsc ,
                                              AV158Tmordenwwds_9_tfommaqcod_sel ,
                                              AV157Tmordenwwds_8_tfommaqcod ,
                                              AV160Tmordenwwds_11_tfommaqdsc_sel ,
                                              AV159Tmordenwwds_10_tfommaqdsc ,
                                              Integer.valueOf(AV165Tmordenwwds_16_tfsmcod) ,
                                              Integer.valueOf(AV166Tmordenwwds_17_tfsmcod_to) ,
                                              Integer.valueOf(AV167Tmordenwwds_18_tfomest_sels.size()) ,
                                              AV169Tmordenwwds_20_tfomusucre_sel ,
                                              AV168Tmordenwwds_19_tfomusucre ,
                                              AV170Tmordenwwds_21_tfomfchcre ,
                                              AV172Tmordenwwds_23_tfomtxt_sel ,
                                              AV171Tmordenwwds_22_tfomtxt ,
                                              AV173Tmordenwwds_24_tfomfchpre ,
                                              AV174Tmordenwwds_25_tfomfchcer ,
                                              AV179Tmordenwwds_30_tfomrrcost ,
                                              AV180Tmordenwwds_31_tfomrrcost_to ,
                                              AV181Tmordenwwds_32_tfomrccost ,
                                              AV182Tmordenwwds_33_tfomrccost_to ,
                                              AV183Tmordenwwds_34_tfommrcost ,
                                              AV184Tmordenwwds_35_tfommrcost_to ,
                                              AV185Tmordenwwds_36_tfommccost ,
                                              AV186Tmordenwwds_37_tfommccost_to ,
                                              AV188Tmordenwwds_39_tfomnot_sel ,
                                              AV187Tmordenwwds_38_tfomnot ,
                                              Integer.valueOf(A9425OMCod) ,
                                              Integer.valueOf(A9429PMCod) ,
                                              A9473PMDsc ,
                                              A9426OMMaqCod ,
                                              A9427OMMaqDsc ,
                                              Integer.valueOf(A9428SMCod) ,
                                              A9437OMUsuCre ,
                                              A9436OMFchCre ,
                                              A9433OMTxt ,
                                              A9438OMFchPre ,
                                              A9439OMFchCer ,
                                              A9444OMRRCosT ,
                                              A9443OMRCCosT ,
                                              A9442OMMRCosT ,
                                              A9441OMMCCosT ,
                                              A9464OMNot ,
                                              Short.valueOf(AV38OrderedBy) ,
                                              Boolean.valueOf(AV40OrderedDsc) ,
                                              AV150Tmordenwwds_1_filterfulltext ,
                                              A13679OMMaqCodFo ,
                                              A13678OMDscMqPla ,
                                              A13680OMDuracion ,
                                              A9440OMCosRea ,
                                              AV162Tmordenwwds_13_tfommaqcodfor_sel ,
                                              AV161Tmordenwwds_12_tfommaqcodfor ,
                                              AV164Tmordenwwds_15_tfomdscmqpla_sel ,
                                              AV163Tmordenwwds_14_tfomdscmqpla ,
                                              AV176Tmordenwwds_27_tfomduracion_sel ,
                                              AV175Tmordenwwds_26_tfomduracion ,
                                              AV177Tmordenwwds_28_tfomcosrea ,
                                              AV178Tmordenwwds_29_tfomcosrea_to ,
                                              Integer.valueOf(AV128GridCollapsedRecordsChildren.size()) ,
                                              A396EmprCod ,
                                              AV128GridCollapsedRecordsChildren } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV161Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV161Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
         lV163Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV163Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
         lV155Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV155Tmordenwwds_6_tfpmdsc), 30, "%") ;
         lV157Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV157Tmordenwwds_8_tfommaqcod), 6, "%") ;
         lV159Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV159Tmordenwwds_10_tfommaqdsc), 16, "%") ;
         lV168Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV168Tmordenwwds_19_tfomusucre), 8, "%") ;
         lV171Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV171Tmordenwwds_22_tfomtxt), "%", "") ;
         lV187Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV187Tmordenwwds_38_tfomnot), "%", "") ;
         /* Using cursor H00YH13 */
         pr_default.execute(1, new Object[] {AV162Tmordenwwds_13_tfommaqcodfor_sel, AV161Tmordenwwds_12_tfommaqcodfor, lV161Tmordenwwds_12_tfommaqcodfor, AV162Tmordenwwds_13_tfommaqcodfor_sel, AV162Tmordenwwds_13_tfommaqcodfor_sel, AV164Tmordenwwds_15_tfomdscmqpla_sel, AV163Tmordenwwds_14_tfomdscmqpla, lV163Tmordenwwds_14_tfomdscmqpla, AV164Tmordenwwds_15_tfomdscmqpla_sel, AV164Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV151Tmordenwwds_2_tfomcod), Integer.valueOf(AV152Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV153Tmordenwwds_4_tfpmcod), Integer.valueOf(AV154Tmordenwwds_5_tfpmcod_to), lV155Tmordenwwds_6_tfpmdsc, AV156Tmordenwwds_7_tfpmdsc_sel, lV157Tmordenwwds_8_tfommaqcod, AV158Tmordenwwds_9_tfommaqcod_sel, lV159Tmordenwwds_10_tfommaqdsc, AV160Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV165Tmordenwwds_16_tfsmcod), Integer.valueOf(AV166Tmordenwwds_17_tfsmcod_to), lV168Tmordenwwds_19_tfomusucre, AV169Tmordenwwds_20_tfomusucre_sel, AV170Tmordenwwds_21_tfomfchcre, lV171Tmordenwwds_22_tfomtxt, AV172Tmordenwwds_23_tfomtxt_sel, AV173Tmordenwwds_24_tfomfchpre, AV174Tmordenwwds_25_tfomfchcer, AV179Tmordenwwds_30_tfomrrcost, AV180Tmordenwwds_31_tfomrrcost_to, AV181Tmordenwwds_32_tfomrccost, AV182Tmordenwwds_33_tfomrccost_to, AV183Tmordenwwds_34_tfommrcost, AV184Tmordenwwds_35_tfommrcost_to, AV185Tmordenwwds_36_tfommccost, AV186Tmordenwwds_37_tfommccost_to, lV187Tmordenwwds_38_tfomnot, AV188Tmordenwwds_39_tfomnot_sel});
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9464OMNot = H00YH13_A9464OMNot[0] ;
            A9439OMFchCer = H00YH13_A9439OMFchCer[0] ;
            A9438OMFchPre = H00YH13_A9438OMFchPre[0] ;
            A9433OMTxt = H00YH13_A9433OMTxt[0] ;
            A9436OMFchCre = H00YH13_A9436OMFchCre[0] ;
            A9437OMUsuCre = H00YH13_A9437OMUsuCre[0] ;
            A9428SMCod = H00YH13_A9428SMCod[0] ;
            n9428SMCod = H00YH13_n9428SMCod[0] ;
            A9427OMMaqDsc = H00YH13_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = H00YH13_n9427OMMaqDsc[0] ;
            A9426OMMaqCod = H00YH13_A9426OMMaqCod[0] ;
            A9473PMDsc = H00YH13_A9473PMDsc[0] ;
            n9473PMDsc = H00YH13_n9473PMDsc[0] ;
            A9429PMCod = H00YH13_A9429PMCod[0] ;
            n9429PMCod = H00YH13_n9429PMCod[0] ;
            A9425OMCod = H00YH13_A9425OMCod[0] ;
            A407EmprNom = H00YH13_A407EmprNom[0] ;
            n407EmprNom = H00YH13_n407EmprNom[0] ;
            A396EmprCod = H00YH13_A396EmprCod[0] ;
            A13678OMDscMqPla = H00YH13_A13678OMDscMqPla[0] ;
            n13678OMDscMqPla = H00YH13_n13678OMDscMqPla[0] ;
            A13679OMMaqCodFo = H00YH13_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = H00YH13_n13679OMMaqCodFo[0] ;
            A9441OMMCCosT = H00YH13_A9441OMMCCosT[0] ;
            A9443OMRCCosT = H00YH13_A9443OMRCCosT[0] ;
            A9445OMEst = H00YH13_A9445OMEst[0] ;
            A9442OMMRCosT = H00YH13_A9442OMMRCosT[0] ;
            A9444OMRRCosT = H00YH13_A9444OMRRCosT[0] ;
            A407EmprNom = H00YH13_A407EmprNom[0] ;
            n407EmprNom = H00YH13_n407EmprNom[0] ;
            A9427OMMaqDsc = H00YH13_A9427OMMaqDsc[0] ;
            n9427OMMaqDsc = H00YH13_n9427OMMaqDsc[0] ;
            A9473PMDsc = H00YH13_A9473PMDsc[0] ;
            n9473PMDsc = H00YH13_n9473PMDsc[0] ;
            A9441OMMCCosT = H00YH13_A9441OMMCCosT[0] ;
            A9442OMMRCosT = H00YH13_A9442OMMRCosT[0] ;
            A9443OMRCCosT = H00YH13_A9443OMRCCosT[0] ;
            A9444OMRRCosT = H00YH13_A9444OMRRCosT[0] ;
            A13678OMDscMqPla = H00YH13_A13678OMDscMqPla[0] ;
            n13678OMDscMqPla = H00YH13_n13678OMDscMqPla[0] ;
            A13679OMMaqCodFo = H00YH13_A13679OMMaqCodFo[0] ;
            n13679OMMaqCodFo = H00YH13_n13679OMMaqCodFo[0] ;
            if ( ! ( (GXutil.strcmp("", AV176Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV175Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV175Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV176Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV176Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
               {
                  if ( ( AV128GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9425OMCod, 8, 0)), AV128GridCollapsedRecordsChildren) ) )
                  {
                     if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
                     {
                        A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
                     }
                     else
                     {
                        if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                        {
                           A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                        }
                        else
                        {
                           A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                        }
                     }
                     if ( (GXutil.strcmp("", AV150Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "pendiente", "") , GXutil.padr( "%" + GXutil.lower( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "realizada", "") , GXutil.padr( "%" + GXutil.lower( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, "R") == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV177Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV178Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                           {
                              e33YH2 ();
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(57) ;
         wbYH0( ) ;
      }
      bGXsfl_57_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesYH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV189Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV92UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV43Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34ManageFiltersExecutionStep, AV8ColumnsSelector, AV25FilterFullText, AV48TFOMCod, AV49TFOMCod_To, AV84TFPMCod, AV85TFPMCod_To, AV139TFPMDsc, AV140TFPMDsc_Sel, AV64TFOMMaqCod, AV65TFOMMaqCod_Sel, AV68TFOMMaqDsc, AV69TFOMMaqDsc_Sel, AV66TFOMMaqCodFor, AV67TFOMMaqCodFor_Sel, AV52TFOMDscMqPla, AV53TFOMDscMqPla_Sel, AV86TFSMCod, AV87TFSMCod_To, AV56TFOMEst_Sels, AV82TFOMUsuCre, AV83TFOMUsuCre_Sel, AV60TFOMFchCre, AV80TFOMTxt, AV81TFOMTxt_Sel, AV62TFOMFchPre, AV58TFOMFchCer, AV54TFOMDuracion, AV55TFOMDuracion_Sel, AV50TFOMCosRea, AV51TFOMCosRea_To, AV78TFOMRRCosT, AV79TFOMRRCosT_To, AV76TFOMRCCosT, AV77TFOMRCCosT_To, AV72TFOMMRCosT, AV73TFOMMRCosT_To, AV70TFOMMCCosT, AV71TFOMMCCosT_To, AV74TFOMNot, AV75TFOMNot_Sel, AV189Pgmname, AV38OrderedBy, AV40OrderedDsc, AV124GroupBy, AV129GridCollapsedRecords, AV126GroupKey, AV128GridCollapsedRecordsChildren, AV20EmprCod, AV92UsurCod, AV43Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34ManageFiltersExecutionStep, AV8ColumnsSelector, AV25FilterFullText, AV48TFOMCod, AV49TFOMCod_To, AV84TFPMCod, AV85TFPMCod_To, AV139TFPMDsc, AV140TFPMDsc_Sel, AV64TFOMMaqCod, AV65TFOMMaqCod_Sel, AV68TFOMMaqDsc, AV69TFOMMaqDsc_Sel, AV66TFOMMaqCodFor, AV67TFOMMaqCodFor_Sel, AV52TFOMDscMqPla, AV53TFOMDscMqPla_Sel, AV86TFSMCod, AV87TFSMCod_To, AV56TFOMEst_Sels, AV82TFOMUsuCre, AV83TFOMUsuCre_Sel, AV60TFOMFchCre, AV80TFOMTxt, AV81TFOMTxt_Sel, AV62TFOMFchPre, AV58TFOMFchCer, AV54TFOMDuracion, AV55TFOMDuracion_Sel, AV50TFOMCosRea, AV51TFOMCosRea_To, AV78TFOMRRCosT, AV79TFOMRRCosT_To, AV76TFOMRCCosT, AV77TFOMRCCosT_To, AV72TFOMMRCosT, AV73TFOMMRCosT_To, AV70TFOMMCCosT, AV71TFOMMCCosT_To, AV74TFOMNot, AV75TFOMNot_Sel, AV189Pgmname, AV38OrderedBy, AV40OrderedDsc, AV124GroupBy, AV129GridCollapsedRecords, AV126GroupKey, AV128GridCollapsedRecordsChildren, AV20EmprCod, AV92UsurCod, AV43Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34ManageFiltersExecutionStep, AV8ColumnsSelector, AV25FilterFullText, AV48TFOMCod, AV49TFOMCod_To, AV84TFPMCod, AV85TFPMCod_To, AV139TFPMDsc, AV140TFPMDsc_Sel, AV64TFOMMaqCod, AV65TFOMMaqCod_Sel, AV68TFOMMaqDsc, AV69TFOMMaqDsc_Sel, AV66TFOMMaqCodFor, AV67TFOMMaqCodFor_Sel, AV52TFOMDscMqPla, AV53TFOMDscMqPla_Sel, AV86TFSMCod, AV87TFSMCod_To, AV56TFOMEst_Sels, AV82TFOMUsuCre, AV83TFOMUsuCre_Sel, AV60TFOMFchCre, AV80TFOMTxt, AV81TFOMTxt_Sel, AV62TFOMFchPre, AV58TFOMFchCer, AV54TFOMDuracion, AV55TFOMDuracion_Sel, AV50TFOMCosRea, AV51TFOMCosRea_To, AV78TFOMRRCosT, AV79TFOMRRCosT_To, AV76TFOMRCCosT, AV77TFOMRCCosT_To, AV72TFOMMRCosT, AV73TFOMMRCosT_To, AV70TFOMMCCosT, AV71TFOMMCCosT_To, AV74TFOMNot, AV75TFOMNot_Sel, AV189Pgmname, AV38OrderedBy, AV40OrderedDsc, AV124GroupBy, AV129GridCollapsedRecords, AV126GroupKey, AV128GridCollapsedRecordsChildren, AV20EmprCod, AV92UsurCod, AV43Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34ManageFiltersExecutionStep, AV8ColumnsSelector, AV25FilterFullText, AV48TFOMCod, AV49TFOMCod_To, AV84TFPMCod, AV85TFPMCod_To, AV139TFPMDsc, AV140TFPMDsc_Sel, AV64TFOMMaqCod, AV65TFOMMaqCod_Sel, AV68TFOMMaqDsc, AV69TFOMMaqDsc_Sel, AV66TFOMMaqCodFor, AV67TFOMMaqCodFor_Sel, AV52TFOMDscMqPla, AV53TFOMDscMqPla_Sel, AV86TFSMCod, AV87TFSMCod_To, AV56TFOMEst_Sels, AV82TFOMUsuCre, AV83TFOMUsuCre_Sel, AV60TFOMFchCre, AV80TFOMTxt, AV81TFOMTxt_Sel, AV62TFOMFchPre, AV58TFOMFchCer, AV54TFOMDuracion, AV55TFOMDuracion_Sel, AV50TFOMCosRea, AV51TFOMCosRea_To, AV78TFOMRRCosT, AV79TFOMRRCosT_To, AV76TFOMRCCosT, AV77TFOMRCCosT_To, AV72TFOMMRCosT, AV73TFOMMRCosT_To, AV70TFOMMCCosT, AV71TFOMMCCosT_To, AV74TFOMNot, AV75TFOMNot_Sel, AV189Pgmname, AV38OrderedBy, AV40OrderedDsc, AV124GroupBy, AV129GridCollapsedRecords, AV126GroupKey, AV128GridCollapsedRecordsChildren, AV20EmprCod, AV92UsurCod, AV43Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34ManageFiltersExecutionStep, AV8ColumnsSelector, AV25FilterFullText, AV48TFOMCod, AV49TFOMCod_To, AV84TFPMCod, AV85TFPMCod_To, AV139TFPMDsc, AV140TFPMDsc_Sel, AV64TFOMMaqCod, AV65TFOMMaqCod_Sel, AV68TFOMMaqDsc, AV69TFOMMaqDsc_Sel, AV66TFOMMaqCodFor, AV67TFOMMaqCodFor_Sel, AV52TFOMDscMqPla, AV53TFOMDscMqPla_Sel, AV86TFSMCod, AV87TFSMCod_To, AV56TFOMEst_Sels, AV82TFOMUsuCre, AV83TFOMUsuCre_Sel, AV60TFOMFchCre, AV80TFOMTxt, AV81TFOMTxt_Sel, AV62TFOMFchPre, AV58TFOMFchCer, AV54TFOMDuracion, AV55TFOMDuracion_Sel, AV50TFOMCosRea, AV51TFOMCosRea_To, AV78TFOMRRCosT, AV79TFOMRRCosT_To, AV76TFOMRCCosT, AV77TFOMRCCosT_To, AV72TFOMMRCosT, AV73TFOMMRCosT_To, AV70TFOMMCCosT, AV71TFOMMCCosT_To, AV74TFOMNot, AV75TFOMNot_Sel, AV189Pgmname, AV38OrderedBy, AV40OrderedDsc, AV124GroupBy, AV129GridCollapsedRecords, AV126GroupKey, AV128GridCollapsedRecordsChildren, AV20EmprCod, AV92UsurCod, AV43Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV189Pgmname = "TMOrdenWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_57_Refreshing);
      A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
      fix_multi_value_controls( ) ;
   }

   public void strupYH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e31YH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV33ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV18DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV8ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV21EmprCod_Selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         AV36OMCod_Selected = (int)(localUtil.ctol( httpContext.cgiGet( "vOMCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19Delete = httpContext.cgiGet( "vDELETE") ;
         AV90Update = httpContext.cgiGet( "vUPDATE") ;
         AV6Accion = httpContext.cgiGet( "vACCION") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Allowgroup = httpContext.cgiGet( "DDO_GRID_Allowgroup") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_imprimirorden_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Title") ;
         Dvelop_confirmpanel_imprimirorden_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Confirmationtext") ;
         Dvelop_confirmpanel_imprimirorden_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Yesbuttoncaption") ;
         Dvelop_confirmpanel_imprimirorden_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Nobuttoncaption") ;
         Dvelop_confirmpanel_imprimirorden_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_imprimirorden_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Yesbuttonposition") ;
         Dvelop_confirmpanel_imprimirorden_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Confirmtype") ;
         Dvelop_confirmpanel_modificarordencerrada_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Title") ;
         Dvelop_confirmpanel_modificarordencerrada_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Confirmationtext") ;
         Dvelop_confirmpanel_modificarordencerrada_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_modificarordencerrada_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Nobuttoncaption") ;
         Dvelop_confirmpanel_modificarordencerrada_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_modificarordencerrada_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Yesbuttonposition") ;
         Dvelop_confirmpanel_modificarordencerrada_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Confirmtype") ;
         Dvelop_confirmpanel_cerrarorden_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Title") ;
         Dvelop_confirmpanel_cerrarorden_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Confirmationtext") ;
         Dvelop_confirmpanel_cerrarorden_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cerrarorden_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Nobuttoncaption") ;
         Dvelop_confirmpanel_cerrarorden_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cerrarorden_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Yesbuttonposition") ;
         Dvelop_confirmpanel_cerrarorden_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Confirmtype") ;
         Dvelop_confirmpanel_eliminarordenes_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Title") ;
         Dvelop_confirmpanel_eliminarordenes_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarordenes_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarordenes_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarordenes_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarordenes_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarordenes_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Confirmtype") ;
         Grid_group_Gridinternalname = httpContext.cgiGet( "GRID_GROUP_Gridinternalname") ;
         Grid_group_Columnindex = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_GROUP_Columnindex"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Hasrowgroups = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hasrowgroups")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedtext_get = httpContext.cgiGet( "DDO_GRID_Selectedtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvelop_confirmpanel_imprimirorden_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN_Result") ;
         Dvelop_confirmpanel_modificarordencerrada_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA_Result") ;
         Dvelop_confirmpanel_cerrarorden_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRARORDEN_Result") ;
         Dvelop_confirmpanel_eliminarordenes_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARORDENES_Result") ;
         /* Read variables values. */
         AV25FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25FilterFullText", AV25FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_omfchcreauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_OMFCHCREAUXDATE");
            GX_FocusControl = edtavDdo_omfchcreauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_OMFchCreAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_OMFchCreAuxDate", localUtil.format(AV14DDO_OMFchCreAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_OMFchCreAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_omfchcreauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_OMFchCreAuxDate", localUtil.format(AV14DDO_OMFchCreAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_omfchpreauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_OMFCHPREAUXDATE");
            GX_FocusControl = edtavDdo_omfchpreauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DDO_OMFchPreAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DDO_OMFchPreAuxDate", localUtil.format(AV16DDO_OMFchPreAuxDate, "99/99/99"));
         }
         else
         {
            AV16DDO_OMFchPreAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_omfchpreauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DDO_OMFchPreAuxDate", localUtil.format(AV16DDO_OMFchPreAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_omfchcerauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_OMFCHCERAUXDATE");
            GX_FocusControl = edtavDdo_omfchcerauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12DDO_OMFchCerAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_OMFchCerAuxDate", localUtil.format(AV12DDO_OMFchCerAuxDate, "99/99/99"));
         }
         else
         {
            AV12DDO_OMFchCerAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_omfchcerauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_OMFchCerAuxDate", localUtil.format(AV12DDO_OMFchCerAuxDate, "99/99/99"));
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
      e31YH2 ();
      if (returnInSub) return;
   }

   public void e31YH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV43Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmordenww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Station", AV43Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmordenww_impl.this.AV20EmprCod = GXv_char2[0] ;
      tmordenww_impl.this.AV22EmprNom = GXv_char3[0] ;
      tmordenww_impl.this.AV92UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV92UsurCod", AV92UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92UsurCod, "@!"))));
      GXt_char1 = AV43Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmordenww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Station", AV43Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43Station, ""))));
      GXv_char4[0] = AV20EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char2[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmordenww_impl.this.AV20EmprCod = GXv_char4[0] ;
      tmordenww_impl.this.AV22EmprNom = GXv_char3[0] ;
      tmordenww_impl.this.AV92UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV92UsurCod", AV92UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV92UsurCod, "@!"))));
      Grid_group_Gridinternalname = subGrid_Internalname ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "GridInternalName", Grid_group_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV30HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Ordenes de Mantenimiento", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV38OrderedBy < 1 )
      {
         AV38OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV18DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV18DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e32YH2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV94WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV94WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV34ManageFiltersExecutionStep == 1 )
      {
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV34ManageFiltersExecutionStep == 2 )
      {
         AV34ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV42Session.getValue("TMOrdenWWColumnsSelector"), "") != 0 )
      {
         AV10ColumnsSelectorXML = AV42Session.getValue("TMOrdenWWColumnsSelector") ;
         AV8ColumnsSelector.fromxml(AV10ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      chkavSel.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSel.getInternalname(), "Visible", GXutil.ltrimstr( chkavSel.getVisible(), 5, 0), !bGXsfl_57_Refreshing);
      edtOMCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCod_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtPMCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtPMDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDsc_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCod_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqDsc_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMMaqCodFo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMaqCodFo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMaqCodFo_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMDscMqPla_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMDscMqPla_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDscMqPla_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtSMCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Visible), 5, 0), !bGXsfl_57_Refreshing);
      cmbOMEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbOMEst.getVisible(), 5, 0), !bGXsfl_57_Refreshing);
      edtOMUsuCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMUsuCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMUsuCre_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMFchCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCre_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMTxt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMTxt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMTxt_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMFchPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchPre_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMFchCer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMFchCer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMFchCer_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMDuracion_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMDuracion_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMDuracion_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMCosRea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMCosRea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMCosRea_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMRRCosT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRRCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRRCosT_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMRCCosT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMRCCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMRCCosT_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMMRCosT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMRCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMRCosT_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMMCCosT_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMMCCosT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMMCCosT_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtOMNot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtOMNot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOMNot_Visible), 5, 0), !bGXsfl_57_Refreshing);
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      cmbOMEst.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Columnheaderclass", cmbOMEst.getColumnHeaderClass(), !bGXsfl_57_Refreshing);
      AV123Grid_GroupCaption = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV123Grid_GroupCaption);
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
   }

   public void e14YH2( )
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
         AV41PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV41PageToGo) ;
      }
   }

   public void e15YH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e16YH2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) )
      {
         if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) || ( GXutil.strcmp(GXutil.trim( GXutil.str( AV38OrderedBy, 4, 0)), Ddo_grid_Selectedvalue_get) != 0 ) )
         {
            AV124GroupBy = ((GXutil.strcmp(AV124GroupBy, Ddo_grid_Selectedtext_get)==0) ? "" : Ddo_grid_Selectedtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124GroupBy", AV124GroupBy);
         }
         AV38OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OrderedBy), 4, 0));
         AV40OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0)||(GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>")==0)&&(GXutil.strcmp("", AV124GroupBy)==0)&&AV40OrderedDsc ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40OrderedDsc", AV40OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMCod") == 0 )
         {
            AV48TFOMCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFOMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFOMCod), 8, 0));
            AV49TFOMCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFOMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFOMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMCod") == 0 )
         {
            AV84TFPMCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFPMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFPMCod), 8, 0));
            AV85TFPMCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFPMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFPMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDsc") == 0 )
         {
            AV139TFPMDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139TFPMDsc", AV139TFPMDsc);
            AV140TFPMDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140TFPMDsc_Sel", AV140TFPMDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMMaqCod") == 0 )
         {
            AV64TFOMMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFOMMaqCod", AV64TFOMMaqCod);
            AV65TFOMMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFOMMaqCod_Sel", AV65TFOMMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMMaqDsc") == 0 )
         {
            AV68TFOMMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFOMMaqDsc", AV68TFOMMaqDsc);
            AV69TFOMMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFOMMaqDsc_Sel", AV69TFOMMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMMaqCodFor") == 0 )
         {
            AV66TFOMMaqCodFor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFOMMaqCodFor", AV66TFOMMaqCodFor);
            AV67TFOMMaqCodFor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFOMMaqCodFor_Sel", AV67TFOMMaqCodFor_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMDscMqPla") == 0 )
         {
            AV52TFOMDscMqPla = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFOMDscMqPla", AV52TFOMDscMqPla);
            AV53TFOMDscMqPla_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFOMDscMqPla_Sel", AV53TFOMDscMqPla_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SMCod") == 0 )
         {
            AV86TFSMCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFSMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFSMCod), 8, 0));
            AV87TFSMCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFSMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFSMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMEst") == 0 )
         {
            AV57TFOMEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFOMEst_SelsJson", AV57TFOMEst_SelsJson);
            AV56TFOMEst_Sels.fromJSonString(AV57TFOMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMUsuCre") == 0 )
         {
            AV82TFOMUsuCre = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFOMUsuCre", AV82TFOMUsuCre);
            AV83TFOMUsuCre_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFOMUsuCre_Sel", AV83TFOMUsuCre_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMFchCre") == 0 )
         {
            AV60TFOMFchCre = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFOMFchCre", localUtil.ttoc( AV60TFOMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMTxt") == 0 )
         {
            AV80TFOMTxt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFOMTxt", AV80TFOMTxt);
            AV81TFOMTxt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFOMTxt_Sel", AV81TFOMTxt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMFchPre") == 0 )
         {
            AV62TFOMFchPre = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFOMFchPre", localUtil.format(AV62TFOMFchPre, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMFchCer") == 0 )
         {
            AV58TFOMFchCer = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFOMFchCer", localUtil.ttoc( AV58TFOMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMDuracion") == 0 )
         {
            AV54TFOMDuracion = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFOMDuracion", AV54TFOMDuracion);
            AV55TFOMDuracion_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFOMDuracion_Sel", AV55TFOMDuracion_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMCosRea") == 0 )
         {
            AV50TFOMCosRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFOMCosRea", GXutil.ltrimstr( AV50TFOMCosRea, 12, 3));
            AV51TFOMCosRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFOMCosRea_To", GXutil.ltrimstr( AV51TFOMCosRea_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMRRCosT") == 0 )
         {
            AV78TFOMRRCosT = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFOMRRCosT", GXutil.ltrimstr( AV78TFOMRRCosT, 12, 3));
            AV79TFOMRRCosT_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFOMRRCosT_To", GXutil.ltrimstr( AV79TFOMRRCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMRCCosT") == 0 )
         {
            AV76TFOMRCCosT = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFOMRCCosT", GXutil.ltrimstr( AV76TFOMRCCosT, 12, 3));
            AV77TFOMRCCosT_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFOMRCCosT_To", GXutil.ltrimstr( AV77TFOMRCCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMMRCosT") == 0 )
         {
            AV72TFOMMRCosT = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFOMMRCosT", GXutil.ltrimstr( AV72TFOMMRCosT, 12, 3));
            AV73TFOMMRCosT_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFOMMRCosT_To", GXutil.ltrimstr( AV73TFOMMRCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMMCCosT") == 0 )
         {
            AV70TFOMMCCosT = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFOMMCCosT", GXutil.ltrimstr( AV70TFOMMCCosT, 12, 3));
            AV71TFOMMCCosT_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFOMMCCosT_To", GXutil.ltrimstr( AV71TFOMMCCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OMNot") == 0 )
         {
            AV74TFOMNot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFOMNot", AV74TFOMNot);
            AV75TFOMNot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFOMNot_Sel", AV75TFOMNot_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFOMEst_Sels", AV56TFOMEst_Sels);
   }

   private void e33YH2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV146Sel = "N" ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV146Sel);
         if ( GXutil.strcmp(AV124GroupBy, "OMMaqCod") == 0 )
         {
            AV123Grid_GroupCaption = A9426OMMaqCod ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV123Grid_GroupCaption);
            AV123Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Máquina", ""), AV123Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV123Grid_GroupCaption);
            AV126GroupKey = GXutil.trim( A9426OMMaqCod) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126GroupKey", AV126GroupKey);
         }
         else if ( GXutil.strcmp(AV124GroupBy, "OMMaqDsc") == 0 )
         {
            AV123Grid_GroupCaption = A9427OMMaqDsc ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV123Grid_GroupCaption);
            AV123Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Descripción", ""), AV123Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV123Grid_GroupCaption);
            AV126GroupKey = GXutil.trim( A9427OMMaqDsc) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126GroupKey", AV126GroupKey);
         }
         AV130Index = AV129GridCollapsedRecords.indexof(AV126GroupKey) ;
         AV134Expand = ((AV130Index>0) ? "<i class=\"fas fa-angle-right\"></i>" : "<i class=\"fas fa-angle-down\"></i>") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV134Expand);
         edtavExpand_Columnclass = ((AV130Index>0) ? "WWPExpand" : "WWPCollapse") ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", httpContext.getMessage( "Imprimir", ""), (short)(0));
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
         {
            cmbavGridactions.addItem("5", httpContext.getMessage( "Modificar Ord.Cerrada", ""), (short)(0));
         }
         if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
         {
            cmbavGridactions.addItem("6", httpContext.getMessage( "Cerrar Orden", ""), (short)(0));
         }
         if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "P") == 0 )
         {
            cmbOMEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A9445OMEst), "R") == 0 )
         {
            cmbOMEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" );
         }
         else
         {
            cmbOMEst.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
         }
         if ( AV128GridCollapsedRecordsChildren.size() == 0 )
         {
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(57) ;
         }
         sendrow_572( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_57_Refreshing )
      {
         httpContext.doAjaxLoad(57, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV122GridActions, 4, 0)) );
   }

   public void e17YH2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV10ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV8ColumnsSelector.fromJSonString(AV10ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TMOrdenWWColumnsSelector", ((GXutil.strcmp("", AV10ColumnsSelectorXML)==0) ? "" : AV8ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
   }

   public void e13YH2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TMOrdenWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV189Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TMOrdenWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV34ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34ManageFiltersExecutionStep", GXutil.str( AV34ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV35ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TMOrdenWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmordenww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV35ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV35ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV189Pgmname+"GridState", AV35ManageFiltersXml) ;
            AV28GridState.fromxml(AV35ManageFiltersXml, null, null);
            AV38OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OrderedBy), 4, 0));
            AV40OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40OrderedDsc", AV40OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            AV124GroupBy = AV28GridState.getgxTv_SdtWWPGridState_Groupby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124GroupBy", AV124GroupBy);
            AV129GridCollapsedRecords.fromJSonString(AV28GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
            if ( AV129GridCollapsedRecords.size() > 0 )
            {
               AV133AddChildren = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV133AddChildren", AV133AddChildren);
               AV190GXV1 = 1 ;
               while ( AV190GXV1 <= AV129GridCollapsedRecords.size() )
               {
                  AV126GroupKey = (String)AV129GridCollapsedRecords.elementAt(-1+AV190GXV1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV126GroupKey", AV126GroupKey);
                  /* Execute user subroutine: 'ADDREMOVECHILDREN' */
                  S292 ();
                  if (returnInSub) return;
                  AV190GXV1 = (int)(AV190GXV1+1) ;
               }
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFOMEst_Sels", AV56TFOMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
   }

   public void e18YH2( )
   {
      /* Dvelop_confirmpanel_imprimirorden_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_imprimirorden_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION IMPRIMIRORDEN' */
         S252 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e19YH2( )
   {
      /* Dvelop_confirmpanel_modificarordencerrada_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_modificarordencerrada_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION MODIFICARORDENCERRADA' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e20YH2( )
   {
      /* Dvelop_confirmpanel_cerrarorden_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cerrarorden_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CERRARORDEN' */
         S272 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
   }

   public void e22YH2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      AV93WebSession.setValue("TrnContextAccion", httpContext.getMessage( "I", ""));
      AV6Accion = httpContext.getMessage( "I", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Accion", AV6Accion);
      callWebObject(formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV6Accion))}, new String[] {"Mode","EmprCod","OMCod","Accion"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV6Accion))}, new String[] {"Mode","EmprCod","OMCod","Accion"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e21YH2( )
   {
      /* Dvelop_confirmpanel_eliminarordenes_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarordenes_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARORDENES' */
         S282 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
   }

   public void e23YH2( )
   {
      /* 'DoExcel' Routine */
      returnInSub = false ;
      AV96Random = (int)(GXutil.random( )*10000) ;
      AV24ExcelFilename = GXutil.trim( AV189Pgmname) + "_" + GXutil.trim( AV92UsurCod) + GXutil.trim( GXutil.str( AV96Random, 8, 0)) + ".xls" ;
      AV5ValidarFile.setSource( AV24ExcelFilename );
      if ( AV5ValidarFile.exists() )
      {
         AV5ValidarFile.delete();
      }
      AV95XLS.Open(AV24ExcelFilename);
      AV95XLS.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Linea", "") );
      AV95XLS.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Preventivo", "") );
      AV95XLS.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Estado", "") );
      AV95XLS.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Creacion", "") );
      AV95XLS.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Prevista", "") );
      AV95XLS.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV95XLS.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV95XLS.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Texto", "") );
      AV95XLS.Cells(1, 9, 1, 1).setText( httpContext.getMessage( "Notas", "") );
      AV99Row = (short)(2) ;
      /* Start For Each Line */
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_57_fel_idx = 0 ;
      while ( nGXsfl_57_fel_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_fel_idx+1) ;
         sGXsfl_57_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_572( ) ;
         AV134Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
         AV123Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV122GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         AV146Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9429PMCod = false ;
         A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
         n9473PMDsc = false ;
         A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
         A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
         n9427OMMaqDsc = false ;
         A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
         n13679OMMaqCodFo = false ;
         A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
         n13678OMDscMqPla = false ;
         A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9428SMCod = false ;
         cmbOMEst.setName( cmbOMEst.getInternalname() );
         cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
         A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
         A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
         A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname), 0) ;
         A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
         A9438OMFchPre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtOMFchPre_Internalname), 0)) ;
         A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname), 0) ;
         A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
         A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
         A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
         A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
         A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
         A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
         A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
         AV95XLS.Cells(AV99Row, 1, 1, 1).setNumber( A9425OMCod );
         AV95XLS.Cells(AV99Row, 2, 1, 1).setNumber( A9429PMCod );
         AV95XLS.Cells(AV99Row, 3, 1, 1).setText( A9445OMEst );
         AV95XLS.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV95XLS.Cells(AV99Row, 4, 1, 1).setDate( A9436OMFchCre );
         GXt_dtime8 = GXutil.resetTime( A9438OMFchPre );
         AV95XLS.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV95XLS.Cells(AV99Row, 5, 1, 1).setDate( GXt_dtime8 );
         AV95XLS.Cells(AV99Row, 6, 1, 1).setText( A9426OMMaqCod );
         AV95XLS.Cells(AV99Row, 7, 1, 1).setText( A9427OMMaqDsc );
         AV95XLS.Cells(AV99Row, 8, 1, 1).setText( A9433OMTxt );
         AV95XLS.Cells(AV99Row, 9, 1, 1).setText( A9464OMNot );
         AV99Row = (short)(AV99Row+1) ;
         /* End For Each Line */
      }
      if ( nGXsfl_57_fel_idx == 0 )
      {
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      nGXsfl_57_fel_idx = 1 ;
      AV95XLS.Save();
      Innewwindow1_Target = formatLink(AV24ExcelFilename, new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e24YH2( )
   {
      /* 'DoListado' Routine */
      returnInSub = false ;
      AV100Tot = (short)(0) ;
      AV98OMCodCollection.clear();
      /* Start For Each Line */
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_57_fel_idx = 0 ;
      while ( nGXsfl_57_fel_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_fel_idx+1) ;
         sGXsfl_57_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_572( ) ;
         AV134Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
         AV123Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV122GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         AV146Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9429PMCod = false ;
         A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
         n9473PMDsc = false ;
         A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
         A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
         n9427OMMaqDsc = false ;
         A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
         n13679OMMaqCodFo = false ;
         A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
         n13678OMDscMqPla = false ;
         A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9428SMCod = false ;
         cmbOMEst.setName( cmbOMEst.getInternalname() );
         cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
         A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
         A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
         A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname), 0) ;
         A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
         A9438OMFchPre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtOMFchPre_Internalname), 0)) ;
         A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname), 0) ;
         A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
         A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
         A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
         A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
         A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
         A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
         A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
         AV100Tot = (short)(AV100Tot+1) ;
         AV98OMCodCollection.add((int)(A9425OMCod), 0);
         /* End For Each Line */
      }
      if ( nGXsfl_57_fel_idx == 0 )
      {
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      nGXsfl_57_fel_idx = 1 ;
      AV97window.setPosition( 1 );
      AV97window.setWidth( 600 );
      AV97window.setHeight( 400 );
      AV97window.setLeft( 400 );
      AV97window.setTop( 200 );
      AV97window.setAutoresize( 0 );
      AV97window.setUrl( formatLink("app.rmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV98OMCodCollection.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "R", ""))),GXutil.URLEncode(GXutil.ltrimstr(AV100Tot,4,0))}, new String[] {"EmprCod","OMCodCollectionJSon","Tipo","Tot"})  );
      AV97window.setReturnParms(new Object[] {"A396EmprCod","","","AV100Tot",});
      httpContext.newWindow(AV97window);
      /*  Sending Event outputs  */
   }

   public void e25YH2( )
   {
      /* 'DoListadoDetalle' Routine */
      returnInSub = false ;
      AV100Tot = (short)(0) ;
      AV98OMCodCollection.clear();
      /* Start For Each Line */
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_57_fel_idx = 0 ;
      while ( nGXsfl_57_fel_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_fel_idx+1) ;
         sGXsfl_57_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_572( ) ;
         AV134Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
         AV123Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV122GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         AV146Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9429PMCod = false ;
         A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
         n9473PMDsc = false ;
         A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
         A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
         n9427OMMaqDsc = false ;
         A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
         n13679OMMaqCodFo = false ;
         A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
         n13678OMDscMqPla = false ;
         A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9428SMCod = false ;
         cmbOMEst.setName( cmbOMEst.getInternalname() );
         cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
         A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
         A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
         A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname), 0) ;
         A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
         A9438OMFchPre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtOMFchPre_Internalname), 0)) ;
         A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname), 0) ;
         A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
         A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
         A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
         A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
         A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
         A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
         A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
         AV100Tot = (short)(AV100Tot+1) ;
         AV98OMCodCollection.add((int)(A9425OMCod), 0);
         /* End For Each Line */
      }
      if ( nGXsfl_57_fel_idx == 0 )
      {
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      nGXsfl_57_fel_idx = 1 ;
      AV97window.setPosition( 1 );
      AV97window.setWidth( 600 );
      AV97window.setHeight( 400 );
      AV97window.setLeft( 400 );
      AV97window.setTop( 200 );
      AV97window.setAutoresize( 0 );
      AV97window.setUrl( formatLink("app.rmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV98OMCodCollection.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "D", ""))),GXutil.URLEncode(GXutil.ltrimstr(AV100Tot,4,0))}, new String[] {"EmprCod","OMCodCollectionJSon","Tipo","Tot"})  );
      AV97window.setReturnParms(new Object[] {"A396EmprCod","","","AV100Tot",});
      httpContext.newWindow(AV97window);
      /*  Sending Event outputs  */
   }

   public void e26YH2( )
   {
      /* 'DoExcelWin' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV24ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.mantenimiento.tmordenwwexportwin(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmordenww_impl.this.AV24ExcelFilename = GXv_char4[0] ;
      tmordenww_impl.this.AV23ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV24ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV24ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
   }

   public void e27YH2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV24ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.tmordenwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmordenww_impl.this.AV24ExcelFilename = GXv_char4[0] ;
      tmordenww_impl.this.AV23ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV24ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV24ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFOMEst_Sels", AV56TFOMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
   }

   public void e28YH2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tmordenwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFOMEst_Sels", AV56TFOMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
   }

   public void e29YH2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tmordenwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFOMEst_Sels", AV56TFOMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
   }

   public void e34YH2( )
   {
      /* Expand_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV124GroupBy, "OMMaqCod") == 0 )
      {
         AV126GroupKey = GXutil.trim( A9426OMMaqCod) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126GroupKey", AV126GroupKey);
      }
      else if ( GXutil.strcmp(AV124GroupBy, "OMMaqDsc") == 0 )
      {
         AV126GroupKey = GXutil.trim( A9427OMMaqDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126GroupKey", AV126GroupKey);
      }
      AV130Index = AV129GridCollapsedRecords.indexof(AV126GroupKey) ;
      if ( AV130Index > 0 )
      {
         AV129GridCollapsedRecords.removeItem((int)(AV130Index));
      }
      else
      {
         AV129GridCollapsedRecords.add(AV126GroupKey, 0);
      }
      AV133AddChildren = (0==AV130Index) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133AddChildren", AV133AddChildren);
      /* Execute user subroutine: 'ADDREMOVECHILDREN' */
      S292 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV129GridCollapsedRecords", AV129GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV128GridCollapsedRecordsChildren", AV128GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ManageFiltersData", AV33ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28GridState", AV28GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV38OrderedBy, 4, 0))+":"+(AV40OrderedDsc ? "DSC" : "ASC")+((GXutil.strcmp("", AV124GroupBy)==0) ? "" : " GRP") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV8ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Sel", "", "", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMCod", "", "# Orden", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PMCod", "", "Preventivo", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PMDsc", "", "Descripción", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMMaqCod", "", "Máquina", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMMaqDsc", "", "Descripción", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMMaqCodFor", "", "Cod For", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMDscMqPla", "", "Mq Planificar", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "SMCod", "", "Solicitud", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMEst", "", "Estado", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMUsuCre", "", "Usuario", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMFchCre", "", "Fecha Creación", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMTxt", "", "Descripcion", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMFchPre", "", "Fecha Prevista", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMFchCer", "", "Cerrada", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMDuracion", "", "Duracion", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMCosRea", "", "Costo Real", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMRRCosT", "", "Costo Total Reserva Repuesto", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMRCCosT", "", "Costo Total Consumo Repuesto", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMMRCosT", "", "Costo Total Reserva Mano Obra", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMMCCosT", "", "Costo Total Consumo Mano Obra", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "OMNot", "", "Nota", false, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char1 = AV91UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMOrdenWWColumnsSelector", GXv_char4) ;
      tmordenww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV91UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV91UserCustomValue)==0) ) )
      {
         AV9ColumnsSelectorAux.fromxml(AV91UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV9ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV9ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = AV33ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TMOrdenWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] ;
      AV33ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV25FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25FilterFullText", AV25FilterFullText);
      AV48TFOMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFOMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFOMCod), 8, 0));
      AV49TFOMCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFOMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFOMCod_To), 8, 0));
      AV84TFPMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFPMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFPMCod), 8, 0));
      AV85TFPMCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFPMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFPMCod_To), 8, 0));
      AV139TFPMDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139TFPMDsc", AV139TFPMDsc);
      AV140TFPMDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140TFPMDsc_Sel", AV140TFPMDsc_Sel);
      AV64TFOMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFOMMaqCod", AV64TFOMMaqCod);
      AV65TFOMMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFOMMaqCod_Sel", AV65TFOMMaqCod_Sel);
      AV68TFOMMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFOMMaqDsc", AV68TFOMMaqDsc);
      AV69TFOMMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFOMMaqDsc_Sel", AV69TFOMMaqDsc_Sel);
      AV66TFOMMaqCodFor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFOMMaqCodFor", AV66TFOMMaqCodFor);
      AV67TFOMMaqCodFor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFOMMaqCodFor_Sel", AV67TFOMMaqCodFor_Sel);
      AV52TFOMDscMqPla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFOMDscMqPla", AV52TFOMDscMqPla);
      AV53TFOMDscMqPla_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFOMDscMqPla_Sel", AV53TFOMDscMqPla_Sel);
      AV86TFSMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFSMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFSMCod), 8, 0));
      AV87TFSMCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFSMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFSMCod_To), 8, 0));
      AV56TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV82TFOMUsuCre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFOMUsuCre", AV82TFOMUsuCre);
      AV83TFOMUsuCre_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFOMUsuCre_Sel", AV83TFOMUsuCre_Sel);
      AV60TFOMFchCre = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFOMFchCre", localUtil.ttoc( AV60TFOMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV80TFOMTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFOMTxt", AV80TFOMTxt);
      AV81TFOMTxt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFOMTxt_Sel", AV81TFOMTxt_Sel);
      AV62TFOMFchPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFOMFchPre", localUtil.format(AV62TFOMFchPre, "99/99/99"));
      AV58TFOMFchCer = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFOMFchCer", localUtil.ttoc( AV58TFOMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV54TFOMDuracion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFOMDuracion", AV54TFOMDuracion);
      AV55TFOMDuracion_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFOMDuracion_Sel", AV55TFOMDuracion_Sel);
      AV50TFOMCosRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFOMCosRea", GXutil.ltrimstr( AV50TFOMCosRea, 12, 3));
      AV51TFOMCosRea_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFOMCosRea_To", GXutil.ltrimstr( AV51TFOMCosRea_To, 12, 3));
      AV78TFOMRRCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFOMRRCosT", GXutil.ltrimstr( AV78TFOMRRCosT, 12, 3));
      AV79TFOMRRCosT_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFOMRRCosT_To", GXutil.ltrimstr( AV79TFOMRRCosT_To, 12, 3));
      AV76TFOMRCCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFOMRCCosT", GXutil.ltrimstr( AV76TFOMRCCosT, 12, 3));
      AV77TFOMRCCosT_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFOMRCCosT_To", GXutil.ltrimstr( AV77TFOMRCCosT_To, 12, 3));
      AV72TFOMMRCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFOMMRCosT", GXutil.ltrimstr( AV72TFOMMRCosT, 12, 3));
      AV73TFOMMRCosT_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFOMMRCosT_To", GXutil.ltrimstr( AV73TFOMMRCosT_To, 12, 3));
      AV70TFOMMCCosT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFOMMCCosT", GXutil.ltrimstr( AV70TFOMMCCosT, 12, 3));
      AV71TFOMMCCosT_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFOMMCCosT_To", GXutil.ltrimstr( AV71TFOMMCCosT_To, 12, 3));
      AV74TFOMNot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFOMNot", AV74TFOMNot);
      AV75TFOMNot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFOMNot_Sel", AV75TFOMNot_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV129GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV128GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
   }

   public void S192( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV6Accion))}, new String[] {"Mode","EmprCod","OMCod","Accion"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         AV90Update = "<i class=\"fa fa-pen\"></i>" ;
         AV6Accion = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Accion", AV6Accion);
         callWebObject(formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV6Accion))}, new String[] {"Mode","EmprCod","OMCod","Accion"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "La orden No se encuentra en estado Pendiente", "", "", "", "", "", "", "", "", ""));
      }
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
      {
         AV19Delete = "<i class=\"fa fa-times\"></i>" ;
         AV6Accion = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Accion", AV6Accion);
         callWebObject(formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV6Accion))}, new String[] {"Mode","EmprCod","OMCod","Accion"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( "La orden No se encuentra en estado Pendiente", "", "", "", "", "", "", "", "", ""));
      }
   }

   public void S222( )
   {
      /* 'DO IMPRIMIRORDEN' Routine */
      returnInSub = false ;
      AV21EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod_Selected", AV21EmprCod_Selected);
      AV36OMCod_Selected = A9425OMCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OMCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OMCod_Selected), 8, 0));
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_IMPRIMIRORDENContainer", "Confirm", "", new Object[] {});
   }

   public void S252( )
   {
      /* 'DO ACTION IMPRIMIRORDEN' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 9999 )
      {
         AV37OMCodVector[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      AV37OMCodVector[1-1] = A9425OMCod ;
      AV100Tot = (short)(1) ;
      AV98OMCodCollection.clear();
      AV98OMCodCollection.add((int)(A9425OMCod), 0);
      AV97window.setPosition( 1 );
      AV97window.setWidth( 600 );
      AV97window.setHeight( 400 );
      AV97window.setLeft( 400 );
      AV97window.setTop( 200 );
      AV97window.setAutoresize( 0 );
      AV97window.setUrl( formatLink("app.rmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV98OMCodCollection.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "D", ""))),GXutil.URLEncode(GXutil.ltrimstr(AV100Tot,4,0))}, new String[] {"EmprCod","OMCodCollectionJSon","Tipo","Tot"})  );
      AV97window.setReturnParms(new Object[] {"A396EmprCod","","","AV100Tot",});
      httpContext.newWindow(AV97window);
   }

   public void S232( )
   {
      /* 'DO MODIFICARORDENCERRADA' Routine */
      returnInSub = false ;
      AV21EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod_Selected", AV21EmprCod_Selected);
      AV36OMCod_Selected = A9425OMCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OMCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OMCod_Selected), 8, 0));
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADAContainer", "Confirm", "", new Object[] {});
   }

   public void S262( )
   {
      /* 'DO ACTION MODIFICARORDENCERRADA' Routine */
      returnInSub = false ;
      GXt_int13 = AV142Existepswpsb ;
      GXv_int14[0] = GXt_int13 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, "UPDORD", GXv_int14) ;
      tmordenww_impl.this.GXt_int13 = GXv_int14[0] ;
      AV142Existepswpsb = GXt_int13 ;
      if ( AV142Existepswpsb == 1 )
      {
         GXt_char1 = AV143CCVPSW ;
         GXv_char4[0] = AV20EmprCod ;
         GXv_char3[0] = httpContext.getMessage( "UPDORD", "") ;
         GXv_char2[0] = GXt_char1 ;
         new app.pexidsc2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tmordenww_impl.this.AV20EmprCod = GXv_char4[0] ;
         tmordenww_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
         AV143CCVPSW = GXt_char1 ;
         AV93WebSession.setValue("ValidarWebPwdGrl", AV143CCVPSW);
         /* Window Datatype Object Property */
         AV97window.setUrl( formatLink("app.webpwdgrl", new String[] {GXutil.URLEncode(GXutil.rtrim(AV189Pgmname))}, new String[] {"ObjetoLlamador"})  );
         AV97window.setReturnParms(new Object[] {});
         httpContext.newWindow(AV97window);
      }
   }

   public void S242( )
   {
      /* 'DO CERRARORDEN' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_cerrarorden_Confirmationtext = httpContext.getMessage( "¿Desea cerrar la Orden ", "")+GXutil.trim( GXutil.str( A9425OMCod, 8, 0))+"?" ;
      ucDvelop_confirmpanel_cerrarorden.sendProperty(context, "", false, Dvelop_confirmpanel_cerrarorden_Internalname, "ConfirmationText", Dvelop_confirmpanel_cerrarorden_Confirmationtext);
      AV21EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod_Selected", AV21EmprCod_Selected);
      AV36OMCod_Selected = A9425OMCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OMCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OMCod_Selected), 8, 0));
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CERRARORDENContainer", "Confirm", "", new Object[] {});
   }

   public void S272( )
   {
      /* 'DO ACTION CERRARORDEN' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV21EmprCod_Selected ;
      GXv_int15[0] = AV36OMCod_Selected ;
      new app.pmordcie(remoteHandle, context).execute( GXv_char4, GXv_int15) ;
      tmordenww_impl.this.AV21EmprCod_Selected = GXv_char4[0] ;
      tmordenww_impl.this.AV36OMCod_Selected = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod_Selected", AV21EmprCod_Selected);
      httpContext.ajax_rsp_assign_attri("", false, "AV36OMCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36OMCod_Selected), 8, 0));
      httpContext.doAjaxRefresh();
   }

   public void S282( )
   {
      /* 'DO ACTION ELIMINARORDENES' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_57_fel_idx = 0 ;
      while ( nGXsfl_57_fel_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_fel_idx+1) ;
         sGXsfl_57_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_572( ) ;
         AV134Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
         AV123Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV122GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         AV146Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A9425OMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9429PMCod = false ;
         A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
         n9473PMDsc = false ;
         A9426OMMaqCod = httpContext.cgiGet( edtOMMaqCod_Internalname) ;
         A9427OMMaqDsc = httpContext.cgiGet( edtOMMaqDsc_Internalname) ;
         n9427OMMaqDsc = false ;
         A13679OMMaqCodFo = httpContext.cgiGet( edtOMMaqCodFo_Internalname) ;
         n13679OMMaqCodFo = false ;
         A13678OMDscMqPla = httpContext.cgiGet( edtOMDscMqPla_Internalname) ;
         n13678OMDscMqPla = false ;
         A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9428SMCod = false ;
         cmbOMEst.setName( cmbOMEst.getInternalname() );
         cmbOMEst.setValue( httpContext.cgiGet( cmbOMEst.getInternalname()) );
         A9445OMEst = httpContext.cgiGet( cmbOMEst.getInternalname()) ;
         A9437OMUsuCre = GXutil.upper( httpContext.cgiGet( edtOMUsuCre_Internalname)) ;
         A9436OMFchCre = localUtil.ctot( httpContext.cgiGet( edtOMFchCre_Internalname), 0) ;
         A9433OMTxt = httpContext.cgiGet( edtOMTxt_Internalname) ;
         A9438OMFchPre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtOMFchPre_Internalname), 0)) ;
         A9439OMFchCer = localUtil.ctot( httpContext.cgiGet( edtOMFchCer_Internalname), 0) ;
         A13680OMDuracion = httpContext.cgiGet( edtOMDuracion_Internalname) ;
         A9440OMCosRea = localUtil.ctond( httpContext.cgiGet( edtOMCosRea_Internalname)) ;
         A9444OMRRCosT = localUtil.ctond( httpContext.cgiGet( edtOMRRCosT_Internalname)) ;
         A9443OMRCCosT = localUtil.ctond( httpContext.cgiGet( edtOMRCCosT_Internalname)) ;
         A9442OMMRCosT = localUtil.ctond( httpContext.cgiGet( edtOMMRCosT_Internalname)) ;
         A9441OMMCCosT = localUtil.ctond( httpContext.cgiGet( edtOMMCCosT_Internalname)) ;
         A9464OMNot = httpContext.cgiGet( edtOMNot_Internalname) ;
         if ( GXutil.strcmp(AV146Sel, "S") == 0 )
         {
            GXv_char4[0] = A396EmprCod ;
            GXv_int15[0] = A9425OMCod ;
            GXv_int16[0] = A9429PMCod ;
            new app.mantenimiento.pdltorden(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int16) ;
            tmordenww_impl.this.A396EmprCod = GXv_char4[0] ;
            tmordenww_impl.this.A9425OMCod = GXv_int15[0] ;
            tmordenww_impl.this.A9429PMCod = GXv_int16[0] ;
            AV147Inc_obs = httpContext.getMessage( "Orden eliminada ", "") + GXutil.str( A9425OMCod, 8, 0) + GXutil.newLine( ) ;
            AV147Inc_obs += httpContext.getMessage( "Preventivo      ", "") + GXutil.str( A9429PMCod, 8, 0) + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV189Pgmname, AV92UsurCod, AV43Station, AV147Inc_obs, A9425OMCod, (byte)(0), "") ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_57_fel_idx == 0 )
      {
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      nGXsfl_57_fel_idx = 1 ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue(AV189Pgmname+"GridState"), "") == 0 )
      {
         AV28GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV189Pgmname+"GridState"), null, null);
      }
      else
      {
         AV28GridState.fromxml(AV42Session.getValue(AV189Pgmname+"GridState"), null, null);
      }
      AV38OrderedBy = AV28GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38OrderedBy), 4, 0));
      AV124GroupBy = AV28GridState.getgxTv_SdtWWPGridState_Groupby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124GroupBy", AV124GroupBy);
      AV40OrderedDsc = AV28GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40OrderedDsc", AV40OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV28GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV28GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV28GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
      AV129GridCollapsedRecords.fromJSonString(AV28GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
      if ( AV129GridCollapsedRecords.size() > 0 )
      {
         AV133AddChildren = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133AddChildren", AV133AddChildren);
         AV195GXV2 = 1 ;
         while ( AV195GXV2 <= AV129GridCollapsedRecords.size() )
         {
            AV126GroupKey = (String)AV129GridCollapsedRecords.elementAt(-1+AV195GXV2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126GroupKey", AV126GroupKey);
            /* Execute user subroutine: 'ADDREMOVECHILDREN' */
            S292 ();
            if (returnInSub) return;
            AV195GXV2 = (int)(AV195GXV2+1) ;
         }
      }
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV196GXV3 = 1 ;
      while ( AV196GXV3 <= AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV29GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV196GXV3));
         if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV25FilterFullText = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25FilterFullText", AV25FilterFullText);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOD") == 0 )
         {
            AV48TFOMCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFOMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFOMCod), 8, 0));
            AV49TFOMCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFOMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFOMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV84TFPMCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFPMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFPMCod), 8, 0));
            AV85TFPMCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFPMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85TFPMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV139TFPMDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139TFPMDsc", AV139TFPMDsc);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV140TFPMDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140TFPMDsc_Sel", AV140TFPMDsc_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD") == 0 )
         {
            AV64TFOMMaqCod = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFOMMaqCod", AV64TFOMMaqCod);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCOD_SEL") == 0 )
         {
            AV65TFOMMaqCod_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFOMMaqCod_Sel", AV65TFOMMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC") == 0 )
         {
            AV68TFOMMaqDsc = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFOMMaqDsc", AV68TFOMMaqDsc);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQDSC_SEL") == 0 )
         {
            AV69TFOMMaqDsc_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFOMMaqDsc_Sel", AV69TFOMMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR") == 0 )
         {
            AV66TFOMMaqCodFor = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFOMMaqCodFor", AV66TFOMMaqCodFor);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMAQCODFOR_SEL") == 0 )
         {
            AV67TFOMMaqCodFor_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFOMMaqCodFor_Sel", AV67TFOMMaqCodFor_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA") == 0 )
         {
            AV52TFOMDscMqPla = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFOMDscMqPla", AV52TFOMDscMqPla);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDSCMQPLA_SEL") == 0 )
         {
            AV53TFOMDscMqPla_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFOMDscMqPla_Sel", AV53TFOMDscMqPla_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSMCOD") == 0 )
         {
            AV86TFSMCod = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFSMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFSMCod), 8, 0));
            AV87TFSMCod_To = (int)(GXutil.lval( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFSMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFSMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMEST_SEL") == 0 )
         {
            AV57TFOMEst_SelsJson = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFOMEst_SelsJson", AV57TFOMEst_SelsJson);
            AV56TFOMEst_Sels.fromJSonString(AV57TFOMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE") == 0 )
         {
            AV82TFOMUsuCre = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFOMUsuCre", AV82TFOMUsuCre);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMUSUCRE_SEL") == 0 )
         {
            AV83TFOMUsuCre_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFOMUsuCre_Sel", AV83TFOMUsuCre_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCRE") == 0 )
         {
            AV60TFOMFchCre = localUtil.ctot( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFOMFchCre", localUtil.ttoc( AV60TFOMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV14DDO_OMFchCreAuxDate = GXutil.resetTime(AV60TFOMFchCre) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_OMFchCreAuxDate", localUtil.format(AV14DDO_OMFchCreAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT") == 0 )
         {
            AV80TFOMTxt = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFOMTxt", AV80TFOMTxt);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMTXT_SEL") == 0 )
         {
            AV81TFOMTxt_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFOMTxt_Sel", AV81TFOMTxt_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHPRE") == 0 )
         {
            AV62TFOMFchPre = localUtil.ctod( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFOMFchPre", localUtil.format(AV62TFOMFchPre, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMFCHCER") == 0 )
         {
            AV58TFOMFchCer = localUtil.ctot( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFOMFchCer", localUtil.ttoc( AV58TFOMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV12DDO_OMFchCerAuxDate = GXutil.resetTime(AV58TFOMFchCer) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_OMFchCerAuxDate", localUtil.format(AV12DDO_OMFchCerAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION") == 0 )
         {
            AV54TFOMDuracion = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFOMDuracion", AV54TFOMDuracion);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMDURACION_SEL") == 0 )
         {
            AV55TFOMDuracion_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFOMDuracion_Sel", AV55TFOMDuracion_Sel);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMCOSREA") == 0 )
         {
            AV50TFOMCosRea = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFOMCosRea", GXutil.ltrimstr( AV50TFOMCosRea, 12, 3));
            AV51TFOMCosRea_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFOMCosRea_To", GXutil.ltrimstr( AV51TFOMCosRea_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRRCOST") == 0 )
         {
            AV78TFOMRRCosT = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFOMRRCosT", GXutil.ltrimstr( AV78TFOMRRCosT, 12, 3));
            AV79TFOMRRCosT_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFOMRRCosT_To", GXutil.ltrimstr( AV79TFOMRRCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMRCCOST") == 0 )
         {
            AV76TFOMRCCosT = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFOMRCCosT", GXutil.ltrimstr( AV76TFOMRCCosT, 12, 3));
            AV77TFOMRCCosT_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFOMRCCosT_To", GXutil.ltrimstr( AV77TFOMRCCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMRCOST") == 0 )
         {
            AV72TFOMMRCosT = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFOMMRCosT", GXutil.ltrimstr( AV72TFOMMRCosT, 12, 3));
            AV73TFOMMRCosT_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFOMMRCosT_To", GXutil.ltrimstr( AV73TFOMMRCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMMCCOST") == 0 )
         {
            AV70TFOMMCCosT = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFOMMCCosT", GXutil.ltrimstr( AV70TFOMMCCosT, 12, 3));
            AV71TFOMMCCosT_To = CommonUtil.decimalVal( AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFOMMCCosT_To", GXutil.ltrimstr( AV71TFOMMCCosT_To, 12, 3));
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT") == 0 )
         {
            AV74TFOMNot = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFOMNot", AV74TFOMNot);
         }
         else if ( GXutil.strcmp(AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFOMNOT_SEL") == 0 )
         {
            AV75TFOMNot_Sel = AV29GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFOMNot_Sel", AV75TFOMNot_Sel);
         }
         AV196GXV3 = (int)(AV196GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV140TFPMDsc_Sel)==0), AV140TFPMDsc_Sel, GXv_char4) ;
      tmordenww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char17 = "" ;
      GXv_char3[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFOMMaqCod_Sel)==0), AV65TFOMMaqCod_Sel, GXv_char3) ;
      tmordenww_impl.this.GXt_char17 = GXv_char3[0] ;
      GXt_char18 = "" ;
      GXv_char2[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFOMMaqDsc_Sel)==0), AV69TFOMMaqDsc_Sel, GXv_char2) ;
      tmordenww_impl.this.GXt_char18 = GXv_char2[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFOMMaqCodFor_Sel)==0), AV67TFOMMaqCodFor_Sel, GXv_char20) ;
      tmordenww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFOMDscMqPla_Sel)==0), AV53TFOMDscMqPla_Sel, GXv_char22) ;
      tmordenww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV56TFOMEst_Sels.size()==0), AV57TFOMEst_SelsJson, GXv_char24) ;
      tmordenww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFOMUsuCre_Sel)==0), AV83TFOMUsuCre_Sel, GXv_char26) ;
      tmordenww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFOMTxt_Sel)==0), AV81TFOMTxt_Sel, GXv_char28) ;
      tmordenww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFOMDuracion_Sel)==0), AV55TFOMDuracion_Sel, GXv_char30) ;
      tmordenww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFOMNot_Sel)==0), AV75TFOMNot_Sel, GXv_char32) ;
      tmordenww_impl.this.GXt_char31 = GXv_char32[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char17+"|"+GXt_char18+"|"+GXt_char19+"|"+GXt_char21+"||"+GXt_char23+"|"+GXt_char25+"||"+GXt_char27+"|||"+GXt_char29+"||||||"+GXt_char31 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV139TFPMDsc)==0), AV139TFPMDsc, GXv_char32) ;
      tmordenww_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFOMMaqCod)==0), AV64TFOMMaqCod, GXv_char30) ;
      tmordenww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFOMMaqDsc)==0), AV68TFOMMaqDsc, GXv_char28) ;
      tmordenww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFOMMaqCodFor)==0), AV66TFOMMaqCodFor, GXv_char26) ;
      tmordenww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFOMDscMqPla)==0), AV52TFOMDscMqPla, GXv_char24) ;
      tmordenww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFOMUsuCre)==0), AV82TFOMUsuCre, GXv_char22) ;
      tmordenww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFOMTxt)==0), AV80TFOMTxt, GXv_char20) ;
      tmordenww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFOMDuracion)==0), AV54TFOMDuracion, GXv_char4) ;
      tmordenww_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char17 = "" ;
      GXv_char3[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFOMNot)==0), AV74TFOMNot, GXv_char3) ;
      tmordenww_impl.this.GXt_char17 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV48TFOMCod) ? "" : GXutil.str( AV48TFOMCod, 8, 0))+"|"+((0==AV84TFPMCod) ? "" : GXutil.str( AV84TFPMCod, 8, 0))+"|"+GXt_char31+"|"+GXt_char29+"|"+GXt_char27+"|"+GXt_char25+"|"+GXt_char23+"|"+((0==AV86TFSMCod) ? "" : GXutil.str( AV86TFSMCod, 8, 0))+"||"+GXt_char21+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV60TFOMFchCre) ? "" : localUtil.dtoc( AV14DDO_OMFchCreAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char19+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62TFOMFchPre)) ? "" : localUtil.dtoc( AV62TFOMFchPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV58TFOMFchCer) ? "" : localUtil.dtoc( AV12DDO_OMFchCerAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char18+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFOMCosRea)==0) ? "" : GXutil.str( AV50TFOMCosRea, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFOMRRCosT)==0) ? "" : GXutil.str( AV78TFOMRRCosT, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFOMRCCosT)==0) ? "" : GXutil.str( AV76TFOMRCCosT, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFOMMRCosT)==0) ? "" : GXutil.str( AV72TFOMMRCosT, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFOMMCCosT)==0) ? "" : GXutil.str( AV70TFOMMCCosT, 12, 3))+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV49TFOMCod_To) ? "" : GXutil.str( AV49TFOMCod_To, 8, 0))+"|"+((0==AV85TFPMCod_To) ? "" : GXutil.str( AV85TFPMCod_To, 8, 0))+"||||||"+((0==AV87TFSMCod_To) ? "" : GXutil.str( AV87TFSMCod_To, 8, 0))+"||||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFOMCosRea_To)==0) ? "" : GXutil.str( AV51TFOMCosRea_To, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFOMRRCosT_To)==0) ? "" : GXutil.str( AV79TFOMRRCosT_To, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFOMRCCosT_To)==0) ? "" : GXutil.str( AV77TFOMRCCosT_To, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFOMMRCosT_To)==0) ? "" : GXutil.str( AV73TFOMMRCosT_To, 12, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFOMMCCosT_To)==0) ? "" : GXutil.str( AV71TFOMMCCosT_To, 12, 3))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV28GridState.fromxml(AV42Session.getValue(AV189Pgmname+"GridState"), null, null);
      AV131OldGridState.fromxml(AV28GridState.toxml(false, true, "WWPGridState", "TexplusNET"), null, null);
      AV28GridState.setgxTv_SdtWWPGridState_Orderedby( AV38OrderedBy );
      AV28GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV40OrderedDsc );
      AV28GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV25FilterFullText)==0), (short)(0), AV25FilterFullText, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMCOD", "", !((0==AV48TFOMCod)&&(0==AV49TFOMCod_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFOMCod, 8, 0)), GXutil.trim( GXutil.str( AV49TFOMCod_To, 8, 0))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFPMCOD", "", !((0==AV84TFPMCod)&&(0==AV85TFPMCod_To)), (short)(0), GXutil.trim( GXutil.str( AV84TFPMCod, 8, 0)), GXutil.trim( GXutil.str( AV85TFPMCod_To, 8, 0))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFPMDSC", "", !(GXutil.strcmp("", AV139TFPMDsc)==0), (short)(0), AV139TFPMDsc, "", !(GXutil.strcmp("", AV140TFPMDsc_Sel)==0), AV140TFPMDsc_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMMAQCOD", "", !(GXutil.strcmp("", AV64TFOMMaqCod)==0), (short)(0), AV64TFOMMaqCod, "", !(GXutil.strcmp("", AV65TFOMMaqCod_Sel)==0), AV65TFOMMaqCod_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMMAQDSC", "", !(GXutil.strcmp("", AV68TFOMMaqDsc)==0), (short)(0), AV68TFOMMaqDsc, "", !(GXutil.strcmp("", AV69TFOMMaqDsc_Sel)==0), AV69TFOMMaqDsc_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMMAQCODFOR", "", !(GXutil.strcmp("", AV66TFOMMaqCodFor)==0), (short)(0), AV66TFOMMaqCodFor, "", !(GXutil.strcmp("", AV67TFOMMaqCodFor_Sel)==0), AV67TFOMMaqCodFor_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMDSCMQPLA", "", !(GXutil.strcmp("", AV52TFOMDscMqPla)==0), (short)(0), AV52TFOMDscMqPla, "", !(GXutil.strcmp("", AV53TFOMDscMqPla_Sel)==0), AV53TFOMDscMqPla_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFSMCOD", "", !((0==AV86TFSMCod)&&(0==AV87TFSMCod_To)), (short)(0), GXutil.trim( GXutil.str( AV86TFSMCod, 8, 0)), GXutil.trim( GXutil.str( AV87TFSMCod_To, 8, 0))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMEST_SEL", "", !(AV56TFOMEst_Sels.size()==0), (short)(0), AV56TFOMEst_Sels.toJSonString(false), "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMUSUCRE", "", !(GXutil.strcmp("", AV82TFOMUsuCre)==0), (short)(0), AV82TFOMUsuCre, "", !(GXutil.strcmp("", AV83TFOMUsuCre_Sel)==0), AV83TFOMUsuCre_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMFCHCRE", "", !GXutil.dateCompare(GXutil.nullDate(), AV60TFOMFchCre), (short)(0), GXutil.trim( localUtil.ttoc( AV60TFOMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMTXT", "", !(GXutil.strcmp("", AV80TFOMTxt)==0), (short)(0), AV80TFOMTxt, "", !(GXutil.strcmp("", AV81TFOMTxt_Sel)==0), AV81TFOMTxt_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMFCHPRE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62TFOMFchPre)), (short)(0), GXutil.trim( localUtil.dtoc( AV62TFOMFchPre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMFCHCER", "", !GXutil.dateCompare(GXutil.nullDate(), AV58TFOMFchCer), (short)(0), GXutil.trim( localUtil.ttoc( AV58TFOMFchCer, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMDURACION", "", !(GXutil.strcmp("", AV54TFOMDuracion)==0), (short)(0), AV54TFOMDuracion, "", !(GXutil.strcmp("", AV55TFOMDuracion_Sel)==0), AV55TFOMDuracion_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMCOSREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFOMCosRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFOMCosRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFOMCosRea, 12, 3)), GXutil.trim( GXutil.str( AV51TFOMCosRea_To, 12, 3))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMRRCOST", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFOMRRCosT)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFOMRRCosT_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV78TFOMRRCosT, 12, 3)), GXutil.trim( GXutil.str( AV79TFOMRRCosT_To, 12, 3))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMRCCOST", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFOMRCCosT)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFOMRCCosT_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV76TFOMRCCosT, 12, 3)), GXutil.trim( GXutil.str( AV77TFOMRCCosT_To, 12, 3))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMMRCOST", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFOMMRCosT)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFOMMRCosT_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV72TFOMMRCosT, 12, 3)), GXutil.trim( GXutil.str( AV73TFOMMRCosT_To, 12, 3))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMMCCOST", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFOMMCCosT)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFOMMCCosT_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV70TFOMMCCosT, 12, 3)), GXutil.trim( GXutil.str( AV71TFOMMCCosT_To, 12, 3))) ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV28GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFOMNOT", "", !(GXutil.strcmp("", AV74TFOMNot)==0), (short)(0), AV74TFOMNot, "", !(GXutil.strcmp("", AV75TFOMNot_Sel)==0), AV75TFOMNot_Sel, "") ;
      AV28GridState = GXv_SdtWWPGridState33[0] ;
      AV28GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV28GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      AV28GridState.setgxTv_SdtWWPGridState_Groupby( AV124GroupBy );
      if ( ! (GXutil.strcmp("", AV124GroupBy)==0) && ! ( ( ( AV38OrderedBy == 4 ) && ( GXutil.strcmp(AV124GroupBy, "OMMaqCod") == 0 ) ) || ( ( AV38OrderedBy == 5 ) && ( GXutil.strcmp(AV124GroupBy, "OMMaqDsc") == 0 ) ) ) )
      {
         AV124GroupBy = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV124GroupBy", AV124GroupBy);
      }
      Grid_group_Columnindex = ((GXutil.strcmp("", AV124GroupBy)==0) ? -1 : 1) ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "ColumnIndex", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid_group_Columnindex), 9, 0));
      if ( (GXutil.strcmp("", AV124GroupBy)==0) || new app.wwpbaseobjects.wwp_resetcollapsedrecords(remoteHandle, context).executeUdp( AV131OldGridState, AV28GridState) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV129GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
         AV128GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
      }
      AV28GridState.setgxTv_SdtWWPGridState_Collapsedrecords( AV129GridCollapsedRecords.toJSonString(false) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV189Pgmname+"GridState", AV28GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV88TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV189Pgmname );
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV30HTTPRequest.getScriptName()+"?"+AV30HTTPRequest.getQuerystring() );
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMOrden" );
      AV42Session.setValue("TrnContext", AV88TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S292( )
   {
      /* 'ADDREMOVECHILDREN' Routine */
      returnInSub = false ;
      AV132DiscardFirst = true ;
      AV127GroupOMMaqCod = AV126GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127GroupOMMaqCod", AV127GroupOMMaqCod);
      AV135GroupOMMaqDsc = AV126GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV135GroupOMMaqDsc", AV135GroupOMMaqDsc);
      AV150Tmordenwwds_1_filterfulltext = AV25FilterFullText ;
      AV151Tmordenwwds_2_tfomcod = AV48TFOMCod ;
      AV152Tmordenwwds_3_tfomcod_to = AV49TFOMCod_To ;
      AV153Tmordenwwds_4_tfpmcod = AV84TFPMCod ;
      AV154Tmordenwwds_5_tfpmcod_to = AV85TFPMCod_To ;
      AV155Tmordenwwds_6_tfpmdsc = AV139TFPMDsc ;
      AV156Tmordenwwds_7_tfpmdsc_sel = AV140TFPMDsc_Sel ;
      AV157Tmordenwwds_8_tfommaqcod = AV64TFOMMaqCod ;
      AV158Tmordenwwds_9_tfommaqcod_sel = AV65TFOMMaqCod_Sel ;
      AV159Tmordenwwds_10_tfommaqdsc = AV68TFOMMaqDsc ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = AV69TFOMMaqDsc_Sel ;
      AV161Tmordenwwds_12_tfommaqcodfor = AV66TFOMMaqCodFor ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = AV67TFOMMaqCodFor_Sel ;
      AV163Tmordenwwds_14_tfomdscmqpla = AV52TFOMDscMqPla ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = AV53TFOMDscMqPla_Sel ;
      AV165Tmordenwwds_16_tfsmcod = AV86TFSMCod ;
      AV166Tmordenwwds_17_tfsmcod_to = AV87TFSMCod_To ;
      AV167Tmordenwwds_18_tfomest_sels = AV56TFOMEst_Sels ;
      AV168Tmordenwwds_19_tfomusucre = AV82TFOMUsuCre ;
      AV169Tmordenwwds_20_tfomusucre_sel = AV83TFOMUsuCre_Sel ;
      AV170Tmordenwwds_21_tfomfchcre = AV60TFOMFchCre ;
      AV171Tmordenwwds_22_tfomtxt = AV80TFOMTxt ;
      AV172Tmordenwwds_23_tfomtxt_sel = AV81TFOMTxt_Sel ;
      AV173Tmordenwwds_24_tfomfchpre = AV62TFOMFchPre ;
      AV174Tmordenwwds_25_tfomfchcer = AV58TFOMFchCer ;
      AV175Tmordenwwds_26_tfomduracion = AV54TFOMDuracion ;
      AV176Tmordenwwds_27_tfomduracion_sel = AV55TFOMDuracion_Sel ;
      AV177Tmordenwwds_28_tfomcosrea = AV50TFOMCosRea ;
      AV178Tmordenwwds_29_tfomcosrea_to = AV51TFOMCosRea_To ;
      AV179Tmordenwwds_30_tfomrrcost = AV78TFOMRRCosT ;
      AV180Tmordenwwds_31_tfomrrcost_to = AV79TFOMRRCosT_To ;
      AV181Tmordenwwds_32_tfomrccost = AV76TFOMRCCosT ;
      AV182Tmordenwwds_33_tfomrccost_to = AV77TFOMRCCosT_To ;
      AV183Tmordenwwds_34_tfommrcost = AV72TFOMMRCosT ;
      AV184Tmordenwwds_35_tfommrcost_to = AV73TFOMMRCosT_To ;
      AV185Tmordenwwds_36_tfommccost = AV70TFOMMCCosT ;
      AV186Tmordenwwds_37_tfommccost_to = AV71TFOMMCCosT_To ;
      AV187Tmordenwwds_38_tfomnot = AV74TFOMNot ;
      AV188Tmordenwwds_39_tfomnot_sel = AV75TFOMNot_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9445OMEst ,
                                           AV167Tmordenwwds_18_tfomest_sels ,
                                           Integer.valueOf(AV151Tmordenwwds_2_tfomcod) ,
                                           Integer.valueOf(AV152Tmordenwwds_3_tfomcod_to) ,
                                           Integer.valueOf(AV153Tmordenwwds_4_tfpmcod) ,
                                           Integer.valueOf(AV154Tmordenwwds_5_tfpmcod_to) ,
                                           AV156Tmordenwwds_7_tfpmdsc_sel ,
                                           AV155Tmordenwwds_6_tfpmdsc ,
                                           AV158Tmordenwwds_9_tfommaqcod_sel ,
                                           AV157Tmordenwwds_8_tfommaqcod ,
                                           AV160Tmordenwwds_11_tfommaqdsc_sel ,
                                           AV159Tmordenwwds_10_tfommaqdsc ,
                                           Integer.valueOf(AV165Tmordenwwds_16_tfsmcod) ,
                                           Integer.valueOf(AV166Tmordenwwds_17_tfsmcod_to) ,
                                           Integer.valueOf(AV167Tmordenwwds_18_tfomest_sels.size()) ,
                                           AV169Tmordenwwds_20_tfomusucre_sel ,
                                           AV168Tmordenwwds_19_tfomusucre ,
                                           AV170Tmordenwwds_21_tfomfchcre ,
                                           AV172Tmordenwwds_23_tfomtxt_sel ,
                                           AV171Tmordenwwds_22_tfomtxt ,
                                           AV173Tmordenwwds_24_tfomfchpre ,
                                           AV174Tmordenwwds_25_tfomfchcer ,
                                           AV179Tmordenwwds_30_tfomrrcost ,
                                           AV180Tmordenwwds_31_tfomrrcost_to ,
                                           AV181Tmordenwwds_32_tfomrccost ,
                                           AV182Tmordenwwds_33_tfomrccost_to ,
                                           AV183Tmordenwwds_34_tfommrcost ,
                                           AV184Tmordenwwds_35_tfommrcost_to ,
                                           AV185Tmordenwwds_36_tfommccost ,
                                           AV186Tmordenwwds_37_tfommccost_to ,
                                           AV188Tmordenwwds_39_tfomnot_sel ,
                                           AV187Tmordenwwds_38_tfomnot ,
                                           AV124GroupBy ,
                                           Integer.valueOf(A9425OMCod) ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9426OMMaqCod ,
                                           A9427OMMaqDsc ,
                                           Integer.valueOf(A9428SMCod) ,
                                           A9437OMUsuCre ,
                                           A9436OMFchCre ,
                                           A9433OMTxt ,
                                           A9438OMFchPre ,
                                           A9439OMFchCer ,
                                           A9444OMRRCosT ,
                                           A9443OMRCCosT ,
                                           A9442OMMRCosT ,
                                           A9441OMMCCosT ,
                                           A9464OMNot ,
                                           AV127GroupOMMaqCod ,
                                           AV135GroupOMMaqDsc ,
                                           AV150Tmordenwwds_1_filterfulltext ,
                                           A13679OMMaqCodFo ,
                                           A13678OMDscMqPla ,
                                           A13680OMDuracion ,
                                           A9440OMCosRea ,
                                           AV162Tmordenwwds_13_tfommaqcodfor_sel ,
                                           AV161Tmordenwwds_12_tfommaqcodfor ,
                                           AV164Tmordenwwds_15_tfomdscmqpla_sel ,
                                           AV163Tmordenwwds_14_tfomdscmqpla ,
                                           AV176Tmordenwwds_27_tfomduracion_sel ,
                                           AV175Tmordenwwds_26_tfomduracion ,
                                           AV177Tmordenwwds_28_tfomcosrea ,
                                           AV178Tmordenwwds_29_tfomcosrea_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV161Tmordenwwds_12_tfommaqcodfor = GXutil.padr( GXutil.rtrim( AV161Tmordenwwds_12_tfommaqcodfor), 16, "%") ;
      lV163Tmordenwwds_14_tfomdscmqpla = GXutil.padr( GXutil.rtrim( AV163Tmordenwwds_14_tfomdscmqpla), 16, "%") ;
      lV155Tmordenwwds_6_tfpmdsc = GXutil.padr( GXutil.rtrim( AV155Tmordenwwds_6_tfpmdsc), 30, "%") ;
      lV157Tmordenwwds_8_tfommaqcod = GXutil.padr( GXutil.rtrim( AV157Tmordenwwds_8_tfommaqcod), 6, "%") ;
      lV159Tmordenwwds_10_tfommaqdsc = GXutil.padr( GXutil.rtrim( AV159Tmordenwwds_10_tfommaqdsc), 16, "%") ;
      lV168Tmordenwwds_19_tfomusucre = GXutil.padr( GXutil.rtrim( AV168Tmordenwwds_19_tfomusucre), 8, "%") ;
      lV171Tmordenwwds_22_tfomtxt = GXutil.concat( GXutil.rtrim( AV171Tmordenwwds_22_tfomtxt), "%", "") ;
      lV187Tmordenwwds_38_tfomnot = GXutil.concat( GXutil.rtrim( AV187Tmordenwwds_38_tfomnot), "%", "") ;
      /* Using cursor H00YH19 */
      pr_default.execute(2, new Object[] {AV162Tmordenwwds_13_tfommaqcodfor_sel, AV161Tmordenwwds_12_tfommaqcodfor, lV161Tmordenwwds_12_tfommaqcodfor, AV162Tmordenwwds_13_tfommaqcodfor_sel, AV162Tmordenwwds_13_tfommaqcodfor_sel, AV164Tmordenwwds_15_tfomdscmqpla_sel, AV163Tmordenwwds_14_tfomdscmqpla, lV163Tmordenwwds_14_tfomdscmqpla, AV164Tmordenwwds_15_tfomdscmqpla_sel, AV164Tmordenwwds_15_tfomdscmqpla_sel, Integer.valueOf(AV151Tmordenwwds_2_tfomcod), Integer.valueOf(AV152Tmordenwwds_3_tfomcod_to), Integer.valueOf(AV153Tmordenwwds_4_tfpmcod), Integer.valueOf(AV154Tmordenwwds_5_tfpmcod_to), lV155Tmordenwwds_6_tfpmdsc, AV156Tmordenwwds_7_tfpmdsc_sel, lV157Tmordenwwds_8_tfommaqcod, AV158Tmordenwwds_9_tfommaqcod_sel, lV159Tmordenwwds_10_tfommaqdsc, AV160Tmordenwwds_11_tfommaqdsc_sel, Integer.valueOf(AV165Tmordenwwds_16_tfsmcod), Integer.valueOf(AV166Tmordenwwds_17_tfsmcod_to), lV168Tmordenwwds_19_tfomusucre, AV169Tmordenwwds_20_tfomusucre_sel, AV170Tmordenwwds_21_tfomfchcre, lV171Tmordenwwds_22_tfomtxt, AV172Tmordenwwds_23_tfomtxt_sel, AV173Tmordenwwds_24_tfomfchpre, AV174Tmordenwwds_25_tfomfchcer, AV179Tmordenwwds_30_tfomrrcost, AV180Tmordenwwds_31_tfomrrcost_to, AV181Tmordenwwds_32_tfomrccost, AV182Tmordenwwds_33_tfomrccost_to, AV183Tmordenwwds_34_tfommrcost, AV184Tmordenwwds_35_tfommrcost_to, AV185Tmordenwwds_36_tfommccost, AV186Tmordenwwds_37_tfommccost_to, lV187Tmordenwwds_38_tfomnot, AV188Tmordenwwds_39_tfomnot_sel, AV127GroupOMMaqCod, AV135GroupOMMaqDsc});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A9464OMNot = H00YH19_A9464OMNot[0] ;
         A9439OMFchCer = H00YH19_A9439OMFchCer[0] ;
         A9438OMFchPre = H00YH19_A9438OMFchPre[0] ;
         A9433OMTxt = H00YH19_A9433OMTxt[0] ;
         A9436OMFchCre = H00YH19_A9436OMFchCre[0] ;
         A9437OMUsuCre = H00YH19_A9437OMUsuCre[0] ;
         A9428SMCod = H00YH19_A9428SMCod[0] ;
         n9428SMCod = H00YH19_n9428SMCod[0] ;
         A9427OMMaqDsc = H00YH19_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H00YH19_n9427OMMaqDsc[0] ;
         A9426OMMaqCod = H00YH19_A9426OMMaqCod[0] ;
         A9473PMDsc = H00YH19_A9473PMDsc[0] ;
         n9473PMDsc = H00YH19_n9473PMDsc[0] ;
         A9429PMCod = H00YH19_A9429PMCod[0] ;
         n9429PMCod = H00YH19_n9429PMCod[0] ;
         A9425OMCod = H00YH19_A9425OMCod[0] ;
         A396EmprCod = H00YH19_A396EmprCod[0] ;
         A13678OMDscMqPla = H00YH19_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = H00YH19_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = H00YH19_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = H00YH19_n13679OMMaqCodFo[0] ;
         A9441OMMCCosT = H00YH19_A9441OMMCCosT[0] ;
         A9443OMRCCosT = H00YH19_A9443OMRCCosT[0] ;
         A9445OMEst = H00YH19_A9445OMEst[0] ;
         A9442OMMRCosT = H00YH19_A9442OMMRCosT[0] ;
         A9444OMRRCosT = H00YH19_A9444OMRRCosT[0] ;
         A9427OMMaqDsc = H00YH19_A9427OMMaqDsc[0] ;
         n9427OMMaqDsc = H00YH19_n9427OMMaqDsc[0] ;
         A9473PMDsc = H00YH19_A9473PMDsc[0] ;
         n9473PMDsc = H00YH19_n9473PMDsc[0] ;
         A9441OMMCCosT = H00YH19_A9441OMMCCosT[0] ;
         A9442OMMRCosT = H00YH19_A9442OMMRCosT[0] ;
         A9443OMRCCosT = H00YH19_A9443OMRCCosT[0] ;
         A9444OMRRCosT = H00YH19_A9444OMRRCosT[0] ;
         A13678OMDscMqPla = H00YH19_A13678OMDscMqPla[0] ;
         n13678OMDscMqPla = H00YH19_n13678OMDscMqPla[0] ;
         A13679OMMaqCodFo = H00YH19_A13679OMMaqCodFo[0] ;
         n13679OMMaqCodFo = H00YH19_n13679OMMaqCodFo[0] ;
         A13680OMDuracion = httpContext.getMessage( "procedimiento pendiente TextoDuracionHorasMinutos", "") ;
         if ( ! ( (GXutil.strcmp("", AV176Tmordenwwds_27_tfomduracion_sel)==0) && ( ! (GXutil.strcmp("", AV175Tmordenwwds_26_tfomduracion)==0) ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV175Tmordenwwds_26_tfomduracion) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV176Tmordenwwds_27_tfomduracion_sel)==0) || ( ( GXutil.strcmp(A13680OMDuracion, AV176Tmordenwwds_27_tfomduracion_sel) == 0 ) ) )
            {
               if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 )
               {
                  A9440OMCosRea = A9444OMRRCosT.add(A9442OMMRCosT) ;
               }
               else
               {
                  if ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 )
                  {
                     A9440OMCosRea = A9443OMRCCosT.add(A9441OMMCCosT) ;
                  }
                  else
                  {
                     A9440OMCosRea = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (GXutil.strcmp("", AV150Tmordenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9425OMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9426OMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9427OMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13679OMMaqCodFo) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13678OMDscMqPla) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9428SMCod, 8, 0) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "pendiente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "realizada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9445OMEst, httpContext.getMessage( "R", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9437OMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9433OMTxt) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13680OMDuracion) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9440OMCosRea, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9444OMRRCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9443OMRCCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9442OMMRCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9441OMMCCosT, 12, 3) , GXutil.padr( "%" + AV150Tmordenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9464OMNot) , GXutil.padr( "%" + GXutil.upper( AV150Tmordenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Tmordenwwds_28_tfomcosrea)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV177Tmordenwwds_28_tfomcosrea) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Tmordenwwds_29_tfomcosrea_to)==0) || ( ( DecimalUtil.compareTo(A9440OMCosRea, AV178Tmordenwwds_29_tfomcosrea_to) <= 0 ) ) )
                     {
                        AV125RecordKey = A396EmprCod + ";" + GXutil.trim( GXutil.str( A9425OMCod, 8, 0)) ;
                        AV130Index = AV128GridCollapsedRecordsChildren.indexof(AV125RecordKey) ;
                        if ( AV133AddChildren && ( AV130Index == 0 ) )
                        {
                           if ( ! AV132DiscardFirst )
                           {
                              AV128GridCollapsedRecordsChildren.add(AV125RecordKey, 0);
                           }
                           else
                           {
                              AV132DiscardFirst = false ;
                           }
                        }
                        else
                        {
                           if ( ( ! AV133AddChildren ) && ( AV130Index > 0 ) )
                           {
                              AV128GridCollapsedRecordsChildren.removeItem((int)(AV130Index));
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void e30YH2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV145ObjetoRefrescar.indexof(AV189Pgmname) > 0 ) && AV144Refrescar )
      {
         callWebObject(formatLink("app.tmorden", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9425OMCod,8,0)),GXutil.URLEncode(GXutil.rtrim("X"))}, new String[] {"Mode","EmprCod","OMCod","Accion"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void wb_table5_109_YH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarordenes_Internalname, tblTabledvelop_confirmpanel_eliminarordenes_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarordenes.setProperty("Title", Dvelop_confirmpanel_eliminarordenes_Title);
         ucDvelop_confirmpanel_eliminarordenes.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarordenes_Confirmationtext);
         ucDvelop_confirmpanel_eliminarordenes.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarordenes_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarordenes.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarordenes_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarordenes.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarordenes_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarordenes.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarordenes_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarordenes.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarordenes_Confirmtype);
         ucDvelop_confirmpanel_eliminarordenes.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarordenes_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARORDENESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARORDENESContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_109_YH2e( true) ;
      }
      else
      {
         wb_table5_109_YH2e( false) ;
      }
   }

   public void wb_table4_104_YH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cerrarorden_Internalname, tblTabledvelop_confirmpanel_cerrarorden_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cerrarorden.setProperty("Title", Dvelop_confirmpanel_cerrarorden_Title);
         ucDvelop_confirmpanel_cerrarorden.setProperty("ConfirmationText", Dvelop_confirmpanel_cerrarorden_Confirmationtext);
         ucDvelop_confirmpanel_cerrarorden.setProperty("YesButtonCaption", Dvelop_confirmpanel_cerrarorden_Yesbuttoncaption);
         ucDvelop_confirmpanel_cerrarorden.setProperty("NoButtonCaption", Dvelop_confirmpanel_cerrarorden_Nobuttoncaption);
         ucDvelop_confirmpanel_cerrarorden.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cerrarorden_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cerrarorden.setProperty("YesButtonPosition", Dvelop_confirmpanel_cerrarorden_Yesbuttonposition);
         ucDvelop_confirmpanel_cerrarorden.setProperty("ConfirmType", Dvelop_confirmpanel_cerrarorden_Confirmtype);
         ucDvelop_confirmpanel_cerrarorden.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cerrarorden_Internalname, "DVELOP_CONFIRMPANEL_CERRARORDENContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CERRARORDENContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_104_YH2e( true) ;
      }
      else
      {
         wb_table4_104_YH2e( false) ;
      }
   }

   public void wb_table3_99_YH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_modificarordencerrada_Internalname, tblTabledvelop_confirmpanel_modificarordencerrada_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_modificarordencerrada.setProperty("Title", Dvelop_confirmpanel_modificarordencerrada_Title);
         ucDvelop_confirmpanel_modificarordencerrada.setProperty("ConfirmationText", Dvelop_confirmpanel_modificarordencerrada_Confirmationtext);
         ucDvelop_confirmpanel_modificarordencerrada.setProperty("YesButtonCaption", Dvelop_confirmpanel_modificarordencerrada_Yesbuttoncaption);
         ucDvelop_confirmpanel_modificarordencerrada.setProperty("NoButtonCaption", Dvelop_confirmpanel_modificarordencerrada_Nobuttoncaption);
         ucDvelop_confirmpanel_modificarordencerrada.setProperty("CancelButtonCaption", Dvelop_confirmpanel_modificarordencerrada_Cancelbuttoncaption);
         ucDvelop_confirmpanel_modificarordencerrada.setProperty("YesButtonPosition", Dvelop_confirmpanel_modificarordencerrada_Yesbuttonposition);
         ucDvelop_confirmpanel_modificarordencerrada.setProperty("ConfirmType", Dvelop_confirmpanel_modificarordencerrada_Confirmtype);
         ucDvelop_confirmpanel_modificarordencerrada.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_modificarordencerrada_Internalname, "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_99_YH2e( true) ;
      }
      else
      {
         wb_table3_99_YH2e( false) ;
      }
   }

   public void wb_table2_94_YH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_imprimirorden_Internalname, tblTabledvelop_confirmpanel_imprimirorden_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_imprimirorden.setProperty("Title", Dvelop_confirmpanel_imprimirorden_Title);
         ucDvelop_confirmpanel_imprimirorden.setProperty("ConfirmationText", Dvelop_confirmpanel_imprimirorden_Confirmationtext);
         ucDvelop_confirmpanel_imprimirorden.setProperty("YesButtonCaption", Dvelop_confirmpanel_imprimirorden_Yesbuttoncaption);
         ucDvelop_confirmpanel_imprimirorden.setProperty("NoButtonCaption", Dvelop_confirmpanel_imprimirorden_Nobuttoncaption);
         ucDvelop_confirmpanel_imprimirorden.setProperty("CancelButtonCaption", Dvelop_confirmpanel_imprimirorden_Cancelbuttoncaption);
         ucDvelop_confirmpanel_imprimirorden.setProperty("YesButtonPosition", Dvelop_confirmpanel_imprimirorden_Yesbuttonposition);
         ucDvelop_confirmpanel_imprimirorden.setProperty("ConfirmType", Dvelop_confirmpanel_imprimirorden_Confirmtype);
         ucDvelop_confirmpanel_imprimirorden.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_imprimirorden_Internalname, "DVELOP_CONFIRMPANEL_IMPRIMIRORDENContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_IMPRIMIRORDENContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_94_YH2e( true) ;
      }
      else
      {
         wb_table2_94_YH2e( false) ;
      }
   }

   public void wb_table1_39_YH2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV33ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_44_YH2( true) ;
      }
      else
      {
         wb_table6_44_YH2( false) ;
      }
      return  ;
   }

   public void wb_table6_44_YH2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_39_YH2e( true) ;
      }
      else
      {
         wb_table1_39_YH2e( false) ;
      }
   }

   public void wb_table6_44_YH2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV25FilterFullText, GXutil.rtrim( localUtil.format( AV25FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TMOrdenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_44_YH2e( true) ;
      }
      else
      {
         wb_table6_44_YH2e( false) ;
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
      paYH2( ) ;
      wsYH2( ) ;
      weYH2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263622124481", true, true);
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
      httpContext.AddJavascriptSource("tmordenww.js", "?20263622124481", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_572( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_57_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_57_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_57_idx );
      chkavSel.setInternalname( "vSEL_"+sGXsfl_57_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_57_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_57_idx ;
      edtOMCod_Internalname = "OMCOD_"+sGXsfl_57_idx ;
      edtPMCod_Internalname = "PMCOD_"+sGXsfl_57_idx ;
      edtPMDsc_Internalname = "PMDSC_"+sGXsfl_57_idx ;
      edtOMMaqCod_Internalname = "OMMAQCOD_"+sGXsfl_57_idx ;
      edtOMMaqDsc_Internalname = "OMMAQDSC_"+sGXsfl_57_idx ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO_"+sGXsfl_57_idx ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA_"+sGXsfl_57_idx ;
      edtSMCod_Internalname = "SMCOD_"+sGXsfl_57_idx ;
      cmbOMEst.setInternalname( "OMEST_"+sGXsfl_57_idx );
      edtOMUsuCre_Internalname = "OMUSUCRE_"+sGXsfl_57_idx ;
      edtOMFchCre_Internalname = "OMFCHCRE_"+sGXsfl_57_idx ;
      edtOMTxt_Internalname = "OMTXT_"+sGXsfl_57_idx ;
      edtOMFchPre_Internalname = "OMFCHPRE_"+sGXsfl_57_idx ;
      edtOMFchCer_Internalname = "OMFCHCER_"+sGXsfl_57_idx ;
      edtOMDuracion_Internalname = "OMDURACION_"+sGXsfl_57_idx ;
      edtOMCosRea_Internalname = "OMCOSREA_"+sGXsfl_57_idx ;
      edtOMRRCosT_Internalname = "OMRRCOST_"+sGXsfl_57_idx ;
      edtOMRCCosT_Internalname = "OMRCCOST_"+sGXsfl_57_idx ;
      edtOMMRCosT_Internalname = "OMMRCOST_"+sGXsfl_57_idx ;
      edtOMMCCosT_Internalname = "OMMCCOST_"+sGXsfl_57_idx ;
      edtOMNot_Internalname = "OMNOT_"+sGXsfl_57_idx ;
   }

   public void subsflControlProps_fel_572( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_57_fel_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_57_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_57_fel_idx );
      chkavSel.setInternalname( "vSEL_"+sGXsfl_57_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_57_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_57_fel_idx ;
      edtOMCod_Internalname = "OMCOD_"+sGXsfl_57_fel_idx ;
      edtPMCod_Internalname = "PMCOD_"+sGXsfl_57_fel_idx ;
      edtPMDsc_Internalname = "PMDSC_"+sGXsfl_57_fel_idx ;
      edtOMMaqCod_Internalname = "OMMAQCOD_"+sGXsfl_57_fel_idx ;
      edtOMMaqDsc_Internalname = "OMMAQDSC_"+sGXsfl_57_fel_idx ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO_"+sGXsfl_57_fel_idx ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA_"+sGXsfl_57_fel_idx ;
      edtSMCod_Internalname = "SMCOD_"+sGXsfl_57_fel_idx ;
      cmbOMEst.setInternalname( "OMEST_"+sGXsfl_57_fel_idx );
      edtOMUsuCre_Internalname = "OMUSUCRE_"+sGXsfl_57_fel_idx ;
      edtOMFchCre_Internalname = "OMFCHCRE_"+sGXsfl_57_fel_idx ;
      edtOMTxt_Internalname = "OMTXT_"+sGXsfl_57_fel_idx ;
      edtOMFchPre_Internalname = "OMFCHPRE_"+sGXsfl_57_fel_idx ;
      edtOMFchCer_Internalname = "OMFCHCER_"+sGXsfl_57_fel_idx ;
      edtOMDuracion_Internalname = "OMDURACION_"+sGXsfl_57_fel_idx ;
      edtOMCosRea_Internalname = "OMCOSREA_"+sGXsfl_57_fel_idx ;
      edtOMRRCosT_Internalname = "OMRRCOST_"+sGXsfl_57_fel_idx ;
      edtOMRCCosT_Internalname = "OMRCCOST_"+sGXsfl_57_fel_idx ;
      edtOMMRCosT_Internalname = "OMMRCOST_"+sGXsfl_57_fel_idx ;
      edtOMMCCosT_Internalname = "OMMCCOST_"+sGXsfl_57_fel_idx ;
      edtOMNot_Internalname = "OMNOT_"+sGXsfl_57_fel_idx ;
   }

   public void sendrow_572( )
   {
      subsflControlProps_572( ) ;
      wbYH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_57_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_57_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_57_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_57_idx+"',57)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExpand_Internalname,GXutil.rtrim( AV134Expand),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVEXPAND.CLICK."+sGXsfl_57_idx+"'","","","","",edtavExpand_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavExpand_Columnclass,"",Integer.valueOf(0),Integer.valueOf(edtavExpand_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_57_idx+"',57)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_groupcaption_Internalname,AV123Grid_GroupCaption,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_groupcaption_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_groupcaption_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_57_idx+"',57)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_57_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV122GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV122GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV122GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e35yh2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,60);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV122GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSel.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSel.getEnabled()!=0)&&(chkavSel.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_57_idx+"',57)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSEL_" + sGXsfl_57_idx ;
         chkavSel.setName( GXCCtl );
         chkavSel.setWebtags( "" );
         chkavSel.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSel.getInternalname(), "TitleCaption", chkavSel.getCaption(), !bGXsfl_57_Refreshing);
         chkavSel.setCheckedValue( "N" );
         AV146Sel = ((GXutil.strcmp(GXutil.rtrim( AV146Sel), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV146Sel);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSel.getInternalname(),AV146Sel,"","",Integer.valueOf(chkavSel.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSel.getEnabled()!=0)&&(chkavSel.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,61);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9425OMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDsc_Internalname,GXutil.rtrim( A9473PMDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPMDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMaqCod_Internalname,GXutil.rtrim( A9426OMMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMaqDsc_Internalname,GXutil.rtrim( A9427OMMaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMMaqCodFo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMaqCodFo_Internalname,GXutil.rtrim( A13679OMMaqCodFo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMaqCodFo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtOMMaqCodFo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMDscMqPla_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMDscMqPla_Internalname,GXutil.rtrim( A13678OMDscMqPla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMDscMqPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMDscMqPla_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtSMCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtSMCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbOMEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbOMEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "OMEST_" + sGXsfl_57_idx ;
            cmbOMEst.setName( GXCCtl );
            cmbOMEst.setWebtags( "" );
            cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
            if ( cmbOMEst.getItemCount() > 0 )
            {
               A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbOMEst,cmbOMEst.getInternalname(),GXutil.rtrim( A9445OMEst),Integer.valueOf(1),cmbOMEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbOMEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbOMEst.getColumnClass(),cmbOMEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbOMEst.setValue( GXutil.rtrim( A9445OMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbOMEst.getInternalname(), "Values", cmbOMEst.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMUsuCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMUsuCre_Internalname,GXutil.rtrim( A9437OMUsuCre),GXutil.rtrim( localUtil.format( A9437OMUsuCre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMUsuCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMUsuCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMFchCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMFchCre_Internalname,localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9436OMFchCre, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMFchCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMFchCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMTxt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMTxt_Internalname,A9433OMTxt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMTxt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMFchPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMFchPre_Internalname,localUtil.format(A9438OMFchPre, "99/99/99"),localUtil.format( A9438OMFchPre, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMFchPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMFchPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMFchCer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMFchCer_Internalname,localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9439OMFchCer, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMFchCer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMFchCer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMDuracion_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMDuracion_Internalname,A13680OMDuracion,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMDuracion_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMDuracion_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMCosRea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMCosRea_Internalname,GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9440OMCosRea, "ZZ,ZZZ,ZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMCosRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMCosRea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMRRCosT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRRCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9444OMRRCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRRCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMRRCosT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMRCCosT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMRCCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9443OMRCCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMRCCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMRCCosT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMMRCosT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMRCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9442OMMRCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMRCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMMRCosT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtOMMCCosT_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMMCCosT_Internalname,GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A9441OMMCCosT, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMMCCosT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMMCCosT_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtOMNot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOMNot_Internalname,A9464OMNot,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOMNot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtOMNot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesYH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_57_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      /* End function sendrow_572 */
   }

   public void startgridcontrol57( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"57\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkavSel.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preventivo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMMaqCodFo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod For", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMDscMqPla_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mq Planificar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtSMCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Solicitud", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbOMEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMUsuCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMFchCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Creación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMTxt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMFchPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Prevista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMFchCer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMDuracion_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Duracion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMCosRea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMRRCosT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Reserva Repuesto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMRCCosT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Consumo Repuesto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMMRCosT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Reserva Mano Obra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMMCCosT_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Costo Total Consumo Mano Obra", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtOMNot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nota", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV134Expand));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExpand_Columnclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExpand_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV123Grid_GroupCaption);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_groupcaption_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV122GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV146Sel));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSel.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9425OMCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9473PMDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9426OMMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9427OMMaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13679OMMaqCodFo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMMaqCodFo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13678OMDscMqPla));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMDscMqPla_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtSMCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9445OMEst));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbOMEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbOMEst.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbOMEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9437OMUsuCre));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMUsuCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A9436OMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMFchCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A9433OMTxt);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMTxt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9438OMFchPre, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMFchPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A9439OMFchCer, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMFchCer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13680OMDuracion);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMDuracion_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9440OMCosRea, (byte)(14), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMCosRea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9444OMRRCosT, (byte)(12), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMRRCosT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9443OMRCCosT, (byte)(12), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMRCCosT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9442OMMRCosT, (byte)(12), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMMRCosT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9441OMMCCosT, (byte)(12), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMMCCosT_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A9464OMNot);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtOMNot_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtneliminarordenes_Internalname = "BTNELIMINARORDENES" ;
      bttBtnexcel_Internalname = "BTNEXCEL" ;
      bttBtnlistado_Internalname = "BTNLISTADO" ;
      bttBtnlistadodetalle_Internalname = "BTNLISTADODETALLE" ;
      bttBtnlistadotrabajo_Internalname = "BTNLISTADOTRABAJO" ;
      bttBtnexcelwin_Internalname = "BTNEXCELWIN" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavExpand_Internalname = "vEXPAND" ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      chkavSel.setInternalname( "vSEL" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtOMCod_Internalname = "OMCOD" ;
      edtPMCod_Internalname = "PMCOD" ;
      edtPMDsc_Internalname = "PMDSC" ;
      edtOMMaqCod_Internalname = "OMMAQCOD" ;
      edtOMMaqDsc_Internalname = "OMMAQDSC" ;
      edtOMMaqCodFo_Internalname = "OMMAQCODFO" ;
      edtOMDscMqPla_Internalname = "OMDSCMQPLA" ;
      edtSMCod_Internalname = "SMCOD" ;
      cmbOMEst.setInternalname( "OMEST" );
      edtOMUsuCre_Internalname = "OMUSUCRE" ;
      edtOMFchCre_Internalname = "OMFCHCRE" ;
      edtOMTxt_Internalname = "OMTXT" ;
      edtOMFchPre_Internalname = "OMFCHPRE" ;
      edtOMFchCer_Internalname = "OMFCHCER" ;
      edtOMDuracion_Internalname = "OMDURACION" ;
      edtOMCosRea_Internalname = "OMCOSREA" ;
      edtOMRRCosT_Internalname = "OMRRCOST" ;
      edtOMRCCosT_Internalname = "OMRCCOST" ;
      edtOMMRCosT_Internalname = "OMMRCOST" ;
      edtOMMCCosT_Internalname = "OMMCCOST" ;
      edtOMNot_Internalname = "OMNOT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_imprimirorden_Internalname = "DVELOP_CONFIRMPANEL_IMPRIMIRORDEN" ;
      tblTabledvelop_confirmpanel_imprimirorden_Internalname = "TABLEDVELOP_CONFIRMPANEL_IMPRIMIRORDEN" ;
      Dvelop_confirmpanel_modificarordencerrada_Internalname = "DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA" ;
      tblTabledvelop_confirmpanel_modificarordencerrada_Internalname = "TABLEDVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA" ;
      Dvelop_confirmpanel_cerrarorden_Internalname = "DVELOP_CONFIRMPANEL_CERRARORDEN" ;
      tblTabledvelop_confirmpanel_cerrarorden_Internalname = "TABLEDVELOP_CONFIRMPANEL_CERRARORDEN" ;
      Dvelop_confirmpanel_eliminarordenes_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARORDENES" ;
      tblTabledvelop_confirmpanel_eliminarordenes_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARORDENES" ;
      Grid_group_Internalname = "GRID_GROUP" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_omfchcreauxdate_Internalname = "vDDO_OMFCHCREAUXDATE" ;
      divDdo_omfchcreauxdates_Internalname = "DDO_OMFCHCREAUXDATES" ;
      edtavDdo_omfchpreauxdate_Internalname = "vDDO_OMFCHPREAUXDATE" ;
      divDdo_omfchpreauxdates_Internalname = "DDO_OMFCHPREAUXDATES" ;
      edtavDdo_omfchcerauxdate_Internalname = "vDDO_OMFCHCERAUXDATE" ;
      divDdo_omfchcerauxdates_Internalname = "DDO_OMFCHCERAUXDATES" ;
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
      edtOMNot_Jsonclick = "" ;
      edtOMMCCosT_Jsonclick = "" ;
      edtOMMRCosT_Jsonclick = "" ;
      edtOMRCCosT_Jsonclick = "" ;
      edtOMRRCosT_Jsonclick = "" ;
      edtOMCosRea_Jsonclick = "" ;
      edtOMDuracion_Jsonclick = "" ;
      edtOMFchCer_Jsonclick = "" ;
      edtOMFchPre_Jsonclick = "" ;
      edtOMTxt_Jsonclick = "" ;
      edtOMFchCre_Jsonclick = "" ;
      edtOMUsuCre_Jsonclick = "" ;
      cmbOMEst.setJsonclick( "" );
      cmbOMEst.setColumnClass( "WWColumn hidden-xs" );
      edtSMCod_Jsonclick = "" ;
      edtOMDscMqPla_Jsonclick = "" ;
      edtOMMaqCodFo_Jsonclick = "" ;
      edtOMMaqDsc_Jsonclick = "" ;
      edtOMMaqCod_Jsonclick = "" ;
      edtPMDsc_Jsonclick = "" ;
      edtPMCod_Jsonclick = "" ;
      edtOMCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkavSel.setCaption( "" );
      chkavSel.setEnabled( 1 );
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      edtavGrid_groupcaption_Jsonclick = "" ;
      edtavGrid_groupcaption_Visible = 0 ;
      edtavGrid_groupcaption_Enabled = 1 ;
      edtavExpand_Jsonclick = "" ;
      edtavExpand_Columnclass = "WWIconActionColumn" ;
      edtavExpand_Visible = 0 ;
      edtavExpand_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbOMEst.setColumnHeaderClass( "" );
      edtOMNot_Visible = -1 ;
      edtOMMCCosT_Visible = -1 ;
      edtOMMRCosT_Visible = -1 ;
      edtOMRCCosT_Visible = -1 ;
      edtOMRRCosT_Visible = -1 ;
      edtOMCosRea_Visible = -1 ;
      edtOMDuracion_Visible = -1 ;
      edtOMFchCer_Visible = -1 ;
      edtOMFchPre_Visible = -1 ;
      edtOMTxt_Visible = -1 ;
      edtOMFchCre_Visible = -1 ;
      edtOMUsuCre_Visible = -1 ;
      cmbOMEst.setVisible( -1 );
      edtSMCod_Visible = -1 ;
      edtOMDscMqPla_Visible = -1 ;
      edtOMMaqCodFo_Visible = -1 ;
      edtOMMaqDsc_Visible = -1 ;
      edtOMMaqCod_Visible = -1 ;
      edtPMDsc_Visible = -1 ;
      edtPMCod_Visible = -1 ;
      edtOMCod_Visible = -1 ;
      chkavSel.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_omfchcerauxdate_Jsonclick = "" ;
      edtavDdo_omfchpreauxdate_Jsonclick = "" ;
      edtavDdo_omfchcreauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = ";;L;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hasrowgroups = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_group_Columnindex = 1 ;
      Dvelop_confirmpanel_eliminarordenes_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarordenes_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarordenes_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarordenes_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarordenes_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarordenes_Confirmationtext = "Desea eliminar las Ordenes seleccionadas?" ;
      Dvelop_confirmpanel_eliminarordenes_Title = "" ;
      Dvelop_confirmpanel_cerrarorden_Confirmtype = "1" ;
      Dvelop_confirmpanel_cerrarorden_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cerrarorden_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cerrarorden_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cerrarorden_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cerrarorden_Confirmationtext = "Desea cerrar la Orden ?" ;
      Dvelop_confirmpanel_cerrarorden_Title = httpContext.getMessage( "Cerrar Orden", "") ;
      Dvelop_confirmpanel_modificarordencerrada_Confirmtype = "1" ;
      Dvelop_confirmpanel_modificarordencerrada_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_modificarordencerrada_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_modificarordencerrada_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_modificarordencerrada_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_modificarordencerrada_Confirmationtext = "Desea modificar una Orden Cerrada?" ;
      Dvelop_confirmpanel_modificarordencerrada_Title = httpContext.getMessage( "Modificar Orden", "") ;
      Dvelop_confirmpanel_imprimirorden_Confirmtype = "1" ;
      Dvelop_confirmpanel_imprimirorden_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_imprimirorden_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_imprimirorden_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_imprimirorden_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_imprimirorden_Confirmationtext = "Esta seguro de imprimir orden" ;
      Dvelop_confirmpanel_imprimirorden_Title = httpContext.getMessage( "Imprimir", "") ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TMOrdenWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||P:Pendiente,R:Realizada||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||T||||||||||||" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||FixedValues|Dynamic||Dynamic|||Dynamic||||||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T|T|T|T|T||T|T||T|||T||||||T" ;
      Ddo_grid_Filterisrange = "|T|T||||||T||||||||T|T|T|T|T|" ;
      Ddo_grid_Filtertype = "|Numeric|Numeric|Character|Character|Character|Character|Character|Numeric||Character|Date|Character|Date|Date|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T||T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Allowgroup = "||||T|T||||||||||||||||" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|||T|T||T|T|T|T|||||||T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4|5|||6|7||8|9|10|11|||||||12" ;
      Ddo_grid_Columnids = "3:Sel|6:OMCod|7:PMCod|8:PMDsc|9:OMMaqCod|10:OMMaqDsc|11:OMMaqCodFor|12:OMDscMqPla|13:SMCod|14:OMEst|15:OMUsuCre|16:OMFchCre|17:OMTxt|18:OMFchPre|19:OMFchCer|20:OMDuracion|21:OMCosRea|22:OMRRCosT|23:OMRCCosT|24:OMMRCosT|25:OMMCCosT|26:OMNot" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Ordenes de Mantenimiento", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_57_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV122GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV122GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122GridActions), 4, 0));
      }
      GXCCtl = "vSEL_" + sGXsfl_57_idx ;
      chkavSel.setName( GXCCtl );
      chkavSel.setWebtags( "" );
      chkavSel.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSel.getInternalname(), "TitleCaption", chkavSel.getCaption(), !bGXsfl_57_Refreshing);
      chkavSel.setCheckedValue( "N" );
      AV146Sel = ((GXutil.strcmp(GXutil.rtrim( AV146Sel), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV146Sel);
      GXCCtl = "OMEST_" + sGXsfl_57_idx ;
      cmbOMEst.setName( GXCCtl );
      cmbOMEst.setWebtags( "" );
      cmbOMEst.addItem("P", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbOMEst.addItem("R", httpContext.getMessage( "Realizada", ""), (short)(0));
      if ( cmbOMEst.getItemCount() > 0 )
      {
         A9445OMEst = cmbOMEst.getValidValue(A9445OMEst) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtOMCod_Visible',ctrl:'OMCOD',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtOMMaqCod_Visible',ctrl:'OMMAQCOD',prop:'Visible'},{av:'edtOMMaqDsc_Visible',ctrl:'OMMAQDSC',prop:'Visible'},{av:'edtOMMaqCodFo_Visible',ctrl:'OMMAQCODFO',prop:'Visible'},{av:'edtOMDscMqPla_Visible',ctrl:'OMDSCMQPLA',prop:'Visible'},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbOMEst'},{av:'edtOMUsuCre_Visible',ctrl:'OMUSUCRE',prop:'Visible'},{av:'edtOMFchCre_Visible',ctrl:'OMFCHCRE',prop:'Visible'},{av:'edtOMTxt_Visible',ctrl:'OMTXT',prop:'Visible'},{av:'edtOMFchPre_Visible',ctrl:'OMFCHPRE',prop:'Visible'},{av:'edtOMFchCer_Visible',ctrl:'OMFCHCER',prop:'Visible'},{av:'edtOMDuracion_Visible',ctrl:'OMDURACION',prop:'Visible'},{av:'edtOMCosRea_Visible',ctrl:'OMCOSREA',prop:'Visible'},{av:'edtOMRRCosT_Visible',ctrl:'OMRRCOST',prop:'Visible'},{av:'edtOMRCCosT_Visible',ctrl:'OMRCCOST',prop:'Visible'},{av:'edtOMMRCosT_Visible',ctrl:'OMMRCOST',prop:'Visible'},{av:'edtOMMCCosT_Visible',ctrl:'OMMCCOST',prop:'Visible'},{av:'edtOMNot_Visible',ctrl:'OMNOT',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV123Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e14YH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e15YH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e16YH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedtext_get',ctrl:'DDO_GRID',prop:'SelectedText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e33YH2',iparms:[{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV146Sel',fld:'vSEL',pic:''},{av:'AV123Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV134Expand',fld:'vEXPAND',pic:''},{av:'edtavExpand_Columnclass',ctrl:'vEXPAND',prop:'Columnclass'},{av:'cmbavGridactions'},{av:'AV122GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'cmbOMEst'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e17YH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtOMCod_Visible',ctrl:'OMCOD',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtOMMaqCod_Visible',ctrl:'OMMAQCOD',prop:'Visible'},{av:'edtOMMaqDsc_Visible',ctrl:'OMMAQDSC',prop:'Visible'},{av:'edtOMMaqCodFo_Visible',ctrl:'OMMAQCODFO',prop:'Visible'},{av:'edtOMDscMqPla_Visible',ctrl:'OMDSCMQPLA',prop:'Visible'},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbOMEst'},{av:'edtOMUsuCre_Visible',ctrl:'OMUSUCRE',prop:'Visible'},{av:'edtOMFchCre_Visible',ctrl:'OMFCHCRE',prop:'Visible'},{av:'edtOMTxt_Visible',ctrl:'OMTXT',prop:'Visible'},{av:'edtOMFchPre_Visible',ctrl:'OMFCHPRE',prop:'Visible'},{av:'edtOMFchCer_Visible',ctrl:'OMFCHCER',prop:'Visible'},{av:'edtOMDuracion_Visible',ctrl:'OMDURACION',prop:'Visible'},{av:'edtOMCosRea_Visible',ctrl:'OMCOSREA',prop:'Visible'},{av:'edtOMRRCosT_Visible',ctrl:'OMRRCOST',prop:'Visible'},{av:'edtOMRCCosT_Visible',ctrl:'OMRCCOST',prop:'Visible'},{av:'edtOMMRCosT_Visible',ctrl:'OMMRCOST',prop:'Visible'},{av:'edtOMMCCosT_Visible',ctrl:'OMMCCOST',prop:'Visible'},{av:'edtOMNot_Visible',ctrl:'OMNOT',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV123Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e13YH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'AV127GroupOMMaqCod',fld:'vGROUPOMMAQCOD',pic:''},{av:'AV135GroupOMMaqDsc',fld:'vGROUPOMMAQDSC',pic:''},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtOMCod_Visible',ctrl:'OMCOD',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtOMMaqCod_Visible',ctrl:'OMMAQCOD',prop:'Visible'},{av:'edtOMMaqDsc_Visible',ctrl:'OMMAQDSC',prop:'Visible'},{av:'edtOMMaqCodFo_Visible',ctrl:'OMMAQCODFO',prop:'Visible'},{av:'edtOMDscMqPla_Visible',ctrl:'OMDSCMQPLA',prop:'Visible'},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbOMEst'},{av:'edtOMUsuCre_Visible',ctrl:'OMUSUCRE',prop:'Visible'},{av:'edtOMFchCre_Visible',ctrl:'OMFCHCRE',prop:'Visible'},{av:'edtOMTxt_Visible',ctrl:'OMTXT',prop:'Visible'},{av:'edtOMFchPre_Visible',ctrl:'OMFCHPRE',prop:'Visible'},{av:'edtOMFchCer_Visible',ctrl:'OMFCHCER',prop:'Visible'},{av:'edtOMDuracion_Visible',ctrl:'OMDURACION',prop:'Visible'},{av:'edtOMCosRea_Visible',ctrl:'OMCOSREA',prop:'Visible'},{av:'edtOMRRCosT_Visible',ctrl:'OMRRCOST',prop:'Visible'},{av:'edtOMRCCosT_Visible',ctrl:'OMRCCOST',prop:'Visible'},{av:'edtOMMRCosT_Visible',ctrl:'OMMRCOST',prop:'Visible'},{av:'edtOMMCCosT_Visible',ctrl:'OMMCCOST',prop:'Visible'},{av:'edtOMNot_Visible',ctrl:'OMNOT',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV123Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e35YH2',iparms:[{av:'cmbavGridactions'},{av:'AV122GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV6Accion',fld:'vACCION',pic:''},{av:'cmbOMEst'},{av:'A9445OMEst',fld:'OMEST',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV122GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV6Accion',fld:'vACCION',pic:''},{av:'AV21EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV36OMCod_Selected',fld:'vOMCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_cerrarorden_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CERRARORDEN',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_IMPRIMIRORDEN.CLOSE","{handler:'e18YH2',iparms:[{av:'Dvelop_confirmpanel_imprimirorden_Result',ctrl:'DVELOP_CONFIRMPANEL_IMPRIMIRORDEN',prop:'Result'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_IMPRIMIRORDEN.CLOSE",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA.CLOSE","{handler:'e19YH2',iparms:[{av:'Dvelop_confirmpanel_modificarordencerrada_Result',ctrl:'DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA',prop:'Result'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_MODIFICARORDENCERRADA.CLOSE",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRARORDEN.CLOSE","{handler:'e20YH2',iparms:[{av:'Dvelop_confirmpanel_cerrarorden_Result',ctrl:'DVELOP_CONFIRMPANEL_CERRARORDEN',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV21EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV36OMCod_Selected',fld:'vOMCOD_SELECTED',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRARORDEN.CLOSE",",oparms:[{av:'AV36OMCod_Selected',fld:'vOMCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV21EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtOMCod_Visible',ctrl:'OMCOD',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtOMMaqCod_Visible',ctrl:'OMMAQCOD',prop:'Visible'},{av:'edtOMMaqDsc_Visible',ctrl:'OMMAQDSC',prop:'Visible'},{av:'edtOMMaqCodFo_Visible',ctrl:'OMMAQCODFO',prop:'Visible'},{av:'edtOMDscMqPla_Visible',ctrl:'OMDSCMQPLA',prop:'Visible'},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbOMEst'},{av:'edtOMUsuCre_Visible',ctrl:'OMUSUCRE',prop:'Visible'},{av:'edtOMFchCre_Visible',ctrl:'OMFCHCRE',prop:'Visible'},{av:'edtOMTxt_Visible',ctrl:'OMTXT',prop:'Visible'},{av:'edtOMFchPre_Visible',ctrl:'OMFCHPRE',prop:'Visible'},{av:'edtOMFchCer_Visible',ctrl:'OMFCHCER',prop:'Visible'},{av:'edtOMDuracion_Visible',ctrl:'OMDURACION',prop:'Visible'},{av:'edtOMCosRea_Visible',ctrl:'OMCOSREA',prop:'Visible'},{av:'edtOMRRCosT_Visible',ctrl:'OMRRCOST',prop:'Visible'},{av:'edtOMRCCosT_Visible',ctrl:'OMRCCOST',prop:'Visible'},{av:'edtOMMRCosT_Visible',ctrl:'OMMRCOST',prop:'Visible'},{av:'edtOMMCCosT_Visible',ctrl:'OMMCCOST',prop:'Visible'},{av:'edtOMNot_Visible',ctrl:'OMNOT',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV123Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e22YH2',iparms:[{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV6Accion',fld:'vACCION',pic:''}]}");
      setEventMetadata("'DOELIMINARORDENES'","{handler:'e11YH1',iparms:[]");
      setEventMetadata("'DOELIMINARORDENES'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARORDENES.CLOSE","{handler:'e21YH2',iparms:[{av:'Dvelop_confirmpanel_eliminarordenes_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARORDENES',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV146Sel',fld:'vSEL',grid:57,pic:''},{av:'nRC_GXsfl_57',ctrl:'GRID',grid:57,prop:'GridRC',grid:57},{av:'A396EmprCod',fld:'EMPRCOD',grid:57,pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',grid:57,pic:'ZZZZZZZ9'},{av:'A9429PMCod',fld:'PMCOD',grid:57,pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARORDENES.CLOSE",",oparms:[{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtOMCod_Visible',ctrl:'OMCOD',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtOMMaqCod_Visible',ctrl:'OMMAQCOD',prop:'Visible'},{av:'edtOMMaqDsc_Visible',ctrl:'OMMAQDSC',prop:'Visible'},{av:'edtOMMaqCodFo_Visible',ctrl:'OMMAQCODFO',prop:'Visible'},{av:'edtOMDscMqPla_Visible',ctrl:'OMDSCMQPLA',prop:'Visible'},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbOMEst'},{av:'edtOMUsuCre_Visible',ctrl:'OMUSUCRE',prop:'Visible'},{av:'edtOMFchCre_Visible',ctrl:'OMFCHCRE',prop:'Visible'},{av:'edtOMTxt_Visible',ctrl:'OMTXT',prop:'Visible'},{av:'edtOMFchPre_Visible',ctrl:'OMFCHPRE',prop:'Visible'},{av:'edtOMFchCer_Visible',ctrl:'OMFCHCER',prop:'Visible'},{av:'edtOMDuracion_Visible',ctrl:'OMDURACION',prop:'Visible'},{av:'edtOMCosRea_Visible',ctrl:'OMCOSREA',prop:'Visible'},{av:'edtOMRRCosT_Visible',ctrl:'OMRRCOST',prop:'Visible'},{av:'edtOMRCCosT_Visible',ctrl:'OMRCCOST',prop:'Visible'},{av:'edtOMMRCosT_Visible',ctrl:'OMMRCOST',prop:'Visible'},{av:'edtOMMCCosT_Visible',ctrl:'OMMCCOST',prop:'Visible'},{av:'edtOMNot_Visible',ctrl:'OMNOT',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV123Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("'DOEXCEL'","{handler:'e23YH2',iparms:[{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A9425OMCod',fld:'OMCOD',grid:57,pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_57',ctrl:'GRID',grid:57,prop:'GridRC',grid:57},{av:'A9429PMCod',fld:'PMCOD',grid:57,pic:'ZZZZZZZ9'},{av:'A9445OMEst',fld:'OMEST',grid:57,pic:''},{av:'A9436OMFchCre',fld:'OMFCHCRE',grid:57,pic:'99/99/99 99:99'},{av:'A9438OMFchPre',fld:'OMFCHPRE',grid:57,pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',grid:57,pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',grid:57,pic:''},{av:'A9433OMTxt',fld:'OMTXT',grid:57,pic:''},{av:'A9464OMNot',fld:'OMNOT',grid:57,pic:''}]");
      setEventMetadata("'DOEXCEL'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOLISTADO'","{handler:'e24YH2',iparms:[{av:'A9425OMCod',fld:'OMCOD',grid:57,pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_57',ctrl:'GRID',grid:57,prop:'GridRC',grid:57},{av:'A396EmprCod',fld:'EMPRCOD',grid:57,pic:'@!'}]");
      setEventMetadata("'DOLISTADO'",",oparms:[]}");
      setEventMetadata("'DOLISTADODETALLE'","{handler:'e25YH2',iparms:[{av:'A9425OMCod',fld:'OMCOD',grid:57,pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_57',ctrl:'GRID',grid:57,prop:'GridRC',grid:57},{av:'A396EmprCod',fld:'EMPRCOD',grid:57,pic:'@!'}]");
      setEventMetadata("'DOLISTADODETALLE'",",oparms:[]}");
      setEventMetadata("'DOLISTADOTRABAJO'","{handler:'e12YH1',iparms:[]");
      setEventMetadata("'DOLISTADOTRABAJO'",",oparms:[]}");
      setEventMetadata("'DOEXCELWIN'","{handler:'e26YH2',iparms:[]");
      setEventMetadata("'DOEXCELWIN'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e27YH2',iparms:[{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV127GroupOMMaqCod',fld:'vGROUPOMMAQCOD',pic:''},{av:'AV135GroupOMMaqDsc',fld:'vGROUPOMMAQDSC',pic:''}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e28YH2',iparms:[{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV127GroupOMMaqCod',fld:'vGROUPOMMAQCOD',pic:''},{av:'AV135GroupOMMaqDsc',fld:'vGROUPOMMAQDSC',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e29YH2',iparms:[{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV12DDO_OMFchCerAuxDate',fld:'vDDO_OMFCHCERAUXDATE',pic:''},{av:'AV14DDO_OMFchCreAuxDate',fld:'vDDO_OMFCHCREAUXDATE',pic:''},{av:'AV57TFOMEst_SelsJson',fld:'vTFOMEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV127GroupOMMaqCod',fld:'vGROUPOMMAQCOD',pic:''},{av:'AV135GroupOMMaqDsc',fld:'vGROUPOMMAQDSC',pic:''}]}");
      setEventMetadata("VEXPAND.CLICK","{handler:'e34YH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48TFOMCod',fld:'vTFOMCOD',pic:'ZZZZZZZ9'},{av:'AV49TFOMCod_To',fld:'vTFOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV84TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV85TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV139TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV140TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV64TFOMMaqCod',fld:'vTFOMMAQCOD',pic:''},{av:'AV65TFOMMaqCod_Sel',fld:'vTFOMMAQCOD_SEL',pic:''},{av:'AV68TFOMMaqDsc',fld:'vTFOMMAQDSC',pic:''},{av:'AV69TFOMMaqDsc_Sel',fld:'vTFOMMAQDSC_SEL',pic:''},{av:'AV66TFOMMaqCodFor',fld:'vTFOMMAQCODFOR',pic:''},{av:'AV67TFOMMaqCodFor_Sel',fld:'vTFOMMAQCODFOR_SEL',pic:''},{av:'AV52TFOMDscMqPla',fld:'vTFOMDSCMQPLA',pic:''},{av:'AV53TFOMDscMqPla_Sel',fld:'vTFOMDSCMQPLA_SEL',pic:''},{av:'AV86TFSMCod',fld:'vTFSMCOD',pic:'ZZZZZZZ9'},{av:'AV87TFSMCod_To',fld:'vTFSMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFOMEst_Sels',fld:'vTFOMEST_SELS',pic:''},{av:'AV82TFOMUsuCre',fld:'vTFOMUSUCRE',pic:'@!'},{av:'AV83TFOMUsuCre_Sel',fld:'vTFOMUSUCRE_SEL',pic:'@!'},{av:'AV60TFOMFchCre',fld:'vTFOMFCHCRE',pic:'99/99/99 99:99'},{av:'AV80TFOMTxt',fld:'vTFOMTXT',pic:''},{av:'AV81TFOMTxt_Sel',fld:'vTFOMTXT_SEL',pic:''},{av:'AV62TFOMFchPre',fld:'vTFOMFCHPRE',pic:''},{av:'AV58TFOMFchCer',fld:'vTFOMFCHCER',pic:'99/99/99 99:99'},{av:'AV54TFOMDuracion',fld:'vTFOMDURACION',pic:''},{av:'AV55TFOMDuracion_Sel',fld:'vTFOMDURACION_SEL',pic:''},{av:'AV50TFOMCosRea',fld:'vTFOMCOSREA',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV51TFOMCosRea_To',fld:'vTFOMCOSREA_TO',pic:'ZZ,ZZZ,ZZ9.999'},{av:'AV78TFOMRRCosT',fld:'vTFOMRRCOST',pic:'ZZZZZZZ9.999'},{av:'AV79TFOMRRCosT_To',fld:'vTFOMRRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV76TFOMRCCosT',fld:'vTFOMRCCOST',pic:'ZZZZZZZ9.999'},{av:'AV77TFOMRCCosT_To',fld:'vTFOMRCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV72TFOMMRCosT',fld:'vTFOMMRCOST',pic:'ZZZZZZZ9.999'},{av:'AV73TFOMMRCosT_To',fld:'vTFOMMRCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV70TFOMMCCosT',fld:'vTFOMMCCOST',pic:'ZZZZZZZ9.999'},{av:'AV71TFOMMCCosT_To',fld:'vTFOMMCCOST_TO',pic:'ZZZZZZZ9.999'},{av:'AV74TFOMNot',fld:'vTFOMNOT',pic:''},{av:'AV75TFOMNot_Sel',fld:'vTFOMNOT_SEL',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV38OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV40OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:'',hsh:true},{av:'A9426OMMaqCod',fld:'OMMAQCOD',pic:''},{av:'A9427OMMaqDsc',fld:'OMMAQDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("VEXPAND.CLICK",",oparms:[{av:'AV126GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV129GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV133AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV127GroupOMMaqCod',fld:'vGROUPOMMAQCOD',pic:''},{av:'AV135GroupOMMaqDsc',fld:'vGROUPOMMAQDSC',pic:''},{av:'AV128GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV34ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtOMCod_Visible',ctrl:'OMCOD',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtOMMaqCod_Visible',ctrl:'OMMAQCOD',prop:'Visible'},{av:'edtOMMaqDsc_Visible',ctrl:'OMMAQDSC',prop:'Visible'},{av:'edtOMMaqCodFo_Visible',ctrl:'OMMAQCODFO',prop:'Visible'},{av:'edtOMDscMqPla_Visible',ctrl:'OMDSCMQPLA',prop:'Visible'},{av:'edtSMCod_Visible',ctrl:'SMCOD',prop:'Visible'},{av:'cmbOMEst'},{av:'edtOMUsuCre_Visible',ctrl:'OMUSUCRE',prop:'Visible'},{av:'edtOMFchCre_Visible',ctrl:'OMFCHCRE',prop:'Visible'},{av:'edtOMTxt_Visible',ctrl:'OMTXT',prop:'Visible'},{av:'edtOMFchPre_Visible',ctrl:'OMFCHPRE',prop:'Visible'},{av:'edtOMFchCer_Visible',ctrl:'OMFCHCER',prop:'Visible'},{av:'edtOMDuracion_Visible',ctrl:'OMDURACION',prop:'Visible'},{av:'edtOMCosRea_Visible',ctrl:'OMCOSREA',prop:'Visible'},{av:'edtOMRRCosT_Visible',ctrl:'OMRRCOST',prop:'Visible'},{av:'edtOMRCCosT_Visible',ctrl:'OMRCCOST',prop:'Visible'},{av:'edtOMMRCosT_Visible',ctrl:'OMMRCOST',prop:'Visible'},{av:'edtOMMCCosT_Visible',ctrl:'OMMCCOST',prop:'Visible'},{av:'edtOMNot_Visible',ctrl:'OMNOT',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV123Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:''},{av:'AV33ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV28GridState',fld:'vGRIDSTATE',pic:''},{av:'AV124GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'}]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e30YH2',iparms:[{av:'AV144Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV145ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV189Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9425OMCod',fld:'OMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[]}");
      setEventMetadata("VALIDV_SEL","{handler:'validv_Sel',iparms:[]");
      setEventMetadata("VALIDV_SEL",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_OMCOD","{handler:'valid_Omcod',iparms:[]");
      setEventMetadata("VALID_OMCOD",",oparms:[]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[]");
      setEventMetadata("VALID_PMCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDSC","{handler:'valid_Pmdsc',iparms:[]");
      setEventMetadata("VALID_PMDSC",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCOD","{handler:'valid_Ommaqcod',iparms:[]");
      setEventMetadata("VALID_OMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_OMMAQDSC","{handler:'valid_Ommaqdsc',iparms:[]");
      setEventMetadata("VALID_OMMAQDSC",",oparms:[]}");
      setEventMetadata("VALID_OMMAQCODFO","{handler:'valid_Ommaqcodfo',iparms:[]");
      setEventMetadata("VALID_OMMAQCODFO",",oparms:[]}");
      setEventMetadata("VALID_OMDSCMQPLA","{handler:'valid_Omdscmqpla',iparms:[]");
      setEventMetadata("VALID_OMDSCMQPLA",",oparms:[]}");
      setEventMetadata("VALID_SMCOD","{handler:'valid_Smcod',iparms:[]");
      setEventMetadata("VALID_SMCOD",",oparms:[]}");
      setEventMetadata("VALID_OMEST","{handler:'valid_Omest',iparms:[]");
      setEventMetadata("VALID_OMEST",",oparms:[]}");
      setEventMetadata("VALID_OMUSUCRE","{handler:'valid_Omusucre',iparms:[]");
      setEventMetadata("VALID_OMUSUCRE",",oparms:[]}");
      setEventMetadata("VALID_OMTXT","{handler:'valid_Omtxt',iparms:[]");
      setEventMetadata("VALID_OMTXT",",oparms:[]}");
      setEventMetadata("VALID_OMDURACION","{handler:'valid_Omduracion',iparms:[]");
      setEventMetadata("VALID_OMDURACION",",oparms:[]}");
      setEventMetadata("VALID_OMCOSREA","{handler:'valid_Omcosrea',iparms:[]");
      setEventMetadata("VALID_OMCOSREA",",oparms:[]}");
      setEventMetadata("VALID_OMRRCOST","{handler:'valid_Omrrcost',iparms:[]");
      setEventMetadata("VALID_OMRRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMRCCOST","{handler:'valid_Omrccost',iparms:[]");
      setEventMetadata("VALID_OMRCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMRCOST","{handler:'valid_Ommrcost',iparms:[]");
      setEventMetadata("VALID_OMMRCOST",",oparms:[]}");
      setEventMetadata("VALID_OMMCCOST","{handler:'valid_Ommccost',iparms:[]");
      setEventMetadata("VALID_OMMCCOST",",oparms:[]}");
      setEventMetadata("VALID_OMNOT","{handler:'valid_Omnot',iparms:[]");
      setEventMetadata("VALID_OMNOT",",oparms:[]}");
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
      AV95XLS.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_imprimirorden_Result = "" ;
      Dvelop_confirmpanel_modificarordencerrada_Result = "" ;
      Dvelop_confirmpanel_cerrarorden_Result = "" ;
      Dvelop_confirmpanel_eliminarordenes_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV8ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV25FilterFullText = "" ;
      AV139TFPMDsc = "" ;
      AV140TFPMDsc_Sel = "" ;
      AV64TFOMMaqCod = "" ;
      AV65TFOMMaqCod_Sel = "" ;
      AV68TFOMMaqDsc = "" ;
      AV69TFOMMaqDsc_Sel = "" ;
      AV66TFOMMaqCodFor = "" ;
      AV67TFOMMaqCodFor_Sel = "" ;
      AV52TFOMDscMqPla = "" ;
      AV53TFOMDscMqPla_Sel = "" ;
      AV56TFOMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV82TFOMUsuCre = "" ;
      AV83TFOMUsuCre_Sel = "" ;
      AV60TFOMFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV80TFOMTxt = "" ;
      AV81TFOMTxt_Sel = "" ;
      AV62TFOMFchPre = GXutil.nullDate() ;
      AV58TFOMFchCer = GXutil.resetTime( GXutil.nullDate() );
      AV54TFOMDuracion = "" ;
      AV55TFOMDuracion_Sel = "" ;
      AV50TFOMCosRea = DecimalUtil.ZERO ;
      AV51TFOMCosRea_To = DecimalUtil.ZERO ;
      AV78TFOMRRCosT = DecimalUtil.ZERO ;
      AV79TFOMRRCosT_To = DecimalUtil.ZERO ;
      AV76TFOMRCCosT = DecimalUtil.ZERO ;
      AV77TFOMRCCosT_To = DecimalUtil.ZERO ;
      AV72TFOMMRCosT = DecimalUtil.ZERO ;
      AV73TFOMMRCosT_To = DecimalUtil.ZERO ;
      AV70TFOMMCCosT = DecimalUtil.ZERO ;
      AV71TFOMMCCosT_To = DecimalUtil.ZERO ;
      AV74TFOMNot = "" ;
      AV75TFOMNot_Sel = "" ;
      AV189Pgmname = "" ;
      AV124GroupBy = "" ;
      AV129GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "");
      AV126GroupKey = "" ;
      AV128GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20EmprCod = "" ;
      AV92UsurCod = "" ;
      AV43Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV33ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV18DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV28GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV57TFOMEst_SelsJson = "" ;
      AV6Accion = "" ;
      AV21EmprCod_Selected = "" ;
      AV145ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19Delete = "" ;
      AV90Update = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_group_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtneliminarordenes_Jsonclick = "" ;
      bttBtnexcel_Jsonclick = "" ;
      bttBtnlistado_Jsonclick = "" ;
      bttBtnlistadodetalle_Jsonclick = "" ;
      bttBtnlistadotrabajo_Jsonclick = "" ;
      bttBtnexcelwin_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_group = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV14DDO_OMFchCreAuxDate = GXutil.nullDate() ;
      AV16DDO_OMFchPreAuxDate = GXutil.nullDate() ;
      AV12DDO_OMFchCerAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV134Expand = "" ;
      AV123Grid_GroupCaption = "" ;
      AV146Sel = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A9473PMDsc = "" ;
      A9426OMMaqCod = "" ;
      A9427OMMaqDsc = "" ;
      A13679OMMaqCodFo = "" ;
      A13678OMDscMqPla = "" ;
      A9445OMEst = "" ;
      A9437OMUsuCre = "" ;
      A9436OMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9433OMTxt = "" ;
      A9438OMFchPre = GXutil.nullDate() ;
      A9439OMFchCer = GXutil.resetTime( GXutil.nullDate() );
      A13680OMDuracion = "" ;
      A9440OMCosRea = DecimalUtil.ZERO ;
      A9444OMRRCosT = DecimalUtil.ZERO ;
      A9443OMRCCosT = DecimalUtil.ZERO ;
      A9442OMMRCosT = DecimalUtil.ZERO ;
      A9441OMMCCosT = DecimalUtil.ZERO ;
      A9464OMNot = "" ;
      AV150Tmordenwwds_1_filterfulltext = "" ;
      AV155Tmordenwwds_6_tfpmdsc = "" ;
      AV156Tmordenwwds_7_tfpmdsc_sel = "" ;
      AV157Tmordenwwds_8_tfommaqcod = "" ;
      AV158Tmordenwwds_9_tfommaqcod_sel = "" ;
      AV159Tmordenwwds_10_tfommaqdsc = "" ;
      AV160Tmordenwwds_11_tfommaqdsc_sel = "" ;
      AV161Tmordenwwds_12_tfommaqcodfor = "" ;
      AV162Tmordenwwds_13_tfommaqcodfor_sel = "" ;
      AV163Tmordenwwds_14_tfomdscmqpla = "" ;
      AV164Tmordenwwds_15_tfomdscmqpla_sel = "" ;
      AV167Tmordenwwds_18_tfomest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV168Tmordenwwds_19_tfomusucre = "" ;
      AV169Tmordenwwds_20_tfomusucre_sel = "" ;
      AV170Tmordenwwds_21_tfomfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV171Tmordenwwds_22_tfomtxt = "" ;
      AV172Tmordenwwds_23_tfomtxt_sel = "" ;
      AV173Tmordenwwds_24_tfomfchpre = GXutil.nullDate() ;
      AV174Tmordenwwds_25_tfomfchcer = GXutil.resetTime( GXutil.nullDate() );
      AV175Tmordenwwds_26_tfomduracion = "" ;
      AV176Tmordenwwds_27_tfomduracion_sel = "" ;
      AV177Tmordenwwds_28_tfomcosrea = DecimalUtil.ZERO ;
      AV178Tmordenwwds_29_tfomcosrea_to = DecimalUtil.ZERO ;
      AV179Tmordenwwds_30_tfomrrcost = DecimalUtil.ZERO ;
      AV180Tmordenwwds_31_tfomrrcost_to = DecimalUtil.ZERO ;
      AV181Tmordenwwds_32_tfomrccost = DecimalUtil.ZERO ;
      AV182Tmordenwwds_33_tfomrccost_to = DecimalUtil.ZERO ;
      AV183Tmordenwwds_34_tfommrcost = DecimalUtil.ZERO ;
      AV184Tmordenwwds_35_tfommrcost_to = DecimalUtil.ZERO ;
      AV185Tmordenwwds_36_tfommccost = DecimalUtil.ZERO ;
      AV186Tmordenwwds_37_tfommccost_to = DecimalUtil.ZERO ;
      AV187Tmordenwwds_38_tfomnot = "" ;
      AV188Tmordenwwds_39_tfomnot_sel = "" ;
      scmdbuf = "" ;
      lV150Tmordenwwds_1_filterfulltext = "" ;
      lV161Tmordenwwds_12_tfommaqcodfor = "" ;
      lV163Tmordenwwds_14_tfomdscmqpla = "" ;
      lV155Tmordenwwds_6_tfpmdsc = "" ;
      lV157Tmordenwwds_8_tfommaqcod = "" ;
      lV159Tmordenwwds_10_tfommaqdsc = "" ;
      lV168Tmordenwwds_19_tfomusucre = "" ;
      lV171Tmordenwwds_22_tfomtxt = "" ;
      lV187Tmordenwwds_38_tfomnot = "" ;
      H00YH7_A9464OMNot = new String[] {""} ;
      H00YH7_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH7_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH7_A9433OMTxt = new String[] {""} ;
      H00YH7_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH7_A9437OMUsuCre = new String[] {""} ;
      H00YH7_A9428SMCod = new int[1] ;
      H00YH7_n9428SMCod = new boolean[] {false} ;
      H00YH7_A9427OMMaqDsc = new String[] {""} ;
      H00YH7_n9427OMMaqDsc = new boolean[] {false} ;
      H00YH7_A9426OMMaqCod = new String[] {""} ;
      H00YH7_A9473PMDsc = new String[] {""} ;
      H00YH7_n9473PMDsc = new boolean[] {false} ;
      H00YH7_A9429PMCod = new int[1] ;
      H00YH7_n9429PMCod = new boolean[] {false} ;
      H00YH7_A9425OMCod = new int[1] ;
      H00YH7_A407EmprNom = new String[] {""} ;
      H00YH7_n407EmprNom = new boolean[] {false} ;
      H00YH7_A396EmprCod = new String[] {""} ;
      H00YH7_A13678OMDscMqPla = new String[] {""} ;
      H00YH7_n13678OMDscMqPla = new boolean[] {false} ;
      H00YH7_A13679OMMaqCodFo = new String[] {""} ;
      H00YH7_n13679OMMaqCodFo = new boolean[] {false} ;
      H00YH7_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH7_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH7_A9445OMEst = new String[] {""} ;
      H00YH7_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH7_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH13_A9464OMNot = new String[] {""} ;
      H00YH13_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH13_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH13_A9433OMTxt = new String[] {""} ;
      H00YH13_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH13_A9437OMUsuCre = new String[] {""} ;
      H00YH13_A9428SMCod = new int[1] ;
      H00YH13_n9428SMCod = new boolean[] {false} ;
      H00YH13_A9427OMMaqDsc = new String[] {""} ;
      H00YH13_n9427OMMaqDsc = new boolean[] {false} ;
      H00YH13_A9426OMMaqCod = new String[] {""} ;
      H00YH13_A9473PMDsc = new String[] {""} ;
      H00YH13_n9473PMDsc = new boolean[] {false} ;
      H00YH13_A9429PMCod = new int[1] ;
      H00YH13_n9429PMCod = new boolean[] {false} ;
      H00YH13_A9425OMCod = new int[1] ;
      H00YH13_A407EmprNom = new String[] {""} ;
      H00YH13_n407EmprNom = new boolean[] {false} ;
      H00YH13_A396EmprCod = new String[] {""} ;
      H00YH13_A13678OMDscMqPla = new String[] {""} ;
      H00YH13_n13678OMDscMqPla = new boolean[] {false} ;
      H00YH13_A13679OMMaqCodFo = new String[] {""} ;
      H00YH13_n13679OMMaqCodFo = new boolean[] {false} ;
      H00YH13_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH13_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH13_A9445OMEst = new String[] {""} ;
      H00YH13_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH13_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV22EmprNom = "" ;
      AV30HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV94WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV42Session = httpContext.getWebSession();
      AV10ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV35ManageFiltersXml = "" ;
      AV93WebSession = httpContext.getWebSession();
      AV24ExcelFilename = "" ;
      AV5ValidarFile = new com.genexus.util.GXFile();
      AV95XLS = new com.genexus.gxoffice.ExcelDoc();
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      AV98OMCodCollection = new GXSimpleCollection<Integer>(Integer.class, "internal", "");
      AV97window = new com.genexus.webpanels.GXWindow();
      AV23ErrorMessage = "" ;
      AV91UserCustomValue = "" ;
      AV9ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection[1] ;
      AV37OMCodVector = new int[9999] ;
      GXv_int14 = new byte[1] ;
      AV143CCVPSW = "" ;
      ucDvelop_confirmpanel_cerrarorden = new com.genexus.webpanels.GXUserControl();
      GXv_int15 = new int[1] ;
      GXv_int16 = new int[1] ;
      AV147Inc_obs = "" ;
      AV29GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char3 = new String[1] ;
      AV131OldGridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState33 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV88TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV127GroupOMMaqCod = "" ;
      AV135GroupOMMaqDsc = "" ;
      H00YH19_A9464OMNot = new String[] {""} ;
      H00YH19_A9439OMFchCer = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH19_A9438OMFchPre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH19_A9433OMTxt = new String[] {""} ;
      H00YH19_A9436OMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00YH19_A9437OMUsuCre = new String[] {""} ;
      H00YH19_A9428SMCod = new int[1] ;
      H00YH19_n9428SMCod = new boolean[] {false} ;
      H00YH19_A9427OMMaqDsc = new String[] {""} ;
      H00YH19_n9427OMMaqDsc = new boolean[] {false} ;
      H00YH19_A9426OMMaqCod = new String[] {""} ;
      H00YH19_A9473PMDsc = new String[] {""} ;
      H00YH19_n9473PMDsc = new boolean[] {false} ;
      H00YH19_A9429PMCod = new int[1] ;
      H00YH19_n9429PMCod = new boolean[] {false} ;
      H00YH19_A9425OMCod = new int[1] ;
      H00YH19_A396EmprCod = new String[] {""} ;
      H00YH19_A13678OMDscMqPla = new String[] {""} ;
      H00YH19_n13678OMDscMqPla = new boolean[] {false} ;
      H00YH19_A13679OMMaqCodFo = new String[] {""} ;
      H00YH19_n13679OMMaqCodFo = new boolean[] {false} ;
      H00YH19_A9441OMMCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH19_A9443OMRCCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH19_A9445OMEst = new String[] {""} ;
      H00YH19_A9442OMMRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00YH19_A9444OMRRCosT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV125RecordKey = "" ;
      ucDvelop_confirmpanel_eliminarordenes = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_modificarordencerrada = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_imprimirorden = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmordenww__default(),
         new Object[] {
             new Object[] {
            H00YH7_A9464OMNot, H00YH7_A9439OMFchCer, H00YH7_A9438OMFchPre, H00YH7_A9433OMTxt, H00YH7_A9436OMFchCre, H00YH7_A9437OMUsuCre, H00YH7_A9428SMCod, H00YH7_n9428SMCod, H00YH7_A9427OMMaqDsc, H00YH7_n9427OMMaqDsc,
            H00YH7_A9426OMMaqCod, H00YH7_A9473PMDsc, H00YH7_n9473PMDsc, H00YH7_A9429PMCod, H00YH7_n9429PMCod, H00YH7_A9425OMCod, H00YH7_A407EmprNom, H00YH7_n407EmprNom, H00YH7_A396EmprCod, H00YH7_A13678OMDscMqPla,
            H00YH7_n13678OMDscMqPla, H00YH7_A13679OMMaqCodFo, H00YH7_n13679OMMaqCodFo, H00YH7_A9441OMMCCosT, H00YH7_A9443OMRCCosT, H00YH7_A9445OMEst, H00YH7_A9442OMMRCosT, H00YH7_A9444OMRRCosT
            }
            , new Object[] {
            H00YH13_A9464OMNot, H00YH13_A9439OMFchCer, H00YH13_A9438OMFchPre, H00YH13_A9433OMTxt, H00YH13_A9436OMFchCre, H00YH13_A9437OMUsuCre, H00YH13_A9428SMCod, H00YH13_n9428SMCod, H00YH13_A9427OMMaqDsc, H00YH13_n9427OMMaqDsc,
            H00YH13_A9426OMMaqCod, H00YH13_A9473PMDsc, H00YH13_n9473PMDsc, H00YH13_A9429PMCod, H00YH13_n9429PMCod, H00YH13_A9425OMCod, H00YH13_A407EmprNom, H00YH13_n407EmprNom, H00YH13_A396EmprCod, H00YH13_A13678OMDscMqPla,
            H00YH13_n13678OMDscMqPla, H00YH13_A13679OMMaqCodFo, H00YH13_n13679OMMaqCodFo, H00YH13_A9441OMMCCosT, H00YH13_A9443OMRCCosT, H00YH13_A9445OMEst, H00YH13_A9442OMMRCosT, H00YH13_A9444OMRRCosT
            }
            , new Object[] {
            H00YH19_A9464OMNot, H00YH19_A9439OMFchCer, H00YH19_A9438OMFchPre, H00YH19_A9433OMTxt, H00YH19_A9436OMFchCre, H00YH19_A9437OMUsuCre, H00YH19_A9428SMCod, H00YH19_n9428SMCod, H00YH19_A9427OMMaqDsc, H00YH19_n9427OMMaqDsc,
            H00YH19_A9426OMMaqCod, H00YH19_A9473PMDsc, H00YH19_n9473PMDsc, H00YH19_A9429PMCod, H00YH19_n9429PMCod, H00YH19_A9425OMCod, H00YH19_A396EmprCod, H00YH19_A13678OMDscMqPla, H00YH19_n13678OMDscMqPla, H00YH19_A13679OMMaqCodFo,
            H00YH19_n13679OMMaqCodFo, H00YH19_A9441OMMCCosT, H00YH19_A9443OMRCCosT, H00YH19_A9445OMEst, H00YH19_A9442OMMRCosT, H00YH19_A9444OMRRCosT
            }
         }
      );
      AV189Pgmname = "TMOrdenWW" ;
      /* GeneXus formulas. */
      AV189Pgmname = "TMOrdenWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      edtavGrid_groupcaption_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV34ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV142Existepswpsb ;
   private byte GXt_int13 ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV38OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV122GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV99Row ;
   private short AV100Tot ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_57 ;
   private int nGXsfl_57_idx=1 ;
   private int AV48TFOMCod ;
   private int AV49TFOMCod_To ;
   private int AV84TFPMCod ;
   private int AV85TFPMCod_To ;
   private int AV86TFSMCod ;
   private int AV87TFSMCod_To ;
   private int AV36OMCod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Grid_group_Columnindex ;
   private int A9425OMCod ;
   private int A9429PMCod ;
   private int A9428SMCod ;
   private int subGrid_Islastpage ;
   private int edtavExpand_Enabled ;
   private int edtavGrid_groupcaption_Enabled ;
   private int AV151Tmordenwwds_2_tfomcod ;
   private int AV152Tmordenwwds_3_tfomcod_to ;
   private int AV153Tmordenwwds_4_tfpmcod ;
   private int AV154Tmordenwwds_5_tfpmcod_to ;
   private int AV165Tmordenwwds_16_tfsmcod ;
   private int AV166Tmordenwwds_17_tfsmcod_to ;
   private int AV167Tmordenwwds_18_tfomest_sels_size ;
   private int AV128GridCollapsedRecordsChildren_size ;
   private int edtOMCod_Visible ;
   private int edtPMCod_Visible ;
   private int edtPMDsc_Visible ;
   private int edtOMMaqCod_Visible ;
   private int edtOMMaqDsc_Visible ;
   private int edtOMMaqCodFo_Visible ;
   private int edtOMDscMqPla_Visible ;
   private int edtSMCod_Visible ;
   private int edtOMUsuCre_Visible ;
   private int edtOMFchCre_Visible ;
   private int edtOMTxt_Visible ;
   private int edtOMFchPre_Visible ;
   private int edtOMFchCer_Visible ;
   private int edtOMDuracion_Visible ;
   private int edtOMCosRea_Visible ;
   private int edtOMRRCosT_Visible ;
   private int edtOMRCCosT_Visible ;
   private int edtOMMRCosT_Visible ;
   private int edtOMMCCosT_Visible ;
   private int edtOMNot_Visible ;
   private int AV41PageToGo ;
   private int AV190GXV1 ;
   private int AV96Random ;
   private int nGXsfl_57_fel_idx=1 ;
   private int GX_I ;
   private int AV37OMCodVector[] ;
   private int GXv_int15[] ;
   private int GXv_int16[] ;
   private int AV195GXV2 ;
   private int AV196GXV3 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavExpand_Visible ;
   private int edtavGrid_groupcaption_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV130Index ;
   private java.math.BigDecimal AV50TFOMCosRea ;
   private java.math.BigDecimal AV51TFOMCosRea_To ;
   private java.math.BigDecimal AV78TFOMRRCosT ;
   private java.math.BigDecimal AV79TFOMRRCosT_To ;
   private java.math.BigDecimal AV76TFOMRCCosT ;
   private java.math.BigDecimal AV77TFOMRCCosT_To ;
   private java.math.BigDecimal AV72TFOMMRCosT ;
   private java.math.BigDecimal AV73TFOMMRCosT_To ;
   private java.math.BigDecimal AV70TFOMMCCosT ;
   private java.math.BigDecimal AV71TFOMMCCosT_To ;
   private java.math.BigDecimal A9440OMCosRea ;
   private java.math.BigDecimal A9444OMRRCosT ;
   private java.math.BigDecimal A9443OMRCCosT ;
   private java.math.BigDecimal A9442OMMRCosT ;
   private java.math.BigDecimal A9441OMMCCosT ;
   private java.math.BigDecimal AV177Tmordenwwds_28_tfomcosrea ;
   private java.math.BigDecimal AV178Tmordenwwds_29_tfomcosrea_to ;
   private java.math.BigDecimal AV179Tmordenwwds_30_tfomrrcost ;
   private java.math.BigDecimal AV180Tmordenwwds_31_tfomrrcost_to ;
   private java.math.BigDecimal AV181Tmordenwwds_32_tfomrccost ;
   private java.math.BigDecimal AV182Tmordenwwds_33_tfomrccost_to ;
   private java.math.BigDecimal AV183Tmordenwwds_34_tfommrcost ;
   private java.math.BigDecimal AV184Tmordenwwds_35_tfommrcost_to ;
   private java.math.BigDecimal AV185Tmordenwwds_36_tfommccost ;
   private java.math.BigDecimal AV186Tmordenwwds_37_tfommccost_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_imprimirorden_Result ;
   private String Dvelop_confirmpanel_modificarordencerrada_Result ;
   private String Dvelop_confirmpanel_cerrarorden_Result ;
   private String Dvelop_confirmpanel_eliminarordenes_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_57_idx="0001" ;
   private String AV139TFPMDsc ;
   private String AV140TFPMDsc_Sel ;
   private String AV64TFOMMaqCod ;
   private String AV65TFOMMaqCod_Sel ;
   private String AV68TFOMMaqDsc ;
   private String AV69TFOMMaqDsc_Sel ;
   private String AV66TFOMMaqCodFor ;
   private String AV67TFOMMaqCodFor_Sel ;
   private String AV52TFOMDscMqPla ;
   private String AV53TFOMDscMqPla_Sel ;
   private String AV82TFOMUsuCre ;
   private String AV83TFOMUsuCre_Sel ;
   private String AV189Pgmname ;
   private String AV20EmprCod ;
   private String AV92UsurCod ;
   private String AV43Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV6Accion ;
   private String AV21EmprCod_Selected ;
   private String AV19Delete ;
   private String AV90Update ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Allowgroup ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_imprimirorden_Title ;
   private String Dvelop_confirmpanel_imprimirorden_Confirmationtext ;
   private String Dvelop_confirmpanel_imprimirorden_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_imprimirorden_Nobuttoncaption ;
   private String Dvelop_confirmpanel_imprimirorden_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_imprimirorden_Yesbuttonposition ;
   private String Dvelop_confirmpanel_imprimirorden_Confirmtype ;
   private String Dvelop_confirmpanel_modificarordencerrada_Title ;
   private String Dvelop_confirmpanel_modificarordencerrada_Confirmationtext ;
   private String Dvelop_confirmpanel_modificarordencerrada_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_modificarordencerrada_Nobuttoncaption ;
   private String Dvelop_confirmpanel_modificarordencerrada_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_modificarordencerrada_Yesbuttonposition ;
   private String Dvelop_confirmpanel_modificarordencerrada_Confirmtype ;
   private String Dvelop_confirmpanel_cerrarorden_Title ;
   private String Dvelop_confirmpanel_cerrarorden_Confirmationtext ;
   private String Dvelop_confirmpanel_cerrarorden_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cerrarorden_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cerrarorden_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cerrarorden_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cerrarorden_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarordenes_Title ;
   private String Dvelop_confirmpanel_eliminarordenes_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarordenes_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarordenes_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarordenes_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarordenes_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarordenes_Confirmtype ;
   private String Grid_group_Gridinternalname ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtneliminarordenes_Internalname ;
   private String bttBtneliminarordenes_Jsonclick ;
   private String bttBtnexcel_Internalname ;
   private String bttBtnexcel_Jsonclick ;
   private String bttBtnlistado_Internalname ;
   private String bttBtnlistado_Jsonclick ;
   private String bttBtnlistadodetalle_Internalname ;
   private String bttBtnlistadodetalle_Jsonclick ;
   private String bttBtnlistadotrabajo_Internalname ;
   private String bttBtnlistadotrabajo_Jsonclick ;
   private String bttBtnexcelwin_Internalname ;
   private String bttBtnexcelwin_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_group_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_omfchcreauxdates_Internalname ;
   private String edtavDdo_omfchcreauxdate_Internalname ;
   private String edtavDdo_omfchcreauxdate_Jsonclick ;
   private String divDdo_omfchpreauxdates_Internalname ;
   private String edtavDdo_omfchpreauxdate_Internalname ;
   private String edtavDdo_omfchpreauxdate_Jsonclick ;
   private String divDdo_omfchcerauxdates_Internalname ;
   private String edtavDdo_omfchcerauxdate_Internalname ;
   private String edtavDdo_omfchcerauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV134Expand ;
   private String edtavExpand_Internalname ;
   private String edtavGrid_groupcaption_Internalname ;
   private String AV146Sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtOMCod_Internalname ;
   private String edtPMCod_Internalname ;
   private String A9473PMDsc ;
   private String edtPMDsc_Internalname ;
   private String A9426OMMaqCod ;
   private String edtOMMaqCod_Internalname ;
   private String A9427OMMaqDsc ;
   private String edtOMMaqDsc_Internalname ;
   private String A13679OMMaqCodFo ;
   private String edtOMMaqCodFo_Internalname ;
   private String A13678OMDscMqPla ;
   private String edtOMDscMqPla_Internalname ;
   private String edtSMCod_Internalname ;
   private String A9445OMEst ;
   private String A9437OMUsuCre ;
   private String edtOMUsuCre_Internalname ;
   private String edtOMFchCre_Internalname ;
   private String edtOMTxt_Internalname ;
   private String edtOMFchPre_Internalname ;
   private String edtOMFchCer_Internalname ;
   private String edtOMDuracion_Internalname ;
   private String edtOMCosRea_Internalname ;
   private String edtOMRRCosT_Internalname ;
   private String edtOMRCCosT_Internalname ;
   private String edtOMMRCosT_Internalname ;
   private String edtOMMCCosT_Internalname ;
   private String edtOMNot_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV155Tmordenwwds_6_tfpmdsc ;
   private String AV156Tmordenwwds_7_tfpmdsc_sel ;
   private String AV157Tmordenwwds_8_tfommaqcod ;
   private String AV158Tmordenwwds_9_tfommaqcod_sel ;
   private String AV159Tmordenwwds_10_tfommaqdsc ;
   private String AV160Tmordenwwds_11_tfommaqdsc_sel ;
   private String AV161Tmordenwwds_12_tfommaqcodfor ;
   private String AV162Tmordenwwds_13_tfommaqcodfor_sel ;
   private String AV163Tmordenwwds_14_tfomdscmqpla ;
   private String AV164Tmordenwwds_15_tfomdscmqpla_sel ;
   private String AV168Tmordenwwds_19_tfomusucre ;
   private String AV169Tmordenwwds_20_tfomusucre_sel ;
   private String scmdbuf ;
   private String lV161Tmordenwwds_12_tfommaqcodfor ;
   private String lV163Tmordenwwds_14_tfomdscmqpla ;
   private String lV155Tmordenwwds_6_tfpmdsc ;
   private String lV157Tmordenwwds_8_tfommaqcod ;
   private String lV159Tmordenwwds_10_tfommaqdsc ;
   private String lV168Tmordenwwds_19_tfomusucre ;
   private String AV22EmprNom ;
   private String edtavExpand_Columnclass ;
   private String sGXsfl_57_fel_idx="0001" ;
   private String AV143CCVPSW ;
   private String Dvelop_confirmpanel_cerrarorden_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char18 ;
   private String GXv_char4[] ;
   private String GXt_char17 ;
   private String GXv_char3[] ;
   private String AV127GroupOMMaqCod ;
   private String AV135GroupOMMaqDsc ;
   private String tblTabledvelop_confirmpanel_eliminarordenes_Internalname ;
   private String Dvelop_confirmpanel_eliminarordenes_Internalname ;
   private String tblTabledvelop_confirmpanel_cerrarorden_Internalname ;
   private String tblTabledvelop_confirmpanel_modificarordencerrada_Internalname ;
   private String Dvelop_confirmpanel_modificarordencerrada_Internalname ;
   private String tblTabledvelop_confirmpanel_imprimirorden_Internalname ;
   private String Dvelop_confirmpanel_imprimirorden_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavExpand_Jsonclick ;
   private String edtavGrid_groupcaption_Jsonclick ;
   private String GXCCtl ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtOMCod_Jsonclick ;
   private String edtPMCod_Jsonclick ;
   private String edtPMDsc_Jsonclick ;
   private String edtOMMaqCod_Jsonclick ;
   private String edtOMMaqDsc_Jsonclick ;
   private String edtOMMaqCodFo_Jsonclick ;
   private String edtOMDscMqPla_Jsonclick ;
   private String edtSMCod_Jsonclick ;
   private String edtOMUsuCre_Jsonclick ;
   private String edtOMFchCre_Jsonclick ;
   private String edtOMTxt_Jsonclick ;
   private String edtOMFchPre_Jsonclick ;
   private String edtOMFchCer_Jsonclick ;
   private String edtOMDuracion_Jsonclick ;
   private String edtOMCosRea_Jsonclick ;
   private String edtOMRRCosT_Jsonclick ;
   private String edtOMRCCosT_Jsonclick ;
   private String edtOMMRCosT_Jsonclick ;
   private String edtOMMCCosT_Jsonclick ;
   private String edtOMNot_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV60TFOMFchCre ;
   private java.util.Date AV58TFOMFchCer ;
   private java.util.Date A9436OMFchCre ;
   private java.util.Date A9439OMFchCer ;
   private java.util.Date AV170Tmordenwwds_21_tfomfchcre ;
   private java.util.Date AV174Tmordenwwds_25_tfomfchcer ;
   private java.util.Date GXt_dtime8 ;
   private java.util.Date AV62TFOMFchPre ;
   private java.util.Date AV14DDO_OMFchCreAuxDate ;
   private java.util.Date AV16DDO_OMFchPreAuxDate ;
   private java.util.Date AV12DDO_OMFchCerAuxDate ;
   private java.util.Date A9438OMFchPre ;
   private java.util.Date AV173Tmordenwwds_24_tfomfchpre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV40OrderedDsc ;
   private boolean AV133AddChildren ;
   private boolean AV144Refrescar ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean Grid_empowerer_Hasrowgroups ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9429PMCod ;
   private boolean n9473PMDsc ;
   private boolean n9427OMMaqDsc ;
   private boolean n13679OMMaqCodFo ;
   private boolean n13678OMDscMqPla ;
   private boolean n9428SMCod ;
   private boolean bGXsfl_57_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private boolean AV132DiscardFirst ;
   private String AV57TFOMEst_SelsJson ;
   private String AV10ColumnsSelectorXML ;
   private String AV35ManageFiltersXml ;
   private String AV91UserCustomValue ;
   private String AV25FilterFullText ;
   private String AV80TFOMTxt ;
   private String AV81TFOMTxt_Sel ;
   private String AV54TFOMDuracion ;
   private String AV55TFOMDuracion_Sel ;
   private String AV74TFOMNot ;
   private String AV75TFOMNot_Sel ;
   private String AV124GroupBy ;
   private String AV126GroupKey ;
   private String AV123Grid_GroupCaption ;
   private String A9433OMTxt ;
   private String A13680OMDuracion ;
   private String A9464OMNot ;
   private String AV150Tmordenwwds_1_filterfulltext ;
   private String AV171Tmordenwwds_22_tfomtxt ;
   private String AV172Tmordenwwds_23_tfomtxt_sel ;
   private String AV175Tmordenwwds_26_tfomduracion ;
   private String AV176Tmordenwwds_27_tfomduracion_sel ;
   private String AV187Tmordenwwds_38_tfomnot ;
   private String AV188Tmordenwwds_39_tfomnot_sel ;
   private String lV150Tmordenwwds_1_filterfulltext ;
   private String lV171Tmordenwwds_22_tfomtxt ;
   private String lV187Tmordenwwds_38_tfomnot ;
   private String AV24ExcelFilename ;
   private String AV23ErrorMessage ;
   private String AV147Inc_obs ;
   private String AV125RecordKey ;
   private GXSimpleCollection<Integer> AV98OMCodCollection ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV97window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV30HTTPRequest ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_group ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cerrarorden ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarordenes ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_modificarordencerrada ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_imprimirorden ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXFile AV5ValidarFile ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkavSel ;
   private HTMLChoice cmbOMEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00YH7_A9464OMNot ;
   private java.util.Date[] H00YH7_A9439OMFchCer ;
   private java.util.Date[] H00YH7_A9438OMFchPre ;
   private String[] H00YH7_A9433OMTxt ;
   private java.util.Date[] H00YH7_A9436OMFchCre ;
   private String[] H00YH7_A9437OMUsuCre ;
   private int[] H00YH7_A9428SMCod ;
   private boolean[] H00YH7_n9428SMCod ;
   private String[] H00YH7_A9427OMMaqDsc ;
   private boolean[] H00YH7_n9427OMMaqDsc ;
   private String[] H00YH7_A9426OMMaqCod ;
   private String[] H00YH7_A9473PMDsc ;
   private boolean[] H00YH7_n9473PMDsc ;
   private int[] H00YH7_A9429PMCod ;
   private boolean[] H00YH7_n9429PMCod ;
   private int[] H00YH7_A9425OMCod ;
   private String[] H00YH7_A407EmprNom ;
   private boolean[] H00YH7_n407EmprNom ;
   private String[] H00YH7_A396EmprCod ;
   private String[] H00YH7_A13678OMDscMqPla ;
   private boolean[] H00YH7_n13678OMDscMqPla ;
   private String[] H00YH7_A13679OMMaqCodFo ;
   private boolean[] H00YH7_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] H00YH7_A9441OMMCCosT ;
   private java.math.BigDecimal[] H00YH7_A9443OMRCCosT ;
   private String[] H00YH7_A9445OMEst ;
   private java.math.BigDecimal[] H00YH7_A9442OMMRCosT ;
   private java.math.BigDecimal[] H00YH7_A9444OMRRCosT ;
   private String[] H00YH13_A9464OMNot ;
   private java.util.Date[] H00YH13_A9439OMFchCer ;
   private java.util.Date[] H00YH13_A9438OMFchPre ;
   private String[] H00YH13_A9433OMTxt ;
   private java.util.Date[] H00YH13_A9436OMFchCre ;
   private String[] H00YH13_A9437OMUsuCre ;
   private int[] H00YH13_A9428SMCod ;
   private boolean[] H00YH13_n9428SMCod ;
   private String[] H00YH13_A9427OMMaqDsc ;
   private boolean[] H00YH13_n9427OMMaqDsc ;
   private String[] H00YH13_A9426OMMaqCod ;
   private String[] H00YH13_A9473PMDsc ;
   private boolean[] H00YH13_n9473PMDsc ;
   private int[] H00YH13_A9429PMCod ;
   private boolean[] H00YH13_n9429PMCod ;
   private int[] H00YH13_A9425OMCod ;
   private String[] H00YH13_A407EmprNom ;
   private boolean[] H00YH13_n407EmprNom ;
   private String[] H00YH13_A396EmprCod ;
   private String[] H00YH13_A13678OMDscMqPla ;
   private boolean[] H00YH13_n13678OMDscMqPla ;
   private String[] H00YH13_A13679OMMaqCodFo ;
   private boolean[] H00YH13_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] H00YH13_A9441OMMCCosT ;
   private java.math.BigDecimal[] H00YH13_A9443OMRCCosT ;
   private String[] H00YH13_A9445OMEst ;
   private java.math.BigDecimal[] H00YH13_A9442OMMRCosT ;
   private java.math.BigDecimal[] H00YH13_A9444OMRRCosT ;
   private String[] H00YH19_A9464OMNot ;
   private java.util.Date[] H00YH19_A9439OMFchCer ;
   private java.util.Date[] H00YH19_A9438OMFchPre ;
   private String[] H00YH19_A9433OMTxt ;
   private java.util.Date[] H00YH19_A9436OMFchCre ;
   private String[] H00YH19_A9437OMUsuCre ;
   private int[] H00YH19_A9428SMCod ;
   private boolean[] H00YH19_n9428SMCod ;
   private String[] H00YH19_A9427OMMaqDsc ;
   private boolean[] H00YH19_n9427OMMaqDsc ;
   private String[] H00YH19_A9426OMMaqCod ;
   private String[] H00YH19_A9473PMDsc ;
   private boolean[] H00YH19_n9473PMDsc ;
   private int[] H00YH19_A9429PMCod ;
   private boolean[] H00YH19_n9429PMCod ;
   private int[] H00YH19_A9425OMCod ;
   private String[] H00YH19_A396EmprCod ;
   private String[] H00YH19_A13678OMDscMqPla ;
   private boolean[] H00YH19_n13678OMDscMqPla ;
   private String[] H00YH19_A13679OMMaqCodFo ;
   private boolean[] H00YH19_n13679OMMaqCodFo ;
   private java.math.BigDecimal[] H00YH19_A9441OMMCCosT ;
   private java.math.BigDecimal[] H00YH19_A9443OMRCCosT ;
   private String[] H00YH19_A9445OMEst ;
   private java.math.BigDecimal[] H00YH19_A9442OMMRCosT ;
   private java.math.BigDecimal[] H00YH19_A9444OMRRCosT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.gxoffice.ExcelDoc AV95XLS ;
   private com.genexus.webpanels.WebSession AV93WebSession ;
   private GXSimpleCollection<String> AV56TFOMEst_Sels ;
   private GXSimpleCollection<String> AV167Tmordenwwds_18_tfomest_sels ;
   private GXSimpleCollection<String> AV129GridCollapsedRecords ;
   private GXSimpleCollection<String> AV128GridCollapsedRecordsChildren ;
   private GXSimpleCollection<String> AV145ObjetoRefrescar ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV33ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV18DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV28GridState ;
   private app.wwpbaseobjects.SdtWWPGridState AV131OldGridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState33[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV29GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV88TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV94WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class tmordenww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00YH7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9445OMEst ,
                                          GXSimpleCollection<String> AV167Tmordenwwds_18_tfomest_sels ,
                                          int AV151Tmordenwwds_2_tfomcod ,
                                          int AV152Tmordenwwds_3_tfomcod_to ,
                                          int AV153Tmordenwwds_4_tfpmcod ,
                                          int AV154Tmordenwwds_5_tfpmcod_to ,
                                          String AV156Tmordenwwds_7_tfpmdsc_sel ,
                                          String AV155Tmordenwwds_6_tfpmdsc ,
                                          String AV158Tmordenwwds_9_tfommaqcod_sel ,
                                          String AV157Tmordenwwds_8_tfommaqcod ,
                                          String AV160Tmordenwwds_11_tfommaqdsc_sel ,
                                          String AV159Tmordenwwds_10_tfommaqdsc ,
                                          int AV165Tmordenwwds_16_tfsmcod ,
                                          int AV166Tmordenwwds_17_tfsmcod_to ,
                                          int AV167Tmordenwwds_18_tfomest_sels_size ,
                                          String AV169Tmordenwwds_20_tfomusucre_sel ,
                                          String AV168Tmordenwwds_19_tfomusucre ,
                                          java.util.Date AV170Tmordenwwds_21_tfomfchcre ,
                                          String AV172Tmordenwwds_23_tfomtxt_sel ,
                                          String AV171Tmordenwwds_22_tfomtxt ,
                                          java.util.Date AV173Tmordenwwds_24_tfomfchpre ,
                                          java.util.Date AV174Tmordenwwds_25_tfomfchcer ,
                                          java.math.BigDecimal AV179Tmordenwwds_30_tfomrrcost ,
                                          java.math.BigDecimal AV180Tmordenwwds_31_tfomrrcost_to ,
                                          java.math.BigDecimal AV181Tmordenwwds_32_tfomrccost ,
                                          java.math.BigDecimal AV182Tmordenwwds_33_tfomrccost_to ,
                                          java.math.BigDecimal AV183Tmordenwwds_34_tfommrcost ,
                                          java.math.BigDecimal AV184Tmordenwwds_35_tfommrcost_to ,
                                          java.math.BigDecimal AV185Tmordenwwds_36_tfommccost ,
                                          java.math.BigDecimal AV186Tmordenwwds_37_tfommccost_to ,
                                          String AV188Tmordenwwds_39_tfomnot_sel ,
                                          String AV187Tmordenwwds_38_tfomnot ,
                                          int A9425OMCod ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9426OMMaqCod ,
                                          String A9427OMMaqDsc ,
                                          int A9428SMCod ,
                                          String A9437OMUsuCre ,
                                          java.util.Date A9436OMFchCre ,
                                          String A9433OMTxt ,
                                          java.util.Date A9438OMFchPre ,
                                          java.util.Date A9439OMFchCer ,
                                          java.math.BigDecimal A9444OMRRCosT ,
                                          java.math.BigDecimal A9443OMRCCosT ,
                                          java.math.BigDecimal A9442OMMRCosT ,
                                          java.math.BigDecimal A9441OMMCCosT ,
                                          String A9464OMNot ,
                                          short AV38OrderedBy ,
                                          boolean AV40OrderedDsc ,
                                          String AV150Tmordenwwds_1_filterfulltext ,
                                          String A13679OMMaqCodFo ,
                                          String A13678OMDscMqPla ,
                                          String A13680OMDuracion ,
                                          java.math.BigDecimal A9440OMCosRea ,
                                          String AV162Tmordenwwds_13_tfommaqcodfor_sel ,
                                          String AV161Tmordenwwds_12_tfommaqcodfor ,
                                          String AV164Tmordenwwds_15_tfomdscmqpla_sel ,
                                          String AV163Tmordenwwds_14_tfomdscmqpla ,
                                          String AV176Tmordenwwds_27_tfomduracion_sel ,
                                          String AV175Tmordenwwds_26_tfomduracion ,
                                          java.math.BigDecimal AV177Tmordenwwds_28_tfomcosrea ,
                                          java.math.BigDecimal AV178Tmordenwwds_29_tfomcosrea_to ,
                                          int AV128GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV128GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[39];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T3.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T4.PMDsc, T1.PMCod, T1.OMCod," ;
      scmdbuf += " T2.EmprNom, T1.EmprCod, COALESCE( T7.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T8.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T5.OMMCCosT, 0) AS OMMCCosT, COALESCE(" ;
      scmdbuf += " T6.OMRCCosT, 0) AS OMRCCosT, T1.OMEst, COALESCE( T5.OMMRCosT, 0) AS OMMRCosT, COALESCE( T6.OMRRCosT, 0) AS OMRRCosT FROM (((((((TXPMORDEN T1 INNER JOIN TXPEMPRES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10)))" ;
      scmdbuf += " AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre" ;
      scmdbuf += " AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T6 ON T6.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T6.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE( T11.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T11.OMMaqCodFo, '') IS NULL)) THEN COALESCE(" ;
      scmdbuf += " T10.MaqDsc, '') ELSE COALESCE( T11.OMMaqCodFo, '') END AS OMDscMqPla, T9.EmprCod, T9.OMCod FROM ((TXPMORDEN T9 INNER JOIN TXPMAQUIN T10 ON T10.EmprCod = T9.EmprCod" ;
      scmdbuf += " AND T10.MaqCod = T9.OMMaqCod) LEFT JOIN (SELECT T12.MaqCodFor AS OMMaqCodFo, T12.EmprCod, T13.OMCod, T12.MaqCod, T13.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T12 INNER" ;
      scmdbuf += " JOIN TXPMORDEN T13 ON T13.EmprCod = T12.EmprCod) WHERE T12.MaqCod = T13.OMMaqCod ) T11 ON T11.EmprCod = T9.EmprCod AND T11.OMCod = T9.OMCod) ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.OMCod = T1.OMCod) LEFT JOIN (SELECT T9.MaqCodFor AS OMMaqCodFo, T9.EmprCod, T10.OMCod, T9.MaqCod, T10.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T9" ;
      scmdbuf += " INNER JOIN TXPMORDEN T10 ON T10.EmprCod = T9.EmprCod) WHERE T9.MaqCod = T10.OMMaqCod ) T8 ON T8.EmprCod = T1.EmprCod AND T8.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T8.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T8.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMDscMqPla, '') = ?))");
      if ( ! (0==AV151Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! (0==AV152Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( ! (0==AV153Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (0==AV154Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PMDsc = ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV157Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV159Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! (0==AV165Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (0==AV166Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( AV167Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV167Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV169Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV168Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV170Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV171Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV173Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV174Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int34[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int34[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int34[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV185Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int34[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int34[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV187Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int34[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV38OrderedBy == 1 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV38OrderedBy == 1 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PMDsc" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PMDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCre" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCre DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMTxt" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMTxt DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchPre" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchPre DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCer" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCer DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMNot" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMNot DESC" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_H00YH13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV167Tmordenwwds_18_tfomest_sels ,
                                           int AV151Tmordenwwds_2_tfomcod ,
                                           int AV152Tmordenwwds_3_tfomcod_to ,
                                           int AV153Tmordenwwds_4_tfpmcod ,
                                           int AV154Tmordenwwds_5_tfpmcod_to ,
                                           String AV156Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV155Tmordenwwds_6_tfpmdsc ,
                                           String AV158Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV157Tmordenwwds_8_tfommaqcod ,
                                           String AV160Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV159Tmordenwwds_10_tfommaqdsc ,
                                           int AV165Tmordenwwds_16_tfsmcod ,
                                           int AV166Tmordenwwds_17_tfsmcod_to ,
                                           int AV167Tmordenwwds_18_tfomest_sels_size ,
                                           String AV169Tmordenwwds_20_tfomusucre_sel ,
                                           String AV168Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV170Tmordenwwds_21_tfomfchcre ,
                                           String AV172Tmordenwwds_23_tfomtxt_sel ,
                                           String AV171Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV173Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV174Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV179Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV180Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV181Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV182Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV183Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV184Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV185Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV186Tmordenwwds_37_tfommccost_to ,
                                           String AV188Tmordenwwds_39_tfomnot_sel ,
                                           String AV187Tmordenwwds_38_tfomnot ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           short AV38OrderedBy ,
                                           boolean AV40OrderedDsc ,
                                           String AV150Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV162Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV161Tmordenwwds_12_tfommaqcodfor ,
                                           String AV164Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV163Tmordenwwds_14_tfomdscmqpla ,
                                           String AV176Tmordenwwds_27_tfomduracion_sel ,
                                           String AV175Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV177Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV178Tmordenwwds_29_tfomcosrea_to ,
                                           int AV128GridCollapsedRecordsChildren_size ,
                                           String A396EmprCod ,
                                           GXSimpleCollection<String> AV128GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[39];
      Object[] GXv_Object38 = new Object[2];
      scmdbuf = "SELECT T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T3.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T4.PMDsc, T1.PMCod, T1.OMCod," ;
      scmdbuf += " T2.EmprNom, T1.EmprCod, COALESCE( T7.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T8.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T5.OMMCCosT, 0) AS OMMCCosT, COALESCE(" ;
      scmdbuf += " T6.OMRCCosT, 0) AS OMRCCosT, T1.OMEst, COALESCE( T5.OMMRCosT, 0) AS OMMRCosT, COALESCE( T6.OMRRCosT, 0) AS OMRRCosT FROM (((((((TXPMORDEN T1 INNER JOIN TXPEMPRES" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10)))" ;
      scmdbuf += " AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre" ;
      scmdbuf += " AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T6 ON T6.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T6.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE( T11.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T11.OMMaqCodFo, '') IS NULL)) THEN COALESCE(" ;
      scmdbuf += " T10.MaqDsc, '') ELSE COALESCE( T11.OMMaqCodFo, '') END AS OMDscMqPla, T9.EmprCod, T9.OMCod FROM ((TXPMORDEN T9 INNER JOIN TXPMAQUIN T10 ON T10.EmprCod = T9.EmprCod" ;
      scmdbuf += " AND T10.MaqCod = T9.OMMaqCod) LEFT JOIN (SELECT T12.MaqCodFor AS OMMaqCodFo, T12.EmprCod, T13.OMCod, T12.MaqCod, T13.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T12 INNER" ;
      scmdbuf += " JOIN TXPMORDEN T13 ON T13.EmprCod = T12.EmprCod) WHERE T12.MaqCod = T13.OMMaqCod ) T11 ON T11.EmprCod = T9.EmprCod AND T11.OMCod = T9.OMCod) ) T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.OMCod = T1.OMCod) LEFT JOIN (SELECT T9.MaqCodFor AS OMMaqCodFo, T9.EmprCod, T10.OMCod, T9.MaqCod, T10.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T9" ;
      scmdbuf += " INNER JOIN TXPMORDEN T10 ON T10.EmprCod = T9.EmprCod) WHERE T9.MaqCod = T10.OMMaqCod ) T8 ON T8.EmprCod = T1.EmprCod AND T8.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T8.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T8.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMDscMqPla, '') = ?))");
      if ( ! (0==AV151Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int37[10] = (byte)(1) ;
      }
      if ( ! (0==AV152Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int37[11] = (byte)(1) ;
      }
      if ( ! (0==AV153Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int37[12] = (byte)(1) ;
      }
      if ( ! (0==AV154Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int37[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PMDsc = ?)");
      }
      else
      {
         GXv_int37[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV157Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int37[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV159Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int37[19] = (byte)(1) ;
      }
      if ( ! (0==AV165Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int37[20] = (byte)(1) ;
      }
      if ( ! (0==AV166Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int37[21] = (byte)(1) ;
      }
      if ( AV167Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV167Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV169Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV168Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int37[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV170Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int37[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV171Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int37[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV173Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int37[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV174Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int37[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int37[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int37[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int37[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int37[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int37[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV185Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int37[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int37[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV187Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int37[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV38OrderedBy == 1 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMCod" ;
      }
      else if ( ( AV38OrderedBy == 1 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV38OrderedBy == 2 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PMDsc" ;
      }
      else if ( ( AV38OrderedBy == 3 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PMDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod" ;
      }
      else if ( ( AV38OrderedBy == 4 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMMaqCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV38OrderedBy == 5 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.SMCod" ;
      }
      else if ( ( AV38OrderedBy == 6 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.SMCod DESC" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMEst" ;
      }
      else if ( ( AV38OrderedBy == 7 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMEst DESC" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCre" ;
      }
      else if ( ( AV38OrderedBy == 8 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCre DESC" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMTxt" ;
      }
      else if ( ( AV38OrderedBy == 9 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMTxt DESC" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchPre" ;
      }
      else if ( ( AV38OrderedBy == 10 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchPre DESC" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMFchCer" ;
      }
      else if ( ( AV38OrderedBy == 11 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMFchCer DESC" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.OMNot" ;
      }
      else if ( ( AV38OrderedBy == 12 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.OMNot DESC" ;
      }
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
   }

   protected Object[] conditional_H00YH19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String A9445OMEst ,
                                           GXSimpleCollection<String> AV167Tmordenwwds_18_tfomest_sels ,
                                           int AV151Tmordenwwds_2_tfomcod ,
                                           int AV152Tmordenwwds_3_tfomcod_to ,
                                           int AV153Tmordenwwds_4_tfpmcod ,
                                           int AV154Tmordenwwds_5_tfpmcod_to ,
                                           String AV156Tmordenwwds_7_tfpmdsc_sel ,
                                           String AV155Tmordenwwds_6_tfpmdsc ,
                                           String AV158Tmordenwwds_9_tfommaqcod_sel ,
                                           String AV157Tmordenwwds_8_tfommaqcod ,
                                           String AV160Tmordenwwds_11_tfommaqdsc_sel ,
                                           String AV159Tmordenwwds_10_tfommaqdsc ,
                                           int AV165Tmordenwwds_16_tfsmcod ,
                                           int AV166Tmordenwwds_17_tfsmcod_to ,
                                           int AV167Tmordenwwds_18_tfomest_sels_size ,
                                           String AV169Tmordenwwds_20_tfomusucre_sel ,
                                           String AV168Tmordenwwds_19_tfomusucre ,
                                           java.util.Date AV170Tmordenwwds_21_tfomfchcre ,
                                           String AV172Tmordenwwds_23_tfomtxt_sel ,
                                           String AV171Tmordenwwds_22_tfomtxt ,
                                           java.util.Date AV173Tmordenwwds_24_tfomfchpre ,
                                           java.util.Date AV174Tmordenwwds_25_tfomfchcer ,
                                           java.math.BigDecimal AV179Tmordenwwds_30_tfomrrcost ,
                                           java.math.BigDecimal AV180Tmordenwwds_31_tfomrrcost_to ,
                                           java.math.BigDecimal AV181Tmordenwwds_32_tfomrccost ,
                                           java.math.BigDecimal AV182Tmordenwwds_33_tfomrccost_to ,
                                           java.math.BigDecimal AV183Tmordenwwds_34_tfommrcost ,
                                           java.math.BigDecimal AV184Tmordenwwds_35_tfommrcost_to ,
                                           java.math.BigDecimal AV185Tmordenwwds_36_tfommccost ,
                                           java.math.BigDecimal AV186Tmordenwwds_37_tfommccost_to ,
                                           String AV188Tmordenwwds_39_tfomnot_sel ,
                                           String AV187Tmordenwwds_38_tfomnot ,
                                           String AV124GroupBy ,
                                           int A9425OMCod ,
                                           int A9429PMCod ,
                                           String A9473PMDsc ,
                                           String A9426OMMaqCod ,
                                           String A9427OMMaqDsc ,
                                           int A9428SMCod ,
                                           String A9437OMUsuCre ,
                                           java.util.Date A9436OMFchCre ,
                                           String A9433OMTxt ,
                                           java.util.Date A9438OMFchPre ,
                                           java.util.Date A9439OMFchCer ,
                                           java.math.BigDecimal A9444OMRRCosT ,
                                           java.math.BigDecimal A9443OMRCCosT ,
                                           java.math.BigDecimal A9442OMMRCosT ,
                                           java.math.BigDecimal A9441OMMCCosT ,
                                           String A9464OMNot ,
                                           String AV127GroupOMMaqCod ,
                                           String AV135GroupOMMaqDsc ,
                                           String AV150Tmordenwwds_1_filterfulltext ,
                                           String A13679OMMaqCodFo ,
                                           String A13678OMDscMqPla ,
                                           String A13680OMDuracion ,
                                           java.math.BigDecimal A9440OMCosRea ,
                                           String AV162Tmordenwwds_13_tfommaqcodfor_sel ,
                                           String AV161Tmordenwwds_12_tfommaqcodfor ,
                                           String AV164Tmordenwwds_15_tfomdscmqpla_sel ,
                                           String AV163Tmordenwwds_14_tfomdscmqpla ,
                                           String AV176Tmordenwwds_27_tfomduracion_sel ,
                                           String AV175Tmordenwwds_26_tfomduracion ,
                                           java.math.BigDecimal AV177Tmordenwwds_28_tfomcosrea ,
                                           java.math.BigDecimal AV178Tmordenwwds_29_tfomcosrea_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[41];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT T1.OMNot, T1.OMFchCer, T1.OMFchPre, T1.OMTxt, T1.OMFchCre, T1.OMUsuCre, T1.SMCod, T2.MaqDsc AS OMMaqDsc, T1.OMMaqCod AS OMMaqCod, T3.PMDsc, T1.PMCod, T1.OMCod," ;
      scmdbuf += " T1.EmprCod, COALESCE( T6.OMDscMqPla, '') AS OMDscMqPla, COALESCE( T7.OMMaqCodFo, '') AS OMMaqCodFo, COALESCE( T4.OMMCCosT, 0) AS OMMCCosT, COALESCE( T5.OMRCCosT," ;
      scmdbuf += " 0) AS OMRCCosT, T1.OMEst, COALESCE( T4.OMMRCosT, 0) AS OMMRCosT, COALESCE( T5.OMRRCosT, 0) AS OMRRCosT FROM ((((((TXPMORDEN T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.MaqCod = T1.OMMaqCod) LEFT JOIN TXPMPREVE T3 ON T3.EmprCod = T1.EmprCod AND T3.PMCod = T1.PMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMMRCnt" ;
      scmdbuf += " * CAST(OMMRPre AS NUMERIC(22,10))) AS OMMRCosT, SUM(OMMCCnt * CAST(OMMCPre AS NUMERIC(22,10))) AS OMMCCosT FROM TXPMOrMO GROUP BY EmprCod, OMCod ) T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.OMCod = T1.OMCod) LEFT JOIN (SELECT EmprCod, OMCod, SUM(OMRRCnt * CAST(OMRRPre AS NUMERIC(22,10))) AS OMRRCosT, SUM(OMRCCnt * CAST(OMRCPre AS" ;
      scmdbuf += " NUMERIC(22,10))) AS OMRCCosT FROM TXPMOrRep GROUP BY EmprCod, OMCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.OMCod = T1.OMCod) INNER JOIN (SELECT CASE  WHEN (rtrim(COALESCE(" ;
      scmdbuf += " T10.OMMaqCodFo, '')) IS NULL AND NOT(COALESCE( T10.OMMaqCodFo, '') IS NULL)) THEN COALESCE( T9.MaqDsc, '') ELSE COALESCE( T10.OMMaqCodFo, '') END AS OMDscMqPla," ;
      scmdbuf += " T8.EmprCod, T8.OMCod FROM ((TXPMORDEN T8 INNER JOIN TXPMAQUIN T9 ON T9.EmprCod = T8.EmprCod AND T9.MaqCod = T8.OMMaqCod) LEFT JOIN (SELECT T11.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T11.EmprCod, T12.OMCod, T11.MaqCod, T12.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T11 INNER JOIN TXPMORDEN T12 ON T12.EmprCod = T11.EmprCod) WHERE T11.MaqCod = T12.OMMaqCod" ;
      scmdbuf += " ) T10 ON T10.EmprCod = T8.EmprCod AND T10.OMCod = T8.OMCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.OMCod = T1.OMCod) LEFT JOIN (SELECT T8.MaqCodFor AS OMMaqCodFo," ;
      scmdbuf += " T8.EmprCod, T9.OMCod, T8.MaqCod, T9.OMMaqCod AS OMMaqCod FROM (TXPMAQUIN T8 INNER JOIN TXPMORDEN T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.MaqCod = T9.OMMaqCod )" ;
      scmdbuf += " T7 ON T7.EmprCod = T1.EmprCod AND T7.OMCod = T1.OMCod)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.OMMaqCodFo, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.OMMaqCodFo, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.OMDscMqPla, '')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.OMDscMqPla, '') = ?))");
      if ( ! (0==AV151Tmordenwwds_2_tfomcod) )
      {
         addWhere(sWhereString, "(T1.OMCod >= ?)");
      }
      else
      {
         GXv_int40[10] = (byte)(1) ;
      }
      if ( ! (0==AV152Tmordenwwds_3_tfomcod_to) )
      {
         addWhere(sWhereString, "(T1.OMCod <= ?)");
      }
      else
      {
         GXv_int40[11] = (byte)(1) ;
      }
      if ( ! (0==AV153Tmordenwwds_4_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int40[12] = (byte)(1) ;
      }
      if ( ! (0==AV154Tmordenwwds_5_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int40[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Tmordenwwds_7_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Tmordenwwds_6_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Tmordenwwds_7_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMDsc = ?)");
      }
      else
      {
         GXv_int40[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tmordenwwds_9_tfommaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV157Tmordenwwds_8_tfommaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tmordenwwds_9_tfommaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int40[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Tmordenwwds_11_tfommaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV159Tmordenwwds_10_tfommaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Tmordenwwds_11_tfommaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int40[19] = (byte)(1) ;
      }
      if ( ! (0==AV165Tmordenwwds_16_tfsmcod) )
      {
         addWhere(sWhereString, "(T1.SMCod >= ?)");
      }
      else
      {
         GXv_int40[20] = (byte)(1) ;
      }
      if ( ! (0==AV166Tmordenwwds_17_tfsmcod_to) )
      {
         addWhere(sWhereString, "(T1.SMCod <= ?)");
      }
      else
      {
         GXv_int40[21] = (byte)(1) ;
      }
      if ( AV167Tmordenwwds_18_tfomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV167Tmordenwwds_18_tfomest_sels, "T1.OMEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV169Tmordenwwds_20_tfomusucre_sel)==0) && ( ! (GXutil.strcmp("", AV168Tmordenwwds_19_tfomusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Tmordenwwds_20_tfomusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMUsuCre = ?)");
      }
      else
      {
         GXv_int40[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV170Tmordenwwds_21_tfomfchcre) )
      {
         addWhere(sWhereString, "(T1.OMFchCre >= ?)");
      }
      else
      {
         GXv_int40[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Tmordenwwds_23_tfomtxt_sel)==0) && ( ! (GXutil.strcmp("", AV171Tmordenwwds_22_tfomtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Tmordenwwds_23_tfomtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMTxt = ?)");
      }
      else
      {
         GXv_int40[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV173Tmordenwwds_24_tfomfchpre)) )
      {
         addWhere(sWhereString, "(T1.OMFchPre >= ?)");
      }
      else
      {
         GXv_int40[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV174Tmordenwwds_25_tfomfchcer) )
      {
         addWhere(sWhereString, "(T1.OMFchCer >= ?)");
      }
      else
      {
         GXv_int40[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Tmordenwwds_30_tfomrrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int40[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Tmordenwwds_31_tfomrrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int40[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Tmordenwwds_32_tfomrccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Tmordenwwds_33_tfomrccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.OMRCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int40[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Tmordenwwds_34_tfommrcost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) >= ?)");
      }
      else
      {
         GXv_int40[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Tmordenwwds_35_tfommrcost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMRCosT, 0) <= ?)");
      }
      else
      {
         GXv_int40[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV185Tmordenwwds_36_tfommccost)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) >= ?)");
      }
      else
      {
         GXv_int40[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Tmordenwwds_37_tfommccost_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T4.OMMCCosT, 0) <= ?)");
      }
      else
      {
         GXv_int40[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV188Tmordenwwds_39_tfomnot_sel)==0) && ( ! (GXutil.strcmp("", AV187Tmordenwwds_38_tfomnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.OMNot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV188Tmordenwwds_39_tfomnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.OMNot = ?)");
      }
      else
      {
         GXv_int40[38] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV124GroupBy, "OMMaqCod") == 0 )
      {
         addWhere(sWhereString, "(T1.OMMaqCod = ?)");
      }
      else
      {
         GXv_int40[39] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV124GroupBy, "OMMaqDsc") == 0 )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int40[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.OMCod" ;
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
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
                  return conditional_H00YH7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , (GXSimpleCollection<String>)dynConstraints[65] );
            case 1 :
                  return conditional_H00YH13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , (GXSimpleCollection<String>)dynConstraints[65] );
            case 2 :
                  return conditional_H00YH19(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , (java.math.BigDecimal)dynConstraints[63] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00YH7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YH13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00YH19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 3);
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,3);
               ((String[]) buf[25])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,3);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 3);
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(17,3);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(18,3);
               ((String[]) buf[25])[0] = rslt.getString(19, 1);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(20,3);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(21,3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 3);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(16,3);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(17,3);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(19,3);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,3);
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
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 2000);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 2000);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 2000);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[69], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 3);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 3);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 3);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 3);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 3);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 3);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 2000);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 2000);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 6);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               return;
      }
   }

}

