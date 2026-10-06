package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmformulasww_impl extends GXDataArea
{
   public tmformulasww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmformulasww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmformulasww_impl.class ));
   }

   public tmformulasww_impl( int remoteHandle ,
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
      nRC_GXsfl_48 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_48"))) ;
      nGXsfl_48_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_48_idx"))) ;
      sGXsfl_48_idx = httpContext.GetPar( "sGXsfl_48_idx") ;
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
      AV180FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV138ForFec = localUtil.parseDateParm( httpContext.GetPar( "ForFec")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV59ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV54ColumnsSelector);
      AV139ForFec_To = localUtil.parseDateParm( httpContext.GetPar( "ForFec_To")) ;
      AV61TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV62TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV64TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV65TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV67TFForSer = httpContext.GetPar( "TFForSer") ;
      AV68TFForSer_Sel = httpContext.GetPar( "TFForSer_Sel") ;
      AV70TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV71TFForSerDsc_Sel = httpContext.GetPar( "TFForSerDsc_Sel") ;
      AV73TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV74TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV76TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV77TFForColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum_To"))) ;
      AV121TFForNomCli = httpContext.GetPar( "TFForNomCli") ;
      AV122TFForNomCli_Sel = httpContext.GetPar( "TFForNomCli_Sel") ;
      AV79TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV80TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV82TFTipColDsc = httpContext.GetPar( "TFTipColDsc") ;
      AV83TFTipColDsc_Sel = httpContext.GetPar( "TFTipColDsc_Sel") ;
      AV141TFForFec = localUtil.parseDateParm( httpContext.GetPar( "TFForFec")) ;
      AV146TFForUltUti = localUtil.parseDateParm( httpContext.GetPar( "TFForUltUti")) ;
      AV151TFForNumCol = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol"))) ;
      AV152TFForNumCol_To = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol_To"))) ;
      AV172TFForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "TFForRelBan"), ".") ;
      AV173TFForRelBan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFForRelBan_To"), ".") ;
      AV225Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV179SiRGB = (short)(GXutil.lval( httpContext.GetPar( "SiRGB"))) ;
      AV167Tintutex = (byte)(GXutil.lval( httpContext.GetPar( "Tintutex"))) ;
      AV177UsurCod = httpContext.GetPar( "UsurCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV180FilterFullText, AV138ForFec, A396EmprCod, AV59ManageFiltersExecutionStep, AV54ColumnsSelector, AV139ForFec_To, AV61TFCliCod, AV62TFCliCod_To, AV64TFCliNom, AV65TFCliNom_Sel, AV67TFForSer, AV68TFForSer_Sel, AV70TFForSerDsc, AV71TFForSerDsc_Sel, AV73TFForColNom, AV74TFForColNom_Sel, AV76TFForColNum, AV77TFForColNum_To, AV121TFForNomCli, AV122TFForNomCli_Sel, AV79TFTipColCod, AV80TFTipColCod_To, AV82TFTipColDsc, AV83TFTipColDsc_Sel, AV141TFForFec, AV146TFForUltUti, AV151TFForNumCol, AV152TFForNumCol_To, AV172TFForRelBan, AV173TFForRelBan_To, AV225Pgmname, AV13OrderedBy, AV14OrderedDsc, AV179SiRGB, AV167Tintutex, AV177UsurCod) ;
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
      paR62( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startR62( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmformulasww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV179SiRGB), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTUTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV167Tintutex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177UsurCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV180FilterFullText);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORFEC", localUtil.format(AV138ForFec, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_48", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_48, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV57ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV57ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV132GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV133GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORFEC", localUtil.dtoc( AV138ForFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORFEC_TO", localUtil.dtoc( AV139ForFec_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV130DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV130DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV54ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV54ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV59ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV61TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV62TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV64TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV65TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSER", GXutil.rtrim( AV67TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSER_SEL", GXutil.rtrim( AV68TFForSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSERDSC", GXutil.rtrim( AV70TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSERDSC_SEL", GXutil.rtrim( AV71TFForSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM", GXutil.rtrim( AV73TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM_SEL", GXutil.rtrim( AV74TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV76TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV77TFForColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNOMCLI", GXutil.rtrim( AV121TFForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNOMCLI_SEL", GXutil.rtrim( AV122TFForNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV79TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV80TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC", GXutil.rtrim( AV82TFTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC_SEL", GXutil.rtrim( AV83TFTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORFEC", localUtil.dtoc( AV141TFForFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORULTUTI", localUtil.dtoc( AV146TFForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV151TFForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCOL_TO", GXutil.ltrim( localUtil.ntoc( AV152TFForNumCol_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV172TFForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORRELBAN_TO", GXutil.ltrim( localUtil.ntoc( AV173TFForRelBan_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV225Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FORRGB", GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV179SiRGB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV179SiRGB), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV174Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV168Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTUTEX", GXutil.ltrim( localUtil.ntoc( AV167Tintutex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTUTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV167Tintutex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV177UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177UsurCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarformula_Result));
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
      if ( ! ( WebComp_Wcwcprocesosformula == null ) )
      {
         WebComp_Wcwcprocesosformula.componentjscripts();
      }
      if ( ! ( WebComp_Wcwccolorantesformula == null ) )
      {
         WebComp_Wcwccolorantesformula.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcproductosformula == null ) )
      {
         WebComp_Wcwcproductosformula.componentjscripts();
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
         weR62( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtR62( ) ;
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
      return formatLink("app.tmformulasww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMFormulasWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento de Formulas", "") ;
   }

   public void wbR60( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_R62( true) ;
      }
      else
      {
         wb_table1_27_R62( false) ;
      }
      return  ;
   }

   public void wb_table1_27_R62e( boolean wbgen )
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
         startgridcontrol48( ) ;
      }
      if ( wbEnd == 48 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_48 = (int)(nGXsfl_48_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV132GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV133GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecetacolor_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Receta Color", ""), bttBtnrecetacolor_Jsonclick, 5, httpContext.getMessage( "Receta Color", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORECETACOLOR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlistado_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Listado", ""), bttBtnlistado_Jsonclick, 7, httpContext.getMessage( "Listado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11r61_client"+"'", TempTags, "", 2, "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnverformula_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Ver Formula", ""), bttBtnverformula_Jsonclick, 5, httpContext.getMessage( "Ver Formula", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOVERFORMULA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsimulacionformula_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Simulacion Formula", ""), bttBtnsimulacionformula_Jsonclick, 5, httpContext.getMessage( "Simulacion Formula", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSIMULACIONFORMULA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnduplicarequivalente_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Duplicar o Equivalente", ""), bttBtnduplicarequivalente_Jsonclick, 5, httpContext.getMessage( "Duplicar o Equivalente", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DODUPLICAREQUIVALENTE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarformula_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Formula", ""), bttBtneliminarformula_Jsonclick, 7, httpContext.getMessage( "Eliminar Formula", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12r61_client"+"'", TempTags, "", 2, "HLP_TMFormulasWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblProcesosquimicos_title_Internalname, httpContext.getMessage( "Procesos Quimicos", ""), "", "", lblProcesosquimicos_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMFormulasWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "ProcesosQuimicos") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0110"+"", GXutil.rtrim( WebComp_Wcwcprocesosformula_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0110"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_48_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwcprocesosformula_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcprocesosformula), GXutil.lower( WebComp_Wcwcprocesosformula_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0110"+"");
                  }
                  WebComp_Wcwcprocesosformula.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcprocesosformula), GXutil.lower( WebComp_Wcwcprocesosformula_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblColorantes_title_Internalname, httpContext.getMessage( "Colorantes", ""), "", "", lblColorantes_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMFormulasWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Colorantes") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0118"+"", GXutil.rtrim( WebComp_Wcwccolorantesformula_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0118"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_48_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwccolorantesformula_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccolorantesformula), GXutil.lower( WebComp_Wcwccolorantesformula_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0118"+"");
                  }
                  WebComp_Wcwccolorantesformula.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwccolorantesformula), GXutil.lower( WebComp_Wcwccolorantesformula_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblProductos_title_Internalname, httpContext.getMessage( "Productos(#)", ""), "", "", lblProductos_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TMFormulasWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Productos") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0126"+"", GXutil.rtrim( WebComp_Wcwcproductosformula_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0126"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_48_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcwcproductosformula_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcproductosformula), GXutil.lower( WebComp_Wcwcproductosformula_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0126"+"");
                  }
                  WebComp_Wcwcproductosformula.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcwcproductosformula), GXutil.lower( WebComp_Wcwcproductosformula_Component)) != 0 )
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
         ucForfec_rangepicker.setProperty("Start Date", AV138ForFec);
         ucForfec_rangepicker.setProperty("End Date", AV139ForFec_To);
         ucForfec_rangepicker.render(context, "wwp.daterangepicker", Forfec_rangepicker_Internalname, "FORFEC_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV130DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV130DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV54ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_134_R62( true) ;
      }
      else
      {
         wb_table2_134_R62( false) ;
      }
      return  ;
   }

   public void wb_table2_134_R62e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forfecauxdate_Internalname, localUtil.format(AV143DDO_ForFecAuxDate, "99/99/99"), localUtil.format( AV143DDO_ForFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forultutiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forultutiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forultutiauxdate_Internalname, localUtil.format(AV148DDO_ForUltUtiAuxDate, "99/99/99"), localUtil.format( AV148DDO_ForUltUtiAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forultutiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forultutiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMFormulasWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 48 )
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

   public void startR62( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento de Formulas", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupR60( ) ;
   }

   public void wsR62( )
   {
      startR62( ) ;
      evtR62( ) ;
   }

   public void evtR62( )
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
                           e13R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "FORFEC_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARFORMULA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECETACOLOR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoRecetaColor' */
                           e20R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOVERFORMULA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoVerformula' */
                           e21R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSIMULACIONFORMULA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSimulacionFormula' */
                           e22R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODUPLICAREQUIVALENTE'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoDuplicarEquivalente' */
                           e23R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e24R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e25R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e26R62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e27R62 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_48_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_482( ) ;
                           AV193Visualizar = httpContext.cgiGet( edtavVisualizar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavVisualizar_Internalname, AV193Visualizar);
                           AV191Modificar = httpContext.cgiGet( edtavModificar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavModificar_Internalname, AV191Modificar);
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
                           n1191ForNomCli = false ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
                           n832TipColDsc = false ;
                           A485ForFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForFec_Internalname), 0)) ;
                           n485ForFec = false ;
                           A496ForUltUti = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtForUltUti_Internalname), 0)) ;
                           n496ForUltUti = false ;
                           A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)) ;
                           n2838ForRelBan = false ;
                           A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1192ForNumCli = false ;
                           AV153ForRGB = localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153ForRGB), 10, 0));
                           AV158R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV158R), 3, 0));
                           AV156G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156G), 3, 0));
                           AV154B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154B), 3, 0));
                           AV159R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV159R2), 3, 0));
                           AV157G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157G2), 3, 0));
                           AV155B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155B2), 3, 0));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e28R62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e29R62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e30R62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV180FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Forfec Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vFORFEC"), 0), AV138ForFec) ) )
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 110 )
                     {
                        OldWcwcprocesosformula = httpContext.cgiGet( "W0110") ;
                        if ( ( GXutil.len( OldWcwcprocesosformula) == 0 ) || ( GXutil.strcmp(OldWcwcprocesosformula, WebComp_Wcwcprocesosformula_Component) != 0 ) )
                        {
                           WebComp_Wcwcprocesosformula = WebUtils.getWebComponent(getClass(), "app." + OldWcwcprocesosformula + "_impl", remoteHandle, context);
                           WebComp_Wcwcprocesosformula_Component = OldWcwcprocesosformula ;
                        }
                        if ( GXutil.len( WebComp_Wcwcprocesosformula_Component) != 0 )
                        {
                           WebComp_Wcwcprocesosformula.componentprocess("W0110", "", sEvt);
                        }
                        WebComp_Wcwcprocesosformula_Component = OldWcwcprocesosformula ;
                     }
                     else if ( nCmpId == 118 )
                     {
                        OldWcwccolorantesformula = httpContext.cgiGet( "W0118") ;
                        if ( ( GXutil.len( OldWcwccolorantesformula) == 0 ) || ( GXutil.strcmp(OldWcwccolorantesformula, WebComp_Wcwccolorantesformula_Component) != 0 ) )
                        {
                           WebComp_Wcwccolorantesformula = WebUtils.getWebComponent(getClass(), "app." + OldWcwccolorantesformula + "_impl", remoteHandle, context);
                           WebComp_Wcwccolorantesformula_Component = OldWcwccolorantesformula ;
                        }
                        if ( GXutil.len( WebComp_Wcwccolorantesformula_Component) != 0 )
                        {
                           WebComp_Wcwccolorantesformula.componentprocess("W0118", "", sEvt);
                        }
                        WebComp_Wcwccolorantesformula_Component = OldWcwccolorantesformula ;
                     }
                     else if ( nCmpId == 126 )
                     {
                        OldWcwcproductosformula = httpContext.cgiGet( "W0126") ;
                        if ( ( GXutil.len( OldWcwcproductosformula) == 0 ) || ( GXutil.strcmp(OldWcwcproductosformula, WebComp_Wcwcproductosformula_Component) != 0 ) )
                        {
                           WebComp_Wcwcproductosformula = WebUtils.getWebComponent(getClass(), "app." + OldWcwcproductosformula + "_impl", remoteHandle, context);
                           WebComp_Wcwcproductosformula_Component = OldWcwcproductosformula ;
                        }
                        if ( GXutil.len( WebComp_Wcwcproductosformula_Component) != 0 )
                        {
                           WebComp_Wcwcproductosformula.componentprocess("W0126", "", sEvt);
                        }
                        WebComp_Wcwcproductosformula_Component = OldWcwcproductosformula ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weR62( )
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

   public void paR62( )
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
            GX_FocusControl = edtavForfec_rangetext_Internalname ;
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
      subsflControlProps_482( ) ;
      while ( nGXsfl_48_idx <= nRC_GXsfl_48 )
      {
         sendrow_482( ) ;
         nGXsfl_48_idx = ((subGrid_Islastpage==1)&&(nGXsfl_48_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV180FilterFullText ,
                                 java.util.Date AV138ForFec ,
                                 String A396EmprCod ,
                                 byte AV59ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV54ColumnsSelector ,
                                 java.util.Date AV139ForFec_To ,
                                 int AV61TFCliCod ,
                                 int AV62TFCliCod_To ,
                                 String AV64TFCliNom ,
                                 String AV65TFCliNom_Sel ,
                                 String AV67TFForSer ,
                                 String AV68TFForSer_Sel ,
                                 String AV70TFForSerDsc ,
                                 String AV71TFForSerDsc_Sel ,
                                 String AV73TFForColNom ,
                                 String AV74TFForColNom_Sel ,
                                 int AV76TFForColNum ,
                                 int AV77TFForColNum_To ,
                                 String AV121TFForNomCli ,
                                 String AV122TFForNomCli_Sel ,
                                 byte AV79TFTipColCod ,
                                 byte AV80TFTipColCod_To ,
                                 String AV82TFTipColDsc ,
                                 String AV83TFTipColDsc_Sel ,
                                 java.util.Date AV141TFForFec ,
                                 java.util.Date AV146TFForUltUti ,
                                 int AV151TFForNumCol ,
                                 int AV152TFForNumCol_To ,
                                 java.math.BigDecimal AV172TFForRelBan ,
                                 java.math.BigDecimal AV173TFForRelBan_To ,
                                 String AV225Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 short AV179SiRGB ,
                                 byte AV167Tintutex ,
                                 String AV177UsurCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e29R62 ();
      GRID_nCurrentRecord = 0 ;
      rfR62( ) ;
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
      rfR62( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV225Pgmname = "TMFormulasWW" ;
      Gx_err = (short)(0) ;
      edtavVisualizar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVisualizar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVisualizar_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavModificar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModificar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModificar_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_48_Refreshing);
   }

   public void rfR62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(48) ;
      /* Execute user event: Refresh */
      e29R62 ();
      nGXsfl_48_idx = 1 ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_482( ) ;
      bGXsfl_48_Refreshing = true ;
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
            if ( GXutil.len( WebComp_Wcwcprocesosformula_Component) != 0 )
            {
               WebComp_Wcwcprocesosformula.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwccolorantesformula_Component) != 0 )
            {
               WebComp_Wcwccolorantesformula.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcproductosformula_Component) != 0 )
            {
               WebComp_Wcwcproductosformula.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_482( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV198Tmformulaswwds_1_forfec ,
                                              AV199Tmformulaswwds_2_forfec_to ,
                                              AV200Tmformulaswwds_3_filterfulltext ,
                                              Integer.valueOf(AV201Tmformulaswwds_4_tfclicod) ,
                                              Integer.valueOf(AV202Tmformulaswwds_5_tfclicod_to) ,
                                              AV204Tmformulaswwds_7_tfclinom_sel ,
                                              AV203Tmformulaswwds_6_tfclinom ,
                                              AV206Tmformulaswwds_9_tfforser_sel ,
                                              AV205Tmformulaswwds_8_tfforser ,
                                              AV208Tmformulaswwds_11_tfforserdsc_sel ,
                                              AV207Tmformulaswwds_10_tfforserdsc ,
                                              AV210Tmformulaswwds_13_tfforcolnom_sel ,
                                              AV209Tmformulaswwds_12_tfforcolnom ,
                                              Integer.valueOf(AV211Tmformulaswwds_14_tfforcolnum) ,
                                              Integer.valueOf(AV212Tmformulaswwds_15_tfforcolnum_to) ,
                                              AV214Tmformulaswwds_17_tffornomcli_sel ,
                                              AV213Tmformulaswwds_16_tffornomcli ,
                                              Byte.valueOf(AV215Tmformulaswwds_18_tftipcolcod) ,
                                              Byte.valueOf(AV216Tmformulaswwds_19_tftipcolcod_to) ,
                                              AV218Tmformulaswwds_21_tftipcoldsc_sel ,
                                              AV217Tmformulaswwds_20_tftipcoldsc ,
                                              AV219Tmformulaswwds_22_tfforfec ,
                                              AV220Tmformulaswwds_23_tfforultuti ,
                                              Integer.valueOf(AV221Tmformulaswwds_24_tffornumcol) ,
                                              Integer.valueOf(AV222Tmformulaswwds_25_tffornumcol_to) ,
                                              AV223Tmformulaswwds_26_tfforrelban ,
                                              AV224Tmformulaswwds_27_tfforrelban_to ,
                                              A485ForFec ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A494ForSer ,
                                              A5742ForSerDsc ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              A1191ForNomCli ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A832TipColDsc ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              A2838ForRelBan ,
                                              A496ForUltUti ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
         lV203Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV203Tmformulaswwds_6_tfclinom), 30, "%") ;
         lV205Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV205Tmformulaswwds_8_tfforser), 16, "%") ;
         lV207Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV207Tmformulaswwds_10_tfforserdsc), 26, "%") ;
         lV209Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV209Tmformulaswwds_12_tfforcolnom), 13, "%") ;
         lV213Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV213Tmformulaswwds_16_tffornomcli), 13, "%") ;
         lV217Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV217Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
         /* Using cursor H00R62 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV198Tmformulaswwds_1_forfec, AV199Tmformulaswwds_2_forfec_to, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV201Tmformulaswwds_4_tfclicod), Integer.valueOf(AV202Tmformulaswwds_5_tfclicod_to), lV203Tmformulaswwds_6_tfclinom, AV204Tmformulaswwds_7_tfclinom_sel, lV205Tmformulaswwds_8_tfforser, AV206Tmformulaswwds_9_tfforser_sel, lV207Tmformulaswwds_10_tfforserdsc, AV208Tmformulaswwds_11_tfforserdsc_sel, lV209Tmformulaswwds_12_tfforcolnom, AV210Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV211Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV212Tmformulaswwds_15_tfforcolnum_to), lV213Tmformulaswwds_16_tffornomcli, AV214Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV215Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV216Tmformulaswwds_19_tftipcolcod_to), lV217Tmformulaswwds_20_tftipcoldsc, AV218Tmformulaswwds_21_tftipcoldsc_sel, AV219Tmformulaswwds_22_tfforfec, AV220Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV221Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV222Tmformulaswwds_25_tffornumcol_to), AV223Tmformulaswwds_26_tfforrelban, AV224Tmformulaswwds_27_tfforrelban_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_48_idx = 1 ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4339ForRGB = H00R62_A4339ForRGB[0] ;
            n4339ForRGB = H00R62_n4339ForRGB[0] ;
            A1192ForNumCli = H00R62_A1192ForNumCli[0] ;
            n1192ForNumCli = H00R62_n1192ForNumCli[0] ;
            A2838ForRelBan = H00R62_A2838ForRelBan[0] ;
            n2838ForRelBan = H00R62_n2838ForRelBan[0] ;
            A486ForNumCol = H00R62_A486ForNumCol[0] ;
            A496ForUltUti = H00R62_A496ForUltUti[0] ;
            n496ForUltUti = H00R62_n496ForUltUti[0] ;
            A485ForFec = H00R62_A485ForFec[0] ;
            n485ForFec = H00R62_n485ForFec[0] ;
            A832TipColDsc = H00R62_A832TipColDsc[0] ;
            n832TipColDsc = H00R62_n832TipColDsc[0] ;
            A831TipColCod = H00R62_A831TipColCod[0] ;
            A1191ForNomCli = H00R62_A1191ForNomCli[0] ;
            n1191ForNomCli = H00R62_n1191ForNomCli[0] ;
            A483ForColNum = H00R62_A483ForColNum[0] ;
            A482ForColNom = H00R62_A482ForColNom[0] ;
            A5742ForSerDsc = H00R62_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H00R62_n5742ForSerDsc[0] ;
            A494ForSer = H00R62_A494ForSer[0] ;
            A279CliNom = H00R62_A279CliNom[0] ;
            A252CliCod = H00R62_A252CliCod[0] ;
            A279CliNom = H00R62_A279CliNom[0] ;
            A832TipColDsc = H00R62_A832TipColDsc[0] ;
            n832TipColDsc = H00R62_n832TipColDsc[0] ;
            e30R62 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(48) ;
         wbR60( ) ;
      }
      bGXsfl_48_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesR62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV225Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV179SiRGB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV179SiRGB), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTUTEX", GXutil.ltrim( localUtil.ntoc( AV167Tintutex, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTUTEX", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV167Tintutex), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV177UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177UsurCod, "@!"))));
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
      AV198Tmformulaswwds_1_forfec = AV138ForFec ;
      AV199Tmformulaswwds_2_forfec_to = AV139ForFec_To ;
      AV200Tmformulaswwds_3_filterfulltext = AV180FilterFullText ;
      AV201Tmformulaswwds_4_tfclicod = AV61TFCliCod ;
      AV202Tmformulaswwds_5_tfclicod_to = AV62TFCliCod_To ;
      AV203Tmformulaswwds_6_tfclinom = AV64TFCliNom ;
      AV204Tmformulaswwds_7_tfclinom_sel = AV65TFCliNom_Sel ;
      AV205Tmformulaswwds_8_tfforser = AV67TFForSer ;
      AV206Tmformulaswwds_9_tfforser_sel = AV68TFForSer_Sel ;
      AV207Tmformulaswwds_10_tfforserdsc = AV70TFForSerDsc ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = AV71TFForSerDsc_Sel ;
      AV209Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV211Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV212Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV213Tmformulaswwds_16_tffornomcli = AV121TFForNomCli ;
      AV214Tmformulaswwds_17_tffornomcli_sel = AV122TFForNomCli_Sel ;
      AV215Tmformulaswwds_18_tftipcolcod = AV79TFTipColCod ;
      AV216Tmformulaswwds_19_tftipcolcod_to = AV80TFTipColCod_To ;
      AV217Tmformulaswwds_20_tftipcoldsc = AV82TFTipColDsc ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = AV83TFTipColDsc_Sel ;
      AV219Tmformulaswwds_22_tfforfec = AV141TFForFec ;
      AV220Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV221Tmformulaswwds_24_tffornumcol = AV151TFForNumCol ;
      AV222Tmformulaswwds_25_tffornumcol_to = AV152TFForNumCol_To ;
      AV223Tmformulaswwds_26_tfforrelban = AV172TFForRelBan ;
      AV224Tmformulaswwds_27_tfforrelban_to = AV173TFForRelBan_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV198Tmformulaswwds_1_forfec ,
                                           AV199Tmformulaswwds_2_forfec_to ,
                                           AV200Tmformulaswwds_3_filterfulltext ,
                                           Integer.valueOf(AV201Tmformulaswwds_4_tfclicod) ,
                                           Integer.valueOf(AV202Tmformulaswwds_5_tfclicod_to) ,
                                           AV204Tmformulaswwds_7_tfclinom_sel ,
                                           AV203Tmformulaswwds_6_tfclinom ,
                                           AV206Tmformulaswwds_9_tfforser_sel ,
                                           AV205Tmformulaswwds_8_tfforser ,
                                           AV208Tmformulaswwds_11_tfforserdsc_sel ,
                                           AV207Tmformulaswwds_10_tfforserdsc ,
                                           AV210Tmformulaswwds_13_tfforcolnom_sel ,
                                           AV209Tmformulaswwds_12_tfforcolnom ,
                                           Integer.valueOf(AV211Tmformulaswwds_14_tfforcolnum) ,
                                           Integer.valueOf(AV212Tmformulaswwds_15_tfforcolnum_to) ,
                                           AV214Tmformulaswwds_17_tffornomcli_sel ,
                                           AV213Tmformulaswwds_16_tffornomcli ,
                                           Byte.valueOf(AV215Tmformulaswwds_18_tftipcolcod) ,
                                           Byte.valueOf(AV216Tmformulaswwds_19_tftipcolcod_to) ,
                                           AV218Tmformulaswwds_21_tftipcoldsc_sel ,
                                           AV217Tmformulaswwds_20_tftipcoldsc ,
                                           AV219Tmformulaswwds_22_tfforfec ,
                                           AV220Tmformulaswwds_23_tfforultuti ,
                                           Integer.valueOf(AV221Tmformulaswwds_24_tffornumcol) ,
                                           Integer.valueOf(AV222Tmformulaswwds_25_tffornumcol_to) ,
                                           AV223Tmformulaswwds_26_tfforrelban ,
                                           AV224Tmformulaswwds_27_tfforrelban_to ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A2838ForRelBan ,
                                           A496ForUltUti ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV200Tmformulaswwds_3_filterfulltext = GXutil.concat( GXutil.rtrim( AV200Tmformulaswwds_3_filterfulltext), "%", "") ;
      lV203Tmformulaswwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV203Tmformulaswwds_6_tfclinom), 30, "%") ;
      lV205Tmformulaswwds_8_tfforser = GXutil.padr( GXutil.rtrim( AV205Tmformulaswwds_8_tfforser), 16, "%") ;
      lV207Tmformulaswwds_10_tfforserdsc = GXutil.padr( GXutil.rtrim( AV207Tmformulaswwds_10_tfforserdsc), 26, "%") ;
      lV209Tmformulaswwds_12_tfforcolnom = GXutil.padr( GXutil.rtrim( AV209Tmformulaswwds_12_tfforcolnom), 13, "%") ;
      lV213Tmformulaswwds_16_tffornomcli = GXutil.padr( GXutil.rtrim( AV213Tmformulaswwds_16_tffornomcli), 13, "%") ;
      lV217Tmformulaswwds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV217Tmformulaswwds_20_tftipcoldsc), 30, "%") ;
      /* Using cursor H00R63 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV198Tmformulaswwds_1_forfec, AV199Tmformulaswwds_2_forfec_to, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, lV200Tmformulaswwds_3_filterfulltext, Integer.valueOf(AV201Tmformulaswwds_4_tfclicod), Integer.valueOf(AV202Tmformulaswwds_5_tfclicod_to), lV203Tmformulaswwds_6_tfclinom, AV204Tmformulaswwds_7_tfclinom_sel, lV205Tmformulaswwds_8_tfforser, AV206Tmformulaswwds_9_tfforser_sel, lV207Tmformulaswwds_10_tfforserdsc, AV208Tmformulaswwds_11_tfforserdsc_sel, lV209Tmformulaswwds_12_tfforcolnom, AV210Tmformulaswwds_13_tfforcolnom_sel, Integer.valueOf(AV211Tmformulaswwds_14_tfforcolnum), Integer.valueOf(AV212Tmformulaswwds_15_tfforcolnum_to), lV213Tmformulaswwds_16_tffornomcli, AV214Tmformulaswwds_17_tffornomcli_sel, Byte.valueOf(AV215Tmformulaswwds_18_tftipcolcod), Byte.valueOf(AV216Tmformulaswwds_19_tftipcolcod_to), lV217Tmformulaswwds_20_tftipcoldsc, AV218Tmformulaswwds_21_tftipcoldsc_sel, AV219Tmformulaswwds_22_tfforfec, AV220Tmformulaswwds_23_tfforultuti, Integer.valueOf(AV221Tmformulaswwds_24_tffornumcol), Integer.valueOf(AV222Tmformulaswwds_25_tffornumcol_to), AV223Tmformulaswwds_26_tfforrelban, AV224Tmformulaswwds_27_tfforrelban_to});
      GRID_nRecordCount = H00R63_AGRID_nRecordCount[0] ;
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
      AV198Tmformulaswwds_1_forfec = AV138ForFec ;
      AV199Tmformulaswwds_2_forfec_to = AV139ForFec_To ;
      AV200Tmformulaswwds_3_filterfulltext = AV180FilterFullText ;
      AV201Tmformulaswwds_4_tfclicod = AV61TFCliCod ;
      AV202Tmformulaswwds_5_tfclicod_to = AV62TFCliCod_To ;
      AV203Tmformulaswwds_6_tfclinom = AV64TFCliNom ;
      AV204Tmformulaswwds_7_tfclinom_sel = AV65TFCliNom_Sel ;
      AV205Tmformulaswwds_8_tfforser = AV67TFForSer ;
      AV206Tmformulaswwds_9_tfforser_sel = AV68TFForSer_Sel ;
      AV207Tmformulaswwds_10_tfforserdsc = AV70TFForSerDsc ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = AV71TFForSerDsc_Sel ;
      AV209Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV211Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV212Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV213Tmformulaswwds_16_tffornomcli = AV121TFForNomCli ;
      AV214Tmformulaswwds_17_tffornomcli_sel = AV122TFForNomCli_Sel ;
      AV215Tmformulaswwds_18_tftipcolcod = AV79TFTipColCod ;
      AV216Tmformulaswwds_19_tftipcolcod_to = AV80TFTipColCod_To ;
      AV217Tmformulaswwds_20_tftipcoldsc = AV82TFTipColDsc ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = AV83TFTipColDsc_Sel ;
      AV219Tmformulaswwds_22_tfforfec = AV141TFForFec ;
      AV220Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV221Tmformulaswwds_24_tffornumcol = AV151TFForNumCol ;
      AV222Tmformulaswwds_25_tffornumcol_to = AV152TFForNumCol_To ;
      AV223Tmformulaswwds_26_tfforrelban = AV172TFForRelBan ;
      AV224Tmformulaswwds_27_tfforrelban_to = AV173TFForRelBan_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV180FilterFullText, AV138ForFec, A396EmprCod, AV59ManageFiltersExecutionStep, AV54ColumnsSelector, AV139ForFec_To, AV61TFCliCod, AV62TFCliCod_To, AV64TFCliNom, AV65TFCliNom_Sel, AV67TFForSer, AV68TFForSer_Sel, AV70TFForSerDsc, AV71TFForSerDsc_Sel, AV73TFForColNom, AV74TFForColNom_Sel, AV76TFForColNum, AV77TFForColNum_To, AV121TFForNomCli, AV122TFForNomCli_Sel, AV79TFTipColCod, AV80TFTipColCod_To, AV82TFTipColDsc, AV83TFTipColDsc_Sel, AV141TFForFec, AV146TFForUltUti, AV151TFForNumCol, AV152TFForNumCol_To, AV172TFForRelBan, AV173TFForRelBan_To, AV225Pgmname, AV13OrderedBy, AV14OrderedDsc, AV179SiRGB, AV167Tintutex, AV177UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV198Tmformulaswwds_1_forfec = AV138ForFec ;
      AV199Tmformulaswwds_2_forfec_to = AV139ForFec_To ;
      AV200Tmformulaswwds_3_filterfulltext = AV180FilterFullText ;
      AV201Tmformulaswwds_4_tfclicod = AV61TFCliCod ;
      AV202Tmformulaswwds_5_tfclicod_to = AV62TFCliCod_To ;
      AV203Tmformulaswwds_6_tfclinom = AV64TFCliNom ;
      AV204Tmformulaswwds_7_tfclinom_sel = AV65TFCliNom_Sel ;
      AV205Tmformulaswwds_8_tfforser = AV67TFForSer ;
      AV206Tmformulaswwds_9_tfforser_sel = AV68TFForSer_Sel ;
      AV207Tmformulaswwds_10_tfforserdsc = AV70TFForSerDsc ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = AV71TFForSerDsc_Sel ;
      AV209Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV211Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV212Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV213Tmformulaswwds_16_tffornomcli = AV121TFForNomCli ;
      AV214Tmformulaswwds_17_tffornomcli_sel = AV122TFForNomCli_Sel ;
      AV215Tmformulaswwds_18_tftipcolcod = AV79TFTipColCod ;
      AV216Tmformulaswwds_19_tftipcolcod_to = AV80TFTipColCod_To ;
      AV217Tmformulaswwds_20_tftipcoldsc = AV82TFTipColDsc ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = AV83TFTipColDsc_Sel ;
      AV219Tmformulaswwds_22_tfforfec = AV141TFForFec ;
      AV220Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV221Tmformulaswwds_24_tffornumcol = AV151TFForNumCol ;
      AV222Tmformulaswwds_25_tffornumcol_to = AV152TFForNumCol_To ;
      AV223Tmformulaswwds_26_tfforrelban = AV172TFForRelBan ;
      AV224Tmformulaswwds_27_tfforrelban_to = AV173TFForRelBan_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV180FilterFullText, AV138ForFec, A396EmprCod, AV59ManageFiltersExecutionStep, AV54ColumnsSelector, AV139ForFec_To, AV61TFCliCod, AV62TFCliCod_To, AV64TFCliNom, AV65TFCliNom_Sel, AV67TFForSer, AV68TFForSer_Sel, AV70TFForSerDsc, AV71TFForSerDsc_Sel, AV73TFForColNom, AV74TFForColNom_Sel, AV76TFForColNum, AV77TFForColNum_To, AV121TFForNomCli, AV122TFForNomCli_Sel, AV79TFTipColCod, AV80TFTipColCod_To, AV82TFTipColDsc, AV83TFTipColDsc_Sel, AV141TFForFec, AV146TFForUltUti, AV151TFForNumCol, AV152TFForNumCol_To, AV172TFForRelBan, AV173TFForRelBan_To, AV225Pgmname, AV13OrderedBy, AV14OrderedDsc, AV179SiRGB, AV167Tintutex, AV177UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV198Tmformulaswwds_1_forfec = AV138ForFec ;
      AV199Tmformulaswwds_2_forfec_to = AV139ForFec_To ;
      AV200Tmformulaswwds_3_filterfulltext = AV180FilterFullText ;
      AV201Tmformulaswwds_4_tfclicod = AV61TFCliCod ;
      AV202Tmformulaswwds_5_tfclicod_to = AV62TFCliCod_To ;
      AV203Tmformulaswwds_6_tfclinom = AV64TFCliNom ;
      AV204Tmformulaswwds_7_tfclinom_sel = AV65TFCliNom_Sel ;
      AV205Tmformulaswwds_8_tfforser = AV67TFForSer ;
      AV206Tmformulaswwds_9_tfforser_sel = AV68TFForSer_Sel ;
      AV207Tmformulaswwds_10_tfforserdsc = AV70TFForSerDsc ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = AV71TFForSerDsc_Sel ;
      AV209Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV211Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV212Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV213Tmformulaswwds_16_tffornomcli = AV121TFForNomCli ;
      AV214Tmformulaswwds_17_tffornomcli_sel = AV122TFForNomCli_Sel ;
      AV215Tmformulaswwds_18_tftipcolcod = AV79TFTipColCod ;
      AV216Tmformulaswwds_19_tftipcolcod_to = AV80TFTipColCod_To ;
      AV217Tmformulaswwds_20_tftipcoldsc = AV82TFTipColDsc ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = AV83TFTipColDsc_Sel ;
      AV219Tmformulaswwds_22_tfforfec = AV141TFForFec ;
      AV220Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV221Tmformulaswwds_24_tffornumcol = AV151TFForNumCol ;
      AV222Tmformulaswwds_25_tffornumcol_to = AV152TFForNumCol_To ;
      AV223Tmformulaswwds_26_tfforrelban = AV172TFForRelBan ;
      AV224Tmformulaswwds_27_tfforrelban_to = AV173TFForRelBan_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV180FilterFullText, AV138ForFec, A396EmprCod, AV59ManageFiltersExecutionStep, AV54ColumnsSelector, AV139ForFec_To, AV61TFCliCod, AV62TFCliCod_To, AV64TFCliNom, AV65TFCliNom_Sel, AV67TFForSer, AV68TFForSer_Sel, AV70TFForSerDsc, AV71TFForSerDsc_Sel, AV73TFForColNom, AV74TFForColNom_Sel, AV76TFForColNum, AV77TFForColNum_To, AV121TFForNomCli, AV122TFForNomCli_Sel, AV79TFTipColCod, AV80TFTipColCod_To, AV82TFTipColDsc, AV83TFTipColDsc_Sel, AV141TFForFec, AV146TFForUltUti, AV151TFForNumCol, AV152TFForNumCol_To, AV172TFForRelBan, AV173TFForRelBan_To, AV225Pgmname, AV13OrderedBy, AV14OrderedDsc, AV179SiRGB, AV167Tintutex, AV177UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV198Tmformulaswwds_1_forfec = AV138ForFec ;
      AV199Tmformulaswwds_2_forfec_to = AV139ForFec_To ;
      AV200Tmformulaswwds_3_filterfulltext = AV180FilterFullText ;
      AV201Tmformulaswwds_4_tfclicod = AV61TFCliCod ;
      AV202Tmformulaswwds_5_tfclicod_to = AV62TFCliCod_To ;
      AV203Tmformulaswwds_6_tfclinom = AV64TFCliNom ;
      AV204Tmformulaswwds_7_tfclinom_sel = AV65TFCliNom_Sel ;
      AV205Tmformulaswwds_8_tfforser = AV67TFForSer ;
      AV206Tmformulaswwds_9_tfforser_sel = AV68TFForSer_Sel ;
      AV207Tmformulaswwds_10_tfforserdsc = AV70TFForSerDsc ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = AV71TFForSerDsc_Sel ;
      AV209Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV211Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV212Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV213Tmformulaswwds_16_tffornomcli = AV121TFForNomCli ;
      AV214Tmformulaswwds_17_tffornomcli_sel = AV122TFForNomCli_Sel ;
      AV215Tmformulaswwds_18_tftipcolcod = AV79TFTipColCod ;
      AV216Tmformulaswwds_19_tftipcolcod_to = AV80TFTipColCod_To ;
      AV217Tmformulaswwds_20_tftipcoldsc = AV82TFTipColDsc ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = AV83TFTipColDsc_Sel ;
      AV219Tmformulaswwds_22_tfforfec = AV141TFForFec ;
      AV220Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV221Tmformulaswwds_24_tffornumcol = AV151TFForNumCol ;
      AV222Tmformulaswwds_25_tffornumcol_to = AV152TFForNumCol_To ;
      AV223Tmformulaswwds_26_tfforrelban = AV172TFForRelBan ;
      AV224Tmformulaswwds_27_tfforrelban_to = AV173TFForRelBan_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV180FilterFullText, AV138ForFec, A396EmprCod, AV59ManageFiltersExecutionStep, AV54ColumnsSelector, AV139ForFec_To, AV61TFCliCod, AV62TFCliCod_To, AV64TFCliNom, AV65TFCliNom_Sel, AV67TFForSer, AV68TFForSer_Sel, AV70TFForSerDsc, AV71TFForSerDsc_Sel, AV73TFForColNom, AV74TFForColNom_Sel, AV76TFForColNum, AV77TFForColNum_To, AV121TFForNomCli, AV122TFForNomCli_Sel, AV79TFTipColCod, AV80TFTipColCod_To, AV82TFTipColDsc, AV83TFTipColDsc_Sel, AV141TFForFec, AV146TFForUltUti, AV151TFForNumCol, AV152TFForNumCol_To, AV172TFForRelBan, AV173TFForRelBan_To, AV225Pgmname, AV13OrderedBy, AV14OrderedDsc, AV179SiRGB, AV167Tintutex, AV177UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV198Tmformulaswwds_1_forfec = AV138ForFec ;
      AV199Tmformulaswwds_2_forfec_to = AV139ForFec_To ;
      AV200Tmformulaswwds_3_filterfulltext = AV180FilterFullText ;
      AV201Tmformulaswwds_4_tfclicod = AV61TFCliCod ;
      AV202Tmformulaswwds_5_tfclicod_to = AV62TFCliCod_To ;
      AV203Tmformulaswwds_6_tfclinom = AV64TFCliNom ;
      AV204Tmformulaswwds_7_tfclinom_sel = AV65TFCliNom_Sel ;
      AV205Tmformulaswwds_8_tfforser = AV67TFForSer ;
      AV206Tmformulaswwds_9_tfforser_sel = AV68TFForSer_Sel ;
      AV207Tmformulaswwds_10_tfforserdsc = AV70TFForSerDsc ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = AV71TFForSerDsc_Sel ;
      AV209Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV211Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV212Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV213Tmformulaswwds_16_tffornomcli = AV121TFForNomCli ;
      AV214Tmformulaswwds_17_tffornomcli_sel = AV122TFForNomCli_Sel ;
      AV215Tmformulaswwds_18_tftipcolcod = AV79TFTipColCod ;
      AV216Tmformulaswwds_19_tftipcolcod_to = AV80TFTipColCod_To ;
      AV217Tmformulaswwds_20_tftipcoldsc = AV82TFTipColDsc ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = AV83TFTipColDsc_Sel ;
      AV219Tmformulaswwds_22_tfforfec = AV141TFForFec ;
      AV220Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV221Tmformulaswwds_24_tffornumcol = AV151TFForNumCol ;
      AV222Tmformulaswwds_25_tffornumcol_to = AV152TFForNumCol_To ;
      AV223Tmformulaswwds_26_tfforrelban = AV172TFForRelBan ;
      AV224Tmformulaswwds_27_tfforrelban_to = AV173TFForRelBan_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV180FilterFullText, AV138ForFec, A396EmprCod, AV59ManageFiltersExecutionStep, AV54ColumnsSelector, AV139ForFec_To, AV61TFCliCod, AV62TFCliCod_To, AV64TFCliNom, AV65TFCliNom_Sel, AV67TFForSer, AV68TFForSer_Sel, AV70TFForSerDsc, AV71TFForSerDsc_Sel, AV73TFForColNom, AV74TFForColNom_Sel, AV76TFForColNum, AV77TFForColNum_To, AV121TFForNomCli, AV122TFForNomCli_Sel, AV79TFTipColCod, AV80TFTipColCod_To, AV82TFTipColDsc, AV83TFTipColDsc_Sel, AV141TFForFec, AV146TFForUltUti, AV151TFForNumCol, AV152TFForNumCol_To, AV172TFForRelBan, AV173TFForRelBan_To, AV225Pgmname, AV13OrderedBy, AV14OrderedDsc, AV179SiRGB, AV167Tintutex, AV177UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV225Pgmname = "TMFormulasWW" ;
      Gx_err = (short)(0) ;
      edtavVisualizar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVisualizar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVisualizar_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavModificar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModificar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModificar_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavForrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrgb_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupR60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e28R62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV57ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV130DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV54ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV132GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV133GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV138ForFec = localUtil.ctod( httpContext.cgiGet( "vFORFEC"), 0) ;
         AV139ForFec_To = localUtil.ctod( httpContext.cgiGet( "vFORFEC_TO"), 0) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
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
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
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
         Dvelop_confirmpanel_eliminarformula_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Title") ;
         Dvelop_confirmpanel_eliminarformula_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarformula_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarformula_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarformula_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarformula_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarformula_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
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
         Dvelop_confirmpanel_eliminarformula_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARFORMULA_Result") ;
         /* Read variables values. */
         AV182ForFec_RangeText = httpContext.cgiGet( edtavForfec_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV182ForFec_RangeText", AV182ForFec_RangeText);
         AV180FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV180FilterFullText", AV180FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORFECAUXDATE");
            GX_FocusControl = edtavDdo_forfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV143DDO_ForFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143DDO_ForFecAuxDate", localUtil.format(AV143DDO_ForFecAuxDate, "99/99/99"));
         }
         else
         {
            AV143DDO_ForFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143DDO_ForFecAuxDate", localUtil.format(AV143DDO_ForFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORULTUTIAUXDATE");
            GX_FocusControl = edtavDdo_forultutiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV148DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148DDO_ForUltUtiAuxDate", localUtil.format(AV148DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         else
         {
            AV148DDO_ForUltUtiAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148DDO_ForUltUtiAuxDate", localUtil.format(AV148DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_48_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
         if ( nGXsfl_48_idx > 0 )
         {
            AV193Visualizar = httpContext.cgiGet( edtavVisualizar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavVisualizar_Internalname, AV193Visualizar);
            AV191Modificar = httpContext.cgiGet( edtavModificar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavModificar_Internalname, AV191Modificar);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
            n1191ForNomCli = false ;
            A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A832TipColDsc = httpContext.cgiGet( edtTipColDsc_Internalname) ;
            n832TipColDsc = false ;
            A485ForFec = localUtil.ctod( httpContext.cgiGet( edtForFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n485ForFec = false ;
            A496ForUltUti = localUtil.ctod( httpContext.cgiGet( edtForUltUti_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n496ForUltUti = false ;
            A486ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)) ;
            n2838ForRelBan = false ;
            A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1192ForNumCli = false ;
            AV153ForRGB = localUtil.ctol( httpContext.cgiGet( edtavForrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153ForRGB), 10, 0));
            AV158R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV158R), 3, 0));
            AV156G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156G), 3, 0));
            AV154B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154B), 3, 0));
            AV159R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV159R2), 3, 0));
            AV157G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157G2), 3, 0));
            AV155B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155B2), 3, 0));
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV180FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vFORFEC"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV138ForFec)) ) )
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
      e28R62 ();
      if (returnInSub) return;
   }

   public void e28R62( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV139ForFec_To = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139ForFec_To", localUtil.format(AV139ForFec_To, "99/99/99"));
      GXt_char1 = AV174Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmformulasww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV174Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV174Station", AV174Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV176EmprNom ;
      GXv_char4[0] = AV177UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV174Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmformulasww_impl.this.A396EmprCod = GXv_char2[0] ;
      tmformulasww_impl.this.AV176EmprNom = GXv_char3[0] ;
      tmformulasww_impl.this.AV177UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV177UsurCod", AV177UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177UsurCod, "@!"))));
      GXt_int5 = (byte)(AV179SiRGB) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIFRGB", ""), GXv_int6) ;
      tmformulasww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV179SiRGB = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV179SiRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV179SiRGB), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV179SiRGB), "ZZZ9")));
      AV138ForFec = GXutil.dadd(GXutil.today( ),-(365)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138ForFec", localUtil.format(AV138ForFec, "99/99/99"));
      AV139ForFec_To = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139ForFec_To", localUtil.format(AV139ForFec_To, "99/99/99"));
      GXt_char1 = AV174Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmformulasww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV174Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV174Station", AV174Station);
      GXv_char4[0] = AV197Emprcod ;
      GXv_char3[0] = AV176EmprNom ;
      GXv_char2[0] = AV177UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV174Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmformulasww_impl.this.AV197Emprcod = GXv_char4[0] ;
      tmformulasww_impl.this.AV176EmprNom = GXv_char3[0] ;
      tmformulasww_impl.this.AV177UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV177UsurCod", AV177UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177UsurCod, "@!"))));
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
      this.executeUsercontrolMethod("", false, "FORFEC_RANGEPICKERContainer", "Attach", "", new Object[] {edtavForfec_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento de Formulas", "") );
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
         AV14OrderedDsc = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcproductosformula = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcproductosformula_Component), GXutil.lower( "WCProductosFormula")) != 0 )
      {
         WebComp_Wcwcproductosformula = WebUtils.getWebComponent(getClass(), "app.wcproductosformula_impl", remoteHandle, context);
         WebComp_Wcwcproductosformula_Component = "WCProductosFormula" ;
      }
      if ( GXutil.len( WebComp_Wcwcproductosformula_Component) != 0 )
      {
         WebComp_Wcwcproductosformula.setjustcreated();
         WebComp_Wcwcproductosformula.componentprepare(new Object[] {"W0126","",A396EmprCod,Integer.valueOf(A486ForNumCol)});
         WebComp_Wcwcproductosformula.componentbind(new Object[] {"",""});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwccolorantesformula = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwccolorantesformula_Component), GXutil.lower( "FormulacionTinte.WCColorantesFormula")) != 0 )
      {
         WebComp_Wcwccolorantesformula = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.wccolorantesformula_impl", remoteHandle, context);
         WebComp_Wcwccolorantesformula_Component = "FormulacionTinte.WCColorantesFormula" ;
      }
      if ( GXutil.len( WebComp_Wcwccolorantesformula_Component) != 0 )
      {
         WebComp_Wcwccolorantesformula.setjustcreated();
         WebComp_Wcwccolorantesformula.componentprepare(new Object[] {"W0118","",A396EmprCod,Integer.valueOf(A486ForNumCol)});
         WebComp_Wcwccolorantesformula.componentbind(new Object[] {"",""});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcprocesosformula = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcprocesosformula_Component), GXutil.lower( "FormulacionTinte.WCProcesosFormula")) != 0 )
      {
         WebComp_Wcwcprocesosformula = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.wcprocesosformula_impl", remoteHandle, context);
         WebComp_Wcwcprocesosformula_Component = "FormulacionTinte.WCProcesosFormula" ;
      }
      if ( GXutil.len( WebComp_Wcwcprocesosformula_Component) != 0 )
      {
         WebComp_Wcwcprocesosformula.setjustcreated();
         WebComp_Wcwcprocesosformula.componentprepare(new Object[] {"W0110","",A396EmprCod,Integer.valueOf(A252CliCod),A494ForSer,A482ForColNom,Integer.valueOf(A483ForColNum),Byte.valueOf(A831TipColCod)});
         WebComp_Wcwcprocesosformula.componentbind(new Object[] {"","","","","",""});
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV130DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV130DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e29R62( )
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
      if ( AV59ManageFiltersExecutionStep == 1 )
      {
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV59ManageFiltersExecutionStep == 2 )
      {
         AV59ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV56Session.getValue("TMFormulasWWColumnsSelector"), "") != 0 )
      {
         AV52ColumnsSelectorXML = AV56Session.getValue("TMFormulasWWColumnsSelector") ;
         AV54ColumnsSelector.fromxml(AV52ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtTipColDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFec_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForUltUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltUti_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForNumCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtForRelBan_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV54ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForRelBan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForRelBan_Visible), 5, 0), !bGXsfl_48_Refreshing);
      AV132GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV132GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV132GridCurrentPage), 10, 0));
      AV133GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV133GridPageCount), 10, 0));
      AV198Tmformulaswwds_1_forfec = AV138ForFec ;
      AV199Tmformulaswwds_2_forfec_to = AV139ForFec_To ;
      AV200Tmformulaswwds_3_filterfulltext = AV180FilterFullText ;
      AV201Tmformulaswwds_4_tfclicod = AV61TFCliCod ;
      AV202Tmformulaswwds_5_tfclicod_to = AV62TFCliCod_To ;
      AV203Tmformulaswwds_6_tfclinom = AV64TFCliNom ;
      AV204Tmformulaswwds_7_tfclinom_sel = AV65TFCliNom_Sel ;
      AV205Tmformulaswwds_8_tfforser = AV67TFForSer ;
      AV206Tmformulaswwds_9_tfforser_sel = AV68TFForSer_Sel ;
      AV207Tmformulaswwds_10_tfforserdsc = AV70TFForSerDsc ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = AV71TFForSerDsc_Sel ;
      AV209Tmformulaswwds_12_tfforcolnom = AV73TFForColNom ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = AV74TFForColNom_Sel ;
      AV211Tmformulaswwds_14_tfforcolnum = AV76TFForColNum ;
      AV212Tmformulaswwds_15_tfforcolnum_to = AV77TFForColNum_To ;
      AV213Tmformulaswwds_16_tffornomcli = AV121TFForNomCli ;
      AV214Tmformulaswwds_17_tffornomcli_sel = AV122TFForNomCli_Sel ;
      AV215Tmformulaswwds_18_tftipcolcod = AV79TFTipColCod ;
      AV216Tmformulaswwds_19_tftipcolcod_to = AV80TFTipColCod_To ;
      AV217Tmformulaswwds_20_tftipcoldsc = AV82TFTipColDsc ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = AV83TFTipColDsc_Sel ;
      AV219Tmformulaswwds_22_tfforfec = AV141TFForFec ;
      AV220Tmformulaswwds_23_tfforultuti = AV146TFForUltUti ;
      AV221Tmformulaswwds_24_tffornumcol = AV151TFForNumCol ;
      AV222Tmformulaswwds_25_tffornumcol_to = AV152TFForNumCol_To ;
      AV223Tmformulaswwds_26_tfforrelban = AV172TFForRelBan ;
      AV224Tmformulaswwds_27_tfforrelban_to = AV173TFForRelBan_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ColumnsSelector", AV54ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e14R62( )
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
         AV131PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV131PageToGo) ;
      }
   }

   public void e15R62( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e17R62( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV61TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFCliCod), 6, 0));
            AV62TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV64TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliNom", AV64TFCliNom);
            AV65TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliNom_Sel", AV65TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV67TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFForSer", AV67TFForSer);
            AV68TFForSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFForSer_Sel", AV68TFForSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV70TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFForSerDsc", AV70TFForSerDsc);
            AV71TFForSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFForSerDsc_Sel", AV71TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV73TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFForColNom", AV73TFForColNom);
            AV74TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFForColNom_Sel", AV74TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV76TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFForColNum), 6, 0));
            AV77TFForColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNomCli") == 0 )
         {
            AV121TFForNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFForNomCli", AV121TFForNomCli);
            AV122TFForNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFForNomCli_Sel", AV122TFForNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV79TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFTipColCod), 2, 0));
            AV80TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColDsc") == 0 )
         {
            AV82TFTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFTipColDsc", AV82TFTipColDsc);
            AV83TFTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFTipColDsc_Sel", AV83TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForFec") == 0 )
         {
            AV141TFForFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV141TFForFec", localUtil.format(AV141TFForFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForUltUti") == 0 )
         {
            AV146TFForUltUti = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFForUltUti", localUtil.format(AV146TFForUltUti, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumCol") == 0 )
         {
            AV151TFForNumCol = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151TFForNumCol), 8, 0));
            AV152TFForNumCol_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForRelBan") == 0 )
         {
            AV172TFForRelBan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172TFForRelBan", GXutil.ltrimstr( AV172TFForRelBan, 7, 2));
            AV173TFForRelBan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV173TFForRelBan_To", GXutil.ltrimstr( AV173TFForRelBan_To, 7, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e30R62( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV193Visualizar = "<i class=\"fa fa-search\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavVisualizar_Internalname, AV193Visualizar);
      edtavVisualizar_Link = formatLink("app.tmformulas", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "DSP", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"})  ;
      AV191Modificar = "<i class=\"fa fa-pen\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavModificar_Internalname, AV191Modificar);
      edtavModificar_Link = formatLink("app.tmformulas", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"})  ;
      AV153ForRGB = ((A4339ForRGB==0) ? 65793 : A4339ForRGB) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavForrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV153ForRGB), 10, 0));
      GXv_int10[0] = AV158R ;
      GXv_int11[0] = AV156G ;
      GXv_int12[0] = AV154B ;
      GXv_int13[0] = AV159R2 ;
      GXv_int14[0] = AV157G2 ;
      GXv_int15[0] = AV155B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV153ForRGB, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15) ;
      tmformulasww_impl.this.AV158R = GXv_int10[0] ;
      tmformulasww_impl.this.AV156G = GXv_int11[0] ;
      tmformulasww_impl.this.AV154B = GXv_int12[0] ;
      tmformulasww_impl.this.AV159R2 = GXv_int13[0] ;
      tmformulasww_impl.this.AV157G2 = GXv_int14[0] ;
      tmformulasww_impl.this.AV155B2 = GXv_int15[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV158R), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV156G), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV154B), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV159R2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV157G2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV155B2), 3, 0));
      if ( AV179SiRGB == 1 )
      {
         edtForNomCli_Backcolor = GXutil.getColor( AV158R, AV156G, AV154B) ;
         edtForNomCli_Forecolor = GXutil.getColor( AV159R2, AV157G2, AV155B2) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(48) ;
      }
      sendrow_482( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_48_Refreshing )
      {
         httpContext.doAjaxLoad(48, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e18R62( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV52ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV54ColumnsSelector.fromJSonString(AV52ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TMFormulasWWColumnsSelector", ((GXutil.strcmp("", AV52ColumnsSelectorXML)==0) ? "" : AV54ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ColumnsSelector", AV54ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e13R62( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TMFormulasWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV225Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TMFormulasWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV59ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ManageFiltersExecutionStep", GXutil.str( AV59ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV58ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TMFormulasWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmformulasww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV58ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV58ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV225Pgmname+"GridState", AV58ManageFiltersXml) ;
            AV10GridState.fromxml(AV58ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ColumnsSelector", AV54ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
   }

   public void e20R62( )
   {
      /* 'DoRecetaColor' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int16[0] = A252CliCod ;
      GXv_char3[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int17[0] = A483ForColNum ;
      GXv_int6[0] = A831TipColCod ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int19[0] = (int)(DecimalUtil.decToDouble(A2838ForRelBan)) ;
      GXv_char20[0] = " " ;
      GXv_decimal21[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int16, GXv_char3, GXv_char2, GXv_int17, GXv_int6, GXv_decimal18, GXv_int19, GXv_char20, GXv_decimal21) ;
      tmformulasww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmformulasww_impl.this.A252CliCod = GXv_int16[0] ;
      tmformulasww_impl.this.A494ForSer = GXv_char3[0] ;
      tmformulasww_impl.this.A482ForColNom = GXv_char2[0] ;
      tmformulasww_impl.this.A483ForColNum = GXv_int17[0] ;
      tmformulasww_impl.this.A831TipColCod = GXv_int6[0] ;
      tmformulasww_impl.this.A2838ForRelBan = DecimalUtil.doubleToDec(GXv_int19[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXv_char20[0] = A396EmprCod ;
      GXv_char4[0] = AV174Station ;
      GXv_decimal21[0] = AV168Valor_cor ;
      new app.pvercoste(remoteHandle, context).execute( GXv_char20, GXv_char4, GXv_decimal21) ;
      tmformulasww_impl.this.A396EmprCod = GXv_char20[0] ;
      tmformulasww_impl.this.AV174Station = GXv_char4[0] ;
      tmformulasww_impl.this.AV168Valor_cor = GXv_decimal21[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV174Station", AV174Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV168Valor_cor", GXutil.ltrimstr( AV168Valor_cor, 11, 5));
      if ( AV167Tintutex == 0 )
      {
         httpContext.popup(formatLink("app.pverrecetacolor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV174Station)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV168Valor_cor))}, new String[] {"EmprCod","Station","CliCod","ForSer","ForColNom","ForColNum","TipColCod","valor"}) , new Object[] {"A396EmprCod","AV174Station","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","AV168Valor_cor"});
      }
      else
      {
         httpContext.popup(formatLink("app.pverreccost", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV174Station)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV168Valor_cor))}, new String[] {"EmprCod","Station","CliCod","ForSer","ForColNom","ForColNum","TipColCod","valor"}) , new Object[] {"A396EmprCod","AV174Station","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","AV168Valor_cor"});
      }
      /*  Sending Event outputs  */
   }

   public void e21R62( )
   {
      /* 'DoVerformula' Routine */
      returnInSub = false ;
      GXv_char20[0] = A396EmprCod ;
      GXv_int19[0] = A252CliCod ;
      GXv_char4[0] = A494ForSer ;
      GXv_char3[0] = A482ForColNom ;
      GXv_int17[0] = A483ForColNum ;
      GXv_int6[0] = A831TipColCod ;
      GXv_decimal21[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int16[0] = (int)(DecimalUtil.decToDouble(A2838ForRelBan)) ;
      GXv_char2[0] = " " ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_char4, GXv_char3, GXv_int17, GXv_int6, GXv_decimal21, GXv_int16, GXv_char2, GXv_decimal18) ;
      tmformulasww_impl.this.A396EmprCod = GXv_char20[0] ;
      tmformulasww_impl.this.A252CliCod = GXv_int19[0] ;
      tmformulasww_impl.this.A494ForSer = GXv_char4[0] ;
      tmformulasww_impl.this.A482ForColNom = GXv_char3[0] ;
      tmformulasww_impl.this.A483ForColNum = GXv_int17[0] ;
      tmformulasww_impl.this.A831TipColCod = GXv_int6[0] ;
      tmformulasww_impl.this.A2838ForRelBan = DecimalUtil.doubleToDec(GXv_int16[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.popup(formatLink("app.formulaciontinte.webverformulacompleta", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV174Station)),GXutil.URLEncode(DecimalUtil.decToString(A2838ForRelBan))}, new String[] {"Emprcod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Station","ForRelBan"}) , new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e22R62( )
   {
      /* 'DoSimulacionFormula' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.webfo0006n", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(A2838ForRelBan))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForRelBan"}) , new Object[] {"A396EmprCod","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","A2838ForRelBan"});
      GXv_char20[0] = A396EmprCod ;
      GXv_char4[0] = AV174Station ;
      new app.formulaciontinte.pkilsim(remoteHandle, context).execute( GXv_char20, GXv_char4) ;
      tmformulasww_impl.this.A396EmprCod = GXv_char20[0] ;
      tmformulasww_impl.this.AV174Station = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV174Station", AV174Station);
      /*  Sending Event outputs  */
   }

   public void e23R62( )
   {
      /* 'DoDuplicarEquivalente' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webduplicarformula", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A1191ForNomCli)),GXutil.URLEncode(GXutil.ltrimstr(A1192ForNumCli,6,0))}, new String[] {"EmprCod","CliCodOri","SerOri","ColOri","ColNumOri","TipColOri","BarNomCliO","BarNumCliO"}) , new Object[] {"A396EmprCod","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","A1191ForNomCli","A1192ForNumCli"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ColumnsSelector", AV54ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19R62( )
   {
      /* Dvelop_confirmpanel_eliminarformula_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarformula_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARFORMULA' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ColumnsSelector", AV54ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e24R62( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmformulas", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e25R62( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char20[0] = AV50ExcelFilename ;
      GXv_char4[0] = AV51ErrorMessage ;
      new app.tmformulaswwexport(remoteHandle, context).execute( GXv_char20, GXv_char4) ;
      tmformulasww_impl.this.AV50ExcelFilename = GXv_char20[0] ;
      tmformulasww_impl.this.AV51ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV50ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV50ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV51ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e26R62( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tmformulaswwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e27R62( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tmformulaswwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16R62( )
   {
      /* Forfec_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138ForFec", localUtil.format(AV138ForFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV139ForFec_To", localUtil.format(AV139ForFec_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV180FilterFullText, AV138ForFec, A396EmprCod, AV59ManageFiltersExecutionStep, AV54ColumnsSelector, AV139ForFec_To, AV61TFCliCod, AV62TFCliCod_To, AV64TFCliNom, AV65TFCliNom_Sel, AV67TFForSer, AV68TFForSer_Sel, AV70TFForSerDsc, AV71TFForSerDsc_Sel, AV73TFForColNom, AV74TFForColNom_Sel, AV76TFForColNum, AV77TFForColNum_To, AV121TFForNomCli, AV122TFForNomCli_Sel, AV79TFTipColCod, AV80TFTipColCod_To, AV82TFTipColDsc, AV83TFTipColDsc_Sel, AV141TFForFec, AV146TFForUltUti, AV151TFForNumCol, AV152TFForNumCol_To, AV172TFForRelBan, AV173TFForRelBan_To, AV225Pgmname, AV13OrderedBy, AV14OrderedDsc, AV179SiRGB, AV167Tintutex, AV177UsurCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54ColumnsSelector", AV54ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57ManageFiltersData", AV57ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
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
      AV54ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "CliCod", "", "Cliente", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "CliNom", "", "Nombre Cliente", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForSer", "", "Articulo", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForSerDsc", "", "Descripcion", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForColNom", "", "Color", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForColNum", "", "Numero", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForNomCli", "", "Color Cliente", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "TipColCod", "", "Tc", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "TipColDsc", "", "Descripcion", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForFec", "", "Fecha Formula", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForUltUti", "", "Fecha Ult Uti", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForNumCol", "", "Nº Interno F.", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXv_SdtWWPColumnsSelector22[0] = AV54ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, "ForRelBan", "", "Rb", true, "") ;
      AV54ColumnsSelector = GXv_SdtWWPColumnsSelector22[0] ;
      GXt_char1 = AV53UserCustomValue ;
      GXv_char20[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMFormulasWWColumnsSelector", GXv_char20) ;
      tmformulasww_impl.this.GXt_char1 = GXv_char20[0] ;
      AV53UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV53UserCustomValue)==0) ) )
      {
         AV55ColumnsSelectorAux.fromxml(AV53UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector22[0] = AV55ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector23[0] = AV54ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector22, GXv_SdtWWPColumnsSelector23) ;
         AV55ColumnsSelectorAux = GXv_SdtWWPColumnsSelector22[0] ;
         AV54ColumnsSelector = GXv_SdtWWPColumnsSelector23[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item24 = AV57ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item25[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item24 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TMFormulasWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item25) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item24 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item25[0] ;
      AV57ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item24 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV138ForFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138ForFec", localUtil.format(AV138ForFec, "99/99/99"));
      AV139ForFec_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139ForFec_To", localUtil.format(AV139ForFec_To, "99/99/99"));
      AV180FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV180FilterFullText", AV180FilterFullText);
      AV61TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFCliCod), 6, 0));
      AV62TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFCliCod_To), 6, 0));
      AV64TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliNom", AV64TFCliNom);
      AV65TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliNom_Sel", AV65TFCliNom_Sel);
      AV67TFForSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFForSer", AV67TFForSer);
      AV68TFForSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFForSer_Sel", AV68TFForSer_Sel);
      AV70TFForSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFForSerDsc", AV70TFForSerDsc);
      AV71TFForSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFForSerDsc_Sel", AV71TFForSerDsc_Sel);
      AV73TFForColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFForColNom", AV73TFForColNom);
      AV74TFForColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFForColNom_Sel", AV74TFForColNom_Sel);
      AV76TFForColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFForColNum), 6, 0));
      AV77TFForColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFForColNum_To), 6, 0));
      AV121TFForNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121TFForNomCli", AV121TFForNomCli);
      AV122TFForNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122TFForNomCli_Sel", AV122TFForNomCli_Sel);
      AV79TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFTipColCod), 2, 0));
      AV80TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFTipColCod_To), 2, 0));
      AV82TFTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFTipColDsc", AV82TFTipColDsc);
      AV83TFTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFTipColDsc_Sel", AV83TFTipColDsc_Sel);
      AV141TFForFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV141TFForFec", localUtil.format(AV141TFForFec, "99/99/99"));
      AV146TFForUltUti = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146TFForUltUti", localUtil.format(AV146TFForUltUti, "99/99/99"));
      AV151TFForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV151TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151TFForNumCol), 8, 0));
      AV152TFForNumCol_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152TFForNumCol_To), 8, 0));
      AV172TFForRelBan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV172TFForRelBan", GXutil.ltrimstr( AV172TFForRelBan, 7, 2));
      AV173TFForRelBan_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV173TFForRelBan_To", GXutil.ltrimstr( AV173TFForRelBan_To, 7, 2));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ACTION ELIMINARFORMULA' Routine */
      returnInSub = false ;
      GXv_char20[0] = A396EmprCod ;
      GXv_int19[0] = A252CliCod ;
      GXv_char4[0] = A494ForSer ;
      GXv_char3[0] = A482ForColNom ;
      GXv_int17[0] = A483ForColNum ;
      GXv_int6[0] = A831TipColCod ;
      GXv_int16[0] = A486ForNumCol ;
      new app.pelifor(remoteHandle, context).execute( GXv_char20, GXv_int19, GXv_char4, GXv_char3, GXv_int17, GXv_int6, GXv_int16) ;
      tmformulasww_impl.this.A396EmprCod = GXv_char20[0] ;
      tmformulasww_impl.this.A252CliCod = GXv_int19[0] ;
      tmformulasww_impl.this.A494ForSer = GXv_char4[0] ;
      tmformulasww_impl.this.A482ForColNom = GXv_char3[0] ;
      tmformulasww_impl.this.A483ForColNum = GXv_int17[0] ;
      tmformulasww_impl.this.A831TipColCod = GXv_int6[0] ;
      tmformulasww_impl.this.A486ForNumCol = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV190IncObs = httpContext.getMessage( "Formula Teñido : Artículo : ", "") + GXutil.trim( A494ForSer) + httpContext.getMessage( ", Color : ", "") + GXutil.trim( A482ForColNom) + "-" + GXutil.trim( GXutil.str( A483ForColNum, 10, 0)) + "-" + GXutil.trim( GXutil.str( A831TipColCod, 10, 0)) + httpContext.getMessage( ",Cliente : ", "") + GXutil.trim( GXutil.str( A252CliCod, 10, 0)) + httpContext.getMessage( " (Eliminado)", "") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV225Pgmname, 1, 10), AV177UsurCod, AV174Station, AV190IncObs, 99999999, (byte)(9), httpContext.getMessage( "z", "")) ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV56Session.getValue(AV225Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV225Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV56Session.getValue(AV225Pgmname+"GridState"), null, null);
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
      AV226GXV1 = 1 ;
      while ( AV226GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV226GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FORFEC") == 0 )
         {
            AV138ForFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138ForFec", localUtil.format(AV138ForFec, "99/99/99"));
            AV139ForFec_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139ForFec_To", localUtil.format(AV139ForFec_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV180FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV180FilterFullText", AV180FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV61TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFCliCod), 6, 0));
            AV62TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV64TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCliNom", AV64TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV65TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliNom_Sel", AV65TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV67TFForSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFForSer", AV67TFForSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV68TFForSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFForSer_Sel", AV68TFForSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV70TFForSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFForSerDsc", AV70TFForSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV71TFForSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFForSerDsc_Sel", AV71TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV73TFForColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFForColNom", AV73TFForColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV74TFForColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFForColNom_Sel", AV74TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV76TFForColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TFForColNum), 6, 0));
            AV77TFForColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFForColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV121TFForNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFForNomCli", AV121TFForNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV122TFForNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFForNomCli_Sel", AV122TFForNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV79TFTipColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79TFTipColCod), 2, 0));
            AV80TFTipColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV82TFTipColDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFTipColDsc", AV82TFTipColDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV83TFTipColDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFTipColDsc_Sel", AV83TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV141TFForFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV141TFForFec", localUtil.format(AV141TFForFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV146TFForUltUti = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146TFForUltUti", localUtil.format(AV146TFForUltUti, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV151TFForNumCol = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV151TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV151TFForNumCol), 8, 0));
            AV152TFForNumCol_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV152TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV172TFForRelBan = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV172TFForRelBan", GXutil.ltrimstr( AV172TFForRelBan, 7, 2));
            AV173TFForRelBan_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV173TFForRelBan_To", GXutil.ltrimstr( AV173TFForRelBan_To, 7, 2));
         }
         AV226GXV1 = (int)(AV226GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char20[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFCliNom_Sel)==0), AV65TFCliNom_Sel, GXv_char20) ;
      tmformulasww_impl.this.GXt_char1 = GXv_char20[0] ;
      GXt_char26 = "" ;
      GXv_char4[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFForSer_Sel)==0), AV68TFForSer_Sel, GXv_char4) ;
      tmformulasww_impl.this.GXt_char26 = GXv_char4[0] ;
      GXt_char27 = "" ;
      GXv_char3[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFForSerDsc_Sel)==0), AV71TFForSerDsc_Sel, GXv_char3) ;
      tmformulasww_impl.this.GXt_char27 = GXv_char3[0] ;
      GXt_char28 = "" ;
      GXv_char2[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFForColNom_Sel)==0), AV74TFForColNom_Sel, GXv_char2) ;
      tmformulasww_impl.this.GXt_char28 = GXv_char2[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV122TFForNomCli_Sel)==0), AV122TFForNomCli_Sel, GXv_char30) ;
      tmformulasww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFTipColDsc_Sel)==0), AV83TFTipColDsc_Sel, GXv_char32) ;
      tmformulasww_impl.this.GXt_char31 = GXv_char32[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char26+"|"+GXt_char27+"|"+GXt_char28+"||"+GXt_char29+"||"+GXt_char31+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFCliNom)==0), AV64TFCliNom, GXv_char32) ;
      tmformulasww_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFForSer)==0), AV67TFForSer, GXv_char30) ;
      tmformulasww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char28 = "" ;
      GXv_char20[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFForSerDsc)==0), AV70TFForSerDsc, GXv_char20) ;
      tmformulasww_impl.this.GXt_char28 = GXv_char20[0] ;
      GXt_char27 = "" ;
      GXv_char4[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFForColNom)==0), AV73TFForColNom, GXv_char4) ;
      tmformulasww_impl.this.GXt_char27 = GXv_char4[0] ;
      GXt_char26 = "" ;
      GXv_char3[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV121TFForNomCli)==0), AV121TFForNomCli, GXv_char3) ;
      tmformulasww_impl.this.GXt_char26 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFTipColDsc)==0), AV82TFTipColDsc, GXv_char2) ;
      tmformulasww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV61TFCliCod) ? "" : GXutil.str( AV61TFCliCod, 6, 0))+"|"+GXt_char31+"|"+GXt_char29+"|"+GXt_char28+"|"+GXt_char27+"|"+((0==AV76TFForColNum) ? "" : GXutil.str( AV76TFForColNum, 6, 0))+"|"+GXt_char26+"|"+((0==AV79TFTipColCod) ? "" : GXutil.str( AV79TFTipColCod, 2, 0))+"|"+GXt_char1+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141TFForFec)) ? "" : localUtil.dtoc( AV141TFForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146TFForUltUti)) ? "" : localUtil.dtoc( AV146TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV151TFForNumCol) ? "" : GXutil.str( AV151TFForNumCol, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV172TFForRelBan)==0) ? "" : GXutil.str( AV172TFForRelBan, 7, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV62TFCliCod_To) ? "" : GXutil.str( AV62TFCliCod_To, 6, 0))+"|||||"+((0==AV77TFForColNum_To) ? "" : GXutil.str( AV77TFForColNum_To, 6, 0))+"||"+((0==AV80TFTipColCod_To) ? "" : GXutil.str( AV80TFTipColCod_To, 2, 0))+"||||"+((0==AV152TFForNumCol_To) ? "" : GXutil.str( AV152TFForNumCol_To, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV173TFForRelBan_To)==0) ? "" : GXutil.str( AV173TFForRelBan_To, 7, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV56Session.getValue(AV225Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "FORFEC", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138ForFec))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV139ForFec_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV138ForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV139ForFec_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV180FilterFullText)==0), (short)(0), AV180FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLICOD", "", !((0==AV61TFCliCod)&&(0==AV62TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV61TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV62TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFCLINOM", "", !(GXutil.strcmp("", AV64TFCliNom)==0), (short)(0), AV64TFCliNom, "", !(GXutil.strcmp("", AV65TFCliNom_Sel)==0), AV65TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORSER", "", !(GXutil.strcmp("", AV67TFForSer)==0), (short)(0), AV67TFForSer, "", !(GXutil.strcmp("", AV68TFForSer_Sel)==0), AV68TFForSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORSERDSC", "", !(GXutil.strcmp("", AV70TFForSerDsc)==0), (short)(0), AV70TFForSerDsc, "", !(GXutil.strcmp("", AV71TFForSerDsc_Sel)==0), AV71TFForSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV73TFForColNom)==0), (short)(0), AV73TFForColNom, "", !(GXutil.strcmp("", AV74TFForColNom_Sel)==0), AV74TFForColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORCOLNUM", "", !((0==AV76TFForColNum)&&(0==AV77TFForColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV76TFForColNum, 6, 0)), GXutil.trim( GXutil.str( AV77TFForColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORNOMCLI", "", !(GXutil.strcmp("", AV121TFForNomCli)==0), (short)(0), AV121TFForNomCli, "", !(GXutil.strcmp("", AV122TFForNomCli_Sel)==0), AV122TFForNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFTIPCOLCOD", "", !((0==AV79TFTipColCod)&&(0==AV80TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV79TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV80TFTipColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFTIPCOLDSC", "", !(GXutil.strcmp("", AV82TFTipColDsc)==0), (short)(0), AV82TFTipColDsc, "", !(GXutil.strcmp("", AV83TFTipColDsc_Sel)==0), AV83TFTipColDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141TFForFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV141TFForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORULTUTI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146TFForUltUti)), (short)(0), GXutil.trim( localUtil.dtoc( AV146TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORNUMCOL", "", !((0==AV151TFForNumCol)&&(0==AV152TFForNumCol_To)), (short)(0), GXutil.trim( GXutil.str( AV151TFForNumCol, 8, 0)), GXutil.trim( GXutil.str( AV152TFForNumCol_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFFORRELBAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV172TFForRelBan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV173TFForRelBan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV172TFForRelBan, 7, 2)), GXutil.trim( GXutil.str( AV173TFForRelBan_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV225Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV225Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMFormulas" );
      AV56Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_134_R62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarformula_Internalname, tblTabledvelop_confirmpanel_eliminarformula_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarformula.setProperty("Title", Dvelop_confirmpanel_eliminarformula_Title);
         ucDvelop_confirmpanel_eliminarformula.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarformula_Confirmationtext);
         ucDvelop_confirmpanel_eliminarformula.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarformula_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarformula.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarformula_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarformula.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarformula_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarformula.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarformula_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarformula.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarformula_Confirmtype);
         ucDvelop_confirmpanel_eliminarformula.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarformula_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARFORMULAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARFORMULAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_134_R62e( true) ;
      }
      else
      {
         wb_table2_134_R62e( false) ;
      }
   }

   public void wb_table1_27_R62( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV57ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForfec_rangetext_Internalname, httpContext.getMessage( "For Fec_Range Text", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForfec_rangetext_Internalname, AV182ForFec_RangeText, GXutil.rtrim( localUtil.format( AV182ForFec_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavForfec_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavForfec_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV180FilterFullText, GXutil.rtrim( localUtil.format( AV180FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TMFormulasWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_R62e( true) ;
      }
      else
      {
         wb_table1_27_R62e( false) ;
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
      paR62( ) ;
      wsR62( ) ;
      weR62( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwcprocesosformula == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcprocesosformula_Component) != 0 )
         {
            WebComp_Wcwcprocesosformula.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwccolorantesformula == null ) )
      {
         if ( GXutil.len( WebComp_Wcwccolorantesformula_Component) != 0 )
         {
            WebComp_Wcwccolorantesformula.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcproductosformula == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcproductosformula_Component) != 0 )
         {
            WebComp_Wcwcproductosformula.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116124761", true, true);
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
      httpContext.AddJavascriptSource("tmformulasww.js", "?202682116124761", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_482( )
   {
      edtavVisualizar_Internalname = "vVISUALIZAR_"+sGXsfl_48_idx ;
      edtavModificar_Internalname = "vMODIFICAR_"+sGXsfl_48_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_48_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_48_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_48_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_48_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_48_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_48_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_48_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_48_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_48_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_48_idx ;
      edtForUltUti_Internalname = "FORULTUTI_"+sGXsfl_48_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_48_idx ;
      edtForRelBan_Internalname = "FORRELBAN_"+sGXsfl_48_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_48_idx ;
      edtavForrgb_Internalname = "vFORRGB_"+sGXsfl_48_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_48_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_48_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_48_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_48_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_48_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_48_idx ;
   }

   public void subsflControlProps_fel_482( )
   {
      edtavVisualizar_Internalname = "vVISUALIZAR_"+sGXsfl_48_fel_idx ;
      edtavModificar_Internalname = "vMODIFICAR_"+sGXsfl_48_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_48_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_48_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_48_fel_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_48_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_48_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_48_fel_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_48_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_48_fel_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_48_fel_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_48_fel_idx ;
      edtForUltUti_Internalname = "FORULTUTI_"+sGXsfl_48_fel_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_48_fel_idx ;
      edtForRelBan_Internalname = "FORRELBAN_"+sGXsfl_48_fel_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_48_fel_idx ;
      edtavForrgb_Internalname = "vFORRGB_"+sGXsfl_48_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_48_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_48_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_48_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_48_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_48_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_48_fel_idx ;
   }

   public void sendrow_482( )
   {
      subsflControlProps_482( ) ;
      wbR60( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_48_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_48_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_48_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVisualizar_Internalname,GXutil.rtrim( AV193Visualizar),"","","'"+""+"'"+",false,"+"'"+""+"'",edtavVisualizar_Link,"","","",edtavVisualizar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavVisualizar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavModificar_Internalname,GXutil.rtrim( AV191Modificar),"","","'"+""+"'"+",false,"+"'"+""+"'",edtavModificar_Link,"","","",edtavModificar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavModificar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForNomCli_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtForNomCli_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNomCli_Internalname,GXutil.rtrim( A1191ForNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNomCli_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtForNomCli_Forecolor)+";"+((edtForNomCli_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtForNomCli_Backcolor)+";"),ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForFec_Internalname,localUtil.format(A485ForFec, "99/99/99"),localUtil.format( A485ForFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForUltUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltUti_Internalname,localUtil.format(A496ForUltUti, "99/99/99"),localUtil.format( A496ForUltUti, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForUltUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForUltUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForNumCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCol_Internalname,GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForNumCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForRelBan_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForRelBan_Internalname,GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2838ForRelBan, "ZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForRelBan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForRelBan_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavForrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV153ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavForrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV153ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV153ForRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavForrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavForrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV158R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV158R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV158R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV156G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV156G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV156G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV154B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV154B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV154B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV159R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV159R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV159R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV157G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV157G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV157G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV155B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV155B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV155B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesR62( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_48_idx = ((subGrid_Islastpage==1)&&(nGXsfl_48_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      /* End function sendrow_482 */
   }

   public void startgridcontrol48( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"48\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForUltUti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ult Uti", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForNumCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Interno F.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForRelBan_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV193Visualizar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVisualizar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavVisualizar_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV191Modificar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavModificar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavModificar_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1191ForNomCli));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtForNomCli_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtForNomCli_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A832TipColDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipColDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A485ForFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A496ForUltUti, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForUltUti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForNumCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForRelBan_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV153ForRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavForrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV158R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV156G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV154B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV159R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV157G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV155B2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavForfec_rangetext_Internalname = "vFORFEC_RANGETEXT" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      divTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavVisualizar_Internalname = "vVISUALIZAR" ;
      edtavModificar_Internalname = "vMODIFICAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtForSer_Internalname = "FORSER" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtForNomCli_Internalname = "FORNOMCLI" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      edtForFec_Internalname = "FORFEC" ;
      edtForUltUti_Internalname = "FORULTUTI" ;
      edtForNumCol_Internalname = "FORNUMCOL" ;
      edtForRelBan_Internalname = "FORRELBAN" ;
      edtForNumCli_Internalname = "FORNUMCLI" ;
      edtavForrgb_Internalname = "vFORRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      bttBtnrecetacolor_Internalname = "BTNRECETACOLOR" ;
      bttBtnlistado_Internalname = "BTNLISTADO" ;
      bttBtnverformula_Internalname = "BTNVERFORMULA" ;
      bttBtnsimulacionformula_Internalname = "BTNSIMULACIONFORMULA" ;
      bttBtnduplicarequivalente_Internalname = "BTNDUPLICAREQUIVALENTE" ;
      bttBtneliminarformula_Internalname = "BTNELIMINARFORMULA" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblProcesosquimicos_title_Internalname = "PROCESOSQUIMICOS_TITLE" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblColorantes_title_Internalname = "COLORANTES_TITLE" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblProductos_title_Internalname = "PRODUCTOS_TITLE" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Forfec_rangepicker_Internalname = "FORFEC_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminarformula_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARFORMULA" ;
      tblTabledvelop_confirmpanel_eliminarformula_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARFORMULA" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_forfecauxdate_Internalname = "vDDO_FORFECAUXDATE" ;
      divDdo_forfecauxdates_Internalname = "DDO_FORFECAUXDATES" ;
      edtavDdo_forultutiauxdate_Internalname = "vDDO_FORULTUTIAUXDATE" ;
      divDdo_forultutiauxdates_Internalname = "DDO_FORULTUTIAUXDATES" ;
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
      edtavB2_Jsonclick = "" ;
      edtavB2_Enabled = 0 ;
      edtavG2_Jsonclick = "" ;
      edtavG2_Enabled = 0 ;
      edtavR2_Jsonclick = "" ;
      edtavR2_Enabled = 0 ;
      edtavB_Jsonclick = "" ;
      edtavB_Enabled = 0 ;
      edtavG_Jsonclick = "" ;
      edtavG_Enabled = 0 ;
      edtavR_Jsonclick = "" ;
      edtavR_Enabled = 0 ;
      edtavForrgb_Jsonclick = "" ;
      edtavForrgb_Enabled = 0 ;
      edtForNumCli_Jsonclick = "" ;
      edtForRelBan_Jsonclick = "" ;
      edtForNumCol_Jsonclick = "" ;
      edtForUltUti_Jsonclick = "" ;
      edtForFec_Jsonclick = "" ;
      edtTipColDsc_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForNomCli_Jsonclick = "" ;
      edtForNomCli_Forecolor = (int)(0x000000) ;
      edtForNomCli_Backcolor = -1 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtavModificar_Jsonclick = "" ;
      edtavModificar_Link = "" ;
      edtavModificar_Enabled = 0 ;
      edtavVisualizar_Jsonclick = "" ;
      edtavVisualizar_Link = "" ;
      edtavVisualizar_Enabled = 0 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavForfec_rangetext_Jsonclick = "" ;
      edtavForfec_rangetext_Enabled = 1 ;
      edtForRelBan_Visible = -1 ;
      edtForNumCol_Visible = -1 ;
      edtForUltUti_Visible = -1 ;
      edtForFec_Visible = -1 ;
      edtTipColDsc_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtForNomCli_Visible = -1 ;
      edtForColNum_Visible = -1 ;
      edtForColNom_Visible = -1 ;
      edtForSerDsc_Visible = -1 ;
      edtForSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_forultutiauxdate_Jsonclick = "" ;
      edtavDdo_forfecauxdate_Jsonclick = "" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminarformula_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarformula_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarformula_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarformula_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarformula_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarformula_Confirmationtext = "¿Desea eliminar la Formula?" ;
      Dvelop_confirmpanel_eliminarformula_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TMFormulasWWGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||Dynamic||||" ;
      Ddo_grid_Includedatalist = "|T|T|T|T||T||T||||" ;
      Ddo_grid_Filterisrange = "T|||||T||T||||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Character|Numeric|Character|Date|Date|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|1|11|12|13" ;
      Ddo_grid_Columnids = "2:CliCod|3:CliNom|4:ForSer|5:ForSerDsc|6:ForColNom|7:ForColNum|8:ForNomCli|9:TipColCod|10:TipColDsc|11:ForFec|12:ForUltUti|13:ForNumCol|14:ForRelBan" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Mas datos ....", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 3 ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento de Formulas", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'AV132GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV133GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e14R62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e15R62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e17R62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e30R62',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9'},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV193Visualizar',fld:'vVISUALIZAR',pic:''},{av:'edtavVisualizar_Link',ctrl:'vVISUALIZAR',prop:'Link'},{av:'AV191Modificar',fld:'vMODIFICAR',pic:''},{av:'edtavModificar_Link',ctrl:'vMODIFICAR',prop:'Link'},{av:'AV153ForRGB',fld:'vFORRGB',pic:'ZZZZZZZZZ9'},{av:'AV155B2',fld:'vB2',pic:'ZZ9'},{av:'AV157G2',fld:'vG2',pic:'ZZ9'},{av:'AV159R2',fld:'vR2',pic:'ZZ9'},{av:'AV154B',fld:'vB',pic:'ZZ9'},{av:'AV156G',fld:'vG',pic:'ZZ9'},{av:'AV158R',fld:'vR',pic:'ZZ9'},{av:'edtForNomCli_Backcolor',ctrl:'FORNOMCLI',prop:'Backcolor'},{av:'edtForNomCli_Forecolor',ctrl:'FORNOMCLI',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e18R62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'AV132GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV133GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e13R62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'AV132GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV133GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DORECETACOLOR'","{handler:'e20R62',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'AV174Station',fld:'vSTATION',pic:''},{av:'AV168Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true}]");
      setEventMetadata("'DORECETACOLOR'",",oparms:[{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV168Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV174Station',fld:'vSTATION',pic:''}]}");
      setEventMetadata("'DOLISTADO'","{handler:'e11R61',iparms:[]");
      setEventMetadata("'DOLISTADO'",",oparms:[]}");
      setEventMetadata("'DOVERFORMULA'","{handler:'e21R62',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'AV174Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("'DOVERFORMULA'",",oparms:[{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOSIMULACIONFORMULA'","{handler:'e22R62',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'AV174Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("'DOSIMULACIONFORMULA'",",oparms:[{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV174Station',fld:'vSTATION',pic:''}]}");
      setEventMetadata("'DODUPLICAREQUIVALENTE'","{handler:'e23R62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("'DODUPLICAREQUIVALENTE'",",oparms:[{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'AV132GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV133GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOELIMINARFORMULA'","{handler:'e12R61',iparms:[]");
      setEventMetadata("'DOELIMINARFORMULA'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARFORMULA.CLOSE","{handler:'e19R62',iparms:[{av:'Dvelop_confirmpanel_eliminarformula_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARFORMULA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV174Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARFORMULA.CLOSE",",oparms:[{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'AV132GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV133GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e24R62',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e25R62',iparms:[{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e26R62',iparms:[{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e27R62',iparms:[{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("FORFEC_RANGEPICKER.DATERANGECHANGED","{handler:'e16R62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV180FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV61TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV62TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV65TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV67TFForSer',fld:'vTFFORSER',pic:''},{av:'AV68TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV70TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV71TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV73TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV74TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV76TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV77TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV121TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV122TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV79TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV80TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV82TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV83TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV141TFForFec',fld:'vTFFORFEC',pic:''},{av:'AV146TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV151TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV152TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV172TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV173TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV225Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV179SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV167Tintutex',fld:'vTINTUTEX',pic:'9',hsh:true},{av:'AV177UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("FORFEC_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV138ForFec',fld:'vFORFEC',pic:''},{av:'AV139ForFec_To',fld:'vFORFEC_TO',pic:''},{av:'AV59ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'AV132GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV133GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_B2',iparms:[]");
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
      Dvelop_confirmpanel_eliminarformula_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV180FilterFullText = "" ;
      AV138ForFec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV54ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV139ForFec_To = GXutil.nullDate() ;
      AV64TFCliNom = "" ;
      AV65TFCliNom_Sel = "" ;
      AV67TFForSer = "" ;
      AV68TFForSer_Sel = "" ;
      AV70TFForSerDsc = "" ;
      AV71TFForSerDsc_Sel = "" ;
      AV73TFForColNom = "" ;
      AV74TFForColNom_Sel = "" ;
      AV121TFForNomCli = "" ;
      AV122TFForNomCli_Sel = "" ;
      AV82TFTipColDsc = "" ;
      AV83TFTipColDsc_Sel = "" ;
      AV141TFForFec = GXutil.nullDate() ;
      AV146TFForUltUti = GXutil.nullDate() ;
      AV172TFForRelBan = DecimalUtil.ZERO ;
      AV173TFForRelBan_To = DecimalUtil.ZERO ;
      AV225Pgmname = "" ;
      AV177UsurCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV57ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV130DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV174Station = "" ;
      AV168Valor_cor = DecimalUtil.ZERO ;
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
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnrecetacolor_Jsonclick = "" ;
      bttBtnlistado_Jsonclick = "" ;
      bttBtnverformula_Jsonclick = "" ;
      bttBtnsimulacionformula_Jsonclick = "" ;
      bttBtnduplicarequivalente_Jsonclick = "" ;
      bttBtneliminarformula_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblProcesosquimicos_title_Jsonclick = "" ;
      WebComp_Wcwcprocesosformula_Component = "" ;
      OldWcwcprocesosformula = "" ;
      lblColorantes_title_Jsonclick = "" ;
      WebComp_Wcwccolorantesformula_Component = "" ;
      OldWcwccolorantesformula = "" ;
      lblProductos_title_Jsonclick = "" ;
      WebComp_Wcwcproductosformula_Component = "" ;
      OldWcwcproductosformula = "" ;
      ucForfec_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV143DDO_ForFecAuxDate = GXutil.nullDate() ;
      AV148DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV193Visualizar = "" ;
      AV191Modificar = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV200Tmformulaswwds_3_filterfulltext = "" ;
      lV203Tmformulaswwds_6_tfclinom = "" ;
      lV205Tmformulaswwds_8_tfforser = "" ;
      lV207Tmformulaswwds_10_tfforserdsc = "" ;
      lV209Tmformulaswwds_12_tfforcolnom = "" ;
      lV213Tmformulaswwds_16_tffornomcli = "" ;
      lV217Tmformulaswwds_20_tftipcoldsc = "" ;
      AV198Tmformulaswwds_1_forfec = GXutil.nullDate() ;
      AV199Tmformulaswwds_2_forfec_to = GXutil.nullDate() ;
      AV200Tmformulaswwds_3_filterfulltext = "" ;
      AV204Tmformulaswwds_7_tfclinom_sel = "" ;
      AV203Tmformulaswwds_6_tfclinom = "" ;
      AV206Tmformulaswwds_9_tfforser_sel = "" ;
      AV205Tmformulaswwds_8_tfforser = "" ;
      AV208Tmformulaswwds_11_tfforserdsc_sel = "" ;
      AV207Tmformulaswwds_10_tfforserdsc = "" ;
      AV210Tmformulaswwds_13_tfforcolnom_sel = "" ;
      AV209Tmformulaswwds_12_tfforcolnom = "" ;
      AV214Tmformulaswwds_17_tffornomcli_sel = "" ;
      AV213Tmformulaswwds_16_tffornomcli = "" ;
      AV218Tmformulaswwds_21_tftipcoldsc_sel = "" ;
      AV217Tmformulaswwds_20_tftipcoldsc = "" ;
      AV219Tmformulaswwds_22_tfforfec = GXutil.nullDate() ;
      AV220Tmformulaswwds_23_tfforultuti = GXutil.nullDate() ;
      AV223Tmformulaswwds_26_tfforrelban = DecimalUtil.ZERO ;
      AV224Tmformulaswwds_27_tfforrelban_to = DecimalUtil.ZERO ;
      H00R62_A396EmprCod = new String[] {""} ;
      H00R62_A4339ForRGB = new long[1] ;
      H00R62_n4339ForRGB = new boolean[] {false} ;
      H00R62_A1192ForNumCli = new int[1] ;
      H00R62_n1192ForNumCli = new boolean[] {false} ;
      H00R62_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00R62_n2838ForRelBan = new boolean[] {false} ;
      H00R62_A486ForNumCol = new int[1] ;
      H00R62_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      H00R62_n496ForUltUti = new boolean[] {false} ;
      H00R62_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00R62_n485ForFec = new boolean[] {false} ;
      H00R62_A832TipColDsc = new String[] {""} ;
      H00R62_n832TipColDsc = new boolean[] {false} ;
      H00R62_A831TipColCod = new byte[1] ;
      H00R62_A1191ForNomCli = new String[] {""} ;
      H00R62_n1191ForNomCli = new boolean[] {false} ;
      H00R62_A483ForColNum = new int[1] ;
      H00R62_A482ForColNom = new String[] {""} ;
      H00R62_A5742ForSerDsc = new String[] {""} ;
      H00R62_n5742ForSerDsc = new boolean[] {false} ;
      H00R62_A494ForSer = new String[] {""} ;
      H00R62_A279CliNom = new String[] {""} ;
      H00R62_A252CliCod = new int[1] ;
      H00R63_AGRID_nRecordCount = new long[1] ;
      AV182ForFec_RangeText = "" ;
      AV176EmprNom = "" ;
      AV197Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV56Session = httpContext.getWebSession();
      AV52ColumnsSelectorXML = "" ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV58ManageFiltersXml = "" ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      AV50ExcelFilename = "" ;
      AV51ErrorMessage = "" ;
      AV53UserCustomValue = "" ;
      AV55ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector22 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector23 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item24 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item25 = new GXBaseCollection[1] ;
      GXv_int19 = new int[1] ;
      GXv_int17 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int16 = new int[1] ;
      AV190IncObs = "" ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char31 = "" ;
      GXv_char32 = new String[1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState33 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_eliminarformula = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmformulasww__default(),
         new Object[] {
             new Object[] {
            H00R62_A396EmprCod, H00R62_A4339ForRGB, H00R62_n4339ForRGB, H00R62_A1192ForNumCli, H00R62_n1192ForNumCli, H00R62_A2838ForRelBan, H00R62_n2838ForRelBan, H00R62_A486ForNumCol, H00R62_A496ForUltUti, H00R62_n496ForUltUti,
            H00R62_A485ForFec, H00R62_n485ForFec, H00R62_A832TipColDsc, H00R62_n832TipColDsc, H00R62_A831TipColCod, H00R62_A1191ForNomCli, H00R62_n1191ForNomCli, H00R62_A483ForColNum, H00R62_A482ForColNom, H00R62_A5742ForSerDsc,
            H00R62_n5742ForSerDsc, H00R62_A494ForSer, H00R62_A279CliNom, H00R62_A252CliCod
            }
            , new Object[] {
            H00R63_AGRID_nRecordCount
            }
         }
      );
      AV225Pgmname = "TMFormulasWW" ;
      /* GeneXus formulas. */
      AV225Pgmname = "TMFormulasWW" ;
      Gx_err = (short)(0) ;
      edtavVisualizar_Enabled = 0 ;
      edtavModificar_Enabled = 0 ;
      edtavForrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      WebComp_Wcwcprocesosformula = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwccolorantesformula = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcproductosformula = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV59ManageFiltersExecutionStep ;
   private byte AV79TFTipColCod ;
   private byte AV80TFTipColCod_To ;
   private byte AV167Tintutex ;
   private byte gxajaxcallmode ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV215Tmformulaswwds_18_tftipcolcod ;
   private byte AV216Tmformulaswwds_19_tftipcolcod_to ;
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
   private short AV179SiRGB ;
   private short wbEnd ;
   private short wbStart ;
   private short AV158R ;
   private short AV156G ;
   private short AV154B ;
   private short AV159R2 ;
   private short AV157G2 ;
   private short AV155B2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_48 ;
   private int nGXsfl_48_idx=1 ;
   private int AV61TFCliCod ;
   private int AV62TFCliCod_To ;
   private int AV76TFForColNum ;
   private int AV77TFForColNum_To ;
   private int AV151TFForNumCol ;
   private int AV152TFForNumCol_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int A1192ForNumCli ;
   private int subGrid_Islastpage ;
   private int edtavVisualizar_Enabled ;
   private int edtavModificar_Enabled ;
   private int edtavForrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV201Tmformulaswwds_4_tfclicod ;
   private int AV202Tmformulaswwds_5_tfclicod_to ;
   private int AV211Tmformulaswwds_14_tfforcolnum ;
   private int AV212Tmformulaswwds_15_tfforcolnum_to ;
   private int AV221Tmformulaswwds_24_tffornumcol ;
   private int AV222Tmformulaswwds_25_tffornumcol_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtForSer_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtForColNom_Visible ;
   private int edtForColNum_Visible ;
   private int edtForNomCli_Visible ;
   private int edtTipColCod_Visible ;
   private int edtTipColDsc_Visible ;
   private int edtForFec_Visible ;
   private int edtForUltUti_Visible ;
   private int edtForNumCol_Visible ;
   private int edtForRelBan_Visible ;
   private int AV131PageToGo ;
   private int edtForNomCli_Backcolor ;
   private int edtForNomCli_Forecolor ;
   private int GXv_int19[] ;
   private int GXv_int17[] ;
   private int GXv_int16[] ;
   private int AV226GXV1 ;
   private int edtavForfec_rangetext_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV132GridCurrentPage ;
   private long AV133GridPageCount ;
   private long A4339ForRGB ;
   private long AV153ForRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV172TFForRelBan ;
   private java.math.BigDecimal AV173TFForRelBan_To ;
   private java.math.BigDecimal AV168Valor_cor ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV223Tmformulaswwds_26_tfforrelban ;
   private java.math.BigDecimal AV224Tmformulaswwds_27_tfforrelban_to ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminarformula_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_48_idx="0001" ;
   private String A396EmprCod ;
   private String AV64TFCliNom ;
   private String AV65TFCliNom_Sel ;
   private String AV67TFForSer ;
   private String AV68TFForSer_Sel ;
   private String AV70TFForSerDsc ;
   private String AV71TFForSerDsc_Sel ;
   private String AV73TFForColNom ;
   private String AV74TFForColNom_Sel ;
   private String AV121TFForNomCli ;
   private String AV122TFForNomCli_Sel ;
   private String AV82TFTipColDsc ;
   private String AV83TFTipColDsc_Sel ;
   private String AV225Pgmname ;
   private String AV177UsurCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV174Station ;
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
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminarformula_Title ;
   private String Dvelop_confirmpanel_eliminarformula_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarformula_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarformula_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarformula_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarformula_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarformula_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnrecetacolor_Internalname ;
   private String bttBtnrecetacolor_Jsonclick ;
   private String bttBtnlistado_Internalname ;
   private String bttBtnlistado_Jsonclick ;
   private String bttBtnverformula_Internalname ;
   private String bttBtnverformula_Jsonclick ;
   private String bttBtnsimulacionformula_Internalname ;
   private String bttBtnsimulacionformula_Jsonclick ;
   private String bttBtnduplicarequivalente_Internalname ;
   private String bttBtnduplicarequivalente_Jsonclick ;
   private String bttBtneliminarformula_Internalname ;
   private String bttBtneliminarformula_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblProcesosquimicos_title_Internalname ;
   private String lblProcesosquimicos_title_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String WebComp_Wcwcprocesosformula_Component ;
   private String OldWcwcprocesosformula ;
   private String lblColorantes_title_Internalname ;
   private String lblColorantes_title_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String WebComp_Wcwccolorantesformula_Component ;
   private String OldWcwccolorantesformula ;
   private String lblProductos_title_Internalname ;
   private String lblProductos_title_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String WebComp_Wcwcproductosformula_Component ;
   private String OldWcwcproductosformula ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Forfec_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_forfecauxdates_Internalname ;
   private String edtavDdo_forfecauxdate_Internalname ;
   private String edtavDdo_forfecauxdate_Jsonclick ;
   private String divDdo_forultutiauxdates_Internalname ;
   private String edtavDdo_forultutiauxdate_Internalname ;
   private String edtavDdo_forultutiauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV193Visualizar ;
   private String edtavVisualizar_Internalname ;
   private String AV191Modificar ;
   private String edtavModificar_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A832TipColDsc ;
   private String edtTipColDsc_Internalname ;
   private String edtForFec_Internalname ;
   private String edtForUltUti_Internalname ;
   private String edtForNumCol_Internalname ;
   private String edtForRelBan_Internalname ;
   private String edtForNumCli_Internalname ;
   private String edtavForrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String edtavForfec_rangetext_Internalname ;
   private String scmdbuf ;
   private String lV203Tmformulaswwds_6_tfclinom ;
   private String lV205Tmformulaswwds_8_tfforser ;
   private String lV207Tmformulaswwds_10_tfforserdsc ;
   private String lV209Tmformulaswwds_12_tfforcolnom ;
   private String lV213Tmformulaswwds_16_tffornomcli ;
   private String lV217Tmformulaswwds_20_tftipcoldsc ;
   private String AV204Tmformulaswwds_7_tfclinom_sel ;
   private String AV203Tmformulaswwds_6_tfclinom ;
   private String AV206Tmformulaswwds_9_tfforser_sel ;
   private String AV205Tmformulaswwds_8_tfforser ;
   private String AV208Tmformulaswwds_11_tfforserdsc_sel ;
   private String AV207Tmformulaswwds_10_tfforserdsc ;
   private String AV210Tmformulaswwds_13_tfforcolnom_sel ;
   private String AV209Tmformulaswwds_12_tfforcolnom ;
   private String AV214Tmformulaswwds_17_tffornomcli_sel ;
   private String AV213Tmformulaswwds_16_tffornomcli ;
   private String AV218Tmformulaswwds_21_tftipcoldsc_sel ;
   private String AV217Tmformulaswwds_20_tftipcoldsc ;
   private String edtavFilterfulltext_Internalname ;
   private String AV176EmprNom ;
   private String AV197Emprcod ;
   private String edtavVisualizar_Link ;
   private String edtavModificar_Link ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char28 ;
   private String GXv_char20[] ;
   private String GXt_char27 ;
   private String GXv_char4[] ;
   private String GXt_char26 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminarformula_Internalname ;
   private String Dvelop_confirmpanel_eliminarformula_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String divTablefilters_Internalname ;
   private String edtavForfec_rangetext_Jsonclick ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_48_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavVisualizar_Jsonclick ;
   private String edtavModificar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtForNomCli_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Jsonclick ;
   private String edtForFec_Jsonclick ;
   private String edtForUltUti_Jsonclick ;
   private String edtForNumCol_Jsonclick ;
   private String edtForRelBan_Jsonclick ;
   private String edtForNumCli_Jsonclick ;
   private String edtavForrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV138ForFec ;
   private java.util.Date AV139ForFec_To ;
   private java.util.Date AV141TFForFec ;
   private java.util.Date AV146TFForUltUti ;
   private java.util.Date AV143DDO_ForFecAuxDate ;
   private java.util.Date AV148DDO_ForUltUtiAuxDate ;
   private java.util.Date A485ForFec ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV198Tmformulaswwds_1_forfec ;
   private java.util.Date AV199Tmformulaswwds_2_forfec_to ;
   private java.util.Date AV219Tmformulaswwds_22_tfforfec ;
   private java.util.Date AV220Tmformulaswwds_23_tfforultuti ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_48_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5742ForSerDsc ;
   private boolean n1191ForNomCli ;
   private boolean n832TipColDsc ;
   private boolean n485ForFec ;
   private boolean n496ForUltUti ;
   private boolean n2838ForRelBan ;
   private boolean n1192ForNumCli ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n4339ForRGB ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcproductosformula ;
   private boolean bDynCreated_Wcwccolorantesformula ;
   private boolean bDynCreated_Wcwcprocesosformula ;
   private boolean gx_refresh_fired ;
   private String AV52ColumnsSelectorXML ;
   private String AV58ManageFiltersXml ;
   private String AV53UserCustomValue ;
   private String AV180FilterFullText ;
   private String lV200Tmformulaswwds_3_filterfulltext ;
   private String AV200Tmformulaswwds_3_filterfulltext ;
   private String AV182ForFec_RangeText ;
   private String AV50ExcelFilename ;
   private String AV51ErrorMessage ;
   private String AV190IncObs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcprocesosformula ;
   private GXWebComponent WebComp_Wcwccolorantesformula ;
   private GXWebComponent WebComp_Wcwcproductosformula ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV56Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucForfec_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarformula ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H00R62_A396EmprCod ;
   private long[] H00R62_A4339ForRGB ;
   private boolean[] H00R62_n4339ForRGB ;
   private int[] H00R62_A1192ForNumCli ;
   private boolean[] H00R62_n1192ForNumCli ;
   private java.math.BigDecimal[] H00R62_A2838ForRelBan ;
   private boolean[] H00R62_n2838ForRelBan ;
   private int[] H00R62_A486ForNumCol ;
   private java.util.Date[] H00R62_A496ForUltUti ;
   private boolean[] H00R62_n496ForUltUti ;
   private java.util.Date[] H00R62_A485ForFec ;
   private boolean[] H00R62_n485ForFec ;
   private String[] H00R62_A832TipColDsc ;
   private boolean[] H00R62_n832TipColDsc ;
   private byte[] H00R62_A831TipColCod ;
   private String[] H00R62_A1191ForNomCli ;
   private boolean[] H00R62_n1191ForNomCli ;
   private int[] H00R62_A483ForColNum ;
   private String[] H00R62_A482ForColNom ;
   private String[] H00R62_A5742ForSerDsc ;
   private boolean[] H00R62_n5742ForSerDsc ;
   private String[] H00R62_A494ForSer ;
   private String[] H00R62_A279CliNom ;
   private int[] H00R62_A252CliCod ;
   private long[] H00R63_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV57ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item24 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item25[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV54ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV55ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector22[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector23[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV130DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState33[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class tmformulasww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00R62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV198Tmformulaswwds_1_forfec ,
                                          java.util.Date AV199Tmformulaswwds_2_forfec_to ,
                                          String AV200Tmformulaswwds_3_filterfulltext ,
                                          int AV201Tmformulaswwds_4_tfclicod ,
                                          int AV202Tmformulaswwds_5_tfclicod_to ,
                                          String AV204Tmformulaswwds_7_tfclinom_sel ,
                                          String AV203Tmformulaswwds_6_tfclinom ,
                                          String AV206Tmformulaswwds_9_tfforser_sel ,
                                          String AV205Tmformulaswwds_8_tfforser ,
                                          String AV208Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV207Tmformulaswwds_10_tfforserdsc ,
                                          String AV210Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV209Tmformulaswwds_12_tfforcolnom ,
                                          int AV211Tmformulaswwds_14_tfforcolnum ,
                                          int AV212Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV214Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV213Tmformulaswwds_16_tffornomcli ,
                                          byte AV215Tmformulaswwds_18_tftipcolcod ,
                                          byte AV216Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV218Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV217Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV219Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV220Tmformulaswwds_23_tfforultuti ,
                                          int AV221Tmformulaswwds_24_tffornumcol ,
                                          int AV222Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV223Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV224Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[43];
      Object[] GXv_Object35 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.ForRGB, T1.ForNumCli, T1.ForRelBan, T1.ForNumCol, T1.ForUltUti, T1.ForFec, T3.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom," ;
      sSelectString += " T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod" ;
      sFromString = " FROM ((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod AND T3.TipColCod" ;
      sFromString += " = T1.TipColCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV198Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int34[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV199Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T3.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
         GXv_int34[4] = (byte)(1) ;
         GXv_int34[5] = (byte)(1) ;
         GXv_int34[6] = (byte)(1) ;
         GXv_int34[7] = (byte)(1) ;
         GXv_int34[8] = (byte)(1) ;
         GXv_int34[9] = (byte)(1) ;
         GXv_int34[10] = (byte)(1) ;
         GXv_int34[11] = (byte)(1) ;
         GXv_int34[12] = (byte)(1) ;
         GXv_int34[13] = (byte)(1) ;
      }
      if ( ! (0==AV201Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (0==AV202Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV204Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV203Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV204Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV206Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV205Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV206Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV208Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV207Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV208Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV210Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV209Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV210Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (0==AV211Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( ! (0==AV212Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV214Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV213Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV214Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! (0==AV215Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (0==AV216Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV218Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV217Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV218Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipColDsc = ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV219Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int34[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV220Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int34[33] = (byte)(1) ;
      }
      if ( ! (0==AV221Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int34[34] = (byte)(1) ;
      }
      if ( ! (0==AV222Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int34[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV223Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int34[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV224Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int34[37] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T3.TipColDsc" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.TipColDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForRelBan" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForRelBan DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_H00R63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV198Tmformulaswwds_1_forfec ,
                                          java.util.Date AV199Tmformulaswwds_2_forfec_to ,
                                          String AV200Tmformulaswwds_3_filterfulltext ,
                                          int AV201Tmformulaswwds_4_tfclicod ,
                                          int AV202Tmformulaswwds_5_tfclicod_to ,
                                          String AV204Tmformulaswwds_7_tfclinom_sel ,
                                          String AV203Tmformulaswwds_6_tfclinom ,
                                          String AV206Tmformulaswwds_9_tfforser_sel ,
                                          String AV205Tmformulaswwds_8_tfforser ,
                                          String AV208Tmformulaswwds_11_tfforserdsc_sel ,
                                          String AV207Tmformulaswwds_10_tfforserdsc ,
                                          String AV210Tmformulaswwds_13_tfforcolnom_sel ,
                                          String AV209Tmformulaswwds_12_tfforcolnom ,
                                          int AV211Tmformulaswwds_14_tfforcolnum ,
                                          int AV212Tmformulaswwds_15_tfforcolnum_to ,
                                          String AV214Tmformulaswwds_17_tffornomcli_sel ,
                                          String AV213Tmformulaswwds_16_tffornomcli ,
                                          byte AV215Tmformulaswwds_18_tftipcolcod ,
                                          byte AV216Tmformulaswwds_19_tftipcolcod_to ,
                                          String AV218Tmformulaswwds_21_tftipcoldsc_sel ,
                                          String AV217Tmformulaswwds_20_tftipcoldsc ,
                                          java.util.Date AV219Tmformulaswwds_22_tfforfec ,
                                          java.util.Date AV220Tmformulaswwds_23_tfforultuti ,
                                          int AV221Tmformulaswwds_24_tffornumcol ,
                                          int AV222Tmformulaswwds_25_tffornumcol_to ,
                                          java.math.BigDecimal AV223Tmformulaswwds_26_tfforrelban ,
                                          java.math.BigDecimal AV224Tmformulaswwds_27_tfforrelban_to ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          java.util.Date A496ForUltUti ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[38];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPTIPCOL T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipColCod = T1.TipColCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV198Tmformulaswwds_1_forfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int36[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV199Tmformulaswwds_2_forfec_to)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int36[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Tmformulaswwds_3_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.ForSer) like '%' || UPPER(?)) or ( UPPER(T1.ForSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.ForColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.ForNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.TipColCod,'90'), 2) like '%' || ?) or ( UPPER(T3.TipColDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ForNumCol,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.ForRelBan,'9990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int36[3] = (byte)(1) ;
         GXv_int36[4] = (byte)(1) ;
         GXv_int36[5] = (byte)(1) ;
         GXv_int36[6] = (byte)(1) ;
         GXv_int36[7] = (byte)(1) ;
         GXv_int36[8] = (byte)(1) ;
         GXv_int36[9] = (byte)(1) ;
         GXv_int36[10] = (byte)(1) ;
         GXv_int36[11] = (byte)(1) ;
         GXv_int36[12] = (byte)(1) ;
         GXv_int36[13] = (byte)(1) ;
      }
      if ( ! (0==AV201Tmformulaswwds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (0==AV202Tmformulaswwds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV204Tmformulaswwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV203Tmformulaswwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV204Tmformulaswwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV206Tmformulaswwds_9_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV205Tmformulaswwds_8_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV206Tmformulaswwds_9_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV208Tmformulaswwds_11_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV207Tmformulaswwds_10_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV208Tmformulaswwds_11_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV210Tmformulaswwds_13_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV209Tmformulaswwds_12_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV210Tmformulaswwds_13_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int36[23] = (byte)(1) ;
      }
      if ( ! (0==AV211Tmformulaswwds_14_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int36[24] = (byte)(1) ;
      }
      if ( ! (0==AV212Tmformulaswwds_15_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int36[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV214Tmformulaswwds_17_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV213Tmformulaswwds_16_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV214Tmformulaswwds_17_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int36[27] = (byte)(1) ;
      }
      if ( ! (0==AV215Tmformulaswwds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int36[28] = (byte)(1) ;
      }
      if ( ! (0==AV216Tmformulaswwds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int36[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV218Tmformulaswwds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV217Tmformulaswwds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV218Tmformulaswwds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipColDsc = ?)");
      }
      else
      {
         GXv_int36[31] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV219Tmformulaswwds_22_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int36[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV220Tmformulaswwds_23_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int36[33] = (byte)(1) ;
      }
      if ( ! (0==AV221Tmformulaswwds_24_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int36[34] = (byte)(1) ;
      }
      if ( ! (0==AV222Tmformulaswwds_25_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int36[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV223Tmformulaswwds_26_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int36[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV224Tmformulaswwds_27_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int36[37] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
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
                  return conditional_H00R62(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() , (String)dynConstraints[42] );
            case 1 :
                  return conditional_H00R63(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (java.math.BigDecimal)dynConstraints[38] , (java.util.Date)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() , (String)dynConstraints[42] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00R62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00R63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((String[]) buf[15])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((String[]) buf[18])[0] = rslt.getString(12, 13);
               ((String[]) buf[19])[0] = rslt.getString(13, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 16);
               ((String[]) buf[22])[0] = rslt.getString(15, 30);
               ((int[]) buf[23])[0] = rslt.getInt(16);
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
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               return;
      }
   }

}

