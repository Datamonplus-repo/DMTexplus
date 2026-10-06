package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ccstksww_impl extends GXDataArea
{
   public ccstksww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ccstksww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ccstksww_impl.class ));
   }

   public ccstksww_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
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
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV26TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV27TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV28TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV29TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV30TFCCStkLin = GXutil.lval( httpContext.GetPar( "TFCCStkLin")) ;
      AV31TFCCStkLin_To = GXutil.lval( httpContext.GetPar( "TFCCStkLin_To")) ;
      AV32TFCCStkCanE = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkCanE"), ".") ;
      AV33TFCCStkCanE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkCanE_To"), ".") ;
      AV34TFCCStkCanS = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkCanS"), ".") ;
      AV35TFCCStkCanS_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkCanS_To"), ".") ;
      AV36TFTipMovCc = httpContext.GetPar( "TFTipMovCc") ;
      AV37TFTipMovCc_Sel = httpContext.GetPar( "TFTipMovCc_Sel") ;
      AV38TFTipMovCn = httpContext.GetPar( "TFTipMovCn") ;
      AV39TFTipMovCn_Sel = httpContext.GetPar( "TFTipMovCn_Sel") ;
      AV40TFCCStkPri = httpContext.GetPar( "TFCCStkPri") ;
      AV41TFCCStkPri_Sel = httpContext.GetPar( "TFCCStkPri_Sel") ;
      AV42TFCCStkFec = localUtil.parseDateParm( httpContext.GetPar( "TFCCStkFec")) ;
      AV46TFCCStkPre = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkPre"), ".") ;
      AV47TFCCStkPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFCCStkPre_To"), ".") ;
      AV48TFCCStkBar = (int)(GXutil.lval( httpContext.GetPar( "TFCCStkBar"))) ;
      AV49TFCCStkBar_To = (int)(GXutil.lval( httpContext.GetPar( "TFCCStkBar_To"))) ;
      AV50TFCCStkReo = (byte)(GXutil.lval( httpContext.GetPar( "TFCCStkReo"))) ;
      AV51TFCCStkReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFCCStkReo_To"))) ;
      AV52TFCCStkPar = httpContext.GetPar( "TFCCStkPar") ;
      AV53TFCCStkPar_Sel = httpContext.GetPar( "TFCCStkPar_Sel") ;
      AV54TFCCStkPed = (int)(GXutil.lval( httpContext.GetPar( "TFCCStkPed"))) ;
      AV55TFCCStkPed_To = (int)(GXutil.lval( httpContext.GetPar( "TFCCStkPed_To"))) ;
      AV56TFCCStkAlb = httpContext.GetPar( "TFCCStkAlb") ;
      AV57TFCCStkAlb_Sel = httpContext.GetPar( "TFCCStkAlb_Sel") ;
      AV58TFCCStkUsu = httpContext.GetPar( "TFCCStkUsu") ;
      AV59TFCCStkUsu_Sel = httpContext.GetPar( "TFCCStkUsu_Sel") ;
      AV60TFCCStkHor = httpContext.GetPar( "TFCCStkHor") ;
      AV61TFCCStkHor_Sel = httpContext.GetPar( "TFCCStkHor_Sel") ;
      AV62TFCCStkDsc = httpContext.GetPar( "TFCCStkDsc") ;
      AV63TFCCStkDsc_Sel = httpContext.GetPar( "TFCCStkDsc_Sel") ;
      AV64TFCCStkLen = (short)(GXutil.lval( httpContext.GetPar( "TFCCStkLen"))) ;
      AV65TFCCStkLen_To = (short)(GXutil.lval( httpContext.GetPar( "TFCCStkLen_To"))) ;
      AV66TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV67TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV68TFCcoCod = (short)(GXutil.lval( httpContext.GetPar( "TFCcoCod"))) ;
      AV69TFCcoCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFCcoCod_To"))) ;
      AV70TFValorE = CommonUtil.decimalVal( httpContext.GetPar( "TFValorE"), ".") ;
      AV71TFValorE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFValorE_To"), ".") ;
      AV72TFValorS = CommonUtil.decimalVal( httpContext.GetPar( "TFValorS"), ".") ;
      AV73TFValorS_To = CommonUtil.decimalVal( httpContext.GetPar( "TFValorS_To"), ".") ;
      AV74TFValorEI = CommonUtil.decimalVal( httpContext.GetPar( "TFValorEI"), ".") ;
      AV75TFValorEI_To = CommonUtil.decimalVal( httpContext.GetPar( "TFValorEI_To"), ".") ;
      AV76TFValorSI = CommonUtil.decimalVal( httpContext.GetPar( "TFValorSI"), ".") ;
      AV77TFValorSI_To = CommonUtil.decimalVal( httpContext.GetPar( "TFValorSI_To"), ".") ;
      AV85Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFCCStkLin, AV31TFCCStkLin_To, AV32TFCCStkCanE, AV33TFCCStkCanE_To, AV34TFCCStkCanS, AV35TFCCStkCanS_To, AV36TFTipMovCc, AV37TFTipMovCc_Sel, AV38TFTipMovCn, AV39TFTipMovCn_Sel, AV40TFCCStkPri, AV41TFCCStkPri_Sel, AV42TFCCStkFec, AV46TFCCStkPre, AV47TFCCStkPre_To, AV48TFCCStkBar, AV49TFCCStkBar_To, AV50TFCCStkReo, AV51TFCCStkReo_To, AV52TFCCStkPar, AV53TFCCStkPar_Sel, AV54TFCCStkPed, AV55TFCCStkPed_To, AV56TFCCStkAlb, AV57TFCCStkAlb_Sel, AV58TFCCStkUsu, AV59TFCCStkUsu_Sel, AV60TFCCStkHor, AV61TFCCStkHor_Sel, AV62TFCCStkDsc, AV63TFCCStkDsc_Sel, AV64TFCCStkLen, AV65TFCCStkLen_To, AV66TFPrdExiAlm, AV67TFPrdExiAlm_To, AV68TFCcoCod, AV69TFCcoCod_To, AV70TFValorE, AV71TFValorE_To, AV72TFValorS, AV73TFValorS_To, AV74TFValorEI, AV75TFValorEI_To, AV76TFValorSI, AV77TFValorSI_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa1RT2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1RT2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ccstksww", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CCSTKSWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV85Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ccstksww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV80GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV81GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV78DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV78DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD", GXutil.rtrim( AV26TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD_SEL", GXutil.rtrim( AV27TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV28TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV29TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKLIN", GXutil.ltrim( localUtil.ntoc( AV30TFCCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKLIN_TO", GXutil.ltrim( localUtil.ntoc( AV31TFCCStkLin_To, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKCANE", GXutil.ltrim( localUtil.ntoc( AV32TFCCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKCANE_TO", GXutil.ltrim( localUtil.ntoc( AV33TFCCStkCanE_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKCANS", GXutil.ltrim( localUtil.ntoc( AV34TFCCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKCANS_TO", GXutil.ltrim( localUtil.ntoc( AV35TFCCStkCanS_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMOVCC", GXutil.rtrim( AV36TFTipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMOVCC_SEL", GXutil.rtrim( AV37TFTipMovCc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMOVCN", GXutil.rtrim( AV38TFTipMovCn));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMOVCN_SEL", GXutil.rtrim( AV39TFTipMovCn_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPRI", GXutil.rtrim( AV40TFCCStkPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPRI_SEL", GXutil.rtrim( AV41TFCCStkPri_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKFEC", localUtil.dtoc( AV42TFCCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPRE", GXutil.ltrim( localUtil.ntoc( AV46TFCCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPRE_TO", GXutil.ltrim( localUtil.ntoc( AV47TFCCStkPre_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKBAR", GXutil.ltrim( localUtil.ntoc( AV48TFCCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKBAR_TO", GXutil.ltrim( localUtil.ntoc( AV49TFCCStkBar_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKREO", GXutil.ltrim( localUtil.ntoc( AV50TFCCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKREO_TO", GXutil.ltrim( localUtil.ntoc( AV51TFCCStkReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPAR", GXutil.rtrim( AV52TFCCStkPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPAR_SEL", GXutil.rtrim( AV53TFCCStkPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPED", GXutil.ltrim( localUtil.ntoc( AV54TFCCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKPED_TO", GXutil.ltrim( localUtil.ntoc( AV55TFCCStkPed_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKALB", GXutil.rtrim( AV56TFCCStkAlb));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKALB_SEL", GXutil.rtrim( AV57TFCCStkAlb_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKUSU", GXutil.rtrim( AV58TFCCStkUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKUSU_SEL", GXutil.rtrim( AV59TFCCStkUsu_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKHOR", GXutil.rtrim( AV60TFCCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKHOR_SEL", GXutil.rtrim( AV61TFCCStkHor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKDSC", GXutil.rtrim( AV62TFCCStkDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKDSC_SEL", GXutil.rtrim( AV63TFCCStkDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKLEN", GXutil.ltrim( localUtil.ntoc( AV64TFCCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCSTKLEN_TO", GXutil.ltrim( localUtil.ntoc( AV65TFCCStkLen_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV66TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV67TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCOCOD", GXutil.ltrim( localUtil.ntoc( AV68TFCcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCCOCOD_TO", GXutil.ltrim( localUtil.ntoc( AV69TFCcoCod_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALORE", GXutil.ltrim( localUtil.ntoc( AV70TFValorE, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALORE_TO", GXutil.ltrim( localUtil.ntoc( AV71TFValorE_To, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALORS", GXutil.ltrim( localUtil.ntoc( AV72TFValorS, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALORS_TO", GXutil.ltrim( localUtil.ntoc( AV73TFValorS_To, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALOREI", GXutil.ltrim( localUtil.ntoc( AV74TFValorEI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALOREI_TO", GXutil.ltrim( localUtil.ntoc( AV75TFValorEI_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALORSI", GXutil.ltrim( localUtil.ntoc( AV76TFValorSI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFVALORSI_TO", GXutil.ltrim( localUtil.ntoc( AV77TFValorSI_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
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
         we1RT2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1RT2( ) ;
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
      return formatLink("app.ccstksww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "CCSTKSWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla CCSTKS", "") ;
   }

   public void wb1RT0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CCSTKSWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CCSTKSWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CCSTKSWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CCSTKSWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CCSTKSWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1RT2( true) ;
      }
      else
      {
         wb_table1_27_1RT2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1RT2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV80GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV81GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV85Pgmname), GXutil.rtrim( localUtil.format( AV85Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CCSTKSWW.htm");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV78DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV78DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_ccstkfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_ccstkfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_ccstkfecauxdate_Internalname, localUtil.format(AV44DDO_CCStkFecAuxDate, "99/99/99"), localUtil.format( AV44DDO_CCStkFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_ccstkfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CCSTKSWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_ccstkfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CCSTKSWW.htm");
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

   public void start1RT2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Tabla CCSTKS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1RT0( ) ;
   }

   public void ws1RT2( )
   {
      start1RT2( ) ;
      evt1RT2( ) ;
   }

   public void evt1RT2( )
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
                           e111RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e161RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e171RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e181RT2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e191RT2 ();
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
                           AV82GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A3342CCStkLin = localUtil.ctol( httpContext.cgiGet( edtCCStkLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A3343CCStkCanE = localUtil.ctond( httpContext.cgiGet( edtCCStkCanE_Internalname)) ;
                           A3344CCStkCanS = localUtil.ctond( httpContext.cgiGet( edtCCStkCanS_Internalname)) ;
                           A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
                           A3346TipMovCn = httpContext.cgiGet( edtTipMovCn_Internalname) ;
                           n3346TipMovCn = false ;
                           A3347CCStkPri = httpContext.cgiGet( edtCCStkPri_Internalname) ;
                           A3348CCStkFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtCCStkFec_Internalname), 0)) ;
                           A3349CCStkPre = localUtil.ctond( httpContext.cgiGet( edtCCStkPre_Internalname)) ;
                           A3350CCStkBar = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3351CCStkReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtCCStkReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3352CCStkPar = httpContext.cgiGet( edtCCStkPar_Internalname) ;
                           A3353CCStkPed = (int)(localUtil.ctol( httpContext.cgiGet( edtCCStkPed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3354CCStkAlb = httpContext.cgiGet( edtCCStkAlb_Internalname) ;
                           A3355CCStkUsu = GXutil.upper( httpContext.cgiGet( edtCCStkUsu_Internalname)) ;
                           A3356CCStkHor = httpContext.cgiGet( edtCCStkHor_Internalname) ;
                           A3357CCStkDsc = httpContext.cgiGet( edtCCStkDsc_Internalname) ;
                           A3358CCStkLen = (short)(localUtil.ctol( httpContext.cgiGet( edtCCStkLen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A3839CcoCod = (short)(localUtil.ctol( httpContext.cgiGet( edtCcoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3909ValorE = localUtil.ctond( httpContext.cgiGet( edtValorE_Internalname)) ;
                           A3910ValorS = localUtil.ctond( httpContext.cgiGet( edtValorS_Internalname)) ;
                           A3916ValorEI = localUtil.ctond( httpContext.cgiGet( edtValorEI_Internalname)) ;
                           A3917ValorSI = localUtil.ctond( httpContext.cgiGet( edtValorSI_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201RT2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211RT2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221RT2 ();
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

   public void we1RT2( )
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

   public void pa1RT2( )
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
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV15FilterFullText ,
                                 String AV26TFEmprCod ,
                                 String AV27TFEmprCod_Sel ,
                                 String AV28TFPrdNum ,
                                 String AV29TFPrdNum_Sel ,
                                 long AV30TFCCStkLin ,
                                 long AV31TFCCStkLin_To ,
                                 java.math.BigDecimal AV32TFCCStkCanE ,
                                 java.math.BigDecimal AV33TFCCStkCanE_To ,
                                 java.math.BigDecimal AV34TFCCStkCanS ,
                                 java.math.BigDecimal AV35TFCCStkCanS_To ,
                                 String AV36TFTipMovCc ,
                                 String AV37TFTipMovCc_Sel ,
                                 String AV38TFTipMovCn ,
                                 String AV39TFTipMovCn_Sel ,
                                 String AV40TFCCStkPri ,
                                 String AV41TFCCStkPri_Sel ,
                                 java.util.Date AV42TFCCStkFec ,
                                 java.math.BigDecimal AV46TFCCStkPre ,
                                 java.math.BigDecimal AV47TFCCStkPre_To ,
                                 int AV48TFCCStkBar ,
                                 int AV49TFCCStkBar_To ,
                                 byte AV50TFCCStkReo ,
                                 byte AV51TFCCStkReo_To ,
                                 String AV52TFCCStkPar ,
                                 String AV53TFCCStkPar_Sel ,
                                 int AV54TFCCStkPed ,
                                 int AV55TFCCStkPed_To ,
                                 String AV56TFCCStkAlb ,
                                 String AV57TFCCStkAlb_Sel ,
                                 String AV58TFCCStkUsu ,
                                 String AV59TFCCStkUsu_Sel ,
                                 String AV60TFCCStkHor ,
                                 String AV61TFCCStkHor_Sel ,
                                 String AV62TFCCStkDsc ,
                                 String AV63TFCCStkDsc_Sel ,
                                 short AV64TFCCStkLen ,
                                 short AV65TFCCStkLen_To ,
                                 java.math.BigDecimal AV66TFPrdExiAlm ,
                                 java.math.BigDecimal AV67TFPrdExiAlm_To ,
                                 short AV68TFCcoCod ,
                                 short AV69TFCcoCod_To ,
                                 java.math.BigDecimal AV70TFValorE ,
                                 java.math.BigDecimal AV71TFValorE_To ,
                                 java.math.BigDecimal AV72TFValorS ,
                                 java.math.BigDecimal AV73TFValorS_To ,
                                 java.math.BigDecimal AV74TFValorEI ,
                                 java.math.BigDecimal AV75TFValorEI_To ,
                                 java.math.BigDecimal AV76TFValorSI ,
                                 java.math.BigDecimal AV77TFValorSI_To ,
                                 String AV85Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211RT2 ();
      GRID_nCurrentRecord = 0 ;
      rf1RT2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CCSTKSWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV85Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ccstksww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCSTKLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCSTKLIN", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), ".", "")));
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
      rf1RT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV85Pgmname = "CCSTKSWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1RT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e211RT2 ();
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
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_452( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV92Ccstkswwds_3_tfemprcod_sel ,
                                              AV91Ccstkswwds_2_tfemprcod ,
                                              AV94Ccstkswwds_5_tfprdnum_sel ,
                                              AV93Ccstkswwds_4_tfprdnum ,
                                              Long.valueOf(AV95Ccstkswwds_6_tfccstklin) ,
                                              Long.valueOf(AV96Ccstkswwds_7_tfccstklin_to) ,
                                              AV97Ccstkswwds_8_tfccstkcane ,
                                              AV98Ccstkswwds_9_tfccstkcane_to ,
                                              AV99Ccstkswwds_10_tfccstkcans ,
                                              AV100Ccstkswwds_11_tfccstkcans_to ,
                                              AV102Ccstkswwds_13_tftipmovcc_sel ,
                                              AV101Ccstkswwds_12_tftipmovcc ,
                                              AV104Ccstkswwds_15_tftipmovcn_sel ,
                                              AV103Ccstkswwds_14_tftipmovcn ,
                                              AV106Ccstkswwds_17_tfccstkpri_sel ,
                                              AV105Ccstkswwds_16_tfccstkpri ,
                                              AV107Ccstkswwds_18_tfccstkfec ,
                                              AV108Ccstkswwds_19_tfccstkpre ,
                                              AV109Ccstkswwds_20_tfccstkpre_to ,
                                              Integer.valueOf(AV110Ccstkswwds_21_tfccstkbar) ,
                                              Integer.valueOf(AV111Ccstkswwds_22_tfccstkbar_to) ,
                                              Byte.valueOf(AV112Ccstkswwds_23_tfccstkreo) ,
                                              Byte.valueOf(AV113Ccstkswwds_24_tfccstkreo_to) ,
                                              AV115Ccstkswwds_26_tfccstkpar_sel ,
                                              AV114Ccstkswwds_25_tfccstkpar ,
                                              Integer.valueOf(AV116Ccstkswwds_27_tfccstkped) ,
                                              Integer.valueOf(AV117Ccstkswwds_28_tfccstkped_to) ,
                                              AV119Ccstkswwds_30_tfccstkalb_sel ,
                                              AV118Ccstkswwds_29_tfccstkalb ,
                                              AV121Ccstkswwds_32_tfccstkusu_sel ,
                                              AV120Ccstkswwds_31_tfccstkusu ,
                                              AV123Ccstkswwds_34_tfccstkhor_sel ,
                                              AV122Ccstkswwds_33_tfccstkhor ,
                                              AV125Ccstkswwds_36_tfccstkdsc_sel ,
                                              AV124Ccstkswwds_35_tfccstkdsc ,
                                              Short.valueOf(AV126Ccstkswwds_37_tfccstklen) ,
                                              Short.valueOf(AV127Ccstkswwds_38_tfccstklen_to) ,
                                              AV128Ccstkswwds_39_tfprdexialm ,
                                              AV129Ccstkswwds_40_tfprdexialm_to ,
                                              Short.valueOf(AV130Ccstkswwds_41_tfccocod) ,
                                              Short.valueOf(AV131Ccstkswwds_42_tfccocod_to) ,
                                              AV136Ccstkswwds_47_tfvalorei ,
                                              AV137Ccstkswwds_48_tfvalorei_to ,
                                              AV138Ccstkswwds_49_tfvalorsi ,
                                              AV139Ccstkswwds_50_tfvalorsi_to ,
                                              A396EmprCod ,
                                              A719PrdNum ,
                                              Long.valueOf(A3342CCStkLin) ,
                                              A3343CCStkCanE ,
                                              A3344CCStkCanS ,
                                              A3345TipMovCc ,
                                              A3346TipMovCn ,
                                              A3347CCStkPri ,
                                              A3348CCStkFec ,
                                              A3349CCStkPre ,
                                              Integer.valueOf(A3350CCStkBar) ,
                                              Byte.valueOf(A3351CCStkReo) ,
                                              A3352CCStkPar ,
                                              Integer.valueOf(A3353CCStkPed) ,
                                              A3354CCStkAlb ,
                                              A3355CCStkUsu ,
                                              A3356CCStkHor ,
                                              A3357CCStkDsc ,
                                              Short.valueOf(A3358CCStkLen) ,
                                              A704PrdExiAlm ,
                                              Short.valueOf(A3839CcoCod) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV90Ccstkswwds_1_filterfulltext ,
                                              A3909ValorE ,
                                              A3910ValorS ,
                                              A3916ValorEI ,
                                              A3917ValorSI ,
                                              AV132Ccstkswwds_43_tfvalore ,
                                              AV133Ccstkswwds_44_tfvalore_to ,
                                              AV134Ccstkswwds_45_tfvalors ,
                                              AV135Ccstkswwds_46_tfvalors_to } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                              }
         });
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
         lV91Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV91Ccstkswwds_2_tfemprcod), 3, "%") ;
         lV93Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV93Ccstkswwds_4_tfprdnum), 6, "%") ;
         lV101Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV101Ccstkswwds_12_tftipmovcc), 2, "%") ;
         lV103Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV103Ccstkswwds_14_tftipmovcn), 30, "%") ;
         lV105Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV105Ccstkswwds_16_tfccstkpri), 1, "%") ;
         lV114Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV114Ccstkswwds_25_tfccstkpar), 1, "%") ;
         lV118Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV118Ccstkswwds_29_tfccstkalb), 10, "%") ;
         lV120Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV120Ccstkswwds_31_tfccstkusu), 8, "%") ;
         lV122Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV122Ccstkswwds_33_tfccstkhor), 8, "%") ;
         lV124Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV124Ccstkswwds_35_tfccstkdsc), 30, "%") ;
         /* Using cursor H01RT3 */
         pr_default.execute(0, new Object[] {AV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, AV132Ccstkswwds_43_tfvalore, AV132Ccstkswwds_43_tfvalore, AV133Ccstkswwds_44_tfvalore_to, AV133Ccstkswwds_44_tfvalore_to, AV134Ccstkswwds_45_tfvalors, AV134Ccstkswwds_45_tfvalors, AV135Ccstkswwds_46_tfvalors_to, AV135Ccstkswwds_46_tfvalors_to, lV91Ccstkswwds_2_tfemprcod, AV92Ccstkswwds_3_tfemprcod_sel, lV93Ccstkswwds_4_tfprdnum, AV94Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV95Ccstkswwds_6_tfccstklin), Long.valueOf(AV96Ccstkswwds_7_tfccstklin_to), AV97Ccstkswwds_8_tfccstkcane, AV98Ccstkswwds_9_tfccstkcane_to, AV99Ccstkswwds_10_tfccstkcans, AV100Ccstkswwds_11_tfccstkcans_to, lV101Ccstkswwds_12_tftipmovcc, AV102Ccstkswwds_13_tftipmovcc_sel, lV103Ccstkswwds_14_tftipmovcn, AV104Ccstkswwds_15_tftipmovcn_sel, lV105Ccstkswwds_16_tfccstkpri, AV106Ccstkswwds_17_tfccstkpri_sel, AV107Ccstkswwds_18_tfccstkfec, AV108Ccstkswwds_19_tfccstkpre, AV109Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV110Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV111Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV112Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV113Ccstkswwds_24_tfccstkreo_to), lV114Ccstkswwds_25_tfccstkpar, AV115Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV116Ccstkswwds_27_tfccstkped), Integer.valueOf(AV117Ccstkswwds_28_tfccstkped_to), lV118Ccstkswwds_29_tfccstkalb, AV119Ccstkswwds_30_tfccstkalb_sel, lV120Ccstkswwds_31_tfccstkusu, AV121Ccstkswwds_32_tfccstkusu_sel, lV122Ccstkswwds_33_tfccstkhor, AV123Ccstkswwds_34_tfccstkhor_sel, lV124Ccstkswwds_35_tfccstkdsc, AV125Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV126Ccstkswwds_37_tfccstklen), Short.valueOf(AV127Ccstkswwds_38_tfccstklen_to), AV128Ccstkswwds_39_tfprdexialm, AV129Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV130Ccstkswwds_41_tfccocod), Short.valueOf(AV131Ccstkswwds_42_tfccocod_to), AV136Ccstkswwds_47_tfvalorei, AV137Ccstkswwds_48_tfvalorei_to, AV138Ccstkswwds_49_tfvalorsi, AV139Ccstkswwds_50_tfvalorsi_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3917ValorSI = H01RT3_A3917ValorSI[0] ;
            A3916ValorEI = H01RT3_A3916ValorEI[0] ;
            A3839CcoCod = H01RT3_A3839CcoCod[0] ;
            A704PrdExiAlm = H01RT3_A704PrdExiAlm[0] ;
            A3358CCStkLen = H01RT3_A3358CCStkLen[0] ;
            A3357CCStkDsc = H01RT3_A3357CCStkDsc[0] ;
            A3356CCStkHor = H01RT3_A3356CCStkHor[0] ;
            A3355CCStkUsu = H01RT3_A3355CCStkUsu[0] ;
            A3354CCStkAlb = H01RT3_A3354CCStkAlb[0] ;
            A3353CCStkPed = H01RT3_A3353CCStkPed[0] ;
            A3352CCStkPar = H01RT3_A3352CCStkPar[0] ;
            A3351CCStkReo = H01RT3_A3351CCStkReo[0] ;
            A3350CCStkBar = H01RT3_A3350CCStkBar[0] ;
            A3348CCStkFec = H01RT3_A3348CCStkFec[0] ;
            A3347CCStkPri = H01RT3_A3347CCStkPri[0] ;
            A3346TipMovCn = H01RT3_A3346TipMovCn[0] ;
            n3346TipMovCn = H01RT3_n3346TipMovCn[0] ;
            A3345TipMovCc = H01RT3_A3345TipMovCc[0] ;
            A3342CCStkLin = H01RT3_A3342CCStkLin[0] ;
            A719PrdNum = H01RT3_A719PrdNum[0] ;
            A396EmprCod = H01RT3_A396EmprCod[0] ;
            A3344CCStkCanS = H01RT3_A3344CCStkCanS[0] ;
            A3349CCStkPre = H01RT3_A3349CCStkPre[0] ;
            A3343CCStkCanE = H01RT3_A3343CCStkCanE[0] ;
            A3910ValorS = H01RT3_A3910ValorS[0] ;
            A3909ValorE = H01RT3_A3909ValorE[0] ;
            A704PrdExiAlm = H01RT3_A704PrdExiAlm[0] ;
            A3346TipMovCn = H01RT3_A3346TipMovCn[0] ;
            n3346TipMovCn = H01RT3_n3346TipMovCn[0] ;
            A3910ValorS = H01RT3_A3910ValorS[0] ;
            A3909ValorE = H01RT3_A3909ValorE[0] ;
            e221RT2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb1RT0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1RT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CCSTKLIN"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9")));
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
      AV90Ccstkswwds_1_filterfulltext = AV15FilterFullText ;
      AV91Ccstkswwds_2_tfemprcod = AV26TFEmprCod ;
      AV92Ccstkswwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV93Ccstkswwds_4_tfprdnum = AV28TFPrdNum ;
      AV94Ccstkswwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV95Ccstkswwds_6_tfccstklin = AV30TFCCStkLin ;
      AV96Ccstkswwds_7_tfccstklin_to = AV31TFCCStkLin_To ;
      AV97Ccstkswwds_8_tfccstkcane = AV32TFCCStkCanE ;
      AV98Ccstkswwds_9_tfccstkcane_to = AV33TFCCStkCanE_To ;
      AV99Ccstkswwds_10_tfccstkcans = AV34TFCCStkCanS ;
      AV100Ccstkswwds_11_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV101Ccstkswwds_12_tftipmovcc = AV36TFTipMovCc ;
      AV102Ccstkswwds_13_tftipmovcc_sel = AV37TFTipMovCc_Sel ;
      AV103Ccstkswwds_14_tftipmovcn = AV38TFTipMovCn ;
      AV104Ccstkswwds_15_tftipmovcn_sel = AV39TFTipMovCn_Sel ;
      AV105Ccstkswwds_16_tfccstkpri = AV40TFCCStkPri ;
      AV106Ccstkswwds_17_tfccstkpri_sel = AV41TFCCStkPri_Sel ;
      AV107Ccstkswwds_18_tfccstkfec = AV42TFCCStkFec ;
      AV108Ccstkswwds_19_tfccstkpre = AV46TFCCStkPre ;
      AV109Ccstkswwds_20_tfccstkpre_to = AV47TFCCStkPre_To ;
      AV110Ccstkswwds_21_tfccstkbar = AV48TFCCStkBar ;
      AV111Ccstkswwds_22_tfccstkbar_to = AV49TFCCStkBar_To ;
      AV112Ccstkswwds_23_tfccstkreo = AV50TFCCStkReo ;
      AV113Ccstkswwds_24_tfccstkreo_to = AV51TFCCStkReo_To ;
      AV114Ccstkswwds_25_tfccstkpar = AV52TFCCStkPar ;
      AV115Ccstkswwds_26_tfccstkpar_sel = AV53TFCCStkPar_Sel ;
      AV116Ccstkswwds_27_tfccstkped = AV54TFCCStkPed ;
      AV117Ccstkswwds_28_tfccstkped_to = AV55TFCCStkPed_To ;
      AV118Ccstkswwds_29_tfccstkalb = AV56TFCCStkAlb ;
      AV119Ccstkswwds_30_tfccstkalb_sel = AV57TFCCStkAlb_Sel ;
      AV120Ccstkswwds_31_tfccstkusu = AV58TFCCStkUsu ;
      AV121Ccstkswwds_32_tfccstkusu_sel = AV59TFCCStkUsu_Sel ;
      AV122Ccstkswwds_33_tfccstkhor = AV60TFCCStkHor ;
      AV123Ccstkswwds_34_tfccstkhor_sel = AV61TFCCStkHor_Sel ;
      AV124Ccstkswwds_35_tfccstkdsc = AV62TFCCStkDsc ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = AV63TFCCStkDsc_Sel ;
      AV126Ccstkswwds_37_tfccstklen = AV64TFCCStkLen ;
      AV127Ccstkswwds_38_tfccstklen_to = AV65TFCCStkLen_To ;
      AV128Ccstkswwds_39_tfprdexialm = AV66TFPrdExiAlm ;
      AV129Ccstkswwds_40_tfprdexialm_to = AV67TFPrdExiAlm_To ;
      AV130Ccstkswwds_41_tfccocod = AV68TFCcoCod ;
      AV131Ccstkswwds_42_tfccocod_to = AV69TFCcoCod_To ;
      AV132Ccstkswwds_43_tfvalore = AV70TFValorE ;
      AV133Ccstkswwds_44_tfvalore_to = AV71TFValorE_To ;
      AV134Ccstkswwds_45_tfvalors = AV72TFValorS ;
      AV135Ccstkswwds_46_tfvalors_to = AV73TFValorS_To ;
      AV136Ccstkswwds_47_tfvalorei = AV74TFValorEI ;
      AV137Ccstkswwds_48_tfvalorei_to = AV75TFValorEI_To ;
      AV138Ccstkswwds_49_tfvalorsi = AV76TFValorSI ;
      AV139Ccstkswwds_50_tfvalorsi_to = AV77TFValorSI_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV92Ccstkswwds_3_tfemprcod_sel ,
                                           AV91Ccstkswwds_2_tfemprcod ,
                                           AV94Ccstkswwds_5_tfprdnum_sel ,
                                           AV93Ccstkswwds_4_tfprdnum ,
                                           Long.valueOf(AV95Ccstkswwds_6_tfccstklin) ,
                                           Long.valueOf(AV96Ccstkswwds_7_tfccstklin_to) ,
                                           AV97Ccstkswwds_8_tfccstkcane ,
                                           AV98Ccstkswwds_9_tfccstkcane_to ,
                                           AV99Ccstkswwds_10_tfccstkcans ,
                                           AV100Ccstkswwds_11_tfccstkcans_to ,
                                           AV102Ccstkswwds_13_tftipmovcc_sel ,
                                           AV101Ccstkswwds_12_tftipmovcc ,
                                           AV104Ccstkswwds_15_tftipmovcn_sel ,
                                           AV103Ccstkswwds_14_tftipmovcn ,
                                           AV106Ccstkswwds_17_tfccstkpri_sel ,
                                           AV105Ccstkswwds_16_tfccstkpri ,
                                           AV107Ccstkswwds_18_tfccstkfec ,
                                           AV108Ccstkswwds_19_tfccstkpre ,
                                           AV109Ccstkswwds_20_tfccstkpre_to ,
                                           Integer.valueOf(AV110Ccstkswwds_21_tfccstkbar) ,
                                           Integer.valueOf(AV111Ccstkswwds_22_tfccstkbar_to) ,
                                           Byte.valueOf(AV112Ccstkswwds_23_tfccstkreo) ,
                                           Byte.valueOf(AV113Ccstkswwds_24_tfccstkreo_to) ,
                                           AV115Ccstkswwds_26_tfccstkpar_sel ,
                                           AV114Ccstkswwds_25_tfccstkpar ,
                                           Integer.valueOf(AV116Ccstkswwds_27_tfccstkped) ,
                                           Integer.valueOf(AV117Ccstkswwds_28_tfccstkped_to) ,
                                           AV119Ccstkswwds_30_tfccstkalb_sel ,
                                           AV118Ccstkswwds_29_tfccstkalb ,
                                           AV121Ccstkswwds_32_tfccstkusu_sel ,
                                           AV120Ccstkswwds_31_tfccstkusu ,
                                           AV123Ccstkswwds_34_tfccstkhor_sel ,
                                           AV122Ccstkswwds_33_tfccstkhor ,
                                           AV125Ccstkswwds_36_tfccstkdsc_sel ,
                                           AV124Ccstkswwds_35_tfccstkdsc ,
                                           Short.valueOf(AV126Ccstkswwds_37_tfccstklen) ,
                                           Short.valueOf(AV127Ccstkswwds_38_tfccstklen_to) ,
                                           AV128Ccstkswwds_39_tfprdexialm ,
                                           AV129Ccstkswwds_40_tfprdexialm_to ,
                                           Short.valueOf(AV130Ccstkswwds_41_tfccocod) ,
                                           Short.valueOf(AV131Ccstkswwds_42_tfccocod_to) ,
                                           AV136Ccstkswwds_47_tfvalorei ,
                                           AV137Ccstkswwds_48_tfvalorei_to ,
                                           AV138Ccstkswwds_49_tfvalorsi ,
                                           AV139Ccstkswwds_50_tfvalorsi_to ,
                                           A396EmprCod ,
                                           A719PrdNum ,
                                           Long.valueOf(A3342CCStkLin) ,
                                           A3343CCStkCanE ,
                                           A3344CCStkCanS ,
                                           A3345TipMovCc ,
                                           A3346TipMovCn ,
                                           A3347CCStkPri ,
                                           A3348CCStkFec ,
                                           A3349CCStkPre ,
                                           Integer.valueOf(A3350CCStkBar) ,
                                           Byte.valueOf(A3351CCStkReo) ,
                                           A3352CCStkPar ,
                                           Integer.valueOf(A3353CCStkPed) ,
                                           A3354CCStkAlb ,
                                           A3355CCStkUsu ,
                                           A3356CCStkHor ,
                                           A3357CCStkDsc ,
                                           Short.valueOf(A3358CCStkLen) ,
                                           A704PrdExiAlm ,
                                           Short.valueOf(A3839CcoCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV90Ccstkswwds_1_filterfulltext ,
                                           A3909ValorE ,
                                           A3910ValorS ,
                                           A3916ValorEI ,
                                           A3917ValorSI ,
                                           AV132Ccstkswwds_43_tfvalore ,
                                           AV133Ccstkswwds_44_tfvalore_to ,
                                           AV134Ccstkswwds_45_tfvalors ,
                                           AV135Ccstkswwds_46_tfvalors_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV90Ccstkswwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV90Ccstkswwds_1_filterfulltext), "%", "") ;
      lV91Ccstkswwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV91Ccstkswwds_2_tfemprcod), 3, "%") ;
      lV93Ccstkswwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV93Ccstkswwds_4_tfprdnum), 6, "%") ;
      lV101Ccstkswwds_12_tftipmovcc = GXutil.padr( GXutil.rtrim( AV101Ccstkswwds_12_tftipmovcc), 2, "%") ;
      lV103Ccstkswwds_14_tftipmovcn = GXutil.padr( GXutil.rtrim( AV103Ccstkswwds_14_tftipmovcn), 30, "%") ;
      lV105Ccstkswwds_16_tfccstkpri = GXutil.padr( GXutil.rtrim( AV105Ccstkswwds_16_tfccstkpri), 1, "%") ;
      lV114Ccstkswwds_25_tfccstkpar = GXutil.padr( GXutil.rtrim( AV114Ccstkswwds_25_tfccstkpar), 1, "%") ;
      lV118Ccstkswwds_29_tfccstkalb = GXutil.padr( GXutil.rtrim( AV118Ccstkswwds_29_tfccstkalb), 10, "%") ;
      lV120Ccstkswwds_31_tfccstkusu = GXutil.padr( GXutil.rtrim( AV120Ccstkswwds_31_tfccstkusu), 8, "%") ;
      lV122Ccstkswwds_33_tfccstkhor = GXutil.padr( GXutil.rtrim( AV122Ccstkswwds_33_tfccstkhor), 8, "%") ;
      lV124Ccstkswwds_35_tfccstkdsc = GXutil.padr( GXutil.rtrim( AV124Ccstkswwds_35_tfccstkdsc), 30, "%") ;
      /* Using cursor H01RT5 */
      pr_default.execute(1, new Object[] {AV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, lV90Ccstkswwds_1_filterfulltext, AV132Ccstkswwds_43_tfvalore, AV132Ccstkswwds_43_tfvalore, AV133Ccstkswwds_44_tfvalore_to, AV133Ccstkswwds_44_tfvalore_to, AV134Ccstkswwds_45_tfvalors, AV134Ccstkswwds_45_tfvalors, AV135Ccstkswwds_46_tfvalors_to, AV135Ccstkswwds_46_tfvalors_to, lV91Ccstkswwds_2_tfemprcod, AV92Ccstkswwds_3_tfemprcod_sel, lV93Ccstkswwds_4_tfprdnum, AV94Ccstkswwds_5_tfprdnum_sel, Long.valueOf(AV95Ccstkswwds_6_tfccstklin), Long.valueOf(AV96Ccstkswwds_7_tfccstklin_to), AV97Ccstkswwds_8_tfccstkcane, AV98Ccstkswwds_9_tfccstkcane_to, AV99Ccstkswwds_10_tfccstkcans, AV100Ccstkswwds_11_tfccstkcans_to, lV101Ccstkswwds_12_tftipmovcc, AV102Ccstkswwds_13_tftipmovcc_sel, lV103Ccstkswwds_14_tftipmovcn, AV104Ccstkswwds_15_tftipmovcn_sel, lV105Ccstkswwds_16_tfccstkpri, AV106Ccstkswwds_17_tfccstkpri_sel, AV107Ccstkswwds_18_tfccstkfec, AV108Ccstkswwds_19_tfccstkpre, AV109Ccstkswwds_20_tfccstkpre_to, Integer.valueOf(AV110Ccstkswwds_21_tfccstkbar), Integer.valueOf(AV111Ccstkswwds_22_tfccstkbar_to), Byte.valueOf(AV112Ccstkswwds_23_tfccstkreo), Byte.valueOf(AV113Ccstkswwds_24_tfccstkreo_to), lV114Ccstkswwds_25_tfccstkpar, AV115Ccstkswwds_26_tfccstkpar_sel, Integer.valueOf(AV116Ccstkswwds_27_tfccstkped), Integer.valueOf(AV117Ccstkswwds_28_tfccstkped_to), lV118Ccstkswwds_29_tfccstkalb, AV119Ccstkswwds_30_tfccstkalb_sel, lV120Ccstkswwds_31_tfccstkusu, AV121Ccstkswwds_32_tfccstkusu_sel, lV122Ccstkswwds_33_tfccstkhor, AV123Ccstkswwds_34_tfccstkhor_sel, lV124Ccstkswwds_35_tfccstkdsc, AV125Ccstkswwds_36_tfccstkdsc_sel, Short.valueOf(AV126Ccstkswwds_37_tfccstklen), Short.valueOf(AV127Ccstkswwds_38_tfccstklen_to), AV128Ccstkswwds_39_tfprdexialm, AV129Ccstkswwds_40_tfprdexialm_to, Short.valueOf(AV130Ccstkswwds_41_tfccocod), Short.valueOf(AV131Ccstkswwds_42_tfccocod_to), AV136Ccstkswwds_47_tfvalorei, AV137Ccstkswwds_48_tfvalorei_to, AV138Ccstkswwds_49_tfvalorsi, AV139Ccstkswwds_50_tfvalorsi_to});
      GRID_nRecordCount = H01RT5_AGRID_nRecordCount[0] ;
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
      AV90Ccstkswwds_1_filterfulltext = AV15FilterFullText ;
      AV91Ccstkswwds_2_tfemprcod = AV26TFEmprCod ;
      AV92Ccstkswwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV93Ccstkswwds_4_tfprdnum = AV28TFPrdNum ;
      AV94Ccstkswwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV95Ccstkswwds_6_tfccstklin = AV30TFCCStkLin ;
      AV96Ccstkswwds_7_tfccstklin_to = AV31TFCCStkLin_To ;
      AV97Ccstkswwds_8_tfccstkcane = AV32TFCCStkCanE ;
      AV98Ccstkswwds_9_tfccstkcane_to = AV33TFCCStkCanE_To ;
      AV99Ccstkswwds_10_tfccstkcans = AV34TFCCStkCanS ;
      AV100Ccstkswwds_11_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV101Ccstkswwds_12_tftipmovcc = AV36TFTipMovCc ;
      AV102Ccstkswwds_13_tftipmovcc_sel = AV37TFTipMovCc_Sel ;
      AV103Ccstkswwds_14_tftipmovcn = AV38TFTipMovCn ;
      AV104Ccstkswwds_15_tftipmovcn_sel = AV39TFTipMovCn_Sel ;
      AV105Ccstkswwds_16_tfccstkpri = AV40TFCCStkPri ;
      AV106Ccstkswwds_17_tfccstkpri_sel = AV41TFCCStkPri_Sel ;
      AV107Ccstkswwds_18_tfccstkfec = AV42TFCCStkFec ;
      AV108Ccstkswwds_19_tfccstkpre = AV46TFCCStkPre ;
      AV109Ccstkswwds_20_tfccstkpre_to = AV47TFCCStkPre_To ;
      AV110Ccstkswwds_21_tfccstkbar = AV48TFCCStkBar ;
      AV111Ccstkswwds_22_tfccstkbar_to = AV49TFCCStkBar_To ;
      AV112Ccstkswwds_23_tfccstkreo = AV50TFCCStkReo ;
      AV113Ccstkswwds_24_tfccstkreo_to = AV51TFCCStkReo_To ;
      AV114Ccstkswwds_25_tfccstkpar = AV52TFCCStkPar ;
      AV115Ccstkswwds_26_tfccstkpar_sel = AV53TFCCStkPar_Sel ;
      AV116Ccstkswwds_27_tfccstkped = AV54TFCCStkPed ;
      AV117Ccstkswwds_28_tfccstkped_to = AV55TFCCStkPed_To ;
      AV118Ccstkswwds_29_tfccstkalb = AV56TFCCStkAlb ;
      AV119Ccstkswwds_30_tfccstkalb_sel = AV57TFCCStkAlb_Sel ;
      AV120Ccstkswwds_31_tfccstkusu = AV58TFCCStkUsu ;
      AV121Ccstkswwds_32_tfccstkusu_sel = AV59TFCCStkUsu_Sel ;
      AV122Ccstkswwds_33_tfccstkhor = AV60TFCCStkHor ;
      AV123Ccstkswwds_34_tfccstkhor_sel = AV61TFCCStkHor_Sel ;
      AV124Ccstkswwds_35_tfccstkdsc = AV62TFCCStkDsc ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = AV63TFCCStkDsc_Sel ;
      AV126Ccstkswwds_37_tfccstklen = AV64TFCCStkLen ;
      AV127Ccstkswwds_38_tfccstklen_to = AV65TFCCStkLen_To ;
      AV128Ccstkswwds_39_tfprdexialm = AV66TFPrdExiAlm ;
      AV129Ccstkswwds_40_tfprdexialm_to = AV67TFPrdExiAlm_To ;
      AV130Ccstkswwds_41_tfccocod = AV68TFCcoCod ;
      AV131Ccstkswwds_42_tfccocod_to = AV69TFCcoCod_To ;
      AV132Ccstkswwds_43_tfvalore = AV70TFValorE ;
      AV133Ccstkswwds_44_tfvalore_to = AV71TFValorE_To ;
      AV134Ccstkswwds_45_tfvalors = AV72TFValorS ;
      AV135Ccstkswwds_46_tfvalors_to = AV73TFValorS_To ;
      AV136Ccstkswwds_47_tfvalorei = AV74TFValorEI ;
      AV137Ccstkswwds_48_tfvalorei_to = AV75TFValorEI_To ;
      AV138Ccstkswwds_49_tfvalorsi = AV76TFValorSI ;
      AV139Ccstkswwds_50_tfvalorsi_to = AV77TFValorSI_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFCCStkLin, AV31TFCCStkLin_To, AV32TFCCStkCanE, AV33TFCCStkCanE_To, AV34TFCCStkCanS, AV35TFCCStkCanS_To, AV36TFTipMovCc, AV37TFTipMovCc_Sel, AV38TFTipMovCn, AV39TFTipMovCn_Sel, AV40TFCCStkPri, AV41TFCCStkPri_Sel, AV42TFCCStkFec, AV46TFCCStkPre, AV47TFCCStkPre_To, AV48TFCCStkBar, AV49TFCCStkBar_To, AV50TFCCStkReo, AV51TFCCStkReo_To, AV52TFCCStkPar, AV53TFCCStkPar_Sel, AV54TFCCStkPed, AV55TFCCStkPed_To, AV56TFCCStkAlb, AV57TFCCStkAlb_Sel, AV58TFCCStkUsu, AV59TFCCStkUsu_Sel, AV60TFCCStkHor, AV61TFCCStkHor_Sel, AV62TFCCStkDsc, AV63TFCCStkDsc_Sel, AV64TFCCStkLen, AV65TFCCStkLen_To, AV66TFPrdExiAlm, AV67TFPrdExiAlm_To, AV68TFCcoCod, AV69TFCcoCod_To, AV70TFValorE, AV71TFValorE_To, AV72TFValorS, AV73TFValorS_To, AV74TFValorEI, AV75TFValorEI_To, AV76TFValorSI, AV77TFValorSI_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV90Ccstkswwds_1_filterfulltext = AV15FilterFullText ;
      AV91Ccstkswwds_2_tfemprcod = AV26TFEmprCod ;
      AV92Ccstkswwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV93Ccstkswwds_4_tfprdnum = AV28TFPrdNum ;
      AV94Ccstkswwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV95Ccstkswwds_6_tfccstklin = AV30TFCCStkLin ;
      AV96Ccstkswwds_7_tfccstklin_to = AV31TFCCStkLin_To ;
      AV97Ccstkswwds_8_tfccstkcane = AV32TFCCStkCanE ;
      AV98Ccstkswwds_9_tfccstkcane_to = AV33TFCCStkCanE_To ;
      AV99Ccstkswwds_10_tfccstkcans = AV34TFCCStkCanS ;
      AV100Ccstkswwds_11_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV101Ccstkswwds_12_tftipmovcc = AV36TFTipMovCc ;
      AV102Ccstkswwds_13_tftipmovcc_sel = AV37TFTipMovCc_Sel ;
      AV103Ccstkswwds_14_tftipmovcn = AV38TFTipMovCn ;
      AV104Ccstkswwds_15_tftipmovcn_sel = AV39TFTipMovCn_Sel ;
      AV105Ccstkswwds_16_tfccstkpri = AV40TFCCStkPri ;
      AV106Ccstkswwds_17_tfccstkpri_sel = AV41TFCCStkPri_Sel ;
      AV107Ccstkswwds_18_tfccstkfec = AV42TFCCStkFec ;
      AV108Ccstkswwds_19_tfccstkpre = AV46TFCCStkPre ;
      AV109Ccstkswwds_20_tfccstkpre_to = AV47TFCCStkPre_To ;
      AV110Ccstkswwds_21_tfccstkbar = AV48TFCCStkBar ;
      AV111Ccstkswwds_22_tfccstkbar_to = AV49TFCCStkBar_To ;
      AV112Ccstkswwds_23_tfccstkreo = AV50TFCCStkReo ;
      AV113Ccstkswwds_24_tfccstkreo_to = AV51TFCCStkReo_To ;
      AV114Ccstkswwds_25_tfccstkpar = AV52TFCCStkPar ;
      AV115Ccstkswwds_26_tfccstkpar_sel = AV53TFCCStkPar_Sel ;
      AV116Ccstkswwds_27_tfccstkped = AV54TFCCStkPed ;
      AV117Ccstkswwds_28_tfccstkped_to = AV55TFCCStkPed_To ;
      AV118Ccstkswwds_29_tfccstkalb = AV56TFCCStkAlb ;
      AV119Ccstkswwds_30_tfccstkalb_sel = AV57TFCCStkAlb_Sel ;
      AV120Ccstkswwds_31_tfccstkusu = AV58TFCCStkUsu ;
      AV121Ccstkswwds_32_tfccstkusu_sel = AV59TFCCStkUsu_Sel ;
      AV122Ccstkswwds_33_tfccstkhor = AV60TFCCStkHor ;
      AV123Ccstkswwds_34_tfccstkhor_sel = AV61TFCCStkHor_Sel ;
      AV124Ccstkswwds_35_tfccstkdsc = AV62TFCCStkDsc ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = AV63TFCCStkDsc_Sel ;
      AV126Ccstkswwds_37_tfccstklen = AV64TFCCStkLen ;
      AV127Ccstkswwds_38_tfccstklen_to = AV65TFCCStkLen_To ;
      AV128Ccstkswwds_39_tfprdexialm = AV66TFPrdExiAlm ;
      AV129Ccstkswwds_40_tfprdexialm_to = AV67TFPrdExiAlm_To ;
      AV130Ccstkswwds_41_tfccocod = AV68TFCcoCod ;
      AV131Ccstkswwds_42_tfccocod_to = AV69TFCcoCod_To ;
      AV132Ccstkswwds_43_tfvalore = AV70TFValorE ;
      AV133Ccstkswwds_44_tfvalore_to = AV71TFValorE_To ;
      AV134Ccstkswwds_45_tfvalors = AV72TFValorS ;
      AV135Ccstkswwds_46_tfvalors_to = AV73TFValorS_To ;
      AV136Ccstkswwds_47_tfvalorei = AV74TFValorEI ;
      AV137Ccstkswwds_48_tfvalorei_to = AV75TFValorEI_To ;
      AV138Ccstkswwds_49_tfvalorsi = AV76TFValorSI ;
      AV139Ccstkswwds_50_tfvalorsi_to = AV77TFValorSI_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFCCStkLin, AV31TFCCStkLin_To, AV32TFCCStkCanE, AV33TFCCStkCanE_To, AV34TFCCStkCanS, AV35TFCCStkCanS_To, AV36TFTipMovCc, AV37TFTipMovCc_Sel, AV38TFTipMovCn, AV39TFTipMovCn_Sel, AV40TFCCStkPri, AV41TFCCStkPri_Sel, AV42TFCCStkFec, AV46TFCCStkPre, AV47TFCCStkPre_To, AV48TFCCStkBar, AV49TFCCStkBar_To, AV50TFCCStkReo, AV51TFCCStkReo_To, AV52TFCCStkPar, AV53TFCCStkPar_Sel, AV54TFCCStkPed, AV55TFCCStkPed_To, AV56TFCCStkAlb, AV57TFCCStkAlb_Sel, AV58TFCCStkUsu, AV59TFCCStkUsu_Sel, AV60TFCCStkHor, AV61TFCCStkHor_Sel, AV62TFCCStkDsc, AV63TFCCStkDsc_Sel, AV64TFCCStkLen, AV65TFCCStkLen_To, AV66TFPrdExiAlm, AV67TFPrdExiAlm_To, AV68TFCcoCod, AV69TFCcoCod_To, AV70TFValorE, AV71TFValorE_To, AV72TFValorS, AV73TFValorS_To, AV74TFValorEI, AV75TFValorEI_To, AV76TFValorSI, AV77TFValorSI_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV90Ccstkswwds_1_filterfulltext = AV15FilterFullText ;
      AV91Ccstkswwds_2_tfemprcod = AV26TFEmprCod ;
      AV92Ccstkswwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV93Ccstkswwds_4_tfprdnum = AV28TFPrdNum ;
      AV94Ccstkswwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV95Ccstkswwds_6_tfccstklin = AV30TFCCStkLin ;
      AV96Ccstkswwds_7_tfccstklin_to = AV31TFCCStkLin_To ;
      AV97Ccstkswwds_8_tfccstkcane = AV32TFCCStkCanE ;
      AV98Ccstkswwds_9_tfccstkcane_to = AV33TFCCStkCanE_To ;
      AV99Ccstkswwds_10_tfccstkcans = AV34TFCCStkCanS ;
      AV100Ccstkswwds_11_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV101Ccstkswwds_12_tftipmovcc = AV36TFTipMovCc ;
      AV102Ccstkswwds_13_tftipmovcc_sel = AV37TFTipMovCc_Sel ;
      AV103Ccstkswwds_14_tftipmovcn = AV38TFTipMovCn ;
      AV104Ccstkswwds_15_tftipmovcn_sel = AV39TFTipMovCn_Sel ;
      AV105Ccstkswwds_16_tfccstkpri = AV40TFCCStkPri ;
      AV106Ccstkswwds_17_tfccstkpri_sel = AV41TFCCStkPri_Sel ;
      AV107Ccstkswwds_18_tfccstkfec = AV42TFCCStkFec ;
      AV108Ccstkswwds_19_tfccstkpre = AV46TFCCStkPre ;
      AV109Ccstkswwds_20_tfccstkpre_to = AV47TFCCStkPre_To ;
      AV110Ccstkswwds_21_tfccstkbar = AV48TFCCStkBar ;
      AV111Ccstkswwds_22_tfccstkbar_to = AV49TFCCStkBar_To ;
      AV112Ccstkswwds_23_tfccstkreo = AV50TFCCStkReo ;
      AV113Ccstkswwds_24_tfccstkreo_to = AV51TFCCStkReo_To ;
      AV114Ccstkswwds_25_tfccstkpar = AV52TFCCStkPar ;
      AV115Ccstkswwds_26_tfccstkpar_sel = AV53TFCCStkPar_Sel ;
      AV116Ccstkswwds_27_tfccstkped = AV54TFCCStkPed ;
      AV117Ccstkswwds_28_tfccstkped_to = AV55TFCCStkPed_To ;
      AV118Ccstkswwds_29_tfccstkalb = AV56TFCCStkAlb ;
      AV119Ccstkswwds_30_tfccstkalb_sel = AV57TFCCStkAlb_Sel ;
      AV120Ccstkswwds_31_tfccstkusu = AV58TFCCStkUsu ;
      AV121Ccstkswwds_32_tfccstkusu_sel = AV59TFCCStkUsu_Sel ;
      AV122Ccstkswwds_33_tfccstkhor = AV60TFCCStkHor ;
      AV123Ccstkswwds_34_tfccstkhor_sel = AV61TFCCStkHor_Sel ;
      AV124Ccstkswwds_35_tfccstkdsc = AV62TFCCStkDsc ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = AV63TFCCStkDsc_Sel ;
      AV126Ccstkswwds_37_tfccstklen = AV64TFCCStkLen ;
      AV127Ccstkswwds_38_tfccstklen_to = AV65TFCCStkLen_To ;
      AV128Ccstkswwds_39_tfprdexialm = AV66TFPrdExiAlm ;
      AV129Ccstkswwds_40_tfprdexialm_to = AV67TFPrdExiAlm_To ;
      AV130Ccstkswwds_41_tfccocod = AV68TFCcoCod ;
      AV131Ccstkswwds_42_tfccocod_to = AV69TFCcoCod_To ;
      AV132Ccstkswwds_43_tfvalore = AV70TFValorE ;
      AV133Ccstkswwds_44_tfvalore_to = AV71TFValorE_To ;
      AV134Ccstkswwds_45_tfvalors = AV72TFValorS ;
      AV135Ccstkswwds_46_tfvalors_to = AV73TFValorS_To ;
      AV136Ccstkswwds_47_tfvalorei = AV74TFValorEI ;
      AV137Ccstkswwds_48_tfvalorei_to = AV75TFValorEI_To ;
      AV138Ccstkswwds_49_tfvalorsi = AV76TFValorSI ;
      AV139Ccstkswwds_50_tfvalorsi_to = AV77TFValorSI_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFCCStkLin, AV31TFCCStkLin_To, AV32TFCCStkCanE, AV33TFCCStkCanE_To, AV34TFCCStkCanS, AV35TFCCStkCanS_To, AV36TFTipMovCc, AV37TFTipMovCc_Sel, AV38TFTipMovCn, AV39TFTipMovCn_Sel, AV40TFCCStkPri, AV41TFCCStkPri_Sel, AV42TFCCStkFec, AV46TFCCStkPre, AV47TFCCStkPre_To, AV48TFCCStkBar, AV49TFCCStkBar_To, AV50TFCCStkReo, AV51TFCCStkReo_To, AV52TFCCStkPar, AV53TFCCStkPar_Sel, AV54TFCCStkPed, AV55TFCCStkPed_To, AV56TFCCStkAlb, AV57TFCCStkAlb_Sel, AV58TFCCStkUsu, AV59TFCCStkUsu_Sel, AV60TFCCStkHor, AV61TFCCStkHor_Sel, AV62TFCCStkDsc, AV63TFCCStkDsc_Sel, AV64TFCCStkLen, AV65TFCCStkLen_To, AV66TFPrdExiAlm, AV67TFPrdExiAlm_To, AV68TFCcoCod, AV69TFCcoCod_To, AV70TFValorE, AV71TFValorE_To, AV72TFValorS, AV73TFValorS_To, AV74TFValorEI, AV75TFValorEI_To, AV76TFValorSI, AV77TFValorSI_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV90Ccstkswwds_1_filterfulltext = AV15FilterFullText ;
      AV91Ccstkswwds_2_tfemprcod = AV26TFEmprCod ;
      AV92Ccstkswwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV93Ccstkswwds_4_tfprdnum = AV28TFPrdNum ;
      AV94Ccstkswwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV95Ccstkswwds_6_tfccstklin = AV30TFCCStkLin ;
      AV96Ccstkswwds_7_tfccstklin_to = AV31TFCCStkLin_To ;
      AV97Ccstkswwds_8_tfccstkcane = AV32TFCCStkCanE ;
      AV98Ccstkswwds_9_tfccstkcane_to = AV33TFCCStkCanE_To ;
      AV99Ccstkswwds_10_tfccstkcans = AV34TFCCStkCanS ;
      AV100Ccstkswwds_11_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV101Ccstkswwds_12_tftipmovcc = AV36TFTipMovCc ;
      AV102Ccstkswwds_13_tftipmovcc_sel = AV37TFTipMovCc_Sel ;
      AV103Ccstkswwds_14_tftipmovcn = AV38TFTipMovCn ;
      AV104Ccstkswwds_15_tftipmovcn_sel = AV39TFTipMovCn_Sel ;
      AV105Ccstkswwds_16_tfccstkpri = AV40TFCCStkPri ;
      AV106Ccstkswwds_17_tfccstkpri_sel = AV41TFCCStkPri_Sel ;
      AV107Ccstkswwds_18_tfccstkfec = AV42TFCCStkFec ;
      AV108Ccstkswwds_19_tfccstkpre = AV46TFCCStkPre ;
      AV109Ccstkswwds_20_tfccstkpre_to = AV47TFCCStkPre_To ;
      AV110Ccstkswwds_21_tfccstkbar = AV48TFCCStkBar ;
      AV111Ccstkswwds_22_tfccstkbar_to = AV49TFCCStkBar_To ;
      AV112Ccstkswwds_23_tfccstkreo = AV50TFCCStkReo ;
      AV113Ccstkswwds_24_tfccstkreo_to = AV51TFCCStkReo_To ;
      AV114Ccstkswwds_25_tfccstkpar = AV52TFCCStkPar ;
      AV115Ccstkswwds_26_tfccstkpar_sel = AV53TFCCStkPar_Sel ;
      AV116Ccstkswwds_27_tfccstkped = AV54TFCCStkPed ;
      AV117Ccstkswwds_28_tfccstkped_to = AV55TFCCStkPed_To ;
      AV118Ccstkswwds_29_tfccstkalb = AV56TFCCStkAlb ;
      AV119Ccstkswwds_30_tfccstkalb_sel = AV57TFCCStkAlb_Sel ;
      AV120Ccstkswwds_31_tfccstkusu = AV58TFCCStkUsu ;
      AV121Ccstkswwds_32_tfccstkusu_sel = AV59TFCCStkUsu_Sel ;
      AV122Ccstkswwds_33_tfccstkhor = AV60TFCCStkHor ;
      AV123Ccstkswwds_34_tfccstkhor_sel = AV61TFCCStkHor_Sel ;
      AV124Ccstkswwds_35_tfccstkdsc = AV62TFCCStkDsc ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = AV63TFCCStkDsc_Sel ;
      AV126Ccstkswwds_37_tfccstklen = AV64TFCCStkLen ;
      AV127Ccstkswwds_38_tfccstklen_to = AV65TFCCStkLen_To ;
      AV128Ccstkswwds_39_tfprdexialm = AV66TFPrdExiAlm ;
      AV129Ccstkswwds_40_tfprdexialm_to = AV67TFPrdExiAlm_To ;
      AV130Ccstkswwds_41_tfccocod = AV68TFCcoCod ;
      AV131Ccstkswwds_42_tfccocod_to = AV69TFCcoCod_To ;
      AV132Ccstkswwds_43_tfvalore = AV70TFValorE ;
      AV133Ccstkswwds_44_tfvalore_to = AV71TFValorE_To ;
      AV134Ccstkswwds_45_tfvalors = AV72TFValorS ;
      AV135Ccstkswwds_46_tfvalors_to = AV73TFValorS_To ;
      AV136Ccstkswwds_47_tfvalorei = AV74TFValorEI ;
      AV137Ccstkswwds_48_tfvalorei_to = AV75TFValorEI_To ;
      AV138Ccstkswwds_49_tfvalorsi = AV76TFValorSI ;
      AV139Ccstkswwds_50_tfvalorsi_to = AV77TFValorSI_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFCCStkLin, AV31TFCCStkLin_To, AV32TFCCStkCanE, AV33TFCCStkCanE_To, AV34TFCCStkCanS, AV35TFCCStkCanS_To, AV36TFTipMovCc, AV37TFTipMovCc_Sel, AV38TFTipMovCn, AV39TFTipMovCn_Sel, AV40TFCCStkPri, AV41TFCCStkPri_Sel, AV42TFCCStkFec, AV46TFCCStkPre, AV47TFCCStkPre_To, AV48TFCCStkBar, AV49TFCCStkBar_To, AV50TFCCStkReo, AV51TFCCStkReo_To, AV52TFCCStkPar, AV53TFCCStkPar_Sel, AV54TFCCStkPed, AV55TFCCStkPed_To, AV56TFCCStkAlb, AV57TFCCStkAlb_Sel, AV58TFCCStkUsu, AV59TFCCStkUsu_Sel, AV60TFCCStkHor, AV61TFCCStkHor_Sel, AV62TFCCStkDsc, AV63TFCCStkDsc_Sel, AV64TFCCStkLen, AV65TFCCStkLen_To, AV66TFPrdExiAlm, AV67TFPrdExiAlm_To, AV68TFCcoCod, AV69TFCcoCod_To, AV70TFValorE, AV71TFValorE_To, AV72TFValorS, AV73TFValorS_To, AV74TFValorEI, AV75TFValorEI_To, AV76TFValorSI, AV77TFValorSI_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV90Ccstkswwds_1_filterfulltext = AV15FilterFullText ;
      AV91Ccstkswwds_2_tfemprcod = AV26TFEmprCod ;
      AV92Ccstkswwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV93Ccstkswwds_4_tfprdnum = AV28TFPrdNum ;
      AV94Ccstkswwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV95Ccstkswwds_6_tfccstklin = AV30TFCCStkLin ;
      AV96Ccstkswwds_7_tfccstklin_to = AV31TFCCStkLin_To ;
      AV97Ccstkswwds_8_tfccstkcane = AV32TFCCStkCanE ;
      AV98Ccstkswwds_9_tfccstkcane_to = AV33TFCCStkCanE_To ;
      AV99Ccstkswwds_10_tfccstkcans = AV34TFCCStkCanS ;
      AV100Ccstkswwds_11_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV101Ccstkswwds_12_tftipmovcc = AV36TFTipMovCc ;
      AV102Ccstkswwds_13_tftipmovcc_sel = AV37TFTipMovCc_Sel ;
      AV103Ccstkswwds_14_tftipmovcn = AV38TFTipMovCn ;
      AV104Ccstkswwds_15_tftipmovcn_sel = AV39TFTipMovCn_Sel ;
      AV105Ccstkswwds_16_tfccstkpri = AV40TFCCStkPri ;
      AV106Ccstkswwds_17_tfccstkpri_sel = AV41TFCCStkPri_Sel ;
      AV107Ccstkswwds_18_tfccstkfec = AV42TFCCStkFec ;
      AV108Ccstkswwds_19_tfccstkpre = AV46TFCCStkPre ;
      AV109Ccstkswwds_20_tfccstkpre_to = AV47TFCCStkPre_To ;
      AV110Ccstkswwds_21_tfccstkbar = AV48TFCCStkBar ;
      AV111Ccstkswwds_22_tfccstkbar_to = AV49TFCCStkBar_To ;
      AV112Ccstkswwds_23_tfccstkreo = AV50TFCCStkReo ;
      AV113Ccstkswwds_24_tfccstkreo_to = AV51TFCCStkReo_To ;
      AV114Ccstkswwds_25_tfccstkpar = AV52TFCCStkPar ;
      AV115Ccstkswwds_26_tfccstkpar_sel = AV53TFCCStkPar_Sel ;
      AV116Ccstkswwds_27_tfccstkped = AV54TFCCStkPed ;
      AV117Ccstkswwds_28_tfccstkped_to = AV55TFCCStkPed_To ;
      AV118Ccstkswwds_29_tfccstkalb = AV56TFCCStkAlb ;
      AV119Ccstkswwds_30_tfccstkalb_sel = AV57TFCCStkAlb_Sel ;
      AV120Ccstkswwds_31_tfccstkusu = AV58TFCCStkUsu ;
      AV121Ccstkswwds_32_tfccstkusu_sel = AV59TFCCStkUsu_Sel ;
      AV122Ccstkswwds_33_tfccstkhor = AV60TFCCStkHor ;
      AV123Ccstkswwds_34_tfccstkhor_sel = AV61TFCCStkHor_Sel ;
      AV124Ccstkswwds_35_tfccstkdsc = AV62TFCCStkDsc ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = AV63TFCCStkDsc_Sel ;
      AV126Ccstkswwds_37_tfccstklen = AV64TFCCStkLen ;
      AV127Ccstkswwds_38_tfccstklen_to = AV65TFCCStkLen_To ;
      AV128Ccstkswwds_39_tfprdexialm = AV66TFPrdExiAlm ;
      AV129Ccstkswwds_40_tfprdexialm_to = AV67TFPrdExiAlm_To ;
      AV130Ccstkswwds_41_tfccocod = AV68TFCcoCod ;
      AV131Ccstkswwds_42_tfccocod_to = AV69TFCcoCod_To ;
      AV132Ccstkswwds_43_tfvalore = AV70TFValorE ;
      AV133Ccstkswwds_44_tfvalore_to = AV71TFValorE_To ;
      AV134Ccstkswwds_45_tfvalors = AV72TFValorS ;
      AV135Ccstkswwds_46_tfvalors_to = AV73TFValorS_To ;
      AV136Ccstkswwds_47_tfvalorei = AV74TFValorEI ;
      AV137Ccstkswwds_48_tfvalorei_to = AV75TFValorEI_To ;
      AV138Ccstkswwds_49_tfvalorsi = AV76TFValorSI ;
      AV139Ccstkswwds_50_tfvalorsi_to = AV77TFValorSI_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV15FilterFullText, AV26TFEmprCod, AV27TFEmprCod_Sel, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFCCStkLin, AV31TFCCStkLin_To, AV32TFCCStkCanE, AV33TFCCStkCanE_To, AV34TFCCStkCanS, AV35TFCCStkCanS_To, AV36TFTipMovCc, AV37TFTipMovCc_Sel, AV38TFTipMovCn, AV39TFTipMovCn_Sel, AV40TFCCStkPri, AV41TFCCStkPri_Sel, AV42TFCCStkFec, AV46TFCCStkPre, AV47TFCCStkPre_To, AV48TFCCStkBar, AV49TFCCStkBar_To, AV50TFCCStkReo, AV51TFCCStkReo_To, AV52TFCCStkPar, AV53TFCCStkPar_Sel, AV54TFCCStkPed, AV55TFCCStkPed_To, AV56TFCCStkAlb, AV57TFCCStkAlb_Sel, AV58TFCCStkUsu, AV59TFCCStkUsu_Sel, AV60TFCCStkHor, AV61TFCCStkHor_Sel, AV62TFCCStkDsc, AV63TFCCStkDsc_Sel, AV64TFCCStkLen, AV65TFCCStkLen_To, AV66TFPrdExiAlm, AV67TFPrdExiAlm_To, AV68TFCcoCod, AV69TFCcoCod_To, AV70TFValorE, AV71TFValorE_To, AV72TFValorS, AV73TFValorS_To, AV74TFValorEI, AV75TFValorEI_To, AV76TFValorSI, AV77TFValorSI_To, AV85Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV85Pgmname = "CCSTKSWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1RT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201RT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV78DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV80GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV81GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         AV85Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_ccstkfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_CCSTKFECAUXDATE");
            GX_FocusControl = edtavDdo_ccstkfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44DDO_CCStkFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44DDO_CCStkFecAuxDate", localUtil.format(AV44DDO_CCStkFecAuxDate, "99/99/99"));
         }
         else
         {
            AV44DDO_CCStkFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_ccstkfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44DDO_CCStkFecAuxDate", localUtil.format(AV44DDO_CCStkFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CCSTKSWW");
         AV85Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV85Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ccstksww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e201RT2 ();
      if (returnInSub) return;
   }

   public void e201RT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV86Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ccstksww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV86Station = GXt_char1 ;
      GXv_char2[0] = AV87Emprcod ;
      GXv_char3[0] = AV88Emprnom ;
      GXv_char4[0] = AV89Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV86Station, GXv_char2, GXv_char3, GXv_char4) ;
      ccstksww_impl.this.AV87Emprcod = GXv_char2[0] ;
      ccstksww_impl.this.AV88Emprnom = GXv_char3[0] ;
      ccstksww_impl.this.AV89Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Tabla CCSTKS", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV78DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV78DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211RT2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
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
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("CCSTKSWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("CCSTKSWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkCanE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkCanE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkCanE_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkCanS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkCanS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkCanS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipMovCc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipMovCn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCn_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkPri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPri_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkFec_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPre_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkBar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkBar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkBar_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkReo_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPar_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkPed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkPed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkPed_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkAlb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkAlb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkAlb_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkUsu_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkUsu_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkUsu_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkHor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkHor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkHor_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCCStkLen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCStkLen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCStkLen_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCcoCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCcoCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCcoCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtValorE_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorE_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorE_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtValorS_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorS_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorS_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtValorEI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorEI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorEI_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtValorSI_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtValorSI_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValorSI_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV80GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridCurrentPage), 10, 0));
      AV81GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81GridPageCount), 10, 0));
      AV90Ccstkswwds_1_filterfulltext = AV15FilterFullText ;
      AV91Ccstkswwds_2_tfemprcod = AV26TFEmprCod ;
      AV92Ccstkswwds_3_tfemprcod_sel = AV27TFEmprCod_Sel ;
      AV93Ccstkswwds_4_tfprdnum = AV28TFPrdNum ;
      AV94Ccstkswwds_5_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV95Ccstkswwds_6_tfccstklin = AV30TFCCStkLin ;
      AV96Ccstkswwds_7_tfccstklin_to = AV31TFCCStkLin_To ;
      AV97Ccstkswwds_8_tfccstkcane = AV32TFCCStkCanE ;
      AV98Ccstkswwds_9_tfccstkcane_to = AV33TFCCStkCanE_To ;
      AV99Ccstkswwds_10_tfccstkcans = AV34TFCCStkCanS ;
      AV100Ccstkswwds_11_tfccstkcans_to = AV35TFCCStkCanS_To ;
      AV101Ccstkswwds_12_tftipmovcc = AV36TFTipMovCc ;
      AV102Ccstkswwds_13_tftipmovcc_sel = AV37TFTipMovCc_Sel ;
      AV103Ccstkswwds_14_tftipmovcn = AV38TFTipMovCn ;
      AV104Ccstkswwds_15_tftipmovcn_sel = AV39TFTipMovCn_Sel ;
      AV105Ccstkswwds_16_tfccstkpri = AV40TFCCStkPri ;
      AV106Ccstkswwds_17_tfccstkpri_sel = AV41TFCCStkPri_Sel ;
      AV107Ccstkswwds_18_tfccstkfec = AV42TFCCStkFec ;
      AV108Ccstkswwds_19_tfccstkpre = AV46TFCCStkPre ;
      AV109Ccstkswwds_20_tfccstkpre_to = AV47TFCCStkPre_To ;
      AV110Ccstkswwds_21_tfccstkbar = AV48TFCCStkBar ;
      AV111Ccstkswwds_22_tfccstkbar_to = AV49TFCCStkBar_To ;
      AV112Ccstkswwds_23_tfccstkreo = AV50TFCCStkReo ;
      AV113Ccstkswwds_24_tfccstkreo_to = AV51TFCCStkReo_To ;
      AV114Ccstkswwds_25_tfccstkpar = AV52TFCCStkPar ;
      AV115Ccstkswwds_26_tfccstkpar_sel = AV53TFCCStkPar_Sel ;
      AV116Ccstkswwds_27_tfccstkped = AV54TFCCStkPed ;
      AV117Ccstkswwds_28_tfccstkped_to = AV55TFCCStkPed_To ;
      AV118Ccstkswwds_29_tfccstkalb = AV56TFCCStkAlb ;
      AV119Ccstkswwds_30_tfccstkalb_sel = AV57TFCCStkAlb_Sel ;
      AV120Ccstkswwds_31_tfccstkusu = AV58TFCCStkUsu ;
      AV121Ccstkswwds_32_tfccstkusu_sel = AV59TFCCStkUsu_Sel ;
      AV122Ccstkswwds_33_tfccstkhor = AV60TFCCStkHor ;
      AV123Ccstkswwds_34_tfccstkhor_sel = AV61TFCCStkHor_Sel ;
      AV124Ccstkswwds_35_tfccstkdsc = AV62TFCCStkDsc ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = AV63TFCCStkDsc_Sel ;
      AV126Ccstkswwds_37_tfccstklen = AV64TFCCStkLen ;
      AV127Ccstkswwds_38_tfccstklen_to = AV65TFCCStkLen_To ;
      AV128Ccstkswwds_39_tfprdexialm = AV66TFPrdExiAlm ;
      AV129Ccstkswwds_40_tfprdexialm_to = AV67TFPrdExiAlm_To ;
      AV130Ccstkswwds_41_tfccocod = AV68TFCcoCod ;
      AV131Ccstkswwds_42_tfccocod_to = AV69TFCcoCod_To ;
      AV132Ccstkswwds_43_tfvalore = AV70TFValorE ;
      AV133Ccstkswwds_44_tfvalore_to = AV71TFValorE_To ;
      AV134Ccstkswwds_45_tfvalors = AV72TFValorS ;
      AV135Ccstkswwds_46_tfvalors_to = AV73TFValorS_To ;
      AV136Ccstkswwds_47_tfvalorei = AV74TFValorEI ;
      AV137Ccstkswwds_48_tfvalorei_to = AV75TFValorEI_To ;
      AV138Ccstkswwds_49_tfvalorsi = AV76TFValorSI ;
      AV139Ccstkswwds_50_tfvalorsi_to = AV77TFValorSI_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121RT2( )
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
         AV79PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV79PageToGo) ;
      }
   }

   public void e131RT2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141RT2( )
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
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV26TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
            AV27TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV28TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNum", AV28TFPrdNum);
            AV29TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkLin") == 0 )
         {
            AV30TFCCStkLin = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCCStkLin), 12, 0));
            AV31TFCCStkLin_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCCStkLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCCStkLin_To), 12, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkCanE") == 0 )
         {
            AV32TFCCStkCanE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCCStkCanE", GXutil.ltrimstr( AV32TFCCStkCanE, 12, 4));
            AV33TFCCStkCanE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCCStkCanE_To", GXutil.ltrimstr( AV33TFCCStkCanE_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkCanS") == 0 )
         {
            AV34TFCCStkCanS = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCCStkCanS", GXutil.ltrimstr( AV34TFCCStkCanS, 12, 4));
            AV35TFCCStkCanS_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCCStkCanS_To", GXutil.ltrimstr( AV35TFCCStkCanS_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipMovCc") == 0 )
         {
            AV36TFTipMovCc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFTipMovCc", AV36TFTipMovCc);
            AV37TFTipMovCc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFTipMovCc_Sel", AV37TFTipMovCc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipMovCn") == 0 )
         {
            AV38TFTipMovCn = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipMovCn", AV38TFTipMovCn);
            AV39TFTipMovCn_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipMovCn_Sel", AV39TFTipMovCn_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkPri") == 0 )
         {
            AV40TFCCStkPri = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCCStkPri", AV40TFCCStkPri);
            AV41TFCCStkPri_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCCStkPri_Sel", AV41TFCCStkPri_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkFec") == 0 )
         {
            AV42TFCCStkFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCCStkFec", localUtil.format(AV42TFCCStkFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkPre") == 0 )
         {
            AV46TFCCStkPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFCCStkPre", GXutil.ltrimstr( AV46TFCCStkPre, 14, 5));
            AV47TFCCStkPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCCStkPre_To", GXutil.ltrimstr( AV47TFCCStkPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkBar") == 0 )
         {
            AV48TFCCStkBar = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCCStkBar), 8, 0));
            AV49TFCCStkBar_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCCStkBar_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFCCStkBar_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkReo") == 0 )
         {
            AV50TFCCStkReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCCStkReo", GXutil.str( AV50TFCCStkReo, 1, 0));
            AV51TFCCStkReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCCStkReo_To", GXutil.str( AV51TFCCStkReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkPar") == 0 )
         {
            AV52TFCCStkPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCCStkPar", AV52TFCCStkPar);
            AV53TFCCStkPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCCStkPar_Sel", AV53TFCCStkPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkPed") == 0 )
         {
            AV54TFCCStkPed = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFCCStkPed), 8, 0));
            AV55TFCCStkPed_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCCStkPed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFCCStkPed_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkAlb") == 0 )
         {
            AV56TFCCStkAlb = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCCStkAlb", AV56TFCCStkAlb);
            AV57TFCCStkAlb_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCCStkAlb_Sel", AV57TFCCStkAlb_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkUsu") == 0 )
         {
            AV58TFCCStkUsu = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCCStkUsu", AV58TFCCStkUsu);
            AV59TFCCStkUsu_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCCStkUsu_Sel", AV59TFCCStkUsu_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkHor") == 0 )
         {
            AV60TFCCStkHor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCCStkHor", AV60TFCCStkHor);
            AV61TFCCStkHor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCCStkHor_Sel", AV61TFCCStkHor_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkDsc") == 0 )
         {
            AV62TFCCStkDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCCStkDsc", AV62TFCCStkDsc);
            AV63TFCCStkDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCCStkDsc_Sel", AV63TFCCStkDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CCStkLen") == 0 )
         {
            AV64TFCCStkLen = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCCStkLen), 4, 0));
            AV65TFCCStkLen_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCCStkLen_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCCStkLen_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV66TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdExiAlm", GXutil.ltrimstr( AV66TFPrdExiAlm, 12, 4));
            AV67TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdExiAlm_To", GXutil.ltrimstr( AV67TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CcoCod") == 0 )
         {
            AV68TFCcoCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCcoCod), 3, 0));
            AV69TFCcoCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFCcoCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFCcoCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValorE") == 0 )
         {
            AV70TFValorE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFValorE", GXutil.ltrimstr( AV70TFValorE, 11, 2));
            AV71TFValorE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFValorE_To", GXutil.ltrimstr( AV71TFValorE_To, 11, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValorS") == 0 )
         {
            AV72TFValorS = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFValorS", GXutil.ltrimstr( AV72TFValorS, 12, 2));
            AV73TFValorS_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFValorS_To", GXutil.ltrimstr( AV73TFValorS_To, 12, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValorEI") == 0 )
         {
            AV74TFValorEI = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFValorEI", GXutil.ltrimstr( AV74TFValorEI, 14, 5));
            AV75TFValorEI_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFValorEI_To", GXutil.ltrimstr( AV75TFValorEI_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValorSI") == 0 )
         {
            AV76TFValorSI = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFValorSI", GXutil.ltrimstr( AV76TFValorSI, 14, 5));
            AV77TFValorSI_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFValorSI_To", GXutil.ltrimstr( AV77TFValorSI_To, 14, 5));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221RT2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      edtCCStkCanE_Link = formatLink("app.ccstksview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A3342CCStkLin,12,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PrdNum","CCStkLin","TabCode"})  ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(45) ;
      }
      sendrow_452( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_45_Refreshing )
      {
         httpContext.doAjaxLoad(45, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV82GridActions, 4, 0)) );
   }

   public void e151RT2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "CCSTKSWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111RT2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CCSTKSWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV85Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CCSTKSWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CCSTKSWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         ccstksww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV85Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e161RT2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ccstks", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","PrdNum","CCStkLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e171RT2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.ccstkswwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      ccstksww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      ccstksww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
   }

   public void e181RT2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.ccstkswwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e191RT2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.ccstkswwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCod", "", "Código Empresa", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkLin", "", "Linea Movimiento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkCanE", "", "Cantidad Entrada", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkCanS", "", "Cantidad Salida", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipMovCc", "", "Codigo Tipo Movimiento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipMovCn", "", "Descripcion Tipo Movimiento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkPri", "", "CCStkPri", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkFec", "", "Fecha Movimiento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkPre", "", "Precio", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkBar", "", "Hoja de Ruta", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkReo", "", "Reoperado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkPar", "", "Particion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkPed", "", "Pedido", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkAlb", "", "Albaran", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkUsu", "", "Usuario", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkHor", "", "Hora", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CCStkLen", "", "Linea Entrada Almacen", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CcoCod", "", "CcoCod", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ValorE", "", "Valor Entradas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ValorS", "", "Valor salidas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ValorEI", "", "ValorEI", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ValorSI", "", "ValorSI", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CCSTKSWWColumnsSelector", GXv_char4) ;
      ccstksww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CCSTKSWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
      AV27TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
      AV28TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNum", AV28TFPrdNum);
      AV29TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
      AV30TFCCStkLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCCStkLin), 12, 0));
      AV31TFCCStkLin_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFCCStkLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCCStkLin_To), 12, 0));
      AV32TFCCStkCanE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFCCStkCanE", GXutil.ltrimstr( AV32TFCCStkCanE, 12, 4));
      AV33TFCCStkCanE_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFCCStkCanE_To", GXutil.ltrimstr( AV33TFCCStkCanE_To, 12, 4));
      AV34TFCCStkCanS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFCCStkCanS", GXutil.ltrimstr( AV34TFCCStkCanS, 12, 4));
      AV35TFCCStkCanS_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFCCStkCanS_To", GXutil.ltrimstr( AV35TFCCStkCanS_To, 12, 4));
      AV36TFTipMovCc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFTipMovCc", AV36TFTipMovCc);
      AV37TFTipMovCc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFTipMovCc_Sel", AV37TFTipMovCc_Sel);
      AV38TFTipMovCn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipMovCn", AV38TFTipMovCn);
      AV39TFTipMovCn_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipMovCn_Sel", AV39TFTipMovCn_Sel);
      AV40TFCCStkPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFCCStkPri", AV40TFCCStkPri);
      AV41TFCCStkPri_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFCCStkPri_Sel", AV41TFCCStkPri_Sel);
      AV42TFCCStkFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFCCStkFec", localUtil.format(AV42TFCCStkFec, "99/99/99"));
      AV46TFCCStkPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFCCStkPre", GXutil.ltrimstr( AV46TFCCStkPre, 14, 5));
      AV47TFCCStkPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFCCStkPre_To", GXutil.ltrimstr( AV47TFCCStkPre_To, 14, 5));
      AV48TFCCStkBar = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCCStkBar), 8, 0));
      AV49TFCCStkBar_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFCCStkBar_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFCCStkBar_To), 8, 0));
      AV50TFCCStkReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFCCStkReo", GXutil.str( AV50TFCCStkReo, 1, 0));
      AV51TFCCStkReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFCCStkReo_To", GXutil.str( AV51TFCCStkReo_To, 1, 0));
      AV52TFCCStkPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFCCStkPar", AV52TFCCStkPar);
      AV53TFCCStkPar_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFCCStkPar_Sel", AV53TFCCStkPar_Sel);
      AV54TFCCStkPed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFCCStkPed), 8, 0));
      AV55TFCCStkPed_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFCCStkPed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFCCStkPed_To), 8, 0));
      AV56TFCCStkAlb = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFCCStkAlb", AV56TFCCStkAlb);
      AV57TFCCStkAlb_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFCCStkAlb_Sel", AV57TFCCStkAlb_Sel);
      AV58TFCCStkUsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFCCStkUsu", AV58TFCCStkUsu);
      AV59TFCCStkUsu_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFCCStkUsu_Sel", AV59TFCCStkUsu_Sel);
      AV60TFCCStkHor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFCCStkHor", AV60TFCCStkHor);
      AV61TFCCStkHor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFCCStkHor_Sel", AV61TFCCStkHor_Sel);
      AV62TFCCStkDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFCCStkDsc", AV62TFCCStkDsc);
      AV63TFCCStkDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFCCStkDsc_Sel", AV63TFCCStkDsc_Sel);
      AV64TFCCStkLen = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCCStkLen), 4, 0));
      AV65TFCCStkLen_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFCCStkLen_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCCStkLen_To), 4, 0));
      AV66TFPrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdExiAlm", GXutil.ltrimstr( AV66TFPrdExiAlm, 12, 4));
      AV67TFPrdExiAlm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdExiAlm_To", GXutil.ltrimstr( AV67TFPrdExiAlm_To, 12, 4));
      AV68TFCcoCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCcoCod), 3, 0));
      AV69TFCcoCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFCcoCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFCcoCod_To), 3, 0));
      AV70TFValorE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFValorE", GXutil.ltrimstr( AV70TFValorE, 11, 2));
      AV71TFValorE_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFValorE_To", GXutil.ltrimstr( AV71TFValorE_To, 11, 2));
      AV72TFValorS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFValorS", GXutil.ltrimstr( AV72TFValorS, 12, 2));
      AV73TFValorS_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFValorS_To", GXutil.ltrimstr( AV73TFValorS_To, 12, 2));
      AV74TFValorEI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFValorEI", GXutil.ltrimstr( AV74TFValorEI, 14, 5));
      AV75TFValorEI_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFValorEI_To", GXutil.ltrimstr( AV75TFValorEI_To, 14, 5));
      AV76TFValorSI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFValorSI", GXutil.ltrimstr( AV76TFValorSI, 14, 5));
      AV77TFValorSI_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFValorSI_To", GXutil.ltrimstr( AV77TFValorSI_To, 14, 5));
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
      callWebObject(formatLink("app.ccstks", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A3342CCStkLin,12,0))}, new String[] {"Mode","EmprCod","PrdNum","CCStkLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ccstks", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.ltrimstr(A3342CCStkLin,12,0))}, new String[] {"Mode","EmprCod","PrdNum","CCStkLin"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV85Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV85Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV85Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
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
      AV140GXV1 = 1 ;
      while ( AV140GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV140GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV26TFEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFEmprCod", AV26TFEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV27TFEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFEmprCod_Sel", AV27TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV28TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNum", AV28TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV29TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLIN") == 0 )
         {
            AV30TFCCStkLin = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCCStkLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCCStkLin), 12, 0));
            AV31TFCCStkLin_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCCStkLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFCCStkLin_To), 12, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANE") == 0 )
         {
            AV32TFCCStkCanE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCCStkCanE", GXutil.ltrimstr( AV32TFCCStkCanE, 12, 4));
            AV33TFCCStkCanE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFCCStkCanE_To", GXutil.ltrimstr( AV33TFCCStkCanE_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKCANS") == 0 )
         {
            AV34TFCCStkCanS = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCCStkCanS", GXutil.ltrimstr( AV34TFCCStkCanS, 12, 4));
            AV35TFCCStkCanS_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCCStkCanS_To", GXutil.ltrimstr( AV35TFCCStkCanS_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC") == 0 )
         {
            AV36TFTipMovCc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFTipMovCc", AV36TFTipMovCc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCC_SEL") == 0 )
         {
            AV37TFTipMovCc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFTipMovCc_Sel", AV37TFTipMovCc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN") == 0 )
         {
            AV38TFTipMovCn = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFTipMovCn", AV38TFTipMovCn);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMOVCN_SEL") == 0 )
         {
            AV39TFTipMovCn_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFTipMovCn_Sel", AV39TFTipMovCn_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI") == 0 )
         {
            AV40TFCCStkPri = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFCCStkPri", AV40TFCCStkPri);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRI_SEL") == 0 )
         {
            AV41TFCCStkPri_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFCCStkPri_Sel", AV41TFCCStkPri_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKFEC") == 0 )
         {
            AV42TFCCStkFec = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFCCStkFec", localUtil.format(AV42TFCCStkFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPRE") == 0 )
         {
            AV46TFCCStkPre = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFCCStkPre", GXutil.ltrimstr( AV46TFCCStkPre, 14, 5));
            AV47TFCCStkPre_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFCCStkPre_To", GXutil.ltrimstr( AV47TFCCStkPre_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKBAR") == 0 )
         {
            AV48TFCCStkBar = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFCCStkBar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFCCStkBar), 8, 0));
            AV49TFCCStkBar_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCCStkBar_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFCCStkBar_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKREO") == 0 )
         {
            AV50TFCCStkReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCCStkReo", GXutil.str( AV50TFCCStkReo, 1, 0));
            AV51TFCCStkReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCCStkReo_To", GXutil.str( AV51TFCCStkReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR") == 0 )
         {
            AV52TFCCStkPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCCStkPar", AV52TFCCStkPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPAR_SEL") == 0 )
         {
            AV53TFCCStkPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFCCStkPar_Sel", AV53TFCCStkPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKPED") == 0 )
         {
            AV54TFCCStkPed = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFCCStkPed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54TFCCStkPed), 8, 0));
            AV55TFCCStkPed_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCCStkPed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFCCStkPed_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB") == 0 )
         {
            AV56TFCCStkAlb = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCCStkAlb", AV56TFCCStkAlb);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKALB_SEL") == 0 )
         {
            AV57TFCCStkAlb_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFCCStkAlb_Sel", AV57TFCCStkAlb_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU") == 0 )
         {
            AV58TFCCStkUsu = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFCCStkUsu", AV58TFCCStkUsu);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKUSU_SEL") == 0 )
         {
            AV59TFCCStkUsu_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFCCStkUsu_Sel", AV59TFCCStkUsu_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR") == 0 )
         {
            AV60TFCCStkHor = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFCCStkHor", AV60TFCCStkHor);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKHOR_SEL") == 0 )
         {
            AV61TFCCStkHor_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFCCStkHor_Sel", AV61TFCCStkHor_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC") == 0 )
         {
            AV62TFCCStkDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFCCStkDsc", AV62TFCCStkDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKDSC_SEL") == 0 )
         {
            AV63TFCCStkDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFCCStkDsc_Sel", AV63TFCCStkDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCSTKLEN") == 0 )
         {
            AV64TFCCStkLen = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFCCStkLen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFCCStkLen), 4, 0));
            AV65TFCCStkLen_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCCStkLen_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCCStkLen_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV66TFPrdExiAlm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdExiAlm", GXutil.ltrimstr( AV66TFPrdExiAlm, 12, 4));
            AV67TFPrdExiAlm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdExiAlm_To", GXutil.ltrimstr( AV67TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCCOCOD") == 0 )
         {
            AV68TFCcoCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCcoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68TFCcoCod), 3, 0));
            AV69TFCcoCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFCcoCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69TFCcoCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORE") == 0 )
         {
            AV70TFValorE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFValorE", GXutil.ltrimstr( AV70TFValorE, 11, 2));
            AV71TFValorE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFValorE_To", GXutil.ltrimstr( AV71TFValorE_To, 11, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORS") == 0 )
         {
            AV72TFValorS = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFValorS", GXutil.ltrimstr( AV72TFValorS, 12, 2));
            AV73TFValorS_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFValorS_To", GXutil.ltrimstr( AV73TFValorS_To, 12, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALOREI") == 0 )
         {
            AV74TFValorEI = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFValorEI", GXutil.ltrimstr( AV74TFValorEI, 14, 5));
            AV75TFValorEI_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFValorEI_To", GXutil.ltrimstr( AV75TFValorEI_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALORSI") == 0 )
         {
            AV76TFValorSI = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFValorSI", GXutil.ltrimstr( AV76TFValorSI, 14, 5));
            AV77TFValorSI_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFValorSI_To", GXutil.ltrimstr( AV77TFValorSI_To, 14, 5));
         }
         AV140GXV1 = (int)(AV140GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, GXv_char4) ;
      ccstksww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNum_Sel)==0), AV29TFPrdNum_Sel, GXv_char3) ;
      ccstksww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFTipMovCc_Sel)==0), AV37TFTipMovCc_Sel, GXv_char2) ;
      ccstksww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFTipMovCn_Sel)==0), AV39TFTipMovCn_Sel, GXv_char15) ;
      ccstksww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFCCStkPri_Sel)==0), AV41TFCCStkPri_Sel, GXv_char17) ;
      ccstksww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFCCStkPar_Sel)==0), AV53TFCCStkPar_Sel, GXv_char19) ;
      ccstksww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFCCStkAlb_Sel)==0), AV57TFCCStkAlb_Sel, GXv_char21) ;
      ccstksww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFCCStkUsu_Sel)==0), AV59TFCCStkUsu_Sel, GXv_char23) ;
      ccstksww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFCCStkHor_Sel)==0), AV61TFCCStkHor_Sel, GXv_char25) ;
      ccstksww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFCCStkDsc_Sel)==0), AV63TFCCStkDsc_Sel, GXv_char27) ;
      ccstksww_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"||||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|||||"+GXt_char18+"||"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFEmprCod)==0), AV26TFEmprCod, GXv_char27) ;
      ccstksww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNum)==0), AV28TFPrdNum, GXv_char25) ;
      ccstksww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFTipMovCc)==0), AV36TFTipMovCc, GXv_char23) ;
      ccstksww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFTipMovCn)==0), AV38TFTipMovCn, GXv_char21) ;
      ccstksww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFCCStkPri)==0), AV40TFCCStkPri, GXv_char19) ;
      ccstksww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFCCStkPar)==0), AV52TFCCStkPar, GXv_char17) ;
      ccstksww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFCCStkAlb)==0), AV56TFCCStkAlb, GXv_char15) ;
      ccstksww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFCCStkUsu)==0), AV58TFCCStkUsu, GXv_char4) ;
      ccstksww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFCCStkHor)==0), AV60TFCCStkHor, GXv_char3) ;
      ccstksww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFCCStkDsc)==0), AV62TFCCStkDsc, GXv_char2) ;
      ccstksww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char26+"|"+GXt_char24+"|"+((0==AV30TFCCStkLin) ? "" : GXutil.str( AV30TFCCStkLin, 12, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFCCStkCanE)==0) ? "" : GXutil.str( AV32TFCCStkCanE, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFCCStkCanS)==0) ? "" : GXutil.str( AV34TFCCStkCanS, 12, 4))+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFCCStkFec)) ? "" : localUtil.dtoc( AV42TFCCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFCCStkPre)==0) ? "" : GXutil.str( AV46TFCCStkPre, 14, 5))+"|"+((0==AV48TFCCStkBar) ? "" : GXutil.str( AV48TFCCStkBar, 8, 0))+"|"+((0==AV50TFCCStkReo) ? "" : GXutil.str( AV50TFCCStkReo, 1, 0))+"|"+GXt_char16+"|"+((0==AV54TFCCStkPed) ? "" : GXutil.str( AV54TFCCStkPed, 8, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((0==AV64TFCCStkLen) ? "" : GXutil.str( AV64TFCCStkLen, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdExiAlm)==0) ? "" : GXutil.str( AV66TFPrdExiAlm, 12, 4))+"|"+((0==AV68TFCcoCod) ? "" : GXutil.str( AV68TFCcoCod, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFValorE)==0) ? "" : GXutil.str( AV70TFValorE, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFValorS)==0) ? "" : GXutil.str( AV72TFValorS, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFValorEI)==0) ? "" : GXutil.str( AV74TFValorEI, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFValorSI)==0) ? "" : GXutil.str( AV76TFValorSI, 14, 5)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV31TFCCStkLin_To) ? "" : GXutil.str( AV31TFCCStkLin_To, 12, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFCCStkCanE_To)==0) ? "" : GXutil.str( AV33TFCCStkCanE_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFCCStkCanS_To)==0) ? "" : GXutil.str( AV35TFCCStkCanS_To, 12, 4))+"|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFCCStkPre_To)==0) ? "" : GXutil.str( AV47TFCCStkPre_To, 14, 5))+"|"+((0==AV49TFCCStkBar_To) ? "" : GXutil.str( AV49TFCCStkBar_To, 8, 0))+"|"+((0==AV51TFCCStkReo_To) ? "" : GXutil.str( AV51TFCCStkReo_To, 1, 0))+"||"+((0==AV55TFCCStkPed_To) ? "" : GXutil.str( AV55TFCCStkPed_To, 8, 0))+"|||||"+((0==AV65TFCCStkLen_To) ? "" : GXutil.str( AV65TFCCStkLen_To, 4, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV67TFPrdExiAlm_To, 12, 4))+"|"+((0==AV69TFCcoCod_To) ? "" : GXutil.str( AV69TFCcoCod_To, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFValorE_To)==0) ? "" : GXutil.str( AV71TFValorE_To, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFValorS_To)==0) ? "" : GXutil.str( AV73TFValorS_To, 12, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFValorEI_To)==0) ? "" : GXutil.str( AV75TFValorEI_To, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFValorSI_To)==0) ? "" : GXutil.str( AV77TFValorSI_To, 14, 5)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV85Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFEMPRCOD", "", !(GXutil.strcmp("", AV26TFEmprCod)==0), (short)(0), AV26TFEmprCod, "", !(GXutil.strcmp("", AV27TFEmprCod_Sel)==0), AV27TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPRDNUM", "", !(GXutil.strcmp("", AV28TFPrdNum)==0), (short)(0), AV28TFPrdNum, "", !(GXutil.strcmp("", AV29TFPrdNum_Sel)==0), AV29TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKLIN", "", !((0==AV30TFCCStkLin)&&(0==AV31TFCCStkLin_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFCCStkLin, 12, 0)), GXutil.trim( GXutil.str( AV31TFCCStkLin_To, 12, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKCANE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFCCStkCanE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFCCStkCanE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFCCStkCanE, 12, 4)), GXutil.trim( GXutil.str( AV33TFCCStkCanE_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKCANS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFCCStkCanS)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFCCStkCanS_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV34TFCCStkCanS, 12, 4)), GXutil.trim( GXutil.str( AV35TFCCStkCanS_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFTIPMOVCC", "", !(GXutil.strcmp("", AV36TFTipMovCc)==0), (short)(0), AV36TFTipMovCc, "", !(GXutil.strcmp("", AV37TFTipMovCc_Sel)==0), AV37TFTipMovCc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFTIPMOVCN", "", !(GXutil.strcmp("", AV38TFTipMovCn)==0), (short)(0), AV38TFTipMovCn, "", !(GXutil.strcmp("", AV39TFTipMovCn_Sel)==0), AV39TFTipMovCn_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKPRI", "", !(GXutil.strcmp("", AV40TFCCStkPri)==0), (short)(0), AV40TFCCStkPri, "", !(GXutil.strcmp("", AV41TFCCStkPri_Sel)==0), AV41TFCCStkPri_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42TFCCStkFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV42TFCCStkFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFCCStkPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFCCStkPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFCCStkPre, 14, 5)), GXutil.trim( GXutil.str( AV47TFCCStkPre_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKBAR", "", !((0==AV48TFCCStkBar)&&(0==AV49TFCCStkBar_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFCCStkBar, 8, 0)), GXutil.trim( GXutil.str( AV49TFCCStkBar_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKREO", "", !((0==AV50TFCCStkReo)&&(0==AV51TFCCStkReo_To)), (short)(0), GXutil.trim( GXutil.str( AV50TFCCStkReo, 1, 0)), GXutil.trim( GXutil.str( AV51TFCCStkReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKPAR", "", !(GXutil.strcmp("", AV52TFCCStkPar)==0), (short)(0), AV52TFCCStkPar, "", !(GXutil.strcmp("", AV53TFCCStkPar_Sel)==0), AV53TFCCStkPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKPED", "", !((0==AV54TFCCStkPed)&&(0==AV55TFCCStkPed_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFCCStkPed, 8, 0)), GXutil.trim( GXutil.str( AV55TFCCStkPed_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKALB", "", !(GXutil.strcmp("", AV56TFCCStkAlb)==0), (short)(0), AV56TFCCStkAlb, "", !(GXutil.strcmp("", AV57TFCCStkAlb_Sel)==0), AV57TFCCStkAlb_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKUSU", "", !(GXutil.strcmp("", AV58TFCCStkUsu)==0), (short)(0), AV58TFCCStkUsu, "", !(GXutil.strcmp("", AV59TFCCStkUsu_Sel)==0), AV59TFCCStkUsu_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKHOR", "", !(GXutil.strcmp("", AV60TFCCStkHor)==0), (short)(0), AV60TFCCStkHor, "", !(GXutil.strcmp("", AV61TFCCStkHor_Sel)==0), AV61TFCCStkHor_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKDSC", "", !(GXutil.strcmp("", AV62TFCCStkDsc)==0), (short)(0), AV62TFCCStkDsc, "", !(GXutil.strcmp("", AV63TFCCStkDsc_Sel)==0), AV63TFCCStkDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCSTKLEN", "", !((0==AV64TFCCStkLen)&&(0==AV65TFCCStkLen_To)), (short)(0), GXutil.trim( GXutil.str( AV64TFCCStkLen, 4, 0)), GXutil.trim( GXutil.str( AV65TFCCStkLen_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV67TFPrdExiAlm_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCCOCOD", "", !((0==AV68TFCcoCod)&&(0==AV69TFCcoCod_To)), (short)(0), GXutil.trim( GXutil.str( AV68TFCcoCod, 3, 0)), GXutil.trim( GXutil.str( AV69TFCcoCod_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFVALORE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFValorE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFValorE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV70TFValorE, 11, 2)), GXutil.trim( GXutil.str( AV71TFValorE_To, 11, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFVALORS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFValorS)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFValorS_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV72TFValorS, 12, 2)), GXutil.trim( GXutil.str( AV73TFValorS_To, 12, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFVALOREI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFValorEI)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFValorEI_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV74TFValorEI, 14, 5)), GXutil.trim( GXutil.str( AV75TFValorEI_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFVALORSI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFValorSI)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFValorSI_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV76TFValorSI, 14, 5)), GXutil.trim( GXutil.str( AV77TFValorSI_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV85Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV85Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "CCSTKS" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_1RT2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_1RT2( true) ;
      }
      else
      {
         wb_table2_32_1RT2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_1RT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1RT2e( true) ;
      }
      else
      {
         wb_table1_27_1RT2e( false) ;
      }
   }

   public void wb_table2_32_1RT2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CCSTKSWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_1RT2e( true) ;
      }
      else
      {
         wb_table2_32_1RT2e( false) ;
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
      pa1RT2( ) ;
      ws1RT2( ) ;
      we1RT2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614294", true, true);
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
      httpContext.AddJavascriptSource("ccstksww.js", "?20268211614295", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_idx ;
      edtCCStkLin_Internalname = "CCSTKLIN_"+sGXsfl_45_idx ;
      edtCCStkCanE_Internalname = "CCSTKCANE_"+sGXsfl_45_idx ;
      edtCCStkCanS_Internalname = "CCSTKCANS_"+sGXsfl_45_idx ;
      edtTipMovCc_Internalname = "TIPMOVCC_"+sGXsfl_45_idx ;
      edtTipMovCn_Internalname = "TIPMOVCN_"+sGXsfl_45_idx ;
      edtCCStkPri_Internalname = "CCSTKPRI_"+sGXsfl_45_idx ;
      edtCCStkFec_Internalname = "CCSTKFEC_"+sGXsfl_45_idx ;
      edtCCStkPre_Internalname = "CCSTKPRE_"+sGXsfl_45_idx ;
      edtCCStkBar_Internalname = "CCSTKBAR_"+sGXsfl_45_idx ;
      edtCCStkReo_Internalname = "CCSTKREO_"+sGXsfl_45_idx ;
      edtCCStkPar_Internalname = "CCSTKPAR_"+sGXsfl_45_idx ;
      edtCCStkPed_Internalname = "CCSTKPED_"+sGXsfl_45_idx ;
      edtCCStkAlb_Internalname = "CCSTKALB_"+sGXsfl_45_idx ;
      edtCCStkUsu_Internalname = "CCSTKUSU_"+sGXsfl_45_idx ;
      edtCCStkHor_Internalname = "CCSTKHOR_"+sGXsfl_45_idx ;
      edtCCStkDsc_Internalname = "CCSTKDSC_"+sGXsfl_45_idx ;
      edtCCStkLen_Internalname = "CCSTKLEN_"+sGXsfl_45_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_45_idx ;
      edtCcoCod_Internalname = "CCOCOD_"+sGXsfl_45_idx ;
      edtValorE_Internalname = "VALORE_"+sGXsfl_45_idx ;
      edtValorS_Internalname = "VALORS_"+sGXsfl_45_idx ;
      edtValorEI_Internalname = "VALOREI_"+sGXsfl_45_idx ;
      edtValorSI_Internalname = "VALORSI_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_fel_idx ;
      edtCCStkLin_Internalname = "CCSTKLIN_"+sGXsfl_45_fel_idx ;
      edtCCStkCanE_Internalname = "CCSTKCANE_"+sGXsfl_45_fel_idx ;
      edtCCStkCanS_Internalname = "CCSTKCANS_"+sGXsfl_45_fel_idx ;
      edtTipMovCc_Internalname = "TIPMOVCC_"+sGXsfl_45_fel_idx ;
      edtTipMovCn_Internalname = "TIPMOVCN_"+sGXsfl_45_fel_idx ;
      edtCCStkPri_Internalname = "CCSTKPRI_"+sGXsfl_45_fel_idx ;
      edtCCStkFec_Internalname = "CCSTKFEC_"+sGXsfl_45_fel_idx ;
      edtCCStkPre_Internalname = "CCSTKPRE_"+sGXsfl_45_fel_idx ;
      edtCCStkBar_Internalname = "CCSTKBAR_"+sGXsfl_45_fel_idx ;
      edtCCStkReo_Internalname = "CCSTKREO_"+sGXsfl_45_fel_idx ;
      edtCCStkPar_Internalname = "CCSTKPAR_"+sGXsfl_45_fel_idx ;
      edtCCStkPed_Internalname = "CCSTKPED_"+sGXsfl_45_fel_idx ;
      edtCCStkAlb_Internalname = "CCSTKALB_"+sGXsfl_45_fel_idx ;
      edtCCStkUsu_Internalname = "CCSTKUSU_"+sGXsfl_45_fel_idx ;
      edtCCStkHor_Internalname = "CCSTKHOR_"+sGXsfl_45_fel_idx ;
      edtCCStkDsc_Internalname = "CCSTKDSC_"+sGXsfl_45_fel_idx ;
      edtCCStkLen_Internalname = "CCSTKLEN_"+sGXsfl_45_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_45_fel_idx ;
      edtCcoCod_Internalname = "CCOCOD_"+sGXsfl_45_fel_idx ;
      edtValorE_Internalname = "VALORE_"+sGXsfl_45_fel_idx ;
      edtValorS_Internalname = "VALORS_"+sGXsfl_45_fel_idx ;
      edtValorEI_Internalname = "VALOREI_"+sGXsfl_45_fel_idx ;
      edtValorSI_Internalname = "VALORSI_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1RT0( ) ;
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
               AV82GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV82GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV82GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e231rt2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV82GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkLin_Internalname,GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3342CCStkLin), "ZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkCanE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkCanE_Internalname,GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3343CCStkCanE, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'",edtCCStkCanE_Link,"","","",edtCCStkCanE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCCStkCanE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkCanS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkCanS_Internalname,GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3344CCStkCanS, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkCanS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkCanS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipMovCc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMovCc_Internalname,GXutil.rtrim( A3345TipMovCc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMovCc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipMovCc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipMovCn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMovCn_Internalname,GXutil.rtrim( A3346TipMovCn),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMovCn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipMovCn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkPri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkPri_Internalname,GXutil.rtrim( A3347CCStkPri),GXutil.rtrim( localUtil.format( A3347CCStkPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkPri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkFec_Internalname,localUtil.format(A3348CCStkFec, "99/99/99"),localUtil.format( A3348CCStkFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkPre_Internalname,GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3349CCStkPre, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkBar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkBar_Internalname,GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3350CCStkBar), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkBar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkBar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkReo_Internalname,GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3351CCStkReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkPar_Internalname,GXutil.rtrim( A3352CCStkPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkPed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkPed_Internalname,GXutil.ltrim( localUtil.ntoc( A3353CCStkPed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3353CCStkPed), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkPed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkPed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkAlb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkAlb_Internalname,GXutil.rtrim( A3354CCStkAlb),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkAlb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkAlb_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkUsu_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkUsu_Internalname,GXutil.rtrim( A3355CCStkUsu),GXutil.rtrim( localUtil.format( A3355CCStkUsu, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkUsu_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkHor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkHor_Internalname,GXutil.rtrim( A3356CCStkHor),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkHor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCCStkDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkDsc_Internalname,GXutil.rtrim( A3357CCStkDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCCStkLen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCCStkLen_Internalname,GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3358CCStkLen), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCCStkLen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCCStkLen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCcoCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCcoCod_Internalname,GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3839CcoCod), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCcoCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCcoCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtValorE_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValorE_Internalname,GXutil.ltrim( localUtil.ntoc( A3909ValorE, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3909ValorE, "ZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValorE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtValorE_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtValorS_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValorS_Internalname,GXutil.ltrim( localUtil.ntoc( A3910ValorS, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3910ValorS, "ZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValorS_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtValorS_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtValorEI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValorEI_Internalname,GXutil.ltrim( localUtil.ntoc( A3916ValorEI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3916ValorEI, "ZZZZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValorEI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtValorEI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtValorSI_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValorSI_Internalname,GXutil.ltrim( localUtil.ntoc( A3917ValorSI, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3917ValorSI, "ZZZZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtValorSI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtValorSI_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1RT2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkCanE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkCanS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipMovCc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Tipo Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipMovCn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Tipo Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkPri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CCStkPri", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Movimiento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkBar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hoja de Ruta", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reoperado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Particion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkPed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkAlb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkUsu_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkHor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCCStkLen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Entrada Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCcoCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CcoCod", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValorE_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Entradas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValorS_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor salidas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValorEI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ValorEI", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtValorSI_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ValorSI", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV82GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3343CCStkCanE, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCCStkCanE_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkCanE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3344CCStkCanS, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkCanS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3345TipMovCc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipMovCc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3346TipMovCn));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipMovCn_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3347CCStkPri));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkPri_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A3348CCStkFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3349CCStkPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3350CCStkBar, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkBar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3351CCStkReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3352CCStkPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkPar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3353CCStkPed, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkPed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3354CCStkAlb));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkAlb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3355CCStkUsu));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkUsu_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3356CCStkHor));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkHor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3357CCStkDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3358CCStkLen, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCCStkLen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3839CcoCod, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCcoCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3909ValorE, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValorE_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3910ValorS, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValorS_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3916ValorEI, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValorEI_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3917ValorSI, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtValorSI_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtCCStkLin_Internalname = "CCSTKLIN" ;
      edtCCStkCanE_Internalname = "CCSTKCANE" ;
      edtCCStkCanS_Internalname = "CCSTKCANS" ;
      edtTipMovCc_Internalname = "TIPMOVCC" ;
      edtTipMovCn_Internalname = "TIPMOVCN" ;
      edtCCStkPri_Internalname = "CCSTKPRI" ;
      edtCCStkFec_Internalname = "CCSTKFEC" ;
      edtCCStkPre_Internalname = "CCSTKPRE" ;
      edtCCStkBar_Internalname = "CCSTKBAR" ;
      edtCCStkReo_Internalname = "CCSTKREO" ;
      edtCCStkPar_Internalname = "CCSTKPAR" ;
      edtCCStkPed_Internalname = "CCSTKPED" ;
      edtCCStkAlb_Internalname = "CCSTKALB" ;
      edtCCStkUsu_Internalname = "CCSTKUSU" ;
      edtCCStkHor_Internalname = "CCSTKHOR" ;
      edtCCStkDsc_Internalname = "CCSTKDSC" ;
      edtCCStkLen_Internalname = "CCSTKLEN" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtCcoCod_Internalname = "CCOCOD" ;
      edtValorE_Internalname = "VALORE" ;
      edtValorS_Internalname = "VALORS" ;
      edtValorEI_Internalname = "VALOREI" ;
      edtValorSI_Internalname = "VALORSI" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_ccstkfecauxdate_Internalname = "vDDO_CCSTKFECAUXDATE" ;
      divDdo_ccstkfecauxdates_Internalname = "DDO_CCSTKFECAUXDATES" ;
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
      edtValorSI_Jsonclick = "" ;
      edtValorEI_Jsonclick = "" ;
      edtValorS_Jsonclick = "" ;
      edtValorE_Jsonclick = "" ;
      edtCcoCod_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtCCStkLen_Jsonclick = "" ;
      edtCCStkDsc_Jsonclick = "" ;
      edtCCStkHor_Jsonclick = "" ;
      edtCCStkUsu_Jsonclick = "" ;
      edtCCStkAlb_Jsonclick = "" ;
      edtCCStkPed_Jsonclick = "" ;
      edtCCStkPar_Jsonclick = "" ;
      edtCCStkReo_Jsonclick = "" ;
      edtCCStkBar_Jsonclick = "" ;
      edtCCStkPre_Jsonclick = "" ;
      edtCCStkFec_Jsonclick = "" ;
      edtCCStkPri_Jsonclick = "" ;
      edtTipMovCn_Jsonclick = "" ;
      edtTipMovCc_Jsonclick = "" ;
      edtCCStkCanS_Jsonclick = "" ;
      edtCCStkCanE_Jsonclick = "" ;
      edtCCStkCanE_Link = "" ;
      edtCCStkLin_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtValorSI_Visible = -1 ;
      edtValorEI_Visible = -1 ;
      edtValorS_Visible = -1 ;
      edtValorE_Visible = -1 ;
      edtCcoCod_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtCCStkLen_Visible = -1 ;
      edtCCStkDsc_Visible = -1 ;
      edtCCStkHor_Visible = -1 ;
      edtCCStkUsu_Visible = -1 ;
      edtCCStkAlb_Visible = -1 ;
      edtCCStkPed_Visible = -1 ;
      edtCCStkPar_Visible = -1 ;
      edtCCStkReo_Visible = -1 ;
      edtCCStkBar_Visible = -1 ;
      edtCCStkPre_Visible = -1 ;
      edtCCStkFec_Visible = -1 ;
      edtCCStkPri_Visible = -1 ;
      edtTipMovCn_Visible = -1 ;
      edtTipMovCc_Visible = -1 ;
      edtCCStkCanS_Visible = -1 ;
      edtCCStkCanE_Visible = -1 ;
      edtCCStkLin_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtEmprCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_ccstkfecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "CCSTKSWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||Dynamic|Dynamic|Dynamic|||||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "T|T||||T|T|T|||||T||T|T|T|T|||||||" ;
      Ddo_grid_Filterisrange = "||T|T|T|||||T|T|T||T|||||T|T|T|T|T|T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Character|Character|Character|Date|Numeric|Numeric|Numeric|Character|Numeric|Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|1|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21||||" ;
      Ddo_grid_Columnids = "1:EmprCod|2:PrdNum|3:CCStkLin|4:CCStkCanE|5:CCStkCanS|6:TipMovCc|7:TipMovCn|8:CCStkPri|9:CCStkFec|10:CCStkPre|11:CCStkBar|12:CCStkReo|13:CCStkPar|14:CCStkPed|15:CCStkAlb|16:CCStkUsu|17:CCStkHor|18:CCStkDsc|19:CCStkLen|20:PrdExiAlm|21:CcoCod|22:ValorE|23:ValorS|24:ValorEI|25:ValorSI" ;
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
      Form.setCaption( httpContext.getMessage( " Tabla CCSTKS", "") );
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
         AV82GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV82GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtCCStkLin_Visible',ctrl:'CCSTKLIN',prop:'Visible'},{av:'edtCCStkCanE_Visible',ctrl:'CCSTKCANE',prop:'Visible'},{av:'edtCCStkCanS_Visible',ctrl:'CCSTKCANS',prop:'Visible'},{av:'edtTipMovCc_Visible',ctrl:'TIPMOVCC',prop:'Visible'},{av:'edtTipMovCn_Visible',ctrl:'TIPMOVCN',prop:'Visible'},{av:'edtCCStkPri_Visible',ctrl:'CCSTKPRI',prop:'Visible'},{av:'edtCCStkFec_Visible',ctrl:'CCSTKFEC',prop:'Visible'},{av:'edtCCStkPre_Visible',ctrl:'CCSTKPRE',prop:'Visible'},{av:'edtCCStkBar_Visible',ctrl:'CCSTKBAR',prop:'Visible'},{av:'edtCCStkReo_Visible',ctrl:'CCSTKREO',prop:'Visible'},{av:'edtCCStkPar_Visible',ctrl:'CCSTKPAR',prop:'Visible'},{av:'edtCCStkPed_Visible',ctrl:'CCSTKPED',prop:'Visible'},{av:'edtCCStkAlb_Visible',ctrl:'CCSTKALB',prop:'Visible'},{av:'edtCCStkUsu_Visible',ctrl:'CCSTKUSU',prop:'Visible'},{av:'edtCCStkHor_Visible',ctrl:'CCSTKHOR',prop:'Visible'},{av:'edtCCStkDsc_Visible',ctrl:'CCSTKDSC',prop:'Visible'},{av:'edtCCStkLen_Visible',ctrl:'CCSTKLEN',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtCcoCod_Visible',ctrl:'CCOCOD',prop:'Visible'},{av:'edtValorE_Visible',ctrl:'VALORE',prop:'Visible'},{av:'edtValorS_Visible',ctrl:'VALORS',prop:'Visible'},{av:'edtValorEI_Visible',ctrl:'VALOREI',prop:'Visible'},{av:'edtValorSI_Visible',ctrl:'VALORSI',prop:'Visible'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121RT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131RT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141RT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221RT2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV82GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtCCStkCanE_Link',ctrl:'CCSTKCANE',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151RT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtCCStkLin_Visible',ctrl:'CCSTKLIN',prop:'Visible'},{av:'edtCCStkCanE_Visible',ctrl:'CCSTKCANE',prop:'Visible'},{av:'edtCCStkCanS_Visible',ctrl:'CCSTKCANS',prop:'Visible'},{av:'edtTipMovCc_Visible',ctrl:'TIPMOVCC',prop:'Visible'},{av:'edtTipMovCn_Visible',ctrl:'TIPMOVCN',prop:'Visible'},{av:'edtCCStkPri_Visible',ctrl:'CCSTKPRI',prop:'Visible'},{av:'edtCCStkFec_Visible',ctrl:'CCSTKFEC',prop:'Visible'},{av:'edtCCStkPre_Visible',ctrl:'CCSTKPRE',prop:'Visible'},{av:'edtCCStkBar_Visible',ctrl:'CCSTKBAR',prop:'Visible'},{av:'edtCCStkReo_Visible',ctrl:'CCSTKREO',prop:'Visible'},{av:'edtCCStkPar_Visible',ctrl:'CCSTKPAR',prop:'Visible'},{av:'edtCCStkPed_Visible',ctrl:'CCSTKPED',prop:'Visible'},{av:'edtCCStkAlb_Visible',ctrl:'CCSTKALB',prop:'Visible'},{av:'edtCCStkUsu_Visible',ctrl:'CCSTKUSU',prop:'Visible'},{av:'edtCCStkHor_Visible',ctrl:'CCSTKHOR',prop:'Visible'},{av:'edtCCStkDsc_Visible',ctrl:'CCSTKDSC',prop:'Visible'},{av:'edtCCStkLen_Visible',ctrl:'CCSTKLEN',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtCcoCod_Visible',ctrl:'CCOCOD',prop:'Visible'},{av:'edtValorE_Visible',ctrl:'VALORE',prop:'Visible'},{av:'edtValorS_Visible',ctrl:'VALORS',prop:'Visible'},{av:'edtValorEI_Visible',ctrl:'VALOREI',prop:'Visible'},{av:'edtValorSI_Visible',ctrl:'VALORSI',prop:'Visible'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111RT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtCCStkLin_Visible',ctrl:'CCSTKLIN',prop:'Visible'},{av:'edtCCStkCanE_Visible',ctrl:'CCSTKCANE',prop:'Visible'},{av:'edtCCStkCanS_Visible',ctrl:'CCSTKCANS',prop:'Visible'},{av:'edtTipMovCc_Visible',ctrl:'TIPMOVCC',prop:'Visible'},{av:'edtTipMovCn_Visible',ctrl:'TIPMOVCN',prop:'Visible'},{av:'edtCCStkPri_Visible',ctrl:'CCSTKPRI',prop:'Visible'},{av:'edtCCStkFec_Visible',ctrl:'CCSTKFEC',prop:'Visible'},{av:'edtCCStkPre_Visible',ctrl:'CCSTKPRE',prop:'Visible'},{av:'edtCCStkBar_Visible',ctrl:'CCSTKBAR',prop:'Visible'},{av:'edtCCStkReo_Visible',ctrl:'CCSTKREO',prop:'Visible'},{av:'edtCCStkPar_Visible',ctrl:'CCSTKPAR',prop:'Visible'},{av:'edtCCStkPed_Visible',ctrl:'CCSTKPED',prop:'Visible'},{av:'edtCCStkAlb_Visible',ctrl:'CCSTKALB',prop:'Visible'},{av:'edtCCStkUsu_Visible',ctrl:'CCSTKUSU',prop:'Visible'},{av:'edtCCStkHor_Visible',ctrl:'CCSTKHOR',prop:'Visible'},{av:'edtCCStkDsc_Visible',ctrl:'CCSTKDSC',prop:'Visible'},{av:'edtCCStkLen_Visible',ctrl:'CCSTKLEN',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtCcoCod_Visible',ctrl:'CCOCOD',prop:'Visible'},{av:'edtValorE_Visible',ctrl:'VALORE',prop:'Visible'},{av:'edtValorS_Visible',ctrl:'VALORS',prop:'Visible'},{av:'edtValorEI_Visible',ctrl:'VALOREI',prop:'Visible'},{av:'edtValorSI_Visible',ctrl:'VALORSI',prop:'Visible'},{av:'AV80GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV81GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e231RT2',iparms:[{av:'cmbavGridactions'},{av:'AV82GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV82GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161RT2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171RT2',iparms:[{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e181RT2',iparms:[{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e191RT2',iparms:[{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV27TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFCCStkLin',fld:'vTFCCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'AV31TFCCStkLin_To',fld:'vTFCCSTKLIN_TO',pic:'ZZZZZZZZZZZ9'},{av:'AV32TFCCStkCanE',fld:'vTFCCSTKCANE',pic:'ZZZZZZ9.9999'},{av:'AV33TFCCStkCanE_To',fld:'vTFCCSTKCANE_TO',pic:'ZZZZZZ9.9999'},{av:'AV34TFCCStkCanS',fld:'vTFCCSTKCANS',pic:'ZZZZZZ9.9999'},{av:'AV35TFCCStkCanS_To',fld:'vTFCCSTKCANS_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFTipMovCc',fld:'vTFTIPMOVCC',pic:''},{av:'AV37TFTipMovCc_Sel',fld:'vTFTIPMOVCC_SEL',pic:''},{av:'AV38TFTipMovCn',fld:'vTFTIPMOVCN',pic:''},{av:'AV39TFTipMovCn_Sel',fld:'vTFTIPMOVCN_SEL',pic:''},{av:'AV40TFCCStkPri',fld:'vTFCCSTKPRI',pic:'9'},{av:'AV41TFCCStkPri_Sel',fld:'vTFCCSTKPRI_SEL',pic:'9'},{av:'AV42TFCCStkFec',fld:'vTFCCSTKFEC',pic:''},{av:'AV46TFCCStkPre',fld:'vTFCCSTKPRE',pic:'ZZZZZZZ9.999'},{av:'AV47TFCCStkPre_To',fld:'vTFCCSTKPRE_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFCCStkBar',fld:'vTFCCSTKBAR',pic:'ZZZZZZZ9'},{av:'AV49TFCCStkBar_To',fld:'vTFCCSTKBAR_TO',pic:'ZZZZZZZ9'},{av:'AV50TFCCStkReo',fld:'vTFCCSTKREO',pic:'9'},{av:'AV51TFCCStkReo_To',fld:'vTFCCSTKREO_TO',pic:'9'},{av:'AV52TFCCStkPar',fld:'vTFCCSTKPAR',pic:''},{av:'AV53TFCCStkPar_Sel',fld:'vTFCCSTKPAR_SEL',pic:''},{av:'AV54TFCCStkPed',fld:'vTFCCSTKPED',pic:'ZZZZZZZ9'},{av:'AV55TFCCStkPed_To',fld:'vTFCCSTKPED_TO',pic:'ZZZZZZZ9'},{av:'AV56TFCCStkAlb',fld:'vTFCCSTKALB',pic:''},{av:'AV57TFCCStkAlb_Sel',fld:'vTFCCSTKALB_SEL',pic:''},{av:'AV58TFCCStkUsu',fld:'vTFCCSTKUSU',pic:'@!'},{av:'AV59TFCCStkUsu_Sel',fld:'vTFCCSTKUSU_SEL',pic:'@!'},{av:'AV60TFCCStkHor',fld:'vTFCCSTKHOR',pic:''},{av:'AV61TFCCStkHor_Sel',fld:'vTFCCSTKHOR_SEL',pic:''},{av:'AV62TFCCStkDsc',fld:'vTFCCSTKDSC',pic:''},{av:'AV63TFCCStkDsc_Sel',fld:'vTFCCSTKDSC_SEL',pic:''},{av:'AV64TFCCStkLen',fld:'vTFCCSTKLEN',pic:'ZZZ9'},{av:'AV65TFCCStkLen_To',fld:'vTFCCSTKLEN_TO',pic:'ZZZ9'},{av:'AV66TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV67TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFCcoCod',fld:'vTFCCOCOD',pic:'ZZ9'},{av:'AV69TFCcoCod_To',fld:'vTFCCOCOD_TO',pic:'ZZ9'},{av:'AV70TFValorE',fld:'vTFVALORE',pic:'ZZZZZZZ9.99'},{av:'AV71TFValorE_To',fld:'vTFVALORE_TO',pic:'ZZZZZZZ9.99'},{av:'AV72TFValorS',fld:'vTFVALORS',pic:'ZZZZZZZZ9.99'},{av:'AV73TFValorS_To',fld:'vTFVALORS_TO',pic:'ZZZZZZZZ9.99'},{av:'AV74TFValorEI',fld:'vTFVALOREI',pic:'ZZZZZZZ9.99999'},{av:'AV75TFValorEI_To',fld:'vTFVALOREI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV76TFValorSI',fld:'vTFVALORSI',pic:'ZZZZZZZ9.99999'},{av:'AV77TFValorSI_To',fld:'vTFVALORSI_TO',pic:'ZZZZZZZ9.99999'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_CCSTKLIN","{handler:'valid_Ccstklin',iparms:[]");
      setEventMetadata("VALID_CCSTKLIN",",oparms:[]}");
      setEventMetadata("VALID_TIPMOVCC","{handler:'valid_Tipmovcc',iparms:[]");
      setEventMetadata("VALID_TIPMOVCC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Valorsi',iparms:[]");
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
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV15FilterFullText = "" ;
      AV26TFEmprCod = "" ;
      AV27TFEmprCod_Sel = "" ;
      AV28TFPrdNum = "" ;
      AV29TFPrdNum_Sel = "" ;
      AV32TFCCStkCanE = DecimalUtil.ZERO ;
      AV33TFCCStkCanE_To = DecimalUtil.ZERO ;
      AV34TFCCStkCanS = DecimalUtil.ZERO ;
      AV35TFCCStkCanS_To = DecimalUtil.ZERO ;
      AV36TFTipMovCc = "" ;
      AV37TFTipMovCc_Sel = "" ;
      AV38TFTipMovCn = "" ;
      AV39TFTipMovCn_Sel = "" ;
      AV40TFCCStkPri = "" ;
      AV41TFCCStkPri_Sel = "" ;
      AV42TFCCStkFec = GXutil.nullDate() ;
      AV46TFCCStkPre = DecimalUtil.ZERO ;
      AV47TFCCStkPre_To = DecimalUtil.ZERO ;
      AV52TFCCStkPar = "" ;
      AV53TFCCStkPar_Sel = "" ;
      AV56TFCCStkAlb = "" ;
      AV57TFCCStkAlb_Sel = "" ;
      AV58TFCCStkUsu = "" ;
      AV59TFCCStkUsu_Sel = "" ;
      AV60TFCCStkHor = "" ;
      AV61TFCCStkHor_Sel = "" ;
      AV62TFCCStkDsc = "" ;
      AV63TFCCStkDsc_Sel = "" ;
      AV66TFPrdExiAlm = DecimalUtil.ZERO ;
      AV67TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV70TFValorE = DecimalUtil.ZERO ;
      AV71TFValorE_To = DecimalUtil.ZERO ;
      AV72TFValorS = DecimalUtil.ZERO ;
      AV73TFValorS_To = DecimalUtil.ZERO ;
      AV74TFValorEI = DecimalUtil.ZERO ;
      AV75TFValorEI_To = DecimalUtil.ZERO ;
      AV76TFValorSI = DecimalUtil.ZERO ;
      AV77TFValorSI_To = DecimalUtil.ZERO ;
      AV85Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV78DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV44DDO_CCStkFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A3343CCStkCanE = DecimalUtil.ZERO ;
      A3344CCStkCanS = DecimalUtil.ZERO ;
      A3345TipMovCc = "" ;
      A3346TipMovCn = "" ;
      A3347CCStkPri = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      A3349CCStkPre = DecimalUtil.ZERO ;
      A3352CCStkPar = "" ;
      A3354CCStkAlb = "" ;
      A3355CCStkUsu = "" ;
      A3356CCStkHor = "" ;
      A3357CCStkDsc = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A3909ValorE = DecimalUtil.ZERO ;
      A3910ValorS = DecimalUtil.ZERO ;
      A3916ValorEI = DecimalUtil.ZERO ;
      A3917ValorSI = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV90Ccstkswwds_1_filterfulltext = "" ;
      lV91Ccstkswwds_2_tfemprcod = "" ;
      lV93Ccstkswwds_4_tfprdnum = "" ;
      lV101Ccstkswwds_12_tftipmovcc = "" ;
      lV103Ccstkswwds_14_tftipmovcn = "" ;
      lV105Ccstkswwds_16_tfccstkpri = "" ;
      lV114Ccstkswwds_25_tfccstkpar = "" ;
      lV118Ccstkswwds_29_tfccstkalb = "" ;
      lV120Ccstkswwds_31_tfccstkusu = "" ;
      lV122Ccstkswwds_33_tfccstkhor = "" ;
      lV124Ccstkswwds_35_tfccstkdsc = "" ;
      AV92Ccstkswwds_3_tfemprcod_sel = "" ;
      AV91Ccstkswwds_2_tfemprcod = "" ;
      AV94Ccstkswwds_5_tfprdnum_sel = "" ;
      AV93Ccstkswwds_4_tfprdnum = "" ;
      AV97Ccstkswwds_8_tfccstkcane = DecimalUtil.ZERO ;
      AV98Ccstkswwds_9_tfccstkcane_to = DecimalUtil.ZERO ;
      AV99Ccstkswwds_10_tfccstkcans = DecimalUtil.ZERO ;
      AV100Ccstkswwds_11_tfccstkcans_to = DecimalUtil.ZERO ;
      AV102Ccstkswwds_13_tftipmovcc_sel = "" ;
      AV101Ccstkswwds_12_tftipmovcc = "" ;
      AV104Ccstkswwds_15_tftipmovcn_sel = "" ;
      AV103Ccstkswwds_14_tftipmovcn = "" ;
      AV106Ccstkswwds_17_tfccstkpri_sel = "" ;
      AV105Ccstkswwds_16_tfccstkpri = "" ;
      AV107Ccstkswwds_18_tfccstkfec = GXutil.nullDate() ;
      AV108Ccstkswwds_19_tfccstkpre = DecimalUtil.ZERO ;
      AV109Ccstkswwds_20_tfccstkpre_to = DecimalUtil.ZERO ;
      AV115Ccstkswwds_26_tfccstkpar_sel = "" ;
      AV114Ccstkswwds_25_tfccstkpar = "" ;
      AV119Ccstkswwds_30_tfccstkalb_sel = "" ;
      AV118Ccstkswwds_29_tfccstkalb = "" ;
      AV121Ccstkswwds_32_tfccstkusu_sel = "" ;
      AV120Ccstkswwds_31_tfccstkusu = "" ;
      AV123Ccstkswwds_34_tfccstkhor_sel = "" ;
      AV122Ccstkswwds_33_tfccstkhor = "" ;
      AV125Ccstkswwds_36_tfccstkdsc_sel = "" ;
      AV124Ccstkswwds_35_tfccstkdsc = "" ;
      AV128Ccstkswwds_39_tfprdexialm = DecimalUtil.ZERO ;
      AV129Ccstkswwds_40_tfprdexialm_to = DecimalUtil.ZERO ;
      AV136Ccstkswwds_47_tfvalorei = DecimalUtil.ZERO ;
      AV137Ccstkswwds_48_tfvalorei_to = DecimalUtil.ZERO ;
      AV138Ccstkswwds_49_tfvalorsi = DecimalUtil.ZERO ;
      AV139Ccstkswwds_50_tfvalorsi_to = DecimalUtil.ZERO ;
      AV90Ccstkswwds_1_filterfulltext = "" ;
      AV132Ccstkswwds_43_tfvalore = DecimalUtil.ZERO ;
      AV133Ccstkswwds_44_tfvalore_to = DecimalUtil.ZERO ;
      AV134Ccstkswwds_45_tfvalors = DecimalUtil.ZERO ;
      AV135Ccstkswwds_46_tfvalors_to = DecimalUtil.ZERO ;
      H01RT3_A3917ValorSI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT3_A3916ValorEI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT3_A3839CcoCod = new short[1] ;
      H01RT3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT3_A3358CCStkLen = new short[1] ;
      H01RT3_A3357CCStkDsc = new String[] {""} ;
      H01RT3_A3356CCStkHor = new String[] {""} ;
      H01RT3_A3355CCStkUsu = new String[] {""} ;
      H01RT3_A3354CCStkAlb = new String[] {""} ;
      H01RT3_A3353CCStkPed = new int[1] ;
      H01RT3_A3352CCStkPar = new String[] {""} ;
      H01RT3_A3351CCStkReo = new byte[1] ;
      H01RT3_A3350CCStkBar = new int[1] ;
      H01RT3_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01RT3_A3347CCStkPri = new String[] {""} ;
      H01RT3_A3346TipMovCn = new String[] {""} ;
      H01RT3_n3346TipMovCn = new boolean[] {false} ;
      H01RT3_A3345TipMovCc = new String[] {""} ;
      H01RT3_A3342CCStkLin = new long[1] ;
      H01RT3_A719PrdNum = new String[] {""} ;
      H01RT3_A396EmprCod = new String[] {""} ;
      H01RT3_A3344CCStkCanS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT3_A3349CCStkPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT3_A3343CCStkCanE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT3_A3910ValorS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT3_A3909ValorE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RT5_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV86Station = "" ;
      AV87Emprcod = "" ;
      AV88Emprnom = "" ;
      AV89Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ccstksww__default(),
         new Object[] {
             new Object[] {
            H01RT3_A3917ValorSI, H01RT3_A3916ValorEI, H01RT3_A3839CcoCod, H01RT3_A704PrdExiAlm, H01RT3_A3358CCStkLen, H01RT3_A3357CCStkDsc, H01RT3_A3356CCStkHor, H01RT3_A3355CCStkUsu, H01RT3_A3354CCStkAlb, H01RT3_A3353CCStkPed,
            H01RT3_A3352CCStkPar, H01RT3_A3351CCStkReo, H01RT3_A3350CCStkBar, H01RT3_A3348CCStkFec, H01RT3_A3347CCStkPri, H01RT3_A3346TipMovCn, H01RT3_n3346TipMovCn, H01RT3_A3345TipMovCc, H01RT3_A3342CCStkLin, H01RT3_A719PrdNum,
            H01RT3_A396EmprCod, H01RT3_A3344CCStkCanS, H01RT3_A3349CCStkPre, H01RT3_A3343CCStkCanE, H01RT3_A3910ValorS, H01RT3_A3909ValorE
            }
            , new Object[] {
            H01RT5_AGRID_nRecordCount
            }
         }
      );
      AV85Pgmname = "CCSTKSWW" ;
      /* GeneXus formulas. */
      AV85Pgmname = "CCSTKSWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV50TFCCStkReo ;
   private byte AV51TFCCStkReo_To ;
   private byte gxajaxcallmode ;
   private byte A3351CCStkReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV112Ccstkswwds_23_tfccstkreo ;
   private byte AV113Ccstkswwds_24_tfccstkreo_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV64TFCCStkLen ;
   private short AV65TFCCStkLen_To ;
   private short AV68TFCcoCod ;
   private short AV69TFCcoCod_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV82GridActions ;
   private short A3358CCStkLen ;
   private short A3839CcoCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV126Ccstkswwds_37_tfccstklen ;
   private short AV127Ccstkswwds_38_tfccstklen_to ;
   private short AV130Ccstkswwds_41_tfccocod ;
   private short AV131Ccstkswwds_42_tfccocod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV48TFCCStkBar ;
   private int AV49TFCCStkBar_To ;
   private int AV54TFCCStkPed ;
   private int AV55TFCCStkPed_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A3350CCStkBar ;
   private int A3353CCStkPed ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV110Ccstkswwds_21_tfccstkbar ;
   private int AV111Ccstkswwds_22_tfccstkbar_to ;
   private int AV116Ccstkswwds_27_tfccstkped ;
   private int AV117Ccstkswwds_28_tfccstkped_to ;
   private int edtEmprCod_Visible ;
   private int edtPrdNum_Visible ;
   private int edtCCStkLin_Visible ;
   private int edtCCStkCanE_Visible ;
   private int edtCCStkCanS_Visible ;
   private int edtTipMovCc_Visible ;
   private int edtTipMovCn_Visible ;
   private int edtCCStkPri_Visible ;
   private int edtCCStkFec_Visible ;
   private int edtCCStkPre_Visible ;
   private int edtCCStkBar_Visible ;
   private int edtCCStkReo_Visible ;
   private int edtCCStkPar_Visible ;
   private int edtCCStkPed_Visible ;
   private int edtCCStkAlb_Visible ;
   private int edtCCStkUsu_Visible ;
   private int edtCCStkHor_Visible ;
   private int edtCCStkDsc_Visible ;
   private int edtCCStkLen_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtCcoCod_Visible ;
   private int edtValorE_Visible ;
   private int edtValorS_Visible ;
   private int edtValorEI_Visible ;
   private int edtValorSI_Visible ;
   private int AV79PageToGo ;
   private int AV140GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV30TFCCStkLin ;
   private long AV31TFCCStkLin_To ;
   private long AV80GridCurrentPage ;
   private long AV81GridPageCount ;
   private long A3342CCStkLin ;
   private long GRID_nCurrentRecord ;
   private long AV95Ccstkswwds_6_tfccstklin ;
   private long AV96Ccstkswwds_7_tfccstklin_to ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV32TFCCStkCanE ;
   private java.math.BigDecimal AV33TFCCStkCanE_To ;
   private java.math.BigDecimal AV34TFCCStkCanS ;
   private java.math.BigDecimal AV35TFCCStkCanS_To ;
   private java.math.BigDecimal AV46TFCCStkPre ;
   private java.math.BigDecimal AV47TFCCStkPre_To ;
   private java.math.BigDecimal AV66TFPrdExiAlm ;
   private java.math.BigDecimal AV67TFPrdExiAlm_To ;
   private java.math.BigDecimal AV70TFValorE ;
   private java.math.BigDecimal AV71TFValorE_To ;
   private java.math.BigDecimal AV72TFValorS ;
   private java.math.BigDecimal AV73TFValorS_To ;
   private java.math.BigDecimal AV74TFValorEI ;
   private java.math.BigDecimal AV75TFValorEI_To ;
   private java.math.BigDecimal AV76TFValorSI ;
   private java.math.BigDecimal AV77TFValorSI_To ;
   private java.math.BigDecimal A3343CCStkCanE ;
   private java.math.BigDecimal A3344CCStkCanS ;
   private java.math.BigDecimal A3349CCStkPre ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A3909ValorE ;
   private java.math.BigDecimal A3910ValorS ;
   private java.math.BigDecimal A3916ValorEI ;
   private java.math.BigDecimal A3917ValorSI ;
   private java.math.BigDecimal AV97Ccstkswwds_8_tfccstkcane ;
   private java.math.BigDecimal AV98Ccstkswwds_9_tfccstkcane_to ;
   private java.math.BigDecimal AV99Ccstkswwds_10_tfccstkcans ;
   private java.math.BigDecimal AV100Ccstkswwds_11_tfccstkcans_to ;
   private java.math.BigDecimal AV108Ccstkswwds_19_tfccstkpre ;
   private java.math.BigDecimal AV109Ccstkswwds_20_tfccstkpre_to ;
   private java.math.BigDecimal AV128Ccstkswwds_39_tfprdexialm ;
   private java.math.BigDecimal AV129Ccstkswwds_40_tfprdexialm_to ;
   private java.math.BigDecimal AV136Ccstkswwds_47_tfvalorei ;
   private java.math.BigDecimal AV137Ccstkswwds_48_tfvalorei_to ;
   private java.math.BigDecimal AV138Ccstkswwds_49_tfvalorsi ;
   private java.math.BigDecimal AV139Ccstkswwds_50_tfvalorsi_to ;
   private java.math.BigDecimal AV132Ccstkswwds_43_tfvalore ;
   private java.math.BigDecimal AV133Ccstkswwds_44_tfvalore_to ;
   private java.math.BigDecimal AV134Ccstkswwds_45_tfvalors ;
   private java.math.BigDecimal AV135Ccstkswwds_46_tfvalors_to ;
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
   private String sGXsfl_45_idx="0001" ;
   private String AV26TFEmprCod ;
   private String AV27TFEmprCod_Sel ;
   private String AV28TFPrdNum ;
   private String AV29TFPrdNum_Sel ;
   private String AV36TFTipMovCc ;
   private String AV37TFTipMovCc_Sel ;
   private String AV38TFTipMovCn ;
   private String AV39TFTipMovCn_Sel ;
   private String AV40TFCCStkPri ;
   private String AV41TFCCStkPri_Sel ;
   private String AV52TFCCStkPar ;
   private String AV53TFCCStkPar_Sel ;
   private String AV56TFCCStkAlb ;
   private String AV57TFCCStkAlb_Sel ;
   private String AV58TFCCStkUsu ;
   private String AV59TFCCStkUsu_Sel ;
   private String AV60TFCCStkHor ;
   private String AV61TFCCStkHor_Sel ;
   private String AV62TFCCStkDsc ;
   private String AV63TFCCStkDsc_Sel ;
   private String AV85Pgmname ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_ccstkfecauxdates_Internalname ;
   private String edtavDdo_ccstkfecauxdate_Internalname ;
   private String edtavDdo_ccstkfecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String edtCCStkLin_Internalname ;
   private String edtCCStkCanE_Internalname ;
   private String edtCCStkCanS_Internalname ;
   private String A3345TipMovCc ;
   private String edtTipMovCc_Internalname ;
   private String A3346TipMovCn ;
   private String edtTipMovCn_Internalname ;
   private String A3347CCStkPri ;
   private String edtCCStkPri_Internalname ;
   private String edtCCStkFec_Internalname ;
   private String edtCCStkPre_Internalname ;
   private String edtCCStkBar_Internalname ;
   private String edtCCStkReo_Internalname ;
   private String A3352CCStkPar ;
   private String edtCCStkPar_Internalname ;
   private String edtCCStkPed_Internalname ;
   private String A3354CCStkAlb ;
   private String edtCCStkAlb_Internalname ;
   private String A3355CCStkUsu ;
   private String edtCCStkUsu_Internalname ;
   private String A3356CCStkHor ;
   private String edtCCStkHor_Internalname ;
   private String A3357CCStkDsc ;
   private String edtCCStkDsc_Internalname ;
   private String edtCCStkLen_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtCcoCod_Internalname ;
   private String edtValorE_Internalname ;
   private String edtValorS_Internalname ;
   private String edtValorEI_Internalname ;
   private String edtValorSI_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV91Ccstkswwds_2_tfemprcod ;
   private String lV93Ccstkswwds_4_tfprdnum ;
   private String lV101Ccstkswwds_12_tftipmovcc ;
   private String lV103Ccstkswwds_14_tftipmovcn ;
   private String lV105Ccstkswwds_16_tfccstkpri ;
   private String lV114Ccstkswwds_25_tfccstkpar ;
   private String lV118Ccstkswwds_29_tfccstkalb ;
   private String lV120Ccstkswwds_31_tfccstkusu ;
   private String lV122Ccstkswwds_33_tfccstkhor ;
   private String lV124Ccstkswwds_35_tfccstkdsc ;
   private String AV92Ccstkswwds_3_tfemprcod_sel ;
   private String AV91Ccstkswwds_2_tfemprcod ;
   private String AV94Ccstkswwds_5_tfprdnum_sel ;
   private String AV93Ccstkswwds_4_tfprdnum ;
   private String AV102Ccstkswwds_13_tftipmovcc_sel ;
   private String AV101Ccstkswwds_12_tftipmovcc ;
   private String AV104Ccstkswwds_15_tftipmovcn_sel ;
   private String AV103Ccstkswwds_14_tftipmovcn ;
   private String AV106Ccstkswwds_17_tfccstkpri_sel ;
   private String AV105Ccstkswwds_16_tfccstkpri ;
   private String AV115Ccstkswwds_26_tfccstkpar_sel ;
   private String AV114Ccstkswwds_25_tfccstkpar ;
   private String AV119Ccstkswwds_30_tfccstkalb_sel ;
   private String AV118Ccstkswwds_29_tfccstkalb ;
   private String AV121Ccstkswwds_32_tfccstkusu_sel ;
   private String AV120Ccstkswwds_31_tfccstkusu ;
   private String AV123Ccstkswwds_34_tfccstkhor_sel ;
   private String AV122Ccstkswwds_33_tfccstkhor ;
   private String AV125Ccstkswwds_36_tfccstkdsc_sel ;
   private String AV124Ccstkswwds_35_tfccstkdsc ;
   private String hsh ;
   private String AV86Station ;
   private String AV87Emprcod ;
   private String AV88Emprnom ;
   private String AV89Usurcod ;
   private String edtCCStkCanE_Link ;
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
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
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
   private String edtEmprCod_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtCCStkLin_Jsonclick ;
   private String edtCCStkCanE_Jsonclick ;
   private String edtCCStkCanS_Jsonclick ;
   private String edtTipMovCc_Jsonclick ;
   private String edtTipMovCn_Jsonclick ;
   private String edtCCStkPri_Jsonclick ;
   private String edtCCStkFec_Jsonclick ;
   private String edtCCStkPre_Jsonclick ;
   private String edtCCStkBar_Jsonclick ;
   private String edtCCStkReo_Jsonclick ;
   private String edtCCStkPar_Jsonclick ;
   private String edtCCStkPed_Jsonclick ;
   private String edtCCStkAlb_Jsonclick ;
   private String edtCCStkUsu_Jsonclick ;
   private String edtCCStkHor_Jsonclick ;
   private String edtCCStkDsc_Jsonclick ;
   private String edtCCStkLen_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtCcoCod_Jsonclick ;
   private String edtValorE_Jsonclick ;
   private String edtValorS_Jsonclick ;
   private String edtValorEI_Jsonclick ;
   private String edtValorSI_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV42TFCCStkFec ;
   private java.util.Date AV44DDO_CCStkFecAuxDate ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date AV107Ccstkswwds_18_tfccstkfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean n3346TipMovCn ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV90Ccstkswwds_1_filterfulltext ;
   private String AV90Ccstkswwds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H01RT3_A3917ValorSI ;
   private java.math.BigDecimal[] H01RT3_A3916ValorEI ;
   private short[] H01RT3_A3839CcoCod ;
   private java.math.BigDecimal[] H01RT3_A704PrdExiAlm ;
   private short[] H01RT3_A3358CCStkLen ;
   private String[] H01RT3_A3357CCStkDsc ;
   private String[] H01RT3_A3356CCStkHor ;
   private String[] H01RT3_A3355CCStkUsu ;
   private String[] H01RT3_A3354CCStkAlb ;
   private int[] H01RT3_A3353CCStkPed ;
   private String[] H01RT3_A3352CCStkPar ;
   private byte[] H01RT3_A3351CCStkReo ;
   private int[] H01RT3_A3350CCStkBar ;
   private java.util.Date[] H01RT3_A3348CCStkFec ;
   private String[] H01RT3_A3347CCStkPri ;
   private String[] H01RT3_A3346TipMovCn ;
   private boolean[] H01RT3_n3346TipMovCn ;
   private String[] H01RT3_A3345TipMovCc ;
   private long[] H01RT3_A3342CCStkLin ;
   private String[] H01RT3_A719PrdNum ;
   private String[] H01RT3_A396EmprCod ;
   private java.math.BigDecimal[] H01RT3_A3344CCStkCanS ;
   private java.math.BigDecimal[] H01RT3_A3349CCStkPre ;
   private java.math.BigDecimal[] H01RT3_A3343CCStkCanE ;
   private java.math.BigDecimal[] H01RT3_A3910ValorS ;
   private java.math.BigDecimal[] H01RT3_A3909ValorE ;
   private long[] H01RT5_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV78DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class ccstksww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01RT3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Ccstkswwds_3_tfemprcod_sel ,
                                          String AV91Ccstkswwds_2_tfemprcod ,
                                          String AV94Ccstkswwds_5_tfprdnum_sel ,
                                          String AV93Ccstkswwds_4_tfprdnum ,
                                          long AV95Ccstkswwds_6_tfccstklin ,
                                          long AV96Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV97Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV98Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV99Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV100Ccstkswwds_11_tfccstkcans_to ,
                                          String AV102Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV101Ccstkswwds_12_tftipmovcc ,
                                          String AV104Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV103Ccstkswwds_14_tftipmovcn ,
                                          String AV106Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV105Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV107Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV108Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV109Ccstkswwds_20_tfccstkpre_to ,
                                          int AV110Ccstkswwds_21_tfccstkbar ,
                                          int AV111Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV112Ccstkswwds_23_tfccstkreo ,
                                          byte AV113Ccstkswwds_24_tfccstkreo_to ,
                                          String AV115Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV114Ccstkswwds_25_tfccstkpar ,
                                          int AV116Ccstkswwds_27_tfccstkped ,
                                          int AV117Ccstkswwds_28_tfccstkped_to ,
                                          String AV119Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV118Ccstkswwds_29_tfccstkalb ,
                                          String AV121Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV120Ccstkswwds_31_tfccstkusu ,
                                          String AV123Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV122Ccstkswwds_33_tfccstkhor ,
                                          String AV125Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV124Ccstkswwds_35_tfccstkdsc ,
                                          short AV126Ccstkswwds_37_tfccstklen ,
                                          short AV127Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV128Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV129Ccstkswwds_40_tfprdexialm_to ,
                                          short AV130Ccstkswwds_41_tfccocod ,
                                          short AV131Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV136Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV137Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV138Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV139Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV90Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV132Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV133Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV134Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV135Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[83];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorSI, T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)) AS ValorEI, T1.CcoCod, T2.PrdExiAlm, T1.CCStkLen," ;
      sSelectString += " T1.CCStkDsc, T1.CCStkHor, T1.CCStkUsu, T1.CCStkAlb, T1.CCStkPed, T1.CCStkPar, T1.CCStkReo, T1.CCStkBar, T1.CCStkFec, T1.CCStkPri, T3.TipMovCn, T1.TipMovCc, T1.CCStkLin," ;
      sSelectString += " T1.PrdNum, T1.EmprCod, T1.CCStkCanS, T1.CCStkPre, T1.CCStkCanE, COALESCE( T4.ValorS, 0) AS ValorS, COALESCE( T4.ValorE, 0) AS ValorE" ;
      sFromString = " FROM (((TXPCCSTKS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc" ;
      sFromString += " = T1.TipMovCc) LEFT JOIN (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec," ;
      sFromString += " 0) = 2 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE  WHEN COALESCE( T6.EmpNumDec," ;
      sFromString += " 0) = 0 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS" ;
      sFromString += " NUMERIC(24,10))), 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.PrdNum = T1.PrdNum" ;
      sFromString += " AND T4.CCStkLin = T1.CCStkLin)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV92Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV91Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV93Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV95Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (0==AV96Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV101Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV103Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV105Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! (0==AV111Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (0==AV112Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (0==AV113Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV114Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! (0==AV116Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( ! (0==AV117Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV118Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV120Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int29[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV122Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int29[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int29[67] = (byte)(1) ;
      }
      if ( ! (0==AV126Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int29[68] = (byte)(1) ;
      }
      if ( ! (0==AV127Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int29[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int29[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int29[71] = (byte)(1) ;
      }
      if ( ! (0==AV130Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int29[72] = (byte)(1) ;
      }
      if ( ! (0==AV131Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int29[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int29[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int29[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int29[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int29[77] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkCanE" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkCanE DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkLin" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkCanS" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkCanS DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipMovCc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipMovCc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.TipMovCn" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.TipMovCn DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkPri" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkFec" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkPre" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkPre DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkBar" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkBar DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkReo" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkPar" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkPed" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkPed DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkAlb" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkAlb DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkUsu" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkUsu DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkHor" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkHor DESC" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkDsc" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CCStkLen" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CCStkLen DESC" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CcoCod" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CcoCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum, T1.CCStkLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H01RT5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV92Ccstkswwds_3_tfemprcod_sel ,
                                          String AV91Ccstkswwds_2_tfemprcod ,
                                          String AV94Ccstkswwds_5_tfprdnum_sel ,
                                          String AV93Ccstkswwds_4_tfprdnum ,
                                          long AV95Ccstkswwds_6_tfccstklin ,
                                          long AV96Ccstkswwds_7_tfccstklin_to ,
                                          java.math.BigDecimal AV97Ccstkswwds_8_tfccstkcane ,
                                          java.math.BigDecimal AV98Ccstkswwds_9_tfccstkcane_to ,
                                          java.math.BigDecimal AV99Ccstkswwds_10_tfccstkcans ,
                                          java.math.BigDecimal AV100Ccstkswwds_11_tfccstkcans_to ,
                                          String AV102Ccstkswwds_13_tftipmovcc_sel ,
                                          String AV101Ccstkswwds_12_tftipmovcc ,
                                          String AV104Ccstkswwds_15_tftipmovcn_sel ,
                                          String AV103Ccstkswwds_14_tftipmovcn ,
                                          String AV106Ccstkswwds_17_tfccstkpri_sel ,
                                          String AV105Ccstkswwds_16_tfccstkpri ,
                                          java.util.Date AV107Ccstkswwds_18_tfccstkfec ,
                                          java.math.BigDecimal AV108Ccstkswwds_19_tfccstkpre ,
                                          java.math.BigDecimal AV109Ccstkswwds_20_tfccstkpre_to ,
                                          int AV110Ccstkswwds_21_tfccstkbar ,
                                          int AV111Ccstkswwds_22_tfccstkbar_to ,
                                          byte AV112Ccstkswwds_23_tfccstkreo ,
                                          byte AV113Ccstkswwds_24_tfccstkreo_to ,
                                          String AV115Ccstkswwds_26_tfccstkpar_sel ,
                                          String AV114Ccstkswwds_25_tfccstkpar ,
                                          int AV116Ccstkswwds_27_tfccstkped ,
                                          int AV117Ccstkswwds_28_tfccstkped_to ,
                                          String AV119Ccstkswwds_30_tfccstkalb_sel ,
                                          String AV118Ccstkswwds_29_tfccstkalb ,
                                          String AV121Ccstkswwds_32_tfccstkusu_sel ,
                                          String AV120Ccstkswwds_31_tfccstkusu ,
                                          String AV123Ccstkswwds_34_tfccstkhor_sel ,
                                          String AV122Ccstkswwds_33_tfccstkhor ,
                                          String AV125Ccstkswwds_36_tfccstkdsc_sel ,
                                          String AV124Ccstkswwds_35_tfccstkdsc ,
                                          short AV126Ccstkswwds_37_tfccstklen ,
                                          short AV127Ccstkswwds_38_tfccstklen_to ,
                                          java.math.BigDecimal AV128Ccstkswwds_39_tfprdexialm ,
                                          java.math.BigDecimal AV129Ccstkswwds_40_tfprdexialm_to ,
                                          short AV130Ccstkswwds_41_tfccocod ,
                                          short AV131Ccstkswwds_42_tfccocod_to ,
                                          java.math.BigDecimal AV136Ccstkswwds_47_tfvalorei ,
                                          java.math.BigDecimal AV137Ccstkswwds_48_tfvalorei_to ,
                                          java.math.BigDecimal AV138Ccstkswwds_49_tfvalorsi ,
                                          java.math.BigDecimal AV139Ccstkswwds_50_tfvalorsi_to ,
                                          String A396EmprCod ,
                                          String A719PrdNum ,
                                          long A3342CCStkLin ,
                                          java.math.BigDecimal A3343CCStkCanE ,
                                          java.math.BigDecimal A3344CCStkCanS ,
                                          String A3345TipMovCc ,
                                          String A3346TipMovCn ,
                                          String A3347CCStkPri ,
                                          java.util.Date A3348CCStkFec ,
                                          java.math.BigDecimal A3349CCStkPre ,
                                          int A3350CCStkBar ,
                                          byte A3351CCStkReo ,
                                          String A3352CCStkPar ,
                                          int A3353CCStkPed ,
                                          String A3354CCStkAlb ,
                                          String A3355CCStkUsu ,
                                          String A3356CCStkHor ,
                                          String A3357CCStkDsc ,
                                          short A3358CCStkLen ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          short A3839CcoCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV90Ccstkswwds_1_filterfulltext ,
                                          java.math.BigDecimal A3909ValorE ,
                                          java.math.BigDecimal A3910ValorS ,
                                          java.math.BigDecimal A3916ValorEI ,
                                          java.math.BigDecimal A3917ValorSI ,
                                          java.math.BigDecimal AV132Ccstkswwds_43_tfvalore ,
                                          java.math.BigDecimal AV133Ccstkswwds_44_tfvalore_to ,
                                          java.math.BigDecimal AV134Ccstkswwds_45_tfvalors ,
                                          java.math.BigDecimal AV135Ccstkswwds_46_tfvalors_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[78];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPCCSTKS T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipMovCc = T1.TipMovCc) LEFT JOIN (SELECT CASE  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0)" ;
      scmdbuf += " WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanS * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorS, T5.EmprCod, T5.PrdNum, T5.CCStkLin, CASE" ;
      scmdbuf += "  WHEN COALESCE( T6.EmpNumDec, 0) = 0 THEN ROUND(( T5.CCStkCanE * CAST(T5.CCStkPre AS NUMERIC(24,10))), 0) WHEN COALESCE( T6.EmpNumDec, 0) = 2 THEN ROUND(( T5.CCStkCanE" ;
      scmdbuf += " * CAST(T5.CCStkPre AS NUMERIC(24,10))), 2) END AS ValorE FROM (TXPCCSTKS T5 INNER JOIN TXPEMPRES T6 ON T6.EmprCod = T5.EmprCod) ) T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.PrdNum = T1.PrdNum AND T4.CCStkLin = T1.CCStkLin)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLin,'999999999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.TipMovCc) like '%' || UPPER(?)) or ( UPPER(T3.TipMovCn) like '%' || UPPER(?)) or ( UPPER(T1.CCStkPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPre,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkBar,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkReo,'90'), 2) like '%' || ?) or ( UPPER(T1.CCStkPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkPed,'99999990'), 2) like '%' || ?) or ( UPPER(T1.CCStkAlb) like '%' || UPPER(?)) or ( UPPER(T1.CCStkUsu) like '%' || UPPER(?)) or ( UPPER(T1.CCStkHor) like '%' || UPPER(?)) or ( UPPER(T1.CCStkDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CCStkLen,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CcoCod,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorE, 0),'99999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T4.ValorS, 0),'999999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10)),'99999990.99999'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorE, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ValorS, 0) <= ?))");
      if ( (GXutil.strcmp("", AV92Ccstkswwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV91Ccstkswwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Ccstkswwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Ccstkswwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV93Ccstkswwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Ccstkswwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! (0==AV95Ccstkswwds_6_tfccstklin) )
      {
         addWhere(sWhereString, "(T1.CCStkLin >= ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( ! (0==AV96Ccstkswwds_7_tfccstklin_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLin <= ?)");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Ccstkswwds_8_tfccstkcane)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE >= ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Ccstkswwds_9_tfccstkcane_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanE <= ?)");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Ccstkswwds_10_tfccstkcans)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS >= ?)");
      }
      else
      {
         GXv_int31[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Ccstkswwds_11_tfccstkcans_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkCanS <= ?)");
      }
      else
      {
         GXv_int31[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Ccstkswwds_13_tftipmovcc_sel)==0) && ( ! (GXutil.strcmp("", AV101Ccstkswwds_12_tftipmovcc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMovCc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Ccstkswwds_13_tftipmovcc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMovCc = ?)");
      }
      else
      {
         GXv_int31[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Ccstkswwds_15_tftipmovcn_sel)==0) && ( ! (GXutil.strcmp("", AV103Ccstkswwds_14_tftipmovcn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMovCn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Ccstkswwds_15_tftipmovcn_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMovCn = ?)");
      }
      else
      {
         GXv_int31[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Ccstkswwds_17_tfccstkpri_sel)==0) && ( ! (GXutil.strcmp("", AV105Ccstkswwds_16_tfccstkpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Ccstkswwds_17_tfccstkpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPri = ?)");
      }
      else
      {
         GXv_int31[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV107Ccstkswwds_18_tfccstkfec)) )
      {
         addWhere(sWhereString, "(T1.CCStkFec >= ?)");
      }
      else
      {
         GXv_int31[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Ccstkswwds_19_tfccstkpre)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre >= ?)");
      }
      else
      {
         GXv_int31[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Ccstkswwds_20_tfccstkpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPre <= ?)");
      }
      else
      {
         GXv_int31[51] = (byte)(1) ;
      }
      if ( ! (0==AV110Ccstkswwds_21_tfccstkbar) )
      {
         addWhere(sWhereString, "(T1.CCStkBar >= ?)");
      }
      else
      {
         GXv_int31[52] = (byte)(1) ;
      }
      if ( ! (0==AV111Ccstkswwds_22_tfccstkbar_to) )
      {
         addWhere(sWhereString, "(T1.CCStkBar <= ?)");
      }
      else
      {
         GXv_int31[53] = (byte)(1) ;
      }
      if ( ! (0==AV112Ccstkswwds_23_tfccstkreo) )
      {
         addWhere(sWhereString, "(T1.CCStkReo >= ?)");
      }
      else
      {
         GXv_int31[54] = (byte)(1) ;
      }
      if ( ! (0==AV113Ccstkswwds_24_tfccstkreo_to) )
      {
         addWhere(sWhereString, "(T1.CCStkReo <= ?)");
      }
      else
      {
         GXv_int31[55] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Ccstkswwds_26_tfccstkpar_sel)==0) && ( ! (GXutil.strcmp("", AV114Ccstkswwds_25_tfccstkpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Ccstkswwds_26_tfccstkpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkPar = ?)");
      }
      else
      {
         GXv_int31[57] = (byte)(1) ;
      }
      if ( ! (0==AV116Ccstkswwds_27_tfccstkped) )
      {
         addWhere(sWhereString, "(T1.CCStkPed >= ?)");
      }
      else
      {
         GXv_int31[58] = (byte)(1) ;
      }
      if ( ! (0==AV117Ccstkswwds_28_tfccstkped_to) )
      {
         addWhere(sWhereString, "(T1.CCStkPed <= ?)");
      }
      else
      {
         GXv_int31[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Ccstkswwds_30_tfccstkalb_sel)==0) && ( ! (GXutil.strcmp("", AV118Ccstkswwds_29_tfccstkalb)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkAlb) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Ccstkswwds_30_tfccstkalb_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkAlb = ?)");
      }
      else
      {
         GXv_int31[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Ccstkswwds_32_tfccstkusu_sel)==0) && ( ! (GXutil.strcmp("", AV120Ccstkswwds_31_tfccstkusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Ccstkswwds_32_tfccstkusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkUsu = ?)");
      }
      else
      {
         GXv_int31[63] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Ccstkswwds_34_tfccstkhor_sel)==0) && ( ! (GXutil.strcmp("", AV122Ccstkswwds_33_tfccstkhor)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkHor) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[64] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Ccstkswwds_34_tfccstkhor_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkHor = ?)");
      }
      else
      {
         GXv_int31[65] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Ccstkswwds_36_tfccstkdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Ccstkswwds_35_tfccstkdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.CCStkDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[66] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Ccstkswwds_36_tfccstkdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.CCStkDsc = ?)");
      }
      else
      {
         GXv_int31[67] = (byte)(1) ;
      }
      if ( ! (0==AV126Ccstkswwds_37_tfccstklen) )
      {
         addWhere(sWhereString, "(T1.CCStkLen >= ?)");
      }
      else
      {
         GXv_int31[68] = (byte)(1) ;
      }
      if ( ! (0==AV127Ccstkswwds_38_tfccstklen_to) )
      {
         addWhere(sWhereString, "(T1.CCStkLen <= ?)");
      }
      else
      {
         GXv_int31[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Ccstkswwds_39_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int31[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Ccstkswwds_40_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int31[71] = (byte)(1) ;
      }
      if ( ! (0==AV130Ccstkswwds_41_tfccocod) )
      {
         addWhere(sWhereString, "(T1.CcoCod >= ?)");
      }
      else
      {
         GXv_int31[72] = (byte)(1) ;
      }
      if ( ! (0==AV131Ccstkswwds_42_tfccocod_to) )
      {
         addWhere(sWhereString, "(T1.CcoCod <= ?)");
      }
      else
      {
         GXv_int31[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Ccstkswwds_47_tfvalorei)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int31[74] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Ccstkswwds_48_tfvalorei_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanE * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int31[75] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Ccstkswwds_49_tfvalorsi)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) >= ?)");
      }
      else
      {
         GXv_int31[76] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Ccstkswwds_50_tfvalorsi_to)==0) )
      {
         addWhere(sWhereString, "(( T1.CCStkCanS * CAST(T1.CCStkPre AS NUMERIC(24,10))) <= ?)");
      }
      else
      {
         GXv_int31[77] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 18 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 19 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 20 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 21 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
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
                  return conditional_H01RT3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] );
            case 1 :
                  return conditional_H01RT5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).longValue() , ((Number) dynConstraints[5]).longValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Number) dynConstraints[40]).shortValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).longValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (java.util.Date)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , (java.math.BigDecimal)dynConstraints[64] , ((Number) dynConstraints[65]).shortValue() , ((Number) dynConstraints[66]).shortValue() , ((Boolean) dynConstraints[67]).booleanValue() , (String)dynConstraints[68] , (java.math.BigDecimal)dynConstraints[69] , (java.math.BigDecimal)dynConstraints[70] , (java.math.BigDecimal)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01RT3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01RT5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 10);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((String[]) buf[15])[0] = rslt.getString(16, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(17, 2);
               ((long[]) buf[18])[0] = rslt.getLong(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 6);
               ((String[]) buf[20])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,2);
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
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[114], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[115], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[120]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[121]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[132]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[137]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[138]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[141]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[150], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[155]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[159], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[160], 5);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[161]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[162]).intValue());
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[163]).intValue());
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[164]).intValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[103], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[104], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[105], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 3);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 3);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 6);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[115]).longValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[116]).longValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[117], 4);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[118], 4);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[119], 4);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 4);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 1);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[127]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[128], 5);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[129], 5);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[133]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 1);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 10);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 10);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 8);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 8);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 8);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 8);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 30);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[145], 30);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[147]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 4);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 4);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[150]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[151]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[152], 5);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 5);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 5);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 5);
               }
               return;
      }
   }

}

