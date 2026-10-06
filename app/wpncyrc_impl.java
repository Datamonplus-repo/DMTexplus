package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpncyrc_impl extends GXDataArea
{
   public wpncyrc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpncyrc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpncyrc_impl.class ));
   }

   public wpncyrc_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbHisEstReo = new HTMLChoice();
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
      nRC_GXsfl_46 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_46"))) ;
      nGXsfl_46_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_46_idx"))) ;
      sGXsfl_46_idx = httpContext.GetPar( "sGXsfl_46_idx") ;
      edtHisreoValo_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisreoValo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisreoValo_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtCostCausa_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Visible), 5, 0), !bGXsfl_46_Refreshing);
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
      AV130FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV44ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39ColumnsSelector);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV47TFHisEstReo_Sels);
      AV58TFHisReoFec = localUtil.parseDateParm( httpContext.GetPar( "TFHisReoFec")) ;
      AV49TFHisReoHDR = httpContext.GetPar( "TFHisReoHDR") ;
      AV50TFHisReoHDR_Sel = httpContext.GetPar( "TFHisReoHDR_Sel") ;
      AV68TFHisreoLote = httpContext.GetPar( "TFHisreoLote") ;
      AV69TFHisreoLote_Sel = httpContext.GetPar( "TFHisreoLote_Sel") ;
      AV71TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV72TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV74TFHisBarSer = httpContext.GetPar( "TFHisBarSer") ;
      AV75TFHisBarSer_Sel = httpContext.GetPar( "TFHisBarSer_Sel") ;
      AV77TFHisReoDsc = httpContext.GetPar( "TFHisReoDsc") ;
      AV78TFHisReoDsc_Sel = httpContext.GetPar( "TFHisReoDsc_Sel") ;
      AV80TFHisColNom = httpContext.GetPar( "TFHisColNom") ;
      AV81TFHisColNom_Sel = httpContext.GetPar( "TFHisColNom_Sel") ;
      AV83TFHisNomCli = httpContext.GetPar( "TFHisNomCli") ;
      AV84TFHisNomCli_Sel = httpContext.GetPar( "TFHisNomCli_Sel") ;
      AV86TFHisOpeTur = (byte)(GXutil.lval( httpContext.GetPar( "TFHisOpeTur"))) ;
      AV87TFHisOpeTur_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHisOpeTur_To"))) ;
      AV89TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV90TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV92TFHisBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarKgm"), ".") ;
      AV93TFHisBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarKgm_To"), ".") ;
      AV95TFHisBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarMtr"), ".") ;
      AV96TFHisBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisBarMtr_To"), ".") ;
      AV98TFCostCausa = CommonUtil.decimalVal( httpContext.GetPar( "TFCostCausa"), ".") ;
      AV99TFCostCausa_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCostCausa_To"), ".") ;
      AV101TFHisreoValorCausa = CommonUtil.decimalVal( httpContext.GetPar( "TFHisreoValorCausa"), ".") ;
      AV102TFHisreoValorCausa_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisreoValorCausa_To"), ".") ;
      AV104TFTipDefDsc = httpContext.GetPar( "TFTipDefDsc") ;
      AV105TFTipDefDsc_Sel = httpContext.GetPar( "TFTipDefDsc_Sel") ;
      AV107TFDscCausa = httpContext.GetPar( "TFDscCausa") ;
      AV108TFDscCausa_Sel = httpContext.GetPar( "TFDscCausa_Sel") ;
      AV110TFRps_Dsc = httpContext.GetPar( "TFRps_Dsc") ;
      AV111TFRps_Dsc_Sel = httpContext.GetPar( "TFRps_Dsc_Sel") ;
      AV113TFHisReoTn = (int)(GXutil.lval( httpContext.GetPar( "TFHisReoTn"))) ;
      AV114TFHisReoTn_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisReoTn_To"))) ;
      AV116TFHisOpecod = (int)(GXutil.lval( httpContext.GetPar( "TFHisOpecod"))) ;
      AV117TFHisOpecod_To = (int)(GXutil.lval( httpContext.GetPar( "TFHisOpecod_To"))) ;
      AV119TFHisAcCo = httpContext.GetPar( "TFHisAcCo") ;
      AV120TFHisAcCo_Sel = httpContext.GetPar( "TFHisAcCo_Sel") ;
      AV122TFHisAcCot = httpContext.GetPar( "TFHisAcCot") ;
      AV123TFHisAcCot_Sel = httpContext.GetPar( "TFHisAcCot_Sel") ;
      AV125TFHisAdEAcCo = httpContext.GetPar( "TFHisAdEAcCo") ;
      AV126TFHisAdEAcCo_Sel = httpContext.GetPar( "TFHisAdEAcCo_Sel") ;
      AV128TFHisAdEAcCt = httpContext.GetPar( "TFHisAdEAcCt") ;
      AV129TFHisAdEAcCt_Sel = httpContext.GetPar( "TFHisAdEAcCt_Sel") ;
      AV148TFHisTipArtDsc = httpContext.GetPar( "TFHisTipArtDsc") ;
      AV149TFHisTipArtDsc_Sel = httpContext.GetPar( "TFHisTipArtDsc_Sel") ;
      AV150TFHisTipColDsc = httpContext.GetPar( "TFHisTipColDsc") ;
      AV151TFHisTipColDsc_Sel = httpContext.GetPar( "TFHisTipColDsc_Sel") ;
      AV206Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtHisreoValo_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisreoValo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisreoValo_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtCostCausa_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Visible), 5, 0), !bGXsfl_46_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, A396EmprCod, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV47TFHisEstReo_Sels, AV58TFHisReoFec, AV49TFHisReoHDR, AV50TFHisReoHDR_Sel, AV68TFHisreoLote, AV69TFHisreoLote_Sel, AV71TFCliNom, AV72TFCliNom_Sel, AV74TFHisBarSer, AV75TFHisBarSer_Sel, AV77TFHisReoDsc, AV78TFHisReoDsc_Sel, AV80TFHisColNom, AV81TFHisColNom_Sel, AV83TFHisNomCli, AV84TFHisNomCli_Sel, AV86TFHisOpeTur, AV87TFHisOpeTur_To, AV89TFMaqCod, AV90TFMaqCod_Sel, AV92TFHisBarKgm, AV93TFHisBarKgm_To, AV95TFHisBarMtr, AV96TFHisBarMtr_To, AV98TFCostCausa, AV99TFCostCausa_To, AV101TFHisreoValorCausa, AV102TFHisreoValorCausa_To, AV104TFTipDefDsc, AV105TFTipDefDsc_Sel, AV107TFDscCausa, AV108TFDscCausa_Sel, AV110TFRps_Dsc, AV111TFRps_Dsc_Sel, AV113TFHisReoTn, AV114TFHisReoTn_To, AV116TFHisOpecod, AV117TFHisOpecod_To, AV119TFHisAcCo, AV120TFHisAcCo_Sel, AV122TFHisAcCot, AV123TFHisAcCot_Sel, AV125TFHisAdEAcCo, AV126TFHisAdEAcCo_Sel, AV128TFHisAdEAcCt, AV129TFHisAdEAcCt_Sel, AV148TFHisTipArtDsc, AV149TFHisTipArtDsc_Sel, AV150TFHisTipColDsc, AV151TFHisTipColDsc_Sel, AV206Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      paDW2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDW2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpncyrc", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV206Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV130FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_46", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_46, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV54GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV55GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV52DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV44ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFHISESTREO_SELS", AV47TFHisEstReo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFHISESTREO_SELS", AV47TFHisEstReo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOFEC", localUtil.dtoc( AV58TFHisReoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOHDR", GXutil.rtrim( AV49TFHisReoHDR));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOHDR_SEL", GXutil.rtrim( AV50TFHisReoHDR_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOLOTE", GXutil.rtrim( AV68TFHisreoLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOLOTE_SEL", GXutil.rtrim( AV69TFHisreoLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV71TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV72TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISBARSER", GXutil.rtrim( AV74TFHisBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISBARSER_SEL", GXutil.rtrim( AV75TFHisBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREODSC", GXutil.rtrim( AV77TFHisReoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREODSC_SEL", GXutil.rtrim( AV78TFHisReoDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISCOLNOM", GXutil.rtrim( AV80TFHisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISCOLNOM_SEL", GXutil.rtrim( AV81TFHisColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISNOMCLI", GXutil.rtrim( AV83TFHisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISNOMCLI_SEL", GXutil.rtrim( AV84TFHisNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISOPETUR", GXutil.ltrim( localUtil.ntoc( AV86TFHisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISOPETUR_TO", GXutil.ltrim( localUtil.ntoc( AV87TFHisOpeTur_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV89TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV90TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISBARKGM", GXutil.ltrim( localUtil.ntoc( AV92TFHisBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV93TFHisBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISBARMTR", GXutil.ltrim( localUtil.ntoc( AV95TFHisBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV96TFHisBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOSTCAUSA", GXutil.ltrim( localUtil.ntoc( AV98TFCostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOSTCAUSA_TO", GXutil.ltrim( localUtil.ntoc( AV99TFCostCausa_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOVALORCAUSA", GXutil.ltrim( localUtil.ntoc( AV101TFHisreoValorCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOVALORCAUSA_TO", GXutil.ltrim( localUtil.ntoc( AV102TFHisreoValorCausa_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPDEFDSC", GXutil.rtrim( AV104TFTipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPDEFDSC_SEL", GXutil.rtrim( AV105TFTipDefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDSCCAUSA", GXutil.rtrim( AV107TFDscCausa));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDSCCAUSA_SEL", GXutil.rtrim( AV108TFDscCausa_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRPS_DSC", GXutil.rtrim( AV110TFRps_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRPS_DSC_SEL", GXutil.rtrim( AV111TFRps_Dsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOTN", GXutil.ltrim( localUtil.ntoc( AV113TFHisReoTn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISREOTN_TO", GXutil.ltrim( localUtil.ntoc( AV114TFHisReoTn_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISOPECOD", GXutil.ltrim( localUtil.ntoc( AV116TFHisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV117TFHisOpecod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISACCO", AV119TFHisAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISACCO_SEL", AV120TFHisAcCo_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISACCOT", AV122TFHisAcCot);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISACCOT_SEL", AV123TFHisAcCot_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISADEACCO", AV125TFHisAdEAcCo);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISADEACCO_SEL", AV126TFHisAdEAcCo_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISADEACCT", AV128TFHisAdEAcCt);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISADEACCT_SEL", AV129TFHisAdEAcCt_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISTIPARTDSC", GXutil.rtrim( AV148TFHisTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISTIPARTDSC_SEL", GXutil.rtrim( AV149TFHisTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISTIPCOLDSC", GXutil.rtrim( AV150TFHisTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISTIPCOLDSC_SEL", GXutil.rtrim( AV151TFHisTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV206Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV206Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "RPS_COD", GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISTIPCOL", GXutil.ltrim( localUtil.ntoc( A572HisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISESTREO_SELSJSON", AV46TFHisEstReo_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "TIPDEFCOD", GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "HISREOVALO_Visible", GXutil.ltrim( localUtil.ntoc( edtHisreoValo_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COSTCAUSA_Visible", GXutil.ltrim( localUtil.ntoc( edtCostCausa_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         weDW2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDW2( ) ;
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
      return formatLink("app.wpncyrc", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WPNcyRc" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " HISTORICO REOPERADOS", "") ;
   }

   public void wbDW0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPNcyRc.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPNcyRc.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 46, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPNcyRc.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_DW2( true) ;
      }
      else
      {
         wb_table1_23_DW2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_DW2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol46( ) ;
      }
      if ( wbEnd == 46 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_46 = (int)(nGXsfl_46_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV39ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisreofecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisreofecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisreofecauxdate_Internalname, localUtil.format(AV139DDO_HisReoFecAuxDate, "99/99/99"), localUtil.format( AV139DDO_HisReoFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisreofecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPNcyRc.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisreofecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPNcyRc.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 46 )
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

   public void startDW2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " HISTORICO REOPERADOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDW0( ) ;
   }

   public void wsDW2( )
   {
      startDW2( ) ;
      evtDW2( ) ;
   }

   public void evtDW2( )
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
                           e11DW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12DW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13DW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14DW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15DW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e16DW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e17DW2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_46_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_462( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV147GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV147GridActions), 4, 0));
                           AV131Informe = httpContext.cgiGet( edtavInforme_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInforme_Internalname, AV131Informe);
                           cmbHisEstReo.setName( cmbHisEstReo.getInternalname() );
                           cmbHisEstReo.setValue( httpContext.cgiGet( cmbHisEstReo.getInternalname()) );
                           A548HisEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbHisEstReo.getInternalname()))) ;
                           n548HisEstReo = false ;
                           A569HisReoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisReoFec_Internalname), 0)) ;
                           n569HisReoFec = false ;
                           A13697HisReoHDR = httpContext.cgiGet( edtHisReoHDR_Internalname) ;
                           A539HisBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A545HisCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A544HisCodPar = httpContext.cgiGet( edtHisCodPar_Internalname) ;
                           A13698HisreoLote = httpContext.cgiGet( edtHisreoLote_Internalname) ;
                           n13698HisreoLote = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A542HisBarSer = httpContext.cgiGet( edtHisBarSer_Internalname) ;
                           n542HisBarSer = false ;
                           A2299HisReoDsc = httpContext.cgiGet( edtHisReoDsc_Internalname) ;
                           n2299HisReoDsc = false ;
                           A546HisColNom = httpContext.cgiGet( edtHisColNom_Internalname) ;
                           n546HisColNom = false ;
                           A8889HisNomCli = httpContext.cgiGet( edtHisNomCli_Internalname) ;
                           n8889HisNomCli = false ;
                           A12950HisOpeTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisOpeTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n12950HisOpeTur = false ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           n602MaqCod = false ;
                           A540HisBarKgm = localUtil.ctond( httpContext.cgiGet( edtHisBarKgm_Internalname)) ;
                           n540HisBarKgm = false ;
                           A541HisBarMtr = localUtil.ctond( httpContext.cgiGet( edtHisBarMtr_Internalname)) ;
                           n541HisBarMtr = false ;
                           A13699CostCausa = localUtil.ctond( httpContext.cgiGet( edtCostCausa_Internalname)) ;
                           n13699CostCausa = false ;
                           A13700HisreoValo = localUtil.ctond( httpContext.cgiGet( edtHisreoValo_Internalname)) ;
                           A834TipDefDsc = httpContext.cgiGet( edtTipDefDsc_Internalname) ;
                           n834TipDefDsc = false ;
                           A5086DscCausa = httpContext.cgiGet( edtDscCausa_Internalname) ;
                           n5086DscCausa = false ;
                           A7001Rps_Dsc = httpContext.cgiGet( edtRps_Dsc_Internalname) ;
                           n7001Rps_Dsc = false ;
                           A2297HisReoTn = (int)(localUtil.ctol( httpContext.cgiGet( edtHisReoTn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2297HisReoTn = false ;
                           A12949HisOpecod = (int)(localUtil.ctol( httpContext.cgiGet( edtHisOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n12949HisOpecod = false ;
                           A5662HisAcCo = httpContext.cgiGet( edtHisAcCo_Internalname) ;
                           n5662HisAcCo = false ;
                           A5693HisAcCot = httpContext.cgiGet( edtHisAcCot_Internalname) ;
                           n5693HisAcCot = false ;
                           A5694HisAdEAcCo = httpContext.cgiGet( edtHisAdEAcCo_Internalname) ;
                           n5694HisAdEAcCo = false ;
                           A5695HisAdEAcCt = httpContext.cgiGet( edtHisAdEAcCt_Internalname) ;
                           n5695HisAdEAcCt = false ;
                           A13843HisTipArtD = httpContext.cgiGet( edtHisTipArtD_Internalname) ;
                           n13843HisTipArtD = false ;
                           A13844HisTipColD = httpContext.cgiGet( edtHisTipColD_Internalname) ;
                           n13844HisTipColD = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e18DW2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e19DW2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e20DW2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21DW2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV130FilterFullText) != 0 )
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

   public void weDW2( )
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

   public void paDW2( )
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
      subsflControlProps_462( ) ;
      while ( nGXsfl_46_idx <= nRC_GXsfl_46 )
      {
         sendrow_462( ) ;
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV130FilterFullText ,
                                 String A396EmprCod ,
                                 byte AV44ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ,
                                 GXSimpleCollection<Byte> AV47TFHisEstReo_Sels ,
                                 java.util.Date AV58TFHisReoFec ,
                                 String AV49TFHisReoHDR ,
                                 String AV50TFHisReoHDR_Sel ,
                                 String AV68TFHisreoLote ,
                                 String AV69TFHisreoLote_Sel ,
                                 String AV71TFCliNom ,
                                 String AV72TFCliNom_Sel ,
                                 String AV74TFHisBarSer ,
                                 String AV75TFHisBarSer_Sel ,
                                 String AV77TFHisReoDsc ,
                                 String AV78TFHisReoDsc_Sel ,
                                 String AV80TFHisColNom ,
                                 String AV81TFHisColNom_Sel ,
                                 String AV83TFHisNomCli ,
                                 String AV84TFHisNomCli_Sel ,
                                 byte AV86TFHisOpeTur ,
                                 byte AV87TFHisOpeTur_To ,
                                 String AV89TFMaqCod ,
                                 String AV90TFMaqCod_Sel ,
                                 java.math.BigDecimal AV92TFHisBarKgm ,
                                 java.math.BigDecimal AV93TFHisBarKgm_To ,
                                 java.math.BigDecimal AV95TFHisBarMtr ,
                                 java.math.BigDecimal AV96TFHisBarMtr_To ,
                                 java.math.BigDecimal AV98TFCostCausa ,
                                 java.math.BigDecimal AV99TFCostCausa_To ,
                                 java.math.BigDecimal AV101TFHisreoValorCausa ,
                                 java.math.BigDecimal AV102TFHisreoValorCausa_To ,
                                 String AV104TFTipDefDsc ,
                                 String AV105TFTipDefDsc_Sel ,
                                 String AV107TFDscCausa ,
                                 String AV108TFDscCausa_Sel ,
                                 String AV110TFRps_Dsc ,
                                 String AV111TFRps_Dsc_Sel ,
                                 int AV113TFHisReoTn ,
                                 int AV114TFHisReoTn_To ,
                                 int AV116TFHisOpecod ,
                                 int AV117TFHisOpecod_To ,
                                 String AV119TFHisAcCo ,
                                 String AV120TFHisAcCo_Sel ,
                                 String AV122TFHisAcCot ,
                                 String AV123TFHisAcCot_Sel ,
                                 String AV125TFHisAdEAcCo ,
                                 String AV126TFHisAdEAcCo_Sel ,
                                 String AV128TFHisAdEAcCt ,
                                 String AV129TFHisAdEAcCt_Sel ,
                                 String AV148TFHisTipArtDsc ,
                                 String AV149TFHisTipArtDsc_Sel ,
                                 String AV150TFHisTipColDsc ,
                                 String AV151TFHisTipColDsc_Sel ,
                                 String AV206Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19DW2 ();
      GRID_nCurrentRecord = 0 ;
      rfDW2( ) ;
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
      rfDW2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV206Pgmname = "WPNcyRc" ;
      Gx_err = (short)(0) ;
      edtavInforme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInforme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInforme_Enabled), 5, 0), !bGXsfl_46_Refreshing);
   }

   public void rfDW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(46) ;
      /* Execute user event: Refresh */
      e19DW2 ();
      nGXsfl_46_idx = 1 ;
      sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_462( ) ;
      bGXsfl_46_Refreshing = true ;
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
         subsflControlProps_462( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A548HisEstReo) ,
                                              AV156Wpncyrcds_2_tfhisestreo_sels ,
                                              AV155Wpncyrcds_1_filterfulltext ,
                                              Integer.valueOf(AV156Wpncyrcds_2_tfhisestreo_sels.size()) ,
                                              AV157Wpncyrcds_3_tfhisreofec ,
                                              AV159Wpncyrcds_5_tfhisreohdr_sel ,
                                              AV158Wpncyrcds_4_tfhisreohdr ,
                                              AV161Wpncyrcds_7_tfhisreolote_sel ,
                                              AV160Wpncyrcds_6_tfhisreolote ,
                                              AV163Wpncyrcds_9_tfclinom_sel ,
                                              AV162Wpncyrcds_8_tfclinom ,
                                              AV165Wpncyrcds_11_tfhisbarser_sel ,
                                              AV164Wpncyrcds_10_tfhisbarser ,
                                              AV167Wpncyrcds_13_tfhisreodsc_sel ,
                                              AV166Wpncyrcds_12_tfhisreodsc ,
                                              AV169Wpncyrcds_15_tfhiscolnom_sel ,
                                              AV168Wpncyrcds_14_tfhiscolnom ,
                                              AV171Wpncyrcds_17_tfhisnomcli_sel ,
                                              AV170Wpncyrcds_16_tfhisnomcli ,
                                              Byte.valueOf(AV172Wpncyrcds_18_tfhisopetur) ,
                                              Byte.valueOf(AV173Wpncyrcds_19_tfhisopetur_to) ,
                                              AV175Wpncyrcds_21_tfmaqcod_sel ,
                                              AV174Wpncyrcds_20_tfmaqcod ,
                                              AV176Wpncyrcds_22_tfhisbarkgm ,
                                              AV177Wpncyrcds_23_tfhisbarkgm_to ,
                                              AV178Wpncyrcds_24_tfhisbarmtr ,
                                              AV179Wpncyrcds_25_tfhisbarmtr_to ,
                                              AV180Wpncyrcds_26_tfcostcausa ,
                                              AV181Wpncyrcds_27_tfcostcausa_to ,
                                              AV182Wpncyrcds_28_tfhisreovalorcausa ,
                                              AV183Wpncyrcds_29_tfhisreovalorcausa_to ,
                                              AV185Wpncyrcds_31_tftipdefdsc_sel ,
                                              AV184Wpncyrcds_30_tftipdefdsc ,
                                              AV187Wpncyrcds_33_tfdsccausa_sel ,
                                              AV186Wpncyrcds_32_tfdsccausa ,
                                              AV189Wpncyrcds_35_tfrps_dsc_sel ,
                                              AV188Wpncyrcds_34_tfrps_dsc ,
                                              Integer.valueOf(AV190Wpncyrcds_36_tfhisreotn) ,
                                              Integer.valueOf(AV191Wpncyrcds_37_tfhisreotn_to) ,
                                              Integer.valueOf(AV192Wpncyrcds_38_tfhisopecod) ,
                                              Integer.valueOf(AV193Wpncyrcds_39_tfhisopecod_to) ,
                                              AV195Wpncyrcds_41_tfhisacco_sel ,
                                              AV194Wpncyrcds_40_tfhisacco ,
                                              AV197Wpncyrcds_43_tfhisaccot_sel ,
                                              AV196Wpncyrcds_42_tfhisaccot ,
                                              AV199Wpncyrcds_45_tfhisadeacco_sel ,
                                              AV198Wpncyrcds_44_tfhisadeacco ,
                                              AV201Wpncyrcds_47_tfhisadeacct_sel ,
                                              AV200Wpncyrcds_46_tfhisadeacct ,
                                              AV203Wpncyrcds_49_tfhistipartdsc_sel ,
                                              AV202Wpncyrcds_48_tfhistipartdsc ,
                                              AV205Wpncyrcds_51_tfhistipcoldsc_sel ,
                                              AV204Wpncyrcds_50_tfhistipcoldsc ,
                                              Integer.valueOf(A539HisBarCod) ,
                                              Byte.valueOf(A545HisCodReo) ,
                                              A544HisCodPar ,
                                              A13698HisreoLote ,
                                              A279CliNom ,
                                              A542HisBarSer ,
                                              A2299HisReoDsc ,
                                              A546HisColNom ,
                                              A8889HisNomCli ,
                                              Byte.valueOf(A12950HisOpeTur) ,
                                              A602MaqCod ,
                                              A540HisBarKgm ,
                                              A541HisBarMtr ,
                                              A13699CostCausa ,
                                              A834TipDefDsc ,
                                              A5086DscCausa ,
                                              A7001Rps_Dsc ,
                                              Integer.valueOf(A2297HisReoTn) ,
                                              Integer.valueOf(A12949HisOpecod) ,
                                              A5662HisAcCo ,
                                              A5693HisAcCot ,
                                              A5694HisAdEAcCo ,
                                              A5695HisAdEAcCt ,
                                              A13843HisTipArtD ,
                                              A13844HisTipColD ,
                                              A569HisReoFec ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
         lV158Wpncyrcds_4_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV158Wpncyrcds_4_tfhisreohdr), 11, "%") ;
         lV160Wpncyrcds_6_tfhisreolote = GXutil.padr( GXutil.rtrim( AV160Wpncyrcds_6_tfhisreolote), 20, "%") ;
         lV162Wpncyrcds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV162Wpncyrcds_8_tfclinom), 30, "%") ;
         lV164Wpncyrcds_10_tfhisbarser = GXutil.padr( GXutil.rtrim( AV164Wpncyrcds_10_tfhisbarser), 16, "%") ;
         lV166Wpncyrcds_12_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV166Wpncyrcds_12_tfhisreodsc), 26, "%") ;
         lV168Wpncyrcds_14_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV168Wpncyrcds_14_tfhiscolnom), 13, "%") ;
         lV170Wpncyrcds_16_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV170Wpncyrcds_16_tfhisnomcli), 13, "%") ;
         lV174Wpncyrcds_20_tfmaqcod = GXutil.padr( GXutil.rtrim( AV174Wpncyrcds_20_tfmaqcod), 6, "%") ;
         lV184Wpncyrcds_30_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV184Wpncyrcds_30_tftipdefdsc), 30, "%") ;
         lV186Wpncyrcds_32_tfdsccausa = GXutil.padr( GXutil.rtrim( AV186Wpncyrcds_32_tfdsccausa), 60, "%") ;
         lV188Wpncyrcds_34_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV188Wpncyrcds_34_tfrps_dsc), 40, "%") ;
         lV194Wpncyrcds_40_tfhisacco = GXutil.concat( GXutil.rtrim( AV194Wpncyrcds_40_tfhisacco), "%", "") ;
         lV196Wpncyrcds_42_tfhisaccot = GXutil.concat( GXutil.rtrim( AV196Wpncyrcds_42_tfhisaccot), "%", "") ;
         lV198Wpncyrcds_44_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV198Wpncyrcds_44_tfhisadeacco), "%", "") ;
         lV200Wpncyrcds_46_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV200Wpncyrcds_46_tfhisadeacct), "%", "") ;
         lV202Wpncyrcds_48_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV202Wpncyrcds_48_tfhistipartdsc), 30, "%") ;
         lV204Wpncyrcds_50_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV204Wpncyrcds_50_tfhistipcoldsc), 30, "%") ;
         /* Using cursor H00DW2 */
         pr_default.execute(0, new Object[] {A396EmprCod, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, AV157Wpncyrcds_3_tfhisreofec, lV158Wpncyrcds_4_tfhisreohdr, AV159Wpncyrcds_5_tfhisreohdr_sel, lV160Wpncyrcds_6_tfhisreolote, AV161Wpncyrcds_7_tfhisreolote_sel, lV162Wpncyrcds_8_tfclinom, AV163Wpncyrcds_9_tfclinom_sel, lV164Wpncyrcds_10_tfhisbarser, AV165Wpncyrcds_11_tfhisbarser_sel, lV166Wpncyrcds_12_tfhisreodsc, AV167Wpncyrcds_13_tfhisreodsc_sel, lV168Wpncyrcds_14_tfhiscolnom, AV169Wpncyrcds_15_tfhiscolnom_sel, lV170Wpncyrcds_16_tfhisnomcli, AV171Wpncyrcds_17_tfhisnomcli_sel, Byte.valueOf(AV172Wpncyrcds_18_tfhisopetur), Byte.valueOf(AV173Wpncyrcds_19_tfhisopetur_to), lV174Wpncyrcds_20_tfmaqcod, AV175Wpncyrcds_21_tfmaqcod_sel, AV176Wpncyrcds_22_tfhisbarkgm, AV177Wpncyrcds_23_tfhisbarkgm_to, AV178Wpncyrcds_24_tfhisbarmtr, AV179Wpncyrcds_25_tfhisbarmtr_to, AV180Wpncyrcds_26_tfcostcausa, AV181Wpncyrcds_27_tfcostcausa_to, AV182Wpncyrcds_28_tfhisreovalorcausa, AV183Wpncyrcds_29_tfhisreovalorcausa_to, lV184Wpncyrcds_30_tftipdefdsc, AV185Wpncyrcds_31_tftipdefdsc_sel, lV186Wpncyrcds_32_tfdsccausa, AV187Wpncyrcds_33_tfdsccausa_sel, lV188Wpncyrcds_34_tfrps_dsc, AV189Wpncyrcds_35_tfrps_dsc_sel, Integer.valueOf(AV190Wpncyrcds_36_tfhisreotn), Integer.valueOf(AV191Wpncyrcds_37_tfhisreotn_to), Integer.valueOf(AV192Wpncyrcds_38_tfhisopecod), Integer.valueOf(AV193Wpncyrcds_39_tfhisopecod_to), lV194Wpncyrcds_40_tfhisacco, AV195Wpncyrcds_41_tfhisacco_sel, lV196Wpncyrcds_42_tfhisaccot, AV197Wpncyrcds_43_tfhisaccot_sel, lV198Wpncyrcds_44_tfhisadeacco, AV199Wpncyrcds_45_tfhisadeacco_sel, lV200Wpncyrcds_46_tfhisadeacct, AV201Wpncyrcds_47_tfhisadeacct_sel, lV202Wpncyrcds_48_tfhistipartdsc, AV203Wpncyrcds_49_tfhistipartdsc_sel, lV204Wpncyrcds_50_tfhistipcoldsc, AV205Wpncyrcds_51_tfhistipcoldsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_46_idx = 1 ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A252CliCod = H00DW2_A252CliCod[0] ;
            n252CliCod = H00DW2_n252CliCod[0] ;
            A571HisTipArt = H00DW2_A571HisTipArt[0] ;
            n571HisTipArt = H00DW2_n571HisTipArt[0] ;
            A5085CodCausa = H00DW2_A5085CodCausa[0] ;
            n5085CodCausa = H00DW2_n5085CodCausa[0] ;
            A7000Rps_Cod = H00DW2_A7000Rps_Cod[0] ;
            n7000Rps_Cod = H00DW2_n7000Rps_Cod[0] ;
            A572HisTipCol = H00DW2_A572HisTipCol[0] ;
            n572HisTipCol = H00DW2_n572HisTipCol[0] ;
            A833TipDefCod = H00DW2_A833TipDefCod[0] ;
            A13844HisTipColD = H00DW2_A13844HisTipColD[0] ;
            n13844HisTipColD = H00DW2_n13844HisTipColD[0] ;
            A13843HisTipArtD = H00DW2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = H00DW2_n13843HisTipArtD[0] ;
            A5695HisAdEAcCt = H00DW2_A5695HisAdEAcCt[0] ;
            n5695HisAdEAcCt = H00DW2_n5695HisAdEAcCt[0] ;
            A5694HisAdEAcCo = H00DW2_A5694HisAdEAcCo[0] ;
            n5694HisAdEAcCo = H00DW2_n5694HisAdEAcCo[0] ;
            A5693HisAcCot = H00DW2_A5693HisAcCot[0] ;
            n5693HisAcCot = H00DW2_n5693HisAcCot[0] ;
            A5662HisAcCo = H00DW2_A5662HisAcCo[0] ;
            n5662HisAcCo = H00DW2_n5662HisAcCo[0] ;
            A12949HisOpecod = H00DW2_A12949HisOpecod[0] ;
            n12949HisOpecod = H00DW2_n12949HisOpecod[0] ;
            A2297HisReoTn = H00DW2_A2297HisReoTn[0] ;
            n2297HisReoTn = H00DW2_n2297HisReoTn[0] ;
            A7001Rps_Dsc = H00DW2_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H00DW2_n7001Rps_Dsc[0] ;
            A5086DscCausa = H00DW2_A5086DscCausa[0] ;
            n5086DscCausa = H00DW2_n5086DscCausa[0] ;
            A834TipDefDsc = H00DW2_A834TipDefDsc[0] ;
            n834TipDefDsc = H00DW2_n834TipDefDsc[0] ;
            A541HisBarMtr = H00DW2_A541HisBarMtr[0] ;
            n541HisBarMtr = H00DW2_n541HisBarMtr[0] ;
            A602MaqCod = H00DW2_A602MaqCod[0] ;
            n602MaqCod = H00DW2_n602MaqCod[0] ;
            A12950HisOpeTur = H00DW2_A12950HisOpeTur[0] ;
            n12950HisOpeTur = H00DW2_n12950HisOpeTur[0] ;
            A8889HisNomCli = H00DW2_A8889HisNomCli[0] ;
            n8889HisNomCli = H00DW2_n8889HisNomCli[0] ;
            A546HisColNom = H00DW2_A546HisColNom[0] ;
            n546HisColNom = H00DW2_n546HisColNom[0] ;
            A2299HisReoDsc = H00DW2_A2299HisReoDsc[0] ;
            n2299HisReoDsc = H00DW2_n2299HisReoDsc[0] ;
            A542HisBarSer = H00DW2_A542HisBarSer[0] ;
            n542HisBarSer = H00DW2_n542HisBarSer[0] ;
            A279CliNom = H00DW2_A279CliNom[0] ;
            A13698HisreoLote = H00DW2_A13698HisreoLote[0] ;
            n13698HisreoLote = H00DW2_n13698HisreoLote[0] ;
            A569HisReoFec = H00DW2_A569HisReoFec[0] ;
            n569HisReoFec = H00DW2_n569HisReoFec[0] ;
            A548HisEstReo = H00DW2_A548HisEstReo[0] ;
            n548HisEstReo = H00DW2_n548HisEstReo[0] ;
            A544HisCodPar = H00DW2_A544HisCodPar[0] ;
            A545HisCodReo = H00DW2_A545HisCodReo[0] ;
            A539HisBarCod = H00DW2_A539HisBarCod[0] ;
            A13699CostCausa = H00DW2_A13699CostCausa[0] ;
            n13699CostCausa = H00DW2_n13699CostCausa[0] ;
            A540HisBarKgm = H00DW2_A540HisBarKgm[0] ;
            n540HisBarKgm = H00DW2_n540HisBarKgm[0] ;
            A279CliNom = H00DW2_A279CliNom[0] ;
            A13843HisTipArtD = H00DW2_A13843HisTipArtD[0] ;
            n13843HisTipArtD = H00DW2_n13843HisTipArtD[0] ;
            A13844HisTipColD = H00DW2_A13844HisTipColD[0] ;
            n13844HisTipColD = H00DW2_n13844HisTipColD[0] ;
            A834TipDefDsc = H00DW2_A834TipDefDsc[0] ;
            n834TipDefDsc = H00DW2_n834TipDefDsc[0] ;
            A5086DscCausa = H00DW2_A5086DscCausa[0] ;
            n5086DscCausa = H00DW2_n5086DscCausa[0] ;
            A13699CostCausa = H00DW2_A13699CostCausa[0] ;
            n13699CostCausa = H00DW2_n13699CostCausa[0] ;
            A7001Rps_Dsc = H00DW2_A7001Rps_Dsc[0] ;
            n7001Rps_Dsc = H00DW2_n7001Rps_Dsc[0] ;
            A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
            A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            e20DW2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(46) ;
         wbDW0( ) ;
      }
      bGXsfl_46_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDW2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV206Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV206Pgmname, ""))));
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
      AV155Wpncyrcds_1_filterfulltext = AV130FilterFullText ;
      AV156Wpncyrcds_2_tfhisestreo_sels = AV47TFHisEstReo_Sels ;
      AV157Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV158Wpncyrcds_4_tfhisreohdr = AV49TFHisReoHDR ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = AV50TFHisReoHDR_Sel ;
      AV160Wpncyrcds_6_tfhisreolote = AV68TFHisreoLote ;
      AV161Wpncyrcds_7_tfhisreolote_sel = AV69TFHisreoLote_Sel ;
      AV162Wpncyrcds_8_tfclinom = AV71TFCliNom ;
      AV163Wpncyrcds_9_tfclinom_sel = AV72TFCliNom_Sel ;
      AV164Wpncyrcds_10_tfhisbarser = AV74TFHisBarSer ;
      AV165Wpncyrcds_11_tfhisbarser_sel = AV75TFHisBarSer_Sel ;
      AV166Wpncyrcds_12_tfhisreodsc = AV77TFHisReoDsc ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = AV78TFHisReoDsc_Sel ;
      AV168Wpncyrcds_14_tfhiscolnom = AV80TFHisColNom ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = AV81TFHisColNom_Sel ;
      AV170Wpncyrcds_16_tfhisnomcli = AV83TFHisNomCli ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = AV84TFHisNomCli_Sel ;
      AV172Wpncyrcds_18_tfhisopetur = AV86TFHisOpeTur ;
      AV173Wpncyrcds_19_tfhisopetur_to = AV87TFHisOpeTur_To ;
      AV174Wpncyrcds_20_tfmaqcod = AV89TFMaqCod ;
      AV175Wpncyrcds_21_tfmaqcod_sel = AV90TFMaqCod_Sel ;
      AV176Wpncyrcds_22_tfhisbarkgm = AV92TFHisBarKgm ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = AV93TFHisBarKgm_To ;
      AV178Wpncyrcds_24_tfhisbarmtr = AV95TFHisBarMtr ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = AV96TFHisBarMtr_To ;
      AV180Wpncyrcds_26_tfcostcausa = AV98TFCostCausa ;
      AV181Wpncyrcds_27_tfcostcausa_to = AV99TFCostCausa_To ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = AV101TFHisreoValorCausa ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = AV102TFHisreoValorCausa_To ;
      AV184Wpncyrcds_30_tftipdefdsc = AV104TFTipDefDsc ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = AV105TFTipDefDsc_Sel ;
      AV186Wpncyrcds_32_tfdsccausa = AV107TFDscCausa ;
      AV187Wpncyrcds_33_tfdsccausa_sel = AV108TFDscCausa_Sel ;
      AV188Wpncyrcds_34_tfrps_dsc = AV110TFRps_Dsc ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = AV111TFRps_Dsc_Sel ;
      AV190Wpncyrcds_36_tfhisreotn = AV113TFHisReoTn ;
      AV191Wpncyrcds_37_tfhisreotn_to = AV114TFHisReoTn_To ;
      AV192Wpncyrcds_38_tfhisopecod = AV116TFHisOpecod ;
      AV193Wpncyrcds_39_tfhisopecod_to = AV117TFHisOpecod_To ;
      AV194Wpncyrcds_40_tfhisacco = AV119TFHisAcCo ;
      AV195Wpncyrcds_41_tfhisacco_sel = AV120TFHisAcCo_Sel ;
      AV196Wpncyrcds_42_tfhisaccot = AV122TFHisAcCot ;
      AV197Wpncyrcds_43_tfhisaccot_sel = AV123TFHisAcCot_Sel ;
      AV198Wpncyrcds_44_tfhisadeacco = AV125TFHisAdEAcCo ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = AV126TFHisAdEAcCo_Sel ;
      AV200Wpncyrcds_46_tfhisadeacct = AV128TFHisAdEAcCt ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = AV129TFHisAdEAcCt_Sel ;
      AV202Wpncyrcds_48_tfhistipartdsc = AV148TFHisTipArtDsc ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = AV149TFHisTipArtDsc_Sel ;
      AV204Wpncyrcds_50_tfhistipcoldsc = AV150TFHisTipColDsc ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = AV151TFHisTipColDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A548HisEstReo) ,
                                           AV156Wpncyrcds_2_tfhisestreo_sels ,
                                           AV155Wpncyrcds_1_filterfulltext ,
                                           Integer.valueOf(AV156Wpncyrcds_2_tfhisestreo_sels.size()) ,
                                           AV157Wpncyrcds_3_tfhisreofec ,
                                           AV159Wpncyrcds_5_tfhisreohdr_sel ,
                                           AV158Wpncyrcds_4_tfhisreohdr ,
                                           AV161Wpncyrcds_7_tfhisreolote_sel ,
                                           AV160Wpncyrcds_6_tfhisreolote ,
                                           AV163Wpncyrcds_9_tfclinom_sel ,
                                           AV162Wpncyrcds_8_tfclinom ,
                                           AV165Wpncyrcds_11_tfhisbarser_sel ,
                                           AV164Wpncyrcds_10_tfhisbarser ,
                                           AV167Wpncyrcds_13_tfhisreodsc_sel ,
                                           AV166Wpncyrcds_12_tfhisreodsc ,
                                           AV169Wpncyrcds_15_tfhiscolnom_sel ,
                                           AV168Wpncyrcds_14_tfhiscolnom ,
                                           AV171Wpncyrcds_17_tfhisnomcli_sel ,
                                           AV170Wpncyrcds_16_tfhisnomcli ,
                                           Byte.valueOf(AV172Wpncyrcds_18_tfhisopetur) ,
                                           Byte.valueOf(AV173Wpncyrcds_19_tfhisopetur_to) ,
                                           AV175Wpncyrcds_21_tfmaqcod_sel ,
                                           AV174Wpncyrcds_20_tfmaqcod ,
                                           AV176Wpncyrcds_22_tfhisbarkgm ,
                                           AV177Wpncyrcds_23_tfhisbarkgm_to ,
                                           AV178Wpncyrcds_24_tfhisbarmtr ,
                                           AV179Wpncyrcds_25_tfhisbarmtr_to ,
                                           AV180Wpncyrcds_26_tfcostcausa ,
                                           AV181Wpncyrcds_27_tfcostcausa_to ,
                                           AV182Wpncyrcds_28_tfhisreovalorcausa ,
                                           AV183Wpncyrcds_29_tfhisreovalorcausa_to ,
                                           AV185Wpncyrcds_31_tftipdefdsc_sel ,
                                           AV184Wpncyrcds_30_tftipdefdsc ,
                                           AV187Wpncyrcds_33_tfdsccausa_sel ,
                                           AV186Wpncyrcds_32_tfdsccausa ,
                                           AV189Wpncyrcds_35_tfrps_dsc_sel ,
                                           AV188Wpncyrcds_34_tfrps_dsc ,
                                           Integer.valueOf(AV190Wpncyrcds_36_tfhisreotn) ,
                                           Integer.valueOf(AV191Wpncyrcds_37_tfhisreotn_to) ,
                                           Integer.valueOf(AV192Wpncyrcds_38_tfhisopecod) ,
                                           Integer.valueOf(AV193Wpncyrcds_39_tfhisopecod_to) ,
                                           AV195Wpncyrcds_41_tfhisacco_sel ,
                                           AV194Wpncyrcds_40_tfhisacco ,
                                           AV197Wpncyrcds_43_tfhisaccot_sel ,
                                           AV196Wpncyrcds_42_tfhisaccot ,
                                           AV199Wpncyrcds_45_tfhisadeacco_sel ,
                                           AV198Wpncyrcds_44_tfhisadeacco ,
                                           AV201Wpncyrcds_47_tfhisadeacct_sel ,
                                           AV200Wpncyrcds_46_tfhisadeacct ,
                                           AV203Wpncyrcds_49_tfhistipartdsc_sel ,
                                           AV202Wpncyrcds_48_tfhistipartdsc ,
                                           AV205Wpncyrcds_51_tfhistipcoldsc_sel ,
                                           AV204Wpncyrcds_50_tfhistipcoldsc ,
                                           Integer.valueOf(A539HisBarCod) ,
                                           Byte.valueOf(A545HisCodReo) ,
                                           A544HisCodPar ,
                                           A13698HisreoLote ,
                                           A279CliNom ,
                                           A542HisBarSer ,
                                           A2299HisReoDsc ,
                                           A546HisColNom ,
                                           A8889HisNomCli ,
                                           Byte.valueOf(A12950HisOpeTur) ,
                                           A602MaqCod ,
                                           A540HisBarKgm ,
                                           A541HisBarMtr ,
                                           A13699CostCausa ,
                                           A834TipDefDsc ,
                                           A5086DscCausa ,
                                           A7001Rps_Dsc ,
                                           Integer.valueOf(A2297HisReoTn) ,
                                           Integer.valueOf(A12949HisOpecod) ,
                                           A5662HisAcCo ,
                                           A5693HisAcCot ,
                                           A5694HisAdEAcCo ,
                                           A5695HisAdEAcCt ,
                                           A13843HisTipArtD ,
                                           A13844HisTipColD ,
                                           A569HisReoFec ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV155Wpncyrcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV155Wpncyrcds_1_filterfulltext), "%", "") ;
      lV158Wpncyrcds_4_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV158Wpncyrcds_4_tfhisreohdr), 11, "%") ;
      lV160Wpncyrcds_6_tfhisreolote = GXutil.padr( GXutil.rtrim( AV160Wpncyrcds_6_tfhisreolote), 20, "%") ;
      lV162Wpncyrcds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV162Wpncyrcds_8_tfclinom), 30, "%") ;
      lV164Wpncyrcds_10_tfhisbarser = GXutil.padr( GXutil.rtrim( AV164Wpncyrcds_10_tfhisbarser), 16, "%") ;
      lV166Wpncyrcds_12_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV166Wpncyrcds_12_tfhisreodsc), 26, "%") ;
      lV168Wpncyrcds_14_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV168Wpncyrcds_14_tfhiscolnom), 13, "%") ;
      lV170Wpncyrcds_16_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV170Wpncyrcds_16_tfhisnomcli), 13, "%") ;
      lV174Wpncyrcds_20_tfmaqcod = GXutil.padr( GXutil.rtrim( AV174Wpncyrcds_20_tfmaqcod), 6, "%") ;
      lV184Wpncyrcds_30_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV184Wpncyrcds_30_tftipdefdsc), 30, "%") ;
      lV186Wpncyrcds_32_tfdsccausa = GXutil.padr( GXutil.rtrim( AV186Wpncyrcds_32_tfdsccausa), 60, "%") ;
      lV188Wpncyrcds_34_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV188Wpncyrcds_34_tfrps_dsc), 40, "%") ;
      lV194Wpncyrcds_40_tfhisacco = GXutil.concat( GXutil.rtrim( AV194Wpncyrcds_40_tfhisacco), "%", "") ;
      lV196Wpncyrcds_42_tfhisaccot = GXutil.concat( GXutil.rtrim( AV196Wpncyrcds_42_tfhisaccot), "%", "") ;
      lV198Wpncyrcds_44_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV198Wpncyrcds_44_tfhisadeacco), "%", "") ;
      lV200Wpncyrcds_46_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV200Wpncyrcds_46_tfhisadeacct), "%", "") ;
      lV202Wpncyrcds_48_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV202Wpncyrcds_48_tfhistipartdsc), 30, "%") ;
      lV204Wpncyrcds_50_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV204Wpncyrcds_50_tfhistipcoldsc), 30, "%") ;
      /* Using cursor H00DW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, lV155Wpncyrcds_1_filterfulltext, AV157Wpncyrcds_3_tfhisreofec, lV158Wpncyrcds_4_tfhisreohdr, AV159Wpncyrcds_5_tfhisreohdr_sel, lV160Wpncyrcds_6_tfhisreolote, AV161Wpncyrcds_7_tfhisreolote_sel, lV162Wpncyrcds_8_tfclinom, AV163Wpncyrcds_9_tfclinom_sel, lV164Wpncyrcds_10_tfhisbarser, AV165Wpncyrcds_11_tfhisbarser_sel, lV166Wpncyrcds_12_tfhisreodsc, AV167Wpncyrcds_13_tfhisreodsc_sel, lV168Wpncyrcds_14_tfhiscolnom, AV169Wpncyrcds_15_tfhiscolnom_sel, lV170Wpncyrcds_16_tfhisnomcli, AV171Wpncyrcds_17_tfhisnomcli_sel, Byte.valueOf(AV172Wpncyrcds_18_tfhisopetur), Byte.valueOf(AV173Wpncyrcds_19_tfhisopetur_to), lV174Wpncyrcds_20_tfmaqcod, AV175Wpncyrcds_21_tfmaqcod_sel, AV176Wpncyrcds_22_tfhisbarkgm, AV177Wpncyrcds_23_tfhisbarkgm_to, AV178Wpncyrcds_24_tfhisbarmtr, AV179Wpncyrcds_25_tfhisbarmtr_to, AV180Wpncyrcds_26_tfcostcausa, AV181Wpncyrcds_27_tfcostcausa_to, AV182Wpncyrcds_28_tfhisreovalorcausa, AV183Wpncyrcds_29_tfhisreovalorcausa_to, lV184Wpncyrcds_30_tftipdefdsc, AV185Wpncyrcds_31_tftipdefdsc_sel, lV186Wpncyrcds_32_tfdsccausa, AV187Wpncyrcds_33_tfdsccausa_sel, lV188Wpncyrcds_34_tfrps_dsc, AV189Wpncyrcds_35_tfrps_dsc_sel, Integer.valueOf(AV190Wpncyrcds_36_tfhisreotn), Integer.valueOf(AV191Wpncyrcds_37_tfhisreotn_to), Integer.valueOf(AV192Wpncyrcds_38_tfhisopecod), Integer.valueOf(AV193Wpncyrcds_39_tfhisopecod_to), lV194Wpncyrcds_40_tfhisacco, AV195Wpncyrcds_41_tfhisacco_sel, lV196Wpncyrcds_42_tfhisaccot, AV197Wpncyrcds_43_tfhisaccot_sel, lV198Wpncyrcds_44_tfhisadeacco, AV199Wpncyrcds_45_tfhisadeacco_sel, lV200Wpncyrcds_46_tfhisadeacct, AV201Wpncyrcds_47_tfhisadeacct_sel, lV202Wpncyrcds_48_tfhistipartdsc, AV203Wpncyrcds_49_tfhistipartdsc_sel, lV204Wpncyrcds_50_tfhistipcoldsc, AV205Wpncyrcds_51_tfhistipcoldsc_sel});
      GRID_nRecordCount = H00DW3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
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
      AV155Wpncyrcds_1_filterfulltext = AV130FilterFullText ;
      AV156Wpncyrcds_2_tfhisestreo_sels = AV47TFHisEstReo_Sels ;
      AV157Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV158Wpncyrcds_4_tfhisreohdr = AV49TFHisReoHDR ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = AV50TFHisReoHDR_Sel ;
      AV160Wpncyrcds_6_tfhisreolote = AV68TFHisreoLote ;
      AV161Wpncyrcds_7_tfhisreolote_sel = AV69TFHisreoLote_Sel ;
      AV162Wpncyrcds_8_tfclinom = AV71TFCliNom ;
      AV163Wpncyrcds_9_tfclinom_sel = AV72TFCliNom_Sel ;
      AV164Wpncyrcds_10_tfhisbarser = AV74TFHisBarSer ;
      AV165Wpncyrcds_11_tfhisbarser_sel = AV75TFHisBarSer_Sel ;
      AV166Wpncyrcds_12_tfhisreodsc = AV77TFHisReoDsc ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = AV78TFHisReoDsc_Sel ;
      AV168Wpncyrcds_14_tfhiscolnom = AV80TFHisColNom ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = AV81TFHisColNom_Sel ;
      AV170Wpncyrcds_16_tfhisnomcli = AV83TFHisNomCli ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = AV84TFHisNomCli_Sel ;
      AV172Wpncyrcds_18_tfhisopetur = AV86TFHisOpeTur ;
      AV173Wpncyrcds_19_tfhisopetur_to = AV87TFHisOpeTur_To ;
      AV174Wpncyrcds_20_tfmaqcod = AV89TFMaqCod ;
      AV175Wpncyrcds_21_tfmaqcod_sel = AV90TFMaqCod_Sel ;
      AV176Wpncyrcds_22_tfhisbarkgm = AV92TFHisBarKgm ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = AV93TFHisBarKgm_To ;
      AV178Wpncyrcds_24_tfhisbarmtr = AV95TFHisBarMtr ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = AV96TFHisBarMtr_To ;
      AV180Wpncyrcds_26_tfcostcausa = AV98TFCostCausa ;
      AV181Wpncyrcds_27_tfcostcausa_to = AV99TFCostCausa_To ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = AV101TFHisreoValorCausa ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = AV102TFHisreoValorCausa_To ;
      AV184Wpncyrcds_30_tftipdefdsc = AV104TFTipDefDsc ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = AV105TFTipDefDsc_Sel ;
      AV186Wpncyrcds_32_tfdsccausa = AV107TFDscCausa ;
      AV187Wpncyrcds_33_tfdsccausa_sel = AV108TFDscCausa_Sel ;
      AV188Wpncyrcds_34_tfrps_dsc = AV110TFRps_Dsc ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = AV111TFRps_Dsc_Sel ;
      AV190Wpncyrcds_36_tfhisreotn = AV113TFHisReoTn ;
      AV191Wpncyrcds_37_tfhisreotn_to = AV114TFHisReoTn_To ;
      AV192Wpncyrcds_38_tfhisopecod = AV116TFHisOpecod ;
      AV193Wpncyrcds_39_tfhisopecod_to = AV117TFHisOpecod_To ;
      AV194Wpncyrcds_40_tfhisacco = AV119TFHisAcCo ;
      AV195Wpncyrcds_41_tfhisacco_sel = AV120TFHisAcCo_Sel ;
      AV196Wpncyrcds_42_tfhisaccot = AV122TFHisAcCot ;
      AV197Wpncyrcds_43_tfhisaccot_sel = AV123TFHisAcCot_Sel ;
      AV198Wpncyrcds_44_tfhisadeacco = AV125TFHisAdEAcCo ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = AV126TFHisAdEAcCo_Sel ;
      AV200Wpncyrcds_46_tfhisadeacct = AV128TFHisAdEAcCt ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = AV129TFHisAdEAcCt_Sel ;
      AV202Wpncyrcds_48_tfhistipartdsc = AV148TFHisTipArtDsc ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = AV149TFHisTipArtDsc_Sel ;
      AV204Wpncyrcds_50_tfhistipcoldsc = AV150TFHisTipColDsc ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = AV151TFHisTipColDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, A396EmprCod, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV47TFHisEstReo_Sels, AV58TFHisReoFec, AV49TFHisReoHDR, AV50TFHisReoHDR_Sel, AV68TFHisreoLote, AV69TFHisreoLote_Sel, AV71TFCliNom, AV72TFCliNom_Sel, AV74TFHisBarSer, AV75TFHisBarSer_Sel, AV77TFHisReoDsc, AV78TFHisReoDsc_Sel, AV80TFHisColNom, AV81TFHisColNom_Sel, AV83TFHisNomCli, AV84TFHisNomCli_Sel, AV86TFHisOpeTur, AV87TFHisOpeTur_To, AV89TFMaqCod, AV90TFMaqCod_Sel, AV92TFHisBarKgm, AV93TFHisBarKgm_To, AV95TFHisBarMtr, AV96TFHisBarMtr_To, AV98TFCostCausa, AV99TFCostCausa_To, AV101TFHisreoValorCausa, AV102TFHisreoValorCausa_To, AV104TFTipDefDsc, AV105TFTipDefDsc_Sel, AV107TFDscCausa, AV108TFDscCausa_Sel, AV110TFRps_Dsc, AV111TFRps_Dsc_Sel, AV113TFHisReoTn, AV114TFHisReoTn_To, AV116TFHisOpecod, AV117TFHisOpecod_To, AV119TFHisAcCo, AV120TFHisAcCo_Sel, AV122TFHisAcCot, AV123TFHisAcCot_Sel, AV125TFHisAdEAcCo, AV126TFHisAdEAcCo_Sel, AV128TFHisAdEAcCt, AV129TFHisAdEAcCt_Sel, AV148TFHisTipArtDsc, AV149TFHisTipArtDsc_Sel, AV150TFHisTipColDsc, AV151TFHisTipColDsc_Sel, AV206Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV155Wpncyrcds_1_filterfulltext = AV130FilterFullText ;
      AV156Wpncyrcds_2_tfhisestreo_sels = AV47TFHisEstReo_Sels ;
      AV157Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV158Wpncyrcds_4_tfhisreohdr = AV49TFHisReoHDR ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = AV50TFHisReoHDR_Sel ;
      AV160Wpncyrcds_6_tfhisreolote = AV68TFHisreoLote ;
      AV161Wpncyrcds_7_tfhisreolote_sel = AV69TFHisreoLote_Sel ;
      AV162Wpncyrcds_8_tfclinom = AV71TFCliNom ;
      AV163Wpncyrcds_9_tfclinom_sel = AV72TFCliNom_Sel ;
      AV164Wpncyrcds_10_tfhisbarser = AV74TFHisBarSer ;
      AV165Wpncyrcds_11_tfhisbarser_sel = AV75TFHisBarSer_Sel ;
      AV166Wpncyrcds_12_tfhisreodsc = AV77TFHisReoDsc ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = AV78TFHisReoDsc_Sel ;
      AV168Wpncyrcds_14_tfhiscolnom = AV80TFHisColNom ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = AV81TFHisColNom_Sel ;
      AV170Wpncyrcds_16_tfhisnomcli = AV83TFHisNomCli ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = AV84TFHisNomCli_Sel ;
      AV172Wpncyrcds_18_tfhisopetur = AV86TFHisOpeTur ;
      AV173Wpncyrcds_19_tfhisopetur_to = AV87TFHisOpeTur_To ;
      AV174Wpncyrcds_20_tfmaqcod = AV89TFMaqCod ;
      AV175Wpncyrcds_21_tfmaqcod_sel = AV90TFMaqCod_Sel ;
      AV176Wpncyrcds_22_tfhisbarkgm = AV92TFHisBarKgm ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = AV93TFHisBarKgm_To ;
      AV178Wpncyrcds_24_tfhisbarmtr = AV95TFHisBarMtr ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = AV96TFHisBarMtr_To ;
      AV180Wpncyrcds_26_tfcostcausa = AV98TFCostCausa ;
      AV181Wpncyrcds_27_tfcostcausa_to = AV99TFCostCausa_To ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = AV101TFHisreoValorCausa ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = AV102TFHisreoValorCausa_To ;
      AV184Wpncyrcds_30_tftipdefdsc = AV104TFTipDefDsc ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = AV105TFTipDefDsc_Sel ;
      AV186Wpncyrcds_32_tfdsccausa = AV107TFDscCausa ;
      AV187Wpncyrcds_33_tfdsccausa_sel = AV108TFDscCausa_Sel ;
      AV188Wpncyrcds_34_tfrps_dsc = AV110TFRps_Dsc ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = AV111TFRps_Dsc_Sel ;
      AV190Wpncyrcds_36_tfhisreotn = AV113TFHisReoTn ;
      AV191Wpncyrcds_37_tfhisreotn_to = AV114TFHisReoTn_To ;
      AV192Wpncyrcds_38_tfhisopecod = AV116TFHisOpecod ;
      AV193Wpncyrcds_39_tfhisopecod_to = AV117TFHisOpecod_To ;
      AV194Wpncyrcds_40_tfhisacco = AV119TFHisAcCo ;
      AV195Wpncyrcds_41_tfhisacco_sel = AV120TFHisAcCo_Sel ;
      AV196Wpncyrcds_42_tfhisaccot = AV122TFHisAcCot ;
      AV197Wpncyrcds_43_tfhisaccot_sel = AV123TFHisAcCot_Sel ;
      AV198Wpncyrcds_44_tfhisadeacco = AV125TFHisAdEAcCo ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = AV126TFHisAdEAcCo_Sel ;
      AV200Wpncyrcds_46_tfhisadeacct = AV128TFHisAdEAcCt ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = AV129TFHisAdEAcCt_Sel ;
      AV202Wpncyrcds_48_tfhistipartdsc = AV148TFHisTipArtDsc ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = AV149TFHisTipArtDsc_Sel ;
      AV204Wpncyrcds_50_tfhistipcoldsc = AV150TFHisTipColDsc ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = AV151TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, A396EmprCod, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV47TFHisEstReo_Sels, AV58TFHisReoFec, AV49TFHisReoHDR, AV50TFHisReoHDR_Sel, AV68TFHisreoLote, AV69TFHisreoLote_Sel, AV71TFCliNom, AV72TFCliNom_Sel, AV74TFHisBarSer, AV75TFHisBarSer_Sel, AV77TFHisReoDsc, AV78TFHisReoDsc_Sel, AV80TFHisColNom, AV81TFHisColNom_Sel, AV83TFHisNomCli, AV84TFHisNomCli_Sel, AV86TFHisOpeTur, AV87TFHisOpeTur_To, AV89TFMaqCod, AV90TFMaqCod_Sel, AV92TFHisBarKgm, AV93TFHisBarKgm_To, AV95TFHisBarMtr, AV96TFHisBarMtr_To, AV98TFCostCausa, AV99TFCostCausa_To, AV101TFHisreoValorCausa, AV102TFHisreoValorCausa_To, AV104TFTipDefDsc, AV105TFTipDefDsc_Sel, AV107TFDscCausa, AV108TFDscCausa_Sel, AV110TFRps_Dsc, AV111TFRps_Dsc_Sel, AV113TFHisReoTn, AV114TFHisReoTn_To, AV116TFHisOpecod, AV117TFHisOpecod_To, AV119TFHisAcCo, AV120TFHisAcCo_Sel, AV122TFHisAcCot, AV123TFHisAcCot_Sel, AV125TFHisAdEAcCo, AV126TFHisAdEAcCo_Sel, AV128TFHisAdEAcCt, AV129TFHisAdEAcCt_Sel, AV148TFHisTipArtDsc, AV149TFHisTipArtDsc_Sel, AV150TFHisTipColDsc, AV151TFHisTipColDsc_Sel, AV206Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV155Wpncyrcds_1_filterfulltext = AV130FilterFullText ;
      AV156Wpncyrcds_2_tfhisestreo_sels = AV47TFHisEstReo_Sels ;
      AV157Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV158Wpncyrcds_4_tfhisreohdr = AV49TFHisReoHDR ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = AV50TFHisReoHDR_Sel ;
      AV160Wpncyrcds_6_tfhisreolote = AV68TFHisreoLote ;
      AV161Wpncyrcds_7_tfhisreolote_sel = AV69TFHisreoLote_Sel ;
      AV162Wpncyrcds_8_tfclinom = AV71TFCliNom ;
      AV163Wpncyrcds_9_tfclinom_sel = AV72TFCliNom_Sel ;
      AV164Wpncyrcds_10_tfhisbarser = AV74TFHisBarSer ;
      AV165Wpncyrcds_11_tfhisbarser_sel = AV75TFHisBarSer_Sel ;
      AV166Wpncyrcds_12_tfhisreodsc = AV77TFHisReoDsc ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = AV78TFHisReoDsc_Sel ;
      AV168Wpncyrcds_14_tfhiscolnom = AV80TFHisColNom ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = AV81TFHisColNom_Sel ;
      AV170Wpncyrcds_16_tfhisnomcli = AV83TFHisNomCli ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = AV84TFHisNomCli_Sel ;
      AV172Wpncyrcds_18_tfhisopetur = AV86TFHisOpeTur ;
      AV173Wpncyrcds_19_tfhisopetur_to = AV87TFHisOpeTur_To ;
      AV174Wpncyrcds_20_tfmaqcod = AV89TFMaqCod ;
      AV175Wpncyrcds_21_tfmaqcod_sel = AV90TFMaqCod_Sel ;
      AV176Wpncyrcds_22_tfhisbarkgm = AV92TFHisBarKgm ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = AV93TFHisBarKgm_To ;
      AV178Wpncyrcds_24_tfhisbarmtr = AV95TFHisBarMtr ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = AV96TFHisBarMtr_To ;
      AV180Wpncyrcds_26_tfcostcausa = AV98TFCostCausa ;
      AV181Wpncyrcds_27_tfcostcausa_to = AV99TFCostCausa_To ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = AV101TFHisreoValorCausa ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = AV102TFHisreoValorCausa_To ;
      AV184Wpncyrcds_30_tftipdefdsc = AV104TFTipDefDsc ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = AV105TFTipDefDsc_Sel ;
      AV186Wpncyrcds_32_tfdsccausa = AV107TFDscCausa ;
      AV187Wpncyrcds_33_tfdsccausa_sel = AV108TFDscCausa_Sel ;
      AV188Wpncyrcds_34_tfrps_dsc = AV110TFRps_Dsc ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = AV111TFRps_Dsc_Sel ;
      AV190Wpncyrcds_36_tfhisreotn = AV113TFHisReoTn ;
      AV191Wpncyrcds_37_tfhisreotn_to = AV114TFHisReoTn_To ;
      AV192Wpncyrcds_38_tfhisopecod = AV116TFHisOpecod ;
      AV193Wpncyrcds_39_tfhisopecod_to = AV117TFHisOpecod_To ;
      AV194Wpncyrcds_40_tfhisacco = AV119TFHisAcCo ;
      AV195Wpncyrcds_41_tfhisacco_sel = AV120TFHisAcCo_Sel ;
      AV196Wpncyrcds_42_tfhisaccot = AV122TFHisAcCot ;
      AV197Wpncyrcds_43_tfhisaccot_sel = AV123TFHisAcCot_Sel ;
      AV198Wpncyrcds_44_tfhisadeacco = AV125TFHisAdEAcCo ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = AV126TFHisAdEAcCo_Sel ;
      AV200Wpncyrcds_46_tfhisadeacct = AV128TFHisAdEAcCt ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = AV129TFHisAdEAcCt_Sel ;
      AV202Wpncyrcds_48_tfhistipartdsc = AV148TFHisTipArtDsc ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = AV149TFHisTipArtDsc_Sel ;
      AV204Wpncyrcds_50_tfhistipcoldsc = AV150TFHisTipColDsc ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = AV151TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, A396EmprCod, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV47TFHisEstReo_Sels, AV58TFHisReoFec, AV49TFHisReoHDR, AV50TFHisReoHDR_Sel, AV68TFHisreoLote, AV69TFHisreoLote_Sel, AV71TFCliNom, AV72TFCliNom_Sel, AV74TFHisBarSer, AV75TFHisBarSer_Sel, AV77TFHisReoDsc, AV78TFHisReoDsc_Sel, AV80TFHisColNom, AV81TFHisColNom_Sel, AV83TFHisNomCli, AV84TFHisNomCli_Sel, AV86TFHisOpeTur, AV87TFHisOpeTur_To, AV89TFMaqCod, AV90TFMaqCod_Sel, AV92TFHisBarKgm, AV93TFHisBarKgm_To, AV95TFHisBarMtr, AV96TFHisBarMtr_To, AV98TFCostCausa, AV99TFCostCausa_To, AV101TFHisreoValorCausa, AV102TFHisreoValorCausa_To, AV104TFTipDefDsc, AV105TFTipDefDsc_Sel, AV107TFDscCausa, AV108TFDscCausa_Sel, AV110TFRps_Dsc, AV111TFRps_Dsc_Sel, AV113TFHisReoTn, AV114TFHisReoTn_To, AV116TFHisOpecod, AV117TFHisOpecod_To, AV119TFHisAcCo, AV120TFHisAcCo_Sel, AV122TFHisAcCot, AV123TFHisAcCot_Sel, AV125TFHisAdEAcCo, AV126TFHisAdEAcCo_Sel, AV128TFHisAdEAcCt, AV129TFHisAdEAcCt_Sel, AV148TFHisTipArtDsc, AV149TFHisTipArtDsc_Sel, AV150TFHisTipColDsc, AV151TFHisTipColDsc_Sel, AV206Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV155Wpncyrcds_1_filterfulltext = AV130FilterFullText ;
      AV156Wpncyrcds_2_tfhisestreo_sels = AV47TFHisEstReo_Sels ;
      AV157Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV158Wpncyrcds_4_tfhisreohdr = AV49TFHisReoHDR ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = AV50TFHisReoHDR_Sel ;
      AV160Wpncyrcds_6_tfhisreolote = AV68TFHisreoLote ;
      AV161Wpncyrcds_7_tfhisreolote_sel = AV69TFHisreoLote_Sel ;
      AV162Wpncyrcds_8_tfclinom = AV71TFCliNom ;
      AV163Wpncyrcds_9_tfclinom_sel = AV72TFCliNom_Sel ;
      AV164Wpncyrcds_10_tfhisbarser = AV74TFHisBarSer ;
      AV165Wpncyrcds_11_tfhisbarser_sel = AV75TFHisBarSer_Sel ;
      AV166Wpncyrcds_12_tfhisreodsc = AV77TFHisReoDsc ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = AV78TFHisReoDsc_Sel ;
      AV168Wpncyrcds_14_tfhiscolnom = AV80TFHisColNom ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = AV81TFHisColNom_Sel ;
      AV170Wpncyrcds_16_tfhisnomcli = AV83TFHisNomCli ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = AV84TFHisNomCli_Sel ;
      AV172Wpncyrcds_18_tfhisopetur = AV86TFHisOpeTur ;
      AV173Wpncyrcds_19_tfhisopetur_to = AV87TFHisOpeTur_To ;
      AV174Wpncyrcds_20_tfmaqcod = AV89TFMaqCod ;
      AV175Wpncyrcds_21_tfmaqcod_sel = AV90TFMaqCod_Sel ;
      AV176Wpncyrcds_22_tfhisbarkgm = AV92TFHisBarKgm ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = AV93TFHisBarKgm_To ;
      AV178Wpncyrcds_24_tfhisbarmtr = AV95TFHisBarMtr ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = AV96TFHisBarMtr_To ;
      AV180Wpncyrcds_26_tfcostcausa = AV98TFCostCausa ;
      AV181Wpncyrcds_27_tfcostcausa_to = AV99TFCostCausa_To ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = AV101TFHisreoValorCausa ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = AV102TFHisreoValorCausa_To ;
      AV184Wpncyrcds_30_tftipdefdsc = AV104TFTipDefDsc ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = AV105TFTipDefDsc_Sel ;
      AV186Wpncyrcds_32_tfdsccausa = AV107TFDscCausa ;
      AV187Wpncyrcds_33_tfdsccausa_sel = AV108TFDscCausa_Sel ;
      AV188Wpncyrcds_34_tfrps_dsc = AV110TFRps_Dsc ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = AV111TFRps_Dsc_Sel ;
      AV190Wpncyrcds_36_tfhisreotn = AV113TFHisReoTn ;
      AV191Wpncyrcds_37_tfhisreotn_to = AV114TFHisReoTn_To ;
      AV192Wpncyrcds_38_tfhisopecod = AV116TFHisOpecod ;
      AV193Wpncyrcds_39_tfhisopecod_to = AV117TFHisOpecod_To ;
      AV194Wpncyrcds_40_tfhisacco = AV119TFHisAcCo ;
      AV195Wpncyrcds_41_tfhisacco_sel = AV120TFHisAcCo_Sel ;
      AV196Wpncyrcds_42_tfhisaccot = AV122TFHisAcCot ;
      AV197Wpncyrcds_43_tfhisaccot_sel = AV123TFHisAcCot_Sel ;
      AV198Wpncyrcds_44_tfhisadeacco = AV125TFHisAdEAcCo ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = AV126TFHisAdEAcCo_Sel ;
      AV200Wpncyrcds_46_tfhisadeacct = AV128TFHisAdEAcCt ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = AV129TFHisAdEAcCt_Sel ;
      AV202Wpncyrcds_48_tfhistipartdsc = AV148TFHisTipArtDsc ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = AV149TFHisTipArtDsc_Sel ;
      AV204Wpncyrcds_50_tfhistipcoldsc = AV150TFHisTipColDsc ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = AV151TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, A396EmprCod, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV47TFHisEstReo_Sels, AV58TFHisReoFec, AV49TFHisReoHDR, AV50TFHisReoHDR_Sel, AV68TFHisreoLote, AV69TFHisreoLote_Sel, AV71TFCliNom, AV72TFCliNom_Sel, AV74TFHisBarSer, AV75TFHisBarSer_Sel, AV77TFHisReoDsc, AV78TFHisReoDsc_Sel, AV80TFHisColNom, AV81TFHisColNom_Sel, AV83TFHisNomCli, AV84TFHisNomCli_Sel, AV86TFHisOpeTur, AV87TFHisOpeTur_To, AV89TFMaqCod, AV90TFMaqCod_Sel, AV92TFHisBarKgm, AV93TFHisBarKgm_To, AV95TFHisBarMtr, AV96TFHisBarMtr_To, AV98TFCostCausa, AV99TFCostCausa_To, AV101TFHisreoValorCausa, AV102TFHisreoValorCausa_To, AV104TFTipDefDsc, AV105TFTipDefDsc_Sel, AV107TFDscCausa, AV108TFDscCausa_Sel, AV110TFRps_Dsc, AV111TFRps_Dsc_Sel, AV113TFHisReoTn, AV114TFHisReoTn_To, AV116TFHisOpecod, AV117TFHisOpecod_To, AV119TFHisAcCo, AV120TFHisAcCo_Sel, AV122TFHisAcCot, AV123TFHisAcCot_Sel, AV125TFHisAdEAcCo, AV126TFHisAdEAcCo_Sel, AV128TFHisAdEAcCt, AV129TFHisAdEAcCt_Sel, AV148TFHisTipArtDsc, AV149TFHisTipArtDsc_Sel, AV150TFHisTipColDsc, AV151TFHisTipColDsc_Sel, AV206Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV155Wpncyrcds_1_filterfulltext = AV130FilterFullText ;
      AV156Wpncyrcds_2_tfhisestreo_sels = AV47TFHisEstReo_Sels ;
      AV157Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV158Wpncyrcds_4_tfhisreohdr = AV49TFHisReoHDR ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = AV50TFHisReoHDR_Sel ;
      AV160Wpncyrcds_6_tfhisreolote = AV68TFHisreoLote ;
      AV161Wpncyrcds_7_tfhisreolote_sel = AV69TFHisreoLote_Sel ;
      AV162Wpncyrcds_8_tfclinom = AV71TFCliNom ;
      AV163Wpncyrcds_9_tfclinom_sel = AV72TFCliNom_Sel ;
      AV164Wpncyrcds_10_tfhisbarser = AV74TFHisBarSer ;
      AV165Wpncyrcds_11_tfhisbarser_sel = AV75TFHisBarSer_Sel ;
      AV166Wpncyrcds_12_tfhisreodsc = AV77TFHisReoDsc ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = AV78TFHisReoDsc_Sel ;
      AV168Wpncyrcds_14_tfhiscolnom = AV80TFHisColNom ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = AV81TFHisColNom_Sel ;
      AV170Wpncyrcds_16_tfhisnomcli = AV83TFHisNomCli ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = AV84TFHisNomCli_Sel ;
      AV172Wpncyrcds_18_tfhisopetur = AV86TFHisOpeTur ;
      AV173Wpncyrcds_19_tfhisopetur_to = AV87TFHisOpeTur_To ;
      AV174Wpncyrcds_20_tfmaqcod = AV89TFMaqCod ;
      AV175Wpncyrcds_21_tfmaqcod_sel = AV90TFMaqCod_Sel ;
      AV176Wpncyrcds_22_tfhisbarkgm = AV92TFHisBarKgm ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = AV93TFHisBarKgm_To ;
      AV178Wpncyrcds_24_tfhisbarmtr = AV95TFHisBarMtr ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = AV96TFHisBarMtr_To ;
      AV180Wpncyrcds_26_tfcostcausa = AV98TFCostCausa ;
      AV181Wpncyrcds_27_tfcostcausa_to = AV99TFCostCausa_To ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = AV101TFHisreoValorCausa ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = AV102TFHisreoValorCausa_To ;
      AV184Wpncyrcds_30_tftipdefdsc = AV104TFTipDefDsc ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = AV105TFTipDefDsc_Sel ;
      AV186Wpncyrcds_32_tfdsccausa = AV107TFDscCausa ;
      AV187Wpncyrcds_33_tfdsccausa_sel = AV108TFDscCausa_Sel ;
      AV188Wpncyrcds_34_tfrps_dsc = AV110TFRps_Dsc ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = AV111TFRps_Dsc_Sel ;
      AV190Wpncyrcds_36_tfhisreotn = AV113TFHisReoTn ;
      AV191Wpncyrcds_37_tfhisreotn_to = AV114TFHisReoTn_To ;
      AV192Wpncyrcds_38_tfhisopecod = AV116TFHisOpecod ;
      AV193Wpncyrcds_39_tfhisopecod_to = AV117TFHisOpecod_To ;
      AV194Wpncyrcds_40_tfhisacco = AV119TFHisAcCo ;
      AV195Wpncyrcds_41_tfhisacco_sel = AV120TFHisAcCo_Sel ;
      AV196Wpncyrcds_42_tfhisaccot = AV122TFHisAcCot ;
      AV197Wpncyrcds_43_tfhisaccot_sel = AV123TFHisAcCot_Sel ;
      AV198Wpncyrcds_44_tfhisadeacco = AV125TFHisAdEAcCo ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = AV126TFHisAdEAcCo_Sel ;
      AV200Wpncyrcds_46_tfhisadeacct = AV128TFHisAdEAcCt ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = AV129TFHisAdEAcCt_Sel ;
      AV202Wpncyrcds_48_tfhistipartdsc = AV148TFHisTipArtDsc ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = AV149TFHisTipArtDsc_Sel ;
      AV204Wpncyrcds_50_tfhistipcoldsc = AV150TFHisTipColDsc ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = AV151TFHisTipColDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV130FilterFullText, A396EmprCod, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV47TFHisEstReo_Sels, AV58TFHisReoFec, AV49TFHisReoHDR, AV50TFHisReoHDR_Sel, AV68TFHisreoLote, AV69TFHisreoLote_Sel, AV71TFCliNom, AV72TFCliNom_Sel, AV74TFHisBarSer, AV75TFHisBarSer_Sel, AV77TFHisReoDsc, AV78TFHisReoDsc_Sel, AV80TFHisColNom, AV81TFHisColNom_Sel, AV83TFHisNomCli, AV84TFHisNomCli_Sel, AV86TFHisOpeTur, AV87TFHisOpeTur_To, AV89TFMaqCod, AV90TFMaqCod_Sel, AV92TFHisBarKgm, AV93TFHisBarKgm_To, AV95TFHisBarMtr, AV96TFHisBarMtr_To, AV98TFCostCausa, AV99TFCostCausa_To, AV101TFHisreoValorCausa, AV102TFHisreoValorCausa_To, AV104TFTipDefDsc, AV105TFTipDefDsc_Sel, AV107TFDscCausa, AV108TFDscCausa_Sel, AV110TFRps_Dsc, AV111TFRps_Dsc_Sel, AV113TFHisReoTn, AV114TFHisReoTn_To, AV116TFHisOpecod, AV117TFHisOpecod_To, AV119TFHisAcCo, AV120TFHisAcCo_Sel, AV122TFHisAcCot, AV123TFHisAcCot_Sel, AV125TFHisAdEAcCo, AV126TFHisAdEAcCo_Sel, AV128TFHisAdEAcCt, AV129TFHisAdEAcCt_Sel, AV148TFHisTipArtDsc, AV149TFHisTipArtDsc_Sel, AV150TFHisTipColDsc, AV151TFHisTipColDsc_Sel, AV206Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV206Pgmname = "WPNcyRc" ;
      Gx_err = (short)(0) ;
      edtavInforme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInforme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInforme_Enabled), 5, 0), !bGXsfl_46_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupDW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18DW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV42ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV39ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_46 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_46"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV55GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
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
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV130FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV130FilterFullText", AV130FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisreofecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISREOFECAUXDATE");
            GX_FocusControl = edtavDdo_hisreofecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV139DDO_HisReoFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139DDO_HisReoFecAuxDate", localUtil.format(AV139DDO_HisReoFecAuxDate, "99/99/99"));
         }
         else
         {
            AV139DDO_HisReoFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisreofecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139DDO_HisReoFecAuxDate", localUtil.format(AV139DDO_HisReoFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV130FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e18DW2 ();
      if (returnInSub) return;
   }

   public void e18DW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV140Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpncyrc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV140Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV143EmprNom ;
      GXv_char4[0] = AV144UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV140Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpncyrc_impl.this.A396EmprCod = GXv_char2[0] ;
      wpncyrc_impl.this.AV143EmprNom = GXv_char3[0] ;
      wpncyrc_impl.this.AV144UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXt_int5 = (byte)(AV141acabats) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int6) ;
      wpncyrc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV141acabats = GXt_int5 ;
      GXt_int5 = (byte)(AV142carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      wpncyrc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV142carvitin = GXt_int5 ;
      GXt_char1 = AV140Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wpncyrc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV140Station = GXt_char1 ;
      GXv_char4[0] = AV154Emprcod ;
      GXv_char3[0] = AV143EmprNom ;
      GXv_char2[0] = AV144UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV140Station, GXv_char4, GXv_char3, GXv_char2) ;
      wpncyrc_impl.this.AV154Emprcod = GXv_char4[0] ;
      wpncyrc_impl.this.AV143EmprNom = GXv_char3[0] ;
      wpncyrc_impl.this.AV144UsurCod = GXv_char2[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " HISTORICO REOPERADOS", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      edtHisreoValo_Visible = AV142carvitin ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisreoValo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisreoValo_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtCostCausa_Visible = AV142carvitin ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Visible), 5, 0), !bGXsfl_46_Refreshing);
   }

   public void e19DW2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV44ManageFiltersExecutionStep == 1 )
      {
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV44ManageFiltersExecutionStep == 2 )
      {
         AV44ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV41Session.getValue("WPNcyRcColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV41Session.getValue("WPNcyRcColumnsSelector") ;
         AV39ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      cmbHisEstReo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbHisEstReo.getInternalname(), "Visible", GXutil.ltrimstr( cmbHisEstReo.getVisible(), 5, 0), !bGXsfl_46_Refreshing);
      edtHisReoFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoFec_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisReoHDR_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoHDR_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoHDR_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisreoLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisreoLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisreoLote_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarSer_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisReoDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoDsc_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisColNom_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisNomCli_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisOpeTur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisOpeTur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisOpeTur_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarKgm_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarMtr_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtCostCausa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCostCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCostCausa_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisreoValo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisreoValo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisreoValo_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtTipDefDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDefDsc_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtDscCausa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDscCausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDscCausa_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtRps_Dsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRps_Dsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Dsc_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisReoTn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisReoTn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisReoTn_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisOpecod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisOpecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisOpecod_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisAcCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAcCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAcCo_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisAcCot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAcCot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAcCot_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisAdEAcCo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAdEAcCo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAdEAcCo_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisAdEAcCt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisAdEAcCt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisAdEAcCt_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTipArtD_Visible), 5, 0), !bGXsfl_46_Refreshing);
      edtHisTipColD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisTipColD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisTipColD_Visible), 5, 0), !bGXsfl_46_Refreshing);
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      AV155Wpncyrcds_1_filterfulltext = AV130FilterFullText ;
      AV156Wpncyrcds_2_tfhisestreo_sels = AV47TFHisEstReo_Sels ;
      AV157Wpncyrcds_3_tfhisreofec = AV58TFHisReoFec ;
      AV158Wpncyrcds_4_tfhisreohdr = AV49TFHisReoHDR ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = AV50TFHisReoHDR_Sel ;
      AV160Wpncyrcds_6_tfhisreolote = AV68TFHisreoLote ;
      AV161Wpncyrcds_7_tfhisreolote_sel = AV69TFHisreoLote_Sel ;
      AV162Wpncyrcds_8_tfclinom = AV71TFCliNom ;
      AV163Wpncyrcds_9_tfclinom_sel = AV72TFCliNom_Sel ;
      AV164Wpncyrcds_10_tfhisbarser = AV74TFHisBarSer ;
      AV165Wpncyrcds_11_tfhisbarser_sel = AV75TFHisBarSer_Sel ;
      AV166Wpncyrcds_12_tfhisreodsc = AV77TFHisReoDsc ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = AV78TFHisReoDsc_Sel ;
      AV168Wpncyrcds_14_tfhiscolnom = AV80TFHisColNom ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = AV81TFHisColNom_Sel ;
      AV170Wpncyrcds_16_tfhisnomcli = AV83TFHisNomCli ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = AV84TFHisNomCli_Sel ;
      AV172Wpncyrcds_18_tfhisopetur = AV86TFHisOpeTur ;
      AV173Wpncyrcds_19_tfhisopetur_to = AV87TFHisOpeTur_To ;
      AV174Wpncyrcds_20_tfmaqcod = AV89TFMaqCod ;
      AV175Wpncyrcds_21_tfmaqcod_sel = AV90TFMaqCod_Sel ;
      AV176Wpncyrcds_22_tfhisbarkgm = AV92TFHisBarKgm ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = AV93TFHisBarKgm_To ;
      AV178Wpncyrcds_24_tfhisbarmtr = AV95TFHisBarMtr ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = AV96TFHisBarMtr_To ;
      AV180Wpncyrcds_26_tfcostcausa = AV98TFCostCausa ;
      AV181Wpncyrcds_27_tfcostcausa_to = AV99TFCostCausa_To ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = AV101TFHisreoValorCausa ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = AV102TFHisreoValorCausa_To ;
      AV184Wpncyrcds_30_tftipdefdsc = AV104TFTipDefDsc ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = AV105TFTipDefDsc_Sel ;
      AV186Wpncyrcds_32_tfdsccausa = AV107TFDscCausa ;
      AV187Wpncyrcds_33_tfdsccausa_sel = AV108TFDscCausa_Sel ;
      AV188Wpncyrcds_34_tfrps_dsc = AV110TFRps_Dsc ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = AV111TFRps_Dsc_Sel ;
      AV190Wpncyrcds_36_tfhisreotn = AV113TFHisReoTn ;
      AV191Wpncyrcds_37_tfhisreotn_to = AV114TFHisReoTn_To ;
      AV192Wpncyrcds_38_tfhisopecod = AV116TFHisOpecod ;
      AV193Wpncyrcds_39_tfhisopecod_to = AV117TFHisOpecod_To ;
      AV194Wpncyrcds_40_tfhisacco = AV119TFHisAcCo ;
      AV195Wpncyrcds_41_tfhisacco_sel = AV120TFHisAcCo_Sel ;
      AV196Wpncyrcds_42_tfhisaccot = AV122TFHisAcCot ;
      AV197Wpncyrcds_43_tfhisaccot_sel = AV123TFHisAcCot_Sel ;
      AV198Wpncyrcds_44_tfhisadeacco = AV125TFHisAdEAcCo ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = AV126TFHisAdEAcCo_Sel ;
      AV200Wpncyrcds_46_tfhisadeacct = AV128TFHisAdEAcCt ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = AV129TFHisAdEAcCt_Sel ;
      AV202Wpncyrcds_48_tfhistipartdsc = AV148TFHisTipArtDsc ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = AV149TFHisTipArtDsc_Sel ;
      AV204Wpncyrcds_50_tfhistipcoldsc = AV150TFHisTipColDsc ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = AV151TFHisTipColDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12DW2( )
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

   public void e13DW2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14DW2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisEstReo") == 0 )
         {
            AV46TFHisEstReo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFHisEstReo_SelsJson", AV46TFHisEstReo_SelsJson);
            AV47TFHisEstReo_Sels.fromJSonString(GXutil.strReplace( AV46TFHisEstReo_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoFec") == 0 )
         {
            AV58TFHisReoFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFHisReoFec", localUtil.format(AV58TFHisReoFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoHDR") == 0 )
         {
            AV49TFHisReoHDR = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFHisReoHDR", AV49TFHisReoHDR);
            AV50TFHisReoHDR_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFHisReoHDR_Sel", AV50TFHisReoHDR_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisreoLote") == 0 )
         {
            AV68TFHisreoLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFHisreoLote", AV68TFHisreoLote);
            AV69TFHisreoLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFHisreoLote_Sel", AV69TFHisreoLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV71TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliNom", AV71TFCliNom);
            AV72TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFCliNom_Sel", AV72TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisBarSer") == 0 )
         {
            AV74TFHisBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFHisBarSer", AV74TFHisBarSer);
            AV75TFHisBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFHisBarSer_Sel", AV75TFHisBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoDsc") == 0 )
         {
            AV77TFHisReoDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFHisReoDsc", AV77TFHisReoDsc);
            AV78TFHisReoDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFHisReoDsc_Sel", AV78TFHisReoDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisColNom") == 0 )
         {
            AV80TFHisColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFHisColNom", AV80TFHisColNom);
            AV81TFHisColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFHisColNom_Sel", AV81TFHisColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisNomCli") == 0 )
         {
            AV83TFHisNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFHisNomCli", AV83TFHisNomCli);
            AV84TFHisNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFHisNomCli_Sel", AV84TFHisNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisOpeTur") == 0 )
         {
            AV86TFHisOpeTur = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFHisOpeTur", GXutil.str( AV86TFHisOpeTur, 1, 0));
            AV87TFHisOpeTur_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFHisOpeTur_To", GXutil.str( AV87TFHisOpeTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV89TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFMaqCod", AV89TFMaqCod);
            AV90TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFMaqCod_Sel", AV90TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisBarKgm") == 0 )
         {
            AV92TFHisBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFHisBarKgm", GXutil.ltrimstr( AV92TFHisBarKgm, 9, 2));
            AV93TFHisBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFHisBarKgm_To", GXutil.ltrimstr( AV93TFHisBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisBarMtr") == 0 )
         {
            AV95TFHisBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFHisBarMtr", GXutil.ltrimstr( AV95TFHisBarMtr, 9, 2));
            AV96TFHisBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFHisBarMtr_To", GXutil.ltrimstr( AV96TFHisBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CostCausa") == 0 )
         {
            AV98TFCostCausa = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFCostCausa", GXutil.ltrimstr( AV98TFCostCausa, 11, 3));
            AV99TFCostCausa_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFCostCausa_To", GXutil.ltrimstr( AV99TFCostCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisreoValorCausa") == 0 )
         {
            AV101TFHisreoValorCausa = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFHisreoValorCausa", GXutil.ltrimstr( AV101TFHisreoValorCausa, 11, 3));
            AV102TFHisreoValorCausa_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFHisreoValorCausa_To", GXutil.ltrimstr( AV102TFHisreoValorCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipDefDsc") == 0 )
         {
            AV104TFTipDefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFTipDefDsc", AV104TFTipDefDsc);
            AV105TFTipDefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFTipDefDsc_Sel", AV105TFTipDefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DscCausa") == 0 )
         {
            AV107TFDscCausa = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFDscCausa", AV107TFDscCausa);
            AV108TFDscCausa_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFDscCausa_Sel", AV108TFDscCausa_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Rps_Dsc") == 0 )
         {
            AV110TFRps_Dsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFRps_Dsc", AV110TFRps_Dsc);
            AV111TFRps_Dsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFRps_Dsc_Sel", AV111TFRps_Dsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisReoTn") == 0 )
         {
            AV113TFHisReoTn = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFHisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFHisReoTn), 6, 0));
            AV114TFHisReoTn_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFHisReoTn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFHisReoTn_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisOpecod") == 0 )
         {
            AV116TFHisOpecod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFHisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116TFHisOpecod), 6, 0));
            AV117TFHisOpecod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFHisOpecod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117TFHisOpecod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAcCo") == 0 )
         {
            AV119TFHisAcCo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFHisAcCo", AV119TFHisAcCo);
            AV120TFHisAcCo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120TFHisAcCo_Sel", AV120TFHisAcCo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAcCot") == 0 )
         {
            AV122TFHisAcCot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFHisAcCot", AV122TFHisAcCot);
            AV123TFHisAcCot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFHisAcCot_Sel", AV123TFHisAcCot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAdEAcCo") == 0 )
         {
            AV125TFHisAdEAcCo = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFHisAdEAcCo", AV125TFHisAdEAcCo);
            AV126TFHisAdEAcCo_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFHisAdEAcCo_Sel", AV126TFHisAdEAcCo_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisAdEAcCt") == 0 )
         {
            AV128TFHisAdEAcCt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFHisAdEAcCt", AV128TFHisAdEAcCt);
            AV129TFHisAdEAcCt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFHisAdEAcCt_Sel", AV129TFHisAdEAcCt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisTipArtDsc") == 0 )
         {
            AV148TFHisTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFHisTipArtDsc", AV148TFHisTipArtDsc);
            AV149TFHisTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFHisTipArtDsc_Sel", AV149TFHisTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisTipColDsc") == 0 )
         {
            AV150TFHisTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV150TFHisTipColDsc", AV150TFHisTipColDsc);
            AV151TFHisTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151TFHisTipColDsc_Sel", AV151TFHisTipColDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47TFHisEstReo_Sels", AV47TFHisEstReo_Sels);
   }

   private void e20DW2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      AV131Informe = httpContext.getMessage( "Informe", "") ;
      httpContext.ajax_rsp_assign_attri("", false, edtavInforme_Internalname, AV131Informe);
      edtavInforme_Link = formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {})  ;
      edtRps_Dsc_Link = formatLink("app.ficherosbasicos.tcodrpsview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A7000Rps_Cod,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","Rps_Cod","TabCode"})  ;
      edtHisTipColD_Link = formatLink("app.formulaciontinte.ttipcolview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A572HisTipCol,2,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TipColCod","TabCode"})  ;
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      /*
         Assignment error:
         ================
         Expression: [ t('link(',1),t(o(13,'WebWkp85'),28),t(',',7),t(396,2),t(',',7),t(539,2),t(',',7),t(545,2),t(',',7),t(544,2),t(')',4) ]
         Target    : [ t('Update',23),t('Link',3) ]
         ForType   : 29
         Type      : []
      */
      if ( A548HisEstReo == 1 )
      {
         if ( A2297HisReoTn > 0 )
         {
            edtavInforme_Link = formatLink("app.apncl001", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2297HisReoTn,6,0))}, new String[] {"EmprCod","HisReoTn"})  ;
         }
      }
      else
      {
         if ( A2297HisReoTn > 0 )
         {
            edtavInforme_Link = formatLink("app.apcnore1", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2297HisReoTn,6,0)),GXutil.URLEncode(GXutil.rtrim(" "))}, new String[] {"EmprCod","Nr_barcod","Nr_barreo","Nr_barpar","HisReoTn","ImpCod"})  ;
         }
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(46) ;
      }
      sendrow_462( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_46_Refreshing )
      {
         httpContext.doAjaxLoad(46, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV147GridActions, 4, 0)) );
   }

   public void e15DW2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV37ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV39ColumnsSelector.fromJSonString(AV37ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WPNcyRcColumnsSelector", ((GXutil.strcmp("", AV37ColumnsSelectorXML)==0) ? "" : AV39ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11DW2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WPNcyRcFilters")),GXutil.URLEncode(GXutil.rtrim(AV206Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WPNcyRcFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV43ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WPNcyRcFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wpncyrc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV43ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV43ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV206Pgmname+"GridState", AV43ManageFiltersXml) ;
            AV10GridState.fromxml(AV43ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47TFHisEstReo_Sels", AV47TFHisEstReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e21DW2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV147GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV147GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S202 ();
         if (returnInSub) return;
      }
      AV147GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV147GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV147GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e16DW2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV35ExcelFilename ;
      GXv_char3[0] = AV36ErrorMessage ;
      new app.wpncyrcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wpncyrc_impl.this.AV35ExcelFilename = GXv_char4[0] ;
      wpncyrc_impl.this.AV36ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV35ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV35ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV36ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47TFHisEstReo_Sels", AV47TFHisEstReo_Sels);
   }

   public void e17DW2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.wpncyrcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47TFHisEstReo_Sels", AV47TFHisEstReo_Sels);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV39ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisEstReo", "", "Tipo", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoFec", "", "Fecha", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoHDR", "", "Hdr", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisreoLote", "", "Lote", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Cliente", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisBarSer", "", "Articulo", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoDsc", "", "Descripcion", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisColNom", "", "Color", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisNomCli", "", "Color Cliente", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisOpeTur", "", "T", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqCod", "", "Código Máquina", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisBarKgm", "", "Kilos", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisBarMtr", "", "Metros", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CostCausa", "", "Coste", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisreoValorCausa", "", "Valor", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "TipDefDsc", "", "Defecto", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DscCausa", "", "Causa", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "Rps_Dsc", "", "Responsabilidad", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisReoTn", "", "N Int", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisOpecod", "", "Operario", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAcCo", "", "Acciones Corrección a implementar:", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAcCot", "", "Acciones Correctivas a Implementar:", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAdEAcCo", "", "Analisis de Corrección", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisAdEAcCt", "", "Analisis  Accion Correctivas", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisTipArtDsc", "", "de Articulo", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "HisTipColDsc", "", "Tipo Colorante", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV38UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPNcyRcColumnsSelector", GXv_char4) ;
      wpncyrc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV40ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV40ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV39ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV40ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV39ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV42ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WPNcyRcFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV42ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV130FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130FilterFullText", AV130FilterFullText);
      AV47TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV58TFHisReoFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFHisReoFec", localUtil.format(AV58TFHisReoFec, "99/99/99"));
      AV49TFHisReoHDR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFHisReoHDR", AV49TFHisReoHDR);
      AV50TFHisReoHDR_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFHisReoHDR_Sel", AV50TFHisReoHDR_Sel);
      AV68TFHisreoLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFHisreoLote", AV68TFHisreoLote);
      AV69TFHisreoLote_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFHisreoLote_Sel", AV69TFHisreoLote_Sel);
      AV71TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliNom", AV71TFCliNom);
      AV72TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFCliNom_Sel", AV72TFCliNom_Sel);
      AV74TFHisBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFHisBarSer", AV74TFHisBarSer);
      AV75TFHisBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFHisBarSer_Sel", AV75TFHisBarSer_Sel);
      AV77TFHisReoDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFHisReoDsc", AV77TFHisReoDsc);
      AV78TFHisReoDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFHisReoDsc_Sel", AV78TFHisReoDsc_Sel);
      AV80TFHisColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFHisColNom", AV80TFHisColNom);
      AV81TFHisColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFHisColNom_Sel", AV81TFHisColNom_Sel);
      AV83TFHisNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFHisNomCli", AV83TFHisNomCli);
      AV84TFHisNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFHisNomCli_Sel", AV84TFHisNomCli_Sel);
      AV86TFHisOpeTur = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFHisOpeTur", GXutil.str( AV86TFHisOpeTur, 1, 0));
      AV87TFHisOpeTur_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFHisOpeTur_To", GXutil.str( AV87TFHisOpeTur_To, 1, 0));
      AV89TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFMaqCod", AV89TFMaqCod);
      AV90TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFMaqCod_Sel", AV90TFMaqCod_Sel);
      AV92TFHisBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFHisBarKgm", GXutil.ltrimstr( AV92TFHisBarKgm, 9, 2));
      AV93TFHisBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFHisBarKgm_To", GXutil.ltrimstr( AV93TFHisBarKgm_To, 9, 2));
      AV95TFHisBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFHisBarMtr", GXutil.ltrimstr( AV95TFHisBarMtr, 9, 2));
      AV96TFHisBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFHisBarMtr_To", GXutil.ltrimstr( AV96TFHisBarMtr_To, 9, 2));
      AV98TFCostCausa = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFCostCausa", GXutil.ltrimstr( AV98TFCostCausa, 11, 3));
      AV99TFCostCausa_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99TFCostCausa_To", GXutil.ltrimstr( AV99TFCostCausa_To, 11, 3));
      AV101TFHisreoValorCausa = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFHisreoValorCausa", GXutil.ltrimstr( AV101TFHisreoValorCausa, 11, 3));
      AV102TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TFHisreoValorCausa_To", GXutil.ltrimstr( AV102TFHisreoValorCausa_To, 11, 3));
      AV104TFTipDefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TFTipDefDsc", AV104TFTipDefDsc);
      AV105TFTipDefDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TFTipDefDsc_Sel", AV105TFTipDefDsc_Sel);
      AV107TFDscCausa = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFDscCausa", AV107TFDscCausa);
      AV108TFDscCausa_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TFDscCausa_Sel", AV108TFDscCausa_Sel);
      AV110TFRps_Dsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TFRps_Dsc", AV110TFRps_Dsc);
      AV111TFRps_Dsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111TFRps_Dsc_Sel", AV111TFRps_Dsc_Sel);
      AV113TFHisReoTn = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113TFHisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFHisReoTn), 6, 0));
      AV114TFHisReoTn_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114TFHisReoTn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFHisReoTn_To), 6, 0));
      AV116TFHisOpecod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116TFHisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116TFHisOpecod), 6, 0));
      AV117TFHisOpecod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117TFHisOpecod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117TFHisOpecod_To), 6, 0));
      AV119TFHisAcCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119TFHisAcCo", AV119TFHisAcCo);
      AV120TFHisAcCo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120TFHisAcCo_Sel", AV120TFHisAcCo_Sel);
      AV122TFHisAcCot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122TFHisAcCot", AV122TFHisAcCot);
      AV123TFHisAcCot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123TFHisAcCot_Sel", AV123TFHisAcCot_Sel);
      AV125TFHisAdEAcCo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125TFHisAdEAcCo", AV125TFHisAdEAcCo);
      AV126TFHisAdEAcCo_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126TFHisAdEAcCo_Sel", AV126TFHisAdEAcCo_Sel);
      AV128TFHisAdEAcCt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128TFHisAdEAcCt", AV128TFHisAdEAcCt);
      AV129TFHisAdEAcCt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129TFHisAdEAcCt_Sel", AV129TFHisAdEAcCt_Sel);
      AV148TFHisTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV148TFHisTipArtDsc", AV148TFHisTipArtDsc);
      AV149TFHisTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV149TFHisTipArtDsc_Sel", AV149TFHisTipArtDsc_Sel);
      AV150TFHisTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV150TFHisTipColDsc", AV150TFHisTipColDsc);
      AV151TFHisTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV151TFHisTipColDsc_Sel", AV151TFHisTipColDsc_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.thisreo", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A833TipDefCod,4,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.thisreo", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A539HisBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A545HisCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A544HisCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A833TipDefCod,4,0))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV206Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV206Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV41Session.getValue(AV206Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV207GXV1 = 1 ;
      while ( AV207GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV207GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV130FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV130FilterFullText", AV130FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISESTREO_SEL") == 0 )
         {
            AV46TFHisEstReo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFHisEstReo_SelsJson", AV46TFHisEstReo_SelsJson);
            AV47TFHisEstReo_Sels.fromJSonString(AV46TFHisEstReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOFEC") == 0 )
         {
            AV58TFHisReoFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFHisReoFec", localUtil.format(AV58TFHisReoFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR") == 0 )
         {
            AV49TFHisReoHDR = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFHisReoHDR", AV49TFHisReoHDR);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR_SEL") == 0 )
         {
            AV50TFHisReoHDR_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFHisReoHDR_Sel", AV50TFHisReoHDR_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE") == 0 )
         {
            AV68TFHisreoLote = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFHisreoLote", AV68TFHisreoLote);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE_SEL") == 0 )
         {
            AV69TFHisreoLote_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFHisreoLote_Sel", AV69TFHisreoLote_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV71TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFCliNom", AV71TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV72TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFCliNom_Sel", AV72TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER") == 0 )
         {
            AV74TFHisBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFHisBarSer", AV74TFHisBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER_SEL") == 0 )
         {
            AV75TFHisBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFHisBarSer_Sel", AV75TFHisBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC") == 0 )
         {
            AV77TFHisReoDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFHisReoDsc", AV77TFHisReoDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC_SEL") == 0 )
         {
            AV78TFHisReoDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFHisReoDsc_Sel", AV78TFHisReoDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM") == 0 )
         {
            AV80TFHisColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFHisColNom", AV80TFHisColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM_SEL") == 0 )
         {
            AV81TFHisColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFHisColNom_Sel", AV81TFHisColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI") == 0 )
         {
            AV83TFHisNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFHisNomCli", AV83TFHisNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI_SEL") == 0 )
         {
            AV84TFHisNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFHisNomCli_Sel", AV84TFHisNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPETUR") == 0 )
         {
            AV86TFHisOpeTur = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFHisOpeTur", GXutil.str( AV86TFHisOpeTur, 1, 0));
            AV87TFHisOpeTur_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFHisOpeTur_To", GXutil.str( AV87TFHisOpeTur_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV89TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFMaqCod", AV89TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV90TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFMaqCod_Sel", AV90TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARKGM") == 0 )
         {
            AV92TFHisBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFHisBarKgm", GXutil.ltrimstr( AV92TFHisBarKgm, 9, 2));
            AV93TFHisBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFHisBarKgm_To", GXutil.ltrimstr( AV93TFHisBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARMTR") == 0 )
         {
            AV95TFHisBarMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFHisBarMtr", GXutil.ltrimstr( AV95TFHisBarMtr, 9, 2));
            AV96TFHisBarMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFHisBarMtr_To", GXutil.ltrimstr( AV96TFHisBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTCAUSA") == 0 )
         {
            AV98TFCostCausa = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFCostCausa", GXutil.ltrimstr( AV98TFCostCausa, 11, 3));
            AV99TFCostCausa_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFCostCausa_To", GXutil.ltrimstr( AV99TFCostCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOVALORCAUSA") == 0 )
         {
            AV101TFHisreoValorCausa = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFHisreoValorCausa", GXutil.ltrimstr( AV101TFHisreoValorCausa, 11, 3));
            AV102TFHisreoValorCausa_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFHisreoValorCausa_To", GXutil.ltrimstr( AV102TFHisreoValorCausa_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC") == 0 )
         {
            AV104TFTipDefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFTipDefDsc", AV104TFTipDefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC_SEL") == 0 )
         {
            AV105TFTipDefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFTipDefDsc_Sel", AV105TFTipDefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA") == 0 )
         {
            AV107TFDscCausa = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFDscCausa", AV107TFDscCausa);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA_SEL") == 0 )
         {
            AV108TFDscCausa_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFDscCausa_Sel", AV108TFDscCausa_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC") == 0 )
         {
            AV110TFRps_Dsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFRps_Dsc", AV110TFRps_Dsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC_SEL") == 0 )
         {
            AV111TFRps_Dsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFRps_Dsc_Sel", AV111TFRps_Dsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOTN") == 0 )
         {
            AV113TFHisReoTn = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFHisReoTn", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFHisReoTn), 6, 0));
            AV114TFHisReoTn_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFHisReoTn_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFHisReoTn_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPECOD") == 0 )
         {
            AV116TFHisOpecod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFHisOpecod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116TFHisOpecod), 6, 0));
            AV117TFHisOpecod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFHisOpecod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117TFHisOpecod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO") == 0 )
         {
            AV119TFHisAcCo = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFHisAcCo", AV119TFHisAcCo);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO_SEL") == 0 )
         {
            AV120TFHisAcCo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120TFHisAcCo_Sel", AV120TFHisAcCo_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT") == 0 )
         {
            AV122TFHisAcCot = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFHisAcCot", AV122TFHisAcCot);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT_SEL") == 0 )
         {
            AV123TFHisAcCot_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFHisAcCot_Sel", AV123TFHisAcCot_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO") == 0 )
         {
            AV125TFHisAdEAcCo = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFHisAdEAcCo", AV125TFHisAdEAcCo);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO_SEL") == 0 )
         {
            AV126TFHisAdEAcCo_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFHisAdEAcCo_Sel", AV126TFHisAdEAcCo_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT") == 0 )
         {
            AV128TFHisAdEAcCt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFHisAdEAcCt", AV128TFHisAdEAcCt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT_SEL") == 0 )
         {
            AV129TFHisAdEAcCt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFHisAdEAcCt_Sel", AV129TFHisAdEAcCt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC") == 0 )
         {
            AV148TFHisTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148TFHisTipArtDsc", AV148TFHisTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC_SEL") == 0 )
         {
            AV149TFHisTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149TFHisTipArtDsc_Sel", AV149TFHisTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC") == 0 )
         {
            AV150TFHisTipColDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV150TFHisTipColDsc", AV150TFHisTipColDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC_SEL") == 0 )
         {
            AV151TFHisTipColDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151TFHisTipColDsc_Sel", AV151TFHisTipColDsc_Sel);
         }
         AV207GXV1 = (int)(AV207GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFHisReoHDR_Sel)==0), AV50TFHisReoHDR_Sel, GXv_char4) ;
      wpncyrc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFHisreoLote_Sel)==0), AV69TFHisreoLote_Sel, GXv_char3) ;
      wpncyrc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFCliNom_Sel)==0), AV72TFCliNom_Sel, GXv_char2) ;
      wpncyrc_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFHisBarSer_Sel)==0), AV75TFHisBarSer_Sel, GXv_char17) ;
      wpncyrc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFHisReoDsc_Sel)==0), AV78TFHisReoDsc_Sel, GXv_char19) ;
      wpncyrc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFHisColNom_Sel)==0), AV81TFHisColNom_Sel, GXv_char21) ;
      wpncyrc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFHisNomCli_Sel)==0), AV84TFHisNomCli_Sel, GXv_char23) ;
      wpncyrc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFMaqCod_Sel)==0), AV90TFMaqCod_Sel, GXv_char25) ;
      wpncyrc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV105TFTipDefDsc_Sel)==0), AV105TFTipDefDsc_Sel, GXv_char27) ;
      wpncyrc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFDscCausa_Sel)==0), AV108TFDscCausa_Sel, GXv_char29) ;
      wpncyrc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV111TFRps_Dsc_Sel)==0), AV111TFRps_Dsc_Sel, GXv_char31) ;
      wpncyrc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV120TFHisAcCo_Sel)==0), AV120TFHisAcCo_Sel, GXv_char33) ;
      wpncyrc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV123TFHisAcCot_Sel)==0), AV123TFHisAcCot_Sel, GXv_char35) ;
      wpncyrc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV126TFHisAdEAcCo_Sel)==0), AV126TFHisAdEAcCo_Sel, GXv_char37) ;
      wpncyrc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV129TFHisAdEAcCt_Sel)==0), AV129TFHisAdEAcCt_Sel, GXv_char39) ;
      wpncyrc_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV149TFHisTipArtDsc_Sel)==0), AV149TFHisTipArtDsc_Sel, GXv_char41) ;
      wpncyrc_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV151TFHisTipColDsc_Sel)==0), AV151TFHisTipColDsc_Sel, GXv_char43) ;
      wpncyrc_impl.this.GXt_char42 = GXv_char43[0] ;
      Ddo_grid_Selectedvalue_set = ((AV47TFHisEstReo_Sels.size()==0) ? "" : AV46TFHisEstReo_SelsJson)+"||"+GXt_char1+"|"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"||"+GXt_char24+"|||||"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30+"|||"+GXt_char32+"|"+GXt_char34+"|"+GXt_char36+"|"+GXt_char38+"|"+GXt_char40+"|"+GXt_char42 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFHisReoHDR)==0), AV49TFHisReoHDR, GXv_char43) ;
      wpncyrc_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFHisreoLote)==0), AV68TFHisreoLote, GXv_char41) ;
      wpncyrc_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFCliNom)==0), AV71TFCliNom, GXv_char39) ;
      wpncyrc_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFHisBarSer)==0), AV74TFHisBarSer, GXv_char37) ;
      wpncyrc_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFHisReoDsc)==0), AV77TFHisReoDsc, GXv_char35) ;
      wpncyrc_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFHisColNom)==0), AV80TFHisColNom, GXv_char33) ;
      wpncyrc_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFHisNomCli)==0), AV83TFHisNomCli, GXv_char31) ;
      wpncyrc_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFMaqCod)==0), AV89TFMaqCod, GXv_char29) ;
      wpncyrc_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFTipDefDsc)==0), AV104TFTipDefDsc, GXv_char27) ;
      wpncyrc_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFDscCausa)==0), AV107TFDscCausa, GXv_char25) ;
      wpncyrc_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFRps_Dsc)==0), AV110TFRps_Dsc, GXv_char23) ;
      wpncyrc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV119TFHisAcCo)==0), AV119TFHisAcCo, GXv_char21) ;
      wpncyrc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV122TFHisAcCot)==0), AV122TFHisAcCot, GXv_char19) ;
      wpncyrc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV125TFHisAdEAcCo)==0), AV125TFHisAdEAcCo, GXv_char17) ;
      wpncyrc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV128TFHisAdEAcCt)==0), AV128TFHisAdEAcCt, GXv_char4) ;
      wpncyrc_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV148TFHisTipArtDsc)==0), AV148TFHisTipArtDsc, GXv_char3) ;
      wpncyrc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV150TFHisTipColDsc)==0), AV150TFHisTipColDsc, GXv_char2) ;
      wpncyrc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFHisReoFec)) ? "" : localUtil.dtoc( AV58TFHisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char42+"|"+GXt_char40+"|"+GXt_char38+"|"+GXt_char36+"|"+GXt_char34+"|"+GXt_char32+"|"+GXt_char30+"|"+((0==AV86TFHisOpeTur) ? "" : GXutil.str( AV86TFHisOpeTur, 1, 0))+"|"+GXt_char28+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFHisBarKgm)==0) ? "" : GXutil.str( AV92TFHisBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV95TFHisBarMtr)==0) ? "" : GXutil.str( AV95TFHisBarMtr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFCostCausa)==0) ? "" : GXutil.str( AV98TFCostCausa, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV101TFHisreoValorCausa)==0) ? "" : GXutil.str( AV101TFHisreoValorCausa, 11, 3))+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+((0==AV113TFHisReoTn) ? "" : GXutil.str( AV113TFHisReoTn, 6, 0))+"|"+((0==AV116TFHisOpecod) ? "" : GXutil.str( AV116TFHisOpecod, 6, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||||||"+((0==AV87TFHisOpeTur_To) ? "" : GXutil.str( AV87TFHisOpeTur_To, 1, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFHisBarKgm_To)==0) ? "" : GXutil.str( AV93TFHisBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TFHisBarMtr_To)==0) ? "" : GXutil.str( AV96TFHisBarMtr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFCostCausa_To)==0) ? "" : GXutil.str( AV99TFCostCausa_To, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV102TFHisreoValorCausa_To)==0) ? "" : GXutil.str( AV102TFHisreoValorCausa_To, 11, 3))+"||||"+((0==AV114TFHisReoTn_To) ? "" : GXutil.str( AV114TFHisReoTn_To, 6, 0))+"|"+((0==AV117TFHisOpecod_To) ? "" : GXutil.str( AV117TFHisOpecod_To, 6, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV41Session.getValue(AV206Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV130FilterFullText)==0), (short)(0), AV130FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISESTREO_SEL", "", !(AV47TFHisEstReo_Sels.size()==0), (short)(0), AV47TFHisEstReo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV58TFHisReoFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV58TFHisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOHDR", "", !(GXutil.strcmp("", AV49TFHisReoHDR)==0), (short)(0), AV49TFHisReoHDR, "", !(GXutil.strcmp("", AV50TFHisReoHDR_Sel)==0), AV50TFHisReoHDR_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOLOTE", "", !(GXutil.strcmp("", AV68TFHisreoLote)==0), (short)(0), AV68TFHisreoLote, "", !(GXutil.strcmp("", AV69TFHisreoLote_Sel)==0), AV69TFHisreoLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFCLINOM", "", !(GXutil.strcmp("", AV71TFCliNom)==0), (short)(0), AV71TFCliNom, "", !(GXutil.strcmp("", AV72TFCliNom_Sel)==0), AV72TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISBARSER", "", !(GXutil.strcmp("", AV74TFHisBarSer)==0), (short)(0), AV74TFHisBarSer, "", !(GXutil.strcmp("", AV75TFHisBarSer_Sel)==0), AV75TFHisBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREODSC", "", !(GXutil.strcmp("", AV77TFHisReoDsc)==0), (short)(0), AV77TFHisReoDsc, "", !(GXutil.strcmp("", AV78TFHisReoDsc_Sel)==0), AV78TFHisReoDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISCOLNOM", "", !(GXutil.strcmp("", AV80TFHisColNom)==0), (short)(0), AV80TFHisColNom, "", !(GXutil.strcmp("", AV81TFHisColNom_Sel)==0), AV81TFHisColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISNOMCLI", "", !(GXutil.strcmp("", AV83TFHisNomCli)==0), (short)(0), AV83TFHisNomCli, "", !(GXutil.strcmp("", AV84TFHisNomCli_Sel)==0), AV84TFHisNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISOPETUR", "", !((0==AV86TFHisOpeTur)&&(0==AV87TFHisOpeTur_To)), (short)(0), GXutil.trim( GXutil.str( AV86TFHisOpeTur, 1, 0)), GXutil.trim( GXutil.str( AV87TFHisOpeTur_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFMAQCOD", "", !(GXutil.strcmp("", AV89TFMaqCod)==0), (short)(0), AV89TFMaqCod, "", !(GXutil.strcmp("", AV90TFMaqCod_Sel)==0), AV90TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFHisBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFHisBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV92TFHisBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV93TFHisBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV95TFHisBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV96TFHisBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV95TFHisBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV96TFHisBarMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFCOSTCAUSA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFCostCausa)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFCostCausa_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV98TFCostCausa, 11, 3)), GXutil.trim( GXutil.str( AV99TFCostCausa_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOVALORCAUSA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV101TFHisreoValorCausa)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV102TFHisreoValorCausa_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV101TFHisreoValorCausa, 11, 3)), GXutil.trim( GXutil.str( AV102TFHisreoValorCausa_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFTIPDEFDSC", "", !(GXutil.strcmp("", AV104TFTipDefDsc)==0), (short)(0), AV104TFTipDefDsc, "", !(GXutil.strcmp("", AV105TFTipDefDsc_Sel)==0), AV105TFTipDefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFDSCCAUSA", "", !(GXutil.strcmp("", AV107TFDscCausa)==0), (short)(0), AV107TFDscCausa, "", !(GXutil.strcmp("", AV108TFDscCausa_Sel)==0), AV108TFDscCausa_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFRPS_DSC", "", !(GXutil.strcmp("", AV110TFRps_Dsc)==0), (short)(0), AV110TFRps_Dsc, "", !(GXutil.strcmp("", AV111TFRps_Dsc_Sel)==0), AV111TFRps_Dsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISREOTN", "", !((0==AV113TFHisReoTn)&&(0==AV114TFHisReoTn_To)), (short)(0), GXutil.trim( GXutil.str( AV113TFHisReoTn, 6, 0)), GXutil.trim( GXutil.str( AV114TFHisReoTn_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISOPECOD", "", !((0==AV116TFHisOpecod)&&(0==AV117TFHisOpecod_To)), (short)(0), GXutil.trim( GXutil.str( AV116TFHisOpecod, 6, 0)), GXutil.trim( GXutil.str( AV117TFHisOpecod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISACCO", "", !(GXutil.strcmp("", AV119TFHisAcCo)==0), (short)(0), AV119TFHisAcCo, "", !(GXutil.strcmp("", AV120TFHisAcCo_Sel)==0), AV120TFHisAcCo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISACCOT", "", !(GXutil.strcmp("", AV122TFHisAcCot)==0), (short)(0), AV122TFHisAcCot, "", !(GXutil.strcmp("", AV123TFHisAcCot_Sel)==0), AV123TFHisAcCot_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISADEACCO", "", !(GXutil.strcmp("", AV125TFHisAdEAcCo)==0), (short)(0), AV125TFHisAdEAcCo, "", !(GXutil.strcmp("", AV126TFHisAdEAcCo_Sel)==0), AV126TFHisAdEAcCo_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISADEACCT", "", !(GXutil.strcmp("", AV128TFHisAdEAcCt)==0), (short)(0), AV128TFHisAdEAcCt, "", !(GXutil.strcmp("", AV129TFHisAdEAcCt_Sel)==0), AV129TFHisAdEAcCt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISTIPARTDSC", "", !(GXutil.strcmp("", AV148TFHisTipArtDsc)==0), (short)(0), AV148TFHisTipArtDsc, "", !(GXutil.strcmp("", AV149TFHisTipArtDsc_Sel)==0), AV149TFHisTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      GXv_SdtWWPGridState44[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState44, "TFHISTIPCOLDSC", "", !(GXutil.strcmp("", AV150TFHisTipColDsc)==0), (short)(0), AV150TFHisTipColDsc, "", !(GXutil.strcmp("", AV151TFHisTipColDsc_Sel)==0), AV151TFHisTipColDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState44[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV206Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV206Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "THISREO" );
      AV41Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_DW2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV42ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_DW2( true) ;
      }
      else
      {
         wb_table2_28_DW2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_DW2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_DW2e( true) ;
      }
      else
      {
         wb_table1_23_DW2e( false) ;
      }
   }

   public void wb_table2_28_DW2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_46_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV130FilterFullText, GXutil.rtrim( localUtil.format( AV130FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WPNcyRc.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_DW2e( true) ;
      }
      else
      {
         wb_table2_28_DW2e( false) ;
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
      paDW2( ) ;
      wsDW2( ) ;
      weDW2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821161272", true, true);
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
      httpContext.AddJavascriptSource("wpncyrc.js", "?2026821161273", false, true);
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

   public void subsflControlProps_462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_46_idx );
      edtavInforme_Internalname = "vINFORME_"+sGXsfl_46_idx ;
      cmbHisEstReo.setInternalname( "HISESTREO_"+sGXsfl_46_idx );
      edtHisReoFec_Internalname = "HISREOFEC_"+sGXsfl_46_idx ;
      edtHisReoHDR_Internalname = "HISREOHDR_"+sGXsfl_46_idx ;
      edtHisBarCod_Internalname = "HISBARCOD_"+sGXsfl_46_idx ;
      edtHisCodReo_Internalname = "HISCODREO_"+sGXsfl_46_idx ;
      edtHisCodPar_Internalname = "HISCODPAR_"+sGXsfl_46_idx ;
      edtHisreoLote_Internalname = "HISREOLOTE_"+sGXsfl_46_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_idx ;
      edtHisBarSer_Internalname = "HISBARSER_"+sGXsfl_46_idx ;
      edtHisReoDsc_Internalname = "HISREODSC_"+sGXsfl_46_idx ;
      edtHisColNom_Internalname = "HISCOLNOM_"+sGXsfl_46_idx ;
      edtHisNomCli_Internalname = "HISNOMCLI_"+sGXsfl_46_idx ;
      edtHisOpeTur_Internalname = "HISOPETUR_"+sGXsfl_46_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_46_idx ;
      edtHisBarKgm_Internalname = "HISBARKGM_"+sGXsfl_46_idx ;
      edtHisBarMtr_Internalname = "HISBARMTR_"+sGXsfl_46_idx ;
      edtCostCausa_Internalname = "COSTCAUSA_"+sGXsfl_46_idx ;
      edtHisreoValo_Internalname = "HISREOVALO_"+sGXsfl_46_idx ;
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_46_idx ;
      edtDscCausa_Internalname = "DSCCAUSA_"+sGXsfl_46_idx ;
      edtRps_Dsc_Internalname = "RPS_DSC_"+sGXsfl_46_idx ;
      edtHisReoTn_Internalname = "HISREOTN_"+sGXsfl_46_idx ;
      edtHisOpecod_Internalname = "HISOPECOD_"+sGXsfl_46_idx ;
      edtHisAcCo_Internalname = "HISACCO_"+sGXsfl_46_idx ;
      edtHisAcCot_Internalname = "HISACCOT_"+sGXsfl_46_idx ;
      edtHisAdEAcCo_Internalname = "HISADEACCO_"+sGXsfl_46_idx ;
      edtHisAdEAcCt_Internalname = "HISADEACCT_"+sGXsfl_46_idx ;
      edtHisTipArtD_Internalname = "HISTIPARTD_"+sGXsfl_46_idx ;
      edtHisTipColD_Internalname = "HISTIPCOLD_"+sGXsfl_46_idx ;
   }

   public void subsflControlProps_fel_462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_46_fel_idx );
      edtavInforme_Internalname = "vINFORME_"+sGXsfl_46_fel_idx ;
      cmbHisEstReo.setInternalname( "HISESTREO_"+sGXsfl_46_fel_idx );
      edtHisReoFec_Internalname = "HISREOFEC_"+sGXsfl_46_fel_idx ;
      edtHisReoHDR_Internalname = "HISREOHDR_"+sGXsfl_46_fel_idx ;
      edtHisBarCod_Internalname = "HISBARCOD_"+sGXsfl_46_fel_idx ;
      edtHisCodReo_Internalname = "HISCODREO_"+sGXsfl_46_fel_idx ;
      edtHisCodPar_Internalname = "HISCODPAR_"+sGXsfl_46_fel_idx ;
      edtHisreoLote_Internalname = "HISREOLOTE_"+sGXsfl_46_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_46_fel_idx ;
      edtHisBarSer_Internalname = "HISBARSER_"+sGXsfl_46_fel_idx ;
      edtHisReoDsc_Internalname = "HISREODSC_"+sGXsfl_46_fel_idx ;
      edtHisColNom_Internalname = "HISCOLNOM_"+sGXsfl_46_fel_idx ;
      edtHisNomCli_Internalname = "HISNOMCLI_"+sGXsfl_46_fel_idx ;
      edtHisOpeTur_Internalname = "HISOPETUR_"+sGXsfl_46_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_46_fel_idx ;
      edtHisBarKgm_Internalname = "HISBARKGM_"+sGXsfl_46_fel_idx ;
      edtHisBarMtr_Internalname = "HISBARMTR_"+sGXsfl_46_fel_idx ;
      edtCostCausa_Internalname = "COSTCAUSA_"+sGXsfl_46_fel_idx ;
      edtHisreoValo_Internalname = "HISREOVALO_"+sGXsfl_46_fel_idx ;
      edtTipDefDsc_Internalname = "TIPDEFDSC_"+sGXsfl_46_fel_idx ;
      edtDscCausa_Internalname = "DSCCAUSA_"+sGXsfl_46_fel_idx ;
      edtRps_Dsc_Internalname = "RPS_DSC_"+sGXsfl_46_fel_idx ;
      edtHisReoTn_Internalname = "HISREOTN_"+sGXsfl_46_fel_idx ;
      edtHisOpecod_Internalname = "HISOPECOD_"+sGXsfl_46_fel_idx ;
      edtHisAcCo_Internalname = "HISACCO_"+sGXsfl_46_fel_idx ;
      edtHisAcCot_Internalname = "HISACCOT_"+sGXsfl_46_fel_idx ;
      edtHisAdEAcCo_Internalname = "HISADEACCO_"+sGXsfl_46_fel_idx ;
      edtHisAdEAcCt_Internalname = "HISADEACCT_"+sGXsfl_46_fel_idx ;
      edtHisTipArtD_Internalname = "HISTIPARTD_"+sGXsfl_46_fel_idx ;
      edtHisTipColD_Internalname = "HISTIPCOLD_"+sGXsfl_46_fel_idx ;
   }

   public void sendrow_462( )
   {
      subsflControlProps_462( ) ;
      wbDW0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_46_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_46_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_46_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_46_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV147GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV147GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV147GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV147GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_46_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV147GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavInforme_Enabled!=0)&&(edtavInforme_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'',false,'"+sGXsfl_46_idx+"',46)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInforme_Internalname,GXutil.rtrim( AV131Informe),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInforme_Enabled!=0)&&(edtavInforme_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'",edtavInforme_Link,"","","",edtavInforme_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavInforme_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbHisEstReo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbHisEstReo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "HISESTREO_" + sGXsfl_46_idx ;
            cmbHisEstReo.setName( GXCCtl );
            cmbHisEstReo.setWebtags( "" );
            cmbHisEstReo.addItem("1", httpContext.getMessage( "NC", ""), (short)(0));
            cmbHisEstReo.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
            if ( cmbHisEstReo.getItemCount() > 0 )
            {
               A548HisEstReo = (byte)(GXutil.lval( cmbHisEstReo.getValidValue(GXutil.trim( GXutil.str( A548HisEstReo, 1, 0))))) ;
               n548HisEstReo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbHisEstReo,cmbHisEstReo.getInternalname(),GXutil.trim( GXutil.str( A548HisEstReo, 1, 0)),Integer.valueOf(1),cmbHisEstReo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbHisEstReo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbHisEstReo.setValue( GXutil.trim( GXutil.str( A548HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbHisEstReo.getInternalname(), "Values", cmbHisEstReo.ToJavascriptSource(), !bGXsfl_46_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisReoFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoFec_Internalname,localUtil.format(A569HisReoFec, "99/99/99"),localUtil.format( A569HisReoFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisReoFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisReoHDR_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoHDR_Internalname,GXutil.rtrim( A13697HisReoHDR),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisReoHDR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoHDR_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A539HisBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545HisCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisCodPar_Internalname,GXutil.rtrim( A544HisCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisreoLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisreoLote_Internalname,GXutil.rtrim( A13698HisreoLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisreoLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisreoLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarSer_Internalname,GXutil.rtrim( A542HisBarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisReoDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoDsc_Internalname,GXutil.rtrim( A2299HisReoDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisReoDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisColNom_Internalname,GXutil.rtrim( A546HisColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisNomCli_Internalname,GXutil.rtrim( A8889HisNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisOpeTur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisOpeTur_Internalname,GXutil.ltrim( localUtil.ntoc( A12950HisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12950HisOpeTur), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisOpeTur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisOpeTur_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A540HisBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A540HisBarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A541HisBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A541HisBarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCostCausa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCostCausa_Internalname,GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13699CostCausa, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCostCausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCostCausa_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisreoValo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisreoValo_Internalname,GXutil.ltrim( localUtil.ntoc( A13700HisreoValo, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13700HisreoValo, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisreoValo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisreoValo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipDefDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDefDsc_Internalname,GXutil.rtrim( A834TipDefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipDefDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDscCausa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDscCausa_Internalname,GXutil.rtrim( A5086DscCausa),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDscCausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDscCausa_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtRps_Dsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRps_Dsc_Internalname,GXutil.rtrim( A7001Rps_Dsc),"","","'"+""+"'"+",false,"+"'"+""+"'",edtRps_Dsc_Link,"","","",edtRps_Dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRps_Dsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisReoTn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisReoTn_Internalname,GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2297HisReoTn), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisReoTn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisReoTn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisOpecod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisOpecod_Internalname,GXutil.ltrim( localUtil.ntoc( A12949HisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12949HisOpecod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisOpecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisOpecod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAcCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAcCo_Internalname,A5662HisAcCo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisAcCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAcCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3276),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAcCot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAcCot_Internalname,A5693HisAcCot,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisAcCot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAcCot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAdEAcCo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAdEAcCo_Internalname,A5694HisAdEAcCo,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisAdEAcCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAdEAcCo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisAdEAcCt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisAdEAcCt_Internalname,A5695HisAdEAcCt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisAdEAcCt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisAdEAcCt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisTipArtD_Internalname,GXutil.rtrim( A13843HisTipArtD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisTipColD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisTipColD_Internalname,GXutil.rtrim( A13844HisTipColD),"","","'"+""+"'"+",false,"+"'"+""+"'",edtHisTipColD_Link,"","","",edtHisTipColD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisTipColD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(46),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesDW2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_46_idx = ((subGrid_Islastpage==1)&&(nGXsfl_46_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_46_idx+1) ;
         sGXsfl_46_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_46_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_462( ) ;
      }
      /* End function sendrow_462 */
   }

   public void startgridcontrol46( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"46\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbHisEstReo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoHDR_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisreoLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisOpeTur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCostCausa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisreoValo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipDefDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defecto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDscCausa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Causa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRps_Dsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Responsabilidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisReoTn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Int", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisOpecod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAcCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acciones Corrección a implementar:", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAcCot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acciones Correctivas a Implementar:", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAdEAcCo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Analisis de Corrección", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisAdEAcCt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Analisis  Accion Correctivas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "de Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisTipColD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Colorante", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV147GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV131Informe));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInforme_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavInforme_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A548HisEstReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbHisEstReo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A569HisReoFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13697HisReoHDR));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoHDR_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A544HisCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13698HisreoLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisreoLote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A542HisBarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2299HisReoDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A546HisColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8889HisNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12950HisOpeTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisOpeTur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A540HisBarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A541HisBarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCostCausa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13700HisreoValo, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisreoValo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A834TipDefDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDefDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5086DscCausa));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDscCausa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7001Rps_Dsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtRps_Dsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRps_Dsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2297HisReoTn, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisReoTn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12949HisOpecod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisOpecod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5662HisAcCo);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAcCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5693HisAcCot);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAcCot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5694HisAdEAcCo);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAdEAcCo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A5695HisAdEAcCt);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisAdEAcCt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13843HisTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13844HisTipColD));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtHisTipColD_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisTipColD_Visible, (byte)(5), (byte)(0), ".", "")));
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
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavInforme_Internalname = "vINFORME" ;
      cmbHisEstReo.setInternalname( "HISESTREO" );
      edtHisReoFec_Internalname = "HISREOFEC" ;
      edtHisReoHDR_Internalname = "HISREOHDR" ;
      edtHisBarCod_Internalname = "HISBARCOD" ;
      edtHisCodReo_Internalname = "HISCODREO" ;
      edtHisCodPar_Internalname = "HISCODPAR" ;
      edtHisreoLote_Internalname = "HISREOLOTE" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtHisBarSer_Internalname = "HISBARSER" ;
      edtHisReoDsc_Internalname = "HISREODSC" ;
      edtHisColNom_Internalname = "HISCOLNOM" ;
      edtHisNomCli_Internalname = "HISNOMCLI" ;
      edtHisOpeTur_Internalname = "HISOPETUR" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtHisBarKgm_Internalname = "HISBARKGM" ;
      edtHisBarMtr_Internalname = "HISBARMTR" ;
      edtCostCausa_Internalname = "COSTCAUSA" ;
      edtHisreoValo_Internalname = "HISREOVALO" ;
      edtTipDefDsc_Internalname = "TIPDEFDSC" ;
      edtDscCausa_Internalname = "DSCCAUSA" ;
      edtRps_Dsc_Internalname = "RPS_DSC" ;
      edtHisReoTn_Internalname = "HISREOTN" ;
      edtHisOpecod_Internalname = "HISOPECOD" ;
      edtHisAcCo_Internalname = "HISACCO" ;
      edtHisAcCot_Internalname = "HISACCOT" ;
      edtHisAdEAcCo_Internalname = "HISADEACCO" ;
      edtHisAdEAcCt_Internalname = "HISADEACCT" ;
      edtHisTipArtD_Internalname = "HISTIPARTD" ;
      edtHisTipColD_Internalname = "HISTIPCOLD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_hisreofecauxdate_Internalname = "vDDO_HISREOFECAUXDATE" ;
      divDdo_hisreofecauxdates_Internalname = "DDO_HISREOFECAUXDATES" ;
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
      edtHisTipColD_Jsonclick = "" ;
      edtHisTipColD_Link = "" ;
      edtHisTipArtD_Jsonclick = "" ;
      edtHisAdEAcCt_Jsonclick = "" ;
      edtHisAdEAcCo_Jsonclick = "" ;
      edtHisAcCot_Jsonclick = "" ;
      edtHisAcCo_Jsonclick = "" ;
      edtHisOpecod_Jsonclick = "" ;
      edtHisReoTn_Jsonclick = "" ;
      edtRps_Dsc_Jsonclick = "" ;
      edtRps_Dsc_Link = "" ;
      edtDscCausa_Jsonclick = "" ;
      edtTipDefDsc_Jsonclick = "" ;
      edtHisreoValo_Jsonclick = "" ;
      edtCostCausa_Jsonclick = "" ;
      edtHisBarMtr_Jsonclick = "" ;
      edtHisBarKgm_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtHisOpeTur_Jsonclick = "" ;
      edtHisNomCli_Jsonclick = "" ;
      edtHisColNom_Jsonclick = "" ;
      edtHisReoDsc_Jsonclick = "" ;
      edtHisBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtHisreoLote_Jsonclick = "" ;
      edtHisCodPar_Jsonclick = "" ;
      edtHisCodReo_Jsonclick = "" ;
      edtHisBarCod_Jsonclick = "" ;
      edtHisReoHDR_Jsonclick = "" ;
      edtHisReoFec_Jsonclick = "" ;
      cmbHisEstReo.setJsonclick( "" );
      edtavInforme_Jsonclick = "" ;
      edtavInforme_Visible = -1 ;
      edtavInforme_Link = "" ;
      edtavInforme_Enabled = 1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtHisTipColD_Visible = -1 ;
      edtHisTipArtD_Visible = -1 ;
      edtHisAdEAcCt_Visible = -1 ;
      edtHisAdEAcCo_Visible = -1 ;
      edtHisAcCot_Visible = -1 ;
      edtHisAcCo_Visible = -1 ;
      edtHisOpecod_Visible = -1 ;
      edtHisReoTn_Visible = -1 ;
      edtRps_Dsc_Visible = -1 ;
      edtDscCausa_Visible = -1 ;
      edtTipDefDsc_Visible = -1 ;
      edtHisBarMtr_Visible = -1 ;
      edtHisBarKgm_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      edtHisOpeTur_Visible = -1 ;
      edtHisNomCli_Visible = -1 ;
      edtHisColNom_Visible = -1 ;
      edtHisReoDsc_Visible = -1 ;
      edtHisBarSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtHisreoLote_Visible = -1 ;
      edtHisReoHDR_Visible = -1 ;
      edtHisReoFec_Visible = -1 ;
      cmbHisEstReo.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisreofecauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WPNcyRcGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "1:NC,2:RC|||||||||||||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "T|||||||||||||||||||||||||" ;
      Ddo_grid_Datalisttype = "FixedValues||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|||||Dynamic|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T||T|T|T|T|T|T|T||T|||||T|T|T|||T|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "|||||||||T||T|T|T|T||||T|T||||||" ;
      Ddo_grid_Filtertype = "|Date|Character|Character|Character|Character|Character|Character|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Character|Character|Character|Numeric|Numeric|Character|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|T|T|T||T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "3|2||4|5|6|7|8|9|10|11|12|13|14||15|16|17|18|19|20|21|22|23|1|24" ;
      Ddo_grid_Columnids = "2:HisEstReo|3:HisReoFec|4:HisReoHDR|8:HisreoLote|9:CliNom|10:HisBarSer|11:HisReoDsc|12:HisColNom|13:HisNomCli|14:HisOpeTur|15:MaqCod|16:HisBarKgm|17:HisBarMtr|18:CostCausa|19:HisreoValorCausa|20:TipDefDsc|21:DscCausa|22:Rps_Dsc|23:HisReoTn|24:HisOpecod|25:HisAcCo|26:HisAcCot|27:HisAdEAcCo|28:HisAdEAcCt|29:HisTipArtDsc|30:HisTipColDsc" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( " HISTORICO REOPERADOS", "") );
      edtCostCausa_Visible = -1 ;
      edtHisreoValo_Visible = -1 ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_46_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV147GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV147GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV147GridActions), 4, 0));
      }
      GXCCtl = "HISESTREO_" + sGXsfl_46_idx ;
      cmbHisEstReo.setName( GXCCtl );
      cmbHisEstReo.setWebtags( "" );
      cmbHisEstReo.addItem("1", httpContext.getMessage( "NC", ""), (short)(0));
      cmbHisEstReo.addItem("2", httpContext.getMessage( "RC", ""), (short)(0));
      if ( cmbHisEstReo.getItemCount() > 0 )
      {
         A548HisEstReo = (byte)(GXutil.lval( cmbHisEstReo.getValidValue(GXutil.trim( GXutil.str( A548HisEstReo, 1, 0))))) ;
         n548HisEstReo = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbHisEstReo'},{av:'edtHisReoFec_Visible',ctrl:'HISREOFEC',prop:'Visible'},{av:'edtHisReoHDR_Visible',ctrl:'HISREOHDR',prop:'Visible'},{av:'edtHisreoLote_Visible',ctrl:'HISREOLOTE',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHisBarSer_Visible',ctrl:'HISBARSER',prop:'Visible'},{av:'edtHisReoDsc_Visible',ctrl:'HISREODSC',prop:'Visible'},{av:'edtHisColNom_Visible',ctrl:'HISCOLNOM',prop:'Visible'},{av:'edtHisNomCli_Visible',ctrl:'HISNOMCLI',prop:'Visible'},{av:'edtHisOpeTur_Visible',ctrl:'HISOPETUR',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisBarKgm_Visible',ctrl:'HISBARKGM',prop:'Visible'},{av:'edtHisBarMtr_Visible',ctrl:'HISBARMTR',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtTipDefDsc_Visible',ctrl:'TIPDEFDSC',prop:'Visible'},{av:'edtDscCausa_Visible',ctrl:'DSCCAUSA',prop:'Visible'},{av:'edtRps_Dsc_Visible',ctrl:'RPS_DSC',prop:'Visible'},{av:'edtHisReoTn_Visible',ctrl:'HISREOTN',prop:'Visible'},{av:'edtHisOpecod_Visible',ctrl:'HISOPECOD',prop:'Visible'},{av:'edtHisAcCo_Visible',ctrl:'HISACCO',prop:'Visible'},{av:'edtHisAcCot_Visible',ctrl:'HISACCOT',prop:'Visible'},{av:'edtHisAdEAcCo_Visible',ctrl:'HISADEACCO',prop:'Visible'},{av:'edtHisAdEAcCt_Visible',ctrl:'HISADEACCT',prop:'Visible'},{av:'edtHisTipArtD_Visible',ctrl:'HISTIPARTD',prop:'Visible'},{av:'edtHisTipColD_Visible',ctrl:'HISTIPCOLD',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12DW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13DW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14DW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV46TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      /* * Property Link not supported in */
      /* * Property Link not supported in */
      setEventMetadata("GRID.LOAD","{handler:'e20DW2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7000Rps_Cod',fld:'RPS_COD',pic:'ZZZ9'},{av:'A572HisTipCol',fld:'HISTIPCOL',pic:'Z9'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'cmbHisEstReo'},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'A2297HisReoTn',fld:'HISREOTN',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV147GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV131Informe',fld:'vINFORME',pic:''},{av:'edtavInforme_Link',ctrl:'vINFORME',prop:'Link'},{av:'edtRps_Dsc_Link',ctrl:'RPS_DSC',prop:'Link'},{av:'edtHisTipColD_Link',ctrl:'HISTIPCOLD',prop:'Link'},{ctrl:'vUPDATE',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15DW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbHisEstReo'},{av:'edtHisReoFec_Visible',ctrl:'HISREOFEC',prop:'Visible'},{av:'edtHisReoHDR_Visible',ctrl:'HISREOHDR',prop:'Visible'},{av:'edtHisreoLote_Visible',ctrl:'HISREOLOTE',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHisBarSer_Visible',ctrl:'HISBARSER',prop:'Visible'},{av:'edtHisReoDsc_Visible',ctrl:'HISREODSC',prop:'Visible'},{av:'edtHisColNom_Visible',ctrl:'HISCOLNOM',prop:'Visible'},{av:'edtHisNomCli_Visible',ctrl:'HISNOMCLI',prop:'Visible'},{av:'edtHisOpeTur_Visible',ctrl:'HISOPETUR',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisBarKgm_Visible',ctrl:'HISBARKGM',prop:'Visible'},{av:'edtHisBarMtr_Visible',ctrl:'HISBARMTR',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtTipDefDsc_Visible',ctrl:'TIPDEFDSC',prop:'Visible'},{av:'edtDscCausa_Visible',ctrl:'DSCCAUSA',prop:'Visible'},{av:'edtRps_Dsc_Visible',ctrl:'RPS_DSC',prop:'Visible'},{av:'edtHisReoTn_Visible',ctrl:'HISREOTN',prop:'Visible'},{av:'edtHisOpecod_Visible',ctrl:'HISOPECOD',prop:'Visible'},{av:'edtHisAcCo_Visible',ctrl:'HISACCO',prop:'Visible'},{av:'edtHisAcCot_Visible',ctrl:'HISACCOT',prop:'Visible'},{av:'edtHisAdEAcCo_Visible',ctrl:'HISADEACCO',prop:'Visible'},{av:'edtHisAdEAcCt_Visible',ctrl:'HISADEACCT',prop:'Visible'},{av:'edtHisTipArtD_Visible',ctrl:'HISTIPARTD',prop:'Visible'},{av:'edtHisTipColD_Visible',ctrl:'HISTIPCOLD',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11DW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV46TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV46TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbHisEstReo'},{av:'edtHisReoFec_Visible',ctrl:'HISREOFEC',prop:'Visible'},{av:'edtHisReoHDR_Visible',ctrl:'HISREOHDR',prop:'Visible'},{av:'edtHisreoLote_Visible',ctrl:'HISREOLOTE',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtHisBarSer_Visible',ctrl:'HISBARSER',prop:'Visible'},{av:'edtHisReoDsc_Visible',ctrl:'HISREODSC',prop:'Visible'},{av:'edtHisColNom_Visible',ctrl:'HISCOLNOM',prop:'Visible'},{av:'edtHisNomCli_Visible',ctrl:'HISNOMCLI',prop:'Visible'},{av:'edtHisOpeTur_Visible',ctrl:'HISOPETUR',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtHisBarKgm_Visible',ctrl:'HISBARKGM',prop:'Visible'},{av:'edtHisBarMtr_Visible',ctrl:'HISBARMTR',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtTipDefDsc_Visible',ctrl:'TIPDEFDSC',prop:'Visible'},{av:'edtDscCausa_Visible',ctrl:'DSCCAUSA',prop:'Visible'},{av:'edtRps_Dsc_Visible',ctrl:'RPS_DSC',prop:'Visible'},{av:'edtHisReoTn_Visible',ctrl:'HISREOTN',prop:'Visible'},{av:'edtHisOpecod_Visible',ctrl:'HISOPECOD',prop:'Visible'},{av:'edtHisAcCo_Visible',ctrl:'HISACCO',prop:'Visible'},{av:'edtHisAcCot_Visible',ctrl:'HISACCOT',prop:'Visible'},{av:'edtHisAdEAcCo_Visible',ctrl:'HISADEACCO',prop:'Visible'},{av:'edtHisAdEAcCt_Visible',ctrl:'HISADEACCT',prop:'Visible'},{av:'edtHisTipArtD_Visible',ctrl:'HISTIPARTD',prop:'Visible'},{av:'edtHisTipColD_Visible',ctrl:'HISTIPCOLD',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e21DW2',iparms:[{av:'cmbavGridactions'},{av:'AV147GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV147GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A833TipDefCod',fld:'TIPDEFCOD',pic:'ZZZ9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16DW2',iparms:[{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV46TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV46TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17DW2',iparms:[{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV46TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV130FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV47TFHisEstReo_Sels',fld:'vTFHISESTREO_SELS',pic:''},{av:'AV58TFHisReoFec',fld:'vTFHISREOFEC',pic:''},{av:'AV49TFHisReoHDR',fld:'vTFHISREOHDR',pic:''},{av:'AV50TFHisReoHDR_Sel',fld:'vTFHISREOHDR_SEL',pic:''},{av:'AV68TFHisreoLote',fld:'vTFHISREOLOTE',pic:''},{av:'AV69TFHisreoLote_Sel',fld:'vTFHISREOLOTE_SEL',pic:''},{av:'AV71TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV72TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV74TFHisBarSer',fld:'vTFHISBARSER',pic:''},{av:'AV75TFHisBarSer_Sel',fld:'vTFHISBARSER_SEL',pic:''},{av:'AV77TFHisReoDsc',fld:'vTFHISREODSC',pic:''},{av:'AV78TFHisReoDsc_Sel',fld:'vTFHISREODSC_SEL',pic:''},{av:'AV80TFHisColNom',fld:'vTFHISCOLNOM',pic:''},{av:'AV81TFHisColNom_Sel',fld:'vTFHISCOLNOM_SEL',pic:''},{av:'AV83TFHisNomCli',fld:'vTFHISNOMCLI',pic:''},{av:'AV84TFHisNomCli_Sel',fld:'vTFHISNOMCLI_SEL',pic:''},{av:'AV86TFHisOpeTur',fld:'vTFHISOPETUR',pic:'9'},{av:'AV87TFHisOpeTur_To',fld:'vTFHISOPETUR_TO',pic:'9'},{av:'AV89TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV90TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV92TFHisBarKgm',fld:'vTFHISBARKGM',pic:'ZZZZZ9.99'},{av:'AV93TFHisBarKgm_To',fld:'vTFHISBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV95TFHisBarMtr',fld:'vTFHISBARMTR',pic:'ZZZZZ9.99'},{av:'AV96TFHisBarMtr_To',fld:'vTFHISBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV98TFCostCausa',fld:'vTFCOSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV99TFCostCausa_To',fld:'vTFCOSTCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV101TFHisreoValorCausa',fld:'vTFHISREOVALORCAUSA',pic:'ZZZZZZ9.999'},{av:'AV102TFHisreoValorCausa_To',fld:'vTFHISREOVALORCAUSA_TO',pic:'ZZZZZZ9.999'},{av:'AV104TFTipDefDsc',fld:'vTFTIPDEFDSC',pic:''},{av:'AV105TFTipDefDsc_Sel',fld:'vTFTIPDEFDSC_SEL',pic:''},{av:'AV107TFDscCausa',fld:'vTFDSCCAUSA',pic:''},{av:'AV108TFDscCausa_Sel',fld:'vTFDSCCAUSA_SEL',pic:''},{av:'AV110TFRps_Dsc',fld:'vTFRPS_DSC',pic:''},{av:'AV111TFRps_Dsc_Sel',fld:'vTFRPS_DSC_SEL',pic:''},{av:'AV113TFHisReoTn',fld:'vTFHISREOTN',pic:'ZZZZZ9'},{av:'AV114TFHisReoTn_To',fld:'vTFHISREOTN_TO',pic:'ZZZZZ9'},{av:'AV116TFHisOpecod',fld:'vTFHISOPECOD',pic:'ZZZZZ9'},{av:'AV117TFHisOpecod_To',fld:'vTFHISOPECOD_TO',pic:'ZZZZZ9'},{av:'AV119TFHisAcCo',fld:'vTFHISACCO',pic:''},{av:'AV120TFHisAcCo_Sel',fld:'vTFHISACCO_SEL',pic:''},{av:'AV122TFHisAcCot',fld:'vTFHISACCOT',pic:''},{av:'AV123TFHisAcCot_Sel',fld:'vTFHISACCOT_SEL',pic:''},{av:'AV125TFHisAdEAcCo',fld:'vTFHISADEACCO',pic:''},{av:'AV126TFHisAdEAcCo_Sel',fld:'vTFHISADEACCO_SEL',pic:''},{av:'AV128TFHisAdEAcCt',fld:'vTFHISADEACCT',pic:''},{av:'AV129TFHisAdEAcCt_Sel',fld:'vTFHISADEACCT_SEL',pic:''},{av:'AV148TFHisTipArtDsc',fld:'vTFHISTIPARTDSC',pic:''},{av:'AV149TFHisTipArtDsc_Sel',fld:'vTFHISTIPARTDSC_SEL',pic:''},{av:'AV150TFHisTipColDsc',fld:'vTFHISTIPCOLDSC',pic:''},{av:'AV151TFHisTipColDsc_Sel',fld:'vTFHISTIPCOLDSC_SEL',pic:''},{av:'AV206Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'edtHisreoValo_Visible',ctrl:'HISREOVALO',prop:'Visible'},{av:'edtCostCausa_Visible',ctrl:'COSTCAUSA',prop:'Visible'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV46TFHisEstReo_SelsJson',fld:'vTFHISESTREO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_HISBARCOD","{handler:'valid_Hisbarcod',iparms:[]");
      setEventMetadata("VALID_HISBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HISCODREO","{handler:'valid_Hiscodreo',iparms:[]");
      setEventMetadata("VALID_HISCODREO",",oparms:[]}");
      setEventMetadata("VALID_HISCODPAR","{handler:'valid_Hiscodpar',iparms:[]");
      setEventMetadata("VALID_HISCODPAR",",oparms:[]}");
      setEventMetadata("VALID_HISBARKGM","{handler:'valid_Hisbarkgm',iparms:[]");
      setEventMetadata("VALID_HISBARKGM",",oparms:[]}");
      setEventMetadata("VALID_COSTCAUSA","{handler:'valid_Costcausa',iparms:[]");
      setEventMetadata("VALID_COSTCAUSA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Histipcold',iparms:[]");
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
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV130FilterFullText = "" ;
      A396EmprCod = "" ;
      AV39ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV47TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV58TFHisReoFec = GXutil.nullDate() ;
      AV49TFHisReoHDR = "" ;
      AV50TFHisReoHDR_Sel = "" ;
      AV68TFHisreoLote = "" ;
      AV69TFHisreoLote_Sel = "" ;
      AV71TFCliNom = "" ;
      AV72TFCliNom_Sel = "" ;
      AV74TFHisBarSer = "" ;
      AV75TFHisBarSer_Sel = "" ;
      AV77TFHisReoDsc = "" ;
      AV78TFHisReoDsc_Sel = "" ;
      AV80TFHisColNom = "" ;
      AV81TFHisColNom_Sel = "" ;
      AV83TFHisNomCli = "" ;
      AV84TFHisNomCli_Sel = "" ;
      AV89TFMaqCod = "" ;
      AV90TFMaqCod_Sel = "" ;
      AV92TFHisBarKgm = DecimalUtil.ZERO ;
      AV93TFHisBarKgm_To = DecimalUtil.ZERO ;
      AV95TFHisBarMtr = DecimalUtil.ZERO ;
      AV96TFHisBarMtr_To = DecimalUtil.ZERO ;
      AV98TFCostCausa = DecimalUtil.ZERO ;
      AV99TFCostCausa_To = DecimalUtil.ZERO ;
      AV101TFHisreoValorCausa = DecimalUtil.ZERO ;
      AV102TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      AV104TFTipDefDsc = "" ;
      AV105TFTipDefDsc_Sel = "" ;
      AV107TFDscCausa = "" ;
      AV108TFDscCausa_Sel = "" ;
      AV110TFRps_Dsc = "" ;
      AV111TFRps_Dsc_Sel = "" ;
      AV119TFHisAcCo = "" ;
      AV120TFHisAcCo_Sel = "" ;
      AV122TFHisAcCot = "" ;
      AV123TFHisAcCot_Sel = "" ;
      AV125TFHisAdEAcCo = "" ;
      AV126TFHisAdEAcCo_Sel = "" ;
      AV128TFHisAdEAcCt = "" ;
      AV129TFHisAdEAcCt_Sel = "" ;
      AV148TFHisTipArtDsc = "" ;
      AV149TFHisTipArtDsc_Sel = "" ;
      AV150TFHisTipColDsc = "" ;
      AV151TFHisTipColDsc_Sel = "" ;
      AV206Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV42ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46TFHisEstReo_SelsJson = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV139DDO_HisReoFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV131Informe = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      A13697HisReoHDR = "" ;
      A544HisCodPar = "" ;
      A13698HisreoLote = "" ;
      A279CliNom = "" ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A602MaqCod = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A13700HisreoValo = DecimalUtil.ZERO ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A13843HisTipArtD = "" ;
      A13844HisTipColD = "" ;
      AV156Wpncyrcds_2_tfhisestreo_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV155Wpncyrcds_1_filterfulltext = "" ;
      lV158Wpncyrcds_4_tfhisreohdr = "" ;
      lV160Wpncyrcds_6_tfhisreolote = "" ;
      lV162Wpncyrcds_8_tfclinom = "" ;
      lV164Wpncyrcds_10_tfhisbarser = "" ;
      lV166Wpncyrcds_12_tfhisreodsc = "" ;
      lV168Wpncyrcds_14_tfhiscolnom = "" ;
      lV170Wpncyrcds_16_tfhisnomcli = "" ;
      lV174Wpncyrcds_20_tfmaqcod = "" ;
      lV184Wpncyrcds_30_tftipdefdsc = "" ;
      lV186Wpncyrcds_32_tfdsccausa = "" ;
      lV188Wpncyrcds_34_tfrps_dsc = "" ;
      lV194Wpncyrcds_40_tfhisacco = "" ;
      lV196Wpncyrcds_42_tfhisaccot = "" ;
      lV198Wpncyrcds_44_tfhisadeacco = "" ;
      lV200Wpncyrcds_46_tfhisadeacct = "" ;
      lV202Wpncyrcds_48_tfhistipartdsc = "" ;
      lV204Wpncyrcds_50_tfhistipcoldsc = "" ;
      AV155Wpncyrcds_1_filterfulltext = "" ;
      AV157Wpncyrcds_3_tfhisreofec = GXutil.nullDate() ;
      AV159Wpncyrcds_5_tfhisreohdr_sel = "" ;
      AV158Wpncyrcds_4_tfhisreohdr = "" ;
      AV161Wpncyrcds_7_tfhisreolote_sel = "" ;
      AV160Wpncyrcds_6_tfhisreolote = "" ;
      AV163Wpncyrcds_9_tfclinom_sel = "" ;
      AV162Wpncyrcds_8_tfclinom = "" ;
      AV165Wpncyrcds_11_tfhisbarser_sel = "" ;
      AV164Wpncyrcds_10_tfhisbarser = "" ;
      AV167Wpncyrcds_13_tfhisreodsc_sel = "" ;
      AV166Wpncyrcds_12_tfhisreodsc = "" ;
      AV169Wpncyrcds_15_tfhiscolnom_sel = "" ;
      AV168Wpncyrcds_14_tfhiscolnom = "" ;
      AV171Wpncyrcds_17_tfhisnomcli_sel = "" ;
      AV170Wpncyrcds_16_tfhisnomcli = "" ;
      AV175Wpncyrcds_21_tfmaqcod_sel = "" ;
      AV174Wpncyrcds_20_tfmaqcod = "" ;
      AV176Wpncyrcds_22_tfhisbarkgm = DecimalUtil.ZERO ;
      AV177Wpncyrcds_23_tfhisbarkgm_to = DecimalUtil.ZERO ;
      AV178Wpncyrcds_24_tfhisbarmtr = DecimalUtil.ZERO ;
      AV179Wpncyrcds_25_tfhisbarmtr_to = DecimalUtil.ZERO ;
      AV180Wpncyrcds_26_tfcostcausa = DecimalUtil.ZERO ;
      AV181Wpncyrcds_27_tfcostcausa_to = DecimalUtil.ZERO ;
      AV182Wpncyrcds_28_tfhisreovalorcausa = DecimalUtil.ZERO ;
      AV183Wpncyrcds_29_tfhisreovalorcausa_to = DecimalUtil.ZERO ;
      AV185Wpncyrcds_31_tftipdefdsc_sel = "" ;
      AV184Wpncyrcds_30_tftipdefdsc = "" ;
      AV187Wpncyrcds_33_tfdsccausa_sel = "" ;
      AV186Wpncyrcds_32_tfdsccausa = "" ;
      AV189Wpncyrcds_35_tfrps_dsc_sel = "" ;
      AV188Wpncyrcds_34_tfrps_dsc = "" ;
      AV195Wpncyrcds_41_tfhisacco_sel = "" ;
      AV194Wpncyrcds_40_tfhisacco = "" ;
      AV197Wpncyrcds_43_tfhisaccot_sel = "" ;
      AV196Wpncyrcds_42_tfhisaccot = "" ;
      AV199Wpncyrcds_45_tfhisadeacco_sel = "" ;
      AV198Wpncyrcds_44_tfhisadeacco = "" ;
      AV201Wpncyrcds_47_tfhisadeacct_sel = "" ;
      AV200Wpncyrcds_46_tfhisadeacct = "" ;
      AV203Wpncyrcds_49_tfhistipartdsc_sel = "" ;
      AV202Wpncyrcds_48_tfhistipartdsc = "" ;
      AV205Wpncyrcds_51_tfhistipcoldsc_sel = "" ;
      AV204Wpncyrcds_50_tfhistipcoldsc = "" ;
      H00DW2_A252CliCod = new int[1] ;
      H00DW2_n252CliCod = new boolean[] {false} ;
      H00DW2_A571HisTipArt = new short[1] ;
      H00DW2_n571HisTipArt = new boolean[] {false} ;
      H00DW2_A5085CodCausa = new short[1] ;
      H00DW2_n5085CodCausa = new boolean[] {false} ;
      H00DW2_A396EmprCod = new String[] {""} ;
      H00DW2_A7000Rps_Cod = new short[1] ;
      H00DW2_n7000Rps_Cod = new boolean[] {false} ;
      H00DW2_A572HisTipCol = new byte[1] ;
      H00DW2_n572HisTipCol = new boolean[] {false} ;
      H00DW2_A833TipDefCod = new short[1] ;
      H00DW2_A13844HisTipColD = new String[] {""} ;
      H00DW2_n13844HisTipColD = new boolean[] {false} ;
      H00DW2_A13843HisTipArtD = new String[] {""} ;
      H00DW2_n13843HisTipArtD = new boolean[] {false} ;
      H00DW2_A5695HisAdEAcCt = new String[] {""} ;
      H00DW2_n5695HisAdEAcCt = new boolean[] {false} ;
      H00DW2_A5694HisAdEAcCo = new String[] {""} ;
      H00DW2_n5694HisAdEAcCo = new boolean[] {false} ;
      H00DW2_A5693HisAcCot = new String[] {""} ;
      H00DW2_n5693HisAcCot = new boolean[] {false} ;
      H00DW2_A5662HisAcCo = new String[] {""} ;
      H00DW2_n5662HisAcCo = new boolean[] {false} ;
      H00DW2_A12949HisOpecod = new int[1] ;
      H00DW2_n12949HisOpecod = new boolean[] {false} ;
      H00DW2_A2297HisReoTn = new int[1] ;
      H00DW2_n2297HisReoTn = new boolean[] {false} ;
      H00DW2_A7001Rps_Dsc = new String[] {""} ;
      H00DW2_n7001Rps_Dsc = new boolean[] {false} ;
      H00DW2_A5086DscCausa = new String[] {""} ;
      H00DW2_n5086DscCausa = new boolean[] {false} ;
      H00DW2_A834TipDefDsc = new String[] {""} ;
      H00DW2_n834TipDefDsc = new boolean[] {false} ;
      H00DW2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00DW2_n541HisBarMtr = new boolean[] {false} ;
      H00DW2_A602MaqCod = new String[] {""} ;
      H00DW2_n602MaqCod = new boolean[] {false} ;
      H00DW2_A12950HisOpeTur = new byte[1] ;
      H00DW2_n12950HisOpeTur = new boolean[] {false} ;
      H00DW2_A8889HisNomCli = new String[] {""} ;
      H00DW2_n8889HisNomCli = new boolean[] {false} ;
      H00DW2_A546HisColNom = new String[] {""} ;
      H00DW2_n546HisColNom = new boolean[] {false} ;
      H00DW2_A2299HisReoDsc = new String[] {""} ;
      H00DW2_n2299HisReoDsc = new boolean[] {false} ;
      H00DW2_A542HisBarSer = new String[] {""} ;
      H00DW2_n542HisBarSer = new boolean[] {false} ;
      H00DW2_A279CliNom = new String[] {""} ;
      H00DW2_A13698HisreoLote = new String[] {""} ;
      H00DW2_n13698HisreoLote = new boolean[] {false} ;
      H00DW2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00DW2_n569HisReoFec = new boolean[] {false} ;
      H00DW2_A548HisEstReo = new byte[1] ;
      H00DW2_n548HisEstReo = new boolean[] {false} ;
      H00DW2_A544HisCodPar = new String[] {""} ;
      H00DW2_A545HisCodReo = new byte[1] ;
      H00DW2_A539HisBarCod = new int[1] ;
      H00DW2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00DW2_n13699CostCausa = new boolean[] {false} ;
      H00DW2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00DW2_n540HisBarKgm = new boolean[] {false} ;
      H00DW3_AGRID_nRecordCount = new long[1] ;
      AV140Station = "" ;
      AV143EmprNom = "" ;
      AV144UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      AV154Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV43ManageFiltersXml = "" ;
      AV35ExcelFilename = "" ;
      AV36ErrorMessage = "" ;
      AV38UserCustomValue = "" ;
      AV40ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char42 = "" ;
      GXv_char43 = new String[1] ;
      GXt_char40 = "" ;
      GXv_char41 = new String[1] ;
      GXt_char38 = "" ;
      GXv_char39 = new String[1] ;
      GXt_char36 = "" ;
      GXv_char37 = new String[1] ;
      GXt_char34 = "" ;
      GXv_char35 = new String[1] ;
      GXt_char32 = "" ;
      GXv_char33 = new String[1] ;
      GXt_char30 = "" ;
      GXv_char31 = new String[1] ;
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
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState44 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpncyrc__default(),
         new Object[] {
             new Object[] {
            H00DW2_A252CliCod, H00DW2_n252CliCod, H00DW2_A571HisTipArt, H00DW2_n571HisTipArt, H00DW2_A5085CodCausa, H00DW2_n5085CodCausa, H00DW2_A396EmprCod, H00DW2_A7000Rps_Cod, H00DW2_n7000Rps_Cod, H00DW2_A572HisTipCol,
            H00DW2_n572HisTipCol, H00DW2_A833TipDefCod, H00DW2_A13844HisTipColD, H00DW2_n13844HisTipColD, H00DW2_A13843HisTipArtD, H00DW2_n13843HisTipArtD, H00DW2_A5695HisAdEAcCt, H00DW2_n5695HisAdEAcCt, H00DW2_A5694HisAdEAcCo, H00DW2_n5694HisAdEAcCo,
            H00DW2_A5693HisAcCot, H00DW2_n5693HisAcCot, H00DW2_A5662HisAcCo, H00DW2_n5662HisAcCo, H00DW2_A12949HisOpecod, H00DW2_n12949HisOpecod, H00DW2_A2297HisReoTn, H00DW2_n2297HisReoTn, H00DW2_A7001Rps_Dsc, H00DW2_n7001Rps_Dsc,
            H00DW2_A5086DscCausa, H00DW2_n5086DscCausa, H00DW2_A834TipDefDsc, H00DW2_n834TipDefDsc, H00DW2_A541HisBarMtr, H00DW2_n541HisBarMtr, H00DW2_A602MaqCod, H00DW2_n602MaqCod, H00DW2_A12950HisOpeTur, H00DW2_n12950HisOpeTur,
            H00DW2_A8889HisNomCli, H00DW2_n8889HisNomCli, H00DW2_A546HisColNom, H00DW2_n546HisColNom, H00DW2_A2299HisReoDsc, H00DW2_n2299HisReoDsc, H00DW2_A542HisBarSer, H00DW2_n542HisBarSer, H00DW2_A279CliNom, H00DW2_A13698HisreoLote,
            H00DW2_n13698HisreoLote, H00DW2_A569HisReoFec, H00DW2_n569HisReoFec, H00DW2_A548HisEstReo, H00DW2_n548HisEstReo, H00DW2_A544HisCodPar, H00DW2_A545HisCodReo, H00DW2_A539HisBarCod, H00DW2_A13699CostCausa, H00DW2_n13699CostCausa,
            H00DW2_A540HisBarKgm, H00DW2_n540HisBarKgm
            }
            , new Object[] {
            H00DW3_AGRID_nRecordCount
            }
         }
      );
      AV206Pgmname = "WPNcyRc" ;
      /* GeneXus formulas. */
      AV206Pgmname = "WPNcyRc" ;
      Gx_err = (short)(0) ;
      edtavInforme_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV44ManageFiltersExecutionStep ;
   private byte AV86TFHisOpeTur ;
   private byte AV87TFHisOpeTur_To ;
   private byte gxajaxcallmode ;
   private byte A572HisTipCol ;
   private byte A548HisEstReo ;
   private byte A545HisCodReo ;
   private byte A12950HisOpeTur ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV172Wpncyrcds_18_tfhisopetur ;
   private byte AV173Wpncyrcds_19_tfhisopetur_to ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV13OrderedBy ;
   private short A7000Rps_Cod ;
   private short A833TipDefCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV147GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A571HisTipArt ;
   private short A5085CodCausa ;
   private short AV141acabats ;
   private short AV142carvitin ;
   private int edtHisreoValo_Visible ;
   private int edtCostCausa_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_46 ;
   private int nGXsfl_46_idx=1 ;
   private int AV113TFHisReoTn ;
   private int AV114TFHisReoTn_To ;
   private int AV116TFHisOpecod ;
   private int AV117TFHisOpecod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A539HisBarCod ;
   private int A2297HisReoTn ;
   private int A12949HisOpecod ;
   private int subGrid_Islastpage ;
   private int edtavInforme_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV156Wpncyrcds_2_tfhisestreo_sels_size ;
   private int AV190Wpncyrcds_36_tfhisreotn ;
   private int AV191Wpncyrcds_37_tfhisreotn_to ;
   private int AV192Wpncyrcds_38_tfhisopecod ;
   private int AV193Wpncyrcds_39_tfhisopecod_to ;
   private int A252CliCod ;
   private int edtHisReoFec_Visible ;
   private int edtHisReoHDR_Visible ;
   private int edtHisreoLote_Visible ;
   private int edtCliNom_Visible ;
   private int edtHisBarSer_Visible ;
   private int edtHisReoDsc_Visible ;
   private int edtHisColNom_Visible ;
   private int edtHisNomCli_Visible ;
   private int edtHisOpeTur_Visible ;
   private int edtMaqCod_Visible ;
   private int edtHisBarKgm_Visible ;
   private int edtHisBarMtr_Visible ;
   private int edtTipDefDsc_Visible ;
   private int edtDscCausa_Visible ;
   private int edtRps_Dsc_Visible ;
   private int edtHisReoTn_Visible ;
   private int edtHisOpecod_Visible ;
   private int edtHisAcCo_Visible ;
   private int edtHisAcCot_Visible ;
   private int edtHisAdEAcCo_Visible ;
   private int edtHisAdEAcCt_Visible ;
   private int edtHisTipArtD_Visible ;
   private int edtHisTipColD_Visible ;
   private int AV53PageToGo ;
   private int AV207GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavInforme_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV54GridCurrentPage ;
   private long AV55GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV92TFHisBarKgm ;
   private java.math.BigDecimal AV93TFHisBarKgm_To ;
   private java.math.BigDecimal AV95TFHisBarMtr ;
   private java.math.BigDecimal AV96TFHisBarMtr_To ;
   private java.math.BigDecimal AV98TFCostCausa ;
   private java.math.BigDecimal AV99TFCostCausa_To ;
   private java.math.BigDecimal AV101TFHisreoValorCausa ;
   private java.math.BigDecimal AV102TFHisreoValorCausa_To ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal A13700HisreoValo ;
   private java.math.BigDecimal AV176Wpncyrcds_22_tfhisbarkgm ;
   private java.math.BigDecimal AV177Wpncyrcds_23_tfhisbarkgm_to ;
   private java.math.BigDecimal AV178Wpncyrcds_24_tfhisbarmtr ;
   private java.math.BigDecimal AV179Wpncyrcds_25_tfhisbarmtr_to ;
   private java.math.BigDecimal AV180Wpncyrcds_26_tfcostcausa ;
   private java.math.BigDecimal AV181Wpncyrcds_27_tfcostcausa_to ;
   private java.math.BigDecimal AV182Wpncyrcds_28_tfhisreovalorcausa ;
   private java.math.BigDecimal AV183Wpncyrcds_29_tfhisreovalorcausa_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_46_idx="0001" ;
   private String edtHisreoValo_Internalname ;
   private String edtCostCausa_Internalname ;
   private String A396EmprCod ;
   private String AV49TFHisReoHDR ;
   private String AV50TFHisReoHDR_Sel ;
   private String AV68TFHisreoLote ;
   private String AV69TFHisreoLote_Sel ;
   private String AV71TFCliNom ;
   private String AV72TFCliNom_Sel ;
   private String AV74TFHisBarSer ;
   private String AV75TFHisBarSer_Sel ;
   private String AV77TFHisReoDsc ;
   private String AV78TFHisReoDsc_Sel ;
   private String AV80TFHisColNom ;
   private String AV81TFHisColNom_Sel ;
   private String AV83TFHisNomCli ;
   private String AV84TFHisNomCli_Sel ;
   private String AV89TFMaqCod ;
   private String AV90TFMaqCod_Sel ;
   private String AV104TFTipDefDsc ;
   private String AV105TFTipDefDsc_Sel ;
   private String AV107TFDscCausa ;
   private String AV108TFDscCausa_Sel ;
   private String AV110TFRps_Dsc ;
   private String AV111TFRps_Dsc_Sel ;
   private String AV148TFHisTipArtDsc ;
   private String AV149TFHisTipArtDsc_Sel ;
   private String AV150TFHisTipColDsc ;
   private String AV151TFHisTipColDsc_Sel ;
   private String AV206Pgmname ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
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
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hisreofecauxdates_Internalname ;
   private String edtavDdo_hisreofecauxdate_Internalname ;
   private String edtavDdo_hisreofecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV131Informe ;
   private String edtavInforme_Internalname ;
   private String edtHisReoFec_Internalname ;
   private String A13697HisReoHDR ;
   private String edtHisReoHDR_Internalname ;
   private String edtHisBarCod_Internalname ;
   private String edtHisCodReo_Internalname ;
   private String A544HisCodPar ;
   private String edtHisCodPar_Internalname ;
   private String A13698HisreoLote ;
   private String edtHisreoLote_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A542HisBarSer ;
   private String edtHisBarSer_Internalname ;
   private String A2299HisReoDsc ;
   private String edtHisReoDsc_Internalname ;
   private String A546HisColNom ;
   private String edtHisColNom_Internalname ;
   private String A8889HisNomCli ;
   private String edtHisNomCli_Internalname ;
   private String edtHisOpeTur_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String edtHisBarKgm_Internalname ;
   private String edtHisBarMtr_Internalname ;
   private String A834TipDefDsc ;
   private String edtTipDefDsc_Internalname ;
   private String A5086DscCausa ;
   private String edtDscCausa_Internalname ;
   private String A7001Rps_Dsc ;
   private String edtRps_Dsc_Internalname ;
   private String edtHisReoTn_Internalname ;
   private String edtHisOpecod_Internalname ;
   private String edtHisAcCo_Internalname ;
   private String edtHisAcCot_Internalname ;
   private String edtHisAdEAcCo_Internalname ;
   private String edtHisAdEAcCt_Internalname ;
   private String A13843HisTipArtD ;
   private String edtHisTipArtD_Internalname ;
   private String A13844HisTipColD ;
   private String edtHisTipColD_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV158Wpncyrcds_4_tfhisreohdr ;
   private String lV160Wpncyrcds_6_tfhisreolote ;
   private String lV162Wpncyrcds_8_tfclinom ;
   private String lV164Wpncyrcds_10_tfhisbarser ;
   private String lV166Wpncyrcds_12_tfhisreodsc ;
   private String lV168Wpncyrcds_14_tfhiscolnom ;
   private String lV170Wpncyrcds_16_tfhisnomcli ;
   private String lV174Wpncyrcds_20_tfmaqcod ;
   private String lV184Wpncyrcds_30_tftipdefdsc ;
   private String lV186Wpncyrcds_32_tfdsccausa ;
   private String lV188Wpncyrcds_34_tfrps_dsc ;
   private String lV202Wpncyrcds_48_tfhistipartdsc ;
   private String lV204Wpncyrcds_50_tfhistipcoldsc ;
   private String AV159Wpncyrcds_5_tfhisreohdr_sel ;
   private String AV158Wpncyrcds_4_tfhisreohdr ;
   private String AV161Wpncyrcds_7_tfhisreolote_sel ;
   private String AV160Wpncyrcds_6_tfhisreolote ;
   private String AV163Wpncyrcds_9_tfclinom_sel ;
   private String AV162Wpncyrcds_8_tfclinom ;
   private String AV165Wpncyrcds_11_tfhisbarser_sel ;
   private String AV164Wpncyrcds_10_tfhisbarser ;
   private String AV167Wpncyrcds_13_tfhisreodsc_sel ;
   private String AV166Wpncyrcds_12_tfhisreodsc ;
   private String AV169Wpncyrcds_15_tfhiscolnom_sel ;
   private String AV168Wpncyrcds_14_tfhiscolnom ;
   private String AV171Wpncyrcds_17_tfhisnomcli_sel ;
   private String AV170Wpncyrcds_16_tfhisnomcli ;
   private String AV175Wpncyrcds_21_tfmaqcod_sel ;
   private String AV174Wpncyrcds_20_tfmaqcod ;
   private String AV185Wpncyrcds_31_tftipdefdsc_sel ;
   private String AV184Wpncyrcds_30_tftipdefdsc ;
   private String AV187Wpncyrcds_33_tfdsccausa_sel ;
   private String AV186Wpncyrcds_32_tfdsccausa ;
   private String AV189Wpncyrcds_35_tfrps_dsc_sel ;
   private String AV188Wpncyrcds_34_tfrps_dsc ;
   private String AV203Wpncyrcds_49_tfhistipartdsc_sel ;
   private String AV202Wpncyrcds_48_tfhistipartdsc ;
   private String AV205Wpncyrcds_51_tfhistipcoldsc_sel ;
   private String AV204Wpncyrcds_50_tfhistipcoldsc ;
   private String AV140Station ;
   private String AV143EmprNom ;
   private String AV144UsurCod ;
   private String AV154Emprcod ;
   private String edtavInforme_Link ;
   private String edtRps_Dsc_Link ;
   private String edtHisTipColD_Link ;
   private String GXt_char42 ;
   private String GXv_char43[] ;
   private String GXt_char40 ;
   private String GXv_char41[] ;
   private String GXt_char38 ;
   private String GXv_char39[] ;
   private String GXt_char36 ;
   private String GXv_char37[] ;
   private String GXt_char34 ;
   private String GXv_char35[] ;
   private String GXt_char32 ;
   private String GXv_char33[] ;
   private String GXt_char30 ;
   private String GXv_char31[] ;
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
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_46_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavInforme_Jsonclick ;
   private String edtHisReoFec_Jsonclick ;
   private String edtHisReoHDR_Jsonclick ;
   private String edtHisBarCod_Jsonclick ;
   private String edtHisCodReo_Jsonclick ;
   private String edtHisCodPar_Jsonclick ;
   private String edtHisreoLote_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtHisBarSer_Jsonclick ;
   private String edtHisReoDsc_Jsonclick ;
   private String edtHisColNom_Jsonclick ;
   private String edtHisNomCli_Jsonclick ;
   private String edtHisOpeTur_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtHisBarKgm_Jsonclick ;
   private String edtHisBarMtr_Jsonclick ;
   private String edtCostCausa_Jsonclick ;
   private String edtHisreoValo_Jsonclick ;
   private String edtTipDefDsc_Jsonclick ;
   private String edtDscCausa_Jsonclick ;
   private String edtRps_Dsc_Jsonclick ;
   private String edtHisReoTn_Jsonclick ;
   private String edtHisOpecod_Jsonclick ;
   private String edtHisAcCo_Jsonclick ;
   private String edtHisAcCot_Jsonclick ;
   private String edtHisAdEAcCo_Jsonclick ;
   private String edtHisAdEAcCt_Jsonclick ;
   private String edtHisTipArtD_Jsonclick ;
   private String edtHisTipColD_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV58TFHisReoFec ;
   private java.util.Date AV139DDO_HisReoFecAuxDate ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date AV157Wpncyrcds_3_tfhisreofec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_46_Refreshing=false ;
   private boolean AV14OrderedDsc ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n548HisEstReo ;
   private boolean n569HisReoFec ;
   private boolean n13698HisreoLote ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n546HisColNom ;
   private boolean n8889HisNomCli ;
   private boolean n12950HisOpeTur ;
   private boolean n602MaqCod ;
   private boolean n540HisBarKgm ;
   private boolean n541HisBarMtr ;
   private boolean n13699CostCausa ;
   private boolean n834TipDefDsc ;
   private boolean n5086DscCausa ;
   private boolean n7001Rps_Dsc ;
   private boolean n2297HisReoTn ;
   private boolean n12949HisOpecod ;
   private boolean n5662HisAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5695HisAdEAcCt ;
   private boolean n13843HisTipArtD ;
   private boolean n13844HisTipColD ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n252CliCod ;
   private boolean n571HisTipArt ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n572HisTipCol ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV46TFHisEstReo_SelsJson ;
   private String AV37ColumnsSelectorXML ;
   private String AV43ManageFiltersXml ;
   private String AV38UserCustomValue ;
   private String AV130FilterFullText ;
   private String AV119TFHisAcCo ;
   private String AV120TFHisAcCo_Sel ;
   private String AV122TFHisAcCot ;
   private String AV123TFHisAcCot_Sel ;
   private String AV125TFHisAdEAcCo ;
   private String AV126TFHisAdEAcCo_Sel ;
   private String AV128TFHisAdEAcCt ;
   private String AV129TFHisAdEAcCt_Sel ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String lV155Wpncyrcds_1_filterfulltext ;
   private String lV194Wpncyrcds_40_tfhisacco ;
   private String lV196Wpncyrcds_42_tfhisaccot ;
   private String lV198Wpncyrcds_44_tfhisadeacco ;
   private String lV200Wpncyrcds_46_tfhisadeacct ;
   private String AV155Wpncyrcds_1_filterfulltext ;
   private String AV195Wpncyrcds_41_tfhisacco_sel ;
   private String AV194Wpncyrcds_40_tfhisacco ;
   private String AV197Wpncyrcds_43_tfhisaccot_sel ;
   private String AV196Wpncyrcds_42_tfhisaccot ;
   private String AV199Wpncyrcds_45_tfhisadeacco_sel ;
   private String AV198Wpncyrcds_44_tfhisadeacco ;
   private String AV201Wpncyrcds_47_tfhisadeacct_sel ;
   private String AV200Wpncyrcds_46_tfhisadeacct ;
   private String AV35ExcelFilename ;
   private String AV36ErrorMessage ;
   private GXSimpleCollection<Byte> AV156Wpncyrcds_2_tfhisestreo_sels ;
   private GXSimpleCollection<Byte> AV47TFHisEstReo_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbHisEstReo ;
   private IDataStoreProvider pr_default ;
   private int[] H00DW2_A252CliCod ;
   private boolean[] H00DW2_n252CliCod ;
   private short[] H00DW2_A571HisTipArt ;
   private boolean[] H00DW2_n571HisTipArt ;
   private short[] H00DW2_A5085CodCausa ;
   private boolean[] H00DW2_n5085CodCausa ;
   private String[] H00DW2_A396EmprCod ;
   private short[] H00DW2_A7000Rps_Cod ;
   private boolean[] H00DW2_n7000Rps_Cod ;
   private byte[] H00DW2_A572HisTipCol ;
   private boolean[] H00DW2_n572HisTipCol ;
   private short[] H00DW2_A833TipDefCod ;
   private String[] H00DW2_A13844HisTipColD ;
   private boolean[] H00DW2_n13844HisTipColD ;
   private String[] H00DW2_A13843HisTipArtD ;
   private boolean[] H00DW2_n13843HisTipArtD ;
   private String[] H00DW2_A5695HisAdEAcCt ;
   private boolean[] H00DW2_n5695HisAdEAcCt ;
   private String[] H00DW2_A5694HisAdEAcCo ;
   private boolean[] H00DW2_n5694HisAdEAcCo ;
   private String[] H00DW2_A5693HisAcCot ;
   private boolean[] H00DW2_n5693HisAcCot ;
   private String[] H00DW2_A5662HisAcCo ;
   private boolean[] H00DW2_n5662HisAcCo ;
   private int[] H00DW2_A12949HisOpecod ;
   private boolean[] H00DW2_n12949HisOpecod ;
   private int[] H00DW2_A2297HisReoTn ;
   private boolean[] H00DW2_n2297HisReoTn ;
   private String[] H00DW2_A7001Rps_Dsc ;
   private boolean[] H00DW2_n7001Rps_Dsc ;
   private String[] H00DW2_A5086DscCausa ;
   private boolean[] H00DW2_n5086DscCausa ;
   private String[] H00DW2_A834TipDefDsc ;
   private boolean[] H00DW2_n834TipDefDsc ;
   private java.math.BigDecimal[] H00DW2_A541HisBarMtr ;
   private boolean[] H00DW2_n541HisBarMtr ;
   private String[] H00DW2_A602MaqCod ;
   private boolean[] H00DW2_n602MaqCod ;
   private byte[] H00DW2_A12950HisOpeTur ;
   private boolean[] H00DW2_n12950HisOpeTur ;
   private String[] H00DW2_A8889HisNomCli ;
   private boolean[] H00DW2_n8889HisNomCli ;
   private String[] H00DW2_A546HisColNom ;
   private boolean[] H00DW2_n546HisColNom ;
   private String[] H00DW2_A2299HisReoDsc ;
   private boolean[] H00DW2_n2299HisReoDsc ;
   private String[] H00DW2_A542HisBarSer ;
   private boolean[] H00DW2_n542HisBarSer ;
   private String[] H00DW2_A279CliNom ;
   private String[] H00DW2_A13698HisreoLote ;
   private boolean[] H00DW2_n13698HisreoLote ;
   private java.util.Date[] H00DW2_A569HisReoFec ;
   private boolean[] H00DW2_n569HisReoFec ;
   private byte[] H00DW2_A548HisEstReo ;
   private boolean[] H00DW2_n548HisEstReo ;
   private String[] H00DW2_A544HisCodPar ;
   private byte[] H00DW2_A545HisCodReo ;
   private int[] H00DW2_A539HisBarCod ;
   private java.math.BigDecimal[] H00DW2_A13699CostCausa ;
   private boolean[] H00DW2_n13699CostCausa ;
   private java.math.BigDecimal[] H00DW2_A540HisBarKgm ;
   private boolean[] H00DW2_n540HisBarKgm ;
   private long[] H00DW3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV42ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState44[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class wpncyrc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00DW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV156Wpncyrcds_2_tfhisestreo_sels ,
                                          String AV155Wpncyrcds_1_filterfulltext ,
                                          int AV156Wpncyrcds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV157Wpncyrcds_3_tfhisreofec ,
                                          String AV159Wpncyrcds_5_tfhisreohdr_sel ,
                                          String AV158Wpncyrcds_4_tfhisreohdr ,
                                          String AV161Wpncyrcds_7_tfhisreolote_sel ,
                                          String AV160Wpncyrcds_6_tfhisreolote ,
                                          String AV163Wpncyrcds_9_tfclinom_sel ,
                                          String AV162Wpncyrcds_8_tfclinom ,
                                          String AV165Wpncyrcds_11_tfhisbarser_sel ,
                                          String AV164Wpncyrcds_10_tfhisbarser ,
                                          String AV167Wpncyrcds_13_tfhisreodsc_sel ,
                                          String AV166Wpncyrcds_12_tfhisreodsc ,
                                          String AV169Wpncyrcds_15_tfhiscolnom_sel ,
                                          String AV168Wpncyrcds_14_tfhiscolnom ,
                                          String AV171Wpncyrcds_17_tfhisnomcli_sel ,
                                          String AV170Wpncyrcds_16_tfhisnomcli ,
                                          byte AV172Wpncyrcds_18_tfhisopetur ,
                                          byte AV173Wpncyrcds_19_tfhisopetur_to ,
                                          String AV175Wpncyrcds_21_tfmaqcod_sel ,
                                          String AV174Wpncyrcds_20_tfmaqcod ,
                                          java.math.BigDecimal AV176Wpncyrcds_22_tfhisbarkgm ,
                                          java.math.BigDecimal AV177Wpncyrcds_23_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV178Wpncyrcds_24_tfhisbarmtr ,
                                          java.math.BigDecimal AV179Wpncyrcds_25_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV180Wpncyrcds_26_tfcostcausa ,
                                          java.math.BigDecimal AV181Wpncyrcds_27_tfcostcausa_to ,
                                          java.math.BigDecimal AV182Wpncyrcds_28_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV183Wpncyrcds_29_tfhisreovalorcausa_to ,
                                          String AV185Wpncyrcds_31_tftipdefdsc_sel ,
                                          String AV184Wpncyrcds_30_tftipdefdsc ,
                                          String AV187Wpncyrcds_33_tfdsccausa_sel ,
                                          String AV186Wpncyrcds_32_tfdsccausa ,
                                          String AV189Wpncyrcds_35_tfrps_dsc_sel ,
                                          String AV188Wpncyrcds_34_tfrps_dsc ,
                                          int AV190Wpncyrcds_36_tfhisreotn ,
                                          int AV191Wpncyrcds_37_tfhisreotn_to ,
                                          int AV192Wpncyrcds_38_tfhisopecod ,
                                          int AV193Wpncyrcds_39_tfhisopecod_to ,
                                          String AV195Wpncyrcds_41_tfhisacco_sel ,
                                          String AV194Wpncyrcds_40_tfhisacco ,
                                          String AV197Wpncyrcds_43_tfhisaccot_sel ,
                                          String AV196Wpncyrcds_42_tfhisaccot ,
                                          String AV199Wpncyrcds_45_tfhisadeacco_sel ,
                                          String AV198Wpncyrcds_44_tfhisadeacco ,
                                          String AV201Wpncyrcds_47_tfhisadeacct_sel ,
                                          String AV200Wpncyrcds_46_tfhisadeacct ,
                                          String AV203Wpncyrcds_49_tfhistipartdsc_sel ,
                                          String AV202Wpncyrcds_48_tfhistipartdsc ,
                                          String AV205Wpncyrcds_51_tfhistipcoldsc_sel ,
                                          String AV204Wpncyrcds_50_tfhistipcoldsc ,
                                          int A539HisBarCod ,
                                          byte A545HisCodReo ,
                                          String A544HisCodPar ,
                                          String A13698HisreoLote ,
                                          String A279CliNom ,
                                          String A542HisBarSer ,
                                          String A2299HisReoDsc ,
                                          String A546HisColNom ,
                                          String A8889HisNomCli ,
                                          byte A12950HisOpeTur ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A540HisBarKgm ,
                                          java.math.BigDecimal A541HisBarMtr ,
                                          java.math.BigDecimal A13699CostCausa ,
                                          String A834TipDefDsc ,
                                          String A5086DscCausa ,
                                          String A7001Rps_Dsc ,
                                          int A2297HisReoTn ,
                                          int A12949HisOpecod ,
                                          String A5662HisAcCo ,
                                          String A5693HisAcCot ,
                                          String A5694HisAdEAcCo ,
                                          String A5695HisAdEAcCt ,
                                          String A13843HisTipArtD ,
                                          String A13844HisTipColD ,
                                          java.util.Date A569HisReoFec ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int45 = new byte[80];
      Object[] GXv_Object46 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.CliCod, T1.HisTipArt AS HisTipArt, T1.CodCausa, T1.EmprCod, T1.Rps_Cod, T1.HisTipCol AS HisTipCol, T1.TipDefCod, T4.TipColDsc AS HisTipColD, T3.TipArtDsc AS" ;
      sSelectString += " HisTipArtD, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisAcCot, T1.HisAcCo, T1.HisOpecod, T1.HisReoTn, T7.Rps_Dsc, T6.DscCausa, T5.TipDefDsc, T1.HisBarMtr, T1.MaqCod, T1.HisOpeTur," ;
      sSelectString += " T1.HisNomCli, T1.HisColNom, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.HisreoLote, T1.HisReoFec, T1.HisEstReo, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T6.CostCausa," ;
      sSelectString += " T1.HisBarKgm" ;
      sFromString = " FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod" ;
      sFromString += " = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod = T1.EmprCod AND T5.TipDefCod" ;
      sFromString += " = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod = T1.EmprCod AND T7.Rps_Cod" ;
      sFromString += " = T1.Rps_Cod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV155Wpncyrcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T6.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T5.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T6.DscCausa) like '%' || UPPER(?)) or ( UPPER(T7.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int45[1] = (byte)(1) ;
         GXv_int45[2] = (byte)(1) ;
         GXv_int45[3] = (byte)(1) ;
         GXv_int45[4] = (byte)(1) ;
         GXv_int45[5] = (byte)(1) ;
         GXv_int45[6] = (byte)(1) ;
         GXv_int45[7] = (byte)(1) ;
         GXv_int45[8] = (byte)(1) ;
         GXv_int45[9] = (byte)(1) ;
         GXv_int45[10] = (byte)(1) ;
         GXv_int45[11] = (byte)(1) ;
         GXv_int45[12] = (byte)(1) ;
         GXv_int45[13] = (byte)(1) ;
         GXv_int45[14] = (byte)(1) ;
         GXv_int45[15] = (byte)(1) ;
         GXv_int45[16] = (byte)(1) ;
         GXv_int45[17] = (byte)(1) ;
         GXv_int45[18] = (byte)(1) ;
         GXv_int45[19] = (byte)(1) ;
         GXv_int45[20] = (byte)(1) ;
         GXv_int45[21] = (byte)(1) ;
         GXv_int45[22] = (byte)(1) ;
         GXv_int45[23] = (byte)(1) ;
         GXv_int45[24] = (byte)(1) ;
         GXv_int45[25] = (byte)(1) ;
      }
      if ( AV156Wpncyrcds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV156Wpncyrcds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Wpncyrcds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int45[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Wpncyrcds_5_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV158Wpncyrcds_4_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Wpncyrcds_5_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int45[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Wpncyrcds_7_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV160Wpncyrcds_6_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Wpncyrcds_7_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int45[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Wpncyrcds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV162Wpncyrcds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Wpncyrcds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int45[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Wpncyrcds_11_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV164Wpncyrcds_10_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Wpncyrcds_11_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int45[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Wpncyrcds_13_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV166Wpncyrcds_12_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Wpncyrcds_13_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int45[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Wpncyrcds_15_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV168Wpncyrcds_14_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Wpncyrcds_15_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int45[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Wpncyrcds_17_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV170Wpncyrcds_16_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Wpncyrcds_17_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int45[40] = (byte)(1) ;
      }
      if ( ! (0==AV172Wpncyrcds_18_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int45[41] = (byte)(1) ;
      }
      if ( ! (0==AV173Wpncyrcds_19_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int45[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV175Wpncyrcds_21_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV174Wpncyrcds_20_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV175Wpncyrcds_21_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int45[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Wpncyrcds_22_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int45[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Wpncyrcds_23_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int45[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Wpncyrcds_24_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int45[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Wpncyrcds_25_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int45[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Wpncyrcds_26_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int45[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Wpncyrcds_27_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int45[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Wpncyrcds_28_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int45[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Wpncyrcds_29_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int45[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV185Wpncyrcds_31_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV184Wpncyrcds_30_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV185Wpncyrcds_31_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int45[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Wpncyrcds_33_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV186Wpncyrcds_32_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Wpncyrcds_33_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int45[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV189Wpncyrcds_35_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV188Wpncyrcds_34_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Wpncyrcds_35_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int45[58] = (byte)(1) ;
      }
      if ( ! (0==AV190Wpncyrcds_36_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int45[59] = (byte)(1) ;
      }
      if ( ! (0==AV191Wpncyrcds_37_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int45[60] = (byte)(1) ;
      }
      if ( ! (0==AV192Wpncyrcds_38_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int45[61] = (byte)(1) ;
      }
      if ( ! (0==AV193Wpncyrcds_39_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int45[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Wpncyrcds_41_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV194Wpncyrcds_40_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Wpncyrcds_41_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int45[64] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Wpncyrcds_43_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV196Wpncyrcds_42_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Wpncyrcds_43_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int45[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV199Wpncyrcds_45_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV198Wpncyrcds_44_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV199Wpncyrcds_45_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int45[68] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Wpncyrcds_47_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV200Wpncyrcds_46_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[69] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Wpncyrcds_47_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int45[70] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Wpncyrcds_49_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV202Wpncyrcds_48_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Wpncyrcds_49_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int45[72] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Wpncyrcds_51_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV204Wpncyrcds_50_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int45[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Wpncyrcds_51_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int45[74] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisReoFec" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisReoFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisEstReo" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisEstReo DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisreoLote" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisreoLote DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisBarSer" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisBarSer DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisReoDsc" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisReoDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisColNom" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisColNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisNomCli" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisNomCli DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisOpeTur" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisOpeTur DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisBarKgm" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisBarKgm DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisBarMtr" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisBarMtr DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T6.CostCausa" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T6.CostCausa DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T5.TipDefDsc" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.TipDefDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T6.DscCausa" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T6.DscCausa DESC" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T7.Rps_Dsc" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T7.Rps_Dsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisReoTn" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisReoTn DESC" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisOpecod" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisOpecod DESC" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAcCo" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAcCo DESC" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAcCot" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAcCot DESC" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCo" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCo DESC" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCt" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisAdEAcCt DESC" ;
      }
      else if ( ( AV13OrderedBy == 24 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV13OrderedBy == 24 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.HisBarCod, T1.HisCodReo, T1.HisCodPar, T1.TipDefCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object46[0] = scmdbuf ;
      GXv_Object46[1] = GXv_int45 ;
      return GXv_Object46 ;
   }

   protected Object[] conditional_H00DW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV156Wpncyrcds_2_tfhisestreo_sels ,
                                          String AV155Wpncyrcds_1_filterfulltext ,
                                          int AV156Wpncyrcds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV157Wpncyrcds_3_tfhisreofec ,
                                          String AV159Wpncyrcds_5_tfhisreohdr_sel ,
                                          String AV158Wpncyrcds_4_tfhisreohdr ,
                                          String AV161Wpncyrcds_7_tfhisreolote_sel ,
                                          String AV160Wpncyrcds_6_tfhisreolote ,
                                          String AV163Wpncyrcds_9_tfclinom_sel ,
                                          String AV162Wpncyrcds_8_tfclinom ,
                                          String AV165Wpncyrcds_11_tfhisbarser_sel ,
                                          String AV164Wpncyrcds_10_tfhisbarser ,
                                          String AV167Wpncyrcds_13_tfhisreodsc_sel ,
                                          String AV166Wpncyrcds_12_tfhisreodsc ,
                                          String AV169Wpncyrcds_15_tfhiscolnom_sel ,
                                          String AV168Wpncyrcds_14_tfhiscolnom ,
                                          String AV171Wpncyrcds_17_tfhisnomcli_sel ,
                                          String AV170Wpncyrcds_16_tfhisnomcli ,
                                          byte AV172Wpncyrcds_18_tfhisopetur ,
                                          byte AV173Wpncyrcds_19_tfhisopetur_to ,
                                          String AV175Wpncyrcds_21_tfmaqcod_sel ,
                                          String AV174Wpncyrcds_20_tfmaqcod ,
                                          java.math.BigDecimal AV176Wpncyrcds_22_tfhisbarkgm ,
                                          java.math.BigDecimal AV177Wpncyrcds_23_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV178Wpncyrcds_24_tfhisbarmtr ,
                                          java.math.BigDecimal AV179Wpncyrcds_25_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV180Wpncyrcds_26_tfcostcausa ,
                                          java.math.BigDecimal AV181Wpncyrcds_27_tfcostcausa_to ,
                                          java.math.BigDecimal AV182Wpncyrcds_28_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV183Wpncyrcds_29_tfhisreovalorcausa_to ,
                                          String AV185Wpncyrcds_31_tftipdefdsc_sel ,
                                          String AV184Wpncyrcds_30_tftipdefdsc ,
                                          String AV187Wpncyrcds_33_tfdsccausa_sel ,
                                          String AV186Wpncyrcds_32_tfdsccausa ,
                                          String AV189Wpncyrcds_35_tfrps_dsc_sel ,
                                          String AV188Wpncyrcds_34_tfrps_dsc ,
                                          int AV190Wpncyrcds_36_tfhisreotn ,
                                          int AV191Wpncyrcds_37_tfhisreotn_to ,
                                          int AV192Wpncyrcds_38_tfhisopecod ,
                                          int AV193Wpncyrcds_39_tfhisopecod_to ,
                                          String AV195Wpncyrcds_41_tfhisacco_sel ,
                                          String AV194Wpncyrcds_40_tfhisacco ,
                                          String AV197Wpncyrcds_43_tfhisaccot_sel ,
                                          String AV196Wpncyrcds_42_tfhisaccot ,
                                          String AV199Wpncyrcds_45_tfhisadeacco_sel ,
                                          String AV198Wpncyrcds_44_tfhisadeacco ,
                                          String AV201Wpncyrcds_47_tfhisadeacct_sel ,
                                          String AV200Wpncyrcds_46_tfhisadeacct ,
                                          String AV203Wpncyrcds_49_tfhistipartdsc_sel ,
                                          String AV202Wpncyrcds_48_tfhistipartdsc ,
                                          String AV205Wpncyrcds_51_tfhistipcoldsc_sel ,
                                          String AV204Wpncyrcds_50_tfhistipcoldsc ,
                                          int A539HisBarCod ,
                                          byte A545HisCodReo ,
                                          String A544HisCodPar ,
                                          String A13698HisreoLote ,
                                          String A279CliNom ,
                                          String A542HisBarSer ,
                                          String A2299HisReoDsc ,
                                          String A546HisColNom ,
                                          String A8889HisNomCli ,
                                          byte A12950HisOpeTur ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A540HisBarKgm ,
                                          java.math.BigDecimal A541HisBarMtr ,
                                          java.math.BigDecimal A13699CostCausa ,
                                          String A834TipDefDsc ,
                                          String A5086DscCausa ,
                                          String A7001Rps_Dsc ,
                                          int A2297HisReoTn ,
                                          int A12949HisOpecod ,
                                          String A5662HisAcCo ,
                                          String A5693HisAcCot ,
                                          String A5694HisAdEAcCo ,
                                          String A5695HisAdEAcCt ,
                                          String A13843HisTipArtD ,
                                          String A13844HisTipColD ,
                                          java.util.Date A569HisReoFec ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int48 = new byte[75];
      Object[] GXv_Object49 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.Rps_Cod = T1.Rps_Cod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV155Wpncyrcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T6.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T5.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T6.DscCausa) like '%' || UPPER(?)) or ( UPPER(T7.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int48[1] = (byte)(1) ;
         GXv_int48[2] = (byte)(1) ;
         GXv_int48[3] = (byte)(1) ;
         GXv_int48[4] = (byte)(1) ;
         GXv_int48[5] = (byte)(1) ;
         GXv_int48[6] = (byte)(1) ;
         GXv_int48[7] = (byte)(1) ;
         GXv_int48[8] = (byte)(1) ;
         GXv_int48[9] = (byte)(1) ;
         GXv_int48[10] = (byte)(1) ;
         GXv_int48[11] = (byte)(1) ;
         GXv_int48[12] = (byte)(1) ;
         GXv_int48[13] = (byte)(1) ;
         GXv_int48[14] = (byte)(1) ;
         GXv_int48[15] = (byte)(1) ;
         GXv_int48[16] = (byte)(1) ;
         GXv_int48[17] = (byte)(1) ;
         GXv_int48[18] = (byte)(1) ;
         GXv_int48[19] = (byte)(1) ;
         GXv_int48[20] = (byte)(1) ;
         GXv_int48[21] = (byte)(1) ;
         GXv_int48[22] = (byte)(1) ;
         GXv_int48[23] = (byte)(1) ;
         GXv_int48[24] = (byte)(1) ;
         GXv_int48[25] = (byte)(1) ;
      }
      if ( AV156Wpncyrcds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV156Wpncyrcds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV157Wpncyrcds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int48[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Wpncyrcds_5_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV158Wpncyrcds_4_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Wpncyrcds_5_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int48[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Wpncyrcds_7_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV160Wpncyrcds_6_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Wpncyrcds_7_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int48[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Wpncyrcds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV162Wpncyrcds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Wpncyrcds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int48[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Wpncyrcds_11_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV164Wpncyrcds_10_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Wpncyrcds_11_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int48[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Wpncyrcds_13_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV166Wpncyrcds_12_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Wpncyrcds_13_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int48[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Wpncyrcds_15_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV168Wpncyrcds_14_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Wpncyrcds_15_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int48[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Wpncyrcds_17_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV170Wpncyrcds_16_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Wpncyrcds_17_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int48[40] = (byte)(1) ;
      }
      if ( ! (0==AV172Wpncyrcds_18_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int48[41] = (byte)(1) ;
      }
      if ( ! (0==AV173Wpncyrcds_19_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int48[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV175Wpncyrcds_21_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV174Wpncyrcds_20_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV175Wpncyrcds_21_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int48[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Wpncyrcds_22_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int48[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Wpncyrcds_23_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int48[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Wpncyrcds_24_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int48[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Wpncyrcds_25_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int48[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Wpncyrcds_26_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int48[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV181Wpncyrcds_27_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int48[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV182Wpncyrcds_28_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int48[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV183Wpncyrcds_29_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int48[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV185Wpncyrcds_31_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV184Wpncyrcds_30_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV185Wpncyrcds_31_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int48[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Wpncyrcds_33_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV186Wpncyrcds_32_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Wpncyrcds_33_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int48[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV189Wpncyrcds_35_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV188Wpncyrcds_34_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV189Wpncyrcds_35_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int48[58] = (byte)(1) ;
      }
      if ( ! (0==AV190Wpncyrcds_36_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int48[59] = (byte)(1) ;
      }
      if ( ! (0==AV191Wpncyrcds_37_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int48[60] = (byte)(1) ;
      }
      if ( ! (0==AV192Wpncyrcds_38_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int48[61] = (byte)(1) ;
      }
      if ( ! (0==AV193Wpncyrcds_39_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int48[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV195Wpncyrcds_41_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV194Wpncyrcds_40_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV195Wpncyrcds_41_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int48[64] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV197Wpncyrcds_43_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV196Wpncyrcds_42_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV197Wpncyrcds_43_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int48[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV199Wpncyrcds_45_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV198Wpncyrcds_44_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV199Wpncyrcds_45_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int48[68] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV201Wpncyrcds_47_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV200Wpncyrcds_46_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[69] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV201Wpncyrcds_47_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int48[70] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Wpncyrcds_49_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV202Wpncyrcds_48_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Wpncyrcds_49_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int48[72] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV205Wpncyrcds_51_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV204Wpncyrcds_50_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int48[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV205Wpncyrcds_51_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int48[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 24 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 24 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object49[0] = scmdbuf ;
      GXv_Object49[1] = GXv_int48 ;
      return GXv_Object49 ;
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
                  return conditional_H00DW2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Boolean) dynConstraints[80]).booleanValue() , (String)dynConstraints[81] );
            case 1 :
                  return conditional_H00DW3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Boolean) dynConstraints[80]).booleanValue() , (String)dynConstraints[81] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00DW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00DW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 60);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 30);
               ((String[]) buf[49])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((int[]) buf[57])[0] = rslt.getInt(32);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(33,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[80], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 3);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 3);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 3);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 3);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 30);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 30);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 60);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 60);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 40);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 40);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[139]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[140]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[141]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[143], 3276);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[144], 3276);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[145], 2000);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[146], 2000);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[147], 2000);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[148], 2000);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[149], 2000);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[151], 30);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[152], 30);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[153], 30);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 30);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[155]).intValue());
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[156]).intValue());
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[157]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[158]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[159]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 3);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 3);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 3);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 3);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 60);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 60);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 40);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 40);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[138], 3276);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[139], 3276);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[140], 2000);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[141], 2000);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[142], 2000);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[143], 2000);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[144], 2000);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[145], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 30);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 30);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 30);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 30);
               }
               return;
      }
   }

}

