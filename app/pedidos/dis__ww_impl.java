package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis__ww_impl extends GXDataArea
{
   public dis__ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public dis__ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dis__ww_impl.class ));
   }

   public dis__ww_impl( int remoteHandle ,
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV32ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV9ColumnsSelector);
      AV23FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV83TFDisUsrCod = httpContext.GetPar( "TFDisUsrCod") ;
      AV84TFDisUsrCod_Sel = httpContext.GetPar( "TFDisUsrCod_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV57TFDisEst_Sels);
      AV86TFDisCliNum = httpContext.GetPar( "TFDisCliNum") ;
      AV87TFDisCliNum_Sel = httpContext.GetPar( "TFDisCliNum_Sel") ;
      AV88TFDisEncCli = httpContext.GetPar( "TFDisEncCli") ;
      AV89TFDisEncCli_Sel = httpContext.GetPar( "TFDisEncCli_Sel") ;
      AV50TFDisCod = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod"))) ;
      AV51TFDisCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisCod_To"))) ;
      AV62TFDisFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFDisFecCli")) ;
      AV59TFDisFec = localUtil.parseDateParm( httpContext.GetPar( "TFDisFec")) ;
      AV64TFDisFecEnt = localUtil.parseDateParm( httpContext.GetPar( "TFDisFecEnt")) ;
      AV42TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV43TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV44TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV45TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV46TFDisArtCod = httpContext.GetPar( "TFDisArtCod") ;
      AV47TFDisArtCod_Sel = httpContext.GetPar( "TFDisArtCod_Sel") ;
      AV48TFDisArtDsc = httpContext.GetPar( "TFDisArtDsc") ;
      AV49TFDisArtDsc_Sel = httpContext.GetPar( "TFDisArtDsc_Sel") ;
      AV52TFDisColNom = httpContext.GetPar( "TFDisColNom") ;
      AV53TFDisColNom_Sel = httpContext.GetPar( "TFDisColNom_Sel") ;
      AV54TFDisColNum = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum"))) ;
      AV55TFDisColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisColNum_To"))) ;
      AV66TFDisTipCol = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol"))) ;
      AV67TFDisTipCol_To = (byte)(GXutil.lval( httpContext.GetPar( "TFDisTipCol_To"))) ;
      AV90TFDisNomCli = httpContext.GetPar( "TFDisNomCli") ;
      AV91TFDisNomCli_Sel = httpContext.GetPar( "TFDisNomCli_Sel") ;
      AV92TFDisNumCli = (int)(GXutil.lval( httpContext.GetPar( "TFDisNumCli"))) ;
      AV93TFDisNumCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFDisNumCli_To"))) ;
      AV94TFMaqCodDis = httpContext.GetPar( "TFMaqCodDis") ;
      AV95TFMaqCodDis_Sel = httpContext.GetPar( "TFMaqCodDis_Sel") ;
      AV96TFDisNumPie = (short)(GXutil.lval( httpContext.GetPar( "TFDisNumPie"))) ;
      AV97TFDisNumPie_To = (short)(GXutil.lval( httpContext.GetPar( "TFDisNumPie_To"))) ;
      AV98TFDisNumUni = CommonUtil.decimalVal( httpContext.GetPar( "TFDisNumUni"), ".") ;
      AV99TFDisNumUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDisNumUni_To"), ".") ;
      AV100TFDisUniMed = httpContext.GetPar( "TFDisUniMed") ;
      AV101TFDisUniMed_Sel = httpContext.GetPar( "TFDisUniMed_Sel") ;
      AV104Pgmname = httpContext.GetPar( "Pgmname") ;
      AV35OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV37OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV8UsurCod = httpContext.GetPar( "UsurCod") ;
      AV7Station = httpContext.GetPar( "Station") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV32ManageFiltersExecutionStep, AV9ColumnsSelector, AV23FilterFullText, AV83TFDisUsrCod, AV84TFDisUsrCod_Sel, AV57TFDisEst_Sels, AV86TFDisCliNum, AV87TFDisCliNum_Sel, AV88TFDisEncCli, AV89TFDisEncCli_Sel, AV50TFDisCod, AV51TFDisCod_To, AV62TFDisFecCli, AV59TFDisFec, AV64TFDisFecEnt, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFDisArtCod, AV47TFDisArtCod_Sel, AV48TFDisArtDsc, AV49TFDisArtDsc_Sel, AV52TFDisColNom, AV53TFDisColNom_Sel, AV54TFDisColNum, AV55TFDisColNum_To, AV66TFDisTipCol, AV67TFDisTipCol_To, AV90TFDisNomCli, AV91TFDisNomCli_Sel, AV92TFDisNumCli, AV93TFDisNumCli_To, AV94TFMaqCodDis, AV95TFMaqCodDis_Sel, AV96TFDisNumPie, AV97TFDisNumPie_To, AV98TFDisNumUni, AV99TFDisNumUni_To, AV100TFDisUniMed, AV101TFDisUniMed_Sel, AV104Pgmname, AV35OrderedBy, AV37OrderedDsc, AV8UsurCod, AV7Station) ;
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
      pa1XL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1XL2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.dis__ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Dis__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dis__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV9ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV32ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUSRCOD", GXutil.rtrim( AV83TFDisUsrCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUSRCOD_SEL", GXutil.rtrim( AV84TFDisUsrCod_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFDISEST_SELS", AV57TFDisEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFDISEST_SELS", AV57TFDisEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCLINUM", GXutil.rtrim( AV86TFDisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCLINUM_SEL", GXutil.rtrim( AV87TFDisCliNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISENCCLI", GXutil.rtrim( AV88TFDisEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISENCCLI_SEL", GXutil.rtrim( AV89TFDisEncCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOD", GXutil.ltrim( localUtil.ntoc( AV50TFDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOD_TO", GXutil.ltrim( localUtil.ntoc( AV51TFDisCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFECCLI", localUtil.dtoc( AV62TFDisFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFEC", localUtil.dtoc( AV59TFDisFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISFECENT", localUtil.dtoc( AV64TFDisFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV42TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV43TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV44TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV45TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD", GXutil.rtrim( AV46TFDisArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTCOD_SEL", GXutil.rtrim( AV47TFDisArtCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTDSC", GXutil.rtrim( AV48TFDisArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISARTDSC_SEL", GXutil.rtrim( AV49TFDisArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNOM", GXutil.rtrim( AV52TFDisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNOM_SEL", GXutil.rtrim( AV53TFDisColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNUM", GXutil.ltrim( localUtil.ntoc( AV54TFDisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV55TFDisColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISTIPCOL", GXutil.ltrim( localUtil.ntoc( AV66TFDisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISTIPCOL_TO", GXutil.ltrim( localUtil.ntoc( AV67TFDisTipCol_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNOMCLI", GXutil.rtrim( AV90TFDisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNOMCLI_SEL", GXutil.rtrim( AV91TFDisNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMCLI", GXutil.ltrim( localUtil.ntoc( AV92TFDisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV93TFDisNumCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODDIS", GXutil.rtrim( AV94TFMaqCodDis));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODDIS_SEL", GXutil.rtrim( AV95TFMaqCodDis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMPIE", GXutil.ltrim( localUtil.ntoc( AV96TFDisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMPIE_TO", GXutil.ltrim( localUtil.ntoc( AV97TFDisNumPie_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMUNI", GXutil.ltrim( localUtil.ntoc( AV98TFDisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISNUMUNI_TO", GXutil.ltrim( localUtil.ntoc( AV99TFDisNumUni_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUNIMED", GXutil.rtrim( AV100TFDisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISUNIMED_SEL", GXutil.rtrim( AV101TFDisUniMed_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV35OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV37OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV27GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV27GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDISEST_SELSJSON", AV58TFDisEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV7Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVISUALIZARACCIONES", AV85VisualizarAcciones);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV20EmprCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV19DisCod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
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
         we1XL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1XL2( ) ;
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
      return formatLink("app.pedidos.dis__ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.Dis__WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Pedidos", "") ;
   }

   public void wb1XL0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1XL2( true) ;
      }
      else
      {
         wb_table1_27_1XL2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1XL2e( boolean wbgen )
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
         startgridcontrol45( ) ;
      }
      if ( wbEnd == 45 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_45 = (int)(nGXsfl_45_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0076"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0076"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_45_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0076"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV104Pgmname), GXutil.rtrim( localUtil.format( AV104Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\Dis__WW.htm");
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
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV9ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_87_1XL2( true) ;
      }
      else
      {
         wb_table2_87_1XL2( false) ;
      }
      return  ;
   }

   public void wb_table2_87_1XL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_disfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfeccliauxdate_Internalname, localUtil.format(AV14DDO_DisFecCliAuxDate, "99/99/99"), localUtil.format( AV14DDO_DisFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_disfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfecauxdate_Internalname, localUtil.format(AV12DDO_DisFecAuxDate, "99/99/99"), localUtil.format( AV12DDO_DisFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_disfecentauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_disfecentauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_disfecentauxdate_Internalname, localUtil.format(AV16DDO_DisFecEntAuxDate, "99/99/99"), localUtil.format( AV16DDO_DisFecEntAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_disfecentauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_disfecentauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\Dis__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 45 )
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

   public void start1XL2( )
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
      strup1XL0( ) ;
   }

   public void ws1XL2( )
   {
      start1XL2( ) ;
      evt1XL2( ) ;
   }

   public void evt1XL2( )
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
                           e111XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e171XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e181XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e191XL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e201XL2 ();
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
                           nGXsfl_45_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_452( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV24GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridActions), 4, 0));
                           AV81DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV81DetailWebComponent);
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
                           A374DisNumPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDisNumPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A375DisNumUni = localUtil.ctond( httpContext.cgiGet( edtDisNumUni_Internalname)) ;
                           A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e211XL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e221XL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231XL2 ();
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
                     if ( nCmpId == 76 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0076") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0076", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1XL2( )
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

   public void pa1XL2( )
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
      subsflControlProps_452( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         sendrow_452( ) ;
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 byte AV32ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ,
                                 String AV23FilterFullText ,
                                 String AV83TFDisUsrCod ,
                                 String AV84TFDisUsrCod_Sel ,
                                 GXSimpleCollection<Byte> AV57TFDisEst_Sels ,
                                 String AV86TFDisCliNum ,
                                 String AV87TFDisCliNum_Sel ,
                                 String AV88TFDisEncCli ,
                                 String AV89TFDisEncCli_Sel ,
                                 int AV50TFDisCod ,
                                 int AV51TFDisCod_To ,
                                 java.util.Date AV62TFDisFecCli ,
                                 java.util.Date AV59TFDisFec ,
                                 java.util.Date AV64TFDisFecEnt ,
                                 int AV42TFCliCod ,
                                 int AV43TFCliCod_To ,
                                 String AV44TFCliNom ,
                                 String AV45TFCliNom_Sel ,
                                 String AV46TFDisArtCod ,
                                 String AV47TFDisArtCod_Sel ,
                                 String AV48TFDisArtDsc ,
                                 String AV49TFDisArtDsc_Sel ,
                                 String AV52TFDisColNom ,
                                 String AV53TFDisColNom_Sel ,
                                 int AV54TFDisColNum ,
                                 int AV55TFDisColNum_To ,
                                 byte AV66TFDisTipCol ,
                                 byte AV67TFDisTipCol_To ,
                                 String AV90TFDisNomCli ,
                                 String AV91TFDisNomCli_Sel ,
                                 int AV92TFDisNumCli ,
                                 int AV93TFDisNumCli_To ,
                                 String AV94TFMaqCodDis ,
                                 String AV95TFMaqCodDis_Sel ,
                                 short AV96TFDisNumPie ,
                                 short AV97TFDisNumPie_To ,
                                 java.math.BigDecimal AV98TFDisNumUni ,
                                 java.math.BigDecimal AV99TFDisNumUni_To ,
                                 String AV100TFDisUniMed ,
                                 String AV101TFDisUniMed_Sel ,
                                 String AV104Pgmname ,
                                 short AV35OrderedBy ,
                                 boolean AV37OrderedDsc ,
                                 String AV8UsurCod ,
                                 String AV7Station )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e221XL2 ();
      GRID_nCurrentRecord = 0 ;
      rf1XL2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Dis__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\dis__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A367DisEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISEST", GXutil.ltrim( localUtil.ntoc( A367DisEst, (byte)(1), (byte)(0), ".", "")));
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
      rf1XL2( ) ;
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
      AV104Pgmname = "Pedidos.Dis__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV107Pedidos_dis__wwds_1_filterfulltext = AV23FilterFullText ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = AV83TFDisUsrCod ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = AV84TFDisUsrCod_Sel ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = AV57TFDisEst_Sels ;
      AV111Pedidos_dis__wwds_5_tfdisclinum = AV86TFDisCliNum ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = AV87TFDisCliNum_Sel ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = AV88TFDisEncCli ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = AV89TFDisEncCli_Sel ;
      AV115Pedidos_dis__wwds_9_tfdiscod = AV50TFDisCod ;
      AV116Pedidos_dis__wwds_10_tfdiscod_to = AV51TFDisCod_To ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = AV62TFDisFecCli ;
      AV118Pedidos_dis__wwds_12_tfdisfec = AV59TFDisFec ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = AV64TFDisFecEnt ;
      AV120Pedidos_dis__wwds_14_tfclicod = AV42TFCliCod ;
      AV121Pedidos_dis__wwds_15_tfclicod_to = AV43TFCliCod_To ;
      AV122Pedidos_dis__wwds_16_tfclinom = AV44TFCliNom ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = AV45TFCliNom_Sel ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = AV46TFDisArtCod ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = AV48TFDisArtDsc ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = AV52TFDisColNom ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = AV53TFDisColNom_Sel ;
      AV130Pedidos_dis__wwds_24_tfdiscolnum = AV54TFDisColNum ;
      AV131Pedidos_dis__wwds_25_tfdiscolnum_to = AV55TFDisColNum_To ;
      AV132Pedidos_dis__wwds_26_tfdistipcol = AV66TFDisTipCol ;
      AV133Pedidos_dis__wwds_27_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = AV90TFDisNomCli ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = AV91TFDisNomCli_Sel ;
      AV136Pedidos_dis__wwds_30_tfdisnumcli = AV92TFDisNumCli ;
      AV137Pedidos_dis__wwds_31_tfdisnumcli_to = AV93TFDisNumCli_To ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = AV94TFMaqCodDis ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV95TFMaqCodDis_Sel ;
      AV140Pedidos_dis__wwds_34_tfdisnumpie = AV96TFDisNumPie ;
      AV141Pedidos_dis__wwds_35_tfdisnumpie_to = AV97TFDisNumPie_To ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = AV98TFDisNumUni ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = AV99TFDisNumUni_To ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = AV100TFDisUniMed ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = AV101TFDisUniMed_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV110Pedidos_dis__wwds_4_tfdisest_sels ,
                                           AV109Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                           AV108Pedidos_dis__wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV110Pedidos_dis__wwds_4_tfdisest_sels.size()) ,
                                           AV112Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                           AV111Pedidos_dis__wwds_5_tfdisclinum ,
                                           AV114Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                           AV113Pedidos_dis__wwds_7_tfdisenccli ,
                                           Integer.valueOf(AV115Pedidos_dis__wwds_9_tfdiscod) ,
                                           Integer.valueOf(AV116Pedidos_dis__wwds_10_tfdiscod_to) ,
                                           AV117Pedidos_dis__wwds_11_tfdisfeccli ,
                                           AV118Pedidos_dis__wwds_12_tfdisfec ,
                                           AV119Pedidos_dis__wwds_13_tfdisfecent ,
                                           Integer.valueOf(AV120Pedidos_dis__wwds_14_tfclicod) ,
                                           Integer.valueOf(AV121Pedidos_dis__wwds_15_tfclicod_to) ,
                                           AV123Pedidos_dis__wwds_17_tfclinom_sel ,
                                           AV122Pedidos_dis__wwds_16_tfclinom ,
                                           AV125Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                           AV124Pedidos_dis__wwds_18_tfdisartcod ,
                                           AV127Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                           AV126Pedidos_dis__wwds_20_tfdisartdsc ,
                                           AV129Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                           AV128Pedidos_dis__wwds_22_tfdiscolnom ,
                                           Integer.valueOf(AV130Pedidos_dis__wwds_24_tfdiscolnum) ,
                                           Integer.valueOf(AV131Pedidos_dis__wwds_25_tfdiscolnum_to) ,
                                           Byte.valueOf(AV132Pedidos_dis__wwds_26_tfdistipcol) ,
                                           Byte.valueOf(AV133Pedidos_dis__wwds_27_tfdistipcol_to) ,
                                           AV135Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                           AV134Pedidos_dis__wwds_28_tfdisnomcli ,
                                           Integer.valueOf(AV136Pedidos_dis__wwds_30_tfdisnumcli) ,
                                           Integer.valueOf(AV137Pedidos_dis__wwds_31_tfdisnumcli_to) ,
                                           AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                           AV138Pedidos_dis__wwds_32_tfmaqcoddis ,
                                           Short.valueOf(AV140Pedidos_dis__wwds_34_tfdisnumpie) ,
                                           Short.valueOf(AV141Pedidos_dis__wwds_35_tfdisnumpie_to) ,
                                           AV142Pedidos_dis__wwds_36_tfdisnumuni ,
                                           AV143Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                           AV145Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                           AV144Pedidos_dis__wwds_38_tfdisunimed ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
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
                                           Short.valueOf(A374DisNumPie) ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(AV35OrderedBy) ,
                                           Boolean.valueOf(AV37OrderedDsc) ,
                                           AV107Pedidos_dis__wwds_1_filterfulltext ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV108Pedidos_dis__wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV108Pedidos_dis__wwds_2_tfdisusrcod), 8, "%") ;
      lV111Pedidos_dis__wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV111Pedidos_dis__wwds_5_tfdisclinum), 8, "%") ;
      lV113Pedidos_dis__wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV113Pedidos_dis__wwds_7_tfdisenccli), 20, "%") ;
      lV122Pedidos_dis__wwds_16_tfclinom = GXutil.padr( GXutil.rtrim( AV122Pedidos_dis__wwds_16_tfclinom), 30, "%") ;
      lV124Pedidos_dis__wwds_18_tfdisartcod = GXutil.padr( GXutil.rtrim( AV124Pedidos_dis__wwds_18_tfdisartcod), 16, "%") ;
      lV126Pedidos_dis__wwds_20_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV126Pedidos_dis__wwds_20_tfdisartdsc), 26, "%") ;
      lV128Pedidos_dis__wwds_22_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV128Pedidos_dis__wwds_22_tfdiscolnom), 13, "%") ;
      lV134Pedidos_dis__wwds_28_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV134Pedidos_dis__wwds_28_tfdisnomcli), 13, "%") ;
      lV138Pedidos_dis__wwds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV138Pedidos_dis__wwds_32_tfmaqcoddis), 6, "%") ;
      lV144Pedidos_dis__wwds_38_tfdisunimed = GXutil.padr( GXutil.rtrim( AV144Pedidos_dis__wwds_38_tfdisunimed), 1, "%") ;
      /* Using cursor H01XL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, lV108Pedidos_dis__wwds_2_tfdisusrcod, AV109Pedidos_dis__wwds_3_tfdisusrcod_sel, lV111Pedidos_dis__wwds_5_tfdisclinum, AV112Pedidos_dis__wwds_6_tfdisclinum_sel, lV113Pedidos_dis__wwds_7_tfdisenccli, AV114Pedidos_dis__wwds_8_tfdisenccli_sel, Integer.valueOf(AV115Pedidos_dis__wwds_9_tfdiscod), Integer.valueOf(AV116Pedidos_dis__wwds_10_tfdiscod_to), AV117Pedidos_dis__wwds_11_tfdisfeccli, AV118Pedidos_dis__wwds_12_tfdisfec, AV119Pedidos_dis__wwds_13_tfdisfecent, Integer.valueOf(AV120Pedidos_dis__wwds_14_tfclicod), Integer.valueOf(AV121Pedidos_dis__wwds_15_tfclicod_to), lV122Pedidos_dis__wwds_16_tfclinom, AV123Pedidos_dis__wwds_17_tfclinom_sel, lV124Pedidos_dis__wwds_18_tfdisartcod, AV125Pedidos_dis__wwds_19_tfdisartcod_sel, lV126Pedidos_dis__wwds_20_tfdisartdsc, AV127Pedidos_dis__wwds_21_tfdisartdsc_sel, lV128Pedidos_dis__wwds_22_tfdiscolnom, AV129Pedidos_dis__wwds_23_tfdiscolnom_sel, Integer.valueOf(AV130Pedidos_dis__wwds_24_tfdiscolnum), Integer.valueOf(AV131Pedidos_dis__wwds_25_tfdiscolnum_to), Byte.valueOf(AV132Pedidos_dis__wwds_26_tfdistipcol), Byte.valueOf(AV133Pedidos_dis__wwds_27_tfdistipcol_to), lV134Pedidos_dis__wwds_28_tfdisnomcli, AV135Pedidos_dis__wwds_29_tfdisnomcli_sel, Integer.valueOf(AV136Pedidos_dis__wwds_30_tfdisnumcli), Integer.valueOf(AV137Pedidos_dis__wwds_31_tfdisnumcli_to), lV138Pedidos_dis__wwds_32_tfmaqcoddis, AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel, Short.valueOf(AV140Pedidos_dis__wwds_34_tfdisnumpie), Short.valueOf(AV141Pedidos_dis__wwds_35_tfdisnumpie_to), AV142Pedidos_dis__wwds_36_tfdisnumuni, AV143Pedidos_dis__wwds_37_tfdisnumuni_to, lV144Pedidos_dis__wwds_38_tfdisunimed, AV145Pedidos_dis__wwds_39_tfdisunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A392DisUniMed = H01XL2_A392DisUniMed[0] ;
         A375DisNumUni = H01XL2_A375DisNumUni[0] ;
         A374DisNumPie = H01XL2_A374DisNumPie[0] ;
         A1122MaqCodDis = H01XL2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = H01XL2_n1122MaqCodDis[0] ;
         A1196DisNumCli = H01XL2_A1196DisNumCli[0] ;
         A1195DisNomCli = H01XL2_A1195DisNomCli[0] ;
         A390DisTipCol = H01XL2_A390DisTipCol[0] ;
         n390DisTipCol = H01XL2_n390DisTipCol[0] ;
         A363DisColNum = H01XL2_A363DisColNum[0] ;
         n363DisColNum = H01XL2_n363DisColNum[0] ;
         A362DisColNom = H01XL2_A362DisColNom[0] ;
         n362DisColNom = H01XL2_n362DisColNom[0] ;
         A337DisArtDsc = H01XL2_A337DisArtDsc[0] ;
         A335DisArtCod = H01XL2_A335DisArtCod[0] ;
         A279CliNom = H01XL2_A279CliNom[0] ;
         A252CliCod = H01XL2_A252CliCod[0] ;
         A371DisFecEnt = H01XL2_A371DisFecEnt[0] ;
         A369DisFec = H01XL2_A369DisFec[0] ;
         A370DisFecCli = H01XL2_A370DisFecCli[0] ;
         A361DisCod = H01XL2_A361DisCod[0] ;
         A4813DisEncCli = H01XL2_A4813DisEncCli[0] ;
         A360DisCliNum = H01XL2_A360DisCliNum[0] ;
         A367DisEst = H01XL2_A367DisEst[0] ;
         A4348DisUsrCod = H01XL2_A4348DisUsrCod[0] ;
         A757PriCod = H01XL2_A757PriCod[0] ;
         A279CliNom = H01XL2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV107Pedidos_dis__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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

   public void rf1XL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e221XL2 ();
      nGXsfl_45_idx = 1 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_452( ) ;
      bGXsfl_45_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_452( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(A367DisEst) ,
                                              AV110Pedidos_dis__wwds_4_tfdisest_sels ,
                                              AV109Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                              AV108Pedidos_dis__wwds_2_tfdisusrcod ,
                                              Integer.valueOf(AV110Pedidos_dis__wwds_4_tfdisest_sels.size()) ,
                                              AV112Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                              AV111Pedidos_dis__wwds_5_tfdisclinum ,
                                              AV114Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                              AV113Pedidos_dis__wwds_7_tfdisenccli ,
                                              Integer.valueOf(AV115Pedidos_dis__wwds_9_tfdiscod) ,
                                              Integer.valueOf(AV116Pedidos_dis__wwds_10_tfdiscod_to) ,
                                              AV117Pedidos_dis__wwds_11_tfdisfeccli ,
                                              AV118Pedidos_dis__wwds_12_tfdisfec ,
                                              AV119Pedidos_dis__wwds_13_tfdisfecent ,
                                              Integer.valueOf(AV120Pedidos_dis__wwds_14_tfclicod) ,
                                              Integer.valueOf(AV121Pedidos_dis__wwds_15_tfclicod_to) ,
                                              AV123Pedidos_dis__wwds_17_tfclinom_sel ,
                                              AV122Pedidos_dis__wwds_16_tfclinom ,
                                              AV125Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                              AV124Pedidos_dis__wwds_18_tfdisartcod ,
                                              AV127Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                              AV126Pedidos_dis__wwds_20_tfdisartdsc ,
                                              AV129Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                              AV128Pedidos_dis__wwds_22_tfdiscolnom ,
                                              Integer.valueOf(AV130Pedidos_dis__wwds_24_tfdiscolnum) ,
                                              Integer.valueOf(AV131Pedidos_dis__wwds_25_tfdiscolnum_to) ,
                                              Byte.valueOf(AV132Pedidos_dis__wwds_26_tfdistipcol) ,
                                              Byte.valueOf(AV133Pedidos_dis__wwds_27_tfdistipcol_to) ,
                                              AV135Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                              AV134Pedidos_dis__wwds_28_tfdisnomcli ,
                                              Integer.valueOf(AV136Pedidos_dis__wwds_30_tfdisnumcli) ,
                                              Integer.valueOf(AV137Pedidos_dis__wwds_31_tfdisnumcli_to) ,
                                              AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                              AV138Pedidos_dis__wwds_32_tfmaqcoddis ,
                                              Short.valueOf(AV140Pedidos_dis__wwds_34_tfdisnumpie) ,
                                              Short.valueOf(AV141Pedidos_dis__wwds_35_tfdisnumpie_to) ,
                                              AV142Pedidos_dis__wwds_36_tfdisnumuni ,
                                              AV143Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                              AV145Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                              AV144Pedidos_dis__wwds_38_tfdisunimed ,
                                              A4348DisUsrCod ,
                                              A360DisCliNum ,
                                              A4813DisEncCli ,
                                              Integer.valueOf(A361DisCod) ,
                                              A370DisFecCli ,
                                              A369DisFec ,
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
                                              Short.valueOf(A374DisNumPie) ,
                                              A375DisNumUni ,
                                              A392DisUniMed ,
                                              Short.valueOf(AV35OrderedBy) ,
                                              Boolean.valueOf(AV37OrderedDsc) ,
                                              AV107Pedidos_dis__wwds_1_filterfulltext ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV108Pedidos_dis__wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV108Pedidos_dis__wwds_2_tfdisusrcod), 8, "%") ;
         lV111Pedidos_dis__wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV111Pedidos_dis__wwds_5_tfdisclinum), 8, "%") ;
         lV113Pedidos_dis__wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV113Pedidos_dis__wwds_7_tfdisenccli), 20, "%") ;
         lV122Pedidos_dis__wwds_16_tfclinom = GXutil.padr( GXutil.rtrim( AV122Pedidos_dis__wwds_16_tfclinom), 30, "%") ;
         lV124Pedidos_dis__wwds_18_tfdisartcod = GXutil.padr( GXutil.rtrim( AV124Pedidos_dis__wwds_18_tfdisartcod), 16, "%") ;
         lV126Pedidos_dis__wwds_20_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV126Pedidos_dis__wwds_20_tfdisartdsc), 26, "%") ;
         lV128Pedidos_dis__wwds_22_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV128Pedidos_dis__wwds_22_tfdiscolnom), 13, "%") ;
         lV134Pedidos_dis__wwds_28_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV134Pedidos_dis__wwds_28_tfdisnomcli), 13, "%") ;
         lV138Pedidos_dis__wwds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV138Pedidos_dis__wwds_32_tfmaqcoddis), 6, "%") ;
         lV144Pedidos_dis__wwds_38_tfdisunimed = GXutil.padr( GXutil.rtrim( AV144Pedidos_dis__wwds_38_tfdisunimed), 1, "%") ;
         /* Using cursor H01XL3 */
         pr_default.execute(1, new Object[] {A396EmprCod, lV108Pedidos_dis__wwds_2_tfdisusrcod, AV109Pedidos_dis__wwds_3_tfdisusrcod_sel, lV111Pedidos_dis__wwds_5_tfdisclinum, AV112Pedidos_dis__wwds_6_tfdisclinum_sel, lV113Pedidos_dis__wwds_7_tfdisenccli, AV114Pedidos_dis__wwds_8_tfdisenccli_sel, Integer.valueOf(AV115Pedidos_dis__wwds_9_tfdiscod), Integer.valueOf(AV116Pedidos_dis__wwds_10_tfdiscod_to), AV117Pedidos_dis__wwds_11_tfdisfeccli, AV118Pedidos_dis__wwds_12_tfdisfec, AV119Pedidos_dis__wwds_13_tfdisfecent, Integer.valueOf(AV120Pedidos_dis__wwds_14_tfclicod), Integer.valueOf(AV121Pedidos_dis__wwds_15_tfclicod_to), lV122Pedidos_dis__wwds_16_tfclinom, AV123Pedidos_dis__wwds_17_tfclinom_sel, lV124Pedidos_dis__wwds_18_tfdisartcod, AV125Pedidos_dis__wwds_19_tfdisartcod_sel, lV126Pedidos_dis__wwds_20_tfdisartdsc, AV127Pedidos_dis__wwds_21_tfdisartdsc_sel, lV128Pedidos_dis__wwds_22_tfdiscolnom, AV129Pedidos_dis__wwds_23_tfdiscolnom_sel, Integer.valueOf(AV130Pedidos_dis__wwds_24_tfdiscolnum), Integer.valueOf(AV131Pedidos_dis__wwds_25_tfdiscolnum_to), Byte.valueOf(AV132Pedidos_dis__wwds_26_tfdistipcol), Byte.valueOf(AV133Pedidos_dis__wwds_27_tfdistipcol_to), lV134Pedidos_dis__wwds_28_tfdisnomcli, AV135Pedidos_dis__wwds_29_tfdisnomcli_sel, Integer.valueOf(AV136Pedidos_dis__wwds_30_tfdisnumcli), Integer.valueOf(AV137Pedidos_dis__wwds_31_tfdisnumcli_to), lV138Pedidos_dis__wwds_32_tfmaqcoddis, AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel, Short.valueOf(AV140Pedidos_dis__wwds_34_tfdisnumpie), Short.valueOf(AV141Pedidos_dis__wwds_35_tfdisnumpie_to), AV142Pedidos_dis__wwds_36_tfdisnumuni, AV143Pedidos_dis__wwds_37_tfdisnumuni_to, lV144Pedidos_dis__wwds_38_tfdisunimed, AV145Pedidos_dis__wwds_39_tfdisunimed_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A392DisUniMed = H01XL3_A392DisUniMed[0] ;
            A375DisNumUni = H01XL3_A375DisNumUni[0] ;
            A374DisNumPie = H01XL3_A374DisNumPie[0] ;
            A1122MaqCodDis = H01XL3_A1122MaqCodDis[0] ;
            n1122MaqCodDis = H01XL3_n1122MaqCodDis[0] ;
            A1196DisNumCli = H01XL3_A1196DisNumCli[0] ;
            A1195DisNomCli = H01XL3_A1195DisNomCli[0] ;
            A390DisTipCol = H01XL3_A390DisTipCol[0] ;
            n390DisTipCol = H01XL3_n390DisTipCol[0] ;
            A363DisColNum = H01XL3_A363DisColNum[0] ;
            n363DisColNum = H01XL3_n363DisColNum[0] ;
            A362DisColNom = H01XL3_A362DisColNom[0] ;
            n362DisColNom = H01XL3_n362DisColNom[0] ;
            A337DisArtDsc = H01XL3_A337DisArtDsc[0] ;
            A335DisArtCod = H01XL3_A335DisArtCod[0] ;
            A279CliNom = H01XL3_A279CliNom[0] ;
            A252CliCod = H01XL3_A252CliCod[0] ;
            A371DisFecEnt = H01XL3_A371DisFecEnt[0] ;
            A369DisFec = H01XL3_A369DisFec[0] ;
            A370DisFecCli = H01XL3_A370DisFecCli[0] ;
            A361DisCod = H01XL3_A361DisCod[0] ;
            A4813DisEncCli = H01XL3_A4813DisEncCli[0] ;
            A360DisCliNum = H01XL3_A360DisCliNum[0] ;
            A367DisEst = H01XL3_A367DisEst[0] ;
            A4348DisUsrCod = H01XL3_A4348DisUsrCod[0] ;
            A757PriCod = H01XL3_A757PriCod[0] ;
            A279CliNom = H01XL3_A279CliNom[0] ;
            if ( (GXutil.strcmp("", AV107Pedidos_dis__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en pedido", "") , GXutil.padr( "%" + GXutil.lower( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( "en produccion", "") , GXutil.padr( "%" + GXutil.lower( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV107Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV107Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e231XL2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wb1XL0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1XL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISEST"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A367DisEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV7Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
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
      AV107Pedidos_dis__wwds_1_filterfulltext = AV23FilterFullText ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = AV83TFDisUsrCod ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = AV84TFDisUsrCod_Sel ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = AV57TFDisEst_Sels ;
      AV111Pedidos_dis__wwds_5_tfdisclinum = AV86TFDisCliNum ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = AV87TFDisCliNum_Sel ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = AV88TFDisEncCli ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = AV89TFDisEncCli_Sel ;
      AV115Pedidos_dis__wwds_9_tfdiscod = AV50TFDisCod ;
      AV116Pedidos_dis__wwds_10_tfdiscod_to = AV51TFDisCod_To ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = AV62TFDisFecCli ;
      AV118Pedidos_dis__wwds_12_tfdisfec = AV59TFDisFec ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = AV64TFDisFecEnt ;
      AV120Pedidos_dis__wwds_14_tfclicod = AV42TFCliCod ;
      AV121Pedidos_dis__wwds_15_tfclicod_to = AV43TFCliCod_To ;
      AV122Pedidos_dis__wwds_16_tfclinom = AV44TFCliNom ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = AV45TFCliNom_Sel ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = AV46TFDisArtCod ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = AV48TFDisArtDsc ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = AV52TFDisColNom ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = AV53TFDisColNom_Sel ;
      AV130Pedidos_dis__wwds_24_tfdiscolnum = AV54TFDisColNum ;
      AV131Pedidos_dis__wwds_25_tfdiscolnum_to = AV55TFDisColNum_To ;
      AV132Pedidos_dis__wwds_26_tfdistipcol = AV66TFDisTipCol ;
      AV133Pedidos_dis__wwds_27_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = AV90TFDisNomCli ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = AV91TFDisNomCli_Sel ;
      AV136Pedidos_dis__wwds_30_tfdisnumcli = AV92TFDisNumCli ;
      AV137Pedidos_dis__wwds_31_tfdisnumcli_to = AV93TFDisNumCli_To ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = AV94TFMaqCodDis ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV95TFMaqCodDis_Sel ;
      AV140Pedidos_dis__wwds_34_tfdisnumpie = AV96TFDisNumPie ;
      AV141Pedidos_dis__wwds_35_tfdisnumpie_to = AV97TFDisNumPie_To ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = AV98TFDisNumUni ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = AV99TFDisNumUni_To ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = AV100TFDisUniMed ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = AV101TFDisUniMed_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV32ManageFiltersExecutionStep, AV9ColumnsSelector, AV23FilterFullText, AV83TFDisUsrCod, AV84TFDisUsrCod_Sel, AV57TFDisEst_Sels, AV86TFDisCliNum, AV87TFDisCliNum_Sel, AV88TFDisEncCli, AV89TFDisEncCli_Sel, AV50TFDisCod, AV51TFDisCod_To, AV62TFDisFecCli, AV59TFDisFec, AV64TFDisFecEnt, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFDisArtCod, AV47TFDisArtCod_Sel, AV48TFDisArtDsc, AV49TFDisArtDsc_Sel, AV52TFDisColNom, AV53TFDisColNom_Sel, AV54TFDisColNum, AV55TFDisColNum_To, AV66TFDisTipCol, AV67TFDisTipCol_To, AV90TFDisNomCli, AV91TFDisNomCli_Sel, AV92TFDisNumCli, AV93TFDisNumCli_To, AV94TFMaqCodDis, AV95TFMaqCodDis_Sel, AV96TFDisNumPie, AV97TFDisNumPie_To, AV98TFDisNumUni, AV99TFDisNumUni_To, AV100TFDisUniMed, AV101TFDisUniMed_Sel, AV104Pgmname, AV35OrderedBy, AV37OrderedDsc, AV8UsurCod, AV7Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV107Pedidos_dis__wwds_1_filterfulltext = AV23FilterFullText ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = AV83TFDisUsrCod ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = AV84TFDisUsrCod_Sel ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = AV57TFDisEst_Sels ;
      AV111Pedidos_dis__wwds_5_tfdisclinum = AV86TFDisCliNum ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = AV87TFDisCliNum_Sel ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = AV88TFDisEncCli ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = AV89TFDisEncCli_Sel ;
      AV115Pedidos_dis__wwds_9_tfdiscod = AV50TFDisCod ;
      AV116Pedidos_dis__wwds_10_tfdiscod_to = AV51TFDisCod_To ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = AV62TFDisFecCli ;
      AV118Pedidos_dis__wwds_12_tfdisfec = AV59TFDisFec ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = AV64TFDisFecEnt ;
      AV120Pedidos_dis__wwds_14_tfclicod = AV42TFCliCod ;
      AV121Pedidos_dis__wwds_15_tfclicod_to = AV43TFCliCod_To ;
      AV122Pedidos_dis__wwds_16_tfclinom = AV44TFCliNom ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = AV45TFCliNom_Sel ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = AV46TFDisArtCod ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = AV48TFDisArtDsc ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = AV52TFDisColNom ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = AV53TFDisColNom_Sel ;
      AV130Pedidos_dis__wwds_24_tfdiscolnum = AV54TFDisColNum ;
      AV131Pedidos_dis__wwds_25_tfdiscolnum_to = AV55TFDisColNum_To ;
      AV132Pedidos_dis__wwds_26_tfdistipcol = AV66TFDisTipCol ;
      AV133Pedidos_dis__wwds_27_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = AV90TFDisNomCli ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = AV91TFDisNomCli_Sel ;
      AV136Pedidos_dis__wwds_30_tfdisnumcli = AV92TFDisNumCli ;
      AV137Pedidos_dis__wwds_31_tfdisnumcli_to = AV93TFDisNumCli_To ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = AV94TFMaqCodDis ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV95TFMaqCodDis_Sel ;
      AV140Pedidos_dis__wwds_34_tfdisnumpie = AV96TFDisNumPie ;
      AV141Pedidos_dis__wwds_35_tfdisnumpie_to = AV97TFDisNumPie_To ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = AV98TFDisNumUni ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = AV99TFDisNumUni_To ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = AV100TFDisUniMed ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = AV101TFDisUniMed_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV32ManageFiltersExecutionStep, AV9ColumnsSelector, AV23FilterFullText, AV83TFDisUsrCod, AV84TFDisUsrCod_Sel, AV57TFDisEst_Sels, AV86TFDisCliNum, AV87TFDisCliNum_Sel, AV88TFDisEncCli, AV89TFDisEncCli_Sel, AV50TFDisCod, AV51TFDisCod_To, AV62TFDisFecCli, AV59TFDisFec, AV64TFDisFecEnt, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFDisArtCod, AV47TFDisArtCod_Sel, AV48TFDisArtDsc, AV49TFDisArtDsc_Sel, AV52TFDisColNom, AV53TFDisColNom_Sel, AV54TFDisColNum, AV55TFDisColNum_To, AV66TFDisTipCol, AV67TFDisTipCol_To, AV90TFDisNomCli, AV91TFDisNomCli_Sel, AV92TFDisNumCli, AV93TFDisNumCli_To, AV94TFMaqCodDis, AV95TFMaqCodDis_Sel, AV96TFDisNumPie, AV97TFDisNumPie_To, AV98TFDisNumUni, AV99TFDisNumUni_To, AV100TFDisUniMed, AV101TFDisUniMed_Sel, AV104Pgmname, AV35OrderedBy, AV37OrderedDsc, AV8UsurCod, AV7Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV107Pedidos_dis__wwds_1_filterfulltext = AV23FilterFullText ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = AV83TFDisUsrCod ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = AV84TFDisUsrCod_Sel ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = AV57TFDisEst_Sels ;
      AV111Pedidos_dis__wwds_5_tfdisclinum = AV86TFDisCliNum ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = AV87TFDisCliNum_Sel ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = AV88TFDisEncCli ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = AV89TFDisEncCli_Sel ;
      AV115Pedidos_dis__wwds_9_tfdiscod = AV50TFDisCod ;
      AV116Pedidos_dis__wwds_10_tfdiscod_to = AV51TFDisCod_To ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = AV62TFDisFecCli ;
      AV118Pedidos_dis__wwds_12_tfdisfec = AV59TFDisFec ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = AV64TFDisFecEnt ;
      AV120Pedidos_dis__wwds_14_tfclicod = AV42TFCliCod ;
      AV121Pedidos_dis__wwds_15_tfclicod_to = AV43TFCliCod_To ;
      AV122Pedidos_dis__wwds_16_tfclinom = AV44TFCliNom ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = AV45TFCliNom_Sel ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = AV46TFDisArtCod ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = AV48TFDisArtDsc ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = AV52TFDisColNom ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = AV53TFDisColNom_Sel ;
      AV130Pedidos_dis__wwds_24_tfdiscolnum = AV54TFDisColNum ;
      AV131Pedidos_dis__wwds_25_tfdiscolnum_to = AV55TFDisColNum_To ;
      AV132Pedidos_dis__wwds_26_tfdistipcol = AV66TFDisTipCol ;
      AV133Pedidos_dis__wwds_27_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = AV90TFDisNomCli ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = AV91TFDisNomCli_Sel ;
      AV136Pedidos_dis__wwds_30_tfdisnumcli = AV92TFDisNumCli ;
      AV137Pedidos_dis__wwds_31_tfdisnumcli_to = AV93TFDisNumCli_To ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = AV94TFMaqCodDis ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV95TFMaqCodDis_Sel ;
      AV140Pedidos_dis__wwds_34_tfdisnumpie = AV96TFDisNumPie ;
      AV141Pedidos_dis__wwds_35_tfdisnumpie_to = AV97TFDisNumPie_To ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = AV98TFDisNumUni ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = AV99TFDisNumUni_To ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = AV100TFDisUniMed ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = AV101TFDisUniMed_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV32ManageFiltersExecutionStep, AV9ColumnsSelector, AV23FilterFullText, AV83TFDisUsrCod, AV84TFDisUsrCod_Sel, AV57TFDisEst_Sels, AV86TFDisCliNum, AV87TFDisCliNum_Sel, AV88TFDisEncCli, AV89TFDisEncCli_Sel, AV50TFDisCod, AV51TFDisCod_To, AV62TFDisFecCli, AV59TFDisFec, AV64TFDisFecEnt, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFDisArtCod, AV47TFDisArtCod_Sel, AV48TFDisArtDsc, AV49TFDisArtDsc_Sel, AV52TFDisColNom, AV53TFDisColNom_Sel, AV54TFDisColNum, AV55TFDisColNum_To, AV66TFDisTipCol, AV67TFDisTipCol_To, AV90TFDisNomCli, AV91TFDisNomCli_Sel, AV92TFDisNumCli, AV93TFDisNumCli_To, AV94TFMaqCodDis, AV95TFMaqCodDis_Sel, AV96TFDisNumPie, AV97TFDisNumPie_To, AV98TFDisNumUni, AV99TFDisNumUni_To, AV100TFDisUniMed, AV101TFDisUniMed_Sel, AV104Pgmname, AV35OrderedBy, AV37OrderedDsc, AV8UsurCod, AV7Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV107Pedidos_dis__wwds_1_filterfulltext = AV23FilterFullText ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = AV83TFDisUsrCod ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = AV84TFDisUsrCod_Sel ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = AV57TFDisEst_Sels ;
      AV111Pedidos_dis__wwds_5_tfdisclinum = AV86TFDisCliNum ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = AV87TFDisCliNum_Sel ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = AV88TFDisEncCli ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = AV89TFDisEncCli_Sel ;
      AV115Pedidos_dis__wwds_9_tfdiscod = AV50TFDisCod ;
      AV116Pedidos_dis__wwds_10_tfdiscod_to = AV51TFDisCod_To ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = AV62TFDisFecCli ;
      AV118Pedidos_dis__wwds_12_tfdisfec = AV59TFDisFec ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = AV64TFDisFecEnt ;
      AV120Pedidos_dis__wwds_14_tfclicod = AV42TFCliCod ;
      AV121Pedidos_dis__wwds_15_tfclicod_to = AV43TFCliCod_To ;
      AV122Pedidos_dis__wwds_16_tfclinom = AV44TFCliNom ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = AV45TFCliNom_Sel ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = AV46TFDisArtCod ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = AV48TFDisArtDsc ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = AV52TFDisColNom ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = AV53TFDisColNom_Sel ;
      AV130Pedidos_dis__wwds_24_tfdiscolnum = AV54TFDisColNum ;
      AV131Pedidos_dis__wwds_25_tfdiscolnum_to = AV55TFDisColNum_To ;
      AV132Pedidos_dis__wwds_26_tfdistipcol = AV66TFDisTipCol ;
      AV133Pedidos_dis__wwds_27_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = AV90TFDisNomCli ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = AV91TFDisNomCli_Sel ;
      AV136Pedidos_dis__wwds_30_tfdisnumcli = AV92TFDisNumCli ;
      AV137Pedidos_dis__wwds_31_tfdisnumcli_to = AV93TFDisNumCli_To ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = AV94TFMaqCodDis ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV95TFMaqCodDis_Sel ;
      AV140Pedidos_dis__wwds_34_tfdisnumpie = AV96TFDisNumPie ;
      AV141Pedidos_dis__wwds_35_tfdisnumpie_to = AV97TFDisNumPie_To ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = AV98TFDisNumUni ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = AV99TFDisNumUni_To ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = AV100TFDisUniMed ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = AV101TFDisUniMed_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV32ManageFiltersExecutionStep, AV9ColumnsSelector, AV23FilterFullText, AV83TFDisUsrCod, AV84TFDisUsrCod_Sel, AV57TFDisEst_Sels, AV86TFDisCliNum, AV87TFDisCliNum_Sel, AV88TFDisEncCli, AV89TFDisEncCli_Sel, AV50TFDisCod, AV51TFDisCod_To, AV62TFDisFecCli, AV59TFDisFec, AV64TFDisFecEnt, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFDisArtCod, AV47TFDisArtCod_Sel, AV48TFDisArtDsc, AV49TFDisArtDsc_Sel, AV52TFDisColNom, AV53TFDisColNom_Sel, AV54TFDisColNum, AV55TFDisColNum_To, AV66TFDisTipCol, AV67TFDisTipCol_To, AV90TFDisNomCli, AV91TFDisNomCli_Sel, AV92TFDisNumCli, AV93TFDisNumCli_To, AV94TFMaqCodDis, AV95TFMaqCodDis_Sel, AV96TFDisNumPie, AV97TFDisNumPie_To, AV98TFDisNumUni, AV99TFDisNumUni_To, AV100TFDisUniMed, AV101TFDisUniMed_Sel, AV104Pgmname, AV35OrderedBy, AV37OrderedDsc, AV8UsurCod, AV7Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV107Pedidos_dis__wwds_1_filterfulltext = AV23FilterFullText ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = AV83TFDisUsrCod ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = AV84TFDisUsrCod_Sel ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = AV57TFDisEst_Sels ;
      AV111Pedidos_dis__wwds_5_tfdisclinum = AV86TFDisCliNum ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = AV87TFDisCliNum_Sel ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = AV88TFDisEncCli ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = AV89TFDisEncCli_Sel ;
      AV115Pedidos_dis__wwds_9_tfdiscod = AV50TFDisCod ;
      AV116Pedidos_dis__wwds_10_tfdiscod_to = AV51TFDisCod_To ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = AV62TFDisFecCli ;
      AV118Pedidos_dis__wwds_12_tfdisfec = AV59TFDisFec ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = AV64TFDisFecEnt ;
      AV120Pedidos_dis__wwds_14_tfclicod = AV42TFCliCod ;
      AV121Pedidos_dis__wwds_15_tfclicod_to = AV43TFCliCod_To ;
      AV122Pedidos_dis__wwds_16_tfclinom = AV44TFCliNom ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = AV45TFCliNom_Sel ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = AV46TFDisArtCod ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = AV48TFDisArtDsc ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = AV52TFDisColNom ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = AV53TFDisColNom_Sel ;
      AV130Pedidos_dis__wwds_24_tfdiscolnum = AV54TFDisColNum ;
      AV131Pedidos_dis__wwds_25_tfdiscolnum_to = AV55TFDisColNum_To ;
      AV132Pedidos_dis__wwds_26_tfdistipcol = AV66TFDisTipCol ;
      AV133Pedidos_dis__wwds_27_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = AV90TFDisNomCli ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = AV91TFDisNomCli_Sel ;
      AV136Pedidos_dis__wwds_30_tfdisnumcli = AV92TFDisNumCli ;
      AV137Pedidos_dis__wwds_31_tfdisnumcli_to = AV93TFDisNumCli_To ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = AV94TFMaqCodDis ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV95TFMaqCodDis_Sel ;
      AV140Pedidos_dis__wwds_34_tfdisnumpie = AV96TFDisNumPie ;
      AV141Pedidos_dis__wwds_35_tfdisnumpie_to = AV97TFDisNumPie_To ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = AV98TFDisNumUni ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = AV99TFDisNumUni_To ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = AV100TFDisUniMed ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = AV101TFDisUniMed_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV32ManageFiltersExecutionStep, AV9ColumnsSelector, AV23FilterFullText, AV83TFDisUsrCod, AV84TFDisUsrCod_Sel, AV57TFDisEst_Sels, AV86TFDisCliNum, AV87TFDisCliNum_Sel, AV88TFDisEncCli, AV89TFDisEncCli_Sel, AV50TFDisCod, AV51TFDisCod_To, AV62TFDisFecCli, AV59TFDisFec, AV64TFDisFecEnt, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFDisArtCod, AV47TFDisArtCod_Sel, AV48TFDisArtDsc, AV49TFDisArtDsc_Sel, AV52TFDisColNom, AV53TFDisColNom_Sel, AV54TFDisColNum, AV55TFDisColNum_To, AV66TFDisTipCol, AV67TFDisTipCol_To, AV90TFDisNomCli, AV91TFDisNomCli_Sel, AV92TFDisNumCli, AV93TFDisNumCli_To, AV94TFMaqCodDis, AV95TFMaqCodDis_Sel, AV96TFDisNumPie, AV97TFDisNumPie_To, AV98TFDisNumUni, AV99TFDisNumUni_To, AV100TFDisUniMed, AV101TFDisUniMed_Sel, AV104Pgmname, AV35OrderedBy, AV37OrderedDsc, AV8UsurCod, AV7Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV104Pgmname = "Pedidos.Dis__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1XL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e211XL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV31ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV18DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV9ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV85VisualizarAcciones = GXutil.strtobool( httpContext.cgiGet( "vVISUALIZARACCIONES")) ;
         AV20EmprCod_Selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         AV19DisCod_Selected = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV23FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23FilterFullText", AV23FilterFullText);
         AV104Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_disfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14DDO_DisFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_DisFecCliAuxDate", localUtil.format(AV14DDO_DisFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV14DDO_DisFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14DDO_DisFecCliAuxDate", localUtil.format(AV14DDO_DisFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECAUXDATE");
            GX_FocusControl = edtavDdo_disfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12DDO_DisFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_DisFecAuxDate", localUtil.format(AV12DDO_DisFecAuxDate, "99/99/99"));
         }
         else
         {
            AV12DDO_DisFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12DDO_DisFecAuxDate", localUtil.format(AV12DDO_DisFecAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_disfecentauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_DISFECENTAUXDATE");
            GX_FocusControl = edtavDdo_disfecentauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16DDO_DisFecEntAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DDO_DisFecEntAuxDate", localUtil.format(AV16DDO_DisFecEntAuxDate, "99/99/99"));
         }
         else
         {
            AV16DDO_DisFecEntAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_disfecentauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16DDO_DisFecEntAuxDate", localUtil.format(AV16DDO_DisFecEntAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Dis__WW");
         AV104Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\dis__ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e211XL2 ();
      if (returnInSub) return;
   }

   public void e211XL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      dis__ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      dis__ww_impl.this.A396EmprCod = GXv_char2[0] ;
      dis__ww_impl.this.AV6EmprNom = GXv_char3[0] ;
      dis__ww_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      GXt_char1 = AV7Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      dis__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV7Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      GXv_char4[0] = AV105Emprcod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char3, GXv_char2) ;
      dis__ww_impl.this.AV105Emprcod = GXv_char4[0] ;
      dis__ww_impl.this.AV6EmprNom = GXv_char3[0] ;
      dis__ww_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV29HTTPRequest.getMethod(), "GET") == 0 )
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
      if ( AV35OrderedBy < 1 )
      {
         AV35OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OrderedBy), 4, 0));
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
      AV59TFDisFec = GXutil.dadd(Gx_date,-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFDisFec", localUtil.format(AV59TFDisFec, "99/99/99"));
      AV61TFDisFec_To = Gx_date ;
      AV78WebSessionReset = java.util.UUID.randomUUID( ).toString() ;
      AV77WebSessionDatos = java.util.UUID.randomUUID( ).toString() ;
   }

   public void e221XL2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV79WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV79WWPContext = GXv_SdtWWPContext7[0] ;
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
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV41Session.getValue("Pedidos.Dis__WWColumnsSelector"), "") != 0 )
      {
         AV11ColumnsSelectorXML = AV41Session.getValue("Pedidos.Dis__WWColumnsSelector") ;
         AV9ColumnsSelector.fromxml(AV11ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtDisUsrCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUsrCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUsrCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbDisEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbDisEst.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtDisCliNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCliNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCliNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisEncCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEncCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEncCli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisFecCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecCli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisFecEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisFecEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisFecEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisArtCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisArtDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisArtDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisArtDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisColNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisTipCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisTipCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisTipCol_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNomCli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisNumCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumCli_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqCodDis_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCodDis_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCodDis_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisNumPie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumPie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumPie_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisNumUni_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisNumUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisNumUni_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtDisUniMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV9ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      AV107Pedidos_dis__wwds_1_filterfulltext = AV23FilterFullText ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = AV83TFDisUsrCod ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = AV84TFDisUsrCod_Sel ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = AV57TFDisEst_Sels ;
      AV111Pedidos_dis__wwds_5_tfdisclinum = AV86TFDisCliNum ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = AV87TFDisCliNum_Sel ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = AV88TFDisEncCli ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = AV89TFDisEncCli_Sel ;
      AV115Pedidos_dis__wwds_9_tfdiscod = AV50TFDisCod ;
      AV116Pedidos_dis__wwds_10_tfdiscod_to = AV51TFDisCod_To ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = AV62TFDisFecCli ;
      AV118Pedidos_dis__wwds_12_tfdisfec = AV59TFDisFec ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = AV64TFDisFecEnt ;
      AV120Pedidos_dis__wwds_14_tfclicod = AV42TFCliCod ;
      AV121Pedidos_dis__wwds_15_tfclicod_to = AV43TFCliCod_To ;
      AV122Pedidos_dis__wwds_16_tfclinom = AV44TFCliNom ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = AV45TFCliNom_Sel ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = AV46TFDisArtCod ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = AV47TFDisArtCod_Sel ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = AV48TFDisArtDsc ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = AV49TFDisArtDsc_Sel ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = AV52TFDisColNom ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = AV53TFDisColNom_Sel ;
      AV130Pedidos_dis__wwds_24_tfdiscolnum = AV54TFDisColNum ;
      AV131Pedidos_dis__wwds_25_tfdiscolnum_to = AV55TFDisColNum_To ;
      AV132Pedidos_dis__wwds_26_tfdistipcol = AV66TFDisTipCol ;
      AV133Pedidos_dis__wwds_27_tfdistipcol_to = AV67TFDisTipCol_To ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = AV90TFDisNomCli ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = AV91TFDisNomCli_Sel ;
      AV136Pedidos_dis__wwds_30_tfdisnumcli = AV92TFDisNumCli ;
      AV137Pedidos_dis__wwds_31_tfdisnumcli_to = AV93TFDisNumCli_To ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = AV94TFMaqCodDis ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV95TFMaqCodDis_Sel ;
      AV140Pedidos_dis__wwds_34_tfdisnumpie = AV96TFDisNumPie ;
      AV141Pedidos_dis__wwds_35_tfdisnumpie_to = AV97TFDisNumPie_To ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = AV98TFDisNumUni ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = AV99TFDisNumUni_To ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = AV100TFDisUniMed ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = AV101TFDisUniMed_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
   }

   public void e121XL2( )
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

   public void e131XL2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141XL2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV35OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OrderedBy), 4, 0));
         AV37OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedDsc", AV37OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUsrCod") == 0 )
         {
            AV83TFDisUsrCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFDisUsrCod", AV83TFDisUsrCod);
            AV84TFDisUsrCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFDisUsrCod_Sel", AV84TFDisUsrCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisEst") == 0 )
         {
            AV58TFDisEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFDisEst_SelsJson", AV58TFDisEst_SelsJson);
            AV57TFDisEst_Sels.fromJSonString(GXutil.strReplace( AV58TFDisEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCliNum") == 0 )
         {
            AV86TFDisCliNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum", AV86TFDisCliNum);
            AV87TFDisCliNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisCliNum_Sel", AV87TFDisCliNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisEncCli") == 0 )
         {
            AV88TFDisEncCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli", AV88TFDisEncCli);
            AV89TFDisEncCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFDisEncCli_Sel", AV89TFDisEncCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisCod") == 0 )
         {
            AV50TFDisCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisCod), 8, 0));
            AV51TFDisCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFecCli") == 0 )
         {
            AV62TFDisFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFDisFecCli", localUtil.format(AV62TFDisFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFec") == 0 )
         {
            AV59TFDisFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFDisFec", localUtil.format(AV59TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisFecEnt") == 0 )
         {
            AV64TFDisFecEnt = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFecEnt", localUtil.format(AV64TFDisFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod), 6, 0));
            AV43TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV44TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliNom", AV44TFCliNom);
            AV45TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFCliNom_Sel", AV45TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtCod") == 0 )
         {
            AV46TFDisArtCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisArtCod", AV46TFDisArtCod);
            AV47TFDisArtCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisArtCod_Sel", AV47TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisArtDsc") == 0 )
         {
            AV48TFDisArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisArtDsc", AV48TFDisArtDsc);
            AV49TFDisArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFDisArtDsc_Sel", AV49TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNom") == 0 )
         {
            AV52TFDisColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDisColNom", AV52TFDisColNom);
            AV53TFDisColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisColNom_Sel", AV53TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisColNum") == 0 )
         {
            AV54TFDisColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisColNum), 6, 0));
            AV55TFDisColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisTipCol") == 0 )
         {
            AV66TFDisTipCol = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFDisTipCol), 2, 0));
            AV67TFDisTipCol_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNomCli") == 0 )
         {
            AV90TFDisNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFDisNomCli", AV90TFDisNomCli);
            AV91TFDisNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFDisNomCli_Sel", AV91TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNumCli") == 0 )
         {
            AV92TFDisNumCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFDisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFDisNumCli), 6, 0));
            AV93TFDisNumCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFDisNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFDisNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodDis") == 0 )
         {
            AV94TFMaqCodDis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFMaqCodDis", AV94TFMaqCodDis);
            AV95TFMaqCodDis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFMaqCodDis_Sel", AV95TFMaqCodDis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNumPie") == 0 )
         {
            AV96TFDisNumPie = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFDisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96TFDisNumPie), 4, 0));
            AV97TFDisNumPie_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFDisNumPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97TFDisNumPie_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisNumUni") == 0 )
         {
            AV98TFDisNumUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFDisNumUni", GXutil.ltrimstr( AV98TFDisNumUni, 9, 2));
            AV99TFDisNumUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFDisNumUni_To", GXutil.ltrimstr( AV99TFDisNumUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DisUniMed") == 0 )
         {
            AV100TFDisUniMed = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFDisUniMed", AV100TFDisUniMed);
            AV101TFDisUniMed_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFDisUniMed_Sel", AV101TFDisUniMed_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFDisEst_Sels", AV57TFDisEst_Sels);
   }

   private void e231XL2( )
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
         if ( A367DisEst == 1 )
         {
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fas fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         AV81DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV81DetailWebComponent);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(45) ;
         }
         sendrow_452( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV24GridActions, 4, 0)) );
   }

   public void e151XL2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV11ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV9ColumnsSelector.fromJSonString(AV11ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis__WWColumnsSelector", ((GXutil.strcmp("", AV11ColumnsSelectorXML)==0) ? "" : AV9ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
   }

   public void e111XL2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Pedidos.Dis__WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV104Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV32ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ManageFiltersExecutionStep", GXutil.str( AV32ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Pedidos.Dis__WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV32ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32ManageFiltersExecutionStep", GXutil.str( AV32ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV33ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Pedidos.Dis__WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         dis__ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV33ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV33ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV33ManageFiltersXml) ;
            AV27GridState.fromxml(AV33ManageFiltersXml, null, null);
            AV35OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OrderedBy), 4, 0));
            AV37OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedDsc", AV37OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFDisEst_Sels", AV57TFDisEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
   }

   public void e161XL2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9ColumnsSelector", AV9ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV31ManageFiltersData", AV31ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
   }

   public void e171XL2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidos.dis", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(true))}, new String[] {"Mode","EmprCod","DisCod","VisualizarAcciones","AccionesEnPopup"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e181XL2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV21ErrorMessage ;
      new app.pedidos.dis__wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      dis__ww_impl.this.AV22ExcelFilename = GXv_char4[0] ;
      dis__ww_impl.this.AV21ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFDisEst_Sels", AV57TFDisEst_Sels);
   }

   public void e191XL2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.pedidos.dis__wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFDisEst_Sels", AV57TFDisEst_Sels);
   }

   public void e201XL2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.pedidos.dis__wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27GridState", AV27GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFDisEst_Sels", AV57TFDisEst_Sels);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV35OrderedBy, 4, 0))+":"+(AV37OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV9ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisUsrCod", "", "Usuario", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisEst", "", "Estado", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
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
         GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisCliNum", "", "Ped. Cli.", true, "") ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
         AV86TFDisCliNum = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum", AV86TFDisCliNum);
         AV87TFDisCliNum_Sel = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisCliNum_Sel", AV87TFDisCliNum_Sel);
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
         GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisEncCli", "", "Ped. Cli.", true, "") ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "", "", "", false, "") ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
         AV88TFDisEncCli = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli", AV88TFDisEncCli);
         AV89TFDisEncCli_Sel = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89TFDisEncCli_Sel", AV89TFDisEncCli_Sel);
      }
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisCod", "", "Nr.Enc", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisFecCli", "", "Data ped.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisFec", "", "Data reg.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisFecEnt", "", "Data entr.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisArtCod", "", "Artigo", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisArtDsc", "", "Descripcion", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisColNom", "", "Cor", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisColNum", "", "Cor. Núm", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisTipCol", "", "TC", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisNomCli", "", "Color Cliente", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisNumCli", "", "Numero", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqCodDis", "", "Maquina", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisNumPie", "", "Piezas", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisNumUni", "", "Unidades", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV9ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DisUniMed", "", "Und.", true, "") ;
      AV9ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV75UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis__WWColumnsSelector", GXv_char4) ;
      dis__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV75UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV75UserCustomValue)==0) ) )
      {
         AV10ColumnsSelectorAux.fromxml(AV75UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV10ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV9ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV10ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV9ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV31ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Pedidos.Dis__WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV31ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV23FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23FilterFullText", AV23FilterFullText);
      AV83TFDisUsrCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFDisUsrCod", AV83TFDisUsrCod);
      AV84TFDisUsrCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFDisUsrCod_Sel", AV84TFDisUsrCod_Sel);
      AV57TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV86TFDisCliNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum", AV86TFDisCliNum);
      AV87TFDisCliNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisCliNum_Sel", AV87TFDisCliNum_Sel);
      AV88TFDisEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli", AV88TFDisEncCli);
      AV89TFDisEncCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFDisEncCli_Sel", AV89TFDisEncCli_Sel);
      AV50TFDisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisCod), 8, 0));
      AV51TFDisCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisCod_To), 8, 0));
      AV62TFDisFecCli = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFDisFecCli", localUtil.format(AV62TFDisFecCli, "99/99/99"));
      AV59TFDisFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFDisFec", localUtil.format(AV59TFDisFec, "99/99/99"));
      AV64TFDisFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFecEnt", localUtil.format(AV64TFDisFecEnt, "99/99/99"));
      AV42TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod), 6, 0));
      AV43TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFCliCod_To), 6, 0));
      AV44TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliNom", AV44TFCliNom);
      AV45TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFCliNom_Sel", AV45TFCliNom_Sel);
      AV46TFDisArtCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisArtCod", AV46TFDisArtCod);
      AV47TFDisArtCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisArtCod_Sel", AV47TFDisArtCod_Sel);
      AV48TFDisArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisArtDsc", AV48TFDisArtDsc);
      AV49TFDisArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFDisArtDsc_Sel", AV49TFDisArtDsc_Sel);
      AV52TFDisColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFDisColNom", AV52TFDisColNom);
      AV53TFDisColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisColNom_Sel", AV53TFDisColNom_Sel);
      AV54TFDisColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisColNum), 6, 0));
      AV55TFDisColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDisColNum_To), 6, 0));
      AV66TFDisTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFDisTipCol), 2, 0));
      AV67TFDisTipCol_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFDisTipCol_To), 2, 0));
      AV90TFDisNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFDisNomCli", AV90TFDisNomCli);
      AV91TFDisNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFDisNomCli_Sel", AV91TFDisNomCli_Sel);
      AV92TFDisNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFDisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFDisNumCli), 6, 0));
      AV93TFDisNumCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFDisNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFDisNumCli_To), 6, 0));
      AV94TFMaqCodDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFMaqCodDis", AV94TFMaqCodDis);
      AV95TFMaqCodDis_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFMaqCodDis_Sel", AV95TFMaqCodDis_Sel);
      AV96TFDisNumPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFDisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96TFDisNumPie), 4, 0));
      AV97TFDisNumPie_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFDisNumPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97TFDisNumPie_To), 4, 0));
      AV98TFDisNumUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFDisNumUni", GXutil.ltrimstr( AV98TFDisNumUni, 9, 2));
      AV99TFDisNumUni_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99TFDisNumUni_To", GXutil.ltrimstr( AV99TFDisNumUni_To, 9, 2));
      AV100TFDisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100TFDisUniMed", AV100TFDisUniMed);
      AV101TFDisUniMed_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101TFDisUniMed_Sel", AV101TFDisUniMed_Sel);
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
      callWebObject(formatLink("app.pedidos.dis", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod","VisualizarAcciones","AccionesEnPopup"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.pedidos.dis", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(true))}, new String[] {"Mode","EmprCod","DisCod","VisualizarAcciones","AccionesEnPopup"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV20EmprCod_Selected = A396EmprCod ;
      AV19DisCod_Selected = A361DisCod ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S222( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      if ( A367DisEst == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A361DisCod ;
         new app.pelidis(remoteHandle, context).execute( GXv_char4, GXv_int12) ;
         dis__ww_impl.this.A396EmprCod = GXv_char4[0] ;
         dis__ww_impl.this.A361DisCod = GXv_int12[0] ;
         AV82Inc_obs = httpContext.getMessage( "Eliminación Nº Disposición= ", "") + GXutil.str( A361DisCod, 8, 0) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV104Pgmname, AV8UsurCod, AV7Station, AV82Inc_obs, A361DisCod, (byte)(0), " ") ;
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
      if ( GXutil.strcmp(AV41Session.getValue(AV104Pgmname+"GridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV104Pgmname+"GridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV41Session.getValue(AV104Pgmname+"GridState"), null, null);
      }
      AV35OrderedBy = AV27GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OrderedBy), 4, 0));
      AV37OrderedDsc = AV27GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37OrderedDsc", AV37OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV27GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV27GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV27GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV146GXV1 = 1 ;
      while ( AV146GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV23FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FilterFullText", AV23FilterFullText);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV83TFDisUsrCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFDisUsrCod", AV83TFDisUsrCod);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV84TFDisUsrCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFDisUsrCod_Sel", AV84TFDisUsrCod_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV58TFDisEst_SelsJson = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFDisEst_SelsJson", AV58TFDisEst_SelsJson);
            AV57TFDisEst_Sels.fromJSonString(AV58TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV86TFDisCliNum = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFDisCliNum", AV86TFDisCliNum);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV87TFDisCliNum_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFDisCliNum_Sel", AV87TFDisCliNum_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV88TFDisEncCli = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFDisEncCli", AV88TFDisEncCli);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV89TFDisEncCli_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFDisEncCli_Sel", AV89TFDisEncCli_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV50TFDisCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDisCod), 8, 0));
            AV51TFDisCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDisCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDisCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECCLI") == 0 )
         {
            AV62TFDisFecCli = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFDisFecCli", localUtil.format(AV62TFDisFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV59TFDisFec = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFDisFec", localUtil.format(AV59TFDisFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV64TFDisFecEnt = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFDisFecEnt", localUtil.format(AV64TFDisFecEnt, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod), 6, 0));
            AV43TFCliCod_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFCliNom", AV44TFCliNom);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFCliNom_Sel", AV45TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV46TFDisArtCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFDisArtCod", AV46TFDisArtCod);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV47TFDisArtCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDisArtCod_Sel", AV47TFDisArtCod_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV48TFDisArtDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDisArtDsc", AV48TFDisArtDsc);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV49TFDisArtDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFDisArtDsc_Sel", AV49TFDisArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV52TFDisColNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFDisColNom", AV52TFDisColNom);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV53TFDisColNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFDisColNom_Sel", AV53TFDisColNom_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV54TFDisColNum = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFDisColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFDisColNum), 6, 0));
            AV55TFDisColNum_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFDisColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDisColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV66TFDisTipCol = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFDisTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFDisTipCol), 2, 0));
            AV67TFDisTipCol_To = (byte)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFDisTipCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFDisTipCol_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV90TFDisNomCli = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFDisNomCli", AV90TFDisNomCli);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV91TFDisNomCli_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFDisNomCli_Sel", AV91TFDisNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV92TFDisNumCli = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFDisNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92TFDisNumCli), 6, 0));
            AV93TFDisNumCli_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFDisNumCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93TFDisNumCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV94TFMaqCodDis = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFMaqCodDis", AV94TFMaqCodDis);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV95TFMaqCodDis_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFMaqCodDis_Sel", AV95TFMaqCodDis_Sel);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV96TFDisNumPie = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFDisNumPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96TFDisNumPie), 4, 0));
            AV97TFDisNumPie_To = (short)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFDisNumPie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97TFDisNumPie_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV98TFDisNumUni = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFDisNumUni", GXutil.ltrimstr( AV98TFDisNumUni, 9, 2));
            AV99TFDisNumUni_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFDisNumUni_To", GXutil.ltrimstr( AV99TFDisNumUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV100TFDisUniMed = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100TFDisUniMed", AV100TFDisUniMed);
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV101TFDisUniMed_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101TFDisUniMed_Sel", AV101TFDisUniMed_Sel);
         }
         AV146GXV1 = (int)(AV146GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV84TFDisUsrCod_Sel)==0), AV84TFDisUsrCod_Sel, GXv_char4) ;
      dis__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFDisCliNum_Sel)==0), AV87TFDisCliNum_Sel, GXv_char3) ;
      dis__ww_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFDisEncCli_Sel)==0), AV89TFDisEncCli_Sel, GXv_char2) ;
      dis__ww_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFCliNom_Sel)==0), AV45TFCliNom_Sel, GXv_char16) ;
      dis__ww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFDisArtCod_Sel)==0), AV47TFDisArtCod_Sel, GXv_char18) ;
      dis__ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFDisArtDsc_Sel)==0), AV49TFDisArtDsc_Sel, GXv_char20) ;
      dis__ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFDisColNom_Sel)==0), AV53TFDisColNom_Sel, GXv_char22) ;
      dis__ww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFDisNomCli_Sel)==0), AV91TFDisNomCli_Sel, GXv_char24) ;
      dis__ww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFMaqCodDis_Sel)==0), AV95TFMaqCodDis_Sel, GXv_char26) ;
      dis__ww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV101TFDisUniMed_Sel)==0), AV101TFDisUniMed_Sel, GXv_char28) ;
      dis__ww_impl.this.GXt_char27 = GXv_char28[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+((AV57TFDisEst_Sels.size()==0) ? "" : AV58TFDisEst_SelsJson)+"|"+GXt_char13+"|"+GXt_char14+"||||||"+GXt_char15+"|"+GXt_char17+"|"+GXt_char19+"|"+GXt_char21+"|||"+GXt_char23+"||"+GXt_char25+"|||"+GXt_char27 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFDisUsrCod)==0), AV83TFDisUsrCod, GXv_char28) ;
      dis__ww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFDisCliNum)==0), AV86TFDisCliNum, GXv_char26) ;
      dis__ww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char23 = "" ;
      GXv_char24[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFDisEncCli)==0), AV88TFDisEncCli, GXv_char24) ;
      dis__ww_impl.this.GXt_char23 = GXv_char24[0] ;
      GXt_char21 = "" ;
      GXv_char22[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFCliNom)==0), AV44TFCliNom, GXv_char22) ;
      dis__ww_impl.this.GXt_char21 = GXv_char22[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFDisArtCod)==0), AV46TFDisArtCod, GXv_char20) ;
      dis__ww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFDisArtDsc)==0), AV48TFDisArtDsc, GXv_char18) ;
      dis__ww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFDisColNom)==0), AV52TFDisColNom, GXv_char16) ;
      dis__ww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFDisNomCli)==0), AV90TFDisNomCli, GXv_char4) ;
      dis__ww_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFMaqCodDis)==0), AV94TFMaqCodDis, GXv_char3) ;
      dis__ww_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV100TFDisUniMed)==0), AV100TFDisUniMed, GXv_char2) ;
      dis__ww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char27+"||"+GXt_char25+"|"+GXt_char23+"|"+((0==AV50TFDisCod) ? "" : GXutil.str( AV50TFDisCod, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62TFDisFecCli)) ? "" : localUtil.dtoc( AV62TFDisFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFDisFec)) ? "" : localUtil.dtoc( AV59TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFDisFecEnt)) ? "" : localUtil.dtoc( AV64TFDisFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV42TFCliCod) ? "" : GXutil.str( AV42TFCliCod, 6, 0))+"|"+GXt_char21+"|"+GXt_char19+"|"+GXt_char17+"|"+GXt_char15+"|"+((0==AV54TFDisColNum) ? "" : GXutil.str( AV54TFDisColNum, 6, 0))+"|"+((0==AV66TFDisTipCol) ? "" : GXutil.str( AV66TFDisTipCol, 2, 0))+"|"+GXt_char14+"|"+((0==AV92TFDisNumCli) ? "" : GXutil.str( AV92TFDisNumCli, 6, 0))+"|"+GXt_char13+"|"+((0==AV96TFDisNumPie) ? "" : GXutil.str( AV96TFDisNumPie, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFDisNumUni)==0) ? "" : GXutil.str( AV98TFDisNumUni, 9, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((0==AV51TFDisCod_To) ? "" : GXutil.str( AV51TFDisCod_To, 8, 0))+"||||"+((0==AV43TFCliCod_To) ? "" : GXutil.str( AV43TFCliCod_To, 6, 0))+"|||||"+((0==AV55TFDisColNum_To) ? "" : GXutil.str( AV55TFDisColNum_To, 6, 0))+"|"+((0==AV67TFDisTipCol_To) ? "" : GXutil.str( AV67TFDisTipCol_To, 2, 0))+"||"+((0==AV93TFDisNumCli_To) ? "" : GXutil.str( AV93TFDisNumCli_To, 6, 0))+"||"+((0==AV97TFDisNumPie_To) ? "" : GXutil.str( AV97TFDisNumPie_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFDisNumUni_To)==0) ? "" : GXutil.str( AV99TFDisNumUni_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV27GridState.fromxml(AV41Session.getValue(AV104Pgmname+"GridState"), null, null);
      AV27GridState.setgxTv_SdtWWPGridState_Orderedby( AV35OrderedBy );
      AV27GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV37OrderedDsc );
      AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV23FilterFullText)==0), (short)(0), AV23FilterFullText, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISUSRCOD", "", !(GXutil.strcmp("", AV83TFDisUsrCod)==0), (short)(0), AV83TFDisUsrCod, "", !(GXutil.strcmp("", AV84TFDisUsrCod_Sel)==0), AV84TFDisUsrCod_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISEST_SEL", "", !(AV57TFDisEst_Sels.size()==0), (short)(0), AV57TFDisEst_Sels.toJSonString(false), "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISCLINUM", "", !(GXutil.strcmp("", AV86TFDisCliNum)==0), (short)(0), AV86TFDisCliNum, "", !(GXutil.strcmp("", AV87TFDisCliNum_Sel)==0), AV87TFDisCliNum_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISENCCLI", "", !(GXutil.strcmp("", AV88TFDisEncCli)==0), (short)(0), AV88TFDisEncCli, "", !(GXutil.strcmp("", AV89TFDisEncCli_Sel)==0), AV89TFDisEncCli_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISCOD", "", !((0==AV50TFDisCod)&&(0==AV51TFDisCod_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFDisCod, 8, 0)), GXutil.trim( GXutil.str( AV51TFDisCod_To, 8, 0))) ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV62TFDisFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV62TFDisFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59TFDisFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV59TFDisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISFECENT", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64TFDisFecEnt)), (short)(0), GXutil.trim( localUtil.dtoc( AV64TFDisFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFCLICOD", "", !((0==AV42TFCliCod)&&(0==AV43TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV43TFCliCod_To, 6, 0))) ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFCLINOM", "", !(GXutil.strcmp("", AV44TFCliNom)==0), (short)(0), AV44TFCliNom, "", !(GXutil.strcmp("", AV45TFCliNom_Sel)==0), AV45TFCliNom_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISARTCOD", "", !(GXutil.strcmp("", AV46TFDisArtCod)==0), (short)(0), AV46TFDisArtCod, "", !(GXutil.strcmp("", AV47TFDisArtCod_Sel)==0), AV47TFDisArtCod_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISARTDSC", "", !(GXutil.strcmp("", AV48TFDisArtDsc)==0), (short)(0), AV48TFDisArtDsc, "", !(GXutil.strcmp("", AV49TFDisArtDsc_Sel)==0), AV49TFDisArtDsc_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISCOLNOM", "", !(GXutil.strcmp("", AV52TFDisColNom)==0), (short)(0), AV52TFDisColNom, "", !(GXutil.strcmp("", AV53TFDisColNom_Sel)==0), AV53TFDisColNom_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISCOLNUM", "", !((0==AV54TFDisColNum)&&(0==AV55TFDisColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFDisColNum, 6, 0)), GXutil.trim( GXutil.str( AV55TFDisColNum_To, 6, 0))) ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISTIPCOL", "", !((0==AV66TFDisTipCol)&&(0==AV67TFDisTipCol_To)), (short)(0), GXutil.trim( GXutil.str( AV66TFDisTipCol, 2, 0)), GXutil.trim( GXutil.str( AV67TFDisTipCol_To, 2, 0))) ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISNOMCLI", "", !(GXutil.strcmp("", AV90TFDisNomCli)==0), (short)(0), AV90TFDisNomCli, "", !(GXutil.strcmp("", AV91TFDisNomCli_Sel)==0), AV91TFDisNomCli_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISNUMCLI", "", !((0==AV92TFDisNumCli)&&(0==AV93TFDisNumCli_To)), (short)(0), GXutil.trim( GXutil.str( AV92TFDisNumCli, 6, 0)), GXutil.trim( GXutil.str( AV93TFDisNumCli_To, 6, 0))) ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFMAQCODDIS", "", !(GXutil.strcmp("", AV94TFMaqCodDis)==0), (short)(0), AV94TFMaqCodDis, "", !(GXutil.strcmp("", AV95TFMaqCodDis_Sel)==0), AV95TFMaqCodDis_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISNUMPIE", "", !((0==AV96TFDisNumPie)&&(0==AV97TFDisNumPie_To)), (short)(0), GXutil.trim( GXutil.str( AV96TFDisNumPie, 4, 0)), GXutil.trim( GXutil.str( AV97TFDisNumPie_To, 4, 0))) ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISNUMUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFDisNumUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFDisNumUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV98TFDisNumUni, 9, 2)), GXutil.trim( GXutil.str( AV99TFDisNumUni_To, 9, 2))) ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV27GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFDISUNIMED", "", !(GXutil.strcmp("", AV100TFDisUniMed)==0), (short)(0), AV100TFDisUniMed, "", !(GXutil.strcmp("", AV101TFDisUniMed_Sel)==0), AV101TFDisUniMed_Sel, "") ;
      AV27GridState = GXv_SdtWWPGridState29[0] ;
      AV27GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV27GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV27GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV73TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV104Pgmname );
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV29HTTPRequest.getScriptName()+"?"+AV29HTTPRequest.getQuerystring() );
      AV73TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.Dis" );
      AV41Session.setValue("TrnContext", AV73TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_87_1XL2( boolean wbgen )
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
         wb_table2_87_1XL2e( true) ;
      }
      else
      {
         wb_table2_87_1XL2e( false) ;
      }
   }

   public void wb_table1_27_1XL2( boolean wbgen )
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
         wb_table3_32_1XL2( true) ;
      }
      else
      {
         wb_table3_32_1XL2( false) ;
      }
      return  ;
   }

   public void wb_table3_32_1XL2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1XL2e( true) ;
      }
      else
      {
         wb_table1_27_1XL2e( false) ;
      }
   }

   public void wb_table3_32_1XL2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV23FilterFullText, GXutil.rtrim( localUtil.format( AV23FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Pedidos\\Dis__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_32_1XL2e( true) ;
      }
      else
      {
         wb_table3_32_1XL2e( false) ;
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
      pa1XL2( ) ;
      ws1XL2( ) ;
      we1XL2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116142787", true, true);
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
      httpContext.AddJavascriptSource("pedidos/dis__ww.js", "?202682116142787", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_45_idx ;
      chkPriCod.setInternalname( "PRICOD_"+sGXsfl_45_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_45_idx ;
      cmbDisEst.setInternalname( "DISEST_"+sGXsfl_45_idx );
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_45_idx ;
      edtDisEncCli_Internalname = "DISENCCLI_"+sGXsfl_45_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_45_idx ;
      edtDisFecCli_Internalname = "DISFECCLI_"+sGXsfl_45_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_45_idx ;
      edtDisFecEnt_Internalname = "DISFECENT_"+sGXsfl_45_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_45_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_45_idx ;
      edtDisColNom_Internalname = "DISCOLNOM_"+sGXsfl_45_idx ;
      edtDisColNum_Internalname = "DISCOLNUM_"+sGXsfl_45_idx ;
      edtDisTipCol_Internalname = "DISTIPCOL_"+sGXsfl_45_idx ;
      edtDisNomCli_Internalname = "DISNOMCLI_"+sGXsfl_45_idx ;
      edtDisNumCli_Internalname = "DISNUMCLI_"+sGXsfl_45_idx ;
      edtMaqCodDis_Internalname = "MAQCODDIS_"+sGXsfl_45_idx ;
      edtDisNumPie_Internalname = "DISNUMPIE_"+sGXsfl_45_idx ;
      edtDisNumUni_Internalname = "DISNUMUNI_"+sGXsfl_45_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_45_fel_idx ;
      chkPriCod.setInternalname( "PRICOD_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_45_fel_idx ;
      cmbDisEst.setInternalname( "DISEST_"+sGXsfl_45_fel_idx );
      edtDisCliNum_Internalname = "DISCLINUM_"+sGXsfl_45_fel_idx ;
      edtDisEncCli_Internalname = "DISENCCLI_"+sGXsfl_45_fel_idx ;
      edtDisCod_Internalname = "DISCOD_"+sGXsfl_45_fel_idx ;
      edtDisFecCli_Internalname = "DISFECCLI_"+sGXsfl_45_fel_idx ;
      edtDisFec_Internalname = "DISFEC_"+sGXsfl_45_fel_idx ;
      edtDisFecEnt_Internalname = "DISFECENT_"+sGXsfl_45_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      edtDisArtCod_Internalname = "DISARTCOD_"+sGXsfl_45_fel_idx ;
      edtDisArtDsc_Internalname = "DISARTDSC_"+sGXsfl_45_fel_idx ;
      edtDisColNom_Internalname = "DISCOLNOM_"+sGXsfl_45_fel_idx ;
      edtDisColNum_Internalname = "DISCOLNUM_"+sGXsfl_45_fel_idx ;
      edtDisTipCol_Internalname = "DISTIPCOL_"+sGXsfl_45_fel_idx ;
      edtDisNomCli_Internalname = "DISNOMCLI_"+sGXsfl_45_fel_idx ;
      edtDisNumCli_Internalname = "DISNUMCLI_"+sGXsfl_45_fel_idx ;
      edtMaqCodDis_Internalname = "MAQCODDIS_"+sGXsfl_45_fel_idx ;
      edtDisNumPie_Internalname = "DISNUMPIE_"+sGXsfl_45_fel_idx ;
      edtDisNumUni_Internalname = "DISNUMUNI_"+sGXsfl_45_fel_idx ;
      edtDisUniMed_Internalname = "DISUNIMED_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1XL0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_45_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_45_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_45_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV24GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV24GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV24GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e241xl2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV24GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV81DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+""+"'"+",false,"+"'"+"e251xl2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PRICOD_" + sGXsfl_45_idx ;
         chkPriCod.setName( GXCCtl );
         chkPriCod.setWebtags( "" );
         chkPriCod.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), !bGXsfl_45_Refreshing);
         chkPriCod.setCheckedValue( "0" );
         A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkPriCod.getInternalname(),A757PriCod,"","",Integer.valueOf(0),Integer.valueOf(0),"1","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisUsrCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUsrCod_Internalname,GXutil.rtrim( A4348DisUsrCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisUsrCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbDisEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbDisEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DISEST_" + sGXsfl_45_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbDisEst,cmbDisEst.getInternalname(),GXutil.trim( GXutil.str( A367DisEst, 1, 0)),Integer.valueOf(1),cmbDisEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbDisEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbDisEst.setValue( GXutil.trim( GXutil.str( A367DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDisEst.getInternalname(), "Values", cmbDisEst.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisCliNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCliNum_Internalname,GXutil.rtrim( A360DisCliNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCliNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisCliNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisEncCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisEncCli_Internalname,GXutil.rtrim( A4813DisEncCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisEncCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisEncCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisCod_Internalname,GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisFecCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFecCli_Internalname,localUtil.format(A370DisFecCli, "99/99/99"),localUtil.format( A370DisFecCli, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisFecCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFec_Internalname,localUtil.format(A369DisFec, "99/99/99"),localUtil.format( A369DisFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisFecEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisFecEnt_Internalname,localUtil.format(A371DisFecEnt, "99/99/99"),localUtil.format( A371DisFecEnt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisFecEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisArtCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtCod_Internalname,GXutil.rtrim( A335DisArtCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisArtCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisArtDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisArtDsc_Internalname,GXutil.rtrim( A337DisArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisArtDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisArtDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNom_Internalname,GXutil.rtrim( A362DisColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A363DisColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A363DisColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisTipCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisTipCol_Internalname,GXutil.ltrim( localUtil.ntoc( A390DisTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A390DisTipCol), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisTipCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtDisTipCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNomCli_Internalname,GXutil.rtrim( A1195DisNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisNumCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1196DisNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1196DisNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisNumCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCodDis_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodDis_Internalname,GXutil.rtrim( A1122MaqCodDis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCodDis_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisNumPie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumPie_Internalname,GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A374DisNumPie), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisNumPie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDisNumUni_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisNumUni_Internalname,GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A375DisNumUni, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisNumUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisNumUni_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtDisUniMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUniMed_Internalname,GXutil.rtrim( A392DisUniMed),GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDisUniMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1XL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_45_idx = ((subGrid_Islastpage==1)&&(nGXsfl_45_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
      }
      /* End function sendrow_452 */
   }

   public void startgridcontrol45( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"45\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisNumPie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisNumUni_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDisUniMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV81DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A374DisNumPie, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisNumPie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A375DisNumUni, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisNumUni_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A392DisUniMed));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDisUniMed_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
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
      edtDisNumPie_Internalname = "DISNUMPIE" ;
      edtDisNumUni_Internalname = "DISNUMUNI" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_disfeccliauxdate_Internalname = "vDDO_DISFECCLIAUXDATE" ;
      divDdo_disfeccliauxdates_Internalname = "DDO_DISFECCLIAUXDATES" ;
      edtavDdo_disfecauxdate_Internalname = "vDDO_DISFECAUXDATE" ;
      divDdo_disfecauxdates_Internalname = "DDO_DISFECAUXDATES" ;
      edtavDdo_disfecentauxdate_Internalname = "vDDO_DISFECENTAUXDATE" ;
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
      edtDisUniMed_Jsonclick = "" ;
      edtDisNumUni_Jsonclick = "" ;
      edtDisNumPie_Jsonclick = "" ;
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
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtDisUniMed_Visible = -1 ;
      edtDisNumUni_Visible = -1 ;
      edtDisNumPie_Visible = -1 ;
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
      edtavDdo_disfecentauxdate_Jsonclick = "" ;
      edtavDdo_disfecauxdate_Jsonclick = "" ;
      edtavDdo_disfeccliauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
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
      Ddo_grid_Datalistproc = "Pedidos.Dis__WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|1:En Pedido,3:En Produccion|||||||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "|T|||||||||||||||||||" ;
      Ddo_grid_Datalisttype = "Dynamic|FixedValues|Dynamic|Dynamic||||||Dynamic|Dynamic|Dynamic|Dynamic|||Dynamic||Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T|T||||||T|T|T|T|||T||T|||T" ;
      Ddo_grid_Filterisrange = "||||T||||T|||||T|T||T||T|T|" ;
      Ddo_grid_Filtertype = "Character||Character|Character|Numeric|Date|Date|Date|Numeric|Character|Character|Character|Character|Numeric|Numeric|Character|Numeric|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T||T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22" ;
      Ddo_grid_Columnids = "4:DisUsrCod|5:DisEst|6:DisCliNum|7:DisEncCli|8:DisCod|9:DisFecCli|10:DisFec|11:DisFecEnt|12:CliCod|13:CliNom|14:DisArtCod|15:DisArtDsc|16:DisColNom|17:DisColNum|18:DisTipCol|19:DisNomCli|20:DisNumCli|21:MaqCodDis|22:DisNumPie|23:DisNumUni|24:DisUniMed" ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_45_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV24GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV24GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridActions), 4, 0));
      }
      GXCCtl = "PRICOD_" + sGXsfl_45_idx ;
      chkPriCod.setName( GXCCtl );
      chkPriCod.setWebtags( "" );
      chkPriCod.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPriCod.getInternalname(), "TitleCaption", chkPriCod.getCaption(), !bGXsfl_45_Refreshing);
      chkPriCod.setCheckedValue( "0" );
      A757PriCod = ((GXutil.strcmp(GXutil.rtrim( A757PriCod), "1")==0) ? "1" : "0") ;
      GXCCtl = "DISEST_" + sGXsfl_45_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121XL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131XL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141XL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e231XL2',iparms:[{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV24GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV81DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151XL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111XL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e241XL2',iparms:[{av:'cmbavGridactions'},{av:'AV24GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV24GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161XL2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtDisUsrCod_Visible',ctrl:'DISUSRCOD',prop:'Visible'},{av:'cmbDisEst'},{av:'edtDisCliNum_Visible',ctrl:'DISCLINUM',prop:'Visible'},{av:'edtDisEncCli_Visible',ctrl:'DISENCCLI',prop:'Visible'},{av:'edtDisCod_Visible',ctrl:'DISCOD',prop:'Visible'},{av:'edtDisFecCli_Visible',ctrl:'DISFECCLI',prop:'Visible'},{av:'edtDisFec_Visible',ctrl:'DISFEC',prop:'Visible'},{av:'edtDisFecEnt_Visible',ctrl:'DISFECENT',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtDisArtCod_Visible',ctrl:'DISARTCOD',prop:'Visible'},{av:'edtDisArtDsc_Visible',ctrl:'DISARTDSC',prop:'Visible'},{av:'edtDisColNom_Visible',ctrl:'DISCOLNOM',prop:'Visible'},{av:'edtDisColNum_Visible',ctrl:'DISCOLNUM',prop:'Visible'},{av:'edtDisTipCol_Visible',ctrl:'DISTIPCOL',prop:'Visible'},{av:'edtDisNomCli_Visible',ctrl:'DISNOMCLI',prop:'Visible'},{av:'edtDisNumCli_Visible',ctrl:'DISNUMCLI',prop:'Visible'},{av:'edtMaqCodDis_Visible',ctrl:'MAQCODDIS',prop:'Visible'},{av:'edtDisNumPie_Visible',ctrl:'DISNUMPIE',prop:'Visible'},{av:'edtDisNumUni_Visible',ctrl:'DISNUMUNI',prop:'Visible'},{av:'edtDisUniMed_Visible',ctrl:'DISUNIMED',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV31ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e171XL2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e181XL2',iparms:[{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e191XL2',iparms:[{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e201XL2',iparms:[{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV27GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV32ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV9ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV83TFDisUsrCod',fld:'vTFDISUSRCOD',pic:''},{av:'AV84TFDisUsrCod_Sel',fld:'vTFDISUSRCOD_SEL',pic:''},{av:'AV57TFDisEst_Sels',fld:'vTFDISEST_SELS',pic:''},{av:'AV86TFDisCliNum',fld:'vTFDISCLINUM',pic:''},{av:'AV87TFDisCliNum_Sel',fld:'vTFDISCLINUM_SEL',pic:''},{av:'AV88TFDisEncCli',fld:'vTFDISENCCLI',pic:''},{av:'AV89TFDisEncCli_Sel',fld:'vTFDISENCCLI_SEL',pic:''},{av:'AV50TFDisCod',fld:'vTFDISCOD',pic:'ZZZZZZZ9'},{av:'AV51TFDisCod_To',fld:'vTFDISCOD_TO',pic:'ZZZZZZZ9'},{av:'AV62TFDisFecCli',fld:'vTFDISFECCLI',pic:''},{av:'AV59TFDisFec',fld:'vTFDISFEC',pic:''},{av:'AV64TFDisFecEnt',fld:'vTFDISFECENT',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFDisArtCod',fld:'vTFDISARTCOD',pic:''},{av:'AV47TFDisArtCod_Sel',fld:'vTFDISARTCOD_SEL',pic:''},{av:'AV48TFDisArtDsc',fld:'vTFDISARTDSC',pic:''},{av:'AV49TFDisArtDsc_Sel',fld:'vTFDISARTDSC_SEL',pic:''},{av:'AV52TFDisColNom',fld:'vTFDISCOLNOM',pic:''},{av:'AV53TFDisColNom_Sel',fld:'vTFDISCOLNOM_SEL',pic:''},{av:'AV54TFDisColNum',fld:'vTFDISCOLNUM',pic:'ZZZZZ9'},{av:'AV55TFDisColNum_To',fld:'vTFDISCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV66TFDisTipCol',fld:'vTFDISTIPCOL',pic:'Z9'},{av:'AV67TFDisTipCol_To',fld:'vTFDISTIPCOL_TO',pic:'Z9'},{av:'AV90TFDisNomCli',fld:'vTFDISNOMCLI',pic:''},{av:'AV91TFDisNomCli_Sel',fld:'vTFDISNOMCLI_SEL',pic:''},{av:'AV92TFDisNumCli',fld:'vTFDISNUMCLI',pic:'ZZZZZ9'},{av:'AV93TFDisNumCli_To',fld:'vTFDISNUMCLI_TO',pic:'ZZZZZ9'},{av:'AV94TFMaqCodDis',fld:'vTFMAQCODDIS',pic:''},{av:'AV95TFMaqCodDis_Sel',fld:'vTFMAQCODDIS_SEL',pic:''},{av:'AV96TFDisNumPie',fld:'vTFDISNUMPIE',pic:'ZZZ9'},{av:'AV97TFDisNumPie_To',fld:'vTFDISNUMPIE_TO',pic:'ZZZ9'},{av:'AV98TFDisNumUni',fld:'vTFDISNUMUNI',pic:'ZZZZZ9.99'},{av:'AV99TFDisNumUni_To',fld:'vTFDISNUMUNI_TO',pic:'ZZZZZ9.99'},{av:'AV100TFDisUniMed',fld:'vTFDISUNIMED',pic:'@!'},{av:'AV101TFDisUniMed_Sel',fld:'vTFDISUNIMED_SEL',pic:'@!'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV58TFDisEst_SelsJson',fld:'vTFDISEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e251XL2',iparms:[{av:'cmbDisEst'},{av:'A367DisEst',fld:'DISEST',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
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
      setEventMetadata("VALID_DISNUMPIE","{handler:'valid_Disnumpie',iparms:[]");
      setEventMetadata("VALID_DISNUMPIE",",oparms:[]}");
      setEventMetadata("VALID_DISNUMUNI","{handler:'valid_Disnumuni',iparms:[]");
      setEventMetadata("VALID_DISNUMUNI",",oparms:[]}");
      setEventMetadata("VALID_DISUNIMED","{handler:'valid_Disunimed',iparms:[]");
      setEventMetadata("VALID_DISUNIMED",",oparms:[]}");
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
      AV9ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV23FilterFullText = "" ;
      AV83TFDisUsrCod = "" ;
      AV84TFDisUsrCod_Sel = "" ;
      AV57TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV86TFDisCliNum = "" ;
      AV87TFDisCliNum_Sel = "" ;
      AV88TFDisEncCli = "" ;
      AV89TFDisEncCli_Sel = "" ;
      AV62TFDisFecCli = GXutil.nullDate() ;
      AV59TFDisFec = GXutil.nullDate() ;
      AV64TFDisFecEnt = GXutil.nullDate() ;
      AV44TFCliNom = "" ;
      AV45TFCliNom_Sel = "" ;
      AV46TFDisArtCod = "" ;
      AV47TFDisArtCod_Sel = "" ;
      AV48TFDisArtDsc = "" ;
      AV49TFDisArtDsc_Sel = "" ;
      AV52TFDisColNom = "" ;
      AV53TFDisColNom_Sel = "" ;
      AV90TFDisNomCli = "" ;
      AV91TFDisNomCli_Sel = "" ;
      AV94TFMaqCodDis = "" ;
      AV95TFMaqCodDis_Sel = "" ;
      AV98TFDisNumUni = DecimalUtil.ZERO ;
      AV99TFDisNumUni_To = DecimalUtil.ZERO ;
      AV100TFDisUniMed = "" ;
      AV101TFDisUniMed_Sel = "" ;
      AV104Pgmname = "" ;
      AV8UsurCod = "" ;
      AV7Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV31ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV18DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV58TFDisEst_SelsJson = "" ;
      AV20EmprCod_Selected = "" ;
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
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV14DDO_DisFecCliAuxDate = GXutil.nullDate() ;
      AV12DDO_DisFecAuxDate = GXutil.nullDate() ;
      AV16DDO_DisFecEntAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV81DetailWebComponent = "" ;
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
      Gx_date = GXutil.nullDate() ;
      AV107Pedidos_dis__wwds_1_filterfulltext = "" ;
      AV108Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      AV109Pedidos_dis__wwds_3_tfdisusrcod_sel = "" ;
      AV110Pedidos_dis__wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV111Pedidos_dis__wwds_5_tfdisclinum = "" ;
      AV112Pedidos_dis__wwds_6_tfdisclinum_sel = "" ;
      AV113Pedidos_dis__wwds_7_tfdisenccli = "" ;
      AV114Pedidos_dis__wwds_8_tfdisenccli_sel = "" ;
      AV117Pedidos_dis__wwds_11_tfdisfeccli = GXutil.nullDate() ;
      AV118Pedidos_dis__wwds_12_tfdisfec = GXutil.nullDate() ;
      AV119Pedidos_dis__wwds_13_tfdisfecent = GXutil.nullDate() ;
      AV122Pedidos_dis__wwds_16_tfclinom = "" ;
      AV123Pedidos_dis__wwds_17_tfclinom_sel = "" ;
      AV124Pedidos_dis__wwds_18_tfdisartcod = "" ;
      AV125Pedidos_dis__wwds_19_tfdisartcod_sel = "" ;
      AV126Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      AV127Pedidos_dis__wwds_21_tfdisartdsc_sel = "" ;
      AV128Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      AV129Pedidos_dis__wwds_23_tfdiscolnom_sel = "" ;
      AV134Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      AV135Pedidos_dis__wwds_29_tfdisnomcli_sel = "" ;
      AV138Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel = "" ;
      AV142Pedidos_dis__wwds_36_tfdisnumuni = DecimalUtil.ZERO ;
      AV143Pedidos_dis__wwds_37_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV144Pedidos_dis__wwds_38_tfdisunimed = "" ;
      AV145Pedidos_dis__wwds_39_tfdisunimed_sel = "" ;
      scmdbuf = "" ;
      lV107Pedidos_dis__wwds_1_filterfulltext = "" ;
      lV108Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      lV111Pedidos_dis__wwds_5_tfdisclinum = "" ;
      lV113Pedidos_dis__wwds_7_tfdisenccli = "" ;
      lV122Pedidos_dis__wwds_16_tfclinom = "" ;
      lV124Pedidos_dis__wwds_18_tfdisartcod = "" ;
      lV126Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      lV128Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      lV134Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      lV138Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      lV144Pedidos_dis__wwds_38_tfdisunimed = "" ;
      H01XL2_A396EmprCod = new String[] {""} ;
      H01XL2_A392DisUniMed = new String[] {""} ;
      H01XL2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XL2_A374DisNumPie = new short[1] ;
      H01XL2_A1122MaqCodDis = new String[] {""} ;
      H01XL2_n1122MaqCodDis = new boolean[] {false} ;
      H01XL2_A1196DisNumCli = new int[1] ;
      H01XL2_A1195DisNomCli = new String[] {""} ;
      H01XL2_A390DisTipCol = new byte[1] ;
      H01XL2_n390DisTipCol = new boolean[] {false} ;
      H01XL2_A363DisColNum = new int[1] ;
      H01XL2_n363DisColNum = new boolean[] {false} ;
      H01XL2_A362DisColNom = new String[] {""} ;
      H01XL2_n362DisColNom = new boolean[] {false} ;
      H01XL2_A337DisArtDsc = new String[] {""} ;
      H01XL2_A335DisArtCod = new String[] {""} ;
      H01XL2_A279CliNom = new String[] {""} ;
      H01XL2_A252CliCod = new int[1] ;
      H01XL2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H01XL2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01XL2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01XL2_A361DisCod = new int[1] ;
      H01XL2_A4813DisEncCli = new String[] {""} ;
      H01XL2_A360DisCliNum = new String[] {""} ;
      H01XL2_A367DisEst = new byte[1] ;
      H01XL2_A4348DisUsrCod = new String[] {""} ;
      H01XL2_A757PriCod = new String[] {""} ;
      H01XL3_A396EmprCod = new String[] {""} ;
      H01XL3_A392DisUniMed = new String[] {""} ;
      H01XL3_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01XL3_A374DisNumPie = new short[1] ;
      H01XL3_A1122MaqCodDis = new String[] {""} ;
      H01XL3_n1122MaqCodDis = new boolean[] {false} ;
      H01XL3_A1196DisNumCli = new int[1] ;
      H01XL3_A1195DisNomCli = new String[] {""} ;
      H01XL3_A390DisTipCol = new byte[1] ;
      H01XL3_n390DisTipCol = new boolean[] {false} ;
      H01XL3_A363DisColNum = new int[1] ;
      H01XL3_n363DisColNum = new boolean[] {false} ;
      H01XL3_A362DisColNom = new String[] {""} ;
      H01XL3_n362DisColNom = new boolean[] {false} ;
      H01XL3_A337DisArtDsc = new String[] {""} ;
      H01XL3_A335DisArtCod = new String[] {""} ;
      H01XL3_A279CliNom = new String[] {""} ;
      H01XL3_A252CliCod = new int[1] ;
      H01XL3_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H01XL3_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01XL3_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H01XL3_A361DisCod = new int[1] ;
      H01XL3_A4813DisEncCli = new String[] {""} ;
      H01XL3_A360DisCliNum = new String[] {""} ;
      H01XL3_A367DisEst = new byte[1] ;
      H01XL3_A4348DisUsrCod = new String[] {""} ;
      H01XL3_A757PriCod = new String[] {""} ;
      hsh = "" ;
      AV6EmprNom = "" ;
      AV105Emprcod = "" ;
      AV29HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV61TFDisFec_To = GXutil.nullDate() ;
      AV78WebSessionReset = "" ;
      AV77WebSessionDatos = "" ;
      AV79WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV11ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV33ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV21ErrorMessage = "" ;
      AV75UserCustomValue = "" ;
      AV10ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      GXv_int12 = new int[1] ;
      AV82Inc_obs = "" ;
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState29 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV73TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis__ww__default(),
         new Object[] {
             new Object[] {
            H01XL2_A396EmprCod, H01XL2_A392DisUniMed, H01XL2_A375DisNumUni, H01XL2_A374DisNumPie, H01XL2_A1122MaqCodDis, H01XL2_n1122MaqCodDis, H01XL2_A1196DisNumCli, H01XL2_A1195DisNomCli, H01XL2_A390DisTipCol, H01XL2_n390DisTipCol,
            H01XL2_A363DisColNum, H01XL2_n363DisColNum, H01XL2_A362DisColNom, H01XL2_n362DisColNom, H01XL2_A337DisArtDsc, H01XL2_A335DisArtCod, H01XL2_A279CliNom, H01XL2_A252CliCod, H01XL2_A371DisFecEnt, H01XL2_A369DisFec,
            H01XL2_A370DisFecCli, H01XL2_A361DisCod, H01XL2_A4813DisEncCli, H01XL2_A360DisCliNum, H01XL2_A367DisEst, H01XL2_A4348DisUsrCod, H01XL2_A757PriCod
            }
            , new Object[] {
            H01XL3_A396EmprCod, H01XL3_A392DisUniMed, H01XL3_A375DisNumUni, H01XL3_A374DisNumPie, H01XL3_A1122MaqCodDis, H01XL3_n1122MaqCodDis, H01XL3_A1196DisNumCli, H01XL3_A1195DisNomCli, H01XL3_A390DisTipCol, H01XL3_n390DisTipCol,
            H01XL3_A363DisColNum, H01XL3_n363DisColNum, H01XL3_A362DisColNom, H01XL3_n362DisColNom, H01XL3_A337DisArtDsc, H01XL3_A335DisArtCod, H01XL3_A279CliNom, H01XL3_A252CliCod, H01XL3_A371DisFecEnt, H01XL3_A369DisFec,
            H01XL3_A370DisFecCli, H01XL3_A361DisCod, H01XL3_A4813DisEncCli, H01XL3_A360DisCliNum, H01XL3_A367DisEst, H01XL3_A4348DisUsrCod, H01XL3_A757PriCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV104Pgmname = "Pedidos.Dis__WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV104Pgmname = "Pedidos.Dis__WW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV32ManageFiltersExecutionStep ;
   private byte AV66TFDisTipCol ;
   private byte AV67TFDisTipCol_To ;
   private byte gxajaxcallmode ;
   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte nDonePA ;
   private byte AV132Pedidos_dis__wwds_26_tfdistipcol ;
   private byte AV133Pedidos_dis__wwds_27_tfdistipcol_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV96TFDisNumPie ;
   private short AV97TFDisNumPie_To ;
   private short AV35OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV24GridActions ;
   private short A374DisNumPie ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV140Pedidos_dis__wwds_34_tfdisnumpie ;
   private short AV141Pedidos_dis__wwds_35_tfdisnumpie_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV50TFDisCod ;
   private int AV51TFDisCod_To ;
   private int AV42TFCliCod ;
   private int AV43TFCliCod_To ;
   private int AV54TFDisColNum ;
   private int AV55TFDisColNum_To ;
   private int AV92TFDisNumCli ;
   private int AV93TFDisNumCli_To ;
   private int AV19DisCod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int AV115Pedidos_dis__wwds_9_tfdiscod ;
   private int AV116Pedidos_dis__wwds_10_tfdiscod_to ;
   private int AV120Pedidos_dis__wwds_14_tfclicod ;
   private int AV121Pedidos_dis__wwds_15_tfclicod_to ;
   private int AV130Pedidos_dis__wwds_24_tfdiscolnum ;
   private int AV131Pedidos_dis__wwds_25_tfdiscolnum_to ;
   private int AV136Pedidos_dis__wwds_30_tfdisnumcli ;
   private int AV137Pedidos_dis__wwds_31_tfdisnumcli_to ;
   private int AV110Pedidos_dis__wwds_4_tfdisest_sels_size ;
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
   private int edtDisNumPie_Visible ;
   private int edtDisNumUni_Visible ;
   private int edtDisUniMed_Visible ;
   private int AV38PageToGo ;
   private int GXv_int12[] ;
   private int AV146GXV1 ;
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
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV98TFDisNumUni ;
   private java.math.BigDecimal AV99TFDisNumUni_To ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV142Pedidos_dis__wwds_36_tfdisnumuni ;
   private java.math.BigDecimal AV143Pedidos_dis__wwds_37_tfdisnumuni_to ;
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
   private String sGXsfl_45_idx="0001" ;
   private String A396EmprCod ;
   private String AV83TFDisUsrCod ;
   private String AV84TFDisUsrCod_Sel ;
   private String AV86TFDisCliNum ;
   private String AV87TFDisCliNum_Sel ;
   private String AV88TFDisEncCli ;
   private String AV89TFDisEncCli_Sel ;
   private String AV44TFCliNom ;
   private String AV45TFCliNom_Sel ;
   private String AV46TFDisArtCod ;
   private String AV47TFDisArtCod_Sel ;
   private String AV48TFDisArtDsc ;
   private String AV49TFDisArtDsc_Sel ;
   private String AV52TFDisColNom ;
   private String AV53TFDisColNom_Sel ;
   private String AV90TFDisNomCli ;
   private String AV91TFDisNomCli_Sel ;
   private String AV94TFMaqCodDis ;
   private String AV95TFMaqCodDis_Sel ;
   private String AV100TFDisUniMed ;
   private String AV101TFDisUniMed_Sel ;
   private String AV104Pgmname ;
   private String AV8UsurCod ;
   private String AV7Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV20EmprCod_Selected ;
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
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_disfeccliauxdates_Internalname ;
   private String edtavDdo_disfeccliauxdate_Internalname ;
   private String edtavDdo_disfeccliauxdate_Jsonclick ;
   private String divDdo_disfecauxdates_Internalname ;
   private String edtavDdo_disfecauxdate_Internalname ;
   private String edtavDdo_disfecauxdate_Jsonclick ;
   private String divDdo_disfecentauxdates_Internalname ;
   private String edtavDdo_disfecentauxdate_Internalname ;
   private String edtavDdo_disfecentauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV81DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
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
   private String edtDisNumPie_Internalname ;
   private String edtDisNumUni_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV108Pedidos_dis__wwds_2_tfdisusrcod ;
   private String AV109Pedidos_dis__wwds_3_tfdisusrcod_sel ;
   private String AV111Pedidos_dis__wwds_5_tfdisclinum ;
   private String AV112Pedidos_dis__wwds_6_tfdisclinum_sel ;
   private String AV113Pedidos_dis__wwds_7_tfdisenccli ;
   private String AV114Pedidos_dis__wwds_8_tfdisenccli_sel ;
   private String AV122Pedidos_dis__wwds_16_tfclinom ;
   private String AV123Pedidos_dis__wwds_17_tfclinom_sel ;
   private String AV124Pedidos_dis__wwds_18_tfdisartcod ;
   private String AV125Pedidos_dis__wwds_19_tfdisartcod_sel ;
   private String AV126Pedidos_dis__wwds_20_tfdisartdsc ;
   private String AV127Pedidos_dis__wwds_21_tfdisartdsc_sel ;
   private String AV128Pedidos_dis__wwds_22_tfdiscolnom ;
   private String AV129Pedidos_dis__wwds_23_tfdiscolnom_sel ;
   private String AV134Pedidos_dis__wwds_28_tfdisnomcli ;
   private String AV135Pedidos_dis__wwds_29_tfdisnomcli_sel ;
   private String AV138Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel ;
   private String AV144Pedidos_dis__wwds_38_tfdisunimed ;
   private String AV145Pedidos_dis__wwds_39_tfdisunimed_sel ;
   private String scmdbuf ;
   private String lV108Pedidos_dis__wwds_2_tfdisusrcod ;
   private String lV111Pedidos_dis__wwds_5_tfdisclinum ;
   private String lV113Pedidos_dis__wwds_7_tfdisenccli ;
   private String lV122Pedidos_dis__wwds_16_tfclinom ;
   private String lV124Pedidos_dis__wwds_18_tfdisartcod ;
   private String lV126Pedidos_dis__wwds_20_tfdisartdsc ;
   private String lV128Pedidos_dis__wwds_22_tfdiscolnom ;
   private String lV134Pedidos_dis__wwds_28_tfdisnomcli ;
   private String lV138Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String lV144Pedidos_dis__wwds_38_tfdisunimed ;
   private String hsh ;
   private String AV6EmprNom ;
   private String AV105Emprcod ;
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
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
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
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
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
   private String edtDisNumPie_Jsonclick ;
   private String edtDisNumUni_Jsonclick ;
   private String edtDisUniMed_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV62TFDisFecCli ;
   private java.util.Date AV59TFDisFec ;
   private java.util.Date AV64TFDisFecEnt ;
   private java.util.Date AV14DDO_DisFecCliAuxDate ;
   private java.util.Date AV12DDO_DisFecAuxDate ;
   private java.util.Date AV16DDO_DisFecEntAuxDate ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date Gx_date ;
   private java.util.Date AV117Pedidos_dis__wwds_11_tfdisfeccli ;
   private java.util.Date AV118Pedidos_dis__wwds_12_tfdisfec ;
   private java.util.Date AV119Pedidos_dis__wwds_13_tfdisfecent ;
   private java.util.Date AV61TFDisFec_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV37OrderedDsc ;
   private boolean AV85VisualizarAcciones ;
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
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n362DisColNom ;
   private boolean n363DisColNum ;
   private boolean n390DisTipCol ;
   private boolean n1122MaqCodDis ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV58TFDisEst_SelsJson ;
   private String AV11ColumnsSelectorXML ;
   private String AV33ManageFiltersXml ;
   private String AV75UserCustomValue ;
   private String AV23FilterFullText ;
   private String AV107Pedidos_dis__wwds_1_filterfulltext ;
   private String lV107Pedidos_dis__wwds_1_filterfulltext ;
   private String AV78WebSessionReset ;
   private String AV77WebSessionDatos ;
   private String AV22ExcelFilename ;
   private String AV21ErrorMessage ;
   private String AV82Inc_obs ;
   private GXSimpleCollection<Byte> AV57TFDisEst_Sels ;
   private GXSimpleCollection<Byte> AV110Pedidos_dis__wwds_4_tfdisest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV29HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkPriCod ;
   private HTMLChoice cmbDisEst ;
   private IDataStoreProvider pr_default ;
   private String[] H01XL2_A396EmprCod ;
   private String[] H01XL2_A392DisUniMed ;
   private java.math.BigDecimal[] H01XL2_A375DisNumUni ;
   private short[] H01XL2_A374DisNumPie ;
   private String[] H01XL2_A1122MaqCodDis ;
   private boolean[] H01XL2_n1122MaqCodDis ;
   private int[] H01XL2_A1196DisNumCli ;
   private String[] H01XL2_A1195DisNomCli ;
   private byte[] H01XL2_A390DisTipCol ;
   private boolean[] H01XL2_n390DisTipCol ;
   private int[] H01XL2_A363DisColNum ;
   private boolean[] H01XL2_n363DisColNum ;
   private String[] H01XL2_A362DisColNom ;
   private boolean[] H01XL2_n362DisColNom ;
   private String[] H01XL2_A337DisArtDsc ;
   private String[] H01XL2_A335DisArtCod ;
   private String[] H01XL2_A279CliNom ;
   private int[] H01XL2_A252CliCod ;
   private java.util.Date[] H01XL2_A371DisFecEnt ;
   private java.util.Date[] H01XL2_A369DisFec ;
   private java.util.Date[] H01XL2_A370DisFecCli ;
   private int[] H01XL2_A361DisCod ;
   private String[] H01XL2_A4813DisEncCli ;
   private String[] H01XL2_A360DisCliNum ;
   private byte[] H01XL2_A367DisEst ;
   private String[] H01XL2_A4348DisUsrCod ;
   private String[] H01XL2_A757PriCod ;
   private String[] H01XL3_A396EmprCod ;
   private String[] H01XL3_A392DisUniMed ;
   private java.math.BigDecimal[] H01XL3_A375DisNumUni ;
   private short[] H01XL3_A374DisNumPie ;
   private String[] H01XL3_A1122MaqCodDis ;
   private boolean[] H01XL3_n1122MaqCodDis ;
   private int[] H01XL3_A1196DisNumCli ;
   private String[] H01XL3_A1195DisNomCli ;
   private byte[] H01XL3_A390DisTipCol ;
   private boolean[] H01XL3_n390DisTipCol ;
   private int[] H01XL3_A363DisColNum ;
   private boolean[] H01XL3_n363DisColNum ;
   private String[] H01XL3_A362DisColNom ;
   private boolean[] H01XL3_n362DisColNom ;
   private String[] H01XL3_A337DisArtDsc ;
   private String[] H01XL3_A335DisArtCod ;
   private String[] H01XL3_A279CliNom ;
   private int[] H01XL3_A252CliCod ;
   private java.util.Date[] H01XL3_A371DisFecEnt ;
   private java.util.Date[] H01XL3_A369DisFec ;
   private java.util.Date[] H01XL3_A370DisFecCli ;
   private int[] H01XL3_A361DisCod ;
   private String[] H01XL3_A4813DisEncCli ;
   private String[] H01XL3_A360DisCliNum ;
   private byte[] H01XL3_A367DisEst ;
   private String[] H01XL3_A4348DisUsrCod ;
   private String[] H01XL3_A757PriCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV31ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV9ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV10ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV18DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState29[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV73TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV79WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class dis__ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01XL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV110Pedidos_dis__wwds_4_tfdisest_sels ,
                                          String AV109Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                          String AV108Pedidos_dis__wwds_2_tfdisusrcod ,
                                          int AV110Pedidos_dis__wwds_4_tfdisest_sels_size ,
                                          String AV112Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                          String AV111Pedidos_dis__wwds_5_tfdisclinum ,
                                          String AV114Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                          String AV113Pedidos_dis__wwds_7_tfdisenccli ,
                                          int AV115Pedidos_dis__wwds_9_tfdiscod ,
                                          int AV116Pedidos_dis__wwds_10_tfdiscod_to ,
                                          java.util.Date AV117Pedidos_dis__wwds_11_tfdisfeccli ,
                                          java.util.Date AV118Pedidos_dis__wwds_12_tfdisfec ,
                                          java.util.Date AV119Pedidos_dis__wwds_13_tfdisfecent ,
                                          int AV120Pedidos_dis__wwds_14_tfclicod ,
                                          int AV121Pedidos_dis__wwds_15_tfclicod_to ,
                                          String AV123Pedidos_dis__wwds_17_tfclinom_sel ,
                                          String AV122Pedidos_dis__wwds_16_tfclinom ,
                                          String AV125Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                          String AV124Pedidos_dis__wwds_18_tfdisartcod ,
                                          String AV127Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                          String AV126Pedidos_dis__wwds_20_tfdisartdsc ,
                                          String AV129Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                          String AV128Pedidos_dis__wwds_22_tfdiscolnom ,
                                          int AV130Pedidos_dis__wwds_24_tfdiscolnum ,
                                          int AV131Pedidos_dis__wwds_25_tfdiscolnum_to ,
                                          byte AV132Pedidos_dis__wwds_26_tfdistipcol ,
                                          byte AV133Pedidos_dis__wwds_27_tfdistipcol_to ,
                                          String AV135Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                          String AV134Pedidos_dis__wwds_28_tfdisnomcli ,
                                          int AV136Pedidos_dis__wwds_30_tfdisnumcli ,
                                          int AV137Pedidos_dis__wwds_31_tfdisnumcli_to ,
                                          String AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                          String AV138Pedidos_dis__wwds_32_tfmaqcoddis ,
                                          short AV140Pedidos_dis__wwds_34_tfdisnumpie ,
                                          short AV141Pedidos_dis__wwds_35_tfdisnumpie_to ,
                                          java.math.BigDecimal AV142Pedidos_dis__wwds_36_tfdisnumuni ,
                                          java.math.BigDecimal AV143Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                          String AV145Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                          String AV144Pedidos_dis__wwds_38_tfdisunimed ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
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
                                          short A374DisNumPie ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short AV35OrderedBy ,
                                          boolean AV37OrderedDsc ,
                                          String AV107Pedidos_dis__wwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[38];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisUniMed, T1.DisNumUni, T1.DisNumPie, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisCod, T1.DisEncCli, T1.DisCliNum, T1.DisEst, T1.DisUsrCod, T1.PriCod FROM (TXPDISPOS T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV109Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Pedidos_dis__wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int30[2] = (byte)(1) ;
      }
      if ( AV110Pedidos_dis__wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Pedidos_dis__wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Pedidos_dis__wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_dis__wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_dis__wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int30[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Pedidos_dis__wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV113Pedidos_dis__wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Pedidos_dis__wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( ! (0==AV115Pedidos_dis__wwds_9_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis__wwds_10_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Pedidos_dis__wwds_11_tfdisfeccli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV118Pedidos_dis__wwds_12_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Pedidos_dis__wwds_13_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Pedidos_dis__wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( ! (0==AV121Pedidos_dis__wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Pedidos_dis__wwds_17_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV122Pedidos_dis__wwds_16_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Pedidos_dis__wwds_17_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int30[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_dis__wwds_19_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_dis__wwds_18_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_dis__wwds_19_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int30[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV126Pedidos_dis__wwds_20_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int30[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_dis__wwds_22_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int30[21] = (byte)(1) ;
      }
      if ( ! (0==AV130Pedidos_dis__wwds_24_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int30[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Pedidos_dis__wwds_25_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int30[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Pedidos_dis__wwds_26_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int30[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Pedidos_dis__wwds_27_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int30[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV134Pedidos_dis__wwds_28_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int30[27] = (byte)(1) ;
      }
      if ( ! (0==AV136Pedidos_dis__wwds_30_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int30[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Pedidos_dis__wwds_31_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int30[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV138Pedidos_dis__wwds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int30[31] = (byte)(1) ;
      }
      if ( ! (0==AV140Pedidos_dis__wwds_34_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int30[32] = (byte)(1) ;
      }
      if ( ! (0==AV141Pedidos_dis__wwds_35_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int30[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Pedidos_dis__wwds_36_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int30[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Pedidos_dis__wwds_37_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int30[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Pedidos_dis__wwds_39_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV144Pedidos_dis__wwds_38_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Pedidos_dis__wwds_39_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int30[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV35OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV35OrderedBy == 4 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV35OrderedBy == 4 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV35OrderedBy == 5 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV35OrderedBy == 5 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 6 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV35OrderedBy == 6 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 7 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV35OrderedBy == 7 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 8 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV35OrderedBy == 8 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV35OrderedBy == 9 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV35OrderedBy == 9 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV35OrderedBy == 10 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV35OrderedBy == 10 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 11 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV35OrderedBy == 11 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV35OrderedBy == 12 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV35OrderedBy == 12 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 13 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV35OrderedBy == 13 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV35OrderedBy == 14 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV35OrderedBy == 14 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV35OrderedBy == 15 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV35OrderedBy == 15 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV35OrderedBy == 16 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV35OrderedBy == 16 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV35OrderedBy == 17 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV35OrderedBy == 17 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 18 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV35OrderedBy == 18 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 19 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV35OrderedBy == 19 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV35OrderedBy == 20 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV35OrderedBy == 20 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      else if ( ( AV35OrderedBy == 21 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV35OrderedBy == 21 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV35OrderedBy == 22 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV35OrderedBy == 22 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
   }

   protected Object[] conditional_H01XL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV110Pedidos_dis__wwds_4_tfdisest_sels ,
                                          String AV109Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                          String AV108Pedidos_dis__wwds_2_tfdisusrcod ,
                                          int AV110Pedidos_dis__wwds_4_tfdisest_sels_size ,
                                          String AV112Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                          String AV111Pedidos_dis__wwds_5_tfdisclinum ,
                                          String AV114Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                          String AV113Pedidos_dis__wwds_7_tfdisenccli ,
                                          int AV115Pedidos_dis__wwds_9_tfdiscod ,
                                          int AV116Pedidos_dis__wwds_10_tfdiscod_to ,
                                          java.util.Date AV117Pedidos_dis__wwds_11_tfdisfeccli ,
                                          java.util.Date AV118Pedidos_dis__wwds_12_tfdisfec ,
                                          java.util.Date AV119Pedidos_dis__wwds_13_tfdisfecent ,
                                          int AV120Pedidos_dis__wwds_14_tfclicod ,
                                          int AV121Pedidos_dis__wwds_15_tfclicod_to ,
                                          String AV123Pedidos_dis__wwds_17_tfclinom_sel ,
                                          String AV122Pedidos_dis__wwds_16_tfclinom ,
                                          String AV125Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                          String AV124Pedidos_dis__wwds_18_tfdisartcod ,
                                          String AV127Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                          String AV126Pedidos_dis__wwds_20_tfdisartdsc ,
                                          String AV129Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                          String AV128Pedidos_dis__wwds_22_tfdiscolnom ,
                                          int AV130Pedidos_dis__wwds_24_tfdiscolnum ,
                                          int AV131Pedidos_dis__wwds_25_tfdiscolnum_to ,
                                          byte AV132Pedidos_dis__wwds_26_tfdistipcol ,
                                          byte AV133Pedidos_dis__wwds_27_tfdistipcol_to ,
                                          String AV135Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                          String AV134Pedidos_dis__wwds_28_tfdisnomcli ,
                                          int AV136Pedidos_dis__wwds_30_tfdisnumcli ,
                                          int AV137Pedidos_dis__wwds_31_tfdisnumcli_to ,
                                          String AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                          String AV138Pedidos_dis__wwds_32_tfmaqcoddis ,
                                          short AV140Pedidos_dis__wwds_34_tfdisnumpie ,
                                          short AV141Pedidos_dis__wwds_35_tfdisnumpie_to ,
                                          java.math.BigDecimal AV142Pedidos_dis__wwds_36_tfdisnumuni ,
                                          java.math.BigDecimal AV143Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                          String AV145Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                          String AV144Pedidos_dis__wwds_38_tfdisunimed ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
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
                                          short A374DisNumPie ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short AV35OrderedBy ,
                                          boolean AV37OrderedDsc ,
                                          String AV107Pedidos_dis__wwds_1_filterfulltext ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[38];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisUniMed, T1.DisNumUni, T1.DisNumPie, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisCod, T1.DisEncCli, T1.DisCliNum, T1.DisEst, T1.DisUsrCod, T1.PriCod FROM (TXPDISPOS T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV109Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV108Pedidos_dis__wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int33[2] = (byte)(1) ;
      }
      if ( AV110Pedidos_dis__wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Pedidos_dis__wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV112Pedidos_dis__wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidos_dis__wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidos_dis__wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int33[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Pedidos_dis__wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV113Pedidos_dis__wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Pedidos_dis__wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int33[6] = (byte)(1) ;
      }
      if ( ! (0==AV115Pedidos_dis__wwds_9_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int33[7] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis__wwds_10_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV117Pedidos_dis__wwds_11_tfdisfeccli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV118Pedidos_dis__wwds_12_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int33[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Pedidos_dis__wwds_13_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int33[11] = (byte)(1) ;
      }
      if ( ! (0==AV120Pedidos_dis__wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int33[12] = (byte)(1) ;
      }
      if ( ! (0==AV121Pedidos_dis__wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int33[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Pedidos_dis__wwds_17_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV122Pedidos_dis__wwds_16_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Pedidos_dis__wwds_17_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Pedidos_dis__wwds_19_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV124Pedidos_dis__wwds_18_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Pedidos_dis__wwds_19_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV126Pedidos_dis__wwds_20_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_dis__wwds_22_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (0==AV130Pedidos_dis__wwds_24_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! (0==AV131Pedidos_dis__wwds_25_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( ! (0==AV132Pedidos_dis__wwds_26_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (0==AV133Pedidos_dis__wwds_27_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV134Pedidos_dis__wwds_28_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( ! (0==AV136Pedidos_dis__wwds_30_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (0==AV137Pedidos_dis__wwds_31_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV138Pedidos_dis__wwds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( ! (0==AV140Pedidos_dis__wwds_34_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (0==AV141Pedidos_dis__wwds_35_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV142Pedidos_dis__wwds_36_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV143Pedidos_dis__wwds_37_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Pedidos_dis__wwds_39_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV144Pedidos_dis__wwds_38_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Pedidos_dis__wwds_39_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV35OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV35OrderedBy == 2 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV35OrderedBy == 3 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV35OrderedBy == 4 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV35OrderedBy == 4 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV35OrderedBy == 5 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV35OrderedBy == 5 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 6 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV35OrderedBy == 6 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 7 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV35OrderedBy == 7 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 8 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV35OrderedBy == 8 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV35OrderedBy == 9 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV35OrderedBy == 9 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV35OrderedBy == 10 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV35OrderedBy == 10 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 11 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV35OrderedBy == 11 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV35OrderedBy == 12 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV35OrderedBy == 12 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV35OrderedBy == 13 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV35OrderedBy == 13 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV35OrderedBy == 14 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV35OrderedBy == 14 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV35OrderedBy == 15 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV35OrderedBy == 15 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV35OrderedBy == 16 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV35OrderedBy == 16 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV35OrderedBy == 17 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV35OrderedBy == 17 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 18 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV35OrderedBy == 18 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV35OrderedBy == 19 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV35OrderedBy == 19 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV35OrderedBy == 20 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV35OrderedBy == 20 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      else if ( ( AV35OrderedBy == 21 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV35OrderedBy == 21 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV35OrderedBy == 22 ) && ! AV37OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV35OrderedBy == 22 ) && ( AV37OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
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
                  return conditional_H01XL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.math.BigDecimal)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Boolean) dynConstraints[61]).booleanValue() , (String)dynConstraints[62] , (String)dynConstraints[63] );
            case 1 :
                  return conditional_H01XL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.math.BigDecimal)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Boolean) dynConstraints[61]).booleanValue() , (String)dynConstraints[62] , (String)dynConstraints[63] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 8);
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 26);
               ((String[]) buf[15])[0] = rslt.getString(12, 16);
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 20);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 8);
               ((String[]) buf[26])[0] = rslt.getString(23, 1);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
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
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
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
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
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
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
      }
   }

}

