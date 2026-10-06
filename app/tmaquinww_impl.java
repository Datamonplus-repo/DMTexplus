package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaquinww_impl extends GXDataArea
{
   public tmaquinww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaquinww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaquinww_impl.class ));
   }

   public tmaquinww_impl( int remoteHandle ,
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV26TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV27TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV28TFMaqDsc = httpContext.GetPar( "TFMaqDsc") ;
      AV29TFMaqDsc_Sel = httpContext.GetPar( "TFMaqDsc_Sel") ;
      AV30TFMaqTinTip = httpContext.GetPar( "TFMaqTinTip") ;
      AV31TFMaqTinTip_Sel = httpContext.GetPar( "TFMaqTinTip_Sel") ;
      AV32TFMaqVolMax = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMax"))) ;
      AV33TFMaqVolMax_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMax_To"))) ;
      AV34TFMaqVolMin = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMin"))) ;
      AV35TFMaqVolMin_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMin_To"))) ;
      AV36TFMaqVolMed = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMed"))) ;
      AV37TFMaqVolMed_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMed_To"))) ;
      AV38TFMaqVolTop = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolTop"))) ;
      AV39TFMaqVolTop_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolTop_To"))) ;
      AV40TFMaqVolRes = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolRes"))) ;
      AV41TFMaqVolRes_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolRes_To"))) ;
      AV42TFMaqKgsMax = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMax"), ".") ;
      AV43TFMaqKgsMax_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMax_To"), ".") ;
      AV44TFMaqKgsMed = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMed"), ".") ;
      AV45TFMaqKgsMed_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMed_To"), ".") ;
      AV46TFMaqKgsMin = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMin"), ".") ;
      AV47TFMaqKgsMin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMin_To"), ".") ;
      AV48TFTipMaqCod = httpContext.GetPar( "TFTipMaqCod") ;
      AV49TFTipMaqCod_Sel = httpContext.GetPar( "TFTipMaqCod_Sel") ;
      AV50TFTipMaqDsc = httpContext.GetPar( "TFTipMaqDsc") ;
      AV51TFTipMaqDsc_Sel = httpContext.GetPar( "TFTipMaqDsc_Sel") ;
      AV59Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMaqCod, AV27TFMaqCod_Sel, AV28TFMaqDsc, AV29TFMaqDsc_Sel, AV30TFMaqTinTip, AV31TFMaqTinTip_Sel, AV32TFMaqVolMax, AV33TFMaqVolMax_To, AV34TFMaqVolMin, AV35TFMaqVolMin_To, AV36TFMaqVolMed, AV37TFMaqVolMed_To, AV38TFMaqVolTop, AV39TFMaqVolTop_To, AV40TFMaqVolRes, AV41TFMaqVolRes_To, AV42TFMaqKgsMax, AV43TFMaqKgsMax_To, AV44TFMaqKgsMed, AV45TFMaqKgsMed_To, AV46TFMaqKgsMin, AV47TFMaqKgsMin_To, AV48TFTipMaqCod, AV49TFTipMaqCod_Sel, AV50TFTipMaqDsc, AV51TFTipMaqDsc_Sel, AV59Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa25O2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start25O2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmaquinww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUINWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV59Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmaquinww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV26TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV27TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC", GXutil.rtrim( AV28TFMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC_SEL", GXutil.rtrim( AV29TFMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQTINTIP", GXutil.rtrim( AV30TFMaqTinTip));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQTINTIP_SEL", GXutil.rtrim( AV31TFMaqTinTip_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMAX", GXutil.ltrim( localUtil.ntoc( AV32TFMaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMAX_TO", GXutil.ltrim( localUtil.ntoc( AV33TFMaqVolMax_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMIN", GXutil.ltrim( localUtil.ntoc( AV34TFMaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMIN_TO", GXutil.ltrim( localUtil.ntoc( AV35TFMaqVolMin_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMED", GXutil.ltrim( localUtil.ntoc( AV36TFMaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMED_TO", GXutil.ltrim( localUtil.ntoc( AV37TFMaqVolMed_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLTOP", GXutil.ltrim( localUtil.ntoc( AV38TFMaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLTOP_TO", GXutil.ltrim( localUtil.ntoc( AV39TFMaqVolTop_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLRES", GXutil.ltrim( localUtil.ntoc( AV40TFMaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLRES_TO", GXutil.ltrim( localUtil.ntoc( AV41TFMaqVolRes_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMAX", GXutil.ltrim( localUtil.ntoc( AV42TFMaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMAX_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMaqKgsMax_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMED", GXutil.ltrim( localUtil.ntoc( AV44TFMaqKgsMed, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMED_TO", GXutil.ltrim( localUtil.ntoc( AV45TFMaqKgsMed_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMIN", GXutil.ltrim( localUtil.ntoc( AV46TFMaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMIN_TO", GXutil.ltrim( localUtil.ntoc( AV47TFMaqKgsMin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQCOD", GXutil.rtrim( AV48TFTipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQCOD_SEL", GXutil.rtrim( AV49TFTipMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQDSC", GXutil.rtrim( AV50TFTipMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQDSC_SEL", GXutil.rtrim( AV51TFTipMaqDsc_Sel));
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
         we25O2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt25O2( ) ;
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
      return formatLink("app.tmaquinww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAQUINWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " MANTENIMIENTO DE MAQUINAS", "") ;
   }

   public void wb25O0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUINWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUINWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUINWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUINWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUINWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_25O2( true) ;
      }
      else
      {
         wb_table1_27_25O2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_25O2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV54GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV55GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV59Pgmname), GXutil.rtrim( localUtil.format( AV59Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUINWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV52DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
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

   public void start25O2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " MANTENIMIENTO DE MAQUINAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup25O0( ) ;
   }

   public void ws25O2( )
   {
      start25O2( ) ;
      evt25O2( ) ;
   }

   public void evt25O2( )
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
                           e1125O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1225O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1325O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1425O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1525O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1625O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1725O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e1825O2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e1925O2 ();
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
                           AV56GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A619MaqTinTip = httpContext.cgiGet( edtMaqTinTip_Internalname) ;
                           n619MaqTinTip = false ;
                           A623MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n623MaqVolMax = false ;
                           A625MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n625MaqVolMin = false ;
                           A624MaqVolMed = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n624MaqVolMed = false ;
                           A2802MaqVolTop = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolTop_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2802MaqVolTop = false ;
                           A2801MaqVolRes = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqVolRes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2801MaqVolRes = false ;
                           A4285MaqKgsMax = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)) ;
                           n4285MaqKgsMax = false ;
                           A4284MaqKgsMed = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMed_Internalname)) ;
                           n4284MaqKgsMed = false ;
                           A4283MaqKgsMin = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)) ;
                           n4283MaqKgsMin = false ;
                           A1011TipMaqCod = httpContext.cgiGet( edtTipMaqCod_Internalname) ;
                           n1011TipMaqCod = false ;
                           A1012TipMaqDsc = httpContext.cgiGet( edtTipMaqDsc_Internalname) ;
                           n1012TipMaqDsc = false ;
                           A600MaqCap = (int)(localUtil.ctol( httpContext.cgiGet( edtMaqCap_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n600MaqCap = false ;
                           A605MaqCosMin = localUtil.ctond( httpContext.cgiGet( edtMaqCosMin_Internalname)) ;
                           n605MaqCosMin = false ;
                           A612MaqHorPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqHorPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n612MaqHorPro = false ;
                           A615MaqMinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqMinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n615MaqMinPro = false ;
                           A620MaqTip = GXutil.upper( httpContext.cgiGet( edtMaqTip_Internalname)) ;
                           n620MaqTip = false ;
                           A607MaqEst = GXutil.upper( httpContext.cgiGet( edtMaqEst_Internalname)) ;
                           n607MaqEst = false ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A621MaqUltFec = httpContext.cgiGet( edtMaqUltFec_Internalname) ;
                           n621MaqUltFec = false ;
                           A617MaqResDia = localUtil.ctond( httpContext.cgiGet( edtMaqResDia_Internalname)) ;
                           n617MaqResDia = false ;
                           A611MaqHorAsi = localUtil.ctond( httpContext.cgiGet( edtMaqHorAsi_Internalname)) ;
                           n611MaqHorAsi = false ;
                           A616MaqOrdSeq = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqOrdSeq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n616MaqOrdSeq = false ;
                           A622MaqUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtMaqUltLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n622MaqUltLin = false ;
                           A4282MaqFormul = GXutil.upper( httpContext.cgiGet( edtMaqFormul_Internalname)) ;
                           n4282MaqFormul = false ;
                           A4319MaqPrdMin = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPrdMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4319MaqPrdMin = false ;
                           A4320MaqPrdMed = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPrdMed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4320MaqPrdMed = false ;
                           A4321MaqPrdMax = (short)(localUtil.ctol( httpContext.cgiGet( edtMaqPrdMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4321MaqPrdMax = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2025O2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2125O2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2225O2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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

   public void we25O2( )
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

   public void pa25O2( )
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
                                 String AV15FilterFullText ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV26TFMaqCod ,
                                 String AV27TFMaqCod_Sel ,
                                 String AV28TFMaqDsc ,
                                 String AV29TFMaqDsc_Sel ,
                                 String AV30TFMaqTinTip ,
                                 String AV31TFMaqTinTip_Sel ,
                                 int AV32TFMaqVolMax ,
                                 int AV33TFMaqVolMax_To ,
                                 int AV34TFMaqVolMin ,
                                 int AV35TFMaqVolMin_To ,
                                 int AV36TFMaqVolMed ,
                                 int AV37TFMaqVolMed_To ,
                                 int AV38TFMaqVolTop ,
                                 int AV39TFMaqVolTop_To ,
                                 int AV40TFMaqVolRes ,
                                 int AV41TFMaqVolRes_To ,
                                 java.math.BigDecimal AV42TFMaqKgsMax ,
                                 java.math.BigDecimal AV43TFMaqKgsMax_To ,
                                 java.math.BigDecimal AV44TFMaqKgsMed ,
                                 java.math.BigDecimal AV45TFMaqKgsMed_To ,
                                 java.math.BigDecimal AV46TFMaqKgsMin ,
                                 java.math.BigDecimal AV47TFMaqKgsMin_To ,
                                 String AV48TFTipMaqCod ,
                                 String AV49TFTipMaqCod_Sel ,
                                 String AV50TFTipMaqDsc ,
                                 String AV51TFTipMaqDsc_Sel ,
                                 String AV59Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2125O2 ();
      GRID_nCurrentRecord = 0 ;
      rf25O2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUINWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV59Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmaquinww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
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
      rf25O2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV59Pgmname = "TMAQUINWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf25O2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e2125O2 ();
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
                                              AV64Tmaquinwwds_1_filterfulltext ,
                                              AV66Tmaquinwwds_3_tfmaqcod_sel ,
                                              AV65Tmaquinwwds_2_tfmaqcod ,
                                              AV68Tmaquinwwds_5_tfmaqdsc_sel ,
                                              AV67Tmaquinwwds_4_tfmaqdsc ,
                                              AV70Tmaquinwwds_7_tfmaqtintip_sel ,
                                              AV69Tmaquinwwds_6_tfmaqtintip ,
                                              Integer.valueOf(AV71Tmaquinwwds_8_tfmaqvolmax) ,
                                              Integer.valueOf(AV72Tmaquinwwds_9_tfmaqvolmax_to) ,
                                              Integer.valueOf(AV73Tmaquinwwds_10_tfmaqvolmin) ,
                                              Integer.valueOf(AV74Tmaquinwwds_11_tfmaqvolmin_to) ,
                                              Integer.valueOf(AV75Tmaquinwwds_12_tfmaqvolmed) ,
                                              Integer.valueOf(AV76Tmaquinwwds_13_tfmaqvolmed_to) ,
                                              Integer.valueOf(AV77Tmaquinwwds_14_tfmaqvoltop) ,
                                              Integer.valueOf(AV78Tmaquinwwds_15_tfmaqvoltop_to) ,
                                              Integer.valueOf(AV79Tmaquinwwds_16_tfmaqvolres) ,
                                              Integer.valueOf(AV80Tmaquinwwds_17_tfmaqvolres_to) ,
                                              AV81Tmaquinwwds_18_tfmaqkgsmax ,
                                              AV82Tmaquinwwds_19_tfmaqkgsmax_to ,
                                              AV83Tmaquinwwds_20_tfmaqkgsmed ,
                                              AV84Tmaquinwwds_21_tfmaqkgsmed_to ,
                                              AV85Tmaquinwwds_22_tfmaqkgsmin ,
                                              AV86Tmaquinwwds_23_tfmaqkgsmin_to ,
                                              AV88Tmaquinwwds_25_tftipmaqcod_sel ,
                                              AV87Tmaquinwwds_24_tftipmaqcod ,
                                              AV90Tmaquinwwds_27_tftipmaqdsc_sel ,
                                              AV89Tmaquinwwds_26_tftipmaqdsc ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              A619MaqTinTip ,
                                              Integer.valueOf(A623MaqVolMax) ,
                                              Integer.valueOf(A625MaqVolMin) ,
                                              Integer.valueOf(A624MaqVolMed) ,
                                              Integer.valueOf(A2802MaqVolTop) ,
                                              Integer.valueOf(A2801MaqVolRes) ,
                                              A4285MaqKgsMax ,
                                              A4284MaqKgsMed ,
                                              A4283MaqKgsMin ,
                                              A1011TipMaqCod ,
                                              A1012TipMaqDsc ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
         lV65Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV65Tmaquinwwds_2_tfmaqcod), 6, "%") ;
         lV67Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV67Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
         lV69Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV69Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
         lV87Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV87Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
         lV89Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV89Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
         /* Using cursor H025O2 */
         pr_default.execute(0, new Object[] {lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_2_tfmaqcod, AV66Tmaquinwwds_3_tfmaqcod_sel, lV67Tmaquinwwds_4_tfmaqdsc, AV68Tmaquinwwds_5_tfmaqdsc_sel, lV69Tmaquinwwds_6_tfmaqtintip, AV70Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV71Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV72Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV73Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV74Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV75Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV76Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV77Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV78Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV79Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV80Tmaquinwwds_17_tfmaqvolres_to), AV81Tmaquinwwds_18_tfmaqkgsmax, AV82Tmaquinwwds_19_tfmaqkgsmax_to, AV83Tmaquinwwds_20_tfmaqkgsmed, AV84Tmaquinwwds_21_tfmaqkgsmed_to, AV85Tmaquinwwds_22_tfmaqkgsmin, AV86Tmaquinwwds_23_tfmaqkgsmin_to, lV87Tmaquinwwds_24_tftipmaqcod, AV88Tmaquinwwds_25_tftipmaqcod_sel, lV89Tmaquinwwds_26_tftipmaqdsc, AV90Tmaquinwwds_27_tftipmaqdsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4321MaqPrdMax = H025O2_A4321MaqPrdMax[0] ;
            n4321MaqPrdMax = H025O2_n4321MaqPrdMax[0] ;
            A4320MaqPrdMed = H025O2_A4320MaqPrdMed[0] ;
            n4320MaqPrdMed = H025O2_n4320MaqPrdMed[0] ;
            A4319MaqPrdMin = H025O2_A4319MaqPrdMin[0] ;
            n4319MaqPrdMin = H025O2_n4319MaqPrdMin[0] ;
            A4282MaqFormul = H025O2_A4282MaqFormul[0] ;
            n4282MaqFormul = H025O2_n4282MaqFormul[0] ;
            A622MaqUltLin = H025O2_A622MaqUltLin[0] ;
            n622MaqUltLin = H025O2_n622MaqUltLin[0] ;
            A616MaqOrdSeq = H025O2_A616MaqOrdSeq[0] ;
            n616MaqOrdSeq = H025O2_n616MaqOrdSeq[0] ;
            A611MaqHorAsi = H025O2_A611MaqHorAsi[0] ;
            n611MaqHorAsi = H025O2_n611MaqHorAsi[0] ;
            A617MaqResDia = H025O2_A617MaqResDia[0] ;
            n617MaqResDia = H025O2_n617MaqResDia[0] ;
            A621MaqUltFec = H025O2_A621MaqUltFec[0] ;
            n621MaqUltFec = H025O2_n621MaqUltFec[0] ;
            A407EmprNom = H025O2_A407EmprNom[0] ;
            n407EmprNom = H025O2_n407EmprNom[0] ;
            A607MaqEst = H025O2_A607MaqEst[0] ;
            n607MaqEst = H025O2_n607MaqEst[0] ;
            A620MaqTip = H025O2_A620MaqTip[0] ;
            n620MaqTip = H025O2_n620MaqTip[0] ;
            A615MaqMinPro = H025O2_A615MaqMinPro[0] ;
            n615MaqMinPro = H025O2_n615MaqMinPro[0] ;
            A612MaqHorPro = H025O2_A612MaqHorPro[0] ;
            n612MaqHorPro = H025O2_n612MaqHorPro[0] ;
            A605MaqCosMin = H025O2_A605MaqCosMin[0] ;
            n605MaqCosMin = H025O2_n605MaqCosMin[0] ;
            A600MaqCap = H025O2_A600MaqCap[0] ;
            n600MaqCap = H025O2_n600MaqCap[0] ;
            A1012TipMaqDsc = H025O2_A1012TipMaqDsc[0] ;
            n1012TipMaqDsc = H025O2_n1012TipMaqDsc[0] ;
            A1011TipMaqCod = H025O2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = H025O2_n1011TipMaqCod[0] ;
            A4283MaqKgsMin = H025O2_A4283MaqKgsMin[0] ;
            n4283MaqKgsMin = H025O2_n4283MaqKgsMin[0] ;
            A4284MaqKgsMed = H025O2_A4284MaqKgsMed[0] ;
            n4284MaqKgsMed = H025O2_n4284MaqKgsMed[0] ;
            A4285MaqKgsMax = H025O2_A4285MaqKgsMax[0] ;
            n4285MaqKgsMax = H025O2_n4285MaqKgsMax[0] ;
            A2801MaqVolRes = H025O2_A2801MaqVolRes[0] ;
            n2801MaqVolRes = H025O2_n2801MaqVolRes[0] ;
            A2802MaqVolTop = H025O2_A2802MaqVolTop[0] ;
            n2802MaqVolTop = H025O2_n2802MaqVolTop[0] ;
            A624MaqVolMed = H025O2_A624MaqVolMed[0] ;
            n624MaqVolMed = H025O2_n624MaqVolMed[0] ;
            A625MaqVolMin = H025O2_A625MaqVolMin[0] ;
            n625MaqVolMin = H025O2_n625MaqVolMin[0] ;
            A623MaqVolMax = H025O2_A623MaqVolMax[0] ;
            n623MaqVolMax = H025O2_n623MaqVolMax[0] ;
            A619MaqTinTip = H025O2_A619MaqTinTip[0] ;
            n619MaqTinTip = H025O2_n619MaqTinTip[0] ;
            A606MaqDsc = H025O2_A606MaqDsc[0] ;
            n606MaqDsc = H025O2_n606MaqDsc[0] ;
            A602MaqCod = H025O2_A602MaqCod[0] ;
            A396EmprCod = H025O2_A396EmprCod[0] ;
            A407EmprNom = H025O2_A407EmprNom[0] ;
            n407EmprNom = H025O2_n407EmprNom[0] ;
            A1012TipMaqDsc = H025O2_A1012TipMaqDsc[0] ;
            n1012TipMaqDsc = H025O2_n1012TipMaqDsc[0] ;
            e2225O2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb25O0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes25O2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A602MaqCod, ""))));
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
      AV64Tmaquinwwds_1_filterfulltext = AV15FilterFullText ;
      AV65Tmaquinwwds_2_tfmaqcod = AV26TFMaqCod ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV67Tmaquinwwds_4_tfmaqdsc = AV28TFMaqDsc ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = AV29TFMaqDsc_Sel ;
      AV69Tmaquinwwds_6_tfmaqtintip = AV30TFMaqTinTip ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = AV31TFMaqTinTip_Sel ;
      AV71Tmaquinwwds_8_tfmaqvolmax = AV32TFMaqVolMax ;
      AV72Tmaquinwwds_9_tfmaqvolmax_to = AV33TFMaqVolMax_To ;
      AV73Tmaquinwwds_10_tfmaqvolmin = AV34TFMaqVolMin ;
      AV74Tmaquinwwds_11_tfmaqvolmin_to = AV35TFMaqVolMin_To ;
      AV75Tmaquinwwds_12_tfmaqvolmed = AV36TFMaqVolMed ;
      AV76Tmaquinwwds_13_tfmaqvolmed_to = AV37TFMaqVolMed_To ;
      AV77Tmaquinwwds_14_tfmaqvoltop = AV38TFMaqVolTop ;
      AV78Tmaquinwwds_15_tfmaqvoltop_to = AV39TFMaqVolTop_To ;
      AV79Tmaquinwwds_16_tfmaqvolres = AV40TFMaqVolRes ;
      AV80Tmaquinwwds_17_tfmaqvolres_to = AV41TFMaqVolRes_To ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = AV44TFMaqKgsMed ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = AV45TFMaqKgsMed_To ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = AV46TFMaqKgsMin ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = AV47TFMaqKgsMin_To ;
      AV87Tmaquinwwds_24_tftipmaqcod = AV48TFTipMaqCod ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV89Tmaquinwwds_26_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV64Tmaquinwwds_1_filterfulltext ,
                                           AV66Tmaquinwwds_3_tfmaqcod_sel ,
                                           AV65Tmaquinwwds_2_tfmaqcod ,
                                           AV68Tmaquinwwds_5_tfmaqdsc_sel ,
                                           AV67Tmaquinwwds_4_tfmaqdsc ,
                                           AV70Tmaquinwwds_7_tfmaqtintip_sel ,
                                           AV69Tmaquinwwds_6_tfmaqtintip ,
                                           Integer.valueOf(AV71Tmaquinwwds_8_tfmaqvolmax) ,
                                           Integer.valueOf(AV72Tmaquinwwds_9_tfmaqvolmax_to) ,
                                           Integer.valueOf(AV73Tmaquinwwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV74Tmaquinwwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV75Tmaquinwwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV76Tmaquinwwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV77Tmaquinwwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV78Tmaquinwwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV79Tmaquinwwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV80Tmaquinwwds_17_tfmaqvolres_to) ,
                                           AV81Tmaquinwwds_18_tfmaqkgsmax ,
                                           AV82Tmaquinwwds_19_tfmaqkgsmax_to ,
                                           AV83Tmaquinwwds_20_tfmaqkgsmed ,
                                           AV84Tmaquinwwds_21_tfmaqkgsmed_to ,
                                           AV85Tmaquinwwds_22_tfmaqkgsmin ,
                                           AV86Tmaquinwwds_23_tfmaqkgsmin_to ,
                                           AV88Tmaquinwwds_25_tftipmaqcod_sel ,
                                           AV87Tmaquinwwds_24_tftipmaqcod ,
                                           AV90Tmaquinwwds_27_tftipmaqdsc_sel ,
                                           AV89Tmaquinwwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A623MaqVolMax) ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV64Tmaquinwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV64Tmaquinwwds_1_filterfulltext), "%", "") ;
      lV65Tmaquinwwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV65Tmaquinwwds_2_tfmaqcod), 6, "%") ;
      lV67Tmaquinwwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV67Tmaquinwwds_4_tfmaqdsc), 16, "%") ;
      lV69Tmaquinwwds_6_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV69Tmaquinwwds_6_tfmaqtintip), 2, "%") ;
      lV87Tmaquinwwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV87Tmaquinwwds_24_tftipmaqcod), 4, "%") ;
      lV89Tmaquinwwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV89Tmaquinwwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor H025O3 */
      pr_default.execute(1, new Object[] {lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV64Tmaquinwwds_1_filterfulltext, lV65Tmaquinwwds_2_tfmaqcod, AV66Tmaquinwwds_3_tfmaqcod_sel, lV67Tmaquinwwds_4_tfmaqdsc, AV68Tmaquinwwds_5_tfmaqdsc_sel, lV69Tmaquinwwds_6_tfmaqtintip, AV70Tmaquinwwds_7_tfmaqtintip_sel, Integer.valueOf(AV71Tmaquinwwds_8_tfmaqvolmax), Integer.valueOf(AV72Tmaquinwwds_9_tfmaqvolmax_to), Integer.valueOf(AV73Tmaquinwwds_10_tfmaqvolmin), Integer.valueOf(AV74Tmaquinwwds_11_tfmaqvolmin_to), Integer.valueOf(AV75Tmaquinwwds_12_tfmaqvolmed), Integer.valueOf(AV76Tmaquinwwds_13_tfmaqvolmed_to), Integer.valueOf(AV77Tmaquinwwds_14_tfmaqvoltop), Integer.valueOf(AV78Tmaquinwwds_15_tfmaqvoltop_to), Integer.valueOf(AV79Tmaquinwwds_16_tfmaqvolres), Integer.valueOf(AV80Tmaquinwwds_17_tfmaqvolres_to), AV81Tmaquinwwds_18_tfmaqkgsmax, AV82Tmaquinwwds_19_tfmaqkgsmax_to, AV83Tmaquinwwds_20_tfmaqkgsmed, AV84Tmaquinwwds_21_tfmaqkgsmed_to, AV85Tmaquinwwds_22_tfmaqkgsmin, AV86Tmaquinwwds_23_tfmaqkgsmin_to, lV87Tmaquinwwds_24_tftipmaqcod, AV88Tmaquinwwds_25_tftipmaqcod_sel, lV89Tmaquinwwds_26_tftipmaqdsc, AV90Tmaquinwwds_27_tftipmaqdsc_sel});
      GRID_nRecordCount = H025O3_AGRID_nRecordCount[0] ;
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
      AV64Tmaquinwwds_1_filterfulltext = AV15FilterFullText ;
      AV65Tmaquinwwds_2_tfmaqcod = AV26TFMaqCod ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV67Tmaquinwwds_4_tfmaqdsc = AV28TFMaqDsc ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = AV29TFMaqDsc_Sel ;
      AV69Tmaquinwwds_6_tfmaqtintip = AV30TFMaqTinTip ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = AV31TFMaqTinTip_Sel ;
      AV71Tmaquinwwds_8_tfmaqvolmax = AV32TFMaqVolMax ;
      AV72Tmaquinwwds_9_tfmaqvolmax_to = AV33TFMaqVolMax_To ;
      AV73Tmaquinwwds_10_tfmaqvolmin = AV34TFMaqVolMin ;
      AV74Tmaquinwwds_11_tfmaqvolmin_to = AV35TFMaqVolMin_To ;
      AV75Tmaquinwwds_12_tfmaqvolmed = AV36TFMaqVolMed ;
      AV76Tmaquinwwds_13_tfmaqvolmed_to = AV37TFMaqVolMed_To ;
      AV77Tmaquinwwds_14_tfmaqvoltop = AV38TFMaqVolTop ;
      AV78Tmaquinwwds_15_tfmaqvoltop_to = AV39TFMaqVolTop_To ;
      AV79Tmaquinwwds_16_tfmaqvolres = AV40TFMaqVolRes ;
      AV80Tmaquinwwds_17_tfmaqvolres_to = AV41TFMaqVolRes_To ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = AV44TFMaqKgsMed ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = AV45TFMaqKgsMed_To ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = AV46TFMaqKgsMin ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = AV47TFMaqKgsMin_To ;
      AV87Tmaquinwwds_24_tftipmaqcod = AV48TFTipMaqCod ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV89Tmaquinwwds_26_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMaqCod, AV27TFMaqCod_Sel, AV28TFMaqDsc, AV29TFMaqDsc_Sel, AV30TFMaqTinTip, AV31TFMaqTinTip_Sel, AV32TFMaqVolMax, AV33TFMaqVolMax_To, AV34TFMaqVolMin, AV35TFMaqVolMin_To, AV36TFMaqVolMed, AV37TFMaqVolMed_To, AV38TFMaqVolTop, AV39TFMaqVolTop_To, AV40TFMaqVolRes, AV41TFMaqVolRes_To, AV42TFMaqKgsMax, AV43TFMaqKgsMax_To, AV44TFMaqKgsMed, AV45TFMaqKgsMed_To, AV46TFMaqKgsMin, AV47TFMaqKgsMin_To, AV48TFTipMaqCod, AV49TFTipMaqCod_Sel, AV50TFTipMaqDsc, AV51TFTipMaqDsc_Sel, AV59Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV64Tmaquinwwds_1_filterfulltext = AV15FilterFullText ;
      AV65Tmaquinwwds_2_tfmaqcod = AV26TFMaqCod ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV67Tmaquinwwds_4_tfmaqdsc = AV28TFMaqDsc ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = AV29TFMaqDsc_Sel ;
      AV69Tmaquinwwds_6_tfmaqtintip = AV30TFMaqTinTip ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = AV31TFMaqTinTip_Sel ;
      AV71Tmaquinwwds_8_tfmaqvolmax = AV32TFMaqVolMax ;
      AV72Tmaquinwwds_9_tfmaqvolmax_to = AV33TFMaqVolMax_To ;
      AV73Tmaquinwwds_10_tfmaqvolmin = AV34TFMaqVolMin ;
      AV74Tmaquinwwds_11_tfmaqvolmin_to = AV35TFMaqVolMin_To ;
      AV75Tmaquinwwds_12_tfmaqvolmed = AV36TFMaqVolMed ;
      AV76Tmaquinwwds_13_tfmaqvolmed_to = AV37TFMaqVolMed_To ;
      AV77Tmaquinwwds_14_tfmaqvoltop = AV38TFMaqVolTop ;
      AV78Tmaquinwwds_15_tfmaqvoltop_to = AV39TFMaqVolTop_To ;
      AV79Tmaquinwwds_16_tfmaqvolres = AV40TFMaqVolRes ;
      AV80Tmaquinwwds_17_tfmaqvolres_to = AV41TFMaqVolRes_To ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = AV44TFMaqKgsMed ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = AV45TFMaqKgsMed_To ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = AV46TFMaqKgsMin ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = AV47TFMaqKgsMin_To ;
      AV87Tmaquinwwds_24_tftipmaqcod = AV48TFTipMaqCod ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV89Tmaquinwwds_26_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMaqCod, AV27TFMaqCod_Sel, AV28TFMaqDsc, AV29TFMaqDsc_Sel, AV30TFMaqTinTip, AV31TFMaqTinTip_Sel, AV32TFMaqVolMax, AV33TFMaqVolMax_To, AV34TFMaqVolMin, AV35TFMaqVolMin_To, AV36TFMaqVolMed, AV37TFMaqVolMed_To, AV38TFMaqVolTop, AV39TFMaqVolTop_To, AV40TFMaqVolRes, AV41TFMaqVolRes_To, AV42TFMaqKgsMax, AV43TFMaqKgsMax_To, AV44TFMaqKgsMed, AV45TFMaqKgsMed_To, AV46TFMaqKgsMin, AV47TFMaqKgsMin_To, AV48TFTipMaqCod, AV49TFTipMaqCod_Sel, AV50TFTipMaqDsc, AV51TFTipMaqDsc_Sel, AV59Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV64Tmaquinwwds_1_filterfulltext = AV15FilterFullText ;
      AV65Tmaquinwwds_2_tfmaqcod = AV26TFMaqCod ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV67Tmaquinwwds_4_tfmaqdsc = AV28TFMaqDsc ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = AV29TFMaqDsc_Sel ;
      AV69Tmaquinwwds_6_tfmaqtintip = AV30TFMaqTinTip ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = AV31TFMaqTinTip_Sel ;
      AV71Tmaquinwwds_8_tfmaqvolmax = AV32TFMaqVolMax ;
      AV72Tmaquinwwds_9_tfmaqvolmax_to = AV33TFMaqVolMax_To ;
      AV73Tmaquinwwds_10_tfmaqvolmin = AV34TFMaqVolMin ;
      AV74Tmaquinwwds_11_tfmaqvolmin_to = AV35TFMaqVolMin_To ;
      AV75Tmaquinwwds_12_tfmaqvolmed = AV36TFMaqVolMed ;
      AV76Tmaquinwwds_13_tfmaqvolmed_to = AV37TFMaqVolMed_To ;
      AV77Tmaquinwwds_14_tfmaqvoltop = AV38TFMaqVolTop ;
      AV78Tmaquinwwds_15_tfmaqvoltop_to = AV39TFMaqVolTop_To ;
      AV79Tmaquinwwds_16_tfmaqvolres = AV40TFMaqVolRes ;
      AV80Tmaquinwwds_17_tfmaqvolres_to = AV41TFMaqVolRes_To ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = AV44TFMaqKgsMed ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = AV45TFMaqKgsMed_To ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = AV46TFMaqKgsMin ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = AV47TFMaqKgsMin_To ;
      AV87Tmaquinwwds_24_tftipmaqcod = AV48TFTipMaqCod ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV89Tmaquinwwds_26_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMaqCod, AV27TFMaqCod_Sel, AV28TFMaqDsc, AV29TFMaqDsc_Sel, AV30TFMaqTinTip, AV31TFMaqTinTip_Sel, AV32TFMaqVolMax, AV33TFMaqVolMax_To, AV34TFMaqVolMin, AV35TFMaqVolMin_To, AV36TFMaqVolMed, AV37TFMaqVolMed_To, AV38TFMaqVolTop, AV39TFMaqVolTop_To, AV40TFMaqVolRes, AV41TFMaqVolRes_To, AV42TFMaqKgsMax, AV43TFMaqKgsMax_To, AV44TFMaqKgsMed, AV45TFMaqKgsMed_To, AV46TFMaqKgsMin, AV47TFMaqKgsMin_To, AV48TFTipMaqCod, AV49TFTipMaqCod_Sel, AV50TFTipMaqDsc, AV51TFTipMaqDsc_Sel, AV59Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV64Tmaquinwwds_1_filterfulltext = AV15FilterFullText ;
      AV65Tmaquinwwds_2_tfmaqcod = AV26TFMaqCod ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV67Tmaquinwwds_4_tfmaqdsc = AV28TFMaqDsc ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = AV29TFMaqDsc_Sel ;
      AV69Tmaquinwwds_6_tfmaqtintip = AV30TFMaqTinTip ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = AV31TFMaqTinTip_Sel ;
      AV71Tmaquinwwds_8_tfmaqvolmax = AV32TFMaqVolMax ;
      AV72Tmaquinwwds_9_tfmaqvolmax_to = AV33TFMaqVolMax_To ;
      AV73Tmaquinwwds_10_tfmaqvolmin = AV34TFMaqVolMin ;
      AV74Tmaquinwwds_11_tfmaqvolmin_to = AV35TFMaqVolMin_To ;
      AV75Tmaquinwwds_12_tfmaqvolmed = AV36TFMaqVolMed ;
      AV76Tmaquinwwds_13_tfmaqvolmed_to = AV37TFMaqVolMed_To ;
      AV77Tmaquinwwds_14_tfmaqvoltop = AV38TFMaqVolTop ;
      AV78Tmaquinwwds_15_tfmaqvoltop_to = AV39TFMaqVolTop_To ;
      AV79Tmaquinwwds_16_tfmaqvolres = AV40TFMaqVolRes ;
      AV80Tmaquinwwds_17_tfmaqvolres_to = AV41TFMaqVolRes_To ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = AV44TFMaqKgsMed ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = AV45TFMaqKgsMed_To ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = AV46TFMaqKgsMin ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = AV47TFMaqKgsMin_To ;
      AV87Tmaquinwwds_24_tftipmaqcod = AV48TFTipMaqCod ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV89Tmaquinwwds_26_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMaqCod, AV27TFMaqCod_Sel, AV28TFMaqDsc, AV29TFMaqDsc_Sel, AV30TFMaqTinTip, AV31TFMaqTinTip_Sel, AV32TFMaqVolMax, AV33TFMaqVolMax_To, AV34TFMaqVolMin, AV35TFMaqVolMin_To, AV36TFMaqVolMed, AV37TFMaqVolMed_To, AV38TFMaqVolTop, AV39TFMaqVolTop_To, AV40TFMaqVolRes, AV41TFMaqVolRes_To, AV42TFMaqKgsMax, AV43TFMaqKgsMax_To, AV44TFMaqKgsMed, AV45TFMaqKgsMed_To, AV46TFMaqKgsMin, AV47TFMaqKgsMin_To, AV48TFTipMaqCod, AV49TFTipMaqCod_Sel, AV50TFTipMaqDsc, AV51TFTipMaqDsc_Sel, AV59Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV64Tmaquinwwds_1_filterfulltext = AV15FilterFullText ;
      AV65Tmaquinwwds_2_tfmaqcod = AV26TFMaqCod ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV67Tmaquinwwds_4_tfmaqdsc = AV28TFMaqDsc ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = AV29TFMaqDsc_Sel ;
      AV69Tmaquinwwds_6_tfmaqtintip = AV30TFMaqTinTip ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = AV31TFMaqTinTip_Sel ;
      AV71Tmaquinwwds_8_tfmaqvolmax = AV32TFMaqVolMax ;
      AV72Tmaquinwwds_9_tfmaqvolmax_to = AV33TFMaqVolMax_To ;
      AV73Tmaquinwwds_10_tfmaqvolmin = AV34TFMaqVolMin ;
      AV74Tmaquinwwds_11_tfmaqvolmin_to = AV35TFMaqVolMin_To ;
      AV75Tmaquinwwds_12_tfmaqvolmed = AV36TFMaqVolMed ;
      AV76Tmaquinwwds_13_tfmaqvolmed_to = AV37TFMaqVolMed_To ;
      AV77Tmaquinwwds_14_tfmaqvoltop = AV38TFMaqVolTop ;
      AV78Tmaquinwwds_15_tfmaqvoltop_to = AV39TFMaqVolTop_To ;
      AV79Tmaquinwwds_16_tfmaqvolres = AV40TFMaqVolRes ;
      AV80Tmaquinwwds_17_tfmaqvolres_to = AV41TFMaqVolRes_To ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = AV44TFMaqKgsMed ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = AV45TFMaqKgsMed_To ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = AV46TFMaqKgsMin ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = AV47TFMaqKgsMin_To ;
      AV87Tmaquinwwds_24_tftipmaqcod = AV48TFTipMaqCod ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV89Tmaquinwwds_26_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV26TFMaqCod, AV27TFMaqCod_Sel, AV28TFMaqDsc, AV29TFMaqDsc_Sel, AV30TFMaqTinTip, AV31TFMaqTinTip_Sel, AV32TFMaqVolMax, AV33TFMaqVolMax_To, AV34TFMaqVolMin, AV35TFMaqVolMin_To, AV36TFMaqVolMed, AV37TFMaqVolMed_To, AV38TFMaqVolTop, AV39TFMaqVolTop_To, AV40TFMaqVolRes, AV41TFMaqVolRes_To, AV42TFMaqKgsMax, AV43TFMaqKgsMax_To, AV44TFMaqKgsMed, AV45TFMaqKgsMed_To, AV46TFMaqKgsMin, AV47TFMaqKgsMin_To, AV48TFTipMaqCod, AV49TFTipMaqCod_Sel, AV50TFTipMaqDsc, AV51TFTipMaqDsc_Sel, AV59Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV59Pgmname = "TMAQUINWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup25O0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2025O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV52DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV59Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUINWW");
         AV59Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59Pgmname", AV59Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV59Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tmaquinww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e2025O2 ();
      if (returnInSub) return;
   }

   public void e2025O2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV60Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmaquinww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV60Station = GXt_char1 ;
      GXv_char2[0] = AV61Emprcod ;
      GXv_char3[0] = AV62Emprnom ;
      GXv_char4[0] = AV63Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV60Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaquinww_impl.this.AV61Emprcod = GXv_char2[0] ;
      tmaquinww_impl.this.AV62Emprnom = GXv_char3[0] ;
      tmaquinww_impl.this.AV63Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " MANTENIMIENTO DE MAQUINAS", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV52DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV52DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2125O2( )
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
      if ( GXutil.strcmp(AV22Session.getValue("TMAQUINWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("TMAQUINWWColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqTinTip_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTinTip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTinTip_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolMax_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMax_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMed_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolTop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolTop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolTop_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolRes_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqKgsMax_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMax_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqKgsMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMed_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqKgsMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV54GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridCurrentPage), 10, 0));
      AV55GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55GridPageCount), 10, 0));
      AV64Tmaquinwwds_1_filterfulltext = AV15FilterFullText ;
      AV65Tmaquinwwds_2_tfmaqcod = AV26TFMaqCod ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = AV27TFMaqCod_Sel ;
      AV67Tmaquinwwds_4_tfmaqdsc = AV28TFMaqDsc ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = AV29TFMaqDsc_Sel ;
      AV69Tmaquinwwds_6_tfmaqtintip = AV30TFMaqTinTip ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = AV31TFMaqTinTip_Sel ;
      AV71Tmaquinwwds_8_tfmaqvolmax = AV32TFMaqVolMax ;
      AV72Tmaquinwwds_9_tfmaqvolmax_to = AV33TFMaqVolMax_To ;
      AV73Tmaquinwwds_10_tfmaqvolmin = AV34TFMaqVolMin ;
      AV74Tmaquinwwds_11_tfmaqvolmin_to = AV35TFMaqVolMin_To ;
      AV75Tmaquinwwds_12_tfmaqvolmed = AV36TFMaqVolMed ;
      AV76Tmaquinwwds_13_tfmaqvolmed_to = AV37TFMaqVolMed_To ;
      AV77Tmaquinwwds_14_tfmaqvoltop = AV38TFMaqVolTop ;
      AV78Tmaquinwwds_15_tfmaqvoltop_to = AV39TFMaqVolTop_To ;
      AV79Tmaquinwwds_16_tfmaqvolres = AV40TFMaqVolRes ;
      AV80Tmaquinwwds_17_tfmaqvolres_to = AV41TFMaqVolRes_To ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = AV42TFMaqKgsMax ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = AV43TFMaqKgsMax_To ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = AV44TFMaqKgsMed ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = AV45TFMaqKgsMed_To ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = AV46TFMaqKgsMin ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = AV47TFMaqKgsMin_To ;
      AV87Tmaquinwwds_24_tftipmaqcod = AV48TFTipMaqCod ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = AV49TFTipMaqCod_Sel ;
      AV89Tmaquinwwds_26_tftipmaqdsc = AV50TFTipMaqDsc ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = AV51TFTipMaqDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1225O2( )
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

   public void e1325O2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1425O2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV26TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMaqCod", AV26TFMaqCod);
            AV27TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFMaqCod_Sel", AV27TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqDsc") == 0 )
         {
            AV28TFMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFMaqDsc", AV28TFMaqDsc);
            AV29TFMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMaqDsc_Sel", AV29TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqTinTip") == 0 )
         {
            AV30TFMaqTinTip = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMaqTinTip", AV30TFMaqTinTip);
            AV31TFMaqTinTip_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFMaqTinTip_Sel", AV31TFMaqTinTip_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolMax") == 0 )
         {
            AV32TFMaqVolMax = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFMaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFMaqVolMax), 5, 0));
            AV33TFMaqVolMax_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFMaqVolMax_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFMaqVolMax_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolMin") == 0 )
         {
            AV34TFMaqVolMin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFMaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMaqVolMin), 5, 0));
            AV35TFMaqVolMin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFMaqVolMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMaqVolMin_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolMed") == 0 )
         {
            AV36TFMaqVolMed = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFMaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMaqVolMed), 5, 0));
            AV37TFMaqVolMed_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFMaqVolMed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMaqVolMed_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolTop") == 0 )
         {
            AV38TFMaqVolTop = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFMaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFMaqVolTop), 5, 0));
            AV39TFMaqVolTop_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMaqVolTop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFMaqVolTop_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolRes") == 0 )
         {
            AV40TFMaqVolRes = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMaqVolRes), 5, 0));
            AV41TFMaqVolRes_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMaqVolRes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMaqVolRes_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqKgsMax") == 0 )
         {
            AV42TFMaqKgsMax = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMaqKgsMax", GXutil.ltrimstr( AV42TFMaqKgsMax, 9, 2));
            AV43TFMaqKgsMax_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqKgsMax_To", GXutil.ltrimstr( AV43TFMaqKgsMax_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqKgsMed") == 0 )
         {
            AV44TFMaqKgsMed = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqKgsMed", GXutil.ltrimstr( AV44TFMaqKgsMed, 9, 2));
            AV45TFMaqKgsMed_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFMaqKgsMed_To", GXutil.ltrimstr( AV45TFMaqKgsMed_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqKgsMin") == 0 )
         {
            AV46TFMaqKgsMin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqKgsMin", GXutil.ltrimstr( AV46TFMaqKgsMin, 9, 2));
            AV47TFMaqKgsMin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqKgsMin_To", GXutil.ltrimstr( AV47TFMaqKgsMin_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipMaqCod") == 0 )
         {
            AV48TFTipMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFTipMaqCod", AV48TFTipMaqCod);
            AV49TFTipMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFTipMaqCod_Sel", AV49TFTipMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipMaqDsc") == 0 )
         {
            AV50TFTipMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFTipMaqDsc", AV50TFTipMaqDsc);
            AV51TFTipMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFTipMaqDsc_Sel", AV51TFTipMaqDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2225O2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
   }

   public void e1525O2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TMAQUINWWColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1125O2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TMAQUINWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV59Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TMAQUINWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TMAQUINWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmaquinww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV59Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e1625O2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmaquin", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","MaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e1725O2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.tmaquinwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmaquinww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      tmaquinww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e1825O2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tmaquinwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1925O2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tmaquinwwexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqCod", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqDsc", "", "", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqTinTip", "", "Tipo Maquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolMax", "", "Volumen Maximo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolMin", "", "Volumen Minimo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolMed", "", "Volumen Medio", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolTop", "", "Volumen Baño", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolRes", "", "Volumen Residual", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqKgsMax", "", "Kilos Maximos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqKgsMed", "", "Kilos Medios", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqKgsMin", "", "Kilos Minimos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipMaqCod", "", "Tipo de Máquina", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipMaqDsc", "", "Descripción", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMAQUINWWColumnsSelector", GXv_char4) ;
      tmaquinww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TMAQUINWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV26TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFMaqCod", AV26TFMaqCod);
      AV27TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFMaqCod_Sel", AV27TFMaqCod_Sel);
      AV28TFMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFMaqDsc", AV28TFMaqDsc);
      AV29TFMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFMaqDsc_Sel", AV29TFMaqDsc_Sel);
      AV30TFMaqTinTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFMaqTinTip", AV30TFMaqTinTip);
      AV31TFMaqTinTip_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFMaqTinTip_Sel", AV31TFMaqTinTip_Sel);
      AV32TFMaqVolMax = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFMaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFMaqVolMax), 5, 0));
      AV33TFMaqVolMax_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFMaqVolMax_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFMaqVolMax_To), 5, 0));
      AV34TFMaqVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFMaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMaqVolMin), 5, 0));
      AV35TFMaqVolMin_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFMaqVolMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMaqVolMin_To), 5, 0));
      AV36TFMaqVolMed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFMaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMaqVolMed), 5, 0));
      AV37TFMaqVolMed_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFMaqVolMed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMaqVolMed_To), 5, 0));
      AV38TFMaqVolTop = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFMaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFMaqVolTop), 5, 0));
      AV39TFMaqVolTop_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFMaqVolTop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFMaqVolTop_To), 5, 0));
      AV40TFMaqVolRes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFMaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMaqVolRes), 5, 0));
      AV41TFMaqVolRes_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFMaqVolRes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMaqVolRes_To), 5, 0));
      AV42TFMaqKgsMax = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFMaqKgsMax", GXutil.ltrimstr( AV42TFMaqKgsMax, 9, 2));
      AV43TFMaqKgsMax_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqKgsMax_To", GXutil.ltrimstr( AV43TFMaqKgsMax_To, 9, 2));
      AV44TFMaqKgsMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqKgsMed", GXutil.ltrimstr( AV44TFMaqKgsMed, 9, 2));
      AV45TFMaqKgsMed_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45TFMaqKgsMed_To", GXutil.ltrimstr( AV45TFMaqKgsMed_To, 9, 2));
      AV46TFMaqKgsMin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqKgsMin", GXutil.ltrimstr( AV46TFMaqKgsMin, 9, 2));
      AV47TFMaqKgsMin_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqKgsMin_To", GXutil.ltrimstr( AV47TFMaqKgsMin_To, 9, 2));
      AV48TFTipMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFTipMaqCod", AV48TFTipMaqCod);
      AV49TFTipMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFTipMaqCod_Sel", AV49TFTipMaqCod_Sel);
      AV50TFTipMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFTipMaqDsc", AV50TFTipMaqDsc);
      AV51TFTipMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFTipMaqDsc_Sel", AV51TFTipMaqDsc_Sel);
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
      callWebObject(formatLink("app.tmaquin", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod))}, new String[] {"Mode","EmprCod","MaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmaquin", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod))}, new String[] {"Mode","EmprCod","MaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV59Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV59Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV59Pgmname+"GridState"), null, null);
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
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV26TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFMaqCod", AV26TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV27TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFMaqCod_Sel", AV27TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV28TFMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFMaqDsc", AV28TFMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV29TFMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMaqDsc_Sel", AV29TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV30TFMaqTinTip = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMaqTinTip", AV30TFMaqTinTip);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV31TFMaqTinTip_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFMaqTinTip_Sel", AV31TFMaqTinTip_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMAX") == 0 )
         {
            AV32TFMaqVolMax = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFMaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFMaqVolMax), 5, 0));
            AV33TFMaqVolMax_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFMaqVolMax_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFMaqVolMax_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV34TFMaqVolMin = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFMaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFMaqVolMin), 5, 0));
            AV35TFMaqVolMin_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFMaqVolMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFMaqVolMin_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV36TFMaqVolMed = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFMaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFMaqVolMed), 5, 0));
            AV37TFMaqVolMed_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFMaqVolMed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFMaqVolMed_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV38TFMaqVolTop = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFMaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFMaqVolTop), 5, 0));
            AV39TFMaqVolTop_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFMaqVolTop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFMaqVolTop_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV40TFMaqVolRes = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFMaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFMaqVolRes), 5, 0));
            AV41TFMaqVolRes_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFMaqVolRes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFMaqVolRes_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV42TFMaqKgsMax = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMaqKgsMax", GXutil.ltrimstr( AV42TFMaqKgsMax, 9, 2));
            AV43TFMaqKgsMax_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqKgsMax_To", GXutil.ltrimstr( AV43TFMaqKgsMax_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV44TFMaqKgsMed = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqKgsMed", GXutil.ltrimstr( AV44TFMaqKgsMed, 9, 2));
            AV45TFMaqKgsMed_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFMaqKgsMed_To", GXutil.ltrimstr( AV45TFMaqKgsMed_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV46TFMaqKgsMin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqKgsMin", GXutil.ltrimstr( AV46TFMaqKgsMin, 9, 2));
            AV47TFMaqKgsMin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqKgsMin_To", GXutil.ltrimstr( AV47TFMaqKgsMin_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV48TFTipMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFTipMaqCod", AV48TFTipMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV49TFTipMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFTipMaqCod_Sel", AV49TFTipMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV50TFTipMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFTipMaqDsc", AV50TFTipMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV51TFTipMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFTipMaqDsc_Sel", AV51TFTipMaqDsc_Sel);
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFMaqCod_Sel)==0), AV27TFMaqCod_Sel, GXv_char4) ;
      tmaquinww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFMaqDsc_Sel)==0), AV29TFMaqDsc_Sel, GXv_char3) ;
      tmaquinww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFMaqTinTip_Sel)==0), AV31TFMaqTinTip_Sel, GXv_char2) ;
      tmaquinww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFTipMaqCod_Sel)==0), AV49TFTipMaqCod_Sel, GXv_char15) ;
      tmaquinww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFTipMaqDsc_Sel)==0), AV51TFTipMaqDsc_Sel, GXv_char17) ;
      tmaquinww_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|||||||||"+GXt_char14+"|"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFMaqCod)==0), AV26TFMaqCod, GXv_char17) ;
      tmaquinww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFMaqDsc)==0), AV28TFMaqDsc, GXv_char15) ;
      tmaquinww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFMaqTinTip)==0), AV30TFMaqTinTip, GXv_char4) ;
      tmaquinww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFTipMaqCod)==0), AV48TFTipMaqCod, GXv_char3) ;
      tmaquinww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFTipMaqDsc)==0), AV50TFTipMaqDsc, GXv_char2) ;
      tmaquinww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV32TFMaqVolMax) ? "" : GXutil.str( AV32TFMaqVolMax, 5, 0))+"|"+((0==AV34TFMaqVolMin) ? "" : GXutil.str( AV34TFMaqVolMin, 5, 0))+"|"+((0==AV36TFMaqVolMed) ? "" : GXutil.str( AV36TFMaqVolMed, 5, 0))+"|"+((0==AV38TFMaqVolTop) ? "" : GXutil.str( AV38TFMaqVolTop, 5, 0))+"|"+((0==AV40TFMaqVolRes) ? "" : GXutil.str( AV40TFMaqVolRes, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMaqKgsMax)==0) ? "" : GXutil.str( AV42TFMaqKgsMax, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMaqKgsMed)==0) ? "" : GXutil.str( AV44TFMaqKgsMed, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFMaqKgsMin)==0) ? "" : GXutil.str( AV46TFMaqKgsMin, 9, 2))+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||"+((0==AV33TFMaqVolMax_To) ? "" : GXutil.str( AV33TFMaqVolMax_To, 5, 0))+"|"+((0==AV35TFMaqVolMin_To) ? "" : GXutil.str( AV35TFMaqVolMin_To, 5, 0))+"|"+((0==AV37TFMaqVolMed_To) ? "" : GXutil.str( AV37TFMaqVolMed_To, 5, 0))+"|"+((0==AV39TFMaqVolTop_To) ? "" : GXutil.str( AV39TFMaqVolTop_To, 5, 0))+"|"+((0==AV41TFMaqVolRes_To) ? "" : GXutil.str( AV41TFMaqVolRes_To, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMaqKgsMax_To)==0) ? "" : GXutil.str( AV43TFMaqKgsMax_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMaqKgsMed_To)==0) ? "" : GXutil.str( AV45TFMaqKgsMed_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFMaqKgsMin_To)==0) ? "" : GXutil.str( AV47TFMaqKgsMin_To, 9, 2))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV59Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQCOD", "", !(GXutil.strcmp("", AV26TFMaqCod)==0), (short)(0), AV26TFMaqCod, "", !(GXutil.strcmp("", AV27TFMaqCod_Sel)==0), AV27TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQDSC", "", !(GXutil.strcmp("", AV28TFMaqDsc)==0), (short)(0), AV28TFMaqDsc, "", !(GXutil.strcmp("", AV29TFMaqDsc_Sel)==0), AV29TFMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQTINTIP", "", !(GXutil.strcmp("", AV30TFMaqTinTip)==0), (short)(0), AV30TFMaqTinTip, "", !(GXutil.strcmp("", AV31TFMaqTinTip_Sel)==0), AV31TFMaqTinTip_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQVOLMAX", "", !((0==AV32TFMaqVolMax)&&(0==AV33TFMaqVolMax_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFMaqVolMax, 5, 0)), GXutil.trim( GXutil.str( AV33TFMaqVolMax_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQVOLMIN", "", !((0==AV34TFMaqVolMin)&&(0==AV35TFMaqVolMin_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFMaqVolMin, 5, 0)), GXutil.trim( GXutil.str( AV35TFMaqVolMin_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQVOLMED", "", !((0==AV36TFMaqVolMed)&&(0==AV37TFMaqVolMed_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFMaqVolMed, 5, 0)), GXutil.trim( GXutil.str( AV37TFMaqVolMed_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQVOLTOP", "", !((0==AV38TFMaqVolTop)&&(0==AV39TFMaqVolTop_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFMaqVolTop, 5, 0)), GXutil.trim( GXutil.str( AV39TFMaqVolTop_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQVOLRES", "", !((0==AV40TFMaqVolRes)&&(0==AV41TFMaqVolRes_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFMaqVolRes, 5, 0)), GXutil.trim( GXutil.str( AV41TFMaqVolRes_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQKGSMAX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMaqKgsMax)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMaqKgsMax_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFMaqKgsMax, 9, 2)), GXutil.trim( GXutil.str( AV43TFMaqKgsMax_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQKGSMED", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMaqKgsMed)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMaqKgsMed_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFMaqKgsMed, 9, 2)), GXutil.trim( GXutil.str( AV45TFMaqKgsMed_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFMAQKGSMIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFMaqKgsMin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFMaqKgsMin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFMaqKgsMin, 9, 2)), GXutil.trim( GXutil.str( AV47TFMaqKgsMin_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFTIPMAQCOD", "", !(GXutil.strcmp("", AV48TFTipMaqCod)==0), (short)(0), AV48TFTipMaqCod, "", !(GXutil.strcmp("", AV49TFTipMaqCod_Sel)==0), AV49TFTipMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFTIPMAQDSC", "", !(GXutil.strcmp("", AV50TFTipMaqDsc)==0), (short)(0), AV50TFTipMaqDsc, "", !(GXutil.strcmp("", AV51TFTipMaqDsc_Sel)==0), AV51TFTipMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV59Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV59Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMAQUIN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_25O2( boolean wbgen )
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
         wb_table2_32_25O2( true) ;
      }
      else
      {
         wb_table2_32_25O2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_25O2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_25O2e( true) ;
      }
      else
      {
         wb_table1_27_25O2e( false) ;
      }
   }

   public void wb_table2_32_25O2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TMAQUINWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_25O2e( true) ;
      }
      else
      {
         wb_table2_32_25O2e( false) ;
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
      pa25O2( ) ;
      ws25O2( ) ;
      we25O2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145328", true, true);
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
      httpContext.AddJavascriptSource("tmaquinww.js", "?202682116145328", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_45_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_45_idx ;
      edtMaqTinTip_Internalname = "MAQTINTIP_"+sGXsfl_45_idx ;
      edtMaqVolMax_Internalname = "MAQVOLMAX_"+sGXsfl_45_idx ;
      edtMaqVolMin_Internalname = "MAQVOLMIN_"+sGXsfl_45_idx ;
      edtMaqVolMed_Internalname = "MAQVOLMED_"+sGXsfl_45_idx ;
      edtMaqVolTop_Internalname = "MAQVOLTOP_"+sGXsfl_45_idx ;
      edtMaqVolRes_Internalname = "MAQVOLRES_"+sGXsfl_45_idx ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX_"+sGXsfl_45_idx ;
      edtMaqKgsMed_Internalname = "MAQKGSMED_"+sGXsfl_45_idx ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN_"+sGXsfl_45_idx ;
      edtTipMaqCod_Internalname = "TIPMAQCOD_"+sGXsfl_45_idx ;
      edtTipMaqDsc_Internalname = "TIPMAQDSC_"+sGXsfl_45_idx ;
      edtMaqCap_Internalname = "MAQCAP_"+sGXsfl_45_idx ;
      edtMaqCosMin_Internalname = "MAQCOSMIN_"+sGXsfl_45_idx ;
      edtMaqHorPro_Internalname = "MAQHORPRO_"+sGXsfl_45_idx ;
      edtMaqMinPro_Internalname = "MAQMINPRO_"+sGXsfl_45_idx ;
      edtMaqTip_Internalname = "MAQTIP_"+sGXsfl_45_idx ;
      edtMaqEst_Internalname = "MAQEST_"+sGXsfl_45_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
      edtMaqUltFec_Internalname = "MAQULTFEC_"+sGXsfl_45_idx ;
      edtMaqResDia_Internalname = "MAQRESDIA_"+sGXsfl_45_idx ;
      edtMaqHorAsi_Internalname = "MAQHORASI_"+sGXsfl_45_idx ;
      edtMaqOrdSeq_Internalname = "MAQORDSEQ_"+sGXsfl_45_idx ;
      edtMaqUltLin_Internalname = "MAQULTLIN_"+sGXsfl_45_idx ;
      edtMaqFormul_Internalname = "MAQFORMUL_"+sGXsfl_45_idx ;
      edtMaqPrdMin_Internalname = "MAQPRDMIN_"+sGXsfl_45_idx ;
      edtMaqPrdMed_Internalname = "MAQPRDMED_"+sGXsfl_45_idx ;
      edtMaqPrdMax_Internalname = "MAQPRDMAX_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_45_fel_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_45_fel_idx ;
      edtMaqTinTip_Internalname = "MAQTINTIP_"+sGXsfl_45_fel_idx ;
      edtMaqVolMax_Internalname = "MAQVOLMAX_"+sGXsfl_45_fel_idx ;
      edtMaqVolMin_Internalname = "MAQVOLMIN_"+sGXsfl_45_fel_idx ;
      edtMaqVolMed_Internalname = "MAQVOLMED_"+sGXsfl_45_fel_idx ;
      edtMaqVolTop_Internalname = "MAQVOLTOP_"+sGXsfl_45_fel_idx ;
      edtMaqVolRes_Internalname = "MAQVOLRES_"+sGXsfl_45_fel_idx ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX_"+sGXsfl_45_fel_idx ;
      edtMaqKgsMed_Internalname = "MAQKGSMED_"+sGXsfl_45_fel_idx ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN_"+sGXsfl_45_fel_idx ;
      edtTipMaqCod_Internalname = "TIPMAQCOD_"+sGXsfl_45_fel_idx ;
      edtTipMaqDsc_Internalname = "TIPMAQDSC_"+sGXsfl_45_fel_idx ;
      edtMaqCap_Internalname = "MAQCAP_"+sGXsfl_45_fel_idx ;
      edtMaqCosMin_Internalname = "MAQCOSMIN_"+sGXsfl_45_fel_idx ;
      edtMaqHorPro_Internalname = "MAQHORPRO_"+sGXsfl_45_fel_idx ;
      edtMaqMinPro_Internalname = "MAQMINPRO_"+sGXsfl_45_fel_idx ;
      edtMaqTip_Internalname = "MAQTIP_"+sGXsfl_45_fel_idx ;
      edtMaqEst_Internalname = "MAQEST_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtMaqUltFec_Internalname = "MAQULTFEC_"+sGXsfl_45_fel_idx ;
      edtMaqResDia_Internalname = "MAQRESDIA_"+sGXsfl_45_fel_idx ;
      edtMaqHorAsi_Internalname = "MAQHORASI_"+sGXsfl_45_fel_idx ;
      edtMaqOrdSeq_Internalname = "MAQORDSEQ_"+sGXsfl_45_fel_idx ;
      edtMaqUltLin_Internalname = "MAQULTLIN_"+sGXsfl_45_fel_idx ;
      edtMaqFormul_Internalname = "MAQFORMUL_"+sGXsfl_45_fel_idx ;
      edtMaqPrdMin_Internalname = "MAQPRDMIN_"+sGXsfl_45_fel_idx ;
      edtMaqPrdMed_Internalname = "MAQPRDMED_"+sGXsfl_45_fel_idx ;
      edtMaqPrdMax_Internalname = "MAQPRDMAX_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb25O0( ) ;
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
               AV56GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV56GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV56GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e2325o2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV56GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqDsc_Internalname,GXutil.rtrim( A606MaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqTinTip_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTinTip_Internalname,GXutil.rtrim( A619MaqTinTip),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTinTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqTinTip_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqVolMax_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqVolMax_Internalname,GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A623MaqVolMax), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqVolMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqVolMax_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqVolMin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqVolMin_Internalname,GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A625MaqVolMin), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqVolMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqVolMin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqVolMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqVolMed_Internalname,GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A624MaqVolMed), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqVolMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqVolMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqVolTop_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqVolTop_Internalname,GXutil.ltrim( localUtil.ntoc( A2802MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2802MaqVolTop), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqVolTop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqVolTop_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqVolRes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqVolRes_Internalname,GXutil.ltrim( localUtil.ntoc( A2801MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2801MaqVolRes), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqVolRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqVolRes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqKgsMax_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMax_Internalname,GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqKgsMax_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqKgsMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMed_Internalname,GXutil.ltrim( localUtil.ntoc( A4284MaqKgsMed, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4284MaqKgsMed, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqKgsMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqKgsMin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMin_Internalname,GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqKgsMin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMaqCod_Internalname,GXutil.rtrim( A1011TipMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMaqDsc_Internalname,GXutil.rtrim( A1012TipMaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtTipMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCap_Internalname,GXutil.ltrim( localUtil.ntoc( A600MaqCap, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A600MaqCap), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCap_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCosMin_Internalname,GXutil.ltrim( localUtil.ntoc( A605MaqCosMin, (byte)(10), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A605MaqCosMin, "ZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCosMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHorPro_Internalname,GXutil.ltrim( localUtil.ntoc( A612MaqHorPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A612MaqHorPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHorPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqMinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A615MaqMinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A615MaqMinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqMinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqTip_Internalname,GXutil.rtrim( A620MaqTip),GXutil.rtrim( localUtil.format( A620MaqTip, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqEst_Internalname,GXutil.rtrim( A607MaqEst),GXutil.rtrim( localUtil.format( A607MaqEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqUltFec_Internalname,GXutil.rtrim( A621MaqUltFec),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqUltFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqResDia_Internalname,GXutil.ltrim( localUtil.ntoc( A617MaqResDia, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A617MaqResDia, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqResDia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqHorAsi_Internalname,GXutil.ltrim( localUtil.ntoc( A611MaqHorAsi, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A611MaqHorAsi, "ZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqHorAsi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqOrdSeq_Internalname,GXutil.ltrim( localUtil.ntoc( A616MaqOrdSeq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A616MaqOrdSeq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqOrdSeq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqUltLin_Internalname,GXutil.ltrim( localUtil.ntoc( A622MaqUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A622MaqUltLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqUltLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqFormul_Internalname,GXutil.rtrim( A4282MaqFormul),GXutil.rtrim( localUtil.format( A4282MaqFormul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqFormul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqPrdMin_Internalname,GXutil.ltrim( localUtil.ntoc( A4319MaqPrdMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4319MaqPrdMin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqPrdMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqPrdMed_Internalname,GXutil.ltrim( localUtil.ntoc( A4320MaqPrdMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4320MaqPrdMed), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqPrdMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqPrdMax_Internalname,GXutil.ltrim( localUtil.ntoc( A4321MaqPrdMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4321MaqPrdMax), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqPrdMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes25O2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqTinTip_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolMax_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen Maximo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen Minimo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen Medio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolTop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen Baño", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen Residual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqKgsMax_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Maximos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqKgsMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Medios", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqKgsMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Minimos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo de Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV56GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A606MaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A619MaqTinTip));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqTinTip_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqVolMax_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqVolMin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqVolMed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2802MaqVolTop, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqVolTop_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2801MaqVolRes, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqVolRes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMax_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4284MaqKgsMed, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqKgsMin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1011TipMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1012TipMaqDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipMaqDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A600MaqCap, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A605MaqCosMin, (byte)(10), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A612MaqHorPro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A615MaqMinPro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A620MaqTip));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A607MaqEst));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A621MaqUltFec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A617MaqResDia, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A611MaqHorAsi, (byte)(7), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A616MaqOrdSeq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A622MaqUltLin, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4282MaqFormul));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4319MaqPrdMin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4320MaqPrdMed, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4321MaqPrdMax, (byte)(4), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtMaqTinTip_Internalname = "MAQTINTIP" ;
      edtMaqVolMax_Internalname = "MAQVOLMAX" ;
      edtMaqVolMin_Internalname = "MAQVOLMIN" ;
      edtMaqVolMed_Internalname = "MAQVOLMED" ;
      edtMaqVolTop_Internalname = "MAQVOLTOP" ;
      edtMaqVolRes_Internalname = "MAQVOLRES" ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX" ;
      edtMaqKgsMed_Internalname = "MAQKGSMED" ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN" ;
      edtTipMaqCod_Internalname = "TIPMAQCOD" ;
      edtTipMaqDsc_Internalname = "TIPMAQDSC" ;
      edtMaqCap_Internalname = "MAQCAP" ;
      edtMaqCosMin_Internalname = "MAQCOSMIN" ;
      edtMaqHorPro_Internalname = "MAQHORPRO" ;
      edtMaqMinPro_Internalname = "MAQMINPRO" ;
      edtMaqTip_Internalname = "MAQTIP" ;
      edtMaqEst_Internalname = "MAQEST" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtMaqUltFec_Internalname = "MAQULTFEC" ;
      edtMaqResDia_Internalname = "MAQRESDIA" ;
      edtMaqHorAsi_Internalname = "MAQHORASI" ;
      edtMaqOrdSeq_Internalname = "MAQORDSEQ" ;
      edtMaqUltLin_Internalname = "MAQULTLIN" ;
      edtMaqFormul_Internalname = "MAQFORMUL" ;
      edtMaqPrdMin_Internalname = "MAQPRDMIN" ;
      edtMaqPrdMed_Internalname = "MAQPRDMED" ;
      edtMaqPrdMax_Internalname = "MAQPRDMAX" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
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
      edtMaqPrdMax_Jsonclick = "" ;
      edtMaqPrdMed_Jsonclick = "" ;
      edtMaqPrdMin_Jsonclick = "" ;
      edtMaqFormul_Jsonclick = "" ;
      edtMaqUltLin_Jsonclick = "" ;
      edtMaqOrdSeq_Jsonclick = "" ;
      edtMaqHorAsi_Jsonclick = "" ;
      edtMaqResDia_Jsonclick = "" ;
      edtMaqUltFec_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtMaqEst_Jsonclick = "" ;
      edtMaqTip_Jsonclick = "" ;
      edtMaqMinPro_Jsonclick = "" ;
      edtMaqHorPro_Jsonclick = "" ;
      edtMaqCosMin_Jsonclick = "" ;
      edtMaqCap_Jsonclick = "" ;
      edtTipMaqDsc_Jsonclick = "" ;
      edtTipMaqCod_Jsonclick = "" ;
      edtMaqKgsMin_Jsonclick = "" ;
      edtMaqKgsMed_Jsonclick = "" ;
      edtMaqKgsMax_Jsonclick = "" ;
      edtMaqVolRes_Jsonclick = "" ;
      edtMaqVolTop_Jsonclick = "" ;
      edtMaqVolMed_Jsonclick = "" ;
      edtMaqVolMin_Jsonclick = "" ;
      edtMaqVolMax_Jsonclick = "" ;
      edtMaqTinTip_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtTipMaqDsc_Visible = -1 ;
      edtTipMaqCod_Visible = -1 ;
      edtMaqKgsMin_Visible = -1 ;
      edtMaqKgsMed_Visible = -1 ;
      edtMaqKgsMax_Visible = -1 ;
      edtMaqVolRes_Visible = -1 ;
      edtMaqVolTop_Visible = -1 ;
      edtMaqVolMed_Visible = -1 ;
      edtMaqVolMin_Visible = -1 ;
      edtMaqVolMax_Visible = -1 ;
      edtMaqTinTip_Visible = -1 ;
      edtMaqDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TMAQUINWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|||||||||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T|||||||||T|T" ;
      Ddo_grid_Filterisrange = "|||T|T|T|T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "2:MaqCod|3:MaqDsc|4:MaqTinTip|5:MaqVolMax|6:MaqVolMin|7:MaqVolMed|8:MaqVolTop|9:MaqVolRes|10:MaqKgsMax|11:MaqKgsMed|12:MaqKgsMin|13:TipMaqCod|14:TipMaqDsc" ;
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
      Form.setCaption( httpContext.getMessage( " MANTENIMIENTO DE MAQUINAS", "") );
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
         AV56GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV56GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtMaqTinTip_Visible',ctrl:'MAQTINTIP',prop:'Visible'},{av:'edtMaqVolMax_Visible',ctrl:'MAQVOLMAX',prop:'Visible'},{av:'edtMaqVolMin_Visible',ctrl:'MAQVOLMIN',prop:'Visible'},{av:'edtMaqVolMed_Visible',ctrl:'MAQVOLMED',prop:'Visible'},{av:'edtMaqVolTop_Visible',ctrl:'MAQVOLTOP',prop:'Visible'},{av:'edtMaqVolRes_Visible',ctrl:'MAQVOLRES',prop:'Visible'},{av:'edtMaqKgsMax_Visible',ctrl:'MAQKGSMAX',prop:'Visible'},{av:'edtMaqKgsMed_Visible',ctrl:'MAQKGSMED',prop:'Visible'},{av:'edtMaqKgsMin_Visible',ctrl:'MAQKGSMIN',prop:'Visible'},{av:'edtTipMaqCod_Visible',ctrl:'TIPMAQCOD',prop:'Visible'},{av:'edtTipMaqDsc_Visible',ctrl:'TIPMAQDSC',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1225O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1325O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1425O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2225O2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1525O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtMaqTinTip_Visible',ctrl:'MAQTINTIP',prop:'Visible'},{av:'edtMaqVolMax_Visible',ctrl:'MAQVOLMAX',prop:'Visible'},{av:'edtMaqVolMin_Visible',ctrl:'MAQVOLMIN',prop:'Visible'},{av:'edtMaqVolMed_Visible',ctrl:'MAQVOLMED',prop:'Visible'},{av:'edtMaqVolTop_Visible',ctrl:'MAQVOLTOP',prop:'Visible'},{av:'edtMaqVolRes_Visible',ctrl:'MAQVOLRES',prop:'Visible'},{av:'edtMaqKgsMax_Visible',ctrl:'MAQKGSMAX',prop:'Visible'},{av:'edtMaqKgsMed_Visible',ctrl:'MAQKGSMED',prop:'Visible'},{av:'edtMaqKgsMin_Visible',ctrl:'MAQKGSMIN',prop:'Visible'},{av:'edtTipMaqCod_Visible',ctrl:'TIPMAQCOD',prop:'Visible'},{av:'edtTipMaqDsc_Visible',ctrl:'TIPMAQDSC',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1125O2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtMaqTinTip_Visible',ctrl:'MAQTINTIP',prop:'Visible'},{av:'edtMaqVolMax_Visible',ctrl:'MAQVOLMAX',prop:'Visible'},{av:'edtMaqVolMin_Visible',ctrl:'MAQVOLMIN',prop:'Visible'},{av:'edtMaqVolMed_Visible',ctrl:'MAQVOLMED',prop:'Visible'},{av:'edtMaqVolTop_Visible',ctrl:'MAQVOLTOP',prop:'Visible'},{av:'edtMaqVolRes_Visible',ctrl:'MAQVOLRES',prop:'Visible'},{av:'edtMaqKgsMax_Visible',ctrl:'MAQKGSMAX',prop:'Visible'},{av:'edtMaqKgsMed_Visible',ctrl:'MAQKGSMED',prop:'Visible'},{av:'edtMaqKgsMin_Visible',ctrl:'MAQKGSMIN',prop:'Visible'},{av:'edtTipMaqCod_Visible',ctrl:'TIPMAQCOD',prop:'Visible'},{av:'edtTipMaqDsc_Visible',ctrl:'TIPMAQDSC',prop:'Visible'},{av:'AV54GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV55GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2325O2',iparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV56GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1625O2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1725O2',iparms:[{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1825O2',iparms:[{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1925O2',iparms:[{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV27TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV28TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV29TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV30TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV31TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV32TFMaqVolMax',fld:'vTFMAQVOLMAX',pic:'ZZZZ9'},{av:'AV33TFMaqVolMax_To',fld:'vTFMAQVOLMAX_TO',pic:'ZZZZ9'},{av:'AV34TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV35TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV36TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV37TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV38TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV39TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV40TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV41TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV42TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV43TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV44TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV45TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV46TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV47TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV48TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV49TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV50TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV51TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV59Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPMAQCOD","{handler:'valid_Tipmaqcod',iparms:[]");
      setEventMetadata("VALID_TIPMAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqprdmax',iparms:[]");
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
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV26TFMaqCod = "" ;
      AV27TFMaqCod_Sel = "" ;
      AV28TFMaqDsc = "" ;
      AV29TFMaqDsc_Sel = "" ;
      AV30TFMaqTinTip = "" ;
      AV31TFMaqTinTip_Sel = "" ;
      AV42TFMaqKgsMax = DecimalUtil.ZERO ;
      AV43TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV44TFMaqKgsMed = DecimalUtil.ZERO ;
      AV45TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV46TFMaqKgsMin = DecimalUtil.ZERO ;
      AV47TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV48TFTipMaqCod = "" ;
      AV49TFTipMaqCod_Sel = "" ;
      AV50TFTipMaqDsc = "" ;
      AV51TFTipMaqDsc_Sel = "" ;
      AV59Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV52DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A620MaqTip = "" ;
      A607MaqEst = "" ;
      A407EmprNom = "" ;
      A621MaqUltFec = "" ;
      A617MaqResDia = DecimalUtil.ZERO ;
      A611MaqHorAsi = DecimalUtil.ZERO ;
      A4282MaqFormul = "" ;
      scmdbuf = "" ;
      lV64Tmaquinwwds_1_filterfulltext = "" ;
      lV65Tmaquinwwds_2_tfmaqcod = "" ;
      lV67Tmaquinwwds_4_tfmaqdsc = "" ;
      lV69Tmaquinwwds_6_tfmaqtintip = "" ;
      lV87Tmaquinwwds_24_tftipmaqcod = "" ;
      lV89Tmaquinwwds_26_tftipmaqdsc = "" ;
      AV64Tmaquinwwds_1_filterfulltext = "" ;
      AV66Tmaquinwwds_3_tfmaqcod_sel = "" ;
      AV65Tmaquinwwds_2_tfmaqcod = "" ;
      AV68Tmaquinwwds_5_tfmaqdsc_sel = "" ;
      AV67Tmaquinwwds_4_tfmaqdsc = "" ;
      AV70Tmaquinwwds_7_tfmaqtintip_sel = "" ;
      AV69Tmaquinwwds_6_tfmaqtintip = "" ;
      AV81Tmaquinwwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV82Tmaquinwwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV83Tmaquinwwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV84Tmaquinwwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV85Tmaquinwwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV86Tmaquinwwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV88Tmaquinwwds_25_tftipmaqcod_sel = "" ;
      AV87Tmaquinwwds_24_tftipmaqcod = "" ;
      AV90Tmaquinwwds_27_tftipmaqdsc_sel = "" ;
      AV89Tmaquinwwds_26_tftipmaqdsc = "" ;
      H025O2_A4321MaqPrdMax = new short[1] ;
      H025O2_n4321MaqPrdMax = new boolean[] {false} ;
      H025O2_A4320MaqPrdMed = new short[1] ;
      H025O2_n4320MaqPrdMed = new boolean[] {false} ;
      H025O2_A4319MaqPrdMin = new short[1] ;
      H025O2_n4319MaqPrdMin = new boolean[] {false} ;
      H025O2_A4282MaqFormul = new String[] {""} ;
      H025O2_n4282MaqFormul = new boolean[] {false} ;
      H025O2_A622MaqUltLin = new byte[1] ;
      H025O2_n622MaqUltLin = new boolean[] {false} ;
      H025O2_A616MaqOrdSeq = new short[1] ;
      H025O2_n616MaqOrdSeq = new boolean[] {false} ;
      H025O2_A611MaqHorAsi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025O2_n611MaqHorAsi = new boolean[] {false} ;
      H025O2_A617MaqResDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025O2_n617MaqResDia = new boolean[] {false} ;
      H025O2_A621MaqUltFec = new String[] {""} ;
      H025O2_n621MaqUltFec = new boolean[] {false} ;
      H025O2_A407EmprNom = new String[] {""} ;
      H025O2_n407EmprNom = new boolean[] {false} ;
      H025O2_A607MaqEst = new String[] {""} ;
      H025O2_n607MaqEst = new boolean[] {false} ;
      H025O2_A620MaqTip = new String[] {""} ;
      H025O2_n620MaqTip = new boolean[] {false} ;
      H025O2_A615MaqMinPro = new byte[1] ;
      H025O2_n615MaqMinPro = new boolean[] {false} ;
      H025O2_A612MaqHorPro = new byte[1] ;
      H025O2_n612MaqHorPro = new boolean[] {false} ;
      H025O2_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025O2_n605MaqCosMin = new boolean[] {false} ;
      H025O2_A600MaqCap = new int[1] ;
      H025O2_n600MaqCap = new boolean[] {false} ;
      H025O2_A1012TipMaqDsc = new String[] {""} ;
      H025O2_n1012TipMaqDsc = new boolean[] {false} ;
      H025O2_A1011TipMaqCod = new String[] {""} ;
      H025O2_n1011TipMaqCod = new boolean[] {false} ;
      H025O2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025O2_n4283MaqKgsMin = new boolean[] {false} ;
      H025O2_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025O2_n4284MaqKgsMed = new boolean[] {false} ;
      H025O2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H025O2_n4285MaqKgsMax = new boolean[] {false} ;
      H025O2_A2801MaqVolRes = new int[1] ;
      H025O2_n2801MaqVolRes = new boolean[] {false} ;
      H025O2_A2802MaqVolTop = new int[1] ;
      H025O2_n2802MaqVolTop = new boolean[] {false} ;
      H025O2_A624MaqVolMed = new int[1] ;
      H025O2_n624MaqVolMed = new boolean[] {false} ;
      H025O2_A625MaqVolMin = new int[1] ;
      H025O2_n625MaqVolMin = new boolean[] {false} ;
      H025O2_A623MaqVolMax = new int[1] ;
      H025O2_n623MaqVolMax = new boolean[] {false} ;
      H025O2_A619MaqTinTip = new String[] {""} ;
      H025O2_n619MaqTinTip = new boolean[] {false} ;
      H025O2_A606MaqDsc = new String[] {""} ;
      H025O2_n606MaqDsc = new boolean[] {false} ;
      H025O2_A602MaqCod = new String[] {""} ;
      H025O2_A396EmprCod = new String[] {""} ;
      H025O3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV60Station = "" ;
      AV61Emprcod = "" ;
      AV62Emprnom = "" ;
      AV63Usurcod = "" ;
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
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaquinww__default(),
         new Object[] {
             new Object[] {
            H025O2_A4321MaqPrdMax, H025O2_n4321MaqPrdMax, H025O2_A4320MaqPrdMed, H025O2_n4320MaqPrdMed, H025O2_A4319MaqPrdMin, H025O2_n4319MaqPrdMin, H025O2_A4282MaqFormul, H025O2_n4282MaqFormul, H025O2_A622MaqUltLin, H025O2_n622MaqUltLin,
            H025O2_A616MaqOrdSeq, H025O2_n616MaqOrdSeq, H025O2_A611MaqHorAsi, H025O2_n611MaqHorAsi, H025O2_A617MaqResDia, H025O2_n617MaqResDia, H025O2_A621MaqUltFec, H025O2_n621MaqUltFec, H025O2_A407EmprNom, H025O2_n407EmprNom,
            H025O2_A607MaqEst, H025O2_n607MaqEst, H025O2_A620MaqTip, H025O2_n620MaqTip, H025O2_A615MaqMinPro, H025O2_n615MaqMinPro, H025O2_A612MaqHorPro, H025O2_n612MaqHorPro, H025O2_A605MaqCosMin, H025O2_n605MaqCosMin,
            H025O2_A600MaqCap, H025O2_n600MaqCap, H025O2_A1012TipMaqDsc, H025O2_n1012TipMaqDsc, H025O2_A1011TipMaqCod, H025O2_n1011TipMaqCod, H025O2_A4283MaqKgsMin, H025O2_n4283MaqKgsMin, H025O2_A4284MaqKgsMed, H025O2_n4284MaqKgsMed,
            H025O2_A4285MaqKgsMax, H025O2_n4285MaqKgsMax, H025O2_A2801MaqVolRes, H025O2_n2801MaqVolRes, H025O2_A2802MaqVolTop, H025O2_n2802MaqVolTop, H025O2_A624MaqVolMed, H025O2_n624MaqVolMed, H025O2_A625MaqVolMin, H025O2_n625MaqVolMin,
            H025O2_A623MaqVolMax, H025O2_n623MaqVolMax, H025O2_A619MaqTinTip, H025O2_n619MaqTinTip, H025O2_A606MaqDsc, H025O2_n606MaqDsc, H025O2_A602MaqCod, H025O2_A396EmprCod
            }
            , new Object[] {
            H025O3_AGRID_nRecordCount
            }
         }
      );
      AV59Pgmname = "TMAQUINWW" ;
      /* GeneXus formulas. */
      AV59Pgmname = "TMAQUINWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A612MaqHorPro ;
   private byte A615MaqMinPro ;
   private byte A622MaqUltLin ;
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
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV56GridActions ;
   private short A616MaqOrdSeq ;
   private short A4319MaqPrdMin ;
   private short A4320MaqPrdMed ;
   private short A4321MaqPrdMax ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV32TFMaqVolMax ;
   private int AV33TFMaqVolMax_To ;
   private int AV34TFMaqVolMin ;
   private int AV35TFMaqVolMin_To ;
   private int AV36TFMaqVolMed ;
   private int AV37TFMaqVolMed_To ;
   private int AV38TFMaqVolTop ;
   private int AV39TFMaqVolTop_To ;
   private int AV40TFMaqVolRes ;
   private int AV41TFMaqVolRes_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int A600MaqCap ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV71Tmaquinwwds_8_tfmaqvolmax ;
   private int AV72Tmaquinwwds_9_tfmaqvolmax_to ;
   private int AV73Tmaquinwwds_10_tfmaqvolmin ;
   private int AV74Tmaquinwwds_11_tfmaqvolmin_to ;
   private int AV75Tmaquinwwds_12_tfmaqvolmed ;
   private int AV76Tmaquinwwds_13_tfmaqvolmed_to ;
   private int AV77Tmaquinwwds_14_tfmaqvoltop ;
   private int AV78Tmaquinwwds_15_tfmaqvoltop_to ;
   private int AV79Tmaquinwwds_16_tfmaqvolres ;
   private int AV80Tmaquinwwds_17_tfmaqvolres_to ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int edtMaqTinTip_Visible ;
   private int edtMaqVolMax_Visible ;
   private int edtMaqVolMin_Visible ;
   private int edtMaqVolMed_Visible ;
   private int edtMaqVolTop_Visible ;
   private int edtMaqVolRes_Visible ;
   private int edtMaqKgsMax_Visible ;
   private int edtMaqKgsMed_Visible ;
   private int edtMaqKgsMin_Visible ;
   private int edtTipMaqCod_Visible ;
   private int edtTipMaqDsc_Visible ;
   private int AV53PageToGo ;
   private int AV91GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV54GridCurrentPage ;
   private long AV55GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV42TFMaqKgsMax ;
   private java.math.BigDecimal AV43TFMaqKgsMax_To ;
   private java.math.BigDecimal AV44TFMaqKgsMed ;
   private java.math.BigDecimal AV45TFMaqKgsMed_To ;
   private java.math.BigDecimal AV46TFMaqKgsMin ;
   private java.math.BigDecimal AV47TFMaqKgsMin_To ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A617MaqResDia ;
   private java.math.BigDecimal A611MaqHorAsi ;
   private java.math.BigDecimal AV81Tmaquinwwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV82Tmaquinwwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV83Tmaquinwwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV84Tmaquinwwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV85Tmaquinwwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV86Tmaquinwwds_23_tfmaqkgsmin_to ;
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
   private String AV26TFMaqCod ;
   private String AV27TFMaqCod_Sel ;
   private String AV28TFMaqDsc ;
   private String AV29TFMaqDsc_Sel ;
   private String AV30TFMaqTinTip ;
   private String AV31TFMaqTinTip_Sel ;
   private String AV48TFTipMaqCod ;
   private String AV49TFTipMaqCod_Sel ;
   private String AV50TFTipMaqDsc ;
   private String AV51TFTipMaqDsc_Sel ;
   private String AV59Pgmname ;
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
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String A619MaqTinTip ;
   private String edtMaqTinTip_Internalname ;
   private String edtMaqVolMax_Internalname ;
   private String edtMaqVolMin_Internalname ;
   private String edtMaqVolMed_Internalname ;
   private String edtMaqVolTop_Internalname ;
   private String edtMaqVolRes_Internalname ;
   private String edtMaqKgsMax_Internalname ;
   private String edtMaqKgsMed_Internalname ;
   private String edtMaqKgsMin_Internalname ;
   private String A1011TipMaqCod ;
   private String edtTipMaqCod_Internalname ;
   private String A1012TipMaqDsc ;
   private String edtTipMaqDsc_Internalname ;
   private String edtMaqCap_Internalname ;
   private String edtMaqCosMin_Internalname ;
   private String edtMaqHorPro_Internalname ;
   private String edtMaqMinPro_Internalname ;
   private String A620MaqTip ;
   private String edtMaqTip_Internalname ;
   private String A607MaqEst ;
   private String edtMaqEst_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String A621MaqUltFec ;
   private String edtMaqUltFec_Internalname ;
   private String edtMaqResDia_Internalname ;
   private String edtMaqHorAsi_Internalname ;
   private String edtMaqOrdSeq_Internalname ;
   private String edtMaqUltLin_Internalname ;
   private String A4282MaqFormul ;
   private String edtMaqFormul_Internalname ;
   private String edtMaqPrdMin_Internalname ;
   private String edtMaqPrdMed_Internalname ;
   private String edtMaqPrdMax_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV65Tmaquinwwds_2_tfmaqcod ;
   private String lV67Tmaquinwwds_4_tfmaqdsc ;
   private String lV69Tmaquinwwds_6_tfmaqtintip ;
   private String lV87Tmaquinwwds_24_tftipmaqcod ;
   private String lV89Tmaquinwwds_26_tftipmaqdsc ;
   private String AV66Tmaquinwwds_3_tfmaqcod_sel ;
   private String AV65Tmaquinwwds_2_tfmaqcod ;
   private String AV68Tmaquinwwds_5_tfmaqdsc_sel ;
   private String AV67Tmaquinwwds_4_tfmaqdsc ;
   private String AV70Tmaquinwwds_7_tfmaqtintip_sel ;
   private String AV69Tmaquinwwds_6_tfmaqtintip ;
   private String AV88Tmaquinwwds_25_tftipmaqcod_sel ;
   private String AV87Tmaquinwwds_24_tftipmaqcod ;
   private String AV90Tmaquinwwds_27_tftipmaqdsc_sel ;
   private String AV89Tmaquinwwds_26_tftipmaqdsc ;
   private String hsh ;
   private String AV60Station ;
   private String AV61Emprcod ;
   private String AV62Emprnom ;
   private String AV63Usurcod ;
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
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqTinTip_Jsonclick ;
   private String edtMaqVolMax_Jsonclick ;
   private String edtMaqVolMin_Jsonclick ;
   private String edtMaqVolMed_Jsonclick ;
   private String edtMaqVolTop_Jsonclick ;
   private String edtMaqVolRes_Jsonclick ;
   private String edtMaqKgsMax_Jsonclick ;
   private String edtMaqKgsMed_Jsonclick ;
   private String edtMaqKgsMin_Jsonclick ;
   private String edtTipMaqCod_Jsonclick ;
   private String edtTipMaqDsc_Jsonclick ;
   private String edtMaqCap_Jsonclick ;
   private String edtMaqCosMin_Jsonclick ;
   private String edtMaqHorPro_Jsonclick ;
   private String edtMaqMinPro_Jsonclick ;
   private String edtMaqTip_Jsonclick ;
   private String edtMaqEst_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtMaqUltFec_Jsonclick ;
   private String edtMaqResDia_Jsonclick ;
   private String edtMaqHorAsi_Jsonclick ;
   private String edtMaqOrdSeq_Jsonclick ;
   private String edtMaqUltLin_Jsonclick ;
   private String edtMaqFormul_Jsonclick ;
   private String edtMaqPrdMin_Jsonclick ;
   private String edtMaqPrdMed_Jsonclick ;
   private String edtMaqPrdMax_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean n606MaqDsc ;
   private boolean n619MaqTinTip ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private boolean n624MaqVolMed ;
   private boolean n2802MaqVolTop ;
   private boolean n2801MaqVolRes ;
   private boolean n4285MaqKgsMax ;
   private boolean n4284MaqKgsMed ;
   private boolean n4283MaqKgsMin ;
   private boolean n1011TipMaqCod ;
   private boolean n1012TipMaqDsc ;
   private boolean n600MaqCap ;
   private boolean n605MaqCosMin ;
   private boolean n612MaqHorPro ;
   private boolean n615MaqMinPro ;
   private boolean n620MaqTip ;
   private boolean n607MaqEst ;
   private boolean n407EmprNom ;
   private boolean n621MaqUltFec ;
   private boolean n617MaqResDia ;
   private boolean n611MaqHorAsi ;
   private boolean n616MaqOrdSeq ;
   private boolean n622MaqUltLin ;
   private boolean n4282MaqFormul ;
   private boolean n4319MaqPrdMin ;
   private boolean n4320MaqPrdMed ;
   private boolean n4321MaqPrdMax ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV64Tmaquinwwds_1_filterfulltext ;
   private String AV64Tmaquinwwds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private short[] H025O2_A4321MaqPrdMax ;
   private boolean[] H025O2_n4321MaqPrdMax ;
   private short[] H025O2_A4320MaqPrdMed ;
   private boolean[] H025O2_n4320MaqPrdMed ;
   private short[] H025O2_A4319MaqPrdMin ;
   private boolean[] H025O2_n4319MaqPrdMin ;
   private String[] H025O2_A4282MaqFormul ;
   private boolean[] H025O2_n4282MaqFormul ;
   private byte[] H025O2_A622MaqUltLin ;
   private boolean[] H025O2_n622MaqUltLin ;
   private short[] H025O2_A616MaqOrdSeq ;
   private boolean[] H025O2_n616MaqOrdSeq ;
   private java.math.BigDecimal[] H025O2_A611MaqHorAsi ;
   private boolean[] H025O2_n611MaqHorAsi ;
   private java.math.BigDecimal[] H025O2_A617MaqResDia ;
   private boolean[] H025O2_n617MaqResDia ;
   private String[] H025O2_A621MaqUltFec ;
   private boolean[] H025O2_n621MaqUltFec ;
   private String[] H025O2_A407EmprNom ;
   private boolean[] H025O2_n407EmprNom ;
   private String[] H025O2_A607MaqEst ;
   private boolean[] H025O2_n607MaqEst ;
   private String[] H025O2_A620MaqTip ;
   private boolean[] H025O2_n620MaqTip ;
   private byte[] H025O2_A615MaqMinPro ;
   private boolean[] H025O2_n615MaqMinPro ;
   private byte[] H025O2_A612MaqHorPro ;
   private boolean[] H025O2_n612MaqHorPro ;
   private java.math.BigDecimal[] H025O2_A605MaqCosMin ;
   private boolean[] H025O2_n605MaqCosMin ;
   private int[] H025O2_A600MaqCap ;
   private boolean[] H025O2_n600MaqCap ;
   private String[] H025O2_A1012TipMaqDsc ;
   private boolean[] H025O2_n1012TipMaqDsc ;
   private String[] H025O2_A1011TipMaqCod ;
   private boolean[] H025O2_n1011TipMaqCod ;
   private java.math.BigDecimal[] H025O2_A4283MaqKgsMin ;
   private boolean[] H025O2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] H025O2_A4284MaqKgsMed ;
   private boolean[] H025O2_n4284MaqKgsMed ;
   private java.math.BigDecimal[] H025O2_A4285MaqKgsMax ;
   private boolean[] H025O2_n4285MaqKgsMax ;
   private int[] H025O2_A2801MaqVolRes ;
   private boolean[] H025O2_n2801MaqVolRes ;
   private int[] H025O2_A2802MaqVolTop ;
   private boolean[] H025O2_n2802MaqVolTop ;
   private int[] H025O2_A624MaqVolMed ;
   private boolean[] H025O2_n624MaqVolMed ;
   private int[] H025O2_A625MaqVolMin ;
   private boolean[] H025O2_n625MaqVolMin ;
   private int[] H025O2_A623MaqVolMax ;
   private boolean[] H025O2_n623MaqVolMax ;
   private String[] H025O2_A619MaqTinTip ;
   private boolean[] H025O2_n619MaqTinTip ;
   private String[] H025O2_A606MaqDsc ;
   private boolean[] H025O2_n606MaqDsc ;
   private String[] H025O2_A602MaqCod ;
   private String[] H025O2_A396EmprCod ;
   private long[] H025O3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV52DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tmaquinww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H025O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Tmaquinwwds_1_filterfulltext ,
                                          String AV66Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV65Tmaquinwwds_2_tfmaqcod ,
                                          String AV68Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV67Tmaquinwwds_4_tfmaqdsc ,
                                          String AV70Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV69Tmaquinwwds_6_tfmaqtintip ,
                                          int AV71Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV72Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV73Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV74Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV75Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV76Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV77Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV78Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV79Tmaquinwwds_16_tfmaqvolres ,
                                          int AV80Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV81Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV82Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV83Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV84Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV85Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV86Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV88Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV87Tmaquinwwds_24_tftipmaqcod ,
                                          String AV90Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV89Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[44];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.MaqPrdMax, T1.MaqPrdMed, T1.MaqPrdMin, T1.MaqFormul, T1.MaqUltLin, T1.MaqOrdSeq, T1.MaqHorAsi, T1.MaqResDia, T1.MaqUltFec, T2.EmprNom, T1.MaqEst, T1.MaqTip," ;
      sSelectString += " T1.MaqMinPro, T1.MaqHorPro, T1.MaqCosMin, T1.MaqCap, T3.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed," ;
      sSelectString += " T1.MaqVolMin, T1.MaqVolMax, T1.MaqTinTip, T1.MaqDsc, T1.MaqCod, T1.EmprCod" ;
      sFromString = " FROM ((TXPMAQUIN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPTIPMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMaqCod = T1.TipMaqCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV64Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T3.TipMaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
         GXv_int19[1] = (byte)(1) ;
         GXv_int19[2] = (byte)(1) ;
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV69Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV76Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV79Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (0==AV80Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqDsc" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqTinTip" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqTinTip DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolMax" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolMax DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolMin" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolMin DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolMed" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolMed DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolTop" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolTop DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolRes" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolRes DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqKgsMax" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqKgsMax DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqKgsMed" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqKgsMed DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqKgsMin" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqKgsMin DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipMaqCod" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipMaqCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.TipMaqDsc" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.TipMaqDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H025O3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV64Tmaquinwwds_1_filterfulltext ,
                                          String AV66Tmaquinwwds_3_tfmaqcod_sel ,
                                          String AV65Tmaquinwwds_2_tfmaqcod ,
                                          String AV68Tmaquinwwds_5_tfmaqdsc_sel ,
                                          String AV67Tmaquinwwds_4_tfmaqdsc ,
                                          String AV70Tmaquinwwds_7_tfmaqtintip_sel ,
                                          String AV69Tmaquinwwds_6_tfmaqtintip ,
                                          int AV71Tmaquinwwds_8_tfmaqvolmax ,
                                          int AV72Tmaquinwwds_9_tfmaqvolmax_to ,
                                          int AV73Tmaquinwwds_10_tfmaqvolmin ,
                                          int AV74Tmaquinwwds_11_tfmaqvolmin_to ,
                                          int AV75Tmaquinwwds_12_tfmaqvolmed ,
                                          int AV76Tmaquinwwds_13_tfmaqvolmed_to ,
                                          int AV77Tmaquinwwds_14_tfmaqvoltop ,
                                          int AV78Tmaquinwwds_15_tfmaqvoltop_to ,
                                          int AV79Tmaquinwwds_16_tfmaqvolres ,
                                          int AV80Tmaquinwwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV81Tmaquinwwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV82Tmaquinwwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV83Tmaquinwwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV84Tmaquinwwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV85Tmaquinwwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV86Tmaquinwwds_23_tfmaqkgsmin_to ,
                                          String AV88Tmaquinwwds_25_tftipmaqcod_sel ,
                                          String AV87Tmaquinwwds_24_tftipmaqcod ,
                                          String AV90Tmaquinwwds_27_tftipmaqdsc_sel ,
                                          String AV89Tmaquinwwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A619MaqTinTip ,
                                          int A623MaqVolMax ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[39];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPMAQUIN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPTIPMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV64Tmaquinwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMax,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T3.TipMaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int21[0] = (byte)(1) ;
         GXv_int21[1] = (byte)(1) ;
         GXv_int21[2] = (byte)(1) ;
         GXv_int21[3] = (byte)(1) ;
         GXv_int21[4] = (byte)(1) ;
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Tmaquinwwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV65Tmaquinwwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Tmaquinwwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Tmaquinwwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV67Tmaquinwwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Tmaquinwwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Tmaquinwwds_7_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV69Tmaquinwwds_6_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Tmaquinwwds_7_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Tmaquinwwds_8_tfmaqvolmax) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Tmaquinwwds_9_tfmaqvolmax_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMax <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV73Tmaquinwwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV74Tmaquinwwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV75Tmaquinwwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV76Tmaquinwwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (0==AV77Tmaquinwwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV78Tmaquinwwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (0==AV79Tmaquinwwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (0==AV80Tmaquinwwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV81Tmaquinwwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV82Tmaquinwwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV83Tmaquinwwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Tmaquinwwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Tmaquinwwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Tmaquinwwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tmaquinwwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV87Tmaquinwwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tmaquinwwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tmaquinwwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Tmaquinwwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tmaquinwwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H025O2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
            case 1 :
                  return conditional_H025O3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H025O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025O3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((byte[]) buf[24])[0] = rslt.getByte(13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(14);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(15,4);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((int[]) buf[30])[0] = rslt.getInt(16);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(18, 4);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((int[]) buf[42])[0] = rslt.getInt(22);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((int[]) buf[44])[0] = rslt.getInt(23);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((int[]) buf[46])[0] = rslt.getInt(24);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((int[]) buf[48])[0] = rslt.getInt(25);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(26);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(27, 2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(28, 16);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(29, 6);
               ((String[]) buf[57])[0] = rslt.getString(30, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 4);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 4);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               return;
      }
   }

}

