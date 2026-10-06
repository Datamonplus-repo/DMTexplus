package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmpreveww_impl extends GXDataArea
{
   public tmpreveww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmpreveww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmpreveww_impl.class ));
   }

   public tmpreveww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkavSel = UIFactory.getCheckbox(this);
      cmbPMEst = new HTMLChoice();
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
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
      AV32ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5ColumnsSelector);
      AV23FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV44TFPMCod = (int)(GXutil.lval( httpContext.GetPar( "TFPMCod"))) ;
      AV45TFPMCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPMCod_To"))) ;
      AV48TFPMDsc = httpContext.GetPar( "TFPMDsc") ;
      AV49TFPMDsc_Sel = httpContext.GetPar( "TFPMDsc_Sel") ;
      AV58TFPMMaqCod = httpContext.GetPar( "TFPMMaqCod") ;
      AV59TFPMMaqCod_Sel = httpContext.GetPar( "TFPMMaqCod_Sel") ;
      AV60TFPMMaqDsc = httpContext.GetPar( "TFPMMaqDsc") ;
      AV61TFPMMaqDsc_Sel = httpContext.GetPar( "TFPMMaqDsc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV50TFPMEst_Sels);
      AV52TFPMFchCre = localUtil.parseDateParm( httpContext.GetPar( "TFPMFchCre")) ;
      AV56TFPMIni = localUtil.parseDateParm( httpContext.GetPar( "TFPMIni")) ;
      AV70TFPMUlt = localUtil.parseDateParm( httpContext.GetPar( "TFPMUlt")) ;
      AV54TFPMFin = localUtil.parseDateParm( httpContext.GetPar( "TFPMFin")) ;
      AV76TFPMUsuCre = httpContext.GetPar( "TFPMUsuCre") ;
      AV77TFPMUsuCre_Sel = httpContext.GetPar( "TFPMUsuCre_Sel") ;
      AV46TFPMDias = (short)(GXutil.lval( httpContext.GetPar( "TFPMDias"))) ;
      AV47TFPMDias_To = (short)(GXutil.lval( httpContext.GetPar( "TFPMDias_To"))) ;
      AV154TFPMDiasPaviso = (short)(GXutil.lval( httpContext.GetPar( "TFPMDiasPaviso"))) ;
      AV155TFPMDiasPaviso_To = (short)(GXutil.lval( httpContext.GetPar( "TFPMDiasPaviso_To"))) ;
      AV72TFPMUso = CommonUtil.decimalVal( httpContext.GetPar( "TFPMUso"), ".") ;
      AV73TFPMUso_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMUso_To"), ".") ;
      AV74TFPMUsoMts = CommonUtil.decimalVal( httpContext.GetPar( "TFPMUsoMts"), ".") ;
      AV75TFPMUsoMts_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMUsoMts_To"), ".") ;
      AV156TFPMTipoDsc = httpContext.GetPar( "TFPMTipoDsc") ;
      AV157TFPMTipoDsc_Sel = httpContext.GetPar( "TFPMTipoDsc_Sel") ;
      AV62TFPMOrd = (int)(GXutil.lval( httpContext.GetPar( "TFPMOrd"))) ;
      AV63TFPMOrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFPMOrd_To"))) ;
      AV66TFPMTie = CommonUtil.decimalVal( httpContext.GetPar( "TFPMTie"), ".") ;
      AV67TFPMTie_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMTie_To"), ".") ;
      AV64TFPMPla = httpContext.GetPar( "TFPMPla") ;
      AV65TFPMPla_Sel = httpContext.GetPar( "TFPMPla_Sel") ;
      AV68TFPMTxt = httpContext.GetPar( "TFPMTxt") ;
      AV69TFPMTxt_Sel = httpContext.GetPar( "TFPMTxt_Sel") ;
      AV171Pgmname = httpContext.GetPar( "Pgmname") ;
      AV37OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV39OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV131GroupBy = httpContext.GetPar( "GroupBy") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV136GridCollapsedRecords);
      AV150PMUsoMts = CommonUtil.decimalVal( httpContext.GetPar( "PMUsoMts"), ".") ;
      AV149Nrg1 = (int)(GXutil.lval( httpContext.GetPar( "Nrg1"))) ;
      AV130Grid_GroupCaption = httpContext.GetPar( "Grid_GroupCaption") ;
      AV133GroupKey = httpContext.GetPar( "GroupKey") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV135GridCollapsedRecordsChildren);
      AV19EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV32ManageFiltersExecutionStep, AV5ColumnsSelector, AV23FilterFullText, AV44TFPMCod, AV45TFPMCod_To, AV48TFPMDsc, AV49TFPMDsc_Sel, AV58TFPMMaqCod, AV59TFPMMaqCod_Sel, AV60TFPMMaqDsc, AV61TFPMMaqDsc_Sel, AV50TFPMEst_Sels, AV52TFPMFchCre, AV56TFPMIni, AV70TFPMUlt, AV54TFPMFin, AV76TFPMUsuCre, AV77TFPMUsuCre_Sel, AV46TFPMDias, AV47TFPMDias_To, AV154TFPMDiasPaviso, AV155TFPMDiasPaviso_To, AV72TFPMUso, AV73TFPMUso_To, AV74TFPMUsoMts, AV75TFPMUsoMts_To, AV156TFPMTipoDsc, AV157TFPMTipoDsc_Sel, AV62TFPMOrd, AV63TFPMOrd_To, AV66TFPMTie, AV67TFPMTie_To, AV64TFPMPla, AV65TFPMPla_Sel, AV68TFPMTxt, AV69TFPMTxt_Sel, AV171Pgmname, AV37OrderedBy, AV39OrderedDsc, AV131GroupBy, AV136GridCollapsedRecords, AV150PMUsoMts, AV149Nrg1, AV130Grid_GroupCaption, AV133GroupKey, AV135GridCollapsedRecordsChildren, AV19EmprCod) ;
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
      paRB2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startRB2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmpreveww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNRG1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV149Nrg1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMPreveWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV171Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmpreveww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV31ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV31ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV16DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV167MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV167MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV5ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV32ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMCOD", GXutil.ltrim( localUtil.ntoc( AV44TFPMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV45TFPMCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDSC", GXutil.rtrim( AV48TFPMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDSC_SEL", GXutil.rtrim( AV49TFPMDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMMAQCOD", GXutil.rtrim( AV58TFPMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMMAQCOD_SEL", GXutil.rtrim( AV59TFPMMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMMAQDSC", GXutil.rtrim( AV60TFPMMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMMAQDSC_SEL", GXutil.rtrim( AV61TFPMMaqDsc_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFPMEST_SELS", AV50TFPMEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFPMEST_SELS", AV50TFPMEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMFCHCRE", localUtil.dtoc( AV52TFPMFchCre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMINI", localUtil.dtoc( AV56TFPMIni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMULT", localUtil.dtoc( AV70TFPMUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMFIN", localUtil.dtoc( AV54TFPMFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMUSUCRE", GXutil.rtrim( AV76TFPMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMUSUCRE_SEL", GXutil.rtrim( AV77TFPMUsuCre_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDIAS", GXutil.ltrim( localUtil.ntoc( AV46TFPMDias, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDIAS_TO", GXutil.ltrim( localUtil.ntoc( AV47TFPMDias_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDIASPAVISO", GXutil.ltrim( localUtil.ntoc( AV154TFPMDiasPaviso, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDIASPAVISO_TO", GXutil.ltrim( localUtil.ntoc( AV155TFPMDiasPaviso_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMUSO", GXutil.ltrim( localUtil.ntoc( AV72TFPMUso, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMUSO_TO", GXutil.ltrim( localUtil.ntoc( AV73TFPMUso_To, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMUSOMTS", GXutil.ltrim( localUtil.ntoc( AV74TFPMUsoMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMUSOMTS_TO", GXutil.ltrim( localUtil.ntoc( AV75TFPMUsoMts_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMTIPODSC", GXutil.rtrim( AV156TFPMTipoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMTIPODSC_SEL", GXutil.rtrim( AV157TFPMTipoDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMORD", GXutil.ltrim( localUtil.ntoc( AV62TFPMOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMORD_TO", GXutil.ltrim( localUtil.ntoc( AV63TFPMOrd_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMTIE", GXutil.ltrim( localUtil.ntoc( AV66TFPMTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMTIE_TO", GXutil.ltrim( localUtil.ntoc( AV67TFPMTie_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMPLA", GXutil.rtrim( AV64TFPMPla));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMPLA_SEL", GXutil.rtrim( AV65TFPMPla_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMTXT", AV68TFPMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMTXT_SEL", AV69TFPMTxt_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV37OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV39OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPBY", AV131GroupBy);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDS", AV136GridCollapsedRecords);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDS", AV136GridCollapsedRecords);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vNRG1", GXutil.ltrim( localUtil.ntoc( AV149Nrg1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNRG1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV149Nrg1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPKEY", AV133GroupKey);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDSCHILDREN", AV135GridCollapsedRecordsChildren);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDSCHILDREN", AV135GridCollapsedRecordsChildren);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV27GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV27GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMEST_SELSJSON", AV51TFPMEst_SelsJson);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vADDCHILDREN", AV140AddChildren);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCAR", AV109Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOREFRESCAR", AV108ObjetoRefrescar);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOREFRESCAR", AV108ObjetoRefrescar);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_maqcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Isgriditem", GXutil.booltostr( Combo_maqcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitem", GXutil.booltostr( Combo_maqcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Title", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Title", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Title", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Gridinternalname", GXutil.rtrim( Grid_group_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Columnindex", GXutil.ltrim( localUtil.ntoc( Grid_group_Columnindex, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Result", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Result", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Result", GXutil.rtrim( Dvelop_confirmpanel_duplicartarea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENES_Result", GXutil.rtrim( Dvelop_confirmpanel_generarordenes_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Result", GXutil.rtrim( Dvelop_confirmpanel_generarordenesop_Result));
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
         weRB2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtRB2( ) ;
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
      return formatLink("app.mantenimientomaquina.tmpreveww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMPreveWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Preventivo", "") ;
   }

   public void wbRB0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarordenes_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Ordenes", ""), bttBtngenerarordenes_Jsonclick, 7, httpContext.getMessage( "Generar Ordenes", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11rb1_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarordenesop_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Ordenes (Op)", ""), bttBtngenerarordenesop_Jsonclick, 7, httpContext.getMessage( "Generar Ordenes (Op)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12rb1_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarordenesoptodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Ordenes (Op) +", ""), bttBtngenerarordenesoptodos_Jsonclick, 7, httpContext.getMessage( "Generar Ordenes (Op) Seleccionar Todos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e13rb1_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarordenesopninguno_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Ordenes (Op) -", ""), bttBtngenerarordenesopninguno_Jsonclick, 7, httpContext.getMessage( "Generar Ordenes (Op) Seleccionar Ninguno", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e14rb1_client"+"'", TempTags, "", 2, "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexcelwin_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel (Win)", ""), bttBtnexcelwin_Jsonclick, 5, httpContext.getMessage( "Mantenimiento Preventivo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXCELWIN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_37_RB2( true) ;
      }
      else
      {
         wb_table1_37_RB2( false) ;
      }
      return  ;
   }

   public void wb_table1_37_RB2e( boolean wbgen )
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
         startgridcontrol55( ) ;
      }
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (int)(nGXsfl_55_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV171Pgmname), GXutil.rtrim( localUtil.format( AV171Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
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
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("IsGridItem", Combo_maqcod_Isgriditem);
         ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV167MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV16DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV5ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_104_RB2( true) ;
      }
      else
      {
         wb_table2_104_RB2( false) ;
      }
      return  ;
   }

   public void wb_table2_104_RB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_109_RB2( true) ;
      }
      else
      {
         wb_table3_109_RB2( false) ;
      }
      return  ;
   }

   public void wb_table3_109_RB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_114_RB2( true) ;
      }
      else
      {
         wb_table4_114_RB2( false) ;
      }
      return  ;
   }

   public void wb_table4_114_RB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_group.setProperty("ColumnIndex", Grid_group_Columnindex);
         ucGrid_group.render(context, "dvelop.dvgroupby", Grid_group_Internalname, "GRID_GROUPContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("HasRowGroups", Grid_empowerer_Hasrowgroups);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pmfchcreauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pmfchcreauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pmfchcreauxdate_Internalname, localUtil.format(AV8DDO_PMFchCreAuxDate, "99/99/99"), localUtil.format( AV8DDO_PMFchCreAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pmfchcreauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pmfchcreauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pminiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pminiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pminiauxdate_Internalname, localUtil.format(AV12DDO_PMIniAuxDate, "99/99/99"), localUtil.format( AV12DDO_PMIniAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pminiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pminiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pmultauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pmultauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pmultauxdate_Internalname, localUtil.format(AV14DDO_PMUltAuxDate, "99/99/99"), localUtil.format( AV14DDO_PMUltAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pmultauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pmultauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pmfinauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pmfinauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pmfinauxdate_Internalname, localUtil.format(AV10DDO_PMFinAuxDate, "99/99/99"), localUtil.format( AV10DDO_PMFinAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pmfinauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pmfinauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 55 )
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

   public void startRB2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Preventivo", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupRB0( ) ;
   }

   public void wsRB2( )
   {
      startRB2( ) ;
      evtRB2( ) ;
   }

   public void evtRB2( )
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
                           e15RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DUPLICARTAREA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_GENERARORDENES.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e21RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_GENERARORDENESOP.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e22RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e23RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXCELWIN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExcelWin' */
                           e24RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e25RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e26RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e27RB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e28RB2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_55_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
                           AV141Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV141Expand);
                           AV130Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV130Grid_GroupCaption);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV129GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129GridActions), 4, 0));
                           AV153Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV153Sel);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
                           n9473PMDsc = false ;
                           A9476PMMaqCod = httpContext.cgiGet( edtPMMaqCod_Internalname) ;
                           n9476PMMaqCod = false ;
                           A9477PMMaqDsc = httpContext.cgiGet( edtPMMaqDsc_Internalname) ;
                           n9477PMMaqDsc = false ;
                           AV34MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV34MaqCod);
                           cmbPMEst.setName( cmbPMEst.getInternalname() );
                           cmbPMEst.setValue( httpContext.cgiGet( cmbPMEst.getInternalname()) );
                           A9478PMEst = httpContext.cgiGet( cmbPMEst.getInternalname()) ;
                           n9478PMEst = false ;
                           A9474PMFchCre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMFchCre_Internalname), 0)) ;
                           n9474PMFchCre = false ;
                           A9484PMIni = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMIni_Internalname), 0)) ;
                           n9484PMIni = false ;
                           A9486PMUlt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMUlt_Internalname), 0)) ;
                           n9486PMUlt = false ;
                           A9485PMFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMFin_Internalname), 0)) ;
                           n9485PMFin = false ;
                           A9475PMUsuCre = GXutil.upper( httpContext.cgiGet( edtPMUsuCre_Internalname)) ;
                           n9475PMUsuCre = false ;
                           A9487PMDias = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9487PMDias = false ;
                           A14275PMDiasPavi = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDiasPavi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n14275PMDiasPavi = false ;
                           A11454PMUso = localUtil.ctond( httpContext.cgiGet( edtPMUso_Internalname)) ;
                           n11454PMUso = false ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHoras_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHoras_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHORAS");
                              GX_FocusControl = edtavHoras_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV146Horas = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavHoras_Internalname, GXutil.ltrimstr( AV146Horas, 10, 2));
                           }
                           else
                           {
                              AV146Horas = localUtil.ctond( httpContext.cgiGet( edtavHoras_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavHoras_Internalname, GXutil.ltrimstr( AV146Horas, 10, 2));
                           }
                           A13013PMUsoMts = localUtil.ctond( httpContext.cgiGet( edtPMUsoMts_Internalname)) ;
                           n13013PMUsoMts = false ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmusomts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmusomts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMUSOMTS");
                              GX_FocusControl = edtavPmusomts_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV150PMUsoMts = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPmusomts_Internalname, GXutil.ltrimstr( AV150PMUsoMts, 10, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMUSOMTS"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( AV150PMUsoMts, "ZZZZZZ9.99")));
                           }
                           else
                           {
                              AV150PMUsoMts = localUtil.ctond( httpContext.cgiGet( edtavPmusomts_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPmusomts_Internalname, GXutil.ltrimstr( AV150PMUsoMts, 10, 2));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMUSOMTS"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( AV150PMUsoMts, "ZZZZZZ9.99")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrearorden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrearorden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCREARORDEN");
                              GX_FocusControl = edtavCrearorden_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV145CrearOrden = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCrearorden_Internalname, GXutil.str( AV145CrearOrden, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCREARORDEN"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9")));
                           }
                           else
                           {
                              AV145CrearOrden = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCrearorden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCrearorden_Internalname, GXutil.str( AV145CrearOrden, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCREARORDEN"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9")));
                           }
                           A14272PMTipoDsc = httpContext.cgiGet( edtPMTipoDsc_Internalname) ;
                           A9488PMOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtPMOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9488PMOrd = false ;
                           A11455PMTie = localUtil.ctond( httpContext.cgiGet( edtPMTie_Internalname)) ;
                           A11456PMPla = httpContext.cgiGet( edtPMPla_Internalname) ;
                           A9483PMTxt = httpContext.cgiGet( edtPMTxt_Internalname) ;
                           n9483PMTxt = false ;
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecha1_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA1");
                              GX_FocusControl = edtavFecha1_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV143Fecha1 = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFecha1_Internalname, localUtil.format(AV143Fecha1, "99/99/99"));
                           }
                           else
                           {
                              AV143Fecha1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha1_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFecha1_Internalname, localUtil.format(AV143Fecha1, "99/99/99"));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecha2_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA2");
                              GX_FocusControl = edtavFecha2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV144Fecha2 = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFecha2_Internalname, localUtil.format(AV144Fecha2, "99/99/99"));
                           }
                           else
                           {
                              AV144Fecha2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha2_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavFecha2_Internalname, localUtil.format(AV144Fecha2, "99/99/99"));
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
                                 e29RB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e30RB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e31RB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e32RB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXPAND.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e33RB2 ();
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

   public void weRB2( )
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

   public void paRB2( )
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
      subsflControlProps_552( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_552( ) ;
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV32ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ,
                                 String AV23FilterFullText ,
                                 int AV44TFPMCod ,
                                 int AV45TFPMCod_To ,
                                 String AV48TFPMDsc ,
                                 String AV49TFPMDsc_Sel ,
                                 String AV58TFPMMaqCod ,
                                 String AV59TFPMMaqCod_Sel ,
                                 String AV60TFPMMaqDsc ,
                                 String AV61TFPMMaqDsc_Sel ,
                                 GXSimpleCollection<String> AV50TFPMEst_Sels ,
                                 java.util.Date AV52TFPMFchCre ,
                                 java.util.Date AV56TFPMIni ,
                                 java.util.Date AV70TFPMUlt ,
                                 java.util.Date AV54TFPMFin ,
                                 String AV76TFPMUsuCre ,
                                 String AV77TFPMUsuCre_Sel ,
                                 short AV46TFPMDias ,
                                 short AV47TFPMDias_To ,
                                 short AV154TFPMDiasPaviso ,
                                 short AV155TFPMDiasPaviso_To ,
                                 java.math.BigDecimal AV72TFPMUso ,
                                 java.math.BigDecimal AV73TFPMUso_To ,
                                 java.math.BigDecimal AV74TFPMUsoMts ,
                                 java.math.BigDecimal AV75TFPMUsoMts_To ,
                                 String AV156TFPMTipoDsc ,
                                 String AV157TFPMTipoDsc_Sel ,
                                 int AV62TFPMOrd ,
                                 int AV63TFPMOrd_To ,
                                 java.math.BigDecimal AV66TFPMTie ,
                                 java.math.BigDecimal AV67TFPMTie_To ,
                                 String AV64TFPMPla ,
                                 String AV65TFPMPla_Sel ,
                                 String AV68TFPMTxt ,
                                 String AV69TFPMTxt_Sel ,
                                 String AV171Pgmname ,
                                 short AV37OrderedBy ,
                                 boolean AV39OrderedDsc ,
                                 String AV131GroupBy ,
                                 GXSimpleCollection<String> AV136GridCollapsedRecords ,
                                 java.math.BigDecimal AV150PMUsoMts ,
                                 int AV149Nrg1 ,
                                 String AV130Grid_GroupCaption ,
                                 String AV133GroupKey ,
                                 GXSimpleCollection<String> AV135GridCollapsedRecordsChildren ,
                                 String AV19EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e30RB2 ();
      GRID_nCurrentRecord = 0 ;
      rfRB2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMPreveWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV171Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmpreveww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMUSOMTS", getSecureSignedToken( "", localUtil.format( AV150PMUsoMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMUSOMTS", GXutil.ltrim( localUtil.ntoc( AV150PMUsoMts, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID_GROUPCAPTION", AV130Grid_GroupCaption);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCREARORDEN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCREARORDEN", GXutil.ltrim( localUtil.ntoc( AV145CrearOrden, (byte)(1), (byte)(0), ".", "")));
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
      rfRB2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV171Pgmname = "MantenimientoMaquina.TMPreveWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171Pgmname", AV171Pgmname);
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavHoras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHoras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHoras_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavPmusomts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmusomts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmusomts_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavCrearorden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCrearorden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCrearorden_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavFecha1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFecha1_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavFecha2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFecha2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) ,
                                           AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                           AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                           AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                           AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                           AV183Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                           AV184Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                           AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                           AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                           AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                           AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                           AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                           AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                           AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                           AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                           Integer.valueOf(AV198Mantenimientomaquina_tmprevewwds_27_tfpmord) ,
                                           Integer.valueOf(AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to) ,
                                           AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                           AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                           AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                           AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                           AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                           AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           A14272PMTipoDsc ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           Short.valueOf(AV37OrderedBy) ,
                                           Boolean.valueOf(AV39OrderedDsc) ,
                                           AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext ,
                                           Integer.valueOf(AV135GridCollapsedRecordsChildren.size()) ,
                                           A396EmprCod ,
                                           AV135GridCollapsedRecordsChildren } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = GXutil.padr( GXutil.rtrim( AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc), 30, "%") ;
      lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = GXutil.padr( GXutil.rtrim( AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla), 1, "%") ;
      lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = GXutil.concat( GXutil.rtrim( AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt), "%", "") ;
      /* Using cursor H00RB2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod), Integer.valueOf(AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to), lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc, AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel, lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod, AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel, lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc, AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel, AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre, AV183Mantenimientomaquina_tmprevewwds_12_tfpmini, AV184Mantenimientomaquina_tmprevewwds_13_tfpmult, AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin, lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre, AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias), Short.valueOf(AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to), Short.valueOf(AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to), AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso, AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to, AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts, AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to, lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc, AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel, Integer.valueOf(AV198Mantenimientomaquina_tmprevewwds_27_tfpmord), Integer.valueOf(AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to), AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie, AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to, lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla, AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel, lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt, AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14271PMTipoID = H00RB2_A14271PMTipoID[0] ;
         A9483PMTxt = H00RB2_A9483PMTxt[0] ;
         n9483PMTxt = H00RB2_n9483PMTxt[0] ;
         A11456PMPla = H00RB2_A11456PMPla[0] ;
         A11455PMTie = H00RB2_A11455PMTie[0] ;
         A9488PMOrd = H00RB2_A9488PMOrd[0] ;
         n9488PMOrd = H00RB2_n9488PMOrd[0] ;
         A14272PMTipoDsc = H00RB2_A14272PMTipoDsc[0] ;
         A13013PMUsoMts = H00RB2_A13013PMUsoMts[0] ;
         n13013PMUsoMts = H00RB2_n13013PMUsoMts[0] ;
         A11454PMUso = H00RB2_A11454PMUso[0] ;
         n11454PMUso = H00RB2_n11454PMUso[0] ;
         A14275PMDiasPavi = H00RB2_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = H00RB2_n14275PMDiasPavi[0] ;
         A9487PMDias = H00RB2_A9487PMDias[0] ;
         n9487PMDias = H00RB2_n9487PMDias[0] ;
         A9475PMUsuCre = H00RB2_A9475PMUsuCre[0] ;
         n9475PMUsuCre = H00RB2_n9475PMUsuCre[0] ;
         A9485PMFin = H00RB2_A9485PMFin[0] ;
         n9485PMFin = H00RB2_n9485PMFin[0] ;
         A9486PMUlt = H00RB2_A9486PMUlt[0] ;
         n9486PMUlt = H00RB2_n9486PMUlt[0] ;
         A9484PMIni = H00RB2_A9484PMIni[0] ;
         n9484PMIni = H00RB2_n9484PMIni[0] ;
         A9474PMFchCre = H00RB2_A9474PMFchCre[0] ;
         n9474PMFchCre = H00RB2_n9474PMFchCre[0] ;
         A9478PMEst = H00RB2_A9478PMEst[0] ;
         n9478PMEst = H00RB2_n9478PMEst[0] ;
         A9477PMMaqDsc = H00RB2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = H00RB2_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = H00RB2_A9476PMMaqCod[0] ;
         n9476PMMaqCod = H00RB2_n9476PMMaqCod[0] ;
         A9473PMDsc = H00RB2_A9473PMDsc[0] ;
         n9473PMDsc = H00RB2_n9473PMDsc[0] ;
         A9429PMCod = H00RB2_A9429PMCod[0] ;
         A407EmprNom = H00RB2_A407EmprNom[0] ;
         n407EmprNom = H00RB2_n407EmprNom[0] ;
         A396EmprCod = H00RB2_A396EmprCod[0] ;
         A407EmprNom = H00RB2_A407EmprNom[0] ;
         n407EmprNom = H00RB2_n407EmprNom[0] ;
         A9477PMMaqDsc = H00RB2_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = H00RB2_n9477PMMaqDsc[0] ;
         A14272PMTipoDsc = H00RB2_A14272PMTipoDsc[0] ;
         if ( (GXutil.strcmp("", AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activa", "") , GXutil.padr( "%" + GXutil.lower( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "inactiva", "") , GXutil.padr( "%" + GXutil.lower( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, "I") == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14272PMTipoDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ( AV135GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9429PMCod, 8, 0)), AV135GridCollapsedRecordsChildren) ) )
            {
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfRB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(55) ;
      /* Execute user event: Refresh */
      e30RB2 ();
      nGXsfl_55_idx = 1 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
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
         subsflControlProps_552( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A9478PMEst ,
                                              AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                              Integer.valueOf(AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod) ,
                                              Integer.valueOf(AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) ,
                                              AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                              AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                              AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                              AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                              AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                              AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                              Integer.valueOf(AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels.size()) ,
                                              AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                              AV183Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                              AV184Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                              AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                              AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                              AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                              Short.valueOf(AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias) ,
                                              Short.valueOf(AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) ,
                                              Short.valueOf(AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) ,
                                              Short.valueOf(AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) ,
                                              AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                              AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                              AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                              AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                              AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                              AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                              Integer.valueOf(AV198Mantenimientomaquina_tmprevewwds_27_tfpmord) ,
                                              Integer.valueOf(AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to) ,
                                              AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                              AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                              AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                              AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                              AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                              AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                              Integer.valueOf(A9429PMCod) ,
                                              A9473PMDsc ,
                                              A9476PMMaqCod ,
                                              A9477PMMaqDsc ,
                                              A9474PMFchCre ,
                                              A9484PMIni ,
                                              A9486PMUlt ,
                                              A9485PMFin ,
                                              A9475PMUsuCre ,
                                              Short.valueOf(A9487PMDias) ,
                                              Short.valueOf(A14275PMDiasPavi) ,
                                              A11454PMUso ,
                                              A13013PMUsoMts ,
                                              A14272PMTipoDsc ,
                                              Integer.valueOf(A9488PMOrd) ,
                                              A11455PMTie ,
                                              A11456PMPla ,
                                              A9483PMTxt ,
                                              Short.valueOf(AV37OrderedBy) ,
                                              Boolean.valueOf(AV39OrderedDsc) ,
                                              AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext ,
                                              Integer.valueOf(AV135GridCollapsedRecordsChildren.size()) ,
                                              A396EmprCod ,
                                              AV135GridCollapsedRecordsChildren } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc), 30, "%") ;
         lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod), 6, "%") ;
         lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
         lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre), 8, "%") ;
         lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = GXutil.padr( GXutil.rtrim( AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc), 30, "%") ;
         lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = GXutil.padr( GXutil.rtrim( AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla), 1, "%") ;
         lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = GXutil.concat( GXutil.rtrim( AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt), "%", "") ;
         /* Using cursor H00RB3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod), Integer.valueOf(AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to), lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc, AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel, lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod, AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel, lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc, AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel, AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre, AV183Mantenimientomaquina_tmprevewwds_12_tfpmini, AV184Mantenimientomaquina_tmprevewwds_13_tfpmult, AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin, lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre, AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias), Short.valueOf(AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to), Short.valueOf(AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to), AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso, AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to, AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts, AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to, lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc, AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel, Integer.valueOf(AV198Mantenimientomaquina_tmprevewwds_27_tfpmord), Integer.valueOf(AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to), AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie, AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to, lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla, AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel, lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt, AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel});
         nGXsfl_55_idx = 1 ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14271PMTipoID = H00RB3_A14271PMTipoID[0] ;
            A9483PMTxt = H00RB3_A9483PMTxt[0] ;
            n9483PMTxt = H00RB3_n9483PMTxt[0] ;
            A11456PMPla = H00RB3_A11456PMPla[0] ;
            A11455PMTie = H00RB3_A11455PMTie[0] ;
            A9488PMOrd = H00RB3_A9488PMOrd[0] ;
            n9488PMOrd = H00RB3_n9488PMOrd[0] ;
            A14272PMTipoDsc = H00RB3_A14272PMTipoDsc[0] ;
            A13013PMUsoMts = H00RB3_A13013PMUsoMts[0] ;
            n13013PMUsoMts = H00RB3_n13013PMUsoMts[0] ;
            A11454PMUso = H00RB3_A11454PMUso[0] ;
            n11454PMUso = H00RB3_n11454PMUso[0] ;
            A14275PMDiasPavi = H00RB3_A14275PMDiasPavi[0] ;
            n14275PMDiasPavi = H00RB3_n14275PMDiasPavi[0] ;
            A9487PMDias = H00RB3_A9487PMDias[0] ;
            n9487PMDias = H00RB3_n9487PMDias[0] ;
            A9475PMUsuCre = H00RB3_A9475PMUsuCre[0] ;
            n9475PMUsuCre = H00RB3_n9475PMUsuCre[0] ;
            A9485PMFin = H00RB3_A9485PMFin[0] ;
            n9485PMFin = H00RB3_n9485PMFin[0] ;
            A9486PMUlt = H00RB3_A9486PMUlt[0] ;
            n9486PMUlt = H00RB3_n9486PMUlt[0] ;
            A9484PMIni = H00RB3_A9484PMIni[0] ;
            n9484PMIni = H00RB3_n9484PMIni[0] ;
            A9474PMFchCre = H00RB3_A9474PMFchCre[0] ;
            n9474PMFchCre = H00RB3_n9474PMFchCre[0] ;
            A9478PMEst = H00RB3_A9478PMEst[0] ;
            n9478PMEst = H00RB3_n9478PMEst[0] ;
            A9477PMMaqDsc = H00RB3_A9477PMMaqDsc[0] ;
            n9477PMMaqDsc = H00RB3_n9477PMMaqDsc[0] ;
            A9476PMMaqCod = H00RB3_A9476PMMaqCod[0] ;
            n9476PMMaqCod = H00RB3_n9476PMMaqCod[0] ;
            A9473PMDsc = H00RB3_A9473PMDsc[0] ;
            n9473PMDsc = H00RB3_n9473PMDsc[0] ;
            A9429PMCod = H00RB3_A9429PMCod[0] ;
            A407EmprNom = H00RB3_A407EmprNom[0] ;
            n407EmprNom = H00RB3_n407EmprNom[0] ;
            A396EmprCod = H00RB3_A396EmprCod[0] ;
            A407EmprNom = H00RB3_A407EmprNom[0] ;
            n407EmprNom = H00RB3_n407EmprNom[0] ;
            A9477PMMaqDsc = H00RB3_A9477PMMaqDsc[0] ;
            n9477PMMaqDsc = H00RB3_n9477PMMaqDsc[0] ;
            A14272PMTipoDsc = H00RB3_A14272PMTipoDsc[0] ;
            if ( (GXutil.strcmp("", AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activa", "") , GXutil.padr( "%" + GXutil.lower( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "inactiva", "") , GXutil.padr( "%" + GXutil.lower( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, "I") == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14272PMTipoDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ( AV135GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9429PMCod, 8, 0)), AV135GridCollapsedRecordsChildren) ) )
               {
                  e31RB2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(55) ;
         wbRB0( ) ;
      }
      bGXsfl_55_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesRB2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMUSOMTS"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( AV150PMUsoMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRG1", GXutil.ltrim( localUtil.ntoc( AV149Nrg1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNRG1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV149Nrg1), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV19EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCREARORDEN"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9")));
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
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV32ManageFiltersExecutionStep, AV5ColumnsSelector, AV23FilterFullText, AV44TFPMCod, AV45TFPMCod_To, AV48TFPMDsc, AV49TFPMDsc_Sel, AV58TFPMMaqCod, AV59TFPMMaqCod_Sel, AV60TFPMMaqDsc, AV61TFPMMaqDsc_Sel, AV50TFPMEst_Sels, AV52TFPMFchCre, AV56TFPMIni, AV70TFPMUlt, AV54TFPMFin, AV76TFPMUsuCre, AV77TFPMUsuCre_Sel, AV46TFPMDias, AV47TFPMDias_To, AV154TFPMDiasPaviso, AV155TFPMDiasPaviso_To, AV72TFPMUso, AV73TFPMUso_To, AV74TFPMUsoMts, AV75TFPMUsoMts_To, AV156TFPMTipoDsc, AV157TFPMTipoDsc_Sel, AV62TFPMOrd, AV63TFPMOrd_To, AV66TFPMTie, AV67TFPMTie_To, AV64TFPMPla, AV65TFPMPla_Sel, AV68TFPMTxt, AV69TFPMTxt_Sel, AV171Pgmname, AV37OrderedBy, AV39OrderedDsc, AV131GroupBy, AV136GridCollapsedRecords, AV150PMUsoMts, AV149Nrg1, AV130Grid_GroupCaption, AV133GroupKey, AV135GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV32ManageFiltersExecutionStep, AV5ColumnsSelector, AV23FilterFullText, AV44TFPMCod, AV45TFPMCod_To, AV48TFPMDsc, AV49TFPMDsc_Sel, AV58TFPMMaqCod, AV59TFPMMaqCod_Sel, AV60TFPMMaqDsc, AV61TFPMMaqDsc_Sel, AV50TFPMEst_Sels, AV52TFPMFchCre, AV56TFPMIni, AV70TFPMUlt, AV54TFPMFin, AV76TFPMUsuCre, AV77TFPMUsuCre_Sel, AV46TFPMDias, AV47TFPMDias_To, AV154TFPMDiasPaviso, AV155TFPMDiasPaviso_To, AV72TFPMUso, AV73TFPMUso_To, AV74TFPMUsoMts, AV75TFPMUsoMts_To, AV156TFPMTipoDsc, AV157TFPMTipoDsc_Sel, AV62TFPMOrd, AV63TFPMOrd_To, AV66TFPMTie, AV67TFPMTie_To, AV64TFPMPla, AV65TFPMPla_Sel, AV68TFPMTxt, AV69TFPMTxt_Sel, AV171Pgmname, AV37OrderedBy, AV39OrderedDsc, AV131GroupBy, AV136GridCollapsedRecords, AV150PMUsoMts, AV149Nrg1, AV130Grid_GroupCaption, AV133GroupKey, AV135GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV32ManageFiltersExecutionStep, AV5ColumnsSelector, AV23FilterFullText, AV44TFPMCod, AV45TFPMCod_To, AV48TFPMDsc, AV49TFPMDsc_Sel, AV58TFPMMaqCod, AV59TFPMMaqCod_Sel, AV60TFPMMaqDsc, AV61TFPMMaqDsc_Sel, AV50TFPMEst_Sels, AV52TFPMFchCre, AV56TFPMIni, AV70TFPMUlt, AV54TFPMFin, AV76TFPMUsuCre, AV77TFPMUsuCre_Sel, AV46TFPMDias, AV47TFPMDias_To, AV154TFPMDiasPaviso, AV155TFPMDiasPaviso_To, AV72TFPMUso, AV73TFPMUso_To, AV74TFPMUsoMts, AV75TFPMUsoMts_To, AV156TFPMTipoDsc, AV157TFPMTipoDsc_Sel, AV62TFPMOrd, AV63TFPMOrd_To, AV66TFPMTie, AV67TFPMTie_To, AV64TFPMPla, AV65TFPMPla_Sel, AV68TFPMTxt, AV69TFPMTxt_Sel, AV171Pgmname, AV37OrderedBy, AV39OrderedDsc, AV131GroupBy, AV136GridCollapsedRecords, AV150PMUsoMts, AV149Nrg1, AV130Grid_GroupCaption, AV133GroupKey, AV135GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV32ManageFiltersExecutionStep, AV5ColumnsSelector, AV23FilterFullText, AV44TFPMCod, AV45TFPMCod_To, AV48TFPMDsc, AV49TFPMDsc_Sel, AV58TFPMMaqCod, AV59TFPMMaqCod_Sel, AV60TFPMMaqDsc, AV61TFPMMaqDsc_Sel, AV50TFPMEst_Sels, AV52TFPMFchCre, AV56TFPMIni, AV70TFPMUlt, AV54TFPMFin, AV76TFPMUsuCre, AV77TFPMUsuCre_Sel, AV46TFPMDias, AV47TFPMDias_To, AV154TFPMDiasPaviso, AV155TFPMDiasPaviso_To, AV72TFPMUso, AV73TFPMUso_To, AV74TFPMUsoMts, AV75TFPMUsoMts_To, AV156TFPMTipoDsc, AV157TFPMTipoDsc_Sel, AV62TFPMOrd, AV63TFPMOrd_To, AV66TFPMTie, AV67TFPMTie_To, AV64TFPMPla, AV65TFPMPla_Sel, AV68TFPMTxt, AV69TFPMTxt_Sel, AV171Pgmname, AV37OrderedBy, AV39OrderedDsc, AV131GroupBy, AV136GridCollapsedRecords, AV150PMUsoMts, AV149Nrg1, AV130Grid_GroupCaption, AV133GroupKey, AV135GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV32ManageFiltersExecutionStep, AV5ColumnsSelector, AV23FilterFullText, AV44TFPMCod, AV45TFPMCod_To, AV48TFPMDsc, AV49TFPMDsc_Sel, AV58TFPMMaqCod, AV59TFPMMaqCod_Sel, AV60TFPMMaqDsc, AV61TFPMMaqDsc_Sel, AV50TFPMEst_Sels, AV52TFPMFchCre, AV56TFPMIni, AV70TFPMUlt, AV54TFPMFin, AV76TFPMUsuCre, AV77TFPMUsuCre_Sel, AV46TFPMDias, AV47TFPMDias_To, AV154TFPMDiasPaviso, AV155TFPMDiasPaviso_To, AV72TFPMUso, AV73TFPMUso_To, AV74TFPMUsoMts, AV75TFPMUsoMts_To, AV156TFPMTipoDsc, AV157TFPMTipoDsc_Sel, AV62TFPMOrd, AV63TFPMOrd_To, AV66TFPMTie, AV67TFPMTie_To, AV64TFPMPla, AV65TFPMPla_Sel, AV68TFPMTxt, AV69TFPMTxt_Sel, AV171Pgmname, AV37OrderedBy, AV39OrderedDsc, AV131GroupBy, AV136GridCollapsedRecords, AV150PMUsoMts, AV149Nrg1, AV130Grid_GroupCaption, AV133GroupKey, AV135GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV171Pgmname = "MantenimientoMaquina.TMPreveWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV171Pgmname", AV171Pgmname);
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavHoras_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHoras_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHoras_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavPmusomts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmusomts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmusomts_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavCrearorden_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCrearorden_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCrearorden_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavFecha1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFecha1_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavFecha2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFecha2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFecha2_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupRB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e29RB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV31ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV16DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV167MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV5ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MAQCOD_Titlecontrolidtoreplace") ;
         Combo_maqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Isgriditem")) ;
         Combo_maqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Emptyitem")) ;
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
         Dvelop_confirmpanel_duplicartarea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Title") ;
         Dvelop_confirmpanel_duplicartarea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Confirmationtext") ;
         Dvelop_confirmpanel_duplicartarea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_duplicartarea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Nobuttoncaption") ;
         Dvelop_confirmpanel_duplicartarea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_duplicartarea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Yesbuttonposition") ;
         Dvelop_confirmpanel_duplicartarea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Confirmtype") ;
         Dvelop_confirmpanel_generarordenes_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Title") ;
         Dvelop_confirmpanel_generarordenes_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Confirmationtext") ;
         Dvelop_confirmpanel_generarordenes_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Yesbuttoncaption") ;
         Dvelop_confirmpanel_generarordenes_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Nobuttoncaption") ;
         Dvelop_confirmpanel_generarordenes_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_generarordenes_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Yesbuttonposition") ;
         Dvelop_confirmpanel_generarordenes_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Confirmtype") ;
         Dvelop_confirmpanel_generarordenesop_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Title") ;
         Dvelop_confirmpanel_generarordenesop_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Confirmationtext") ;
         Dvelop_confirmpanel_generarordenesop_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Yesbuttoncaption") ;
         Dvelop_confirmpanel_generarordenesop_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Nobuttoncaption") ;
         Dvelop_confirmpanel_generarordenesop_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_generarordenesop_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Yesbuttonposition") ;
         Dvelop_confirmpanel_generarordenesop_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_group_Gridinternalname = httpContext.cgiGet( "GRID_GROUP_Gridinternalname") ;
         Grid_group_Columnindex = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_GROUP_Columnindex"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
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
         Dvelop_confirmpanel_duplicartarea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DUPLICARTAREA_Result") ;
         Dvelop_confirmpanel_generarordenes_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENES_Result") ;
         Dvelop_confirmpanel_generarordenesop_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARORDENESOP_Result") ;
         /* Read variables values. */
         AV23FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23FilterFullText", AV23FilterFullText);
         AV171Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV171Pgmname", AV171Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pmfchcreauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PMFCHCREAUXDATE");
            GX_FocusControl = edtavDdo_pmfchcreauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8DDO_PMFchCreAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DDO_PMFchCreAuxDate", localUtil.format(AV8DDO_PMFchCreAuxDate, "99/99/99"));
         }
         else
         {
            AV8DDO_PMFchCreAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pmfchcreauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8DDO_PMFchCreAuxDate", localUtil.format(AV8DDO_PMFchCreAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pminiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PMINIAUXDATE");
            GX_FocusControl = edtavDdo_pminiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12DDO_PMIniAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_PMIniAuxDate", localUtil.format(AV12DDO_PMIniAuxDate, "99/99/99"));
         }
         else
         {
            AV12DDO_PMIniAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pminiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_PMIniAuxDate", localUtil.format(AV12DDO_PMIniAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pmultauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PMULTAUXDATE");
            GX_FocusControl = edtavDdo_pmultauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_PMUltAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_PMUltAuxDate", localUtil.format(AV14DDO_PMUltAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_PMUltAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pmultauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_PMUltAuxDate", localUtil.format(AV14DDO_PMUltAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pmfinauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PMFINAUXDATE");
            GX_FocusControl = edtavDdo_pmfinauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10DDO_PMFinAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DDO_PMFinAuxDate", localUtil.format(AV10DDO_PMFinAuxDate, "99/99/99"));
         }
         else
         {
            AV10DDO_PMFinAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pmfinauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DDO_PMFinAuxDate", localUtil.format(AV10DDO_PMFinAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TMPreveWW");
         AV171Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV171Pgmname", AV171Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV171Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("mantenimientomaquina\\tmpreveww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e29RB2 ();
      if (returnInSub) return;
   }

   public void e29RB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV43Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmpreveww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Station = GXt_char1 ;
      GXv_char2[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV82UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmpreveww_impl.this.AV19EmprCod = GXv_char2[0] ;
      tmpreveww_impl.this.AV20EmprNom = GXv_char3[0] ;
      tmpreveww_impl.this.AV82UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      AV110FechaHoy = GXutil.serverDate( context, remoteHandle, pr_default) ;
      GXt_char1 = AV43Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmpreveww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV43Station = GXt_char1 ;
      GXv_char4[0] = AV19EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char2[0] = AV82UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmpreveww_impl.this.AV19EmprCod = GXv_char4[0] ;
      tmpreveww_impl.this.AV20EmprNom = GXv_char3[0] ;
      tmpreveww_impl.this.AV82UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
      Grid_group_Gridinternalname = subGrid_Internalname ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "GridInternalName", Grid_group_Gridinternalname);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Combo_maqcod_Titlecontrolidtoreplace = edtavMaqcod_Internalname ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "TitleControlIdToReplace", Combo_maqcod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      if ( GXutil.strcmp(AV29HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento Preventivo", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV37OrderedBy < 1 )
      {
         AV37OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV16DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV16DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e30RB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV83WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV83WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV32ManageFiltersExecutionStep == 1 )
      {
         AV32ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ManageFiltersExecutionStep", GXutil.str( AV32ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV32ManageFiltersExecutionStep == 2 )
      {
         AV32ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ManageFiltersExecutionStep", GXutil.str( AV32ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV42Session.getValue("MantenimientoMaquina.TMPreveWWColumnsSelector"), "") != 0 )
      {
         AV7ColumnsSelectorXML = AV42Session.getValue("MantenimientoMaquina.TMPreveWWColumnsSelector") ;
         AV5ColumnsSelector.fromxml(AV7ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      chkavSel.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavSel.getInternalname(), "Visible", GXutil.ltrimstr( chkavSel.getVisible(), 5, 0), !bGXsfl_55_Refreshing);
      edtPMCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMMaqDsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtavMaqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      cmbPMEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPMEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbPMEst.getVisible(), 5, 0), !bGXsfl_55_Refreshing);
      edtPMFchCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMFchCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMFchCre_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMIni_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMIni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMIni_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMUlt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUlt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUlt_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMFin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMFin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMFin_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMUsuCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUsuCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUsuCre_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMDias_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDias_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDias_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMDiasPavi_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMDiasPavi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMDiasPavi_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMUso_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUso_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUso_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtavHoras_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHoras_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHoras_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMUsoMts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMUsoMts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMUsoMts_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtavPmusomts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmusomts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmusomts_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtavCrearorden_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCrearorden_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCrearorden_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMTipoDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTipoDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTipoDsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMOrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMOrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMOrd_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMTie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTie_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMPla_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMPla_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMPla_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPMTxt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV5ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMTxt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPMTxt_Visible), 5, 0), !bGXsfl_55_Refreshing);
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      edtPMMaqDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPMMaqDsc_Internalname, "Columnheaderclass", edtPMMaqDsc_Columnheaderclass, !bGXsfl_55_Refreshing);
      cmbPMEst.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbPMEst.getInternalname(), "Columnheaderclass", cmbPMEst.getColumnHeaderClass(), !bGXsfl_55_Refreshing);
      AV130Grid_GroupCaption = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV130Grid_GroupCaption);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
   }

   public void e16RB2( )
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
         AV40PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV40PageToGo) ;
      }
   }

   public void e17RB2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e18RB2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) )
      {
         if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) || ( GXutil.strcmp(GXutil.trim( GXutil.str( AV37OrderedBy, 4, 0)), Ddo_grid_Selectedvalue_get) != 0 ) )
         {
            AV131GroupBy = ((GXutil.strcmp(AV131GroupBy, Ddo_grid_Selectedtext_get)==0) ? "" : Ddo_grid_Selectedtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV131GroupBy", AV131GroupBy);
         }
         AV37OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
         AV39OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0)||(GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>")==0)&&(GXutil.strcmp("", AV131GroupBy)==0)&&AV39OrderedDsc ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39OrderedDsc", AV39OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMCod") == 0 )
         {
            AV44TFPMCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPMCod), 8, 0));
            AV45TFPMCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDsc") == 0 )
         {
            AV48TFPMDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPMDsc", AV48TFPMDsc);
            AV49TFPMDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPMDsc_Sel", AV49TFPMDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMMaqCod") == 0 )
         {
            AV58TFPMMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPMMaqCod", AV58TFPMMaqCod);
            AV59TFPMMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPMMaqCod_Sel", AV59TFPMMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMMaqDsc") == 0 )
         {
            AV60TFPMMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFPMMaqDsc", AV60TFPMMaqDsc);
            AV61TFPMMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPMMaqDsc_Sel", AV61TFPMMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMEst") == 0 )
         {
            AV51TFPMEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPMEst_SelsJson", AV51TFPMEst_SelsJson);
            AV50TFPMEst_Sels.fromJSonString(AV51TFPMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMFchCre") == 0 )
         {
            AV52TFPMFchCre = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPMFchCre", localUtil.format(AV52TFPMFchCre, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMIni") == 0 )
         {
            AV56TFPMIni = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPMIni", localUtil.format(AV56TFPMIni, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMUlt") == 0 )
         {
            AV70TFPMUlt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFPMUlt", localUtil.format(AV70TFPMUlt, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMFin") == 0 )
         {
            AV54TFPMFin = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPMFin", localUtil.format(AV54TFPMFin, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMUsuCre") == 0 )
         {
            AV76TFPMUsuCre = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFPMUsuCre", AV76TFPMUsuCre);
            AV77TFPMUsuCre_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFPMUsuCre_Sel", AV77TFPMUsuCre_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDias") == 0 )
         {
            AV46TFPMDias = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFPMDias), 3, 0));
            AV47TFPMDias_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPMDias_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFPMDias_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDiasPaviso") == 0 )
         {
            AV154TFPMDiasPaviso = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154TFPMDiasPaviso", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154TFPMDiasPaviso), 4, 0));
            AV155TFPMDiasPaviso_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV155TFPMDiasPaviso_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155TFPMDiasPaviso_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMUso") == 0 )
         {
            AV72TFPMUso = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFPMUso", GXutil.ltrimstr( AV72TFPMUso, 8, 2));
            AV73TFPMUso_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFPMUso_To", GXutil.ltrimstr( AV73TFPMUso_To, 8, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMUsoMts") == 0 )
         {
            AV74TFPMUsoMts = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPMUsoMts", GXutil.ltrimstr( AV74TFPMUsoMts, 10, 2));
            AV75TFPMUsoMts_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFPMUsoMts_To", GXutil.ltrimstr( AV75TFPMUsoMts_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMTipoDsc") == 0 )
         {
            AV156TFPMTipoDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV156TFPMTipoDsc", AV156TFPMTipoDsc);
            AV157TFPMTipoDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV157TFPMTipoDsc_Sel", AV157TFPMTipoDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMOrd") == 0 )
         {
            AV62TFPMOrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFPMOrd), 8, 0));
            AV63TFPMOrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPMOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFPMOrd_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMTie") == 0 )
         {
            AV66TFPMTie = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPMTie", GXutil.ltrimstr( AV66TFPMTie, 6, 2));
            AV67TFPMTie_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPMTie_To", GXutil.ltrimstr( AV67TFPMTie_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMPla") == 0 )
         {
            AV64TFPMPla = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPMPla", AV64TFPMPla);
            AV65TFPMPla_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPMPla_Sel", AV65TFPMPla_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMTxt") == 0 )
         {
            AV68TFPMTxt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPMTxt", AV68TFPMTxt);
            AV69TFPMTxt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPMTxt_Sel", AV69TFPMTxt_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPMEst_Sels", AV50TFPMEst_Sels);
   }

   private void e31RB2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV143Fecha1 = GXutil.dadd(A9486PMUlt,+((int)(A9487PMDias))) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFecha1_Internalname, localUtil.format(AV143Fecha1, "99/99/99"));
         AV144Fecha2 = GXutil.dadd(GXutil.today( ),-(7)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavFecha2_Internalname, localUtil.format(AV144Fecha2, "99/99/99"));
         AV145CrearOrden = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavCrearorden_Internalname, GXutil.str( AV145CrearOrden, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCREARORDEN"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9")));
         AV146Horas = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavHoras_Internalname, GXutil.ltrimstr( AV146Horas, 10, 2));
         if ( ( A11454PMUso.doubleValue() > 0 ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) )
         {
            GXt_decimal8 = AV146Horas ;
            GXv_decimal9[0] = GXt_decimal8 ;
            new app.mantenimientomaquina.pmpreprd(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A9486PMUlt, GXv_decimal9) ;
            tmpreveww_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
            AV146Horas = GXt_decimal8 ;
            httpContext.ajax_rsp_assign_attri("", false, edtavHoras_Internalname, GXutil.ltrimstr( AV146Horas, 10, 2));
         }
         if ( ( A13013PMUsoMts.doubleValue() > 0 ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) )
         {
            GXt_decimal8 = AV150PMUsoMts ;
            GXv_decimal9[0] = GXt_decimal8 ;
            new app.mantenimientomaquina.pmpremts(remoteHandle, context).execute( A396EmprCod, A9476PMMaqCod, A9486PMUlt, GXv_decimal9) ;
            tmpreveww_impl.this.GXt_decimal8 = GXv_decimal9[0] ;
            AV150PMUsoMts = GXt_decimal8 ;
            httpContext.ajax_rsp_assign_attri("", false, edtavPmusomts_Internalname, GXutil.ltrimstr( AV150PMUsoMts, 10, 2));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMUSOMTS"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( AV150PMUsoMts, "ZZZZZZ9.99")));
         }
         if ( ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) && (( GXutil.resetTime(A9484PMIni).before( GXutil.resetTime( GXutil.today( ) )) ) || ( GXutil.dateCompare(GXutil.resetTime(A9484PMIni), GXutil.resetTime(GXutil.today( ))) )) && ( (( GXutil.resetTime(A9485PMFin).after( GXutil.resetTime( GXutil.today( ) )) ) || ( GXutil.dateCompare(GXutil.resetTime(A9485PMFin), GXutil.resetTime(GXutil.today( ))) )) || GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A9485PMFin)) ) && (0==A9488PMOrd) && ( ( GXutil.ddiff( GXutil.serverDate( context, remoteHandle, pr_default) , A9486PMUlt ) + A14275PMDiasPavi ) >= A9487PMDias ) || ( ( DecimalUtil.compareTo(AV146Horas, A11454PMUso) >= 0 ) && ( AV146Horas.doubleValue() > 0 ) && ( A11454PMUso.doubleValue() > 0 ) ) || ( ( DecimalUtil.compareTo(AV150PMUsoMts, A13013PMUsoMts) >= 0 ) && ( AV150PMUsoMts.doubleValue() > 0 ) ) )
         {
            AV145CrearOrden = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavCrearorden_Internalname, GXutil.str( AV145CrearOrden, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCREARORDEN"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9")));
         }
         if ( AV145CrearOrden == 1 )
         {
            AV153Sel = "S" ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV153Sel);
         }
         else
         {
            AV153Sel = "N" ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV153Sel);
         }
         AV149Nrg1 = (int)(AV149Nrg1+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV149Nrg1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149Nrg1), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNRG1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV149Nrg1), "ZZZZZ9")));
         if ( GXutil.strcmp(AV131GroupBy, "PMMaqDsc") == 0 )
         {
            AV130Grid_GroupCaption = A9477PMMaqDsc ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV130Grid_GroupCaption);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
            AV130Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Descripcion", ""), AV130Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV130Grid_GroupCaption);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
            AV133GroupKey = GXutil.trim( A9477PMMaqDsc) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133GroupKey", AV133GroupKey);
         }
         else if ( GXutil.strcmp(AV131GroupBy, "PMEst") == 0 )
         {
            if ( GXutil.strcmp(GXutil.trim( A9478PMEst), httpContext.getMessage( "A", "")) == 0 )
            {
               AV130Grid_GroupCaption = httpContext.getMessage( "Activa", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV130Grid_GroupCaption);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
            }
            else if ( GXutil.strcmp(GXutil.trim( A9478PMEst), httpContext.getMessage( "I", "")) == 0 )
            {
               AV130Grid_GroupCaption = httpContext.getMessage( "Inactiva", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV130Grid_GroupCaption);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
            }
            AV130Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Estado", ""), AV130Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV130Grid_GroupCaption);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( AV130Grid_GroupCaption, ""))));
            AV133GroupKey = GXutil.trim( A9478PMEst) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133GroupKey", AV133GroupKey);
         }
         AV137Index = AV136GridCollapsedRecords.indexof(AV133GroupKey) ;
         AV141Expand = ((AV137Index>0) ? "<i class=\"fas fa-angle-right\"></i>" : "<i class=\"fas fa-angle-down\"></i>") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV141Expand);
         edtavExpand_Columnclass = ((AV137Index>0) ? "WWPExpand" : "WWPCollapse") ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", httpContext.getMessage( "DuplicarTarea", ""), (short)(0));
         cmbavGridactions.addItem("5", httpContext.getMessage( "DuplicarTarea n Maq.", ""), (short)(0));
         edtPMMaqDsc_Columnclass = ((AV145CrearOrden==1) ? "WWColumn hidden-xs WWColumnDanger WWColumnDangerSingleCell" : "WWColumn hidden-xs") ;
         if ( GXutil.strcmp(GXutil.trim( A9478PMEst), "A") == 0 )
         {
            cmbPMEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A9478PMEst), "I") == 0 )
         {
            cmbPMEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" );
         }
         else
         {
            cmbPMEst.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
         }
         if ( AV135GridCollapsedRecordsChildren.size() == 0 )
         {
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(55) ;
         }
         sendrow_552( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_55_Refreshing )
      {
         httpContext.doAjaxLoad(55, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV129GridActions, 4, 0)) );
   }

   public void e19RB2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV7ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV5ColumnsSelector.fromJSonString(AV7ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMPreveWWColumnsSelector", ((GXutil.strcmp("", AV7ColumnsSelectorXML)==0) ? "" : AV5ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
   }

   public void e15RB2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMPreveWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV171Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV32ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ManageFiltersExecutionStep", GXutil.str( AV32ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("MantenimientoMaquina.TMPreveWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV32ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ManageFiltersExecutionStep", GXutil.str( AV32ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV33ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "MantenimientoMaquina.TMPreveWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmpreveww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV33ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV33ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV171Pgmname+"GridState", AV33ManageFiltersXml) ;
            AV27GridState.fromxml(AV33ManageFiltersXml, null, null);
            AV37OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
            AV39OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39OrderedDsc", AV39OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            AV131GroupBy = AV27GridState.getgxTv_SdtWWPGridState_Groupby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV131GroupBy", AV131GroupBy);
            AV136GridCollapsedRecords.fromJSonString(AV27GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
            if ( AV136GridCollapsedRecords.size() > 0 )
            {
               AV140AddChildren = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV140AddChildren", AV140AddChildren);
               AV206GXV1 = 1 ;
               while ( AV206GXV1 <= AV136GridCollapsedRecords.size() )
               {
                  AV133GroupKey = (String)AV136GridCollapsedRecords.elementAt(-1+AV206GXV1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV133GroupKey", AV133GroupKey);
                  /* Execute user subroutine: 'ADDREMOVECHILDREN' */
                  S282 ();
                  if (returnInSub) return;
                  AV206GXV1 = (int)(AV206GXV1+1) ;
               }
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPMEst_Sels", AV50TFPMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
   }

   public void e32RB2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV129GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV129GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV129GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV129GridActions == 4 )
      {
         /* Execute user subroutine: 'DO DUPLICARTAREA' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV129GridActions == 5 )
      {
         /* Execute user subroutine: 'DO DUPLICARTAREANMAQ' */
         S242 ();
         if (returnInSub) return;
      }
      AV129GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV129GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
   }

   public void e20RB2( )
   {
      /* Dvelop_confirmpanel_duplicartarea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_duplicartarea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DUPLICARTAREA' */
         S252 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
   }

   public void e23RB2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmpreve", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmpreve", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PMCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e21RB2( )
   {
      /* Dvelop_confirmpanel_generarordenes_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_generarordenes_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION GENERARORDENES' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e22RB2( )
   {
      /* Dvelop_confirmpanel_generarordenesop_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_generarordenesop_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION GENERARORDENESOP' */
         S272 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e24RB2( )
   {
      /* 'DoExcelWin' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.mantenimientomaquina.tmprevewwexportwin(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmpreveww_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      tmpreveww_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
   }

   public void e25RB2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.mantenimientomaquina.tmprevewwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmpreveww_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      tmpreveww_impl.this.AV21ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPMEst_Sels", AV50TFPMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
   }

   public void e26RB2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.mantenimientomaquina.tmprevewwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPMEst_Sels", AV50TFPMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
   }

   public void e27RB2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.mantenimientomaquina.tmprevewwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV50TFPMEst_Sels", AV50TFPMEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
   }

   public void e33RB2( )
   {
      /* Expand_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV131GroupBy, "PMMaqDsc") == 0 )
      {
         AV133GroupKey = GXutil.trim( A9477PMMaqDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133GroupKey", AV133GroupKey);
      }
      else if ( GXutil.strcmp(AV131GroupBy, "PMEst") == 0 )
      {
         AV133GroupKey = GXutil.trim( A9478PMEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133GroupKey", AV133GroupKey);
      }
      AV137Index = AV136GridCollapsedRecords.indexof(AV133GroupKey) ;
      if ( AV137Index > 0 )
      {
         AV136GridCollapsedRecords.removeItem((int)(AV137Index));
      }
      else
      {
         AV136GridCollapsedRecords.add(AV133GroupKey, 0);
      }
      AV140AddChildren = (0==AV137Index) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140AddChildren", AV140AddChildren);
      /* Execute user subroutine: 'ADDREMOVECHILDREN' */
      S282 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV136GridCollapsedRecords", AV136GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135GridCollapsedRecordsChildren", AV135GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV5ColumnsSelector", AV5ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV37OrderedBy, 4, 0))+":"+(AV39OrderedDsc ? "DSC" : "ASC")+((GXutil.strcmp("", AV131GroupBy)==0) ? "" : " GRP") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV5ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&Sel", "", "Op.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMCod", "", "# Ord. Prev.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMDsc", "", "Descripción", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMMaqCod", "", "Maquina", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMMaqDsc", "", "Descripcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&MaqCod", "", "Sel. Máquina", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMEst", "", "Estado", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMFchCre", "Fecha", "Creación", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMIni", "Fecha", "Inicio", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMUlt", "Fecha", "Última", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMFin", "", "Fin", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMUsuCre", "", "Usuario que crea el Preventivo", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMDias", "", "Días", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMDiasPaviso", "", "Días pre-aviso", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMUso", "", "Uso Equipo", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&Horas", "", "Horas", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMUsoMts", "", "Uso Mts.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&PMUsoMts", "", "Mts. hasta Fecha Ult.", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "&CrearOrden", "", "Crear Orden", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMTipoDsc", "", "Descripcion", true, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMOrd", "", "Orden Actual", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMTie", "", "Tiempo", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMPla", "", "Planificar", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV5ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "PMTxt", "", "Texto del Preventivo", false, "") ;
      AV5ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV81UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientoMaquina.TMPreveWWColumnsSelector", GXv_char4) ;
      tmpreveww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV81UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV81UserCustomValue)==0) ) )
      {
         AV6ColumnsSelectorAux.fromxml(AV81UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV6ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV5ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV6ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV5ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV31ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "MantenimientoMaquina.TMPreveWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV31ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV23FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23FilterFullText", AV23FilterFullText);
      AV44TFPMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFPMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPMCod), 8, 0));
      AV45TFPMCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFPMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPMCod_To), 8, 0));
      AV48TFPMDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFPMDsc", AV48TFPMDsc);
      AV49TFPMDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFPMDsc_Sel", AV49TFPMDsc_Sel);
      AV58TFPMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFPMMaqCod", AV58TFPMMaqCod);
      AV59TFPMMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFPMMaqCod_Sel", AV59TFPMMaqCod_Sel);
      AV60TFPMMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFPMMaqDsc", AV60TFPMMaqDsc);
      AV61TFPMMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFPMMaqDsc_Sel", AV61TFPMMaqDsc_Sel);
      AV50TFPMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV52TFPMFchCre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFPMFchCre", localUtil.format(AV52TFPMFchCre, "99/99/99"));
      AV56TFPMIni = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFPMIni", localUtil.format(AV56TFPMIni, "99/99/99"));
      AV70TFPMUlt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFPMUlt", localUtil.format(AV70TFPMUlt, "99/99/99"));
      AV54TFPMFin = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFPMFin", localUtil.format(AV54TFPMFin, "99/99/99"));
      AV76TFPMUsuCre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFPMUsuCre", AV76TFPMUsuCre);
      AV77TFPMUsuCre_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFPMUsuCre_Sel", AV77TFPMUsuCre_Sel);
      AV46TFPMDias = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFPMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFPMDias), 3, 0));
      AV47TFPMDias_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFPMDias_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFPMDias_To), 3, 0));
      AV154TFPMDiasPaviso = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV154TFPMDiasPaviso", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154TFPMDiasPaviso), 4, 0));
      AV155TFPMDiasPaviso_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV155TFPMDiasPaviso_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155TFPMDiasPaviso_To), 4, 0));
      AV72TFPMUso = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFPMUso", GXutil.ltrimstr( AV72TFPMUso, 8, 2));
      AV73TFPMUso_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFPMUso_To", GXutil.ltrimstr( AV73TFPMUso_To, 8, 2));
      AV74TFPMUsoMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFPMUsoMts", GXutil.ltrimstr( AV74TFPMUsoMts, 10, 2));
      AV75TFPMUsoMts_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFPMUsoMts_To", GXutil.ltrimstr( AV75TFPMUsoMts_To, 10, 2));
      AV156TFPMTipoDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV156TFPMTipoDsc", AV156TFPMTipoDsc);
      AV157TFPMTipoDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV157TFPMTipoDsc_Sel", AV157TFPMTipoDsc_Sel);
      AV62TFPMOrd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFPMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFPMOrd), 8, 0));
      AV63TFPMOrd_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFPMOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFPMOrd_To), 8, 0));
      AV66TFPMTie = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFPMTie", GXutil.ltrimstr( AV66TFPMTie, 6, 2));
      AV67TFPMTie_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFPMTie_To", GXutil.ltrimstr( AV67TFPMTie_To, 6, 2));
      AV64TFPMPla = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFPMPla", AV64TFPMPla);
      AV65TFPMPla_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFPMPla_Sel", AV65TFPMPla_Sel);
      AV68TFPMTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFPMTxt", AV68TFPMTxt);
      AV69TFPMTxt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFPMTxt_Sel", AV69TFPMTxt_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV136GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV135GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
   }

   public void S202( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmpreve", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9429PMCod,8,0))}, new String[] {"Mode","EmprCod","PMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.mantenimientomaquina.tmpreveview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9429PMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PMCod","TabCode"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S212( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmpreve", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9429PMCod,8,0))}, new String[] {"Mode","EmprCod","PMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.mantenimientomaquina.tmpreve", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9429PMCod,8,0))}, new String[] {"Mode","EmprCod","PMCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S232( )
   {
      /* 'DO DUPLICARTAREA' Routine */
      returnInSub = false ;
      AV85EmprCod_Selected = A396EmprCod ;
      AV86PMCod_Selected = A9429PMCod ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DUPLICARTAREAContainer", "Confirm", "", new Object[] {});
   }

   public void S252( )
   {
      /* 'DO ACTION DUPLICARTAREA' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = AV34MaqCod ;
      GXv_int14[0] = AV36Ok ;
      new app.peximaq(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int14) ;
      tmpreveww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmpreveww_impl.this.AV34MaqCod = GXv_char3[0] ;
      tmpreveww_impl.this.AV36Ok = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavMaqcod_Internalname, AV34MaqCod);
      if ( (0==AV36Ok) || (GXutil.strcmp("", AV34MaqCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Para duplicar una tarea, se requiere que se seleccione la Maquina en la grilla", ""));
         GX_FocusControl = edtavMaqcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV35mensaje = httpContext.getMessage( "Selecciono la Orden ", "") + GXutil.str( A9429PMCod, 8, 0) + GXutil.newLine( ) ;
         AV35mensaje += httpContext.getMessage( "Desea crear una nueva Orden para la Maquina ", "") + AV34MaqCod + "?" ;
         GXt_boolean15 = AV84Confirmado ;
         httpContext.wjLoc = formatLink("app.mensajeconfirmarduplicartarea", new String[] {GXutil.URLEncode(GXutil.rtrim(AV35mensaje)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9429PMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV34MaqCod)),GXutil.URLEncode(GXutil.booltostr(GXt_boolean15))}, new String[] {"Mensaje","EmprCod","PmcodIn","Maqcod","Confirmado"})  ;
         AV84Confirmado = GXt_boolean15 ;
         gxgrgrid_refresh( subGrid_Rows, AV32ManageFiltersExecutionStep, AV5ColumnsSelector, AV23FilterFullText, AV44TFPMCod, AV45TFPMCod_To, AV48TFPMDsc, AV49TFPMDsc_Sel, AV58TFPMMaqCod, AV59TFPMMaqCod_Sel, AV60TFPMMaqDsc, AV61TFPMMaqDsc_Sel, AV50TFPMEst_Sels, AV52TFPMFchCre, AV56TFPMIni, AV70TFPMUlt, AV54TFPMFin, AV76TFPMUsuCre, AV77TFPMUsuCre_Sel, AV46TFPMDias, AV47TFPMDias_To, AV154TFPMDiasPaviso, AV155TFPMDiasPaviso_To, AV72TFPMUso, AV73TFPMUso_To, AV74TFPMUsoMts, AV75TFPMUsoMts_To, AV156TFPMTipoDsc, AV157TFPMTipoDsc_Sel, AV62TFPMOrd, AV63TFPMOrd_To, AV66TFPMTie, AV67TFPMTie_To, AV64TFPMPla, AV65TFPMPla_Sel, AV68TFPMTxt, AV69TFPMTxt_Sel, AV171Pgmname, AV37OrderedBy, AV39OrderedDsc, AV131GroupBy, AV136GridCollapsedRecords, AV150PMUsoMts, AV149Nrg1, AV130Grid_GroupCaption, AV133GroupKey, AV135GridCollapsedRecordsChildren, AV19EmprCod) ;
      }
   }

   public void S242( )
   {
      /* 'DO DUPLICARTAREANMAQ' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.mantenimientomaquina.tmprevecopiarnmaquinas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV19EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9429PMCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A9473PMDsc))}, new String[] {"EmprCod","PMCod","PMDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S262( )
   {
      /* 'DO ACTION GENERARORDENES' Routine */
      returnInSub = false ;
      GXt_int16 = AV152Existepswpsb ;
      GXv_int14[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, "PSPREV", GXv_int14) ;
      tmpreveww_impl.this.GXt_int16 = GXv_int14[0] ;
      AV152Existepswpsb = GXt_int16 ;
      if ( AV152Existepswpsb == 1 )
      {
         GXt_char1 = AV151CCVPSW ;
         GXv_char4[0] = AV19EmprCod ;
         GXv_char3[0] = "PSPREV" ;
         GXv_char2[0] = GXt_char1 ;
         new app.pexidsc2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tmpreveww_impl.this.AV19EmprCod = GXv_char4[0] ;
         tmpreveww_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
         AV151CCVPSW = GXt_char1 ;
         AV105WebSession.setValue("ValidarWebPwdGrl", AV151CCVPSW);
         /* Window Datatype Object Property */
         AV106Window.setUrl( formatLink("app.webpwdgrl", new String[] {GXutil.URLEncode(GXutil.rtrim(AV171Pgmname))}, new String[] {"ObjetoLlamador"})  );
         AV106Window.setReturnParms(new Object[] {});
         httpContext.newWindow(AV106Window);
      }
      else
      {
         new app.mantenimientomaquina.pmpregen(remoteHandle, context).execute( ) ;
      }
   }

   public void S272( )
   {
      /* 'DO ACTION GENERARORDENESOP' Routine */
      returnInSub = false ;
      GXt_int16 = AV152Existepswpsb ;
      GXv_int14[0] = GXt_int16 ;
      new app.pexicon(remoteHandle, context).execute( AV19EmprCod, "PSPREV", GXv_int14) ;
      tmpreveww_impl.this.GXt_int16 = GXv_int14[0] ;
      AV152Existepswpsb = GXt_int16 ;
      if ( AV152Existepswpsb == 1 )
      {
         GXt_char1 = AV151CCVPSW ;
         GXv_char4[0] = AV19EmprCod ;
         GXv_char3[0] = "PSPREV" ;
         GXv_char2[0] = GXt_char1 ;
         new app.pexidsc2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tmpreveww_impl.this.AV19EmprCod = GXv_char4[0] ;
         tmpreveww_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19EmprCod", AV19EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19EmprCod, "@!"))));
         AV151CCVPSW = GXt_char1 ;
         AV105WebSession.setValue("ValidarWebPwdGrl", AV151CCVPSW);
         /* Window Datatype Object Property */
         AV106Window.setUrl( formatLink("app.webpwdgrl", new String[] {GXutil.URLEncode(GXutil.rtrim(AV171Pgmname))}, new String[] {"ObjetoLlamador"})  );
         AV106Window.setReturnParms(new Object[] {});
         httpContext.newWindow(AV106Window);
      }
      else
      {
         /* Start For Each Line */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_55_fel_idx = 0 ;
         while ( nGXsfl_55_fel_idx < nRC_GXsfl_55 )
         {
            nGXsfl_55_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_fel_idx+1) ;
            sGXsfl_55_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_552( ) ;
            AV141Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
            AV130Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV129GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            AV153Sel = ((GXutil.strcmp(httpContext.cgiGet( chkavSel.getInternalname()), "S")==0) ? "S" : "N") ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            A9429PMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9473PMDsc = httpContext.cgiGet( edtPMDsc_Internalname) ;
            n9473PMDsc = false ;
            A9476PMMaqCod = httpContext.cgiGet( edtPMMaqCod_Internalname) ;
            n9476PMMaqCod = false ;
            A9477PMMaqDsc = httpContext.cgiGet( edtPMMaqDsc_Internalname) ;
            n9477PMMaqDsc = false ;
            AV34MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
            cmbPMEst.setName( cmbPMEst.getInternalname() );
            cmbPMEst.setValue( httpContext.cgiGet( cmbPMEst.getInternalname()) );
            A9478PMEst = httpContext.cgiGet( cmbPMEst.getInternalname()) ;
            n9478PMEst = false ;
            A9474PMFchCre = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMFchCre_Internalname), 0)) ;
            n9474PMFchCre = false ;
            A9484PMIni = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMIni_Internalname), 0)) ;
            n9484PMIni = false ;
            A9486PMUlt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMUlt_Internalname), 0)) ;
            n9486PMUlt = false ;
            A9485PMFin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMFin_Internalname), 0)) ;
            n9485PMFin = false ;
            A9475PMUsuCre = GXutil.upper( httpContext.cgiGet( edtPMUsuCre_Internalname)) ;
            n9475PMUsuCre = false ;
            A9487PMDias = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDias_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9487PMDias = false ;
            A14275PMDiasPavi = (short)(localUtil.ctol( httpContext.cgiGet( edtPMDiasPavi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n14275PMDiasPavi = false ;
            A11454PMUso = localUtil.ctond( httpContext.cgiGet( edtPMUso_Internalname)) ;
            n11454PMUso = false ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHoras_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHoras_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHORAS");
               GX_FocusControl = edtavHoras_Internalname ;
               wbErr = true ;
               AV146Horas = DecimalUtil.ZERO ;
            }
            else
            {
               AV146Horas = localUtil.ctond( httpContext.cgiGet( edtavHoras_Internalname)) ;
            }
            A13013PMUsoMts = localUtil.ctond( httpContext.cgiGet( edtPMUsoMts_Internalname)) ;
            n13013PMUsoMts = false ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmusomts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmusomts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMUSOMTS");
               GX_FocusControl = edtavPmusomts_Internalname ;
               wbErr = true ;
               AV150PMUsoMts = DecimalUtil.ZERO ;
            }
            else
            {
               AV150PMUsoMts = localUtil.ctond( httpContext.cgiGet( edtavPmusomts_Internalname)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCrearorden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCrearorden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCREARORDEN");
               GX_FocusControl = edtavCrearorden_Internalname ;
               wbErr = true ;
               AV145CrearOrden = (byte)(0) ;
            }
            else
            {
               AV145CrearOrden = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCrearorden_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            A14272PMTipoDsc = httpContext.cgiGet( edtPMTipoDsc_Internalname) ;
            A9488PMOrd = (int)(localUtil.ctol( httpContext.cgiGet( edtPMOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9488PMOrd = false ;
            A11455PMTie = localUtil.ctond( httpContext.cgiGet( edtPMTie_Internalname)) ;
            A11456PMPla = httpContext.cgiGet( edtPMPla_Internalname) ;
            A9483PMTxt = httpContext.cgiGet( edtPMTxt_Internalname) ;
            n9483PMTxt = false ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecha1_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA1");
               GX_FocusControl = edtavFecha1_Internalname ;
               wbErr = true ;
               AV143Fecha1 = GXutil.nullDate() ;
            }
            else
            {
               AV143Fecha1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha1_Internalname), 0)) ;
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavFecha2_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA2");
               GX_FocusControl = edtavFecha2_Internalname ;
               wbErr = true ;
               AV144Fecha2 = GXutil.nullDate() ;
            }
            else
            {
               AV144Fecha2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavFecha2_Internalname), 0)) ;
            }
            if ( GXutil.strcmp(AV153Sel, "S") == 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_int17[0] = A9429PMCod ;
               new app.mantenimientomaquina.popmpregen(remoteHandle, context).execute( GXv_char4, GXv_int17) ;
               tmpreveww_impl.this.A396EmprCod = GXv_char4[0] ;
               tmpreveww_impl.this.A9429PMCod = GXv_int17[0] ;
            }
            /* End For Each Line */
         }
         if ( nGXsfl_55_fel_idx == 0 )
         {
            nGXsfl_55_idx = 1 ;
            sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_552( ) ;
         }
         nGXsfl_55_fel_idx = 1 ;
      }
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue(AV171Pgmname+"GridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV171Pgmname+"GridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV42Session.getValue(AV171Pgmname+"GridState"), null, null);
      }
      AV37OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37OrderedBy), 4, 0));
      AV131GroupBy = AV27GridState.getgxTv_SdtWWPGridState_Groupby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV131GroupBy", AV131GroupBy);
      AV39OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39OrderedDsc", AV39OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV27GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV27GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV27GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
      AV136GridCollapsedRecords.fromJSonString(AV27GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
      if ( AV136GridCollapsedRecords.size() > 0 )
      {
         AV140AddChildren = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV140AddChildren", AV140AddChildren);
         AV210GXV2 = 1 ;
         while ( AV210GXV2 <= AV136GridCollapsedRecords.size() )
         {
            AV133GroupKey = (String)AV136GridCollapsedRecords.elementAt(-1+AV210GXV2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133GroupKey", AV133GroupKey);
            /* Execute user subroutine: 'ADDREMOVECHILDREN' */
            S282 ();
            if (returnInSub) return;
            AV210GXV2 = (int)(AV210GXV2+1) ;
         }
      }
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV211GXV3 = 1 ;
      while ( AV211GXV3 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV211GXV3));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV23FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FilterFullText", AV23FilterFullText);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMCOD") == 0 )
         {
            AV44TFPMCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPMCod), 8, 0));
            AV45TFPMCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPMCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPMCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC") == 0 )
         {
            AV48TFPMDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPMDsc", AV48TFPMDsc);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDSC_SEL") == 0 )
         {
            AV49TFPMDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPMDsc_Sel", AV49TFPMDsc_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD") == 0 )
         {
            AV58TFPMMaqCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPMMaqCod", AV58TFPMMaqCod);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQCOD_SEL") == 0 )
         {
            AV59TFPMMaqCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPMMaqCod_Sel", AV59TFPMMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC") == 0 )
         {
            AV60TFPMMaqDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFPMMaqDsc", AV60TFPMMaqDsc);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMMAQDSC_SEL") == 0 )
         {
            AV61TFPMMaqDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPMMaqDsc_Sel", AV61TFPMMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMEST_SEL") == 0 )
         {
            AV51TFPMEst_SelsJson = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPMEst_SelsJson", AV51TFPMEst_SelsJson);
            AV50TFPMEst_Sels.fromJSonString(AV51TFPMEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFCHCRE") == 0 )
         {
            AV52TFPMFchCre = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPMFchCre", localUtil.format(AV52TFPMFchCre, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMINI") == 0 )
         {
            AV56TFPMIni = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPMIni", localUtil.format(AV56TFPMIni, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMULT") == 0 )
         {
            AV70TFPMUlt = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFPMUlt", localUtil.format(AV70TFPMUlt, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMFIN") == 0 )
         {
            AV54TFPMFin = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPMFin", localUtil.format(AV54TFPMFin, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE") == 0 )
         {
            AV76TFPMUsuCre = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFPMUsuCre", AV76TFPMUsuCre);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSUCRE_SEL") == 0 )
         {
            AV77TFPMUsuCre_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFPMUsuCre_Sel", AV77TFPMUsuCre_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIAS") == 0 )
         {
            AV46TFPMDias = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPMDias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFPMDias), 3, 0));
            AV47TFPMDias_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPMDias_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFPMDias_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDIASPAVISO") == 0 )
         {
            AV154TFPMDiasPaviso = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154TFPMDiasPaviso", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154TFPMDiasPaviso), 4, 0));
            AV155TFPMDiasPaviso_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV155TFPMDiasPaviso_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155TFPMDiasPaviso_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSO") == 0 )
         {
            AV72TFPMUso = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFPMUso", GXutil.ltrimstr( AV72TFPMUso, 8, 2));
            AV73TFPMUso_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFPMUso_To", GXutil.ltrimstr( AV73TFPMUso_To, 8, 2));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMUSOMTS") == 0 )
         {
            AV74TFPMUsoMts = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPMUsoMts", GXutil.ltrimstr( AV74TFPMUsoMts, 10, 2));
            AV75TFPMUsoMts_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFPMUsoMts_To", GXutil.ltrimstr( AV75TFPMUsoMts_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC") == 0 )
         {
            AV156TFPMTipoDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV156TFPMTipoDsc", AV156TFPMTipoDsc);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIPODSC_SEL") == 0 )
         {
            AV157TFPMTipoDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV157TFPMTipoDsc_Sel", AV157TFPMTipoDsc_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMORD") == 0 )
         {
            AV62TFPMOrd = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPMOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFPMOrd), 8, 0));
            AV63TFPMOrd_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFPMOrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFPMOrd_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTIE") == 0 )
         {
            AV66TFPMTie = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPMTie", GXutil.ltrimstr( AV66TFPMTie, 6, 2));
            AV67TFPMTie_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPMTie_To", GXutil.ltrimstr( AV67TFPMTie_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA") == 0 )
         {
            AV64TFPMPla = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPMPla", AV64TFPMPla);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMPLA_SEL") == 0 )
         {
            AV65TFPMPla_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPMPla_Sel", AV65TFPMPla_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT") == 0 )
         {
            AV68TFPMTxt = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPMTxt", AV68TFPMTxt);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMTXT_SEL") == 0 )
         {
            AV69TFPMTxt_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFPMTxt_Sel", AV69TFPMTxt_Sel);
         }
         AV211GXV3 = (int)(AV211GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFPMDsc_Sel)==0), AV49TFPMDsc_Sel, GXv_char4) ;
      tmpreveww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFPMMaqCod_Sel)==0), AV59TFPMMaqCod_Sel, GXv_char3) ;
      tmpreveww_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char19 = "" ;
      GXv_char2[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFPMMaqDsc_Sel)==0), AV61TFPMMaqDsc_Sel, GXv_char2) ;
      tmpreveww_impl.this.GXt_char19 = GXv_char2[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV50TFPMEst_Sels.size()==0), AV51TFPMEst_SelsJson, GXv_char21) ;
      tmpreveww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFPMUsuCre_Sel)==0), AV77TFPMUsuCre_Sel, GXv_char23) ;
      tmpreveww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV157TFPMTipoDsc_Sel)==0), AV157TFPMTipoDsc_Sel, GXv_char25) ;
      tmpreveww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPMPla_Sel)==0), AV65TFPMPla_Sel, GXv_char27) ;
      tmpreveww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFPMTxt_Sel)==0), AV69TFPMTxt_Sel, GXv_char29) ;
      tmpreveww_impl.this.GXt_char28 = GXv_char29[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char18+"|"+GXt_char19+"||"+GXt_char20+"|||||"+GXt_char22+"||||||||"+GXt_char24+"|||"+GXt_char26+"|"+GXt_char28 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFPMDsc)==0), AV48TFPMDsc, GXv_char29) ;
      tmpreveww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFPMMaqCod)==0), AV58TFPMMaqCod, GXv_char27) ;
      tmpreveww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFPMMaqDsc)==0), AV60TFPMMaqDsc, GXv_char25) ;
      tmpreveww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFPMUsuCre)==0), AV76TFPMUsuCre, GXv_char23) ;
      tmpreveww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV156TFPMTipoDsc)==0), AV156TFPMTipoDsc, GXv_char21) ;
      tmpreveww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFPMPla)==0), AV64TFPMPla, GXv_char4) ;
      tmpreveww_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFPMTxt)==0), AV68TFPMTxt, GXv_char3) ;
      tmpreveww_impl.this.GXt_char18 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV44TFPMCod) ? "" : GXutil.str( AV44TFPMCod, 8, 0))+"|"+GXt_char28+"|"+GXt_char26+"|"+GXt_char24+"|||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFPMFchCre)) ? "" : localUtil.dtoc( AV52TFPMFchCre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFPMIni)) ? "" : localUtil.dtoc( AV56TFPMIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70TFPMUlt)) ? "" : localUtil.dtoc( AV70TFPMUlt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFPMFin)) ? "" : localUtil.dtoc( AV54TFPMFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char22+"|"+((0==AV46TFPMDias) ? "" : GXutil.str( AV46TFPMDias, 3, 0))+"|"+((0==AV154TFPMDiasPaviso) ? "" : GXutil.str( AV154TFPMDiasPaviso, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFPMUso)==0) ? "" : GXutil.str( AV72TFPMUso, 8, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFPMUsoMts)==0) ? "" : GXutil.str( AV74TFPMUsoMts, 10, 2))+"|||"+GXt_char20+"|"+((0==AV62TFPMOrd) ? "" : GXutil.str( AV62TFPMOrd, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPMTie)==0) ? "" : GXutil.str( AV66TFPMTie, 6, 2))+"|"+GXt_char19+"|"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV45TFPMCod_To) ? "" : GXutil.str( AV45TFPMCod_To, 8, 0))+"|||||||||||"+((0==AV47TFPMDias_To) ? "" : GXutil.str( AV47TFPMDias_To, 3, 0))+"|"+((0==AV155TFPMDiasPaviso_To) ? "" : GXutil.str( AV155TFPMDiasPaviso_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFPMUso_To)==0) ? "" : GXutil.str( AV73TFPMUso_To, 8, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFPMUsoMts_To)==0) ? "" : GXutil.str( AV75TFPMUsoMts_To, 10, 2))+"||||"+((0==AV63TFPMOrd_To) ? "" : GXutil.str( AV63TFPMOrd_To, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPMTie_To)==0) ? "" : GXutil.str( AV67TFPMTie_To, 6, 2))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV27GridState.fromxml(AV42Session.getValue(AV171Pgmname+"GridState"), null, null);
      AV138OldGridState.fromxml(AV27GridState.toxml(false, true, "WWPGridState", "TexplusNET"), null, null);
      AV27GridState.setgxTv_SdtWWPGridState_Orderedby( AV37OrderedBy );
      AV27GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV39OrderedDsc );
      AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV23FilterFullText)==0), (short)(0), AV23FilterFullText, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMCOD", "", !((0==AV44TFPMCod)&&(0==AV45TFPMCod_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFPMCod, 8, 0)), GXutil.trim( GXutil.str( AV45TFPMCod_To, 8, 0))) ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMDSC", "", !(GXutil.strcmp("", AV48TFPMDsc)==0), (short)(0), AV48TFPMDsc, "", !(GXutil.strcmp("", AV49TFPMDsc_Sel)==0), AV49TFPMDsc_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMMAQCOD", "", !(GXutil.strcmp("", AV58TFPMMaqCod)==0), (short)(0), AV58TFPMMaqCod, "", !(GXutil.strcmp("", AV59TFPMMaqCod_Sel)==0), AV59TFPMMaqCod_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMMAQDSC", "", !(GXutil.strcmp("", AV60TFPMMaqDsc)==0), (short)(0), AV60TFPMMaqDsc, "", !(GXutil.strcmp("", AV61TFPMMaqDsc_Sel)==0), AV61TFPMMaqDsc_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMEST_SEL", "", !(AV50TFPMEst_Sels.size()==0), (short)(0), AV50TFPMEst_Sels.toJSonString(false), "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMFCHCRE", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52TFPMFchCre)), (short)(0), GXutil.trim( localUtil.dtoc( AV52TFPMFchCre, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMINI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFPMIni)), (short)(0), GXutil.trim( localUtil.dtoc( AV56TFPMIni, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMULT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70TFPMUlt)), (short)(0), GXutil.trim( localUtil.dtoc( AV70TFPMUlt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMFIN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV54TFPMFin)), (short)(0), GXutil.trim( localUtil.dtoc( AV54TFPMFin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMUSUCRE", "", !(GXutil.strcmp("", AV76TFPMUsuCre)==0), (short)(0), AV76TFPMUsuCre, "", !(GXutil.strcmp("", AV77TFPMUsuCre_Sel)==0), AV77TFPMUsuCre_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMDIAS", "", !((0==AV46TFPMDias)&&(0==AV47TFPMDias_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFPMDias, 3, 0)), GXutil.trim( GXutil.str( AV47TFPMDias_To, 3, 0))) ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMDIASPAVISO", "", !((0==AV154TFPMDiasPaviso)&&(0==AV155TFPMDiasPaviso_To)), (short)(0), GXutil.trim( GXutil.str( AV154TFPMDiasPaviso, 4, 0)), GXutil.trim( GXutil.str( AV155TFPMDiasPaviso_To, 4, 0))) ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMUSO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFPMUso)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFPMUso_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV72TFPMUso, 8, 2)), GXutil.trim( GXutil.str( AV73TFPMUso_To, 8, 2))) ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMUSOMTS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFPMUsoMts)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFPMUsoMts_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV74TFPMUsoMts, 10, 2)), GXutil.trim( GXutil.str( AV75TFPMUsoMts_To, 10, 2))) ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMTIPODSC", "", !(GXutil.strcmp("", AV156TFPMTipoDsc)==0), (short)(0), AV156TFPMTipoDsc, "", !(GXutil.strcmp("", AV157TFPMTipoDsc_Sel)==0), AV157TFPMTipoDsc_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMORD", "", !((0==AV62TFPMOrd)&&(0==AV63TFPMOrd_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFPMOrd, 8, 0)), GXutil.trim( GXutil.str( AV63TFPMOrd_To, 8, 0))) ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMTIE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPMTie)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPMTie_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFPMTie, 6, 2)), GXutil.trim( GXutil.str( AV67TFPMTie_To, 6, 2))) ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMPLA", "", !(GXutil.strcmp("", AV64TFPMPla)==0), (short)(0), AV64TFPMPla, "", !(GXutil.strcmp("", AV65TFPMPla_Sel)==0), AV65TFPMPla_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFPMTXT", "", !(GXutil.strcmp("", AV68TFPMTxt)==0), (short)(0), AV68TFPMTxt, "", !(GXutil.strcmp("", AV69TFPMTxt_Sel)==0), AV69TFPMTxt_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState30[0] ;
      AV27GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV27GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      AV27GridState.setgxTv_SdtWWPGridState_Groupby( AV131GroupBy );
      if ( ! (GXutil.strcmp("", AV131GroupBy)==0) && ! ( ( ( AV37OrderedBy == 4 ) && ( GXutil.strcmp(AV131GroupBy, "PMMaqDsc") == 0 ) ) || ( ( AV37OrderedBy == 5 ) && ( GXutil.strcmp(AV131GroupBy, "PMEst") == 0 ) ) ) )
      {
         AV131GroupBy = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV131GroupBy", AV131GroupBy);
      }
      Grid_group_Columnindex = ((GXutil.strcmp("", AV131GroupBy)==0) ? -1 : 1) ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "ColumnIndex", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid_group_Columnindex), 9, 0));
      if ( (GXutil.strcmp("", AV131GroupBy)==0) || new app.wwpbaseobjects.wwp_resetcollapsedrecords(remoteHandle, context).executeUdp( AV138OldGridState, AV27GridState) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV136GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
         AV135GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
      }
      AV27GridState.setgxTv_SdtWWPGridState_Collapsedrecords( AV136GridCollapsedRecords.toJSonString(false) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV171Pgmname+"GridState", AV27GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV78TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV78TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV171Pgmname );
      AV78TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV78TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV29HTTPRequest.getScriptName()+"?"+AV29HTTPRequest.getQuerystring() );
      AV78TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoMaquina.TMPreve" );
      AV42Session.setValue("TrnContext", AV78TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S282( )
   {
      /* 'ADDREMOVECHILDREN' Routine */
      returnInSub = false ;
      AV139DiscardFirst = true ;
      AV142GroupPMMaqDsc = AV133GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142GroupPMMaqDsc", AV142GroupPMMaqDsc);
      AV134GroupPMEst = AV133GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV134GroupPMEst", AV134GroupPMEst);
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = AV23FilterFullText ;
      AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod = AV44TFPMCod ;
      AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to = AV45TFPMCod_To ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = AV48TFPMDsc ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = AV49TFPMDsc_Sel ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = AV58TFPMMaqCod ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = AV59TFPMMaqCod_Sel ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = AV60TFPMMaqDsc ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = AV61TFPMMaqDsc_Sel ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = AV50TFPMEst_Sels ;
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = AV52TFPMFchCre ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = AV56TFPMIni ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = AV70TFPMUlt ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = AV54TFPMFin ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = AV76TFPMUsuCre ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = AV77TFPMUsuCre_Sel ;
      AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias = AV46TFPMDias ;
      AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to = AV47TFPMDias_To ;
      AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso = AV154TFPMDiasPaviso ;
      AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to = AV155TFPMDiasPaviso_To ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = AV72TFPMUso ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = AV73TFPMUso_To ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = AV74TFPMUsoMts ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = AV75TFPMUsoMts_To ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = AV156TFPMTipoDsc ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = AV157TFPMTipoDsc_Sel ;
      AV198Mantenimientomaquina_tmprevewwds_27_tfpmord = AV62TFPMOrd ;
      AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to = AV63TFPMOrd_To ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = AV66TFPMTie ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = AV67TFPMTie_To ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = AV64TFPMPla ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = AV65TFPMPla_Sel ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = AV68TFPMTxt ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = AV69TFPMTxt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9478PMEst ,
                                           AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                           Integer.valueOf(AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod) ,
                                           Integer.valueOf(AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) ,
                                           AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                           AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                           AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                           AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                           AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                           AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                           Integer.valueOf(AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels.size()) ,
                                           AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                           AV183Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                           AV184Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                           AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                           AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                           AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                           Short.valueOf(AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias) ,
                                           Short.valueOf(AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) ,
                                           Short.valueOf(AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) ,
                                           Short.valueOf(AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) ,
                                           AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                           AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                           AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                           AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                           AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                           AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                           Integer.valueOf(AV198Mantenimientomaquina_tmprevewwds_27_tfpmord) ,
                                           Integer.valueOf(AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to) ,
                                           AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                           AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                           AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                           AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                           AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                           AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                           AV131GroupBy ,
                                           Integer.valueOf(A9429PMCod) ,
                                           A9473PMDsc ,
                                           A9476PMMaqCod ,
                                           A9477PMMaqDsc ,
                                           A9474PMFchCre ,
                                           A9484PMIni ,
                                           A9486PMUlt ,
                                           A9485PMFin ,
                                           A9475PMUsuCre ,
                                           Short.valueOf(A9487PMDias) ,
                                           Short.valueOf(A14275PMDiasPavi) ,
                                           A11454PMUso ,
                                           A13013PMUsoMts ,
                                           A14272PMTipoDsc ,
                                           Integer.valueOf(A9488PMOrd) ,
                                           A11455PMTie ,
                                           A11456PMPla ,
                                           A9483PMTxt ,
                                           AV142GroupPMMaqDsc ,
                                           AV134GroupPMEst ,
                                           AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = GXutil.padr( GXutil.rtrim( AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc), 30, "%") ;
      lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = GXutil.padr( GXutil.rtrim( AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod), 6, "%") ;
      lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = GXutil.padr( GXutil.rtrim( AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc), 16, "%") ;
      lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = GXutil.padr( GXutil.rtrim( AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre), 8, "%") ;
      lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = GXutil.padr( GXutil.rtrim( AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc), 30, "%") ;
      lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = GXutil.padr( GXutil.rtrim( AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla), 1, "%") ;
      lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = GXutil.concat( GXutil.rtrim( AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt), "%", "") ;
      /* Using cursor H00RB4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod), Integer.valueOf(AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to), lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc, AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel, lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod, AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel, lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc, AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel, AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre, AV183Mantenimientomaquina_tmprevewwds_12_tfpmini, AV184Mantenimientomaquina_tmprevewwds_13_tfpmult, AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin, lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre, AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel, Short.valueOf(AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias), Short.valueOf(AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to), Short.valueOf(AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso), Short.valueOf(AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to), AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso, AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to, AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts, AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to, lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc, AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel, Integer.valueOf(AV198Mantenimientomaquina_tmprevewwds_27_tfpmord), Integer.valueOf(AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to), AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie, AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to, lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla, AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel, lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt, AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel, AV142GroupPMMaqDsc, AV134GroupPMEst});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14271PMTipoID = H00RB4_A14271PMTipoID[0] ;
         A9483PMTxt = H00RB4_A9483PMTxt[0] ;
         n9483PMTxt = H00RB4_n9483PMTxt[0] ;
         A11456PMPla = H00RB4_A11456PMPla[0] ;
         A11455PMTie = H00RB4_A11455PMTie[0] ;
         A9488PMOrd = H00RB4_A9488PMOrd[0] ;
         n9488PMOrd = H00RB4_n9488PMOrd[0] ;
         A14272PMTipoDsc = H00RB4_A14272PMTipoDsc[0] ;
         A13013PMUsoMts = H00RB4_A13013PMUsoMts[0] ;
         n13013PMUsoMts = H00RB4_n13013PMUsoMts[0] ;
         A11454PMUso = H00RB4_A11454PMUso[0] ;
         n11454PMUso = H00RB4_n11454PMUso[0] ;
         A14275PMDiasPavi = H00RB4_A14275PMDiasPavi[0] ;
         n14275PMDiasPavi = H00RB4_n14275PMDiasPavi[0] ;
         A9487PMDias = H00RB4_A9487PMDias[0] ;
         n9487PMDias = H00RB4_n9487PMDias[0] ;
         A9475PMUsuCre = H00RB4_A9475PMUsuCre[0] ;
         n9475PMUsuCre = H00RB4_n9475PMUsuCre[0] ;
         A9485PMFin = H00RB4_A9485PMFin[0] ;
         n9485PMFin = H00RB4_n9485PMFin[0] ;
         A9486PMUlt = H00RB4_A9486PMUlt[0] ;
         n9486PMUlt = H00RB4_n9486PMUlt[0] ;
         A9484PMIni = H00RB4_A9484PMIni[0] ;
         n9484PMIni = H00RB4_n9484PMIni[0] ;
         A9474PMFchCre = H00RB4_A9474PMFchCre[0] ;
         n9474PMFchCre = H00RB4_n9474PMFchCre[0] ;
         A9477PMMaqDsc = H00RB4_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = H00RB4_n9477PMMaqDsc[0] ;
         A9476PMMaqCod = H00RB4_A9476PMMaqCod[0] ;
         n9476PMMaqCod = H00RB4_n9476PMMaqCod[0] ;
         A9473PMDsc = H00RB4_A9473PMDsc[0] ;
         n9473PMDsc = H00RB4_n9473PMDsc[0] ;
         A9429PMCod = H00RB4_A9429PMCod[0] ;
         A9478PMEst = H00RB4_A9478PMEst[0] ;
         n9478PMEst = H00RB4_n9478PMEst[0] ;
         A396EmprCod = H00RB4_A396EmprCod[0] ;
         A9477PMMaqDsc = H00RB4_A9477PMMaqDsc[0] ;
         n9477PMMaqDsc = H00RB4_n9477PMMaqDsc[0] ;
         A14272PMTipoDsc = H00RB4_A14272PMTipoDsc[0] ;
         if ( (GXutil.strcmp("", AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9429PMCod, 8, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9473PMDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9476PMMaqCod) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9477PMMaqDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "activa", ""), "") , GXutil.padr( "%" + GXutil.lower( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "inactiva", ""), "") , GXutil.padr( "%" + GXutil.lower( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9478PMEst, httpContext.getMessage( "I", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9475PMUsuCre) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9487PMDias, 3, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14275PMDiasPavi, 4, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11454PMUso, 8, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13013PMUsoMts, 10, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14272PMTipoDsc) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9488PMOrd, 8, 0) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11455PMTie, 6, 2) , GXutil.padr( "%" + AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11456PMPla) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9483PMTxt) , GXutil.padr( "%" + GXutil.upper( AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            AV132RecordKey = A396EmprCod + ";" + GXutil.trim( GXutil.str( A9429PMCod, 8, 0)) ;
            AV137Index = AV135GridCollapsedRecordsChildren.indexof(AV132RecordKey) ;
            if ( AV140AddChildren && ( AV137Index == 0 ) )
            {
               if ( ! AV139DiscardFirst )
               {
                  AV135GridCollapsedRecordsChildren.add(AV132RecordKey, 0);
               }
               else
               {
                  AV139DiscardFirst = false ;
               }
            }
            else
            {
               if ( ( ! AV140AddChildren ) && ( AV137Index > 0 ) )
               {
                  AV135GridCollapsedRecordsChildren.removeItem((int)(AV137Index));
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV167MaqCod_Data.clear();
      /* Using cursor H00RB5 */
      pr_default.execute(3, new Object[] {AV19EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H00RB5_A396EmprCod[0] ;
         A606MaqDsc = H00RB5_A606MaqDsc[0] ;
         n606MaqDsc = H00RB5_n606MaqDsc[0] ;
         A602MaqCod = H00RB5_A602MaqCod[0] ;
         AV168Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV168Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV168Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A602MaqCod)+"-"+GXutil.trim( A606MaqDsc) );
         AV167MaqCod_Data.add(AV168Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV167MaqCod_Data.sort("Title");
   }

   public void e28RB2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( ( AV108ObjetoRefrescar.indexof(AV171Pgmname) > 0 ) && AV109Refrescar )
      {
         httpContext.GX_msglist.addItem("autorizado para generar ordenes "+AV171Pgmname);
         new app.mantenimientomaquina.pmpregen(remoteHandle, context).execute( ) ;
      }
      else
      {
         httpContext.GX_msglist.addItem("No autorizado para generar ordenes "+AV171Pgmname);
      }
   }

   public void wb_table4_114_RB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_generarordenesop_Internalname, tblTabledvelop_confirmpanel_generarordenesop_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_generarordenesop.setProperty("Title", Dvelop_confirmpanel_generarordenesop_Title);
         ucDvelop_confirmpanel_generarordenesop.setProperty("ConfirmationText", Dvelop_confirmpanel_generarordenesop_Confirmationtext);
         ucDvelop_confirmpanel_generarordenesop.setProperty("YesButtonCaption", Dvelop_confirmpanel_generarordenesop_Yesbuttoncaption);
         ucDvelop_confirmpanel_generarordenesop.setProperty("NoButtonCaption", Dvelop_confirmpanel_generarordenesop_Nobuttoncaption);
         ucDvelop_confirmpanel_generarordenesop.setProperty("CancelButtonCaption", Dvelop_confirmpanel_generarordenesop_Cancelbuttoncaption);
         ucDvelop_confirmpanel_generarordenesop.setProperty("YesButtonPosition", Dvelop_confirmpanel_generarordenesop_Yesbuttonposition);
         ucDvelop_confirmpanel_generarordenesop.setProperty("ConfirmType", Dvelop_confirmpanel_generarordenesop_Confirmtype);
         ucDvelop_confirmpanel_generarordenesop.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_generarordenesop_Internalname, "DVELOP_CONFIRMPANEL_GENERARORDENESOPContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_GENERARORDENESOPContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_114_RB2e( true) ;
      }
      else
      {
         wb_table4_114_RB2e( false) ;
      }
   }

   public void wb_table3_109_RB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_generarordenes_Internalname, tblTabledvelop_confirmpanel_generarordenes_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_generarordenes.setProperty("Title", Dvelop_confirmpanel_generarordenes_Title);
         ucDvelop_confirmpanel_generarordenes.setProperty("ConfirmationText", Dvelop_confirmpanel_generarordenes_Confirmationtext);
         ucDvelop_confirmpanel_generarordenes.setProperty("YesButtonCaption", Dvelop_confirmpanel_generarordenes_Yesbuttoncaption);
         ucDvelop_confirmpanel_generarordenes.setProperty("NoButtonCaption", Dvelop_confirmpanel_generarordenes_Nobuttoncaption);
         ucDvelop_confirmpanel_generarordenes.setProperty("CancelButtonCaption", Dvelop_confirmpanel_generarordenes_Cancelbuttoncaption);
         ucDvelop_confirmpanel_generarordenes.setProperty("YesButtonPosition", Dvelop_confirmpanel_generarordenes_Yesbuttonposition);
         ucDvelop_confirmpanel_generarordenes.setProperty("ConfirmType", Dvelop_confirmpanel_generarordenes_Confirmtype);
         ucDvelop_confirmpanel_generarordenes.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_generarordenes_Internalname, "DVELOP_CONFIRMPANEL_GENERARORDENESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_GENERARORDENESContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_109_RB2e( true) ;
      }
      else
      {
         wb_table3_109_RB2e( false) ;
      }
   }

   public void wb_table2_104_RB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_duplicartarea_Internalname, tblTabledvelop_confirmpanel_duplicartarea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_duplicartarea.setProperty("Title", Dvelop_confirmpanel_duplicartarea_Title);
         ucDvelop_confirmpanel_duplicartarea.setProperty("ConfirmationText", Dvelop_confirmpanel_duplicartarea_Confirmationtext);
         ucDvelop_confirmpanel_duplicartarea.setProperty("YesButtonCaption", Dvelop_confirmpanel_duplicartarea_Yesbuttoncaption);
         ucDvelop_confirmpanel_duplicartarea.setProperty("NoButtonCaption", Dvelop_confirmpanel_duplicartarea_Nobuttoncaption);
         ucDvelop_confirmpanel_duplicartarea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_duplicartarea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_duplicartarea.setProperty("YesButtonPosition", Dvelop_confirmpanel_duplicartarea_Yesbuttonposition);
         ucDvelop_confirmpanel_duplicartarea.setProperty("ConfirmType", Dvelop_confirmpanel_duplicartarea_Confirmtype);
         ucDvelop_confirmpanel_duplicartarea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_duplicartarea_Internalname, "DVELOP_CONFIRMPANEL_DUPLICARTAREAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DUPLICARTAREAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_104_RB2e( true) ;
      }
      else
      {
         wb_table2_104_RB2e( false) ;
      }
   }

   public void wb_table1_37_RB2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV31ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_42_RB2( true) ;
      }
      else
      {
         wb_table5_42_RB2( false) ;
      }
      return  ;
   }

   public void wb_table5_42_RB2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_37_RB2e( true) ;
      }
      else
      {
         wb_table1_37_RB2e( false) ;
      }
   }

   public void wb_table5_42_RB2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV23FilterFullText, GXutil.rtrim( localUtil.format( AV23FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_MantenimientoMaquina\\TMPreveWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_42_RB2e( true) ;
      }
      else
      {
         wb_table5_42_RB2e( false) ;
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
      paRB2( ) ;
      wsRB2( ) ;
      weRB2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116125657", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmpreveww.js", "?202682116125658", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_552( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_55_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_55_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_idx );
      chkavSel.setInternalname( "vSEL_"+sGXsfl_55_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_55_idx ;
      edtPMCod_Internalname = "PMCOD_"+sGXsfl_55_idx ;
      edtPMDsc_Internalname = "PMDSC_"+sGXsfl_55_idx ;
      edtPMMaqCod_Internalname = "PMMAQCOD_"+sGXsfl_55_idx ;
      edtPMMaqDsc_Internalname = "PMMAQDSC_"+sGXsfl_55_idx ;
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_55_idx ;
      cmbPMEst.setInternalname( "PMEST_"+sGXsfl_55_idx );
      edtPMFchCre_Internalname = "PMFCHCRE_"+sGXsfl_55_idx ;
      edtPMIni_Internalname = "PMINI_"+sGXsfl_55_idx ;
      edtPMUlt_Internalname = "PMULT_"+sGXsfl_55_idx ;
      edtPMFin_Internalname = "PMFIN_"+sGXsfl_55_idx ;
      edtPMUsuCre_Internalname = "PMUSUCRE_"+sGXsfl_55_idx ;
      edtPMDias_Internalname = "PMDIAS_"+sGXsfl_55_idx ;
      edtPMDiasPavi_Internalname = "PMDIASPAVI_"+sGXsfl_55_idx ;
      edtPMUso_Internalname = "PMUSO_"+sGXsfl_55_idx ;
      edtavHoras_Internalname = "vHORAS_"+sGXsfl_55_idx ;
      edtPMUsoMts_Internalname = "PMUSOMTS_"+sGXsfl_55_idx ;
      edtavPmusomts_Internalname = "vPMUSOMTS_"+sGXsfl_55_idx ;
      edtavCrearorden_Internalname = "vCREARORDEN_"+sGXsfl_55_idx ;
      edtPMTipoDsc_Internalname = "PMTIPODSC_"+sGXsfl_55_idx ;
      edtPMOrd_Internalname = "PMORD_"+sGXsfl_55_idx ;
      edtPMTie_Internalname = "PMTIE_"+sGXsfl_55_idx ;
      edtPMPla_Internalname = "PMPLA_"+sGXsfl_55_idx ;
      edtPMTxt_Internalname = "PMTXT_"+sGXsfl_55_idx ;
      edtavFecha1_Internalname = "vFECHA1_"+sGXsfl_55_idx ;
      edtavFecha2_Internalname = "vFECHA2_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_55_fel_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_55_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_fel_idx );
      chkavSel.setInternalname( "vSEL_"+sGXsfl_55_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_55_fel_idx ;
      edtPMCod_Internalname = "PMCOD_"+sGXsfl_55_fel_idx ;
      edtPMDsc_Internalname = "PMDSC_"+sGXsfl_55_fel_idx ;
      edtPMMaqCod_Internalname = "PMMAQCOD_"+sGXsfl_55_fel_idx ;
      edtPMMaqDsc_Internalname = "PMMAQDSC_"+sGXsfl_55_fel_idx ;
      edtavMaqcod_Internalname = "vMAQCOD_"+sGXsfl_55_fel_idx ;
      cmbPMEst.setInternalname( "PMEST_"+sGXsfl_55_fel_idx );
      edtPMFchCre_Internalname = "PMFCHCRE_"+sGXsfl_55_fel_idx ;
      edtPMIni_Internalname = "PMINI_"+sGXsfl_55_fel_idx ;
      edtPMUlt_Internalname = "PMULT_"+sGXsfl_55_fel_idx ;
      edtPMFin_Internalname = "PMFIN_"+sGXsfl_55_fel_idx ;
      edtPMUsuCre_Internalname = "PMUSUCRE_"+sGXsfl_55_fel_idx ;
      edtPMDias_Internalname = "PMDIAS_"+sGXsfl_55_fel_idx ;
      edtPMDiasPavi_Internalname = "PMDIASPAVI_"+sGXsfl_55_fel_idx ;
      edtPMUso_Internalname = "PMUSO_"+sGXsfl_55_fel_idx ;
      edtavHoras_Internalname = "vHORAS_"+sGXsfl_55_fel_idx ;
      edtPMUsoMts_Internalname = "PMUSOMTS_"+sGXsfl_55_fel_idx ;
      edtavPmusomts_Internalname = "vPMUSOMTS_"+sGXsfl_55_fel_idx ;
      edtavCrearorden_Internalname = "vCREARORDEN_"+sGXsfl_55_fel_idx ;
      edtPMTipoDsc_Internalname = "PMTIPODSC_"+sGXsfl_55_fel_idx ;
      edtPMOrd_Internalname = "PMORD_"+sGXsfl_55_fel_idx ;
      edtPMTie_Internalname = "PMTIE_"+sGXsfl_55_fel_idx ;
      edtPMPla_Internalname = "PMPLA_"+sGXsfl_55_fel_idx ;
      edtPMTxt_Internalname = "PMTXT_"+sGXsfl_55_fel_idx ;
      edtavFecha1_Internalname = "vFECHA1_"+sGXsfl_55_fel_idx ;
      edtavFecha2_Internalname = "vFECHA2_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wbRB0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExpand_Internalname,GXutil.rtrim( AV141Expand),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVEXPAND.CLICK."+sGXsfl_55_idx+"'","","","","",edtavExpand_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavExpand_Columnclass,"",Integer.valueOf(0),Integer.valueOf(edtavExpand_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_groupcaption_Internalname,AV130Grid_GroupCaption,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_groupcaption_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_groupcaption_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV129GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV129GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV129GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_55_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV129GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkavSel.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSel.getEnabled()!=0)&&(chkavSel.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSEL_" + sGXsfl_55_idx ;
         chkavSel.setName( GXCCtl );
         chkavSel.setWebtags( "" );
         chkavSel.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSel.getInternalname(), "TitleCaption", chkavSel.getCaption(), !bGXsfl_55_Refreshing);
         chkavSel.setCheckedValue( "N" );
         AV153Sel = ((GXutil.strcmp(GXutil.rtrim( AV153Sel), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV153Sel);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSel.getInternalname(),AV153Sel,"","",Integer.valueOf(chkavSel.getVisible()),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(59, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSel.getEnabled()!=0)&&(chkavSel.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9429PMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9429PMCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDsc_Internalname,GXutil.rtrim( A9473PMDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPMDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMaqCod_Internalname,GXutil.rtrim( A9476PMMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMMaqDsc_Internalname,GXutil.rtrim( A9477PMMaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPMMaqDsc_Columnclass,edtPMMaqDsc_Columnheaderclass,Integer.valueOf(edtPMMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMaqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMaqcod_Enabled!=0)&&(edtavMaqcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV34MaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod_Enabled!=0)&&(edtavMaqcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,66);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","",httpContext.getMessage( "Sel- Maq. x Duplicar Tarea", ""),edtavMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMaqcod_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbPMEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbPMEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "PMEST_" + sGXsfl_55_idx ;
            cmbPMEst.setName( GXCCtl );
            cmbPMEst.setWebtags( "" );
            cmbPMEst.addItem("A", httpContext.getMessage( "Activa", ""), (short)(0));
            cmbPMEst.addItem("I", httpContext.getMessage( "Inactiva", ""), (short)(0));
            if ( cmbPMEst.getItemCount() > 0 )
            {
               A9478PMEst = cmbPMEst.getValidValue(A9478PMEst) ;
               n9478PMEst = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbPMEst,cmbPMEst.getInternalname(),GXutil.rtrim( A9478PMEst),Integer.valueOf(1),cmbPMEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbPMEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbPMEst.getColumnClass(),cmbPMEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbPMEst.setValue( GXutil.rtrim( A9478PMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPMEst.getInternalname(), "Values", cmbPMEst.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMFchCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMFchCre_Internalname,localUtil.format(A9474PMFchCre, "99/99/99"),localUtil.format( A9474PMFchCre, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMFchCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMFchCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMIni_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMIni_Internalname,localUtil.format(A9484PMIni, "99/99/99"),localUtil.format( A9484PMIni, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMIni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMIni_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMUlt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMUlt_Internalname,localUtil.format(A9486PMUlt, "99/99/99"),localUtil.format( A9486PMUlt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMUlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMUlt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMFin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMFin_Internalname,localUtil.format(A9485PMFin, "99/99/99"),localUtil.format( A9485PMFin, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMFin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMUsuCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMUsuCre_Internalname,GXutil.rtrim( A9475PMUsuCre),GXutil.rtrim( localUtil.format( A9475PMUsuCre, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMUsuCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMUsuCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMDias_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDias_Internalname,GXutil.ltrim( localUtil.ntoc( A9487PMDias, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9487PMDias), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDias_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMDias_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMDiasPavi_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDiasPavi_Internalname,GXutil.ltrim( localUtil.ntoc( A14275PMDiasPavi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14275PMDiasPavi), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDiasPavi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMDiasPavi_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMUso_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMUso_Internalname,GXutil.ltrim( localUtil.ntoc( A11454PMUso, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11454PMUso, "ZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMUso_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMUso_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHoras_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHoras_Enabled!=0)&&(edtavHoras_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 76,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHoras_Internalname,GXutil.ltrim( localUtil.ntoc( AV146Horas, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHoras_Enabled!=0) ? localUtil.format( AV146Horas, "ZZZZZZ9.99") : localUtil.format( AV146Horas, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavHoras_Enabled!=0)&&(edtavHoras_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,76);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHoras_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHoras_Visible),Integer.valueOf(edtavHoras_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMUsoMts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMUsoMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13013PMUsoMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13013PMUsoMts, "ZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMUsoMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMUsoMts_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPmusomts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPmusomts_Enabled!=0)&&(edtavPmusomts_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 78,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPmusomts_Internalname,GXutil.ltrim( localUtil.ntoc( AV150PMUsoMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPmusomts_Enabled!=0) ? localUtil.format( AV150PMUsoMts, "ZZZZZZ9.99") : localUtil.format( AV150PMUsoMts, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPmusomts_Enabled!=0)&&(edtavPmusomts_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPmusomts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavPmusomts_Visible),Integer.valueOf(edtavPmusomts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCrearorden_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCrearorden_Enabled!=0)&&(edtavCrearorden_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCrearorden_Internalname,GXutil.ltrim( localUtil.ntoc( AV145CrearOrden, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCrearorden_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9") : localUtil.format( DecimalUtil.doubleToDec(AV145CrearOrden), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavCrearorden_Enabled!=0)&&(edtavCrearorden_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCrearorden_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavCrearorden_Visible),Integer.valueOf(edtavCrearorden_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMTipoDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMTipoDsc_Internalname,GXutil.rtrim( A14272PMTipoDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMTipoDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMTipoDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMOrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A9488PMOrd, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9488PMOrd), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMOrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPMTie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMTie_Internalname,GXutil.ltrim( localUtil.ntoc( A11455PMTie, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11455PMTie, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMTie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMPla_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMPla_Internalname,GXutil.rtrim( A11456PMPla),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMPla_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPMTxt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMTxt_Internalname,A9483PMTxt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPMTxt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFecha1_Enabled!=0)&&(edtavFecha1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 85,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFecha1_Internalname,localUtil.format(AV143Fecha1, "99/99/99"),localUtil.format( AV143Fecha1, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavFecha1_Enabled!=0)&&(edtavFecha1_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,85);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFecha1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFecha1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFecha2_Enabled!=0)&&(edtavFecha2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 86,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFecha2_Internalname,localUtil.format(AV144Fecha2, "99/99/99"),localUtil.format( AV144Fecha2, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavFecha2_Enabled!=0)&&(edtavFecha2_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,86);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFecha2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFecha2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesRB2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      /* End function sendrow_552 */
   }

   public void startgridcontrol55( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"55\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Op.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "# Ord. Prev.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sel. Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbPMEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMFchCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Creación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMIni_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMUlt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Última", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMFin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMUsuCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario que crea el Preventivo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMDias_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Días", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMDiasPavi_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Días pre-aviso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMUso_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Uso Equipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHoras_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Horas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMUsoMts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Uso Mts.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPmusomts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts. hasta Fecha Ult.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCrearorden_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Crear Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMTipoDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMOrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMTie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMPla_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Planificar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPMTxt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Texto del Preventivo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV141Expand));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExpand_Columnclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExpand_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV130Grid_GroupCaption);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_groupcaption_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV129GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV153Sel));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkavSel.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9476PMMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9477PMMaqDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPMMaqDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPMMaqDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV34MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9478PMEst));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbPMEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbPMEst.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbPMEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9474PMFchCre, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMFchCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9484PMIni, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMIni_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9486PMUlt, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMUlt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9485PMFin, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMFin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9475PMUsuCre));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMUsuCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9487PMDias, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMDias_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14275PMDiasPavi, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMDiasPavi_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11454PMUso, (byte)(8), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMUso_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV146Horas, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHoras_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHoras_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13013PMUsoMts, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMUsoMts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV150PMUsoMts, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPmusomts_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPmusomts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV145CrearOrden, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCrearorden_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCrearorden_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14272PMTipoDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMTipoDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9488PMOrd, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMOrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11455PMTie, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMTie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11456PMPla));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMPla_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A9483PMTxt);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPMTxt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV143Fecha1, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFecha1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV144Fecha2, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFecha2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtngenerarordenes_Internalname = "BTNGENERARORDENES" ;
      bttBtngenerarordenesop_Internalname = "BTNGENERARORDENESOP" ;
      bttBtngenerarordenesoptodos_Internalname = "BTNGENERARORDENESOPTODOS" ;
      bttBtngenerarordenesopninguno_Internalname = "BTNGENERARORDENESOPNINGUNO" ;
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
      edtPMCod_Internalname = "PMCOD" ;
      edtPMDsc_Internalname = "PMDSC" ;
      edtPMMaqCod_Internalname = "PMMAQCOD" ;
      edtPMMaqDsc_Internalname = "PMMAQDSC" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      cmbPMEst.setInternalname( "PMEST" );
      edtPMFchCre_Internalname = "PMFCHCRE" ;
      edtPMIni_Internalname = "PMINI" ;
      edtPMUlt_Internalname = "PMULT" ;
      edtPMFin_Internalname = "PMFIN" ;
      edtPMUsuCre_Internalname = "PMUSUCRE" ;
      edtPMDias_Internalname = "PMDIAS" ;
      edtPMDiasPavi_Internalname = "PMDIASPAVI" ;
      edtPMUso_Internalname = "PMUSO" ;
      edtavHoras_Internalname = "vHORAS" ;
      edtPMUsoMts_Internalname = "PMUSOMTS" ;
      edtavPmusomts_Internalname = "vPMUSOMTS" ;
      edtavCrearorden_Internalname = "vCREARORDEN" ;
      edtPMTipoDsc_Internalname = "PMTIPODSC" ;
      edtPMOrd_Internalname = "PMORD" ;
      edtPMTie_Internalname = "PMTIE" ;
      edtPMPla_Internalname = "PMPLA" ;
      edtPMTxt_Internalname = "PMTXT" ;
      edtavFecha1_Internalname = "vFECHA1" ;
      edtavFecha2_Internalname = "vFECHA2" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_duplicartarea_Internalname = "DVELOP_CONFIRMPANEL_DUPLICARTAREA" ;
      tblTabledvelop_confirmpanel_duplicartarea_Internalname = "TABLEDVELOP_CONFIRMPANEL_DUPLICARTAREA" ;
      Dvelop_confirmpanel_generarordenes_Internalname = "DVELOP_CONFIRMPANEL_GENERARORDENES" ;
      tblTabledvelop_confirmpanel_generarordenes_Internalname = "TABLEDVELOP_CONFIRMPANEL_GENERARORDENES" ;
      Dvelop_confirmpanel_generarordenesop_Internalname = "DVELOP_CONFIRMPANEL_GENERARORDENESOP" ;
      tblTabledvelop_confirmpanel_generarordenesop_Internalname = "TABLEDVELOP_CONFIRMPANEL_GENERARORDENESOP" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_group_Internalname = "GRID_GROUP" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_pmfchcreauxdate_Internalname = "vDDO_PMFCHCREAUXDATE" ;
      divDdo_pmfchcreauxdates_Internalname = "DDO_PMFCHCREAUXDATES" ;
      edtavDdo_pminiauxdate_Internalname = "vDDO_PMINIAUXDATE" ;
      divDdo_pminiauxdates_Internalname = "DDO_PMINIAUXDATES" ;
      edtavDdo_pmultauxdate_Internalname = "vDDO_PMULTAUXDATE" ;
      divDdo_pmultauxdates_Internalname = "DDO_PMULTAUXDATES" ;
      edtavDdo_pmfinauxdate_Internalname = "vDDO_PMFINAUXDATE" ;
      divDdo_pmfinauxdates_Internalname = "DDO_PMFINAUXDATES" ;
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
      edtavFecha2_Jsonclick = "" ;
      edtavFecha2_Visible = 0 ;
      edtavFecha2_Enabled = 1 ;
      edtavFecha1_Jsonclick = "" ;
      edtavFecha1_Visible = 0 ;
      edtavFecha1_Enabled = 1 ;
      edtPMTxt_Jsonclick = "" ;
      edtPMPla_Jsonclick = "" ;
      edtPMTie_Jsonclick = "" ;
      edtPMOrd_Jsonclick = "" ;
      edtPMTipoDsc_Jsonclick = "" ;
      edtavCrearorden_Jsonclick = "" ;
      edtavCrearorden_Enabled = 1 ;
      edtavPmusomts_Jsonclick = "" ;
      edtavPmusomts_Enabled = 1 ;
      edtPMUsoMts_Jsonclick = "" ;
      edtavHoras_Jsonclick = "" ;
      edtavHoras_Enabled = 1 ;
      edtPMUso_Jsonclick = "" ;
      edtPMDiasPavi_Jsonclick = "" ;
      edtPMDias_Jsonclick = "" ;
      edtPMUsuCre_Jsonclick = "" ;
      edtPMFin_Jsonclick = "" ;
      edtPMUlt_Jsonclick = "" ;
      edtPMIni_Jsonclick = "" ;
      edtPMFchCre_Jsonclick = "" ;
      cmbPMEst.setJsonclick( "" );
      cmbPMEst.setColumnClass( "WWColumn hidden-xs" );
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtPMMaqDsc_Jsonclick = "" ;
      edtPMMaqDsc_Columnclass = "WWColumn hidden-xs" ;
      edtPMMaqCod_Jsonclick = "" ;
      edtPMDsc_Jsonclick = "" ;
      edtPMCod_Jsonclick = "" ;
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
      cmbPMEst.setColumnHeaderClass( "" );
      edtPMMaqDsc_Columnheaderclass = "" ;
      edtPMTxt_Visible = -1 ;
      edtPMPla_Visible = -1 ;
      edtPMTie_Visible = -1 ;
      edtPMOrd_Visible = -1 ;
      edtPMTipoDsc_Visible = -1 ;
      edtavCrearorden_Visible = -1 ;
      edtavPmusomts_Visible = -1 ;
      edtPMUsoMts_Visible = -1 ;
      edtavHoras_Visible = -1 ;
      edtPMUso_Visible = -1 ;
      edtPMDiasPavi_Visible = -1 ;
      edtPMDias_Visible = -1 ;
      edtPMUsuCre_Visible = -1 ;
      edtPMFin_Visible = -1 ;
      edtPMUlt_Visible = -1 ;
      edtPMIni_Visible = -1 ;
      edtPMFchCre_Visible = -1 ;
      cmbPMEst.setVisible( -1 );
      edtavMaqcod_Visible = -1 ;
      edtPMMaqDsc_Visible = -1 ;
      edtPMMaqCod_Visible = -1 ;
      edtPMDsc_Visible = -1 ;
      edtPMCod_Visible = -1 ;
      chkavSel.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_pmfinauxdate_Jsonclick = "" ;
      edtavDdo_pmultauxdate_Jsonclick = "" ;
      edtavDdo_pminiauxdate_Jsonclick = "" ;
      edtavDdo_pmfchcreauxdate_Jsonclick = "" ;
      Combo_maqcod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = ";;L;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hasrowgroups = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_group_Columnindex = 1 ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;Fecha;Fecha;Fecha;;;;;;;;;;;;;;;;" ;
      Dvelop_confirmpanel_generarordenesop_Confirmtype = "1" ;
      Dvelop_confirmpanel_generarordenesop_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_generarordenesop_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_generarordenesop_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_generarordenesop_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_generarordenesop_Confirmationtext = "Desea Generar Ordenes (Op)" ;
      Dvelop_confirmpanel_generarordenesop_Title = httpContext.getMessage( "Generar Ordenes (Op)", "") ;
      Dvelop_confirmpanel_generarordenes_Confirmtype = "1" ;
      Dvelop_confirmpanel_generarordenes_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_generarordenes_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_generarordenes_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_generarordenes_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_generarordenes_Confirmationtext = "Desea Generar las Ordenes" ;
      Dvelop_confirmpanel_generarordenes_Title = httpContext.getMessage( "Generar Ordenes", "") ;
      Dvelop_confirmpanel_duplicartarea_Confirmtype = "1" ;
      Dvelop_confirmpanel_duplicartarea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_duplicartarea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_duplicartarea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_duplicartarea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_duplicartarea_Confirmationtext = "Desea Duplicar Tarea?" ;
      Dvelop_confirmpanel_duplicartarea_Title = httpContext.getMessage( "Duplicar Tarea Preventiva", "") ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "MantenimientoMaquina.TMPreveWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||A:Activa,I:Inactiva|||||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "||||||T|||||||||||||||||" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|Dynamic||FixedValues|||||Dynamic||||||||Dynamic|||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T|T||T|||||T||||||||T|||T|T" ;
      Ddo_grid_Filterisrange = "|T|||||||||||T|T|T||T||||T|T||" ;
      Ddo_grid_Filtertype = "|Numeric|Character|Character|Character|||Date|Date|Date|Date|Character|Numeric|Numeric|Numeric||Numeric|||Character|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|||T|T|T|T|T|T|T|T||T|||T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Allowgroup = "||||T||T|||||||||||||||||" ;
      Ddo_grid_Includesortasc = "|T|T|T|T||T|T|T|T|T|T|T|T|T||T|||T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|1|2|3|4||5|6|7|8|9|10|11|12|13||14|||15|16|17|18|19" ;
      Ddo_grid_Columnids = "3:Sel|6:PMCod|7:PMDsc|8:PMMaqCod|9:PMMaqDsc|10:MaqCod|11:PMEst|12:PMFchCre|13:PMIni|14:PMUlt|15:PMFin|16:PMUsuCre|17:PMDias|18:PMDiasPaviso|19:PMUso|20:Horas|21:PMUsoMts|22:PMUsoMts|23:CrearOrden|24:PMTipoDsc|25:PMOrd|26:PMTie|27:PMPla|28:PMTxt" ;
      Ddo_grid_Gridinternalname = "" ;
      Combo_maqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_maqcod_Titlecontrolidtoreplace = "" ;
      Combo_maqcod_Cls = "ExtendedCombo" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Preventivo", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV129GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV129GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV129GridActions), 4, 0));
      }
      GXCCtl = "vSEL_" + sGXsfl_55_idx ;
      chkavSel.setName( GXCCtl );
      chkavSel.setWebtags( "" );
      chkavSel.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSel.getInternalname(), "TitleCaption", chkavSel.getCaption(), !bGXsfl_55_Refreshing);
      chkavSel.setCheckedValue( "N" );
      AV153Sel = ((GXutil.strcmp(GXutil.rtrim( AV153Sel), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSel.getInternalname(), AV153Sel);
      GXCCtl = "PMEST_" + sGXsfl_55_idx ;
      cmbPMEst.setName( GXCCtl );
      cmbPMEst.setWebtags( "" );
      cmbPMEst.addItem("A", httpContext.getMessage( "Activa", ""), (short)(0));
      cmbPMEst.addItem("I", httpContext.getMessage( "Inactiva", ""), (short)(0));
      if ( cmbPMEst.getItemCount() > 0 )
      {
         A9478PMEst = cmbPMEst.getValidValue(A9478PMEst) ;
         n9478PMEst = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtPMMaqCod_Visible',ctrl:'PMMAQCOD',prop:'Visible'},{av:'edtPMMaqDsc_Visible',ctrl:'PMMAQDSC',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'cmbPMEst'},{av:'edtPMFchCre_Visible',ctrl:'PMFCHCRE',prop:'Visible'},{av:'edtPMIni_Visible',ctrl:'PMINI',prop:'Visible'},{av:'edtPMUlt_Visible',ctrl:'PMULT',prop:'Visible'},{av:'edtPMFin_Visible',ctrl:'PMFIN',prop:'Visible'},{av:'edtPMUsuCre_Visible',ctrl:'PMUSUCRE',prop:'Visible'},{av:'edtPMDias_Visible',ctrl:'PMDIAS',prop:'Visible'},{av:'edtPMDiasPavi_Visible',ctrl:'PMDIASPAVI',prop:'Visible'},{av:'edtPMUso_Visible',ctrl:'PMUSO',prop:'Visible'},{av:'edtavHoras_Visible',ctrl:'vHORAS',prop:'Visible'},{av:'edtPMUsoMts_Visible',ctrl:'PMUSOMTS',prop:'Visible'},{av:'edtavPmusomts_Visible',ctrl:'vPMUSOMTS',prop:'Visible'},{av:'edtavCrearorden_Visible',ctrl:'vCREARORDEN',prop:'Visible'},{av:'edtPMTipoDsc_Visible',ctrl:'PMTIPODSC',prop:'Visible'},{av:'edtPMOrd_Visible',ctrl:'PMORD',prop:'Visible'},{av:'edtPMTie_Visible',ctrl:'PMTIE',prop:'Visible'},{av:'edtPMPla_Visible',ctrl:'PMPLA',prop:'Visible'},{av:'edtPMTxt_Visible',ctrl:'PMTXT',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtPMMaqDsc_Columnheaderclass',ctrl:'PMMAQDSC',prop:'Columnheaderclass'},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e16RB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e17RB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e18RB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedtext_get',ctrl:'DDO_GRID',prop:'SelectedText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e31RB2',iparms:[{av:'A9486PMUlt',fld:'PMULT',pic:''},{av:'A9487PMDias',fld:'PMDIAS',pic:'ZZ9'},{av:'A11454PMUso',fld:'PMUSO',pic:'ZZZZ9.99'},{av:'cmbPMEst'},{av:'A9478PMEst',fld:'PMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9476PMMaqCod',fld:'PMMAQCOD',pic:''},{av:'A13013PMUsoMts',fld:'PMUSOMTS',pic:'ZZZZZZ9.99'},{av:'A9484PMIni',fld:'PMINI',pic:''},{av:'A9485PMFin',fld:'PMFIN',pic:''},{av:'A9488PMOrd',fld:'PMORD',pic:'ZZZZZZZ9'},{av:'A14275PMDiasPavi',fld:'PMDIASPAVI',pic:'ZZZ9'},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV143Fecha1',fld:'vFECHA1',pic:''},{av:'AV144Fecha2',fld:'vFECHA2',pic:''},{av:'AV145CrearOrden',fld:'vCREARORDEN',pic:'9',hsh:true},{av:'AV146Horas',fld:'vHORAS',pic:'ZZZZZZ9.99'},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV153Sel',fld:'vSEL',pic:''},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV141Expand',fld:'vEXPAND',pic:''},{av:'edtavExpand_Columnclass',ctrl:'vEXPAND',prop:'Columnclass'},{av:'cmbavGridactions'},{av:'AV129GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtPMMaqDsc_Columnclass',ctrl:'PMMAQDSC',prop:'Columnclass'},{av:'cmbPMEst'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e19RB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtPMMaqCod_Visible',ctrl:'PMMAQCOD',prop:'Visible'},{av:'edtPMMaqDsc_Visible',ctrl:'PMMAQDSC',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'cmbPMEst'},{av:'edtPMFchCre_Visible',ctrl:'PMFCHCRE',prop:'Visible'},{av:'edtPMIni_Visible',ctrl:'PMINI',prop:'Visible'},{av:'edtPMUlt_Visible',ctrl:'PMULT',prop:'Visible'},{av:'edtPMFin_Visible',ctrl:'PMFIN',prop:'Visible'},{av:'edtPMUsuCre_Visible',ctrl:'PMUSUCRE',prop:'Visible'},{av:'edtPMDias_Visible',ctrl:'PMDIAS',prop:'Visible'},{av:'edtPMDiasPavi_Visible',ctrl:'PMDIASPAVI',prop:'Visible'},{av:'edtPMUso_Visible',ctrl:'PMUSO',prop:'Visible'},{av:'edtavHoras_Visible',ctrl:'vHORAS',prop:'Visible'},{av:'edtPMUsoMts_Visible',ctrl:'PMUSOMTS',prop:'Visible'},{av:'edtavPmusomts_Visible',ctrl:'vPMUSOMTS',prop:'Visible'},{av:'edtavCrearorden_Visible',ctrl:'vCREARORDEN',prop:'Visible'},{av:'edtPMTipoDsc_Visible',ctrl:'PMTIPODSC',prop:'Visible'},{av:'edtPMOrd_Visible',ctrl:'PMORD',prop:'Visible'},{av:'edtPMTie_Visible',ctrl:'PMTIE',prop:'Visible'},{av:'edtPMPla_Visible',ctrl:'PMPLA',prop:'Visible'},{av:'edtPMTxt_Visible',ctrl:'PMTXT',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtPMMaqDsc_Columnheaderclass',ctrl:'PMMAQDSC',prop:'Columnheaderclass'},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e15RB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''},{av:'cmbPMEst'},{av:'A9478PMEst',fld:'PMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'AV142GroupPMMaqDsc',fld:'vGROUPPMMAQDSC',pic:''},{av:'AV134GroupPMEst',fld:'vGROUPPMEST',pic:''},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtPMMaqCod_Visible',ctrl:'PMMAQCOD',prop:'Visible'},{av:'edtPMMaqDsc_Visible',ctrl:'PMMAQDSC',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'cmbPMEst'},{av:'edtPMFchCre_Visible',ctrl:'PMFCHCRE',prop:'Visible'},{av:'edtPMIni_Visible',ctrl:'PMINI',prop:'Visible'},{av:'edtPMUlt_Visible',ctrl:'PMULT',prop:'Visible'},{av:'edtPMFin_Visible',ctrl:'PMFIN',prop:'Visible'},{av:'edtPMUsuCre_Visible',ctrl:'PMUSUCRE',prop:'Visible'},{av:'edtPMDias_Visible',ctrl:'PMDIAS',prop:'Visible'},{av:'edtPMDiasPavi_Visible',ctrl:'PMDIASPAVI',prop:'Visible'},{av:'edtPMUso_Visible',ctrl:'PMUSO',prop:'Visible'},{av:'edtavHoras_Visible',ctrl:'vHORAS',prop:'Visible'},{av:'edtPMUsoMts_Visible',ctrl:'PMUSOMTS',prop:'Visible'},{av:'edtavPmusomts_Visible',ctrl:'vPMUSOMTS',prop:'Visible'},{av:'edtavCrearorden_Visible',ctrl:'vCREARORDEN',prop:'Visible'},{av:'edtPMTipoDsc_Visible',ctrl:'PMTIPODSC',prop:'Visible'},{av:'edtPMOrd_Visible',ctrl:'PMORD',prop:'Visible'},{av:'edtPMTie_Visible',ctrl:'PMTIE',prop:'Visible'},{av:'edtPMPla_Visible',ctrl:'PMPLA',prop:'Visible'},{av:'edtPMTxt_Visible',ctrl:'PMTXT',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtPMMaqDsc_Columnheaderclass',ctrl:'PMMAQDSC',prop:'Columnheaderclass'},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e32RB2',iparms:[{av:'cmbavGridactions'},{av:'AV129GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9473PMDsc',fld:'PMDSC',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV129GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtPMMaqCod_Visible',ctrl:'PMMAQCOD',prop:'Visible'},{av:'edtPMMaqDsc_Visible',ctrl:'PMMAQDSC',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'cmbPMEst'},{av:'edtPMFchCre_Visible',ctrl:'PMFCHCRE',prop:'Visible'},{av:'edtPMIni_Visible',ctrl:'PMINI',prop:'Visible'},{av:'edtPMUlt_Visible',ctrl:'PMULT',prop:'Visible'},{av:'edtPMFin_Visible',ctrl:'PMFIN',prop:'Visible'},{av:'edtPMUsuCre_Visible',ctrl:'PMUSUCRE',prop:'Visible'},{av:'edtPMDias_Visible',ctrl:'PMDIAS',prop:'Visible'},{av:'edtPMDiasPavi_Visible',ctrl:'PMDIASPAVI',prop:'Visible'},{av:'edtPMUso_Visible',ctrl:'PMUSO',prop:'Visible'},{av:'edtavHoras_Visible',ctrl:'vHORAS',prop:'Visible'},{av:'edtPMUsoMts_Visible',ctrl:'PMUSOMTS',prop:'Visible'},{av:'edtavPmusomts_Visible',ctrl:'vPMUSOMTS',prop:'Visible'},{av:'edtavCrearorden_Visible',ctrl:'vCREARORDEN',prop:'Visible'},{av:'edtPMTipoDsc_Visible',ctrl:'PMTIPODSC',prop:'Visible'},{av:'edtPMOrd_Visible',ctrl:'PMORD',prop:'Visible'},{av:'edtPMTie_Visible',ctrl:'PMTIE',prop:'Visible'},{av:'edtPMPla_Visible',ctrl:'PMPLA',prop:'Visible'},{av:'edtPMTxt_Visible',ctrl:'PMTXT',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtPMMaqDsc_Columnheaderclass',ctrl:'PMMAQDSC',prop:'Columnheaderclass'},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICARTAREA.CLOSE","{handler:'e20RB2',iparms:[{av:'Dvelop_confirmpanel_duplicartarea_Result',ctrl:'DVELOP_CONFIRMPANEL_DUPLICARTAREA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV34MaqCod',fld:'vMAQCOD',pic:''},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DUPLICARTAREA.CLOSE",",oparms:[{av:'AV34MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtPMMaqCod_Visible',ctrl:'PMMAQCOD',prop:'Visible'},{av:'edtPMMaqDsc_Visible',ctrl:'PMMAQDSC',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'cmbPMEst'},{av:'edtPMFchCre_Visible',ctrl:'PMFCHCRE',prop:'Visible'},{av:'edtPMIni_Visible',ctrl:'PMINI',prop:'Visible'},{av:'edtPMUlt_Visible',ctrl:'PMULT',prop:'Visible'},{av:'edtPMFin_Visible',ctrl:'PMFIN',prop:'Visible'},{av:'edtPMUsuCre_Visible',ctrl:'PMUSUCRE',prop:'Visible'},{av:'edtPMDias_Visible',ctrl:'PMDIAS',prop:'Visible'},{av:'edtPMDiasPavi_Visible',ctrl:'PMDIASPAVI',prop:'Visible'},{av:'edtPMUso_Visible',ctrl:'PMUSO',prop:'Visible'},{av:'edtavHoras_Visible',ctrl:'vHORAS',prop:'Visible'},{av:'edtPMUsoMts_Visible',ctrl:'PMUSOMTS',prop:'Visible'},{av:'edtavPmusomts_Visible',ctrl:'vPMUSOMTS',prop:'Visible'},{av:'edtavCrearorden_Visible',ctrl:'vCREARORDEN',prop:'Visible'},{av:'edtPMTipoDsc_Visible',ctrl:'PMTIPODSC',prop:'Visible'},{av:'edtPMOrd_Visible',ctrl:'PMORD',prop:'Visible'},{av:'edtPMTie_Visible',ctrl:'PMTIE',prop:'Visible'},{av:'edtPMPla_Visible',ctrl:'PMPLA',prop:'Visible'},{av:'edtPMTxt_Visible',ctrl:'PMTXT',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtPMMaqDsc_Columnheaderclass',ctrl:'PMMAQDSC',prop:'Columnheaderclass'},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e23RB2',iparms:[{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOGENERARORDENES'","{handler:'e11RB1',iparms:[]");
      setEventMetadata("'DOGENERARORDENES'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARORDENES.CLOSE","{handler:'e21RB2',iparms:[{av:'Dvelop_confirmpanel_generarordenes_Result',ctrl:'DVELOP_CONFIRMPANEL_GENERARORDENES',prop:'Result'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARORDENES.CLOSE",",oparms:[]}");
      setEventMetadata("'DOGENERARORDENESOP'","{handler:'e12RB1',iparms:[]");
      setEventMetadata("'DOGENERARORDENESOP'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARORDENESOP.CLOSE","{handler:'e22RB2',iparms:[{av:'Dvelop_confirmpanel_generarordenesop_Result',ctrl:'DVELOP_CONFIRMPANEL_GENERARORDENESOP',prop:'Result'},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV153Sel',fld:'vSEL',grid:55,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_55',ctrl:'GRID',grid:55,prop:'GridRC',grid:55},{av:'A396EmprCod',fld:'EMPRCOD',grid:55,pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',grid:55,pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARORDENESOP.CLOSE",",oparms:[{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOGENERARORDENESOPTODOS'","{handler:'e13RB1',iparms:[{av:'AV145CrearOrden',fld:'vCREARORDEN',grid:55,pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_55',ctrl:'GRID',grid:55,prop:'GridRC',grid:55}]");
      setEventMetadata("'DOGENERARORDENESOPTODOS'",",oparms:[{av:'AV153Sel',fld:'vSEL',pic:''}]}");
      setEventMetadata("'DOGENERARORDENESOPNINGUNO'","{handler:'e14RB1',iparms:[]");
      setEventMetadata("'DOGENERARORDENESOPNINGUNO'",",oparms:[{av:'AV153Sel',fld:'vSEL',pic:''}]}");
      setEventMetadata("'DOEXCELWIN'","{handler:'e24RB2',iparms:[]");
      setEventMetadata("'DOEXCELWIN'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e25RB2',iparms:[{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''},{av:'cmbPMEst'},{av:'A9478PMEst',fld:'PMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV142GroupPMMaqDsc',fld:'vGROUPPMMAQDSC',pic:''},{av:'AV134GroupPMEst',fld:'vGROUPPMEST',pic:''}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e26RB2',iparms:[{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''},{av:'cmbPMEst'},{av:'A9478PMEst',fld:'PMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV142GroupPMMaqDsc',fld:'vGROUPPMMAQDSC',pic:''},{av:'AV134GroupPMEst',fld:'vGROUPPMEST',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e27RB2',iparms:[{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''},{av:'cmbPMEst'},{av:'A9478PMEst',fld:'PMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV51TFPMEst_SelsJson',fld:'vTFPMEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV142GroupPMMaqDsc',fld:'vGROUPPMMAQDSC',pic:''},{av:'AV134GroupPMEst',fld:'vGROUPPMEST',pic:''}]}");
      setEventMetadata("VEXPAND.CLICK","{handler:'e33RB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV44TFPMCod',fld:'vTFPMCOD',pic:'ZZZZZZZ9'},{av:'AV45TFPMCod_To',fld:'vTFPMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFPMDsc',fld:'vTFPMDSC',pic:''},{av:'AV49TFPMDsc_Sel',fld:'vTFPMDSC_SEL',pic:''},{av:'AV58TFPMMaqCod',fld:'vTFPMMAQCOD',pic:''},{av:'AV59TFPMMaqCod_Sel',fld:'vTFPMMAQCOD_SEL',pic:''},{av:'AV60TFPMMaqDsc',fld:'vTFPMMAQDSC',pic:''},{av:'AV61TFPMMaqDsc_Sel',fld:'vTFPMMAQDSC_SEL',pic:''},{av:'AV50TFPMEst_Sels',fld:'vTFPMEST_SELS',pic:''},{av:'AV52TFPMFchCre',fld:'vTFPMFCHCRE',pic:''},{av:'AV56TFPMIni',fld:'vTFPMINI',pic:''},{av:'AV70TFPMUlt',fld:'vTFPMULT',pic:''},{av:'AV54TFPMFin',fld:'vTFPMFIN',pic:''},{av:'AV76TFPMUsuCre',fld:'vTFPMUSUCRE',pic:'@!'},{av:'AV77TFPMUsuCre_Sel',fld:'vTFPMUSUCRE_SEL',pic:'@!'},{av:'AV46TFPMDias',fld:'vTFPMDIAS',pic:'ZZ9'},{av:'AV47TFPMDias_To',fld:'vTFPMDIAS_TO',pic:'ZZ9'},{av:'AV154TFPMDiasPaviso',fld:'vTFPMDIASPAVISO',pic:'ZZZ9'},{av:'AV155TFPMDiasPaviso_To',fld:'vTFPMDIASPAVISO_TO',pic:'ZZZ9'},{av:'AV72TFPMUso',fld:'vTFPMUSO',pic:'ZZZZ9.99'},{av:'AV73TFPMUso_To',fld:'vTFPMUSO_TO',pic:'ZZZZ9.99'},{av:'AV74TFPMUsoMts',fld:'vTFPMUSOMTS',pic:'ZZZZZZ9.99'},{av:'AV75TFPMUsoMts_To',fld:'vTFPMUSOMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV156TFPMTipoDsc',fld:'vTFPMTIPODSC',pic:''},{av:'AV157TFPMTipoDsc_Sel',fld:'vTFPMTIPODSC_SEL',pic:''},{av:'AV62TFPMOrd',fld:'vTFPMORD',pic:'ZZZZZZZ9'},{av:'AV63TFPMOrd_To',fld:'vTFPMORD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFPMTie',fld:'vTFPMTIE',pic:'ZZ9.99'},{av:'AV67TFPMTie_To',fld:'vTFPMTIE_TO',pic:'ZZ9.99'},{av:'AV64TFPMPla',fld:'vTFPMPLA',pic:''},{av:'AV65TFPMPla_Sel',fld:'vTFPMPLA_SEL',pic:''},{av:'AV68TFPMTxt',fld:'vTFPMTXT',pic:''},{av:'AV69TFPMTxt_Sel',fld:'vTFPMTXT_SEL',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''},{av:'AV37OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV39OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV150PMUsoMts',fld:'vPMUSOMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV149Nrg1',fld:'vNRG1',pic:'ZZZZZ9',hsh:true},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV19EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9477PMMaqDsc',fld:'PMMAQDSC',pic:''},{av:'cmbPMEst'},{av:'A9478PMEst',fld:'PMEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9429PMCod',fld:'PMCOD',pic:'ZZZZZZZ9'},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("VEXPAND.CLICK",",oparms:[{av:'AV133GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV136GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV140AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV142GroupPMMaqDsc',fld:'vGROUPPMMAQDSC',pic:''},{av:'AV134GroupPMEst',fld:'vGROUPPMEST',pic:''},{av:'AV135GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV5ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'chkavSel.getVisible()',ctrl:'vSEL',prop:'Visible'},{av:'edtPMCod_Visible',ctrl:'PMCOD',prop:'Visible'},{av:'edtPMDsc_Visible',ctrl:'PMDSC',prop:'Visible'},{av:'edtPMMaqCod_Visible',ctrl:'PMMAQCOD',prop:'Visible'},{av:'edtPMMaqDsc_Visible',ctrl:'PMMAQDSC',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'cmbPMEst'},{av:'edtPMFchCre_Visible',ctrl:'PMFCHCRE',prop:'Visible'},{av:'edtPMIni_Visible',ctrl:'PMINI',prop:'Visible'},{av:'edtPMUlt_Visible',ctrl:'PMULT',prop:'Visible'},{av:'edtPMFin_Visible',ctrl:'PMFIN',prop:'Visible'},{av:'edtPMUsuCre_Visible',ctrl:'PMUSUCRE',prop:'Visible'},{av:'edtPMDias_Visible',ctrl:'PMDIAS',prop:'Visible'},{av:'edtPMDiasPavi_Visible',ctrl:'PMDIASPAVI',prop:'Visible'},{av:'edtPMUso_Visible',ctrl:'PMUSO',prop:'Visible'},{av:'edtavHoras_Visible',ctrl:'vHORAS',prop:'Visible'},{av:'edtPMUsoMts_Visible',ctrl:'PMUSOMTS',prop:'Visible'},{av:'edtavPmusomts_Visible',ctrl:'vPMUSOMTS',prop:'Visible'},{av:'edtavCrearorden_Visible',ctrl:'vCREARORDEN',prop:'Visible'},{av:'edtPMTipoDsc_Visible',ctrl:'PMTIPODSC',prop:'Visible'},{av:'edtPMOrd_Visible',ctrl:'PMORD',prop:'Visible'},{av:'edtPMTie_Visible',ctrl:'PMTIE',prop:'Visible'},{av:'edtPMPla_Visible',ctrl:'PMPLA',prop:'Visible'},{av:'edtPMTxt_Visible',ctrl:'PMTXT',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtPMMaqDsc_Columnheaderclass',ctrl:'PMMAQDSC',prop:'Columnheaderclass'},{av:'AV130Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV131GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'}]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e28RB2',iparms:[{av:'AV109Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV108ObjetoRefrescar',fld:'vOBJETOREFRESCAR',pic:''},{av:'AV171Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[]}");
      setEventMetadata("VALIDV_SEL","{handler:'validv_Sel',iparms:[]");
      setEventMetadata("VALIDV_SEL",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PMCOD","{handler:'valid_Pmcod',iparms:[]");
      setEventMetadata("VALID_PMCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDSC","{handler:'valid_Pmdsc',iparms:[]");
      setEventMetadata("VALID_PMDSC",",oparms:[]}");
      setEventMetadata("VALID_PMMAQCOD","{handler:'valid_Pmmaqcod',iparms:[]");
      setEventMetadata("VALID_PMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_PMMAQDSC","{handler:'valid_Pmmaqdsc',iparms:[]");
      setEventMetadata("VALID_PMMAQDSC",",oparms:[]}");
      setEventMetadata("VALID_PMEST","{handler:'valid_Pmest',iparms:[]");
      setEventMetadata("VALID_PMEST",",oparms:[]}");
      setEventMetadata("VALID_PMUSUCRE","{handler:'valid_Pmusucre',iparms:[]");
      setEventMetadata("VALID_PMUSUCRE",",oparms:[]}");
      setEventMetadata("VALID_PMDIAS","{handler:'valid_Pmdias',iparms:[]");
      setEventMetadata("VALID_PMDIAS",",oparms:[]}");
      setEventMetadata("VALID_PMDIASPAVI","{handler:'valid_Pmdiaspavi',iparms:[]");
      setEventMetadata("VALID_PMDIASPAVI",",oparms:[]}");
      setEventMetadata("VALID_PMUSO","{handler:'valid_Pmuso',iparms:[]");
      setEventMetadata("VALID_PMUSO",",oparms:[]}");
      setEventMetadata("VALID_PMUSOMTS","{handler:'valid_Pmusomts',iparms:[]");
      setEventMetadata("VALID_PMUSOMTS",",oparms:[]}");
      setEventMetadata("VALID_PMTIPODSC","{handler:'valid_Pmtipodsc',iparms:[]");
      setEventMetadata("VALID_PMTIPODSC",",oparms:[]}");
      setEventMetadata("VALID_PMORD","{handler:'valid_Pmord',iparms:[]");
      setEventMetadata("VALID_PMORD",",oparms:[]}");
      setEventMetadata("VALID_PMTIE","{handler:'valid_Pmtie',iparms:[]");
      setEventMetadata("VALID_PMTIE",",oparms:[]}");
      setEventMetadata("VALID_PMPLA","{handler:'valid_Pmpla',iparms:[]");
      setEventMetadata("VALID_PMPLA",",oparms:[]}");
      setEventMetadata("VALID_PMTXT","{handler:'valid_Pmtxt',iparms:[]");
      setEventMetadata("VALID_PMTXT",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Fecha2',iparms:[]");
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
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_duplicartarea_Result = "" ;
      Dvelop_confirmpanel_generarordenes_Result = "" ;
      Dvelop_confirmpanel_generarordenesop_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV23FilterFullText = "" ;
      AV48TFPMDsc = "" ;
      AV49TFPMDsc_Sel = "" ;
      AV58TFPMMaqCod = "" ;
      AV59TFPMMaqCod_Sel = "" ;
      AV60TFPMMaqDsc = "" ;
      AV61TFPMMaqDsc_Sel = "" ;
      AV50TFPMEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV52TFPMFchCre = GXutil.nullDate() ;
      AV56TFPMIni = GXutil.nullDate() ;
      AV70TFPMUlt = GXutil.nullDate() ;
      AV54TFPMFin = GXutil.nullDate() ;
      AV76TFPMUsuCre = "" ;
      AV77TFPMUsuCre_Sel = "" ;
      AV72TFPMUso = DecimalUtil.ZERO ;
      AV73TFPMUso_To = DecimalUtil.ZERO ;
      AV74TFPMUsoMts = DecimalUtil.ZERO ;
      AV75TFPMUsoMts_To = DecimalUtil.ZERO ;
      AV156TFPMTipoDsc = "" ;
      AV157TFPMTipoDsc_Sel = "" ;
      AV66TFPMTie = DecimalUtil.ZERO ;
      AV67TFPMTie_To = DecimalUtil.ZERO ;
      AV64TFPMPla = "" ;
      AV65TFPMPla_Sel = "" ;
      AV68TFPMTxt = "" ;
      AV69TFPMTxt_Sel = "" ;
      AV171Pgmname = "" ;
      AV131GroupBy = "" ;
      AV136GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "");
      AV150PMUsoMts = DecimalUtil.ZERO ;
      AV130Grid_GroupCaption = "" ;
      AV133GroupKey = "" ;
      AV135GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV31ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV16DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV167MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV51TFPMEst_SelsJson = "" ;
      AV108ObjetoRefrescar = new GXSimpleCollection<String>(String.class, "internal", "");
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_group_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtngenerarordenes_Jsonclick = "" ;
      bttBtngenerarordenesop_Jsonclick = "" ;
      bttBtngenerarordenesoptodos_Jsonclick = "" ;
      bttBtngenerarordenesopninguno_Jsonclick = "" ;
      bttBtnexcelwin_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_group = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV8DDO_PMFchCreAuxDate = GXutil.nullDate() ;
      AV12DDO_PMIniAuxDate = GXutil.nullDate() ;
      AV14DDO_PMUltAuxDate = GXutil.nullDate() ;
      AV10DDO_PMFinAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV141Expand = "" ;
      AV153Sel = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A9473PMDsc = "" ;
      A9476PMMaqCod = "" ;
      A9477PMMaqDsc = "" ;
      AV34MaqCod = "" ;
      A9478PMEst = "" ;
      A9474PMFchCre = GXutil.nullDate() ;
      A9484PMIni = GXutil.nullDate() ;
      A9486PMUlt = GXutil.nullDate() ;
      A9485PMFin = GXutil.nullDate() ;
      A9475PMUsuCre = "" ;
      A11454PMUso = DecimalUtil.ZERO ;
      AV146Horas = DecimalUtil.ZERO ;
      A13013PMUsoMts = DecimalUtil.ZERO ;
      A14272PMTipoDsc = "" ;
      A11455PMTie = DecimalUtil.ZERO ;
      A11456PMPla = "" ;
      A9483PMTxt = "" ;
      AV143Fecha1 = GXutil.nullDate() ;
      AV144Fecha2 = GXutil.nullDate() ;
      AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = "" ;
      AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = "" ;
      AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel = "" ;
      AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = "" ;
      AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel = "" ;
      AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = "" ;
      AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel = "" ;
      AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre = GXutil.nullDate() ;
      AV183Mantenimientomaquina_tmprevewwds_12_tfpmini = GXutil.nullDate() ;
      AV184Mantenimientomaquina_tmprevewwds_13_tfpmult = GXutil.nullDate() ;
      AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin = GXutil.nullDate() ;
      AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = "" ;
      AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel = "" ;
      AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso = DecimalUtil.ZERO ;
      AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to = DecimalUtil.ZERO ;
      AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts = DecimalUtil.ZERO ;
      AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to = DecimalUtil.ZERO ;
      AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = "" ;
      AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel = "" ;
      AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie = DecimalUtil.ZERO ;
      AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to = DecimalUtil.ZERO ;
      AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = "" ;
      AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel = "" ;
      AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = "" ;
      AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel = "" ;
      scmdbuf = "" ;
      lV172Mantenimientomaquina_tmprevewwds_1_filterfulltext = "" ;
      lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc = "" ;
      lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod = "" ;
      lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc = "" ;
      lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre = "" ;
      lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc = "" ;
      lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla = "" ;
      lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt = "" ;
      H00RB2_A14271PMTipoID = new short[1] ;
      H00RB2_A9483PMTxt = new String[] {""} ;
      H00RB2_n9483PMTxt = new boolean[] {false} ;
      H00RB2_A11456PMPla = new String[] {""} ;
      H00RB2_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB2_A9488PMOrd = new int[1] ;
      H00RB2_n9488PMOrd = new boolean[] {false} ;
      H00RB2_A14272PMTipoDsc = new String[] {""} ;
      H00RB2_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB2_n13013PMUsoMts = new boolean[] {false} ;
      H00RB2_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB2_n11454PMUso = new boolean[] {false} ;
      H00RB2_A14275PMDiasPavi = new short[1] ;
      H00RB2_n14275PMDiasPavi = new boolean[] {false} ;
      H00RB2_A9487PMDias = new short[1] ;
      H00RB2_n9487PMDias = new boolean[] {false} ;
      H00RB2_A9475PMUsuCre = new String[] {""} ;
      H00RB2_n9475PMUsuCre = new boolean[] {false} ;
      H00RB2_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB2_n9485PMFin = new boolean[] {false} ;
      H00RB2_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB2_n9486PMUlt = new boolean[] {false} ;
      H00RB2_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB2_n9484PMIni = new boolean[] {false} ;
      H00RB2_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB2_n9474PMFchCre = new boolean[] {false} ;
      H00RB2_A9478PMEst = new String[] {""} ;
      H00RB2_n9478PMEst = new boolean[] {false} ;
      H00RB2_A9477PMMaqDsc = new String[] {""} ;
      H00RB2_n9477PMMaqDsc = new boolean[] {false} ;
      H00RB2_A9476PMMaqCod = new String[] {""} ;
      H00RB2_n9476PMMaqCod = new boolean[] {false} ;
      H00RB2_A9473PMDsc = new String[] {""} ;
      H00RB2_n9473PMDsc = new boolean[] {false} ;
      H00RB2_A9429PMCod = new int[1] ;
      H00RB2_A407EmprNom = new String[] {""} ;
      H00RB2_n407EmprNom = new boolean[] {false} ;
      H00RB2_A396EmprCod = new String[] {""} ;
      H00RB3_A14271PMTipoID = new short[1] ;
      H00RB3_A9483PMTxt = new String[] {""} ;
      H00RB3_n9483PMTxt = new boolean[] {false} ;
      H00RB3_A11456PMPla = new String[] {""} ;
      H00RB3_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB3_A9488PMOrd = new int[1] ;
      H00RB3_n9488PMOrd = new boolean[] {false} ;
      H00RB3_A14272PMTipoDsc = new String[] {""} ;
      H00RB3_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB3_n13013PMUsoMts = new boolean[] {false} ;
      H00RB3_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB3_n11454PMUso = new boolean[] {false} ;
      H00RB3_A14275PMDiasPavi = new short[1] ;
      H00RB3_n14275PMDiasPavi = new boolean[] {false} ;
      H00RB3_A9487PMDias = new short[1] ;
      H00RB3_n9487PMDias = new boolean[] {false} ;
      H00RB3_A9475PMUsuCre = new String[] {""} ;
      H00RB3_n9475PMUsuCre = new boolean[] {false} ;
      H00RB3_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB3_n9485PMFin = new boolean[] {false} ;
      H00RB3_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB3_n9486PMUlt = new boolean[] {false} ;
      H00RB3_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB3_n9484PMIni = new boolean[] {false} ;
      H00RB3_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB3_n9474PMFchCre = new boolean[] {false} ;
      H00RB3_A9478PMEst = new String[] {""} ;
      H00RB3_n9478PMEst = new boolean[] {false} ;
      H00RB3_A9477PMMaqDsc = new String[] {""} ;
      H00RB3_n9477PMMaqDsc = new boolean[] {false} ;
      H00RB3_A9476PMMaqCod = new String[] {""} ;
      H00RB3_n9476PMMaqCod = new boolean[] {false} ;
      H00RB3_A9473PMDsc = new String[] {""} ;
      H00RB3_n9473PMDsc = new boolean[] {false} ;
      H00RB3_A9429PMCod = new int[1] ;
      H00RB3_A407EmprNom = new String[] {""} ;
      H00RB3_n407EmprNom = new boolean[] {false} ;
      H00RB3_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV43Station = "" ;
      AV20EmprNom = "" ;
      AV82UsurCod = "" ;
      AV110FechaHoy = GXutil.nullDate() ;
      AV29HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV83WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV42Session = httpContext.getWebSession();
      AV7ColumnsSelectorXML = "" ;
      GXt_decimal8 = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV33ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV81UserCustomValue = "" ;
      AV6ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV85EmprCod_Selected = "" ;
      AV35mensaje = "" ;
      AV151CCVPSW = "" ;
      AV105WebSession = httpContext.getWebSession();
      AV106Window = new com.genexus.webpanels.GXWindow();
      GXv_int14 = new byte[1] ;
      GXv_int17 = new int[1] ;
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char3 = new String[1] ;
      AV138OldGridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV78TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV142GroupPMMaqDsc = "" ;
      AV134GroupPMEst = "" ;
      H00RB4_A14271PMTipoID = new short[1] ;
      H00RB4_A9483PMTxt = new String[] {""} ;
      H00RB4_n9483PMTxt = new boolean[] {false} ;
      H00RB4_A11456PMPla = new String[] {""} ;
      H00RB4_A11455PMTie = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB4_A9488PMOrd = new int[1] ;
      H00RB4_n9488PMOrd = new boolean[] {false} ;
      H00RB4_A14272PMTipoDsc = new String[] {""} ;
      H00RB4_A13013PMUsoMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB4_n13013PMUsoMts = new boolean[] {false} ;
      H00RB4_A11454PMUso = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00RB4_n11454PMUso = new boolean[] {false} ;
      H00RB4_A14275PMDiasPavi = new short[1] ;
      H00RB4_n14275PMDiasPavi = new boolean[] {false} ;
      H00RB4_A9487PMDias = new short[1] ;
      H00RB4_n9487PMDias = new boolean[] {false} ;
      H00RB4_A9475PMUsuCre = new String[] {""} ;
      H00RB4_n9475PMUsuCre = new boolean[] {false} ;
      H00RB4_A9485PMFin = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB4_n9485PMFin = new boolean[] {false} ;
      H00RB4_A9486PMUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB4_n9486PMUlt = new boolean[] {false} ;
      H00RB4_A9484PMIni = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB4_n9484PMIni = new boolean[] {false} ;
      H00RB4_A9474PMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00RB4_n9474PMFchCre = new boolean[] {false} ;
      H00RB4_A9477PMMaqDsc = new String[] {""} ;
      H00RB4_n9477PMMaqDsc = new boolean[] {false} ;
      H00RB4_A9476PMMaqCod = new String[] {""} ;
      H00RB4_n9476PMMaqCod = new boolean[] {false} ;
      H00RB4_A9473PMDsc = new String[] {""} ;
      H00RB4_n9473PMDsc = new boolean[] {false} ;
      H00RB4_A9429PMCod = new int[1] ;
      H00RB4_A9478PMEst = new String[] {""} ;
      H00RB4_n9478PMEst = new boolean[] {false} ;
      H00RB4_A396EmprCod = new String[] {""} ;
      AV132RecordKey = "" ;
      H00RB5_A396EmprCod = new String[] {""} ;
      H00RB5_A606MaqDsc = new String[] {""} ;
      H00RB5_n606MaqDsc = new boolean[] {false} ;
      H00RB5_A602MaqCod = new String[] {""} ;
      A606MaqDsc = "" ;
      A602MaqCod = "" ;
      AV168Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      ucDvelop_confirmpanel_generarordenesop = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_generarordenes = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_duplicartarea = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmpreveww__default(),
         new Object[] {
             new Object[] {
            H00RB2_A14271PMTipoID, H00RB2_A9483PMTxt, H00RB2_n9483PMTxt, H00RB2_A11456PMPla, H00RB2_A11455PMTie, H00RB2_A9488PMOrd, H00RB2_n9488PMOrd, H00RB2_A14272PMTipoDsc, H00RB2_A13013PMUsoMts, H00RB2_n13013PMUsoMts,
            H00RB2_A11454PMUso, H00RB2_n11454PMUso, H00RB2_A14275PMDiasPavi, H00RB2_n14275PMDiasPavi, H00RB2_A9487PMDias, H00RB2_n9487PMDias, H00RB2_A9475PMUsuCre, H00RB2_n9475PMUsuCre, H00RB2_A9485PMFin, H00RB2_n9485PMFin,
            H00RB2_A9486PMUlt, H00RB2_n9486PMUlt, H00RB2_A9484PMIni, H00RB2_n9484PMIni, H00RB2_A9474PMFchCre, H00RB2_n9474PMFchCre, H00RB2_A9478PMEst, H00RB2_n9478PMEst, H00RB2_A9477PMMaqDsc, H00RB2_n9477PMMaqDsc,
            H00RB2_A9476PMMaqCod, H00RB2_n9476PMMaqCod, H00RB2_A9473PMDsc, H00RB2_n9473PMDsc, H00RB2_A9429PMCod, H00RB2_A407EmprNom, H00RB2_n407EmprNom, H00RB2_A396EmprCod
            }
            , new Object[] {
            H00RB3_A14271PMTipoID, H00RB3_A9483PMTxt, H00RB3_n9483PMTxt, H00RB3_A11456PMPla, H00RB3_A11455PMTie, H00RB3_A9488PMOrd, H00RB3_n9488PMOrd, H00RB3_A14272PMTipoDsc, H00RB3_A13013PMUsoMts, H00RB3_n13013PMUsoMts,
            H00RB3_A11454PMUso, H00RB3_n11454PMUso, H00RB3_A14275PMDiasPavi, H00RB3_n14275PMDiasPavi, H00RB3_A9487PMDias, H00RB3_n9487PMDias, H00RB3_A9475PMUsuCre, H00RB3_n9475PMUsuCre, H00RB3_A9485PMFin, H00RB3_n9485PMFin,
            H00RB3_A9486PMUlt, H00RB3_n9486PMUlt, H00RB3_A9484PMIni, H00RB3_n9484PMIni, H00RB3_A9474PMFchCre, H00RB3_n9474PMFchCre, H00RB3_A9478PMEst, H00RB3_n9478PMEst, H00RB3_A9477PMMaqDsc, H00RB3_n9477PMMaqDsc,
            H00RB3_A9476PMMaqCod, H00RB3_n9476PMMaqCod, H00RB3_A9473PMDsc, H00RB3_n9473PMDsc, H00RB3_A9429PMCod, H00RB3_A407EmprNom, H00RB3_n407EmprNom, H00RB3_A396EmprCod
            }
            , new Object[] {
            H00RB4_A14271PMTipoID, H00RB4_A9483PMTxt, H00RB4_n9483PMTxt, H00RB4_A11456PMPla, H00RB4_A11455PMTie, H00RB4_A9488PMOrd, H00RB4_n9488PMOrd, H00RB4_A14272PMTipoDsc, H00RB4_A13013PMUsoMts, H00RB4_n13013PMUsoMts,
            H00RB4_A11454PMUso, H00RB4_n11454PMUso, H00RB4_A14275PMDiasPavi, H00RB4_n14275PMDiasPavi, H00RB4_A9487PMDias, H00RB4_n9487PMDias, H00RB4_A9475PMUsuCre, H00RB4_n9475PMUsuCre, H00RB4_A9485PMFin, H00RB4_n9485PMFin,
            H00RB4_A9486PMUlt, H00RB4_n9486PMUlt, H00RB4_A9484PMIni, H00RB4_n9484PMIni, H00RB4_A9474PMFchCre, H00RB4_n9474PMFchCre, H00RB4_A9477PMMaqDsc, H00RB4_n9477PMMaqDsc, H00RB4_A9476PMMaqCod, H00RB4_n9476PMMaqCod,
            H00RB4_A9473PMDsc, H00RB4_n9473PMDsc, H00RB4_A9429PMCod, H00RB4_A9478PMEst, H00RB4_n9478PMEst, H00RB4_A396EmprCod
            }
            , new Object[] {
            H00RB5_A396EmprCod, H00RB5_A606MaqDsc, H00RB5_n606MaqDsc, H00RB5_A602MaqCod
            }
         }
      );
      AV171Pgmname = "MantenimientoMaquina.TMPreveWW" ;
      /* GeneXus formulas. */
      AV171Pgmname = "MantenimientoMaquina.TMPreveWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      edtavGrid_groupcaption_Enabled = 0 ;
      edtavHoras_Enabled = 0 ;
      edtavPmusomts_Enabled = 0 ;
      edtavCrearorden_Enabled = 0 ;
      edtavFecha1_Enabled = 0 ;
      edtavFecha2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV32ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte AV145CrearOrden ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV36Ok ;
   private byte AV152Existepswpsb ;
   private byte GXt_int16 ;
   private byte GXv_int14[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV46TFPMDias ;
   private short AV47TFPMDias_To ;
   private short AV154TFPMDiasPaviso ;
   private short AV155TFPMDiasPaviso_To ;
   private short AV37OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV129GridActions ;
   private short A9487PMDias ;
   private short A14275PMDiasPavi ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias ;
   private short AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ;
   private short AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ;
   private short AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ;
   private short A14271PMTipoID ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int AV44TFPMCod ;
   private int AV45TFPMCod_To ;
   private int AV62TFPMOrd ;
   private int AV63TFPMOrd_To ;
   private int AV149Nrg1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Grid_group_Columnindex ;
   private int edtavPgmname_Enabled ;
   private int A9429PMCod ;
   private int A9488PMOrd ;
   private int subGrid_Islastpage ;
   private int edtavExpand_Enabled ;
   private int edtavGrid_groupcaption_Enabled ;
   private int edtavHoras_Enabled ;
   private int edtavPmusomts_Enabled ;
   private int edtavCrearorden_Enabled ;
   private int edtavFecha1_Enabled ;
   private int edtavFecha2_Enabled ;
   private int AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod ;
   private int AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ;
   private int AV198Mantenimientomaquina_tmprevewwds_27_tfpmord ;
   private int AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to ;
   private int AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ;
   private int AV135GridCollapsedRecordsChildren_size ;
   private int edtPMCod_Visible ;
   private int edtPMDsc_Visible ;
   private int edtPMMaqCod_Visible ;
   private int edtPMMaqDsc_Visible ;
   private int edtavMaqcod_Visible ;
   private int edtPMFchCre_Visible ;
   private int edtPMIni_Visible ;
   private int edtPMUlt_Visible ;
   private int edtPMFin_Visible ;
   private int edtPMUsuCre_Visible ;
   private int edtPMDias_Visible ;
   private int edtPMDiasPavi_Visible ;
   private int edtPMUso_Visible ;
   private int edtavHoras_Visible ;
   private int edtPMUsoMts_Visible ;
   private int edtavPmusomts_Visible ;
   private int edtavCrearorden_Visible ;
   private int edtPMTipoDsc_Visible ;
   private int edtPMOrd_Visible ;
   private int edtPMTie_Visible ;
   private int edtPMPla_Visible ;
   private int edtPMTxt_Visible ;
   private int AV40PageToGo ;
   private int AV206GXV1 ;
   private int AV86PMCod_Selected ;
   private int nGXsfl_55_fel_idx=1 ;
   private int GXv_int17[] ;
   private int AV210GXV2 ;
   private int AV211GXV3 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavExpand_Visible ;
   private int edtavGrid_groupcaption_Visible ;
   private int edtavMaqcod_Enabled ;
   private int edtavFecha1_Visible ;
   private int edtavFecha2_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV137Index ;
   private java.math.BigDecimal AV72TFPMUso ;
   private java.math.BigDecimal AV73TFPMUso_To ;
   private java.math.BigDecimal AV74TFPMUsoMts ;
   private java.math.BigDecimal AV75TFPMUsoMts_To ;
   private java.math.BigDecimal AV66TFPMTie ;
   private java.math.BigDecimal AV67TFPMTie_To ;
   private java.math.BigDecimal AV150PMUsoMts ;
   private java.math.BigDecimal A11454PMUso ;
   private java.math.BigDecimal AV146Horas ;
   private java.math.BigDecimal A13013PMUsoMts ;
   private java.math.BigDecimal A11455PMTie ;
   private java.math.BigDecimal AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso ;
   private java.math.BigDecimal AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ;
   private java.math.BigDecimal AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts ;
   private java.math.BigDecimal AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ;
   private java.math.BigDecimal AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie ;
   private java.math.BigDecimal AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ;
   private java.math.BigDecimal GXt_decimal8 ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_duplicartarea_Result ;
   private String Dvelop_confirmpanel_generarordenes_Result ;
   private String Dvelop_confirmpanel_generarordenesop_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_55_idx="0001" ;
   private String AV48TFPMDsc ;
   private String AV49TFPMDsc_Sel ;
   private String AV58TFPMMaqCod ;
   private String AV59TFPMMaqCod_Sel ;
   private String AV60TFPMMaqDsc ;
   private String AV61TFPMMaqDsc_Sel ;
   private String AV76TFPMUsuCre ;
   private String AV77TFPMUsuCre_Sel ;
   private String AV156TFPMTipoDsc ;
   private String AV157TFPMTipoDsc_Sel ;
   private String AV64TFPMPla ;
   private String AV65TFPMPla_Sel ;
   private String AV171Pgmname ;
   private String AV19EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Titlecontrolidtoreplace ;
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
   private String Dvelop_confirmpanel_duplicartarea_Title ;
   private String Dvelop_confirmpanel_duplicartarea_Confirmationtext ;
   private String Dvelop_confirmpanel_duplicartarea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_duplicartarea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_duplicartarea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_duplicartarea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_duplicartarea_Confirmtype ;
   private String Dvelop_confirmpanel_generarordenes_Title ;
   private String Dvelop_confirmpanel_generarordenes_Confirmationtext ;
   private String Dvelop_confirmpanel_generarordenes_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_generarordenes_Nobuttoncaption ;
   private String Dvelop_confirmpanel_generarordenes_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_generarordenes_Yesbuttonposition ;
   private String Dvelop_confirmpanel_generarordenes_Confirmtype ;
   private String Dvelop_confirmpanel_generarordenesop_Title ;
   private String Dvelop_confirmpanel_generarordenesop_Confirmationtext ;
   private String Dvelop_confirmpanel_generarordenesop_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_generarordenesop_Nobuttoncaption ;
   private String Dvelop_confirmpanel_generarordenesop_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_generarordenesop_Yesbuttonposition ;
   private String Dvelop_confirmpanel_generarordenesop_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String bttBtngenerarordenes_Internalname ;
   private String bttBtngenerarordenes_Jsonclick ;
   private String bttBtngenerarordenesop_Internalname ;
   private String bttBtngenerarordenesop_Jsonclick ;
   private String bttBtngenerarordenesoptodos_Internalname ;
   private String bttBtngenerarordenesoptodos_Jsonclick ;
   private String bttBtngenerarordenesopninguno_Internalname ;
   private String bttBtngenerarordenesopninguno_Jsonclick ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_group_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_pmfchcreauxdates_Internalname ;
   private String edtavDdo_pmfchcreauxdate_Internalname ;
   private String edtavDdo_pmfchcreauxdate_Jsonclick ;
   private String divDdo_pminiauxdates_Internalname ;
   private String edtavDdo_pminiauxdate_Internalname ;
   private String edtavDdo_pminiauxdate_Jsonclick ;
   private String divDdo_pmultauxdates_Internalname ;
   private String edtavDdo_pmultauxdate_Internalname ;
   private String edtavDdo_pmultauxdate_Jsonclick ;
   private String divDdo_pmfinauxdates_Internalname ;
   private String edtavDdo_pmfinauxdate_Internalname ;
   private String edtavDdo_pmfinauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV141Expand ;
   private String edtavExpand_Internalname ;
   private String edtavGrid_groupcaption_Internalname ;
   private String AV153Sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtPMCod_Internalname ;
   private String A9473PMDsc ;
   private String edtPMDsc_Internalname ;
   private String A9476PMMaqCod ;
   private String edtPMMaqCod_Internalname ;
   private String A9477PMMaqDsc ;
   private String edtPMMaqDsc_Internalname ;
   private String AV34MaqCod ;
   private String edtavMaqcod_Internalname ;
   private String A9478PMEst ;
   private String edtPMFchCre_Internalname ;
   private String edtPMIni_Internalname ;
   private String edtPMUlt_Internalname ;
   private String edtPMFin_Internalname ;
   private String A9475PMUsuCre ;
   private String edtPMUsuCre_Internalname ;
   private String edtPMDias_Internalname ;
   private String edtPMDiasPavi_Internalname ;
   private String edtPMUso_Internalname ;
   private String edtavHoras_Internalname ;
   private String edtPMUsoMts_Internalname ;
   private String edtavPmusomts_Internalname ;
   private String edtavCrearorden_Internalname ;
   private String A14272PMTipoDsc ;
   private String edtPMTipoDsc_Internalname ;
   private String edtPMOrd_Internalname ;
   private String edtPMTie_Internalname ;
   private String A11456PMPla ;
   private String edtPMPla_Internalname ;
   private String edtPMTxt_Internalname ;
   private String edtavFecha1_Internalname ;
   private String edtavFecha2_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ;
   private String AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ;
   private String AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ;
   private String AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ;
   private String AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ;
   private String AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ;
   private String AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ;
   private String AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ;
   private String AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ;
   private String AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ;
   private String AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ;
   private String AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ;
   private String scmdbuf ;
   private String lV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ;
   private String lV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ;
   private String lV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ;
   private String lV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ;
   private String lV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ;
   private String lV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ;
   private String hsh ;
   private String AV43Station ;
   private String AV20EmprNom ;
   private String AV82UsurCod ;
   private String edtPMMaqDsc_Columnheaderclass ;
   private String edtavExpand_Columnclass ;
   private String edtPMMaqDsc_Columnclass ;
   private String AV85EmprCod_Selected ;
   private String AV151CCVPSW ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char28 ;
   private String GXv_char29[] ;
   private String GXt_char26 ;
   private String GXv_char27[] ;
   private String GXt_char24 ;
   private String GXv_char25[] ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char19 ;
   private String GXv_char4[] ;
   private String GXt_char18 ;
   private String GXv_char3[] ;
   private String AV142GroupPMMaqDsc ;
   private String AV134GroupPMEst ;
   private String A606MaqDsc ;
   private String A602MaqCod ;
   private String tblTabledvelop_confirmpanel_generarordenesop_Internalname ;
   private String Dvelop_confirmpanel_generarordenesop_Internalname ;
   private String tblTabledvelop_confirmpanel_generarordenes_Internalname ;
   private String Dvelop_confirmpanel_generarordenes_Internalname ;
   private String tblTabledvelop_confirmpanel_duplicartarea_Internalname ;
   private String Dvelop_confirmpanel_duplicartarea_Internalname ;
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
   private String edtPMCod_Jsonclick ;
   private String edtPMDsc_Jsonclick ;
   private String edtPMMaqCod_Jsonclick ;
   private String edtPMMaqDsc_Jsonclick ;
   private String edtavMaqcod_Jsonclick ;
   private String edtPMFchCre_Jsonclick ;
   private String edtPMIni_Jsonclick ;
   private String edtPMUlt_Jsonclick ;
   private String edtPMFin_Jsonclick ;
   private String edtPMUsuCre_Jsonclick ;
   private String edtPMDias_Jsonclick ;
   private String edtPMDiasPavi_Jsonclick ;
   private String edtPMUso_Jsonclick ;
   private String edtavHoras_Jsonclick ;
   private String edtPMUsoMts_Jsonclick ;
   private String edtavPmusomts_Jsonclick ;
   private String edtavCrearorden_Jsonclick ;
   private String edtPMTipoDsc_Jsonclick ;
   private String edtPMOrd_Jsonclick ;
   private String edtPMTie_Jsonclick ;
   private String edtPMPla_Jsonclick ;
   private String edtPMTxt_Jsonclick ;
   private String edtavFecha1_Jsonclick ;
   private String edtavFecha2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV52TFPMFchCre ;
   private java.util.Date AV56TFPMIni ;
   private java.util.Date AV70TFPMUlt ;
   private java.util.Date AV54TFPMFin ;
   private java.util.Date AV8DDO_PMFchCreAuxDate ;
   private java.util.Date AV12DDO_PMIniAuxDate ;
   private java.util.Date AV14DDO_PMUltAuxDate ;
   private java.util.Date AV10DDO_PMFinAuxDate ;
   private java.util.Date A9474PMFchCre ;
   private java.util.Date A9484PMIni ;
   private java.util.Date A9486PMUlt ;
   private java.util.Date A9485PMFin ;
   private java.util.Date AV143Fecha1 ;
   private java.util.Date AV144Fecha2 ;
   private java.util.Date AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ;
   private java.util.Date AV183Mantenimientomaquina_tmprevewwds_12_tfpmini ;
   private java.util.Date AV184Mantenimientomaquina_tmprevewwds_13_tfpmult ;
   private java.util.Date AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin ;
   private java.util.Date AV110FechaHoy ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV39OrderedDsc ;
   private boolean AV140AddChildren ;
   private boolean AV109Refrescar ;
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
   private boolean Combo_maqcod_Isgriditem ;
   private boolean Combo_maqcod_Emptyitem ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean Grid_empowerer_Hasrowgroups ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9473PMDsc ;
   private boolean n9476PMMaqCod ;
   private boolean n9477PMMaqDsc ;
   private boolean n9478PMEst ;
   private boolean n9474PMFchCre ;
   private boolean n9484PMIni ;
   private boolean n9486PMUlt ;
   private boolean n9485PMFin ;
   private boolean n9475PMUsuCre ;
   private boolean n9487PMDias ;
   private boolean n14275PMDiasPavi ;
   private boolean n11454PMUso ;
   private boolean n13013PMUsoMts ;
   private boolean n9488PMOrd ;
   private boolean n9483PMTxt ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV84Confirmado ;
   private boolean GXt_boolean15 ;
   private boolean Cond_result ;
   private boolean AV139DiscardFirst ;
   private boolean n606MaqDsc ;
   private String AV51TFPMEst_SelsJson ;
   private String AV7ColumnsSelectorXML ;
   private String AV33ManageFiltersXml ;
   private String AV81UserCustomValue ;
   private String AV23FilterFullText ;
   private String AV68TFPMTxt ;
   private String AV69TFPMTxt_Sel ;
   private String AV131GroupBy ;
   private String AV130Grid_GroupCaption ;
   private String AV133GroupKey ;
   private String A9483PMTxt ;
   private String AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext ;
   private String AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ;
   private String AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ;
   private String lV172Mantenimientomaquina_tmprevewwds_1_filterfulltext ;
   private String lV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ;
   private String AV22ExcelFilename ;
   private String AV21ErrorMessage ;
   private String AV35mensaje ;
   private String AV132RecordKey ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV106Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV29HTTPRequest ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_group ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_generarordenesop ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_generarordenes ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_duplicartarea ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkavSel ;
   private HTMLChoice cmbPMEst ;
   private IDataStoreProvider pr_default ;
   private short[] H00RB2_A14271PMTipoID ;
   private String[] H00RB2_A9483PMTxt ;
   private boolean[] H00RB2_n9483PMTxt ;
   private String[] H00RB2_A11456PMPla ;
   private java.math.BigDecimal[] H00RB2_A11455PMTie ;
   private int[] H00RB2_A9488PMOrd ;
   private boolean[] H00RB2_n9488PMOrd ;
   private String[] H00RB2_A14272PMTipoDsc ;
   private java.math.BigDecimal[] H00RB2_A13013PMUsoMts ;
   private boolean[] H00RB2_n13013PMUsoMts ;
   private java.math.BigDecimal[] H00RB2_A11454PMUso ;
   private boolean[] H00RB2_n11454PMUso ;
   private short[] H00RB2_A14275PMDiasPavi ;
   private boolean[] H00RB2_n14275PMDiasPavi ;
   private short[] H00RB2_A9487PMDias ;
   private boolean[] H00RB2_n9487PMDias ;
   private String[] H00RB2_A9475PMUsuCre ;
   private boolean[] H00RB2_n9475PMUsuCre ;
   private java.util.Date[] H00RB2_A9485PMFin ;
   private boolean[] H00RB2_n9485PMFin ;
   private java.util.Date[] H00RB2_A9486PMUlt ;
   private boolean[] H00RB2_n9486PMUlt ;
   private java.util.Date[] H00RB2_A9484PMIni ;
   private boolean[] H00RB2_n9484PMIni ;
   private java.util.Date[] H00RB2_A9474PMFchCre ;
   private boolean[] H00RB2_n9474PMFchCre ;
   private String[] H00RB2_A9478PMEst ;
   private boolean[] H00RB2_n9478PMEst ;
   private String[] H00RB2_A9477PMMaqDsc ;
   private boolean[] H00RB2_n9477PMMaqDsc ;
   private String[] H00RB2_A9476PMMaqCod ;
   private boolean[] H00RB2_n9476PMMaqCod ;
   private String[] H00RB2_A9473PMDsc ;
   private boolean[] H00RB2_n9473PMDsc ;
   private int[] H00RB2_A9429PMCod ;
   private String[] H00RB2_A407EmprNom ;
   private boolean[] H00RB2_n407EmprNom ;
   private String[] H00RB2_A396EmprCod ;
   private short[] H00RB3_A14271PMTipoID ;
   private String[] H00RB3_A9483PMTxt ;
   private boolean[] H00RB3_n9483PMTxt ;
   private String[] H00RB3_A11456PMPla ;
   private java.math.BigDecimal[] H00RB3_A11455PMTie ;
   private int[] H00RB3_A9488PMOrd ;
   private boolean[] H00RB3_n9488PMOrd ;
   private String[] H00RB3_A14272PMTipoDsc ;
   private java.math.BigDecimal[] H00RB3_A13013PMUsoMts ;
   private boolean[] H00RB3_n13013PMUsoMts ;
   private java.math.BigDecimal[] H00RB3_A11454PMUso ;
   private boolean[] H00RB3_n11454PMUso ;
   private short[] H00RB3_A14275PMDiasPavi ;
   private boolean[] H00RB3_n14275PMDiasPavi ;
   private short[] H00RB3_A9487PMDias ;
   private boolean[] H00RB3_n9487PMDias ;
   private String[] H00RB3_A9475PMUsuCre ;
   private boolean[] H00RB3_n9475PMUsuCre ;
   private java.util.Date[] H00RB3_A9485PMFin ;
   private boolean[] H00RB3_n9485PMFin ;
   private java.util.Date[] H00RB3_A9486PMUlt ;
   private boolean[] H00RB3_n9486PMUlt ;
   private java.util.Date[] H00RB3_A9484PMIni ;
   private boolean[] H00RB3_n9484PMIni ;
   private java.util.Date[] H00RB3_A9474PMFchCre ;
   private boolean[] H00RB3_n9474PMFchCre ;
   private String[] H00RB3_A9478PMEst ;
   private boolean[] H00RB3_n9478PMEst ;
   private String[] H00RB3_A9477PMMaqDsc ;
   private boolean[] H00RB3_n9477PMMaqDsc ;
   private String[] H00RB3_A9476PMMaqCod ;
   private boolean[] H00RB3_n9476PMMaqCod ;
   private String[] H00RB3_A9473PMDsc ;
   private boolean[] H00RB3_n9473PMDsc ;
   private int[] H00RB3_A9429PMCod ;
   private String[] H00RB3_A407EmprNom ;
   private boolean[] H00RB3_n407EmprNom ;
   private String[] H00RB3_A396EmprCod ;
   private short[] H00RB4_A14271PMTipoID ;
   private String[] H00RB4_A9483PMTxt ;
   private boolean[] H00RB4_n9483PMTxt ;
   private String[] H00RB4_A11456PMPla ;
   private java.math.BigDecimal[] H00RB4_A11455PMTie ;
   private int[] H00RB4_A9488PMOrd ;
   private boolean[] H00RB4_n9488PMOrd ;
   private String[] H00RB4_A14272PMTipoDsc ;
   private java.math.BigDecimal[] H00RB4_A13013PMUsoMts ;
   private boolean[] H00RB4_n13013PMUsoMts ;
   private java.math.BigDecimal[] H00RB4_A11454PMUso ;
   private boolean[] H00RB4_n11454PMUso ;
   private short[] H00RB4_A14275PMDiasPavi ;
   private boolean[] H00RB4_n14275PMDiasPavi ;
   private short[] H00RB4_A9487PMDias ;
   private boolean[] H00RB4_n9487PMDias ;
   private String[] H00RB4_A9475PMUsuCre ;
   private boolean[] H00RB4_n9475PMUsuCre ;
   private java.util.Date[] H00RB4_A9485PMFin ;
   private boolean[] H00RB4_n9485PMFin ;
   private java.util.Date[] H00RB4_A9486PMUlt ;
   private boolean[] H00RB4_n9486PMUlt ;
   private java.util.Date[] H00RB4_A9484PMIni ;
   private boolean[] H00RB4_n9484PMIni ;
   private java.util.Date[] H00RB4_A9474PMFchCre ;
   private boolean[] H00RB4_n9474PMFchCre ;
   private String[] H00RB4_A9477PMMaqDsc ;
   private boolean[] H00RB4_n9477PMMaqDsc ;
   private String[] H00RB4_A9476PMMaqCod ;
   private boolean[] H00RB4_n9476PMMaqCod ;
   private String[] H00RB4_A9473PMDsc ;
   private boolean[] H00RB4_n9473PMDsc ;
   private int[] H00RB4_A9429PMCod ;
   private String[] H00RB4_A9478PMEst ;
   private boolean[] H00RB4_n9478PMEst ;
   private String[] H00RB4_A396EmprCod ;
   private String[] H00RB5_A396EmprCod ;
   private String[] H00RB5_A606MaqDsc ;
   private boolean[] H00RB5_n606MaqDsc ;
   private String[] H00RB5_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV105WebSession ;
   private GXSimpleCollection<String> AV50TFPMEst_Sels ;
   private GXSimpleCollection<String> AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ;
   private GXSimpleCollection<String> AV136GridCollapsedRecords ;
   private GXSimpleCollection<String> AV135GridCollapsedRecordsChildren ;
   private GXSimpleCollection<String> AV108ObjetoRefrescar ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV31ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV167MaqCod_Data ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV5ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV6ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV16DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState AV138OldGridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV78TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV83WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV168Combo_DataItem ;
}

final  class tmpreveww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00RB2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                          int AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod ,
                                          int AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ,
                                          String AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                          String AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                          String AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                          String AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                          int AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV183Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                          java.util.Date AV184Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                          java.util.Date AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                          String AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                          String AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                          short AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias ,
                                          short AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ,
                                          short AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                          String AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                          String AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                          int AV198Mantenimientomaquina_tmprevewwds_27_tfpmord ,
                                          int AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to ,
                                          java.math.BigDecimal AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                          java.math.BigDecimal AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                          String AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                          String AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                          String AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                          String AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          String A14272PMTipoDsc ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          short AV37OrderedBy ,
                                          boolean AV39OrderedDsc ,
                                          String AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext ,
                                          int AV135GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV135GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[32];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT T1.PMTipoID, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T4.PMTipoDsc, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt, T1.PMIni," ;
      scmdbuf += " T1.PMFchCre, T1.PMEst, T3.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T2.EmprNom, T1.EmprCod FROM (((TXPMPREVE T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.PMMaqCod) INNER JOIN TXPTIPPRV T4 ON T4.EmprCod = T1.EmprCod AND T4.PMTipoID" ;
      scmdbuf += " = T1.PMTipoID)" ;
      if ( ! (0==AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int31[0] = (byte)(1) ;
      }
      if ( ! (0==AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int31[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183Mantenimientomaquina_tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV184Mantenimientomaquina_tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (0==AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( ! (0==AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! (0==AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (0==AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) && ( ! (GXutil.strcmp("", AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PMTipoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PMTipoDsc = ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (0==AV198Mantenimientomaquina_tmprevewwds_27_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (0==AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV37OrderedBy == 1 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV37OrderedBy == 1 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDsc" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMEst" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMEst DESC" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFchCre" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFchCre DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMIni" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMIni DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUlt" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUlt DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFin" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFin DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDias" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDias DESC" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi DESC" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUso" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUso DESC" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts DESC" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PMTipoDsc" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PMTipoDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMOrd" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMOrd DESC" ;
      }
      else if ( ( AV37OrderedBy == 17 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTie" ;
      }
      else if ( ( AV37OrderedBy == 17 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTie DESC" ;
      }
      else if ( ( AV37OrderedBy == 18 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMPla" ;
      }
      else if ( ( AV37OrderedBy == 18 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMPla DESC" ;
      }
      else if ( ( AV37OrderedBy == 19 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTxt" ;
      }
      else if ( ( AV37OrderedBy == 19 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTxt DESC" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_H00RB3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                          int AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod ,
                                          int AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ,
                                          String AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                          String AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                          String AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                          String AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                          int AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV183Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                          java.util.Date AV184Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                          java.util.Date AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                          String AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                          String AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                          short AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias ,
                                          short AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ,
                                          short AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                          String AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                          String AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                          int AV198Mantenimientomaquina_tmprevewwds_27_tfpmord ,
                                          int AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to ,
                                          java.math.BigDecimal AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                          java.math.BigDecimal AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                          String AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                          String AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                          String AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                          String AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          String A14272PMTipoDsc ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          short AV37OrderedBy ,
                                          boolean AV39OrderedDsc ,
                                          String AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext ,
                                          int AV135GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV135GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[32];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT T1.PMTipoID, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T4.PMTipoDsc, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt, T1.PMIni," ;
      scmdbuf += " T1.PMFchCre, T1.PMEst, T3.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T2.EmprNom, T1.EmprCod FROM (((TXPMPREVE T1 INNER JOIN TXPEMPRES T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.PMMaqCod) INNER JOIN TXPTIPPRV T4 ON T4.EmprCod = T1.EmprCod AND T4.PMTipoID" ;
      scmdbuf += " = T1.PMTipoID)" ;
      if ( ! (0==AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int34[0] = (byte)(1) ;
      }
      if ( ! (0==AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int34[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int34[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183Mantenimientomaquina_tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV184Mantenimientomaquina_tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( ! (0==AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (0==AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( ! (0==AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (0==AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) && ( ! (GXutil.strcmp("", AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PMTipoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PMTipoDsc = ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (0==AV198Mantenimientomaquina_tmprevewwds_27_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( ! (0==AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV37OrderedBy == 1 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMCod" ;
      }
      else if ( ( AV37OrderedBy == 1 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDsc" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMMaqCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMEst" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMEst DESC" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFchCre" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFchCre DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMIni" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMIni DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUlt" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUlt DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMFin" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMFin DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsuCre DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDias" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDias DESC" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMDiasPavi DESC" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUso" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUso DESC" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMUsoMts DESC" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PMTipoDsc" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PMTipoDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMOrd" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMOrd DESC" ;
      }
      else if ( ( AV37OrderedBy == 17 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTie" ;
      }
      else if ( ( AV37OrderedBy == 17 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTie DESC" ;
      }
      else if ( ( AV37OrderedBy == 18 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMPla" ;
      }
      else if ( ( AV37OrderedBy == 18 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMPla DESC" ;
      }
      else if ( ( AV37OrderedBy == 19 ) && ! AV39OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PMTxt" ;
      }
      else if ( ( AV37OrderedBy == 19 ) && ( AV39OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PMTxt DESC" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_H00RB4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9478PMEst ,
                                          GXSimpleCollection<String> AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels ,
                                          int AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod ,
                                          int AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to ,
                                          String AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel ,
                                          String AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc ,
                                          String AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel ,
                                          String AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod ,
                                          String AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel ,
                                          String AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc ,
                                          int AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size ,
                                          java.util.Date AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre ,
                                          java.util.Date AV183Mantenimientomaquina_tmprevewwds_12_tfpmini ,
                                          java.util.Date AV184Mantenimientomaquina_tmprevewwds_13_tfpmult ,
                                          java.util.Date AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin ,
                                          String AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel ,
                                          String AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre ,
                                          short AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias ,
                                          short AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to ,
                                          short AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso ,
                                          short AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to ,
                                          java.math.BigDecimal AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso ,
                                          java.math.BigDecimal AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to ,
                                          java.math.BigDecimal AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts ,
                                          java.math.BigDecimal AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to ,
                                          String AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel ,
                                          String AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc ,
                                          int AV198Mantenimientomaquina_tmprevewwds_27_tfpmord ,
                                          int AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to ,
                                          java.math.BigDecimal AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie ,
                                          java.math.BigDecimal AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to ,
                                          String AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel ,
                                          String AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla ,
                                          String AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel ,
                                          String AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt ,
                                          String AV131GroupBy ,
                                          int A9429PMCod ,
                                          String A9473PMDsc ,
                                          String A9476PMMaqCod ,
                                          String A9477PMMaqDsc ,
                                          java.util.Date A9474PMFchCre ,
                                          java.util.Date A9484PMIni ,
                                          java.util.Date A9486PMUlt ,
                                          java.util.Date A9485PMFin ,
                                          String A9475PMUsuCre ,
                                          short A9487PMDias ,
                                          short A14275PMDiasPavi ,
                                          java.math.BigDecimal A11454PMUso ,
                                          java.math.BigDecimal A13013PMUsoMts ,
                                          String A14272PMTipoDsc ,
                                          int A9488PMOrd ,
                                          java.math.BigDecimal A11455PMTie ,
                                          String A11456PMPla ,
                                          String A9483PMTxt ,
                                          String AV142GroupPMMaqDsc ,
                                          String AV134GroupPMEst ,
                                          String AV172Mantenimientomaquina_tmprevewwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[34];
      Object[] GXv_Object38 = new Object[2];
      scmdbuf = "SELECT T1.PMTipoID, T1.PMTxt, T1.PMPla, T1.PMTie, T1.PMOrd, T3.PMTipoDsc, T1.PMUsoMts, T1.PMUso, T1.PMDiasPavi, T1.PMDias, T1.PMUsuCre, T1.PMFin, T1.PMUlt, T1.PMIni," ;
      scmdbuf += " T1.PMFchCre, T2.MaqDsc AS PMMaqDsc, T1.PMMaqCod AS PMMaqCod, T1.PMDsc, T1.PMCod, T1.PMEst, T1.EmprCod FROM ((TXPMPREVE T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.MaqCod = T1.PMMaqCod) INNER JOIN TXPTIPPRV T3 ON T3.EmprCod = T1.EmprCod AND T3.PMTipoID = T1.PMTipoID)" ;
      if ( ! (0==AV173Mantenimientomaquina_tmprevewwds_2_tfpmcod) )
      {
         addWhere(sWhereString, "(T1.PMCod >= ?)");
      }
      else
      {
         GXv_int37[0] = (byte)(1) ;
      }
      if ( ! (0==AV174Mantenimientomaquina_tmprevewwds_3_tfpmcod_to) )
      {
         addWhere(sWhereString, "(T1.PMCod <= ?)");
      }
      else
      {
         GXv_int37[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) && ( ! (GXutil.strcmp("", AV175Mantenimientomaquina_tmprevewwds_4_tfpmdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Mantenimientomaquina_tmprevewwds_5_tfpmdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMDsc = ?)");
      }
      else
      {
         GXv_int37[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV177Mantenimientomaquina_tmprevewwds_6_tfpmmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV178Mantenimientomaquina_tmprevewwds_7_tfpmmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMMaqCod = ?)");
      }
      else
      {
         GXv_int37[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV179Mantenimientomaquina_tmprevewwds_8_tfpmmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Mantenimientomaquina_tmprevewwds_9_tfpmmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int37[7] = (byte)(1) ;
      }
      if ( AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV181Mantenimientomaquina_tmprevewwds_10_tfpmest_sels, "T1.PMEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV182Mantenimientomaquina_tmprevewwds_11_tfpmfchcre)) )
      {
         addWhere(sWhereString, "(T1.PMFchCre >= ?)");
      }
      else
      {
         GXv_int37[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV183Mantenimientomaquina_tmprevewwds_12_tfpmini)) )
      {
         addWhere(sWhereString, "(T1.PMIni >= ?)");
      }
      else
      {
         GXv_int37[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV184Mantenimientomaquina_tmprevewwds_13_tfpmult)) )
      {
         addWhere(sWhereString, "(T1.PMUlt >= ?)");
      }
      else
      {
         GXv_int37[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV185Mantenimientomaquina_tmprevewwds_14_tfpmfin)) )
      {
         addWhere(sWhereString, "(T1.PMFin >= ?)");
      }
      else
      {
         GXv_int37[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) && ( ! (GXutil.strcmp("", AV186Mantenimientomaquina_tmprevewwds_15_tfpmusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Mantenimientomaquina_tmprevewwds_16_tfpmusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsuCre = ?)");
      }
      else
      {
         GXv_int37[13] = (byte)(1) ;
      }
      if ( ! (0==AV188Mantenimientomaquina_tmprevewwds_17_tfpmdias) )
      {
         addWhere(sWhereString, "(T1.PMDias >= ?)");
      }
      else
      {
         GXv_int37[14] = (byte)(1) ;
      }
      if ( ! (0==AV189Mantenimientomaquina_tmprevewwds_18_tfpmdias_to) )
      {
         addWhere(sWhereString, "(T1.PMDias <= ?)");
      }
      else
      {
         GXv_int37[15] = (byte)(1) ;
      }
      if ( ! (0==AV190Mantenimientomaquina_tmprevewwds_19_tfpmdiaspaviso) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi >= ?)");
      }
      else
      {
         GXv_int37[16] = (byte)(1) ;
      }
      if ( ! (0==AV191Mantenimientomaquina_tmprevewwds_20_tfpmdiaspaviso_to) )
      {
         addWhere(sWhereString, "(T1.PMDiasPavi <= ?)");
      }
      else
      {
         GXv_int37[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV192Mantenimientomaquina_tmprevewwds_21_tfpmuso)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso >= ?)");
      }
      else
      {
         GXv_int37[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV193Mantenimientomaquina_tmprevewwds_22_tfpmuso_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUso <= ?)");
      }
      else
      {
         GXv_int37[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV194Mantenimientomaquina_tmprevewwds_23_tfpmusomts)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts >= ?)");
      }
      else
      {
         GXv_int37[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV195Mantenimientomaquina_tmprevewwds_24_tfpmusomts_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMUsoMts <= ?)");
      }
      else
      {
         GXv_int37[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) && ( ! (GXutil.strcmp("", AV196Mantenimientomaquina_tmprevewwds_25_tfpmtipodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PMTipoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Mantenimientomaquina_tmprevewwds_26_tfpmtipodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PMTipoDsc = ?)");
      }
      else
      {
         GXv_int37[23] = (byte)(1) ;
      }
      if ( ! (0==AV198Mantenimientomaquina_tmprevewwds_27_tfpmord) )
      {
         addWhere(sWhereString, "(T1.PMOrd >= ?)");
      }
      else
      {
         GXv_int37[24] = (byte)(1) ;
      }
      if ( ! (0==AV199Mantenimientomaquina_tmprevewwds_28_tfpmord_to) )
      {
         addWhere(sWhereString, "(T1.PMOrd <= ?)");
      }
      else
      {
         GXv_int37[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV200Mantenimientomaquina_tmprevewwds_29_tfpmtie)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie >= ?)");
      }
      else
      {
         GXv_int37[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV201Mantenimientomaquina_tmprevewwds_30_tfpmtie_to)==0) )
      {
         addWhere(sWhereString, "(T1.PMTie <= ?)");
      }
      else
      {
         GXv_int37[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) && ( ! (GXutil.strcmp("", AV202Mantenimientomaquina_tmprevewwds_31_tfpmpla)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMPla) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Mantenimientomaquina_tmprevewwds_32_tfpmpla_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMPla = ?)");
      }
      else
      {
         GXv_int37[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) && ( ! (GXutil.strcmp("", AV204Mantenimientomaquina_tmprevewwds_33_tfpmtxt)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PMTxt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Mantenimientomaquina_tmprevewwds_34_tfpmtxt_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PMTxt = ?)");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV131GroupBy, "PMMaqDsc") == 0 )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int37[32] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV131GroupBy, "PMEst") == 0 )
      {
         addWhere(sWhereString, "(T1.PMEst = ?)");
      }
      else
      {
         GXv_int37[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.PMCod" ;
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
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
                  return conditional_H00RB2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (GXSimpleCollection<String>)dynConstraints[58] );
            case 1 :
                  return conditional_H00RB3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (GXSimpleCollection<String>)dynConstraints[58] );
            case 2 :
                  return conditional_H00RB4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , (java.math.BigDecimal)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00RB2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00RB3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00RB4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00RB5", "SELECT EmprCod, MaqDsc, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(20);
               ((String[]) buf[35])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(19);
               ((String[]) buf[33])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
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
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 2000);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 2000);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 2000);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 2000);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 2000);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 2000);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

