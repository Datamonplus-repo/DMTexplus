package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis___ww_impl extends GXDataArea
{
   public dis___ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public dis___ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis___ww_impl.class ));
   }

   public dis___ww_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkPriCod = UIFactory.getCheckbox(this);
      cmbDisEst = new HTMLChoice();
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
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
      AV106DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      AV107DisFecClifrom = localUtil.parseDateParm( httpContext.GetPar( "DisFecClifrom")) ;
      AV108DisFecClito = localUtil.parseDateParm( httpContext.GetPar( "DisFecClito")) ;
      AV104DisFecFrom = localUtil.parseDateParm( httpContext.GetPar( "DisFecFrom")) ;
      AV105DisFecTo = localUtil.parseDateParm( httpContext.GetPar( "DisFecTo")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV31ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV8ColumnsSelector);
      AV22FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV82TFDisUsrCod = httpContext.GetPar( "TFDisUsrCod") ;
      AV83TFDisUsrCod_Sel = httpContext.GetPar( "TFDisUsrCod_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV56TFDisEst_Sels);
      AV85TFDisCliNum = httpContext.GetPar( "TFDisCliNum") ;
      AV86TFDisCliNum_Sel = httpContext.GetPar( "TFDisCliNum_Sel") ;
      AV87TFDisEncCli = httpContext.GetPar( "TFDisEncCli") ;
      AV88TFDisEncCli_Sel = httpContext.GetPar( "TFDisEncCli_Sel") ;
      AV63TFDisFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFDisFecEnt")) ;
      AV64TFDisFecEnt_To = localUtil.parseDateParm( httpContext.GetPar( "TFDisFecEnt_To")) ;
      AV41TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV42TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV43TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV44TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV45TFDisArtCod = httpContext.GetPar( "TFDisArtCod") ;
      AV46TFDisArtCod_Sel = httpContext.GetPar( "TFDisArtCod_Sel") ;
      AV47TFDisArtDsc = httpContext.GetPar( "TFDisArtDsc") ;
      AV48TFDisArtDsc_Sel = httpContext.GetPar( "TFDisArtDsc_Sel") ;
      AV51TFDisColNom = httpContext.GetPar( "TFDisColNom") ;
      AV52TFDisColNom_Sel = httpContext.GetPar( "TFDisColNom_Sel") ;
      AV53TFDisColNum = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum"))) ;
      AV54TFDisColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum_To"))) ;
      AV65TFDisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol"))) ;
      AV66TFDisTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol_To"))) ;
      AV89TFDisNomCli = httpContext.GetPar( "TFDisNomCli") ;
      AV90TFDisNomCli_Sel = httpContext.GetPar( "TFDisNomCli_Sel") ;
      AV91TFDisNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFDisNumCli"))) ;
      AV92TFDisNumCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisNumCli_To"))) ;
      AV93TFMaqCodDis = httpContext.GetPar( "TFMaqCodDis") ;
      AV94TFMaqCodDis_Sel = httpContext.GetPar( "TFMaqCodDis_Sel") ;
      AV97TFDisNumUni = CommonUtil.decimalVal( httpContext.GetPar( "TFDisNumUni"), ".") ;
      AV98TFDisNumUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDisNumUni_To"), ".") ;
      AV99TFDisUniMed = httpContext.GetPar( "TFDisUniMed") ;
      AV100TFDisUniMed_Sel = httpContext.GetPar( "TFDisUniMed_Sel") ;
      AV95TFDisNumPie = (short)(GXutil.lval( httpContext.GetPar( "TFDisNumPie"))) ;
      AV96TFDisNumPie_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisNumPie_To"))) ;
      AV148Pgmname = httpContext.GetPar( "Pgmname") ;
      AV34OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV36OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV102moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      AV7UsurCod = httpContext.GetPar( "UsurCod") ;
      AV6Station = httpContext.GetPar( "Station") ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV106DisCod, AV107DisFecClifrom, AV108DisFecClito, AV104DisFecFrom, AV105DisFecTo, A396EmprCod, AV31ManageFiltersExecutionStep, AV8ColumnsSelector, AV22FilterFullText, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV56TFDisEst_Sels, AV85TFDisCliNum, AV86TFDisCliNum_Sel, AV87TFDisEncCli, AV88TFDisEncCli_Sel, AV63TFDisFecEnt, AV64TFDisFecEnt_To, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV45TFDisArtCod, AV46TFDisArtCod_Sel, AV47TFDisArtDsc, AV48TFDisArtDsc_Sel, AV51TFDisColNom, AV52TFDisColNom_Sel, AV53TFDisColNum, AV54TFDisColNum_To, AV65TFDisTipCol, AV66TFDisTipCol_To, AV89TFDisNomCli, AV90TFDisNomCli_Sel, AV91TFDisNumCli, AV92TFDisNumCli_To, AV93TFMaqCodDis, AV94TFMaqCodDis_Sel, AV97TFDisNumUni, AV98TFDisNumUni_To, AV99TFDisUniMed, AV100TFDisUniMed_Sel, AV95TFDisNumPie, AV96TFDisNumPie_To, AV148Pgmname, AV34OrderedBy, AV36OrderedDsc, AV102moda21, AV7UsurCod, AV6Station, Gx_date) ;
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
      pa22C2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start22C2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.dis___ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDISCOD", GXutil.ltrim( localUtil.ntoc( AV106DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDISFECCLIFROM", localUtil.format(AV107DisFecClifrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDISFECCLITO", localUtil.format(AV108DisFecClito, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDISFECFROM", localUtil.format(AV104DisFecFrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDISFECTO", localUtil.format(AV105DisFecTo, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_68, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV30ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV30ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV24GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV25GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV17DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV17DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV8ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV8ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV31ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUSRCOD", GXutil.rtrim( AV82TFDisUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUSRCOD_SEL", GXutil.rtrim( AV83TFDisUsrCod_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFDISEST_SELS", AV56TFDisEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFDISEST_SELS", AV56TFDisEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCLINUM", GXutil.rtrim( AV85TFDisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCLINUM_SEL", GXutil.rtrim( AV86TFDisCliNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISENCCLI", GXutil.rtrim( AV87TFDisEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISENCCLI_SEL", GXutil.rtrim( AV88TFDisEncCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFECENT", localUtil.dtoc( AV63TFDisFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFECENT_TO", localUtil.dtoc( AV64TFDisFecEnt_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV41TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV42TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV43TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV44TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD", GXutil.rtrim( AV45TFDisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD_SEL", GXutil.rtrim( AV46TFDisArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTDSC", GXutil.rtrim( AV47TFDisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTDSC_SEL", GXutil.rtrim( AV48TFDisArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNOM", GXutil.rtrim( AV51TFDisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNOM_SEL", GXutil.rtrim( AV52TFDisColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNUM", GXutil.ltrim( localUtil.ntoc( AV53TFDisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV54TFDisColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISTIPCOL", GXutil.ltrim( localUtil.ntoc( AV65TFDisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV66TFDisTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNOMCLI", GXutil.rtrim( AV89TFDisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNOMCLI_SEL", GXutil.rtrim( AV90TFDisNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMCLI", GXutil.ltrim( localUtil.ntoc( AV91TFDisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV92TFDisNumCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODDIS", GXutil.rtrim( AV93TFMaqCodDis));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODDIS_SEL", GXutil.rtrim( AV94TFMaqCodDis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMUNI", GXutil.ltrim( localUtil.ntoc( AV97TFDisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMUNI_TO", GXutil.ltrim( localUtil.ntoc( AV98TFDisNumUni_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUNIMED", GXutil.rtrim( AV99TFDisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUNIMED_SEL", GXutil.rtrim( AV100TFDisUniMed_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMPIE", GXutil.ltrim( localUtil.ntoc( AV95TFDisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMPIE_TO", GXutil.ltrim( localUtil.ntoc( AV96TFDisNumPie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV148Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV34OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV36OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV102moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102moda21), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV26GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV26GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISEST_SELSJSON", AV57TFDisEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV7UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV6Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we22C2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt22C2( ) ;
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
      return formatLink("app.pedidos.dis___ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.Dis___WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Pedidos", "") ;
   }

   public void wb22C0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDiscod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDiscod_Internalname, httpContext.getMessage( "Nº Enc.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDiscod_Internalname, GXutil.ltrim( localUtil.ntoc( AV106DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDiscod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV106DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV106DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDiscod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDiscod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfecclifrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfecclifrom_Internalname, httpContext.getMessage( "Data Ped.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDisfecclifrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfecclifrom_Internalname, localUtil.format(AV107DisFecClifrom, "99/99/99"), localUtil.format( AV107DisFecClifrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfecclifrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfecclifrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfecclifrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfecclifrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfecclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfecclito_Internalname, httpContext.getMessage( "Data Ped.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDisfecclito_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfecclito_Internalname, localUtil.format(AV108DisFecClito, "99/99/99"), localUtil.format( AV108DisFecClito, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfecclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfecclito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfecclito_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfecclito_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfecfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfecfrom_Internalname, httpContext.getMessage( "Data Reg.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDisfecfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfecfrom_Internalname, localUtil.format(AV104DisFecFrom, "99/99/99"), localUtil.format( AV104DisFecFrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfecfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfecfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfecfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfecfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfecto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfecto_Internalname, httpContext.getMessage( "Data Reg.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDisfecto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfecto_Internalname, localUtil.format(AV105DisFecTo, "99/99/99"), localUtil.format( AV105DisFecTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfecto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfecto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfecto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfecto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis___WW.htm");
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
         wb_table1_50_22C2( true) ;
      }
      else
      {
         wb_table1_50_22C2( false) ;
      }
      return  ;
   }

   public void wb_table1_50_22C2e( boolean wbgen )
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
         startgridcontrol68( ) ;
      }
      if ( wbEnd == 68 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_68 = (int)(nGXsfl_68_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV24GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV25GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV17DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV8ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_106_22C2( true) ;
      }
      else
      {
         wb_table2_106_22C2( false) ;
      }
      return  ;
   }

   public void wb_table2_106_22C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_disfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfecentauxdate_Internalname, localUtil.format(AV15DDO_DisFecEntAuxDate, "99/99/99"), localUtil.format( AV15DDO_DisFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfecentauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfecentauxdateto_Internalname, localUtil.format(AV16DDO_DisFecEntAuxDateTo, "99/99/99"), localUtil.format( AV16DDO_DisFecEntAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfecentauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfecentauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis___WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void start22C2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Pedidos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup22C0( ) ;
   }

   public void ws22C2( )
   {
      start22C2( ) ;
      evt22C2( ) ;
   }

   public void evt22C2( )
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
                           e1122C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1222C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1322C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1422C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1522C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1622C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1722C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1822C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e1922C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e2022C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDISCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2122C2 ();
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
                           nGXsfl_68_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_682( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV23GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridActions), 4, 0));
                           A757PriCod = ((GXutil.strcmp(httpContext.cgiGet( chkPriCod.getInternalname()), "1")==0) ? "1" : "0") ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
                           cmbDisEst.setName( cmbDisEst.getInternalname() );
                           cmbDisEst.setValue( httpContext.cgiGet( cmbDisEst.getInternalname()) );
                           A367DisEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbDisEst.getInternalname()))) ;
                           A360DisCliNum = httpContext.cgiGet( edtDisCliNum_Internalname) ;
                           A4813DisEncCli = httpContext.cgiGet( edtDisEncCli_Internalname) ;
                           A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A370DisFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFecCli_Internalname), 0)) ;
                           A369DisFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFec_Internalname), 0)) ;
                           A371DisFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDisFecEnt_Internalname), 0)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A335DisArtCod = httpContext.cgiGet( edtDisArtCod_Internalname) ;
                           A337DisArtDsc = httpContext.cgiGet( edtDisArtDsc_Internalname) ;
                           A362DisColNom = httpContext.cgiGet( edtDisColNom_Internalname) ;
                           n362DisColNom = false ;
                           A363DisColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtDisColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n363DisColNum = false ;
                           A390DisTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n390DisTipCol = false ;
                           A1195DisNomCli = httpContext.cgiGet( edtDisNomCli_Internalname) ;
                           A1196DisNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtDisNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1122MaqCodDis = httpContext.cgiGet( edtMaqCodDis_Internalname) ;
                           n1122MaqCodDis = false ;
                           A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
                           A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
                           A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A10887Cod_Idtx = httpContext.cgiGet( edtCod_Idtx_Internalname) ;
                           n10887Cod_Idtx = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2222C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2322C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2422C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2522C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Discod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV106DisCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Disfecclifrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vDISFECCLIFROM"), 0), AV107DisFecClifrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Disfecclito Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vDISFECCLITO"), 0), AV108DisFecClito) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Disfecfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vDISFECFROM"), 0), AV104DisFecFrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Disfecto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vDISFECTO"), 0), AV105DisFecTo) ) )
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

   public void we22C2( )
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

   public void pa22C2( )
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
            GX_FocusControl = edtavDiscod_Internalname ;
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
      subsflControlProps_682( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         sendrow_682( ) ;
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV106DisCod ,
                                 java.util.Date AV107DisFecClifrom ,
                                 java.util.Date AV108DisFecClito ,
                                 java.util.Date AV104DisFecFrom ,
                                 java.util.Date AV105DisFecTo ,
                                 String A396EmprCod ,
                                 byte AV31ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelector ,
                                 String AV22FilterFullText ,
                                 String AV82TFDisUsrCod ,
                                 String AV83TFDisUsrCod_Sel ,
                                 GXSimpleCollection<Byte> AV56TFDisEst_Sels ,
                                 String AV85TFDisCliNum ,
                                 String AV86TFDisCliNum_Sel ,
                                 String AV87TFDisEncCli ,
                                 String AV88TFDisEncCli_Sel ,
                                 java.util.Date AV63TFDisFecEnt ,
                                 java.util.Date AV64TFDisFecEnt_To ,
                                 int AV41TFCliCod ,
                                 int AV42TFCliCod_To ,
                                 String AV43TFCliNom ,
                                 String AV44TFCliNom_Sel ,
                                 String AV45TFDisArtCod ,
                                 String AV46TFDisArtCod_Sel ,
                                 String AV47TFDisArtDsc ,
                                 String AV48TFDisArtDsc_Sel ,
                                 String AV51TFDisColNom ,
                                 String AV52TFDisColNom_Sel ,
                                 int AV53TFDisColNum ,
                                 int AV54TFDisColNum_To ,
                                 byte AV65TFDisTipCol ,
                                 byte AV66TFDisTipCol_To ,
                                 String AV89TFDisNomCli ,
                                 String AV90TFDisNomCli_Sel ,
                                 int AV91TFDisNumCli ,
                                 int AV92TFDisNumCli_To ,
                                 String AV93TFMaqCodDis ,
                                 String AV94TFMaqCodDis_Sel ,
                                 java.math.BigDecimal AV97TFDisNumUni ,
                                 java.math.BigDecimal AV98TFDisNumUni_To ,
                                 String AV99TFDisUniMed ,
                                 String AV100TFDisUniMed_Sel ,
                                 short AV95TFDisNumPie ,
                                 short AV96TFDisNumPie_To ,
                                 String AV148Pgmname ,
                                 short AV34OrderedBy ,
                                 boolean AV36OrderedDsc ,
                                 short AV102moda21 ,
                                 String AV7UsurCod ,
                                 String AV6Station ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2322C2 ();
      GRID_nCurrentRecord = 0 ;
      rf22C2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A367DisEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISEST", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A335DisArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTCOD", GXutil.rtrim( A335DisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISARTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A337DisArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DISARTDSC", GXutil.rtrim( A337DisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISFEC", getSecureSignedToken( "", A369DisFec));
      app.GxWebStd.gx_hidden_field( httpContext, "DISFEC", localUtil.format(A369DisFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A392DisUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "DISUNIMED", GXutil.rtrim( A392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_COD_IDTX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A10887Cod_Idtx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "COD_IDTX", GXutil.rtrim( A10887Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRICOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A757PriCod, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRICOD", GXutil.rtrim( A757PriCod));
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
      rf22C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV148Pgmname = "Pedidos.Dis___WW" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV112Pedidos_dis___wwds_1_filterfulltext = AV22FilterFullText ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = AV82TFDisUsrCod ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = AV56TFDisEst_Sels ;
      AV116Pedidos_dis___wwds_5_tfdisclinum = AV85TFDisCliNum ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = AV86TFDisCliNum_Sel ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = AV87TFDisEncCli ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = AV88TFDisEncCli_Sel ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = AV63TFDisFecEnt ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = AV64TFDisFecEnt_To ;
      AV122Pedidos_dis___wwds_11_tfclicod = AV41TFCliCod ;
      AV123Pedidos_dis___wwds_12_tfclicod_to = AV42TFCliCod_To ;
      AV124Pedidos_dis___wwds_13_tfclinom = AV43TFCliNom ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = AV44TFCliNom_Sel ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = AV45TFDisArtCod ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = AV46TFDisArtCod_Sel ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = AV47TFDisArtDsc ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = AV48TFDisArtDsc_Sel ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = AV51TFDisColNom ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV132Pedidos_dis___wwds_21_tfdiscolnum = AV53TFDisColNum ;
      AV133Pedidos_dis___wwds_22_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV134Pedidos_dis___wwds_23_tfdistipcol = AV65TFDisTipCol ;
      AV135Pedidos_dis___wwds_24_tfdistipcol_to = AV66TFDisTipCol_To ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = AV89TFDisNomCli ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = AV90TFDisNomCli_Sel ;
      AV138Pedidos_dis___wwds_27_tfdisnumcli = AV91TFDisNumCli ;
      AV139Pedidos_dis___wwds_28_tfdisnumcli_to = AV92TFDisNumCli_To ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = AV93TFMaqCodDis ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV94TFMaqCodDis_Sel ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = AV97TFDisNumUni ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = AV98TFDisNumUni_To ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = AV99TFDisUniMed ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = AV100TFDisUniMed_Sel ;
      AV146Pedidos_dis___wwds_35_tfdisnumpie = AV95TFDisNumPie ;
      AV147Pedidos_dis___wwds_36_tfdisnumpie_to = AV96TFDisNumPie_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV115Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV114Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV113Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV115Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV117Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV116Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV119Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV118Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV120Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV121Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV122Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV123Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV125Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV124Pedidos_dis___wwds_13_tfclinom ,
                                           AV127Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV126Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV129Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV128Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV131Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV130Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV132Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV133Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV134Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV135Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV137Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV136Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV138Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV139Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV140Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV142Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV143Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV145Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV144Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV146Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV147Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV106DisCod) ,
                                           AV104DisFecFrom ,
                                           AV105DisFecTo ,
                                           AV107DisFecClifrom ,
                                           AV108DisFecClito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV36OrderedDsc) ,
                                           AV112Pedidos_dis___wwds_1_filterfulltext ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV113Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV113Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV116Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV116Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV118Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV118Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV124Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV124Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV126Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV126Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV128Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV128Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV130Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV130Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV136Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV136Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV140Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV140Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV144Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV144Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor H022C2 */
      pr_default.execute(0, new Object[] {A396EmprCod, lV113Pedidos_dis___wwds_2_tfdisusrcod, AV114Pedidos_dis___wwds_3_tfdisusrcod_sel, lV116Pedidos_dis___wwds_5_tfdisclinum, AV117Pedidos_dis___wwds_6_tfdisclinum_sel, lV118Pedidos_dis___wwds_7_tfdisenccli, AV119Pedidos_dis___wwds_8_tfdisenccli_sel, AV120Pedidos_dis___wwds_9_tfdisfecent, AV121Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV122Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV123Pedidos_dis___wwds_12_tfclicod_to), lV124Pedidos_dis___wwds_13_tfclinom, AV125Pedidos_dis___wwds_14_tfclinom_sel, lV126Pedidos_dis___wwds_15_tfdisartcod, AV127Pedidos_dis___wwds_16_tfdisartcod_sel, lV128Pedidos_dis___wwds_17_tfdisartdsc, AV129Pedidos_dis___wwds_18_tfdisartdsc_sel, lV130Pedidos_dis___wwds_19_tfdiscolnom, AV131Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV132Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV133Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV134Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV135Pedidos_dis___wwds_24_tfdistipcol_to), lV136Pedidos_dis___wwds_25_tfdisnomcli, AV137Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV138Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV139Pedidos_dis___wwds_28_tfdisnumcli_to), lV140Pedidos_dis___wwds_29_tfmaqcoddis, AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV142Pedidos_dis___wwds_31_tfdisnumuni, AV143Pedidos_dis___wwds_32_tfdisnumuni_to, lV144Pedidos_dis___wwds_33_tfdisunimed, AV145Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV146Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV147Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV106DisCod), AV104DisFecFrom, AV105DisFecTo, AV107DisFecClifrom, AV108DisFecClito});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10887Cod_Idtx = H022C2_A10887Cod_Idtx[0] ;
         n10887Cod_Idtx = H022C2_n10887Cod_Idtx[0] ;
         A374DisNumPie = H022C2_A374DisNumPie[0] ;
         A392DisUniMed = H022C2_A392DisUniMed[0] ;
         A375DisNumUni = H022C2_A375DisNumUni[0] ;
         A1122MaqCodDis = H022C2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = H022C2_n1122MaqCodDis[0] ;
         A1196DisNumCli = H022C2_A1196DisNumCli[0] ;
         A1195DisNomCli = H022C2_A1195DisNomCli[0] ;
         A390DisTipCol = H022C2_A390DisTipCol[0] ;
         n390DisTipCol = H022C2_n390DisTipCol[0] ;
         A363DisColNum = H022C2_A363DisColNum[0] ;
         n363DisColNum = H022C2_n363DisColNum[0] ;
         A362DisColNom = H022C2_A362DisColNom[0] ;
         n362DisColNom = H022C2_n362DisColNom[0] ;
         A337DisArtDsc = H022C2_A337DisArtDsc[0] ;
         A335DisArtCod = H022C2_A335DisArtCod[0] ;
         A279CliNom = H022C2_A279CliNom[0] ;
         A252CliCod = H022C2_A252CliCod[0] ;
         A371DisFecEnt = H022C2_A371DisFecEnt[0] ;
         A369DisFec = H022C2_A369DisFec[0] ;
         A370DisFecCli = H022C2_A370DisFecCli[0] ;
         A361DisCod = H022C2_A361DisCod[0] ;
         A4813DisEncCli = H022C2_A4813DisEncCli[0] ;
         A360DisCliNum = H022C2_A360DisCliNum[0] ;
         A367DisEst = H022C2_A367DisEst[0] ;
         A4348DisUsrCod = H022C2_A4348DisUsrCod[0] ;
         A757PriCod = H022C2_A757PriCod[0] ;
         A279CliNom = H022C2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV112Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf22C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(68) ;
      /* Execute user event: Refresh */
      e2322C2 ();
      nGXsfl_68_idx = 1 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
      bGXsfl_68_Refreshing = true ;
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
         subsflControlProps_682( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(A367DisEst) ,
                                              AV115Pedidos_dis___wwds_4_tfdisest_sels ,
                                              AV114Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                              AV113Pedidos_dis___wwds_2_tfdisusrcod ,
                                              Integer.valueOf(AV115Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                              AV117Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                              AV116Pedidos_dis___wwds_5_tfdisclinum ,
                                              AV119Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                              AV118Pedidos_dis___wwds_7_tfdisenccli ,
                                              AV120Pedidos_dis___wwds_9_tfdisfecent ,
                                              AV121Pedidos_dis___wwds_10_tfdisfecent_to ,
                                              Integer.valueOf(AV122Pedidos_dis___wwds_11_tfclicod) ,
                                              Integer.valueOf(AV123Pedidos_dis___wwds_12_tfclicod_to) ,
                                              AV125Pedidos_dis___wwds_14_tfclinom_sel ,
                                              AV124Pedidos_dis___wwds_13_tfclinom ,
                                              AV127Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                              AV126Pedidos_dis___wwds_15_tfdisartcod ,
                                              AV129Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                              AV128Pedidos_dis___wwds_17_tfdisartdsc ,
                                              AV131Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                              AV130Pedidos_dis___wwds_19_tfdiscolnom ,
                                              Integer.valueOf(AV132Pedidos_dis___wwds_21_tfdiscolnum) ,
                                              Integer.valueOf(AV133Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                              Byte.valueOf(AV134Pedidos_dis___wwds_23_tfdistipcol) ,
                                              Byte.valueOf(AV135Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                              AV137Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                              AV136Pedidos_dis___wwds_25_tfdisnomcli ,
                                              Integer.valueOf(AV138Pedidos_dis___wwds_27_tfdisnumcli) ,
                                              Integer.valueOf(AV139Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                              AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                              AV140Pedidos_dis___wwds_29_tfmaqcoddis ,
                                              AV142Pedidos_dis___wwds_31_tfdisnumuni ,
                                              AV143Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                              AV145Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                              AV144Pedidos_dis___wwds_33_tfdisunimed ,
                                              Short.valueOf(AV146Pedidos_dis___wwds_35_tfdisnumpie) ,
                                              Short.valueOf(AV147Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                              Integer.valueOf(AV106DisCod) ,
                                              AV104DisFecFrom ,
                                              AV105DisFecTo ,
                                              AV107DisFecClifrom ,
                                              AV108DisFecClito ,
                                              A4348DisUsrCod ,
                                              A360DisCliNum ,
                                              A4813DisEncCli ,
                                              A371DisFecEnt ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A335DisArtCod ,
                                              A337DisArtDsc ,
                                              A362DisColNom ,
                                              Integer.valueOf(A363DisColNum) ,
                                              Byte.valueOf(A390DisTipCol) ,
                                              A1195DisNomCli ,
                                              Integer.valueOf(A1196DisNumCli) ,
                                              A1122MaqCodDis ,
                                              A375DisNumUni ,
                                              A392DisUniMed ,
                                              Short.valueOf(A374DisNumPie) ,
                                              Integer.valueOf(A361DisCod) ,
                                              A369DisFec ,
                                              A370DisFecCli ,
                                              Short.valueOf(AV34OrderedBy) ,
                                              Boolean.valueOf(AV36OrderedDsc) ,
                                              AV112Pedidos_dis___wwds_1_filterfulltext ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV113Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV113Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
         lV116Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV116Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
         lV118Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV118Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
         lV124Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV124Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
         lV126Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV126Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
         lV128Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV128Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
         lV130Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV130Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
         lV136Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV136Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
         lV140Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV140Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
         lV144Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV144Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
         /* Using cursor H022C3 */
         pr_default.execute(1, new Object[] {A396EmprCod, lV113Pedidos_dis___wwds_2_tfdisusrcod, AV114Pedidos_dis___wwds_3_tfdisusrcod_sel, lV116Pedidos_dis___wwds_5_tfdisclinum, AV117Pedidos_dis___wwds_6_tfdisclinum_sel, lV118Pedidos_dis___wwds_7_tfdisenccli, AV119Pedidos_dis___wwds_8_tfdisenccli_sel, AV120Pedidos_dis___wwds_9_tfdisfecent, AV121Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV122Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV123Pedidos_dis___wwds_12_tfclicod_to), lV124Pedidos_dis___wwds_13_tfclinom, AV125Pedidos_dis___wwds_14_tfclinom_sel, lV126Pedidos_dis___wwds_15_tfdisartcod, AV127Pedidos_dis___wwds_16_tfdisartcod_sel, lV128Pedidos_dis___wwds_17_tfdisartdsc, AV129Pedidos_dis___wwds_18_tfdisartdsc_sel, lV130Pedidos_dis___wwds_19_tfdiscolnom, AV131Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV132Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV133Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV134Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV135Pedidos_dis___wwds_24_tfdistipcol_to), lV136Pedidos_dis___wwds_25_tfdisnomcli, AV137Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV138Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV139Pedidos_dis___wwds_28_tfdisnumcli_to), lV140Pedidos_dis___wwds_29_tfmaqcoddis, AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV142Pedidos_dis___wwds_31_tfdisnumuni, AV143Pedidos_dis___wwds_32_tfdisnumuni_to, lV144Pedidos_dis___wwds_33_tfdisunimed, AV145Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV146Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV147Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV106DisCod), AV104DisFecFrom, AV105DisFecTo, AV107DisFecClifrom, AV108DisFecClito});
         nGXsfl_68_idx = 1 ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A10887Cod_Idtx = H022C3_A10887Cod_Idtx[0] ;
            n10887Cod_Idtx = H022C3_n10887Cod_Idtx[0] ;
            A374DisNumPie = H022C3_A374DisNumPie[0] ;
            A392DisUniMed = H022C3_A392DisUniMed[0] ;
            A375DisNumUni = H022C3_A375DisNumUni[0] ;
            A1122MaqCodDis = H022C3_A1122MaqCodDis[0] ;
            n1122MaqCodDis = H022C3_n1122MaqCodDis[0] ;
            A1196DisNumCli = H022C3_A1196DisNumCli[0] ;
            A1195DisNomCli = H022C3_A1195DisNomCli[0] ;
            A390DisTipCol = H022C3_A390DisTipCol[0] ;
            n390DisTipCol = H022C3_n390DisTipCol[0] ;
            A363DisColNum = H022C3_A363DisColNum[0] ;
            n363DisColNum = H022C3_n363DisColNum[0] ;
            A362DisColNom = H022C3_A362DisColNom[0] ;
            n362DisColNom = H022C3_n362DisColNom[0] ;
            A337DisArtDsc = H022C3_A337DisArtDsc[0] ;
            A335DisArtCod = H022C3_A335DisArtCod[0] ;
            A279CliNom = H022C3_A279CliNom[0] ;
            A252CliCod = H022C3_A252CliCod[0] ;
            A371DisFecEnt = H022C3_A371DisFecEnt[0] ;
            A369DisFec = H022C3_A369DisFec[0] ;
            A370DisFecCli = H022C3_A370DisFecCli[0] ;
            A361DisCod = H022C3_A361DisCod[0] ;
            A4813DisEncCli = H022C3_A4813DisEncCli[0] ;
            A360DisCliNum = H022C3_A360DisCliNum[0] ;
            A367DisEst = H022C3_A367DisEst[0] ;
            A4348DisUsrCod = H022C3_A4348DisUsrCod[0] ;
            A757PriCod = H022C3_A757PriCod[0] ;
            A279CliNom = H022C3_A279CliNom[0] ;
            if ( (GXutil.strcmp("", AV112Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV112Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV112Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               e2422C2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(68) ;
         wb22C0( ) ;
      }
      bGXsfl_68_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22C2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV148Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV102moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISEST"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, localUtil.format( DecimalUtil.doubleToDec(A367DisEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISARTCOD"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( A335DisArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISARTDSC"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( A337DisArtDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISFEC"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, A369DisFec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISUNIMED"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( A392DisUniMed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_COD_IDTX"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( A10887Cod_Idtx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRICOD"+"_"+sGXsfl_68_idx, getSecureSignedToken( sGXsfl_68_idx, GXutil.rtrim( localUtil.format( A757PriCod, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV7UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV6Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      AV112Pedidos_dis___wwds_1_filterfulltext = AV22FilterFullText ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = AV82TFDisUsrCod ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = AV56TFDisEst_Sels ;
      AV116Pedidos_dis___wwds_5_tfdisclinum = AV85TFDisCliNum ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = AV86TFDisCliNum_Sel ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = AV87TFDisEncCli ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = AV88TFDisEncCli_Sel ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = AV63TFDisFecEnt ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = AV64TFDisFecEnt_To ;
      AV122Pedidos_dis___wwds_11_tfclicod = AV41TFCliCod ;
      AV123Pedidos_dis___wwds_12_tfclicod_to = AV42TFCliCod_To ;
      AV124Pedidos_dis___wwds_13_tfclinom = AV43TFCliNom ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = AV44TFCliNom_Sel ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = AV45TFDisArtCod ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = AV46TFDisArtCod_Sel ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = AV47TFDisArtDsc ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = AV48TFDisArtDsc_Sel ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = AV51TFDisColNom ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV132Pedidos_dis___wwds_21_tfdiscolnum = AV53TFDisColNum ;
      AV133Pedidos_dis___wwds_22_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV134Pedidos_dis___wwds_23_tfdistipcol = AV65TFDisTipCol ;
      AV135Pedidos_dis___wwds_24_tfdistipcol_to = AV66TFDisTipCol_To ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = AV89TFDisNomCli ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = AV90TFDisNomCli_Sel ;
      AV138Pedidos_dis___wwds_27_tfdisnumcli = AV91TFDisNumCli ;
      AV139Pedidos_dis___wwds_28_tfdisnumcli_to = AV92TFDisNumCli_To ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = AV93TFMaqCodDis ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV94TFMaqCodDis_Sel ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = AV97TFDisNumUni ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = AV98TFDisNumUni_To ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = AV99TFDisUniMed ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = AV100TFDisUniMed_Sel ;
      AV146Pedidos_dis___wwds_35_tfdisnumpie = AV95TFDisNumPie ;
      AV147Pedidos_dis___wwds_36_tfdisnumpie_to = AV96TFDisNumPie_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV106DisCod, AV107DisFecClifrom, AV108DisFecClito, AV104DisFecFrom, AV105DisFecTo, A396EmprCod, AV31ManageFiltersExecutionStep, AV8ColumnsSelector, AV22FilterFullText, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV56TFDisEst_Sels, AV85TFDisCliNum, AV86TFDisCliNum_Sel, AV87TFDisEncCli, AV88TFDisEncCli_Sel, AV63TFDisFecEnt, AV64TFDisFecEnt_To, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV45TFDisArtCod, AV46TFDisArtCod_Sel, AV47TFDisArtDsc, AV48TFDisArtDsc_Sel, AV51TFDisColNom, AV52TFDisColNom_Sel, AV53TFDisColNum, AV54TFDisColNum_To, AV65TFDisTipCol, AV66TFDisTipCol_To, AV89TFDisNomCli, AV90TFDisNomCli_Sel, AV91TFDisNumCli, AV92TFDisNumCli_To, AV93TFMaqCodDis, AV94TFMaqCodDis_Sel, AV97TFDisNumUni, AV98TFDisNumUni_To, AV99TFDisUniMed, AV100TFDisUniMed_Sel, AV95TFDisNumPie, AV96TFDisNumPie_To, AV148Pgmname, AV34OrderedBy, AV36OrderedDsc, AV102moda21, AV7UsurCod, AV6Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV112Pedidos_dis___wwds_1_filterfulltext = AV22FilterFullText ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = AV82TFDisUsrCod ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = AV56TFDisEst_Sels ;
      AV116Pedidos_dis___wwds_5_tfdisclinum = AV85TFDisCliNum ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = AV86TFDisCliNum_Sel ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = AV87TFDisEncCli ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = AV88TFDisEncCli_Sel ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = AV63TFDisFecEnt ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = AV64TFDisFecEnt_To ;
      AV122Pedidos_dis___wwds_11_tfclicod = AV41TFCliCod ;
      AV123Pedidos_dis___wwds_12_tfclicod_to = AV42TFCliCod_To ;
      AV124Pedidos_dis___wwds_13_tfclinom = AV43TFCliNom ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = AV44TFCliNom_Sel ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = AV45TFDisArtCod ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = AV46TFDisArtCod_Sel ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = AV47TFDisArtDsc ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = AV48TFDisArtDsc_Sel ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = AV51TFDisColNom ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV132Pedidos_dis___wwds_21_tfdiscolnum = AV53TFDisColNum ;
      AV133Pedidos_dis___wwds_22_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV134Pedidos_dis___wwds_23_tfdistipcol = AV65TFDisTipCol ;
      AV135Pedidos_dis___wwds_24_tfdistipcol_to = AV66TFDisTipCol_To ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = AV89TFDisNomCli ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = AV90TFDisNomCli_Sel ;
      AV138Pedidos_dis___wwds_27_tfdisnumcli = AV91TFDisNumCli ;
      AV139Pedidos_dis___wwds_28_tfdisnumcli_to = AV92TFDisNumCli_To ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = AV93TFMaqCodDis ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV94TFMaqCodDis_Sel ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = AV97TFDisNumUni ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = AV98TFDisNumUni_To ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = AV99TFDisUniMed ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = AV100TFDisUniMed_Sel ;
      AV146Pedidos_dis___wwds_35_tfdisnumpie = AV95TFDisNumPie ;
      AV147Pedidos_dis___wwds_36_tfdisnumpie_to = AV96TFDisNumPie_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV106DisCod, AV107DisFecClifrom, AV108DisFecClito, AV104DisFecFrom, AV105DisFecTo, A396EmprCod, AV31ManageFiltersExecutionStep, AV8ColumnsSelector, AV22FilterFullText, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV56TFDisEst_Sels, AV85TFDisCliNum, AV86TFDisCliNum_Sel, AV87TFDisEncCli, AV88TFDisEncCli_Sel, AV63TFDisFecEnt, AV64TFDisFecEnt_To, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV45TFDisArtCod, AV46TFDisArtCod_Sel, AV47TFDisArtDsc, AV48TFDisArtDsc_Sel, AV51TFDisColNom, AV52TFDisColNom_Sel, AV53TFDisColNum, AV54TFDisColNum_To, AV65TFDisTipCol, AV66TFDisTipCol_To, AV89TFDisNomCli, AV90TFDisNomCli_Sel, AV91TFDisNumCli, AV92TFDisNumCli_To, AV93TFMaqCodDis, AV94TFMaqCodDis_Sel, AV97TFDisNumUni, AV98TFDisNumUni_To, AV99TFDisUniMed, AV100TFDisUniMed_Sel, AV95TFDisNumPie, AV96TFDisNumPie_To, AV148Pgmname, AV34OrderedBy, AV36OrderedDsc, AV102moda21, AV7UsurCod, AV6Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV112Pedidos_dis___wwds_1_filterfulltext = AV22FilterFullText ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = AV82TFDisUsrCod ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = AV56TFDisEst_Sels ;
      AV116Pedidos_dis___wwds_5_tfdisclinum = AV85TFDisCliNum ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = AV86TFDisCliNum_Sel ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = AV87TFDisEncCli ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = AV88TFDisEncCli_Sel ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = AV63TFDisFecEnt ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = AV64TFDisFecEnt_To ;
      AV122Pedidos_dis___wwds_11_tfclicod = AV41TFCliCod ;
      AV123Pedidos_dis___wwds_12_tfclicod_to = AV42TFCliCod_To ;
      AV124Pedidos_dis___wwds_13_tfclinom = AV43TFCliNom ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = AV44TFCliNom_Sel ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = AV45TFDisArtCod ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = AV46TFDisArtCod_Sel ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = AV47TFDisArtDsc ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = AV48TFDisArtDsc_Sel ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = AV51TFDisColNom ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV132Pedidos_dis___wwds_21_tfdiscolnum = AV53TFDisColNum ;
      AV133Pedidos_dis___wwds_22_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV134Pedidos_dis___wwds_23_tfdistipcol = AV65TFDisTipCol ;
      AV135Pedidos_dis___wwds_24_tfdistipcol_to = AV66TFDisTipCol_To ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = AV89TFDisNomCli ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = AV90TFDisNomCli_Sel ;
      AV138Pedidos_dis___wwds_27_tfdisnumcli = AV91TFDisNumCli ;
      AV139Pedidos_dis___wwds_28_tfdisnumcli_to = AV92TFDisNumCli_To ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = AV93TFMaqCodDis ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV94TFMaqCodDis_Sel ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = AV97TFDisNumUni ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = AV98TFDisNumUni_To ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = AV99TFDisUniMed ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = AV100TFDisUniMed_Sel ;
      AV146Pedidos_dis___wwds_35_tfdisnumpie = AV95TFDisNumPie ;
      AV147Pedidos_dis___wwds_36_tfdisnumpie_to = AV96TFDisNumPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV106DisCod, AV107DisFecClifrom, AV108DisFecClito, AV104DisFecFrom, AV105DisFecTo, A396EmprCod, AV31ManageFiltersExecutionStep, AV8ColumnsSelector, AV22FilterFullText, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV56TFDisEst_Sels, AV85TFDisCliNum, AV86TFDisCliNum_Sel, AV87TFDisEncCli, AV88TFDisEncCli_Sel, AV63TFDisFecEnt, AV64TFDisFecEnt_To, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV45TFDisArtCod, AV46TFDisArtCod_Sel, AV47TFDisArtDsc, AV48TFDisArtDsc_Sel, AV51TFDisColNom, AV52TFDisColNom_Sel, AV53TFDisColNum, AV54TFDisColNum_To, AV65TFDisTipCol, AV66TFDisTipCol_To, AV89TFDisNomCli, AV90TFDisNomCli_Sel, AV91TFDisNumCli, AV92TFDisNumCli_To, AV93TFMaqCodDis, AV94TFMaqCodDis_Sel, AV97TFDisNumUni, AV98TFDisNumUni_To, AV99TFDisUniMed, AV100TFDisUniMed_Sel, AV95TFDisNumPie, AV96TFDisNumPie_To, AV148Pgmname, AV34OrderedBy, AV36OrderedDsc, AV102moda21, AV7UsurCod, AV6Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV112Pedidos_dis___wwds_1_filterfulltext = AV22FilterFullText ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = AV82TFDisUsrCod ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = AV56TFDisEst_Sels ;
      AV116Pedidos_dis___wwds_5_tfdisclinum = AV85TFDisCliNum ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = AV86TFDisCliNum_Sel ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = AV87TFDisEncCli ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = AV88TFDisEncCli_Sel ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = AV63TFDisFecEnt ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = AV64TFDisFecEnt_To ;
      AV122Pedidos_dis___wwds_11_tfclicod = AV41TFCliCod ;
      AV123Pedidos_dis___wwds_12_tfclicod_to = AV42TFCliCod_To ;
      AV124Pedidos_dis___wwds_13_tfclinom = AV43TFCliNom ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = AV44TFCliNom_Sel ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = AV45TFDisArtCod ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = AV46TFDisArtCod_Sel ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = AV47TFDisArtDsc ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = AV48TFDisArtDsc_Sel ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = AV51TFDisColNom ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV132Pedidos_dis___wwds_21_tfdiscolnum = AV53TFDisColNum ;
      AV133Pedidos_dis___wwds_22_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV134Pedidos_dis___wwds_23_tfdistipcol = AV65TFDisTipCol ;
      AV135Pedidos_dis___wwds_24_tfdistipcol_to = AV66TFDisTipCol_To ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = AV89TFDisNomCli ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = AV90TFDisNomCli_Sel ;
      AV138Pedidos_dis___wwds_27_tfdisnumcli = AV91TFDisNumCli ;
      AV139Pedidos_dis___wwds_28_tfdisnumcli_to = AV92TFDisNumCli_To ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = AV93TFMaqCodDis ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV94TFMaqCodDis_Sel ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = AV97TFDisNumUni ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = AV98TFDisNumUni_To ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = AV99TFDisUniMed ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = AV100TFDisUniMed_Sel ;
      AV146Pedidos_dis___wwds_35_tfdisnumpie = AV95TFDisNumPie ;
      AV147Pedidos_dis___wwds_36_tfdisnumpie_to = AV96TFDisNumPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV106DisCod, AV107DisFecClifrom, AV108DisFecClito, AV104DisFecFrom, AV105DisFecTo, A396EmprCod, AV31ManageFiltersExecutionStep, AV8ColumnsSelector, AV22FilterFullText, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV56TFDisEst_Sels, AV85TFDisCliNum, AV86TFDisCliNum_Sel, AV87TFDisEncCli, AV88TFDisEncCli_Sel, AV63TFDisFecEnt, AV64TFDisFecEnt_To, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV45TFDisArtCod, AV46TFDisArtCod_Sel, AV47TFDisArtDsc, AV48TFDisArtDsc_Sel, AV51TFDisColNom, AV52TFDisColNom_Sel, AV53TFDisColNum, AV54TFDisColNum_To, AV65TFDisTipCol, AV66TFDisTipCol_To, AV89TFDisNomCli, AV90TFDisNomCli_Sel, AV91TFDisNumCli, AV92TFDisNumCli_To, AV93TFMaqCodDis, AV94TFMaqCodDis_Sel, AV97TFDisNumUni, AV98TFDisNumUni_To, AV99TFDisUniMed, AV100TFDisUniMed_Sel, AV95TFDisNumPie, AV96TFDisNumPie_To, AV148Pgmname, AV34OrderedBy, AV36OrderedDsc, AV102moda21, AV7UsurCod, AV6Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV112Pedidos_dis___wwds_1_filterfulltext = AV22FilterFullText ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = AV82TFDisUsrCod ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = AV56TFDisEst_Sels ;
      AV116Pedidos_dis___wwds_5_tfdisclinum = AV85TFDisCliNum ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = AV86TFDisCliNum_Sel ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = AV87TFDisEncCli ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = AV88TFDisEncCli_Sel ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = AV63TFDisFecEnt ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = AV64TFDisFecEnt_To ;
      AV122Pedidos_dis___wwds_11_tfclicod = AV41TFCliCod ;
      AV123Pedidos_dis___wwds_12_tfclicod_to = AV42TFCliCod_To ;
      AV124Pedidos_dis___wwds_13_tfclinom = AV43TFCliNom ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = AV44TFCliNom_Sel ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = AV45TFDisArtCod ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = AV46TFDisArtCod_Sel ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = AV47TFDisArtDsc ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = AV48TFDisArtDsc_Sel ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = AV51TFDisColNom ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV132Pedidos_dis___wwds_21_tfdiscolnum = AV53TFDisColNum ;
      AV133Pedidos_dis___wwds_22_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV134Pedidos_dis___wwds_23_tfdistipcol = AV65TFDisTipCol ;
      AV135Pedidos_dis___wwds_24_tfdistipcol_to = AV66TFDisTipCol_To ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = AV89TFDisNomCli ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = AV90TFDisNomCli_Sel ;
      AV138Pedidos_dis___wwds_27_tfdisnumcli = AV91TFDisNumCli ;
      AV139Pedidos_dis___wwds_28_tfdisnumcli_to = AV92TFDisNumCli_To ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = AV93TFMaqCodDis ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV94TFMaqCodDis_Sel ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = AV97TFDisNumUni ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = AV98TFDisNumUni_To ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = AV99TFDisUniMed ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = AV100TFDisUniMed_Sel ;
      AV146Pedidos_dis___wwds_35_tfdisnumpie = AV95TFDisNumPie ;
      AV147Pedidos_dis___wwds_36_tfdisnumpie_to = AV96TFDisNumPie_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV106DisCod, AV107DisFecClifrom, AV108DisFecClito, AV104DisFecFrom, AV105DisFecTo, A396EmprCod, AV31ManageFiltersExecutionStep, AV8ColumnsSelector, AV22FilterFullText, AV82TFDisUsrCod, AV83TFDisUsrCod_Sel, AV56TFDisEst_Sels, AV85TFDisCliNum, AV86TFDisCliNum_Sel, AV87TFDisEncCli, AV88TFDisEncCli_Sel, AV63TFDisFecEnt, AV64TFDisFecEnt_To, AV41TFCliCod, AV42TFCliCod_To, AV43TFCliNom, AV44TFCliNom_Sel, AV45TFDisArtCod, AV46TFDisArtCod_Sel, AV47TFDisArtDsc, AV48TFDisArtDsc_Sel, AV51TFDisColNom, AV52TFDisColNom_Sel, AV53TFDisColNum, AV54TFDisColNum_To, AV65TFDisTipCol, AV66TFDisTipCol_To, AV89TFDisNomCli, AV90TFDisNomCli_Sel, AV91TFDisNumCli, AV92TFDisNumCli_To, AV93TFMaqCodDis, AV94TFMaqCodDis_Sel, AV97TFDisNumUni, AV98TFDisNumUni_To, AV99TFDisUniMed, AV100TFDisUniMed_Sel, AV95TFDisNumPie, AV96TFDisNumPie_To, AV148Pgmname, AV34OrderedBy, AV36OrderedDsc, AV102moda21, AV7UsurCod, AV6Station, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV148Pgmname = "Pedidos.Dis___WW" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup22C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2222C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV30ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV17DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV8ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV24GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV25GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDiscod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDiscod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISCOD");
            GX_FocusControl = edtavDiscod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV106DisCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106DisCod), 8, 0));
         }
         else
         {
            AV106DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavDiscod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106DisCod), 8, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDisfecclifrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDISFECCLIFROM");
            GX_FocusControl = edtavDisfecclifrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV107DisFecClifrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107DisFecClifrom", localUtil.format(AV107DisFecClifrom, "99/99/99"));
         }
         else
         {
            AV107DisFecClifrom = localUtil.ctod( httpContext.cgiGet( edtavDisfecclifrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107DisFecClifrom", localUtil.format(AV107DisFecClifrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDisfecclito_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDISFECCLITO");
            GX_FocusControl = edtavDisfecclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV108DisFecClito = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108DisFecClito", localUtil.format(AV108DisFecClito, "99/99/99"));
         }
         else
         {
            AV108DisFecClito = localUtil.ctod( httpContext.cgiGet( edtavDisfecclito_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108DisFecClito", localUtil.format(AV108DisFecClito, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDisfecfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDISFECFROM");
            GX_FocusControl = edtavDisfecfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104DisFecFrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104DisFecFrom", localUtil.format(AV104DisFecFrom, "99/99/99"));
         }
         else
         {
            AV104DisFecFrom = localUtil.ctod( httpContext.cgiGet( edtavDisfecfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104DisFecFrom", localUtil.format(AV104DisFecFrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDisfecto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDISFECTO");
            GX_FocusControl = edtavDisfecto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV105DisFecTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105DisFecTo", localUtil.format(AV105DisFecTo, "99/99/99"));
         }
         else
         {
            AV105DisFecTo = localUtil.ctod( httpContext.cgiGet( edtavDisfecto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105DisFecTo", localUtil.format(AV105DisFecTo, "99/99/99"));
         }
         AV22FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22FilterFullText", AV22FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECENTAUXDATE");
            GX_FocusControl = edtavDdo_disfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15DDO_DisFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15DDO_DisFecEntAuxDate", localUtil.format(AV15DDO_DisFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV15DDO_DisFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15DDO_DisFecEntAuxDate", localUtil.format(AV15DDO_DisFecEntAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfecentauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECENTAUXDATETO");
            GX_FocusControl = edtavDdo_disfecentauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DDO_DisFecEntAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DDO_DisFecEntAuxDateTo", localUtil.format(AV16DDO_DisFecEntAuxDateTo, "99/99/99"));
         }
         else
         {
            AV16DDO_DisFecEntAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfecentauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DDO_DisFecEntAuxDateTo", localUtil.format(AV16DDO_DisFecEntAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV106DisCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vDISFECCLIFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV107DisFecClifrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vDISFECCLITO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV108DisFecClito)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vDISFECFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV104DisFecFrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vDISFECTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV105DisFecTo)) ) )
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
      e2222C2 ();
      if (returnInSub) return;
   }

   public void e2222C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV6Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      dis___ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Station", AV6Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV5EmprNom ;
      GXv_char4[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char2, GXv_char3, GXv_char4) ;
      dis___ww_impl.this.A396EmprCod = GXv_char2[0] ;
      dis___ww_impl.this.AV5EmprNom = GXv_char3[0] ;
      dis___ww_impl.this.AV7UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7UsurCod", AV7UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      GXt_int5 = (byte)(AV102moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      dis___ww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV102moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV102moda21), "ZZZ9")));
      AV104DisFecFrom = GXutil.dadd(Gx_date,-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104DisFecFrom", localUtil.format(AV104DisFecFrom, "99/99/99"));
      AV105DisFecTo = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105DisFecTo", localUtil.format(AV105DisFecTo, "99/99/99"));
      GXt_char1 = AV6Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      dis___ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV6Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Station", AV6Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Station, ""))));
      GXv_char4[0] = AV101EmprCod ;
      GXv_char3[0] = AV5EmprNom ;
      GXv_char2[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char4, GXv_char3, GXv_char2) ;
      dis___ww_impl.this.AV101EmprCod = GXv_char4[0] ;
      dis___ww_impl.this.AV5EmprNom = GXv_char3[0] ;
      dis___ww_impl.this.AV7UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7UsurCod", AV7UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV28HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Pedidos", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV34OrderedBy < 1 )
      {
         AV34OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV17DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV17DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV77WebSessionReset = java.util.UUID.randomUUID( ).toString() ;
      AV76WebSessionDatos = java.util.UUID.randomUUID( ).toString() ;
   }

   public void e2322C2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV78WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV78WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV31ManageFiltersExecutionStep == 1 )
      {
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV31ManageFiltersExecutionStep == 2 )
      {
         AV31ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV40Session.getValue("Pedidos.Dis___WWColumnsSelector"), "") != 0 )
      {
         AV10ColumnsSelectorXML = AV40Session.getValue("Pedidos.Dis___WWColumnsSelector") ;
         AV8ColumnsSelector.fromxml(AV10ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtDisUsrCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUsrCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUsrCod_Visible), 5, 0), !bGXsfl_68_Refreshing);
      cmbDisEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbDisEst.getVisible(), 5, 0), !bGXsfl_68_Refreshing);
      edtDisCliNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCliNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisEncCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEncCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEncCli_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecCli_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisFecEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecEnt_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNum_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisTipCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCol_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNomCli_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisNumCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCli_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtMaqCodDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodDis_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisNumUni_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumUni_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisUniMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Visible), 5, 0), !bGXsfl_68_Refreshing);
      edtDisNumPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV8ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Visible), 5, 0), !bGXsfl_68_Refreshing);
      AV24GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridCurrentPage), 10, 0));
      AV25GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridPageCount), 10, 0));
      AV112Pedidos_dis___wwds_1_filterfulltext = AV22FilterFullText ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = AV82TFDisUsrCod ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = AV83TFDisUsrCod_Sel ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = AV56TFDisEst_Sels ;
      AV116Pedidos_dis___wwds_5_tfdisclinum = AV85TFDisCliNum ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = AV86TFDisCliNum_Sel ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = AV87TFDisEncCli ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = AV88TFDisEncCli_Sel ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = AV63TFDisFecEnt ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = AV64TFDisFecEnt_To ;
      AV122Pedidos_dis___wwds_11_tfclicod = AV41TFCliCod ;
      AV123Pedidos_dis___wwds_12_tfclicod_to = AV42TFCliCod_To ;
      AV124Pedidos_dis___wwds_13_tfclinom = AV43TFCliNom ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = AV44TFCliNom_Sel ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = AV45TFDisArtCod ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = AV46TFDisArtCod_Sel ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = AV47TFDisArtDsc ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = AV48TFDisArtDsc_Sel ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = AV51TFDisColNom ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV132Pedidos_dis___wwds_21_tfdiscolnum = AV53TFDisColNum ;
      AV133Pedidos_dis___wwds_22_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV134Pedidos_dis___wwds_23_tfdistipcol = AV65TFDisTipCol ;
      AV135Pedidos_dis___wwds_24_tfdistipcol_to = AV66TFDisTipCol_To ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = AV89TFDisNomCli ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = AV90TFDisNomCli_Sel ;
      AV138Pedidos_dis___wwds_27_tfdisnumcli = AV91TFDisNumCli ;
      AV139Pedidos_dis___wwds_28_tfdisnumcli_to = AV92TFDisNumCli_To ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = AV93TFMaqCodDis ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV94TFMaqCodDis_Sel ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = AV97TFDisNumUni ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = AV98TFDisNumUni_To ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = AV99TFDisUniMed ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = AV100TFDisUniMed_Sel ;
      AV146Pedidos_dis___wwds_35_tfdisnumpie = AV95TFDisNumPie ;
      AV147Pedidos_dis___wwds_36_tfdisnumpie_to = AV96TFDisNumPie_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ManageFiltersData", AV30ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
   }

   public void e1222C2( )
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
         AV37PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV37PageToGo) ;
      }
   }

   public void e1322C2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1422C2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV34OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         AV36OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedDsc", AV36OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUsrCod") == 0 )
         {
            AV82TFDisUsrCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFDisUsrCod", AV82TFDisUsrCod);
            AV83TFDisUsrCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFDisUsrCod_Sel", AV83TFDisUsrCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisEst") == 0 )
         {
            AV57TFDisEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFDisEst_SelsJson", AV57TFDisEst_SelsJson);
            AV56TFDisEst_Sels.fromJSonString(GXutil.strReplace( AV57TFDisEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCliNum") == 0 )
         {
            AV85TFDisCliNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFDisCliNum", AV85TFDisCliNum);
            AV86TFDisCliNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum_Sel", AV86TFDisCliNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisEncCli") == 0 )
         {
            AV87TFDisEncCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisEncCli", AV87TFDisEncCli);
            AV88TFDisEncCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli_Sel", AV88TFDisEncCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFecEnt") == 0 )
         {
            AV63TFDisFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFDisFecEnt", localUtil.format(AV63TFDisFecEnt, "99/99/99"));
            AV64TFDisFecEnt_To = localUtil.ctod( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFecEnt_To", localUtil.format(AV64TFDisFecEnt_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV41TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCod), 6, 0));
            AV42TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV43TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliNom", AV43TFCliNom);
            AV44TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliNom_Sel", AV44TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtCod") == 0 )
         {
            AV45TFDisArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisArtCod", AV45TFDisArtCod);
            AV46TFDisArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisArtCod_Sel", AV46TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtDsc") == 0 )
         {
            AV47TFDisArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisArtDsc", AV47TFDisArtDsc);
            AV48TFDisArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisArtDsc_Sel", AV48TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNom") == 0 )
         {
            AV51TFDisColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisColNom", AV51TFDisColNom);
            AV52TFDisColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDisColNom_Sel", AV52TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNum") == 0 )
         {
            AV53TFDisColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisColNum), 6, 0));
            AV54TFDisColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisTipCol") == 0 )
         {
            AV65TFDisTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFDisTipCol), 2, 0));
            AV66TFDisTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNomCli") == 0 )
         {
            AV89TFDisNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFDisNomCli", AV89TFDisNomCli);
            AV90TFDisNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFDisNomCli_Sel", AV90TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNumCli") == 0 )
         {
            AV91TFDisNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFDisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFDisNumCli), 6, 0));
            AV92TFDisNumCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFDisNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFDisNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodDis") == 0 )
         {
            AV93TFMaqCodDis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFMaqCodDis", AV93TFMaqCodDis);
            AV94TFMaqCodDis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFMaqCodDis_Sel", AV94TFMaqCodDis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNumUni") == 0 )
         {
            AV97TFDisNumUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFDisNumUni", GXutil.ltrimstr( AV97TFDisNumUni, 9, 2));
            AV98TFDisNumUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFDisNumUni_To", GXutil.ltrimstr( AV98TFDisNumUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUniMed") == 0 )
         {
            AV99TFDisUniMed = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFDisUniMed", AV99TFDisUniMed);
            AV100TFDisUniMed_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFDisUniMed_Sel", AV100TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNumPie") == 0 )
         {
            AV95TFDisNumPie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFDisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFDisNumPie), 4, 0));
            AV96TFDisNumPie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFDisNumPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96TFDisNumPie_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFDisEst_Sels", AV56TFDisEst_Sels);
   }

   private void e2422C2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( A367DisEst == 1 )
         {
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos", ""), "fas fa-cogs", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Almacen", ""), "fas fa-warehouse", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fas fa-comment-dots", "", "", "", "", "", "", ""), (short)(0));
         if ( AV102moda21 == 1 )
         {
            cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Programas de Tingimento", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( A367DisEst == 1 )
         {
            cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fas fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(68) ;
         }
         sendrow_682( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_68_Refreshing )
      {
         httpContext.doAjaxLoad(68, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV23GridActions, 4, 0)) );
   }

   public void e1522C2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV10ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV8ColumnsSelector.fromJSonString(AV10ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis___WWColumnsSelector", ((GXutil.strcmp("", AV10ColumnsSelectorXML)==0) ? "" : AV8ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ManageFiltersData", AV30ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
   }

   public void e1122C2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Pedidos.Dis___WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV148Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Pedidos.Dis___WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV32ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Pedidos.Dis___WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         dis___ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV32ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV32ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV148Pgmname+"GridState", AV32ManageFiltersXml) ;
            AV26GridState.fromxml(AV32ManageFiltersXml, null, null);
            AV34OrderedBy = AV26GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
            AV36OrderedDsc = AV26GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedDsc", AV36OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFDisEst_Sels", AV56TFDisEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ManageFiltersData", AV30ManageFiltersData);
   }

   public void e2522C2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV23GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV23GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV23GridActions == 3 )
      {
         /* Execute user subroutine: 'DO PROCESOS' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV23GridActions == 4 )
      {
         /* Execute user subroutine: 'DO ALMACEN' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV23GridActions == 5 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV23GridActions == 6 )
      {
         /* Execute user subroutine: 'DO PROGRAMATINTE' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV23GridActions == 7 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S252 ();
         if (returnInSub) return;
      }
      AV23GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV23GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ManageFiltersData", AV30ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
   }

   public void e1622C2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8ColumnsSelector", AV8ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30ManageFiltersData", AV30ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
   }

   public void e1722C2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidos.dis__", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e1822C2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV21ExcelFilename ;
      GXv_char3[0] = AV20ErrorMessage ;
      new app.pedidos.dis___wwexport(remoteHandle, context).execute( AV106DisCod, AV107DisFecClifrom, AV108DisFecClito, AV104DisFecFrom, AV105DisFecTo, GXv_char4, GXv_char3) ;
      dis___ww_impl.this.AV21ExcelFilename = GXv_char4[0] ;
      dis___ww_impl.this.AV20ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV21ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV21ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV20ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFDisEst_Sels", AV56TFDisEst_Sels);
   }

   public void e1922C2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.pedidos.dis___wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFDisEst_Sels", AV56TFDisEst_Sels);
   }

   public void e2022C2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.pedidos.dis___wwexportcsv", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV106DisCod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV107DisFecClifrom)),GXutil.URLEncode(GXutil.formatDateParm(AV108DisFecClito)),GXutil.URLEncode(GXutil.formatDateParm(AV104DisFecFrom)),GXutil.URLEncode(GXutil.formatDateParm(AV105DisFecTo))}, new String[] {"DisCod","DisFeccliFrom","DisFecclito","DisFecFrom","DisFecto"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26GridState", AV26GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV56TFDisEst_Sels", AV56TFDisEst_Sels);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV34OrderedBy, 4, 0))+":"+(AV36OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV8ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisUsrCod", "", "Usuario", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisEst", "", "Estado", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisCliNum", "", "Ped. Cli.", true, "") ;
         AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV85TFDisCliNum = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85TFDisCliNum", AV85TFDisCliNum);
         AV86TFDisCliNum_Sel = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum_Sel", AV86TFDisCliNum_Sel);
      }
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisEncCli", "", "Ped. Cli.", true, "") ;
         AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
         AV87TFDisEncCli = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisEncCli", AV87TFDisEncCli);
         AV88TFDisEncCli_Sel = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli_Sel", AV88TFDisEncCli_Sel);
      }
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisCod", "", "Nr.Enc", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisFecCli", "", "Data ped.", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisFec", "", "Data reg.", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisFecEnt", "", "Data entr.", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliCod", "", "Cliente", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "CliNom", "", "Nombre", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisArtCod", "", "Artigo", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisArtDsc", "", "Descripcion", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisColNom", "", "Cor", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisColNum", "", "Cor. Núm", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisTipCol", "", "TC", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisNomCli", "", "Color Cliente", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisNumCli", "", "Numero", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "MaqCodDis", "", "Maquina", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisNumUni", "", "Unidades", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisUniMed", "", "Und.", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV8ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "DisNumPie", "", "Piezas", true, "") ;
      AV8ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV74UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis___WWColumnsSelector", GXv_char4) ;
      dis___ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV74UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV74UserCustomValue)==0) ) )
      {
         AV9ColumnsSelectorAux.fromxml(AV74UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV9ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV8ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV9ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV8ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV30ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Pedidos.Dis___WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV30ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV22FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22FilterFullText", AV22FilterFullText);
      AV82TFDisUsrCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TFDisUsrCod", AV82TFDisUsrCod);
      AV83TFDisUsrCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFDisUsrCod_Sel", AV83TFDisUsrCod_Sel);
      AV56TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV85TFDisCliNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFDisCliNum", AV85TFDisCliNum);
      AV86TFDisCliNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum_Sel", AV86TFDisCliNum_Sel);
      AV87TFDisEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisEncCli", AV87TFDisEncCli);
      AV88TFDisEncCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli_Sel", AV88TFDisEncCli_Sel);
      AV63TFDisFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFDisFecEnt", localUtil.format(AV63TFDisFecEnt, "99/99/99"));
      AV64TFDisFecEnt_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFecEnt_To", localUtil.format(AV64TFDisFecEnt_To, "99/99/99"));
      AV41TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCod), 6, 0));
      AV42TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod_To), 6, 0));
      AV43TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliNom", AV43TFCliNom);
      AV44TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliNom_Sel", AV44TFCliNom_Sel);
      AV45TFDisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisArtCod", AV45TFDisArtCod);
      AV46TFDisArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisArtCod_Sel", AV46TFDisArtCod_Sel);
      AV47TFDisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisArtDsc", AV47TFDisArtDsc);
      AV48TFDisArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisArtDsc_Sel", AV48TFDisArtDsc_Sel);
      AV51TFDisColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisColNom", AV51TFDisColNom);
      AV52TFDisColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFDisColNom_Sel", AV52TFDisColNom_Sel);
      AV53TFDisColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisColNum), 6, 0));
      AV54TFDisColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisColNum_To), 6, 0));
      AV65TFDisTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFDisTipCol), 2, 0));
      AV66TFDisTipCol_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFDisTipCol_To), 2, 0));
      AV89TFDisNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFDisNomCli", AV89TFDisNomCli);
      AV90TFDisNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFDisNomCli_Sel", AV90TFDisNomCli_Sel);
      AV91TFDisNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFDisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFDisNumCli), 6, 0));
      AV92TFDisNumCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFDisNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFDisNumCli_To), 6, 0));
      AV93TFMaqCodDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFMaqCodDis", AV93TFMaqCodDis);
      AV94TFMaqCodDis_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFMaqCodDis_Sel", AV94TFMaqCodDis_Sel);
      AV97TFDisNumUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFDisNumUni", GXutil.ltrimstr( AV97TFDisNumUni, 9, 2));
      AV98TFDisNumUni_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFDisNumUni_To", GXutil.ltrimstr( AV98TFDisNumUni_To, 9, 2));
      AV99TFDisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99TFDisUniMed", AV99TFDisUniMed);
      AV100TFDisUniMed_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFDisUniMed_Sel", AV100TFDisUniMed_Sel);
      AV95TFDisNumPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFDisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFDisNumPie), 4, 0));
      AV96TFDisNumPie_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFDisNumPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96TFDisNumPie_To), 4, 0));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidos.dis__", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.pedidos.dis", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod","VisualizarAcciones","AccionesEnPopup"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( A367DisEst == 3 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pedido en Produccion", ""));
      }
      else
      {
         callWebObject(formatLink("app.pedidos.dis__", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S212( )
   {
      /* 'DO PROCESOS' Routine */
      returnInSub = false ;
      if ( A367DisEst == 3 )
      {
         httpContext.popup(formatLink("app.pedidos.dislin____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A335DisArtCod)),GXutil.URLEncode(GXutil.rtrim(A337DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(A369DisFec)),GXutil.URLEncode(GXutil.rtrim(A392DisUniMed)),GXutil.URLEncode(GXutil.rtrim(A10887Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(A367DisEst,1,0)),GXutil.URLEncode(GXutil.booltostr(false)),GXutil.URLEncode(GXutil.booltostr(false))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.popup(formatLink("app.pedidos.dislin____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A335DisArtCod)),GXutil.URLEncode(GXutil.rtrim(A337DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(A369DisFec)),GXutil.URLEncode(GXutil.rtrim(A392DisUniMed)),GXutil.URLEncode(GXutil.rtrim(A10887Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(A367DisEst,1,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(false))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst","VisualizarAcciones","AccionesEnPopup"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S222( )
   {
      /* 'DO ALMACEN' Routine */
      returnInSub = false ;
      if ( A367DisEst == 3 )
      {
         httpContext.popup(formatLink("app.pedidos.disalb____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A335DisArtCod)),GXutil.URLEncode(GXutil.rtrim(A337DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(A369DisFec)),GXutil.URLEncode(GXutil.rtrim(A392DisUniMed)),GXutil.URLEncode(GXutil.rtrim(A10887Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(A367DisEst,1,0))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.popup(formatLink("app.pedidos.disalb____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A335DisArtCod)),GXutil.URLEncode(GXutil.rtrim(A337DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(A369DisFec)),GXutil.URLEncode(GXutil.rtrim(A392DisUniMed)),GXutil.URLEncode(GXutil.rtrim(A10887Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(A367DisEst,1,0))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S232( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      if ( A367DisEst == 3 )
      {
         httpContext.popup(formatLink("app.pedidos.disobs__", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A757PriCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A335DisArtCod)),GXutil.URLEncode(GXutil.rtrim(A337DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(A369DisFec))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","Barser","Barserdsc","Barfecgen"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      else
      {
         new app.pordlinobs(remoteHandle, context).execute( A396EmprCod, A361DisCod) ;
         httpContext.popup(formatLink("app.pedidos.disobs__wp", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A757PriCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A335DisArtCod)),GXutil.URLEncode(GXutil.rtrim(A337DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(A369DisFec))}, new String[] {"Mode","EmprCod","DisCod","PriCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S242( )
   {
      /* 'DO PROGRAMATINTE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.facturacion.programasdetingimento_3", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom))}, new String[] {"EmprCod","CliCod","CliNom"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV19EmprCod_Selected = A396EmprCod ;
      AV18DisCod_Selected = A361DisCod ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S262( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      if ( A367DisEst == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int14[0] = A361DisCod ;
         new app.pelidis(remoteHandle, context).execute( GXv_char4, GXv_int14) ;
         dis___ww_impl.this.A396EmprCod = GXv_char4[0] ;
         dis___ww_impl.this.A361DisCod = GXv_int14[0] ;
         AV81Inc_obs = httpContext.getMessage( "Eliminación Nº Disposición= ", "") + GXutil.str( A361DisCod, 8, 0) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV148Pgmname, AV7UsurCod, AV6Station, AV81Inc_obs, A361DisCod, (byte)(0), " ") ;
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Pedido en Produccion", ""));
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV40Session.getValue(AV148Pgmname+"GridState"), "") == 0 )
      {
         AV26GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV148Pgmname+"GridState"), null, null);
      }
      else
      {
         AV26GridState.fromxml(AV40Session.getValue(AV148Pgmname+"GridState"), null, null);
      }
      AV34OrderedBy = AV26GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
      AV36OrderedDsc = AV26GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36OrderedDsc", AV36OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV26GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV26GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV26GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV149GXV1 = 1 ;
      while ( AV149GXV1 <= AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV27GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV149GXV1));
         if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV22FilterFullText = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22FilterFullText", AV22FilterFullText);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV82TFDisUsrCod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFDisUsrCod", AV82TFDisUsrCod);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV83TFDisUsrCod_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFDisUsrCod_Sel", AV83TFDisUsrCod_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV57TFDisEst_SelsJson = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFDisEst_SelsJson", AV57TFDisEst_SelsJson);
            AV56TFDisEst_Sels.fromJSonString(AV57TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV85TFDisCliNum = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFDisCliNum", AV85TFDisCliNum);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV86TFDisCliNum_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum_Sel", AV86TFDisCliNum_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV87TFDisEncCli = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisEncCli", AV87TFDisEncCli);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV88TFDisEncCli_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli_Sel", AV88TFDisEncCli_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV63TFDisFecEnt = localUtil.ctod( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFDisFecEnt", localUtil.format(AV63TFDisFecEnt, "99/99/99"));
            AV64TFDisFecEnt_To = localUtil.ctod( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFecEnt_To", localUtil.format(AV64TFDisFecEnt_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV41TFCliCod = (int)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFCliCod), 6, 0));
            AV42TFCliCod_To = (int)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV43TFCliNom = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliNom", AV43TFCliNom);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV44TFCliNom_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliNom_Sel", AV44TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV45TFDisArtCod = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFDisArtCod", AV45TFDisArtCod);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV46TFDisArtCod_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisArtCod_Sel", AV46TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV47TFDisArtDsc = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisArtDsc", AV47TFDisArtDsc);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV48TFDisArtDsc_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisArtDsc_Sel", AV48TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV51TFDisColNom = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisColNom", AV51TFDisColNom);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV52TFDisColNom_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDisColNom_Sel", AV52TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV53TFDisColNum = (int)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFDisColNum), 6, 0));
            AV54TFDisColNum_To = (int)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV65TFDisTipCol = (byte)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFDisTipCol), 2, 0));
            AV66TFDisTipCol_To = (byte)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV89TFDisNomCli = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFDisNomCli", AV89TFDisNomCli);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV90TFDisNomCli_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFDisNomCli_Sel", AV90TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV91TFDisNumCli = (int)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFDisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFDisNumCli), 6, 0));
            AV92TFDisNumCli_To = (int)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFDisNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFDisNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV93TFMaqCodDis = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFMaqCodDis", AV93TFMaqCodDis);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV94TFMaqCodDis_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFMaqCodDis_Sel", AV94TFMaqCodDis_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV97TFDisNumUni = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFDisNumUni", GXutil.ltrimstr( AV97TFDisNumUni, 9, 2));
            AV98TFDisNumUni_To = CommonUtil.decimalVal( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFDisNumUni_To", GXutil.ltrimstr( AV98TFDisNumUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV99TFDisUniMed = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFDisUniMed", AV99TFDisUniMed);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV100TFDisUniMed_Sel = AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFDisUniMed_Sel", AV100TFDisUniMed_Sel);
         }
         else if ( GXutil.strcmp(AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV95TFDisNumPie = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFDisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95TFDisNumPie), 4, 0));
            AV96TFDisNumPie_To = (short)(GXutil.lval( AV27GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFDisNumPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96TFDisNumPie_To), 4, 0));
         }
         AV149GXV1 = (int)(AV149GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFDisUsrCod_Sel)==0), AV83TFDisUsrCod_Sel, GXv_char4) ;
      dis___ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFDisCliNum_Sel)==0), AV86TFDisCliNum_Sel, GXv_char3) ;
      dis___ww_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char16 = "" ;
      GXv_char2[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFDisEncCli_Sel)==0), AV88TFDisEncCli_Sel, GXv_char2) ;
      dis___ww_impl.this.GXt_char16 = GXv_char2[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFCliNom_Sel)==0), AV44TFCliNom_Sel, GXv_char18) ;
      dis___ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFDisArtCod_Sel)==0), AV46TFDisArtCod_Sel, GXv_char20) ;
      dis___ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFDisArtDsc_Sel)==0), AV48TFDisArtDsc_Sel, GXv_char22) ;
      dis___ww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFDisColNom_Sel)==0), AV52TFDisColNom_Sel, GXv_char24) ;
      dis___ww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFDisNomCli_Sel)==0), AV90TFDisNomCli_Sel, GXv_char26) ;
      dis___ww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFMaqCodDis_Sel)==0), AV94TFMaqCodDis_Sel, GXv_char28) ;
      dis___ww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFDisUniMed_Sel)==0), AV100TFDisUniMed_Sel, GXv_char30) ;
      dis___ww_impl.this.GXt_char29 = GXv_char30[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+((AV56TFDisEst_Sels.size()==0) ? "" : AV57TFDisEst_SelsJson)+"|"+GXt_char15+"|"+GXt_char16+"||||||"+GXt_char17+"|"+GXt_char19+"|"+GXt_char21+"|"+GXt_char23+"|||"+GXt_char25+"||"+GXt_char27+"||"+GXt_char29+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFDisUsrCod)==0), AV82TFDisUsrCod, GXv_char30) ;
      dis___ww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV85TFDisCliNum)==0), AV85TFDisCliNum, GXv_char28) ;
      dis___ww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFDisEncCli)==0), AV87TFDisEncCli, GXv_char26) ;
      dis___ww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFCliNom)==0), AV43TFCliNom, GXv_char24) ;
      dis___ww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFDisArtCod)==0), AV45TFDisArtCod, GXv_char22) ;
      dis___ww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFDisArtDsc)==0), AV47TFDisArtDsc, GXv_char20) ;
      dis___ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFDisColNom)==0), AV51TFDisColNom, GXv_char18) ;
      dis___ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFDisNomCli)==0), AV89TFDisNomCli, GXv_char4) ;
      dis___ww_impl.this.GXt_char16 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFMaqCodDis)==0), AV93TFMaqCodDis, GXv_char3) ;
      dis___ww_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV99TFDisUniMed)==0), AV99TFDisUniMed, GXv_char2) ;
      dis___ww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char29+"||"+GXt_char27+"|"+GXt_char25+"||||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63TFDisFecEnt)) ? "" : localUtil.dtoc( AV63TFDisFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV41TFCliCod) ? "" : GXutil.str( AV41TFCliCod, 6, 0))+"|"+GXt_char23+"|"+GXt_char21+"|"+GXt_char19+"|"+GXt_char17+"|"+((0==AV53TFDisColNum) ? "" : GXutil.str( AV53TFDisColNum, 6, 0))+"|"+((0==AV65TFDisTipCol) ? "" : GXutil.str( AV65TFDisTipCol, 2, 0))+"|"+GXt_char16+"|"+((0==AV91TFDisNumCli) ? "" : GXutil.str( AV91TFDisNumCli, 6, 0))+"|"+GXt_char15+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFDisNumUni)==0) ? "" : GXutil.str( AV97TFDisNumUni, 9, 2))+"|"+GXt_char1+"|"+((0==AV95TFDisNumPie) ? "" : GXutil.str( AV95TFDisNumPie, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFDisFecEnt_To)) ? "" : localUtil.dtoc( AV64TFDisFecEnt_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV42TFCliCod_To) ? "" : GXutil.str( AV42TFCliCod_To, 6, 0))+"|||||"+((0==AV54TFDisColNum_To) ? "" : GXutil.str( AV54TFDisColNum_To, 6, 0))+"|"+((0==AV66TFDisTipCol_To) ? "" : GXutil.str( AV66TFDisTipCol_To, 2, 0))+"||"+((0==AV92TFDisNumCli_To) ? "" : GXutil.str( AV92TFDisNumCli_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFDisNumUni_To)==0) ? "" : GXutil.str( AV98TFDisNumUni_To, 9, 2))+"||"+((0==AV96TFDisNumPie_To) ? "" : GXutil.str( AV96TFDisNumPie_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV26GridState.fromxml(AV40Session.getValue(AV148Pgmname+"GridState"), null, null);
      AV26GridState.setgxTv_SdtWWPGridState_Orderedby( AV34OrderedBy );
      AV26GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV36OrderedDsc );
      AV26GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV22FilterFullText)==0), (short)(0), AV22FilterFullText, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISUSRCOD", "", !(GXutil.strcmp("", AV82TFDisUsrCod)==0), (short)(0), AV82TFDisUsrCod, "", !(GXutil.strcmp("", AV83TFDisUsrCod_Sel)==0), AV83TFDisUsrCod_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISEST_SEL", "", !(AV56TFDisEst_Sels.size()==0), (short)(0), AV56TFDisEst_Sels.toJSonString(false), "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISCLINUM", "", !(GXutil.strcmp("", AV85TFDisCliNum)==0), (short)(0), AV85TFDisCliNum, "", !(GXutil.strcmp("", AV86TFDisCliNum_Sel)==0), AV86TFDisCliNum_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISENCCLI", "", !(GXutil.strcmp("", AV87TFDisEncCli)==0), (short)(0), AV87TFDisEncCli, "", !(GXutil.strcmp("", AV88TFDisEncCli_Sel)==0), AV88TFDisEncCli_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISFECENT", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV63TFDisFecEnt))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFDisFecEnt_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV63TFDisFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV64TFDisFecEnt_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFCLICOD", "", !((0==AV41TFCliCod)&&(0==AV42TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV41TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV42TFCliCod_To, 6, 0))) ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFCLINOM", "", !(GXutil.strcmp("", AV43TFCliNom)==0), (short)(0), AV43TFCliNom, "", !(GXutil.strcmp("", AV44TFCliNom_Sel)==0), AV44TFCliNom_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISARTCOD", "", !(GXutil.strcmp("", AV45TFDisArtCod)==0), (short)(0), AV45TFDisArtCod, "", !(GXutil.strcmp("", AV46TFDisArtCod_Sel)==0), AV46TFDisArtCod_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISARTDSC", "", !(GXutil.strcmp("", AV47TFDisArtDsc)==0), (short)(0), AV47TFDisArtDsc, "", !(GXutil.strcmp("", AV48TFDisArtDsc_Sel)==0), AV48TFDisArtDsc_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISCOLNOM", "", !(GXutil.strcmp("", AV51TFDisColNom)==0), (short)(0), AV51TFDisColNom, "", !(GXutil.strcmp("", AV52TFDisColNom_Sel)==0), AV52TFDisColNom_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISCOLNUM", "", !((0==AV53TFDisColNum)&&(0==AV54TFDisColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV53TFDisColNum, 6, 0)), GXutil.trim( GXutil.str( AV54TFDisColNum_To, 6, 0))) ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISTIPCOL", "", !((0==AV65TFDisTipCol)&&(0==AV66TFDisTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV65TFDisTipCol, 2, 0)), GXutil.trim( GXutil.str( AV66TFDisTipCol_To, 2, 0))) ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISNOMCLI", "", !(GXutil.strcmp("", AV89TFDisNomCli)==0), (short)(0), AV89TFDisNomCli, "", !(GXutil.strcmp("", AV90TFDisNomCli_Sel)==0), AV90TFDisNomCli_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISNUMCLI", "", !((0==AV91TFDisNumCli)&&(0==AV92TFDisNumCli_To)), (short)(0), GXutil.trim( GXutil.str( AV91TFDisNumCli, 6, 0)), GXutil.trim( GXutil.str( AV92TFDisNumCli_To, 6, 0))) ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFMAQCODDIS", "", !(GXutil.strcmp("", AV93TFMaqCodDis)==0), (short)(0), AV93TFMaqCodDis, "", !(GXutil.strcmp("", AV94TFMaqCodDis_Sel)==0), AV94TFMaqCodDis_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISNUMUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV97TFDisNumUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFDisNumUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV97TFDisNumUni, 9, 2)), GXutil.trim( GXutil.str( AV98TFDisNumUni_To, 9, 2))) ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISUNIMED", "", !(GXutil.strcmp("", AV99TFDisUniMed)==0), (short)(0), AV99TFDisUniMed, "", !(GXutil.strcmp("", AV100TFDisUniMed_Sel)==0), AV100TFDisUniMed_Sel, "") ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV26GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFDISNUMPIE", "", !((0==AV95TFDisNumPie)&&(0==AV96TFDisNumPie_To)), (short)(0), GXutil.trim( GXutil.str( AV95TFDisNumPie, 4, 0)), GXutil.trim( GXutil.str( AV96TFDisNumPie_To, 4, 0))) ;
      AV26GridState = GXv_SdtWWPGridState31[0] ;
      AV26GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV26GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV148Pgmname+"GridState", AV26GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV72TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV72TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV148Pgmname );
      AV72TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV72TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV28HTTPRequest.getScriptName()+"?"+AV28HTTPRequest.getQuerystring() );
      AV72TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.Dis" );
      AV40Session.setValue("TrnContext", AV72TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e2122C2( )
   {
      /* Discod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV106DisCod > 0 )
      {
         AV107DisFecClifrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107DisFecClifrom", localUtil.format(AV107DisFecClifrom, "99/99/99"));
         AV108DisFecClito = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108DisFecClito", localUtil.format(AV108DisFecClito, "99/99/99"));
         AV104DisFecFrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104DisFecFrom", localUtil.format(AV104DisFecFrom, "99/99/99"));
         AV105DisFecTo = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105DisFecTo", localUtil.format(AV105DisFecTo, "99/99/99"));
      }
      else
      {
         AV104DisFecFrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104DisFecFrom", localUtil.format(AV104DisFecFrom, "99/99/99"));
         AV105DisFecTo = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105DisFecTo", localUtil.format(AV105DisFecTo, "99/99/99"));
      }
      /*  Sending Event outputs  */
   }

   public void wb_table2_106_22C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_106_22C2e( true) ;
      }
      else
      {
         wb_table2_106_22C2e( false) ;
      }
   }

   public void wb_table1_50_22C2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV30ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_55_22C2( true) ;
      }
      else
      {
         wb_table3_55_22C2( false) ;
      }
      return  ;
   }

   public void wb_table3_55_22C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_50_22C2e( true) ;
      }
      else
      {
         wb_table1_50_22C2e( false) ;
      }
   }

   public void wb_table3_55_22C2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV22FilterFullText, GXutil.rtrim( localUtil.format( AV22FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Pedidos\\Dis___WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_55_22C2e( true) ;
      }
      else
      {
         wb_table3_55_22C2e( false) ;
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
      pa22C2( ) ;
      ws22C2( ) ;
      we22C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144617", true, true);
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
      httpContext.AddJavascriptSource("pedidos/dis___ww.js", "?202682116144618", false, true);
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

   public void subsflControlProps_682( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_68_idx );
      chkPriCod.setInternalname( "PRICOD_"+sGXsfl_68_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_68_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_68_idx ;
      cmbDisEst.setInternalname( "DISEST_"+sGXsfl_68_idx );
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_68_idx ;
      edtDisEncCli_Internalname = "DISENCCLI_"+sGXsfl_68_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_68_idx ;
      edtDisFecCli_Internalname = "DISFECCLI_"+sGXsfl_68_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_68_idx ;
      edtDisFecEnt_Internalname = "DISFECENT_"+sGXsfl_68_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_68_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_68_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_68_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_68_idx ;
      edtDisColNom_Internalname = "DISCOLNOM_"+sGXsfl_68_idx ;
      edtDisColNum_Internalname = "DISCOLNUM_"+sGXsfl_68_idx ;
      edtDisTipCol_Internalname = "DISTIPCOL_"+sGXsfl_68_idx ;
      edtDisNomCli_Internalname = "DISNOMCLI_"+sGXsfl_68_idx ;
      edtDisNumCli_Internalname = "DISNUMCLI_"+sGXsfl_68_idx ;
      edtMaqCodDis_Internalname = "MAQCODDIS_"+sGXsfl_68_idx ;
      edtDisNumUni_Internalname = "DISNUMUNI_"+sGXsfl_68_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_68_idx ;
      edtDisNumPie_Internalname = "DISNUMPIE_"+sGXsfl_68_idx ;
      edtCod_Idtx_Internalname = "COD_IDTX_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_682( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_68_fel_idx );
      chkPriCod.setInternalname( "PRICOD_"+sGXsfl_68_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_68_fel_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_68_fel_idx ;
      cmbDisEst.setInternalname( "DISEST_"+sGXsfl_68_fel_idx );
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_68_fel_idx ;
      edtDisEncCli_Internalname = "DISENCCLI_"+sGXsfl_68_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_68_fel_idx ;
      edtDisFecCli_Internalname = "DISFECCLI_"+sGXsfl_68_fel_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_68_fel_idx ;
      edtDisFecEnt_Internalname = "DISFECENT_"+sGXsfl_68_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_68_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_68_fel_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_68_fel_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_68_fel_idx ;
      edtDisColNom_Internalname = "DISCOLNOM_"+sGXsfl_68_fel_idx ;
      edtDisColNum_Internalname = "DISCOLNUM_"+sGXsfl_68_fel_idx ;
      edtDisTipCol_Internalname = "DISTIPCOL_"+sGXsfl_68_fel_idx ;
      edtDisNomCli_Internalname = "DISNOMCLI_"+sGXsfl_68_fel_idx ;
      edtDisNumCli_Internalname = "DISNUMCLI_"+sGXsfl_68_fel_idx ;
      edtMaqCodDis_Internalname = "MAQCODDIS_"+sGXsfl_68_fel_idx ;
      edtDisNumUni_Internalname = "DISNUMUNI_"+sGXsfl_68_fel_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_68_fel_idx ;
      edtDisNumPie_Internalname = "DISNUMPIE_"+sGXsfl_68_fel_idx ;
      edtCod_Idtx_Internalname = "COD_IDTX_"+sGXsfl_68_fel_idx ;
   }

   public void sendrow_682( )
   {
      subsflControlProps_682( ) ;
      wb22C0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_68_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_68_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_68_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV23GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV23GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV23GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_68_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV23GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_68_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRICOD_" + sGXsfl_68_idx ;
         chkPriCod.setName( GXCCtl );
         chkPriCod.setWebtags( "" );
         chkPriCod.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), !bGXsfl_68_Refreshing);
         chkPriCod.setCheckedValue( "0" );
         A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPriCod.getInternalname(),A757PriCod,"","",Integer.valueOf(0),Integer.valueOf(0),"1","",StyleString,ClassString,"WWColumn hidden-xs","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisUsrCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUsrCod_Internalname,GXutil.rtrim( A4348DisUsrCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisUsrCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbDisEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbDisEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DISEST_" + sGXsfl_68_idx ;
            cmbDisEst.setName( GXCCtl );
            cmbDisEst.setWebtags( "" );
            cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
            cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
            if ( cmbDisEst.getItemCount() > 0 )
            {
               A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDisEst,cmbDisEst.getInternalname(),GXutil.trim( GXutil.str( A367DisEst, 1, 0)),Integer.valueOf(1),cmbDisEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbDisEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), !bGXsfl_68_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisCliNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCliNum_Internalname,GXutil.rtrim( A360DisCliNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCliNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisCliNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisEncCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisEncCli_Internalname,GXutil.rtrim( A4813DisEncCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisEncCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFecCli_Internalname,localUtil.format(A370DisFecCli, "99/99/99"),localUtil.format( A370DisFecCli, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFec_Internalname,localUtil.format(A369DisFec, "99/99/99"),localUtil.format( A369DisFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisFecEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFecEnt_Internalname,localUtil.format(A371DisFecEnt, "99/99/99"),localUtil.format( A371DisFecEnt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisFecEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtCod_Internalname,GXutil.rtrim( A335DisArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtDsc_Internalname,GXutil.rtrim( A337DisArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNom_Internalname,GXutil.rtrim( A362DisColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisTipCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisTipCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNomCli_Internalname,GXutil.rtrim( A1195DisNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisNumCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisNumCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCodDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodDis_Internalname,GXutil.rtrim( A1122MaqCodDis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCodDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisNumUni_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumUni_Internalname,GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A375DisNumUni, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisNumUni_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisUniMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUniMed_Internalname,GXutil.rtrim( A392DisUniMed),GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisUniMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisNumPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumPie_Internalname,GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisNumPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCod_Idtx_Internalname,GXutil.rtrim( A10887Cod_Idtx),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCod_Idtx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes22C2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      /* End function sendrow_682 */
   }

   public void startgridcontrol68( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"68\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisUsrCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbDisEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisCliNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisEncCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nr.Enc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisFecCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data ped.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data reg.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisFecEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data entr.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisArtCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisArtDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor. Núm", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisTipCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisNumCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCodDis_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisNumUni_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisUniMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisNumPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A757PriCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4348DisUsrCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisUsrCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbDisEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A360DisCliNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisCliNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4813DisEncCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisEncCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A370DisFecCli, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisFecCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A369DisFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A371DisFecEnt, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisFecEnt_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A335DisArtCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisArtCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A337DisArtDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisArtDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A362DisColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisTipCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1195DisNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisNumCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1122MaqCodDis));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCodDis_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisNumUni_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A392DisUniMed));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisUniMed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisNumPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10887Cod_Idtx));
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
      edtavDiscod_Internalname = "vDISCOD" ;
      edtavDisfecclifrom_Internalname = "vDISFECCLIFROM" ;
      edtavDisfecclito_Internalname = "vDISFECCLITO" ;
      edtavDisfecfrom_Internalname = "vDISFECFROM" ;
      edtavDisfecto_Internalname = "vDISFECTO" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      chkPriCod.setInternalname( "PRICOD" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDisUsrCod_Internalname = "DISUSRCOD" ;
      cmbDisEst.setInternalname( "DISEST" );
      edtDisCliNum_Internalname = "DISCLINUM" ;
      edtDisEncCli_Internalname = "DISENCCLI" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisFecCli_Internalname = "DISFECCLI" ;
      edtDisFec_Internalname = "DISFEC" ;
      edtDisFecEnt_Internalname = "DISFECENT" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDisArtCod_Internalname = "DISARTCOD" ;
      edtDisArtDsc_Internalname = "DISARTDSC" ;
      edtDisColNom_Internalname = "DISCOLNOM" ;
      edtDisColNum_Internalname = "DISCOLNUM" ;
      edtDisTipCol_Internalname = "DISTIPCOL" ;
      edtDisNomCli_Internalname = "DISNOMCLI" ;
      edtDisNumCli_Internalname = "DISNUMCLI" ;
      edtMaqCodDis_Internalname = "MAQCODDIS" ;
      edtDisNumUni_Internalname = "DISNUMUNI" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      edtCod_Idtx_Internalname = "COD_IDTX" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_disfecentauxdate_Internalname = "vDDO_DISFECENTAUXDATE" ;
      edtavDdo_disfecentauxdateto_Internalname = "vDDO_DISFECENTAUXDATETO" ;
      divDdo_disfecentauxdates_Internalname = "DDO_DISFECENTAUXDATES" ;
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
      edtCod_Idtx_Jsonclick = "" ;
      edtDisNumPie_Jsonclick = "" ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisNumUni_Jsonclick = "" ;
      edtMaqCodDis_Jsonclick = "" ;
      edtDisNumCli_Jsonclick = "" ;
      edtDisNomCli_Jsonclick = "" ;
      edtDisTipCol_Jsonclick = "" ;
      edtDisColNum_Jsonclick = "" ;
      edtDisColNom_Jsonclick = "" ;
      edtDisArtDsc_Jsonclick = "" ;
      edtDisArtCod_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtDisFecEnt_Jsonclick = "" ;
      edtDisFec_Jsonclick = "" ;
      edtDisFecCli_Jsonclick = "" ;
      edtDisCod_Jsonclick = "" ;
      edtDisEncCli_Jsonclick = "" ;
      edtDisCliNum_Jsonclick = "" ;
      cmbDisEst.setJsonclick( "" );
      edtDisUsrCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkPriCod.setCaption( "" );
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtDisNumPie_Visible = -1 ;
      edtDisUniMed_Visible = -1 ;
      edtDisNumUni_Visible = -1 ;
      edtMaqCodDis_Visible = -1 ;
      edtDisNumCli_Visible = -1 ;
      edtDisNomCli_Visible = -1 ;
      edtDisTipCol_Visible = -1 ;
      edtDisColNum_Visible = -1 ;
      edtDisColNom_Visible = -1 ;
      edtDisArtDsc_Visible = -1 ;
      edtDisArtCod_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtDisFecEnt_Visible = -1 ;
      edtDisFec_Visible = -1 ;
      edtDisFecCli_Visible = -1 ;
      edtDisCod_Visible = -1 ;
      edtDisEncCli_Visible = -1 ;
      edtDisCliNum_Visible = -1 ;
      cmbDisEst.setVisible( -1 );
      edtDisUsrCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_disfecentauxdateto_Jsonclick = "" ;
      edtavDdo_disfecentauxdate_Jsonclick = "" ;
      edtavDisfecto_Jsonclick = "" ;
      edtavDisfecto_Enabled = 1 ;
      edtavDisfecfrom_Jsonclick = "" ;
      edtavDisfecfrom_Enabled = 1 ;
      edtavDisfecclito_Jsonclick = "" ;
      edtavDisfecclito_Enabled = 1 ;
      edtavDisfecclifrom_Jsonclick = "" ;
      edtavDisfecclifrom_Enabled = 1 ;
      edtavDiscod_Jsonclick = "" ;
      edtavDiscod_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Eliminar?" ;
      Dvelop_confirmpanel_eliminar_Title = httpContext.getMessage( "CONFIRMAR", "") ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "Pedidos.Dis___WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|1:En Pedido,3:En Produccion|||||||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "|T|||||||||||||||||||" ;
      Ddo_grid_Datalisttype = "Dynamic|FixedValues|Dynamic|Dynamic||||||Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic||Dynamic||Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|T|T||||||T|T|T|T|||T||T||T|" ;
      Ddo_grid_Filterisrange = "|||||||T|T|||||T|T||T||T||T" ;
      Ddo_grid_Filtertype = "Character||Character|Character||||Date|Numeric|Character|Character|Character|Character|Numeric|Numeric|Character|Numeric|Character|Numeric|Character|Numeric" ;
      Ddo_grid_Includefilter = "T||T|T||||T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22" ;
      Ddo_grid_Columnids = "3:DisUsrCod|4:DisEst|5:DisCliNum|6:DisEncCli|7:DisCod|8:DisFecCli|9:DisFec|10:DisFecEnt|11:CliCod|12:CliNom|13:DisArtCod|14:DisArtDsc|15:DisColNom|16:DisColNum|17:DisTipCol|18:DisNomCli|19:DisNumCli|20:MaqCodDis|21:DisNumUni|22:DisUniMed|23:DisNumPie" ;
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
      Form.setCaption( httpContext.getMessage( " Pedidos", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_68_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV23GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV23GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23GridActions), 4, 0));
      }
      GXCCtl = "PRICOD_" + sGXsfl_68_idx ;
      chkPriCod.setName( GXCCtl );
      chkPriCod.setWebtags( "" );
      chkPriCod.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), !bGXsfl_68_Refreshing);
      chkPriCod.setCheckedValue( "0" );
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      GXCCtl = "DISEST_" + sGXsfl_68_idx ;
      cmbDisEst.setName( GXCCtl );
      cmbDisEst.setWebtags( "" );
      cmbDisEst.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbDisEst.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbDisEst.getItemCount() > 0 )
      {
         A367DisEst = (byte)(GXutil.lval( cmbDisEst.getValidValue(GXutil.trim( GXutil.str( A367DisEst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV30ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1222C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1322C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1422C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2422C2',iparms:[{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV23GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1522C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV30ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1122C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV30ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2522C2',iparms:[{av:'cmbavGridactions'},{av:'AV23GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A335DisArtCod',fld:'DISARTCOD',pic:'',hsh:true},{av:'A337DisArtDsc',fld:'DISARTDSC',pic:'',hsh:true},{av:'A369DisFec',fld:'DISFEC',pic:'',hsh:true},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!',hsh:true},{av:'A10887Cod_Idtx',fld:'COD_IDTX',pic:'',hsh:true},{av:'A757PriCod',fld:'PRICOD',pic:'9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV23GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV30ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e1622C2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV30ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1722C2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1822C2',iparms:[{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1922C2',iparms:[{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e2022C2',iparms:[{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV26GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV36OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV8ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV82TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV83TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV56TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV85TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV86TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV87TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV88TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV63TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV64TFDisFecEnt_To',fld:'vTFDISFECENT_TO',pic:''},{av:'AV41TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV42TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV43TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV44TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV46TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV47TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV48TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV51TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV52TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV53TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV54TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV66TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV89TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV90TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV91TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV92TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV93TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV94TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV97TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV98TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV99TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV100TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV95TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV96TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV102moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV7UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV6Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV57TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VDISCOD.CONTROLVALUECHANGED","{handler:'e2122C2',iparms:[{av:'AV106DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("VDISCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV107DisFecClifrom',fld:'vDISFECCLIFROM',pic:''},{av:'AV108DisFecClito',fld:'vDISFECCLITO',pic:''},{av:'AV104DisFecFrom',fld:'vDISFECFROM',pic:''},{av:'AV105DisFecTo',fld:'vDISFECTO',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISUSRCOD","{handler:'valid_Disusrcod',iparms:[]");
      setEventMetadata("VALID_DISUSRCOD",",oparms:[]}");
      setEventMetadata("VALID_DISEST","{handler:'valid_Disest',iparms:[]");
      setEventMetadata("VALID_DISEST",",oparms:[]}");
      setEventMetadata("VALID_DISCLINUM","{handler:'valid_Disclinum',iparms:[]");
      setEventMetadata("VALID_DISCLINUM",",oparms:[]}");
      setEventMetadata("VALID_DISENCCLI","{handler:'valid_Disenccli',iparms:[]");
      setEventMetadata("VALID_DISENCCLI",",oparms:[]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_DISARTCOD","{handler:'valid_Disartcod',iparms:[]");
      setEventMetadata("VALID_DISARTCOD",",oparms:[]}");
      setEventMetadata("VALID_DISARTDSC","{handler:'valid_Disartdsc',iparms:[]");
      setEventMetadata("VALID_DISARTDSC",",oparms:[]}");
      setEventMetadata("VALID_DISCOLNOM","{handler:'valid_Discolnom',iparms:[]");
      setEventMetadata("VALID_DISCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_DISCOLNUM","{handler:'valid_Discolnum',iparms:[]");
      setEventMetadata("VALID_DISCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_DISTIPCOL","{handler:'valid_Distipcol',iparms:[]");
      setEventMetadata("VALID_DISTIPCOL",",oparms:[]}");
      setEventMetadata("VALID_DISNOMCLI","{handler:'valid_Disnomcli',iparms:[]");
      setEventMetadata("VALID_DISNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_DISNUMCLI","{handler:'valid_Disnumcli',iparms:[]");
      setEventMetadata("VALID_DISNUMCLI",",oparms:[]}");
      setEventMetadata("VALID_MAQCODDIS","{handler:'valid_Maqcoddis',iparms:[]");
      setEventMetadata("VALID_MAQCODDIS",",oparms:[]}");
      setEventMetadata("VALID_DISNUMUNI","{handler:'valid_Disnumuni',iparms:[]");
      setEventMetadata("VALID_DISNUMUNI",",oparms:[]}");
      setEventMetadata("VALID_DISUNIMED","{handler:'valid_Disunimed',iparms:[]");
      setEventMetadata("VALID_DISUNIMED",",oparms:[]}");
      setEventMetadata("VALID_DISNUMPIE","{handler:'valid_Disnumpie',iparms:[]");
      setEventMetadata("VALID_DISNUMPIE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cod_idtx',iparms:[]");
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
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV107DisFecClifrom = GXutil.nullDate() ;
      AV108DisFecClito = GXutil.nullDate() ;
      AV104DisFecFrom = GXutil.nullDate() ;
      AV105DisFecTo = GXutil.nullDate() ;
      AV8ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV22FilterFullText = "" ;
      AV82TFDisUsrCod = "" ;
      AV83TFDisUsrCod_Sel = "" ;
      AV56TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV85TFDisCliNum = "" ;
      AV86TFDisCliNum_Sel = "" ;
      AV87TFDisEncCli = "" ;
      AV88TFDisEncCli_Sel = "" ;
      AV63TFDisFecEnt = GXutil.nullDate() ;
      AV64TFDisFecEnt_To = GXutil.nullDate() ;
      AV43TFCliNom = "" ;
      AV44TFCliNom_Sel = "" ;
      AV45TFDisArtCod = "" ;
      AV46TFDisArtCod_Sel = "" ;
      AV47TFDisArtDsc = "" ;
      AV48TFDisArtDsc_Sel = "" ;
      AV51TFDisColNom = "" ;
      AV52TFDisColNom_Sel = "" ;
      AV89TFDisNomCli = "" ;
      AV90TFDisNomCli_Sel = "" ;
      AV93TFMaqCodDis = "" ;
      AV94TFMaqCodDis_Sel = "" ;
      AV97TFDisNumUni = DecimalUtil.ZERO ;
      AV98TFDisNumUni_To = DecimalUtil.ZERO ;
      AV99TFDisUniMed = "" ;
      AV100TFDisUniMed_Sel = "" ;
      AV148Pgmname = "" ;
      AV7UsurCod = "" ;
      AV6Station = "" ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV30ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV17DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV26GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV57TFDisEst_SelsJson = "" ;
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV15DDO_DisFecEntAuxDate = GXutil.nullDate() ;
      AV16DDO_DisFecEntAuxDateTo = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A757PriCod = "" ;
      A4348DisUsrCod = "" ;
      A360DisCliNum = "" ;
      A4813DisEncCli = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1122MaqCodDis = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      A10887Cod_Idtx = "" ;
      AV112Pedidos_dis___wwds_1_filterfulltext = "" ;
      AV113Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      AV114Pedidos_dis___wwds_3_tfdisusrcod_sel = "" ;
      AV115Pedidos_dis___wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV116Pedidos_dis___wwds_5_tfdisclinum = "" ;
      AV117Pedidos_dis___wwds_6_tfdisclinum_sel = "" ;
      AV118Pedidos_dis___wwds_7_tfdisenccli = "" ;
      AV119Pedidos_dis___wwds_8_tfdisenccli_sel = "" ;
      AV120Pedidos_dis___wwds_9_tfdisfecent = GXutil.nullDate() ;
      AV121Pedidos_dis___wwds_10_tfdisfecent_to = GXutil.nullDate() ;
      AV124Pedidos_dis___wwds_13_tfclinom = "" ;
      AV125Pedidos_dis___wwds_14_tfclinom_sel = "" ;
      AV126Pedidos_dis___wwds_15_tfdisartcod = "" ;
      AV127Pedidos_dis___wwds_16_tfdisartcod_sel = "" ;
      AV128Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      AV129Pedidos_dis___wwds_18_tfdisartdsc_sel = "" ;
      AV130Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      AV131Pedidos_dis___wwds_20_tfdiscolnom_sel = "" ;
      AV136Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      AV137Pedidos_dis___wwds_26_tfdisnomcli_sel = "" ;
      AV140Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel = "" ;
      AV142Pedidos_dis___wwds_31_tfdisnumuni = DecimalUtil.ZERO ;
      AV143Pedidos_dis___wwds_32_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV144Pedidos_dis___wwds_33_tfdisunimed = "" ;
      AV145Pedidos_dis___wwds_34_tfdisunimed_sel = "" ;
      scmdbuf = "" ;
      lV112Pedidos_dis___wwds_1_filterfulltext = "" ;
      lV113Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      lV116Pedidos_dis___wwds_5_tfdisclinum = "" ;
      lV118Pedidos_dis___wwds_7_tfdisenccli = "" ;
      lV124Pedidos_dis___wwds_13_tfclinom = "" ;
      lV126Pedidos_dis___wwds_15_tfdisartcod = "" ;
      lV128Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      lV130Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      lV136Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      lV140Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      lV144Pedidos_dis___wwds_33_tfdisunimed = "" ;
      H022C2_A396EmprCod = new String[] {""} ;
      H022C2_A10887Cod_Idtx = new String[] {""} ;
      H022C2_n10887Cod_Idtx = new boolean[] {false} ;
      H022C2_A374DisNumPie = new short[1] ;
      H022C2_A392DisUniMed = new String[] {""} ;
      H022C2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H022C2_A1122MaqCodDis = new String[] {""} ;
      H022C2_n1122MaqCodDis = new boolean[] {false} ;
      H022C2_A1196DisNumCli = new int[1] ;
      H022C2_A1195DisNomCli = new String[] {""} ;
      H022C2_A390DisTipCol = new byte[1] ;
      H022C2_n390DisTipCol = new boolean[] {false} ;
      H022C2_A363DisColNum = new int[1] ;
      H022C2_n363DisColNum = new boolean[] {false} ;
      H022C2_A362DisColNom = new String[] {""} ;
      H022C2_n362DisColNom = new boolean[] {false} ;
      H022C2_A337DisArtDsc = new String[] {""} ;
      H022C2_A335DisArtCod = new String[] {""} ;
      H022C2_A279CliNom = new String[] {""} ;
      H022C2_A252CliCod = new int[1] ;
      H022C2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H022C2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H022C2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H022C2_A361DisCod = new int[1] ;
      H022C2_A4813DisEncCli = new String[] {""} ;
      H022C2_A360DisCliNum = new String[] {""} ;
      H022C2_A367DisEst = new byte[1] ;
      H022C2_A4348DisUsrCod = new String[] {""} ;
      H022C2_A757PriCod = new String[] {""} ;
      H022C3_A396EmprCod = new String[] {""} ;
      H022C3_A10887Cod_Idtx = new String[] {""} ;
      H022C3_n10887Cod_Idtx = new boolean[] {false} ;
      H022C3_A374DisNumPie = new short[1] ;
      H022C3_A392DisUniMed = new String[] {""} ;
      H022C3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H022C3_A1122MaqCodDis = new String[] {""} ;
      H022C3_n1122MaqCodDis = new boolean[] {false} ;
      H022C3_A1196DisNumCli = new int[1] ;
      H022C3_A1195DisNomCli = new String[] {""} ;
      H022C3_A390DisTipCol = new byte[1] ;
      H022C3_n390DisTipCol = new boolean[] {false} ;
      H022C3_A363DisColNum = new int[1] ;
      H022C3_n363DisColNum = new boolean[] {false} ;
      H022C3_A362DisColNom = new String[] {""} ;
      H022C3_n362DisColNom = new boolean[] {false} ;
      H022C3_A337DisArtDsc = new String[] {""} ;
      H022C3_A335DisArtCod = new String[] {""} ;
      H022C3_A279CliNom = new String[] {""} ;
      H022C3_A252CliCod = new int[1] ;
      H022C3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H022C3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H022C3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H022C3_A361DisCod = new int[1] ;
      H022C3_A4813DisEncCli = new String[] {""} ;
      H022C3_A360DisCliNum = new String[] {""} ;
      H022C3_A367DisEst = new byte[1] ;
      H022C3_A4348DisUsrCod = new String[] {""} ;
      H022C3_A757PriCod = new String[] {""} ;
      AV5EmprNom = "" ;
      GXv_int6 = new byte[1] ;
      AV101EmprCod = "" ;
      AV28HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV77WebSessionReset = "" ;
      AV76WebSessionDatos = "" ;
      AV78WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV40Session = httpContext.getWebSession();
      AV10ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV32ManageFiltersXml = "" ;
      AV21ExcelFilename = "" ;
      AV20ErrorMessage = "" ;
      AV74UserCustomValue = "" ;
      AV9ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV19EmprCod_Selected = "" ;
      GXv_int14 = new int[1] ;
      AV81Inc_obs = "" ;
      AV27GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState31 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV72TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis___ww__default(),
         new Object[] {
             new Object[] {
            H022C2_A396EmprCod, H022C2_A10887Cod_Idtx, H022C2_n10887Cod_Idtx, H022C2_A374DisNumPie, H022C2_A392DisUniMed, H022C2_A375DisNumUni, H022C2_A1122MaqCodDis, H022C2_n1122MaqCodDis, H022C2_A1196DisNumCli, H022C2_A1195DisNomCli,
            H022C2_A390DisTipCol, H022C2_n390DisTipCol, H022C2_A363DisColNum, H022C2_n363DisColNum, H022C2_A362DisColNom, H022C2_n362DisColNom, H022C2_A337DisArtDsc, H022C2_A335DisArtCod, H022C2_A279CliNom, H022C2_A252CliCod,
            H022C2_A371DisFecEnt, H022C2_A369DisFec, H022C2_A370DisFecCli, H022C2_A361DisCod, H022C2_A4813DisEncCli, H022C2_A360DisCliNum, H022C2_A367DisEst, H022C2_A4348DisUsrCod, H022C2_A757PriCod
            }
            , new Object[] {
            H022C3_A396EmprCod, H022C3_A10887Cod_Idtx, H022C3_n10887Cod_Idtx, H022C3_A374DisNumPie, H022C3_A392DisUniMed, H022C3_A375DisNumUni, H022C3_A1122MaqCodDis, H022C3_n1122MaqCodDis, H022C3_A1196DisNumCli, H022C3_A1195DisNomCli,
            H022C3_A390DisTipCol, H022C3_n390DisTipCol, H022C3_A363DisColNum, H022C3_n363DisColNum, H022C3_A362DisColNom, H022C3_n362DisColNom, H022C3_A337DisArtDsc, H022C3_A335DisArtCod, H022C3_A279CliNom, H022C3_A252CliCod,
            H022C3_A371DisFecEnt, H022C3_A369DisFec, H022C3_A370DisFecCli, H022C3_A361DisCod, H022C3_A4813DisEncCli, H022C3_A360DisCliNum, H022C3_A367DisEst, H022C3_A4348DisUsrCod, H022C3_A757PriCod
            }
         }
      );
      AV148Pgmname = "Pedidos.Dis___WW" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV148Pgmname = "Pedidos.Dis___WW" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV31ManageFiltersExecutionStep ;
   private byte AV65TFDisTipCol ;
   private byte AV66TFDisTipCol_To ;
   private byte gxajaxcallmode ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte nDonePA ;
   private byte AV134Pedidos_dis___wwds_23_tfdistipcol ;
   private byte AV135Pedidos_dis___wwds_24_tfdistipcol_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV95TFDisNumPie ;
   private short AV96TFDisNumPie_To ;
   private short AV34OrderedBy ;
   private short AV102moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV23GridActions ;
   private short A374DisNumPie ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV146Pedidos_dis___wwds_35_tfdisnumpie ;
   private short AV147Pedidos_dis___wwds_36_tfdisnumpie_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_68 ;
   private int nGXsfl_68_idx=1 ;
   private int AV106DisCod ;
   private int AV41TFCliCod ;
   private int AV42TFCliCod_To ;
   private int AV53TFDisColNum ;
   private int AV54TFDisColNum_To ;
   private int AV91TFDisNumCli ;
   private int AV92TFDisNumCli_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavDiscod_Enabled ;
   private int edtavDisfecclifrom_Enabled ;
   private int edtavDisfecclito_Enabled ;
   private int edtavDisfecfrom_Enabled ;
   private int edtavDisfecto_Enabled ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int subGrid_Islastpage ;
   private int AV122Pedidos_dis___wwds_11_tfclicod ;
   private int AV123Pedidos_dis___wwds_12_tfclicod_to ;
   private int AV132Pedidos_dis___wwds_21_tfdiscolnum ;
   private int AV133Pedidos_dis___wwds_22_tfdiscolnum_to ;
   private int AV138Pedidos_dis___wwds_27_tfdisnumcli ;
   private int AV139Pedidos_dis___wwds_28_tfdisnumcli_to ;
   private int AV115Pedidos_dis___wwds_4_tfdisest_sels_size ;
   private int edtDisUsrCod_Visible ;
   private int edtDisCliNum_Visible ;
   private int edtDisEncCli_Visible ;
   private int edtDisCod_Visible ;
   private int edtDisFecCli_Visible ;
   private int edtDisFec_Visible ;
   private int edtDisFecEnt_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtDisArtCod_Visible ;
   private int edtDisArtDsc_Visible ;
   private int edtDisColNom_Visible ;
   private int edtDisColNum_Visible ;
   private int edtDisTipCol_Visible ;
   private int edtDisNomCli_Visible ;
   private int edtDisNumCli_Visible ;
   private int edtMaqCodDis_Visible ;
   private int edtDisNumUni_Visible ;
   private int edtDisUniMed_Visible ;
   private int edtDisNumPie_Visible ;
   private int AV37PageToGo ;
   private int AV18DisCod_Selected ;
   private int GXv_int14[] ;
   private int AV149GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV24GridCurrentPage ;
   private long AV25GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV97TFDisNumUni ;
   private java.math.BigDecimal AV98TFDisNumUni_To ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV142Pedidos_dis___wwds_31_tfdisnumuni ;
   private java.math.BigDecimal AV143Pedidos_dis___wwds_32_tfdisnumuni_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_68_idx="0001" ;
   private String A396EmprCod ;
   private String AV82TFDisUsrCod ;
   private String AV83TFDisUsrCod_Sel ;
   private String AV85TFDisCliNum ;
   private String AV86TFDisCliNum_Sel ;
   private String AV87TFDisEncCli ;
   private String AV88TFDisEncCli_Sel ;
   private String AV43TFCliNom ;
   private String AV44TFCliNom_Sel ;
   private String AV45TFDisArtCod ;
   private String AV46TFDisArtCod_Sel ;
   private String AV47TFDisArtDsc ;
   private String AV48TFDisArtDsc_Sel ;
   private String AV51TFDisColNom ;
   private String AV52TFDisColNom_Sel ;
   private String AV89TFDisNomCli ;
   private String AV90TFDisNomCli_Sel ;
   private String AV93TFMaqCodDis ;
   private String AV94TFMaqCodDis_Sel ;
   private String AV99TFDisUniMed ;
   private String AV100TFDisUniMed_Sel ;
   private String AV148Pgmname ;
   private String AV7UsurCod ;
   private String AV6Station ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String edtavDiscod_Internalname ;
   private String edtavDiscod_Jsonclick ;
   private String edtavDisfecclifrom_Internalname ;
   private String edtavDisfecclifrom_Jsonclick ;
   private String edtavDisfecclito_Internalname ;
   private String edtavDisfecclito_Jsonclick ;
   private String edtavDisfecfrom_Internalname ;
   private String edtavDisfecfrom_Jsonclick ;
   private String edtavDisfecto_Internalname ;
   private String edtavDisfecto_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_disfecentauxdates_Internalname ;
   private String edtavDdo_disfecentauxdate_Internalname ;
   private String edtavDdo_disfecentauxdate_Jsonclick ;
   private String edtavDdo_disfecentauxdateto_Internalname ;
   private String edtavDdo_disfecentauxdateto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A757PriCod ;
   private String edtEmprCod_Internalname ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Internalname ;
   private String A360DisCliNum ;
   private String edtDisCliNum_Internalname ;
   private String A4813DisEncCli ;
   private String edtDisEncCli_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtDisFecCli_Internalname ;
   private String edtDisFec_Internalname ;
   private String edtDisFecEnt_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A335DisArtCod ;
   private String edtDisArtCod_Internalname ;
   private String A337DisArtDsc ;
   private String edtDisArtDsc_Internalname ;
   private String A362DisColNom ;
   private String edtDisColNom_Internalname ;
   private String edtDisColNum_Internalname ;
   private String edtDisTipCol_Internalname ;
   private String A1195DisNomCli ;
   private String edtDisNomCli_Internalname ;
   private String edtDisNumCli_Internalname ;
   private String A1122MaqCodDis ;
   private String edtMaqCodDis_Internalname ;
   private String edtDisNumUni_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Internalname ;
   private String edtDisNumPie_Internalname ;
   private String A10887Cod_Idtx ;
   private String edtCod_Idtx_Internalname ;
   private String AV113Pedidos_dis___wwds_2_tfdisusrcod ;
   private String AV114Pedidos_dis___wwds_3_tfdisusrcod_sel ;
   private String AV116Pedidos_dis___wwds_5_tfdisclinum ;
   private String AV117Pedidos_dis___wwds_6_tfdisclinum_sel ;
   private String AV118Pedidos_dis___wwds_7_tfdisenccli ;
   private String AV119Pedidos_dis___wwds_8_tfdisenccli_sel ;
   private String AV124Pedidos_dis___wwds_13_tfclinom ;
   private String AV125Pedidos_dis___wwds_14_tfclinom_sel ;
   private String AV126Pedidos_dis___wwds_15_tfdisartcod ;
   private String AV127Pedidos_dis___wwds_16_tfdisartcod_sel ;
   private String AV128Pedidos_dis___wwds_17_tfdisartdsc ;
   private String AV129Pedidos_dis___wwds_18_tfdisartdsc_sel ;
   private String AV130Pedidos_dis___wwds_19_tfdiscolnom ;
   private String AV131Pedidos_dis___wwds_20_tfdiscolnom_sel ;
   private String AV136Pedidos_dis___wwds_25_tfdisnomcli ;
   private String AV137Pedidos_dis___wwds_26_tfdisnomcli_sel ;
   private String AV140Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel ;
   private String AV144Pedidos_dis___wwds_33_tfdisunimed ;
   private String AV145Pedidos_dis___wwds_34_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV113Pedidos_dis___wwds_2_tfdisusrcod ;
   private String lV116Pedidos_dis___wwds_5_tfdisclinum ;
   private String lV118Pedidos_dis___wwds_7_tfdisenccli ;
   private String lV124Pedidos_dis___wwds_13_tfclinom ;
   private String lV126Pedidos_dis___wwds_15_tfdisartcod ;
   private String lV128Pedidos_dis___wwds_17_tfdisartdsc ;
   private String lV130Pedidos_dis___wwds_19_tfdiscolnom ;
   private String lV136Pedidos_dis___wwds_25_tfdisnomcli ;
   private String lV140Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String lV144Pedidos_dis___wwds_33_tfdisunimed ;
   private String edtavFilterfulltext_Internalname ;
   private String AV5EmprNom ;
   private String AV101EmprCod ;
   private String AV19EmprCod_Selected ;
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
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String GXt_char15 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtDisUsrCod_Jsonclick ;
   private String edtDisCliNum_Jsonclick ;
   private String edtDisEncCli_Jsonclick ;
   private String edtDisCod_Jsonclick ;
   private String edtDisFecCli_Jsonclick ;
   private String edtDisFec_Jsonclick ;
   private String edtDisFecEnt_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtDisArtCod_Jsonclick ;
   private String edtDisArtDsc_Jsonclick ;
   private String edtDisColNom_Jsonclick ;
   private String edtDisColNum_Jsonclick ;
   private String edtDisTipCol_Jsonclick ;
   private String edtDisNomCli_Jsonclick ;
   private String edtDisNumCli_Jsonclick ;
   private String edtMaqCodDis_Jsonclick ;
   private String edtDisNumUni_Jsonclick ;
   private String edtDisUniMed_Jsonclick ;
   private String edtDisNumPie_Jsonclick ;
   private String edtCod_Idtx_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV107DisFecClifrom ;
   private java.util.Date AV108DisFecClito ;
   private java.util.Date AV104DisFecFrom ;
   private java.util.Date AV105DisFecTo ;
   private java.util.Date AV63TFDisFecEnt ;
   private java.util.Date AV64TFDisFecEnt_To ;
   private java.util.Date Gx_date ;
   private java.util.Date AV15DDO_DisFecEntAuxDate ;
   private java.util.Date AV16DDO_DisFecEntAuxDateTo ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV120Pedidos_dis___wwds_9_tfdisfecent ;
   private java.util.Date AV121Pedidos_dis___wwds_10_tfdisfecent_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV36OrderedDsc ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n1122MaqCodDis ;
   private boolean n10887Cod_Idtx ;
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV57TFDisEst_SelsJson ;
   private String AV10ColumnsSelectorXML ;
   private String AV32ManageFiltersXml ;
   private String AV74UserCustomValue ;
   private String AV22FilterFullText ;
   private String AV112Pedidos_dis___wwds_1_filterfulltext ;
   private String lV112Pedidos_dis___wwds_1_filterfulltext ;
   private String AV77WebSessionReset ;
   private String AV76WebSessionDatos ;
   private String AV21ExcelFilename ;
   private String AV20ErrorMessage ;
   private String AV81Inc_obs ;
   private GXSimpleCollection<Byte> AV56TFDisEst_Sels ;
   private GXSimpleCollection<Byte> AV115Pedidos_dis___wwds_4_tfdisest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV28HTTPRequest ;
   private com.genexus.webpanels.WebSession AV40Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkPriCod ;
   private HTMLChoice cmbDisEst ;
   private IDataStoreProvider pr_default ;
   private String[] H022C2_A396EmprCod ;
   private String[] H022C2_A10887Cod_Idtx ;
   private boolean[] H022C2_n10887Cod_Idtx ;
   private short[] H022C2_A374DisNumPie ;
   private String[] H022C2_A392DisUniMed ;
   private java.math.BigDecimal[] H022C2_A375DisNumUni ;
   private String[] H022C2_A1122MaqCodDis ;
   private boolean[] H022C2_n1122MaqCodDis ;
   private int[] H022C2_A1196DisNumCli ;
   private String[] H022C2_A1195DisNomCli ;
   private byte[] H022C2_A390DisTipCol ;
   private boolean[] H022C2_n390DisTipCol ;
   private int[] H022C2_A363DisColNum ;
   private boolean[] H022C2_n363DisColNum ;
   private String[] H022C2_A362DisColNom ;
   private boolean[] H022C2_n362DisColNom ;
   private String[] H022C2_A337DisArtDsc ;
   private String[] H022C2_A335DisArtCod ;
   private String[] H022C2_A279CliNom ;
   private int[] H022C2_A252CliCod ;
   private java.util.Date[] H022C2_A371DisFecEnt ;
   private java.util.Date[] H022C2_A369DisFec ;
   private java.util.Date[] H022C2_A370DisFecCli ;
   private int[] H022C2_A361DisCod ;
   private String[] H022C2_A4813DisEncCli ;
   private String[] H022C2_A360DisCliNum ;
   private byte[] H022C2_A367DisEst ;
   private String[] H022C2_A4348DisUsrCod ;
   private String[] H022C2_A757PriCod ;
   private String[] H022C3_A396EmprCod ;
   private String[] H022C3_A10887Cod_Idtx ;
   private boolean[] H022C3_n10887Cod_Idtx ;
   private short[] H022C3_A374DisNumPie ;
   private String[] H022C3_A392DisUniMed ;
   private java.math.BigDecimal[] H022C3_A375DisNumUni ;
   private String[] H022C3_A1122MaqCodDis ;
   private boolean[] H022C3_n1122MaqCodDis ;
   private int[] H022C3_A1196DisNumCli ;
   private String[] H022C3_A1195DisNomCli ;
   private byte[] H022C3_A390DisTipCol ;
   private boolean[] H022C3_n390DisTipCol ;
   private int[] H022C3_A363DisColNum ;
   private boolean[] H022C3_n363DisColNum ;
   private String[] H022C3_A362DisColNom ;
   private boolean[] H022C3_n362DisColNom ;
   private String[] H022C3_A337DisArtDsc ;
   private String[] H022C3_A335DisArtCod ;
   private String[] H022C3_A279CliNom ;
   private int[] H022C3_A252CliCod ;
   private java.util.Date[] H022C3_A371DisFecEnt ;
   private java.util.Date[] H022C3_A369DisFec ;
   private java.util.Date[] H022C3_A370DisFecCli ;
   private int[] H022C3_A361DisCod ;
   private String[] H022C3_A4813DisEncCli ;
   private String[] H022C3_A360DisCliNum ;
   private byte[] H022C3_A367DisEst ;
   private String[] H022C3_A4348DisUsrCod ;
   private String[] H022C3_A757PriCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV30ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV8ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV17DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV26GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState31[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV27GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV72TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV78WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class dis___ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H022C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV115Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV114Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV113Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV115Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV117Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV116Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV119Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV118Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV120Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV121Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV122Pedidos_dis___wwds_11_tfclicod ,
                                          int AV123Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV125Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV124Pedidos_dis___wwds_13_tfclinom ,
                                          String AV127Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV126Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV129Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV128Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV131Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV130Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV132Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV133Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV134Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV135Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV137Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV136Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV138Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV139Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV140Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV142Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV143Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV145Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV144Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV146Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV147Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV106DisCod ,
                                          java.util.Date AV104DisFecFrom ,
                                          java.util.Date AV105DisFecTo ,
                                          java.util.Date AV107DisFecClifrom ,
                                          java.util.Date AV108DisFecClito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          short AV34OrderedBy ,
                                          boolean AV36OrderedDsc ,
                                          String AV112Pedidos_dis___wwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[40];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Cod_Idtx, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc," ;
      scmdbuf += " T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisCod, T1.DisEncCli, T1.DisCliNum, T1.DisEst, T1.DisUsrCod, T1.PriCod FROM (TXPDISPOS" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV114Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV113Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
      }
      if ( AV115Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV117Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV116Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV118Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (0==AV122Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (0==AV123Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV126Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (0==AV132Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( ! (0==AV133Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (0==AV134Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! (0==AV135Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV136Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( ! (0==AV138Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( ! (0==AV139Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV140Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int32[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV144Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int32[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int32[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int32[34] = (byte)(1) ;
      }
      if ( ! (0==AV106DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int32[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int32[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105DisFecTo)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int32[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107DisFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int32[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108DisFecClito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int32[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_H022C3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV115Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV114Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV113Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV115Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV117Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV116Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV119Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV118Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV120Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV121Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV122Pedidos_dis___wwds_11_tfclicod ,
                                          int AV123Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV125Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV124Pedidos_dis___wwds_13_tfclinom ,
                                          String AV127Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV126Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV129Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV128Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV131Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV130Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV132Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV133Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV134Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV135Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV137Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV136Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV138Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV139Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV140Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV142Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV143Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV145Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV144Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV146Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV147Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV106DisCod ,
                                          java.util.Date AV104DisFecFrom ,
                                          java.util.Date AV105DisFecTo ,
                                          java.util.Date AV107DisFecClifrom ,
                                          java.util.Date AV108DisFecClito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          short AV34OrderedBy ,
                                          boolean AV36OrderedDsc ,
                                          String AV112Pedidos_dis___wwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[40];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.Cod_Idtx, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc," ;
      scmdbuf += " T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisCod, T1.DisEncCli, T1.DisCliNum, T1.DisEst, T1.DisUsrCod, T1.PriCod FROM (TXPDISPOS" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV114Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV113Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int35[2] = (byte)(1) ;
      }
      if ( AV115Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV117Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV116Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int35[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV118Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int35[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV120Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int35[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV121Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int35[8] = (byte)(1) ;
      }
      if ( ! (0==AV122Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int35[9] = (byte)(1) ;
      }
      if ( ! (0==AV123Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int35[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int35[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV126Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int35[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( ! (0==AV132Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (0==AV133Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( ! (0==AV134Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (0==AV135Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV136Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( ! (0==AV138Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (0==AV139Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV140Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV144Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! (0==AV146Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( ! (0==AV147Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (0==AV106DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV104DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105DisFecTo)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107DisFecClifrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV108DisFecClito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV34OrderedBy == 15 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV34OrderedBy == 16 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV34OrderedBy == 17 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV34OrderedBy == 18 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV34OrderedBy == 19 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV34OrderedBy == 20 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV34OrderedBy == 21 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ! AV36OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV34OrderedBy == 22 ) && ( AV36OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
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
                  return conditional_H022C2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] );
            case 1 :
                  return conditional_H022C3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H022C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H022C3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 26);
               ((String[]) buf[17])[0] = rslt.getString(13, 16);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(18);
               ((int[]) buf[23])[0] = rslt.getInt(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 20);
               ((String[]) buf[25])[0] = rslt.getString(21, 8);
               ((byte[]) buf[26])[0] = rslt.getByte(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 8);
               ((String[]) buf[28])[0] = rslt.getString(24, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 26);
               ((String[]) buf[17])[0] = rslt.getString(13, 16);
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((int[]) buf[19])[0] = rslt.getInt(15);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(18);
               ((int[]) buf[23])[0] = rslt.getInt(19);
               ((String[]) buf[24])[0] = rslt.getString(20, 20);
               ((String[]) buf[25])[0] = rslt.getString(21, 8);
               ((byte[]) buf[26])[0] = rslt.getByte(22);
               ((String[]) buf[27])[0] = rslt.getString(23, 8);
               ((String[]) buf[28])[0] = rslt.getString(24, 1);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[78]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[79]);
               }
               return;
      }
   }

}

