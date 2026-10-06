package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mtoformulastinteww_impl extends GXDataArea
{
   public mtoformulastinteww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mtoformulastinteww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtoformulastinteww_impl.class ));
   }

   public mtoformulastinteww_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkForPro = UIFactory.getCheckbox(this);
      cmbForBlo = new HTMLChoice();
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
      nRC_GXsfl_80 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_80"))) ;
      nGXsfl_80_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_80_idx"))) ;
      sGXsfl_80_idx = httpContext.GetPar( "sGXsfl_80_idx") ;
      AV119Listado = httpContext.GetPar( "Listado") ;
      AV123ListadoH = httpContext.GetPar( "ListadoH") ;
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
      AV135ForColNom = httpContext.GetPar( "ForColNom") ;
      AV134ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV126ForFec = localUtil.parseDateParm( httpContext.GetPar( "ForFec")) ;
      AV138ForFecto = localUtil.parseDateParm( httpContext.GetPar( "ForFecto")) ;
      AV127CliCodform = (int)(GXutil.lval( httpContext.GetPar( "CliCodform"))) ;
      AV128CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV29TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV30TFForSer = httpContext.GetPar( "TFForSer") ;
      AV31TFForSer_Sel = httpContext.GetPar( "TFForSer_Sel") ;
      AV32TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV33TFForSerDsc_Sel = httpContext.GetPar( "TFForSerDsc_Sel") ;
      AV110TFForTipArtDsc = httpContext.GetPar( "TFForTipArtDsc") ;
      AV111TFForTipArtDsc_Sel = httpContext.GetPar( "TFForTipArtDsc_Sel") ;
      AV34TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV35TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV64TFForNomCli = httpContext.GetPar( "TFForNomCli") ;
      AV65TFForNomCli_Sel = httpContext.GetPar( "TFForNomCli_Sel") ;
      AV38TFTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod"))) ;
      AV39TFTipColCod_To = (byte)(GXutil.lval( httpContext.GetPar( "TFTipColCod_To"))) ;
      AV40TFTipColDsc = httpContext.GetPar( "TFTipColDsc") ;
      AV41TFTipColDsc_Sel = httpContext.GetPar( "TFTipColDsc_Sel") ;
      AV86TFForUltUti = localUtil.parseDateParm( httpContext.GetPar( "TFForUltUti")) ;
      AV87TFForUltUti_To = localUtil.parseDateParm( httpContext.GetPar( "TFForUltUti_To")) ;
      AV90TFForNumCol = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol"))) ;
      AV91TFForNumCol_To = (int)(GXutil.lval( httpContext.GetPar( "TFForNumCol_To"))) ;
      AV112TFForTonal = httpContext.GetPar( "TFForTonal") ;
      AV113TFForTonal_Sel = httpContext.GetPar( "TFForTonal_Sel") ;
      AV92TFForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "TFForRelBan"), ".") ;
      AV93TFForRelBan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFForRelBan_To"), ".") ;
      AV115TFForOpcCli = httpContext.GetPar( "TFForOpcCli") ;
      AV116TFForOpcCli_Sel = httpContext.GetPar( "TFForOpcCli_Sel") ;
      AV44TFIntDsc = httpContext.GetPar( "TFIntDsc") ;
      AV45TFIntDsc_Sel = httpContext.GetPar( "TFIntDsc_Sel") ;
      AV117TFForPro_Sel = httpContext.GetPar( "TFForPro_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV137TFForBlo_Sels);
      AV142Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV119Listado = httpContext.GetPar( "Listado") ;
      AV123ListadoH = httpContext.GetPar( "ListadoH") ;
      AV100SiRGB = (short)(GXutil.lval( httpContext.GetPar( "SiRGB"))) ;
      AV105FlagModa21 = (short)(GXutil.lval( httpContext.GetPar( "FlagModa21"))) ;
      AV107Rfo0002 = (short)(GXutil.lval( httpContext.GetPar( "Rfo0002"))) ;
      AV108Vfo0002 = (short)(GXutil.lval( httpContext.GetPar( "Vfo0002"))) ;
      AV96UsurCod = httpContext.GetPar( "UsurCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV135ForColNom, AV134ForColNum, AV126ForFec, AV138ForFecto, AV127CliCodform, AV128CliCodto, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV32TFForSerDsc, AV33TFForSerDsc_Sel, AV110TFForTipArtDsc, AV111TFForTipArtDsc_Sel, AV34TFForColNom, AV35TFForColNom_Sel, AV64TFForNomCli, AV65TFForNomCli_Sel, AV38TFTipColCod, AV39TFTipColCod_To, AV40TFTipColDsc, AV41TFTipColDsc_Sel, AV86TFForUltUti, AV87TFForUltUti_To, AV90TFForNumCol, AV91TFForNumCol_To, AV112TFForTonal, AV113TFForTonal_Sel, AV92TFForRelBan, AV93TFForRelBan_To, AV115TFForOpcCli, AV116TFForOpcCli_Sel, AV44TFIntDsc, AV45TFIntDsc_Sel, AV117TFForPro_Sel, AV137TFForBlo_Sels, AV142Pgmname, AV12OrderedBy, AV13OrderedDsc, AV119Listado, AV123ListadoH, AV100SiRGB, AV105FlagModa21, AV107Rfo0002, AV108Vfo0002, AV96UsurCod) ;
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
      pa1BC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1BC2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.mtoformulastinteww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV100SiRGB), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105FlagModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV107Rfo0002), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108Vfo0002), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96UsurCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MtoFormulasTinteWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\mtoformulastinteww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORCOLNOM", GXutil.rtrim( AV135ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV134ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORFEC", localUtil.format(AV126ForFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFORFECTO", localUtil.format(AV138ForFecto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODFORM", GXutil.ltrim( localUtil.ntoc( AV127CliCodform, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV128CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_80", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_80, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFORM_DATA", AV129CliCodform_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFORM_DATA", AV129CliCodform_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV131CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV131CliCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV72GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV73GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV70DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV70DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV28TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV29TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSER", GXutil.rtrim( AV30TFForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSER_SEL", GXutil.rtrim( AV31TFForSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSERDSC", GXutil.rtrim( AV32TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSERDSC_SEL", GXutil.rtrim( AV33TFForSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTIPARTDSC", GXutil.rtrim( AV110TFForTipArtDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTIPARTDSC_SEL", GXutil.rtrim( AV111TFForTipArtDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM", GXutil.rtrim( AV34TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM_SEL", GXutil.rtrim( AV35TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNOMCLI", GXutil.rtrim( AV64TFForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNOMCLI_SEL", GXutil.rtrim( AV65TFForNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV38TFTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV39TFTipColCod_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC", GXutil.rtrim( AV40TFTipColDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPCOLDSC_SEL", GXutil.rtrim( AV41TFTipColDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORULTUTI", localUtil.dtoc( AV86TFForUltUti, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORULTUTI_TO", localUtil.dtoc( AV87TFForUltUti_To, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV90TFForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORNUMCOL_TO", GXutil.ltrim( localUtil.ntoc( AV91TFForNumCol_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTONAL", GXutil.rtrim( AV112TFForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORTONAL_SEL", GXutil.rtrim( AV113TFForTonal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV92TFForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORRELBAN_TO", GXutil.ltrim( localUtil.ntoc( AV93TFForRelBan_To, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFOROPCCLI", GXutil.rtrim( AV115TFForOpcCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFOROPCCLI_SEL", GXutil.rtrim( AV116TFForOpcCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTDSC", GXutil.rtrim( AV44TFIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINTDSC_SEL", GXutil.rtrim( AV45TFIntDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRO_SEL", GXutil.rtrim( AV117TFForPro_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFFORBLO_SELS", AV137TFForBlo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFFORBLO_SELS", AV137TFForBlo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV100SiRGB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV100SiRGB), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORBLO_SELSJSON", AV136TFForBlo_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV94Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV109Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODA21", GXutil.ltrim( localUtil.ntoc( AV105FlagModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105FlagModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRFO0002", GXutil.ltrim( localUtil.ntoc( AV107Rfo0002, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV107Rfo0002), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVFO0002", GXutil.ltrim( localUtil.ntoc( AV108Vfo0002, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108Vfo0002), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV96UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96UsurCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERMTOFORMULASTINTEWW", AV132FilterMtoFormulasTinteWW);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERMTOFORMULASTINTEWW", AV132FilterMtoFormulasTinteWW);
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFORM_Cls", GXutil.rtrim( Combo_clicodform_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFORM_Selectedvalue_set", GXutil.rtrim( Combo_clicodform_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFORM_Emptyitemtext", GXutil.rtrim( Combo_clicodform_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFORM_Selectedvalue_get", GXutil.rtrim( Combo_clicodform_Selectedvalue_get));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFORM_Selectedvalue_get", GXutil.rtrim( Combo_clicodform_Selectedvalue_get));
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
         we1BC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1BC2( ) ;
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
      return formatLink("app.formulaciontinte.mtoformulastinteww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.MtoFormulasTinteWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mto Formulas Tinte", "") ;
   }

   public void wb1BC0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 80, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1BC2( true) ;
      }
      else
      {
         wb_table1_23_1BC2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1BC2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodform_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodform_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodform_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodform.setProperty("Caption", Combo_clicodform_Caption);
         ucCombo_clicodform.setProperty("Cls", Combo_clicodform_Cls);
         ucCombo_clicodform.setProperty("EmptyItemText", Combo_clicodform_Emptyitemtext);
         ucCombo_clicodform.setProperty("DropDownOptionsData", AV129CliCodform_Data);
         ucCombo_clicodform.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodform_Internalname, "COMBO_CLICODFORMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV131CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnom_Internalname, GXutil.rtrim( AV135ForColNom), GXutil.rtrim( localUtil.format( AV135ForColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV134ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV134ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV134ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForfec_Internalname, httpContext.getMessage( "Fecha Inicio", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavForfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForfec_Internalname, localUtil.format(AV126ForFec, "99/99/99"), localUtil.format( AV126ForFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavForfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavForfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForfecto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForfecto_Internalname, httpContext.getMessage( "Fecha Fin", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavForfecto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForfecto_Internalname, localUtil.format(AV138ForFecto, "99/99/99"), localUtil.format( AV138ForFecto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForfecto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForfecto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavForfecto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavForfecto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol80( ) ;
      }
      if ( wbEnd == 80 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_80 = (int)(nGXsfl_80_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV72GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV73GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0120"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0120"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_80_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0120"+"");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV142Pgmname), GXutil.rtrim( localUtil.format( AV142Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodform_Internalname, GXutil.ltrim( localUtil.ntoc( AV127CliCodform, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV127CliCodform), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodform_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodform_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV128CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV128CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV70DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV70DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_135_1BC2( true) ;
      }
      else
      {
         wb_table2_135_1BC2( false) ;
      }
      return  ;
   }

   public void wb_table2_135_1BC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_forultutiauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forultutiauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forultutiauxdate_Internalname, localUtil.format(AV88DDO_ForUltUtiAuxDate, "99/99/99"), localUtil.format( AV88DDO_ForUltUtiAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,142);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forultutiauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forultutiauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_forultutiauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_forultutiauxdateto_Internalname, localUtil.format(AV89DDO_ForUltUtiAuxDateTo, "99/99/99"), localUtil.format( AV89DDO_ForUltUtiAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_forultutiauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_forultutiauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 80 )
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

   public void start1BC2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mto Formulas Tinte", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1BC0( ) ;
   }

   public void ws1BC2( )
   {
      start1BC2( ) ;
      evt1BC2( ) ;
   }

   public void evt1BC2( )
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
                           e111BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODFORM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e191BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e201BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORFEC.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e211BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORFECTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e221BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORCOLNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e231BC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORCOLNOM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e241BC2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "VLISTADO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "VLISTADO.CLICK") == 0 ) )
                        {
                           nGXsfl_80_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_802( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV74GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
                           AV102DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV102DetailWebComponent);
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A13929ForTipArtD = httpContext.cgiGet( edtForTipArtD_Internalname) ;
                           n13929ForTipArtD = false ;
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
                           A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
                           n995ForTonal = false ;
                           A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)) ;
                           n2838ForRelBan = false ;
                           A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
                           n3560ForOpcCli = false ;
                           A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
                           n584IntDsc = false ;
                           A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
                           n2749ForPro = false ;
                           cmbForBlo.setName( cmbForBlo.getInternalname() );
                           cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
                           A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
                           n7781ForBlo = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRS");
                              GX_FocusControl = edtavNum_hdrs_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV118Num_hdrs = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Num_hdrs), 4, 0));
                           }
                           else
                           {
                              AV118Num_hdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Num_hdrs), 4, 0));
                           }
                           AV119Listado = httpContext.cgiGet( edtavListado_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "Bitmap", ((GXutil.strcmp("", AV119Listado)==0) ? AV143Listado_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV119Listado))), !bGXsfl_80_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV119Listado), true);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRSH");
                              GX_FocusControl = edtavNum_hdrsh_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV124Num_hdrsH = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124Num_hdrsH), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_HDRSH"+"_"+sGXsfl_80_idx, getSecureSignedToken( sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")));
                           }
                           else
                           {
                              AV124Num_hdrsH = (int)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124Num_hdrsH), 6, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_HDRSH"+"_"+sGXsfl_80_idx, getSecureSignedToken( sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")));
                           }
                           AV123ListadoH = httpContext.cgiGet( edtavListadoh_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "Bitmap", ((GXutil.strcmp("", AV123ListadoH)==0) ? AV144Listadoh_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV123ListadoH))), !bGXsfl_80_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV123ListadoH), true);
                           A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1192ForNumCli = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVAR_FORRGB");
                              GX_FocusControl = edtavVar_forrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV122Var_ForRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Var_ForRGB), 10, 0));
                           }
                           else
                           {
                              AV122Var_ForRGB = localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Var_ForRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV76R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
                           }
                           else
                           {
                              AV76R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
                           }
                           A4339ForRGB = localUtil.ctol( httpContext.cgiGet( edtForRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n4339ForRGB = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV77G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
                           }
                           else
                           {
                              AV77G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV78B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
                           }
                           else
                           {
                              AV78B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV79R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
                           }
                           else
                           {
                              AV79R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV80G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
                           }
                           else
                           {
                              AV80G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV81B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
                           }
                           else
                           {
                              AV81B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
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
                                 e251BC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e261BC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e271BC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e281BC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VLISTADO.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e291BC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Forcolnom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFORCOLNOM"), AV135ForColNom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Forcolnum Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFORCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV134ForColNum )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Forfec Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vFORFEC"), 0), AV126ForFec) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Forfecto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vFORFECTO"), 0), AV138ForFecto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodform Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFORM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV127CliCodform )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV128CliCodto )
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
                     if ( nCmpId == 120 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0120") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0120", "", sEvt);
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

   public void we1BC2( )
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

   public void pa1BC2( )
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
      subsflControlProps_802( ) ;
      while ( nGXsfl_80_idx <= nRC_GXsfl_80 )
      {
         sendrow_802( ) ;
         nGXsfl_80_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV135ForColNom ,
                                 int AV134ForColNum ,
                                 java.util.Date AV126ForFec ,
                                 java.util.Date AV138ForFecto ,
                                 int AV127CliCodform ,
                                 int AV128CliCodto ,
                                 String A396EmprCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV28TFCliNom ,
                                 String AV29TFCliNom_Sel ,
                                 String AV30TFForSer ,
                                 String AV31TFForSer_Sel ,
                                 String AV32TFForSerDsc ,
                                 String AV33TFForSerDsc_Sel ,
                                 String AV110TFForTipArtDsc ,
                                 String AV111TFForTipArtDsc_Sel ,
                                 String AV34TFForColNom ,
                                 String AV35TFForColNom_Sel ,
                                 String AV64TFForNomCli ,
                                 String AV65TFForNomCli_Sel ,
                                 byte AV38TFTipColCod ,
                                 byte AV39TFTipColCod_To ,
                                 String AV40TFTipColDsc ,
                                 String AV41TFTipColDsc_Sel ,
                                 java.util.Date AV86TFForUltUti ,
                                 java.util.Date AV87TFForUltUti_To ,
                                 int AV90TFForNumCol ,
                                 int AV91TFForNumCol_To ,
                                 String AV112TFForTonal ,
                                 String AV113TFForTonal_Sel ,
                                 java.math.BigDecimal AV92TFForRelBan ,
                                 java.math.BigDecimal AV93TFForRelBan_To ,
                                 String AV115TFForOpcCli ,
                                 String AV116TFForOpcCli_Sel ,
                                 String AV44TFIntDsc ,
                                 String AV45TFIntDsc_Sel ,
                                 String AV117TFForPro_Sel ,
                                 GXSimpleCollection<String> AV137TFForBlo_Sels ,
                                 String AV142Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV119Listado ,
                                 String AV123ListadoH ,
                                 short AV100SiRGB ,
                                 short AV105FlagModa21 ,
                                 short AV107Rfo0002 ,
                                 short AV108Vfo0002 ,
                                 String AV96UsurCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e261BC2 ();
      GRID_nCurrentRecord = 0 ;
      rf1BC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MtoFormulasTinteWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\mtoformulastinteww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_HDRSH", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_HDRSH", GXutil.ltrim( localUtil.ntoc( AV124Num_hdrsH, (byte)(6), (byte)(0), ".", "")));
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
      rf1BC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV142Pgmname = "FormulacionTinte.MtoFormulasTinteWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavNum_hdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNum_hdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavNum_hdrsh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNum_hdrsh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrsh_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavVar_forrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_forrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_forrgb_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV15FilterFullText ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV28TFCliNom ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV29TFCliNom_Sel ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = AV30TFForSer ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV31TFForSer_Sel ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV32TFForSerDsc ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV33TFForSerDsc_Sel ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV110TFForTipArtDsc ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV111TFForTipArtDsc_Sel ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV34TFForColNom ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV35TFForColNom_Sel ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV64TFForNomCli ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV65TFForNomCli_Sel ;
      AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV38TFTipColCod ;
      AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV39TFTipColCod_To ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV40TFTipColDsc ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV41TFTipColDsc_Sel ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV86TFForUltUti ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV87TFForUltUti_To ;
      AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV90TFForNumCol ;
      AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV91TFForNumCol_To ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV112TFForTonal ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV113TFForTonal_Sel ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV92TFForRelBan ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV93TFForRelBan_To ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV115TFForOpcCli ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV116TFForOpcCli_Sel ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV44TFIntDsc ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV45TFIntDsc_Sel ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV117TFForPro_Sel ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV137TFForBlo_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                           AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                           AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                           AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                           AV148Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                           AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                           AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                           AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                           AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                           AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                           AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                           Byte.valueOf(AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                           Byte.valueOf(AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                           AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                           AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                           AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                           Integer.valueOf(AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                           Integer.valueOf(AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                           AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                           AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                           AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                           AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                           AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                           AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                           AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                           AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                           AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                           Integer.valueOf(AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                           AV126ForFec ,
                                           AV138ForFecto ,
                                           Integer.valueOf(AV127CliCodform) ,
                                           Integer.valueOf(AV128CliCodto) ,
                                           Integer.valueOf(AV134ForColNum) ,
                                           AV135ForColNom ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           A1191ForNomCli ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           A496ForUltUti ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A995ForTonal ,
                                           A2838ForRelBan ,
                                           A3560ForOpcCli ,
                                           A584IntDsc ,
                                           A2749ForPro ,
                                           A485ForFec ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                           AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                           A10045CliAct ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
      lV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
      lV148Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV148Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
      lV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
      lV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
      lV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
      lV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
      lV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
      lV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
      lV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
      /* Using cursor H01BC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV146Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV148Formulaciontinte_mtoformulastintewwds_4_tfforser, AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV166Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV126ForFec, AV138ForFecto, Integer.valueOf(AV127CliCodform), Integer.valueOf(AV128CliCodto), Integer.valueOf(AV134ForColNum), AV135ForColNom});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A583IntCod = H01BC2_A583IntCod[0] ;
         A4384ForTipArt = H01BC2_A4384ForTipArt[0] ;
         n4384ForTipArt = H01BC2_n4384ForTipArt[0] ;
         A10045CliAct = H01BC2_A10045CliAct[0] ;
         A4339ForRGB = H01BC2_A4339ForRGB[0] ;
         n4339ForRGB = H01BC2_n4339ForRGB[0] ;
         A1192ForNumCli = H01BC2_A1192ForNumCli[0] ;
         n1192ForNumCli = H01BC2_n1192ForNumCli[0] ;
         A7781ForBlo = H01BC2_A7781ForBlo[0] ;
         n7781ForBlo = H01BC2_n7781ForBlo[0] ;
         A2749ForPro = H01BC2_A2749ForPro[0] ;
         n2749ForPro = H01BC2_n2749ForPro[0] ;
         A584IntDsc = H01BC2_A584IntDsc[0] ;
         n584IntDsc = H01BC2_n584IntDsc[0] ;
         A3560ForOpcCli = H01BC2_A3560ForOpcCli[0] ;
         n3560ForOpcCli = H01BC2_n3560ForOpcCli[0] ;
         A2838ForRelBan = H01BC2_A2838ForRelBan[0] ;
         n2838ForRelBan = H01BC2_n2838ForRelBan[0] ;
         A995ForTonal = H01BC2_A995ForTonal[0] ;
         n995ForTonal = H01BC2_n995ForTonal[0] ;
         A486ForNumCol = H01BC2_A486ForNumCol[0] ;
         A496ForUltUti = H01BC2_A496ForUltUti[0] ;
         n496ForUltUti = H01BC2_n496ForUltUti[0] ;
         A485ForFec = H01BC2_A485ForFec[0] ;
         n485ForFec = H01BC2_n485ForFec[0] ;
         A832TipColDsc = H01BC2_A832TipColDsc[0] ;
         n832TipColDsc = H01BC2_n832TipColDsc[0] ;
         A831TipColCod = H01BC2_A831TipColCod[0] ;
         A1191ForNomCli = H01BC2_A1191ForNomCli[0] ;
         n1191ForNomCli = H01BC2_n1191ForNomCli[0] ;
         A483ForColNum = H01BC2_A483ForColNum[0] ;
         A482ForColNom = H01BC2_A482ForColNom[0] ;
         A5742ForSerDsc = H01BC2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = H01BC2_n5742ForSerDsc[0] ;
         A494ForSer = H01BC2_A494ForSer[0] ;
         A279CliNom = H01BC2_A279CliNom[0] ;
         A252CliCod = H01BC2_A252CliCod[0] ;
         A13929ForTipArtD = H01BC2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = H01BC2_n13929ForTipArtD[0] ;
         A10045CliAct = H01BC2_A10045CliAct[0] ;
         A279CliNom = H01BC2_A279CliNom[0] ;
         A584IntDsc = H01BC2_A584IntDsc[0] ;
         n584IntDsc = H01BC2_n584IntDsc[0] ;
         A832TipColDsc = H01BC2_A832TipColDsc[0] ;
         n832TipColDsc = H01BC2_n832TipColDsc[0] ;
         A13929ForTipArtD = H01BC2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = H01BC2_n13929ForTipArtD[0] ;
         if ( (GXutil.strcmp("", AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "S") == 0 ) ) ) )
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

   public void rf1BC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(80) ;
      /* Execute user event: Refresh */
      e261BC2 ();
      nGXsfl_80_idx = 1 ;
      sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_802( ) ;
      bGXsfl_80_Refreshing = true ;
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
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_802( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A7781ForBlo ,
                                              AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                              AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                              AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                              AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                              AV148Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                              AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                              AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                              AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                              AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                              AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                              AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                              Byte.valueOf(AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) ,
                                              Byte.valueOf(AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) ,
                                              AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                              AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                              AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                              Integer.valueOf(AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol) ,
                                              Integer.valueOf(AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) ,
                                              AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                              AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                              AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                              AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                              AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                              AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                              AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                              AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                              AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                              Integer.valueOf(AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels.size()) ,
                                              AV126ForFec ,
                                              AV138ForFecto ,
                                              Integer.valueOf(AV127CliCodform) ,
                                              Integer.valueOf(AV128CliCodto) ,
                                              Integer.valueOf(AV134ForColNum) ,
                                              AV135ForColNom ,
                                              A279CliNom ,
                                              A494ForSer ,
                                              A5742ForSerDsc ,
                                              A482ForColNom ,
                                              A1191ForNomCli ,
                                              Byte.valueOf(A831TipColCod) ,
                                              A832TipColDsc ,
                                              A496ForUltUti ,
                                              Integer.valueOf(A486ForNumCol) ,
                                              A995ForTonal ,
                                              A2838ForRelBan ,
                                              A3560ForOpcCli ,
                                              A584IntDsc ,
                                              A2749ForPro ,
                                              A485ForFec ,
                                              Integer.valueOf(A252CliCod) ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                              A13929ForTipArtD ,
                                              AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                              AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                              A10045CliAct ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING
                                              }
         });
         lV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc), 30, "%") ;
         lV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom), 30, "%") ;
         lV148Formulaciontinte_mtoformulastintewwds_4_tfforser = GXutil.padr( GXutil.rtrim( AV148Formulaciontinte_mtoformulastintewwds_4_tfforser), 16, "%") ;
         lV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = GXutil.padr( GXutil.rtrim( AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc), 26, "%") ;
         lV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = GXutil.padr( GXutil.rtrim( AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom), 13, "%") ;
         lV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = GXutil.padr( GXutil.rtrim( AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli), 13, "%") ;
         lV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc), 30, "%") ;
         lV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = GXutil.padr( GXutil.rtrim( AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal), 20, "%") ;
         lV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = GXutil.padr( GXutil.rtrim( AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli), 1, "%") ;
         lV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = GXutil.padr( GXutil.rtrim( AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc), 30, "%") ;
         /* Using cursor H01BC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, lV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc, AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel, lV146Formulaciontinte_mtoformulastintewwds_2_tfclinom, AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel, lV148Formulaciontinte_mtoformulastintewwds_4_tfforser, AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel, lV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc, AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel, lV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom, AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel, lV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli, AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel, Byte.valueOf(AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod), Byte.valueOf(AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to), lV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc, AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel, AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti, AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti, Integer.valueOf(AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol), Integer.valueOf(AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to), lV166Formulaciontinte_mtoformulastintewwds_22_tffortonal, AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel, AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban, AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to, lV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli, AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel, lV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc, AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel, AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel, AV126ForFec, AV138ForFecto, Integer.valueOf(AV127CliCodform), Integer.valueOf(AV128CliCodto), Integer.valueOf(AV134ForColNum), AV135ForColNom});
         nGXsfl_80_idx = 1 ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A583IntCod = H01BC3_A583IntCod[0] ;
            A4384ForTipArt = H01BC3_A4384ForTipArt[0] ;
            n4384ForTipArt = H01BC3_n4384ForTipArt[0] ;
            A10045CliAct = H01BC3_A10045CliAct[0] ;
            A4339ForRGB = H01BC3_A4339ForRGB[0] ;
            n4339ForRGB = H01BC3_n4339ForRGB[0] ;
            A1192ForNumCli = H01BC3_A1192ForNumCli[0] ;
            n1192ForNumCli = H01BC3_n1192ForNumCli[0] ;
            A7781ForBlo = H01BC3_A7781ForBlo[0] ;
            n7781ForBlo = H01BC3_n7781ForBlo[0] ;
            A2749ForPro = H01BC3_A2749ForPro[0] ;
            n2749ForPro = H01BC3_n2749ForPro[0] ;
            A584IntDsc = H01BC3_A584IntDsc[0] ;
            n584IntDsc = H01BC3_n584IntDsc[0] ;
            A3560ForOpcCli = H01BC3_A3560ForOpcCli[0] ;
            n3560ForOpcCli = H01BC3_n3560ForOpcCli[0] ;
            A2838ForRelBan = H01BC3_A2838ForRelBan[0] ;
            n2838ForRelBan = H01BC3_n2838ForRelBan[0] ;
            A995ForTonal = H01BC3_A995ForTonal[0] ;
            n995ForTonal = H01BC3_n995ForTonal[0] ;
            A486ForNumCol = H01BC3_A486ForNumCol[0] ;
            A496ForUltUti = H01BC3_A496ForUltUti[0] ;
            n496ForUltUti = H01BC3_n496ForUltUti[0] ;
            A485ForFec = H01BC3_A485ForFec[0] ;
            n485ForFec = H01BC3_n485ForFec[0] ;
            A832TipColDsc = H01BC3_A832TipColDsc[0] ;
            n832TipColDsc = H01BC3_n832TipColDsc[0] ;
            A831TipColCod = H01BC3_A831TipColCod[0] ;
            A1191ForNomCli = H01BC3_A1191ForNomCli[0] ;
            n1191ForNomCli = H01BC3_n1191ForNomCli[0] ;
            A483ForColNum = H01BC3_A483ForColNum[0] ;
            A482ForColNom = H01BC3_A482ForColNom[0] ;
            A5742ForSerDsc = H01BC3_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H01BC3_n5742ForSerDsc[0] ;
            A494ForSer = H01BC3_A494ForSer[0] ;
            A279CliNom = H01BC3_A279CliNom[0] ;
            A252CliCod = H01BC3_A252CliCod[0] ;
            A13929ForTipArtD = H01BC3_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01BC3_n13929ForTipArtD[0] ;
            A10045CliAct = H01BC3_A10045CliAct[0] ;
            A279CliNom = H01BC3_A279CliNom[0] ;
            A584IntDsc = H01BC3_A584IntDsc[0] ;
            n584IntDsc = H01BC3_n584IntDsc[0] ;
            A832TipColDsc = H01BC3_A832TipColDsc[0] ;
            n832TipColDsc = H01BC3_n832TipColDsc[0] ;
            A13929ForTipArtD = H01BC3_A13929ForTipArtD[0] ;
            n13929ForTipArtD = H01BC3_n13929ForTipArtD[0] ;
            if ( (GXutil.strcmp("", AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1191ForNomCli) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A995ForTonal) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2838ForRelBan, 7, 2) , GXutil.padr( "%" + AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3560ForOpcCli) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "n", "") , GXutil.padr( "%" + GXutil.lower( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "N") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "s", "") , GXutil.padr( "%" + GXutil.lower( AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, "S") == 0 ) ) ) )
            {
               e271BC2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(80) ;
         wb1BC0( ) ;
      }
      bGXsfl_80_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1BC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSIRGB", GXutil.ltrim( localUtil.ntoc( AV100SiRGB, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV100SiRGB), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_HDRSH"+"_"+sGXsfl_80_idx, getSecureSignedToken( sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODA21", GXutil.ltrim( localUtil.ntoc( AV105FlagModa21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105FlagModa21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRFO0002", GXutil.ltrim( localUtil.ntoc( AV107Rfo0002, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV107Rfo0002), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVFO0002", GXutil.ltrim( localUtil.ntoc( AV108Vfo0002, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108Vfo0002), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV96UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96UsurCod, "@!"))));
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
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV15FilterFullText ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV28TFCliNom ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV29TFCliNom_Sel ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = AV30TFForSer ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV31TFForSer_Sel ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV32TFForSerDsc ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV33TFForSerDsc_Sel ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV110TFForTipArtDsc ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV111TFForTipArtDsc_Sel ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV34TFForColNom ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV35TFForColNom_Sel ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV64TFForNomCli ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV65TFForNomCli_Sel ;
      AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV38TFTipColCod ;
      AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV39TFTipColCod_To ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV40TFTipColDsc ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV41TFTipColDsc_Sel ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV86TFForUltUti ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV87TFForUltUti_To ;
      AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV90TFForNumCol ;
      AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV91TFForNumCol_To ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV112TFForTonal ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV113TFForTonal_Sel ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV92TFForRelBan ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV93TFForRelBan_To ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV115TFForOpcCli ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV116TFForOpcCli_Sel ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV44TFIntDsc ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV45TFIntDsc_Sel ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV117TFForPro_Sel ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV137TFForBlo_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV135ForColNom, AV134ForColNum, AV126ForFec, AV138ForFecto, AV127CliCodform, AV128CliCodto, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV32TFForSerDsc, AV33TFForSerDsc_Sel, AV110TFForTipArtDsc, AV111TFForTipArtDsc_Sel, AV34TFForColNom, AV35TFForColNom_Sel, AV64TFForNomCli, AV65TFForNomCli_Sel, AV38TFTipColCod, AV39TFTipColCod_To, AV40TFTipColDsc, AV41TFTipColDsc_Sel, AV86TFForUltUti, AV87TFForUltUti_To, AV90TFForNumCol, AV91TFForNumCol_To, AV112TFForTonal, AV113TFForTonal_Sel, AV92TFForRelBan, AV93TFForRelBan_To, AV115TFForOpcCli, AV116TFForOpcCli_Sel, AV44TFIntDsc, AV45TFIntDsc_Sel, AV117TFForPro_Sel, AV137TFForBlo_Sels, AV142Pgmname, AV12OrderedBy, AV13OrderedDsc, AV119Listado, AV123ListadoH, AV100SiRGB, AV105FlagModa21, AV107Rfo0002, AV108Vfo0002, AV96UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV15FilterFullText ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV28TFCliNom ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV29TFCliNom_Sel ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = AV30TFForSer ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV31TFForSer_Sel ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV32TFForSerDsc ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV33TFForSerDsc_Sel ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV110TFForTipArtDsc ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV111TFForTipArtDsc_Sel ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV34TFForColNom ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV35TFForColNom_Sel ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV64TFForNomCli ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV65TFForNomCli_Sel ;
      AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV38TFTipColCod ;
      AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV39TFTipColCod_To ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV40TFTipColDsc ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV41TFTipColDsc_Sel ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV86TFForUltUti ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV87TFForUltUti_To ;
      AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV90TFForNumCol ;
      AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV91TFForNumCol_To ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV112TFForTonal ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV113TFForTonal_Sel ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV92TFForRelBan ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV93TFForRelBan_To ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV115TFForOpcCli ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV116TFForOpcCli_Sel ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV44TFIntDsc ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV45TFIntDsc_Sel ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV117TFForPro_Sel ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV137TFForBlo_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV135ForColNom, AV134ForColNum, AV126ForFec, AV138ForFecto, AV127CliCodform, AV128CliCodto, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV32TFForSerDsc, AV33TFForSerDsc_Sel, AV110TFForTipArtDsc, AV111TFForTipArtDsc_Sel, AV34TFForColNom, AV35TFForColNom_Sel, AV64TFForNomCli, AV65TFForNomCli_Sel, AV38TFTipColCod, AV39TFTipColCod_To, AV40TFTipColDsc, AV41TFTipColDsc_Sel, AV86TFForUltUti, AV87TFForUltUti_To, AV90TFForNumCol, AV91TFForNumCol_To, AV112TFForTonal, AV113TFForTonal_Sel, AV92TFForRelBan, AV93TFForRelBan_To, AV115TFForOpcCli, AV116TFForOpcCli_Sel, AV44TFIntDsc, AV45TFIntDsc_Sel, AV117TFForPro_Sel, AV137TFForBlo_Sels, AV142Pgmname, AV12OrderedBy, AV13OrderedDsc, AV119Listado, AV123ListadoH, AV100SiRGB, AV105FlagModa21, AV107Rfo0002, AV108Vfo0002, AV96UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV15FilterFullText ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV28TFCliNom ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV29TFCliNom_Sel ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = AV30TFForSer ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV31TFForSer_Sel ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV32TFForSerDsc ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV33TFForSerDsc_Sel ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV110TFForTipArtDsc ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV111TFForTipArtDsc_Sel ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV34TFForColNom ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV35TFForColNom_Sel ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV64TFForNomCli ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV65TFForNomCli_Sel ;
      AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV38TFTipColCod ;
      AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV39TFTipColCod_To ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV40TFTipColDsc ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV41TFTipColDsc_Sel ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV86TFForUltUti ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV87TFForUltUti_To ;
      AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV90TFForNumCol ;
      AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV91TFForNumCol_To ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV112TFForTonal ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV113TFForTonal_Sel ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV92TFForRelBan ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV93TFForRelBan_To ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV115TFForOpcCli ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV116TFForOpcCli_Sel ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV44TFIntDsc ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV45TFIntDsc_Sel ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV117TFForPro_Sel ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV137TFForBlo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV135ForColNom, AV134ForColNum, AV126ForFec, AV138ForFecto, AV127CliCodform, AV128CliCodto, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV32TFForSerDsc, AV33TFForSerDsc_Sel, AV110TFForTipArtDsc, AV111TFForTipArtDsc_Sel, AV34TFForColNom, AV35TFForColNom_Sel, AV64TFForNomCli, AV65TFForNomCli_Sel, AV38TFTipColCod, AV39TFTipColCod_To, AV40TFTipColDsc, AV41TFTipColDsc_Sel, AV86TFForUltUti, AV87TFForUltUti_To, AV90TFForNumCol, AV91TFForNumCol_To, AV112TFForTonal, AV113TFForTonal_Sel, AV92TFForRelBan, AV93TFForRelBan_To, AV115TFForOpcCli, AV116TFForOpcCli_Sel, AV44TFIntDsc, AV45TFIntDsc_Sel, AV117TFForPro_Sel, AV137TFForBlo_Sels, AV142Pgmname, AV12OrderedBy, AV13OrderedDsc, AV119Listado, AV123ListadoH, AV100SiRGB, AV105FlagModa21, AV107Rfo0002, AV108Vfo0002, AV96UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV15FilterFullText ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV28TFCliNom ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV29TFCliNom_Sel ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = AV30TFForSer ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV31TFForSer_Sel ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV32TFForSerDsc ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV33TFForSerDsc_Sel ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV110TFForTipArtDsc ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV111TFForTipArtDsc_Sel ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV34TFForColNom ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV35TFForColNom_Sel ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV64TFForNomCli ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV65TFForNomCli_Sel ;
      AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV38TFTipColCod ;
      AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV39TFTipColCod_To ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV40TFTipColDsc ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV41TFTipColDsc_Sel ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV86TFForUltUti ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV87TFForUltUti_To ;
      AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV90TFForNumCol ;
      AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV91TFForNumCol_To ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV112TFForTonal ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV113TFForTonal_Sel ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV92TFForRelBan ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV93TFForRelBan_To ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV115TFForOpcCli ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV116TFForOpcCli_Sel ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV44TFIntDsc ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV45TFIntDsc_Sel ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV117TFForPro_Sel ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV137TFForBlo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV135ForColNom, AV134ForColNum, AV126ForFec, AV138ForFecto, AV127CliCodform, AV128CliCodto, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV32TFForSerDsc, AV33TFForSerDsc_Sel, AV110TFForTipArtDsc, AV111TFForTipArtDsc_Sel, AV34TFForColNom, AV35TFForColNom_Sel, AV64TFForNomCli, AV65TFForNomCli_Sel, AV38TFTipColCod, AV39TFTipColCod_To, AV40TFTipColDsc, AV41TFTipColDsc_Sel, AV86TFForUltUti, AV87TFForUltUti_To, AV90TFForNumCol, AV91TFForNumCol_To, AV112TFForTonal, AV113TFForTonal_Sel, AV92TFForRelBan, AV93TFForRelBan_To, AV115TFForOpcCli, AV116TFForOpcCli_Sel, AV44TFIntDsc, AV45TFIntDsc_Sel, AV117TFForPro_Sel, AV137TFForBlo_Sels, AV142Pgmname, AV12OrderedBy, AV13OrderedDsc, AV119Listado, AV123ListadoH, AV100SiRGB, AV105FlagModa21, AV107Rfo0002, AV108Vfo0002, AV96UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV15FilterFullText ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV28TFCliNom ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV29TFCliNom_Sel ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = AV30TFForSer ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV31TFForSer_Sel ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV32TFForSerDsc ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV33TFForSerDsc_Sel ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV110TFForTipArtDsc ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV111TFForTipArtDsc_Sel ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV34TFForColNom ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV35TFForColNom_Sel ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV64TFForNomCli ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV65TFForNomCli_Sel ;
      AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV38TFTipColCod ;
      AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV39TFTipColCod_To ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV40TFTipColDsc ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV41TFTipColDsc_Sel ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV86TFForUltUti ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV87TFForUltUti_To ;
      AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV90TFForNumCol ;
      AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV91TFForNumCol_To ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV112TFForTonal ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV113TFForTonal_Sel ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV92TFForRelBan ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV93TFForRelBan_To ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV115TFForOpcCli ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV116TFForOpcCli_Sel ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV44TFIntDsc ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV45TFIntDsc_Sel ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV117TFForPro_Sel ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV137TFForBlo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV135ForColNom, AV134ForColNum, AV126ForFec, AV138ForFecto, AV127CliCodform, AV128CliCodto, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV28TFCliNom, AV29TFCliNom_Sel, AV30TFForSer, AV31TFForSer_Sel, AV32TFForSerDsc, AV33TFForSerDsc_Sel, AV110TFForTipArtDsc, AV111TFForTipArtDsc_Sel, AV34TFForColNom, AV35TFForColNom_Sel, AV64TFForNomCli, AV65TFForNomCli_Sel, AV38TFTipColCod, AV39TFTipColCod_To, AV40TFTipColDsc, AV41TFTipColDsc_Sel, AV86TFForUltUti, AV87TFForUltUti_To, AV90TFForNumCol, AV91TFForNumCol_To, AV112TFForTonal, AV113TFForTonal_Sel, AV92TFForRelBan, AV93TFForRelBan_To, AV115TFForOpcCli, AV116TFForOpcCli_Sel, AV44TFIntDsc, AV45TFIntDsc_Sel, AV117TFForPro_Sel, AV137TFForBlo_Sels, AV142Pgmname, AV12OrderedBy, AV13OrderedDsc, AV119Listado, AV123ListadoH, AV100SiRGB, AV105FlagModa21, AV107Rfo0002, AV108Vfo0002, AV96UsurCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV142Pgmname = "FormulacionTinte.MtoFormulasTinteWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavNum_hdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNum_hdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrs_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavNum_hdrsh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNum_hdrsh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrsh_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavVar_forrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_forrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_forrgb_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_80_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1BC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e251BC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFORM_DATA"), AV129CliCodform_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV131CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV70DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_80 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_80"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV72GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV73GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Combo_clicodform_Cls = httpContext.cgiGet( "COMBO_CLICODFORM_Cls") ;
         Combo_clicodform_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFORM_Selectedvalue_set") ;
         Combo_clicodform_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFORM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
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
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodform_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFORM_Selectedvalue_get") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV135ForColNom = httpContext.cgiGet( edtavForcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV135ForColNom", AV135ForColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUM");
            GX_FocusControl = edtavForcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV134ForColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV134ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134ForColNum), 6, 0));
         }
         else
         {
            AV134ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV134ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134ForColNum), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavForfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFORFEC");
            GX_FocusControl = edtavForfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV126ForFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126ForFec", localUtil.format(AV126ForFec, "99/99/99"));
         }
         else
         {
            AV126ForFec = localUtil.ctod( httpContext.cgiGet( edtavForfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126ForFec", localUtil.format(AV126ForFec, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavForfecto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFORFECTO");
            GX_FocusControl = edtavForfecto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV138ForFecto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138ForFecto", localUtil.format(AV138ForFecto, "99/99/99"));
         }
         else
         {
            AV138ForFecto = localUtil.ctod( httpContext.cgiGet( edtavForfecto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138ForFecto", localUtil.format(AV138ForFecto, "99/99/99"));
         }
         AV142Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodform_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodform_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFORM");
            GX_FocusControl = edtavClicodform_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV127CliCodform = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127CliCodform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127CliCodform), 6, 0));
         }
         else
         {
            AV127CliCodform = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodform_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127CliCodform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127CliCodform), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV128CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128CliCodto), 6, 0));
         }
         else
         {
            AV128CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128CliCodto), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORULTUTIAUXDATE");
            GX_FocusControl = edtavDdo_forultutiauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV88DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88DDO_ForUltUtiAuxDate", localUtil.format(AV88DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         else
         {
            AV88DDO_ForUltUtiAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_forultutiauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88DDO_ForUltUtiAuxDate", localUtil.format(AV88DDO_ForUltUtiAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_forultutiauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_FORULTUTIAUXDATETO");
            GX_FocusControl = edtavDdo_forultutiauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89DDO_ForUltUtiAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89DDO_ForUltUtiAuxDateTo", localUtil.format(AV89DDO_ForUltUtiAuxDateTo, "99/99/99"));
         }
         else
         {
            AV89DDO_ForUltUtiAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_forultutiauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89DDO_ForUltUtiAuxDateTo", localUtil.format(AV89DDO_ForUltUtiAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_80_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
         if ( nGXsfl_80_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV74GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
            AV102DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV102DetailWebComponent);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
            n5742ForSerDsc = false ;
            A13929ForTipArtD = httpContext.cgiGet( edtForTipArtD_Internalname) ;
            n13929ForTipArtD = false ;
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
            A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
            n995ForTonal = false ;
            A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( edtForRelBan_Internalname)) ;
            n2838ForRelBan = false ;
            A3560ForOpcCli = GXutil.upper( httpContext.cgiGet( edtForOpcCli_Internalname)) ;
            n3560ForOpcCli = false ;
            A584IntDsc = httpContext.cgiGet( edtIntDsc_Internalname) ;
            n584IntDsc = false ;
            A2749ForPro = ((GXutil.strcmp(httpContext.cgiGet( chkForPro.getInternalname()), "S")==0) ? "S" : "N") ;
            n2749ForPro = false ;
            cmbForBlo.setName( cmbForBlo.getInternalname() );
            cmbForBlo.setValue( httpContext.cgiGet( cmbForBlo.getInternalname()) );
            A7781ForBlo = httpContext.cgiGet( cmbForBlo.getInternalname()) ;
            n7781ForBlo = false ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRS");
               GX_FocusControl = edtavNum_hdrs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV118Num_hdrs = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Num_hdrs), 4, 0));
            }
            else
            {
               AV118Num_hdrs = (short)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Num_hdrs), 4, 0));
            }
            AV119Listado = httpContext.cgiGet( edtavListado_Internalname) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNUM_HDRSH");
               GX_FocusControl = edtavNum_hdrsh_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV124Num_hdrsH = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124Num_hdrsH), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_HDRSH"+"_"+sGXsfl_80_idx, getSecureSignedToken( sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")));
            }
            else
            {
               AV124Num_hdrsH = (int)(localUtil.ctol( httpContext.cgiGet( edtavNum_hdrsh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124Num_hdrsH), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_HDRSH"+"_"+sGXsfl_80_idx, getSecureSignedToken( sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")));
            }
            AV123ListadoH = httpContext.cgiGet( edtavListadoh_Internalname) ;
            A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1192ForNumCli = false ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVAR_FORRGB");
               GX_FocusControl = edtavVar_forrgb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV122Var_ForRGB = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Var_ForRGB), 10, 0));
            }
            else
            {
               AV122Var_ForRGB = localUtil.ctol( httpContext.cgiGet( edtavVar_forrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Var_ForRGB), 10, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
               GX_FocusControl = edtavR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV76R = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
            }
            else
            {
               AV76R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
            }
            A4339ForRGB = localUtil.ctol( httpContext.cgiGet( edtForRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n4339ForRGB = false ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
               GX_FocusControl = edtavG_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV77G = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
            }
            else
            {
               AV77G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
               GX_FocusControl = edtavB_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV78B = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
            }
            else
            {
               AV78B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
               GX_FocusControl = edtavR2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV79R2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
            }
            else
            {
               AV79R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
               GX_FocusControl = edtavG2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV80G2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
            }
            else
            {
               AV80G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
               GX_FocusControl = edtavB2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV81B2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
            }
            else
            {
               AV81B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MtoFormulasTinteWW");
         AV142Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\mtoformulastinteww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFORCOLNOM"), AV135ForColNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFORCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV134ForColNum )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vFORFEC"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV126ForFec)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vFORFECTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV138ForFecto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFORM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV127CliCodform )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV128CliCodto )
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
      e251BC2 ();
      if (returnInSub) return;
   }

   public void e251BC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV94Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mtoformulastinteww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV94Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Station", AV94Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV95EmprNom ;
      GXv_char4[0] = AV96UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV94Station, GXv_char2, GXv_char3, GXv_char4) ;
      mtoformulastinteww_impl.this.A396EmprCod = GXv_char2[0] ;
      mtoformulastinteww_impl.this.AV95EmprNom = GXv_char3[0] ;
      mtoformulastinteww_impl.this.AV96UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV96UsurCod", AV96UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96UsurCod, "@!"))));
      GXt_int5 = (byte)(AV100SiRGB) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIFRGB", ""), GXv_int6) ;
      mtoformulastinteww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV100SiRGB = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100SiRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100SiRGB), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIRGB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV100SiRGB), "ZZZ9")));
      GXt_int5 = (byte)(AV105FlagModa21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MOD005", ""), GXv_int6) ;
      mtoformulastinteww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV105FlagModa21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105FlagModa21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105FlagModa21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV105FlagModa21), "ZZZ9")));
      GXt_int5 = (byte)(AV106carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      mtoformulastinteww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV106carvitin = GXt_int5 ;
      GXt_int5 = (byte)(AV107Rfo0002) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FO0002", ""), GXv_int6) ;
      mtoformulastinteww_impl.this.GXt_int5 = GXv_int6[0] ;
      AV107Rfo0002 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Rfo0002", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Rfo0002), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV107Rfo0002), "ZZZ9")));
      GXt_int7 = AV108Vfo0002 ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FO0002", ""), GXv_int8) ;
      mtoformulastinteww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV108Vfo0002 = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108Vfo0002", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Vfo0002), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVFO0002", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108Vfo0002), "ZZZ9")));
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forfec())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to())) )
      {
         AV126ForFec = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forfec() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126ForFec", localUtil.format(AV126ForFec, "99/99/99"));
         AV138ForFecto = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138ForFecto", localUtil.format(AV138ForFecto, "99/99/99"));
      }
      else
      {
         AV126ForFec = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(180)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126ForFec", localUtil.format(AV126ForFec, "99/99/99"));
         AV138ForFecto = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138ForFecto", localUtil.format(AV138ForFecto, "99/99/99"));
      }
      GXt_char1 = AV94Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      mtoformulastinteww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV94Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94Station", AV94Station);
      GXv_char4[0] = AV125EmprCod ;
      GXv_char3[0] = AV95EmprNom ;
      GXv_char2[0] = AV96UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV94Station, GXv_char4, GXv_char3, GXv_char2) ;
      mtoformulastinteww_impl.this.AV125EmprCod = GXv_char4[0] ;
      mtoformulastinteww_impl.this.AV95EmprNom = GXv_char3[0] ;
      mtoformulastinteww_impl.this.AV96UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96UsurCod", AV96UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96UsurCod, "@!"))));
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodform_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodform_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodform_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFORM' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S132 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S142 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mto Formulas Tinte", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV70DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV70DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      edtavListado_gximage = "ActionExportReport" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "gximage", edtavListado_gximage, !bGXsfl_80_Refreshing);
      AV119Listado = context.getHttpContext().getImagePath( "776fb79c-a0a1-4302-b5e5-d773dbe1a297", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "Bitmap", ((GXutil.strcmp("", AV119Listado)==0) ? AV143Listado_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV119Listado))), !bGXsfl_80_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV119Listado), true);
      AV143Listado_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "776fb79c-a0a1-4302-b5e5-d773dbe1a297", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "Bitmap", ((GXutil.strcmp("", AV119Listado)==0) ? AV143Listado_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV119Listado))), !bGXsfl_80_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV119Listado), true);
      edtavListadoh_gximage = "ActionExportReport" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "gximage", edtavListadoh_gximage, !bGXsfl_80_Refreshing);
      AV123ListadoH = context.getHttpContext().getImagePath( "776fb79c-a0a1-4302-b5e5-d773dbe1a297", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "Bitmap", ((GXutil.strcmp("", AV123ListadoH)==0) ? AV144Listadoh_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV123ListadoH))), !bGXsfl_80_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV123ListadoH), true);
      AV144Listadoh_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "776fb79c-a0a1-4302-b5e5-d773dbe1a297", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "Bitmap", ((GXutil.strcmp("", AV123ListadoH)==0) ? AV144Listadoh_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV123ListadoH))), !bGXsfl_80_Refreshing);
      httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV123ListadoH), true);
   }

   public void e261BC2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S142 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("FormulacionTinte.MtoFormulasTinteWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("FormulacionTinte.MtoFormulasTinteWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S192 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSerDsc_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForTipArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTipArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTipArtD_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNomCli_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtTipColCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtTipColDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColDsc_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForFec_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForUltUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForUltUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForUltUti_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForNumCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForNumCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForNumCol_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForTonal_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForTonal_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForTonal_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForRelBan_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForRelBan_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForRelBan_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtForOpcCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtForOpcCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForOpcCli_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtIntDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Visible), 5, 0), !bGXsfl_80_Refreshing);
      chkForPro.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkForPro.getInternalname(), "Visible", GXutil.ltrimstr( chkForPro.getVisible(), 5, 0), !bGXsfl_80_Refreshing);
      cmbForBlo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Visible", GXutil.ltrimstr( cmbForBlo.getVisible(), 5, 0), !bGXsfl_80_Refreshing);
      edtavNum_hdrs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNum_hdrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrs_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtavListado_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListado_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtavNum_hdrsh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNum_hdrsh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNum_hdrsh_Visible), 5, 0), !bGXsfl_80_Refreshing);
      edtavListadoh_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListadoh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListadoh_Visible), 5, 0), !bGXsfl_80_Refreshing);
      AV72GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72GridCurrentPage), 10, 0));
      AV73GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridPageCount), 10, 0));
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = AV15FilterFullText ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = AV28TFCliNom ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = AV29TFCliNom_Sel ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = AV30TFForSer ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = AV31TFForSer_Sel ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = AV32TFForSerDsc ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = AV33TFForSerDsc_Sel ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = AV110TFForTipArtDsc ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = AV111TFForTipArtDsc_Sel ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = AV34TFForColNom ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = AV35TFForColNom_Sel ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = AV64TFForNomCli ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = AV65TFForNomCli_Sel ;
      AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod = AV38TFTipColCod ;
      AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to = AV39TFTipColCod_To ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = AV40TFTipColDsc ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = AV41TFTipColDsc_Sel ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = AV86TFForUltUti ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = AV87TFForUltUti_To ;
      AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol = AV90TFForNumCol ;
      AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to = AV91TFForNumCol_To ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = AV112TFForTonal ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = AV113TFForTonal_Sel ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = AV92TFForRelBan ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = AV93TFForRelBan_To ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = AV115TFForOpcCli ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = AV116TFForOpcCli_Sel ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = AV44TFIntDsc ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = AV45TFIntDsc_Sel ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = AV117TFForPro_Sel ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = AV137TFForBlo_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e141BC2( )
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
         AV71PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV71PageToGo) ;
      }
   }

   public void e151BC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e161BC2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV28TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliNom", AV28TFCliNom);
            AV29TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSer") == 0 )
         {
            AV30TFForSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFForSer", AV30TFForSer);
            AV31TFForSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFForSer_Sel", AV31TFForSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV32TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFForSerDsc", AV32TFForSerDsc);
            AV33TFForSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForSerDsc_Sel", AV33TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForTipArtDsc") == 0 )
         {
            AV110TFForTipArtDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFForTipArtDsc", AV110TFForTipArtDsc);
            AV111TFForTipArtDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFForTipArtDsc_Sel", AV111TFForTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV34TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFForColNom", AV34TFForColNom);
            AV35TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFForColNom_Sel", AV35TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNomCli") == 0 )
         {
            AV64TFForNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFForNomCli", AV64TFForNomCli);
            AV65TFForNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFForNomCli_Sel", AV65TFForNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColCod") == 0 )
         {
            AV38TFTipColCod = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTipColCod), 2, 0));
            AV39TFTipColCod_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipColDsc") == 0 )
         {
            AV40TFTipColDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFTipColDsc", AV40TFTipColDsc);
            AV41TFTipColDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFTipColDsc_Sel", AV41TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForUltUti") == 0 )
         {
            AV86TFForUltUti = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFForUltUti", localUtil.format(AV86TFForUltUti, "99/99/99"));
            AV87TFForUltUti_To = localUtil.ctod( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFForUltUti_To", localUtil.format(AV87TFForUltUti_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForNumCol") == 0 )
         {
            AV90TFForNumCol = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFForNumCol), 8, 0));
            AV91TFForNumCol_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForTonal") == 0 )
         {
            AV112TFForTonal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFForTonal", AV112TFForTonal);
            AV113TFForTonal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFForTonal_Sel", AV113TFForTonal_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForRelBan") == 0 )
         {
            AV92TFForRelBan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFForRelBan", GXutil.ltrimstr( AV92TFForRelBan, 7, 2));
            AV93TFForRelBan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFForRelBan_To", GXutil.ltrimstr( AV93TFForRelBan_To, 7, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForOpcCli") == 0 )
         {
            AV115TFForOpcCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115TFForOpcCli", AV115TFForOpcCli);
            AV116TFForOpcCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFForOpcCli_Sel", AV116TFForOpcCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "IntDsc") == 0 )
         {
            AV44TFIntDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFIntDsc", AV44TFIntDsc);
            AV45TFIntDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFIntDsc_Sel", AV45TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPro") == 0 )
         {
            AV117TFForPro_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFForPro_Sel", AV117TFForPro_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForBlo") == 0 )
         {
            AV136TFForBlo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFForBlo_SelsJson", AV136TFForBlo_SelsJson);
            AV137TFForBlo_Sels.fromJSonString(AV136TFForBlo_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV137TFForBlo_Sels", AV137TFForBlo_Sels);
   }

   private void e271BC2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Procesos Quimicos", ""), "fas fa-cogs", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "far fa-comment", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Ver Formula", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Duplicar_Equivalente", ""), "fa-clone far", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Simulacion", ""), "fas fa-play", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Informe Receta", ""), "fas fa-file-powerpoint", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Listado", ""), "fas fa-file-powerpoint", "", "", "", "", "", "", ""), (short)(0));
         AV102DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV102DetailWebComponent);
         GXt_int7 = AV118Num_hdrs ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A494ForSer ;
         GXv_char2[0] = A482ForColNom ;
         GXv_int12[0] = A483ForColNum ;
         GXv_int6[0] = A831TipColCod ;
         GXv_int13[0] = GXt_int7 ;
         new app.formulaciontinte.pkilequi2(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_int12, GXv_int6, GXv_int13) ;
         mtoformulastinteww_impl.this.A396EmprCod = GXv_char4[0] ;
         mtoformulastinteww_impl.this.A252CliCod = GXv_int8[0] ;
         mtoformulastinteww_impl.this.A494ForSer = GXv_char3[0] ;
         mtoformulastinteww_impl.this.A482ForColNom = GXv_char2[0] ;
         mtoformulastinteww_impl.this.A483ForColNum = GXv_int12[0] ;
         mtoformulastinteww_impl.this.A831TipColCod = GXv_int6[0] ;
         mtoformulastinteww_impl.this.GXt_int7 = GXv_int13[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV118Num_hdrs = (short)(GXt_int7) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrs_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV118Num_hdrs), 4, 0));
         GXt_int7 = AV124Num_hdrsH ;
         GXv_int13[0] = GXt_int7 ;
         new app.formulaciontinte.pkilequi2historico(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, GXv_int13) ;
         mtoformulastinteww_impl.this.GXt_int7 = GXv_int13[0] ;
         AV124Num_hdrsH = GXt_int7 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavNum_hdrsh_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124Num_hdrsH), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUM_HDRSH"+"_"+sGXsfl_80_idx, getSecureSignedToken( sGXsfl_80_idx, localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")));
         AV122Var_ForRGB = ((A4339ForRGB==0) ? 65793 : A4339ForRGB) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavVar_forrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122Var_ForRGB), 10, 0));
         GXv_int14[0] = AV76R ;
         GXv_int15[0] = AV77G ;
         GXv_int16[0] = AV78B ;
         GXv_int17[0] = AV79R2 ;
         GXv_int18[0] = AV80G2 ;
         GXv_int19[0] = AV81B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV122Var_ForRGB, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_int19) ;
         mtoformulastinteww_impl.this.AV76R = GXv_int14[0] ;
         mtoformulastinteww_impl.this.AV77G = GXv_int15[0] ;
         mtoformulastinteww_impl.this.AV78B = GXv_int16[0] ;
         mtoformulastinteww_impl.this.AV79R2 = GXv_int17[0] ;
         mtoformulastinteww_impl.this.AV80G2 = GXv_int18[0] ;
         mtoformulastinteww_impl.this.AV81B2 = GXv_int19[0] ;
         httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
         httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
         if ( AV100SiRGB == 1 )
         {
            edtForNomCli_Backcolor = GXutil.getColor( AV76R, AV77G, AV78B) ;
            edtForNomCli_Forecolor = GXutil.getColor( AV79R2, AV80G2, AV81B2) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(80) ;
         }
         sendrow_802( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_80_Refreshing )
      {
         httpContext.doAjaxLoad(80, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV74GridActions, 4, 0)) );
   }

   public void e171BC2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.MtoFormulasTinteWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111BC2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S202 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S182 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.MtoFormulasTinteWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV142Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.MtoFormulasTinteWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.MtoFormulasTinteWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         mtoformulastinteww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S202 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV142Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S172 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S212 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV137TFForBlo_Sels", AV137TFForBlo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e281BC2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV74GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 4 )
      {
         /* Execute user subroutine: 'DO PROCESOSQUIMICOS' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 5 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 6 )
      {
         /* Execute user subroutine: 'DO VERFORMULA' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 7 )
      {
         /* Execute user subroutine: 'DO DUPLICAR_EQUIVALENTE' */
         S282 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 8 )
      {
         /* Execute user subroutine: 'DO SIMULACION' */
         S292 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 9 )
      {
         /* Execute user subroutine: 'DO INFORMERECETA' */
         S302 ();
         if (returnInSub) return;
      }
      else if ( AV74GridActions == 10 )
      {
         /* Execute user subroutine: 'DO LISTADO' */
         S312 ();
         if (returnInSub) return;
      }
      AV74GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV74GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e181BC2( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S322 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e191BC2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.mtoformulastinte", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForRGB"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e201BC2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.formulaciontinte.mtoformulastintewwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      mtoformulastinteww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      mtoformulastinteww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV137TFForBlo_Sels", AV137TFForBlo_Sels);
   }

   public void e131BC2( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV128CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128CliCodto), 6, 0));
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV132FilterMtoFormulasTinteWW", AV132FilterMtoFormulasTinteWW);
   }

   public void e121BC2( )
   {
      /* Combo_clicodform_Onoptionclicked Routine */
      returnInSub = false ;
      AV127CliCodform = (int)(GXutil.lval( Combo_clicodform_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127CliCodform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127CliCodform), 6, 0));
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV132FilterMtoFormulasTinteWW", AV132FilterMtoFormulasTinteWW);
   }

   public void S172( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S192( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CliCod", "", "Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "CliNom", "", "Nombre", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForSer", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForSerDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForTipArtDsc", "", "Tipo de Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForColNom", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForColNum", "", "Numero", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForNomCli", "", "Color Cliente", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "TipColCod", "", "Tc", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "TipColDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForFec", "", "Fecha Formula", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForUltUti", "", "Fecha Ult Uti", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForNumCol", "", "Nº Formula", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForTonal", "", "Coleccion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForRelBan", "", "RB", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForOpcCli", "", "Op", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "IntDsc", "", "Intensidad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForPro", "", "Prov?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "ForBlo", "", "Bloq?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&Num_hdrs", "", "Prd.?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&Listado", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&Num_hdrsH", "", "Hist.?", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXv_SdtWWPColumnsSelector20[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, "&ListadoH", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.MtoFormulasTinteWWColumnsSelector", GXv_char4) ;
      mtoformulastinteww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector20[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector21[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector20, GXv_SdtWWPColumnsSelector21) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector20[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector21[0] ;
      }
   }

   public void S142( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.MtoFormulasTinteWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   }

   public void S202( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV28TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliNom", AV28TFCliNom);
      AV29TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
      AV30TFForSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFForSer", AV30TFForSer);
      AV31TFForSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFForSer_Sel", AV31TFForSer_Sel);
      AV32TFForSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFForSerDsc", AV32TFForSerDsc);
      AV33TFForSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFForSerDsc_Sel", AV33TFForSerDsc_Sel);
      AV110TFForTipArtDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TFForTipArtDsc", AV110TFForTipArtDsc);
      AV111TFForTipArtDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111TFForTipArtDsc_Sel", AV111TFForTipArtDsc_Sel);
      AV34TFForColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFForColNom", AV34TFForColNom);
      AV35TFForColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFForColNom_Sel", AV35TFForColNom_Sel);
      AV64TFForNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFForNomCli", AV64TFForNomCli);
      AV65TFForNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFForNomCli_Sel", AV65TFForNomCli_Sel);
      AV38TFTipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTipColCod), 2, 0));
      AV39TFTipColCod_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFTipColCod_To), 2, 0));
      AV40TFTipColDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFTipColDsc", AV40TFTipColDsc);
      AV41TFTipColDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFTipColDsc_Sel", AV41TFTipColDsc_Sel);
      AV86TFForUltUti = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFForUltUti", localUtil.format(AV86TFForUltUti, "99/99/99"));
      AV87TFForUltUti_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFForUltUti_To", localUtil.format(AV87TFForUltUti_To, "99/99/99"));
      AV90TFForNumCol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFForNumCol), 8, 0));
      AV91TFForNumCol_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFForNumCol_To), 8, 0));
      AV112TFForTonal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112TFForTonal", AV112TFForTonal);
      AV113TFForTonal_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113TFForTonal_Sel", AV113TFForTonal_Sel);
      AV92TFForRelBan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFForRelBan", GXutil.ltrimstr( AV92TFForRelBan, 7, 2));
      AV93TFForRelBan_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFForRelBan_To", GXutil.ltrimstr( AV93TFForRelBan_To, 7, 2));
      AV115TFForOpcCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115TFForOpcCli", AV115TFForOpcCli);
      AV116TFForOpcCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116TFForOpcCli_Sel", AV116TFForOpcCli_Sel);
      AV44TFIntDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFIntDsc", AV44TFIntDsc);
      AV45TFIntDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFIntDsc_Sel", AV45TFIntDsc_Sel);
      AV117TFForPro_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117TFForPro_Sel", AV117TFForPro_Sel);
      AV137TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S222( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.mtoformulastinte", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4339ForRGB,10,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForRGB"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S232( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.mtoformulastinte", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4339ForRGB,10,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForRGB"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S242( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( ( AV118Num_hdrs > 0 ) || ( AV124Num_hdrsH > 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion, el sistema ha detectado que existen", "") + GXutil.newLine( ) + GXutil.newLine( ) ;
         if ( AV118Num_hdrs > 0 )
         {
            Gx_msg += httpContext.getMessage( "Hdrs con receta de Teñido = ", "") + GXutil.trim( GXutil.str( AV118Num_hdrs, 4, 0)) + GXutil.newLine( ) ;
         }
         if ( AV124Num_hdrsH > 0 )
         {
            Gx_msg += httpContext.getMessage( "Hdrs Historico con receta de Teñido = ", "") + GXutil.trim( GXutil.str( AV124Num_hdrsH, 6, 0)) + GXutil.newLine( ) ;
         }
         Gx_msg += httpContext.getMessage( "No se permite la eliminacion del color", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.getMessage( "¿Deseas eliminar la formula Nº ", "")+GXutil.trim( GXutil.str( A486ForNumCol, 8, 0))+"?" ;
         ucDvelop_confirmpanel_eliminar.sendProperty(context, "", false, Dvelop_confirmpanel_eliminar_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         AV177Emprcod_selected = A396EmprCod ;
         AV178Clicod_selected = A252CliCod ;
         AV179Forser_selected = A494ForSer ;
         AV180Forcolnom_selected = A482ForColNom ;
         AV181Forcolnum_selected = A483ForColNum ;
         AV182Tipcolcod_selected = A831TipColCod ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S322( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int13[0] = A252CliCod ;
      GXv_char3[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int12[0] = A483ForColNum ;
      GXv_int6[0] = A831TipColCod ;
      GXv_int8[0] = A486ForNumCol ;
      new app.pelifor(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_char3, GXv_char2, GXv_int12, GXv_int6, GXv_int8) ;
      mtoformulastinteww_impl.this.A396EmprCod = GXv_char4[0] ;
      mtoformulastinteww_impl.this.A252CliCod = GXv_int13[0] ;
      mtoformulastinteww_impl.this.A494ForSer = GXv_char3[0] ;
      mtoformulastinteww_impl.this.A482ForColNom = GXv_char2[0] ;
      mtoformulastinteww_impl.this.A483ForColNum = GXv_int12[0] ;
      mtoformulastinteww_impl.this.A831TipColCod = GXv_int6[0] ;
      mtoformulastinteww_impl.this.A486ForNumCol = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV101IncObs = httpContext.getMessage( "Formula Teñido : Artículo : ", "") + GXutil.trim( A494ForSer) + httpContext.getMessage( ", Color : ", "") + GXutil.trim( A482ForColNom) + "-" + GXutil.trim( GXutil.str( A483ForColNum, 10, 0)) + "-" + GXutil.trim( GXutil.str( A831TipColCod, 10, 0)) + httpContext.getMessage( ",Cliente : ", "") + GXutil.trim( GXutil.str( A252CliCod, 10, 0)) + httpContext.getMessage( " (Eliminado)", "") ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV142Pgmname, 1, 10), AV96UsurCod, AV94Station, AV101IncObs, 99999999, (byte)(9), httpContext.getMessage( "z", "")) ;
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO PROCESOSQUIMICOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.mtrodorumatinteprocesso", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A486ForNumCol,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A2838ForRelBan))}, new String[] {"Mode","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForNumCol","ForRelBan"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S262( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.tobsfor", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.tobsfor", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S272( )
   {
      /* 'DO VERFORMULA' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int13[0] = A252CliCod ;
      GXv_char3[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int12[0] = A483ForColNum ;
      GXv_int6[0] = A831TipColCod ;
      GXv_decimal24[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int8[0] = (int)(DecimalUtil.decToDouble(A2838ForRelBan)) ;
      GXv_char25[0] = " " ;
      GXv_decimal26[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int13, GXv_char3, GXv_char2, GXv_int12, GXv_int6, GXv_decimal24, GXv_int8, GXv_char25, GXv_decimal26) ;
      mtoformulastinteww_impl.this.A396EmprCod = GXv_char4[0] ;
      mtoformulastinteww_impl.this.A252CliCod = GXv_int13[0] ;
      mtoformulastinteww_impl.this.A494ForSer = GXv_char3[0] ;
      mtoformulastinteww_impl.this.A482ForColNom = GXv_char2[0] ;
      mtoformulastinteww_impl.this.A483ForColNum = GXv_int12[0] ;
      mtoformulastinteww_impl.this.A831TipColCod = GXv_int6[0] ;
      mtoformulastinteww_impl.this.A2838ForRelBan = DecimalUtil.doubleToDec(GXv_int8[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.popup(formatLink("app.formulaciontinte.webverformulacompleta", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV94Station)),GXutil.URLEncode(DecimalUtil.decToString(A2838ForRelBan))}, new String[] {"Emprcod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","Station","ForRelBan"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S282( )
   {
      /* 'DO DUPLICAR_EQUIVALENTE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webduplicarformula", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(A1191ForNomCli)),GXutil.URLEncode(GXutil.ltrimstr(A1192ForNumCli,6,0))}, new String[] {"EmprCod","CliCodOri","SerOri","ColOri","ColNumOri","TipColOri","BarNomCliO","BarNumCliO"}) , new Object[] {"A396EmprCod","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","A1191ForNomCli","A1192ForNumCli"});
      httpContext.doAjaxRefresh();
   }

   public void S292( )
   {
      /* 'DO SIMULACION' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.webfo0006n", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(A2838ForRelBan))}, new String[] {"EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForRelBan"}) , new Object[] {"A396EmprCod","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","A2838ForRelBan"});
      GXv_char25[0] = A396EmprCod ;
      GXv_char4[0] = AV94Station ;
      new app.formulaciontinte.pkilsim(remoteHandle, context).execute( GXv_char25, GXv_char4) ;
      mtoformulastinteww_impl.this.A396EmprCod = GXv_char25[0] ;
      mtoformulastinteww_impl.this.AV94Station = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV94Station", AV94Station);
   }

   public void S302( )
   {
      /* 'DO INFORMERECETA' Routine */
      returnInSub = false ;
      GXv_char25[0] = A396EmprCod ;
      GXv_int13[0] = A252CliCod ;
      GXv_char4[0] = A494ForSer ;
      GXv_char3[0] = A482ForColNom ;
      GXv_int12[0] = A483ForColNum ;
      GXv_int6[0] = A831TipColCod ;
      GXv_decimal26[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int8[0] = (int)(DecimalUtil.decToDouble(A2838ForRelBan)) ;
      GXv_char2[0] = " " ;
      GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char25, GXv_int13, GXv_char4, GXv_char3, GXv_int12, GXv_int6, GXv_decimal26, GXv_int8, GXv_char2, GXv_decimal24) ;
      mtoformulastinteww_impl.this.A396EmprCod = GXv_char25[0] ;
      mtoformulastinteww_impl.this.A252CliCod = GXv_int13[0] ;
      mtoformulastinteww_impl.this.A494ForSer = GXv_char4[0] ;
      mtoformulastinteww_impl.this.A482ForColNom = GXv_char3[0] ;
      mtoformulastinteww_impl.this.A483ForColNum = GXv_int12[0] ;
      mtoformulastinteww_impl.this.A831TipColCod = GXv_int6[0] ;
      mtoformulastinteww_impl.this.A2838ForRelBan = DecimalUtil.doubleToDec(GXv_int8[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      GXv_char25[0] = A396EmprCod ;
      GXv_char4[0] = AV94Station ;
      GXv_decimal26[0] = AV109Valor_cor ;
      new app.pvercoste(remoteHandle, context).execute( GXv_char25, GXv_char4, GXv_decimal26) ;
      mtoformulastinteww_impl.this.A396EmprCod = GXv_char25[0] ;
      mtoformulastinteww_impl.this.AV94Station = GXv_char4[0] ;
      mtoformulastinteww_impl.this.AV109Valor_cor = GXv_decimal26[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV94Station", AV94Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV109Valor_cor", GXutil.ltrimstr( AV109Valor_cor, 11, 5));
      httpContext.popup(formatLink("app.pverrecetacolor", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV94Station)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV109Valor_cor))}, new String[] {"EmprCod","Station","CliCod","ForSer","ForColNom","ForColNum","TipColCod","valor"}) , new Object[] {"A396EmprCod","AV94Station","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","AV109Valor_cor"});
   }

   public void S312( )
   {
      /* 'DO LISTADO' Routine */
      returnInSub = false ;
      if ( AV105FlagModa21 == 1 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.rmod005", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","PCliCod","UCliCod","PSerie","Userie","PNumCol","UNumCol","PColor","UColor","Tipcolcodfrom","tipcolcodto","Output"}) , new Object[] {"A396EmprCod","A252CliCod","A252CliCod","A494ForSer","A494ForSer","A483ForColNum","A483ForColNum","A482ForColNom","A482ForColNom","A831TipColCod","A831TipColCod",""});
      }
      else if ( ( AV107Rfo0002 == 1 ) && ( AV108Vfo0002 == 1 ) )
      {
         GXv_char25[0] = A396EmprCod ;
         GXv_int13[0] = A252CliCod ;
         GXv_char4[0] = A494ForSer ;
         GXv_char3[0] = A482ForColNom ;
         GXv_int12[0] = A483ForColNum ;
         GXv_int6[0] = A831TipColCod ;
         GXv_decimal26[0] = DecimalUtil.doubleToDec(1) ;
         GXv_int8[0] = (int)(DecimalUtil.decToDouble(A2838ForRelBan)) ;
         GXv_char2[0] = "" ;
         GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
         new app.psimulax(remoteHandle, context).execute( GXv_char25, GXv_int13, GXv_char4, GXv_char3, GXv_int12, GXv_int6, GXv_decimal26, GXv_int8, GXv_char2, GXv_decimal24) ;
         mtoformulastinteww_impl.this.A396EmprCod = GXv_char25[0] ;
         mtoformulastinteww_impl.this.A252CliCod = GXv_int13[0] ;
         mtoformulastinteww_impl.this.A494ForSer = GXv_char4[0] ;
         mtoformulastinteww_impl.this.A482ForColNom = GXv_char3[0] ;
         mtoformulastinteww_impl.this.A483ForColNum = GXv_int12[0] ;
         mtoformulastinteww_impl.this.A831TipColCod = GXv_int6[0] ;
         mtoformulastinteww_impl.this.A2838ForRelBan = DecimalUtil.doubleToDec(GXv_int8[0]) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.popup(formatLink("app.formulaciontinte.rfo00c2", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV94Station)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","Station","PCliCod","UCliCod","PSerie","USerie","PColor","UColor","PNumCol","UNumCol","Output"}) , new Object[] {"A396EmprCod","AV94Station","A252CliCod","A252CliCod","A494ForSer","A494ForSer","A483ForColNum","A483ForColNum","A482ForColNom","A482ForColNom",""});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Formato NO definido¡", ""));
      }
   }

   public void S162( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV142Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV142Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV142Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S212 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S212( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV183GXV1 = 1 ;
      while ( AV183GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV183GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV28TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFCliNom", AV28TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV29TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliNom_Sel", AV29TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV30TFForSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFForSer", AV30TFForSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV31TFForSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFForSer_Sel", AV31TFForSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV32TFForSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFForSerDsc", AV32TFForSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV33TFForSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForSerDsc_Sel", AV33TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV110TFForTipArtDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFForTipArtDsc", AV110TFForTipArtDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV111TFForTipArtDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFForTipArtDsc_Sel", AV111TFForTipArtDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV34TFForColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFForColNom", AV34TFForColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV35TFForColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFForColNom_Sel", AV35TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI") == 0 )
         {
            AV64TFForNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFForNomCli", AV64TFForNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNOMCLI_SEL") == 0 )
         {
            AV65TFForNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFForNomCli_Sel", AV65TFForNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV38TFTipColCod = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFTipColCod), 2, 0));
            AV39TFTipColCod_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipColCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFTipColCod_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV40TFTipColDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFTipColDsc", AV40TFTipColDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV41TFTipColDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFTipColDsc_Sel", AV41TFTipColDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTUTI") == 0 )
         {
            AV86TFForUltUti = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFForUltUti", localUtil.format(AV86TFForUltUti, "99/99/99"));
            AV87TFForUltUti_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFForUltUti_To", localUtil.format(AV87TFForUltUti_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV90TFForNumCol = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFForNumCol), 8, 0));
            AV91TFForNumCol_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFForNumCol_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TFForNumCol_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL") == 0 )
         {
            AV112TFForTonal = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112TFForTonal", AV112TFForTonal);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTONAL_SEL") == 0 )
         {
            AV113TFForTonal_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFForTonal_Sel", AV113TFForTonal_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORRELBAN") == 0 )
         {
            AV92TFForRelBan = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFForRelBan", GXutil.ltrimstr( AV92TFForRelBan, 7, 2));
            AV93TFForRelBan_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFForRelBan_To", GXutil.ltrimstr( AV93TFForRelBan_To, 7, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI") == 0 )
         {
            AV115TFForOpcCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115TFForOpcCli", AV115TFForOpcCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFOROPCCLI_SEL") == 0 )
         {
            AV116TFForOpcCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFForOpcCli_Sel", AV116TFForOpcCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV44TFIntDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFIntDsc", AV44TFIntDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV45TFIntDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFIntDsc_Sel", AV45TFIntDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRO_SEL") == 0 )
         {
            AV117TFForPro_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFForPro_Sel", AV117TFForPro_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV136TFForBlo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136TFForBlo_SelsJson", AV136TFForBlo_SelsJson);
            AV137TFForBlo_Sels.fromJSonString(AV136TFForBlo_SelsJson, null);
         }
         AV183GXV1 = (int)(AV183GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char25[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, GXv_char25) ;
      mtoformulastinteww_impl.this.GXt_char1 = GXv_char25[0] ;
      GXt_char27 = "" ;
      GXv_char4[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFForSer_Sel)==0), AV31TFForSer_Sel, GXv_char4) ;
      mtoformulastinteww_impl.this.GXt_char27 = GXv_char4[0] ;
      GXt_char28 = "" ;
      GXv_char3[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFForSerDsc_Sel)==0), AV33TFForSerDsc_Sel, GXv_char3) ;
      mtoformulastinteww_impl.this.GXt_char28 = GXv_char3[0] ;
      GXt_char29 = "" ;
      GXv_char2[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV111TFForTipArtDsc_Sel)==0), AV111TFForTipArtDsc_Sel, GXv_char2) ;
      mtoformulastinteww_impl.this.GXt_char29 = GXv_char2[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFForColNom_Sel)==0), AV35TFForColNom_Sel, GXv_char31) ;
      mtoformulastinteww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFForNomCli_Sel)==0), AV65TFForNomCli_Sel, GXv_char33) ;
      mtoformulastinteww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFTipColDsc_Sel)==0), AV41TFTipColDsc_Sel, GXv_char35) ;
      mtoformulastinteww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV113TFForTonal_Sel)==0), AV113TFForTonal_Sel, GXv_char37) ;
      mtoformulastinteww_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV116TFForOpcCli_Sel)==0), AV116TFForOpcCli_Sel, GXv_char39) ;
      mtoformulastinteww_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFIntDsc_Sel)==0), AV45TFIntDsc_Sel, GXv_char41) ;
      mtoformulastinteww_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV117TFForPro_Sel)==0), AV117TFForPro_Sel, GXv_char43) ;
      mtoformulastinteww_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char44 = "" ;
      GXv_char45[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV137TFForBlo_Sels.size()==0), AV136TFForBlo_SelsJson, GXv_char45) ;
      mtoformulastinteww_impl.this.GXt_char44 = GXv_char45[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char27+"|"+GXt_char28+"|"+GXt_char29+"|"+GXt_char30+"||"+GXt_char32+"||"+GXt_char34+"||||"+GXt_char36+"||"+GXt_char38+"|"+GXt_char40+"|"+GXt_char42+"|"+GXt_char44+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char44 = "" ;
      GXv_char45[0] = GXt_char44 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFCliNom)==0), AV28TFCliNom, GXv_char45) ;
      mtoformulastinteww_impl.this.GXt_char44 = GXv_char45[0] ;
      GXt_char42 = "" ;
      GXv_char43[0] = GXt_char42 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFForSer)==0), AV30TFForSer, GXv_char43) ;
      mtoformulastinteww_impl.this.GXt_char42 = GXv_char43[0] ;
      GXt_char40 = "" ;
      GXv_char41[0] = GXt_char40 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFForSerDsc)==0), AV32TFForSerDsc, GXv_char41) ;
      mtoformulastinteww_impl.this.GXt_char40 = GXv_char41[0] ;
      GXt_char38 = "" ;
      GXv_char39[0] = GXt_char38 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV110TFForTipArtDsc)==0), AV110TFForTipArtDsc, GXv_char39) ;
      mtoformulastinteww_impl.this.GXt_char38 = GXv_char39[0] ;
      GXt_char36 = "" ;
      GXv_char37[0] = GXt_char36 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFForColNom)==0), AV34TFForColNom, GXv_char37) ;
      mtoformulastinteww_impl.this.GXt_char36 = GXv_char37[0] ;
      GXt_char34 = "" ;
      GXv_char35[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFForNomCli)==0), AV64TFForNomCli, GXv_char35) ;
      mtoformulastinteww_impl.this.GXt_char34 = GXv_char35[0] ;
      GXt_char32 = "" ;
      GXv_char33[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFTipColDsc)==0), AV40TFTipColDsc, GXv_char33) ;
      mtoformulastinteww_impl.this.GXt_char32 = GXv_char33[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV112TFForTonal)==0), AV112TFForTonal, GXv_char31) ;
      mtoformulastinteww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char29 = "" ;
      GXv_char25[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV115TFForOpcCli)==0), AV115TFForOpcCli, GXv_char25) ;
      mtoformulastinteww_impl.this.GXt_char29 = GXv_char25[0] ;
      GXt_char28 = "" ;
      GXv_char4[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFIntDsc)==0), AV44TFIntDsc, GXv_char4) ;
      mtoformulastinteww_impl.this.GXt_char28 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = "|"+GXt_char44+"|"+GXt_char42+"|"+GXt_char40+"|"+GXt_char38+"|"+GXt_char36+"||"+GXt_char34+"|"+((0==AV38TFTipColCod) ? "" : GXutil.str( AV38TFTipColCod, 2, 0))+"|"+GXt_char32+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86TFForUltUti)) ? "" : localUtil.dtoc( AV86TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV90TFForNumCol) ? "" : GXutil.str( AV90TFForNumCol, 8, 0))+"|"+GXt_char30+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFForRelBan)==0) ? "" : GXutil.str( AV92TFForRelBan, 7, 2))+"|"+GXt_char29+"|"+GXt_char28+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||||||"+((0==AV39TFTipColCod_To) ? "" : GXutil.str( AV39TFTipColCod_To, 2, 0))+"|||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87TFForUltUti_To)) ? "" : localUtil.dtoc( AV87TFForUltUti_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV91TFForNumCol_To) ? "" : GXutil.str( AV91TFForNumCol_To, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFForRelBan_To)==0) ? "" : GXutil.str( AV93TFForRelBan_To, 7, 2))+"||||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S182( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV142Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFCLINOM", "", !(GXutil.strcmp("", AV28TFCliNom)==0), (short)(0), AV28TFCliNom, "", !(GXutil.strcmp("", AV29TFCliNom_Sel)==0), AV29TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORSER", "", !(GXutil.strcmp("", AV30TFForSer)==0), (short)(0), AV30TFForSer, "", !(GXutil.strcmp("", AV31TFForSer_Sel)==0), AV31TFForSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORSERDSC", "", !(GXutil.strcmp("", AV32TFForSerDsc)==0), (short)(0), AV32TFForSerDsc, "", !(GXutil.strcmp("", AV33TFForSerDsc_Sel)==0), AV33TFForSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORTIPARTDSC", "", !(GXutil.strcmp("", AV110TFForTipArtDsc)==0), (short)(0), AV110TFForTipArtDsc, "", !(GXutil.strcmp("", AV111TFForTipArtDsc_Sel)==0), AV111TFForTipArtDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV34TFForColNom)==0), (short)(0), AV34TFForColNom, "", !(GXutil.strcmp("", AV35TFForColNom_Sel)==0), AV35TFForColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORNOMCLI", "", !(GXutil.strcmp("", AV64TFForNomCli)==0), (short)(0), AV64TFForNomCli, "", !(GXutil.strcmp("", AV65TFForNomCli_Sel)==0), AV65TFForNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFTIPCOLCOD", "", !((0==AV38TFTipColCod)&&(0==AV39TFTipColCod_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFTipColCod, 2, 0)), GXutil.trim( GXutil.str( AV39TFTipColCod_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFTIPCOLDSC", "", !(GXutil.strcmp("", AV40TFTipColDsc)==0), (short)(0), AV40TFTipColDsc, "", !(GXutil.strcmp("", AV41TFTipColDsc_Sel)==0), AV41TFTipColDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORULTUTI", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86TFForUltUti))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87TFForUltUti_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV86TFForUltUti, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV87TFForUltUti_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORNUMCOL", "", !((0==AV90TFForNumCol)&&(0==AV91TFForNumCol_To)), (short)(0), GXutil.trim( GXutil.str( AV90TFForNumCol, 8, 0)), GXutil.trim( GXutil.str( AV91TFForNumCol_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORTONAL", "", !(GXutil.strcmp("", AV112TFForTonal)==0), (short)(0), AV112TFForTonal, "", !(GXutil.strcmp("", AV113TFForTonal_Sel)==0), AV113TFForTonal_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORRELBAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFForRelBan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV93TFForRelBan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV92TFForRelBan, 7, 2)), GXutil.trim( GXutil.str( AV93TFForRelBan_To, 7, 2))) ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFOROPCCLI", "", !(GXutil.strcmp("", AV115TFForOpcCli)==0), (short)(0), AV115TFForOpcCli, "", !(GXutil.strcmp("", AV116TFForOpcCli_Sel)==0), AV116TFForOpcCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFINTDSC", "", !(GXutil.strcmp("", AV44TFIntDsc)==0), (short)(0), AV44TFIntDsc, "", !(GXutil.strcmp("", AV45TFIntDsc_Sel)==0), AV45TFIntDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORPRO_SEL", "", !(GXutil.strcmp("", AV117TFForPro_Sel)==0), (short)(0), AV117TFForPro_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      GXv_SdtWWPGridState46[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState46, "TFFORBLO_SEL", "", !(AV137TFForBlo_Sels.size()==0), (short)(0), AV137TFForBlo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState46[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV142Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV142Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.MtoFormulasTinte" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S132( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H01BC4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H01BC4_A10045CliAct[0] ;
         A13735CliCNom = H01BC4_A13735CliCNom[0] ;
         A252CliCod = H01BC4_A252CliCod[0] ;
         A279CliNom = H01BC4_A279CliNom[0] ;
         AV130Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV130Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV130Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV131CliCodto_Data.add(AV130Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clicodto_Selectedvalue_set = ((0==AV128CliCodto) ? "" : GXutil.trim( GXutil.str( AV128CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODFORM' Routine */
      returnInSub = false ;
      /* Using cursor H01BC5 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10045CliAct = H01BC5_A10045CliAct[0] ;
         A13735CliCNom = H01BC5_A13735CliCNom[0] ;
         A252CliCod = H01BC5_A252CliCod[0] ;
         A279CliNom = H01BC5_A279CliNom[0] ;
         AV130Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV130Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV130Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV129CliCodform_Data.add(AV130Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_clicodform_Selectedvalue_set = ((0==AV127CliCodform) ? "" : GXutil.trim( GXutil.str( AV127CliCodform, 6, 0))) ;
      ucCombo_clicodform.sendProperty(context, "", false, Combo_clicodform_Internalname, "SelectedValue_set", Combo_clicodform_Selectedvalue_set);
   }

   public void e291BC2( )
   {
      /* Listado_Click Routine */
      returnInSub = false ;
      if ( AV118Num_hdrs > 0 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.pcolhdre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A494ForSer)),GXutil.URLEncode(GXutil.rtrim(A482ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(A483ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(A831TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV118Num_hdrs,4,0))}, new String[] {"EmprCod","Clicod","Forser","Forcolnom","Forcolnum","Tipcolcod","Num_hdrs"}) , new Object[] {"A396EmprCod","A252CliCod","A494ForSer","A482ForColNom","A483ForColNum","A831TipColCod","AV118Num_hdrs"});
      }
      /*  Sending Event outputs  */
   }

   public void e211BC2( )
   {
      /* Forfec_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV132FilterMtoFormulasTinteWW", AV132FilterMtoFormulasTinteWW);
   }

   public void e221BC2( )
   {
      /* Forfecto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV132FilterMtoFormulasTinteWW", AV132FilterMtoFormulasTinteWW);
   }

   public void e231BC2( )
   {
      /* Forcolnum_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV134ForColNum > 0 )
      {
         AV126ForFec = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126ForFec", localUtil.format(AV126ForFec, "99/99/99"));
         AV138ForFecto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138ForFecto", localUtil.format(AV138ForFecto, "99/99/99"));
         AV127CliCodform = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127CliCodform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127CliCodform), 6, 0));
         AV128CliCodto = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV128CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128CliCodto), 6, 0));
         Combo_clicodform_Selectedvalue_set = GXutil.trim( GXutil.str( AV127CliCodform, 6, 0)) ;
         ucCombo_clicodform.sendProperty(context, "", false, Combo_clicodform_Internalname, "SelectedValue_set", Combo_clicodform_Selectedvalue_set);
         Combo_clicodto_Selectedvalue_set = GXutil.trim( GXutil.str( AV127CliCodform, 6, 0)) ;
         ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
      }
      else
      {
         AV126ForFec = GXutil.dadd(GXutil.serverDate( context, remoteHandle, pr_default),-(180)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126ForFec", localUtil.format(AV126ForFec, "99/99/99"));
         AV138ForFecto = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138ForFecto", localUtil.format(AV138ForFecto, "99/99/99"));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV132FilterMtoFormulasTinteWW", AV132FilterMtoFormulasTinteWW);
   }

   public void e241BC2( )
   {
      /* Forcolnom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S332 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV132FilterMtoFormulasTinteWW", AV132FilterMtoFormulasTinteWW);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV132FilterMtoFormulasTinteWW.fromJSonString(AV133WebSession.getValue(httpContext.getMessage( "FilterMtoFormulasTinteWW", "")), null);
      AV127CliCodform = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Clicodform() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127CliCodform", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127CliCodform), 6, 0));
      AV128CliCodto = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Clicodto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128CliCodto), 6, 0));
      AV126ForFec = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forfec() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126ForFec", localUtil.format(AV126ForFec, "99/99/99"));
      AV138ForFecto = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138ForFecto", localUtil.format(AV138ForFecto, "99/99/99"));
      AV134ForColNum = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forcolnum() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV134ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV134ForColNum), 6, 0));
      AV135ForColNom = AV132FilterMtoFormulasTinteWW.getgxTv_SdtFilterMtoFormulasTinteWW_Forcolnom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV135ForColNom", AV135ForColNom);
   }

   public void S332( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV132FilterMtoFormulasTinteWW.setgxTv_SdtFilterMtoFormulasTinteWW_Clicodform( AV127CliCodform );
      AV132FilterMtoFormulasTinteWW.setgxTv_SdtFilterMtoFormulasTinteWW_Clicodto( AV128CliCodto );
      AV132FilterMtoFormulasTinteWW.setgxTv_SdtFilterMtoFormulasTinteWW_Forfec( AV126ForFec );
      AV132FilterMtoFormulasTinteWW.setgxTv_SdtFilterMtoFormulasTinteWW_Forfec_to( AV138ForFecto );
      AV132FilterMtoFormulasTinteWW.setgxTv_SdtFilterMtoFormulasTinteWW_Forcolnum( AV134ForColNum );
      AV132FilterMtoFormulasTinteWW.setgxTv_SdtFilterMtoFormulasTinteWW_Forcolnom( AV135ForColNom );
      AV133WebSession.setValue(httpContext.getMessage( "FilterMtoFormulasTinteWW", ""), AV132FilterMtoFormulasTinteWW.toJSonString(false, true));
   }

   public void wb_table2_135_1BC2( boolean wbgen )
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
         wb_table2_135_1BC2e( true) ;
      }
      else
      {
         wb_table2_135_1BC2e( false) ;
      }
   }

   public void wb_table1_23_1BC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellMarginTop'>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_80_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\MtoFormulasTinteWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1BC2e( true) ;
      }
      else
      {
         wb_table1_23_1BC2e( false) ;
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
      pa1BC2( ) ;
      ws1BC2( ) ;
      we1BC2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026921054228", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/mtoformulastinteww.js", "?2026921054229", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_802( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_80_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_80_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_80_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_80_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_80_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_80_idx ;
      edtForTipArtD_Internalname = "FORTIPARTD_"+sGXsfl_80_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_80_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_80_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_80_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_80_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_80_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_80_idx ;
      edtForUltUti_Internalname = "FORULTUTI_"+sGXsfl_80_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_80_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_80_idx ;
      edtForRelBan_Internalname = "FORRELBAN_"+sGXsfl_80_idx ;
      edtForOpcCli_Internalname = "FOROPCCLI_"+sGXsfl_80_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_80_idx ;
      chkForPro.setInternalname( "FORPRO_"+sGXsfl_80_idx );
      cmbForBlo.setInternalname( "FORBLO_"+sGXsfl_80_idx );
      edtavNum_hdrs_Internalname = "vNUM_HDRS_"+sGXsfl_80_idx ;
      edtavListado_Internalname = "vLISTADO_"+sGXsfl_80_idx ;
      edtavNum_hdrsh_Internalname = "vNUM_HDRSH_"+sGXsfl_80_idx ;
      edtavListadoh_Internalname = "vLISTADOH_"+sGXsfl_80_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_80_idx ;
      edtavVar_forrgb_Internalname = "vVAR_FORRGB_"+sGXsfl_80_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_80_idx ;
      edtForRGB_Internalname = "FORRGB_"+sGXsfl_80_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_80_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_80_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_80_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_80_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_80_idx ;
   }

   public void subsflControlProps_fel_802( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_80_fel_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_80_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_80_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_80_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_80_fel_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_80_fel_idx ;
      edtForTipArtD_Internalname = "FORTIPARTD_"+sGXsfl_80_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_80_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_80_fel_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_80_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_80_fel_idx ;
      edtTipColDsc_Internalname = "TIPCOLDSC_"+sGXsfl_80_fel_idx ;
      edtForFec_Internalname = "FORFEC_"+sGXsfl_80_fel_idx ;
      edtForUltUti_Internalname = "FORULTUTI_"+sGXsfl_80_fel_idx ;
      edtForNumCol_Internalname = "FORNUMCOL_"+sGXsfl_80_fel_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_80_fel_idx ;
      edtForRelBan_Internalname = "FORRELBAN_"+sGXsfl_80_fel_idx ;
      edtForOpcCli_Internalname = "FOROPCCLI_"+sGXsfl_80_fel_idx ;
      edtIntDsc_Internalname = "INTDSC_"+sGXsfl_80_fel_idx ;
      chkForPro.setInternalname( "FORPRO_"+sGXsfl_80_fel_idx );
      cmbForBlo.setInternalname( "FORBLO_"+sGXsfl_80_fel_idx );
      edtavNum_hdrs_Internalname = "vNUM_HDRS_"+sGXsfl_80_fel_idx ;
      edtavListado_Internalname = "vLISTADO_"+sGXsfl_80_fel_idx ;
      edtavNum_hdrsh_Internalname = "vNUM_HDRSH_"+sGXsfl_80_fel_idx ;
      edtavListadoh_Internalname = "vLISTADOH_"+sGXsfl_80_fel_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_80_fel_idx ;
      edtavVar_forrgb_Internalname = "vVAR_FORRGB_"+sGXsfl_80_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_80_fel_idx ;
      edtForRGB_Internalname = "FORRGB_"+sGXsfl_80_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_80_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_80_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_80_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_80_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_80_fel_idx ;
   }

   public void sendrow_802( )
   {
      subsflControlProps_802( ) ;
      wb1BC0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_80_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_80_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_80_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 81,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_80_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV74GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV74GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV74GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_80_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,81);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV74GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_80_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 82,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV102DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,82);\"" : " "),"'"+""+"'"+",false,"+"'"+"e301bc2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForTipArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTipArtD_Internalname,GXutil.rtrim( A13929ForTipArtD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForTipArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForNomCli_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtForNomCli_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNomCli_Internalname,GXutil.rtrim( A1191ForNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNomCli_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtForNomCli_Forecolor)+";"+((edtForNomCli_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtForNomCli_Backcolor)+";"),ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtForNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipColCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipColDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColDsc_Internalname,GXutil.rtrim( A832TipColDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipColDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForFec_Internalname,localUtil.format(A485ForFec, "99/99/99"),localUtil.format( A485ForFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForUltUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForUltUti_Internalname,localUtil.format(A496ForUltUti, "99/99/99"),localUtil.format( A496ForUltUti, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForUltUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForUltUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForNumCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCol_Internalname,GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486ForNumCol), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForNumCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForTonal_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTonal_Internalname,GXutil.rtrim( A995ForTonal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForTonal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForTonal_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtForRelBan_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForRelBan_Internalname,GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2838ForRelBan, "ZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForRelBan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForRelBan_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtForOpcCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForOpcCli_Internalname,GXutil.rtrim( A3560ForOpcCli),GXutil.rtrim( localUtil.format( A3560ForOpcCli, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForOpcCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtForOpcCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtIntDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtIntDsc_Internalname,GXutil.rtrim( A584IntDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtIntDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtIntDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((chkForPro.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FORPRO_" + sGXsfl_80_idx ;
         chkForPro.setName( GXCCtl );
         chkForPro.setWebtags( "" );
         chkForPro.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkForPro.getInternalname(), "TitleCaption", chkForPro.getCaption(), !bGXsfl_80_Refreshing);
         chkForPro.setCheckedValue( "N" );
         A2749ForPro = ((GXutil.strcmp(GXutil.rtrim( A2749ForPro), "S")==0) ? "S" : "N") ;
         n2749ForPro = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkForPro.getInternalname(),A2749ForPro,"","",Integer.valueOf(chkForPro.getVisible()),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbForBlo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbForBlo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FORBLO_" + sGXsfl_80_idx ;
            cmbForBlo.setName( GXCCtl );
            cmbForBlo.setWebtags( "" );
            cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbForBlo.getItemCount() > 0 )
            {
               A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
               n7781ForBlo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbForBlo,cmbForBlo.getInternalname(),GXutil.rtrim( A7781ForBlo),Integer.valueOf(1),cmbForBlo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbForBlo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbForBlo.setValue( GXutil.rtrim( A7781ForBlo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbForBlo.getInternalname(), "Values", cmbForBlo.ToJavascriptSource(), !bGXsfl_80_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNum_hdrs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNum_hdrs_Enabled!=0)&&(edtavNum_hdrs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNum_hdrs_Internalname,GXutil.ltrim( localUtil.ntoc( AV118Num_hdrs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNum_hdrs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV118Num_hdrs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV118Num_hdrs), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNum_hdrs_Enabled!=0)&&(edtavNum_hdrs_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavNum_hdrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNum_hdrs_Visible),Integer.valueOf(edtavNum_hdrs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((edtavListado_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavListado_Enabled!=0)&&(edtavListado_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'',80)\"" : " ") ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavListado_gximage, "")==0) ? "" : "GX_Image_"+edtavListado_gximage+"_Class") ;
         StyleString = "" ;
         AV119Listado_IsBlob = (boolean)(((GXutil.strcmp("", AV119Listado)==0)&&(GXutil.strcmp("", AV143Listado_GXI)==0))||!(GXutil.strcmp("", AV119Listado)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV119Listado)==0) ? AV143Listado_GXI : httpContext.getResourceRelative(AV119Listado)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavListado_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavListado_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavListado_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVLISTADO.CLICK."+sGXsfl_80_idx+"'",StyleString,ClassString,"WWColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV119Listado_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNum_hdrsh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNum_hdrsh_Enabled!=0)&&(edtavNum_hdrsh_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 104,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNum_hdrsh_Internalname,GXutil.ltrim( localUtil.ntoc( AV124Num_hdrsH, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavNum_hdrsh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV124Num_hdrsH), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNum_hdrsh_Enabled!=0)&&(edtavNum_hdrsh_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavNum_hdrsh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavNum_hdrsh_Visible),Integer.valueOf(edtavNum_hdrsh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((edtavListadoh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavListadoh_Enabled!=0)&&(edtavListadoh_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 105,'',false,'',80)\"" : " ") ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(edtavListadoh_gximage, "")==0) ? "" : "GX_Image_"+edtavListadoh_gximage+"_Class") ;
         StyleString = "" ;
         AV123ListadoH_IsBlob = (boolean)(((GXutil.strcmp("", AV123ListadoH)==0)&&(GXutil.strcmp("", AV144Listadoh_GXI)==0))||!(GXutil.strcmp("", AV123ListadoH)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV123ListadoH)==0) ? AV144Listadoh_GXI : httpContext.getResourceRelative(AV123ListadoH)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavListadoh_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavListadoh_Visible),Integer.valueOf(1),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(7),edtavListadoh_Jsonclick,"'"+""+"'"+",false,"+"'"+"e311bc2_client"+"'",StyleString,ClassString,"WWColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV123ListadoH_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavVar_forrgb_Enabled!=0)&&(edtavVar_forrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 107,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavVar_forrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV122Var_ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavVar_forrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV122Var_ForRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV122Var_ForRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavVar_forrgb_Enabled!=0)&&(edtavVar_forrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,107);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavVar_forrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavVar_forrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV76R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV76R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV76R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4339ForRGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV77G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV77G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV77G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 111,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV78B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV78B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV78B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 112,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV79R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV79R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 113,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV80G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV80G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 114,'',false,'"+sGXsfl_80_idx+"',80)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV81B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1BC2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_80_idx = ((subGrid_Islastpage==1)&&(nGXsfl_80_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_80_idx+1) ;
         sGXsfl_80_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_80_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_802( ) ;
      }
      /* End function sendrow_802 */
   }

   public void startgridcontrol80( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"80\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForTipArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo de Articulo", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Nº Formula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForTonal_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForRelBan_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtForOpcCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtIntDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((chkForPro.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prov?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbForBlo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Bloq?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNum_hdrs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prd.?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ImagePrompt"+" "+((GXutil.strcmp(edtavListado_gximage, "")==0) ? "" : "GX_Image_"+edtavListado_gximage+"_Class")+"\" "+" style=\""+((edtavListado_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNum_hdrsh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hist.?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ImagePrompt"+" "+((GXutil.strcmp(edtavListadoh_gximage, "")==0) ? "" : "GX_Image_"+edtavListadoh_gximage+"_Class")+"\" "+" style=\""+((edtavListadoh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV102DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13929ForTipArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForTipArtD_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A995ForTonal));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForTonal_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForRelBan_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3560ForOpcCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtForOpcCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A584IntDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtIntDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2749ForPro));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( chkForPro.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7781ForBlo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbForBlo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV118Num_hdrs, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV119Listado));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavListado_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV124Num_hdrsH, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrsh_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNum_hdrsh_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV123ListadoH));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavListadoh_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV122Var_ForRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavVar_forrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4339ForRGB, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV77G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV78B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV81B2, (byte)(3), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      divTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      lblTextblockcombo_clicodform_Internalname = "TEXTBLOCKCOMBO_CLICODFORM" ;
      Combo_clicodform_Internalname = "COMBO_CLICODFORM" ;
      divTablesplittedclicodform_Internalname = "TABLESPLITTEDCLICODFORM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      edtavForcolnom_Internalname = "vFORCOLNOM" ;
      edtavForcolnum_Internalname = "vFORCOLNUM" ;
      edtavForfec_Internalname = "vFORFEC" ;
      edtavForfecto_Internalname = "vFORFECTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtForSer_Internalname = "FORSER" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      edtForTipArtD_Internalname = "FORTIPARTD" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtForNomCli_Internalname = "FORNOMCLI" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtTipColDsc_Internalname = "TIPCOLDSC" ;
      edtForFec_Internalname = "FORFEC" ;
      edtForUltUti_Internalname = "FORULTUTI" ;
      edtForNumCol_Internalname = "FORNUMCOL" ;
      edtForTonal_Internalname = "FORTONAL" ;
      edtForRelBan_Internalname = "FORRELBAN" ;
      edtForOpcCli_Internalname = "FOROPCCLI" ;
      edtIntDsc_Internalname = "INTDSC" ;
      chkForPro.setInternalname( "FORPRO" );
      cmbForBlo.setInternalname( "FORBLO" );
      edtavNum_hdrs_Internalname = "vNUM_HDRS" ;
      edtavListado_Internalname = "vLISTADO" ;
      edtavNum_hdrsh_Internalname = "vNUM_HDRSH" ;
      edtavListadoh_Internalname = "vLISTADOH" ;
      edtForNumCli_Internalname = "FORNUMCLI" ;
      edtavVar_forrgb_Internalname = "vVAR_FORRGB" ;
      edtavR_Internalname = "vR" ;
      edtForRGB_Internalname = "FORRGB" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodform_Internalname = "vCLICODFORM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_forultutiauxdate_Internalname = "vDDO_FORULTUTIAUXDATE" ;
      edtavDdo_forultutiauxdateto_Internalname = "vDDO_FORULTUTIAUXDATETO" ;
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
      edtavB2_Visible = 0 ;
      edtavB2_Enabled = 1 ;
      edtavG2_Jsonclick = "" ;
      edtavG2_Visible = 0 ;
      edtavG2_Enabled = 1 ;
      edtavR2_Jsonclick = "" ;
      edtavR2_Visible = 0 ;
      edtavR2_Enabled = 1 ;
      edtavB_Jsonclick = "" ;
      edtavB_Visible = 0 ;
      edtavB_Enabled = 1 ;
      edtavG_Jsonclick = "" ;
      edtavG_Visible = 0 ;
      edtavG_Enabled = 1 ;
      edtForRGB_Jsonclick = "" ;
      edtavR_Jsonclick = "" ;
      edtavR_Visible = 0 ;
      edtavR_Enabled = 1 ;
      edtavVar_forrgb_Jsonclick = "" ;
      edtavVar_forrgb_Visible = 0 ;
      edtavVar_forrgb_Enabled = 1 ;
      edtForNumCli_Jsonclick = "" ;
      edtavListadoh_Jsonclick = "" ;
      edtavListadoh_Enabled = 1 ;
      edtavNum_hdrsh_Jsonclick = "" ;
      edtavNum_hdrsh_Enabled = 1 ;
      edtavListado_Jsonclick = "" ;
      edtavListado_Enabled = 1 ;
      edtavNum_hdrs_Jsonclick = "" ;
      edtavNum_hdrs_Enabled = 1 ;
      cmbForBlo.setJsonclick( "" );
      chkForPro.setCaption( "" );
      edtIntDsc_Jsonclick = "" ;
      edtForOpcCli_Jsonclick = "" ;
      edtForRelBan_Jsonclick = "" ;
      edtForTonal_Jsonclick = "" ;
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
      edtForTipArtD_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavListadoh_Visible = -1 ;
      edtavNum_hdrsh_Visible = -1 ;
      edtavListado_Visible = -1 ;
      edtavNum_hdrs_Visible = -1 ;
      cmbForBlo.setVisible( -1 );
      chkForPro.setVisible( -1 );
      edtIntDsc_Visible = -1 ;
      edtForOpcCli_Visible = -1 ;
      edtForRelBan_Visible = -1 ;
      edtForTonal_Visible = -1 ;
      edtForNumCol_Visible = -1 ;
      edtForUltUti_Visible = -1 ;
      edtForFec_Visible = -1 ;
      edtTipColDsc_Visible = -1 ;
      edtTipColCod_Visible = -1 ;
      edtForNomCli_Visible = -1 ;
      edtForColNum_Visible = -1 ;
      edtForColNom_Visible = -1 ;
      edtForTipArtD_Visible = -1 ;
      edtForSerDsc_Visible = -1 ;
      edtForSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtavListadoh_gximage = "" ;
      edtavListado_gximage = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_forultutiauxdateto_Jsonclick = "" ;
      edtavDdo_forultutiauxdate_Jsonclick = "" ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodform_Jsonclick = "" ;
      edtavClicodform_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      edtavForfecto_Jsonclick = "" ;
      edtavForfecto_Enabled = 1 ;
      edtavForfec_Jsonclick = "" ;
      edtavForfec_Enabled = 1 ;
      edtavForcolnum_Jsonclick = "" ;
      edtavForcolnum_Enabled = 1 ;
      edtavForcolnom_Jsonclick = "" ;
      edtavForcolnom_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la Formula¿" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "FormulacionTinte.MtoFormulasTinteWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||||S:WWP_TSChecked,N:WWP_TSUnChecked|N:N,S:S||||" ;
      Ddo_grid_Allowmultipleselection = "||||||||||||||||||T||||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic||Dynamic||||Dynamic||Dynamic|Dynamic|FixedValues|FixedValues||||" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T||T||T||||T||T|T|T|T||||" ;
      Ddo_grid_Filterisrange = "||||||||T|||T|T||T||||||||" ;
      Ddo_grid_Filtertype = "|Character|Character|Character|Character|Character||Character|Numeric|Character||Date|Numeric|Character|Numeric|Character|Character||||||" ;
      Ddo_grid_Includefilter = "|T|T|T|T|T||T|T|T||T|T|T|T|T|T||||||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T|T|T|T|T|T|T|T|T|T|T|T|T|T||||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5||6|7|8|9|10|11|12|13|14|15|16|17|18|19||||" ;
      Ddo_grid_Columnids = "2:CliCod|3:CliNom|4:ForSer|5:ForSerDsc|6:ForTipArtDsc|7:ForColNom|8:ForColNum|9:ForNomCli|10:TipColCod|11:TipColDsc|12:ForFec|13:ForUltUti|14:ForNumCol|15:ForTonal|16:ForRelBan|17:ForOpcCli|18:IntDsc|19:ForPro|20:ForBlo|21:Num_hdrs|22:Listado|23:Num_hdrsH|24:ListadoH" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodform_Emptyitemtext = "Todos" ;
      Combo_clicodform_Cls = "ExtendedCombo AttributeFL" ;
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
      Form.setCaption( httpContext.getMessage( " Mto Formulas Tinte", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_80_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV74GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV74GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
      }
      GXCCtl = "FORPRO_" + sGXsfl_80_idx ;
      chkForPro.setName( GXCCtl );
      chkForPro.setWebtags( "" );
      chkForPro.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkForPro.getInternalname(), "TitleCaption", chkForPro.getCaption(), !bGXsfl_80_Refreshing);
      chkForPro.setCheckedValue( "N" );
      A2749ForPro = ((GXutil.strcmp(GXutil.rtrim( A2749ForPro), "S")==0) ? "S" : "N") ;
      n2749ForPro = false ;
      GXCCtl = "FORBLO_" + sGXsfl_80_idx ;
      cmbForBlo.setName( GXCCtl );
      cmbForBlo.setWebtags( "" );
      cmbForBlo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbForBlo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbForBlo.getItemCount() > 0 )
      {
         A7781ForBlo = cmbForBlo.getValidValue(A7781ForBlo) ;
         n7781ForBlo = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'edtForOpcCli_Visible',ctrl:'FOROPCCLI',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'chkForPro.getVisible()',ctrl:'FORPRO',prop:'Visible'},{av:'cmbForBlo'},{av:'edtavNum_hdrs_Visible',ctrl:'vNUM_HDRS',prop:'Visible'},{av:'edtavListado_Visible',ctrl:'vLISTADO',prop:'Visible'},{av:'edtavNum_hdrsh_Visible',ctrl:'vNUM_HDRSH',prop:'Visible'},{av:'edtavListadoh_Visible',ctrl:'vLISTADOH',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e141BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e151BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV136TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e271BC2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9'},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV74GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV102DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV118Num_hdrs',fld:'vNUM_HDRS',pic:'ZZZ9'},{av:'AV124Num_hdrsH',fld:'vNUM_HDRSH',pic:'ZZZZZ9',hsh:true},{av:'AV122Var_ForRGB',fld:'vVAR_FORRGB',pic:'ZZZZZZZZZ9'},{av:'AV81B2',fld:'vB2',pic:'ZZ9'},{av:'AV80G2',fld:'vG2',pic:'ZZ9'},{av:'AV79R2',fld:'vR2',pic:'ZZ9'},{av:'AV78B',fld:'vB',pic:'ZZ9'},{av:'AV77G',fld:'vG',pic:'ZZ9'},{av:'AV76R',fld:'vR',pic:'ZZ9'},{av:'edtForNomCli_Backcolor',ctrl:'FORNOMCLI',prop:'Backcolor'},{av:'edtForNomCli_Forecolor',ctrl:'FORNOMCLI',prop:'Forecolor'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e171BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'edtForOpcCli_Visible',ctrl:'FOROPCCLI',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'chkForPro.getVisible()',ctrl:'FORPRO',prop:'Visible'},{av:'cmbForBlo'},{av:'edtavNum_hdrs_Visible',ctrl:'vNUM_HDRS',prop:'Visible'},{av:'edtavListado_Visible',ctrl:'vLISTADO',prop:'Visible'},{av:'edtavNum_hdrsh_Visible',ctrl:'vNUM_HDRSH',prop:'Visible'},{av:'edtavListadoh_Visible',ctrl:'vLISTADOH',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111BC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV136TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV136TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'edtForOpcCli_Visible',ctrl:'FOROPCCLI',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'chkForPro.getVisible()',ctrl:'FORPRO',prop:'Visible'},{av:'cmbForBlo'},{av:'edtavNum_hdrs_Visible',ctrl:'vNUM_HDRS',prop:'Visible'},{av:'edtavListado_Visible',ctrl:'vLISTADO',prop:'Visible'},{av:'edtavNum_hdrsh_Visible',ctrl:'vNUM_HDRSH',prop:'Visible'},{av:'edtavListadoh_Visible',ctrl:'vLISTADOH',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e281BC2',iparms:[{av:'cmbavGridactions'},{av:'AV74GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9'},{av:'AV118Num_hdrs',fld:'vNUM_HDRS',pic:'ZZZ9'},{av:'AV124Num_hdrsH',fld:'vNUM_HDRSH',pic:'ZZZZZ9',hsh:true},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'AV94Station',fld:'vSTATION',pic:''},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'AV109Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV74GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9'},{av:'Dvelop_confirmpanel_eliminar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'ConfirmationText'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9'},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:''},{av:'AV94Station',fld:'vSTATION',pic:''},{av:'AV109Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'edtForOpcCli_Visible',ctrl:'FOROPCCLI',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'chkForPro.getVisible()',ctrl:'FORPRO',prop:'Visible'},{av:'cmbForBlo'},{av:'edtavNum_hdrs_Visible',ctrl:'vNUM_HDRS',prop:'Visible'},{av:'edtavListado_Visible',ctrl:'vLISTADO',prop:'Visible'},{av:'edtavNum_hdrsh_Visible',ctrl:'vNUM_HDRSH',prop:'Visible'},{av:'edtavListadoh_Visible',ctrl:'vLISTADOH',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e181BC2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV94Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtForSer_Visible',ctrl:'FORSER',prop:'Visible'},{av:'edtForSerDsc_Visible',ctrl:'FORSERDSC',prop:'Visible'},{av:'edtForTipArtD_Visible',ctrl:'FORTIPARTD',prop:'Visible'},{av:'edtForColNom_Visible',ctrl:'FORCOLNOM',prop:'Visible'},{av:'edtForColNum_Visible',ctrl:'FORCOLNUM',prop:'Visible'},{av:'edtForNomCli_Visible',ctrl:'FORNOMCLI',prop:'Visible'},{av:'edtTipColCod_Visible',ctrl:'TIPCOLCOD',prop:'Visible'},{av:'edtTipColDsc_Visible',ctrl:'TIPCOLDSC',prop:'Visible'},{av:'edtForFec_Visible',ctrl:'FORFEC',prop:'Visible'},{av:'edtForUltUti_Visible',ctrl:'FORULTUTI',prop:'Visible'},{av:'edtForNumCol_Visible',ctrl:'FORNUMCOL',prop:'Visible'},{av:'edtForTonal_Visible',ctrl:'FORTONAL',prop:'Visible'},{av:'edtForRelBan_Visible',ctrl:'FORRELBAN',prop:'Visible'},{av:'edtForOpcCli_Visible',ctrl:'FOROPCCLI',prop:'Visible'},{av:'edtIntDsc_Visible',ctrl:'INTDSC',prop:'Visible'},{av:'chkForPro.getVisible()',ctrl:'FORPRO',prop:'Visible'},{av:'cmbForBlo'},{av:'edtavNum_hdrs_Visible',ctrl:'vNUM_HDRS',prop:'Visible'},{av:'edtavListado_Visible',ctrl:'vLISTADO',prop:'Visible'},{av:'edtavNum_hdrsh_Visible',ctrl:'vNUM_HDRSH',prop:'Visible'},{av:'edtavListadoh_Visible',ctrl:'vLISTADOH',prop:'Visible'},{av:'AV72GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV73GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e191BC2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'A4339ForRGB',fld:'FORRGB',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e201BC2',iparms:[{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV136TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV29TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFForSer',fld:'vTFFORSER',pic:''},{av:'AV31TFForSer_Sel',fld:'vTFFORSER_SEL',pic:''},{av:'AV32TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV33TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV110TFForTipArtDsc',fld:'vTFFORTIPARTDSC',pic:''},{av:'AV111TFForTipArtDsc_Sel',fld:'vTFFORTIPARTDSC_SEL',pic:''},{av:'AV34TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV35TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV64TFForNomCli',fld:'vTFFORNOMCLI',pic:''},{av:'AV65TFForNomCli_Sel',fld:'vTFFORNOMCLI_SEL',pic:''},{av:'AV38TFTipColCod',fld:'vTFTIPCOLCOD',pic:'Z9'},{av:'AV39TFTipColCod_To',fld:'vTFTIPCOLCOD_TO',pic:'Z9'},{av:'AV40TFTipColDsc',fld:'vTFTIPCOLDSC',pic:''},{av:'AV41TFTipColDsc_Sel',fld:'vTFTIPCOLDSC_SEL',pic:''},{av:'AV86TFForUltUti',fld:'vTFFORULTUTI',pic:''},{av:'AV87TFForUltUti_To',fld:'vTFFORULTUTI_TO',pic:''},{av:'AV90TFForNumCol',fld:'vTFFORNUMCOL',pic:'ZZZZZZZ9'},{av:'AV91TFForNumCol_To',fld:'vTFFORNUMCOL_TO',pic:'ZZZZZZZ9'},{av:'AV112TFForTonal',fld:'vTFFORTONAL',pic:''},{av:'AV113TFForTonal_Sel',fld:'vTFFORTONAL_SEL',pic:''},{av:'AV92TFForRelBan',fld:'vTFFORRELBAN',pic:'ZZZ9.99'},{av:'AV93TFForRelBan_To',fld:'vTFFORRELBAN_TO',pic:'ZZZ9.99'},{av:'AV115TFForOpcCli',fld:'vTFFOROPCCLI',pic:'@!'},{av:'AV116TFForOpcCli_Sel',fld:'vTFFOROPCCLI_SEL',pic:'@!'},{av:'AV44TFIntDsc',fld:'vTFINTDSC',pic:''},{av:'AV45TFIntDsc_Sel',fld:'vTFINTDSC_SEL',pic:''},{av:'AV117TFForPro_Sel',fld:'vTFFORPRO_SEL',pic:''},{av:'AV137TFForBlo_Sels',fld:'vTFFORBLO_SELS',pic:''},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV119Listado',fld:'vLISTADO',pic:''},{av:'AV123ListadoH',fld:'vLISTADOH',pic:''},{av:'AV100SiRGB',fld:'vSIRGB',pic:'ZZZ9',hsh:true},{av:'AV105FlagModa21',fld:'vFLAGMODA21',pic:'ZZZ9',hsh:true},{av:'AV107Rfo0002',fld:'vRFO0002',pic:'ZZZ9',hsh:true},{av:'AV108Vfo0002',fld:'vVFO0002',pic:'ZZZ9',hsh:true},{av:'AV96UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV136TFForBlo_SelsJson',fld:'vTFFORBLO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e301BC2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e131BC2',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''}]}");
      setEventMetadata("COMBO_CLICODFORM.ONOPTIONCLICKED","{handler:'e121BC2',iparms:[{av:'Combo_clicodform_Selectedvalue_get',ctrl:'COMBO_CLICODFORM',prop:'SelectedValue_get'},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''}]");
      setEventMetadata("COMBO_CLICODFORM.ONOPTIONCLICKED",",oparms:[{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''}]}");
      setEventMetadata("VLISTADO.CLICK","{handler:'e291BC2',iparms:[{av:'AV118Num_hdrs',fld:'vNUM_HDRS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("VLISTADO.CLICK",",oparms:[{av:'AV118Num_hdrs',fld:'vNUM_HDRS',pic:'ZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VLISTADOH.CLICK","{handler:'e311BC2',iparms:[{av:'AV124Num_hdrsH',fld:'vNUM_HDRSH',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("VLISTADOH.CLICK",",oparms:[]}");
      setEventMetadata("VFORFEC.CONTROLVALUECHANGED","{handler:'e211BC2',iparms:[{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''}]");
      setEventMetadata("VFORFEC.CONTROLVALUECHANGED",",oparms:[{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''}]}");
      setEventMetadata("VFORFECTO.CONTROLVALUECHANGED","{handler:'e221BC2',iparms:[{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''}]");
      setEventMetadata("VFORFECTO.CONTROLVALUECHANGED",",oparms:[{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''}]}");
      setEventMetadata("VFORCOLNUM.CONTROLVALUECHANGED","{handler:'e231BC2',iparms:[{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''}]");
      setEventMetadata("VFORCOLNUM.CONTROLVALUECHANGED",",oparms:[{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'Combo_clicodform_Selectedvalue_set',ctrl:'COMBO_CLICODFORM',prop:'SelectedValue_set'},{av:'Combo_clicodto_Selectedvalue_set',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_set'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''}]}");
      setEventMetadata("VFORCOLNOM.CONTROLVALUECHANGED","{handler:'e241BC2',iparms:[{av:'AV127CliCodform',fld:'vCLICODFORM',pic:'ZZZZZ9'},{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''},{av:'AV128CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV126ForFec',fld:'vFORFEC',pic:''},{av:'AV138ForFecto',fld:'vFORFECTO',pic:''},{av:'AV134ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV135ForColNom',fld:'vFORCOLNOM',pic:''}]");
      setEventMetadata("VFORCOLNOM.CONTROLVALUECHANGED",",oparms:[{av:'AV132FilterMtoFormulasTinteWW',fld:'vFILTERMTOFORMULASTINTEWW',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORSERDSC","{handler:'valid_Forserdsc',iparms:[]");
      setEventMetadata("VALID_FORSERDSC",",oparms:[]}");
      setEventMetadata("VALID_FORTIPARTD","{handler:'valid_Fortipartd',iparms:[]");
      setEventMetadata("VALID_FORTIPARTD",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_FORNOMCLI","{handler:'valid_Fornomcli',iparms:[]");
      setEventMetadata("VALID_FORNOMCLI",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLDSC","{handler:'valid_Tipcoldsc',iparms:[]");
      setEventMetadata("VALID_TIPCOLDSC",",oparms:[]}");
      setEventMetadata("VALID_FORNUMCOL","{handler:'valid_Fornumcol',iparms:[]");
      setEventMetadata("VALID_FORNUMCOL",",oparms:[]}");
      setEventMetadata("VALID_FORTONAL","{handler:'valid_Fortonal',iparms:[]");
      setEventMetadata("VALID_FORTONAL",",oparms:[]}");
      setEventMetadata("VALID_FORRELBAN","{handler:'valid_Forrelban',iparms:[]");
      setEventMetadata("VALID_FORRELBAN",",oparms:[]}");
      setEventMetadata("VALID_FOROPCCLI","{handler:'valid_Foropccli',iparms:[]");
      setEventMetadata("VALID_FOROPCCLI",",oparms:[]}");
      setEventMetadata("VALID_INTDSC","{handler:'valid_Intdsc',iparms:[]");
      setEventMetadata("VALID_INTDSC",",oparms:[]}");
      setEventMetadata("VALID_FORBLO","{handler:'valid_Forblo',iparms:[]");
      setEventMetadata("VALID_FORBLO",",oparms:[]}");
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
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodform_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV119Listado = "" ;
      AV123ListadoH = "" ;
      AV135ForColNom = "" ;
      AV126ForFec = GXutil.nullDate() ;
      AV138ForFecto = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV28TFCliNom = "" ;
      AV29TFCliNom_Sel = "" ;
      AV30TFForSer = "" ;
      AV31TFForSer_Sel = "" ;
      AV32TFForSerDsc = "" ;
      AV33TFForSerDsc_Sel = "" ;
      AV110TFForTipArtDsc = "" ;
      AV111TFForTipArtDsc_Sel = "" ;
      AV34TFForColNom = "" ;
      AV35TFForColNom_Sel = "" ;
      AV64TFForNomCli = "" ;
      AV65TFForNomCli_Sel = "" ;
      AV40TFTipColDsc = "" ;
      AV41TFTipColDsc_Sel = "" ;
      AV86TFForUltUti = GXutil.nullDate() ;
      AV87TFForUltUti_To = GXutil.nullDate() ;
      AV112TFForTonal = "" ;
      AV113TFForTonal_Sel = "" ;
      AV92TFForRelBan = DecimalUtil.ZERO ;
      AV93TFForRelBan_To = DecimalUtil.ZERO ;
      AV115TFForOpcCli = "" ;
      AV116TFForOpcCli_Sel = "" ;
      AV44TFIntDsc = "" ;
      AV45TFIntDsc_Sel = "" ;
      AV117TFForPro_Sel = "" ;
      AV137TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV142Pgmname = "" ;
      AV96UsurCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV129CliCodform_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV131CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV70DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV136TFForBlo_SelsJson = "" ;
      AV94Station = "" ;
      AV109Valor_cor = DecimalUtil.ZERO ;
      AV132FilterMtoFormulasTinteWW = new app.SdtFilterMtoFormulasTinteWW(remoteHandle, context);
      Combo_clicodform_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodform_Jsonclick = "" ;
      ucCombo_clicodform = new com.genexus.webpanels.GXUserControl();
      Combo_clicodform_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV88DDO_ForUltUtiAuxDate = GXutil.nullDate() ;
      AV89DDO_ForUltUtiAuxDateTo = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV102DetailWebComponent = "" ;
      A279CliNom = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A13929ForTipArtD = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A832TipColDsc = "" ;
      A485ForFec = GXutil.nullDate() ;
      A496ForUltUti = GXutil.nullDate() ;
      A995ForTonal = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      A3560ForOpcCli = "" ;
      A584IntDsc = "" ;
      A2749ForPro = "" ;
      A7781ForBlo = "" ;
      AV143Listado_GXI = "" ;
      AV144Listadoh_GXI = "" ;
      AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext = "" ;
      AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = "" ;
      AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel = "" ;
      AV148Formulaciontinte_mtoformulastintewwds_4_tfforser = "" ;
      AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel = "" ;
      AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = "" ;
      AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel = "" ;
      AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = "" ;
      AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel = "" ;
      AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = "" ;
      AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel = "" ;
      AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = "" ;
      AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel = "" ;
      AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = "" ;
      AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel = "" ;
      AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti = GXutil.nullDate() ;
      AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to = GXutil.nullDate() ;
      AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = "" ;
      AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel = "" ;
      AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban = DecimalUtil.ZERO ;
      AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to = DecimalUtil.ZERO ;
      AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = "" ;
      AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel = "" ;
      AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = "" ;
      AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel = "" ;
      AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel = "" ;
      AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc = "" ;
      lV146Formulaciontinte_mtoformulastintewwds_2_tfclinom = "" ;
      lV148Formulaciontinte_mtoformulastintewwds_4_tfforser = "" ;
      lV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc = "" ;
      lV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom = "" ;
      lV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli = "" ;
      lV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc = "" ;
      lV166Formulaciontinte_mtoformulastintewwds_22_tffortonal = "" ;
      lV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli = "" ;
      lV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc = "" ;
      A10045CliAct = "" ;
      H01BC2_A829TipArtCod = new short[1] ;
      H01BC2_A583IntCod = new byte[1] ;
      H01BC2_A4384ForTipArt = new short[1] ;
      H01BC2_n4384ForTipArt = new boolean[] {false} ;
      H01BC2_A396EmprCod = new String[] {""} ;
      H01BC2_A10045CliAct = new String[] {""} ;
      H01BC2_A4339ForRGB = new long[1] ;
      H01BC2_n4339ForRGB = new boolean[] {false} ;
      H01BC2_A1192ForNumCli = new int[1] ;
      H01BC2_n1192ForNumCli = new boolean[] {false} ;
      H01BC2_A7781ForBlo = new String[] {""} ;
      H01BC2_n7781ForBlo = new boolean[] {false} ;
      H01BC2_A2749ForPro = new String[] {""} ;
      H01BC2_n2749ForPro = new boolean[] {false} ;
      H01BC2_A584IntDsc = new String[] {""} ;
      H01BC2_n584IntDsc = new boolean[] {false} ;
      H01BC2_A3560ForOpcCli = new String[] {""} ;
      H01BC2_n3560ForOpcCli = new boolean[] {false} ;
      H01BC2_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BC2_n2838ForRelBan = new boolean[] {false} ;
      H01BC2_A995ForTonal = new String[] {""} ;
      H01BC2_n995ForTonal = new boolean[] {false} ;
      H01BC2_A486ForNumCol = new int[1] ;
      H01BC2_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      H01BC2_n496ForUltUti = new boolean[] {false} ;
      H01BC2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01BC2_n485ForFec = new boolean[] {false} ;
      H01BC2_A832TipColDsc = new String[] {""} ;
      H01BC2_n832TipColDsc = new boolean[] {false} ;
      H01BC2_A831TipColCod = new byte[1] ;
      H01BC2_A1191ForNomCli = new String[] {""} ;
      H01BC2_n1191ForNomCli = new boolean[] {false} ;
      H01BC2_A483ForColNum = new int[1] ;
      H01BC2_A482ForColNom = new String[] {""} ;
      H01BC2_A5742ForSerDsc = new String[] {""} ;
      H01BC2_n5742ForSerDsc = new boolean[] {false} ;
      H01BC2_A494ForSer = new String[] {""} ;
      H01BC2_A279CliNom = new String[] {""} ;
      H01BC2_A252CliCod = new int[1] ;
      H01BC2_A13929ForTipArtD = new String[] {""} ;
      H01BC2_n13929ForTipArtD = new boolean[] {false} ;
      H01BC3_A829TipArtCod = new short[1] ;
      H01BC3_A583IntCod = new byte[1] ;
      H01BC3_A4384ForTipArt = new short[1] ;
      H01BC3_n4384ForTipArt = new boolean[] {false} ;
      H01BC3_A396EmprCod = new String[] {""} ;
      H01BC3_A10045CliAct = new String[] {""} ;
      H01BC3_A4339ForRGB = new long[1] ;
      H01BC3_n4339ForRGB = new boolean[] {false} ;
      H01BC3_A1192ForNumCli = new int[1] ;
      H01BC3_n1192ForNumCli = new boolean[] {false} ;
      H01BC3_A7781ForBlo = new String[] {""} ;
      H01BC3_n7781ForBlo = new boolean[] {false} ;
      H01BC3_A2749ForPro = new String[] {""} ;
      H01BC3_n2749ForPro = new boolean[] {false} ;
      H01BC3_A584IntDsc = new String[] {""} ;
      H01BC3_n584IntDsc = new boolean[] {false} ;
      H01BC3_A3560ForOpcCli = new String[] {""} ;
      H01BC3_n3560ForOpcCli = new boolean[] {false} ;
      H01BC3_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01BC3_n2838ForRelBan = new boolean[] {false} ;
      H01BC3_A995ForTonal = new String[] {""} ;
      H01BC3_n995ForTonal = new boolean[] {false} ;
      H01BC3_A486ForNumCol = new int[1] ;
      H01BC3_A496ForUltUti = new java.util.Date[] {GXutil.nullDate()} ;
      H01BC3_n496ForUltUti = new boolean[] {false} ;
      H01BC3_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01BC3_n485ForFec = new boolean[] {false} ;
      H01BC3_A832TipColDsc = new String[] {""} ;
      H01BC3_n832TipColDsc = new boolean[] {false} ;
      H01BC3_A831TipColCod = new byte[1] ;
      H01BC3_A1191ForNomCli = new String[] {""} ;
      H01BC3_n1191ForNomCli = new boolean[] {false} ;
      H01BC3_A483ForColNum = new int[1] ;
      H01BC3_A482ForColNom = new String[] {""} ;
      H01BC3_A5742ForSerDsc = new String[] {""} ;
      H01BC3_n5742ForSerDsc = new boolean[] {false} ;
      H01BC3_A494ForSer = new String[] {""} ;
      H01BC3_A279CliNom = new String[] {""} ;
      H01BC3_A252CliCod = new int[1] ;
      H01BC3_A13929ForTipArtD = new String[] {""} ;
      H01BC3_n13929ForTipArtD = new boolean[] {false} ;
      hsh = "" ;
      AV95EmprNom = "" ;
      AV125EmprCod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector21 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23 = new GXBaseCollection[1] ;
      Gx_msg = "" ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      AV177Emprcod_selected = "" ;
      AV179Forser_selected = "" ;
      AV180Forcolnom_selected = "" ;
      AV101IncObs = "" ;
      GXv_int13 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char27 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char44 = "" ;
      GXv_char45 = new String[1] ;
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
      GXt_char29 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState46 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      H01BC4_A396EmprCod = new String[] {""} ;
      H01BC4_A10045CliAct = new String[] {""} ;
      H01BC4_A13735CliCNom = new String[] {""} ;
      H01BC4_A252CliCod = new int[1] ;
      H01BC4_A279CliNom = new String[] {""} ;
      A13735CliCNom = "" ;
      AV130Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01BC5_A396EmprCod = new String[] {""} ;
      H01BC5_A10045CliAct = new String[] {""} ;
      H01BC5_A13735CliCNom = new String[] {""} ;
      H01BC5_A252CliCod = new int[1] ;
      H01BC5_A279CliNom = new String[] {""} ;
      AV133WebSession = httpContext.getWebSession();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtoformulastinteww__default(),
         new Object[] {
             new Object[] {
            H01BC2_A829TipArtCod, H01BC2_A583IntCod, H01BC2_A4384ForTipArt, H01BC2_n4384ForTipArt, H01BC2_A396EmprCod, H01BC2_A10045CliAct, H01BC2_A4339ForRGB, H01BC2_n4339ForRGB, H01BC2_A1192ForNumCli, H01BC2_n1192ForNumCli,
            H01BC2_A7781ForBlo, H01BC2_n7781ForBlo, H01BC2_A2749ForPro, H01BC2_n2749ForPro, H01BC2_A584IntDsc, H01BC2_n584IntDsc, H01BC2_A3560ForOpcCli, H01BC2_n3560ForOpcCli, H01BC2_A2838ForRelBan, H01BC2_n2838ForRelBan,
            H01BC2_A995ForTonal, H01BC2_n995ForTonal, H01BC2_A486ForNumCol, H01BC2_A496ForUltUti, H01BC2_n496ForUltUti, H01BC2_A485ForFec, H01BC2_n485ForFec, H01BC2_A832TipColDsc, H01BC2_n832TipColDsc, H01BC2_A831TipColCod,
            H01BC2_A1191ForNomCli, H01BC2_n1191ForNomCli, H01BC2_A483ForColNum, H01BC2_A482ForColNom, H01BC2_A5742ForSerDsc, H01BC2_n5742ForSerDsc, H01BC2_A494ForSer, H01BC2_A279CliNom, H01BC2_A252CliCod, H01BC2_A13929ForTipArtD,
            H01BC2_n13929ForTipArtD
            }
            , new Object[] {
            H01BC3_A829TipArtCod, H01BC3_A583IntCod, H01BC3_A4384ForTipArt, H01BC3_n4384ForTipArt, H01BC3_A396EmprCod, H01BC3_A10045CliAct, H01BC3_A4339ForRGB, H01BC3_n4339ForRGB, H01BC3_A1192ForNumCli, H01BC3_n1192ForNumCli,
            H01BC3_A7781ForBlo, H01BC3_n7781ForBlo, H01BC3_A2749ForPro, H01BC3_n2749ForPro, H01BC3_A584IntDsc, H01BC3_n584IntDsc, H01BC3_A3560ForOpcCli, H01BC3_n3560ForOpcCli, H01BC3_A2838ForRelBan, H01BC3_n2838ForRelBan,
            H01BC3_A995ForTonal, H01BC3_n995ForTonal, H01BC3_A486ForNumCol, H01BC3_A496ForUltUti, H01BC3_n496ForUltUti, H01BC3_A485ForFec, H01BC3_n485ForFec, H01BC3_A832TipColDsc, H01BC3_n832TipColDsc, H01BC3_A831TipColCod,
            H01BC3_A1191ForNomCli, H01BC3_n1191ForNomCli, H01BC3_A483ForColNum, H01BC3_A482ForColNom, H01BC3_A5742ForSerDsc, H01BC3_n5742ForSerDsc, H01BC3_A494ForSer, H01BC3_A279CliNom, H01BC3_A252CliCod, H01BC3_A13929ForTipArtD,
            H01BC3_n13929ForTipArtD
            }
            , new Object[] {
            H01BC4_A396EmprCod, H01BC4_A10045CliAct, H01BC4_A13735CliCNom, H01BC4_A252CliCod, H01BC4_A279CliNom
            }
            , new Object[] {
            H01BC5_A396EmprCod, H01BC5_A10045CliAct, H01BC5_A13735CliCNom, H01BC5_A252CliCod, H01BC5_A279CliNom
            }
         }
      );
      AV142Pgmname = "FormulacionTinte.MtoFormulasTinteWW" ;
      /* GeneXus formulas. */
      AV142Pgmname = "FormulacionTinte.MtoFormulasTinteWW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavNum_hdrs_Enabled = 0 ;
      edtavNum_hdrsh_Enabled = 0 ;
      edtavVar_forrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV38TFTipColCod ;
   private byte AV39TFTipColCod_To ;
   private byte gxajaxcallmode ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ;
   private byte AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ;
   private byte A583IntCod ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte AV182Tipcolcod_selected ;
   private byte GXv_int6[] ;
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
   private short AV12OrderedBy ;
   private short AV100SiRGB ;
   private short AV105FlagModa21 ;
   private short AV107Rfo0002 ;
   private short AV108Vfo0002 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV74GridActions ;
   private short AV118Num_hdrs ;
   private short AV76R ;
   private short AV77G ;
   private short AV78B ;
   private short AV79R2 ;
   private short AV80G2 ;
   private short AV81B2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A4384ForTipArt ;
   private short AV106carvitin ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private short GXv_int16[] ;
   private short GXv_int17[] ;
   private short GXv_int18[] ;
   private short GXv_int19[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_80 ;
   private int nGXsfl_80_idx=1 ;
   private int AV134ForColNum ;
   private int AV127CliCodform ;
   private int AV128CliCodto ;
   private int AV90TFForNumCol ;
   private int AV91TFForNumCol_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavForcolnom_Enabled ;
   private int edtavForcolnum_Enabled ;
   private int edtavForfec_Enabled ;
   private int edtavForfecto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavClicodform_Visible ;
   private int edtavClicodto_Visible ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV124Num_hdrsH ;
   private int A1192ForNumCli ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavNum_hdrs_Enabled ;
   private int edtavNum_hdrsh_Enabled ;
   private int edtavVar_forrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol ;
   private int AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ;
   private int AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtForSer_Visible ;
   private int edtForSerDsc_Visible ;
   private int edtForTipArtD_Visible ;
   private int edtForColNom_Visible ;
   private int edtForColNum_Visible ;
   private int edtForNomCli_Visible ;
   private int edtTipColCod_Visible ;
   private int edtTipColDsc_Visible ;
   private int edtForFec_Visible ;
   private int edtForUltUti_Visible ;
   private int edtForNumCol_Visible ;
   private int edtForTonal_Visible ;
   private int edtForRelBan_Visible ;
   private int edtForOpcCli_Visible ;
   private int edtIntDsc_Visible ;
   private int edtavNum_hdrs_Visible ;
   private int edtavListado_Visible ;
   private int edtavNum_hdrsh_Visible ;
   private int edtavListadoh_Visible ;
   private int AV71PageToGo ;
   private int GXt_int7 ;
   private int edtForNomCli_Backcolor ;
   private int edtForNomCli_Forecolor ;
   private int AV178Clicod_selected ;
   private int AV181Forcolnum_selected ;
   private int GXv_int13[] ;
   private int GXv_int12[] ;
   private int GXv_int8[] ;
   private int AV183GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavListado_Enabled ;
   private int edtavListadoh_Enabled ;
   private int edtavVar_forrgb_Visible ;
   private int edtavR_Visible ;
   private int edtavG_Visible ;
   private int edtavB_Visible ;
   private int edtavR2_Visible ;
   private int edtavG2_Visible ;
   private int edtavB2_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV72GridCurrentPage ;
   private long AV73GridPageCount ;
   private long AV122Var_ForRGB ;
   private long A4339ForRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV92TFForRelBan ;
   private java.math.BigDecimal AV93TFForRelBan_To ;
   private java.math.BigDecimal AV109Valor_cor ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban ;
   private java.math.BigDecimal AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodform_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_80_idx="0001" ;
   private String AV135ForColNom ;
   private String A396EmprCod ;
   private String AV28TFCliNom ;
   private String AV29TFCliNom_Sel ;
   private String AV30TFForSer ;
   private String AV31TFForSer_Sel ;
   private String AV32TFForSerDsc ;
   private String AV33TFForSerDsc_Sel ;
   private String AV110TFForTipArtDsc ;
   private String AV111TFForTipArtDsc_Sel ;
   private String AV34TFForColNom ;
   private String AV35TFForColNom_Sel ;
   private String AV64TFForNomCli ;
   private String AV65TFForNomCli_Sel ;
   private String AV40TFTipColDsc ;
   private String AV41TFTipColDsc_Sel ;
   private String AV112TFForTonal ;
   private String AV113TFForTonal_Sel ;
   private String AV115TFForOpcCli ;
   private String AV116TFForOpcCli_Sel ;
   private String AV44TFIntDsc ;
   private String AV45TFIntDsc_Sel ;
   private String AV117TFForPro_Sel ;
   private String AV142Pgmname ;
   private String AV96UsurCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV94Station ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Combo_clicodform_Cls ;
   private String Combo_clicodform_Selectedvalue_set ;
   private String Combo_clicodform_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedclicodform_Internalname ;
   private String lblTextblockcombo_clicodform_Internalname ;
   private String lblTextblockcombo_clicodform_Jsonclick ;
   private String Combo_clicodform_Caption ;
   private String Combo_clicodform_Internalname ;
   private String divTablesplittedclicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Jsonclick ;
   private String Combo_clicodto_Caption ;
   private String Combo_clicodto_Internalname ;
   private String edtavForcolnom_Internalname ;
   private String edtavForcolnom_Jsonclick ;
   private String edtavForcolnum_Internalname ;
   private String edtavForcolnum_Jsonclick ;
   private String edtavForfec_Internalname ;
   private String edtavForfec_Jsonclick ;
   private String edtavForfecto_Internalname ;
   private String edtavForfecto_Jsonclick ;
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
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodform_Internalname ;
   private String edtavClicodform_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_forultutiauxdates_Internalname ;
   private String edtavDdo_forultutiauxdate_Internalname ;
   private String edtavDdo_forultutiauxdate_Jsonclick ;
   private String edtavDdo_forultutiauxdateto_Internalname ;
   private String edtavDdo_forultutiauxdateto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV102DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A13929ForTipArtD ;
   private String edtForTipArtD_Internalname ;
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
   private String A995ForTonal ;
   private String edtForTonal_Internalname ;
   private String edtForRelBan_Internalname ;
   private String A3560ForOpcCli ;
   private String edtForOpcCli_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Internalname ;
   private String A2749ForPro ;
   private String A7781ForBlo ;
   private String edtavNum_hdrs_Internalname ;
   private String edtavListado_Internalname ;
   private String edtavNum_hdrsh_Internalname ;
   private String edtavListadoh_Internalname ;
   private String edtForNumCli_Internalname ;
   private String edtavVar_forrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtForRGB_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom ;
   private String AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ;
   private String AV148Formulaciontinte_mtoformulastintewwds_4_tfforser ;
   private String AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ;
   private String AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ;
   private String AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ;
   private String AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ;
   private String AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ;
   private String AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ;
   private String AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ;
   private String AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli ;
   private String AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ;
   private String AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ;
   private String AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ;
   private String AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal ;
   private String AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ;
   private String AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli ;
   private String AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ;
   private String AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc ;
   private String AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ;
   private String AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ;
   private String scmdbuf ;
   private String lV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ;
   private String lV146Formulaciontinte_mtoformulastintewwds_2_tfclinom ;
   private String lV148Formulaciontinte_mtoformulastintewwds_4_tfforser ;
   private String lV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ;
   private String lV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ;
   private String lV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli ;
   private String lV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ;
   private String lV166Formulaciontinte_mtoformulastintewwds_22_tffortonal ;
   private String lV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli ;
   private String lV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc ;
   private String A10045CliAct ;
   private String hsh ;
   private String AV95EmprNom ;
   private String AV125EmprCod ;
   private String edtavListado_gximage ;
   private String edtavListadoh_gximage ;
   private String Gx_msg ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String AV177Emprcod_selected ;
   private String AV179Forser_selected ;
   private String AV180Forcolnom_selected ;
   private String GXt_char1 ;
   private String GXt_char27 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char44 ;
   private String GXv_char45[] ;
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
   private String GXt_char29 ;
   private String GXv_char25[] ;
   private String GXt_char28 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String divTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_80_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForTipArtD_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtForNomCli_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtTipColDsc_Jsonclick ;
   private String edtForFec_Jsonclick ;
   private String edtForUltUti_Jsonclick ;
   private String edtForNumCol_Jsonclick ;
   private String edtForTonal_Jsonclick ;
   private String edtForRelBan_Jsonclick ;
   private String edtForOpcCli_Jsonclick ;
   private String edtIntDsc_Jsonclick ;
   private String edtavNum_hdrs_Jsonclick ;
   private String sImgUrl ;
   private String edtavListado_Jsonclick ;
   private String edtavNum_hdrsh_Jsonclick ;
   private String edtavListadoh_Jsonclick ;
   private String edtForNumCli_Jsonclick ;
   private String edtavVar_forrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtForRGB_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV126ForFec ;
   private java.util.Date AV138ForFecto ;
   private java.util.Date AV86TFForUltUti ;
   private java.util.Date AV87TFForUltUti_To ;
   private java.util.Date AV88DDO_ForUltUtiAuxDate ;
   private java.util.Date AV89DDO_ForUltUtiAuxDateTo ;
   private java.util.Date A485ForFec ;
   private java.util.Date A496ForUltUti ;
   private java.util.Date AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti ;
   private java.util.Date AV163Formulaciontinte_mtoformulastintewwds_19_tfforultuti_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_80_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5742ForSerDsc ;
   private boolean n13929ForTipArtD ;
   private boolean n1191ForNomCli ;
   private boolean n832TipColDsc ;
   private boolean n485ForFec ;
   private boolean n496ForUltUti ;
   private boolean n995ForTonal ;
   private boolean n2838ForRelBan ;
   private boolean n3560ForOpcCli ;
   private boolean n584IntDsc ;
   private boolean n2749ForPro ;
   private boolean n7781ForBlo ;
   private boolean n1192ForNumCli ;
   private boolean n4339ForRGB ;
   private boolean n4384ForTipArt ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV119Listado_IsBlob ;
   private boolean AV123ListadoH_IsBlob ;
   private String AV136TFForBlo_SelsJson ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV143Listado_GXI ;
   private String AV144Listadoh_GXI ;
   private String AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private String AV101IncObs ;
   private String A13735CliCNom ;
   private String AV119Listado ;
   private String AV123ListadoH ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV133WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodform ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkForPro ;
   private HTMLChoice cmbForBlo ;
   private IDataStoreProvider pr_default ;
   private short[] H01BC2_A829TipArtCod ;
   private byte[] H01BC2_A583IntCod ;
   private short[] H01BC2_A4384ForTipArt ;
   private boolean[] H01BC2_n4384ForTipArt ;
   private String[] H01BC2_A396EmprCod ;
   private String[] H01BC2_A10045CliAct ;
   private long[] H01BC2_A4339ForRGB ;
   private boolean[] H01BC2_n4339ForRGB ;
   private int[] H01BC2_A1192ForNumCli ;
   private boolean[] H01BC2_n1192ForNumCli ;
   private String[] H01BC2_A7781ForBlo ;
   private boolean[] H01BC2_n7781ForBlo ;
   private String[] H01BC2_A2749ForPro ;
   private boolean[] H01BC2_n2749ForPro ;
   private String[] H01BC2_A584IntDsc ;
   private boolean[] H01BC2_n584IntDsc ;
   private String[] H01BC2_A3560ForOpcCli ;
   private boolean[] H01BC2_n3560ForOpcCli ;
   private java.math.BigDecimal[] H01BC2_A2838ForRelBan ;
   private boolean[] H01BC2_n2838ForRelBan ;
   private String[] H01BC2_A995ForTonal ;
   private boolean[] H01BC2_n995ForTonal ;
   private int[] H01BC2_A486ForNumCol ;
   private java.util.Date[] H01BC2_A496ForUltUti ;
   private boolean[] H01BC2_n496ForUltUti ;
   private java.util.Date[] H01BC2_A485ForFec ;
   private boolean[] H01BC2_n485ForFec ;
   private String[] H01BC2_A832TipColDsc ;
   private boolean[] H01BC2_n832TipColDsc ;
   private byte[] H01BC2_A831TipColCod ;
   private String[] H01BC2_A1191ForNomCli ;
   private boolean[] H01BC2_n1191ForNomCli ;
   private int[] H01BC2_A483ForColNum ;
   private String[] H01BC2_A482ForColNom ;
   private String[] H01BC2_A5742ForSerDsc ;
   private boolean[] H01BC2_n5742ForSerDsc ;
   private String[] H01BC2_A494ForSer ;
   private String[] H01BC2_A279CliNom ;
   private int[] H01BC2_A252CliCod ;
   private String[] H01BC2_A13929ForTipArtD ;
   private boolean[] H01BC2_n13929ForTipArtD ;
   private short[] H01BC3_A829TipArtCod ;
   private byte[] H01BC3_A583IntCod ;
   private short[] H01BC3_A4384ForTipArt ;
   private boolean[] H01BC3_n4384ForTipArt ;
   private String[] H01BC3_A396EmprCod ;
   private String[] H01BC3_A10045CliAct ;
   private long[] H01BC3_A4339ForRGB ;
   private boolean[] H01BC3_n4339ForRGB ;
   private int[] H01BC3_A1192ForNumCli ;
   private boolean[] H01BC3_n1192ForNumCli ;
   private String[] H01BC3_A7781ForBlo ;
   private boolean[] H01BC3_n7781ForBlo ;
   private String[] H01BC3_A2749ForPro ;
   private boolean[] H01BC3_n2749ForPro ;
   private String[] H01BC3_A584IntDsc ;
   private boolean[] H01BC3_n584IntDsc ;
   private String[] H01BC3_A3560ForOpcCli ;
   private boolean[] H01BC3_n3560ForOpcCli ;
   private java.math.BigDecimal[] H01BC3_A2838ForRelBan ;
   private boolean[] H01BC3_n2838ForRelBan ;
   private String[] H01BC3_A995ForTonal ;
   private boolean[] H01BC3_n995ForTonal ;
   private int[] H01BC3_A486ForNumCol ;
   private java.util.Date[] H01BC3_A496ForUltUti ;
   private boolean[] H01BC3_n496ForUltUti ;
   private java.util.Date[] H01BC3_A485ForFec ;
   private boolean[] H01BC3_n485ForFec ;
   private String[] H01BC3_A832TipColDsc ;
   private boolean[] H01BC3_n832TipColDsc ;
   private byte[] H01BC3_A831TipColCod ;
   private String[] H01BC3_A1191ForNomCli ;
   private boolean[] H01BC3_n1191ForNomCli ;
   private int[] H01BC3_A483ForColNum ;
   private String[] H01BC3_A482ForColNom ;
   private String[] H01BC3_A5742ForSerDsc ;
   private boolean[] H01BC3_n5742ForSerDsc ;
   private String[] H01BC3_A494ForSer ;
   private String[] H01BC3_A279CliNom ;
   private int[] H01BC3_A252CliCod ;
   private String[] H01BC3_A13929ForTipArtD ;
   private boolean[] H01BC3_n13929ForTipArtD ;
   private String[] H01BC4_A396EmprCod ;
   private String[] H01BC4_A10045CliAct ;
   private String[] H01BC4_A13735CliCNom ;
   private int[] H01BC4_A252CliCod ;
   private String[] H01BC4_A279CliNom ;
   private String[] H01BC5_A396EmprCod ;
   private String[] H01BC5_A10045CliAct ;
   private String[] H01BC5_A13735CliCNom ;
   private int[] H01BC5_A252CliCod ;
   private String[] H01BC5_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV137TFForBlo_Sels ;
   private GXSimpleCollection<String> AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item22 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item23[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV129CliCodform_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV131CliCodto_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState46[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector21[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV70DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV130Combo_DataItem ;
   private app.SdtFilterMtoFormulasTinteWW AV132FilterMtoFormulasTinteWW ;
}

final  class mtoformulastinteww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01BC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV148Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV126ForFec ,
                                          java.util.Date AV138ForFecto ,
                                          int AV127CliCodform ,
                                          int AV128CliCodto ,
                                          int AV134ForColNum ,
                                          String AV135ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int47 = new byte[39];
      Object[] GXv_Object48 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.IntCod, T1.ForTipArt, T1.EmprCod, T2.CliAct, T1.ForRGB, T1.ForNumCli, T1.ForBlo, T1.ForPro, T3.IntDsc, T1.ForOpcCli, T1.ForRelBan, T1.ForTonal," ;
      scmdbuf += " T1.ForNumCol, T1.ForUltUti, T1.ForFec, T4.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod, COALESCE(" ;
      scmdbuf += " T5.TipArtDsc, ' ') AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON" ;
      scmdbuf += " T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int47[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV148Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int47[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int47[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int47[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int47[15] = (byte)(1) ;
      }
      if ( ! (0==AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int47[16] = (byte)(1) ;
      }
      if ( ! (0==AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int47[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int47[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int47[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int47[21] = (byte)(1) ;
      }
      if ( ! (0==AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int47[22] = (byte)(1) ;
      }
      if ( ! (0==AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int47[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int47[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int47[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int47[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int47[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int47[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int47[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int47[32] = (byte)(1) ;
      }
      if ( AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int47[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int47[34] = (byte)(1) ;
      }
      if ( ! (0==AV127CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int47[35] = (byte)(1) ;
      }
      if ( ! (0==AV128CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int47[36] = (byte)(1) ;
      }
      if ( ! (0==AV134ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int47[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int47[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ForFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTonal" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTonal DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForRelBan" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForRelBan DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPro" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPro DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      GXv_Object48[0] = scmdbuf ;
      GXv_Object48[1] = GXv_int47 ;
      return GXv_Object48 ;
   }

   protected Object[] conditional_H01BC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels ,
                                          String AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel ,
                                          String AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom ,
                                          String AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel ,
                                          String AV148Formulaciontinte_mtoformulastintewwds_4_tfforser ,
                                          String AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel ,
                                          String AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc ,
                                          String AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel ,
                                          String AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom ,
                                          String AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel ,
                                          String AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli ,
                                          byte AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod ,
                                          byte AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to ,
                                          String AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel ,
                                          String AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc ,
                                          java.util.Date AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti ,
                                          int AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol ,
                                          int AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to ,
                                          String AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel ,
                                          String AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal ,
                                          java.math.BigDecimal AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban ,
                                          java.math.BigDecimal AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to ,
                                          String AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel ,
                                          String AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli ,
                                          String AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel ,
                                          String AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc ,
                                          String AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel ,
                                          int AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size ,
                                          java.util.Date AV126ForFec ,
                                          java.util.Date AV138ForFecto ,
                                          int AV127CliCodform ,
                                          int AV128CliCodto ,
                                          int AV134ForColNum ,
                                          String AV135ForColNom ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          String A1191ForNomCli ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          java.util.Date A496ForUltUti ,
                                          int A486ForNumCol ,
                                          String A995ForTonal ,
                                          java.math.BigDecimal A2838ForRelBan ,
                                          String A3560ForOpcCli ,
                                          String A584IntDsc ,
                                          String A2749ForPro ,
                                          java.util.Date A485ForFec ,
                                          int A252CliCod ,
                                          int A483ForColNum ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV145Formulaciontinte_mtoformulastintewwds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV153Formulaciontinte_mtoformulastintewwds_9_tffortipartdsc_sel ,
                                          String AV152Formulaciontinte_mtoformulastintewwds_8_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int50 = new byte[39];
      Object[] GXv_Object51 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T1.IntCod, T1.ForTipArt, T1.EmprCod, T2.CliAct, T1.ForRGB, T1.ForNumCli, T1.ForBlo, T1.ForPro, T3.IntDsc, T1.ForOpcCli, T1.ForRelBan, T1.ForTonal," ;
      scmdbuf += " T1.ForNumCol, T1.ForUltUti, T1.ForFec, T4.TipColDsc, T1.TipColCod, T1.ForNomCli, T1.ForColNum, T1.ForColNom, T1.ForSerDsc, T1.ForSer, T2.CliNom, T1.CliCod, COALESCE(" ;
      scmdbuf += " T5.TipArtDsc, ' ') AS ForTipArtD FROM ((((TXPCFORMU T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPINTENS T3 ON" ;
      scmdbuf += " T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod) INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON" ;
      scmdbuf += " T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliAct = 'S')");
      if ( (GXutil.strcmp("", AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV146Formulaciontinte_mtoformulastintewwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Formulaciontinte_mtoformulastintewwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int50[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV148Formulaciontinte_mtoformulastintewwds_4_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Formulaciontinte_mtoformulastintewwds_5_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int50[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV150Formulaciontinte_mtoformulastintewwds_6_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Formulaciontinte_mtoformulastintewwds_7_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int50[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV154Formulaciontinte_mtoformulastintewwds_10_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Formulaciontinte_mtoformulastintewwds_11_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int50[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) && ( ! (GXutil.strcmp("", AV156Formulaciontinte_mtoformulastintewwds_12_tffornomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Formulaciontinte_mtoformulastintewwds_13_tffornomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForNomCli = ?)");
      }
      else
      {
         GXv_int50[15] = (byte)(1) ;
      }
      if ( ! (0==AV158Formulaciontinte_mtoformulastintewwds_14_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int50[16] = (byte)(1) ;
      }
      if ( ! (0==AV159Formulaciontinte_mtoformulastintewwds_15_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int50[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV160Formulaciontinte_mtoformulastintewwds_16_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Formulaciontinte_mtoformulastintewwds_17_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int50[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti >= ?)");
      }
      else
      {
         GXv_int50[20] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV162Formulaciontinte_mtoformulastintewwds_18_tfforultuti)) )
      {
         addWhere(sWhereString, "(T1.ForUltUti <= ?)");
      }
      else
      {
         GXv_int50[21] = (byte)(1) ;
      }
      if ( ! (0==AV164Formulaciontinte_mtoformulastintewwds_20_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int50[22] = (byte)(1) ;
      }
      if ( ! (0==AV165Formulaciontinte_mtoformulastintewwds_21_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int50[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) && ( ! (GXutil.strcmp("", AV166Formulaciontinte_mtoformulastintewwds_22_tffortonal)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForTonal) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Formulaciontinte_mtoformulastintewwds_23_tffortonal_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForTonal = ?)");
      }
      else
      {
         GXv_int50[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV168Formulaciontinte_mtoformulastintewwds_24_tfforrelban)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan >= ?)");
      }
      else
      {
         GXv_int50[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV169Formulaciontinte_mtoformulastintewwds_25_tfforrelban_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForRelBan <= ?)");
      }
      else
      {
         GXv_int50[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) && ( ! (GXutil.strcmp("", AV170Formulaciontinte_mtoformulastintewwds_26_tfforopccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForOpcCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Formulaciontinte_mtoformulastintewwds_27_tfforopccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForOpcCli = ?)");
      }
      else
      {
         GXv_int50[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV172Formulaciontinte_mtoformulastintewwds_28_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int50[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Formulaciontinte_mtoformulastintewwds_29_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int50[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Formulaciontinte_mtoformulastintewwds_30_tfforpro_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForPro = ?)");
      }
      else
      {
         GXv_int50[32] = (byte)(1) ;
      }
      if ( AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV175Formulaciontinte_mtoformulastintewwds_31_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126ForFec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int50[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV138ForFecto)) )
      {
         addWhere(sWhereString, "(T1.ForFec <= ?)");
      }
      else
      {
         GXv_int50[34] = (byte)(1) ;
      }
      if ( ! (0==AV127CliCodform) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int50[35] = (byte)(1) ;
      }
      if ( ! (0==AV128CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int50[36] = (byte)(1) ;
      }
      if ( ! (0==AV134ForColNum) )
      {
         addWhere(sWhereString, "(T1.ForColNum = ?)");
      }
      else
      {
         GXv_int50[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135ForColNom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int50[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.ForFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNomCli" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltUti" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltUti DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTonal" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTonal DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForRelBan" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForRelBan DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForOpcCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForPro" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForPro DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      GXv_Object51[0] = scmdbuf ;
      GXv_Object51[1] = GXv_int50 ;
      return GXv_Object51 ;
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
                  return conditional_H01BC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).shortValue() , ((Boolean) dynConstraints[53]).booleanValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
            case 1 :
                  return conditional_H01BC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).shortValue() , ((Boolean) dynConstraints[53]).booleanValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01BC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BC4", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01BC5", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(18);
               ((String[]) buf[30])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(20);
               ((String[]) buf[33])[0] = rslt.getString(21, 13);
               ((String[]) buf[34])[0] = rslt.getString(22, 26);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(23, 16);
               ((String[]) buf[37])[0] = rslt.getString(24, 30);
               ((int[]) buf[38])[0] = rslt.getInt(25);
               ((String[]) buf[39])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((long[]) buf[6])[0] = rslt.getLong(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDate(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(18);
               ((String[]) buf[30])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((int[]) buf[32])[0] = rslt.getInt(20);
               ((String[]) buf[33])[0] = rslt.getString(21, 13);
               ((String[]) buf[34])[0] = rslt.getString(22, 26);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(23, 16);
               ((String[]) buf[37])[0] = rslt.getString(24, 30);
               ((int[]) buf[38])[0] = rslt.getInt(25);
               ((String[]) buf[39])[0] = rslt.getString(26, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
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
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
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
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[72]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

