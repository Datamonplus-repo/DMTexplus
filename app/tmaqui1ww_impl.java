package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqui1ww_impl extends GXDataArea
{
   public tmaqui1ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqui1ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqui1ww_impl.class ));
   }

   public tmaqui1ww_impl( int remoteHandle ,
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
      AV112FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36ColumnsSelector);
      AV43TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV44TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV46TFMaqDsc = httpContext.GetPar( "TFMaqDsc") ;
      AV47TFMaqDsc_Sel = httpContext.GetPar( "TFMaqDsc_Sel") ;
      AV64TFMaqEst = httpContext.GetPar( "TFMaqEst") ;
      AV65TFMaqEst_Sel = httpContext.GetPar( "TFMaqEst_Sel") ;
      AV117TFMaqTinTip = httpContext.GetPar( "TFMaqTinTip") ;
      AV118TFMaqTinTip_Sel = httpContext.GetPar( "TFMaqTinTip_Sel") ;
      AV119TFMaqVolMin = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMin"))) ;
      AV120TFMaqVolMin_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMin_To"))) ;
      AV121TFMaqVolMed = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMed"))) ;
      AV122TFMaqVolMed_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolMed_To"))) ;
      AV123TFMaqVolTop = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolTop"))) ;
      AV124TFMaqVolTop_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolTop_To"))) ;
      AV125TFMaqVolRes = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolRes"))) ;
      AV126TFMaqVolRes_To = (int)(GXutil.lval( httpContext.GetPar( "TFMaqVolRes_To"))) ;
      AV91TFMaqKgsMax = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMax"), ".") ;
      AV92TFMaqKgsMax_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMax_To"), ".") ;
      AV88TFMaqKgsMed = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMed"), ".") ;
      AV89TFMaqKgsMed_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMed_To"), ".") ;
      AV85TFMaqKgsMin = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMin"), ".") ;
      AV86TFMaqKgsMin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMaqKgsMin_To"), ".") ;
      AV76TFTipMaqCod = httpContext.GetPar( "TFTipMaqCod") ;
      AV77TFTipMaqCod_Sel = httpContext.GetPar( "TFTipMaqCod_Sel") ;
      AV79TFTipMaqDsc = httpContext.GetPar( "TFTipMaqDsc") ;
      AV80TFTipMaqDsc_Sel = httpContext.GetPar( "TFTipMaqDsc_Sel") ;
      AV129Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV112FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFMaqCod, AV44TFMaqCod_Sel, AV46TFMaqDsc, AV47TFMaqDsc_Sel, AV64TFMaqEst, AV65TFMaqEst_Sel, AV117TFMaqTinTip, AV118TFMaqTinTip_Sel, AV119TFMaqVolMin, AV120TFMaqVolMin_To, AV121TFMaqVolMed, AV122TFMaqVolMed_To, AV123TFMaqVolTop, AV124TFMaqVolTop_To, AV125TFMaqVolRes, AV126TFMaqVolRes_To, AV91TFMaqKgsMax, AV92TFMaqKgsMax_To, AV88TFMaqKgsMed, AV89TFMaqKgsMed_To, AV85TFMaqKgsMin, AV86TFMaqKgsMin_To, AV76TFTipMaqCod, AV77TFTipMaqCod_Sel, AV79TFTipMaqDsc, AV80TFTipMaqDsc_Sel, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
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
      pa8W2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start8W2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmaqui1ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUI1WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV129Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmaqui1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV112FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV108GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV109GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV106DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV106DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV41ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV43TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV44TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC", GXutil.rtrim( AV46TFMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQDSC_SEL", GXutil.rtrim( AV47TFMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQEST", GXutil.rtrim( AV64TFMaqEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQEST_SEL", GXutil.rtrim( AV65TFMaqEst_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQTINTIP", GXutil.rtrim( AV117TFMaqTinTip));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQTINTIP_SEL", GXutil.rtrim( AV118TFMaqTinTip_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMIN", GXutil.ltrim( localUtil.ntoc( AV119TFMaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMIN_TO", GXutil.ltrim( localUtil.ntoc( AV120TFMaqVolMin_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMED", GXutil.ltrim( localUtil.ntoc( AV121TFMaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLMED_TO", GXutil.ltrim( localUtil.ntoc( AV122TFMaqVolMed_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLTOP", GXutil.ltrim( localUtil.ntoc( AV123TFMaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLTOP_TO", GXutil.ltrim( localUtil.ntoc( AV124TFMaqVolTop_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLRES", GXutil.ltrim( localUtil.ntoc( AV125TFMaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQVOLRES_TO", GXutil.ltrim( localUtil.ntoc( AV126TFMaqVolRes_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMAX", GXutil.ltrim( localUtil.ntoc( AV91TFMaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMAX_TO", GXutil.ltrim( localUtil.ntoc( AV92TFMaqKgsMax_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMED", GXutil.ltrim( localUtil.ntoc( AV88TFMaqKgsMed, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMED_TO", GXutil.ltrim( localUtil.ntoc( AV89TFMaqKgsMed_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMIN", GXutil.ltrim( localUtil.ntoc( AV85TFMaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQKGSMIN_TO", GXutil.ltrim( localUtil.ntoc( AV86TFMaqKgsMin_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQCOD", GXutil.rtrim( AV76TFTipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQCOD_SEL", GXutil.rtrim( AV77TFTipMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQDSC", GXutil.rtrim( AV79TFTipMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPMAQDSC_SEL", GXutil.rtrim( AV80TFTipMaqDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
         we8W2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt8W2( ) ;
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
      return formatLink("app.tmaqui1ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMAQUI1WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " MANTENIMIENTO MAQUINAS Basico", "") ;
   }

   public void wb8W0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQUI1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_8W2( true) ;
      }
      else
      {
         wb_table1_27_8W2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_8W2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV108GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV109GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV129Pgmname), GXutil.rtrim( localUtil.format( AV129Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQUI1WW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV106DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV106DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV36ColumnsSelector);
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

   public void start8W2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " MANTENIMIENTO MAQUINAS Basico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup8W0( ) ;
   }

   public void ws8W2( )
   {
      start8W2( ) ;
      evt8W2( ) ;
   }

   public void evt8W2( )
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
                           e118W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e128W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e138W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e148W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e158W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e168W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e178W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e188W2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e198W2 ();
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
                           AV113GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113GridActions), 4, 0));
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
                           n606MaqDsc = false ;
                           A607MaqEst = GXutil.upper( httpContext.cgiGet( edtMaqEst_Internalname)) ;
                           n607MaqEst = false ;
                           A619MaqTinTip = httpContext.cgiGet( edtMaqTinTip_Internalname) ;
                           n619MaqTinTip = false ;
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
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e208W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e218W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e228W2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV112FilterFullText) != 0 )
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

   public void we8W2( )
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

   public void pa8W2( )
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
                                 String AV112FilterFullText ,
                                 byte AV41ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ,
                                 String AV43TFMaqCod ,
                                 String AV44TFMaqCod_Sel ,
                                 String AV46TFMaqDsc ,
                                 String AV47TFMaqDsc_Sel ,
                                 String AV64TFMaqEst ,
                                 String AV65TFMaqEst_Sel ,
                                 String AV117TFMaqTinTip ,
                                 String AV118TFMaqTinTip_Sel ,
                                 int AV119TFMaqVolMin ,
                                 int AV120TFMaqVolMin_To ,
                                 int AV121TFMaqVolMed ,
                                 int AV122TFMaqVolMed_To ,
                                 int AV123TFMaqVolTop ,
                                 int AV124TFMaqVolTop_To ,
                                 int AV125TFMaqVolRes ,
                                 int AV126TFMaqVolRes_To ,
                                 java.math.BigDecimal AV91TFMaqKgsMax ,
                                 java.math.BigDecimal AV92TFMaqKgsMax_To ,
                                 java.math.BigDecimal AV88TFMaqKgsMed ,
                                 java.math.BigDecimal AV89TFMaqKgsMed_To ,
                                 java.math.BigDecimal AV85TFMaqKgsMin ,
                                 java.math.BigDecimal AV86TFMaqKgsMin_To ,
                                 String AV76TFTipMaqCod ,
                                 String AV77TFTipMaqCod_Sel ,
                                 String AV79TFTipMaqDsc ,
                                 String AV80TFTipMaqDsc_Sel ,
                                 String AV129Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e218W2 ();
      GRID_nCurrentRecord = 0 ;
      rf8W2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUI1WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV129Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmaqui1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      rf8W2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV129Pgmname = "TMAQUI1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf8W2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e218W2 ();
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
                                              AV134Tmaqui1wwds_1_filterfulltext ,
                                              AV136Tmaqui1wwds_3_tfmaqcod_sel ,
                                              AV135Tmaqui1wwds_2_tfmaqcod ,
                                              AV138Tmaqui1wwds_5_tfmaqdsc_sel ,
                                              AV137Tmaqui1wwds_4_tfmaqdsc ,
                                              AV140Tmaqui1wwds_7_tfmaqest_sel ,
                                              AV139Tmaqui1wwds_6_tfmaqest ,
                                              AV142Tmaqui1wwds_9_tfmaqtintip_sel ,
                                              AV141Tmaqui1wwds_8_tfmaqtintip ,
                                              Integer.valueOf(AV143Tmaqui1wwds_10_tfmaqvolmin) ,
                                              Integer.valueOf(AV144Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                              Integer.valueOf(AV145Tmaqui1wwds_12_tfmaqvolmed) ,
                                              Integer.valueOf(AV146Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                              Integer.valueOf(AV147Tmaqui1wwds_14_tfmaqvoltop) ,
                                              Integer.valueOf(AV148Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                              Integer.valueOf(AV149Tmaqui1wwds_16_tfmaqvolres) ,
                                              Integer.valueOf(AV150Tmaqui1wwds_17_tfmaqvolres_to) ,
                                              AV151Tmaqui1wwds_18_tfmaqkgsmax ,
                                              AV152Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                              AV153Tmaqui1wwds_20_tfmaqkgsmed ,
                                              AV154Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                              AV155Tmaqui1wwds_22_tfmaqkgsmin ,
                                              AV156Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                              AV158Tmaqui1wwds_25_tftipmaqcod_sel ,
                                              AV157Tmaqui1wwds_24_tftipmaqcod ,
                                              AV160Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                              AV159Tmaqui1wwds_26_tftipmaqdsc ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              A607MaqEst ,
                                              A619MaqTinTip ,
                                              Integer.valueOf(A625MaqVolMin) ,
                                              Integer.valueOf(A624MaqVolMed) ,
                                              Integer.valueOf(A2802MaqVolTop) ,
                                              Integer.valueOf(A2801MaqVolRes) ,
                                              A4285MaqKgsMax ,
                                              A4284MaqKgsMed ,
                                              A4283MaqKgsMin ,
                                              A1011TipMaqCod ,
                                              A1012TipMaqDsc ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
         lV135Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV135Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
         lV137Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV137Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
         lV139Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV139Tmaqui1wwds_6_tfmaqest), 1, "%") ;
         lV141Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV141Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
         lV157Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV157Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
         lV159Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV159Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
         /* Using cursor H008W2 */
         pr_default.execute(0, new Object[] {lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_2_tfmaqcod, AV136Tmaqui1wwds_3_tfmaqcod_sel, lV137Tmaqui1wwds_4_tfmaqdsc, AV138Tmaqui1wwds_5_tfmaqdsc_sel, lV139Tmaqui1wwds_6_tfmaqest, AV140Tmaqui1wwds_7_tfmaqest_sel, lV141Tmaqui1wwds_8_tfmaqtintip, AV142Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV143Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV144Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV145Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV146Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV147Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV148Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV149Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV150Tmaqui1wwds_17_tfmaqvolres_to), AV151Tmaqui1wwds_18_tfmaqkgsmax, AV152Tmaqui1wwds_19_tfmaqkgsmax_to, AV153Tmaqui1wwds_20_tfmaqkgsmed, AV154Tmaqui1wwds_21_tfmaqkgsmed_to, AV155Tmaqui1wwds_22_tfmaqkgsmin, AV156Tmaqui1wwds_23_tfmaqkgsmin_to, lV157Tmaqui1wwds_24_tftipmaqcod, AV158Tmaqui1wwds_25_tftipmaqcod_sel, lV159Tmaqui1wwds_26_tftipmaqdsc, AV160Tmaqui1wwds_27_tftipmaqdsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H008W2_A396EmprCod[0] ;
            A1012TipMaqDsc = H008W2_A1012TipMaqDsc[0] ;
            n1012TipMaqDsc = H008W2_n1012TipMaqDsc[0] ;
            A1011TipMaqCod = H008W2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = H008W2_n1011TipMaqCod[0] ;
            A4283MaqKgsMin = H008W2_A4283MaqKgsMin[0] ;
            n4283MaqKgsMin = H008W2_n4283MaqKgsMin[0] ;
            A4284MaqKgsMed = H008W2_A4284MaqKgsMed[0] ;
            n4284MaqKgsMed = H008W2_n4284MaqKgsMed[0] ;
            A4285MaqKgsMax = H008W2_A4285MaqKgsMax[0] ;
            n4285MaqKgsMax = H008W2_n4285MaqKgsMax[0] ;
            A2801MaqVolRes = H008W2_A2801MaqVolRes[0] ;
            n2801MaqVolRes = H008W2_n2801MaqVolRes[0] ;
            A2802MaqVolTop = H008W2_A2802MaqVolTop[0] ;
            n2802MaqVolTop = H008W2_n2802MaqVolTop[0] ;
            A624MaqVolMed = H008W2_A624MaqVolMed[0] ;
            n624MaqVolMed = H008W2_n624MaqVolMed[0] ;
            A625MaqVolMin = H008W2_A625MaqVolMin[0] ;
            n625MaqVolMin = H008W2_n625MaqVolMin[0] ;
            A619MaqTinTip = H008W2_A619MaqTinTip[0] ;
            n619MaqTinTip = H008W2_n619MaqTinTip[0] ;
            A607MaqEst = H008W2_A607MaqEst[0] ;
            n607MaqEst = H008W2_n607MaqEst[0] ;
            A606MaqDsc = H008W2_A606MaqDsc[0] ;
            n606MaqDsc = H008W2_n606MaqDsc[0] ;
            A602MaqCod = H008W2_A602MaqCod[0] ;
            A1012TipMaqDsc = H008W2_A1012TipMaqDsc[0] ;
            n1012TipMaqDsc = H008W2_n1012TipMaqDsc[0] ;
            e228W2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb8W0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes8W2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      AV134Tmaqui1wwds_1_filterfulltext = AV112FilterFullText ;
      AV135Tmaqui1wwds_2_tfmaqcod = AV43TFMaqCod ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV137Tmaqui1wwds_4_tfmaqdsc = AV46TFMaqDsc ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = AV47TFMaqDsc_Sel ;
      AV139Tmaqui1wwds_6_tfmaqest = AV64TFMaqEst ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = AV65TFMaqEst_Sel ;
      AV141Tmaqui1wwds_8_tfmaqtintip = AV117TFMaqTinTip ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = AV118TFMaqTinTip_Sel ;
      AV143Tmaqui1wwds_10_tfmaqvolmin = AV119TFMaqVolMin ;
      AV144Tmaqui1wwds_11_tfmaqvolmin_to = AV120TFMaqVolMin_To ;
      AV145Tmaqui1wwds_12_tfmaqvolmed = AV121TFMaqVolMed ;
      AV146Tmaqui1wwds_13_tfmaqvolmed_to = AV122TFMaqVolMed_To ;
      AV147Tmaqui1wwds_14_tfmaqvoltop = AV123TFMaqVolTop ;
      AV148Tmaqui1wwds_15_tfmaqvoltop_to = AV124TFMaqVolTop_To ;
      AV149Tmaqui1wwds_16_tfmaqvolres = AV125TFMaqVolRes ;
      AV150Tmaqui1wwds_17_tfmaqvolres_to = AV126TFMaqVolRes_To ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = AV91TFMaqKgsMax ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = AV92TFMaqKgsMax_To ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = AV88TFMaqKgsMed ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = AV89TFMaqKgsMed_To ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = AV85TFMaqKgsMin ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = AV86TFMaqKgsMin_To ;
      AV157Tmaqui1wwds_24_tftipmaqcod = AV76TFTipMaqCod ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = AV77TFTipMaqCod_Sel ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = AV79TFTipMaqDsc ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = AV80TFTipMaqDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV134Tmaqui1wwds_1_filterfulltext ,
                                           AV136Tmaqui1wwds_3_tfmaqcod_sel ,
                                           AV135Tmaqui1wwds_2_tfmaqcod ,
                                           AV138Tmaqui1wwds_5_tfmaqdsc_sel ,
                                           AV137Tmaqui1wwds_4_tfmaqdsc ,
                                           AV140Tmaqui1wwds_7_tfmaqest_sel ,
                                           AV139Tmaqui1wwds_6_tfmaqest ,
                                           AV142Tmaqui1wwds_9_tfmaqtintip_sel ,
                                           AV141Tmaqui1wwds_8_tfmaqtintip ,
                                           Integer.valueOf(AV143Tmaqui1wwds_10_tfmaqvolmin) ,
                                           Integer.valueOf(AV144Tmaqui1wwds_11_tfmaqvolmin_to) ,
                                           Integer.valueOf(AV145Tmaqui1wwds_12_tfmaqvolmed) ,
                                           Integer.valueOf(AV146Tmaqui1wwds_13_tfmaqvolmed_to) ,
                                           Integer.valueOf(AV147Tmaqui1wwds_14_tfmaqvoltop) ,
                                           Integer.valueOf(AV148Tmaqui1wwds_15_tfmaqvoltop_to) ,
                                           Integer.valueOf(AV149Tmaqui1wwds_16_tfmaqvolres) ,
                                           Integer.valueOf(AV150Tmaqui1wwds_17_tfmaqvolres_to) ,
                                           AV151Tmaqui1wwds_18_tfmaqkgsmax ,
                                           AV152Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                           AV153Tmaqui1wwds_20_tfmaqkgsmed ,
                                           AV154Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                           AV155Tmaqui1wwds_22_tfmaqkgsmin ,
                                           AV156Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                           AV158Tmaqui1wwds_25_tftipmaqcod_sel ,
                                           AV157Tmaqui1wwds_24_tftipmaqcod ,
                                           AV160Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                           AV159Tmaqui1wwds_26_tftipmaqdsc ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A607MaqEst ,
                                           A619MaqTinTip ,
                                           Integer.valueOf(A625MaqVolMin) ,
                                           Integer.valueOf(A624MaqVolMed) ,
                                           Integer.valueOf(A2802MaqVolTop) ,
                                           Integer.valueOf(A2801MaqVolRes) ,
                                           A4285MaqKgsMax ,
                                           A4284MaqKgsMed ,
                                           A4283MaqKgsMin ,
                                           A1011TipMaqCod ,
                                           A1012TipMaqDsc ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV134Tmaqui1wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV134Tmaqui1wwds_1_filterfulltext), "%", "") ;
      lV135Tmaqui1wwds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV135Tmaqui1wwds_2_tfmaqcod), 6, "%") ;
      lV137Tmaqui1wwds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV137Tmaqui1wwds_4_tfmaqdsc), 16, "%") ;
      lV139Tmaqui1wwds_6_tfmaqest = GXutil.padr( GXutil.rtrim( AV139Tmaqui1wwds_6_tfmaqest), 1, "%") ;
      lV141Tmaqui1wwds_8_tfmaqtintip = GXutil.padr( GXutil.rtrim( AV141Tmaqui1wwds_8_tfmaqtintip), 2, "%") ;
      lV157Tmaqui1wwds_24_tftipmaqcod = GXutil.padr( GXutil.rtrim( AV157Tmaqui1wwds_24_tftipmaqcod), 4, "%") ;
      lV159Tmaqui1wwds_26_tftipmaqdsc = GXutil.padr( GXutil.rtrim( AV159Tmaqui1wwds_26_tftipmaqdsc), 30, "%") ;
      /* Using cursor H008W3 */
      pr_default.execute(1, new Object[] {lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV134Tmaqui1wwds_1_filterfulltext, lV135Tmaqui1wwds_2_tfmaqcod, AV136Tmaqui1wwds_3_tfmaqcod_sel, lV137Tmaqui1wwds_4_tfmaqdsc, AV138Tmaqui1wwds_5_tfmaqdsc_sel, lV139Tmaqui1wwds_6_tfmaqest, AV140Tmaqui1wwds_7_tfmaqest_sel, lV141Tmaqui1wwds_8_tfmaqtintip, AV142Tmaqui1wwds_9_tfmaqtintip_sel, Integer.valueOf(AV143Tmaqui1wwds_10_tfmaqvolmin), Integer.valueOf(AV144Tmaqui1wwds_11_tfmaqvolmin_to), Integer.valueOf(AV145Tmaqui1wwds_12_tfmaqvolmed), Integer.valueOf(AV146Tmaqui1wwds_13_tfmaqvolmed_to), Integer.valueOf(AV147Tmaqui1wwds_14_tfmaqvoltop), Integer.valueOf(AV148Tmaqui1wwds_15_tfmaqvoltop_to), Integer.valueOf(AV149Tmaqui1wwds_16_tfmaqvolres), Integer.valueOf(AV150Tmaqui1wwds_17_tfmaqvolres_to), AV151Tmaqui1wwds_18_tfmaqkgsmax, AV152Tmaqui1wwds_19_tfmaqkgsmax_to, AV153Tmaqui1wwds_20_tfmaqkgsmed, AV154Tmaqui1wwds_21_tfmaqkgsmed_to, AV155Tmaqui1wwds_22_tfmaqkgsmin, AV156Tmaqui1wwds_23_tfmaqkgsmin_to, lV157Tmaqui1wwds_24_tftipmaqcod, AV158Tmaqui1wwds_25_tftipmaqcod_sel, lV159Tmaqui1wwds_26_tftipmaqdsc, AV160Tmaqui1wwds_27_tftipmaqdsc_sel});
      GRID_nRecordCount = H008W3_AGRID_nRecordCount[0] ;
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
      AV134Tmaqui1wwds_1_filterfulltext = AV112FilterFullText ;
      AV135Tmaqui1wwds_2_tfmaqcod = AV43TFMaqCod ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV137Tmaqui1wwds_4_tfmaqdsc = AV46TFMaqDsc ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = AV47TFMaqDsc_Sel ;
      AV139Tmaqui1wwds_6_tfmaqest = AV64TFMaqEst ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = AV65TFMaqEst_Sel ;
      AV141Tmaqui1wwds_8_tfmaqtintip = AV117TFMaqTinTip ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = AV118TFMaqTinTip_Sel ;
      AV143Tmaqui1wwds_10_tfmaqvolmin = AV119TFMaqVolMin ;
      AV144Tmaqui1wwds_11_tfmaqvolmin_to = AV120TFMaqVolMin_To ;
      AV145Tmaqui1wwds_12_tfmaqvolmed = AV121TFMaqVolMed ;
      AV146Tmaqui1wwds_13_tfmaqvolmed_to = AV122TFMaqVolMed_To ;
      AV147Tmaqui1wwds_14_tfmaqvoltop = AV123TFMaqVolTop ;
      AV148Tmaqui1wwds_15_tfmaqvoltop_to = AV124TFMaqVolTop_To ;
      AV149Tmaqui1wwds_16_tfmaqvolres = AV125TFMaqVolRes ;
      AV150Tmaqui1wwds_17_tfmaqvolres_to = AV126TFMaqVolRes_To ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = AV91TFMaqKgsMax ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = AV92TFMaqKgsMax_To ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = AV88TFMaqKgsMed ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = AV89TFMaqKgsMed_To ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = AV85TFMaqKgsMin ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = AV86TFMaqKgsMin_To ;
      AV157Tmaqui1wwds_24_tftipmaqcod = AV76TFTipMaqCod ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = AV77TFTipMaqCod_Sel ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = AV79TFTipMaqDsc ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = AV80TFTipMaqDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV112FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFMaqCod, AV44TFMaqCod_Sel, AV46TFMaqDsc, AV47TFMaqDsc_Sel, AV64TFMaqEst, AV65TFMaqEst_Sel, AV117TFMaqTinTip, AV118TFMaqTinTip_Sel, AV119TFMaqVolMin, AV120TFMaqVolMin_To, AV121TFMaqVolMed, AV122TFMaqVolMed_To, AV123TFMaqVolTop, AV124TFMaqVolTop_To, AV125TFMaqVolRes, AV126TFMaqVolRes_To, AV91TFMaqKgsMax, AV92TFMaqKgsMax_To, AV88TFMaqKgsMed, AV89TFMaqKgsMed_To, AV85TFMaqKgsMin, AV86TFMaqKgsMin_To, AV76TFTipMaqCod, AV77TFTipMaqCod_Sel, AV79TFTipMaqDsc, AV80TFTipMaqDsc_Sel, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV134Tmaqui1wwds_1_filterfulltext = AV112FilterFullText ;
      AV135Tmaqui1wwds_2_tfmaqcod = AV43TFMaqCod ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV137Tmaqui1wwds_4_tfmaqdsc = AV46TFMaqDsc ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = AV47TFMaqDsc_Sel ;
      AV139Tmaqui1wwds_6_tfmaqest = AV64TFMaqEst ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = AV65TFMaqEst_Sel ;
      AV141Tmaqui1wwds_8_tfmaqtintip = AV117TFMaqTinTip ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = AV118TFMaqTinTip_Sel ;
      AV143Tmaqui1wwds_10_tfmaqvolmin = AV119TFMaqVolMin ;
      AV144Tmaqui1wwds_11_tfmaqvolmin_to = AV120TFMaqVolMin_To ;
      AV145Tmaqui1wwds_12_tfmaqvolmed = AV121TFMaqVolMed ;
      AV146Tmaqui1wwds_13_tfmaqvolmed_to = AV122TFMaqVolMed_To ;
      AV147Tmaqui1wwds_14_tfmaqvoltop = AV123TFMaqVolTop ;
      AV148Tmaqui1wwds_15_tfmaqvoltop_to = AV124TFMaqVolTop_To ;
      AV149Tmaqui1wwds_16_tfmaqvolres = AV125TFMaqVolRes ;
      AV150Tmaqui1wwds_17_tfmaqvolres_to = AV126TFMaqVolRes_To ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = AV91TFMaqKgsMax ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = AV92TFMaqKgsMax_To ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = AV88TFMaqKgsMed ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = AV89TFMaqKgsMed_To ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = AV85TFMaqKgsMin ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = AV86TFMaqKgsMin_To ;
      AV157Tmaqui1wwds_24_tftipmaqcod = AV76TFTipMaqCod ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = AV77TFTipMaqCod_Sel ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = AV79TFTipMaqDsc ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = AV80TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV112FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFMaqCod, AV44TFMaqCod_Sel, AV46TFMaqDsc, AV47TFMaqDsc_Sel, AV64TFMaqEst, AV65TFMaqEst_Sel, AV117TFMaqTinTip, AV118TFMaqTinTip_Sel, AV119TFMaqVolMin, AV120TFMaqVolMin_To, AV121TFMaqVolMed, AV122TFMaqVolMed_To, AV123TFMaqVolTop, AV124TFMaqVolTop_To, AV125TFMaqVolRes, AV126TFMaqVolRes_To, AV91TFMaqKgsMax, AV92TFMaqKgsMax_To, AV88TFMaqKgsMed, AV89TFMaqKgsMed_To, AV85TFMaqKgsMin, AV86TFMaqKgsMin_To, AV76TFTipMaqCod, AV77TFTipMaqCod_Sel, AV79TFTipMaqDsc, AV80TFTipMaqDsc_Sel, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV134Tmaqui1wwds_1_filterfulltext = AV112FilterFullText ;
      AV135Tmaqui1wwds_2_tfmaqcod = AV43TFMaqCod ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV137Tmaqui1wwds_4_tfmaqdsc = AV46TFMaqDsc ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = AV47TFMaqDsc_Sel ;
      AV139Tmaqui1wwds_6_tfmaqest = AV64TFMaqEst ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = AV65TFMaqEst_Sel ;
      AV141Tmaqui1wwds_8_tfmaqtintip = AV117TFMaqTinTip ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = AV118TFMaqTinTip_Sel ;
      AV143Tmaqui1wwds_10_tfmaqvolmin = AV119TFMaqVolMin ;
      AV144Tmaqui1wwds_11_tfmaqvolmin_to = AV120TFMaqVolMin_To ;
      AV145Tmaqui1wwds_12_tfmaqvolmed = AV121TFMaqVolMed ;
      AV146Tmaqui1wwds_13_tfmaqvolmed_to = AV122TFMaqVolMed_To ;
      AV147Tmaqui1wwds_14_tfmaqvoltop = AV123TFMaqVolTop ;
      AV148Tmaqui1wwds_15_tfmaqvoltop_to = AV124TFMaqVolTop_To ;
      AV149Tmaqui1wwds_16_tfmaqvolres = AV125TFMaqVolRes ;
      AV150Tmaqui1wwds_17_tfmaqvolres_to = AV126TFMaqVolRes_To ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = AV91TFMaqKgsMax ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = AV92TFMaqKgsMax_To ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = AV88TFMaqKgsMed ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = AV89TFMaqKgsMed_To ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = AV85TFMaqKgsMin ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = AV86TFMaqKgsMin_To ;
      AV157Tmaqui1wwds_24_tftipmaqcod = AV76TFTipMaqCod ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = AV77TFTipMaqCod_Sel ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = AV79TFTipMaqDsc ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = AV80TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV112FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFMaqCod, AV44TFMaqCod_Sel, AV46TFMaqDsc, AV47TFMaqDsc_Sel, AV64TFMaqEst, AV65TFMaqEst_Sel, AV117TFMaqTinTip, AV118TFMaqTinTip_Sel, AV119TFMaqVolMin, AV120TFMaqVolMin_To, AV121TFMaqVolMed, AV122TFMaqVolMed_To, AV123TFMaqVolTop, AV124TFMaqVolTop_To, AV125TFMaqVolRes, AV126TFMaqVolRes_To, AV91TFMaqKgsMax, AV92TFMaqKgsMax_To, AV88TFMaqKgsMed, AV89TFMaqKgsMed_To, AV85TFMaqKgsMin, AV86TFMaqKgsMin_To, AV76TFTipMaqCod, AV77TFTipMaqCod_Sel, AV79TFTipMaqDsc, AV80TFTipMaqDsc_Sel, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV134Tmaqui1wwds_1_filterfulltext = AV112FilterFullText ;
      AV135Tmaqui1wwds_2_tfmaqcod = AV43TFMaqCod ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV137Tmaqui1wwds_4_tfmaqdsc = AV46TFMaqDsc ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = AV47TFMaqDsc_Sel ;
      AV139Tmaqui1wwds_6_tfmaqest = AV64TFMaqEst ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = AV65TFMaqEst_Sel ;
      AV141Tmaqui1wwds_8_tfmaqtintip = AV117TFMaqTinTip ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = AV118TFMaqTinTip_Sel ;
      AV143Tmaqui1wwds_10_tfmaqvolmin = AV119TFMaqVolMin ;
      AV144Tmaqui1wwds_11_tfmaqvolmin_to = AV120TFMaqVolMin_To ;
      AV145Tmaqui1wwds_12_tfmaqvolmed = AV121TFMaqVolMed ;
      AV146Tmaqui1wwds_13_tfmaqvolmed_to = AV122TFMaqVolMed_To ;
      AV147Tmaqui1wwds_14_tfmaqvoltop = AV123TFMaqVolTop ;
      AV148Tmaqui1wwds_15_tfmaqvoltop_to = AV124TFMaqVolTop_To ;
      AV149Tmaqui1wwds_16_tfmaqvolres = AV125TFMaqVolRes ;
      AV150Tmaqui1wwds_17_tfmaqvolres_to = AV126TFMaqVolRes_To ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = AV91TFMaqKgsMax ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = AV92TFMaqKgsMax_To ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = AV88TFMaqKgsMed ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = AV89TFMaqKgsMed_To ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = AV85TFMaqKgsMin ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = AV86TFMaqKgsMin_To ;
      AV157Tmaqui1wwds_24_tftipmaqcod = AV76TFTipMaqCod ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = AV77TFTipMaqCod_Sel ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = AV79TFTipMaqDsc ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = AV80TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV112FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFMaqCod, AV44TFMaqCod_Sel, AV46TFMaqDsc, AV47TFMaqDsc_Sel, AV64TFMaqEst, AV65TFMaqEst_Sel, AV117TFMaqTinTip, AV118TFMaqTinTip_Sel, AV119TFMaqVolMin, AV120TFMaqVolMin_To, AV121TFMaqVolMed, AV122TFMaqVolMed_To, AV123TFMaqVolTop, AV124TFMaqVolTop_To, AV125TFMaqVolRes, AV126TFMaqVolRes_To, AV91TFMaqKgsMax, AV92TFMaqKgsMax_To, AV88TFMaqKgsMed, AV89TFMaqKgsMed_To, AV85TFMaqKgsMin, AV86TFMaqKgsMin_To, AV76TFTipMaqCod, AV77TFTipMaqCod_Sel, AV79TFTipMaqDsc, AV80TFTipMaqDsc_Sel, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV134Tmaqui1wwds_1_filterfulltext = AV112FilterFullText ;
      AV135Tmaqui1wwds_2_tfmaqcod = AV43TFMaqCod ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV137Tmaqui1wwds_4_tfmaqdsc = AV46TFMaqDsc ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = AV47TFMaqDsc_Sel ;
      AV139Tmaqui1wwds_6_tfmaqest = AV64TFMaqEst ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = AV65TFMaqEst_Sel ;
      AV141Tmaqui1wwds_8_tfmaqtintip = AV117TFMaqTinTip ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = AV118TFMaqTinTip_Sel ;
      AV143Tmaqui1wwds_10_tfmaqvolmin = AV119TFMaqVolMin ;
      AV144Tmaqui1wwds_11_tfmaqvolmin_to = AV120TFMaqVolMin_To ;
      AV145Tmaqui1wwds_12_tfmaqvolmed = AV121TFMaqVolMed ;
      AV146Tmaqui1wwds_13_tfmaqvolmed_to = AV122TFMaqVolMed_To ;
      AV147Tmaqui1wwds_14_tfmaqvoltop = AV123TFMaqVolTop ;
      AV148Tmaqui1wwds_15_tfmaqvoltop_to = AV124TFMaqVolTop_To ;
      AV149Tmaqui1wwds_16_tfmaqvolres = AV125TFMaqVolRes ;
      AV150Tmaqui1wwds_17_tfmaqvolres_to = AV126TFMaqVolRes_To ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = AV91TFMaqKgsMax ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = AV92TFMaqKgsMax_To ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = AV88TFMaqKgsMed ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = AV89TFMaqKgsMed_To ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = AV85TFMaqKgsMin ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = AV86TFMaqKgsMin_To ;
      AV157Tmaqui1wwds_24_tftipmaqcod = AV76TFTipMaqCod ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = AV77TFTipMaqCod_Sel ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = AV79TFTipMaqDsc ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = AV80TFTipMaqDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV112FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV43TFMaqCod, AV44TFMaqCod_Sel, AV46TFMaqDsc, AV47TFMaqDsc_Sel, AV64TFMaqEst, AV65TFMaqEst_Sel, AV117TFMaqTinTip, AV118TFMaqTinTip_Sel, AV119TFMaqVolMin, AV120TFMaqVolMin_To, AV121TFMaqVolMed, AV122TFMaqVolMed_To, AV123TFMaqVolTop, AV124TFMaqVolTop_To, AV125TFMaqVolRes, AV126TFMaqVolRes_To, AV91TFMaqKgsMax, AV92TFMaqKgsMax_To, AV88TFMaqKgsMed, AV89TFMaqKgsMed_To, AV85TFMaqKgsMin, AV86TFMaqKgsMin_To, AV76TFTipMaqCod, AV77TFTipMaqCod_Sel, AV79TFTipMaqDsc, AV80TFTipMaqDsc_Sel, AV129Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV129Pgmname = "TMAQUI1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup8W0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e208W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV106DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV36ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV108GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV109GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV112FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112FilterFullText", AV112FilterFullText);
         AV129Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TMAQUI1WW");
         AV129Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129Pgmname", AV129Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV129Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tmaqui1ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV112FilterFullText) != 0 )
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
      e208W2 ();
      if (returnInSub) return;
   }

   public void e208W2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV130Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmaqui1ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV130Station = GXt_char1 ;
      GXv_char2[0] = AV131Emprcod ;
      GXv_char3[0] = AV132Emprnom ;
      GXv_char4[0] = AV133Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV130Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqui1ww_impl.this.AV131Emprcod = GXv_char2[0] ;
      tmaqui1ww_impl.this.AV132Emprnom = GXv_char3[0] ;
      tmaqui1ww_impl.this.AV133Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " MANTENIMIENTO MAQUINAS Basico", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV106DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV106DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e218W2( )
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
      if ( AV41ManageFiltersExecutionStep == 1 )
      {
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV41ManageFiltersExecutionStep == 2 )
      {
         AV41ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV38Session.getValue("TMAQUI1WWColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV38Session.getValue("TMAQUI1WWColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqEst_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqTinTip_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqTinTip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqTinTip_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolMed_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolTop_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolTop_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolTop_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqVolRes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqVolRes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqVolRes_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqKgsMax_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMax_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMax_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqKgsMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMed_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtMaqKgsMin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMin_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipMaqDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMaqDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV108GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108GridCurrentPage), 10, 0));
      AV109GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109GridPageCount), 10, 0));
      AV134Tmaqui1wwds_1_filterfulltext = AV112FilterFullText ;
      AV135Tmaqui1wwds_2_tfmaqcod = AV43TFMaqCod ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = AV44TFMaqCod_Sel ;
      AV137Tmaqui1wwds_4_tfmaqdsc = AV46TFMaqDsc ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = AV47TFMaqDsc_Sel ;
      AV139Tmaqui1wwds_6_tfmaqest = AV64TFMaqEst ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = AV65TFMaqEst_Sel ;
      AV141Tmaqui1wwds_8_tfmaqtintip = AV117TFMaqTinTip ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = AV118TFMaqTinTip_Sel ;
      AV143Tmaqui1wwds_10_tfmaqvolmin = AV119TFMaqVolMin ;
      AV144Tmaqui1wwds_11_tfmaqvolmin_to = AV120TFMaqVolMin_To ;
      AV145Tmaqui1wwds_12_tfmaqvolmed = AV121TFMaqVolMed ;
      AV146Tmaqui1wwds_13_tfmaqvolmed_to = AV122TFMaqVolMed_To ;
      AV147Tmaqui1wwds_14_tfmaqvoltop = AV123TFMaqVolTop ;
      AV148Tmaqui1wwds_15_tfmaqvoltop_to = AV124TFMaqVolTop_To ;
      AV149Tmaqui1wwds_16_tfmaqvolres = AV125TFMaqVolRes ;
      AV150Tmaqui1wwds_17_tfmaqvolres_to = AV126TFMaqVolRes_To ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = AV91TFMaqKgsMax ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = AV92TFMaqKgsMax_To ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = AV88TFMaqKgsMed ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = AV89TFMaqKgsMed_To ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = AV85TFMaqKgsMin ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = AV86TFMaqKgsMin_To ;
      AV157Tmaqui1wwds_24_tftipmaqcod = AV76TFTipMaqCod ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = AV77TFTipMaqCod_Sel ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = AV79TFTipMaqDsc ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = AV80TFTipMaqDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e128W2( )
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
         AV107PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV107PageToGo) ;
      }
   }

   public void e138W2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e148W2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV43TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqCod", AV43TFMaqCod);
            AV44TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqCod_Sel", AV44TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqDsc") == 0 )
         {
            AV46TFMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqDsc", AV46TFMaqDsc);
            AV47TFMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqDsc_Sel", AV47TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqEst") == 0 )
         {
            AV64TFMaqEst = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFMaqEst", AV64TFMaqEst);
            AV65TFMaqEst_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFMaqEst_Sel", AV65TFMaqEst_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqTinTip") == 0 )
         {
            AV117TFMaqTinTip = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFMaqTinTip", AV117TFMaqTinTip);
            AV118TFMaqTinTip_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118TFMaqTinTip_Sel", AV118TFMaqTinTip_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolMin") == 0 )
         {
            AV119TFMaqVolMin = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFMaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TFMaqVolMin), 5, 0));
            AV120TFMaqVolMin_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120TFMaqVolMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120TFMaqVolMin_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolMed") == 0 )
         {
            AV121TFMaqVolMed = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFMaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121TFMaqVolMed), 5, 0));
            AV122TFMaqVolMed_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFMaqVolMed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFMaqVolMed_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolTop") == 0 )
         {
            AV123TFMaqVolTop = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFMaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFMaqVolTop), 5, 0));
            AV124TFMaqVolTop_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124TFMaqVolTop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFMaqVolTop_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqVolRes") == 0 )
         {
            AV125TFMaqVolRes = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFMaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFMaqVolRes), 5, 0));
            AV126TFMaqVolRes_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFMaqVolRes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFMaqVolRes_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqKgsMax") == 0 )
         {
            AV91TFMaqKgsMax = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFMaqKgsMax", GXutil.ltrimstr( AV91TFMaqKgsMax, 9, 2));
            AV92TFMaqKgsMax_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFMaqKgsMax_To", GXutil.ltrimstr( AV92TFMaqKgsMax_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqKgsMed") == 0 )
         {
            AV88TFMaqKgsMed = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFMaqKgsMed", GXutil.ltrimstr( AV88TFMaqKgsMed, 9, 2));
            AV89TFMaqKgsMed_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFMaqKgsMed_To", GXutil.ltrimstr( AV89TFMaqKgsMed_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqKgsMin") == 0 )
         {
            AV85TFMaqKgsMin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFMaqKgsMin", GXutil.ltrimstr( AV85TFMaqKgsMin, 9, 2));
            AV86TFMaqKgsMin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFMaqKgsMin_To", GXutil.ltrimstr( AV86TFMaqKgsMin_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipMaqCod") == 0 )
         {
            AV76TFTipMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFTipMaqCod", AV76TFTipMaqCod);
            AV77TFTipMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFTipMaqCod_Sel", AV77TFTipMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipMaqDsc") == 0 )
         {
            AV79TFTipMaqDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipMaqDsc", AV79TFTipMaqDsc);
            AV80TFTipMaqDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFTipMaqDsc_Sel", AV80TFTipMaqDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e228W2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV113GridActions, 4, 0)) );
   }

   public void e158W2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV36ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TMAQUI1WWColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV36ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e118W2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TMAQUI1WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV129Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TMAQUI1WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV40ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TMAQUI1WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmaqui1ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV40ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV40ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV129Pgmname+"GridState", AV40ManageFiltersXml) ;
            AV10GridState.fromxml(AV40ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e168W2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmaqui1", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","MaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e178W2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.tmaqui1wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmaqui1ww_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      tmaqui1ww_impl.this.AV33ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV32ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV32ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV33ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e188W2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tmaqui1wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e198W2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tmaqui1wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
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
      AV36ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqCod", "", "Cod.", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqDsc", "", "Descripcion", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqEst", "", "E", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqTinTip", "", "Tipo", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolMin", "", "Vol Min", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolMed", "", "Vol Med", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolTop", "", "Vol Tope ( CO )", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqVolRes", "", "Vol Residual", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqKgsMax", "", "Kgs Max", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqKgsMed", "", "Kgs Med", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MaqKgsMin", "", "Kgs Min", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipMaqCod", "", "Tipo MQ", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipMaqDsc", "", "Descripción", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV35UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMAQUI1WWColumnsSelector", GXv_char4) ;
      tmaqui1ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV35UserCustomValue)==0) ) )
      {
         AV37ColumnsSelectorAux.fromxml(AV35UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV36ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV37ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV36ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV39ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TMAQUI1WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV112FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112FilterFullText", AV112FilterFullText);
      AV43TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqCod", AV43TFMaqCod);
      AV44TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqCod_Sel", AV44TFMaqCod_Sel);
      AV46TFMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqDsc", AV46TFMaqDsc);
      AV47TFMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqDsc_Sel", AV47TFMaqDsc_Sel);
      AV64TFMaqEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFMaqEst", AV64TFMaqEst);
      AV65TFMaqEst_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFMaqEst_Sel", AV65TFMaqEst_Sel);
      AV117TFMaqTinTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117TFMaqTinTip", AV117TFMaqTinTip);
      AV118TFMaqTinTip_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118TFMaqTinTip_Sel", AV118TFMaqTinTip_Sel);
      AV119TFMaqVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119TFMaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TFMaqVolMin), 5, 0));
      AV120TFMaqVolMin_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120TFMaqVolMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120TFMaqVolMin_To), 5, 0));
      AV121TFMaqVolMed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121TFMaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121TFMaqVolMed), 5, 0));
      AV122TFMaqVolMed_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122TFMaqVolMed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFMaqVolMed_To), 5, 0));
      AV123TFMaqVolTop = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123TFMaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFMaqVolTop), 5, 0));
      AV124TFMaqVolTop_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124TFMaqVolTop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFMaqVolTop_To), 5, 0));
      AV125TFMaqVolRes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125TFMaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFMaqVolRes), 5, 0));
      AV126TFMaqVolRes_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126TFMaqVolRes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFMaqVolRes_To), 5, 0));
      AV91TFMaqKgsMax = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFMaqKgsMax", GXutil.ltrimstr( AV91TFMaqKgsMax, 9, 2));
      AV92TFMaqKgsMax_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFMaqKgsMax_To", GXutil.ltrimstr( AV92TFMaqKgsMax_To, 9, 2));
      AV88TFMaqKgsMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88TFMaqKgsMed", GXutil.ltrimstr( AV88TFMaqKgsMed, 9, 2));
      AV89TFMaqKgsMed_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFMaqKgsMed_To", GXutil.ltrimstr( AV89TFMaqKgsMed_To, 9, 2));
      AV85TFMaqKgsMin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFMaqKgsMin", GXutil.ltrimstr( AV85TFMaqKgsMin, 9, 2));
      AV86TFMaqKgsMin_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFMaqKgsMin_To", GXutil.ltrimstr( AV86TFMaqKgsMin_To, 9, 2));
      AV76TFTipMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFTipMaqCod", AV76TFTipMaqCod);
      AV77TFTipMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFTipMaqCod_Sel", AV77TFTipMaqCod_Sel);
      AV79TFTipMaqDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipMaqDsc", AV79TFTipMaqDsc);
      AV80TFTipMaqDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFTipMaqDsc_Sel", AV80TFTipMaqDsc_Sel);
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
      callWebObject(formatLink("app.tmaqui1", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod))}, new String[] {"Mode","EmprCod","MaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmaqui1", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod))}, new String[] {"Mode","EmprCod","MaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmaqui1", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod))}, new String[] {"Mode","EmprCod","MaqCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV129Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV129Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV38Session.getValue(AV129Pgmname+"GridState"), null, null);
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
      AV161GXV1 = 1 ;
      while ( AV161GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV161GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV112FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV112FilterFullText", AV112FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV43TFMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMaqCod", AV43TFMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV44TFMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFMaqCod_Sel", AV44TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV46TFMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFMaqDsc", AV46TFMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV47TFMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFMaqDsc_Sel", AV47TFMaqDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST") == 0 )
         {
            AV64TFMaqEst = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFMaqEst", AV64TFMaqEst);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQEST_SEL") == 0 )
         {
            AV65TFMaqEst_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFMaqEst_Sel", AV65TFMaqEst_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP") == 0 )
         {
            AV117TFMaqTinTip = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFMaqTinTip", AV117TFMaqTinTip);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQTINTIP_SEL") == 0 )
         {
            AV118TFMaqTinTip_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118TFMaqTinTip_Sel", AV118TFMaqTinTip_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMIN") == 0 )
         {
            AV119TFMaqVolMin = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFMaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119TFMaqVolMin), 5, 0));
            AV120TFMaqVolMin_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120TFMaqVolMin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120TFMaqVolMin_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLMED") == 0 )
         {
            AV121TFMaqVolMed = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV121TFMaqVolMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121TFMaqVolMed), 5, 0));
            AV122TFMaqVolMed_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122TFMaqVolMed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122TFMaqVolMed_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLTOP") == 0 )
         {
            AV123TFMaqVolTop = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123TFMaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV123TFMaqVolTop), 5, 0));
            AV124TFMaqVolTop_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124TFMaqVolTop_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124TFMaqVolTop_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQVOLRES") == 0 )
         {
            AV125TFMaqVolRes = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125TFMaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV125TFMaqVolRes), 5, 0));
            AV126TFMaqVolRes_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFMaqVolRes_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126TFMaqVolRes_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMAX") == 0 )
         {
            AV91TFMaqKgsMax = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFMaqKgsMax", GXutil.ltrimstr( AV91TFMaqKgsMax, 9, 2));
            AV92TFMaqKgsMax_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFMaqKgsMax_To", GXutil.ltrimstr( AV92TFMaqKgsMax_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMED") == 0 )
         {
            AV88TFMaqKgsMed = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFMaqKgsMed", GXutil.ltrimstr( AV88TFMaqKgsMed, 9, 2));
            AV89TFMaqKgsMed_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFMaqKgsMed_To", GXutil.ltrimstr( AV89TFMaqKgsMed_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQKGSMIN") == 0 )
         {
            AV85TFMaqKgsMin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFMaqKgsMin", GXutil.ltrimstr( AV85TFMaqKgsMin, 9, 2));
            AV86TFMaqKgsMin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFMaqKgsMin_To", GXutil.ltrimstr( AV86TFMaqKgsMin_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD") == 0 )
         {
            AV76TFTipMaqCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFTipMaqCod", AV76TFTipMaqCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQCOD_SEL") == 0 )
         {
            AV77TFTipMaqCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFTipMaqCod_Sel", AV77TFTipMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC") == 0 )
         {
            AV79TFTipMaqDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipMaqDsc", AV79TFTipMaqDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPMAQDSC_SEL") == 0 )
         {
            AV80TFTipMaqDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFTipMaqDsc_Sel", AV80TFTipMaqDsc_Sel);
         }
         AV161GXV1 = (int)(AV161GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFMaqCod_Sel)==0), AV44TFMaqCod_Sel, GXv_char4) ;
      tmaqui1ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFMaqDsc_Sel)==0), AV47TFMaqDsc_Sel, GXv_char3) ;
      tmaqui1ww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFMaqEst_Sel)==0), AV65TFMaqEst_Sel, GXv_char2) ;
      tmaqui1ww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV118TFMaqTinTip_Sel)==0), AV118TFMaqTinTip_Sel, GXv_char15) ;
      tmaqui1ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFTipMaqCod_Sel)==0), AV77TFTipMaqCod_Sel, GXv_char17) ;
      tmaqui1ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFTipMaqDsc_Sel)==0), AV80TFTipMaqDsc_Sel, GXv_char19) ;
      tmaqui1ww_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"||||||||"+GXt_char16+"|"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFMaqCod)==0), AV43TFMaqCod, GXv_char19) ;
      tmaqui1ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFMaqDsc)==0), AV46TFMaqDsc, GXv_char17) ;
      tmaqui1ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFMaqEst)==0), AV64TFMaqEst, GXv_char15) ;
      tmaqui1ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV117TFMaqTinTip)==0), AV117TFMaqTinTip, GXv_char4) ;
      tmaqui1ww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFTipMaqCod)==0), AV76TFTipMaqCod, GXv_char3) ;
      tmaqui1ww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFTipMaqDsc)==0), AV79TFTipMaqDsc, GXv_char2) ;
      tmaqui1ww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV119TFMaqVolMin) ? "" : GXutil.str( AV119TFMaqVolMin, 5, 0))+"|"+((0==AV121TFMaqVolMed) ? "" : GXutil.str( AV121TFMaqVolMed, 5, 0))+"|"+((0==AV123TFMaqVolTop) ? "" : GXutil.str( AV123TFMaqVolTop, 5, 0))+"|"+((0==AV125TFMaqVolRes) ? "" : GXutil.str( AV125TFMaqVolRes, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFMaqKgsMax)==0) ? "" : GXutil.str( AV91TFMaqKgsMax, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFMaqKgsMed)==0) ? "" : GXutil.str( AV88TFMaqKgsMed, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFMaqKgsMin)==0) ? "" : GXutil.str( AV85TFMaqKgsMin, 9, 2))+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+((0==AV120TFMaqVolMin_To) ? "" : GXutil.str( AV120TFMaqVolMin_To, 5, 0))+"|"+((0==AV122TFMaqVolMed_To) ? "" : GXutil.str( AV122TFMaqVolMed_To, 5, 0))+"|"+((0==AV124TFMaqVolTop_To) ? "" : GXutil.str( AV124TFMaqVolTop_To, 5, 0))+"|"+((0==AV126TFMaqVolRes_To) ? "" : GXutil.str( AV126TFMaqVolRes_To, 5, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFMaqKgsMax_To)==0) ? "" : GXutil.str( AV92TFMaqKgsMax_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFMaqKgsMed_To)==0) ? "" : GXutil.str( AV89TFMaqKgsMed_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFMaqKgsMin_To)==0) ? "" : GXutil.str( AV86TFMaqKgsMin_To, 9, 2))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV38Session.getValue(AV129Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV112FilterFullText)==0), (short)(0), AV112FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQCOD", "", !(GXutil.strcmp("", AV43TFMaqCod)==0), (short)(0), AV43TFMaqCod, "", !(GXutil.strcmp("", AV44TFMaqCod_Sel)==0), AV44TFMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQDSC", "", !(GXutil.strcmp("", AV46TFMaqDsc)==0), (short)(0), AV46TFMaqDsc, "", !(GXutil.strcmp("", AV47TFMaqDsc_Sel)==0), AV47TFMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQEST", "", !(GXutil.strcmp("", AV64TFMaqEst)==0), (short)(0), AV64TFMaqEst, "", !(GXutil.strcmp("", AV65TFMaqEst_Sel)==0), AV65TFMaqEst_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQTINTIP", "", !(GXutil.strcmp("", AV117TFMaqTinTip)==0), (short)(0), AV117TFMaqTinTip, "", !(GXutil.strcmp("", AV118TFMaqTinTip_Sel)==0), AV118TFMaqTinTip_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQVOLMIN", "", !((0==AV119TFMaqVolMin)&&(0==AV120TFMaqVolMin_To)), (short)(0), GXutil.trim( GXutil.str( AV119TFMaqVolMin, 5, 0)), GXutil.trim( GXutil.str( AV120TFMaqVolMin_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQVOLMED", "", !((0==AV121TFMaqVolMed)&&(0==AV122TFMaqVolMed_To)), (short)(0), GXutil.trim( GXutil.str( AV121TFMaqVolMed, 5, 0)), GXutil.trim( GXutil.str( AV122TFMaqVolMed_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQVOLTOP", "", !((0==AV123TFMaqVolTop)&&(0==AV124TFMaqVolTop_To)), (short)(0), GXutil.trim( GXutil.str( AV123TFMaqVolTop, 5, 0)), GXutil.trim( GXutil.str( AV124TFMaqVolTop_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQVOLRES", "", !((0==AV125TFMaqVolRes)&&(0==AV126TFMaqVolRes_To)), (short)(0), GXutil.trim( GXutil.str( AV125TFMaqVolRes, 5, 0)), GXutil.trim( GXutil.str( AV126TFMaqVolRes_To, 5, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQKGSMAX", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV91TFMaqKgsMax)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV92TFMaqKgsMax_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV91TFMaqKgsMax, 9, 2)), GXutil.trim( GXutil.str( AV92TFMaqKgsMax_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQKGSMED", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV88TFMaqKgsMed)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV89TFMaqKgsMed_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV88TFMaqKgsMed, 9, 2)), GXutil.trim( GXutil.str( AV89TFMaqKgsMed_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFMAQKGSMIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFMaqKgsMin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFMaqKgsMin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV85TFMaqKgsMin, 9, 2)), GXutil.trim( GXutil.str( AV86TFMaqKgsMin_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFTIPMAQCOD", "", !(GXutil.strcmp("", AV76TFTipMaqCod)==0), (short)(0), AV76TFTipMaqCod, "", !(GXutil.strcmp("", AV77TFTipMaqCod_Sel)==0), AV77TFTipMaqCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFTIPMAQDSC", "", !(GXutil.strcmp("", AV79TFTipMaqDsc)==0), (short)(0), AV79TFTipMaqDsc, "", !(GXutil.strcmp("", AV80TFTipMaqDsc_Sel)==0), AV80TFTipMaqDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV129Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV129Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMAQUI1" );
      AV38Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_8W2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV39ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_8W2( true) ;
      }
      else
      {
         wb_table2_32_8W2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_8W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_8W2e( true) ;
      }
      else
      {
         wb_table1_27_8W2e( false) ;
      }
   }

   public void wb_table2_32_8W2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV112FilterFullText, GXutil.rtrim( localUtil.format( AV112FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TMAQUI1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_8W2e( true) ;
      }
      else
      {
         wb_table2_32_8W2e( false) ;
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
      pa8W2( ) ;
      ws8W2( ) ;
      we8W2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116113055", true, true);
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
      httpContext.AddJavascriptSource("tmaqui1ww.js", "?202682116113056", false, true);
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
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_45_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_45_idx ;
      edtMaqEst_Internalname = "MAQEST_"+sGXsfl_45_idx ;
      edtMaqTinTip_Internalname = "MAQTINTIP_"+sGXsfl_45_idx ;
      edtMaqVolMin_Internalname = "MAQVOLMIN_"+sGXsfl_45_idx ;
      edtMaqVolMed_Internalname = "MAQVOLMED_"+sGXsfl_45_idx ;
      edtMaqVolTop_Internalname = "MAQVOLTOP_"+sGXsfl_45_idx ;
      edtMaqVolRes_Internalname = "MAQVOLRES_"+sGXsfl_45_idx ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX_"+sGXsfl_45_idx ;
      edtMaqKgsMed_Internalname = "MAQKGSMED_"+sGXsfl_45_idx ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN_"+sGXsfl_45_idx ;
      edtTipMaqCod_Internalname = "TIPMAQCOD_"+sGXsfl_45_idx ;
      edtTipMaqDsc_Internalname = "TIPMAQDSC_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_45_fel_idx ;
      edtMaqDsc_Internalname = "MAQDSC_"+sGXsfl_45_fel_idx ;
      edtMaqEst_Internalname = "MAQEST_"+sGXsfl_45_fel_idx ;
      edtMaqTinTip_Internalname = "MAQTINTIP_"+sGXsfl_45_fel_idx ;
      edtMaqVolMin_Internalname = "MAQVOLMIN_"+sGXsfl_45_fel_idx ;
      edtMaqVolMed_Internalname = "MAQVOLMED_"+sGXsfl_45_fel_idx ;
      edtMaqVolTop_Internalname = "MAQVOLTOP_"+sGXsfl_45_fel_idx ;
      edtMaqVolRes_Internalname = "MAQVOLRES_"+sGXsfl_45_fel_idx ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX_"+sGXsfl_45_fel_idx ;
      edtMaqKgsMed_Internalname = "MAQKGSMED_"+sGXsfl_45_fel_idx ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN_"+sGXsfl_45_fel_idx ;
      edtTipMaqCod_Internalname = "TIPMAQCOD_"+sGXsfl_45_fel_idx ;
      edtTipMaqDsc_Internalname = "TIPMAQDSC_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb8W0( ) ;
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
               AV113GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV113GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV113GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e238w2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV113GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqEst_Internalname,GXutil.rtrim( A607MaqEst),GXutil.rtrim( localUtil.format( A607MaqEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMax_Internalname,GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqKgsMax_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqKgsMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMed_Internalname,GXutil.ltrim( localUtil.ntoc( A4284MaqKgsMed, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4284MaqKgsMed, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqKgsMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMaqKgsMin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqKgsMin_Internalname,GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqKgsMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqKgsMin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMaqCod_Internalname,GXutil.rtrim( A1011TipMaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipMaqDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMaqDsc_Internalname,GXutil.rtrim( A1012TipMaqDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMaqDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipMaqDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes8W2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqTinTip_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vol Min", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vol Med", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolTop_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vol Tope ( CO )", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqVolRes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Vol Residual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqKgsMax_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Max", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqKgsMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Med", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqKgsMin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs Min", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo MQ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipMaqDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV113GridActions, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A607MaqEst));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A619MaqTinTip));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqTinTip_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtMaqEst_Internalname = "MAQEST" ;
      edtMaqTinTip_Internalname = "MAQTINTIP" ;
      edtMaqVolMin_Internalname = "MAQVOLMIN" ;
      edtMaqVolMed_Internalname = "MAQVOLMED" ;
      edtMaqVolTop_Internalname = "MAQVOLTOP" ;
      edtMaqVolRes_Internalname = "MAQVOLRES" ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX" ;
      edtMaqKgsMed_Internalname = "MAQKGSMED" ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN" ;
      edtTipMaqCod_Internalname = "TIPMAQCOD" ;
      edtTipMaqDsc_Internalname = "TIPMAQDSC" ;
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
      edtTipMaqDsc_Jsonclick = "" ;
      edtTipMaqCod_Jsonclick = "" ;
      edtMaqKgsMin_Jsonclick = "" ;
      edtMaqKgsMed_Jsonclick = "" ;
      edtMaqKgsMax_Jsonclick = "" ;
      edtMaqVolRes_Jsonclick = "" ;
      edtMaqVolTop_Jsonclick = "" ;
      edtMaqVolMed_Jsonclick = "" ;
      edtMaqVolMin_Jsonclick = "" ;
      edtMaqTinTip_Jsonclick = "" ;
      edtMaqEst_Jsonclick = "" ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
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
      edtMaqTinTip_Visible = -1 ;
      edtMaqEst_Visible = -1 ;
      edtMaqDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TMAQUI1WWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|Dynamic|Dynamic||||||||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|T|T||||||||T|T" ;
      Ddo_grid_Filterisrange = "||||T|T|T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "1:MaqCod|2:MaqDsc|3:MaqEst|4:MaqTinTip|5:MaqVolMin|6:MaqVolMed|7:MaqVolTop|8:MaqVolRes|9:MaqKgsMax|10:MaqKgsMed|11:MaqKgsMin|12:TipMaqCod|13:TipMaqDsc" ;
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
      Form.setCaption( httpContext.getMessage( " MANTENIMIENTO MAQUINAS Basico", "") );
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
         AV113GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV113GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtMaqEst_Visible',ctrl:'MAQEST',prop:'Visible'},{av:'edtMaqTinTip_Visible',ctrl:'MAQTINTIP',prop:'Visible'},{av:'edtMaqVolMin_Visible',ctrl:'MAQVOLMIN',prop:'Visible'},{av:'edtMaqVolMed_Visible',ctrl:'MAQVOLMED',prop:'Visible'},{av:'edtMaqVolTop_Visible',ctrl:'MAQVOLTOP',prop:'Visible'},{av:'edtMaqVolRes_Visible',ctrl:'MAQVOLRES',prop:'Visible'},{av:'edtMaqKgsMax_Visible',ctrl:'MAQKGSMAX',prop:'Visible'},{av:'edtMaqKgsMed_Visible',ctrl:'MAQKGSMED',prop:'Visible'},{av:'edtMaqKgsMin_Visible',ctrl:'MAQKGSMIN',prop:'Visible'},{av:'edtTipMaqCod_Visible',ctrl:'TIPMAQCOD',prop:'Visible'},{av:'edtTipMaqDsc_Visible',ctrl:'TIPMAQDSC',prop:'Visible'},{av:'AV108GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV109GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e128W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e138W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e148W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e228W2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV113GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e158W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtMaqEst_Visible',ctrl:'MAQEST',prop:'Visible'},{av:'edtMaqTinTip_Visible',ctrl:'MAQTINTIP',prop:'Visible'},{av:'edtMaqVolMin_Visible',ctrl:'MAQVOLMIN',prop:'Visible'},{av:'edtMaqVolMed_Visible',ctrl:'MAQVOLMED',prop:'Visible'},{av:'edtMaqVolTop_Visible',ctrl:'MAQVOLTOP',prop:'Visible'},{av:'edtMaqVolRes_Visible',ctrl:'MAQVOLRES',prop:'Visible'},{av:'edtMaqKgsMax_Visible',ctrl:'MAQKGSMAX',prop:'Visible'},{av:'edtMaqKgsMed_Visible',ctrl:'MAQKGSMED',prop:'Visible'},{av:'edtMaqKgsMin_Visible',ctrl:'MAQKGSMIN',prop:'Visible'},{av:'edtTipMaqCod_Visible',ctrl:'TIPMAQCOD',prop:'Visible'},{av:'edtTipMaqDsc_Visible',ctrl:'TIPMAQDSC',prop:'Visible'},{av:'AV108GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV109GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e118W2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqDsc_Visible',ctrl:'MAQDSC',prop:'Visible'},{av:'edtMaqEst_Visible',ctrl:'MAQEST',prop:'Visible'},{av:'edtMaqTinTip_Visible',ctrl:'MAQTINTIP',prop:'Visible'},{av:'edtMaqVolMin_Visible',ctrl:'MAQVOLMIN',prop:'Visible'},{av:'edtMaqVolMed_Visible',ctrl:'MAQVOLMED',prop:'Visible'},{av:'edtMaqVolTop_Visible',ctrl:'MAQVOLTOP',prop:'Visible'},{av:'edtMaqVolRes_Visible',ctrl:'MAQVOLRES',prop:'Visible'},{av:'edtMaqKgsMax_Visible',ctrl:'MAQKGSMAX',prop:'Visible'},{av:'edtMaqKgsMed_Visible',ctrl:'MAQKGSMED',prop:'Visible'},{av:'edtMaqKgsMin_Visible',ctrl:'MAQKGSMIN',prop:'Visible'},{av:'edtTipMaqCod_Visible',ctrl:'TIPMAQCOD',prop:'Visible'},{av:'edtTipMaqDsc_Visible',ctrl:'TIPMAQDSC',prop:'Visible'},{av:'AV108GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV109GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e238W2',iparms:[{av:'cmbavGridactions'},{av:'AV113GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV113GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e168W2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e178W2',iparms:[{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e188W2',iparms:[{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e198W2',iparms:[{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV112FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV43TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV44TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV46TFMaqDsc',fld:'vTFMAQDSC',pic:''},{av:'AV47TFMaqDsc_Sel',fld:'vTFMAQDSC_SEL',pic:''},{av:'AV64TFMaqEst',fld:'vTFMAQEST',pic:'@!'},{av:'AV65TFMaqEst_Sel',fld:'vTFMAQEST_SEL',pic:'@!'},{av:'AV117TFMaqTinTip',fld:'vTFMAQTINTIP',pic:''},{av:'AV118TFMaqTinTip_Sel',fld:'vTFMAQTINTIP_SEL',pic:''},{av:'AV119TFMaqVolMin',fld:'vTFMAQVOLMIN',pic:'ZZZZ9'},{av:'AV120TFMaqVolMin_To',fld:'vTFMAQVOLMIN_TO',pic:'ZZZZ9'},{av:'AV121TFMaqVolMed',fld:'vTFMAQVOLMED',pic:'ZZZZ9'},{av:'AV122TFMaqVolMed_To',fld:'vTFMAQVOLMED_TO',pic:'ZZZZ9'},{av:'AV123TFMaqVolTop',fld:'vTFMAQVOLTOP',pic:'ZZZZ9'},{av:'AV124TFMaqVolTop_To',fld:'vTFMAQVOLTOP_TO',pic:'ZZZZ9'},{av:'AV125TFMaqVolRes',fld:'vTFMAQVOLRES',pic:'ZZZZ9'},{av:'AV126TFMaqVolRes_To',fld:'vTFMAQVOLRES_TO',pic:'ZZZZ9'},{av:'AV91TFMaqKgsMax',fld:'vTFMAQKGSMAX',pic:'ZZZZZ9.99'},{av:'AV92TFMaqKgsMax_To',fld:'vTFMAQKGSMAX_TO',pic:'ZZZZZ9.99'},{av:'AV88TFMaqKgsMed',fld:'vTFMAQKGSMED',pic:'ZZZZZ9.99'},{av:'AV89TFMaqKgsMed_To',fld:'vTFMAQKGSMED_TO',pic:'ZZZZZ9.99'},{av:'AV85TFMaqKgsMin',fld:'vTFMAQKGSMIN',pic:'ZZZZZ9.99'},{av:'AV86TFMaqKgsMin_To',fld:'vTFMAQKGSMIN_TO',pic:'ZZZZZ9.99'},{av:'AV76TFTipMaqCod',fld:'vTFTIPMAQCOD',pic:''},{av:'AV77TFTipMaqCod_Sel',fld:'vTFTIPMAQCOD_SEL',pic:''},{av:'AV79TFTipMaqDsc',fld:'vTFTIPMAQDSC',pic:''},{av:'AV80TFTipMaqDsc_Sel',fld:'vTFTIPMAQDSC_SEL',pic:''},{av:'AV129Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_TIPMAQCOD","{handler:'valid_Tipmaqcod',iparms:[]");
      setEventMetadata("VALID_TIPMAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Tipmaqdsc',iparms:[]");
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
      AV112FilterFullText = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV43TFMaqCod = "" ;
      AV44TFMaqCod_Sel = "" ;
      AV46TFMaqDsc = "" ;
      AV47TFMaqDsc_Sel = "" ;
      AV64TFMaqEst = "" ;
      AV65TFMaqEst_Sel = "" ;
      AV117TFMaqTinTip = "" ;
      AV118TFMaqTinTip_Sel = "" ;
      AV91TFMaqKgsMax = DecimalUtil.ZERO ;
      AV92TFMaqKgsMax_To = DecimalUtil.ZERO ;
      AV88TFMaqKgsMed = DecimalUtil.ZERO ;
      AV89TFMaqKgsMed_To = DecimalUtil.ZERO ;
      AV85TFMaqKgsMin = DecimalUtil.ZERO ;
      AV86TFMaqKgsMin_To = DecimalUtil.ZERO ;
      AV76TFTipMaqCod = "" ;
      AV77TFTipMaqCod_Sel = "" ;
      AV79TFTipMaqDsc = "" ;
      AV80TFTipMaqDsc_Sel = "" ;
      AV129Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV106DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A607MaqEst = "" ;
      A619MaqTinTip = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      A4284MaqKgsMed = DecimalUtil.ZERO ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      scmdbuf = "" ;
      lV134Tmaqui1wwds_1_filterfulltext = "" ;
      lV135Tmaqui1wwds_2_tfmaqcod = "" ;
      lV137Tmaqui1wwds_4_tfmaqdsc = "" ;
      lV139Tmaqui1wwds_6_tfmaqest = "" ;
      lV141Tmaqui1wwds_8_tfmaqtintip = "" ;
      lV157Tmaqui1wwds_24_tftipmaqcod = "" ;
      lV159Tmaqui1wwds_26_tftipmaqdsc = "" ;
      AV134Tmaqui1wwds_1_filterfulltext = "" ;
      AV136Tmaqui1wwds_3_tfmaqcod_sel = "" ;
      AV135Tmaqui1wwds_2_tfmaqcod = "" ;
      AV138Tmaqui1wwds_5_tfmaqdsc_sel = "" ;
      AV137Tmaqui1wwds_4_tfmaqdsc = "" ;
      AV140Tmaqui1wwds_7_tfmaqest_sel = "" ;
      AV139Tmaqui1wwds_6_tfmaqest = "" ;
      AV142Tmaqui1wwds_9_tfmaqtintip_sel = "" ;
      AV141Tmaqui1wwds_8_tfmaqtintip = "" ;
      AV151Tmaqui1wwds_18_tfmaqkgsmax = DecimalUtil.ZERO ;
      AV152Tmaqui1wwds_19_tfmaqkgsmax_to = DecimalUtil.ZERO ;
      AV153Tmaqui1wwds_20_tfmaqkgsmed = DecimalUtil.ZERO ;
      AV154Tmaqui1wwds_21_tfmaqkgsmed_to = DecimalUtil.ZERO ;
      AV155Tmaqui1wwds_22_tfmaqkgsmin = DecimalUtil.ZERO ;
      AV156Tmaqui1wwds_23_tfmaqkgsmin_to = DecimalUtil.ZERO ;
      AV158Tmaqui1wwds_25_tftipmaqcod_sel = "" ;
      AV157Tmaqui1wwds_24_tftipmaqcod = "" ;
      AV160Tmaqui1wwds_27_tftipmaqdsc_sel = "" ;
      AV159Tmaqui1wwds_26_tftipmaqdsc = "" ;
      H008W2_A396EmprCod = new String[] {""} ;
      H008W2_A1012TipMaqDsc = new String[] {""} ;
      H008W2_n1012TipMaqDsc = new boolean[] {false} ;
      H008W2_A1011TipMaqCod = new String[] {""} ;
      H008W2_n1011TipMaqCod = new boolean[] {false} ;
      H008W2_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H008W2_n4283MaqKgsMin = new boolean[] {false} ;
      H008W2_A4284MaqKgsMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H008W2_n4284MaqKgsMed = new boolean[] {false} ;
      H008W2_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H008W2_n4285MaqKgsMax = new boolean[] {false} ;
      H008W2_A2801MaqVolRes = new int[1] ;
      H008W2_n2801MaqVolRes = new boolean[] {false} ;
      H008W2_A2802MaqVolTop = new int[1] ;
      H008W2_n2802MaqVolTop = new boolean[] {false} ;
      H008W2_A624MaqVolMed = new int[1] ;
      H008W2_n624MaqVolMed = new boolean[] {false} ;
      H008W2_A625MaqVolMin = new int[1] ;
      H008W2_n625MaqVolMin = new boolean[] {false} ;
      H008W2_A619MaqTinTip = new String[] {""} ;
      H008W2_n619MaqTinTip = new boolean[] {false} ;
      H008W2_A607MaqEst = new String[] {""} ;
      H008W2_n607MaqEst = new boolean[] {false} ;
      H008W2_A606MaqDsc = new String[] {""} ;
      H008W2_n606MaqDsc = new boolean[] {false} ;
      H008W2_A602MaqCod = new String[] {""} ;
      H008W3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV130Station = "" ;
      AV131Emprcod = "" ;
      AV132Emprnom = "" ;
      AV133Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38Session = httpContext.getWebSession();
      AV34ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV40ManageFiltersXml = "" ;
      AV32ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV35UserCustomValue = "" ;
      AV37ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqui1ww__default(),
         new Object[] {
             new Object[] {
            H008W2_A396EmprCod, H008W2_A1012TipMaqDsc, H008W2_n1012TipMaqDsc, H008W2_A1011TipMaqCod, H008W2_n1011TipMaqCod, H008W2_A4283MaqKgsMin, H008W2_n4283MaqKgsMin, H008W2_A4284MaqKgsMed, H008W2_n4284MaqKgsMed, H008W2_A4285MaqKgsMax,
            H008W2_n4285MaqKgsMax, H008W2_A2801MaqVolRes, H008W2_n2801MaqVolRes, H008W2_A2802MaqVolTop, H008W2_n2802MaqVolTop, H008W2_A624MaqVolMed, H008W2_n624MaqVolMed, H008W2_A625MaqVolMin, H008W2_n625MaqVolMin, H008W2_A619MaqTinTip,
            H008W2_n619MaqTinTip, H008W2_A607MaqEst, H008W2_n607MaqEst, H008W2_A606MaqDsc, H008W2_n606MaqDsc, H008W2_A602MaqCod
            }
            , new Object[] {
            H008W3_AGRID_nRecordCount
            }
         }
      );
      AV129Pgmname = "TMAQUI1WW" ;
      /* GeneXus formulas. */
      AV129Pgmname = "TMAQUI1WW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV41ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
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
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV113GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV119TFMaqVolMin ;
   private int AV120TFMaqVolMin_To ;
   private int AV121TFMaqVolMed ;
   private int AV122TFMaqVolMed_To ;
   private int AV123TFMaqVolTop ;
   private int AV124TFMaqVolTop_To ;
   private int AV125TFMaqVolRes ;
   private int AV126TFMaqVolRes_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A625MaqVolMin ;
   private int A624MaqVolMed ;
   private int A2802MaqVolTop ;
   private int A2801MaqVolRes ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV143Tmaqui1wwds_10_tfmaqvolmin ;
   private int AV144Tmaqui1wwds_11_tfmaqvolmin_to ;
   private int AV145Tmaqui1wwds_12_tfmaqvolmed ;
   private int AV146Tmaqui1wwds_13_tfmaqvolmed_to ;
   private int AV147Tmaqui1wwds_14_tfmaqvoltop ;
   private int AV148Tmaqui1wwds_15_tfmaqvoltop_to ;
   private int AV149Tmaqui1wwds_16_tfmaqvolres ;
   private int AV150Tmaqui1wwds_17_tfmaqvolres_to ;
   private int edtMaqCod_Visible ;
   private int edtMaqDsc_Visible ;
   private int edtMaqEst_Visible ;
   private int edtMaqTinTip_Visible ;
   private int edtMaqVolMin_Visible ;
   private int edtMaqVolMed_Visible ;
   private int edtMaqVolTop_Visible ;
   private int edtMaqVolRes_Visible ;
   private int edtMaqKgsMax_Visible ;
   private int edtMaqKgsMed_Visible ;
   private int edtMaqKgsMin_Visible ;
   private int edtTipMaqCod_Visible ;
   private int edtTipMaqDsc_Visible ;
   private int AV107PageToGo ;
   private int AV161GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV108GridCurrentPage ;
   private long AV109GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV91TFMaqKgsMax ;
   private java.math.BigDecimal AV92TFMaqKgsMax_To ;
   private java.math.BigDecimal AV88TFMaqKgsMed ;
   private java.math.BigDecimal AV89TFMaqKgsMed_To ;
   private java.math.BigDecimal AV85TFMaqKgsMin ;
   private java.math.BigDecimal AV86TFMaqKgsMin_To ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal A4284MaqKgsMed ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal AV151Tmaqui1wwds_18_tfmaqkgsmax ;
   private java.math.BigDecimal AV152Tmaqui1wwds_19_tfmaqkgsmax_to ;
   private java.math.BigDecimal AV153Tmaqui1wwds_20_tfmaqkgsmed ;
   private java.math.BigDecimal AV154Tmaqui1wwds_21_tfmaqkgsmed_to ;
   private java.math.BigDecimal AV155Tmaqui1wwds_22_tfmaqkgsmin ;
   private java.math.BigDecimal AV156Tmaqui1wwds_23_tfmaqkgsmin_to ;
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
   private String AV43TFMaqCod ;
   private String AV44TFMaqCod_Sel ;
   private String AV46TFMaqDsc ;
   private String AV47TFMaqDsc_Sel ;
   private String AV64TFMaqEst ;
   private String AV65TFMaqEst_Sel ;
   private String AV117TFMaqTinTip ;
   private String AV118TFMaqTinTip_Sel ;
   private String AV76TFTipMaqCod ;
   private String AV77TFTipMaqCod_Sel ;
   private String AV79TFTipMaqDsc ;
   private String AV80TFTipMaqDsc_Sel ;
   private String AV129Pgmname ;
   private String A396EmprCod ;
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
   private String A602MaqCod ;
   private String edtMaqCod_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Internalname ;
   private String A607MaqEst ;
   private String edtMaqEst_Internalname ;
   private String A619MaqTinTip ;
   private String edtMaqTinTip_Internalname ;
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
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV135Tmaqui1wwds_2_tfmaqcod ;
   private String lV137Tmaqui1wwds_4_tfmaqdsc ;
   private String lV139Tmaqui1wwds_6_tfmaqest ;
   private String lV141Tmaqui1wwds_8_tfmaqtintip ;
   private String lV157Tmaqui1wwds_24_tftipmaqcod ;
   private String lV159Tmaqui1wwds_26_tftipmaqdsc ;
   private String AV136Tmaqui1wwds_3_tfmaqcod_sel ;
   private String AV135Tmaqui1wwds_2_tfmaqcod ;
   private String AV138Tmaqui1wwds_5_tfmaqdsc_sel ;
   private String AV137Tmaqui1wwds_4_tfmaqdsc ;
   private String AV140Tmaqui1wwds_7_tfmaqest_sel ;
   private String AV139Tmaqui1wwds_6_tfmaqest ;
   private String AV142Tmaqui1wwds_9_tfmaqtintip_sel ;
   private String AV141Tmaqui1wwds_8_tfmaqtintip ;
   private String AV158Tmaqui1wwds_25_tftipmaqcod_sel ;
   private String AV157Tmaqui1wwds_24_tftipmaqcod ;
   private String AV160Tmaqui1wwds_27_tftipmaqdsc_sel ;
   private String AV159Tmaqui1wwds_26_tftipmaqdsc ;
   private String hsh ;
   private String AV130Station ;
   private String AV131Emprcod ;
   private String AV132Emprnom ;
   private String AV133Usurcod ;
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
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Jsonclick ;
   private String edtMaqEst_Jsonclick ;
   private String edtMaqTinTip_Jsonclick ;
   private String edtMaqVolMin_Jsonclick ;
   private String edtMaqVolMed_Jsonclick ;
   private String edtMaqVolTop_Jsonclick ;
   private String edtMaqVolRes_Jsonclick ;
   private String edtMaqKgsMax_Jsonclick ;
   private String edtMaqKgsMed_Jsonclick ;
   private String edtMaqKgsMin_Jsonclick ;
   private String edtTipMaqCod_Jsonclick ;
   private String edtTipMaqDsc_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n606MaqDsc ;
   private boolean n607MaqEst ;
   private boolean n619MaqTinTip ;
   private boolean n625MaqVolMin ;
   private boolean n624MaqVolMed ;
   private boolean n2802MaqVolTop ;
   private boolean n2801MaqVolRes ;
   private boolean n4285MaqKgsMax ;
   private boolean n4284MaqKgsMed ;
   private boolean n4283MaqKgsMin ;
   private boolean n1011TipMaqCod ;
   private boolean n1012TipMaqDsc ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV34ColumnsSelectorXML ;
   private String AV40ManageFiltersXml ;
   private String AV35UserCustomValue ;
   private String AV112FilterFullText ;
   private String lV134Tmaqui1wwds_1_filterfulltext ;
   private String AV134Tmaqui1wwds_1_filterfulltext ;
   private String AV32ExcelFilename ;
   private String AV33ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV38Session ;
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
   private String[] H008W2_A396EmprCod ;
   private String[] H008W2_A1012TipMaqDsc ;
   private boolean[] H008W2_n1012TipMaqDsc ;
   private String[] H008W2_A1011TipMaqCod ;
   private boolean[] H008W2_n1011TipMaqCod ;
   private java.math.BigDecimal[] H008W2_A4283MaqKgsMin ;
   private boolean[] H008W2_n4283MaqKgsMin ;
   private java.math.BigDecimal[] H008W2_A4284MaqKgsMed ;
   private boolean[] H008W2_n4284MaqKgsMed ;
   private java.math.BigDecimal[] H008W2_A4285MaqKgsMax ;
   private boolean[] H008W2_n4285MaqKgsMax ;
   private int[] H008W2_A2801MaqVolRes ;
   private boolean[] H008W2_n2801MaqVolRes ;
   private int[] H008W2_A2802MaqVolTop ;
   private boolean[] H008W2_n2802MaqVolTop ;
   private int[] H008W2_A624MaqVolMed ;
   private boolean[] H008W2_n624MaqVolMed ;
   private int[] H008W2_A625MaqVolMin ;
   private boolean[] H008W2_n625MaqVolMin ;
   private String[] H008W2_A619MaqTinTip ;
   private boolean[] H008W2_n619MaqTinTip ;
   private String[] H008W2_A607MaqEst ;
   private boolean[] H008W2_n607MaqEst ;
   private String[] H008W2_A606MaqDsc ;
   private boolean[] H008W2_n606MaqDsc ;
   private String[] H008W2_A602MaqCod ;
   private long[] H008W3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV106DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class tmaqui1ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H008W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV134Tmaqui1wwds_1_filterfulltext ,
                                          String AV136Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV135Tmaqui1wwds_2_tfmaqcod ,
                                          String AV138Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV137Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV140Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV139Tmaqui1wwds_6_tfmaqest ,
                                          String AV142Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV141Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV143Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV144Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV145Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV146Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV147Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV148Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV149Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV150Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV151Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV152Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV153Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV154Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV155Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV156Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV158Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV157Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV160Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV159Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[44];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T2.TipMaqDsc, T1.TipMaqCod, T1.MaqKgsMin, T1.MaqKgsMed, T1.MaqKgsMax, T1.MaqVolRes, T1.MaqVolTop, T1.MaqVolMed, T1.MaqVolMin, T1.MaqTinTip, T1.MaqEst," ;
      sSelectString += " T1.MaqDsc, T1.MaqCod" ;
      sFromString = " FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV134Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
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
      if ( (GXutil.strcmp("", AV136Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV135Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV137Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV139Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV141Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV143Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV144Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV145Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV148Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (0==AV149Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (0==AV150Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV157Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV159Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqDsc" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqEst" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqEst DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqTinTip" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqTinTip DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolMin" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolMin DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolMed" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolMed DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolTop" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolTop DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqVolRes" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqVolRes DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqKgsMax" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqKgsMax DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqKgsMed" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqKgsMed DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqKgsMin" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqKgsMin DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.TipMaqCod" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.TipMaqCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.TipMaqDsc" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.TipMaqDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H008W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV134Tmaqui1wwds_1_filterfulltext ,
                                          String AV136Tmaqui1wwds_3_tfmaqcod_sel ,
                                          String AV135Tmaqui1wwds_2_tfmaqcod ,
                                          String AV138Tmaqui1wwds_5_tfmaqdsc_sel ,
                                          String AV137Tmaqui1wwds_4_tfmaqdsc ,
                                          String AV140Tmaqui1wwds_7_tfmaqest_sel ,
                                          String AV139Tmaqui1wwds_6_tfmaqest ,
                                          String AV142Tmaqui1wwds_9_tfmaqtintip_sel ,
                                          String AV141Tmaqui1wwds_8_tfmaqtintip ,
                                          int AV143Tmaqui1wwds_10_tfmaqvolmin ,
                                          int AV144Tmaqui1wwds_11_tfmaqvolmin_to ,
                                          int AV145Tmaqui1wwds_12_tfmaqvolmed ,
                                          int AV146Tmaqui1wwds_13_tfmaqvolmed_to ,
                                          int AV147Tmaqui1wwds_14_tfmaqvoltop ,
                                          int AV148Tmaqui1wwds_15_tfmaqvoltop_to ,
                                          int AV149Tmaqui1wwds_16_tfmaqvolres ,
                                          int AV150Tmaqui1wwds_17_tfmaqvolres_to ,
                                          java.math.BigDecimal AV151Tmaqui1wwds_18_tfmaqkgsmax ,
                                          java.math.BigDecimal AV152Tmaqui1wwds_19_tfmaqkgsmax_to ,
                                          java.math.BigDecimal AV153Tmaqui1wwds_20_tfmaqkgsmed ,
                                          java.math.BigDecimal AV154Tmaqui1wwds_21_tfmaqkgsmed_to ,
                                          java.math.BigDecimal AV155Tmaqui1wwds_22_tfmaqkgsmin ,
                                          java.math.BigDecimal AV156Tmaqui1wwds_23_tfmaqkgsmin_to ,
                                          String AV158Tmaqui1wwds_25_tftipmaqcod_sel ,
                                          String AV157Tmaqui1wwds_24_tftipmaqcod ,
                                          String AV160Tmaqui1wwds_27_tftipmaqdsc_sel ,
                                          String AV159Tmaqui1wwds_26_tftipmaqdsc ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          String A607MaqEst ,
                                          String A619MaqTinTip ,
                                          int A625MaqVolMin ,
                                          int A624MaqVolMed ,
                                          int A2802MaqVolTop ,
                                          int A2801MaqVolRes ,
                                          java.math.BigDecimal A4285MaqKgsMax ,
                                          java.math.BigDecimal A4284MaqKgsMed ,
                                          java.math.BigDecimal A4283MaqKgsMin ,
                                          String A1011TipMaqCod ,
                                          String A1012TipMaqDsc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[39];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPMAQUIN T1 LEFT JOIN TXPTIPMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.TipMaqCod = T1.TipMaqCod)" ;
      if ( ! (GXutil.strcmp("", AV134Tmaqui1wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqEst) like '%' || UPPER(?)) or ( UPPER(T1.MaqTinTip) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MaqVolMin,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolMed,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolTop,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqVolRes,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMax,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMed,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MaqKgsMin,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.TipMaqCod) like '%' || UPPER(?)) or ( UPPER(T2.TipMaqDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
         GXv_int23[1] = (byte)(1) ;
         GXv_int23[2] = (byte)(1) ;
         GXv_int23[3] = (byte)(1) ;
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tmaqui1wwds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV135Tmaqui1wwds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tmaqui1wwds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Tmaqui1wwds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV137Tmaqui1wwds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Tmaqui1wwds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqDsc = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Tmaqui1wwds_7_tfmaqest_sel)==0) && ( ! (GXutil.strcmp("", AV139Tmaqui1wwds_6_tfmaqest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Tmaqui1wwds_7_tfmaqest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqEst = ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tmaqui1wwds_9_tfmaqtintip_sel)==0) && ( ! (GXutil.strcmp("", AV141Tmaqui1wwds_8_tfmaqtintip)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqTinTip) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tmaqui1wwds_9_tfmaqtintip_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqTinTip = ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV143Tmaqui1wwds_10_tfmaqvolmin) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin >= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (0==AV144Tmaqui1wwds_11_tfmaqvolmin_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMin <= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (0==AV145Tmaqui1wwds_12_tfmaqvolmed) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed >= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (0==AV146Tmaqui1wwds_13_tfmaqvolmed_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolMed <= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (0==AV147Tmaqui1wwds_14_tfmaqvoltop) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (0==AV148Tmaqui1wwds_15_tfmaqvoltop_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolTop <= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV149Tmaqui1wwds_16_tfmaqvolres) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV150Tmaqui1wwds_17_tfmaqvolres_to) )
      {
         addWhere(sWhereString, "(T1.MaqVolRes <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV151Tmaqui1wwds_18_tfmaqkgsmax)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Tmaqui1wwds_19_tfmaqkgsmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMax <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Tmaqui1wwds_20_tfmaqkgsmed)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Tmaqui1wwds_21_tfmaqkgsmed_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMed <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Tmaqui1wwds_22_tfmaqkgsmin)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin >= ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Tmaqui1wwds_23_tfmaqkgsmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MaqKgsMin <= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Tmaqui1wwds_25_tftipmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV157Tmaqui1wwds_24_tftipmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.TipMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Tmaqui1wwds_25_tftipmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.TipMaqCod = ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Tmaqui1wwds_27_tftipmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV159Tmaqui1wwds_26_tftipmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipMaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Tmaqui1wwds_27_tftipmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipMaqDsc = ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
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
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H008W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
            case 1 :
                  return conditional_H008W3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Boolean) dynConstraints[41]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H008W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H008W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
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
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
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
                  stmt.setString(sIdx, (String)parms[56], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 2);
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

