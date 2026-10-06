package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprepedww_impl extends GXDataArea
{
   public tprepedww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprepedww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprepedww_impl.class ));
   }

   public tprepedww_impl( int remoteHandle ,
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
      AV38ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33ColumnsSelector);
      AV73FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV40TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV41TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV43TFPrePrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrePrvNum"))) ;
      AV44TFPrePrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrePrvNum_To"))) ;
      AV74TFPrePrvDsc = httpContext.GetPar( "TFPrePrvDsc") ;
      AV75TFPrePrvDsc_Sel = httpContext.GetPar( "TFPrePrvDsc_Sel") ;
      AV46TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV47TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV49TFPedCod = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod"))) ;
      AV50TFPedCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPedCod_To"))) ;
      AV52TFPrePedUni = CommonUtil.decimalVal( httpContext.GetPar( "TFPrePedUni"), ".") ;
      AV53TFPrePedUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrePedUni_To"), ".") ;
      AV55TFPrePedCon = httpContext.GetPar( "TFPrePedCon") ;
      AV56TFPrePedCon_Sel = httpContext.GetPar( "TFPrePedCon_Sel") ;
      AV58TFPrePedPre = CommonUtil.decimalVal( httpContext.GetPar( "TFPrePedPre"), ".") ;
      AV59TFPrePedPre_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrePedPre_To"), ".") ;
      AV61TFPrePedDto = CommonUtil.decimalVal( httpContext.GetPar( "TFPrePedDto"), ".") ;
      AV62TFPrePedDto_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrePedDto_To"), ".") ;
      AV64TFPrePedPri = httpContext.GetPar( "TFPrePedPri") ;
      AV65TFPrePedPri_Sel = httpContext.GetPar( "TFPrePedPri_Sel") ;
      AV76TFPrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct"), ".") ;
      AV77TFPrdPreAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct_To"), ".") ;
      AV78TFTipDtoDto = CommonUtil.decimalVal( httpContext.GetPar( "TFTipDtoDto"), ".") ;
      AV79TFTipDtoDto_To = CommonUtil.decimalVal( httpContext.GetPar( "TFTipDtoDto_To"), ".") ;
      AV112Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV73FilterFullText, AV40TFEmprCod, AV41TFEmprCod_Sel, AV43TFPrePrvNum, AV44TFPrePrvNum_To, AV74TFPrePrvDsc, AV75TFPrePrvDsc_Sel, AV46TFPrdNum, AV47TFPrdNum_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFPrePedUni, AV53TFPrePedUni_To, AV55TFPrePedCon, AV56TFPrePedCon_Sel, AV58TFPrePedPre, AV59TFPrePedPre_To, AV61TFPrePedDto, AV62TFPrePedDto_To, AV64TFPrePedPri, AV65TFPrePedPri_Sel, AV76TFPrdPreAct, AV77TFPrdPreAct_To, AV78TFTipDtoDto, AV79TFTipDtoDto_To, AV112Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      pa1002( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1002( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprepedww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV112Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_45, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV36ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV69GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV70GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV67DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV38ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD", GXutil.rtrim( AV40TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFEMPRCOD_SEL", GXutil.rtrim( AV41TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPRVNUM", GXutil.ltrim( localUtil.ntoc( AV43TFPrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV44TFPrePrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPRVDSC", GXutil.rtrim( AV74TFPrePrvDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPRVDSC_SEL", GXutil.rtrim( AV75TFPrePrvDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV46TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV47TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDCOD", GXutil.ltrim( localUtil.ntoc( AV49TFPedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPEDCOD_TO", GXutil.ltrim( localUtil.ntoc( AV50TFPedCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDUNI", GXutil.ltrim( localUtil.ntoc( AV52TFPrePedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDUNI_TO", GXutil.ltrim( localUtil.ntoc( AV53TFPrePedUni_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDCON", GXutil.rtrim( AV55TFPrePedCon));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDCON_SEL", GXutil.rtrim( AV56TFPrePedCon_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDPRE", GXutil.ltrim( localUtil.ntoc( AV58TFPrePedPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDPRE_TO", GXutil.ltrim( localUtil.ntoc( AV59TFPrePedPre_To, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDDTO", GXutil.ltrim( localUtil.ntoc( AV61TFPrePedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDDTO_TO", GXutil.ltrim( localUtil.ntoc( AV62TFPrePedDto_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDPRI", GXutil.rtrim( AV64TFPrePedPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPREPEDPRI_SEL", GXutil.rtrim( AV65TFPrePedPri_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV76TFPrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDPREACT_TO", GXutil.ltrim( localUtil.ntoc( AV77TFPrdPreAct_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPDTODTO", GXutil.ltrim( localUtil.ntoc( AV78TFTipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPDTODTO_TO", GXutil.ltrim( localUtil.ntoc( AV79TFTipDtoDto_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV112Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV112Pgmname, ""))));
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
         we1002( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1002( ) ;
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
      return formatLink("app.tprepedww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPREPEDWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Realizacion Pedidos", "") ;
   }

   public void wb1000( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPREPEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1002( true) ;
      }
      else
      {
         wb_table1_27_1002( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1002e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV69GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV70GridPageCount);
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV67DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV67DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV33ColumnsSelector);
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

   public void start1002( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Realizacion Pedidos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1000( ) ;
   }

   public void ws1002( )
   {
      start1002( ) ;
      evt1002( ) ;
   }

   public void evt1002( )
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
                           e111002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e161002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e171002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e181002 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e191002 ();
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
                           AV80GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A756PrePrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrePrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13791PrePrvDsc = httpContext.cgiGet( edtPrePrvDsc_Internalname) ;
                           n13791PrePrvDsc = false ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A658PedCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPedCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n658PedCod = false ;
                           A755PrePedUni = localUtil.ctond( httpContext.cgiGet( edtPrePedUni_Internalname)) ;
                           n755PrePedUni = false ;
                           A751PrePedCon = GXutil.upper( httpContext.cgiGet( edtPrePedCon_Internalname)) ;
                           n751PrePedCon = false ;
                           A753PrePedPre = localUtil.ctond( httpContext.cgiGet( edtPrePedPre_Internalname)) ;
                           n753PrePedPre = false ;
                           A752PrePedDto = localUtil.ctond( httpContext.cgiGet( edtPrePedDto_Internalname)) ;
                           n752PrePedDto = false ;
                           A754PrePedPri = httpContext.cgiGet( edtPrePedPri_Internalname) ;
                           n754PrePedPri = false ;
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           A837TipDtoDto = localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)) ;
                           n837TipDtoDto = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e201002 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e211002 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221002 ();
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

   public void we1002( )
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

   public void pa1002( )
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
                                 byte AV38ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ,
                                 String AV73FilterFullText ,
                                 String AV40TFEmprCod ,
                                 String AV41TFEmprCod_Sel ,
                                 int AV43TFPrePrvNum ,
                                 int AV44TFPrePrvNum_To ,
                                 String AV74TFPrePrvDsc ,
                                 String AV75TFPrePrvDsc_Sel ,
                                 String AV46TFPrdNum ,
                                 String AV47TFPrdNum_Sel ,
                                 int AV49TFPedCod ,
                                 int AV50TFPedCod_To ,
                                 java.math.BigDecimal AV52TFPrePedUni ,
                                 java.math.BigDecimal AV53TFPrePedUni_To ,
                                 String AV55TFPrePedCon ,
                                 String AV56TFPrePedCon_Sel ,
                                 java.math.BigDecimal AV58TFPrePedPre ,
                                 java.math.BigDecimal AV59TFPrePedPre_To ,
                                 java.math.BigDecimal AV61TFPrePedDto ,
                                 java.math.BigDecimal AV62TFPrePedDto_To ,
                                 String AV64TFPrePedPri ,
                                 String AV65TFPrePedPri_Sel ,
                                 java.math.BigDecimal AV76TFPrdPreAct ,
                                 java.math.BigDecimal AV77TFPrdPreAct_To ,
                                 java.math.BigDecimal AV78TFTipDtoDto ,
                                 java.math.BigDecimal AV79TFTipDtoDto_To ,
                                 String AV112Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e211002 ();
      GRID_nCurrentRecord = 0 ;
      rf1002( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PREPRVNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PREPRVNUM", GXutil.ltrim( localUtil.ntoc( A756PrePrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
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
      rf1002( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV112Pgmname = "TPREPEDWW" ;
      Gx_err = (short)(0) ;
   }

   public void rf1002( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e211002 ();
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
                                              AV89Tprepedwwds_3_tfemprcod_sel ,
                                              AV88Tprepedwwds_2_tfemprcod ,
                                              Integer.valueOf(AV90Tprepedwwds_4_tfpreprvnum) ,
                                              Integer.valueOf(AV91Tprepedwwds_5_tfpreprvnum_to) ,
                                              AV95Tprepedwwds_9_tfprdnum_sel ,
                                              AV94Tprepedwwds_8_tfprdnum ,
                                              Integer.valueOf(AV96Tprepedwwds_10_tfpedcod) ,
                                              Integer.valueOf(AV97Tprepedwwds_11_tfpedcod_to) ,
                                              AV98Tprepedwwds_12_tfprepeduni ,
                                              AV99Tprepedwwds_13_tfprepeduni_to ,
                                              AV101Tprepedwwds_15_tfprepedcon_sel ,
                                              AV100Tprepedwwds_14_tfprepedcon ,
                                              AV102Tprepedwwds_16_tfprepedpre ,
                                              AV103Tprepedwwds_17_tfprepedpre_to ,
                                              AV104Tprepedwwds_18_tfprepeddto ,
                                              AV105Tprepedwwds_19_tfprepeddto_to ,
                                              AV107Tprepedwwds_21_tfprepedpri_sel ,
                                              AV106Tprepedwwds_20_tfprepedpri ,
                                              AV108Tprepedwwds_22_tfprdpreact ,
                                              AV109Tprepedwwds_23_tfprdpreact_to ,
                                              AV110Tprepedwwds_24_tftipdtodto ,
                                              AV111Tprepedwwds_25_tftipdtodto_to ,
                                              A396EmprCod ,
                                              Integer.valueOf(A756PrePrvNum) ,
                                              A719PrdNum ,
                                              Integer.valueOf(A658PedCod) ,
                                              A755PrePedUni ,
                                              A751PrePedCon ,
                                              A753PrePedPre ,
                                              A752PrePedDto ,
                                              A754PrePedPri ,
                                              A724PrdPreAct ,
                                              A837TipDtoDto ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV87Tprepedwwds_1_filterfulltext ,
                                              A13791PrePrvDsc ,
                                              AV93Tprepedwwds_7_tfpreprvdsc_sel ,
                                              AV92Tprepedwwds_6_tfpreprvdsc } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
         lV92Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV92Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
         lV88Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV88Tprepedwwds_2_tfemprcod), 3, "%") ;
         lV94Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV94Tprepedwwds_8_tfprdnum), 6, "%") ;
         lV100Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV100Tprepedwwds_14_tfprepedcon), 1, "%") ;
         lV106Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV106Tprepedwwds_20_tfprepedpri), 1, "%") ;
         /* Using cursor H01002 */
         pr_default.execute(0, new Object[] {AV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, AV93Tprepedwwds_7_tfpreprvdsc_sel, AV92Tprepedwwds_6_tfpreprvdsc, lV92Tprepedwwds_6_tfpreprvdsc, AV93Tprepedwwds_7_tfpreprvdsc_sel, AV93Tprepedwwds_7_tfpreprvdsc_sel, lV88Tprepedwwds_2_tfemprcod, AV89Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV90Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV91Tprepedwwds_5_tfpreprvnum_to), lV94Tprepedwwds_8_tfprdnum, AV95Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV96Tprepedwwds_10_tfpedcod), Integer.valueOf(AV97Tprepedwwds_11_tfpedcod_to), AV98Tprepedwwds_12_tfprepeduni, AV99Tprepedwwds_13_tfprepeduni_to, lV100Tprepedwwds_14_tfprepedcon, AV101Tprepedwwds_15_tfprepedcon_sel, AV102Tprepedwwds_16_tfprepedpre, AV103Tprepedwwds_17_tfprepedpre_to, AV104Tprepedwwds_18_tfprepeddto, AV105Tprepedwwds_19_tfprepeddto_to, lV106Tprepedwwds_20_tfprepedpri, AV107Tprepedwwds_21_tfprepedpri_sel, AV108Tprepedwwds_22_tfprdpreact, AV109Tprepedwwds_23_tfprdpreact_to, AV110Tprepedwwds_24_tftipdtodto, AV111Tprepedwwds_25_tftipdtodto_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A835TipDtoCod = H01002_A835TipDtoCod[0] ;
            n835TipDtoCod = H01002_n835TipDtoCod[0] ;
            A837TipDtoDto = H01002_A837TipDtoDto[0] ;
            n837TipDtoDto = H01002_n837TipDtoDto[0] ;
            A724PrdPreAct = H01002_A724PrdPreAct[0] ;
            A754PrePedPri = H01002_A754PrePedPri[0] ;
            n754PrePedPri = H01002_n754PrePedPri[0] ;
            A752PrePedDto = H01002_A752PrePedDto[0] ;
            n752PrePedDto = H01002_n752PrePedDto[0] ;
            A753PrePedPre = H01002_A753PrePedPre[0] ;
            n753PrePedPre = H01002_n753PrePedPre[0] ;
            A751PrePedCon = H01002_A751PrePedCon[0] ;
            n751PrePedCon = H01002_n751PrePedCon[0] ;
            A755PrePedUni = H01002_A755PrePedUni[0] ;
            n755PrePedUni = H01002_n755PrePedUni[0] ;
            A658PedCod = H01002_A658PedCod[0] ;
            n658PedCod = H01002_n658PedCod[0] ;
            A719PrdNum = H01002_A719PrdNum[0] ;
            A756PrePrvNum = H01002_A756PrePrvNum[0] ;
            A396EmprCod = H01002_A396EmprCod[0] ;
            A13791PrePrvDsc = H01002_A13791PrePrvDsc[0] ;
            n13791PrePrvDsc = H01002_n13791PrePrvDsc[0] ;
            A835TipDtoCod = H01002_A835TipDtoCod[0] ;
            n835TipDtoCod = H01002_n835TipDtoCod[0] ;
            A724PrdPreAct = H01002_A724PrdPreAct[0] ;
            A837TipDtoDto = H01002_A837TipDtoDto[0] ;
            n837TipDtoDto = H01002_n837TipDtoDto[0] ;
            A13791PrePrvDsc = H01002_A13791PrePrvDsc[0] ;
            n13791PrePrvDsc = H01002_n13791PrePrvDsc[0] ;
            e221002 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wb1000( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1002( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV112Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV112Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PREPRVNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
      AV87Tprepedwwds_1_filterfulltext = AV73FilterFullText ;
      AV88Tprepedwwds_2_tfemprcod = AV40TFEmprCod ;
      AV89Tprepedwwds_3_tfemprcod_sel = AV41TFEmprCod_Sel ;
      AV90Tprepedwwds_4_tfpreprvnum = AV43TFPrePrvNum ;
      AV91Tprepedwwds_5_tfpreprvnum_to = AV44TFPrePrvNum_To ;
      AV92Tprepedwwds_6_tfpreprvdsc = AV74TFPrePrvDsc ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = AV75TFPrePrvDsc_Sel ;
      AV94Tprepedwwds_8_tfprdnum = AV46TFPrdNum ;
      AV95Tprepedwwds_9_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV96Tprepedwwds_10_tfpedcod = AV49TFPedCod ;
      AV97Tprepedwwds_11_tfpedcod_to = AV50TFPedCod_To ;
      AV98Tprepedwwds_12_tfprepeduni = AV52TFPrePedUni ;
      AV99Tprepedwwds_13_tfprepeduni_to = AV53TFPrePedUni_To ;
      AV100Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV101Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV102Tprepedwwds_16_tfprepedpre = AV58TFPrePedPre ;
      AV103Tprepedwwds_17_tfprepedpre_to = AV59TFPrePedPre_To ;
      AV104Tprepedwwds_18_tfprepeddto = AV61TFPrePedDto ;
      AV105Tprepedwwds_19_tfprepeddto_to = AV62TFPrePedDto_To ;
      AV106Tprepedwwds_20_tfprepedpri = AV64TFPrePedPri ;
      AV107Tprepedwwds_21_tfprepedpri_sel = AV65TFPrePedPri_Sel ;
      AV108Tprepedwwds_22_tfprdpreact = AV76TFPrdPreAct ;
      AV109Tprepedwwds_23_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV110Tprepedwwds_24_tftipdtodto = AV78TFTipDtoDto ;
      AV111Tprepedwwds_25_tftipdtodto_to = AV79TFTipDtoDto_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV89Tprepedwwds_3_tfemprcod_sel ,
                                           AV88Tprepedwwds_2_tfemprcod ,
                                           Integer.valueOf(AV90Tprepedwwds_4_tfpreprvnum) ,
                                           Integer.valueOf(AV91Tprepedwwds_5_tfpreprvnum_to) ,
                                           AV95Tprepedwwds_9_tfprdnum_sel ,
                                           AV94Tprepedwwds_8_tfprdnum ,
                                           Integer.valueOf(AV96Tprepedwwds_10_tfpedcod) ,
                                           Integer.valueOf(AV97Tprepedwwds_11_tfpedcod_to) ,
                                           AV98Tprepedwwds_12_tfprepeduni ,
                                           AV99Tprepedwwds_13_tfprepeduni_to ,
                                           AV101Tprepedwwds_15_tfprepedcon_sel ,
                                           AV100Tprepedwwds_14_tfprepedcon ,
                                           AV102Tprepedwwds_16_tfprepedpre ,
                                           AV103Tprepedwwds_17_tfprepedpre_to ,
                                           AV104Tprepedwwds_18_tfprepeddto ,
                                           AV105Tprepedwwds_19_tfprepeddto_to ,
                                           AV107Tprepedwwds_21_tfprepedpri_sel ,
                                           AV106Tprepedwwds_20_tfprepedpri ,
                                           AV108Tprepedwwds_22_tfprdpreact ,
                                           AV109Tprepedwwds_23_tfprdpreact_to ,
                                           AV110Tprepedwwds_24_tftipdtodto ,
                                           AV111Tprepedwwds_25_tftipdtodto_to ,
                                           A396EmprCod ,
                                           Integer.valueOf(A756PrePrvNum) ,
                                           A719PrdNum ,
                                           Integer.valueOf(A658PedCod) ,
                                           A755PrePedUni ,
                                           A751PrePedCon ,
                                           A753PrePedPre ,
                                           A752PrePedDto ,
                                           A754PrePedPri ,
                                           A724PrdPreAct ,
                                           A837TipDtoDto ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV87Tprepedwwds_1_filterfulltext ,
                                           A13791PrePrvDsc ,
                                           AV93Tprepedwwds_7_tfpreprvdsc_sel ,
                                           AV92Tprepedwwds_6_tfpreprvdsc } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV87Tprepedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV87Tprepedwwds_1_filterfulltext), "%", "") ;
      lV92Tprepedwwds_6_tfpreprvdsc = GXutil.padr( GXutil.rtrim( AV92Tprepedwwds_6_tfpreprvdsc), 30, "%") ;
      lV88Tprepedwwds_2_tfemprcod = GXutil.padr( GXutil.rtrim( AV88Tprepedwwds_2_tfemprcod), 3, "%") ;
      lV94Tprepedwwds_8_tfprdnum = GXutil.padr( GXutil.rtrim( AV94Tprepedwwds_8_tfprdnum), 6, "%") ;
      lV100Tprepedwwds_14_tfprepedcon = GXutil.padr( GXutil.rtrim( AV100Tprepedwwds_14_tfprepedcon), 1, "%") ;
      lV106Tprepedwwds_20_tfprepedpri = GXutil.padr( GXutil.rtrim( AV106Tprepedwwds_20_tfprepedpri), 1, "%") ;
      /* Using cursor H01003 */
      pr_default.execute(1, new Object[] {AV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, lV87Tprepedwwds_1_filterfulltext, AV93Tprepedwwds_7_tfpreprvdsc_sel, AV92Tprepedwwds_6_tfpreprvdsc, lV92Tprepedwwds_6_tfpreprvdsc, AV93Tprepedwwds_7_tfpreprvdsc_sel, AV93Tprepedwwds_7_tfpreprvdsc_sel, lV88Tprepedwwds_2_tfemprcod, AV89Tprepedwwds_3_tfemprcod_sel, Integer.valueOf(AV90Tprepedwwds_4_tfpreprvnum), Integer.valueOf(AV91Tprepedwwds_5_tfpreprvnum_to), lV94Tprepedwwds_8_tfprdnum, AV95Tprepedwwds_9_tfprdnum_sel, Integer.valueOf(AV96Tprepedwwds_10_tfpedcod), Integer.valueOf(AV97Tprepedwwds_11_tfpedcod_to), AV98Tprepedwwds_12_tfprepeduni, AV99Tprepedwwds_13_tfprepeduni_to, lV100Tprepedwwds_14_tfprepedcon, AV101Tprepedwwds_15_tfprepedcon_sel, AV102Tprepedwwds_16_tfprepedpre, AV103Tprepedwwds_17_tfprepedpre_to, AV104Tprepedwwds_18_tfprepeddto, AV105Tprepedwwds_19_tfprepeddto_to, lV106Tprepedwwds_20_tfprepedpri, AV107Tprepedwwds_21_tfprepedpri_sel, AV108Tprepedwwds_22_tfprdpreact, AV109Tprepedwwds_23_tfprdpreact_to, AV110Tprepedwwds_24_tftipdtodto, AV111Tprepedwwds_25_tftipdtodto_to});
      GRID_nRecordCount = H01003_AGRID_nRecordCount[0] ;
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
      AV87Tprepedwwds_1_filterfulltext = AV73FilterFullText ;
      AV88Tprepedwwds_2_tfemprcod = AV40TFEmprCod ;
      AV89Tprepedwwds_3_tfemprcod_sel = AV41TFEmprCod_Sel ;
      AV90Tprepedwwds_4_tfpreprvnum = AV43TFPrePrvNum ;
      AV91Tprepedwwds_5_tfpreprvnum_to = AV44TFPrePrvNum_To ;
      AV92Tprepedwwds_6_tfpreprvdsc = AV74TFPrePrvDsc ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = AV75TFPrePrvDsc_Sel ;
      AV94Tprepedwwds_8_tfprdnum = AV46TFPrdNum ;
      AV95Tprepedwwds_9_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV96Tprepedwwds_10_tfpedcod = AV49TFPedCod ;
      AV97Tprepedwwds_11_tfpedcod_to = AV50TFPedCod_To ;
      AV98Tprepedwwds_12_tfprepeduni = AV52TFPrePedUni ;
      AV99Tprepedwwds_13_tfprepeduni_to = AV53TFPrePedUni_To ;
      AV100Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV101Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV102Tprepedwwds_16_tfprepedpre = AV58TFPrePedPre ;
      AV103Tprepedwwds_17_tfprepedpre_to = AV59TFPrePedPre_To ;
      AV104Tprepedwwds_18_tfprepeddto = AV61TFPrePedDto ;
      AV105Tprepedwwds_19_tfprepeddto_to = AV62TFPrePedDto_To ;
      AV106Tprepedwwds_20_tfprepedpri = AV64TFPrePedPri ;
      AV107Tprepedwwds_21_tfprepedpri_sel = AV65TFPrePedPri_Sel ;
      AV108Tprepedwwds_22_tfprdpreact = AV76TFPrdPreAct ;
      AV109Tprepedwwds_23_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV110Tprepedwwds_24_tftipdtodto = AV78TFTipDtoDto ;
      AV111Tprepedwwds_25_tftipdtodto_to = AV79TFTipDtoDto_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV73FilterFullText, AV40TFEmprCod, AV41TFEmprCod_Sel, AV43TFPrePrvNum, AV44TFPrePrvNum_To, AV74TFPrePrvDsc, AV75TFPrePrvDsc_Sel, AV46TFPrdNum, AV47TFPrdNum_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFPrePedUni, AV53TFPrePedUni_To, AV55TFPrePedCon, AV56TFPrePedCon_Sel, AV58TFPrePedPre, AV59TFPrePedPre_To, AV61TFPrePedDto, AV62TFPrePedDto_To, AV64TFPrePedPri, AV65TFPrePedPri_Sel, AV76TFPrdPreAct, AV77TFPrdPreAct_To, AV78TFTipDtoDto, AV79TFTipDtoDto_To, AV112Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV87Tprepedwwds_1_filterfulltext = AV73FilterFullText ;
      AV88Tprepedwwds_2_tfemprcod = AV40TFEmprCod ;
      AV89Tprepedwwds_3_tfemprcod_sel = AV41TFEmprCod_Sel ;
      AV90Tprepedwwds_4_tfpreprvnum = AV43TFPrePrvNum ;
      AV91Tprepedwwds_5_tfpreprvnum_to = AV44TFPrePrvNum_To ;
      AV92Tprepedwwds_6_tfpreprvdsc = AV74TFPrePrvDsc ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = AV75TFPrePrvDsc_Sel ;
      AV94Tprepedwwds_8_tfprdnum = AV46TFPrdNum ;
      AV95Tprepedwwds_9_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV96Tprepedwwds_10_tfpedcod = AV49TFPedCod ;
      AV97Tprepedwwds_11_tfpedcod_to = AV50TFPedCod_To ;
      AV98Tprepedwwds_12_tfprepeduni = AV52TFPrePedUni ;
      AV99Tprepedwwds_13_tfprepeduni_to = AV53TFPrePedUni_To ;
      AV100Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV101Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV102Tprepedwwds_16_tfprepedpre = AV58TFPrePedPre ;
      AV103Tprepedwwds_17_tfprepedpre_to = AV59TFPrePedPre_To ;
      AV104Tprepedwwds_18_tfprepeddto = AV61TFPrePedDto ;
      AV105Tprepedwwds_19_tfprepeddto_to = AV62TFPrePedDto_To ;
      AV106Tprepedwwds_20_tfprepedpri = AV64TFPrePedPri ;
      AV107Tprepedwwds_21_tfprepedpri_sel = AV65TFPrePedPri_Sel ;
      AV108Tprepedwwds_22_tfprdpreact = AV76TFPrdPreAct ;
      AV109Tprepedwwds_23_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV110Tprepedwwds_24_tftipdtodto = AV78TFTipDtoDto ;
      AV111Tprepedwwds_25_tftipdtodto_to = AV79TFTipDtoDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV73FilterFullText, AV40TFEmprCod, AV41TFEmprCod_Sel, AV43TFPrePrvNum, AV44TFPrePrvNum_To, AV74TFPrePrvDsc, AV75TFPrePrvDsc_Sel, AV46TFPrdNum, AV47TFPrdNum_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFPrePedUni, AV53TFPrePedUni_To, AV55TFPrePedCon, AV56TFPrePedCon_Sel, AV58TFPrePedPre, AV59TFPrePedPre_To, AV61TFPrePedDto, AV62TFPrePedDto_To, AV64TFPrePedPri, AV65TFPrePedPri_Sel, AV76TFPrdPreAct, AV77TFPrdPreAct_To, AV78TFTipDtoDto, AV79TFTipDtoDto_To, AV112Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV87Tprepedwwds_1_filterfulltext = AV73FilterFullText ;
      AV88Tprepedwwds_2_tfemprcod = AV40TFEmprCod ;
      AV89Tprepedwwds_3_tfemprcod_sel = AV41TFEmprCod_Sel ;
      AV90Tprepedwwds_4_tfpreprvnum = AV43TFPrePrvNum ;
      AV91Tprepedwwds_5_tfpreprvnum_to = AV44TFPrePrvNum_To ;
      AV92Tprepedwwds_6_tfpreprvdsc = AV74TFPrePrvDsc ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = AV75TFPrePrvDsc_Sel ;
      AV94Tprepedwwds_8_tfprdnum = AV46TFPrdNum ;
      AV95Tprepedwwds_9_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV96Tprepedwwds_10_tfpedcod = AV49TFPedCod ;
      AV97Tprepedwwds_11_tfpedcod_to = AV50TFPedCod_To ;
      AV98Tprepedwwds_12_tfprepeduni = AV52TFPrePedUni ;
      AV99Tprepedwwds_13_tfprepeduni_to = AV53TFPrePedUni_To ;
      AV100Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV101Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV102Tprepedwwds_16_tfprepedpre = AV58TFPrePedPre ;
      AV103Tprepedwwds_17_tfprepedpre_to = AV59TFPrePedPre_To ;
      AV104Tprepedwwds_18_tfprepeddto = AV61TFPrePedDto ;
      AV105Tprepedwwds_19_tfprepeddto_to = AV62TFPrePedDto_To ;
      AV106Tprepedwwds_20_tfprepedpri = AV64TFPrePedPri ;
      AV107Tprepedwwds_21_tfprepedpri_sel = AV65TFPrePedPri_Sel ;
      AV108Tprepedwwds_22_tfprdpreact = AV76TFPrdPreAct ;
      AV109Tprepedwwds_23_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV110Tprepedwwds_24_tftipdtodto = AV78TFTipDtoDto ;
      AV111Tprepedwwds_25_tftipdtodto_to = AV79TFTipDtoDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV73FilterFullText, AV40TFEmprCod, AV41TFEmprCod_Sel, AV43TFPrePrvNum, AV44TFPrePrvNum_To, AV74TFPrePrvDsc, AV75TFPrePrvDsc_Sel, AV46TFPrdNum, AV47TFPrdNum_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFPrePedUni, AV53TFPrePedUni_To, AV55TFPrePedCon, AV56TFPrePedCon_Sel, AV58TFPrePedPre, AV59TFPrePedPre_To, AV61TFPrePedDto, AV62TFPrePedDto_To, AV64TFPrePedPri, AV65TFPrePedPri_Sel, AV76TFPrdPreAct, AV77TFPrdPreAct_To, AV78TFTipDtoDto, AV79TFTipDtoDto_To, AV112Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV87Tprepedwwds_1_filterfulltext = AV73FilterFullText ;
      AV88Tprepedwwds_2_tfemprcod = AV40TFEmprCod ;
      AV89Tprepedwwds_3_tfemprcod_sel = AV41TFEmprCod_Sel ;
      AV90Tprepedwwds_4_tfpreprvnum = AV43TFPrePrvNum ;
      AV91Tprepedwwds_5_tfpreprvnum_to = AV44TFPrePrvNum_To ;
      AV92Tprepedwwds_6_tfpreprvdsc = AV74TFPrePrvDsc ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = AV75TFPrePrvDsc_Sel ;
      AV94Tprepedwwds_8_tfprdnum = AV46TFPrdNum ;
      AV95Tprepedwwds_9_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV96Tprepedwwds_10_tfpedcod = AV49TFPedCod ;
      AV97Tprepedwwds_11_tfpedcod_to = AV50TFPedCod_To ;
      AV98Tprepedwwds_12_tfprepeduni = AV52TFPrePedUni ;
      AV99Tprepedwwds_13_tfprepeduni_to = AV53TFPrePedUni_To ;
      AV100Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV101Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV102Tprepedwwds_16_tfprepedpre = AV58TFPrePedPre ;
      AV103Tprepedwwds_17_tfprepedpre_to = AV59TFPrePedPre_To ;
      AV104Tprepedwwds_18_tfprepeddto = AV61TFPrePedDto ;
      AV105Tprepedwwds_19_tfprepeddto_to = AV62TFPrePedDto_To ;
      AV106Tprepedwwds_20_tfprepedpri = AV64TFPrePedPri ;
      AV107Tprepedwwds_21_tfprepedpri_sel = AV65TFPrePedPri_Sel ;
      AV108Tprepedwwds_22_tfprdpreact = AV76TFPrdPreAct ;
      AV109Tprepedwwds_23_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV110Tprepedwwds_24_tftipdtodto = AV78TFTipDtoDto ;
      AV111Tprepedwwds_25_tftipdtodto_to = AV79TFTipDtoDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV73FilterFullText, AV40TFEmprCod, AV41TFEmprCod_Sel, AV43TFPrePrvNum, AV44TFPrePrvNum_To, AV74TFPrePrvDsc, AV75TFPrePrvDsc_Sel, AV46TFPrdNum, AV47TFPrdNum_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFPrePedUni, AV53TFPrePedUni_To, AV55TFPrePedCon, AV56TFPrePedCon_Sel, AV58TFPrePedPre, AV59TFPrePedPre_To, AV61TFPrePedDto, AV62TFPrePedDto_To, AV64TFPrePedPri, AV65TFPrePedPri_Sel, AV76TFPrdPreAct, AV77TFPrdPreAct_To, AV78TFTipDtoDto, AV79TFTipDtoDto_To, AV112Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV87Tprepedwwds_1_filterfulltext = AV73FilterFullText ;
      AV88Tprepedwwds_2_tfemprcod = AV40TFEmprCod ;
      AV89Tprepedwwds_3_tfemprcod_sel = AV41TFEmprCod_Sel ;
      AV90Tprepedwwds_4_tfpreprvnum = AV43TFPrePrvNum ;
      AV91Tprepedwwds_5_tfpreprvnum_to = AV44TFPrePrvNum_To ;
      AV92Tprepedwwds_6_tfpreprvdsc = AV74TFPrePrvDsc ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = AV75TFPrePrvDsc_Sel ;
      AV94Tprepedwwds_8_tfprdnum = AV46TFPrdNum ;
      AV95Tprepedwwds_9_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV96Tprepedwwds_10_tfpedcod = AV49TFPedCod ;
      AV97Tprepedwwds_11_tfpedcod_to = AV50TFPedCod_To ;
      AV98Tprepedwwds_12_tfprepeduni = AV52TFPrePedUni ;
      AV99Tprepedwwds_13_tfprepeduni_to = AV53TFPrePedUni_To ;
      AV100Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV101Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV102Tprepedwwds_16_tfprepedpre = AV58TFPrePedPre ;
      AV103Tprepedwwds_17_tfprepedpre_to = AV59TFPrePedPre_To ;
      AV104Tprepedwwds_18_tfprepeddto = AV61TFPrePedDto ;
      AV105Tprepedwwds_19_tfprepeddto_to = AV62TFPrePedDto_To ;
      AV106Tprepedwwds_20_tfprepedpri = AV64TFPrePedPri ;
      AV107Tprepedwwds_21_tfprepedpri_sel = AV65TFPrePedPri_Sel ;
      AV108Tprepedwwds_22_tfprdpreact = AV76TFPrdPreAct ;
      AV109Tprepedwwds_23_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV110Tprepedwwds_24_tftipdtodto = AV78TFTipDtoDto ;
      AV111Tprepedwwds_25_tftipdtodto_to = AV79TFTipDtoDto_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV38ManageFiltersExecutionStep, AV33ColumnsSelector, AV73FilterFullText, AV40TFEmprCod, AV41TFEmprCod_Sel, AV43TFPrePrvNum, AV44TFPrePrvNum_To, AV74TFPrePrvDsc, AV75TFPrePrvDsc_Sel, AV46TFPrdNum, AV47TFPrdNum_Sel, AV49TFPedCod, AV50TFPedCod_To, AV52TFPrePedUni, AV53TFPrePedUni_To, AV55TFPrePedCon, AV56TFPrePedCon_Sel, AV58TFPrePedPre, AV59TFPrePedPre_To, AV61TFPrePedDto, AV62TFPrePedDto_To, AV64TFPrePedPri, AV65TFPrePedPri_Sel, AV76TFPrdPreAct, AV77TFPrdPreAct_To, AV78TFTipDtoDto, AV79TFTipDtoDto_To, AV112Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV112Pgmname = "TPREPEDWW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1000( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e201002 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV36ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV67DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV33ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV69GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV70GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV73FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73FilterFullText", AV73FilterFullText);
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
      e201002 ();
      if (returnInSub) return;
   }

   public void e201002( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV83Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tprepedww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV83Station = GXt_char1 ;
      GXv_char2[0] = AV84Emprcod ;
      GXv_char3[0] = AV85Emprnom ;
      GXv_char4[0] = AV86Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprepedww_impl.this.AV84Emprcod = GXv_char2[0] ;
      tprepedww_impl.this.AV85Emprnom = GXv_char3[0] ;
      tprepedww_impl.this.AV86Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Realizacion Pedidos", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV67DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV67DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e211002( )
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
      if ( AV38ManageFiltersExecutionStep == 1 )
      {
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV38ManageFiltersExecutionStep == 2 )
      {
         AV38ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV35Session.getValue("TPREPEDWWColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV35Session.getValue("TPREPEDWWColumnsSelector") ;
         AV33ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrePrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePrvNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrePrvDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePrvDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePrvDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPedCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPedCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPedCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrePedUni_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedUni_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedUni_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrePedCon_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedCon_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrePedPre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedPre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedPre_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrePedDto_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedDto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedDto_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrePedPri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrePedPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrePedPri_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipDtoDto_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoDto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoDto_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV69GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69GridCurrentPage), 10, 0));
      AV70GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70GridPageCount), 10, 0));
      AV87Tprepedwwds_1_filterfulltext = AV73FilterFullText ;
      AV88Tprepedwwds_2_tfemprcod = AV40TFEmprCod ;
      AV89Tprepedwwds_3_tfemprcod_sel = AV41TFEmprCod_Sel ;
      AV90Tprepedwwds_4_tfpreprvnum = AV43TFPrePrvNum ;
      AV91Tprepedwwds_5_tfpreprvnum_to = AV44TFPrePrvNum_To ;
      AV92Tprepedwwds_6_tfpreprvdsc = AV74TFPrePrvDsc ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = AV75TFPrePrvDsc_Sel ;
      AV94Tprepedwwds_8_tfprdnum = AV46TFPrdNum ;
      AV95Tprepedwwds_9_tfprdnum_sel = AV47TFPrdNum_Sel ;
      AV96Tprepedwwds_10_tfpedcod = AV49TFPedCod ;
      AV97Tprepedwwds_11_tfpedcod_to = AV50TFPedCod_To ;
      AV98Tprepedwwds_12_tfprepeduni = AV52TFPrePedUni ;
      AV99Tprepedwwds_13_tfprepeduni_to = AV53TFPrePedUni_To ;
      AV100Tprepedwwds_14_tfprepedcon = AV55TFPrePedCon ;
      AV101Tprepedwwds_15_tfprepedcon_sel = AV56TFPrePedCon_Sel ;
      AV102Tprepedwwds_16_tfprepedpre = AV58TFPrePedPre ;
      AV103Tprepedwwds_17_tfprepedpre_to = AV59TFPrePedPre_To ;
      AV104Tprepedwwds_18_tfprepeddto = AV61TFPrePedDto ;
      AV105Tprepedwwds_19_tfprepeddto_to = AV62TFPrePedDto_To ;
      AV106Tprepedwwds_20_tfprepedpri = AV64TFPrePedPri ;
      AV107Tprepedwwds_21_tfprepedpri_sel = AV65TFPrePedPri_Sel ;
      AV108Tprepedwwds_22_tfprdpreact = AV76TFPrdPreAct ;
      AV109Tprepedwwds_23_tfprdpreact_to = AV77TFPrdPreAct_To ;
      AV110Tprepedwwds_24_tftipdtodto = AV78TFTipDtoDto ;
      AV111Tprepedwwds_25_tftipdtodto_to = AV79TFTipDtoDto_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121002( )
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
         AV68PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV68PageToGo) ;
      }
   }

   public void e131002( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141002( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV40TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFEmprCod", AV40TFEmprCod);
            AV41TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFEmprCod_Sel", AV41TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrePrvNum") == 0 )
         {
            AV43TFPrePrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFPrePrvNum), 6, 0));
            AV44TFPrePrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrePrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPrePrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrePrvDsc") == 0 )
         {
            AV74TFPrePrvDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrePrvDsc", AV74TFPrePrvDsc);
            AV75TFPrePrvDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFPrePrvDsc_Sel", AV75TFPrePrvDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV46TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdNum", AV46TFPrdNum);
            AV47TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdNum_Sel", AV47TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCod") == 0 )
         {
            AV49TFPedCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPedCod), 8, 0));
            AV50TFPedCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrePedUni") == 0 )
         {
            AV52TFPrePedUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrePedUni", GXutil.ltrimstr( AV52TFPrePedUni, 9, 2));
            AV53TFPrePedUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrePedUni_To", GXutil.ltrimstr( AV53TFPrePedUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrePedCon") == 0 )
         {
            AV55TFPrePedCon = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrePedCon", AV55TFPrePedCon);
            AV56TFPrePedCon_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrePedCon_Sel", AV56TFPrePedCon_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrePedPre") == 0 )
         {
            AV58TFPrePedPre = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrePedPre", GXutil.ltrimstr( AV58TFPrePedPre, 12, 5));
            AV59TFPrePedPre_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrePedPre_To", GXutil.ltrimstr( AV59TFPrePedPre_To, 12, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrePedDto") == 0 )
         {
            AV61TFPrePedDto = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrePedDto", GXutil.ltrimstr( AV61TFPrePedDto, 5, 2));
            AV62TFPrePedDto_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrePedDto_To", GXutil.ltrimstr( AV62TFPrePedDto_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrePedPri") == 0 )
         {
            AV64TFPrePedPri = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrePedPri", AV64TFPrePedPri);
            AV65TFPrePedPri_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrePedPri_Sel", AV65TFPrePedPri_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAct") == 0 )
         {
            AV76TFPrdPreAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFPrdPreAct", GXutil.ltrimstr( AV76TFPrdPreAct, 14, 5));
            AV77TFPrdPreAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFPrdPreAct_To", GXutil.ltrimstr( AV77TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipDtoDto") == 0 )
         {
            AV78TFTipDtoDto = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFTipDtoDto", GXutil.ltrimstr( AV78TFTipDtoDto, 5, 2));
            AV79TFTipDtoDto_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipDtoDto_To", GXutil.ltrimstr( AV79TFTipDtoDto_To, 5, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e221002( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      edtPrePrvDsc_Link = formatLink("app.tprepedview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A756PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PrePrvNum","PrdNum","TabCode"})  ;
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
   }

   public void e151002( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV31ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV33ColumnsSelector.fromJSonString(AV31ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TPREPEDWWColumnsSelector", ((GXutil.strcmp("", AV31ColumnsSelectorXML)==0) ? "" : AV33ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111002( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TPREPEDWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV112Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TPREPEDWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV37ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TPREPEDWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tprepedww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV37ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV37ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV112Pgmname+"GridState", AV37ManageFiltersXml) ;
            AV10GridState.fromxml(AV37ManageFiltersXml, null, null);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ManageFiltersData", AV36ManageFiltersData);
   }

   public void e161002( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tpreped", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","PrePrvNum","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e171002( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV29ExcelFilename ;
      GXv_char3[0] = AV30ErrorMessage ;
      new app.tprepedwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tprepedww_impl.this.AV29ExcelFilename = GXv_char4[0] ;
      tprepedww_impl.this.AV30ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV30ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e181002( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tprepedwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e191002( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tprepedwwexportcsv", new String[] {}, new String[] {}) );
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
      AV33ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "EmprCod", "", "Código Empresa", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrePrvNum", "", "PrePrvNum", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrePrvDsc", "", "Nombre", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PedCod", "", "Nº Pedido", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrePedUni", "", "Unidades Prepedido", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrePedCon", "", "Confirmado", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrePedPre", "", "Precio", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrePedDto", "", "Descuento", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrePedPri", "", "Prioridad", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipDtoDto", "", "Descuento", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV32UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPREPEDWWColumnsSelector", GXv_char4) ;
      tprepedww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV32UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV34ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV33ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV34ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV33ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV36ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TPREPEDWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV36ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV73FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73FilterFullText", AV73FilterFullText);
      AV40TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFEmprCod", AV40TFEmprCod);
      AV41TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFEmprCod_Sel", AV41TFEmprCod_Sel);
      AV43TFPrePrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFPrePrvNum), 6, 0));
      AV44TFPrePrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrePrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPrePrvNum_To), 6, 0));
      AV74TFPrePrvDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrePrvDsc", AV74TFPrePrvDsc);
      AV75TFPrePrvDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFPrePrvDsc_Sel", AV75TFPrePrvDsc_Sel);
      AV46TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdNum", AV46TFPrdNum);
      AV47TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdNum_Sel", AV47TFPrdNum_Sel);
      AV49TFPedCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPedCod), 8, 0));
      AV50TFPedCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFPedCod_To), 8, 0));
      AV52TFPrePedUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrePedUni", GXutil.ltrimstr( AV52TFPrePedUni, 9, 2));
      AV53TFPrePedUni_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrePedUni_To", GXutil.ltrimstr( AV53TFPrePedUni_To, 9, 2));
      AV55TFPrePedCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrePedCon", AV55TFPrePedCon);
      AV56TFPrePedCon_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrePedCon_Sel", AV56TFPrePedCon_Sel);
      AV58TFPrePedPre = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrePedPre", GXutil.ltrimstr( AV58TFPrePedPre, 12, 5));
      AV59TFPrePedPre_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrePedPre_To", GXutil.ltrimstr( AV59TFPrePedPre_To, 12, 5));
      AV61TFPrePedDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrePedDto", GXutil.ltrimstr( AV61TFPrePedDto, 5, 2));
      AV62TFPrePedDto_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrePedDto_To", GXutil.ltrimstr( AV62TFPrePedDto_To, 5, 2));
      AV64TFPrePedPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrePedPri", AV64TFPrePedPri);
      AV65TFPrePedPri_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrePedPri_Sel", AV65TFPrePedPri_Sel);
      AV76TFPrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFPrdPreAct", GXutil.ltrimstr( AV76TFPrdPreAct, 14, 5));
      AV77TFPrdPreAct_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFPrdPreAct_To", GXutil.ltrimstr( AV77TFPrdPreAct_To, 14, 5));
      AV78TFTipDtoDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFTipDtoDto", GXutil.ltrimstr( AV78TFTipDtoDto, 5, 2));
      AV79TFTipDtoDto_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipDtoDto_To", GXutil.ltrimstr( AV79TFTipDtoDto_To, 5, 2));
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
      callWebObject(formatLink("app.tpreped", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A756PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrePrvNum","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tpreped", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A756PrePrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum))}, new String[] {"Mode","EmprCod","PrePrvNum","PrdNum"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue(AV112Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV112Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV35Session.getValue(AV112Pgmname+"GridState"), null, null);
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
      AV113GXV1 = 1 ;
      while ( AV113GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV113GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV73FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73FilterFullText", AV73FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV40TFEmprCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFEmprCod", AV40TFEmprCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV41TFEmprCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFEmprCod_Sel", AV41TFEmprCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVNUM") == 0 )
         {
            AV43TFPrePrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrePrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFPrePrvNum), 6, 0));
            AV44TFPrePrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrePrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPrePrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC") == 0 )
         {
            AV74TFPrePrvDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFPrePrvDsc", AV74TFPrePrvDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPRVDSC_SEL") == 0 )
         {
            AV75TFPrePrvDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFPrePrvDsc_Sel", AV75TFPrePrvDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV46TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFPrdNum", AV46TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV47TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdNum_Sel", AV47TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCOD") == 0 )
         {
            AV49TFPedCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFPedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPedCod), 8, 0));
            AV50TFPedCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPedCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFPedCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDUNI") == 0 )
         {
            AV52TFPrePedUni = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrePedUni", GXutil.ltrimstr( AV52TFPrePedUni, 9, 2));
            AV53TFPrePedUni_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrePedUni_To", GXutil.ltrimstr( AV53TFPrePedUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON") == 0 )
         {
            AV55TFPrePedCon = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrePedCon", AV55TFPrePedCon);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDCON_SEL") == 0 )
         {
            AV56TFPrePedCon_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrePedCon_Sel", AV56TFPrePedCon_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRE") == 0 )
         {
            AV58TFPrePedPre = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrePedPre", GXutil.ltrimstr( AV58TFPrePedPre, 12, 5));
            AV59TFPrePedPre_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrePedPre_To", GXutil.ltrimstr( AV59TFPrePedPre_To, 12, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDDTO") == 0 )
         {
            AV61TFPrePedDto = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrePedDto", GXutil.ltrimstr( AV61TFPrePedDto, 5, 2));
            AV62TFPrePedDto_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrePedDto_To", GXutil.ltrimstr( AV62TFPrePedDto_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI") == 0 )
         {
            AV64TFPrePedPri = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPrePedPri", AV64TFPrePedPri);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPREPEDPRI_SEL") == 0 )
         {
            AV65TFPrePedPri_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrePedPri_Sel", AV65TFPrePedPri_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV76TFPrdPreAct = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFPrdPreAct", GXutil.ltrimstr( AV76TFPrdPreAct, 14, 5));
            AV77TFPrdPreAct_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFPrdPreAct_To", GXutil.ltrimstr( AV77TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDTODTO") == 0 )
         {
            AV78TFTipDtoDto = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFTipDtoDto", GXutil.ltrimstr( AV78TFTipDtoDto, 5, 2));
            AV79TFTipDtoDto_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFTipDtoDto_To", GXutil.ltrimstr( AV79TFTipDtoDto_To, 5, 2));
         }
         AV113GXV1 = (int)(AV113GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFEmprCod_Sel)==0), AV41TFEmprCod_Sel, GXv_char4) ;
      tprepedww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFPrePrvDsc_Sel)==0), AV75TFPrePrvDsc_Sel, GXv_char3) ;
      tprepedww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrdNum_Sel)==0), AV47TFPrdNum_Sel, GXv_char2) ;
      tprepedww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFPrePedCon_Sel)==0), AV56TFPrePedCon_Sel, GXv_char15) ;
      tprepedww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPrePedPri_Sel)==0), AV65TFPrePedPri_Sel, GXv_char17) ;
      tprepedww_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|||"+GXt_char14+"|||"+GXt_char16+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFEmprCod)==0), AV40TFEmprCod, GXv_char17) ;
      tprepedww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFPrePrvDsc)==0), AV74TFPrePrvDsc, GXv_char15) ;
      tprepedww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFPrdNum)==0), AV46TFPrdNum, GXv_char4) ;
      tprepedww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFPrePedCon)==0), AV55TFPrePedCon, GXv_char3) ;
      tprepedww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFPrePedPri)==0), AV64TFPrePedPri, GXv_char2) ;
      tprepedww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char16+"|"+((0==AV43TFPrePrvNum) ? "" : GXutil.str( AV43TFPrePrvNum, 6, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+((0==AV49TFPedCod) ? "" : GXutil.str( AV49TFPedCod, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrePedUni)==0) ? "" : GXutil.str( AV52TFPrePedUni, 9, 2))+"|"+GXt_char12+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPrePedPre)==0) ? "" : GXutil.str( AV58TFPrePedPre, 12, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrePedDto)==0) ? "" : GXutil.str( AV61TFPrePedDto, 5, 2))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFPrdPreAct)==0) ? "" : GXutil.str( AV76TFPrdPreAct, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFTipDtoDto)==0) ? "" : GXutil.str( AV78TFTipDtoDto, 5, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV44TFPrePrvNum_To) ? "" : GXutil.str( AV44TFPrePrvNum_To, 6, 0))+"|||"+((0==AV50TFPedCod_To) ? "" : GXutil.str( AV50TFPedCod_To, 8, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrePedUni_To)==0) ? "" : GXutil.str( AV53TFPrePedUni_To, 9, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrePedPre_To)==0) ? "" : GXutil.str( AV59TFPrePedPre_To, 12, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFPrePedDto_To)==0) ? "" : GXutil.str( AV62TFPrePedDto_To, 5, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFPrdPreAct_To)==0) ? "" : GXutil.str( AV77TFPrdPreAct_To, 14, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFTipDtoDto_To)==0) ? "" : GXutil.str( AV79TFTipDtoDto_To, 5, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV35Session.getValue(AV112Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV73FilterFullText)==0), (short)(0), AV73FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFEMPRCOD", "", !(GXutil.strcmp("", AV40TFEmprCod)==0), (short)(0), AV40TFEmprCod, "", !(GXutil.strcmp("", AV41TFEmprCod_Sel)==0), AV41TFEmprCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPREPRVNUM", "", !((0==AV43TFPrePrvNum)&&(0==AV44TFPrePrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV43TFPrePrvNum, 6, 0)), GXutil.trim( GXutil.str( AV44TFPrePrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPREPRVDSC", "", !(GXutil.strcmp("", AV74TFPrePrvDsc)==0), (short)(0), AV74TFPrePrvDsc, "", !(GXutil.strcmp("", AV75TFPrePrvDsc_Sel)==0), AV75TFPrePrvDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDNUM", "", !(GXutil.strcmp("", AV46TFPrdNum)==0), (short)(0), AV46TFPrdNum, "", !(GXutil.strcmp("", AV47TFPrdNum_Sel)==0), AV47TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPEDCOD", "", !((0==AV49TFPedCod)&&(0==AV50TFPedCod_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFPedCod, 8, 0)), GXutil.trim( GXutil.str( AV50TFPedCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPREPEDUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFPrePedUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrePedUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV52TFPrePedUni, 9, 2)), GXutil.trim( GXutil.str( AV53TFPrePedUni_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPREPEDCON", "", !(GXutil.strcmp("", AV55TFPrePedCon)==0), (short)(0), AV55TFPrePedCon, "", !(GXutil.strcmp("", AV56TFPrePedCon_Sel)==0), AV56TFPrePedCon_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPREPEDPRE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFPrePedPre)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFPrePedPre_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV58TFPrePedPre, 12, 5)), GXutil.trim( GXutil.str( AV59TFPrePedPre_To, 12, 5))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPREPEDDTO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFPrePedDto)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFPrePedDto_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV61TFPrePedDto, 5, 2)), GXutil.trim( GXutil.str( AV62TFPrePedDto_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPREPEDPRI", "", !(GXutil.strcmp("", AV64TFPrePedPri)==0), (short)(0), AV64TFPrePedPri, "", !(GXutil.strcmp("", AV65TFPrePedPri_Sel)==0), AV65TFPrePedPri_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFPRDPREACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFPrdPreAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFPrdPreAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV76TFPrdPreAct, 14, 5)), GXutil.trim( GXutil.str( AV77TFPrdPreAct_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFTIPDTODTO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFTipDtoDto)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFTipDtoDto_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV78TFTipDtoDto, 5, 2)), GXutil.trim( GXutil.str( AV79TFTipDtoDto_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState18[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV112Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV112Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPREPED" );
      AV35Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_1002( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV36ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_32_1002( true) ;
      }
      else
      {
         wb_table2_32_1002( false) ;
      }
      return  ;
   }

   public void wb_table2_32_1002e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1002e( true) ;
      }
      else
      {
         wb_table1_27_1002e( false) ;
      }
   }

   public void wb_table2_32_1002( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV73FilterFullText, GXutil.rtrim( localUtil.format( AV73FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TPREPEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_1002e( true) ;
      }
      else
      {
         wb_table2_32_1002e( false) ;
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
      pa1002( ) ;
      ws1002( ) ;
      we1002( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116131421", true, true);
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
      httpContext.AddJavascriptSource("tprepedww.js", "?202682116131422", false, true);
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
      edtPrePrvNum_Internalname = "PREPRVNUM_"+sGXsfl_45_idx ;
      edtPrePrvDsc_Internalname = "PREPRVDSC_"+sGXsfl_45_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_idx ;
      edtPedCod_Internalname = "PEDCOD_"+sGXsfl_45_idx ;
      edtPrePedUni_Internalname = "PREPEDUNI_"+sGXsfl_45_idx ;
      edtPrePedCon_Internalname = "PREPEDCON_"+sGXsfl_45_idx ;
      edtPrePedPre_Internalname = "PREPEDPRE_"+sGXsfl_45_idx ;
      edtPrePedDto_Internalname = "PREPEDDTO_"+sGXsfl_45_idx ;
      edtPrePedPri_Internalname = "PREPEDPRI_"+sGXsfl_45_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_45_idx ;
      edtTipDtoDto_Internalname = "TIPDTODTO_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtPrePrvNum_Internalname = "PREPRVNUM_"+sGXsfl_45_fel_idx ;
      edtPrePrvDsc_Internalname = "PREPRVDSC_"+sGXsfl_45_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_45_fel_idx ;
      edtPedCod_Internalname = "PEDCOD_"+sGXsfl_45_fel_idx ;
      edtPrePedUni_Internalname = "PREPEDUNI_"+sGXsfl_45_fel_idx ;
      edtPrePedCon_Internalname = "PREPEDCON_"+sGXsfl_45_fel_idx ;
      edtPrePedPre_Internalname = "PREPEDPRE_"+sGXsfl_45_fel_idx ;
      edtPrePedDto_Internalname = "PREPEDDTO_"+sGXsfl_45_fel_idx ;
      edtPrePedPri_Internalname = "PREPEDPRI_"+sGXsfl_45_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_45_fel_idx ;
      edtTipDtoDto_Internalname = "TIPDTODTO_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wb1000( ) ;
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
               AV80GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV80GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV80GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e231002_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV80GridActions, 4, 0)) );
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrePrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrePrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A756PrePrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A756PrePrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrePrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrePrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrePrvDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrePrvDsc_Internalname,GXutil.rtrim( A13791PrePrvDsc),"","","'"+""+"'"+",false,"+"'"+""+"'",edtPrePrvDsc_Link,"","","",edtPrePrvDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrePrvDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCod_Internalname,GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A658PedCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPedCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPedCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrePedUni_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrePedUni_Internalname,GXutil.ltrim( localUtil.ntoc( A755PrePedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A755PrePedUni, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrePedUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrePedUni_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrePedCon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrePedCon_Internalname,GXutil.rtrim( A751PrePedCon),GXutil.rtrim( localUtil.format( A751PrePedCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrePedCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrePedCon_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrePedPre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrePedPre_Internalname,GXutil.ltrim( localUtil.ntoc( A753PrePedPre, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A753PrePedPre, "ZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrePedPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrePedPre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrePedDto_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrePedDto_Internalname,GXutil.ltrim( localUtil.ntoc( A752PrePedDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A752PrePedDto, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrePedDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrePedDto_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrePedPri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrePedPri_Internalname,GXutil.rtrim( A754PrePedPri),GXutil.rtrim( localUtil.format( A754PrePedPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrePedPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrePedPri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipDtoDto_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipDtoDto_Internalname,GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A837TipDtoDto, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipDtoDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipDtoDto_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1002( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrePrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "PrePrvNum", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrePrvDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPedCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrePedUni_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Prepedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrePedCon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Confirmado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrePedPre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrePedDto_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descuento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrePedPri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prioridad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipDtoDto_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descuento", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A756PrePrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrePrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13791PrePrvDsc));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPrePrvDsc_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrePrvDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A658PedCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPedCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A755PrePedUni, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrePedUni_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A751PrePedCon));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrePedCon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A753PrePedPre, (byte)(12), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrePedPre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A752PrePedDto, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrePedDto_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A754PrePedPri));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrePedPri_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipDtoDto_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtPrePrvNum_Internalname = "PREPRVNUM" ;
      edtPrePrvDsc_Internalname = "PREPRVDSC" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPedCod_Internalname = "PEDCOD" ;
      edtPrePedUni_Internalname = "PREPEDUNI" ;
      edtPrePedCon_Internalname = "PREPEDCON" ;
      edtPrePedPre_Internalname = "PREPEDPRE" ;
      edtPrePedDto_Internalname = "PREPEDDTO" ;
      edtPrePedPri_Internalname = "PREPEDPRI" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtTipDtoDto_Internalname = "TIPDTODTO" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
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
      edtTipDtoDto_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrePedPri_Jsonclick = "" ;
      edtPrePedDto_Jsonclick = "" ;
      edtPrePedPre_Jsonclick = "" ;
      edtPrePedCon_Jsonclick = "" ;
      edtPrePedUni_Jsonclick = "" ;
      edtPedCod_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtPrePrvDsc_Jsonclick = "" ;
      edtPrePrvDsc_Link = "" ;
      edtPrePrvNum_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtTipDtoDto_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtPrePedPri_Visible = -1 ;
      edtPrePedDto_Visible = -1 ;
      edtPrePedPre_Visible = -1 ;
      edtPrePedCon_Visible = -1 ;
      edtPrePedUni_Visible = -1 ;
      edtPedCod_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtPrePrvDsc_Visible = -1 ;
      edtPrePrvNum_Visible = -1 ;
      edtEmprCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TPREPEDWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|Dynamic|||Dynamic|||Dynamic||" ;
      Ddo_grid_Includedatalist = "T||T|T|||T|||T||" ;
      Ddo_grid_Filterisrange = "|T|||T|T||T|T||T|T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T||T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2||3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "1:EmprCod|2:PrePrvNum|3:PrePrvDsc|4:PrdNum|5:PedCod|6:PrePedUni|7:PrePedCon|8:PrePedPre|9:PrePedDto|10:PrePedPri|11:PrdPreAct|12:TipDtoDto" ;
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
      Form.setCaption( httpContext.getMessage( " Realizacion Pedidos", "") );
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
         AV80GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV80GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrePrvNum_Visible',ctrl:'PREPRVNUM',prop:'Visible'},{av:'edtPrePrvDsc_Visible',ctrl:'PREPRVDSC',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrePedUni_Visible',ctrl:'PREPEDUNI',prop:'Visible'},{av:'edtPrePedCon_Visible',ctrl:'PREPEDCON',prop:'Visible'},{av:'edtPrePedPre_Visible',ctrl:'PREPEDPRE',prop:'Visible'},{av:'edtPrePedDto_Visible',ctrl:'PREPEDDTO',prop:'Visible'},{av:'edtPrePedPri_Visible',ctrl:'PREPEDPRI',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipDtoDto_Visible',ctrl:'TIPDTODTO',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121002',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131002',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141002',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e221002',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtPrePrvDsc_Link',ctrl:'PREPRVDSC',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151002',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrePrvNum_Visible',ctrl:'PREPRVNUM',prop:'Visible'},{av:'edtPrePrvDsc_Visible',ctrl:'PREPRVDSC',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrePedUni_Visible',ctrl:'PREPEDUNI',prop:'Visible'},{av:'edtPrePedCon_Visible',ctrl:'PREPEDCON',prop:'Visible'},{av:'edtPrePedPre_Visible',ctrl:'PREPEDPRE',prop:'Visible'},{av:'edtPrePedDto_Visible',ctrl:'PREPEDDTO',prop:'Visible'},{av:'edtPrePedPri_Visible',ctrl:'PREPEDPRI',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipDtoDto_Visible',ctrl:'TIPDTODTO',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111002',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'edtPrePrvNum_Visible',ctrl:'PREPRVNUM',prop:'Visible'},{av:'edtPrePrvDsc_Visible',ctrl:'PREPRVDSC',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPedCod_Visible',ctrl:'PEDCOD',prop:'Visible'},{av:'edtPrePedUni_Visible',ctrl:'PREPEDUNI',prop:'Visible'},{av:'edtPrePedCon_Visible',ctrl:'PREPEDCON',prop:'Visible'},{av:'edtPrePedPre_Visible',ctrl:'PREPEDPRE',prop:'Visible'},{av:'edtPrePedDto_Visible',ctrl:'PREPEDDTO',prop:'Visible'},{av:'edtPrePedPri_Visible',ctrl:'PREPEDPRI',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtTipDtoDto_Visible',ctrl:'TIPDTODTO',prop:'Visible'},{av:'AV69GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV70GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV36ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e231002',iparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV80GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161002',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A756PrePrvNum',fld:'PREPRVNUM',pic:'ZZZZZ9',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171002',iparms:[{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e181002',iparms:[{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e191002',iparms:[{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV40TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV41TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV43TFPrePrvNum',fld:'vTFPREPRVNUM',pic:'ZZZZZ9'},{av:'AV44TFPrePrvNum_To',fld:'vTFPREPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV74TFPrePrvDsc',fld:'vTFPREPRVDSC',pic:''},{av:'AV75TFPrePrvDsc_Sel',fld:'vTFPREPRVDSC_SEL',pic:''},{av:'AV46TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV47TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFPedCod',fld:'vTFPEDCOD',pic:'ZZZZZZZ9'},{av:'AV50TFPedCod_To',fld:'vTFPEDCOD_TO',pic:'ZZZZZZZ9'},{av:'AV52TFPrePedUni',fld:'vTFPREPEDUNI',pic:'ZZZZZ9.99'},{av:'AV53TFPrePedUni_To',fld:'vTFPREPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV55TFPrePedCon',fld:'vTFPREPEDCON',pic:'@!'},{av:'AV56TFPrePedCon_Sel',fld:'vTFPREPEDCON_SEL',pic:'@!'},{av:'AV58TFPrePedPre',fld:'vTFPREPEDPRE',pic:'ZZZZZ9.999'},{av:'AV59TFPrePedPre_To',fld:'vTFPREPEDPRE_TO',pic:'ZZZZZ9.999'},{av:'AV61TFPrePedDto',fld:'vTFPREPEDDTO',pic:'Z9.99'},{av:'AV62TFPrePedDto_To',fld:'vTFPREPEDDTO_TO',pic:'Z9.99'},{av:'AV64TFPrePedPri',fld:'vTFPREPEDPRI',pic:'9'},{av:'AV65TFPrePedPri_Sel',fld:'vTFPREPEDPRI_SEL',pic:'9'},{av:'AV76TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV77TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV78TFTipDtoDto',fld:'vTFTIPDTODTO',pic:'Z9.99'},{av:'AV79TFTipDtoDto_To',fld:'vTFTIPDTODTO_TO',pic:'Z9.99'},{av:'AV112Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PREPRVNUM","{handler:'valid_Preprvnum',iparms:[]");
      setEventMetadata("VALID_PREPRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Tipdtodto',iparms:[]");
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
      AV33ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV73FilterFullText = "" ;
      AV40TFEmprCod = "" ;
      AV41TFEmprCod_Sel = "" ;
      AV74TFPrePrvDsc = "" ;
      AV75TFPrePrvDsc_Sel = "" ;
      AV46TFPrdNum = "" ;
      AV47TFPrdNum_Sel = "" ;
      AV52TFPrePedUni = DecimalUtil.ZERO ;
      AV53TFPrePedUni_To = DecimalUtil.ZERO ;
      AV55TFPrePedCon = "" ;
      AV56TFPrePedCon_Sel = "" ;
      AV58TFPrePedPre = DecimalUtil.ZERO ;
      AV59TFPrePedPre_To = DecimalUtil.ZERO ;
      AV61TFPrePedDto = DecimalUtil.ZERO ;
      AV62TFPrePedDto_To = DecimalUtil.ZERO ;
      AV64TFPrePedPri = "" ;
      AV65TFPrePedPri_Sel = "" ;
      AV76TFPrdPreAct = DecimalUtil.ZERO ;
      AV77TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV78TFTipDtoDto = DecimalUtil.ZERO ;
      AV79TFTipDtoDto_To = DecimalUtil.ZERO ;
      AV112Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV36ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV67DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A13791PrePrvDsc = "" ;
      A719PrdNum = "" ;
      A755PrePedUni = DecimalUtil.ZERO ;
      A751PrePedCon = "" ;
      A753PrePedPre = DecimalUtil.ZERO ;
      A752PrePedDto = DecimalUtil.ZERO ;
      A754PrePedPri = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV87Tprepedwwds_1_filterfulltext = "" ;
      lV92Tprepedwwds_6_tfpreprvdsc = "" ;
      lV88Tprepedwwds_2_tfemprcod = "" ;
      lV94Tprepedwwds_8_tfprdnum = "" ;
      lV100Tprepedwwds_14_tfprepedcon = "" ;
      lV106Tprepedwwds_20_tfprepedpri = "" ;
      AV89Tprepedwwds_3_tfemprcod_sel = "" ;
      AV88Tprepedwwds_2_tfemprcod = "" ;
      AV95Tprepedwwds_9_tfprdnum_sel = "" ;
      AV94Tprepedwwds_8_tfprdnum = "" ;
      AV98Tprepedwwds_12_tfprepeduni = DecimalUtil.ZERO ;
      AV99Tprepedwwds_13_tfprepeduni_to = DecimalUtil.ZERO ;
      AV101Tprepedwwds_15_tfprepedcon_sel = "" ;
      AV100Tprepedwwds_14_tfprepedcon = "" ;
      AV102Tprepedwwds_16_tfprepedpre = DecimalUtil.ZERO ;
      AV103Tprepedwwds_17_tfprepedpre_to = DecimalUtil.ZERO ;
      AV104Tprepedwwds_18_tfprepeddto = DecimalUtil.ZERO ;
      AV105Tprepedwwds_19_tfprepeddto_to = DecimalUtil.ZERO ;
      AV107Tprepedwwds_21_tfprepedpri_sel = "" ;
      AV106Tprepedwwds_20_tfprepedpri = "" ;
      AV108Tprepedwwds_22_tfprdpreact = DecimalUtil.ZERO ;
      AV109Tprepedwwds_23_tfprdpreact_to = DecimalUtil.ZERO ;
      AV110Tprepedwwds_24_tftipdtodto = DecimalUtil.ZERO ;
      AV111Tprepedwwds_25_tftipdtodto_to = DecimalUtil.ZERO ;
      AV87Tprepedwwds_1_filterfulltext = "" ;
      AV93Tprepedwwds_7_tfpreprvdsc_sel = "" ;
      AV92Tprepedwwds_6_tfpreprvdsc = "" ;
      H01002_A795PrvNum = new int[1] ;
      H01002_A835TipDtoCod = new byte[1] ;
      H01002_n835TipDtoCod = new boolean[] {false} ;
      H01002_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01002_n837TipDtoDto = new boolean[] {false} ;
      H01002_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01002_A754PrePedPri = new String[] {""} ;
      H01002_n754PrePedPri = new boolean[] {false} ;
      H01002_A752PrePedDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01002_n752PrePedDto = new boolean[] {false} ;
      H01002_A753PrePedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01002_n753PrePedPre = new boolean[] {false} ;
      H01002_A751PrePedCon = new String[] {""} ;
      H01002_n751PrePedCon = new boolean[] {false} ;
      H01002_A755PrePedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01002_n755PrePedUni = new boolean[] {false} ;
      H01002_A658PedCod = new int[1] ;
      H01002_n658PedCod = new boolean[] {false} ;
      H01002_A719PrdNum = new String[] {""} ;
      H01002_A756PrePrvNum = new int[1] ;
      H01002_A396EmprCod = new String[] {""} ;
      H01002_A13791PrePrvDsc = new String[] {""} ;
      H01002_n13791PrePrvDsc = new boolean[] {false} ;
      H01003_AGRID_nRecordCount = new long[1] ;
      AV83Station = "" ;
      AV84Emprcod = "" ;
      AV85Emprnom = "" ;
      AV86Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV37ManageFiltersXml = "" ;
      AV29ExcelFilename = "" ;
      AV30ErrorMessage = "" ;
      AV32UserCustomValue = "" ;
      AV34ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprepedww__default(),
         new Object[] {
             new Object[] {
            H01002_A795PrvNum, H01002_A835TipDtoCod, H01002_n835TipDtoCod, H01002_A837TipDtoDto, H01002_n837TipDtoDto, H01002_A724PrdPreAct, H01002_A754PrePedPri, H01002_n754PrePedPri, H01002_A752PrePedDto, H01002_n752PrePedDto,
            H01002_A753PrePedPre, H01002_n753PrePedPre, H01002_A751PrePedCon, H01002_n751PrePedCon, H01002_A755PrePedUni, H01002_n755PrePedUni, H01002_A658PedCod, H01002_n658PedCod, H01002_A719PrdNum, H01002_A756PrePrvNum,
            H01002_A396EmprCod, H01002_A13791PrePrvDsc, H01002_n13791PrePrvDsc
            }
            , new Object[] {
            H01003_AGRID_nRecordCount
            }
         }
      );
      AV112Pgmname = "TPREPEDWW" ;
      /* GeneXus formulas. */
      AV112Pgmname = "TPREPEDWW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV38ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A835TipDtoCod ;
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
   private short AV80GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV43TFPrePrvNum ;
   private int AV44TFPrePrvNum_To ;
   private int AV49TFPedCod ;
   private int AV50TFPedCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A756PrePrvNum ;
   private int A658PedCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV90Tprepedwwds_4_tfpreprvnum ;
   private int AV91Tprepedwwds_5_tfpreprvnum_to ;
   private int AV96Tprepedwwds_10_tfpedcod ;
   private int AV97Tprepedwwds_11_tfpedcod_to ;
   private int edtEmprCod_Visible ;
   private int edtPrePrvNum_Visible ;
   private int edtPrePrvDsc_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPedCod_Visible ;
   private int edtPrePedUni_Visible ;
   private int edtPrePedCon_Visible ;
   private int edtPrePedPre_Visible ;
   private int edtPrePedDto_Visible ;
   private int edtPrePedPri_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtTipDtoDto_Visible ;
   private int AV68PageToGo ;
   private int AV113GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV69GridCurrentPage ;
   private long AV70GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV52TFPrePedUni ;
   private java.math.BigDecimal AV53TFPrePedUni_To ;
   private java.math.BigDecimal AV58TFPrePedPre ;
   private java.math.BigDecimal AV59TFPrePedPre_To ;
   private java.math.BigDecimal AV61TFPrePedDto ;
   private java.math.BigDecimal AV62TFPrePedDto_To ;
   private java.math.BigDecimal AV76TFPrdPreAct ;
   private java.math.BigDecimal AV77TFPrdPreAct_To ;
   private java.math.BigDecimal AV78TFTipDtoDto ;
   private java.math.BigDecimal AV79TFTipDtoDto_To ;
   private java.math.BigDecimal A755PrePedUni ;
   private java.math.BigDecimal A753PrePedPre ;
   private java.math.BigDecimal A752PrePedDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal AV98Tprepedwwds_12_tfprepeduni ;
   private java.math.BigDecimal AV99Tprepedwwds_13_tfprepeduni_to ;
   private java.math.BigDecimal AV102Tprepedwwds_16_tfprepedpre ;
   private java.math.BigDecimal AV103Tprepedwwds_17_tfprepedpre_to ;
   private java.math.BigDecimal AV104Tprepedwwds_18_tfprepeddto ;
   private java.math.BigDecimal AV105Tprepedwwds_19_tfprepeddto_to ;
   private java.math.BigDecimal AV108Tprepedwwds_22_tfprdpreact ;
   private java.math.BigDecimal AV109Tprepedwwds_23_tfprdpreact_to ;
   private java.math.BigDecimal AV110Tprepedwwds_24_tftipdtodto ;
   private java.math.BigDecimal AV111Tprepedwwds_25_tftipdtodto_to ;
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
   private String AV40TFEmprCod ;
   private String AV41TFEmprCod_Sel ;
   private String AV74TFPrePrvDsc ;
   private String AV75TFPrePrvDsc_Sel ;
   private String AV46TFPrdNum ;
   private String AV47TFPrdNum_Sel ;
   private String AV55TFPrePedCon ;
   private String AV56TFPrePedCon_Sel ;
   private String AV64TFPrePedPri ;
   private String AV65TFPrePedPri_Sel ;
   private String AV112Pgmname ;
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
   private String edtPrePrvNum_Internalname ;
   private String A13791PrePrvDsc ;
   private String edtPrePrvDsc_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String edtPedCod_Internalname ;
   private String edtPrePedUni_Internalname ;
   private String A751PrePedCon ;
   private String edtPrePedCon_Internalname ;
   private String edtPrePedPre_Internalname ;
   private String edtPrePedDto_Internalname ;
   private String A754PrePedPri ;
   private String edtPrePedPri_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtTipDtoDto_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV92Tprepedwwds_6_tfpreprvdsc ;
   private String lV88Tprepedwwds_2_tfemprcod ;
   private String lV94Tprepedwwds_8_tfprdnum ;
   private String lV100Tprepedwwds_14_tfprepedcon ;
   private String lV106Tprepedwwds_20_tfprepedpri ;
   private String AV89Tprepedwwds_3_tfemprcod_sel ;
   private String AV88Tprepedwwds_2_tfemprcod ;
   private String AV95Tprepedwwds_9_tfprdnum_sel ;
   private String AV94Tprepedwwds_8_tfprdnum ;
   private String AV101Tprepedwwds_15_tfprepedcon_sel ;
   private String AV100Tprepedwwds_14_tfprepedcon ;
   private String AV107Tprepedwwds_21_tfprepedpri_sel ;
   private String AV106Tprepedwwds_20_tfprepedpri ;
   private String AV93Tprepedwwds_7_tfpreprvdsc_sel ;
   private String AV92Tprepedwwds_6_tfpreprvdsc ;
   private String AV83Station ;
   private String AV84Emprcod ;
   private String AV85Emprnom ;
   private String AV86Usurcod ;
   private String edtPrePrvDsc_Link ;
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
   private String edtPrePrvNum_Jsonclick ;
   private String edtPrePrvDsc_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPedCod_Jsonclick ;
   private String edtPrePedUni_Jsonclick ;
   private String edtPrePedCon_Jsonclick ;
   private String edtPrePedPre_Jsonclick ;
   private String edtPrePedDto_Jsonclick ;
   private String edtPrePedPri_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtTipDtoDto_Jsonclick ;
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
   private boolean n13791PrePrvDsc ;
   private boolean n658PedCod ;
   private boolean n755PrePedUni ;
   private boolean n751PrePedCon ;
   private boolean n753PrePedPre ;
   private boolean n752PrePedDto ;
   private boolean n754PrePedPri ;
   private boolean n837TipDtoDto ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n835TipDtoCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV31ColumnsSelectorXML ;
   private String AV37ManageFiltersXml ;
   private String AV32UserCustomValue ;
   private String AV73FilterFullText ;
   private String lV87Tprepedwwds_1_filterfulltext ;
   private String AV87Tprepedwwds_1_filterfulltext ;
   private String AV29ExcelFilename ;
   private String AV30ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private int[] H01002_A795PrvNum ;
   private byte[] H01002_A835TipDtoCod ;
   private boolean[] H01002_n835TipDtoCod ;
   private java.math.BigDecimal[] H01002_A837TipDtoDto ;
   private boolean[] H01002_n837TipDtoDto ;
   private java.math.BigDecimal[] H01002_A724PrdPreAct ;
   private String[] H01002_A754PrePedPri ;
   private boolean[] H01002_n754PrePedPri ;
   private java.math.BigDecimal[] H01002_A752PrePedDto ;
   private boolean[] H01002_n752PrePedDto ;
   private java.math.BigDecimal[] H01002_A753PrePedPre ;
   private boolean[] H01002_n753PrePedPre ;
   private String[] H01002_A751PrePedCon ;
   private boolean[] H01002_n751PrePedCon ;
   private java.math.BigDecimal[] H01002_A755PrePedUni ;
   private boolean[] H01002_n755PrePedUni ;
   private int[] H01002_A658PedCod ;
   private boolean[] H01002_n658PedCod ;
   private String[] H01002_A719PrdNum ;
   private int[] H01002_A756PrePrvNum ;
   private String[] H01002_A396EmprCod ;
   private String[] H01002_A13791PrePrvDsc ;
   private boolean[] H01002_n13791PrePrvDsc ;
   private long[] H01003_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV36ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV67DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tprepedww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01002( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Tprepedwwds_3_tfemprcod_sel ,
                                          String AV88Tprepedwwds_2_tfemprcod ,
                                          int AV90Tprepedwwds_4_tfpreprvnum ,
                                          int AV91Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV95Tprepedwwds_9_tfprdnum_sel ,
                                          String AV94Tprepedwwds_8_tfprdnum ,
                                          int AV96Tprepedwwds_10_tfpedcod ,
                                          int AV97Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV98Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV99Tprepedwwds_13_tfprepeduni_to ,
                                          String AV101Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV100Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV102Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV103Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV104Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV105Tprepedwwds_19_tfprepeddto_to ,
                                          String AV107Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV106Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV108Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV109Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV110Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV111Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV87Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV93Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV92Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[45];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T4.PrvNum, T2.TipDtoCod, T3.TipDtoDto, T2.PrdPreAct, T1.PrePedPri, T1.PrePedDto, T1.PrePedPre, T1.PrePedCon, T1.PrePedUni, T1.PedCod, T1.PrdNum, T1.PrePrvNum, T1.EmprCod," ;
      sSelectString += " COALESCE( T4.PrvNom, 'Error') AS PrePrvDsc" ;
      sFromString = " FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod AND T3.TipDtoCod" ;
      sFromString += " = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV89Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV91Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int19[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int19[39] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrePrvNum" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrePrvNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedCod" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrePedUni" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrePedUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrePedCon" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrePedCon DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrePedPre" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrePedPre DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrePedDto" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrePedDto DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrePedPri" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrePedPri DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdPreAct" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdPreAct DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T3.TipDtoDto" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.TipDtoDto DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrePrvNum, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01003( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV89Tprepedwwds_3_tfemprcod_sel ,
                                          String AV88Tprepedwwds_2_tfemprcod ,
                                          int AV90Tprepedwwds_4_tfpreprvnum ,
                                          int AV91Tprepedwwds_5_tfpreprvnum_to ,
                                          String AV95Tprepedwwds_9_tfprdnum_sel ,
                                          String AV94Tprepedwwds_8_tfprdnum ,
                                          int AV96Tprepedwwds_10_tfpedcod ,
                                          int AV97Tprepedwwds_11_tfpedcod_to ,
                                          java.math.BigDecimal AV98Tprepedwwds_12_tfprepeduni ,
                                          java.math.BigDecimal AV99Tprepedwwds_13_tfprepeduni_to ,
                                          String AV101Tprepedwwds_15_tfprepedcon_sel ,
                                          String AV100Tprepedwwds_14_tfprepedcon ,
                                          java.math.BigDecimal AV102Tprepedwwds_16_tfprepedpre ,
                                          java.math.BigDecimal AV103Tprepedwwds_17_tfprepedpre_to ,
                                          java.math.BigDecimal AV104Tprepedwwds_18_tfprepeddto ,
                                          java.math.BigDecimal AV105Tprepedwwds_19_tfprepeddto_to ,
                                          String AV107Tprepedwwds_21_tfprepedpri_sel ,
                                          String AV106Tprepedwwds_20_tfprepedpri ,
                                          java.math.BigDecimal AV108Tprepedwwds_22_tfprdpreact ,
                                          java.math.BigDecimal AV109Tprepedwwds_23_tfprdpreact_to ,
                                          java.math.BigDecimal AV110Tprepedwwds_24_tftipdtodto ,
                                          java.math.BigDecimal AV111Tprepedwwds_25_tftipdtodto_to ,
                                          String A396EmprCod ,
                                          int A756PrePrvNum ,
                                          String A719PrdNum ,
                                          int A658PedCod ,
                                          java.math.BigDecimal A755PrePedUni ,
                                          String A751PrePedCon ,
                                          java.math.BigDecimal A753PrePedPre ,
                                          java.math.BigDecimal A752PrePedDto ,
                                          String A754PrePedPri ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          java.math.BigDecimal A837TipDtoDto ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV87Tprepedwwds_1_filterfulltext ,
                                          String A13791PrePrvDsc ,
                                          String AV93Tprepedwwds_7_tfpreprvdsc_sel ,
                                          String AV92Tprepedwwds_6_tfpreprvdsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[40];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPPREPED T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPDTO T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipDtoCod = T2.TipDtoCod) LEFT JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.PrePrvNum)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.EmprCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePrvNum,'999990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PedCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedUni,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedCon) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrePedPre,'999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.PrePedDto,'90.99'), 2) like '%' || ?) or ( UPPER(T1.PrePedPri) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.PrdPreAct,'99999990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.TipDtoDto,'90.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.PrvNom, 'Error')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.PrvNom, 'Error') = ?))");
      if ( (GXutil.strcmp("", AV89Tprepedwwds_3_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV88Tprepedwwds_2_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Tprepedwwds_3_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprCod = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV90Tprepedwwds_4_tfpreprvnum) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV91Tprepedwwds_5_tfpreprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrePrvNum <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tprepedwwds_9_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV94Tprepedwwds_8_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tprepedwwds_9_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV96Tprepedwwds_10_tfpedcod) )
      {
         addWhere(sWhereString, "(T1.PedCod >= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (0==AV97Tprepedwwds_11_tfpedcod_to) )
      {
         addWhere(sWhereString, "(T1.PedCod <= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Tprepedwwds_12_tfprepeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni >= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Tprepedwwds_13_tfprepeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedUni <= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprepedwwds_15_tfprepedcon_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprepedwwds_14_tfprepedcon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprepedwwds_15_tfprepedcon_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedCon = ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV102Tprepedwwds_16_tfprepedpre)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Tprepedwwds_17_tfprepedpre_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPre <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Tprepedwwds_18_tfprepeddto)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto >= ?)");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Tprepedwwds_19_tfprepeddto_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedDto <= ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprepedwwds_21_tfprepedpri_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprepedwwds_20_tfprepedpri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrePedPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprepedwwds_21_tfprepedpri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrePedPri = ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Tprepedwwds_22_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Tprepedwwds_23_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Tprepedwwds_24_tftipdtodto)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto >= ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tprepedwwds_25_tftipdtodto_to)==0) )
      {
         addWhere(sWhereString, "(T3.TipDtoDto <= ?)");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
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
                  return conditional_H01002(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 1 :
                  return conditional_H01003(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01002", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01003", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 6);
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 3);
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[83], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 5);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 5);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
      }
   }

}

