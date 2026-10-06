package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdet2ww_impl extends GXDataArea
{
   public talbdet2ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbdet2ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet2ww_impl.class ));
   }

   public talbdet2ww_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
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
      AV44ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39ColumnsSelector);
      AV125FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV46TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV47TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV49TFAlbREnt = httpContext.GetPar( "TFAlbREnt") ;
      AV50TFAlbREnt_Sel = httpContext.GetPar( "TFAlbREnt_Sel") ;
      AV52TFAlbREnt2 = httpContext.GetPar( "TFAlbREnt2") ;
      AV53TFAlbREnt2_Sel = httpContext.GetPar( "TFAlbREnt2_Sel") ;
      AV55TFAlbRFen = localUtil.parseDateParm( httpContext.GetPar( "TFAlbRFen")) ;
      AV60TFAlbRHEn = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbRHEn")) ;
      AV65TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV66TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV68TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV69TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV71TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV72TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV74TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV75TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      AV77TFProceCod = (short)(GXutil.lval( httpContext.GetPar( "TFProceCod"))) ;
      AV78TFProceCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFProceCod_To"))) ;
      AV80TFProceNom = httpContext.GetPar( "TFProceNom") ;
      AV81TFProceNom_Sel = httpContext.GetPar( "TFProceNom_Sel") ;
      AV83TFTrnCod = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod"))) ;
      AV84TFTrnCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTrnCod_To"))) ;
      AV86TFTrnNom = httpContext.GetPar( "TFTrnNom") ;
      AV87TFTrnNom_Sel = httpContext.GetPar( "TFTrnNom_Sel") ;
      AV89TFTipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TFTipEntCod"))) ;
      AV90TFTipEntCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFTipEntCod_To"))) ;
      AV92TFTipEntNom = httpContext.GetPar( "TFTipEntNom") ;
      AV93TFTipEntNom_Sel = httpContext.GetPar( "TFTipEntNom_Sel") ;
      AV95TFAlbRDes = httpContext.GetPar( "TFAlbRDes") ;
      AV96TFAlbRDes_Sel = httpContext.GetPar( "TFAlbRDes_Sel") ;
      AV98TFAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt"), ".") ;
      AV99TFAlbRUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV127TFAlbRUni_Sels);
      AV104TFAlbRPieEnt = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt"))) ;
      AV105TFAlbRPieEnt_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt_To"))) ;
      AV107TFAlbRLoc = httpContext.GetPar( "TFAlbRLoc") ;
      AV108TFAlbRLoc_Sel = httpContext.GetPar( "TFAlbRLoc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV111TFAlbRReo_Sels);
      AV113TFAlbRPieUti = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti"))) ;
      AV114TFAlbRPieUti_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti_To"))) ;
      AV116TFAlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti"), ".") ;
      AV117TFAlbRUniUti_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti_To"), ".") ;
      AV178Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV125FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV49TFAlbREnt, AV50TFAlbREnt_Sel, AV52TFAlbREnt2, AV53TFAlbREnt2_Sel, AV55TFAlbRFen, AV60TFAlbRHEn, AV65TFCliCod, AV66TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV77TFProceCod, AV78TFProceCod_To, AV80TFProceNom, AV81TFProceNom_Sel, AV83TFTrnCod, AV84TFTrnCod_To, AV86TFTrnNom, AV87TFTrnNom_Sel, AV89TFTipEntCod, AV90TFTipEntCod_To, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV127TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV113TFAlbRPieUti, AV114TFAlbRPieUti_To, AV116TFAlbRUniUti, AV117TFAlbRUniUti_To, AV178Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      paCE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startCE2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbdet2ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Pgmname, ""))));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV121GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV122GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV119DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV119DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV46TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRENT", GXutil.rtrim( AV49TFAlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRENT_SEL", GXutil.rtrim( AV50TFAlbREnt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRENT2", GXutil.rtrim( AV52TFAlbREnt2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRENT2_SEL", GXutil.rtrim( AV53TFAlbREnt2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRFEN", localUtil.dtoc( AV55TFAlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRHEN", localUtil.ttoc( AV60TFAlbRHEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV65TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV66TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV68TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV69TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV71TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV72TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC", GXutil.rtrim( AV74TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC_SEL", GXutil.rtrim( AV75TFAlbRefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCECOD", GXutil.ltrim( localUtil.ntoc( AV77TFProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCECOD_TO", GXutil.ltrim( localUtil.ntoc( AV78TFProceCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENOM", GXutil.rtrim( AV80TFProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENOM_SEL", GXutil.rtrim( AV81TFProceNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD", GXutil.ltrim( localUtil.ntoc( AV83TFTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNCOD_TO", GXutil.ltrim( localUtil.ntoc( AV84TFTrnCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM", GXutil.rtrim( AV86TFTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM_SEL", GXutil.rtrim( AV87TFTrnNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPENTCOD", GXutil.ltrim( localUtil.ntoc( AV89TFTipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPENTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV90TFTipEntCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPENTNOM", GXutil.rtrim( AV92TFTipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPENTNOM_SEL", GXutil.rtrim( AV93TFTipEntNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRDES", GXutil.rtrim( AV95TFAlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRDES_SEL", GXutil.rtrim( AV96TFAlbRDes_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV98TFAlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV99TFAlbRUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV127TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV127TFAlbRUni_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV104TFAlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT_TO", GXutil.ltrim( localUtil.ntoc( AV105TFAlbRPieEnt_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRLOC", GXutil.rtrim( AV107TFAlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRLOC_SEL", GXutil.rtrim( AV108TFAlbRLoc_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRREO_SELS", AV111TFAlbRReo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRREO_SELS", AV111TFAlbRReo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV113TFAlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI_TO", GXutil.ltrim( localUtil.ntoc( AV114TFAlbRPieUti_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV116TFAlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI_TO", GXutil.ltrim( localUtil.ntoc( AV117TFAlbRUniUti_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV178Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Pgmname, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNI_SELSJSON", AV126TFAlbRUni_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRREO_SELSJSON", AV110TFAlbRReo_SelsJson);
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
         weCE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtCE2( ) ;
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
      return formatLink("app.talbdet2ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TALBDET2WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", "") ;
   }

   public void wbCE0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_CE2( true) ;
      }
      else
      {
         wb_table1_27_CE2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_CE2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV121GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV122GridPageCount);
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV119DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV119DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV39ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albrfenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrfenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrfenauxdate_Internalname, localUtil.format(AV57DDO_AlbRFenAuxDate, "99/99/99"), localUtil.format( AV57DDO_AlbRFenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrfenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrfenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET2WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albrhenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrhenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrhenauxdate_Internalname, localUtil.format(AV62DDO_AlbRHEnAuxDate, "99/99/99"), localUtil.format( AV62DDO_AlbRHEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrhenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrhenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET2WW.htm");
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

   public void startCE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupCE0( ) ;
   }

   public void wsCE2( )
   {
      startCE2( ) ;
      evtCE2( ) ;
   }

   public void evtCE2( )
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
                           e11CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18CE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19CE2 ();
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
                           AV128GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
                           A5806AlbREnt2 = httpContext.cgiGet( edtAlbREnt2_Internalname) ;
                           A49AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbRFen_Internalname), 0)) ;
                           A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( edtAlbRHEn_Internalname), 0) ;
                           n4606AlbRHEn = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n970ProceCod = false ;
                           A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
                           n971ProceNom = false ;
                           A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n840TrnCod = false ;
                           A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
                           n841TrnNom = false ;
                           A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1211TipEntCod = false ;
                           A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
                           n1212TipEntNom = false ;
                           A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
                           cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
                           cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
                           A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
                           A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20CE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21CE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22CE2 ();
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

   public void weCE2( )
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

   public void paCE2( )
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
                                 byte AV44ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ,
                                 String AV125FilterFullText ,
                                 int AV46TFAlbRecCod ,
                                 int AV47TFAlbRecCod_To ,
                                 String AV49TFAlbREnt ,
                                 String AV50TFAlbREnt_Sel ,
                                 String AV52TFAlbREnt2 ,
                                 String AV53TFAlbREnt2_Sel ,
                                 java.util.Date AV55TFAlbRFen ,
                                 java.util.Date AV60TFAlbRHEn ,
                                 int AV65TFCliCod ,
                                 int AV66TFCliCod_To ,
                                 String AV68TFCliNom ,
                                 String AV69TFCliNom_Sel ,
                                 String AV71TFAlbRef ,
                                 String AV72TFAlbRef_Sel ,
                                 String AV74TFAlbRefDsc ,
                                 String AV75TFAlbRefDsc_Sel ,
                                 short AV77TFProceCod ,
                                 short AV78TFProceCod_To ,
                                 String AV80TFProceNom ,
                                 String AV81TFProceNom_Sel ,
                                 short AV83TFTrnCod ,
                                 short AV84TFTrnCod_To ,
                                 String AV86TFTrnNom ,
                                 String AV87TFTrnNom_Sel ,
                                 short AV89TFTipEntCod ,
                                 short AV90TFTipEntCod_To ,
                                 String AV92TFTipEntNom ,
                                 String AV93TFTipEntNom_Sel ,
                                 String AV95TFAlbRDes ,
                                 String AV96TFAlbRDes_Sel ,
                                 java.math.BigDecimal AV98TFAlbRUniEnt ,
                                 java.math.BigDecimal AV99TFAlbRUniEnt_To ,
                                 GXSimpleCollection<String> AV127TFAlbRUni_Sels ,
                                 int AV104TFAlbRPieEnt ,
                                 int AV105TFAlbRPieEnt_To ,
                                 String AV107TFAlbRLoc ,
                                 String AV108TFAlbRLoc_Sel ,
                                 GXSimpleCollection<String> AV111TFAlbRReo_Sels ,
                                 int AV113TFAlbRPieUti ,
                                 int AV114TFAlbRPieUti_To ,
                                 java.math.BigDecimal AV116TFAlbRUniUti ,
                                 java.math.BigDecimal AV117TFAlbRUniUti_To ,
                                 String AV178Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21CE2 ();
      GRID_nCurrentRecord = 0 ;
      rfCE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
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
      rfCE2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV178Pgmname = "TALBDET2WW" ;
      Gx_err = (short)(0) ;
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV135Talbdet2wwds_1_filterfulltext = AV125FilterFullText ;
      AV136Talbdet2wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV137Talbdet2wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV138Talbdet2wwds_4_tfalbrent = AV49TFAlbREnt ;
      AV139Talbdet2wwds_5_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV140Talbdet2wwds_6_tfalbrent2 = AV52TFAlbREnt2 ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = AV53TFAlbREnt2_Sel ;
      AV142Talbdet2wwds_8_tfalbrfen = AV55TFAlbRFen ;
      AV143Talbdet2wwds_9_tfalbrhen = AV60TFAlbRHEn ;
      AV144Talbdet2wwds_10_tfclicod = AV65TFCliCod ;
      AV145Talbdet2wwds_11_tfclicod_to = AV66TFCliCod_To ;
      AV146Talbdet2wwds_12_tfclinom = AV68TFCliNom ;
      AV147Talbdet2wwds_13_tfclinom_sel = AV69TFCliNom_Sel ;
      AV148Talbdet2wwds_14_tfalbref = AV71TFAlbRef ;
      AV149Talbdet2wwds_15_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV150Talbdet2wwds_16_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV152Talbdet2wwds_18_tfprocecod = AV77TFProceCod ;
      AV153Talbdet2wwds_19_tfprocecod_to = AV78TFProceCod_To ;
      AV154Talbdet2wwds_20_tfprocenom = AV80TFProceNom ;
      AV155Talbdet2wwds_21_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet2wwds_22_tftrncod = AV83TFTrnCod ;
      AV157Talbdet2wwds_23_tftrncod_to = AV84TFTrnCod_To ;
      AV158Talbdet2wwds_24_tftrnnom = AV86TFTrnNom ;
      AV159Talbdet2wwds_25_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV160Talbdet2wwds_26_tftipentcod = AV89TFTipEntCod ;
      AV161Talbdet2wwds_27_tftipentcod_to = AV90TFTipEntCod_To ;
      AV162Talbdet2wwds_28_tftipentnom = AV92TFTipEntNom ;
      AV163Talbdet2wwds_29_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV164Talbdet2wwds_30_tfalbrdes = AV95TFAlbRDes ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV166Talbdet2wwds_32_tfalbrunient = AV98TFAlbRUniEnt ;
      AV167Talbdet2wwds_33_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV168Talbdet2wwds_34_tfalbruni_sels = AV127TFAlbRUni_Sels ;
      AV169Talbdet2wwds_35_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV170Talbdet2wwds_36_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV171Talbdet2wwds_37_tfalbrloc = AV107TFAlbRLoc ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      AV174Talbdet2wwds_40_tfalbrpieuti = AV113TFAlbRPieUti ;
      AV175Talbdet2wwds_41_tfalbrpieuti_to = AV114TFAlbRPieUti_To ;
      AV176Talbdet2wwds_42_tfalbruniuti = AV116TFAlbRUniUti ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = AV117TFAlbRUniUti_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV168Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV173Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV136Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV137Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV139Talbdet2wwds_5_tfalbrent_sel ,
                                           AV138Talbdet2wwds_4_tfalbrent ,
                                           AV141Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV140Talbdet2wwds_6_tfalbrent2 ,
                                           AV142Talbdet2wwds_8_tfalbrfen ,
                                           AV143Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV144Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV145Talbdet2wwds_11_tfclicod_to) ,
                                           AV147Talbdet2wwds_13_tfclinom_sel ,
                                           AV146Talbdet2wwds_12_tfclinom ,
                                           AV149Talbdet2wwds_15_tfalbref_sel ,
                                           AV148Talbdet2wwds_14_tfalbref ,
                                           AV151Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV150Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV152Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV153Talbdet2wwds_19_tfprocecod_to) ,
                                           AV155Talbdet2wwds_21_tfprocenom_sel ,
                                           AV154Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV156Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV157Talbdet2wwds_23_tftrncod_to) ,
                                           AV159Talbdet2wwds_25_tftrnnom_sel ,
                                           AV158Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV160Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV161Talbdet2wwds_27_tftipentcod_to) ,
                                           AV163Talbdet2wwds_29_tftipentnom_sel ,
                                           AV162Talbdet2wwds_28_tftipentnom ,
                                           AV165Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV164Talbdet2wwds_30_tfalbrdes ,
                                           AV166Talbdet2wwds_32_tfalbrunient ,
                                           AV167Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV168Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV169Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV170Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV172Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV171Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV173Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV174Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV175Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV176Talbdet2wwds_42_tfalbruniuti ,
                                           AV177Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV135Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV138Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV138Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV140Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV140Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV146Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV146Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV148Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV148Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV150Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV150Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV154Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV154Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV158Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV158Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV162Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV162Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV164Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV164Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV171Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV171Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor H00CE2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV136Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV137Talbdet2wwds_3_tfalbreccod_to), lV138Talbdet2wwds_4_tfalbrent, AV139Talbdet2wwds_5_tfalbrent_sel, lV140Talbdet2wwds_6_tfalbrent2, AV141Talbdet2wwds_7_tfalbrent2_sel, AV142Talbdet2wwds_8_tfalbrfen, AV143Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV144Talbdet2wwds_10_tfclicod), Integer.valueOf(AV145Talbdet2wwds_11_tfclicod_to), lV146Talbdet2wwds_12_tfclinom, AV147Talbdet2wwds_13_tfclinom_sel, lV148Talbdet2wwds_14_tfalbref, AV149Talbdet2wwds_15_tfalbref_sel, lV150Talbdet2wwds_16_tfalbrefdsc, AV151Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV152Talbdet2wwds_18_tfprocecod), Short.valueOf(AV153Talbdet2wwds_19_tfprocecod_to), lV154Talbdet2wwds_20_tfprocenom, AV155Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV156Talbdet2wwds_22_tftrncod), Short.valueOf(AV157Talbdet2wwds_23_tftrncod_to), lV158Talbdet2wwds_24_tftrnnom, AV159Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV160Talbdet2wwds_26_tftipentcod), Short.valueOf(AV161Talbdet2wwds_27_tftipentcod_to), lV162Talbdet2wwds_28_tftipentnom, AV163Talbdet2wwds_29_tftipentnom_sel, lV164Talbdet2wwds_30_tfalbrdes, AV165Talbdet2wwds_31_tfalbrdes_sel, AV166Talbdet2wwds_32_tfalbrunient, AV167Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV169Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV170Talbdet2wwds_36_tfalbrpieent_to), lV171Talbdet2wwds_37_tfalbrloc, AV172Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV174Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV175Talbdet2wwds_41_tfalbrpieuti_to), AV176Talbdet2wwds_42_tfalbruniuti, AV177Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A60AlbRUniUti = H00CE2_A60AlbRUniUti[0] ;
         A54AlbRPieUti = H00CE2_A54AlbRPieUti[0] ;
         A55AlbRReo = H00CE2_A55AlbRReo[0] ;
         A50AlbRLoc = H00CE2_A50AlbRLoc[0] ;
         A52AlbRPieEnt = H00CE2_A52AlbRPieEnt[0] ;
         A56AlbRUni = H00CE2_A56AlbRUni[0] ;
         A58AlbRUniEnt = H00CE2_A58AlbRUniEnt[0] ;
         A1291AlbRDes = H00CE2_A1291AlbRDes[0] ;
         A1212TipEntNom = H00CE2_A1212TipEntNom[0] ;
         n1212TipEntNom = H00CE2_n1212TipEntNom[0] ;
         A1211TipEntCod = H00CE2_A1211TipEntCod[0] ;
         n1211TipEntCod = H00CE2_n1211TipEntCod[0] ;
         A841TrnNom = H00CE2_A841TrnNom[0] ;
         n841TrnNom = H00CE2_n841TrnNom[0] ;
         A840TrnCod = H00CE2_A840TrnCod[0] ;
         n840TrnCod = H00CE2_n840TrnCod[0] ;
         A971ProceNom = H00CE2_A971ProceNom[0] ;
         n971ProceNom = H00CE2_n971ProceNom[0] ;
         A970ProceCod = H00CE2_A970ProceCod[0] ;
         n970ProceCod = H00CE2_n970ProceCod[0] ;
         A3613AlbRefDsc = H00CE2_A3613AlbRefDsc[0] ;
         A45AlbRef = H00CE2_A45AlbRef[0] ;
         A279CliNom = H00CE2_A279CliNom[0] ;
         A252CliCod = H00CE2_A252CliCod[0] ;
         A4606AlbRHEn = H00CE2_A4606AlbRHEn[0] ;
         n4606AlbRHEn = H00CE2_n4606AlbRHEn[0] ;
         A49AlbRFen = H00CE2_A49AlbRFen[0] ;
         A5806AlbREnt2 = H00CE2_A5806AlbREnt2[0] ;
         A46AlbREnt = H00CE2_A46AlbREnt[0] ;
         A44AlbRecCod = H00CE2_A44AlbRecCod[0] ;
         A407EmprNom = H00CE2_A407EmprNom[0] ;
         n407EmprNom = H00CE2_n407EmprNom[0] ;
         A396EmprCod = H00CE2_A396EmprCod[0] ;
         A407EmprNom = H00CE2_A407EmprNom[0] ;
         n407EmprNom = H00CE2_n407EmprNom[0] ;
         A279CliNom = H00CE2_A279CliNom[0] ;
         A841TrnNom = H00CE2_A841TrnNom[0] ;
         n841TrnNom = H00CE2_n841TrnNom[0] ;
         A971ProceNom = H00CE2_A971ProceNom[0] ;
         n971ProceNom = H00CE2_n971ProceNom[0] ;
         A1212TipEntNom = H00CE2_A1212TipEntNom[0] ;
         n1212TipEntNom = H00CE2_n1212TipEntNom[0] ;
         if ( (GXutil.strcmp("", AV135Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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

   public void rfCE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21CE2 ();
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
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              A56AlbRUni ,
                                              AV168Talbdet2wwds_34_tfalbruni_sels ,
                                              A55AlbRReo ,
                                              AV173Talbdet2wwds_39_tfalbrreo_sels ,
                                              Integer.valueOf(AV136Talbdet2wwds_2_tfalbreccod) ,
                                              Integer.valueOf(AV137Talbdet2wwds_3_tfalbreccod_to) ,
                                              AV139Talbdet2wwds_5_tfalbrent_sel ,
                                              AV138Talbdet2wwds_4_tfalbrent ,
                                              AV141Talbdet2wwds_7_tfalbrent2_sel ,
                                              AV140Talbdet2wwds_6_tfalbrent2 ,
                                              AV142Talbdet2wwds_8_tfalbrfen ,
                                              AV143Talbdet2wwds_9_tfalbrhen ,
                                              Integer.valueOf(AV144Talbdet2wwds_10_tfclicod) ,
                                              Integer.valueOf(AV145Talbdet2wwds_11_tfclicod_to) ,
                                              AV147Talbdet2wwds_13_tfclinom_sel ,
                                              AV146Talbdet2wwds_12_tfclinom ,
                                              AV149Talbdet2wwds_15_tfalbref_sel ,
                                              AV148Talbdet2wwds_14_tfalbref ,
                                              AV151Talbdet2wwds_17_tfalbrefdsc_sel ,
                                              AV150Talbdet2wwds_16_tfalbrefdsc ,
                                              Short.valueOf(AV152Talbdet2wwds_18_tfprocecod) ,
                                              Short.valueOf(AV153Talbdet2wwds_19_tfprocecod_to) ,
                                              AV155Talbdet2wwds_21_tfprocenom_sel ,
                                              AV154Talbdet2wwds_20_tfprocenom ,
                                              Short.valueOf(AV156Talbdet2wwds_22_tftrncod) ,
                                              Short.valueOf(AV157Talbdet2wwds_23_tftrncod_to) ,
                                              AV159Talbdet2wwds_25_tftrnnom_sel ,
                                              AV158Talbdet2wwds_24_tftrnnom ,
                                              Short.valueOf(AV160Talbdet2wwds_26_tftipentcod) ,
                                              Short.valueOf(AV161Talbdet2wwds_27_tftipentcod_to) ,
                                              AV163Talbdet2wwds_29_tftipentnom_sel ,
                                              AV162Talbdet2wwds_28_tftipentnom ,
                                              AV165Talbdet2wwds_31_tfalbrdes_sel ,
                                              AV164Talbdet2wwds_30_tfalbrdes ,
                                              AV166Talbdet2wwds_32_tfalbrunient ,
                                              AV167Talbdet2wwds_33_tfalbrunient_to ,
                                              Integer.valueOf(AV168Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                              Integer.valueOf(AV169Talbdet2wwds_35_tfalbrpieent) ,
                                              Integer.valueOf(AV170Talbdet2wwds_36_tfalbrpieent_to) ,
                                              AV172Talbdet2wwds_38_tfalbrloc_sel ,
                                              AV171Talbdet2wwds_37_tfalbrloc ,
                                              Integer.valueOf(AV173Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                              Integer.valueOf(AV174Talbdet2wwds_40_tfalbrpieuti) ,
                                              Integer.valueOf(AV175Talbdet2wwds_41_tfalbrpieuti_to) ,
                                              AV176Talbdet2wwds_42_tfalbruniuti ,
                                              AV177Talbdet2wwds_43_tfalbruniuti_to ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A46AlbREnt ,
                                              A5806AlbREnt2 ,
                                              A49AlbRFen ,
                                              A4606AlbRHEn ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A45AlbRef ,
                                              A3613AlbRefDsc ,
                                              Short.valueOf(A970ProceCod) ,
                                              A971ProceNom ,
                                              Short.valueOf(A840TrnCod) ,
                                              A841TrnNom ,
                                              Short.valueOf(A1211TipEntCod) ,
                                              A1212TipEntNom ,
                                              A1291AlbRDes ,
                                              A58AlbRUniEnt ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              A50AlbRLoc ,
                                              Integer.valueOf(A54AlbRPieUti) ,
                                              A60AlbRUniUti ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV135Talbdet2wwds_1_filterfulltext } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV138Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV138Talbdet2wwds_4_tfalbrent), 8, "%") ;
         lV140Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV140Talbdet2wwds_6_tfalbrent2), 20, "%") ;
         lV146Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV146Talbdet2wwds_12_tfclinom), 30, "%") ;
         lV148Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV148Talbdet2wwds_14_tfalbref), 16, "%") ;
         lV150Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV150Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
         lV154Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV154Talbdet2wwds_20_tfprocenom), 30, "%") ;
         lV158Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV158Talbdet2wwds_24_tftrnnom), 30, "%") ;
         lV162Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV162Talbdet2wwds_28_tftipentnom), 25, "%") ;
         lV164Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV164Talbdet2wwds_30_tfalbrdes), 20, "%") ;
         lV171Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV171Talbdet2wwds_37_tfalbrloc), 10, "%") ;
         /* Using cursor H00CE3 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV136Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV137Talbdet2wwds_3_tfalbreccod_to), lV138Talbdet2wwds_4_tfalbrent, AV139Talbdet2wwds_5_tfalbrent_sel, lV140Talbdet2wwds_6_tfalbrent2, AV141Talbdet2wwds_7_tfalbrent2_sel, AV142Talbdet2wwds_8_tfalbrfen, AV143Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV144Talbdet2wwds_10_tfclicod), Integer.valueOf(AV145Talbdet2wwds_11_tfclicod_to), lV146Talbdet2wwds_12_tfclinom, AV147Talbdet2wwds_13_tfclinom_sel, lV148Talbdet2wwds_14_tfalbref, AV149Talbdet2wwds_15_tfalbref_sel, lV150Talbdet2wwds_16_tfalbrefdsc, AV151Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV152Talbdet2wwds_18_tfprocecod), Short.valueOf(AV153Talbdet2wwds_19_tfprocecod_to), lV154Talbdet2wwds_20_tfprocenom, AV155Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV156Talbdet2wwds_22_tftrncod), Short.valueOf(AV157Talbdet2wwds_23_tftrncod_to), lV158Talbdet2wwds_24_tftrnnom, AV159Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV160Talbdet2wwds_26_tftipentcod), Short.valueOf(AV161Talbdet2wwds_27_tftipentcod_to), lV162Talbdet2wwds_28_tftipentnom, AV163Talbdet2wwds_29_tftipentnom_sel, lV164Talbdet2wwds_30_tfalbrdes, AV165Talbdet2wwds_31_tfalbrdes_sel, AV166Talbdet2wwds_32_tfalbrunient, AV167Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV169Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV170Talbdet2wwds_36_tfalbrpieent_to), lV171Talbdet2wwds_37_tfalbrloc, AV172Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV174Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV175Talbdet2wwds_41_tfalbrpieuti_to), AV176Talbdet2wwds_42_tfalbruniuti, AV177Talbdet2wwds_43_tfalbruniuti_to});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A60AlbRUniUti = H00CE3_A60AlbRUniUti[0] ;
            A54AlbRPieUti = H00CE3_A54AlbRPieUti[0] ;
            A55AlbRReo = H00CE3_A55AlbRReo[0] ;
            A50AlbRLoc = H00CE3_A50AlbRLoc[0] ;
            A52AlbRPieEnt = H00CE3_A52AlbRPieEnt[0] ;
            A56AlbRUni = H00CE3_A56AlbRUni[0] ;
            A58AlbRUniEnt = H00CE3_A58AlbRUniEnt[0] ;
            A1291AlbRDes = H00CE3_A1291AlbRDes[0] ;
            A1212TipEntNom = H00CE3_A1212TipEntNom[0] ;
            n1212TipEntNom = H00CE3_n1212TipEntNom[0] ;
            A1211TipEntCod = H00CE3_A1211TipEntCod[0] ;
            n1211TipEntCod = H00CE3_n1211TipEntCod[0] ;
            A841TrnNom = H00CE3_A841TrnNom[0] ;
            n841TrnNom = H00CE3_n841TrnNom[0] ;
            A840TrnCod = H00CE3_A840TrnCod[0] ;
            n840TrnCod = H00CE3_n840TrnCod[0] ;
            A971ProceNom = H00CE3_A971ProceNom[0] ;
            n971ProceNom = H00CE3_n971ProceNom[0] ;
            A970ProceCod = H00CE3_A970ProceCod[0] ;
            n970ProceCod = H00CE3_n970ProceCod[0] ;
            A3613AlbRefDsc = H00CE3_A3613AlbRefDsc[0] ;
            A45AlbRef = H00CE3_A45AlbRef[0] ;
            A279CliNom = H00CE3_A279CliNom[0] ;
            A252CliCod = H00CE3_A252CliCod[0] ;
            A4606AlbRHEn = H00CE3_A4606AlbRHEn[0] ;
            n4606AlbRHEn = H00CE3_n4606AlbRHEn[0] ;
            A49AlbRFen = H00CE3_A49AlbRFen[0] ;
            A5806AlbREnt2 = H00CE3_A5806AlbREnt2[0] ;
            A46AlbREnt = H00CE3_A46AlbREnt[0] ;
            A44AlbRecCod = H00CE3_A44AlbRecCod[0] ;
            A407EmprNom = H00CE3_A407EmprNom[0] ;
            n407EmprNom = H00CE3_n407EmprNom[0] ;
            A396EmprCod = H00CE3_A396EmprCod[0] ;
            A407EmprNom = H00CE3_A407EmprNom[0] ;
            n407EmprNom = H00CE3_n407EmprNom[0] ;
            A279CliNom = H00CE3_A279CliNom[0] ;
            A841TrnNom = H00CE3_A841TrnNom[0] ;
            n841TrnNom = H00CE3_n841TrnNom[0] ;
            A971ProceNom = H00CE3_A971ProceNom[0] ;
            n971ProceNom = H00CE3_n971ProceNom[0] ;
            A1212TipEntNom = H00CE3_A1212TipEntNom[0] ;
            n1212TipEntNom = H00CE3_n1212TipEntNom[0] ;
            if ( (GXutil.strcmp("", AV135Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV135Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV135Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
            {
               e22CE2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wbCE0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesCE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV178Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
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
      AV135Talbdet2wwds_1_filterfulltext = AV125FilterFullText ;
      AV136Talbdet2wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV137Talbdet2wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV138Talbdet2wwds_4_tfalbrent = AV49TFAlbREnt ;
      AV139Talbdet2wwds_5_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV140Talbdet2wwds_6_tfalbrent2 = AV52TFAlbREnt2 ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = AV53TFAlbREnt2_Sel ;
      AV142Talbdet2wwds_8_tfalbrfen = AV55TFAlbRFen ;
      AV143Talbdet2wwds_9_tfalbrhen = AV60TFAlbRHEn ;
      AV144Talbdet2wwds_10_tfclicod = AV65TFCliCod ;
      AV145Talbdet2wwds_11_tfclicod_to = AV66TFCliCod_To ;
      AV146Talbdet2wwds_12_tfclinom = AV68TFCliNom ;
      AV147Talbdet2wwds_13_tfclinom_sel = AV69TFCliNom_Sel ;
      AV148Talbdet2wwds_14_tfalbref = AV71TFAlbRef ;
      AV149Talbdet2wwds_15_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV150Talbdet2wwds_16_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV152Talbdet2wwds_18_tfprocecod = AV77TFProceCod ;
      AV153Talbdet2wwds_19_tfprocecod_to = AV78TFProceCod_To ;
      AV154Talbdet2wwds_20_tfprocenom = AV80TFProceNom ;
      AV155Talbdet2wwds_21_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet2wwds_22_tftrncod = AV83TFTrnCod ;
      AV157Talbdet2wwds_23_tftrncod_to = AV84TFTrnCod_To ;
      AV158Talbdet2wwds_24_tftrnnom = AV86TFTrnNom ;
      AV159Talbdet2wwds_25_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV160Talbdet2wwds_26_tftipentcod = AV89TFTipEntCod ;
      AV161Talbdet2wwds_27_tftipentcod_to = AV90TFTipEntCod_To ;
      AV162Talbdet2wwds_28_tftipentnom = AV92TFTipEntNom ;
      AV163Talbdet2wwds_29_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV164Talbdet2wwds_30_tfalbrdes = AV95TFAlbRDes ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV166Talbdet2wwds_32_tfalbrunient = AV98TFAlbRUniEnt ;
      AV167Talbdet2wwds_33_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV168Talbdet2wwds_34_tfalbruni_sels = AV127TFAlbRUni_Sels ;
      AV169Talbdet2wwds_35_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV170Talbdet2wwds_36_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV171Talbdet2wwds_37_tfalbrloc = AV107TFAlbRLoc ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      AV174Talbdet2wwds_40_tfalbrpieuti = AV113TFAlbRPieUti ;
      AV175Talbdet2wwds_41_tfalbrpieuti_to = AV114TFAlbRPieUti_To ;
      AV176Talbdet2wwds_42_tfalbruniuti = AV116TFAlbRUniUti ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = AV117TFAlbRUniUti_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV125FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV49TFAlbREnt, AV50TFAlbREnt_Sel, AV52TFAlbREnt2, AV53TFAlbREnt2_Sel, AV55TFAlbRFen, AV60TFAlbRHEn, AV65TFCliCod, AV66TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV77TFProceCod, AV78TFProceCod_To, AV80TFProceNom, AV81TFProceNom_Sel, AV83TFTrnCod, AV84TFTrnCod_To, AV86TFTrnNom, AV87TFTrnNom_Sel, AV89TFTipEntCod, AV90TFTipEntCod_To, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV127TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV113TFAlbRPieUti, AV114TFAlbRPieUti_To, AV116TFAlbRUniUti, AV117TFAlbRUniUti_To, AV178Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV135Talbdet2wwds_1_filterfulltext = AV125FilterFullText ;
      AV136Talbdet2wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV137Talbdet2wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV138Talbdet2wwds_4_tfalbrent = AV49TFAlbREnt ;
      AV139Talbdet2wwds_5_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV140Talbdet2wwds_6_tfalbrent2 = AV52TFAlbREnt2 ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = AV53TFAlbREnt2_Sel ;
      AV142Talbdet2wwds_8_tfalbrfen = AV55TFAlbRFen ;
      AV143Talbdet2wwds_9_tfalbrhen = AV60TFAlbRHEn ;
      AV144Talbdet2wwds_10_tfclicod = AV65TFCliCod ;
      AV145Talbdet2wwds_11_tfclicod_to = AV66TFCliCod_To ;
      AV146Talbdet2wwds_12_tfclinom = AV68TFCliNom ;
      AV147Talbdet2wwds_13_tfclinom_sel = AV69TFCliNom_Sel ;
      AV148Talbdet2wwds_14_tfalbref = AV71TFAlbRef ;
      AV149Talbdet2wwds_15_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV150Talbdet2wwds_16_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV152Talbdet2wwds_18_tfprocecod = AV77TFProceCod ;
      AV153Talbdet2wwds_19_tfprocecod_to = AV78TFProceCod_To ;
      AV154Talbdet2wwds_20_tfprocenom = AV80TFProceNom ;
      AV155Talbdet2wwds_21_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet2wwds_22_tftrncod = AV83TFTrnCod ;
      AV157Talbdet2wwds_23_tftrncod_to = AV84TFTrnCod_To ;
      AV158Talbdet2wwds_24_tftrnnom = AV86TFTrnNom ;
      AV159Talbdet2wwds_25_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV160Talbdet2wwds_26_tftipentcod = AV89TFTipEntCod ;
      AV161Talbdet2wwds_27_tftipentcod_to = AV90TFTipEntCod_To ;
      AV162Talbdet2wwds_28_tftipentnom = AV92TFTipEntNom ;
      AV163Talbdet2wwds_29_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV164Talbdet2wwds_30_tfalbrdes = AV95TFAlbRDes ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV166Talbdet2wwds_32_tfalbrunient = AV98TFAlbRUniEnt ;
      AV167Talbdet2wwds_33_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV168Talbdet2wwds_34_tfalbruni_sels = AV127TFAlbRUni_Sels ;
      AV169Talbdet2wwds_35_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV170Talbdet2wwds_36_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV171Talbdet2wwds_37_tfalbrloc = AV107TFAlbRLoc ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      AV174Talbdet2wwds_40_tfalbrpieuti = AV113TFAlbRPieUti ;
      AV175Talbdet2wwds_41_tfalbrpieuti_to = AV114TFAlbRPieUti_To ;
      AV176Talbdet2wwds_42_tfalbruniuti = AV116TFAlbRUniUti ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = AV117TFAlbRUniUti_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV125FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV49TFAlbREnt, AV50TFAlbREnt_Sel, AV52TFAlbREnt2, AV53TFAlbREnt2_Sel, AV55TFAlbRFen, AV60TFAlbRHEn, AV65TFCliCod, AV66TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV77TFProceCod, AV78TFProceCod_To, AV80TFProceNom, AV81TFProceNom_Sel, AV83TFTrnCod, AV84TFTrnCod_To, AV86TFTrnNom, AV87TFTrnNom_Sel, AV89TFTipEntCod, AV90TFTipEntCod_To, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV127TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV113TFAlbRPieUti, AV114TFAlbRPieUti_To, AV116TFAlbRUniUti, AV117TFAlbRUniUti_To, AV178Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV135Talbdet2wwds_1_filterfulltext = AV125FilterFullText ;
      AV136Talbdet2wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV137Talbdet2wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV138Talbdet2wwds_4_tfalbrent = AV49TFAlbREnt ;
      AV139Talbdet2wwds_5_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV140Talbdet2wwds_6_tfalbrent2 = AV52TFAlbREnt2 ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = AV53TFAlbREnt2_Sel ;
      AV142Talbdet2wwds_8_tfalbrfen = AV55TFAlbRFen ;
      AV143Talbdet2wwds_9_tfalbrhen = AV60TFAlbRHEn ;
      AV144Talbdet2wwds_10_tfclicod = AV65TFCliCod ;
      AV145Talbdet2wwds_11_tfclicod_to = AV66TFCliCod_To ;
      AV146Talbdet2wwds_12_tfclinom = AV68TFCliNom ;
      AV147Talbdet2wwds_13_tfclinom_sel = AV69TFCliNom_Sel ;
      AV148Talbdet2wwds_14_tfalbref = AV71TFAlbRef ;
      AV149Talbdet2wwds_15_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV150Talbdet2wwds_16_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV152Talbdet2wwds_18_tfprocecod = AV77TFProceCod ;
      AV153Talbdet2wwds_19_tfprocecod_to = AV78TFProceCod_To ;
      AV154Talbdet2wwds_20_tfprocenom = AV80TFProceNom ;
      AV155Talbdet2wwds_21_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet2wwds_22_tftrncod = AV83TFTrnCod ;
      AV157Talbdet2wwds_23_tftrncod_to = AV84TFTrnCod_To ;
      AV158Talbdet2wwds_24_tftrnnom = AV86TFTrnNom ;
      AV159Talbdet2wwds_25_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV160Talbdet2wwds_26_tftipentcod = AV89TFTipEntCod ;
      AV161Talbdet2wwds_27_tftipentcod_to = AV90TFTipEntCod_To ;
      AV162Talbdet2wwds_28_tftipentnom = AV92TFTipEntNom ;
      AV163Talbdet2wwds_29_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV164Talbdet2wwds_30_tfalbrdes = AV95TFAlbRDes ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV166Talbdet2wwds_32_tfalbrunient = AV98TFAlbRUniEnt ;
      AV167Talbdet2wwds_33_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV168Talbdet2wwds_34_tfalbruni_sels = AV127TFAlbRUni_Sels ;
      AV169Talbdet2wwds_35_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV170Talbdet2wwds_36_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV171Talbdet2wwds_37_tfalbrloc = AV107TFAlbRLoc ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      AV174Talbdet2wwds_40_tfalbrpieuti = AV113TFAlbRPieUti ;
      AV175Talbdet2wwds_41_tfalbrpieuti_to = AV114TFAlbRPieUti_To ;
      AV176Talbdet2wwds_42_tfalbruniuti = AV116TFAlbRUniUti ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = AV117TFAlbRUniUti_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV125FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV49TFAlbREnt, AV50TFAlbREnt_Sel, AV52TFAlbREnt2, AV53TFAlbREnt2_Sel, AV55TFAlbRFen, AV60TFAlbRHEn, AV65TFCliCod, AV66TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV77TFProceCod, AV78TFProceCod_To, AV80TFProceNom, AV81TFProceNom_Sel, AV83TFTrnCod, AV84TFTrnCod_To, AV86TFTrnNom, AV87TFTrnNom_Sel, AV89TFTipEntCod, AV90TFTipEntCod_To, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV127TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV113TFAlbRPieUti, AV114TFAlbRPieUti_To, AV116TFAlbRUniUti, AV117TFAlbRUniUti_To, AV178Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV135Talbdet2wwds_1_filterfulltext = AV125FilterFullText ;
      AV136Talbdet2wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV137Talbdet2wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV138Talbdet2wwds_4_tfalbrent = AV49TFAlbREnt ;
      AV139Talbdet2wwds_5_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV140Talbdet2wwds_6_tfalbrent2 = AV52TFAlbREnt2 ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = AV53TFAlbREnt2_Sel ;
      AV142Talbdet2wwds_8_tfalbrfen = AV55TFAlbRFen ;
      AV143Talbdet2wwds_9_tfalbrhen = AV60TFAlbRHEn ;
      AV144Talbdet2wwds_10_tfclicod = AV65TFCliCod ;
      AV145Talbdet2wwds_11_tfclicod_to = AV66TFCliCod_To ;
      AV146Talbdet2wwds_12_tfclinom = AV68TFCliNom ;
      AV147Talbdet2wwds_13_tfclinom_sel = AV69TFCliNom_Sel ;
      AV148Talbdet2wwds_14_tfalbref = AV71TFAlbRef ;
      AV149Talbdet2wwds_15_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV150Talbdet2wwds_16_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV152Talbdet2wwds_18_tfprocecod = AV77TFProceCod ;
      AV153Talbdet2wwds_19_tfprocecod_to = AV78TFProceCod_To ;
      AV154Talbdet2wwds_20_tfprocenom = AV80TFProceNom ;
      AV155Talbdet2wwds_21_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet2wwds_22_tftrncod = AV83TFTrnCod ;
      AV157Talbdet2wwds_23_tftrncod_to = AV84TFTrnCod_To ;
      AV158Talbdet2wwds_24_tftrnnom = AV86TFTrnNom ;
      AV159Talbdet2wwds_25_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV160Talbdet2wwds_26_tftipentcod = AV89TFTipEntCod ;
      AV161Talbdet2wwds_27_tftipentcod_to = AV90TFTipEntCod_To ;
      AV162Talbdet2wwds_28_tftipentnom = AV92TFTipEntNom ;
      AV163Talbdet2wwds_29_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV164Talbdet2wwds_30_tfalbrdes = AV95TFAlbRDes ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV166Talbdet2wwds_32_tfalbrunient = AV98TFAlbRUniEnt ;
      AV167Talbdet2wwds_33_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV168Talbdet2wwds_34_tfalbruni_sels = AV127TFAlbRUni_Sels ;
      AV169Talbdet2wwds_35_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV170Talbdet2wwds_36_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV171Talbdet2wwds_37_tfalbrloc = AV107TFAlbRLoc ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      AV174Talbdet2wwds_40_tfalbrpieuti = AV113TFAlbRPieUti ;
      AV175Talbdet2wwds_41_tfalbrpieuti_to = AV114TFAlbRPieUti_To ;
      AV176Talbdet2wwds_42_tfalbruniuti = AV116TFAlbRUniUti ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = AV117TFAlbRUniUti_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV125FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV49TFAlbREnt, AV50TFAlbREnt_Sel, AV52TFAlbREnt2, AV53TFAlbREnt2_Sel, AV55TFAlbRFen, AV60TFAlbRHEn, AV65TFCliCod, AV66TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV77TFProceCod, AV78TFProceCod_To, AV80TFProceNom, AV81TFProceNom_Sel, AV83TFTrnCod, AV84TFTrnCod_To, AV86TFTrnNom, AV87TFTrnNom_Sel, AV89TFTipEntCod, AV90TFTipEntCod_To, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV127TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV113TFAlbRPieUti, AV114TFAlbRPieUti_To, AV116TFAlbRUniUti, AV117TFAlbRUniUti_To, AV178Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV135Talbdet2wwds_1_filterfulltext = AV125FilterFullText ;
      AV136Talbdet2wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV137Talbdet2wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV138Talbdet2wwds_4_tfalbrent = AV49TFAlbREnt ;
      AV139Talbdet2wwds_5_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV140Talbdet2wwds_6_tfalbrent2 = AV52TFAlbREnt2 ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = AV53TFAlbREnt2_Sel ;
      AV142Talbdet2wwds_8_tfalbrfen = AV55TFAlbRFen ;
      AV143Talbdet2wwds_9_tfalbrhen = AV60TFAlbRHEn ;
      AV144Talbdet2wwds_10_tfclicod = AV65TFCliCod ;
      AV145Talbdet2wwds_11_tfclicod_to = AV66TFCliCod_To ;
      AV146Talbdet2wwds_12_tfclinom = AV68TFCliNom ;
      AV147Talbdet2wwds_13_tfclinom_sel = AV69TFCliNom_Sel ;
      AV148Talbdet2wwds_14_tfalbref = AV71TFAlbRef ;
      AV149Talbdet2wwds_15_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV150Talbdet2wwds_16_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV152Talbdet2wwds_18_tfprocecod = AV77TFProceCod ;
      AV153Talbdet2wwds_19_tfprocecod_to = AV78TFProceCod_To ;
      AV154Talbdet2wwds_20_tfprocenom = AV80TFProceNom ;
      AV155Talbdet2wwds_21_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet2wwds_22_tftrncod = AV83TFTrnCod ;
      AV157Talbdet2wwds_23_tftrncod_to = AV84TFTrnCod_To ;
      AV158Talbdet2wwds_24_tftrnnom = AV86TFTrnNom ;
      AV159Talbdet2wwds_25_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV160Talbdet2wwds_26_tftipentcod = AV89TFTipEntCod ;
      AV161Talbdet2wwds_27_tftipentcod_to = AV90TFTipEntCod_To ;
      AV162Talbdet2wwds_28_tftipentnom = AV92TFTipEntNom ;
      AV163Talbdet2wwds_29_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV164Talbdet2wwds_30_tfalbrdes = AV95TFAlbRDes ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV166Talbdet2wwds_32_tfalbrunient = AV98TFAlbRUniEnt ;
      AV167Talbdet2wwds_33_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV168Talbdet2wwds_34_tfalbruni_sels = AV127TFAlbRUni_Sels ;
      AV169Talbdet2wwds_35_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV170Talbdet2wwds_36_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV171Talbdet2wwds_37_tfalbrloc = AV107TFAlbRLoc ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      AV174Talbdet2wwds_40_tfalbrpieuti = AV113TFAlbRPieUti ;
      AV175Talbdet2wwds_41_tfalbrpieuti_to = AV114TFAlbRPieUti_To ;
      AV176Talbdet2wwds_42_tfalbruniuti = AV116TFAlbRUniUti ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = AV117TFAlbRUniUti_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV125FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV49TFAlbREnt, AV50TFAlbREnt_Sel, AV52TFAlbREnt2, AV53TFAlbREnt2_Sel, AV55TFAlbRFen, AV60TFAlbRHEn, AV65TFCliCod, AV66TFCliCod_To, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV77TFProceCod, AV78TFProceCod_To, AV80TFProceNom, AV81TFProceNom_Sel, AV83TFTrnCod, AV84TFTrnCod_To, AV86TFTrnNom, AV87TFTrnNom_Sel, AV89TFTipEntCod, AV90TFTipEntCod_To, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV127TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV113TFAlbRPieUti, AV114TFAlbRPieUti_To, AV116TFAlbRUniUti, AV117TFAlbRUniUti_To, AV178Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV178Pgmname = "TALBDET2WW" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupCE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20CE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV42ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV119DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV39ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV121GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV122GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV125FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125FilterFullText", AV125FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrfenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRFENAUXDATE");
            GX_FocusControl = edtavDdo_albrfenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57DDO_AlbRFenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DDO_AlbRFenAuxDate", localUtil.format(AV57DDO_AlbRFenAuxDate, "99/99/99"));
         }
         else
         {
            AV57DDO_AlbRFenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrfenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DDO_AlbRFenAuxDate", localUtil.format(AV57DDO_AlbRFenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrhenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRHENAUXDATE");
            GX_FocusControl = edtavDdo_albrhenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV62DDO_AlbRHEnAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62DDO_AlbRHEnAuxDate", localUtil.format(AV62DDO_AlbRHEnAuxDate, "99/99/99"));
         }
         else
         {
            AV62DDO_AlbRHEnAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrhenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62DDO_AlbRHEnAuxDate", localUtil.format(AV62DDO_AlbRHEnAuxDate, "99/99/99"));
         }
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
      e20CE2 ();
      if (returnInSub) return;
   }

   public void e20CE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV131Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbdet2ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV131Station = GXt_char1 ;
      GXv_char2[0] = AV132Emprcod ;
      GXv_char3[0] = AV133Emprnom ;
      GXv_char4[0] = AV134Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV131Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbdet2ww_impl.this.AV132Emprcod = GXv_char2[0] ;
      talbdet2ww_impl.this.AV133Emprnom = GXv_char3[0] ;
      talbdet2ww_impl.this.AV134Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV119DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV119DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e21CE2( )
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
      if ( GXutil.strcmp(AV41Session.getValue("TALBDET2WWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV41Session.getValue("TALBDET2WWColumnsSelector") ;
         AV39ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbRecCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbREnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbREnt2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt2_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRFen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRHEn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRefDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTrnCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTrnNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipEntCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipEntNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRDes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRUniEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbRUni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRUni.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRPieEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRLoc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbRReo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRReo.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRPieUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRUniUti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV121GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121GridCurrentPage), 10, 0));
      AV122GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122GridPageCount), 10, 0));
      AV135Talbdet2wwds_1_filterfulltext = AV125FilterFullText ;
      AV136Talbdet2wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV137Talbdet2wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV138Talbdet2wwds_4_tfalbrent = AV49TFAlbREnt ;
      AV139Talbdet2wwds_5_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV140Talbdet2wwds_6_tfalbrent2 = AV52TFAlbREnt2 ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = AV53TFAlbREnt2_Sel ;
      AV142Talbdet2wwds_8_tfalbrfen = AV55TFAlbRFen ;
      AV143Talbdet2wwds_9_tfalbrhen = AV60TFAlbRHEn ;
      AV144Talbdet2wwds_10_tfclicod = AV65TFCliCod ;
      AV145Talbdet2wwds_11_tfclicod_to = AV66TFCliCod_To ;
      AV146Talbdet2wwds_12_tfclinom = AV68TFCliNom ;
      AV147Talbdet2wwds_13_tfclinom_sel = AV69TFCliNom_Sel ;
      AV148Talbdet2wwds_14_tfalbref = AV71TFAlbRef ;
      AV149Talbdet2wwds_15_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV150Talbdet2wwds_16_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV152Talbdet2wwds_18_tfprocecod = AV77TFProceCod ;
      AV153Talbdet2wwds_19_tfprocecod_to = AV78TFProceCod_To ;
      AV154Talbdet2wwds_20_tfprocenom = AV80TFProceNom ;
      AV155Talbdet2wwds_21_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet2wwds_22_tftrncod = AV83TFTrnCod ;
      AV157Talbdet2wwds_23_tftrncod_to = AV84TFTrnCod_To ;
      AV158Talbdet2wwds_24_tftrnnom = AV86TFTrnNom ;
      AV159Talbdet2wwds_25_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV160Talbdet2wwds_26_tftipentcod = AV89TFTipEntCod ;
      AV161Talbdet2wwds_27_tftipentcod_to = AV90TFTipEntCod_To ;
      AV162Talbdet2wwds_28_tftipentnom = AV92TFTipEntNom ;
      AV163Talbdet2wwds_29_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV164Talbdet2wwds_30_tfalbrdes = AV95TFAlbRDes ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV166Talbdet2wwds_32_tfalbrunient = AV98TFAlbRUniEnt ;
      AV167Talbdet2wwds_33_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV168Talbdet2wwds_34_tfalbruni_sels = AV127TFAlbRUni_Sels ;
      AV169Talbdet2wwds_35_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV170Talbdet2wwds_36_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV171Talbdet2wwds_37_tfalbrloc = AV107TFAlbRLoc ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      AV174Talbdet2wwds_40_tfalbrpieuti = AV113TFAlbRPieUti ;
      AV175Talbdet2wwds_41_tfalbrpieuti_to = AV114TFAlbRPieUti_To ;
      AV176Talbdet2wwds_42_tfalbruniuti = AV116TFAlbRUniUti ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = AV117TFAlbRUniUti_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12CE2( )
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
         AV120PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV120PageToGo) ;
      }
   }

   public void e13CE2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14CE2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV46TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbRecCod), 8, 0));
            AV47TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbREnt") == 0 )
         {
            AV49TFAlbREnt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbREnt", AV49TFAlbREnt);
            AV50TFAlbREnt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbREnt_Sel", AV50TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbREnt2") == 0 )
         {
            AV52TFAlbREnt2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbREnt2", AV52TFAlbREnt2);
            AV53TFAlbREnt2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbREnt2_Sel", AV53TFAlbREnt2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRFen") == 0 )
         {
            AV55TFAlbRFen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRFen", localUtil.format(AV55TFAlbRFen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRHEn") == 0 )
         {
            AV60TFAlbRHEn = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRHEn", localUtil.ttoc( AV60TFAlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV65TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCliCod), 6, 0));
            AV66TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV68TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliNom", AV68TFCliNom);
            AV69TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFCliNom_Sel", AV69TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV71TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbRef", AV71TFAlbRef);
            AV72TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFAlbRef_Sel", AV72TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRefDsc") == 0 )
         {
            AV74TFAlbRefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFAlbRefDsc", AV74TFAlbRefDsc);
            AV75TFAlbRefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFAlbRefDsc_Sel", AV75TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceCod") == 0 )
         {
            AV77TFProceCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFProceCod), 4, 0));
            AV78TFProceCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFProceCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceNom") == 0 )
         {
            AV80TFProceNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFProceNom", AV80TFProceNom);
            AV81TFProceNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFProceNom_Sel", AV81TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnCod") == 0 )
         {
            AV83TFTrnCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFTrnCod), 4, 0));
            AV84TFTrnCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnNom") == 0 )
         {
            AV86TFTrnNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFTrnNom", AV86TFTrnNom);
            AV87TFTrnNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFTrnNom_Sel", AV87TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipEntCod") == 0 )
         {
            AV89TFTipEntCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFTipEntCod), 4, 0));
            AV90TFTipEntCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFTipEntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFTipEntCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TipEntNom") == 0 )
         {
            AV92TFTipEntNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFTipEntNom", AV92TFTipEntNom);
            AV93TFTipEntNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFTipEntNom_Sel", AV93TFTipEntNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRDes") == 0 )
         {
            AV95TFAlbRDes = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFAlbRDes", AV95TFAlbRDes);
            AV96TFAlbRDes_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFAlbRDes_Sel", AV96TFAlbRDes_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniEnt") == 0 )
         {
            AV98TFAlbRUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFAlbRUniEnt", GXutil.ltrimstr( AV98TFAlbRUniEnt, 9, 2));
            AV99TFAlbRUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFAlbRUniEnt_To", GXutil.ltrimstr( AV99TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV126TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFAlbRUni_SelsJson", AV126TFAlbRUni_SelsJson);
            AV127TFAlbRUni_Sels.fromJSonString(AV126TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieEnt") == 0 )
         {
            AV104TFAlbRPieEnt = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFAlbRPieEnt), 6, 0));
            AV105TFAlbRPieEnt_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLoc") == 0 )
         {
            AV107TFAlbRLoc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFAlbRLoc", AV107TFAlbRLoc);
            AV108TFAlbRLoc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFAlbRLoc_Sel", AV108TFAlbRLoc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRReo") == 0 )
         {
            AV110TFAlbRReo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFAlbRReo_SelsJson", AV110TFAlbRReo_SelsJson);
            AV111TFAlbRReo_Sels.fromJSonString(AV110TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieUti") == 0 )
         {
            AV113TFAlbRPieUti = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFAlbRPieUti), 6, 0));
            AV114TFAlbRPieUti_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniUti") == 0 )
         {
            AV116TFAlbRUniUti = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFAlbRUniUti", GXutil.ltrimstr( AV116TFAlbRUniUti, 9, 2));
            AV117TFAlbRUniUti_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFAlbRUniUti_To", GXutil.ltrimstr( AV117TFAlbRUniUti_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV127TFAlbRUni_Sels", AV127TFAlbRUni_Sels);
   }

   private void e22CE2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         edtAlbREnt_Link = formatLink("app.talbdetview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","AlbRecCod","TabCode"})  ;
         edtTrnNom_Link = formatLink("app.ficherosbasicos.ttranspview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A840TrnCod,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","TrnCod","TabCode"})  ;
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
   }

   public void e15CE2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV37ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV39ColumnsSelector.fromJSonString(AV37ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TALBDET2WWColumnsSelector", ((GXutil.strcmp("", AV37ColumnsSelectorXML)==0) ? "" : AV39ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11CE2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TALBDET2WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV178Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TALBDET2WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV43ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TALBDET2WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         talbdet2ww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV178Pgmname+"GridState", AV43ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV127TFAlbRUni_Sels", AV127TFAlbRUni_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e16CE2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17CE2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV35ExcelFilename ;
      GXv_char3[0] = AV36ErrorMessage ;
      new app.talbdet2wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      talbdet2ww_impl.this.AV35ExcelFilename = GXv_char4[0] ;
      talbdet2ww_impl.this.AV36ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV127TFAlbRUni_Sels", AV127TFAlbRUni_Sels);
   }

   public void e18CE2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.talbdet2wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV127TFAlbRUni_Sels", AV127TFAlbRUni_Sels);
   }

   public void e19CE2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.talbdet2wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV127TFAlbRUni_Sels", AV127TFAlbRUni_Sels);
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
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbREnt", "", "Albaran Entrega", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbREnt2", "", "Nº Albaran Entrega", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRFen", "", "Fecha Entrada", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRHEn", "", "Hora de entrada", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRef", "", "Codigo Referencia", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRefDsc", "", "Descripcion Referencia", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceCod", "", "Codigo Procedencia", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceNom", "", "Nombre", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnCod", "", "Cod Transp", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnNom", "", "Transportista", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipEntCod", "", "Tipo Entrada", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipEntNom", "", "Descripcion", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRDes", "", "Destino", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniEnt", "", "Unidades Entrada", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUni", "", "Unidad", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieEnt", "", "Piezas Entregadas", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRLoc", "", "Localizacion", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieUti", "", "Piezas Utilizadas", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniUti", "", "Unidades Utilizadas", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV38UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBDET2WWColumnsSelector", GXv_char4) ;
      talbdet2ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV40ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV40ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV40ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV42ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TALBDET2WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV42ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV125FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125FilterFullText", AV125FilterFullText);
      AV46TFAlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbRecCod), 8, 0));
      AV47TFAlbRecCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbRecCod_To), 8, 0));
      AV49TFAlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbREnt", AV49TFAlbREnt);
      AV50TFAlbREnt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbREnt_Sel", AV50TFAlbREnt_Sel);
      AV52TFAlbREnt2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbREnt2", AV52TFAlbREnt2);
      AV53TFAlbREnt2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbREnt2_Sel", AV53TFAlbREnt2_Sel);
      AV55TFAlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRFen", localUtil.format(AV55TFAlbRFen, "99/99/99"));
      AV60TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRHEn", localUtil.ttoc( AV60TFAlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV65TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCliCod), 6, 0));
      AV66TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFCliCod_To), 6, 0));
      AV68TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliNom", AV68TFCliNom);
      AV69TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFCliNom_Sel", AV69TFCliNom_Sel);
      AV71TFAlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbRef", AV71TFAlbRef);
      AV72TFAlbRef_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TFAlbRef_Sel", AV72TFAlbRef_Sel);
      AV74TFAlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFAlbRefDsc", AV74TFAlbRefDsc);
      AV75TFAlbRefDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TFAlbRefDsc_Sel", AV75TFAlbRefDsc_Sel);
      AV77TFProceCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFProceCod), 4, 0));
      AV78TFProceCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFProceCod_To), 4, 0));
      AV80TFProceNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFProceNom", AV80TFProceNom);
      AV81TFProceNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFProceNom_Sel", AV81TFProceNom_Sel);
      AV83TFTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFTrnCod), 4, 0));
      AV84TFTrnCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFTrnCod_To), 4, 0));
      AV86TFTrnNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFTrnNom", AV86TFTrnNom);
      AV87TFTrnNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFTrnNom_Sel", AV87TFTrnNom_Sel);
      AV89TFTipEntCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFTipEntCod), 4, 0));
      AV90TFTipEntCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFTipEntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFTipEntCod_To), 4, 0));
      AV92TFTipEntNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TFTipEntNom", AV92TFTipEntNom);
      AV93TFTipEntNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TFTipEntNom_Sel", AV93TFTipEntNom_Sel);
      AV95TFAlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFAlbRDes", AV95TFAlbRDes);
      AV96TFAlbRDes_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFAlbRDes_Sel", AV96TFAlbRDes_Sel);
      AV98TFAlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98TFAlbRUniEnt", GXutil.ltrimstr( AV98TFAlbRUniEnt, 9, 2));
      AV99TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99TFAlbRUniEnt_To", GXutil.ltrimstr( AV99TFAlbRUniEnt_To, 9, 2));
      AV127TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV104TFAlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFAlbRPieEnt), 6, 0));
      AV105TFAlbRPieEnt_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFAlbRPieEnt_To), 6, 0));
      AV107TFAlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFAlbRLoc", AV107TFAlbRLoc);
      AV108TFAlbRLoc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TFAlbRLoc_Sel", AV108TFAlbRLoc_Sel);
      AV111TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV113TFAlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV113TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFAlbRPieUti), 6, 0));
      AV114TFAlbRPieUti_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFAlbRPieUti_To), 6, 0));
      AV116TFAlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116TFAlbRUniUti", GXutil.ltrimstr( AV116TFAlbRUniUti, 9, 2));
      AV117TFAlbRUniUti_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117TFAlbRUniUti_To", GXutil.ltrimstr( AV117TFAlbRUniUti_To, 9, 2));
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
      callWebObject(formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV178Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV178Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV41Session.getValue(AV178Pgmname+"GridState"), null, null);
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
      AV179GXV1 = 1 ;
      while ( AV179GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV179GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV125FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV125FilterFullText", AV125FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV46TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbRecCod), 8, 0));
            AV47TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV49TFAlbREnt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbREnt", AV49TFAlbREnt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV50TFAlbREnt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbREnt_Sel", AV50TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2") == 0 )
         {
            AV52TFAlbREnt2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbREnt2", AV52TFAlbREnt2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2_SEL") == 0 )
         {
            AV53TFAlbREnt2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbREnt2_Sel", AV53TFAlbREnt2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV55TFAlbRFen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRFen", localUtil.format(AV55TFAlbRFen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV60TFAlbRHEn = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRHEn", localUtil.ttoc( AV60TFAlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV62DDO_AlbRHEnAuxDate = GXutil.resetTime(AV60TFAlbRHEn) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62DDO_AlbRHEnAuxDate", localUtil.format(AV62DDO_AlbRHEnAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV65TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65TFCliCod), 6, 0));
            AV66TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV68TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFCliNom", AV68TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV69TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFCliNom_Sel", AV69TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV71TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbRef", AV71TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV72TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFAlbRef_Sel", AV72TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV74TFAlbRefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFAlbRefDsc", AV74TFAlbRefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV75TFAlbRefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75TFAlbRefDsc_Sel", AV75TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV77TFProceCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TFProceCod), 4, 0));
            AV78TFProceCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TFProceCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV80TFProceNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFProceNom", AV80TFProceNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV81TFProceNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFProceNom_Sel", AV81TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV83TFTrnCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83TFTrnCod), 4, 0));
            AV84TFTrnCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFTrnCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TFTrnCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV86TFTrnNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFTrnNom", AV86TFTrnNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV87TFTrnNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFTrnNom_Sel", AV87TFTrnNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV89TFTipEntCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFTipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89TFTipEntCod), 4, 0));
            AV90TFTipEntCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFTipEntCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90TFTipEntCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV92TFTipEntNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92TFTipEntNom", AV92TFTipEntNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV93TFTipEntNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFTipEntNom_Sel", AV93TFTipEntNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV95TFAlbRDes = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFAlbRDes", AV95TFAlbRDes);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV96TFAlbRDes_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFAlbRDes_Sel", AV96TFAlbRDes_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV98TFAlbRUniEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98TFAlbRUniEnt", GXutil.ltrimstr( AV98TFAlbRUniEnt, 9, 2));
            AV99TFAlbRUniEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99TFAlbRUniEnt_To", GXutil.ltrimstr( AV99TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV126TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFAlbRUni_SelsJson", AV126TFAlbRUni_SelsJson);
            AV127TFAlbRUni_Sels.fromJSonString(AV126TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV104TFAlbRPieEnt = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFAlbRPieEnt), 6, 0));
            AV105TFAlbRPieEnt_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV107TFAlbRLoc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFAlbRLoc", AV107TFAlbRLoc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV108TFAlbRLoc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108TFAlbRLoc_Sel", AV108TFAlbRLoc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV110TFAlbRReo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFAlbRReo_SelsJson", AV110TFAlbRReo_SelsJson);
            AV111TFAlbRReo_Sels.fromJSonString(AV110TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV113TFAlbRPieUti = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV113TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV113TFAlbRPieUti), 6, 0));
            AV114TFAlbRPieUti_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV114TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV114TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV116TFAlbRUniUti = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFAlbRUniUti", GXutil.ltrimstr( AV116TFAlbRUniUti, 9, 2));
            AV117TFAlbRUniUti_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFAlbRUniUti_To", GXutil.ltrimstr( AV117TFAlbRUniUti_To, 9, 2));
         }
         AV179GXV1 = (int)(AV179GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFAlbREnt_Sel)==0), AV50TFAlbREnt_Sel, GXv_char4) ;
      talbdet2ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFAlbREnt2_Sel)==0), AV53TFAlbREnt2_Sel, GXv_char3) ;
      talbdet2ww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFCliNom_Sel)==0), AV69TFCliNom_Sel, GXv_char2) ;
      talbdet2ww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFAlbRef_Sel)==0), AV72TFAlbRef_Sel, GXv_char15) ;
      talbdet2ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFAlbRefDsc_Sel)==0), AV75TFAlbRefDsc_Sel, GXv_char17) ;
      talbdet2ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFProceNom_Sel)==0), AV81TFProceNom_Sel, GXv_char19) ;
      talbdet2ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFTrnNom_Sel)==0), AV87TFTrnNom_Sel, GXv_char21) ;
      talbdet2ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFTipEntNom_Sel)==0), AV93TFTipEntNom_Sel, GXv_char23) ;
      talbdet2ww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFAlbRDes_Sel)==0), AV96TFAlbRDes_Sel, GXv_char25) ;
      talbdet2ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV127TFAlbRUni_Sels.size()==0), AV126TFAlbRUni_SelsJson, GXv_char27) ;
      talbdet2ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFAlbRLoc_Sel)==0), AV108TFAlbRLoc_Sel, GXv_char29) ;
      talbdet2ww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV111TFAlbRReo_Sels.size()==0), AV110TFAlbRReo_SelsJson, GXv_char31) ;
      talbdet2ww_impl.this.GXt_char30 = GXv_char31[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"||||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"||"+GXt_char18+"||"+GXt_char20+"||"+GXt_char22+"|"+GXt_char24+"||"+GXt_char26+"||"+GXt_char28+"|"+GXt_char30+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbREnt)==0), AV49TFAlbREnt, GXv_char31) ;
      talbdet2ww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFAlbREnt2)==0), AV52TFAlbREnt2, GXv_char29) ;
      talbdet2ww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFCliNom)==0), AV68TFCliNom, GXv_char27) ;
      talbdet2ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFAlbRef)==0), AV71TFAlbRef, GXv_char25) ;
      talbdet2ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFAlbRefDsc)==0), AV74TFAlbRefDsc, GXv_char23) ;
      talbdet2ww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFProceNom)==0), AV80TFProceNom, GXv_char21) ;
      talbdet2ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFTrnNom)==0), AV86TFTrnNom, GXv_char19) ;
      talbdet2ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV92TFTipEntNom)==0), AV92TFTipEntNom, GXv_char17) ;
      talbdet2ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFAlbRDes)==0), AV95TFAlbRDes, GXv_char15) ;
      talbdet2ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFAlbRLoc)==0), AV107TFAlbRLoc, GXv_char4) ;
      talbdet2ww_impl.this.GXt_char13 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV46TFAlbRecCod) ? "" : GXutil.str( AV46TFAlbRecCod, 8, 0))+"|"+GXt_char30+"|"+GXt_char28+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFAlbRFen)) ? "" : localUtil.dtoc( AV55TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV60TFAlbRHEn) ? "" : localUtil.dtoc( AV62DDO_AlbRHEnAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV65TFCliCod) ? "" : GXutil.str( AV65TFCliCod, 6, 0))+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+((0==AV77TFProceCod) ? "" : GXutil.str( AV77TFProceCod, 4, 0))+"|"+GXt_char20+"|"+((0==AV83TFTrnCod) ? "" : GXutil.str( AV83TFTrnCod, 4, 0))+"|"+GXt_char18+"|"+((0==AV89TFTipEntCod) ? "" : GXutil.str( AV89TFTipEntCod, 4, 0))+"|"+GXt_char16+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFAlbRUniEnt)==0) ? "" : GXutil.str( AV98TFAlbRUniEnt, 9, 2))+"||"+((0==AV104TFAlbRPieEnt) ? "" : GXutil.str( AV104TFAlbRPieEnt, 6, 0))+"|"+GXt_char13+"||"+((0==AV113TFAlbRPieUti) ? "" : GXutil.str( AV113TFAlbRPieUti, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV116TFAlbRUniUti)==0) ? "" : GXutil.str( AV116TFAlbRUniUti, 9, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV47TFAlbRecCod_To) ? "" : GXutil.str( AV47TFAlbRecCod_To, 8, 0))+"|||||"+((0==AV66TFCliCod_To) ? "" : GXutil.str( AV66TFCliCod_To, 6, 0))+"||||"+((0==AV78TFProceCod_To) ? "" : GXutil.str( AV78TFProceCod_To, 4, 0))+"||"+((0==AV84TFTrnCod_To) ? "" : GXutil.str( AV84TFTrnCod_To, 4, 0))+"||"+((0==AV90TFTipEntCod_To) ? "" : GXutil.str( AV90TFTipEntCod_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFAlbRUniEnt_To)==0) ? "" : GXutil.str( AV99TFAlbRUniEnt_To, 9, 2))+"||"+((0==AV105TFAlbRPieEnt_To) ? "" : GXutil.str( AV105TFAlbRPieEnt_To, 6, 0))+"|||"+((0==AV114TFAlbRPieUti_To) ? "" : GXutil.str( AV114TFAlbRPieUti_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV117TFAlbRUniUti_To)==0) ? "" : GXutil.str( AV117TFAlbRUniUti_To, 9, 2)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV41Session.getValue(AV178Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV125FilterFullText)==0), (short)(0), AV125FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRECCOD", "", !((0==AV46TFAlbRecCod)&&(0==AV47TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV47TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRENT", "", !(GXutil.strcmp("", AV49TFAlbREnt)==0), (short)(0), AV49TFAlbREnt, "", !(GXutil.strcmp("", AV50TFAlbREnt_Sel)==0), AV50TFAlbREnt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRENT2", "", !(GXutil.strcmp("", AV52TFAlbREnt2)==0), (short)(0), AV52TFAlbREnt2, "", !(GXutil.strcmp("", AV53TFAlbREnt2_Sel)==0), AV53TFAlbREnt2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRFEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFAlbRFen)), (short)(0), GXutil.trim( localUtil.dtoc( AV55TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRHEN", "", !GXutil.dateCompare(GXutil.nullDate(), AV60TFAlbRHEn), (short)(0), GXutil.trim( localUtil.ttoc( AV60TFAlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFCLICOD", "", !((0==AV65TFCliCod)&&(0==AV66TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV65TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV66TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFCLINOM", "", !(GXutil.strcmp("", AV68TFCliNom)==0), (short)(0), AV68TFCliNom, "", !(GXutil.strcmp("", AV69TFCliNom_Sel)==0), AV69TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBREF", "", !(GXutil.strcmp("", AV71TFAlbRef)==0), (short)(0), AV71TFAlbRef, "", !(GXutil.strcmp("", AV72TFAlbRef_Sel)==0), AV72TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBREFDSC", "", !(GXutil.strcmp("", AV74TFAlbRefDsc)==0), (short)(0), AV74TFAlbRefDsc, "", !(GXutil.strcmp("", AV75TFAlbRefDsc_Sel)==0), AV75TFAlbRefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCECOD", "", !((0==AV77TFProceCod)&&(0==AV78TFProceCod_To)), (short)(0), GXutil.trim( GXutil.str( AV77TFProceCod, 4, 0)), GXutil.trim( GXutil.str( AV78TFProceCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCENOM", "", !(GXutil.strcmp("", AV80TFProceNom)==0), (short)(0), AV80TFProceNom, "", !(GXutil.strcmp("", AV81TFProceNom_Sel)==0), AV81TFProceNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFTRNCOD", "", !((0==AV83TFTrnCod)&&(0==AV84TFTrnCod_To)), (short)(0), GXutil.trim( GXutil.str( AV83TFTrnCod, 4, 0)), GXutil.trim( GXutil.str( AV84TFTrnCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFTRNNOM", "", !(GXutil.strcmp("", AV86TFTrnNom)==0), (short)(0), AV86TFTrnNom, "", !(GXutil.strcmp("", AV87TFTrnNom_Sel)==0), AV87TFTrnNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFTIPENTCOD", "", !((0==AV89TFTipEntCod)&&(0==AV90TFTipEntCod_To)), (short)(0), GXutil.trim( GXutil.str( AV89TFTipEntCod, 4, 0)), GXutil.trim( GXutil.str( AV90TFTipEntCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFTIPENTNOM", "", !(GXutil.strcmp("", AV92TFTipEntNom)==0), (short)(0), AV92TFTipEntNom, "", !(GXutil.strcmp("", AV93TFTipEntNom_Sel)==0), AV93TFTipEntNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRDES", "", !(GXutil.strcmp("", AV95TFAlbRDes)==0), (short)(0), AV95TFAlbRDes, "", !(GXutil.strcmp("", AV96TFAlbRDes_Sel)==0), AV96TFAlbRDes_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFAlbRUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFAlbRUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV98TFAlbRUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV99TFAlbRUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRUNI_SEL", "", !(AV127TFAlbRUni_Sels.size()==0), (short)(0), AV127TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRPIEENT", "", !((0==AV104TFAlbRPieEnt)&&(0==AV105TFAlbRPieEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV104TFAlbRPieEnt, 6, 0)), GXutil.trim( GXutil.str( AV105TFAlbRPieEnt_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRLOC", "", !(GXutil.strcmp("", AV107TFAlbRLoc)==0), (short)(0), AV107TFAlbRLoc, "", !(GXutil.strcmp("", AV108TFAlbRLoc_Sel)==0), AV108TFAlbRLoc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRREO_SEL", "", !(AV111TFAlbRReo_Sels.size()==0), (short)(0), AV111TFAlbRReo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRPIEUTI", "", !((0==AV113TFAlbRPieUti)&&(0==AV114TFAlbRPieUti_To)), (short)(0), GXutil.trim( GXutil.str( AV113TFAlbRPieUti, 6, 0)), GXutil.trim( GXutil.str( AV114TFAlbRPieUti_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFALBRUNIUTI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV116TFAlbRUniUti)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV117TFAlbRUniUti_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV116TFAlbRUniUti, 9, 2)), GXutil.trim( GXutil.str( AV117TFAlbRUniUti_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV178Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV178Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBDET2" );
      AV41Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_CE2( boolean wbgen )
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
         wb_table2_32_CE2( true) ;
      }
      else
      {
         wb_table2_32_CE2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_CE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_CE2e( true) ;
      }
      else
      {
         wb_table1_27_CE2e( false) ;
      }
   }

   public void wb_table2_32_CE2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV125FilterFullText, GXutil.rtrim( localUtil.format( AV125FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TALBDET2WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_CE2e( true) ;
      }
      else
      {
         wb_table2_32_CE2e( false) ;
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
      paCE2( ) ;
      wsCE2( ) ;
      weCE2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211611466", true, true);
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
      httpContext.AddJavascriptSource("talbdet2ww.js", "?20268211611466", false, true);
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
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_45_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_45_idx ;
      edtAlbREnt2_Internalname = "ALBRENT2_"+sGXsfl_45_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_45_idx ;
      edtAlbRHEn_Internalname = "ALBRHEN_"+sGXsfl_45_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_45_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_45_idx ;
      edtProceCod_Internalname = "PROCECOD_"+sGXsfl_45_idx ;
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_45_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_45_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_idx ;
      edtTipEntCod_Internalname = "TIPENTCOD_"+sGXsfl_45_idx ;
      edtTipEntNom_Internalname = "TIPENTNOM_"+sGXsfl_45_idx ;
      edtAlbRDes_Internalname = "ALBRDES_"+sGXsfl_45_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_45_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_45_idx );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_45_idx ;
      edtAlbRLoc_Internalname = "ALBRLOC_"+sGXsfl_45_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_45_idx );
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_45_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_45_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_45_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_45_fel_idx ;
      edtAlbREnt_Internalname = "ALBRENT_"+sGXsfl_45_fel_idx ;
      edtAlbREnt2_Internalname = "ALBRENT2_"+sGXsfl_45_fel_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_45_fel_idx ;
      edtAlbRHEn_Internalname = "ALBRHEN_"+sGXsfl_45_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_45_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_45_fel_idx ;
      edtProceCod_Internalname = "PROCECOD_"+sGXsfl_45_fel_idx ;
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_45_fel_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_45_fel_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_fel_idx ;
      edtTipEntCod_Internalname = "TIPENTCOD_"+sGXsfl_45_fel_idx ;
      edtTipEntNom_Internalname = "TIPENTNOM_"+sGXsfl_45_fel_idx ;
      edtAlbRDes_Internalname = "ALBRDES_"+sGXsfl_45_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_45_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_45_fel_idx );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_45_fel_idx ;
      edtAlbRLoc_Internalname = "ALBRLOC_"+sGXsfl_45_fel_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_45_fel_idx );
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_45_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbCE0( ) ;
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
               AV128GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV128GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV128GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23ce2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV128GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRecCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbREnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbREnt_Internalname,GXutil.rtrim( A46AlbREnt),"","","'"+""+"'"+",false,"+"'"+""+"'",edtAlbREnt_Link,"","","",edtAlbREnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbREnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbREnt2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbREnt2_Internalname,GXutil.rtrim( A5806AlbREnt2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbREnt2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbREnt2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRFen_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRFen_Internalname,localUtil.format(A49AlbRFen, "99/99/99"),localUtil.format( A49AlbRFen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRFen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRFen_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRHEn_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRHEn_Internalname,localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4606AlbRHEn, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRHEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRHEn_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRefDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtProceCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceCod_Internalname,GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNom_Internalname,GXutil.rtrim( A971ProceNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnCod_Internalname,GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Codigo Transportista", ""),"",edtTrnCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnNom_Internalname,GXutil.rtrim( A841TrnNom),"","","'"+""+"'"+",false,"+"'"+""+"'",edtTrnNom_Link,"","","",edtTrnNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtTipEntCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipEntCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipEntCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipEntCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTipEntNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipEntNom_Internalname,GXutil.rtrim( A1212TipEntNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipEntNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTipEntNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRDes_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRDes_Internalname,GXutil.rtrim( A1291AlbRDes),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRDes_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbRUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRUNI_" + sGXsfl_45_idx ;
            cmbAlbRUni.setName( GXCCtl );
            cmbAlbRUni.setWebtags( "" );
            cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbAlbRUni.getItemCount() > 0 )
            {
               A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRUni.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieEnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRLoc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLoc_Internalname,GXutil.rtrim( A50AlbRLoc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRLoc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbRReo.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbRReo.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRREO_" + sGXsfl_45_idx ;
            cmbAlbRReo.setName( GXCCtl );
            cmbAlbRReo.setWebtags( "" );
            cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
            cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
            if ( cmbAlbRReo.getItemCount() > 0 )
            {
               A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRReo,cmbAlbRReo.getInternalname(),GXutil.rtrim( A55AlbRReo),Integer.valueOf(1),cmbAlbRReo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbRReo.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRPieUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRPieUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRUniUti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbRUniUti_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesCE2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbREnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Albaran Entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbREnt2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Albaran Entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRFen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRHEn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora de entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Procedencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod Transp", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipEntCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipEntNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRDes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Destino", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Entregadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLoc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRReo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reclamacion?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieUti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas Utilizadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniUti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades Utilizadas", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV128GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A46AlbREnt));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtAlbREnt_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5806AlbREnt2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbREnt2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A49AlbRFen, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRFen_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4606AlbRHEn, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRHEn_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A971ProceNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A841TrnNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtTrnNom_Link));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipEntCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1212TipEntNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTipEntNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1291AlbRDes));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRDes_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRUni.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieEnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A50AlbRLoc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRLoc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A55AlbRReo));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbRReo.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRPieUti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRUniUti_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      edtAlbREnt2_Internalname = "ALBRENT2" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      edtAlbRHEn_Internalname = "ALBRHEN" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtProceCod_Internalname = "PROCECOD" ;
      edtProceNom_Internalname = "PROCENOM" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      edtTipEntNom_Internalname = "TIPENTNOM" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albrfenauxdate_Internalname = "vDDO_ALBRFENAUXDATE" ;
      divDdo_albrfenauxdates_Internalname = "DDO_ALBRFENAUXDATES" ;
      edtavDdo_albrhenauxdate_Internalname = "vDDO_ALBRHENAUXDATE" ;
      divDdo_albrhenauxdates_Internalname = "DDO_ALBRHENAUXDATES" ;
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
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      cmbAlbRReo.setJsonclick( "" );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRDes_Jsonclick = "" ;
      edtTipEntNom_Jsonclick = "" ;
      edtTipEntCod_Jsonclick = "" ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Link = "" ;
      edtTrnCod_Jsonclick = "" ;
      edtProceNom_Jsonclick = "" ;
      edtProceCod_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtAlbRHEn_Jsonclick = "" ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbREnt2_Jsonclick = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Link = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtAlbRUniUti_Visible = -1 ;
      edtAlbRPieUti_Visible = -1 ;
      cmbAlbRReo.setVisible( -1 );
      edtAlbRLoc_Visible = -1 ;
      edtAlbRPieEnt_Visible = -1 ;
      cmbAlbRUni.setVisible( -1 );
      edtAlbRUniEnt_Visible = -1 ;
      edtAlbRDes_Visible = -1 ;
      edtTipEntNom_Visible = -1 ;
      edtTipEntCod_Visible = -1 ;
      edtTrnNom_Visible = -1 ;
      edtTrnCod_Visible = -1 ;
      edtProceNom_Visible = -1 ;
      edtProceCod_Visible = -1 ;
      edtAlbRefDsc_Visible = -1 ;
      edtAlbRef_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtAlbRHEn_Visible = -1 ;
      edtAlbRFen_Visible = -1 ;
      edtAlbREnt2_Visible = -1 ;
      edtAlbREnt_Visible = -1 ;
      edtAlbRecCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albrhenauxdate_Jsonclick = "" ;
      edtavDdo_albrfenauxdate_Jsonclick = "" ;
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
      Ddo_grid_Datalistproc = "TALBDET2WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||||||||K:K,M:M|||NO:NO,SI:SI||" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||||||||T|||T||" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||||Dynamic|Dynamic|Dynamic||Dynamic||Dynamic||Dynamic|Dynamic||FixedValues||Dynamic|FixedValues||" ;
      Ddo_grid_Includedatalist = "|T|T||||T|T|T||T||T||T|T||T||T|T||" ;
      Ddo_grid_Filterisrange = "T|||||T||||T||T||T|||T||T|||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Date|Date|Numeric|Character|Character|Character|Numeric|Character|Numeric|Character|Numeric|Character|Character|Numeric||Numeric|Character||Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|T||T|T||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|1|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23" ;
      Ddo_grid_Columnids = "3:AlbRecCod|4:AlbREnt|5:AlbREnt2|6:AlbRFen|7:AlbRHEn|8:CliCod|9:CliNom|10:AlbRef|11:AlbRefDsc|12:ProceCod|13:ProceNom|14:TrnCod|15:TrnNom|16:TipEntCod|17:TipEntNom|18:AlbRDes|19:AlbRUniEnt|20:AlbRUni|21:AlbRPieEnt|22:AlbRLoc|23:AlbRReo|24:AlbRPieUti|25:AlbRUniUti" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Detail)", "") );
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
         AV128GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV128GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV128GridActions), 4, 0));
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_45_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBRREO_" + sGXsfl_45_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbREnt2_Visible',ctrl:'ALBRENT2',prop:'Visible'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRHEn_Visible',ctrl:'ALBRHEN',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtTipEntCod_Visible',ctrl:'TIPENTCOD',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRPieUti_Visible',ctrl:'ALBRPIEUTI',prop:'Visible'},{av:'edtAlbRUniUti_Visible',ctrl:'ALBRUNIUTI',prop:'Visible'},{av:'AV121GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV122GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22CE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtAlbREnt_Link',ctrl:'ALBRENT',prop:'Link'},{av:'edtTrnNom_Link',ctrl:'TRNNOM',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbREnt2_Visible',ctrl:'ALBRENT2',prop:'Visible'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRHEn_Visible',ctrl:'ALBRHEN',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtTipEntCod_Visible',ctrl:'TIPENTCOD',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRPieUti_Visible',ctrl:'ALBRPIEUTI',prop:'Visible'},{av:'edtAlbRUniUti_Visible',ctrl:'ALBRUNIUTI',prop:'Visible'},{av:'AV121GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV122GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11CE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbREnt2_Visible',ctrl:'ALBRENT2',prop:'Visible'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRHEn_Visible',ctrl:'ALBRHEN',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtTrnCod_Visible',ctrl:'TRNCOD',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtTipEntCod_Visible',ctrl:'TIPENTCOD',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'cmbAlbRReo'},{av:'edtAlbRPieUti_Visible',ctrl:'ALBRPIEUTI',prop:'Visible'},{av:'edtAlbRUniUti_Visible',ctrl:'ALBRUNIUTI',prop:'Visible'},{av:'AV121GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV122GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23CE2',iparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV128GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16CE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17CE2',iparms:[{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18CE2',iparms:[{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19CE2',iparms:[{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV125FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV50TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV52TFAlbREnt2',fld:'vTFALBRENT2',pic:''},{av:'AV53TFAlbREnt2_Sel',fld:'vTFALBRENT2_SEL',pic:''},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV65TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV66TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV77TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV78TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV83TFTrnCod',fld:'vTFTRNCOD',pic:'ZZZ9'},{av:'AV84TFTrnCod_To',fld:'vTFTRNCOD_TO',pic:'ZZZ9'},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV89TFTipEntCod',fld:'vTFTIPENTCOD',pic:'ZZZ9'},{av:'AV90TFTipEntCod_To',fld:'vTFTIPENTCOD_TO',pic:'ZZZ9'},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV127TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV113TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV114TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV116TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV117TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV178Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV126TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRENT","{handler:'valid_Albrent',iparms:[]");
      setEventMetadata("VALID_ALBRENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRENT2","{handler:'valid_Albrent2',iparms:[]");
      setEventMetadata("VALID_ALBRENT2",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_ALBREFDSC","{handler:'valid_Albrefdsc',iparms:[]");
      setEventMetadata("VALID_ALBREFDSC",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[]");
      setEventMetadata("VALID_PROCECOD",",oparms:[]}");
      setEventMetadata("VALID_PROCENOM","{handler:'valid_Procenom',iparms:[]");
      setEventMetadata("VALID_PROCENOM",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_TRNNOM","{handler:'valid_Trnnom',iparms:[]");
      setEventMetadata("VALID_TRNNOM",",oparms:[]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPENTNOM","{handler:'valid_Tipentnom',iparms:[]");
      setEventMetadata("VALID_TIPENTNOM",",oparms:[]}");
      setEventMetadata("VALID_ALBRDES","{handler:'valid_Albrdes',iparms:[]");
      setEventMetadata("VALID_ALBRDES",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRLOC","{handler:'valid_Albrloc',iparms:[]");
      setEventMetadata("VALID_ALBRLOC",",oparms:[]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
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
      AV39ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV125FilterFullText = "" ;
      AV49TFAlbREnt = "" ;
      AV50TFAlbREnt_Sel = "" ;
      AV52TFAlbREnt2 = "" ;
      AV53TFAlbREnt2_Sel = "" ;
      AV55TFAlbRFen = GXutil.nullDate() ;
      AV60TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV68TFCliNom = "" ;
      AV69TFCliNom_Sel = "" ;
      AV71TFAlbRef = "" ;
      AV72TFAlbRef_Sel = "" ;
      AV74TFAlbRefDsc = "" ;
      AV75TFAlbRefDsc_Sel = "" ;
      AV80TFProceNom = "" ;
      AV81TFProceNom_Sel = "" ;
      AV86TFTrnNom = "" ;
      AV87TFTrnNom_Sel = "" ;
      AV92TFTipEntNom = "" ;
      AV93TFTipEntNom_Sel = "" ;
      AV95TFAlbRDes = "" ;
      AV96TFAlbRDes_Sel = "" ;
      AV98TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV99TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV127TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107TFAlbRLoc = "" ;
      AV108TFAlbRLoc_Sel = "" ;
      AV111TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV116TFAlbRUniUti = DecimalUtil.ZERO ;
      AV117TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV178Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV42ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV119DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV126TFAlbRUni_SelsJson = "" ;
      AV110TFAlbRReo_SelsJson = "" ;
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
      AV57DDO_AlbRFenAuxDate = GXutil.nullDate() ;
      AV62DDO_AlbRHEnAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A50AlbRLoc = "" ;
      A55AlbRReo = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV135Talbdet2wwds_1_filterfulltext = "" ;
      AV138Talbdet2wwds_4_tfalbrent = "" ;
      AV139Talbdet2wwds_5_tfalbrent_sel = "" ;
      AV140Talbdet2wwds_6_tfalbrent2 = "" ;
      AV141Talbdet2wwds_7_tfalbrent2_sel = "" ;
      AV142Talbdet2wwds_8_tfalbrfen = GXutil.nullDate() ;
      AV143Talbdet2wwds_9_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV146Talbdet2wwds_12_tfclinom = "" ;
      AV147Talbdet2wwds_13_tfclinom_sel = "" ;
      AV148Talbdet2wwds_14_tfalbref = "" ;
      AV149Talbdet2wwds_15_tfalbref_sel = "" ;
      AV150Talbdet2wwds_16_tfalbrefdsc = "" ;
      AV151Talbdet2wwds_17_tfalbrefdsc_sel = "" ;
      AV154Talbdet2wwds_20_tfprocenom = "" ;
      AV155Talbdet2wwds_21_tfprocenom_sel = "" ;
      AV158Talbdet2wwds_24_tftrnnom = "" ;
      AV159Talbdet2wwds_25_tftrnnom_sel = "" ;
      AV162Talbdet2wwds_28_tftipentnom = "" ;
      AV163Talbdet2wwds_29_tftipentnom_sel = "" ;
      AV164Talbdet2wwds_30_tfalbrdes = "" ;
      AV165Talbdet2wwds_31_tfalbrdes_sel = "" ;
      AV166Talbdet2wwds_32_tfalbrunient = DecimalUtil.ZERO ;
      AV167Talbdet2wwds_33_tfalbrunient_to = DecimalUtil.ZERO ;
      AV168Talbdet2wwds_34_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV171Talbdet2wwds_37_tfalbrloc = "" ;
      AV172Talbdet2wwds_38_tfalbrloc_sel = "" ;
      AV173Talbdet2wwds_39_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV176Talbdet2wwds_42_tfalbruniuti = DecimalUtil.ZERO ;
      AV177Talbdet2wwds_43_tfalbruniuti_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV135Talbdet2wwds_1_filterfulltext = "" ;
      lV138Talbdet2wwds_4_tfalbrent = "" ;
      lV140Talbdet2wwds_6_tfalbrent2 = "" ;
      lV146Talbdet2wwds_12_tfclinom = "" ;
      lV148Talbdet2wwds_14_tfalbref = "" ;
      lV150Talbdet2wwds_16_tfalbrefdsc = "" ;
      lV154Talbdet2wwds_20_tfprocenom = "" ;
      lV158Talbdet2wwds_24_tftrnnom = "" ;
      lV162Talbdet2wwds_28_tftipentnom = "" ;
      lV164Talbdet2wwds_30_tfalbrdes = "" ;
      lV171Talbdet2wwds_37_tfalbrloc = "" ;
      H00CE2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CE2_A54AlbRPieUti = new int[1] ;
      H00CE2_A55AlbRReo = new String[] {""} ;
      H00CE2_A50AlbRLoc = new String[] {""} ;
      H00CE2_A52AlbRPieEnt = new int[1] ;
      H00CE2_A56AlbRUni = new String[] {""} ;
      H00CE2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CE2_A1291AlbRDes = new String[] {""} ;
      H00CE2_A1212TipEntNom = new String[] {""} ;
      H00CE2_n1212TipEntNom = new boolean[] {false} ;
      H00CE2_A1211TipEntCod = new short[1] ;
      H00CE2_n1211TipEntCod = new boolean[] {false} ;
      H00CE2_A841TrnNom = new String[] {""} ;
      H00CE2_n841TrnNom = new boolean[] {false} ;
      H00CE2_A840TrnCod = new short[1] ;
      H00CE2_n840TrnCod = new boolean[] {false} ;
      H00CE2_A971ProceNom = new String[] {""} ;
      H00CE2_n971ProceNom = new boolean[] {false} ;
      H00CE2_A970ProceCod = new short[1] ;
      H00CE2_n970ProceCod = new boolean[] {false} ;
      H00CE2_A3613AlbRefDsc = new String[] {""} ;
      H00CE2_A45AlbRef = new String[] {""} ;
      H00CE2_A279CliNom = new String[] {""} ;
      H00CE2_A252CliCod = new int[1] ;
      H00CE2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      H00CE2_n4606AlbRHEn = new boolean[] {false} ;
      H00CE2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00CE2_A5806AlbREnt2 = new String[] {""} ;
      H00CE2_A46AlbREnt = new String[] {""} ;
      H00CE2_A44AlbRecCod = new int[1] ;
      H00CE2_A407EmprNom = new String[] {""} ;
      H00CE2_n407EmprNom = new boolean[] {false} ;
      H00CE2_A396EmprCod = new String[] {""} ;
      H00CE3_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CE3_A54AlbRPieUti = new int[1] ;
      H00CE3_A55AlbRReo = new String[] {""} ;
      H00CE3_A50AlbRLoc = new String[] {""} ;
      H00CE3_A52AlbRPieEnt = new int[1] ;
      H00CE3_A56AlbRUni = new String[] {""} ;
      H00CE3_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00CE3_A1291AlbRDes = new String[] {""} ;
      H00CE3_A1212TipEntNom = new String[] {""} ;
      H00CE3_n1212TipEntNom = new boolean[] {false} ;
      H00CE3_A1211TipEntCod = new short[1] ;
      H00CE3_n1211TipEntCod = new boolean[] {false} ;
      H00CE3_A841TrnNom = new String[] {""} ;
      H00CE3_n841TrnNom = new boolean[] {false} ;
      H00CE3_A840TrnCod = new short[1] ;
      H00CE3_n840TrnCod = new boolean[] {false} ;
      H00CE3_A971ProceNom = new String[] {""} ;
      H00CE3_n971ProceNom = new boolean[] {false} ;
      H00CE3_A970ProceCod = new short[1] ;
      H00CE3_n970ProceCod = new boolean[] {false} ;
      H00CE3_A3613AlbRefDsc = new String[] {""} ;
      H00CE3_A45AlbRef = new String[] {""} ;
      H00CE3_A279CliNom = new String[] {""} ;
      H00CE3_A252CliCod = new int[1] ;
      H00CE3_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      H00CE3_n4606AlbRHEn = new boolean[] {false} ;
      H00CE3_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00CE3_A5806AlbREnt2 = new String[] {""} ;
      H00CE3_A46AlbREnt = new String[] {""} ;
      H00CE3_A44AlbRecCod = new int[1] ;
      H00CE3_A407EmprNom = new String[] {""} ;
      H00CE3_n407EmprNom = new boolean[] {false} ;
      H00CE3_A396EmprCod = new String[] {""} ;
      AV131Station = "" ;
      AV132Emprcod = "" ;
      AV133Emprnom = "" ;
      AV134Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV43ManageFiltersXml = "" ;
      AV35ExcelFilename = "" ;
      AV36ErrorMessage = "" ;
      AV38UserCustomValue = "" ;
      AV40ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
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
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState32 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet2ww__default(),
         new Object[] {
             new Object[] {
            H00CE2_A60AlbRUniUti, H00CE2_A54AlbRPieUti, H00CE2_A55AlbRReo, H00CE2_A50AlbRLoc, H00CE2_A52AlbRPieEnt, H00CE2_A56AlbRUni, H00CE2_A58AlbRUniEnt, H00CE2_A1291AlbRDes, H00CE2_A1212TipEntNom, H00CE2_n1212TipEntNom,
            H00CE2_A1211TipEntCod, H00CE2_n1211TipEntCod, H00CE2_A841TrnNom, H00CE2_n841TrnNom, H00CE2_A840TrnCod, H00CE2_n840TrnCod, H00CE2_A971ProceNom, H00CE2_n971ProceNom, H00CE2_A970ProceCod, H00CE2_n970ProceCod,
            H00CE2_A3613AlbRefDsc, H00CE2_A45AlbRef, H00CE2_A279CliNom, H00CE2_A252CliCod, H00CE2_A4606AlbRHEn, H00CE2_n4606AlbRHEn, H00CE2_A49AlbRFen, H00CE2_A5806AlbREnt2, H00CE2_A46AlbREnt, H00CE2_A44AlbRecCod,
            H00CE2_A407EmprNom, H00CE2_n407EmprNom, H00CE2_A396EmprCod
            }
            , new Object[] {
            H00CE3_A60AlbRUniUti, H00CE3_A54AlbRPieUti, H00CE3_A55AlbRReo, H00CE3_A50AlbRLoc, H00CE3_A52AlbRPieEnt, H00CE3_A56AlbRUni, H00CE3_A58AlbRUniEnt, H00CE3_A1291AlbRDes, H00CE3_A1212TipEntNom, H00CE3_n1212TipEntNom,
            H00CE3_A1211TipEntCod, H00CE3_n1211TipEntCod, H00CE3_A841TrnNom, H00CE3_n841TrnNom, H00CE3_A840TrnCod, H00CE3_n840TrnCod, H00CE3_A971ProceNom, H00CE3_n971ProceNom, H00CE3_A970ProceCod, H00CE3_n970ProceCod,
            H00CE3_A3613AlbRefDsc, H00CE3_A45AlbRef, H00CE3_A279CliNom, H00CE3_A252CliCod, H00CE3_A4606AlbRHEn, H00CE3_n4606AlbRHEn, H00CE3_A49AlbRFen, H00CE3_A5806AlbREnt2, H00CE3_A46AlbREnt, H00CE3_A44AlbRecCod,
            H00CE3_A407EmprNom, H00CE3_n407EmprNom, H00CE3_A396EmprCod
            }
         }
      );
      AV178Pgmname = "TALBDET2WW" ;
      /* GeneXus formulas. */
      AV178Pgmname = "TALBDET2WW" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV44ManageFiltersExecutionStep ;
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
   private short AV77TFProceCod ;
   private short AV78TFProceCod_To ;
   private short AV83TFTrnCod ;
   private short AV84TFTrnCod_To ;
   private short AV89TFTipEntCod ;
   private short AV90TFTipEntCod_To ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV128GridActions ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV152Talbdet2wwds_18_tfprocecod ;
   private short AV153Talbdet2wwds_19_tfprocecod_to ;
   private short AV156Talbdet2wwds_22_tftrncod ;
   private short AV157Talbdet2wwds_23_tftrncod_to ;
   private short AV160Talbdet2wwds_26_tftipentcod ;
   private short AV161Talbdet2wwds_27_tftipentcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV46TFAlbRecCod ;
   private int AV47TFAlbRecCod_To ;
   private int AV65TFCliCod ;
   private int AV66TFCliCod_To ;
   private int AV104TFAlbRPieEnt ;
   private int AV105TFAlbRPieEnt_To ;
   private int AV113TFAlbRPieUti ;
   private int AV114TFAlbRPieUti_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int subGrid_Islastpage ;
   private int AV136Talbdet2wwds_2_tfalbreccod ;
   private int AV137Talbdet2wwds_3_tfalbreccod_to ;
   private int AV144Talbdet2wwds_10_tfclicod ;
   private int AV145Talbdet2wwds_11_tfclicod_to ;
   private int AV169Talbdet2wwds_35_tfalbrpieent ;
   private int AV170Talbdet2wwds_36_tfalbrpieent_to ;
   private int AV174Talbdet2wwds_40_tfalbrpieuti ;
   private int AV175Talbdet2wwds_41_tfalbrpieuti_to ;
   private int AV168Talbdet2wwds_34_tfalbruni_sels_size ;
   private int AV173Talbdet2wwds_39_tfalbrreo_sels_size ;
   private int edtAlbRecCod_Visible ;
   private int edtAlbREnt_Visible ;
   private int edtAlbREnt2_Visible ;
   private int edtAlbRFen_Visible ;
   private int edtAlbRHEn_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtAlbRef_Visible ;
   private int edtAlbRefDsc_Visible ;
   private int edtProceCod_Visible ;
   private int edtProceNom_Visible ;
   private int edtTrnCod_Visible ;
   private int edtTrnNom_Visible ;
   private int edtTipEntCod_Visible ;
   private int edtTipEntNom_Visible ;
   private int edtAlbRDes_Visible ;
   private int edtAlbRUniEnt_Visible ;
   private int edtAlbRPieEnt_Visible ;
   private int edtAlbRLoc_Visible ;
   private int edtAlbRPieUti_Visible ;
   private int edtAlbRUniUti_Visible ;
   private int AV120PageToGo ;
   private int AV179GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV121GridCurrentPage ;
   private long AV122GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV98TFAlbRUniEnt ;
   private java.math.BigDecimal AV99TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV116TFAlbRUniUti ;
   private java.math.BigDecimal AV117TFAlbRUniUti_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV166Talbdet2wwds_32_tfalbrunient ;
   private java.math.BigDecimal AV167Talbdet2wwds_33_tfalbrunient_to ;
   private java.math.BigDecimal AV176Talbdet2wwds_42_tfalbruniuti ;
   private java.math.BigDecimal AV177Talbdet2wwds_43_tfalbruniuti_to ;
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
   private String AV49TFAlbREnt ;
   private String AV50TFAlbREnt_Sel ;
   private String AV52TFAlbREnt2 ;
   private String AV53TFAlbREnt2_Sel ;
   private String AV68TFCliNom ;
   private String AV69TFCliNom_Sel ;
   private String AV71TFAlbRef ;
   private String AV72TFAlbRef_Sel ;
   private String AV74TFAlbRefDsc ;
   private String AV75TFAlbRefDsc_Sel ;
   private String AV80TFProceNom ;
   private String AV81TFProceNom_Sel ;
   private String AV86TFTrnNom ;
   private String AV87TFTrnNom_Sel ;
   private String AV92TFTipEntNom ;
   private String AV93TFTipEntNom_Sel ;
   private String AV95TFAlbRDes ;
   private String AV96TFAlbRDes_Sel ;
   private String AV107TFAlbRLoc ;
   private String AV108TFAlbRLoc_Sel ;
   private String AV178Pgmname ;
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
   private String divDdo_albrfenauxdates_Internalname ;
   private String edtavDdo_albrfenauxdate_Internalname ;
   private String edtavDdo_albrfenauxdate_Jsonclick ;
   private String divDdo_albrhenauxdates_Internalname ;
   private String edtavDdo_albrhenauxdate_Internalname ;
   private String edtavDdo_albrhenauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Internalname ;
   private String A5806AlbREnt2 ;
   private String edtAlbREnt2_Internalname ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRHEn_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String edtProceCod_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Internalname ;
   private String edtTrnCod_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Internalname ;
   private String edtTipEntCod_Internalname ;
   private String A1212TipEntNom ;
   private String edtTipEntNom_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Internalname ;
   private String edtAlbRUniEnt_Internalname ;
   private String A56AlbRUni ;
   private String edtAlbRPieEnt_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Internalname ;
   private String A55AlbRReo ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV138Talbdet2wwds_4_tfalbrent ;
   private String AV139Talbdet2wwds_5_tfalbrent_sel ;
   private String AV140Talbdet2wwds_6_tfalbrent2 ;
   private String AV141Talbdet2wwds_7_tfalbrent2_sel ;
   private String AV146Talbdet2wwds_12_tfclinom ;
   private String AV147Talbdet2wwds_13_tfclinom_sel ;
   private String AV148Talbdet2wwds_14_tfalbref ;
   private String AV149Talbdet2wwds_15_tfalbref_sel ;
   private String AV150Talbdet2wwds_16_tfalbrefdsc ;
   private String AV151Talbdet2wwds_17_tfalbrefdsc_sel ;
   private String AV154Talbdet2wwds_20_tfprocenom ;
   private String AV155Talbdet2wwds_21_tfprocenom_sel ;
   private String AV158Talbdet2wwds_24_tftrnnom ;
   private String AV159Talbdet2wwds_25_tftrnnom_sel ;
   private String AV162Talbdet2wwds_28_tftipentnom ;
   private String AV163Talbdet2wwds_29_tftipentnom_sel ;
   private String AV164Talbdet2wwds_30_tfalbrdes ;
   private String AV165Talbdet2wwds_31_tfalbrdes_sel ;
   private String AV171Talbdet2wwds_37_tfalbrloc ;
   private String AV172Talbdet2wwds_38_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV138Talbdet2wwds_4_tfalbrent ;
   private String lV140Talbdet2wwds_6_tfalbrent2 ;
   private String lV146Talbdet2wwds_12_tfclinom ;
   private String lV148Talbdet2wwds_14_tfalbref ;
   private String lV150Talbdet2wwds_16_tfalbrefdsc ;
   private String lV154Talbdet2wwds_20_tfprocenom ;
   private String lV158Talbdet2wwds_24_tftrnnom ;
   private String lV162Talbdet2wwds_28_tftipentnom ;
   private String lV164Talbdet2wwds_30_tfalbrdes ;
   private String lV171Talbdet2wwds_37_tfalbrloc ;
   private String AV131Station ;
   private String AV132Emprcod ;
   private String AV133Emprnom ;
   private String AV134Usurcod ;
   private String edtAlbREnt_Link ;
   private String edtTrnNom_Link ;
   private String GXt_char1 ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
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
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
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
   private String edtEmprNom_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbREnt_Jsonclick ;
   private String edtAlbREnt2_Jsonclick ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbRHEn_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtProceCod_Jsonclick ;
   private String edtProceNom_Jsonclick ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Jsonclick ;
   private String edtTipEntCod_Jsonclick ;
   private String edtTipEntNom_Jsonclick ;
   private String edtAlbRDes_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRLoc_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV60TFAlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV143Talbdet2wwds_9_tfalbrhen ;
   private java.util.Date AV55TFAlbRFen ;
   private java.util.Date AV57DDO_AlbRFenAuxDate ;
   private java.util.Date AV62DDO_AlbRHEnAuxDate ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV142Talbdet2wwds_8_tfalbrfen ;
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
   private boolean n407EmprNom ;
   private boolean n4606AlbRHEn ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n840TrnCod ;
   private boolean n841TrnNom ;
   private boolean n1211TipEntCod ;
   private boolean n1212TipEntNom ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV126TFAlbRUni_SelsJson ;
   private String AV110TFAlbRReo_SelsJson ;
   private String AV37ColumnsSelectorXML ;
   private String AV43ManageFiltersXml ;
   private String AV38UserCustomValue ;
   private String AV125FilterFullText ;
   private String AV135Talbdet2wwds_1_filterfulltext ;
   private String lV135Talbdet2wwds_1_filterfulltext ;
   private String AV35ExcelFilename ;
   private String AV36ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H00CE2_A60AlbRUniUti ;
   private int[] H00CE2_A54AlbRPieUti ;
   private String[] H00CE2_A55AlbRReo ;
   private String[] H00CE2_A50AlbRLoc ;
   private int[] H00CE2_A52AlbRPieEnt ;
   private String[] H00CE2_A56AlbRUni ;
   private java.math.BigDecimal[] H00CE2_A58AlbRUniEnt ;
   private String[] H00CE2_A1291AlbRDes ;
   private String[] H00CE2_A1212TipEntNom ;
   private boolean[] H00CE2_n1212TipEntNom ;
   private short[] H00CE2_A1211TipEntCod ;
   private boolean[] H00CE2_n1211TipEntCod ;
   private String[] H00CE2_A841TrnNom ;
   private boolean[] H00CE2_n841TrnNom ;
   private short[] H00CE2_A840TrnCod ;
   private boolean[] H00CE2_n840TrnCod ;
   private String[] H00CE2_A971ProceNom ;
   private boolean[] H00CE2_n971ProceNom ;
   private short[] H00CE2_A970ProceCod ;
   private boolean[] H00CE2_n970ProceCod ;
   private String[] H00CE2_A3613AlbRefDsc ;
   private String[] H00CE2_A45AlbRef ;
   private String[] H00CE2_A279CliNom ;
   private int[] H00CE2_A252CliCod ;
   private java.util.Date[] H00CE2_A4606AlbRHEn ;
   private boolean[] H00CE2_n4606AlbRHEn ;
   private java.util.Date[] H00CE2_A49AlbRFen ;
   private String[] H00CE2_A5806AlbREnt2 ;
   private String[] H00CE2_A46AlbREnt ;
   private int[] H00CE2_A44AlbRecCod ;
   private String[] H00CE2_A407EmprNom ;
   private boolean[] H00CE2_n407EmprNom ;
   private String[] H00CE2_A396EmprCod ;
   private java.math.BigDecimal[] H00CE3_A60AlbRUniUti ;
   private int[] H00CE3_A54AlbRPieUti ;
   private String[] H00CE3_A55AlbRReo ;
   private String[] H00CE3_A50AlbRLoc ;
   private int[] H00CE3_A52AlbRPieEnt ;
   private String[] H00CE3_A56AlbRUni ;
   private java.math.BigDecimal[] H00CE3_A58AlbRUniEnt ;
   private String[] H00CE3_A1291AlbRDes ;
   private String[] H00CE3_A1212TipEntNom ;
   private boolean[] H00CE3_n1212TipEntNom ;
   private short[] H00CE3_A1211TipEntCod ;
   private boolean[] H00CE3_n1211TipEntCod ;
   private String[] H00CE3_A841TrnNom ;
   private boolean[] H00CE3_n841TrnNom ;
   private short[] H00CE3_A840TrnCod ;
   private boolean[] H00CE3_n840TrnCod ;
   private String[] H00CE3_A971ProceNom ;
   private boolean[] H00CE3_n971ProceNom ;
   private short[] H00CE3_A970ProceCod ;
   private boolean[] H00CE3_n970ProceCod ;
   private String[] H00CE3_A3613AlbRefDsc ;
   private String[] H00CE3_A45AlbRef ;
   private String[] H00CE3_A279CliNom ;
   private int[] H00CE3_A252CliCod ;
   private java.util.Date[] H00CE3_A4606AlbRHEn ;
   private boolean[] H00CE3_n4606AlbRHEn ;
   private java.util.Date[] H00CE3_A49AlbRFen ;
   private String[] H00CE3_A5806AlbREnt2 ;
   private String[] H00CE3_A46AlbREnt ;
   private int[] H00CE3_A44AlbRecCod ;
   private String[] H00CE3_A407EmprNom ;
   private boolean[] H00CE3_n407EmprNom ;
   private String[] H00CE3_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV127TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV111TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV168Talbdet2wwds_34_tfalbruni_sels ;
   private GXSimpleCollection<String> AV173Talbdet2wwds_39_tfalbrreo_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV42ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV119DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class talbdet2ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00CE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV168Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV173Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV136Talbdet2wwds_2_tfalbreccod ,
                                          int AV137Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV139Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV138Talbdet2wwds_4_tfalbrent ,
                                          String AV141Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV140Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV142Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV143Talbdet2wwds_9_tfalbrhen ,
                                          int AV144Talbdet2wwds_10_tfclicod ,
                                          int AV145Talbdet2wwds_11_tfclicod_to ,
                                          String AV147Talbdet2wwds_13_tfclinom_sel ,
                                          String AV146Talbdet2wwds_12_tfclinom ,
                                          String AV149Talbdet2wwds_15_tfalbref_sel ,
                                          String AV148Talbdet2wwds_14_tfalbref ,
                                          String AV151Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV150Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV152Talbdet2wwds_18_tfprocecod ,
                                          short AV153Talbdet2wwds_19_tfprocecod_to ,
                                          String AV155Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV154Talbdet2wwds_20_tfprocenom ,
                                          short AV156Talbdet2wwds_22_tftrncod ,
                                          short AV157Talbdet2wwds_23_tftrncod_to ,
                                          String AV159Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV158Talbdet2wwds_24_tftrnnom ,
                                          short AV160Talbdet2wwds_26_tftipentcod ,
                                          short AV161Talbdet2wwds_27_tftipentcod_to ,
                                          String AV163Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV162Talbdet2wwds_28_tftipentnom ,
                                          String AV165Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV164Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV166Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV167Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV168Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV169Talbdet2wwds_35_tfalbrpieent ,
                                          int AV170Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV172Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV171Talbdet2wwds_37_tfalbrloc ,
                                          int AV173Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV174Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV175Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV176Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV177Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV135Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[40];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRReo, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUni, T1.AlbRUniEnt, T1.AlbRDes, T6.TipEntNom, T1.TipEntCod, T4.TrnNom, T1.TrnCod," ;
      scmdbuf += " T5.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T3.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T2.EmprNom, T1.EmprCod FROM" ;
      scmdbuf += " (((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T6" ;
      scmdbuf += " ON T6.EmprCod = T1.EmprCod AND T6.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV136Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int33[0] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int33[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV140Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int33[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int33[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int33[7] = (byte)(1) ;
      }
      if ( ! (0==AV144Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( ! (0==AV145Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV146Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int33[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV148Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int33[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV150Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! (0==AV152Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! (0==AV153Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV154Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! (0==AV156Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (0==AV157Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV158Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( ! (0==AV160Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (0==AV161Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV162Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.TipEntNom = ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV164Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( AV168Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV168Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV169Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (0==AV170Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV171Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( AV173Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV173Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV174Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (0==AV175Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ProceNom" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ProceNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipEntCod" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipEntCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.TipEntNom" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.TipEntNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H00CE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV168Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV173Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV136Talbdet2wwds_2_tfalbreccod ,
                                          int AV137Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV139Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV138Talbdet2wwds_4_tfalbrent ,
                                          String AV141Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV140Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV142Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV143Talbdet2wwds_9_tfalbrhen ,
                                          int AV144Talbdet2wwds_10_tfclicod ,
                                          int AV145Talbdet2wwds_11_tfclicod_to ,
                                          String AV147Talbdet2wwds_13_tfclinom_sel ,
                                          String AV146Talbdet2wwds_12_tfclinom ,
                                          String AV149Talbdet2wwds_15_tfalbref_sel ,
                                          String AV148Talbdet2wwds_14_tfalbref ,
                                          String AV151Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV150Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV152Talbdet2wwds_18_tfprocecod ,
                                          short AV153Talbdet2wwds_19_tfprocecod_to ,
                                          String AV155Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV154Talbdet2wwds_20_tfprocenom ,
                                          short AV156Talbdet2wwds_22_tftrncod ,
                                          short AV157Talbdet2wwds_23_tftrncod_to ,
                                          String AV159Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV158Talbdet2wwds_24_tftrnnom ,
                                          short AV160Talbdet2wwds_26_tftipentcod ,
                                          short AV161Talbdet2wwds_27_tftipentcod_to ,
                                          String AV163Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV162Talbdet2wwds_28_tftipentnom ,
                                          String AV165Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV164Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV166Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV167Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV168Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV169Talbdet2wwds_35_tfalbrpieent ,
                                          int AV170Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV172Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV171Talbdet2wwds_37_tfalbrloc ,
                                          int AV173Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV174Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV175Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV176Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV177Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV135Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[40];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRReo, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUni, T1.AlbRUniEnt, T1.AlbRDes, T6.TipEntNom, T1.TipEntCod, T4.TrnNom, T1.TrnCod," ;
      scmdbuf += " T5.ProceNom, T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T3.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T2.EmprNom, T1.EmprCod FROM" ;
      scmdbuf += " (((((TXPALBREC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod AND T5.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T6" ;
      scmdbuf += " ON T6.EmprCod = T1.EmprCod AND T6.TipEntCod = T1.TipEntCod)" ;
      if ( ! (0==AV136Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int36[0] = (byte)(1) ;
      }
      if ( ! (0==AV137Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int36[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV138Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int36[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV140Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int36[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV142Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int36[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV143Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int36[7] = (byte)(1) ;
      }
      if ( ! (0==AV144Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int36[8] = (byte)(1) ;
      }
      if ( ! (0==AV145Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int36[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV146Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int36[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV148Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int36[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV150Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( ! (0==AV152Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (0==AV153Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV154Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( ! (0==AV156Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! (0==AV157Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV158Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int36[23] = (byte)(1) ;
      }
      if ( ! (0==AV160Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int36[24] = (byte)(1) ;
      }
      if ( ! (0==AV161Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int36[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV163Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV162Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.TipEntNom = ?)");
      }
      else
      {
         GXv_int36[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV164Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int36[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV166Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int36[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV167Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int36[31] = (byte)(1) ;
      }
      if ( AV168Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV168Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV169Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int36[32] = (byte)(1) ;
      }
      if ( ! (0==AV170Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int36[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV171Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int36[35] = (byte)(1) ;
      }
      if ( AV173Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV173Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV174Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int36[36] = (byte)(1) ;
      }
      if ( ! (0==AV175Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int36[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int36[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int36[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ProceNom" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ProceNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipEntCod" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipEntCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.TipEntNom" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.TipEntNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV13OrderedBy == 16 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV13OrderedBy == 17 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV13OrderedBy == 18 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV13OrderedBy == 19 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV13OrderedBy == 20 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV13OrderedBy == 21 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV13OrderedBy == 22 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV13OrderedBy == 23 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
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
                  return conditional_H00CE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , ((Number) dynConstraints[67]).shortValue() , ((Boolean) dynConstraints[68]).booleanValue() , (String)dynConstraints[69] );
            case 1 :
                  return conditional_H00CE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , ((Number) dynConstraints[67]).shortValue() , ((Boolean) dynConstraints[68]).booleanValue() , (String)dynConstraints[69] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00CE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00CE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((String[]) buf[22])[0] = rslt.getString(17, 30);
               ((int[]) buf[23])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 20);
               ((String[]) buf[28])[0] = rslt.getString(22, 8);
               ((int[]) buf[29])[0] = rslt.getInt(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(25, 3);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 25);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((String[]) buf[22])[0] = rslt.getString(17, 30);
               ((int[]) buf[23])[0] = rslt.getInt(18);
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(20);
               ((String[]) buf[27])[0] = rslt.getString(21, 20);
               ((String[]) buf[28])[0] = rslt.getString(22, 8);
               ((int[]) buf[29])[0] = rslt.getInt(23);
               ((String[]) buf[30])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(25, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
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
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
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
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
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
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
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

