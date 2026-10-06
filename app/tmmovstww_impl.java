package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmmovstww_impl extends GXDataArea
{
   public tmmovstww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmmovstww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmmovstww_impl.class ));
   }

   public tmmovstww_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbMMSTpo = new HTMLChoice();
      cmbMMSEst = new HTMLChoice();
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
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36ColumnsSelector);
      AV98FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV49TFMMSCod = (int)(GXutil.lval( httpContext.GetPar( "TFMMSCod"))) ;
      AV50TFMMSCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFMMSCod_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV53TFMMSTpo_Sels);
      AV61TFMMSFch = localUtil.parseDateParm( httpContext.GetPar( "TFMMSFch")) ;
      AV58TFMMSPrvNom = httpContext.GetPar( "TFMMSPrvNom") ;
      AV59TFMMSPrvNom_Sel = httpContext.GetPar( "TFMMSPrvNom_Sel") ;
      AV55TFMMSPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFMMSPrvNum"))) ;
      AV56TFMMSPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFMMSPrvNum_To"))) ;
      AV85TFMMSDto = CommonUtil.decimalVal( httpContext.GetPar( "TFMMSDto"), ".") ;
      AV86TFMMSDto_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMMSDto_To"), ".") ;
      AV79TFMMSNroExt = httpContext.GetPar( "TFMMSNroExt") ;
      AV80TFMMSNroExt_Sel = httpContext.GetPar( "TFMMSNroExt_Sel") ;
      AV66TFMMSUsuCre = httpContext.GetPar( "TFMMSUsuCre") ;
      AV67TFMMSUsuCre_Sel = httpContext.GetPar( "TFMMSUsuCre_Sel") ;
      AV69TFMMSFchCre = localUtil.parseDTimeParm( httpContext.GetPar( "TFMMSFchCre")) ;
      AV74TFMMSFchApl = localUtil.parseDTimeParm( httpContext.GetPar( "TFMMSFchApl")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV83TFMMSEst_Sels);
      AV148Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV117GroupBy = httpContext.GetPar( "GroupBy") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV122GridCollapsedRecords);
      AV116Grid_GroupCaption = httpContext.GetPar( "Grid_GroupCaption") ;
      AV119GroupKey = httpContext.GetPar( "GroupKey") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV121GridCollapsedRecordsChildren);
      AV96EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
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
      paJC2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startJC2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmmovstww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_48", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_48, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV90GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV91GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV88DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV88DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSCOD", GXutil.ltrim( localUtil.ntoc( AV49TFMMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSCOD_TO", GXutil.ltrim( localUtil.ntoc( AV50TFMMSCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFMMSTPO_SELS", AV53TFMMSTpo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFMMSTPO_SELS", AV53TFMMSTpo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSFCH", localUtil.dtoc( AV61TFMMSFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSPRVNOM", GXutil.rtrim( AV58TFMMSPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSPRVNOM_SEL", GXutil.rtrim( AV59TFMMSPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSPRVNUM", GXutil.ltrim( localUtil.ntoc( AV55TFMMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV56TFMMSPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSDTO", GXutil.ltrim( localUtil.ntoc( AV85TFMMSDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSDTO_TO", GXutil.ltrim( localUtil.ntoc( AV86TFMMSDto_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSNROEXT", GXutil.rtrim( AV79TFMMSNroExt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSNROEXT_SEL", GXutil.rtrim( AV80TFMMSNroExt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSUSUCRE", GXutil.rtrim( AV66TFMMSUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSUSUCRE_SEL", GXutil.rtrim( AV67TFMMSUsuCre_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSFCHCRE", localUtil.ttoc( AV69TFMMSFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSFCHAPL", localUtil.ttoc( AV74TFMMSFchApl, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFMMSEST_SELS", AV83TFMMSEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFMMSEST_SELS", AV83TFMMSEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV148Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPBY", AV117GroupBy);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDS", AV122GridCollapsedRecords);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDS", AV122GridCollapsedRecords);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGROUPKEY", AV119GroupKey);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDCOLLAPSEDRECORDSCHILDREN", AV121GridCollapsedRecordsChildren);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDCOLLAPSEDRECORDSCHILDREN", AV121GridCollapsedRecordsChildren);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSTPO_SELSJSON", AV52TFMMSTpo_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMMSEST_SELSJSON", AV82TFMMSEst_SelsJson);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vADDCHILDREN", AV126AddChildren);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV96EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96EmprCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Title", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Title", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Gridinternalname", GXutil.rtrim( Grid_group_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_GROUP_Columnindex", GXutil.ltrim( localUtil.ntoc( Grid_group_Columnindex, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
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
      app.GxWebStd.gx_hidden_field( httpContext, "MMSEST_Text", GXutil.rtrim( cmbMMSEst.getDescription()));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_APLICAR_Result", GXutil.rtrim( Dvelop_confirmpanel_aplicar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CANCELAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cancelar_Result));
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
         weJC2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtJC2( ) ;
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
      return formatLink("app.tmmovstww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TMMovStWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Movimientos de Stock", "") ;
   }

   public void wbJC0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 48, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_JC2( true) ;
      }
      else
      {
         wb_table1_27_JC2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_JC2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablagrids_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         ucGridpaginationbar.setProperty("CurrentPage", AV90GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV91GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0071"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0071"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_48_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0071"+"");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV88DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV88DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV36ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_78_JC2( true) ;
      }
      else
      {
         wb_table2_78_JC2( false) ;
      }
      return  ;
   }

   public void wb_table2_78_JC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_83_JC2( true) ;
      }
      else
      {
         wb_table3_83_JC2( false) ;
      }
      return  ;
   }

   public void wb_table3_83_JC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_group.setProperty("ColumnIndex", Grid_group_Columnindex);
         ucGrid_group.render(context, "dvelop.dvgroupby", Grid_group_Internalname, "GRID_GROUPContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("HasRowGroups", Grid_empowerer_Hasrowgroups);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mmsfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mmsfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mmsfchauxdate_Internalname, localUtil.format(AV63DDO_MMSFchAuxDate, "99/99/99"), localUtil.format( AV63DDO_MMSFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mmsfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mmsfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMMovStWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mmsfchcreauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mmsfchcreauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mmsfchcreauxdate_Internalname, localUtil.format(AV71DDO_MMSFchCreAuxDate, "99/99/99"), localUtil.format( AV71DDO_MMSFchCreAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mmsfchcreauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mmsfchcreauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMMovStWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_mmsfchaplauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_mmsfchaplauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_mmsfchaplauxdate_Internalname, localUtil.format(AV76DDO_MMSFchAplAuxDate, "99/99/99"), localUtil.format( AV76DDO_MMSFchAplAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_mmsfchaplauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_mmsfchaplauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TMMovStWW.htm");
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

   public void startJC2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Movimientos de Stock", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupJC0( ) ;
   }

   public void wsJC2( )
   {
      startJC2( ) ;
      evtJC2( ) ;
   }

   public void evtJC2( )
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
                           e11JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_APLICAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CANCELAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e18JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e19JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e20JC2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e21JC2 ();
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
                           nGXsfl_48_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_482( ) ;
                           AV127Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV127Expand);
                           AV116Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV116Grid_GroupCaption);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
                           AV115DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV115DetailWebComponent);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV114GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbMMSTpo.setName( cmbMMSTpo.getInternalname() );
                           cmbMMSTpo.setValue( httpContext.cgiGet( cmbMMSTpo.getInternalname()) );
                           A9413MMSTpo = httpContext.cgiGet( cmbMMSTpo.getInternalname()) ;
                           n9413MMSTpo = false ;
                           A9416MMSFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtMMSFch_Internalname), 0)) ;
                           n9416MMSFch = false ;
                           A9415MMSPrvNom = httpContext.cgiGet( edtMMSPrvNom_Internalname) ;
                           n9415MMSPrvNom = false ;
                           A9414MMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n9414MMSPrvNum = false ;
                           A11509MMSDto = localUtil.ctond( httpContext.cgiGet( edtMMSDto_Internalname)) ;
                           n11509MMSDto = false ;
                           A9419MMSNroExt = httpContext.cgiGet( edtMMSNroExt_Internalname) ;
                           n9419MMSNroExt = false ;
                           A9417MMSUsuCre = httpContext.cgiGet( edtMMSUsuCre_Internalname) ;
                           n9417MMSUsuCre = false ;
                           A9418MMSFchCre = localUtil.ctot( httpContext.cgiGet( edtMMSFchCre_Internalname), 0) ;
                           n9418MMSFchCre = false ;
                           A11304MMSFchApl = localUtil.ctot( httpContext.cgiGet( edtMMSFchApl_Internalname), 0) ;
                           n11304MMSFchApl = false ;
                           cmbMMSEst.setName( cmbMMSEst.getInternalname() );
                           cmbMMSEst.setValue( httpContext.cgiGet( cmbMMSEst.getInternalname()) );
                           A9420MMSEst = httpContext.cgiGet( cmbMMSEst.getInternalname()) ;
                           n9420MMSEst = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e22JC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e23JC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e24JC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e25JC2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXPAND.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e26JC2 ();
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
                     if ( nCmpId == 71 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0071") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0071", "", sEvt);
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

   public void weJC2( )
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

   public void paJC2( )
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
                                 byte AV41ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ,
                                 String AV98FilterFullText ,
                                 int AV49TFMMSCod ,
                                 int AV50TFMMSCod_To ,
                                 GXSimpleCollection<String> AV53TFMMSTpo_Sels ,
                                 java.util.Date AV61TFMMSFch ,
                                 String AV58TFMMSPrvNom ,
                                 String AV59TFMMSPrvNom_Sel ,
                                 int AV55TFMMSPrvNum ,
                                 int AV56TFMMSPrvNum_To ,
                                 java.math.BigDecimal AV85TFMMSDto ,
                                 java.math.BigDecimal AV86TFMMSDto_To ,
                                 String AV79TFMMSNroExt ,
                                 String AV80TFMMSNroExt_Sel ,
                                 String AV66TFMMSUsuCre ,
                                 String AV67TFMMSUsuCre_Sel ,
                                 java.util.Date AV69TFMMSFchCre ,
                                 java.util.Date AV74TFMMSFchApl ,
                                 GXSimpleCollection<String> AV83TFMMSEst_Sels ,
                                 String AV148Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String AV117GroupBy ,
                                 GXSimpleCollection<String> AV122GridCollapsedRecords ,
                                 String AV116Grid_GroupCaption ,
                                 String AV119GroupKey ,
                                 GXSimpleCollection<String> AV121GridCollapsedRecordsChildren ,
                                 String AV96EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e23JC2 ();
      GRID_nCurrentRecord = 0 ;
      rfJC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID_GROUPCAPTION", AV116Grid_GroupCaption);
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
      rfJC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV148Pgmname = "TMMovStWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_48_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV133Tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV147Tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV131Tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV132Tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV133Tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV134Tmmovstwwds_5_tfmmsfch ,
                                           AV136Tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV135Tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV137Tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV138Tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV139Tmmovstwwds_10_tfmmsdto ,
                                           AV140Tmmovstwwds_11_tfmmsdto_to ,
                                           AV142Tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV141Tmmovstwwds_12_tfmmsnroext ,
                                           AV144Tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV143Tmmovstwwds_14_tfmmsusucre ,
                                           AV145Tmmovstwwds_16_tfmmsfchcre ,
                                           AV146Tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV147Tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV130Tmmovstwwds_1_filterfulltext ,
                                           Integer.valueOf(AV121GridCollapsedRecordsChildren.size()) ,
                                           A396EmprCod ,
                                           AV121GridCollapsedRecordsChildren } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV135Tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV135Tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV141Tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV141Tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV143Tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV143Tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor H00JC2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV131Tmmovstwwds_2_tfmmscod), Integer.valueOf(AV132Tmmovstwwds_3_tfmmscod_to), AV134Tmmovstwwds_5_tfmmsfch, lV135Tmmovstwwds_6_tfmmsprvnom, AV136Tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV137Tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV138Tmmovstwwds_9_tfmmsprvnum_to), AV139Tmmovstwwds_10_tfmmsdto, AV140Tmmovstwwds_11_tfmmsdto_to, lV141Tmmovstwwds_12_tfmmsnroext, AV142Tmmovstwwds_13_tfmmsnroext_sel, lV143Tmmovstwwds_14_tfmmsusucre, AV144Tmmovstwwds_15_tfmmsusucre_sel, AV145Tmmovstwwds_16_tfmmsfchcre, AV146Tmmovstwwds_17_tfmmsfchapl});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9420MMSEst = H00JC2_A9420MMSEst[0] ;
         n9420MMSEst = H00JC2_n9420MMSEst[0] ;
         A11304MMSFchApl = H00JC2_A11304MMSFchApl[0] ;
         n11304MMSFchApl = H00JC2_n11304MMSFchApl[0] ;
         A9418MMSFchCre = H00JC2_A9418MMSFchCre[0] ;
         n9418MMSFchCre = H00JC2_n9418MMSFchCre[0] ;
         A9417MMSUsuCre = H00JC2_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = H00JC2_n9417MMSUsuCre[0] ;
         A9419MMSNroExt = H00JC2_A9419MMSNroExt[0] ;
         n9419MMSNroExt = H00JC2_n9419MMSNroExt[0] ;
         A11509MMSDto = H00JC2_A11509MMSDto[0] ;
         n11509MMSDto = H00JC2_n11509MMSDto[0] ;
         A9414MMSPrvNum = H00JC2_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = H00JC2_n9414MMSPrvNum[0] ;
         A9415MMSPrvNom = H00JC2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = H00JC2_n9415MMSPrvNom[0] ;
         A9416MMSFch = H00JC2_A9416MMSFch[0] ;
         n9416MMSFch = H00JC2_n9416MMSFch[0] ;
         A9413MMSTpo = H00JC2_A9413MMSTpo[0] ;
         n9413MMSTpo = H00JC2_n9413MMSTpo[0] ;
         A9412MMSCod = H00JC2_A9412MMSCod[0] ;
         A407EmprNom = H00JC2_A407EmprNom[0] ;
         n407EmprNom = H00JC2_n407EmprNom[0] ;
         A396EmprCod = H00JC2_A396EmprCod[0] ;
         A407EmprNom = H00JC2_A407EmprNom[0] ;
         n407EmprNom = H00JC2_n407EmprNom[0] ;
         A9415MMSPrvNom = H00JC2_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = H00JC2_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV130Tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "entrada", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "salida", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en ingreso", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "aplicado", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cancelado", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, "C") == 0 ) ) ) )
         {
            if ( ( AV121GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9412MMSCod, 8, 0)), AV121GridCollapsedRecordsChildren) ) )
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

   public void rfJC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(48) ;
      /* Execute user event: Refresh */
      e23JC2 ();
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
         subsflControlProps_482( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A9413MMSTpo ,
                                              AV133Tmmovstwwds_4_tfmmstpo_sels ,
                                              A9420MMSEst ,
                                              AV147Tmmovstwwds_18_tfmmsest_sels ,
                                              Integer.valueOf(AV131Tmmovstwwds_2_tfmmscod) ,
                                              Integer.valueOf(AV132Tmmovstwwds_3_tfmmscod_to) ,
                                              Integer.valueOf(AV133Tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                              AV134Tmmovstwwds_5_tfmmsfch ,
                                              AV136Tmmovstwwds_7_tfmmsprvnom_sel ,
                                              AV135Tmmovstwwds_6_tfmmsprvnom ,
                                              Integer.valueOf(AV137Tmmovstwwds_8_tfmmsprvnum) ,
                                              Integer.valueOf(AV138Tmmovstwwds_9_tfmmsprvnum_to) ,
                                              AV139Tmmovstwwds_10_tfmmsdto ,
                                              AV140Tmmovstwwds_11_tfmmsdto_to ,
                                              AV142Tmmovstwwds_13_tfmmsnroext_sel ,
                                              AV141Tmmovstwwds_12_tfmmsnroext ,
                                              AV144Tmmovstwwds_15_tfmmsusucre_sel ,
                                              AV143Tmmovstwwds_14_tfmmsusucre ,
                                              AV145Tmmovstwwds_16_tfmmsfchcre ,
                                              AV146Tmmovstwwds_17_tfmmsfchapl ,
                                              Integer.valueOf(AV147Tmmovstwwds_18_tfmmsest_sels.size()) ,
                                              Integer.valueOf(A9412MMSCod) ,
                                              A9416MMSFch ,
                                              A9415MMSPrvNom ,
                                              Integer.valueOf(A9414MMSPrvNum) ,
                                              A11509MMSDto ,
                                              A9419MMSNroExt ,
                                              A9417MMSUsuCre ,
                                              A9418MMSFchCre ,
                                              A11304MMSFchApl ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV130Tmmovstwwds_1_filterfulltext ,
                                              Integer.valueOf(AV121GridCollapsedRecordsChildren.size()) ,
                                              A396EmprCod ,
                                              AV121GridCollapsedRecordsChildren } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING
                                              }
         });
         lV135Tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV135Tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
         lV141Tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV141Tmmovstwwds_12_tfmmsnroext), 20, "%") ;
         lV143Tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV143Tmmovstwwds_14_tfmmsusucre), 10, "%") ;
         /* Using cursor H00JC3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV131Tmmovstwwds_2_tfmmscod), Integer.valueOf(AV132Tmmovstwwds_3_tfmmscod_to), AV134Tmmovstwwds_5_tfmmsfch, lV135Tmmovstwwds_6_tfmmsprvnom, AV136Tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV137Tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV138Tmmovstwwds_9_tfmmsprvnum_to), AV139Tmmovstwwds_10_tfmmsdto, AV140Tmmovstwwds_11_tfmmsdto_to, lV141Tmmovstwwds_12_tfmmsnroext, AV142Tmmovstwwds_13_tfmmsnroext_sel, lV143Tmmovstwwds_14_tfmmsusucre, AV144Tmmovstwwds_15_tfmmsusucre_sel, AV145Tmmovstwwds_16_tfmmsfchcre, AV146Tmmovstwwds_17_tfmmsfchapl});
         nGXsfl_48_idx = 1 ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A9420MMSEst = H00JC3_A9420MMSEst[0] ;
            n9420MMSEst = H00JC3_n9420MMSEst[0] ;
            A11304MMSFchApl = H00JC3_A11304MMSFchApl[0] ;
            n11304MMSFchApl = H00JC3_n11304MMSFchApl[0] ;
            A9418MMSFchCre = H00JC3_A9418MMSFchCre[0] ;
            n9418MMSFchCre = H00JC3_n9418MMSFchCre[0] ;
            A9417MMSUsuCre = H00JC3_A9417MMSUsuCre[0] ;
            n9417MMSUsuCre = H00JC3_n9417MMSUsuCre[0] ;
            A9419MMSNroExt = H00JC3_A9419MMSNroExt[0] ;
            n9419MMSNroExt = H00JC3_n9419MMSNroExt[0] ;
            A11509MMSDto = H00JC3_A11509MMSDto[0] ;
            n11509MMSDto = H00JC3_n11509MMSDto[0] ;
            A9414MMSPrvNum = H00JC3_A9414MMSPrvNum[0] ;
            n9414MMSPrvNum = H00JC3_n9414MMSPrvNum[0] ;
            A9415MMSPrvNom = H00JC3_A9415MMSPrvNom[0] ;
            n9415MMSPrvNom = H00JC3_n9415MMSPrvNom[0] ;
            A9416MMSFch = H00JC3_A9416MMSFch[0] ;
            n9416MMSFch = H00JC3_n9416MMSFch[0] ;
            A9413MMSTpo = H00JC3_A9413MMSTpo[0] ;
            n9413MMSTpo = H00JC3_n9413MMSTpo[0] ;
            A9412MMSCod = H00JC3_A9412MMSCod[0] ;
            A407EmprNom = H00JC3_A407EmprNom[0] ;
            n407EmprNom = H00JC3_n407EmprNom[0] ;
            A396EmprCod = H00JC3_A396EmprCod[0] ;
            A407EmprNom = H00JC3_A407EmprNom[0] ;
            n407EmprNom = H00JC3_n407EmprNom[0] ;
            A9415MMSPrvNom = H00JC3_A9415MMSPrvNom[0] ;
            n9415MMSPrvNom = H00JC3_n9415MMSPrvNom[0] ;
            if ( (GXutil.strcmp("", AV130Tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "entrada", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "salida", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, "S") == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "en ingreso", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, "E") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "aplicado", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, "A") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "cancelado", "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, "C") == 0 ) ) ) )
            {
               if ( ( AV121GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A396EmprCod+";"+GXutil.trim( GXutil.str( A9412MMSCod, 8, 0)), AV121GridCollapsedRecordsChildren) ) )
               {
                  e24JC2 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(48) ;
         wbJC0( ) ;
      }
      bGXsfl_48_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesJC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV148Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV148Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV96EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96EmprCod, "@!"))));
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
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV148Pgmname = "TMMovStWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_48_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupJC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e22JC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV88DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV36ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV90GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV91GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_aplicar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Title") ;
         Dvelop_confirmpanel_aplicar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Confirmationtext") ;
         Dvelop_confirmpanel_aplicar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_aplicar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_aplicar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_aplicar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_aplicar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Confirmtype") ;
         Dvelop_confirmpanel_cancelar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Title") ;
         Dvelop_confirmpanel_cancelar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Confirmationtext") ;
         Dvelop_confirmpanel_cancelar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cancelar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_cancelar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cancelar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_cancelar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Confirmtype") ;
         Grid_group_Gridinternalname = httpContext.cgiGet( "GRID_GROUP_Gridinternalname") ;
         Grid_group_Columnindex = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_GROUP_Columnindex"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
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
         Dvelop_confirmpanel_aplicar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_APLICAR_Result") ;
         Dvelop_confirmpanel_cancelar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CANCELAR_Result") ;
         /* Read variables values. */
         AV98FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98FilterFullText", AV98FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mmsfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MMSFCHAUXDATE");
            GX_FocusControl = edtavDdo_mmsfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63DDO_MMSFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63DDO_MMSFchAuxDate", localUtil.format(AV63DDO_MMSFchAuxDate, "99/99/99"));
         }
         else
         {
            AV63DDO_MMSFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mmsfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63DDO_MMSFchAuxDate", localUtil.format(AV63DDO_MMSFchAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mmsfchcreauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MMSFCHCREAUXDATE");
            GX_FocusControl = edtavDdo_mmsfchcreauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71DDO_MMSFchCreAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71DDO_MMSFchCreAuxDate", localUtil.format(AV71DDO_MMSFchCreAuxDate, "99/99/99"));
         }
         else
         {
            AV71DDO_MMSFchCreAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mmsfchcreauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71DDO_MMSFchCreAuxDate", localUtil.format(AV71DDO_MMSFchCreAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_mmsfchaplauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_MMSFCHAPLAUXDATE");
            GX_FocusControl = edtavDdo_mmsfchaplauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76DDO_MMSFchAplAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_MMSFchAplAuxDate", localUtil.format(AV76DDO_MMSFchAplAuxDate, "99/99/99"));
         }
         else
         {
            AV76DDO_MMSFchAplAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_mmsfchaplauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_MMSFchAplAuxDate", localUtil.format(AV76DDO_MMSFchAplAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_48_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
         if ( nGXsfl_48_idx > 0 )
         {
            AV127Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV127Expand);
            AV116Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV116Grid_GroupCaption);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
            AV115DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV115DetailWebComponent);
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV114GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114GridActions), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            A9412MMSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            cmbMMSTpo.setName( cmbMMSTpo.getInternalname() );
            cmbMMSTpo.setValue( httpContext.cgiGet( cmbMMSTpo.getInternalname()) );
            A9413MMSTpo = httpContext.cgiGet( cmbMMSTpo.getInternalname()) ;
            n9413MMSTpo = false ;
            A9416MMSFch = localUtil.ctod( httpContext.cgiGet( edtMMSFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n9416MMSFch = false ;
            A9415MMSPrvNom = httpContext.cgiGet( edtMMSPrvNom_Internalname) ;
            n9415MMSPrvNom = false ;
            A9414MMSPrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtMMSPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9414MMSPrvNum = false ;
            A11509MMSDto = localUtil.ctond( httpContext.cgiGet( edtMMSDto_Internalname)) ;
            n11509MMSDto = false ;
            A9419MMSNroExt = httpContext.cgiGet( edtMMSNroExt_Internalname) ;
            n9419MMSNroExt = false ;
            A9417MMSUsuCre = httpContext.cgiGet( edtMMSUsuCre_Internalname) ;
            n9417MMSUsuCre = false ;
            A9418MMSFchCre = localUtil.ctot( httpContext.cgiGet( edtMMSFchCre_Internalname)) ;
            n9418MMSFchCre = false ;
            A11304MMSFchApl = localUtil.ctot( httpContext.cgiGet( edtMMSFchApl_Internalname)) ;
            n11304MMSFchApl = false ;
            cmbMMSEst.setName( cmbMMSEst.getInternalname() );
            cmbMMSEst.setValue( httpContext.cgiGet( cmbMMSEst.getInternalname()) );
            A9420MMSEst = httpContext.cgiGet( cmbMMSEst.getInternalname()) ;
            n9420MMSEst = false ;
         }
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
      e22JC2 ();
      if (returnInSub) return;
   }

   public void e22JC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV99Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmmovstww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV99Station = GXt_char1 ;
      GXv_char2[0] = AV96EmprCod ;
      GXv_char3[0] = AV97EmprNom ;
      GXv_char4[0] = AV102UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV99Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmmovstww_impl.this.AV96EmprCod = GXv_char2[0] ;
      tmmovstww_impl.this.AV97EmprNom = GXv_char3[0] ;
      tmmovstww_impl.this.AV102UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96EmprCod", AV96EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96EmprCod, "@!"))));
      GXt_char1 = AV99Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmmovstww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV99Station = GXt_char1 ;
      GXv_char4[0] = AV96EmprCod ;
      GXv_char3[0] = AV97EmprNom ;
      GXv_char2[0] = AV102UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV99Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmmovstww_impl.this.AV96EmprCod = GXv_char4[0] ;
      tmmovstww_impl.this.AV97EmprNom = GXv_char3[0] ;
      tmmovstww_impl.this.AV102UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96EmprCod", AV96EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96EmprCod, "@!"))));
      Grid_group_Gridinternalname = subGrid_Internalname ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "GridInternalName", Grid_group_Gridinternalname);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
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
      Form.setCaption( httpContext.getMessage( " Movimientos de Stock", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV88DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV88DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e23JC2( )
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
      if ( GXutil.strcmp(AV38Session.getValue("TMMovStWWColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV38Session.getValue("TMMovStWWColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMMSCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSCod_Visible), 5, 0), !bGXsfl_48_Refreshing);
      cmbMMSTpo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSTpo.getInternalname(), "Visible", GXutil.ltrimstr( cmbMMSTpo.getVisible(), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSFch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFch_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNom_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSPrvNum_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSDto_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSDto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSDto_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSNroExt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSNroExt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSNroExt_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSUsuCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSUsuCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSUsuCre_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSFchCre_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchCre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchCre_Visible), 5, 0), !bGXsfl_48_Refreshing);
      edtMMSFchApl_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMMSFchApl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMMSFchApl_Visible), 5, 0), !bGXsfl_48_Refreshing);
      cmbMMSEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbMMSEst.getVisible(), 5, 0), !bGXsfl_48_Refreshing);
      AV90GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90GridCurrentPage), 10, 0));
      AV91GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91GridPageCount), 10, 0));
      cmbMMSEst.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Columnheaderclass", cmbMMSEst.getColumnHeaderClass(), !bGXsfl_48_Refreshing);
      AV116Grid_GroupCaption = "" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV116Grid_GroupCaption);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
   }

   public void e12JC2( )
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
         AV89PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV89PageToGo) ;
      }
   }

   public void e13JC2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14JC2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) )
      {
         if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>") == 0 ) || ( GXutil.strcmp(GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0)), Ddo_grid_Selectedvalue_get) != 0 ) )
         {
            AV117GroupBy = ((GXutil.strcmp(AV117GroupBy, Ddo_grid_Selectedtext_get)==0) ? "" : Ddo_grid_Selectedtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117GroupBy", AV117GroupBy);
         }
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0)||(GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Group#>")==0)&&(GXutil.strcmp("", AV117GroupBy)==0)&&AV14OrderedDsc ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSCod") == 0 )
         {
            AV49TFMMSCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFMMSCod), 8, 0));
            AV50TFMMSCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMMSCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFMMSCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSTpo") == 0 )
         {
            AV52TFMMSTpo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFMMSTpo_SelsJson", AV52TFMMSTpo_SelsJson);
            AV53TFMMSTpo_Sels.fromJSonString(AV52TFMMSTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSFch") == 0 )
         {
            AV61TFMMSFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFMMSFch", localUtil.format(AV61TFMMSFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSPrvNom") == 0 )
         {
            AV58TFMMSPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFMMSPrvNom", AV58TFMMSPrvNom);
            AV59TFMMSPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFMMSPrvNom_Sel", AV59TFMMSPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSPrvNum") == 0 )
         {
            AV55TFMMSPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFMMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFMMSPrvNum), 6, 0));
            AV56TFMMSPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFMMSPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFMMSPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSDto") == 0 )
         {
            AV85TFMMSDto = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFMMSDto", GXutil.ltrimstr( AV85TFMMSDto, 6, 2));
            AV86TFMMSDto_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFMMSDto_To", GXutil.ltrimstr( AV86TFMMSDto_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSNroExt") == 0 )
         {
            AV79TFMMSNroExt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFMMSNroExt", AV79TFMMSNroExt);
            AV80TFMMSNroExt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFMMSNroExt_Sel", AV80TFMMSNroExt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSUsuCre") == 0 )
         {
            AV66TFMMSUsuCre = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFMMSUsuCre", AV66TFMMSUsuCre);
            AV67TFMMSUsuCre_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFMMSUsuCre_Sel", AV67TFMMSUsuCre_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSFchCre") == 0 )
         {
            AV69TFMMSFchCre = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFMMSFchCre", localUtil.ttoc( AV69TFMMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSFchApl") == 0 )
         {
            AV74TFMMSFchApl = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFMMSFchApl", localUtil.ttoc( AV74TFMMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MMSEst") == 0 )
         {
            AV82TFMMSEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFMMSEst_SelsJson", AV82TFMMSEst_SelsJson);
            AV83TFMMSEst_Sels.fromJSonString(AV82TFMMSEst_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFMMSEst_Sels", AV83TFMMSEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFMMSTpo_Sels", AV53TFMMSTpo_Sels);
   }

   private void e24JC2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         if ( GXutil.strcmp(AV117GroupBy, "MMSTpo") == 0 )
         {
            if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), httpContext.getMessage( "E", "")) == 0 )
            {
               AV116Grid_GroupCaption = httpContext.getMessage( "Entrada", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV116Grid_GroupCaption);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
            }
            else if ( GXutil.strcmp(GXutil.trim( A9413MMSTpo), httpContext.getMessage( "S", "")) == 0 )
            {
               AV116Grid_GroupCaption = httpContext.getMessage( "Salida", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV116Grid_GroupCaption);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
            }
            AV116Grid_GroupCaption = GXutil.format( "%1: %2", httpContext.getMessage( "Tipo", ""), AV116Grid_GroupCaption, "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGrid_groupcaption_Internalname, AV116Grid_GroupCaption);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( AV116Grid_GroupCaption, ""))));
            AV119GroupKey = GXutil.trim( A9413MMSTpo) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119GroupKey", AV119GroupKey);
         }
         AV123Index = AV122GridCollapsedRecords.indexof(AV119GroupKey) ;
         AV127Expand = ((AV123Index>0) ? "<i class=\"fas fa-angle-right\"></i>" : "<i class=\"fas fa-angle-down\"></i>") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavExpand_Internalname, AV127Expand);
         edtavExpand_Columnclass = ((AV123Index>0) ? "WWPExpand" : "WWPCollapse") ;
         AV115DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV115DetailWebComponent);
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         if ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Aplicar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 )
         {
            cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Cancelar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         }
         edtMMSCod_Link = formatLink("app.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "DSP", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9412MMSCod,8,0))}, new String[] {"Mode","EmprCod","MMSCod"})  ;
         if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "E") == 0 )
         {
            cmbMMSEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagWarning WWColumnTagWarningSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "A") == 0 )
         {
            cmbMMSEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" );
         }
         else if ( GXutil.strcmp(GXutil.trim( A9420MMSEst), "C") == 0 )
         {
            cmbMMSEst.setColumnClass( "WWColumn hidden-xs WWColumnTag WWColumnTagDanger WWColumnTagDangerSingleCell" );
         }
         else
         {
            cmbMMSEst.setColumnClass( httpContext.getMessage( "WWColumn hidden-xs", "") );
         }
         if ( AV121GridCollapsedRecordsChildren.size() == 0 )
         {
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(48) ;
         }
         sendrow_482( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_48_Refreshing )
      {
         httpContext.doAjaxLoad(48, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV114GridActions, 4, 0)) );
   }

   public void e15JC2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV36ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TMMovStWWColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV36ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
   }

   public void e11JC2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TMMovStWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV148Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TMMovStWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV40ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TMMovStWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tmmovstww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV148Pgmname+"GridState", AV40ManageFiltersXml) ;
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
            AV117GroupBy = AV10GridState.getgxTv_SdtWWPGridState_Groupby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117GroupBy", AV117GroupBy);
            AV122GridCollapsedRecords.fromJSonString(AV10GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
            if ( AV122GridCollapsedRecords.size() > 0 )
            {
               AV126AddChildren = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV126AddChildren", AV126AddChildren);
               AV149GXV1 = 1 ;
               while ( AV149GXV1 <= AV122GridCollapsedRecords.size() )
               {
                  AV119GroupKey = (String)AV122GridCollapsedRecords.elementAt(-1+AV149GXV1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV119GroupKey", AV119GroupKey);
                  /* Execute user subroutine: 'ADDREMOVECHILDREN' */
                  S262 ();
                  if (returnInSub) return;
                  AV149GXV1 = (int)(AV149GXV1+1) ;
               }
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFMMSTpo_Sels", AV53TFMMSTpo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFMMSEst_Sels", AV83TFMMSEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e25JC2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV114GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV114GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV114GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV114GridActions == 4 )
      {
         /* Execute user subroutine: 'DO APLICAR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV114GridActions == 5 )
      {
         /* Execute user subroutine: 'DO CANCELAR' */
         S232 ();
         if (returnInSub) return;
      }
      AV114GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV114GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e16JC2( )
   {
      /* Dvelop_confirmpanel_aplicar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_aplicar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION APLICAR' */
         S242 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
   }

   public void e17JC2( )
   {
      /* Dvelop_confirmpanel_cancelar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_cancelar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CANCELAR' */
         S252 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
   }

   public void e18JC2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV96EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","MMSCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 0 > 1 )
      {
         callWebObject(formatLink("app.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","MMSCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e19JC2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.tmmovstwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tmmovstww_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      tmmovstww_impl.this.AV33ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFMMSEst_Sels", AV83TFMMSEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFMMSTpo_Sels", AV53TFMMSTpo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
   }

   public void e20JC2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tmmovstwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFMMSEst_Sels", AV83TFMMSEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFMMSTpo_Sels", AV53TFMMSTpo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
   }

   public void e21JC2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tmmovstwwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFMMSEst_Sels", AV83TFMMSEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV53TFMMSTpo_Sels", AV53TFMMSTpo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
   }

   public void e26JC2( )
   {
      /* Expand_Click Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV117GroupBy, "MMSTpo") == 0 )
      {
         AV119GroupKey = GXutil.trim( A9413MMSTpo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119GroupKey", AV119GroupKey);
      }
      AV123Index = AV122GridCollapsedRecords.indexof(AV119GroupKey) ;
      if ( AV123Index > 0 )
      {
         AV122GridCollapsedRecords.removeItem((int)(AV123Index));
      }
      else
      {
         AV122GridCollapsedRecords.add(AV119GroupKey, 0);
      }
      AV126AddChildren = (0==AV123Index) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126AddChildren", AV126AddChildren);
      /* Execute user subroutine: 'ADDREMOVECHILDREN' */
      S262 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV122GridCollapsedRecords", AV122GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV121GridCollapsedRecordsChildren", AV121GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC")+((GXutil.strcmp("", AV117GroupBy)==0) ? "" : " GRP") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV36ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSCod", "", "Cod. Mov Stock", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSTpo", "", "Tipo", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSFch", "", "Fecha", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSPrvNom", "", "Proveedor", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSPrvNum", "", "Cod Proveedor", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSDto", "", "% Descuento", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSNroExt", "", "Nro Externo", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSUsuCre", "", "Usuario que crea", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSFchCre", "", "Fecha de Creación", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSFchApl", "", "Fecha de Aplicación", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MMSEst", "", "Estado", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV35UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TMMovStWWColumnsSelector", GXv_char4) ;
      tmmovstww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TMMovStWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV98FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98FilterFullText", AV98FilterFullText);
      AV49TFMMSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFMMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFMMSCod), 8, 0));
      AV50TFMMSCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFMMSCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFMMSCod_To), 8, 0));
      AV53TFMMSTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV61TFMMSFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFMMSFch", localUtil.format(AV61TFMMSFch, "99/99/99"));
      AV58TFMMSPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFMMSPrvNom", AV58TFMMSPrvNom);
      AV59TFMMSPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFMMSPrvNom_Sel", AV59TFMMSPrvNom_Sel);
      AV55TFMMSPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFMMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFMMSPrvNum), 6, 0));
      AV56TFMMSPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFMMSPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFMMSPrvNum_To), 6, 0));
      AV85TFMMSDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TFMMSDto", GXutil.ltrimstr( AV85TFMMSDto, 6, 2));
      AV86TFMMSDto_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFMMSDto_To", GXutil.ltrimstr( AV86TFMMSDto_To, 6, 2));
      AV79TFMMSNroExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFMMSNroExt", AV79TFMMSNroExt);
      AV80TFMMSNroExt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFMMSNroExt_Sel", AV80TFMMSNroExt_Sel);
      AV66TFMMSUsuCre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFMMSUsuCre", AV66TFMMSUsuCre);
      AV67TFMMSUsuCre_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFMMSUsuCre_Sel", AV67TFMMSUsuCre_Sel);
      AV69TFMMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFMMSFchCre", localUtil.ttoc( AV69TFMMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV74TFMMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFMMSFchApl", localUtil.ttoc( AV74TFMMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV83TFMMSEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV122GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV121GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
   }

   public void S192( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "DSP", ""))),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9412MMSCod,8,0))}, new String[] {"Mode","EmprCod","MMSCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9412MMSCod,8,0))}, new String[] {"Mode","EmprCod","MMSCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tmmovst", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A9412MMSCod,8,0))}, new String[] {"Mode","EmprCod","MMSCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO APLICAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A9420MMSEst, "E") != 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Estado %1, no válido para %2", cmbMMSEst.getDescription(), GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0), "", "", "", "", "", "", ""));
      }
      else
      {
         AV150Emprcod_selected = A396EmprCod ;
         AV151Mmscod_selected = A9412MMSCod ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_APLICARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S242( )
   {
      /* 'DO ACTION APLICAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A9412MMSCod ;
      new app.pmmsapl(remoteHandle, context).execute( GXv_char4, GXv_int12) ;
      tmmovstww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmmovstww_impl.this.A9412MMSCod = GXv_int12[0] ;
      gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
   }

   public void S232( )
   {
      /* 'DO CANCELAR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A9420MMSEst, "E") != 0 )
      {
         httpContext.GX_msglist.addItem(GXutil.format( "Estado %1, no válido para %2", cmbMMSEst.getDescription(), GXutil.ltrimstr( DecimalUtil.doubleToDec(A9412MMSCod), 8, 0), "", "", "", "", "", "", ""));
      }
      else
      {
         AV150Emprcod_selected = A396EmprCod ;
         AV151Mmscod_selected = A9412MMSCod ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CANCELARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S252( )
   {
      /* 'DO ACTION CANCELAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int12[0] = A9412MMSCod ;
      new app.pmmscan(remoteHandle, context).execute( GXv_char4, GXv_int12) ;
      tmmovstww_impl.this.A396EmprCod = GXv_char4[0] ;
      tmmovstww_impl.this.A9412MMSCod = GXv_int12[0] ;
      gxgrgrid_refresh( subGrid_Rows, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV98FilterFullText, AV49TFMMSCod, AV50TFMMSCod_To, AV53TFMMSTpo_Sels, AV61TFMMSFch, AV58TFMMSPrvNom, AV59TFMMSPrvNom_Sel, AV55TFMMSPrvNum, AV56TFMMSPrvNum_To, AV85TFMMSDto, AV86TFMMSDto_To, AV79TFMMSNroExt, AV80TFMMSNroExt_Sel, AV66TFMMSUsuCre, AV67TFMMSUsuCre_Sel, AV69TFMMSFchCre, AV74TFMMSFchApl, AV83TFMMSEst_Sels, AV148Pgmname, AV13OrderedBy, AV14OrderedDsc, AV117GroupBy, AV122GridCollapsedRecords, AV116Grid_GroupCaption, AV119GroupKey, AV121GridCollapsedRecordsChildren, AV96EmprCod) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV148Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV148Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV38Session.getValue(AV148Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV117GroupBy = AV10GridState.getgxTv_SdtWWPGridState_Groupby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117GroupBy", AV117GroupBy);
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
      AV122GridCollapsedRecords.fromJSonString(AV10GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
      if ( AV122GridCollapsedRecords.size() > 0 )
      {
         AV126AddChildren = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126AddChildren", AV126AddChildren);
         AV152GXV2 = 1 ;
         while ( AV152GXV2 <= AV122GridCollapsedRecords.size() )
         {
            AV119GroupKey = (String)AV122GridCollapsedRecords.elementAt(-1+AV152GXV2) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119GroupKey", AV119GroupKey);
            /* Execute user subroutine: 'ADDREMOVECHILDREN' */
            S262 ();
            if (returnInSub) return;
            AV152GXV2 = (int)(AV152GXV2+1) ;
         }
      }
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV153GXV3 = 1 ;
      while ( AV153GXV3 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV153GXV3));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV98FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98FilterFullText", AV98FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSCOD") == 0 )
         {
            AV49TFMMSCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFMMSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFMMSCod), 8, 0));
            AV50TFMMSCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFMMSCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFMMSCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSTPO_SEL") == 0 )
         {
            AV52TFMMSTpo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFMMSTpo_SelsJson", AV52TFMMSTpo_SelsJson);
            AV53TFMMSTpo_Sels.fromJSonString(AV52TFMMSTpo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCH") == 0 )
         {
            AV61TFMMSFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFMMSFch", localUtil.format(AV61TFMMSFch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM") == 0 )
         {
            AV58TFMMSPrvNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFMMSPrvNom", AV58TFMMSPrvNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNOM_SEL") == 0 )
         {
            AV59TFMMSPrvNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFMMSPrvNom_Sel", AV59TFMMSPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSPRVNUM") == 0 )
         {
            AV55TFMMSPrvNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFMMSPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFMMSPrvNum), 6, 0));
            AV56TFMMSPrvNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFMMSPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFMMSPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSDTO") == 0 )
         {
            AV85TFMMSDto = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85TFMMSDto", GXutil.ltrimstr( AV85TFMMSDto, 6, 2));
            AV86TFMMSDto_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFMMSDto_To", GXutil.ltrimstr( AV86TFMMSDto_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT") == 0 )
         {
            AV79TFMMSNroExt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFMMSNroExt", AV79TFMMSNroExt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSNROEXT_SEL") == 0 )
         {
            AV80TFMMSNroExt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFMMSNroExt_Sel", AV80TFMMSNroExt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE") == 0 )
         {
            AV66TFMMSUsuCre = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFMMSUsuCre", AV66TFMMSUsuCre);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSUSUCRE_SEL") == 0 )
         {
            AV67TFMMSUsuCre_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFMMSUsuCre_Sel", AV67TFMMSUsuCre_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHCRE") == 0 )
         {
            AV69TFMMSFchCre = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFMMSFchCre", localUtil.ttoc( AV69TFMMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV71DDO_MMSFchCreAuxDate = GXutil.resetTime(AV69TFMMSFchCre) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71DDO_MMSFchCreAuxDate", localUtil.format(AV71DDO_MMSFchCreAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSFCHAPL") == 0 )
         {
            AV74TFMMSFchApl = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFMMSFchApl", localUtil.ttoc( AV74TFMMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV76DDO_MMSFchAplAuxDate = GXutil.resetTime(AV74TFMMSFchApl) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76DDO_MMSFchAplAuxDate", localUtil.format(AV76DDO_MMSFchAplAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMMSEST_SEL") == 0 )
         {
            AV82TFMMSEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFMMSEst_SelsJson", AV82TFMMSEst_SelsJson);
            AV83TFMMSEst_Sels.fromJSonString(AV82TFMMSEst_SelsJson, null);
         }
         AV153GXV3 = (int)(AV153GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV53TFMMSTpo_Sels.size()==0), AV52TFMMSTpo_SelsJson, GXv_char4) ;
      tmmovstww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFMMSPrvNom_Sel)==0), AV59TFMMSPrvNom_Sel, GXv_char3) ;
      tmmovstww_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFMMSNroExt_Sel)==0), AV80TFMMSNroExt_Sel, GXv_char2) ;
      tmmovstww_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFMMSUsuCre_Sel)==0), AV67TFMMSUsuCre_Sel, GXv_char16) ;
      tmmovstww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV83TFMMSEst_Sels.size()==0), AV82TFMMSEst_SelsJson, GXv_char18) ;
      tmmovstww_impl.this.GXt_char17 = GXv_char18[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char13+"|||"+GXt_char14+"|"+GXt_char15+"|||"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFMMSPrvNom)==0), AV58TFMMSPrvNom, GXv_char18) ;
      tmmovstww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFMMSNroExt)==0), AV79TFMMSNroExt, GXv_char16) ;
      tmmovstww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFMMSUsuCre)==0), AV66TFMMSUsuCre, GXv_char4) ;
      tmmovstww_impl.this.GXt_char14 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV49TFMMSCod) ? "" : GXutil.str( AV49TFMMSCod, 8, 0))+"||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFMMSFch)) ? "" : localUtil.dtoc( AV61TFMMSFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char17+"|"+((0==AV55TFMMSPrvNum) ? "" : GXutil.str( AV55TFMMSPrvNum, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFMMSDto)==0) ? "" : GXutil.str( AV85TFMMSDto, 6, 2))+"|"+GXt_char15+"|"+GXt_char14+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV69TFMMSFchCre) ? "" : localUtil.dtoc( AV71DDO_MMSFchCreAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV74TFMMSFchApl) ? "" : localUtil.dtoc( AV76DDO_MMSFchAplAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV50TFMMSCod_To) ? "" : GXutil.str( AV50TFMMSCod_To, 8, 0))+"||||"+((0==AV56TFMMSPrvNum_To) ? "" : GXutil.str( AV56TFMMSPrvNum_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFMMSDto_To)==0) ? "" : GXutil.str( AV86TFMMSDto_To, 6, 2))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV38Session.getValue(AV148Pgmname+"GridState"), null, null);
      AV124OldGridState.fromxml(AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV98FilterFullText)==0), (short)(0), AV98FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSCOD", "", !((0==AV49TFMMSCod)&&(0==AV50TFMMSCod_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFMMSCod, 8, 0)), GXutil.trim( GXutil.str( AV50TFMMSCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSTPO_SEL", "", !(AV53TFMMSTpo_Sels.size()==0), (short)(0), AV53TFMMSTpo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV61TFMMSFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV61TFMMSFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSPRVNOM", "", !(GXutil.strcmp("", AV58TFMMSPrvNom)==0), (short)(0), AV58TFMMSPrvNom, "", !(GXutil.strcmp("", AV59TFMMSPrvNom_Sel)==0), AV59TFMMSPrvNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSPRVNUM", "", !((0==AV55TFMMSPrvNum)&&(0==AV56TFMMSPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFMMSPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV56TFMMSPrvNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSDTO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV85TFMMSDto)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV86TFMMSDto_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV85TFMMSDto, 6, 2)), GXutil.trim( GXutil.str( AV86TFMMSDto_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSNROEXT", "", !(GXutil.strcmp("", AV79TFMMSNroExt)==0), (short)(0), AV79TFMMSNroExt, "", !(GXutil.strcmp("", AV80TFMMSNroExt_Sel)==0), AV80TFMMSNroExt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSUSUCRE", "", !(GXutil.strcmp("", AV66TFMMSUsuCre)==0), (short)(0), AV66TFMMSUsuCre, "", !(GXutil.strcmp("", AV67TFMMSUsuCre_Sel)==0), AV67TFMMSUsuCre_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSFCHCRE", "", !GXutil.dateCompare(GXutil.nullDate(), AV69TFMMSFchCre), (short)(0), GXutil.trim( localUtil.ttoc( AV69TFMMSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSFCHAPL", "", !GXutil.dateCompare(GXutil.nullDate(), AV74TFMMSFchApl), (short)(0), GXutil.trim( localUtil.ttoc( AV74TFMMSFchApl, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      GXv_SdtWWPGridState19[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState19, "TFMMSEST_SEL", "", !(AV83TFMMSEst_Sels.size()==0), (short)(0), AV83TFMMSEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState19[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      AV10GridState.setgxTv_SdtWWPGridState_Groupby( AV117GroupBy );
      if ( ! (GXutil.strcmp("", AV117GroupBy)==0) && ! ( ( ( AV13OrderedBy == 1 ) && ( GXutil.strcmp(AV117GroupBy, "MMSTpo") == 0 ) ) ) )
      {
         AV117GroupBy = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117GroupBy", AV117GroupBy);
      }
      Grid_group_Columnindex = ((GXutil.strcmp("", AV117GroupBy)==0) ? -1 : 1) ;
      ucGrid_group.sendProperty(context, "", false, Grid_group_Internalname, "ColumnIndex", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid_group_Columnindex), 9, 0));
      if ( (GXutil.strcmp("", AV117GroupBy)==0) || new app.wwpbaseobjects.wwp_resetcollapsedrecords(remoteHandle, context).executeUdp( AV124OldGridState, AV10GridState) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV122GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "") ;
         AV121GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
      }
      AV10GridState.setgxTv_SdtWWPGridState_Collapsedrecords( AV122GridCollapsedRecords.toJSonString(false) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV148Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV148Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TMMovSt" );
      AV38Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S262( )
   {
      /* 'ADDREMOVECHILDREN' Routine */
      returnInSub = false ;
      AV125DiscardFirst = true ;
      AV120GroupMMSTpo = AV119GroupKey ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120GroupMMSTpo", AV120GroupMMSTpo);
      AV130Tmmovstwwds_1_filterfulltext = AV98FilterFullText ;
      AV131Tmmovstwwds_2_tfmmscod = AV49TFMMSCod ;
      AV132Tmmovstwwds_3_tfmmscod_to = AV50TFMMSCod_To ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = AV53TFMMSTpo_Sels ;
      AV134Tmmovstwwds_5_tfmmsfch = AV61TFMMSFch ;
      AV135Tmmovstwwds_6_tfmmsprvnom = AV58TFMMSPrvNom ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = AV59TFMMSPrvNom_Sel ;
      AV137Tmmovstwwds_8_tfmmsprvnum = AV55TFMMSPrvNum ;
      AV138Tmmovstwwds_9_tfmmsprvnum_to = AV56TFMMSPrvNum_To ;
      AV139Tmmovstwwds_10_tfmmsdto = AV85TFMMSDto ;
      AV140Tmmovstwwds_11_tfmmsdto_to = AV86TFMMSDto_To ;
      AV141Tmmovstwwds_12_tfmmsnroext = AV79TFMMSNroExt ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = AV80TFMMSNroExt_Sel ;
      AV143Tmmovstwwds_14_tfmmsusucre = AV66TFMMSUsuCre ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = AV67TFMMSUsuCre_Sel ;
      AV145Tmmovstwwds_16_tfmmsfchcre = AV69TFMMSFchCre ;
      AV146Tmmovstwwds_17_tfmmsfchapl = AV74TFMMSFchApl ;
      AV147Tmmovstwwds_18_tfmmsest_sels = AV83TFMMSEst_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A9413MMSTpo ,
                                           AV133Tmmovstwwds_4_tfmmstpo_sels ,
                                           A9420MMSEst ,
                                           AV147Tmmovstwwds_18_tfmmsest_sels ,
                                           Integer.valueOf(AV131Tmmovstwwds_2_tfmmscod) ,
                                           Integer.valueOf(AV132Tmmovstwwds_3_tfmmscod_to) ,
                                           Integer.valueOf(AV133Tmmovstwwds_4_tfmmstpo_sels.size()) ,
                                           AV134Tmmovstwwds_5_tfmmsfch ,
                                           AV136Tmmovstwwds_7_tfmmsprvnom_sel ,
                                           AV135Tmmovstwwds_6_tfmmsprvnom ,
                                           Integer.valueOf(AV137Tmmovstwwds_8_tfmmsprvnum) ,
                                           Integer.valueOf(AV138Tmmovstwwds_9_tfmmsprvnum_to) ,
                                           AV139Tmmovstwwds_10_tfmmsdto ,
                                           AV140Tmmovstwwds_11_tfmmsdto_to ,
                                           AV142Tmmovstwwds_13_tfmmsnroext_sel ,
                                           AV141Tmmovstwwds_12_tfmmsnroext ,
                                           AV144Tmmovstwwds_15_tfmmsusucre_sel ,
                                           AV143Tmmovstwwds_14_tfmmsusucre ,
                                           AV145Tmmovstwwds_16_tfmmsfchcre ,
                                           AV146Tmmovstwwds_17_tfmmsfchapl ,
                                           Integer.valueOf(AV147Tmmovstwwds_18_tfmmsest_sels.size()) ,
                                           AV117GroupBy ,
                                           Integer.valueOf(A9412MMSCod) ,
                                           A9416MMSFch ,
                                           A9415MMSPrvNom ,
                                           Integer.valueOf(A9414MMSPrvNum) ,
                                           A11509MMSDto ,
                                           A9419MMSNroExt ,
                                           A9417MMSUsuCre ,
                                           A9418MMSFchCre ,
                                           A11304MMSFchApl ,
                                           AV120GroupMMSTpo ,
                                           AV130Tmmovstwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV135Tmmovstwwds_6_tfmmsprvnom = GXutil.padr( GXutil.rtrim( AV135Tmmovstwwds_6_tfmmsprvnom), 30, "%") ;
      lV141Tmmovstwwds_12_tfmmsnroext = GXutil.padr( GXutil.rtrim( AV141Tmmovstwwds_12_tfmmsnroext), 20, "%") ;
      lV143Tmmovstwwds_14_tfmmsusucre = GXutil.padr( GXutil.rtrim( AV143Tmmovstwwds_14_tfmmsusucre), 10, "%") ;
      /* Using cursor H00JC4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV131Tmmovstwwds_2_tfmmscod), Integer.valueOf(AV132Tmmovstwwds_3_tfmmscod_to), AV134Tmmovstwwds_5_tfmmsfch, lV135Tmmovstwwds_6_tfmmsprvnom, AV136Tmmovstwwds_7_tfmmsprvnom_sel, Integer.valueOf(AV137Tmmovstwwds_8_tfmmsprvnum), Integer.valueOf(AV138Tmmovstwwds_9_tfmmsprvnum_to), AV139Tmmovstwwds_10_tfmmsdto, AV140Tmmovstwwds_11_tfmmsdto_to, lV141Tmmovstwwds_12_tfmmsnroext, AV142Tmmovstwwds_13_tfmmsnroext_sel, lV143Tmmovstwwds_14_tfmmsusucre, AV144Tmmovstwwds_15_tfmmsusucre_sel, AV145Tmmovstwwds_16_tfmmsfchcre, AV146Tmmovstwwds_17_tfmmsfchapl, AV120GroupMMSTpo});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A11304MMSFchApl = H00JC4_A11304MMSFchApl[0] ;
         n11304MMSFchApl = H00JC4_n11304MMSFchApl[0] ;
         A9418MMSFchCre = H00JC4_A9418MMSFchCre[0] ;
         n9418MMSFchCre = H00JC4_n9418MMSFchCre[0] ;
         A9417MMSUsuCre = H00JC4_A9417MMSUsuCre[0] ;
         n9417MMSUsuCre = H00JC4_n9417MMSUsuCre[0] ;
         A9419MMSNroExt = H00JC4_A9419MMSNroExt[0] ;
         n9419MMSNroExt = H00JC4_n9419MMSNroExt[0] ;
         A11509MMSDto = H00JC4_A11509MMSDto[0] ;
         n11509MMSDto = H00JC4_n11509MMSDto[0] ;
         A9414MMSPrvNum = H00JC4_A9414MMSPrvNum[0] ;
         n9414MMSPrvNum = H00JC4_n9414MMSPrvNum[0] ;
         A9415MMSPrvNom = H00JC4_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = H00JC4_n9415MMSPrvNom[0] ;
         A9416MMSFch = H00JC4_A9416MMSFch[0] ;
         n9416MMSFch = H00JC4_n9416MMSFch[0] ;
         A9412MMSCod = H00JC4_A9412MMSCod[0] ;
         A9420MMSEst = H00JC4_A9420MMSEst[0] ;
         n9420MMSEst = H00JC4_n9420MMSEst[0] ;
         A9413MMSTpo = H00JC4_A9413MMSTpo[0] ;
         n9413MMSTpo = H00JC4_n9413MMSTpo[0] ;
         A396EmprCod = H00JC4_A396EmprCod[0] ;
         A9415MMSPrvNom = H00JC4_A9415MMSPrvNom[0] ;
         n9415MMSPrvNom = H00JC4_n9415MMSPrvNom[0] ;
         if ( (GXutil.strcmp("", AV130Tmmovstwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A9412MMSCod, 8, 0) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "entrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "salida", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9413MMSTpo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9415MMSPrvNom) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9414MMSPrvNum, 6, 0) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A11509MMSDto, 6, 2) , GXutil.padr( "%" + AV130Tmmovstwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9419MMSNroExt) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9417MMSUsuCre) , GXutil.padr( "%" + GXutil.upper( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en ingreso", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "aplicado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cancelado", ""), "") , GXutil.padr( "%" + GXutil.lower( AV130Tmmovstwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A9420MMSEst, httpContext.getMessage( "C", "")) == 0 ) ) ) )
         {
            AV118RecordKey = A396EmprCod + ";" + GXutil.trim( GXutil.str( A9412MMSCod, 8, 0)) ;
            AV123Index = AV121GridCollapsedRecordsChildren.indexof(AV118RecordKey) ;
            if ( AV126AddChildren && ( AV123Index == 0 ) )
            {
               if ( ! AV125DiscardFirst )
               {
                  AV121GridCollapsedRecordsChildren.add(AV118RecordKey, 0);
               }
               else
               {
                  AV125DiscardFirst = false ;
               }
            }
            else
            {
               if ( ( ! AV126AddChildren ) && ( AV123Index > 0 ) )
               {
                  AV121GridCollapsedRecordsChildren.removeItem((int)(AV123Index));
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void wb_table3_83_JC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cancelar_Internalname, tblTabledvelop_confirmpanel_cancelar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cancelar.setProperty("Title", Dvelop_confirmpanel_cancelar_Title);
         ucDvelop_confirmpanel_cancelar.setProperty("ConfirmationText", Dvelop_confirmpanel_cancelar_Confirmationtext);
         ucDvelop_confirmpanel_cancelar.setProperty("YesButtonCaption", Dvelop_confirmpanel_cancelar_Yesbuttoncaption);
         ucDvelop_confirmpanel_cancelar.setProperty("NoButtonCaption", Dvelop_confirmpanel_cancelar_Nobuttoncaption);
         ucDvelop_confirmpanel_cancelar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cancelar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cancelar.setProperty("YesButtonPosition", Dvelop_confirmpanel_cancelar_Yesbuttonposition);
         ucDvelop_confirmpanel_cancelar.setProperty("ConfirmType", Dvelop_confirmpanel_cancelar_Confirmtype);
         ucDvelop_confirmpanel_cancelar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cancelar_Internalname, "DVELOP_CONFIRMPANEL_CANCELARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CANCELARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_83_JC2e( true) ;
      }
      else
      {
         wb_table3_83_JC2e( false) ;
      }
   }

   public void wb_table2_78_JC2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_aplicar_Internalname, tblTabledvelop_confirmpanel_aplicar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_aplicar.setProperty("Title", Dvelop_confirmpanel_aplicar_Title);
         ucDvelop_confirmpanel_aplicar.setProperty("ConfirmationText", Dvelop_confirmpanel_aplicar_Confirmationtext);
         ucDvelop_confirmpanel_aplicar.setProperty("YesButtonCaption", Dvelop_confirmpanel_aplicar_Yesbuttoncaption);
         ucDvelop_confirmpanel_aplicar.setProperty("NoButtonCaption", Dvelop_confirmpanel_aplicar_Nobuttoncaption);
         ucDvelop_confirmpanel_aplicar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_aplicar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_aplicar.setProperty("YesButtonPosition", Dvelop_confirmpanel_aplicar_Yesbuttonposition);
         ucDvelop_confirmpanel_aplicar.setProperty("ConfirmType", Dvelop_confirmpanel_aplicar_Confirmtype);
         ucDvelop_confirmpanel_aplicar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_aplicar_Internalname, "DVELOP_CONFIRMPANEL_APLICARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_APLICARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_78_JC2e( true) ;
      }
      else
      {
         wb_table2_78_JC2e( false) ;
      }
   }

   public void wb_table1_27_JC2( boolean wbgen )
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
         wb_table4_32_JC2( true) ;
      }
      else
      {
         wb_table4_32_JC2( false) ;
      }
      return  ;
   }

   public void wb_table4_32_JC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_JC2e( true) ;
      }
      else
      {
         wb_table1_27_JC2e( false) ;
      }
   }

   public void wb_table4_32_JC2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV98FilterFullText, GXutil.rtrim( localUtil.format( AV98FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TMMovStWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_32_JC2e( true) ;
      }
      else
      {
         wb_table4_32_JC2e( false) ;
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
      paJC2( ) ;
      wsJC2( ) ;
      weJC2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623143285", true, true);
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
      httpContext.AddJavascriptSource("tmmovstww.js", "?20263623143285", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_482( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_48_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_48_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_48_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_48_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_48_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_48_idx ;
      edtMMSCod_Internalname = "MMSCOD_"+sGXsfl_48_idx ;
      cmbMMSTpo.setInternalname( "MMSTPO_"+sGXsfl_48_idx );
      edtMMSFch_Internalname = "MMSFCH_"+sGXsfl_48_idx ;
      edtMMSPrvNom_Internalname = "MMSPRVNOM_"+sGXsfl_48_idx ;
      edtMMSPrvNum_Internalname = "MMSPRVNUM_"+sGXsfl_48_idx ;
      edtMMSDto_Internalname = "MMSDTO_"+sGXsfl_48_idx ;
      edtMMSNroExt_Internalname = "MMSNROEXT_"+sGXsfl_48_idx ;
      edtMMSUsuCre_Internalname = "MMSUSUCRE_"+sGXsfl_48_idx ;
      edtMMSFchCre_Internalname = "MMSFCHCRE_"+sGXsfl_48_idx ;
      edtMMSFchApl_Internalname = "MMSFCHAPL_"+sGXsfl_48_idx ;
      cmbMMSEst.setInternalname( "MMSEST_"+sGXsfl_48_idx );
   }

   public void subsflControlProps_fel_482( )
   {
      edtavExpand_Internalname = "vEXPAND_"+sGXsfl_48_fel_idx ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION_"+sGXsfl_48_fel_idx ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_48_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_48_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_48_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_48_fel_idx ;
      edtMMSCod_Internalname = "MMSCOD_"+sGXsfl_48_fel_idx ;
      cmbMMSTpo.setInternalname( "MMSTPO_"+sGXsfl_48_fel_idx );
      edtMMSFch_Internalname = "MMSFCH_"+sGXsfl_48_fel_idx ;
      edtMMSPrvNom_Internalname = "MMSPRVNOM_"+sGXsfl_48_fel_idx ;
      edtMMSPrvNum_Internalname = "MMSPRVNUM_"+sGXsfl_48_fel_idx ;
      edtMMSDto_Internalname = "MMSDTO_"+sGXsfl_48_fel_idx ;
      edtMMSNroExt_Internalname = "MMSNROEXT_"+sGXsfl_48_fel_idx ;
      edtMMSUsuCre_Internalname = "MMSUSUCRE_"+sGXsfl_48_fel_idx ;
      edtMMSFchCre_Internalname = "MMSFCHCRE_"+sGXsfl_48_fel_idx ;
      edtMMSFchApl_Internalname = "MMSFCHAPL_"+sGXsfl_48_fel_idx ;
      cmbMMSEst.setInternalname( "MMSEST_"+sGXsfl_48_fel_idx );
   }

   public void sendrow_482( )
   {
      subsflControlProps_482( ) ;
      wbJC0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'',false,'"+sGXsfl_48_idx+"',48)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExpand_Internalname,GXutil.rtrim( AV127Expand),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVEXPAND.CLICK."+sGXsfl_48_idx+"'","","","","",edtavExpand_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavExpand_Columnclass,"",Integer.valueOf(0),Integer.valueOf(edtavExpand_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'"+sGXsfl_48_idx+"',48)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_groupcaption_Internalname,AV116Grid_GroupCaption,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_groupcaption_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_groupcaption_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'',false,'"+sGXsfl_48_idx+"',48)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV115DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " "),"'"+""+"'"+",false,"+"'"+"e27jc2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_48_idx+"',48)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_48_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV114GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV114GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV114GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_48_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV114GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_48_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMMSCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSCod_Internalname,GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9412MMSCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'",edtMMSCod_Link,"","","",edtMMSCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMMSCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbMMSTpo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbMMSTpo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MMSTPO_" + sGXsfl_48_idx ;
            cmbMMSTpo.setName( GXCCtl );
            cmbMMSTpo.setWebtags( "" );
            cmbMMSTpo.addItem("E", httpContext.getMessage( "Entrada", ""), (short)(0));
            cmbMMSTpo.addItem("S", httpContext.getMessage( "Salida", ""), (short)(0));
            if ( cmbMMSTpo.getItemCount() > 0 )
            {
               A9413MMSTpo = cmbMMSTpo.getValidValue(A9413MMSTpo) ;
               n9413MMSTpo = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMMSTpo,cmbMMSTpo.getInternalname(),GXutil.rtrim( A9413MMSTpo),Integer.valueOf(1),cmbMMSTpo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbMMSTpo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbMMSTpo.setValue( GXutil.rtrim( A9413MMSTpo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMMSTpo.getInternalname(), "Values", cmbMMSTpo.ToJavascriptSource(), !bGXsfl_48_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMMSFch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSFch_Internalname,localUtil.format(A9416MMSFch, "99/99/99"),localUtil.format( A9416MMSFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMMSFch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMMSPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSPrvNom_Internalname,GXutil.rtrim( A9415MMSPrvNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMMSPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMMSPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A9414MMSPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9414MMSPrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs hidden-sm hidden-md hidden-lg","",Integer.valueOf(edtMMSPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMMSDto_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSDto_Internalname,GXutil.ltrim( localUtil.ntoc( A11509MMSDto, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11509MMSDto, "ZZ9.99%")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMMSDto_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMMSNroExt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSNroExt_Internalname,GXutil.rtrim( A9419MMSNroExt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSNroExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs hidden-sm hidden-md","",Integer.valueOf(edtMMSNroExt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMMSUsuCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSUsuCre_Internalname,GXutil.rtrim( A9417MMSUsuCre),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSUsuCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs hidden-sm hidden-md","",Integer.valueOf(edtMMSUsuCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMMSFchCre_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSFchCre_Internalname,localUtil.ttoc( A9418MMSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A9418MMSFchCre, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSFchCre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMMSFchCre_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMMSFchApl_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMMSFchApl_Internalname,localUtil.ttoc( A11304MMSFchApl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A11304MMSFchApl, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMMSFchApl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs hidden-sm hidden-md","",Integer.valueOf(edtMMSFchApl_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbMMSEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbMMSEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "MMSEST_" + sGXsfl_48_idx ;
            cmbMMSEst.setName( GXCCtl );
            cmbMMSEst.setWebtags( "" );
            cmbMMSEst.addItem("E", httpContext.getMessage( "En ingreso", ""), (short)(0));
            cmbMMSEst.addItem("A", httpContext.getMessage( "Aplicado", ""), (short)(0));
            cmbMMSEst.addItem("C", httpContext.getMessage( "Cancelado", ""), (short)(0));
            if ( cmbMMSEst.getItemCount() > 0 )
            {
               A9420MMSEst = cmbMMSEst.getValidValue(A9420MMSEst) ;
               n9420MMSEst = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMMSEst,cmbMMSEst.getInternalname(),GXutil.rtrim( A9420MMSEst),Integer.valueOf(1),cmbMMSEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbMMSEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbMMSEst.getColumnClass(),cmbMMSEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbMMSEst.setValue( GXutil.rtrim( A9420MMSEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMMSEst.getInternalname(), "Values", cmbMMSEst.ToJavascriptSource(), !bGXsfl_48_Refreshing);
         send_integrity_lvl_hashesJC2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Mov Stock", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbMMSTpo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSFch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSDto_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "% Descuento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSNroExt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nro Externo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSUsuCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario que crea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSFchCre_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha de Creación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMMSFchApl_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha de Aplicación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbMMSEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV127Expand));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExpand_Columnclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExpand_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV116Grid_GroupCaption);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_groupcaption_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV115DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV114GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9412MMSCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtMMSCod_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9413MMSTpo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbMMSTpo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A9416MMSFch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSFch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9415MMSPrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9414MMSPrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11509MMSDto, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSDto_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9419MMSNroExt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSNroExt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9417MMSUsuCre));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSUsuCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A9418MMSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSFchCre_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A11304MMSFchApl, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMMSFchApl_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9420MMSEst));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbMMSEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbMMSEst.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbMMSEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      edtavExpand_Internalname = "vEXPAND" ;
      edtavGrid_groupcaption_Internalname = "vGRID_GROUPCAPTION" ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtMMSCod_Internalname = "MMSCOD" ;
      cmbMMSTpo.setInternalname( "MMSTPO" );
      edtMMSFch_Internalname = "MMSFCH" ;
      edtMMSPrvNom_Internalname = "MMSPRVNOM" ;
      edtMMSPrvNum_Internalname = "MMSPRVNUM" ;
      edtMMSDto_Internalname = "MMSDTO" ;
      edtMMSNroExt_Internalname = "MMSNROEXT" ;
      edtMMSUsuCre_Internalname = "MMSUSUCRE" ;
      edtMMSFchCre_Internalname = "MMSFCHCRE" ;
      edtMMSFchApl_Internalname = "MMSFCHAPL" ;
      cmbMMSEst.setInternalname( "MMSEST" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablagrids_Internalname = "TABLAGRIDS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_aplicar_Internalname = "DVELOP_CONFIRMPANEL_APLICAR" ;
      tblTabledvelop_confirmpanel_aplicar_Internalname = "TABLEDVELOP_CONFIRMPANEL_APLICAR" ;
      Dvelop_confirmpanel_cancelar_Internalname = "DVELOP_CONFIRMPANEL_CANCELAR" ;
      tblTabledvelop_confirmpanel_cancelar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CANCELAR" ;
      Grid_group_Internalname = "GRID_GROUP" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_mmsfchauxdate_Internalname = "vDDO_MMSFCHAUXDATE" ;
      divDdo_mmsfchauxdates_Internalname = "DDO_MMSFCHAUXDATES" ;
      edtavDdo_mmsfchcreauxdate_Internalname = "vDDO_MMSFCHCREAUXDATE" ;
      divDdo_mmsfchcreauxdates_Internalname = "DDO_MMSFCHCREAUXDATES" ;
      edtavDdo_mmsfchaplauxdate_Internalname = "vDDO_MMSFCHAPLAUXDATE" ;
      divDdo_mmsfchaplauxdates_Internalname = "DDO_MMSFCHAPLAUXDATES" ;
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
      cmbMMSEst.setJsonclick( "" );
      cmbMMSEst.setColumnClass( "WWColumn hidden-xs" );
      edtMMSFchApl_Jsonclick = "" ;
      edtMMSFchCre_Jsonclick = "" ;
      edtMMSUsuCre_Jsonclick = "" ;
      edtMMSNroExt_Jsonclick = "" ;
      edtMMSDto_Jsonclick = "" ;
      edtMMSPrvNum_Jsonclick = "" ;
      edtMMSPrvNom_Jsonclick = "" ;
      edtMMSFch_Jsonclick = "" ;
      cmbMMSTpo.setJsonclick( "" );
      edtMMSCod_Jsonclick = "" ;
      edtMMSCod_Link = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavGrid_groupcaption_Jsonclick = "" ;
      edtavGrid_groupcaption_Visible = 0 ;
      edtavGrid_groupcaption_Enabled = 1 ;
      edtavExpand_Jsonclick = "" ;
      edtavExpand_Columnclass = "WWIconActionColumn" ;
      edtavExpand_Visible = 0 ;
      edtavExpand_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbMMSEst.setColumnHeaderClass( "" );
      cmbMMSEst.setVisible( -1 );
      edtMMSFchApl_Visible = -1 ;
      edtMMSFchCre_Visible = -1 ;
      edtMMSUsuCre_Visible = -1 ;
      edtMMSNroExt_Visible = -1 ;
      edtMMSDto_Visible = -1 ;
      edtMMSPrvNum_Visible = -1 ;
      edtMMSPrvNom_Visible = -1 ;
      edtMMSFch_Visible = -1 ;
      cmbMMSTpo.setVisible( -1 );
      edtMMSCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_mmsfchaplauxdate_Jsonclick = "" ;
      edtavDdo_mmsfchcreauxdate_Jsonclick = "" ;
      edtavDdo_mmsfchauxdate_Jsonclick = "" ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      cmbMMSEst.setDescription( "" );
      Grid_empowerer_Fixedcolumns = ";;;L;;;;;;;;;;;;;" ;
      Grid_empowerer_Hasrowgroups = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_group_Columnindex = 1 ;
      Dvelop_confirmpanel_cancelar_Confirmtype = "1" ;
      Dvelop_confirmpanel_cancelar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cancelar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cancelar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cancelar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cancelar_Confirmationtext = "¿Deseas Cancelar?" ;
      Dvelop_confirmpanel_cancelar_Title = "" ;
      Dvelop_confirmpanel_aplicar_Confirmtype = "1" ;
      Dvelop_confirmpanel_aplicar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_aplicar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_aplicar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_aplicar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_aplicar_Confirmationtext = "¿Desea Aplicar?" ;
      Dvelop_confirmpanel_aplicar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TMMovStWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|E:Entrada,S:Salida|||||||||E:En ingreso,A:Aplicado,C:Cancelado" ;
      Ddo_grid_Allowmultipleselection = "|T|||||||||T" ;
      Ddo_grid_Datalisttype = "|FixedValues||Dynamic|||Dynamic|Dynamic|||FixedValues" ;
      Ddo_grid_Includedatalist = "|T||T|||T|T|||T" ;
      Ddo_grid_Filterisrange = "T||||T|T|||||" ;
      Ddo_grid_Filtertype = "Numeric||Date|Character|Numeric|Numeric|Character|Character|Date|Date|" ;
      Ddo_grid_Includefilter = "T||T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Allowgroup = "|T|||||||||" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "6:MMSCod|7:MMSTpo|8:MMSFch|9:MMSPrvNom|10:MMSPrvNum|11:MMSDto|12:MMSNroExt|13:MMSUsuCre|14:MMSFchCre|15:MMSFchApl|16:MMSEst" ;
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
      Form.setCaption( httpContext.getMessage( " Movimientos de Stock", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_48_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV114GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV114GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114GridActions), 4, 0));
      }
      GXCCtl = "MMSTPO_" + sGXsfl_48_idx ;
      cmbMMSTpo.setName( GXCCtl );
      cmbMMSTpo.setWebtags( "" );
      cmbMMSTpo.addItem("E", httpContext.getMessage( "Entrada", ""), (short)(0));
      cmbMMSTpo.addItem("S", httpContext.getMessage( "Salida", ""), (short)(0));
      if ( cmbMMSTpo.getItemCount() > 0 )
      {
         A9413MMSTpo = cmbMMSTpo.getValidValue(A9413MMSTpo) ;
         n9413MMSTpo = false ;
      }
      GXCCtl = "MMSEST_" + sGXsfl_48_idx ;
      cmbMMSEst.setName( GXCCtl );
      cmbMMSEst.setWebtags( "" );
      cmbMMSEst.addItem("E", httpContext.getMessage( "En ingreso", ""), (short)(0));
      cmbMMSEst.addItem("A", httpContext.getMessage( "Aplicado", ""), (short)(0));
      cmbMMSEst.addItem("C", httpContext.getMessage( "Cancelado", ""), (short)(0));
      if ( cmbMMSEst.getItemCount() > 0 )
      {
         A9420MMSEst = cmbMMSEst.getValidValue(A9420MMSEst) ;
         n9420MMSEst = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMMSCod_Visible',ctrl:'MMSCOD',prop:'Visible'},{av:'cmbMMSTpo'},{av:'edtMMSFch_Visible',ctrl:'MMSFCH',prop:'Visible'},{av:'edtMMSPrvNom_Visible',ctrl:'MMSPRVNOM',prop:'Visible'},{av:'edtMMSPrvNum_Visible',ctrl:'MMSPRVNUM',prop:'Visible'},{av:'edtMMSDto_Visible',ctrl:'MMSDTO',prop:'Visible'},{av:'edtMMSNroExt_Visible',ctrl:'MMSNROEXT',prop:'Visible'},{av:'edtMMSUsuCre_Visible',ctrl:'MMSUSUCRE',prop:'Visible'},{av:'edtMMSFchCre_Visible',ctrl:'MMSFCHCRE',prop:'Visible'},{av:'edtMMSFchApl_Visible',ctrl:'MMSFCHAPL',prop:'Visible'},{av:'cmbMMSEst'},{av:'AV90GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV91GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12JC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13JC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14JC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedtext_get',ctrl:'DDO_GRID',prop:'SelectedText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e24JC2',iparms:[{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'cmbMMSTpo'},{av:'A9413MMSTpo',fld:'MMSTPO',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'cmbMMSEst'},{av:'A9420MMSEst',fld:'MMSEST',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV127Expand',fld:'vEXPAND',pic:''},{av:'edtavExpand_Columnclass',ctrl:'vEXPAND',prop:'Columnclass'},{av:'AV115DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'cmbavGridactions'},{av:'AV114GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtMMSCod_Link',ctrl:'MMSCOD',prop:'Link'},{av:'cmbMMSEst'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15JC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMMSCod_Visible',ctrl:'MMSCOD',prop:'Visible'},{av:'cmbMMSTpo'},{av:'edtMMSFch_Visible',ctrl:'MMSFCH',prop:'Visible'},{av:'edtMMSPrvNom_Visible',ctrl:'MMSPRVNOM',prop:'Visible'},{av:'edtMMSPrvNum_Visible',ctrl:'MMSPRVNUM',prop:'Visible'},{av:'edtMMSDto_Visible',ctrl:'MMSDTO',prop:'Visible'},{av:'edtMMSNroExt_Visible',ctrl:'MMSNROEXT',prop:'Visible'},{av:'edtMMSUsuCre_Visible',ctrl:'MMSUSUCRE',prop:'Visible'},{av:'edtMMSFchCre_Visible',ctrl:'MMSFCHCRE',prop:'Visible'},{av:'edtMMSFchApl_Visible',ctrl:'MMSFCHAPL',prop:'Visible'},{av:'cmbMMSEst'},{av:'AV90GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV91GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11JC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'cmbMMSTpo'},{av:'A9413MMSTpo',fld:'MMSTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'AV120GroupMMSTpo',fld:'vGROUPMMSTPO',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMMSCod_Visible',ctrl:'MMSCOD',prop:'Visible'},{av:'cmbMMSTpo'},{av:'edtMMSFch_Visible',ctrl:'MMSFCH',prop:'Visible'},{av:'edtMMSPrvNom_Visible',ctrl:'MMSPRVNOM',prop:'Visible'},{av:'edtMMSPrvNum_Visible',ctrl:'MMSPRVNUM',prop:'Visible'},{av:'edtMMSDto_Visible',ctrl:'MMSDTO',prop:'Visible'},{av:'edtMMSNroExt_Visible',ctrl:'MMSNROEXT',prop:'Visible'},{av:'edtMMSUsuCre_Visible',ctrl:'MMSUSUCRE',prop:'Visible'},{av:'edtMMSFchCre_Visible',ctrl:'MMSFCHCRE',prop:'Visible'},{av:'edtMMSFchApl_Visible',ctrl:'MMSFCHAPL',prop:'Visible'},{av:'cmbMMSEst'},{av:'AV90GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV91GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e25JC2',iparms:[{av:'cmbavGridactions'},{av:'AV114GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'cmbMMSEst'},{av:'A9420MMSEst',fld:'MMSEST',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV114GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_APLICAR.CLOSE","{handler:'e16JC2',iparms:[{av:'Dvelop_confirmpanel_aplicar_Result',ctrl:'DVELOP_CONFIRMPANEL_APLICAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_APLICAR.CLOSE",",oparms:[{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMMSCod_Visible',ctrl:'MMSCOD',prop:'Visible'},{av:'cmbMMSTpo'},{av:'edtMMSFch_Visible',ctrl:'MMSFCH',prop:'Visible'},{av:'edtMMSPrvNom_Visible',ctrl:'MMSPRVNOM',prop:'Visible'},{av:'edtMMSPrvNum_Visible',ctrl:'MMSPRVNUM',prop:'Visible'},{av:'edtMMSDto_Visible',ctrl:'MMSDTO',prop:'Visible'},{av:'edtMMSNroExt_Visible',ctrl:'MMSNROEXT',prop:'Visible'},{av:'edtMMSUsuCre_Visible',ctrl:'MMSUSUCRE',prop:'Visible'},{av:'edtMMSFchCre_Visible',ctrl:'MMSFCHCRE',prop:'Visible'},{av:'edtMMSFchApl_Visible',ctrl:'MMSFCHAPL',prop:'Visible'},{av:'cmbMMSEst'},{av:'AV90GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV91GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CANCELAR.CLOSE","{handler:'e17JC2',iparms:[{av:'Dvelop_confirmpanel_cancelar_Result',ctrl:'DVELOP_CONFIRMPANEL_CANCELAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CANCELAR.CLOSE",",oparms:[{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMMSCod_Visible',ctrl:'MMSCOD',prop:'Visible'},{av:'cmbMMSTpo'},{av:'edtMMSFch_Visible',ctrl:'MMSFCH',prop:'Visible'},{av:'edtMMSPrvNom_Visible',ctrl:'MMSPRVNOM',prop:'Visible'},{av:'edtMMSPrvNum_Visible',ctrl:'MMSPRVNUM',prop:'Visible'},{av:'edtMMSDto_Visible',ctrl:'MMSDTO',prop:'Visible'},{av:'edtMMSNroExt_Visible',ctrl:'MMSNROEXT',prop:'Visible'},{av:'edtMMSUsuCre_Visible',ctrl:'MMSUSUCRE',prop:'Visible'},{av:'edtMMSFchCre_Visible',ctrl:'MMSFCHCRE',prop:'Visible'},{av:'edtMMSFchApl_Visible',ctrl:'MMSFCHAPL',prop:'Visible'},{av:'cmbMMSEst'},{av:'AV90GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV91GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e18JC2',iparms:[{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e19JC2',iparms:[{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'cmbMMSTpo'},{av:'A9413MMSTpo',fld:'MMSTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV120GroupMMSTpo',fld:'vGROUPMMSTPO',pic:''}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e20JC2',iparms:[{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'cmbMMSTpo'},{av:'A9413MMSTpo',fld:'MMSTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV120GroupMMSTpo',fld:'vGROUPMMSTPO',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e21JC2',iparms:[{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'cmbMMSTpo'},{av:'A9413MMSTpo',fld:'MMSTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV82TFMMSEst_SelsJson',fld:'vTFMMSEST_SELSJSON',pic:''},{av:'AV76DDO_MMSFchAplAuxDate',fld:'vDDO_MMSFCHAPLAUXDATE',pic:''},{av:'AV71DDO_MMSFchCreAuxDate',fld:'vDDO_MMSFCHCREAUXDATE',pic:''},{av:'AV52TFMMSTpo_SelsJson',fld:'vTFMMSTPO_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV120GroupMMSTpo',fld:'vGROUPMMSTPO',pic:''}]}");
      setEventMetadata("VEXPAND.CLICK","{handler:'e26JC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV98FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49TFMMSCod',fld:'vTFMMSCOD',pic:'ZZZZZZZ9'},{av:'AV50TFMMSCod_To',fld:'vTFMMSCOD_TO',pic:'ZZZZZZZ9'},{av:'AV53TFMMSTpo_Sels',fld:'vTFMMSTPO_SELS',pic:''},{av:'AV61TFMMSFch',fld:'vTFMMSFCH',pic:''},{av:'AV58TFMMSPrvNom',fld:'vTFMMSPRVNOM',pic:''},{av:'AV59TFMMSPrvNom_Sel',fld:'vTFMMSPRVNOM_SEL',pic:''},{av:'AV55TFMMSPrvNum',fld:'vTFMMSPRVNUM',pic:'ZZZZZ9'},{av:'AV56TFMMSPrvNum_To',fld:'vTFMMSPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV85TFMMSDto',fld:'vTFMMSDTO',pic:'ZZ9.99%'},{av:'AV86TFMMSDto_To',fld:'vTFMMSDTO_TO',pic:'ZZ9.99%'},{av:'AV79TFMMSNroExt',fld:'vTFMMSNROEXT',pic:''},{av:'AV80TFMMSNroExt_Sel',fld:'vTFMMSNROEXT_SEL',pic:''},{av:'AV66TFMMSUsuCre',fld:'vTFMMSUSUCRE',pic:''},{av:'AV67TFMMSUsuCre_Sel',fld:'vTFMMSUSUCRE_SEL',pic:''},{av:'AV69TFMMSFchCre',fld:'vTFMMSFCHCRE',pic:'99/99/99 99:99'},{av:'AV74TFMMSFchApl',fld:'vTFMMSFCHAPL',pic:'99/99/99 99:99'},{av:'AV83TFMMSEst_Sels',fld:'vTFMMSEST_SELS',pic:''},{av:'AV148Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV96EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'cmbMMSTpo'},{av:'A9413MMSTpo',fld:'MMSTPO',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''}]");
      setEventMetadata("VEXPAND.CLICK",",oparms:[{av:'AV119GroupKey',fld:'vGROUPKEY',pic:''},{av:'AV122GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV126AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV120GroupMMSTpo',fld:'vGROUPMMSTPO',pic:''},{av:'AV121GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMMSCod_Visible',ctrl:'MMSCOD',prop:'Visible'},{av:'cmbMMSTpo'},{av:'edtMMSFch_Visible',ctrl:'MMSFCH',prop:'Visible'},{av:'edtMMSPrvNom_Visible',ctrl:'MMSPRVNOM',prop:'Visible'},{av:'edtMMSPrvNum_Visible',ctrl:'MMSPRVNUM',prop:'Visible'},{av:'edtMMSDto_Visible',ctrl:'MMSDTO',prop:'Visible'},{av:'edtMMSNroExt_Visible',ctrl:'MMSNROEXT',prop:'Visible'},{av:'edtMMSUsuCre_Visible',ctrl:'MMSUSUCRE',prop:'Visible'},{av:'edtMMSFchCre_Visible',ctrl:'MMSFCHCRE',prop:'Visible'},{av:'edtMMSFchApl_Visible',ctrl:'MMSFCHAPL',prop:'Visible'},{av:'cmbMMSEst'},{av:'AV90GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV91GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV116Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV117GroupBy',fld:'vGROUPBY',pic:''},{av:'Grid_group_Columnindex',ctrl:'GRID_GROUP',prop:'ColumnIndex'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e27JC2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9412MMSCod',fld:'MMSCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MMSCOD","{handler:'valid_Mmscod',iparms:[]");
      setEventMetadata("VALID_MMSCOD",",oparms:[]}");
      setEventMetadata("VALID_MMSTPO","{handler:'valid_Mmstpo',iparms:[]");
      setEventMetadata("VALID_MMSTPO",",oparms:[]}");
      setEventMetadata("VALID_MMSPRVNOM","{handler:'valid_Mmsprvnom',iparms:[]");
      setEventMetadata("VALID_MMSPRVNOM",",oparms:[]}");
      setEventMetadata("VALID_MMSPRVNUM","{handler:'valid_Mmsprvnum',iparms:[]");
      setEventMetadata("VALID_MMSPRVNUM",",oparms:[]}");
      setEventMetadata("VALID_MMSDTO","{handler:'valid_Mmsdto',iparms:[]");
      setEventMetadata("VALID_MMSDTO",",oparms:[]}");
      setEventMetadata("VALID_MMSNROEXT","{handler:'valid_Mmsnroext',iparms:[]");
      setEventMetadata("VALID_MMSNROEXT",",oparms:[]}");
      setEventMetadata("VALID_MMSUSUCRE","{handler:'valid_Mmsusucre',iparms:[]");
      setEventMetadata("VALID_MMSUSUCRE",",oparms:[]}");
      setEventMetadata("VALID_MMSEST","{handler:'valid_Mmsest',iparms:[]");
      setEventMetadata("VALID_MMSEST",",oparms:[]}");
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
      Dvelop_confirmpanel_aplicar_Result = "" ;
      Dvelop_confirmpanel_cancelar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV98FilterFullText = "" ;
      AV53TFMMSTpo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV61TFMMSFch = GXutil.nullDate() ;
      AV58TFMMSPrvNom = "" ;
      AV59TFMMSPrvNom_Sel = "" ;
      AV85TFMMSDto = DecimalUtil.ZERO ;
      AV86TFMMSDto_To = DecimalUtil.ZERO ;
      AV79TFMMSNroExt = "" ;
      AV80TFMMSNroExt_Sel = "" ;
      AV66TFMMSUsuCre = "" ;
      AV67TFMMSUsuCre_Sel = "" ;
      AV69TFMMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      AV74TFMMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      AV83TFMMSEst_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV148Pgmname = "" ;
      AV117GroupBy = "" ;
      AV122GridCollapsedRecords = new GXSimpleCollection<String>(String.class, "internal", "");
      AV116Grid_GroupCaption = "" ;
      AV119GroupKey = "" ;
      AV121GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "");
      AV96EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV88DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV52TFMMSTpo_SelsJson = "" ;
      AV82TFMMSEst_SelsJson = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_group_Gridinternalname = "" ;
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
      ucGrid_group = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV63DDO_MMSFchAuxDate = GXutil.nullDate() ;
      AV71DDO_MMSFchCreAuxDate = GXutil.nullDate() ;
      AV76DDO_MMSFchAplAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV127Expand = "" ;
      AV115DetailWebComponent = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A9413MMSTpo = "" ;
      A9416MMSFch = GXutil.nullDate() ;
      A9415MMSPrvNom = "" ;
      A11509MMSDto = DecimalUtil.ZERO ;
      A9419MMSNroExt = "" ;
      A9417MMSUsuCre = "" ;
      A9418MMSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A11304MMSFchApl = GXutil.resetTime( GXutil.nullDate() );
      A9420MMSEst = "" ;
      AV130Tmmovstwwds_1_filterfulltext = "" ;
      AV133Tmmovstwwds_4_tfmmstpo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV134Tmmovstwwds_5_tfmmsfch = GXutil.nullDate() ;
      AV135Tmmovstwwds_6_tfmmsprvnom = "" ;
      AV136Tmmovstwwds_7_tfmmsprvnom_sel = "" ;
      AV139Tmmovstwwds_10_tfmmsdto = DecimalUtil.ZERO ;
      AV140Tmmovstwwds_11_tfmmsdto_to = DecimalUtil.ZERO ;
      AV141Tmmovstwwds_12_tfmmsnroext = "" ;
      AV142Tmmovstwwds_13_tfmmsnroext_sel = "" ;
      AV143Tmmovstwwds_14_tfmmsusucre = "" ;
      AV144Tmmovstwwds_15_tfmmsusucre_sel = "" ;
      AV145Tmmovstwwds_16_tfmmsfchcre = GXutil.resetTime( GXutil.nullDate() );
      AV146Tmmovstwwds_17_tfmmsfchapl = GXutil.resetTime( GXutil.nullDate() );
      AV147Tmmovstwwds_18_tfmmsest_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV135Tmmovstwwds_6_tfmmsprvnom = "" ;
      lV141Tmmovstwwds_12_tfmmsnroext = "" ;
      lV143Tmmovstwwds_14_tfmmsusucre = "" ;
      H00JC2_A9420MMSEst = new String[] {""} ;
      H00JC2_n9420MMSEst = new boolean[] {false} ;
      H00JC2_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC2_n11304MMSFchApl = new boolean[] {false} ;
      H00JC2_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC2_n9418MMSFchCre = new boolean[] {false} ;
      H00JC2_A9417MMSUsuCre = new String[] {""} ;
      H00JC2_n9417MMSUsuCre = new boolean[] {false} ;
      H00JC2_A9419MMSNroExt = new String[] {""} ;
      H00JC2_n9419MMSNroExt = new boolean[] {false} ;
      H00JC2_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00JC2_n11509MMSDto = new boolean[] {false} ;
      H00JC2_A9414MMSPrvNum = new int[1] ;
      H00JC2_n9414MMSPrvNum = new boolean[] {false} ;
      H00JC2_A9415MMSPrvNom = new String[] {""} ;
      H00JC2_n9415MMSPrvNom = new boolean[] {false} ;
      H00JC2_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC2_n9416MMSFch = new boolean[] {false} ;
      H00JC2_A9413MMSTpo = new String[] {""} ;
      H00JC2_n9413MMSTpo = new boolean[] {false} ;
      H00JC2_A9412MMSCod = new int[1] ;
      H00JC2_A407EmprNom = new String[] {""} ;
      H00JC2_n407EmprNom = new boolean[] {false} ;
      H00JC2_A396EmprCod = new String[] {""} ;
      H00JC3_A9420MMSEst = new String[] {""} ;
      H00JC3_n9420MMSEst = new boolean[] {false} ;
      H00JC3_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC3_n11304MMSFchApl = new boolean[] {false} ;
      H00JC3_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC3_n9418MMSFchCre = new boolean[] {false} ;
      H00JC3_A9417MMSUsuCre = new String[] {""} ;
      H00JC3_n9417MMSUsuCre = new boolean[] {false} ;
      H00JC3_A9419MMSNroExt = new String[] {""} ;
      H00JC3_n9419MMSNroExt = new boolean[] {false} ;
      H00JC3_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00JC3_n11509MMSDto = new boolean[] {false} ;
      H00JC3_A9414MMSPrvNum = new int[1] ;
      H00JC3_n9414MMSPrvNum = new boolean[] {false} ;
      H00JC3_A9415MMSPrvNom = new String[] {""} ;
      H00JC3_n9415MMSPrvNom = new boolean[] {false} ;
      H00JC3_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC3_n9416MMSFch = new boolean[] {false} ;
      H00JC3_A9413MMSTpo = new String[] {""} ;
      H00JC3_n9413MMSTpo = new boolean[] {false} ;
      H00JC3_A9412MMSCod = new int[1] ;
      H00JC3_A407EmprNom = new String[] {""} ;
      H00JC3_n407EmprNom = new boolean[] {false} ;
      H00JC3_A396EmprCod = new String[] {""} ;
      AV99Station = "" ;
      AV97EmprNom = "" ;
      AV102UsurCod = "" ;
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
      AV150Emprcod_selected = "" ;
      GXv_int12 = new int[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      AV124OldGridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState19 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV120GroupMMSTpo = "" ;
      H00JC4_A11304MMSFchApl = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC4_n11304MMSFchApl = new boolean[] {false} ;
      H00JC4_A9418MMSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC4_n9418MMSFchCre = new boolean[] {false} ;
      H00JC4_A9417MMSUsuCre = new String[] {""} ;
      H00JC4_n9417MMSUsuCre = new boolean[] {false} ;
      H00JC4_A9419MMSNroExt = new String[] {""} ;
      H00JC4_n9419MMSNroExt = new boolean[] {false} ;
      H00JC4_A11509MMSDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00JC4_n11509MMSDto = new boolean[] {false} ;
      H00JC4_A9414MMSPrvNum = new int[1] ;
      H00JC4_n9414MMSPrvNum = new boolean[] {false} ;
      H00JC4_A9415MMSPrvNom = new String[] {""} ;
      H00JC4_n9415MMSPrvNom = new boolean[] {false} ;
      H00JC4_A9416MMSFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00JC4_n9416MMSFch = new boolean[] {false} ;
      H00JC4_A9412MMSCod = new int[1] ;
      H00JC4_A9420MMSEst = new String[] {""} ;
      H00JC4_n9420MMSEst = new boolean[] {false} ;
      H00JC4_A9413MMSTpo = new String[] {""} ;
      H00JC4_n9413MMSTpo = new boolean[] {false} ;
      H00JC4_A396EmprCod = new String[] {""} ;
      AV118RecordKey = "" ;
      ucDvelop_confirmpanel_cancelar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_aplicar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmmovstww__default(),
         new Object[] {
             new Object[] {
            H00JC2_A9420MMSEst, H00JC2_n9420MMSEst, H00JC2_A11304MMSFchApl, H00JC2_n11304MMSFchApl, H00JC2_A9418MMSFchCre, H00JC2_n9418MMSFchCre, H00JC2_A9417MMSUsuCre, H00JC2_n9417MMSUsuCre, H00JC2_A9419MMSNroExt, H00JC2_n9419MMSNroExt,
            H00JC2_A11509MMSDto, H00JC2_n11509MMSDto, H00JC2_A9414MMSPrvNum, H00JC2_n9414MMSPrvNum, H00JC2_A9415MMSPrvNom, H00JC2_n9415MMSPrvNom, H00JC2_A9416MMSFch, H00JC2_n9416MMSFch, H00JC2_A9413MMSTpo, H00JC2_n9413MMSTpo,
            H00JC2_A9412MMSCod, H00JC2_A407EmprNom, H00JC2_n407EmprNom, H00JC2_A396EmprCod
            }
            , new Object[] {
            H00JC3_A9420MMSEst, H00JC3_n9420MMSEst, H00JC3_A11304MMSFchApl, H00JC3_n11304MMSFchApl, H00JC3_A9418MMSFchCre, H00JC3_n9418MMSFchCre, H00JC3_A9417MMSUsuCre, H00JC3_n9417MMSUsuCre, H00JC3_A9419MMSNroExt, H00JC3_n9419MMSNroExt,
            H00JC3_A11509MMSDto, H00JC3_n11509MMSDto, H00JC3_A9414MMSPrvNum, H00JC3_n9414MMSPrvNum, H00JC3_A9415MMSPrvNom, H00JC3_n9415MMSPrvNom, H00JC3_A9416MMSFch, H00JC3_n9416MMSFch, H00JC3_A9413MMSTpo, H00JC3_n9413MMSTpo,
            H00JC3_A9412MMSCod, H00JC3_A407EmprNom, H00JC3_n407EmprNom, H00JC3_A396EmprCod
            }
            , new Object[] {
            H00JC4_A11304MMSFchApl, H00JC4_n11304MMSFchApl, H00JC4_A9418MMSFchCre, H00JC4_n9418MMSFchCre, H00JC4_A9417MMSUsuCre, H00JC4_n9417MMSUsuCre, H00JC4_A9419MMSNroExt, H00JC4_n9419MMSNroExt, H00JC4_A11509MMSDto, H00JC4_n11509MMSDto,
            H00JC4_A9414MMSPrvNum, H00JC4_n9414MMSPrvNum, H00JC4_A9415MMSPrvNom, H00JC4_n9415MMSPrvNom, H00JC4_A9416MMSFch, H00JC4_n9416MMSFch, H00JC4_A9412MMSCod, H00JC4_A9420MMSEst, H00JC4_n9420MMSEst, H00JC4_A9413MMSTpo,
            H00JC4_n9413MMSTpo, H00JC4_A396EmprCod
            }
         }
      );
      AV148Pgmname = "TMMovStWW" ;
      /* GeneXus formulas. */
      AV148Pgmname = "TMMovStWW" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      edtavGrid_groupcaption_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV114GridActions ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_48 ;
   private int nGXsfl_48_idx=1 ;
   private int AV49TFMMSCod ;
   private int AV50TFMMSCod_To ;
   private int AV55TFMMSPrvNum ;
   private int AV56TFMMSPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Grid_group_Columnindex ;
   private int A9412MMSCod ;
   private int A9414MMSPrvNum ;
   private int subGrid_Islastpage ;
   private int edtavExpand_Enabled ;
   private int edtavGrid_groupcaption_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int AV131Tmmovstwwds_2_tfmmscod ;
   private int AV132Tmmovstwwds_3_tfmmscod_to ;
   private int AV137Tmmovstwwds_8_tfmmsprvnum ;
   private int AV138Tmmovstwwds_9_tfmmsprvnum_to ;
   private int AV133Tmmovstwwds_4_tfmmstpo_sels_size ;
   private int AV147Tmmovstwwds_18_tfmmsest_sels_size ;
   private int AV121GridCollapsedRecordsChildren_size ;
   private int edtMMSCod_Visible ;
   private int edtMMSFch_Visible ;
   private int edtMMSPrvNom_Visible ;
   private int edtMMSPrvNum_Visible ;
   private int edtMMSDto_Visible ;
   private int edtMMSNroExt_Visible ;
   private int edtMMSUsuCre_Visible ;
   private int edtMMSFchCre_Visible ;
   private int edtMMSFchApl_Visible ;
   private int AV89PageToGo ;
   private int AV149GXV1 ;
   private int AV151Mmscod_selected ;
   private int GXv_int12[] ;
   private int AV152GXV2 ;
   private int AV153GXV3 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavExpand_Visible ;
   private int edtavGrid_groupcaption_Visible ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV90GridCurrentPage ;
   private long AV91GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV123Index ;
   private java.math.BigDecimal AV85TFMMSDto ;
   private java.math.BigDecimal AV86TFMMSDto_To ;
   private java.math.BigDecimal A11509MMSDto ;
   private java.math.BigDecimal AV139Tmmovstwwds_10_tfmmsdto ;
   private java.math.BigDecimal AV140Tmmovstwwds_11_tfmmsdto_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_aplicar_Result ;
   private String Dvelop_confirmpanel_cancelar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_48_idx="0001" ;
   private String AV58TFMMSPrvNom ;
   private String AV59TFMMSPrvNom_Sel ;
   private String AV79TFMMSNroExt ;
   private String AV80TFMMSNroExt_Sel ;
   private String AV66TFMMSUsuCre ;
   private String AV67TFMMSUsuCre_Sel ;
   private String AV148Pgmname ;
   private String AV96EmprCod ;
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
   private String Dvelop_confirmpanel_aplicar_Title ;
   private String Dvelop_confirmpanel_aplicar_Confirmationtext ;
   private String Dvelop_confirmpanel_aplicar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_aplicar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_aplicar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_aplicar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_aplicar_Confirmtype ;
   private String Dvelop_confirmpanel_cancelar_Title ;
   private String Dvelop_confirmpanel_cancelar_Confirmationtext ;
   private String Dvelop_confirmpanel_cancelar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cancelar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cancelar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cancelar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cancelar_Confirmtype ;
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
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divTablagrids_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_group_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_mmsfchauxdates_Internalname ;
   private String edtavDdo_mmsfchauxdate_Internalname ;
   private String edtavDdo_mmsfchauxdate_Jsonclick ;
   private String divDdo_mmsfchcreauxdates_Internalname ;
   private String edtavDdo_mmsfchcreauxdate_Internalname ;
   private String edtavDdo_mmsfchcreauxdate_Jsonclick ;
   private String divDdo_mmsfchaplauxdates_Internalname ;
   private String edtavDdo_mmsfchaplauxdate_Internalname ;
   private String edtavDdo_mmsfchaplauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV127Expand ;
   private String edtavExpand_Internalname ;
   private String edtavGrid_groupcaption_Internalname ;
   private String AV115DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtMMSCod_Internalname ;
   private String A9413MMSTpo ;
   private String edtMMSFch_Internalname ;
   private String A9415MMSPrvNom ;
   private String edtMMSPrvNom_Internalname ;
   private String edtMMSPrvNum_Internalname ;
   private String edtMMSDto_Internalname ;
   private String A9419MMSNroExt ;
   private String edtMMSNroExt_Internalname ;
   private String A9417MMSUsuCre ;
   private String edtMMSUsuCre_Internalname ;
   private String edtMMSFchCre_Internalname ;
   private String edtMMSFchApl_Internalname ;
   private String A9420MMSEst ;
   private String edtavFilterfulltext_Internalname ;
   private String AV135Tmmovstwwds_6_tfmmsprvnom ;
   private String AV136Tmmovstwwds_7_tfmmsprvnom_sel ;
   private String AV141Tmmovstwwds_12_tfmmsnroext ;
   private String AV142Tmmovstwwds_13_tfmmsnroext_sel ;
   private String AV143Tmmovstwwds_14_tfmmsusucre ;
   private String AV144Tmmovstwwds_15_tfmmsusucre_sel ;
   private String scmdbuf ;
   private String lV135Tmmovstwwds_6_tfmmsprvnom ;
   private String lV141Tmmovstwwds_12_tfmmsnroext ;
   private String lV143Tmmovstwwds_14_tfmmsusucre ;
   private String AV99Station ;
   private String AV97EmprNom ;
   private String AV102UsurCod ;
   private String edtavExpand_Columnclass ;
   private String edtMMSCod_Link ;
   private String AV150Emprcod_selected ;
   private String GXt_char1 ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String AV120GroupMMSTpo ;
   private String tblTabledvelop_confirmpanel_cancelar_Internalname ;
   private String Dvelop_confirmpanel_cancelar_Internalname ;
   private String tblTabledvelop_confirmpanel_aplicar_Internalname ;
   private String Dvelop_confirmpanel_aplicar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_48_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavExpand_Jsonclick ;
   private String edtavGrid_groupcaption_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String GXCCtl ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtMMSCod_Jsonclick ;
   private String edtMMSFch_Jsonclick ;
   private String edtMMSPrvNom_Jsonclick ;
   private String edtMMSPrvNum_Jsonclick ;
   private String edtMMSDto_Jsonclick ;
   private String edtMMSNroExt_Jsonclick ;
   private String edtMMSUsuCre_Jsonclick ;
   private String edtMMSFchCre_Jsonclick ;
   private String edtMMSFchApl_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV69TFMMSFchCre ;
   private java.util.Date AV74TFMMSFchApl ;
   private java.util.Date A9418MMSFchCre ;
   private java.util.Date A11304MMSFchApl ;
   private java.util.Date AV145Tmmovstwwds_16_tfmmsfchcre ;
   private java.util.Date AV146Tmmovstwwds_17_tfmmsfchapl ;
   private java.util.Date AV61TFMMSFch ;
   private java.util.Date AV63DDO_MMSFchAuxDate ;
   private java.util.Date AV71DDO_MMSFchCreAuxDate ;
   private java.util.Date AV76DDO_MMSFchAplAuxDate ;
   private java.util.Date A9416MMSFch ;
   private java.util.Date AV134Tmmovstwwds_5_tfmmsfch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV14OrderedDsc ;
   private boolean AV126AddChildren ;
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
   private boolean Grid_empowerer_Hasrowgroups ;
   private boolean wbLoad ;
   private boolean bGXsfl_48_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n9413MMSTpo ;
   private boolean n9416MMSFch ;
   private boolean n9415MMSPrvNom ;
   private boolean n9414MMSPrvNum ;
   private boolean n11509MMSDto ;
   private boolean n9419MMSNroExt ;
   private boolean n9417MMSUsuCre ;
   private boolean n9418MMSFchCre ;
   private boolean n11304MMSFchApl ;
   private boolean n9420MMSEst ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private boolean AV125DiscardFirst ;
   private String AV52TFMMSTpo_SelsJson ;
   private String AV82TFMMSEst_SelsJson ;
   private String AV34ColumnsSelectorXML ;
   private String AV40ManageFiltersXml ;
   private String AV35UserCustomValue ;
   private String AV98FilterFullText ;
   private String AV117GroupBy ;
   private String AV116Grid_GroupCaption ;
   private String AV119GroupKey ;
   private String AV130Tmmovstwwds_1_filterfulltext ;
   private String AV32ExcelFilename ;
   private String AV33ErrorMessage ;
   private String AV118RecordKey ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_group ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cancelar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_aplicar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbMMSTpo ;
   private HTMLChoice cmbMMSEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00JC2_A9420MMSEst ;
   private boolean[] H00JC2_n9420MMSEst ;
   private java.util.Date[] H00JC2_A11304MMSFchApl ;
   private boolean[] H00JC2_n11304MMSFchApl ;
   private java.util.Date[] H00JC2_A9418MMSFchCre ;
   private boolean[] H00JC2_n9418MMSFchCre ;
   private String[] H00JC2_A9417MMSUsuCre ;
   private boolean[] H00JC2_n9417MMSUsuCre ;
   private String[] H00JC2_A9419MMSNroExt ;
   private boolean[] H00JC2_n9419MMSNroExt ;
   private java.math.BigDecimal[] H00JC2_A11509MMSDto ;
   private boolean[] H00JC2_n11509MMSDto ;
   private int[] H00JC2_A9414MMSPrvNum ;
   private boolean[] H00JC2_n9414MMSPrvNum ;
   private String[] H00JC2_A9415MMSPrvNom ;
   private boolean[] H00JC2_n9415MMSPrvNom ;
   private java.util.Date[] H00JC2_A9416MMSFch ;
   private boolean[] H00JC2_n9416MMSFch ;
   private String[] H00JC2_A9413MMSTpo ;
   private boolean[] H00JC2_n9413MMSTpo ;
   private int[] H00JC2_A9412MMSCod ;
   private String[] H00JC2_A407EmprNom ;
   private boolean[] H00JC2_n407EmprNom ;
   private String[] H00JC2_A396EmprCod ;
   private String[] H00JC3_A9420MMSEst ;
   private boolean[] H00JC3_n9420MMSEst ;
   private java.util.Date[] H00JC3_A11304MMSFchApl ;
   private boolean[] H00JC3_n11304MMSFchApl ;
   private java.util.Date[] H00JC3_A9418MMSFchCre ;
   private boolean[] H00JC3_n9418MMSFchCre ;
   private String[] H00JC3_A9417MMSUsuCre ;
   private boolean[] H00JC3_n9417MMSUsuCre ;
   private String[] H00JC3_A9419MMSNroExt ;
   private boolean[] H00JC3_n9419MMSNroExt ;
   private java.math.BigDecimal[] H00JC3_A11509MMSDto ;
   private boolean[] H00JC3_n11509MMSDto ;
   private int[] H00JC3_A9414MMSPrvNum ;
   private boolean[] H00JC3_n9414MMSPrvNum ;
   private String[] H00JC3_A9415MMSPrvNom ;
   private boolean[] H00JC3_n9415MMSPrvNom ;
   private java.util.Date[] H00JC3_A9416MMSFch ;
   private boolean[] H00JC3_n9416MMSFch ;
   private String[] H00JC3_A9413MMSTpo ;
   private boolean[] H00JC3_n9413MMSTpo ;
   private int[] H00JC3_A9412MMSCod ;
   private String[] H00JC3_A407EmprNom ;
   private boolean[] H00JC3_n407EmprNom ;
   private String[] H00JC3_A396EmprCod ;
   private java.util.Date[] H00JC4_A11304MMSFchApl ;
   private boolean[] H00JC4_n11304MMSFchApl ;
   private java.util.Date[] H00JC4_A9418MMSFchCre ;
   private boolean[] H00JC4_n9418MMSFchCre ;
   private String[] H00JC4_A9417MMSUsuCre ;
   private boolean[] H00JC4_n9417MMSUsuCre ;
   private String[] H00JC4_A9419MMSNroExt ;
   private boolean[] H00JC4_n9419MMSNroExt ;
   private java.math.BigDecimal[] H00JC4_A11509MMSDto ;
   private boolean[] H00JC4_n11509MMSDto ;
   private int[] H00JC4_A9414MMSPrvNum ;
   private boolean[] H00JC4_n9414MMSPrvNum ;
   private String[] H00JC4_A9415MMSPrvNom ;
   private boolean[] H00JC4_n9415MMSPrvNom ;
   private java.util.Date[] H00JC4_A9416MMSFch ;
   private boolean[] H00JC4_n9416MMSFch ;
   private int[] H00JC4_A9412MMSCod ;
   private String[] H00JC4_A9420MMSEst ;
   private boolean[] H00JC4_n9420MMSEst ;
   private String[] H00JC4_A9413MMSTpo ;
   private boolean[] H00JC4_n9413MMSTpo ;
   private String[] H00JC4_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV53TFMMSTpo_Sels ;
   private GXSimpleCollection<String> AV83TFMMSEst_Sels ;
   private GXSimpleCollection<String> AV133Tmmovstwwds_4_tfmmstpo_sels ;
   private GXSimpleCollection<String> AV147Tmmovstwwds_18_tfmmsest_sels ;
   private GXSimpleCollection<String> AV122GridCollapsedRecords ;
   private GXSimpleCollection<String> AV121GridCollapsedRecordsChildren ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV88DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState AV124OldGridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState19[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class tmmovstww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00JC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV133Tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV147Tmmovstwwds_18_tfmmsest_sels ,
                                          int AV131Tmmovstwwds_2_tfmmscod ,
                                          int AV132Tmmovstwwds_3_tfmmscod_to ,
                                          int AV133Tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV134Tmmovstwwds_5_tfmmsfch ,
                                          String AV136Tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV135Tmmovstwwds_6_tfmmsprvnom ,
                                          int AV137Tmmovstwwds_8_tfmmsprvnum ,
                                          int AV138Tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV139Tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV140Tmmovstwwds_11_tfmmsdto_to ,
                                          String AV142Tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV141Tmmovstwwds_12_tfmmsnroext ,
                                          String AV144Tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV143Tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV145Tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV146Tmmovstwwds_17_tfmmsfchapl ,
                                          int AV147Tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV130Tmmovstwwds_1_filterfulltext ,
                                          int AV121GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV121GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[15];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.MMSEst, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T3.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSTpo, T1.MMSCod," ;
      scmdbuf += " T2.EmprNom, T1.EmprCod FROM ((TXPMMoStk T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum =" ;
      scmdbuf += " T1.MMSPrvNum)" ;
      if ( ! (0==AV131Tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( AV133Tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV133Tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV135Tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (0==AV138Tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV141Tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV143Tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV145Tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV146Tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( AV147Tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV147Tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSTpo" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSTpo DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFch" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFch DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSDto" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSDto DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSEst" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSEst DESC" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H00JC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV133Tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV147Tmmovstwwds_18_tfmmsest_sels ,
                                          int AV131Tmmovstwwds_2_tfmmscod ,
                                          int AV132Tmmovstwwds_3_tfmmscod_to ,
                                          int AV133Tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV134Tmmovstwwds_5_tfmmsfch ,
                                          String AV136Tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV135Tmmovstwwds_6_tfmmsprvnom ,
                                          int AV137Tmmovstwwds_8_tfmmsprvnum ,
                                          int AV138Tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV139Tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV140Tmmovstwwds_11_tfmmsdto_to ,
                                          String AV142Tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV141Tmmovstwwds_12_tfmmsnroext ,
                                          String AV144Tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV143Tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV145Tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV146Tmmovstwwds_17_tfmmsfchapl ,
                                          int AV147Tmmovstwwds_18_tfmmsest_sels_size ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV130Tmmovstwwds_1_filterfulltext ,
                                          int AV121GridCollapsedRecordsChildren_size ,
                                          String A396EmprCod ,
                                          GXSimpleCollection<String> AV121GridCollapsedRecordsChildren )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[15];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.MMSEst, T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T3.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSTpo, T1.MMSCod," ;
      scmdbuf += " T2.EmprNom, T1.EmprCod FROM ((TXPMMoStk T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) LEFT JOIN TXPPRVGEN T3 ON T3.EmprCod = T1.EmprCod AND T3.PrvNum =" ;
      scmdbuf += " T1.MMSPrvNum)" ;
      if ( ! (0==AV131Tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( AV133Tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV133Tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV135Tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrvNom = ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (0==AV138Tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV141Tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV143Tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV145Tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV146Tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( AV147Tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV147Tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSTpo" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSTpo DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFch" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFch DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.PrvNom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.PrvNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSPrvNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSDto" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSDto DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSNroExt DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSUsuCre DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchCre DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSFchApl DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MMSEst" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MMSEst DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H00JC4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A9413MMSTpo ,
                                          GXSimpleCollection<String> AV133Tmmovstwwds_4_tfmmstpo_sels ,
                                          String A9420MMSEst ,
                                          GXSimpleCollection<String> AV147Tmmovstwwds_18_tfmmsest_sels ,
                                          int AV131Tmmovstwwds_2_tfmmscod ,
                                          int AV132Tmmovstwwds_3_tfmmscod_to ,
                                          int AV133Tmmovstwwds_4_tfmmstpo_sels_size ,
                                          java.util.Date AV134Tmmovstwwds_5_tfmmsfch ,
                                          String AV136Tmmovstwwds_7_tfmmsprvnom_sel ,
                                          String AV135Tmmovstwwds_6_tfmmsprvnom ,
                                          int AV137Tmmovstwwds_8_tfmmsprvnum ,
                                          int AV138Tmmovstwwds_9_tfmmsprvnum_to ,
                                          java.math.BigDecimal AV139Tmmovstwwds_10_tfmmsdto ,
                                          java.math.BigDecimal AV140Tmmovstwwds_11_tfmmsdto_to ,
                                          String AV142Tmmovstwwds_13_tfmmsnroext_sel ,
                                          String AV141Tmmovstwwds_12_tfmmsnroext ,
                                          String AV144Tmmovstwwds_15_tfmmsusucre_sel ,
                                          String AV143Tmmovstwwds_14_tfmmsusucre ,
                                          java.util.Date AV145Tmmovstwwds_16_tfmmsfchcre ,
                                          java.util.Date AV146Tmmovstwwds_17_tfmmsfchapl ,
                                          int AV147Tmmovstwwds_18_tfmmsest_sels_size ,
                                          String AV117GroupBy ,
                                          int A9412MMSCod ,
                                          java.util.Date A9416MMSFch ,
                                          String A9415MMSPrvNom ,
                                          int A9414MMSPrvNum ,
                                          java.math.BigDecimal A11509MMSDto ,
                                          String A9419MMSNroExt ,
                                          String A9417MMSUsuCre ,
                                          java.util.Date A9418MMSFchCre ,
                                          java.util.Date A11304MMSFchApl ,
                                          String AV120GroupMMSTpo ,
                                          String AV130Tmmovstwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[16];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T1.MMSFchApl, T1.MMSFchCre, T1.MMSUsuCre, T1.MMSNroExt, T1.MMSDto, T1.MMSPrvNum AS MMSPrvNum, T2.PrvNom AS MMSPrvNom, T1.MMSFch, T1.MMSCod, T1.MMSEst, T1.MMSTpo," ;
      scmdbuf += " T1.EmprCod FROM (TXPMMoStk T1 LEFT JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.MMSPrvNum)" ;
      if ( ! (0==AV131Tmmovstwwds_2_tfmmscod) )
      {
         addWhere(sWhereString, "(T1.MMSCod >= ?)");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (0==AV132Tmmovstwwds_3_tfmmscod_to) )
      {
         addWhere(sWhereString, "(T1.MMSCod <= ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( AV133Tmmovstwwds_4_tfmmstpo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV133Tmmovstwwds_4_tfmmstpo_sels, "T1.MMSTpo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Tmmovstwwds_5_tfmmsfch)) )
      {
         addWhere(sWhereString, "(T1.MMSFch >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Tmmovstwwds_7_tfmmsprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV135Tmmovstwwds_6_tfmmsprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Tmmovstwwds_7_tfmmsprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (0==AV137Tmmovstwwds_8_tfmmsprvnum) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum >= ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (0==AV138Tmmovstwwds_9_tfmmsprvnum_to) )
      {
         addWhere(sWhereString, "(T1.MMSPrvNum <= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV139Tmmovstwwds_10_tfmmsdto)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto >= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV140Tmmovstwwds_11_tfmmsdto_to)==0) )
      {
         addWhere(sWhereString, "(T1.MMSDto <= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Tmmovstwwds_13_tfmmsnroext_sel)==0) && ( ! (GXutil.strcmp("", AV141Tmmovstwwds_12_tfmmsnroext)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSNroExt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Tmmovstwwds_13_tfmmsnroext_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSNroExt = ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Tmmovstwwds_15_tfmmsusucre_sel)==0) && ( ! (GXutil.strcmp("", AV143Tmmovstwwds_14_tfmmsusucre)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MMSUsuCre) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Tmmovstwwds_15_tfmmsusucre_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MMSUsuCre = ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV145Tmmovstwwds_16_tfmmsfchcre) )
      {
         addWhere(sWhereString, "(T1.MMSFchCre >= ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV146Tmmovstwwds_17_tfmmsfchapl) )
      {
         addWhere(sWhereString, "(T1.MMSFchApl >= ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( AV147Tmmovstwwds_18_tfmmsest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV147Tmmovstwwds_18_tfmmsest_sels, "T1.MMSEst IN (", ")")+")");
      }
      if ( GXutil.strcmp(AV117GroupBy, "MMSTpo") == 0 )
      {
         addWhere(sWhereString, "(T1.MMSTpo = ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MMSCod" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H00JC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (GXSimpleCollection<String>)dynConstraints[35] );
            case 1 :
                  return conditional_H00JC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (GXSimpleCollection<String>)dynConstraints[35] );
            case 2 :
                  return conditional_H00JC4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00JC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00JC4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(11);
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(11);
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(9);
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 10);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 10);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[29], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               return;
      }
   }

}

