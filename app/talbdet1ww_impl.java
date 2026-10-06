package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdet1ww_impl extends GXDataArea
{
   public talbdet1ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbdet1ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbdet1ww_impl.class ));
   }

   public talbdet1ww_impl( int remoteHandle ,
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
      AV133FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV46TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV47TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV55TFAlbRFen = localUtil.parseDateParm( httpContext.GetPar( "TFAlbRFen")) ;
      AV60TFAlbRHEn = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbRHEn")) ;
      AV68TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV69TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV71TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV72TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV74TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV75TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      AV80TFProceNom = httpContext.GetPar( "TFProceNom") ;
      AV81TFProceNom_Sel = httpContext.GetPar( "TFProceNom_Sel") ;
      AV86TFTrnNom = httpContext.GetPar( "TFTrnNom") ;
      AV87TFTrnNom_Sel = httpContext.GetPar( "TFTrnNom_Sel") ;
      AV92TFTipEntNom = httpContext.GetPar( "TFTipEntNom") ;
      AV93TFTipEntNom_Sel = httpContext.GetPar( "TFTipEntNom_Sel") ;
      AV95TFAlbRDes = httpContext.GetPar( "TFAlbRDes") ;
      AV96TFAlbRDes_Sel = httpContext.GetPar( "TFAlbRDes_Sel") ;
      AV98TFAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt"), ".") ;
      AV99TFAlbRUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV135TFAlbRUni_Sels);
      AV104TFAlbRPieEnt = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt"))) ;
      AV105TFAlbRPieEnt_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt_To"))) ;
      AV107TFAlbRLoc = httpContext.GetPar( "TFAlbRLoc") ;
      AV108TFAlbRLoc_Sel = httpContext.GetPar( "TFAlbRLoc_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV111TFAlbRReo_Sels);
      AV170Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV133FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV55TFAlbRFen, AV60TFAlbRHEn, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV80TFProceNom, AV81TFProceNom_Sel, AV86TFTrnNom, AV87TFTrnNom_Sel, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV135TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
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
      paC12( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startC12( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.talbdet1ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRFEN", localUtil.dtoc( AV55TFAlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRHEN", localUtil.ttoc( AV60TFAlbRHEn, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV68TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV69TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV71TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV72TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC", GXutil.rtrim( AV74TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC_SEL", GXutil.rtrim( AV75TFAlbRefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENOM", GXutil.rtrim( AV80TFProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENOM_SEL", GXutil.rtrim( AV81TFProceNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM", GXutil.rtrim( AV86TFTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTRNNOM_SEL", GXutil.rtrim( AV87TFTrnNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPENTNOM", GXutil.rtrim( AV92TFTipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFTIPENTNOM_SEL", GXutil.rtrim( AV93TFTipEntNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRDES", GXutil.rtrim( AV95TFAlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRDES_SEL", GXutil.rtrim( AV96TFAlbRDes_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV98TFAlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV99TFAlbRUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV135TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV135TFAlbRUni_Sels);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV170Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNI_SELSJSON", AV134TFAlbRUni_SelsJson);
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
         weC12( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtC12( ) ;
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
      return formatLink("app.talbdet1ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TALBDET1WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Header)", "") ;
   }

   public void wbC10( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_C12( true) ;
      }
      else
      {
         wb_table1_27_C12( false) ;
      }
      return  ;
   }

   public void wb_table1_27_C12e( boolean wbgen )
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
         wb_table2_73_C12( true) ;
      }
      else
      {
         wb_table2_73_C12( false) ;
      }
      return  ;
   }

   public void wb_table2_73_C12e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albrfenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrfenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrfenauxdate_Internalname, localUtil.format(AV57DDO_AlbRFenAuxDate, "99/99/99"), localUtil.format( AV57DDO_AlbRFenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrfenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrfenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albrhenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_45_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrhenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrhenauxdate_Internalname, localUtil.format(AV62DDO_AlbRHEnAuxDate, "99/99/99"), localUtil.format( AV62DDO_AlbRHEnAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrhenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrhenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDET1WW.htm");
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

   public void startC12( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Header)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupC10( ) ;
   }

   public void wsC12( )
   {
      startC12( ) ;
      evtC12( ) ;
   }

   public void evtC12( )
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
                           e11C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18C12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19C12 ();
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
                           AV136GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136GridActions), 4, 0));
                           AV132DetallePiezas = httpContext.cgiGet( edtavDetallepiezas_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetallepiezas_Internalname, AV132DetallePiezas);
                           AV125Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV125Eliminar);
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A49AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbRFen_Internalname), 0)) ;
                           A4606AlbRHEn = localUtil.ctot( httpContext.cgiGet( edtAlbRHEn_Internalname), 0) ;
                           n4606AlbRHEn = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
                           n971ProceNom = false ;
                           A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
                           n841TrnNom = false ;
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
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20C12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21C12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22C12 ();
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

   public void weC12( )
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

   public void paC12( )
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
                                 String AV133FilterFullText ,
                                 int AV46TFAlbRecCod ,
                                 int AV47TFAlbRecCod_To ,
                                 java.util.Date AV55TFAlbRFen ,
                                 java.util.Date AV60TFAlbRHEn ,
                                 String AV68TFCliNom ,
                                 String AV69TFCliNom_Sel ,
                                 String AV71TFAlbRef ,
                                 String AV72TFAlbRef_Sel ,
                                 String AV74TFAlbRefDsc ,
                                 String AV75TFAlbRefDsc_Sel ,
                                 String AV80TFProceNom ,
                                 String AV81TFProceNom_Sel ,
                                 String AV86TFTrnNom ,
                                 String AV87TFTrnNom_Sel ,
                                 String AV92TFTipEntNom ,
                                 String AV93TFTipEntNom_Sel ,
                                 String AV95TFAlbRDes ,
                                 String AV96TFAlbRDes_Sel ,
                                 java.math.BigDecimal AV98TFAlbRUniEnt ,
                                 java.math.BigDecimal AV99TFAlbRUniEnt_To ,
                                 GXSimpleCollection<String> AV135TFAlbRUni_Sels ,
                                 int AV104TFAlbRPieEnt ,
                                 int AV105TFAlbRPieEnt_To ,
                                 String AV107TFAlbRLoc ,
                                 String AV108TFAlbRLoc_Sel ,
                                 GXSimpleCollection<String> AV111TFAlbRReo_Sels ,
                                 String AV170Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21C12 ();
      GRID_nCurrentRecord = 0 ;
      rfC12( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      rfC12( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV170Pgmname = "TALBDET1WW" ;
      Gx_err = (short)(0) ;
      edtavDetallepiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetallepiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetallepiezas_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavEliminar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV143Talbdet1wwds_1_filterfulltext = AV133FilterFullText ;
      AV144Talbdet1wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV145Talbdet1wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV146Talbdet1wwds_4_tfalbrfen = AV55TFAlbRFen ;
      AV147Talbdet1wwds_5_tfalbrhen = AV60TFAlbRHEn ;
      AV148Talbdet1wwds_6_tfclinom = AV68TFCliNom ;
      AV149Talbdet1wwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV150Talbdet1wwds_8_tfalbref = AV71TFAlbRef ;
      AV151Talbdet1wwds_9_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV152Talbdet1wwds_10_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV154Talbdet1wwds_12_tfprocenom = AV80TFProceNom ;
      AV155Talbdet1wwds_13_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet1wwds_14_tftrnnom = AV86TFTrnNom ;
      AV157Talbdet1wwds_15_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV158Talbdet1wwds_16_tftipentnom = AV92TFTipEntNom ;
      AV159Talbdet1wwds_17_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV160Talbdet1wwds_18_tfalbrdes = AV95TFAlbRDes ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV162Talbdet1wwds_20_tfalbrunient = AV98TFAlbRUniEnt ;
      AV163Talbdet1wwds_21_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV164Talbdet1wwds_22_tfalbruni_sels = AV135TFAlbRUni_Sels ;
      AV165Talbdet1wwds_23_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV166Talbdet1wwds_24_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV167Talbdet1wwds_25_tfalbrloc = AV107TFAlbRLoc ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV164Talbdet1wwds_22_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV169Talbdet1wwds_27_tfalbrreo_sels ,
                                           Integer.valueOf(AV144Talbdet1wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV145Talbdet1wwds_3_tfalbreccod_to) ,
                                           AV146Talbdet1wwds_4_tfalbrfen ,
                                           AV147Talbdet1wwds_5_tfalbrhen ,
                                           AV149Talbdet1wwds_7_tfclinom_sel ,
                                           AV148Talbdet1wwds_6_tfclinom ,
                                           AV151Talbdet1wwds_9_tfalbref_sel ,
                                           AV150Talbdet1wwds_8_tfalbref ,
                                           AV153Talbdet1wwds_11_tfalbrefdsc_sel ,
                                           AV152Talbdet1wwds_10_tfalbrefdsc ,
                                           AV155Talbdet1wwds_13_tfprocenom_sel ,
                                           AV154Talbdet1wwds_12_tfprocenom ,
                                           AV157Talbdet1wwds_15_tftrnnom_sel ,
                                           AV156Talbdet1wwds_14_tftrnnom ,
                                           AV159Talbdet1wwds_17_tftipentnom_sel ,
                                           AV158Talbdet1wwds_16_tftipentnom ,
                                           AV161Talbdet1wwds_19_tfalbrdes_sel ,
                                           AV160Talbdet1wwds_18_tfalbrdes ,
                                           AV162Talbdet1wwds_20_tfalbrunient ,
                                           AV163Talbdet1wwds_21_tfalbrunient_to ,
                                           Integer.valueOf(AV164Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV165Talbdet1wwds_23_tfalbrpieent) ,
                                           Integer.valueOf(AV166Talbdet1wwds_24_tfalbrpieent_to) ,
                                           AV168Talbdet1wwds_26_tfalbrloc_sel ,
                                           AV167Talbdet1wwds_25_tfalbrloc ,
                                           Integer.valueOf(AV169Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A971ProceNom ,
                                           A841TrnNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV143Talbdet1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV148Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV148Talbdet1wwds_6_tfclinom), 30, "%") ;
      lV150Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV150Talbdet1wwds_8_tfalbref), 16, "%") ;
      lV152Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV152Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
      lV154Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV154Talbdet1wwds_12_tfprocenom), 30, "%") ;
      lV156Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV156Talbdet1wwds_14_tftrnnom), 30, "%") ;
      lV158Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV158Talbdet1wwds_16_tftipentnom), 25, "%") ;
      lV160Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV160Talbdet1wwds_18_tfalbrdes), 20, "%") ;
      lV167Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV167Talbdet1wwds_25_tfalbrloc), 10, "%") ;
      /* Using cursor H00C12 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV144Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV145Talbdet1wwds_3_tfalbreccod_to), AV146Talbdet1wwds_4_tfalbrfen, AV147Talbdet1wwds_5_tfalbrhen, lV148Talbdet1wwds_6_tfclinom, AV149Talbdet1wwds_7_tfclinom_sel, lV150Talbdet1wwds_8_tfalbref, AV151Talbdet1wwds_9_tfalbref_sel, lV152Talbdet1wwds_10_tfalbrefdsc, AV153Talbdet1wwds_11_tfalbrefdsc_sel, lV154Talbdet1wwds_12_tfprocenom, AV155Talbdet1wwds_13_tfprocenom_sel, lV156Talbdet1wwds_14_tftrnnom, AV157Talbdet1wwds_15_tftrnnom_sel, lV158Talbdet1wwds_16_tftipentnom, AV159Talbdet1wwds_17_tftipentnom_sel, lV160Talbdet1wwds_18_tfalbrdes, AV161Talbdet1wwds_19_tfalbrdes_sel, AV162Talbdet1wwds_20_tfalbrunient, AV163Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV165Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV166Talbdet1wwds_24_tfalbrpieent_to), lV167Talbdet1wwds_25_tfalbrloc, AV168Talbdet1wwds_26_tfalbrloc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A840TrnCod = H00C12_A840TrnCod[0] ;
         n840TrnCod = H00C12_n840TrnCod[0] ;
         A970ProceCod = H00C12_A970ProceCod[0] ;
         n970ProceCod = H00C12_n970ProceCod[0] ;
         A1211TipEntCod = H00C12_A1211TipEntCod[0] ;
         n1211TipEntCod = H00C12_n1211TipEntCod[0] ;
         A396EmprCod = H00C12_A396EmprCod[0] ;
         A252CliCod = H00C12_A252CliCod[0] ;
         A55AlbRReo = H00C12_A55AlbRReo[0] ;
         A50AlbRLoc = H00C12_A50AlbRLoc[0] ;
         A52AlbRPieEnt = H00C12_A52AlbRPieEnt[0] ;
         A56AlbRUni = H00C12_A56AlbRUni[0] ;
         A58AlbRUniEnt = H00C12_A58AlbRUniEnt[0] ;
         A1291AlbRDes = H00C12_A1291AlbRDes[0] ;
         A1212TipEntNom = H00C12_A1212TipEntNom[0] ;
         n1212TipEntNom = H00C12_n1212TipEntNom[0] ;
         A841TrnNom = H00C12_A841TrnNom[0] ;
         n841TrnNom = H00C12_n841TrnNom[0] ;
         A971ProceNom = H00C12_A971ProceNom[0] ;
         n971ProceNom = H00C12_n971ProceNom[0] ;
         A3613AlbRefDsc = H00C12_A3613AlbRefDsc[0] ;
         A45AlbRef = H00C12_A45AlbRef[0] ;
         A279CliNom = H00C12_A279CliNom[0] ;
         A4606AlbRHEn = H00C12_A4606AlbRHEn[0] ;
         n4606AlbRHEn = H00C12_n4606AlbRHEn[0] ;
         A49AlbRFen = H00C12_A49AlbRFen[0] ;
         A44AlbRecCod = H00C12_A44AlbRecCod[0] ;
         A841TrnNom = H00C12_A841TrnNom[0] ;
         n841TrnNom = H00C12_n841TrnNom[0] ;
         A971ProceNom = H00C12_A971ProceNom[0] ;
         n971ProceNom = H00C12_n971ProceNom[0] ;
         A1212TipEntNom = H00C12_A1212TipEntNom[0] ;
         n1212TipEntNom = H00C12_n1212TipEntNom[0] ;
         A279CliNom = H00C12_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV143Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV143Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV143Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV143Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) ) ) )
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

   public void rfC12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21C12 ();
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
                                              AV164Talbdet1wwds_22_tfalbruni_sels ,
                                              A55AlbRReo ,
                                              AV169Talbdet1wwds_27_tfalbrreo_sels ,
                                              Integer.valueOf(AV144Talbdet1wwds_2_tfalbreccod) ,
                                              Integer.valueOf(AV145Talbdet1wwds_3_tfalbreccod_to) ,
                                              AV146Talbdet1wwds_4_tfalbrfen ,
                                              AV147Talbdet1wwds_5_tfalbrhen ,
                                              AV149Talbdet1wwds_7_tfclinom_sel ,
                                              AV148Talbdet1wwds_6_tfclinom ,
                                              AV151Talbdet1wwds_9_tfalbref_sel ,
                                              AV150Talbdet1wwds_8_tfalbref ,
                                              AV153Talbdet1wwds_11_tfalbrefdsc_sel ,
                                              AV152Talbdet1wwds_10_tfalbrefdsc ,
                                              AV155Talbdet1wwds_13_tfprocenom_sel ,
                                              AV154Talbdet1wwds_12_tfprocenom ,
                                              AV157Talbdet1wwds_15_tftrnnom_sel ,
                                              AV156Talbdet1wwds_14_tftrnnom ,
                                              AV159Talbdet1wwds_17_tftipentnom_sel ,
                                              AV158Talbdet1wwds_16_tftipentnom ,
                                              AV161Talbdet1wwds_19_tfalbrdes_sel ,
                                              AV160Talbdet1wwds_18_tfalbrdes ,
                                              AV162Talbdet1wwds_20_tfalbrunient ,
                                              AV163Talbdet1wwds_21_tfalbrunient_to ,
                                              Integer.valueOf(AV164Talbdet1wwds_22_tfalbruni_sels.size()) ,
                                              Integer.valueOf(AV165Talbdet1wwds_23_tfalbrpieent) ,
                                              Integer.valueOf(AV166Talbdet1wwds_24_tfalbrpieent_to) ,
                                              AV168Talbdet1wwds_26_tfalbrloc_sel ,
                                              AV167Talbdet1wwds_25_tfalbrloc ,
                                              Integer.valueOf(AV169Talbdet1wwds_27_tfalbrreo_sels.size()) ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A49AlbRFen ,
                                              A4606AlbRHEn ,
                                              A279CliNom ,
                                              A45AlbRef ,
                                              A3613AlbRefDsc ,
                                              A971ProceNom ,
                                              A841TrnNom ,
                                              A1212TipEntNom ,
                                              A1291AlbRDes ,
                                              A58AlbRUniEnt ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              A50AlbRLoc ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV143Talbdet1wwds_1_filterfulltext } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV148Talbdet1wwds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV148Talbdet1wwds_6_tfclinom), 30, "%") ;
         lV150Talbdet1wwds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV150Talbdet1wwds_8_tfalbref), 16, "%") ;
         lV152Talbdet1wwds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV152Talbdet1wwds_10_tfalbrefdsc), 26, "%") ;
         lV154Talbdet1wwds_12_tfprocenom = GXutil.padr( GXutil.rtrim( AV154Talbdet1wwds_12_tfprocenom), 30, "%") ;
         lV156Talbdet1wwds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV156Talbdet1wwds_14_tftrnnom), 30, "%") ;
         lV158Talbdet1wwds_16_tftipentnom = GXutil.padr( GXutil.rtrim( AV158Talbdet1wwds_16_tftipentnom), 25, "%") ;
         lV160Talbdet1wwds_18_tfalbrdes = GXutil.padr( GXutil.rtrim( AV160Talbdet1wwds_18_tfalbrdes), 20, "%") ;
         lV167Talbdet1wwds_25_tfalbrloc = GXutil.padr( GXutil.rtrim( AV167Talbdet1wwds_25_tfalbrloc), 10, "%") ;
         /* Using cursor H00C13 */
         pr_default.execute(1, new Object[] {Integer.valueOf(AV144Talbdet1wwds_2_tfalbreccod), Integer.valueOf(AV145Talbdet1wwds_3_tfalbreccod_to), AV146Talbdet1wwds_4_tfalbrfen, AV147Talbdet1wwds_5_tfalbrhen, lV148Talbdet1wwds_6_tfclinom, AV149Talbdet1wwds_7_tfclinom_sel, lV150Talbdet1wwds_8_tfalbref, AV151Talbdet1wwds_9_tfalbref_sel, lV152Talbdet1wwds_10_tfalbrefdsc, AV153Talbdet1wwds_11_tfalbrefdsc_sel, lV154Talbdet1wwds_12_tfprocenom, AV155Talbdet1wwds_13_tfprocenom_sel, lV156Talbdet1wwds_14_tftrnnom, AV157Talbdet1wwds_15_tftrnnom_sel, lV158Talbdet1wwds_16_tftipentnom, AV159Talbdet1wwds_17_tftipentnom_sel, lV160Talbdet1wwds_18_tfalbrdes, AV161Talbdet1wwds_19_tfalbrdes_sel, AV162Talbdet1wwds_20_tfalbrunient, AV163Talbdet1wwds_21_tfalbrunient_to, Integer.valueOf(AV165Talbdet1wwds_23_tfalbrpieent), Integer.valueOf(AV166Talbdet1wwds_24_tfalbrpieent_to), lV167Talbdet1wwds_25_tfalbrloc, AV168Talbdet1wwds_26_tfalbrloc_sel});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A840TrnCod = H00C13_A840TrnCod[0] ;
            n840TrnCod = H00C13_n840TrnCod[0] ;
            A970ProceCod = H00C13_A970ProceCod[0] ;
            n970ProceCod = H00C13_n970ProceCod[0] ;
            A1211TipEntCod = H00C13_A1211TipEntCod[0] ;
            n1211TipEntCod = H00C13_n1211TipEntCod[0] ;
            A396EmprCod = H00C13_A396EmprCod[0] ;
            A252CliCod = H00C13_A252CliCod[0] ;
            A55AlbRReo = H00C13_A55AlbRReo[0] ;
            A50AlbRLoc = H00C13_A50AlbRLoc[0] ;
            A52AlbRPieEnt = H00C13_A52AlbRPieEnt[0] ;
            A56AlbRUni = H00C13_A56AlbRUni[0] ;
            A58AlbRUniEnt = H00C13_A58AlbRUniEnt[0] ;
            A1291AlbRDes = H00C13_A1291AlbRDes[0] ;
            A1212TipEntNom = H00C13_A1212TipEntNom[0] ;
            n1212TipEntNom = H00C13_n1212TipEntNom[0] ;
            A841TrnNom = H00C13_A841TrnNom[0] ;
            n841TrnNom = H00C13_n841TrnNom[0] ;
            A971ProceNom = H00C13_A971ProceNom[0] ;
            n971ProceNom = H00C13_n971ProceNom[0] ;
            A3613AlbRefDsc = H00C13_A3613AlbRefDsc[0] ;
            A45AlbRef = H00C13_A45AlbRef[0] ;
            A279CliNom = H00C13_A279CliNom[0] ;
            A4606AlbRHEn = H00C13_A4606AlbRHEn[0] ;
            n4606AlbRHEn = H00C13_n4606AlbRHEn[0] ;
            A49AlbRFen = H00C13_A49AlbRFen[0] ;
            A44AlbRecCod = H00C13_A44AlbRecCod[0] ;
            A841TrnNom = H00C13_A841TrnNom[0] ;
            n841TrnNom = H00C13_n841TrnNom[0] ;
            A971ProceNom = H00C13_A971ProceNom[0] ;
            n971ProceNom = H00C13_n971ProceNom[0] ;
            A1212TipEntNom = H00C13_A1212TipEntNom[0] ;
            n1212TipEntNom = H00C13_n1212TipEntNom[0] ;
            A279CliNom = H00C13_A279CliNom[0] ;
            if ( (GXutil.strcmp("", AV143Talbdet1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV143Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV143Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "k", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "m", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV143Talbdet1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "no", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "si", "") , GXutil.padr( "%" + GXutil.lower( AV143Talbdet1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) ) ) )
            {
               e22C12 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(45) ;
         wbC10( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesC12( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV170Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      AV143Talbdet1wwds_1_filterfulltext = AV133FilterFullText ;
      AV144Talbdet1wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV145Talbdet1wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV146Talbdet1wwds_4_tfalbrfen = AV55TFAlbRFen ;
      AV147Talbdet1wwds_5_tfalbrhen = AV60TFAlbRHEn ;
      AV148Talbdet1wwds_6_tfclinom = AV68TFCliNom ;
      AV149Talbdet1wwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV150Talbdet1wwds_8_tfalbref = AV71TFAlbRef ;
      AV151Talbdet1wwds_9_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV152Talbdet1wwds_10_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV154Talbdet1wwds_12_tfprocenom = AV80TFProceNom ;
      AV155Talbdet1wwds_13_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet1wwds_14_tftrnnom = AV86TFTrnNom ;
      AV157Talbdet1wwds_15_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV158Talbdet1wwds_16_tftipentnom = AV92TFTipEntNom ;
      AV159Talbdet1wwds_17_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV160Talbdet1wwds_18_tfalbrdes = AV95TFAlbRDes ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV162Talbdet1wwds_20_tfalbrunient = AV98TFAlbRUniEnt ;
      AV163Talbdet1wwds_21_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV164Talbdet1wwds_22_tfalbruni_sels = AV135TFAlbRUni_Sels ;
      AV165Talbdet1wwds_23_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV166Talbdet1wwds_24_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV167Talbdet1wwds_25_tfalbrloc = AV107TFAlbRLoc ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV133FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV55TFAlbRFen, AV60TFAlbRHEn, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV80TFProceNom, AV81TFProceNom_Sel, AV86TFTrnNom, AV87TFTrnNom_Sel, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV135TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV143Talbdet1wwds_1_filterfulltext = AV133FilterFullText ;
      AV144Talbdet1wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV145Talbdet1wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV146Talbdet1wwds_4_tfalbrfen = AV55TFAlbRFen ;
      AV147Talbdet1wwds_5_tfalbrhen = AV60TFAlbRHEn ;
      AV148Talbdet1wwds_6_tfclinom = AV68TFCliNom ;
      AV149Talbdet1wwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV150Talbdet1wwds_8_tfalbref = AV71TFAlbRef ;
      AV151Talbdet1wwds_9_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV152Talbdet1wwds_10_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV154Talbdet1wwds_12_tfprocenom = AV80TFProceNom ;
      AV155Talbdet1wwds_13_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet1wwds_14_tftrnnom = AV86TFTrnNom ;
      AV157Talbdet1wwds_15_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV158Talbdet1wwds_16_tftipentnom = AV92TFTipEntNom ;
      AV159Talbdet1wwds_17_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV160Talbdet1wwds_18_tfalbrdes = AV95TFAlbRDes ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV162Talbdet1wwds_20_tfalbrunient = AV98TFAlbRUniEnt ;
      AV163Talbdet1wwds_21_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV164Talbdet1wwds_22_tfalbruni_sels = AV135TFAlbRUni_Sels ;
      AV165Talbdet1wwds_23_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV166Talbdet1wwds_24_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV167Talbdet1wwds_25_tfalbrloc = AV107TFAlbRLoc ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV133FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV55TFAlbRFen, AV60TFAlbRHEn, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV80TFProceNom, AV81TFProceNom_Sel, AV86TFTrnNom, AV87TFTrnNom_Sel, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV135TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV143Talbdet1wwds_1_filterfulltext = AV133FilterFullText ;
      AV144Talbdet1wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV145Talbdet1wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV146Talbdet1wwds_4_tfalbrfen = AV55TFAlbRFen ;
      AV147Talbdet1wwds_5_tfalbrhen = AV60TFAlbRHEn ;
      AV148Talbdet1wwds_6_tfclinom = AV68TFCliNom ;
      AV149Talbdet1wwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV150Talbdet1wwds_8_tfalbref = AV71TFAlbRef ;
      AV151Talbdet1wwds_9_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV152Talbdet1wwds_10_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV154Talbdet1wwds_12_tfprocenom = AV80TFProceNom ;
      AV155Talbdet1wwds_13_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet1wwds_14_tftrnnom = AV86TFTrnNom ;
      AV157Talbdet1wwds_15_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV158Talbdet1wwds_16_tftipentnom = AV92TFTipEntNom ;
      AV159Talbdet1wwds_17_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV160Talbdet1wwds_18_tfalbrdes = AV95TFAlbRDes ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV162Talbdet1wwds_20_tfalbrunient = AV98TFAlbRUniEnt ;
      AV163Talbdet1wwds_21_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV164Talbdet1wwds_22_tfalbruni_sels = AV135TFAlbRUni_Sels ;
      AV165Talbdet1wwds_23_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV166Talbdet1wwds_24_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV167Talbdet1wwds_25_tfalbrloc = AV107TFAlbRLoc ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV133FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV55TFAlbRFen, AV60TFAlbRHEn, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV80TFProceNom, AV81TFProceNom_Sel, AV86TFTrnNom, AV87TFTrnNom_Sel, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV135TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV143Talbdet1wwds_1_filterfulltext = AV133FilterFullText ;
      AV144Talbdet1wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV145Talbdet1wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV146Talbdet1wwds_4_tfalbrfen = AV55TFAlbRFen ;
      AV147Talbdet1wwds_5_tfalbrhen = AV60TFAlbRHEn ;
      AV148Talbdet1wwds_6_tfclinom = AV68TFCliNom ;
      AV149Talbdet1wwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV150Talbdet1wwds_8_tfalbref = AV71TFAlbRef ;
      AV151Talbdet1wwds_9_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV152Talbdet1wwds_10_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV154Talbdet1wwds_12_tfprocenom = AV80TFProceNom ;
      AV155Talbdet1wwds_13_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet1wwds_14_tftrnnom = AV86TFTrnNom ;
      AV157Talbdet1wwds_15_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV158Talbdet1wwds_16_tftipentnom = AV92TFTipEntNom ;
      AV159Talbdet1wwds_17_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV160Talbdet1wwds_18_tfalbrdes = AV95TFAlbRDes ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV162Talbdet1wwds_20_tfalbrunient = AV98TFAlbRUniEnt ;
      AV163Talbdet1wwds_21_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV164Talbdet1wwds_22_tfalbruni_sels = AV135TFAlbRUni_Sels ;
      AV165Talbdet1wwds_23_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV166Talbdet1wwds_24_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV167Talbdet1wwds_25_tfalbrloc = AV107TFAlbRLoc ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV133FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV55TFAlbRFen, AV60TFAlbRHEn, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV80TFProceNom, AV81TFProceNom_Sel, AV86TFTrnNom, AV87TFTrnNom_Sel, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV135TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV143Talbdet1wwds_1_filterfulltext = AV133FilterFullText ;
      AV144Talbdet1wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV145Talbdet1wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV146Talbdet1wwds_4_tfalbrfen = AV55TFAlbRFen ;
      AV147Talbdet1wwds_5_tfalbrhen = AV60TFAlbRHEn ;
      AV148Talbdet1wwds_6_tfclinom = AV68TFCliNom ;
      AV149Talbdet1wwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV150Talbdet1wwds_8_tfalbref = AV71TFAlbRef ;
      AV151Talbdet1wwds_9_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV152Talbdet1wwds_10_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV154Talbdet1wwds_12_tfprocenom = AV80TFProceNom ;
      AV155Talbdet1wwds_13_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet1wwds_14_tftrnnom = AV86TFTrnNom ;
      AV157Talbdet1wwds_15_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV158Talbdet1wwds_16_tftipentnom = AV92TFTipEntNom ;
      AV159Talbdet1wwds_17_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV160Talbdet1wwds_18_tfalbrdes = AV95TFAlbRDes ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV162Talbdet1wwds_20_tfalbrunient = AV98TFAlbRUniEnt ;
      AV163Talbdet1wwds_21_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV164Talbdet1wwds_22_tfalbruni_sels = AV135TFAlbRUni_Sels ;
      AV165Talbdet1wwds_23_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV166Talbdet1wwds_24_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV167Talbdet1wwds_25_tfalbrloc = AV107TFAlbRLoc ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV44ManageFiltersExecutionStep, AV39ColumnsSelector, AV133FilterFullText, AV46TFAlbRecCod, AV47TFAlbRecCod_To, AV55TFAlbRFen, AV60TFAlbRHEn, AV68TFCliNom, AV69TFCliNom_Sel, AV71TFAlbRef, AV72TFAlbRef_Sel, AV74TFAlbRefDsc, AV75TFAlbRefDsc_Sel, AV80TFProceNom, AV81TFProceNom_Sel, AV86TFTrnNom, AV87TFTrnNom_Sel, AV92TFTipEntNom, AV93TFTipEntNom_Sel, AV95TFAlbRDes, AV96TFAlbRDes_Sel, AV98TFAlbRUniEnt, AV99TFAlbRUniEnt_To, AV135TFAlbRUni_Sels, AV104TFAlbRPieEnt, AV105TFAlbRPieEnt_To, AV107TFAlbRLoc, AV108TFAlbRLoc_Sel, AV111TFAlbRReo_Sels, AV170Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV170Pgmname = "TALBDET1WW" ;
      Gx_err = (short)(0) ;
      edtavDetallepiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetallepiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetallepiezas_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtavEliminar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEliminar_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupC10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20C12 ();
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
         /* Read variables values. */
         AV133FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133FilterFullText", AV133FilterFullText);
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
      e20C12 ();
      if (returnInSub) return;
   }

   public void e20C12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV139Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      talbdet1ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV139Station = GXt_char1 ;
      GXv_char2[0] = AV140Emprcod ;
      GXv_char3[0] = AV141Emprnom ;
      GXv_char4[0] = AV142Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV139Station, GXv_char2, GXv_char3, GXv_char4) ;
      talbdet1ww_impl.this.AV140Emprcod = GXv_char2[0] ;
      talbdet1ww_impl.this.AV141Emprnom = GXv_char3[0] ;
      talbdet1ww_impl.this.AV142Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Header)", "") );
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

   public void e21C12( )
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
      if ( GXutil.strcmp(AV41Session.getValue("TALBDET1WWColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV41Session.getValue("TALBDET1WWColumnsSelector") ;
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
      edtAlbRFen_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRHEn_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRHEn_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRHEn_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRefDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTrnNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtTipEntNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRDes_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRUniEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbRUni.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRUni.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRPieEnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtAlbRLoc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      cmbAlbRReo.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbRReo.getVisible(), 5, 0), !bGXsfl_45_Refreshing);
      AV121GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV121GridCurrentPage), 10, 0));
      AV122GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122GridPageCount), 10, 0));
      AV143Talbdet1wwds_1_filterfulltext = AV133FilterFullText ;
      AV144Talbdet1wwds_2_tfalbreccod = AV46TFAlbRecCod ;
      AV145Talbdet1wwds_3_tfalbreccod_to = AV47TFAlbRecCod_To ;
      AV146Talbdet1wwds_4_tfalbrfen = AV55TFAlbRFen ;
      AV147Talbdet1wwds_5_tfalbrhen = AV60TFAlbRHEn ;
      AV148Talbdet1wwds_6_tfclinom = AV68TFCliNom ;
      AV149Talbdet1wwds_7_tfclinom_sel = AV69TFCliNom_Sel ;
      AV150Talbdet1wwds_8_tfalbref = AV71TFAlbRef ;
      AV151Talbdet1wwds_9_tfalbref_sel = AV72TFAlbRef_Sel ;
      AV152Talbdet1wwds_10_tfalbrefdsc = AV74TFAlbRefDsc ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = AV75TFAlbRefDsc_Sel ;
      AV154Talbdet1wwds_12_tfprocenom = AV80TFProceNom ;
      AV155Talbdet1wwds_13_tfprocenom_sel = AV81TFProceNom_Sel ;
      AV156Talbdet1wwds_14_tftrnnom = AV86TFTrnNom ;
      AV157Talbdet1wwds_15_tftrnnom_sel = AV87TFTrnNom_Sel ;
      AV158Talbdet1wwds_16_tftipentnom = AV92TFTipEntNom ;
      AV159Talbdet1wwds_17_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV160Talbdet1wwds_18_tfalbrdes = AV95TFAlbRDes ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = AV96TFAlbRDes_Sel ;
      AV162Talbdet1wwds_20_tfalbrunient = AV98TFAlbRUniEnt ;
      AV163Talbdet1wwds_21_tfalbrunient_to = AV99TFAlbRUniEnt_To ;
      AV164Talbdet1wwds_22_tfalbruni_sels = AV135TFAlbRUni_Sels ;
      AV165Talbdet1wwds_23_tfalbrpieent = AV104TFAlbRPieEnt ;
      AV166Talbdet1wwds_24_tfalbrpieent_to = AV105TFAlbRPieEnt_To ;
      AV167Talbdet1wwds_25_tfalbrloc = AV107TFAlbRLoc ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = AV108TFAlbRLoc_Sel ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = AV111TFAlbRReo_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12C12( )
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

   public void e13C12( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14C12( )
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
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceNom") == 0 )
         {
            AV80TFProceNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFProceNom", AV80TFProceNom);
            AV81TFProceNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFProceNom_Sel", AV81TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "TrnNom") == 0 )
         {
            AV86TFTrnNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFTrnNom", AV86TFTrnNom);
            AV87TFTrnNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFTrnNom_Sel", AV87TFTrnNom_Sel);
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
            AV134TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV134TFAlbRUni_SelsJson", AV134TFAlbRUni_SelsJson);
            AV135TFAlbRUni_Sels.fromJSonString(AV134TFAlbRUni_SelsJson, null);
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
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135TFAlbRUni_Sels", AV135TFAlbRUni_Sels);
   }

   private void e22C12( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         AV132DetallePiezas = httpContext.getMessage( "Piezas", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetallepiezas_Internalname, AV132DetallePiezas);
         edtavDetallepiezas_Link = formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {})  ;
         AV125Eliminar = httpContext.getMessage( "Eliminar N Recepcion", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV125Eliminar);
         edtavDetallepiezas_Link = formatLink("app.talbdet2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"})  ;
         edtavEliminar_Link = formatLink("pelialbdet", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"EmprCod","AlbRecCod"})  ;
         edtCliNom_Link = formatLink("app.tclientview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","CliCod","TabCode"})  ;
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV136GridActions, 4, 0)) );
   }

   public void e15C12( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV37ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV39ColumnsSelector.fromJSonString(AV37ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TALBDET1WWColumnsSelector", ((GXutil.strcmp("", AV37ColumnsSelectorXML)==0) ? "" : AV39ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11C12( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TALBDET1WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV170Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TALBDET1WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV43ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TALBDET1WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         talbdet1ww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV170Pgmname+"GridState", AV43ManageFiltersXml) ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135TFAlbRUni_Sels", AV135TFAlbRUni_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e16C12( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet1", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17C12( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV35ExcelFilename ;
      GXv_char3[0] = AV36ErrorMessage ;
      new app.talbdet1wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      talbdet1ww_impl.this.AV35ExcelFilename = GXv_char4[0] ;
      talbdet1ww_impl.this.AV36ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135TFAlbRUni_Sels", AV135TFAlbRUni_Sels);
   }

   public void e18C12( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.talbdet1wwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135TFAlbRUni_Sels", AV135TFAlbRUni_Sels);
   }

   public void e19C12( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.talbdet1wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111TFAlbRReo_Sels", AV111TFAlbRReo_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV135TFAlbRUni_Sels", AV135TFAlbRUni_Sels);
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRecCod", "", "Nº Recepcion", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRFen", "", "Fecha Entrada", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRHEn", "", "Hora de entrada", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceNom", "", "Procedencia", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TrnNom", "", "Transportista", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "TipEntNom", "", "Tipo Entrada", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRDes", "", "Destino", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUniEnt", "", "Unds Ent", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRUni", "", "Und", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRPieEnt", "", "Pzs Ent", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRLoc", "", "Localizacion", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV38UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBDET1WWColumnsSelector", GXv_char4) ;
      talbdet1ww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TALBDET1WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV42ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV133FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133FilterFullText", AV133FilterFullText);
      AV46TFAlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbRecCod), 8, 0));
      AV47TFAlbRecCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbRecCod_To), 8, 0));
      AV55TFAlbRFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRFen", localUtil.format(AV55TFAlbRFen, "99/99/99"));
      AV60TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRHEn", localUtil.ttoc( AV60TFAlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      AV80TFProceNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFProceNom", AV80TFProceNom);
      AV81TFProceNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TFProceNom_Sel", AV81TFProceNom_Sel);
      AV86TFTrnNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFTrnNom", AV86TFTrnNom);
      AV87TFTrnNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFTrnNom_Sel", AV87TFTrnNom_Sel);
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
      AV135TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV104TFAlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFAlbRPieEnt), 6, 0));
      AV105TFAlbRPieEnt_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFAlbRPieEnt_To), 6, 0));
      AV107TFAlbRLoc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFAlbRLoc", AV107TFAlbRLoc);
      AV108TFAlbRLoc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108TFAlbRLoc_Sel", AV108TFAlbRLoc_Sel);
      AV111TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      callWebObject(formatLink("app.talbdet1", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.talbdet1", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV170Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV170Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV41Session.getValue(AV170Pgmname+"GridState"), null, null);
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
      AV171GXV1 = 1 ;
      while ( AV171GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV171GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV133FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133FilterFullText", AV133FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV46TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbRecCod), 8, 0));
            AV47TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFAlbRecCod_To), 8, 0));
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
            AV134TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV134TFAlbRUni_SelsJson", AV134TFAlbRUni_SelsJson);
            AV135TFAlbRUni_Sels.fromJSonString(AV134TFAlbRUni_SelsJson, null);
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
         AV171GXV1 = (int)(AV171GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFCliNom_Sel)==0), AV69TFCliNom_Sel, GXv_char4) ;
      talbdet1ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFAlbRef_Sel)==0), AV72TFAlbRef_Sel, GXv_char3) ;
      talbdet1ww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFAlbRefDsc_Sel)==0), AV75TFAlbRefDsc_Sel, GXv_char2) ;
      talbdet1ww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFProceNom_Sel)==0), AV81TFProceNom_Sel, GXv_char15) ;
      talbdet1ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFTrnNom_Sel)==0), AV87TFTrnNom_Sel, GXv_char17) ;
      talbdet1ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFTipEntNom_Sel)==0), AV93TFTipEntNom_Sel, GXv_char19) ;
      talbdet1ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFAlbRDes_Sel)==0), AV96TFAlbRDes_Sel, GXv_char21) ;
      talbdet1ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV135TFAlbRUni_Sels.size()==0), AV134TFAlbRUni_SelsJson, GXv_char23) ;
      talbdet1ww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV108TFAlbRLoc_Sel)==0), AV108TFAlbRLoc_Sel, GXv_char25) ;
      talbdet1ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV111TFAlbRReo_Sels.size()==0), AV110TFAlbRReo_SelsJson, GXv_char27) ;
      talbdet1ww_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"||"+GXt_char22+"||"+GXt_char24+"|"+GXt_char26 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFCliNom)==0), AV68TFCliNom, GXv_char27) ;
      talbdet1ww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFAlbRef)==0), AV71TFAlbRef, GXv_char25) ;
      talbdet1ww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFAlbRefDsc)==0), AV74TFAlbRefDsc, GXv_char23) ;
      talbdet1ww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFProceNom)==0), AV80TFProceNom, GXv_char21) ;
      talbdet1ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFTrnNom)==0), AV86TFTrnNom, GXv_char19) ;
      talbdet1ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV92TFTipEntNom)==0), AV92TFTipEntNom, GXv_char17) ;
      talbdet1ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV95TFAlbRDes)==0), AV95TFAlbRDes, GXv_char15) ;
      talbdet1ww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFAlbRLoc)==0), AV107TFAlbRLoc, GXv_char4) ;
      talbdet1ww_impl.this.GXt_char13 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV46TFAlbRecCod) ? "" : GXutil.str( AV46TFAlbRecCod, 8, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFAlbRFen)) ? "" : localUtil.dtoc( AV55TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV60TFAlbRHEn) ? "" : localUtil.dtoc( AV62DDO_AlbRHEnAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char26+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFAlbRUniEnt)==0) ? "" : GXutil.str( AV98TFAlbRUniEnt, 9, 2))+"||"+((0==AV104TFAlbRPieEnt) ? "" : GXutil.str( AV104TFAlbRPieEnt, 6, 0))+"|"+GXt_char13+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV47TFAlbRecCod_To) ? "" : GXutil.str( AV47TFAlbRecCod_To, 8, 0))+"||||||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFAlbRUniEnt_To)==0) ? "" : GXutil.str( AV99TFAlbRUniEnt_To, 9, 2))+"||"+((0==AV105TFAlbRPieEnt_To) ? "" : GXutil.str( AV105TFAlbRPieEnt_To, 6, 0))+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV41Session.getValue(AV170Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV133FilterFullText)==0), (short)(0), AV133FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRECCOD", "", !((0==AV46TFAlbRecCod)&&(0==AV47TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV47TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRFEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV55TFAlbRFen)), (short)(0), GXutil.trim( localUtil.dtoc( AV55TFAlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRHEN", "", !GXutil.dateCompare(GXutil.nullDate(), AV60TFAlbRHEn), (short)(0), GXutil.trim( localUtil.ttoc( AV60TFAlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFCLINOM", "", !(GXutil.strcmp("", AV68TFCliNom)==0), (short)(0), AV68TFCliNom, "", !(GXutil.strcmp("", AV69TFCliNom_Sel)==0), AV69TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBREF", "", !(GXutil.strcmp("", AV71TFAlbRef)==0), (short)(0), AV71TFAlbRef, "", !(GXutil.strcmp("", AV72TFAlbRef_Sel)==0), AV72TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBREFDSC", "", !(GXutil.strcmp("", AV74TFAlbRefDsc)==0), (short)(0), AV74TFAlbRefDsc, "", !(GXutil.strcmp("", AV75TFAlbRefDsc_Sel)==0), AV75TFAlbRefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPROCENOM", "", !(GXutil.strcmp("", AV80TFProceNom)==0), (short)(0), AV80TFProceNom, "", !(GXutil.strcmp("", AV81TFProceNom_Sel)==0), AV81TFProceNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFTRNNOM", "", !(GXutil.strcmp("", AV86TFTrnNom)==0), (short)(0), AV86TFTrnNom, "", !(GXutil.strcmp("", AV87TFTrnNom_Sel)==0), AV87TFTrnNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFTIPENTNOM", "", !(GXutil.strcmp("", AV92TFTipEntNom)==0), (short)(0), AV92TFTipEntNom, "", !(GXutil.strcmp("", AV93TFTipEntNom_Sel)==0), AV93TFTipEntNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRDES", "", !(GXutil.strcmp("", AV95TFAlbRDes)==0), (short)(0), AV95TFAlbRDes, "", !(GXutil.strcmp("", AV96TFAlbRDes_Sel)==0), AV96TFAlbRDes_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV98TFAlbRUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV99TFAlbRUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV98TFAlbRUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV99TFAlbRUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRUNI_SEL", "", !(AV135TFAlbRUni_Sels.size()==0), (short)(0), AV135TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRPIEENT", "", !((0==AV104TFAlbRPieEnt)&&(0==AV105TFAlbRPieEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV104TFAlbRPieEnt, 6, 0)), GXutil.trim( GXutil.str( AV105TFAlbRPieEnt_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRLOC", "", !(GXutil.strcmp("", AV107TFAlbRLoc)==0), (short)(0), AV107TFAlbRLoc, "", !(GXutil.strcmp("", AV108TFAlbRLoc_Sel)==0), AV108TFAlbRLoc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFALBRREO_SEL", "", !(AV111TFAlbRReo_Sels.size()==0), (short)(0), AV111TFAlbRReo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV170Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV170Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TALBDET1" );
      AV41Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_73_C12( boolean wbgen )
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
         wb_table2_73_C12e( true) ;
      }
      else
      {
         wb_table2_73_C12e( false) ;
      }
   }

   public void wb_table1_27_C12( boolean wbgen )
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
         wb_table3_32_C12( true) ;
      }
      else
      {
         wb_table3_32_C12( false) ;
      }
      return  ;
   }

   public void wb_table3_32_C12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_C12e( true) ;
      }
      else
      {
         wb_table1_27_C12e( false) ;
      }
   }

   public void wb_table3_32_C12( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV133FilterFullText, GXutil.rtrim( localUtil.format( AV133FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TALBDET1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_32_C12e( true) ;
      }
      else
      {
         wb_table3_32_C12e( false) ;
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
      paC12( ) ;
      wsC12( ) ;
      weC12( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116114548", true, true);
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
      httpContext.AddJavascriptSource("talbdet1ww.js", "?202682116114549", false, true);
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
      edtavDetallepiezas_Internalname = "vDETALLEPIEZAS_"+sGXsfl_45_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_45_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_45_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_45_idx ;
      edtAlbRHEn_Internalname = "ALBRHEN_"+sGXsfl_45_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_45_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_45_idx ;
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_45_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_idx ;
      edtTipEntNom_Internalname = "TIPENTNOM_"+sGXsfl_45_idx ;
      edtAlbRDes_Internalname = "ALBRDES_"+sGXsfl_45_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_45_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_45_idx );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_45_idx ;
      edtAlbRLoc_Internalname = "ALBRLOC_"+sGXsfl_45_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_45_idx );
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtavDetallepiezas_Internalname = "vDETALLEPIEZAS_"+sGXsfl_45_fel_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_45_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_45_fel_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_45_fel_idx ;
      edtAlbRHEn_Internalname = "ALBRHEN_"+sGXsfl_45_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_45_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_45_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_45_fel_idx ;
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_45_fel_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_45_fel_idx ;
      edtTipEntNom_Internalname = "TIPENTNOM_"+sGXsfl_45_fel_idx ;
      edtAlbRDes_Internalname = "ALBRDES_"+sGXsfl_45_fel_idx ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_45_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_45_fel_idx );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_45_fel_idx ;
      edtAlbRLoc_Internalname = "ALBRLOC_"+sGXsfl_45_fel_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_45_fel_idx );
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbC10( ) ;
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
               AV136GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV136GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV136GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23c12_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV136GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetallepiezas_Enabled!=0)&&(edtavDetallepiezas_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetallepiezas_Internalname,GXutil.rtrim( AV132DetallePiezas),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetallepiezas_Enabled!=0)&&(edtavDetallepiezas_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,47);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'",edtavDetallepiezas_Link,"","","",edtavDetallepiezas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetallepiezas_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'',false,'"+sGXsfl_45_idx+"',45)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,GXutil.rtrim( AV125Eliminar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+""+"'"+",false,"+"'"+"e24c12_client"+"'",edtavEliminar_Link,"","","",edtavEliminar_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEliminar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'",edtCliNom_Link,"","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNom_Internalname,GXutil.rtrim( A971ProceNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnNom_Internalname,GXutil.rtrim( A841TrnNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrnNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtTrnNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
         send_integrity_lvl_hashesC12( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRFen_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRHEn_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora de entrada", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Procedencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTrnNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtTipEntNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRDes_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Destino", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRUniEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unds Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRUni.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRPieEnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pzs Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRLoc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Localizacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbRReo.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reclamacion?", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV136GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV132DetallePiezas));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetallepiezas_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavDetallepiezas_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV125Eliminar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEliminar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavEliminar_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtCliNom_Link));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A971ProceNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A841TrnNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtTrnNom_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavDetallepiezas_Internalname = "vDETALLEPIEZAS" ;
      edtavEliminar_Internalname = "vELIMINAR" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      edtAlbRHEn_Internalname = "ALBRHEN" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtProceNom_Internalname = "PROCENOM" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtTipEntNom_Internalname = "TIPENTNOM" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      cmbAlbRReo.setJsonclick( "" );
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRDes_Jsonclick = "" ;
      edtTipEntNom_Jsonclick = "" ;
      edtTrnNom_Jsonclick = "" ;
      edtProceNom_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Link = "" ;
      edtAlbRHEn_Jsonclick = "" ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_Visible = -1 ;
      edtavEliminar_Link = "" ;
      edtavEliminar_Enabled = 1 ;
      edtavDetallepiezas_Jsonclick = "" ;
      edtavDetallepiezas_Visible = -1 ;
      edtavDetallepiezas_Link = "" ;
      edtavDetallepiezas_Enabled = 1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbAlbRReo.setVisible( -1 );
      edtAlbRLoc_Visible = -1 ;
      edtAlbRPieEnt_Visible = -1 ;
      cmbAlbRUni.setVisible( -1 );
      edtAlbRUniEnt_Visible = -1 ;
      edtAlbRDes_Visible = -1 ;
      edtTipEntNom_Visible = -1 ;
      edtTrnNom_Visible = -1 ;
      edtProceNom_Visible = -1 ;
      edtAlbRefDsc_Visible = -1 ;
      edtAlbRef_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtAlbRHEn_Visible = -1 ;
      edtAlbRFen_Visible = -1 ;
      edtAlbRecCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albrhenauxdate_Jsonclick = "" ;
      edtavDdo_albrfenauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "2" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar el N Recepcion?" ;
      Dvelop_confirmpanel_eliminar_Title = httpContext.getMessage( "Eliminar N Recepcion / Detalle de Piezas", "") ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "TALBDET1WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||||||||K:K,M:M|||NO:NO,SI:SI" ;
      Ddo_grid_Allowmultipleselection = "|||||||||||T|||T" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic||FixedValues||Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "|||T|T|T|T|T|T|T||T||T|T" ;
      Ddo_grid_Filterisrange = "T||||||||||T||T||" ;
      Ddo_grid_Filtertype = "Numeric|Date|Date|Character|Character|Character|Character|Character|Character|Character|Numeric||Numeric|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|T|T|T||T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15" ;
      Ddo_grid_Columnids = "3:AlbRecCod|4:AlbRFen|5:AlbRHEn|6:CliNom|7:AlbRef|8:AlbRefDsc|9:ProceNom|10:TrnNom|11:TipEntNom|12:AlbRDes|13:AlbRUniEnt|14:AlbRUni|15:AlbRPieEnt|16:AlbRLoc|17:AlbRReo" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Almacen Entradas Tela (Header)", "") );
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
         AV136GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV136GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRHEn_Visible',ctrl:'ALBRHEN',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'cmbAlbRReo'},{av:'AV121GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV122GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22C12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV136GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV132DetallePiezas',fld:'vDETALLEPIEZAS',pic:''},{av:'edtavDetallepiezas_Link',ctrl:'vDETALLEPIEZAS',prop:'Link'},{av:'AV125Eliminar',fld:'vELIMINAR',pic:''},{av:'edtavEliminar_Link',ctrl:'vELIMINAR',prop:'Link'},{av:'edtCliNom_Link',ctrl:'CLINOM',prop:'Link'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRHEn_Visible',ctrl:'ALBRHEN',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'cmbAlbRReo'},{av:'AV121GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV122GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11C12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbRFen_Visible',ctrl:'ALBRFEN',prop:'Visible'},{av:'edtAlbRHEn_Visible',ctrl:'ALBRHEN',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtTrnNom_Visible',ctrl:'TRNNOM',prop:'Visible'},{av:'edtTipEntNom_Visible',ctrl:'TIPENTNOM',prop:'Visible'},{av:'edtAlbRDes_Visible',ctrl:'ALBRDES',prop:'Visible'},{av:'edtAlbRUniEnt_Visible',ctrl:'ALBRUNIENT',prop:'Visible'},{av:'cmbAlbRUni'},{av:'edtAlbRPieEnt_Visible',ctrl:'ALBRPIEENT',prop:'Visible'},{av:'edtAlbRLoc_Visible',ctrl:'ALBRLOC',prop:'Visible'},{av:'cmbAlbRReo'},{av:'AV121GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV122GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23C12',iparms:[{av:'cmbavGridactions'},{av:'AV136GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV136GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VELIMINAR.CLICK","{handler:'e24C12',iparms:[]");
      setEventMetadata("VELIMINAR.CLICK",",oparms:[]}");
      setEventMetadata("'DOINSERT'","{handler:'e16C12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17C12',iparms:[{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18C12',iparms:[{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19C12',iparms:[{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV133FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV47TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV55TFAlbRFen',fld:'vTFALBRFEN',pic:''},{av:'AV60TFAlbRHEn',fld:'vTFALBRHEN',pic:'99/99/99 99:99'},{av:'AV68TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV69TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV71TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV72TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV74TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV75TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV80TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV81TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV86TFTrnNom',fld:'vTFTRNNOM',pic:''},{av:'AV87TFTrnNom_Sel',fld:'vTFTRNNOM_SEL',pic:''},{av:'AV92TFTipEntNom',fld:'vTFTIPENTNOM',pic:''},{av:'AV93TFTipEntNom_Sel',fld:'vTFTIPENTNOM_SEL',pic:''},{av:'AV95TFAlbRDes',fld:'vTFALBRDES',pic:''},{av:'AV96TFAlbRDes_Sel',fld:'vTFALBRDES_SEL',pic:''},{av:'AV98TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV99TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV135TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV104TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV105TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV107TFAlbRLoc',fld:'vTFALBRLOC',pic:''},{av:'AV108TFAlbRLoc_Sel',fld:'vTFALBRLOC_SEL',pic:''},{av:'AV111TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV170Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV110TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV134TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV62DDO_AlbRHEnAuxDate',fld:'vDDO_ALBRHENAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_ALBREFDSC","{handler:'valid_Albrefdsc',iparms:[]");
      setEventMetadata("VALID_ALBREFDSC",",oparms:[]}");
      setEventMetadata("VALID_PROCENOM","{handler:'valid_Procenom',iparms:[]");
      setEventMetadata("VALID_PROCENOM",",oparms:[]}");
      setEventMetadata("VALID_TRNNOM","{handler:'valid_Trnnom',iparms:[]");
      setEventMetadata("VALID_TRNNOM",",oparms:[]}");
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
      AV39ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV133FilterFullText = "" ;
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
      AV135TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107TFAlbRLoc = "" ;
      AV108TFAlbRLoc_Sel = "" ;
      AV111TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV170Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV42ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV119DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV134TFAlbRUni_SelsJson = "" ;
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
      AV132DetallePiezas = "" ;
      AV125Eliminar = "" ;
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
      AV143Talbdet1wwds_1_filterfulltext = "" ;
      AV146Talbdet1wwds_4_tfalbrfen = GXutil.nullDate() ;
      AV147Talbdet1wwds_5_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV148Talbdet1wwds_6_tfclinom = "" ;
      AV149Talbdet1wwds_7_tfclinom_sel = "" ;
      AV150Talbdet1wwds_8_tfalbref = "" ;
      AV151Talbdet1wwds_9_tfalbref_sel = "" ;
      AV152Talbdet1wwds_10_tfalbrefdsc = "" ;
      AV153Talbdet1wwds_11_tfalbrefdsc_sel = "" ;
      AV154Talbdet1wwds_12_tfprocenom = "" ;
      AV155Talbdet1wwds_13_tfprocenom_sel = "" ;
      AV156Talbdet1wwds_14_tftrnnom = "" ;
      AV157Talbdet1wwds_15_tftrnnom_sel = "" ;
      AV158Talbdet1wwds_16_tftipentnom = "" ;
      AV159Talbdet1wwds_17_tftipentnom_sel = "" ;
      AV160Talbdet1wwds_18_tfalbrdes = "" ;
      AV161Talbdet1wwds_19_tfalbrdes_sel = "" ;
      AV162Talbdet1wwds_20_tfalbrunient = DecimalUtil.ZERO ;
      AV163Talbdet1wwds_21_tfalbrunient_to = DecimalUtil.ZERO ;
      AV164Talbdet1wwds_22_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV167Talbdet1wwds_25_tfalbrloc = "" ;
      AV168Talbdet1wwds_26_tfalbrloc_sel = "" ;
      AV169Talbdet1wwds_27_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV148Talbdet1wwds_6_tfclinom = "" ;
      lV150Talbdet1wwds_8_tfalbref = "" ;
      lV152Talbdet1wwds_10_tfalbrefdsc = "" ;
      lV154Talbdet1wwds_12_tfprocenom = "" ;
      lV156Talbdet1wwds_14_tftrnnom = "" ;
      lV158Talbdet1wwds_16_tftipentnom = "" ;
      lV160Talbdet1wwds_18_tfalbrdes = "" ;
      lV167Talbdet1wwds_25_tfalbrloc = "" ;
      H00C12_A840TrnCod = new short[1] ;
      H00C12_n840TrnCod = new boolean[] {false} ;
      H00C12_A970ProceCod = new short[1] ;
      H00C12_n970ProceCod = new boolean[] {false} ;
      H00C12_A1211TipEntCod = new short[1] ;
      H00C12_n1211TipEntCod = new boolean[] {false} ;
      H00C12_A396EmprCod = new String[] {""} ;
      H00C12_A252CliCod = new int[1] ;
      H00C12_A55AlbRReo = new String[] {""} ;
      H00C12_A50AlbRLoc = new String[] {""} ;
      H00C12_A52AlbRPieEnt = new int[1] ;
      H00C12_A56AlbRUni = new String[] {""} ;
      H00C12_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00C12_A1291AlbRDes = new String[] {""} ;
      H00C12_A1212TipEntNom = new String[] {""} ;
      H00C12_n1212TipEntNom = new boolean[] {false} ;
      H00C12_A841TrnNom = new String[] {""} ;
      H00C12_n841TrnNom = new boolean[] {false} ;
      H00C12_A971ProceNom = new String[] {""} ;
      H00C12_n971ProceNom = new boolean[] {false} ;
      H00C12_A3613AlbRefDsc = new String[] {""} ;
      H00C12_A45AlbRef = new String[] {""} ;
      H00C12_A279CliNom = new String[] {""} ;
      H00C12_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      H00C12_n4606AlbRHEn = new boolean[] {false} ;
      H00C12_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00C12_A44AlbRecCod = new int[1] ;
      H00C13_A840TrnCod = new short[1] ;
      H00C13_n840TrnCod = new boolean[] {false} ;
      H00C13_A970ProceCod = new short[1] ;
      H00C13_n970ProceCod = new boolean[] {false} ;
      H00C13_A1211TipEntCod = new short[1] ;
      H00C13_n1211TipEntCod = new boolean[] {false} ;
      H00C13_A396EmprCod = new String[] {""} ;
      H00C13_A252CliCod = new int[1] ;
      H00C13_A55AlbRReo = new String[] {""} ;
      H00C13_A50AlbRLoc = new String[] {""} ;
      H00C13_A52AlbRPieEnt = new int[1] ;
      H00C13_A56AlbRUni = new String[] {""} ;
      H00C13_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00C13_A1291AlbRDes = new String[] {""} ;
      H00C13_A1212TipEntNom = new String[] {""} ;
      H00C13_n1212TipEntNom = new boolean[] {false} ;
      H00C13_A841TrnNom = new String[] {""} ;
      H00C13_n841TrnNom = new boolean[] {false} ;
      H00C13_A971ProceNom = new String[] {""} ;
      H00C13_n971ProceNom = new boolean[] {false} ;
      H00C13_A3613AlbRefDsc = new String[] {""} ;
      H00C13_A45AlbRef = new String[] {""} ;
      H00C13_A279CliNom = new String[] {""} ;
      H00C13_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      H00C13_n4606AlbRHEn = new boolean[] {false} ;
      H00C13_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H00C13_A44AlbRecCod = new int[1] ;
      AV139Station = "" ;
      AV140Emprcod = "" ;
      AV141Emprnom = "" ;
      AV142Usurcod = "" ;
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
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet1ww__default(),
         new Object[] {
             new Object[] {
            H00C12_A840TrnCod, H00C12_n840TrnCod, H00C12_A970ProceCod, H00C12_n970ProceCod, H00C12_A1211TipEntCod, H00C12_n1211TipEntCod, H00C12_A396EmprCod, H00C12_A252CliCod, H00C12_A55AlbRReo, H00C12_A50AlbRLoc,
            H00C12_A52AlbRPieEnt, H00C12_A56AlbRUni, H00C12_A58AlbRUniEnt, H00C12_A1291AlbRDes, H00C12_A1212TipEntNom, H00C12_n1212TipEntNom, H00C12_A841TrnNom, H00C12_n841TrnNom, H00C12_A971ProceNom, H00C12_n971ProceNom,
            H00C12_A3613AlbRefDsc, H00C12_A45AlbRef, H00C12_A279CliNom, H00C12_A4606AlbRHEn, H00C12_n4606AlbRHEn, H00C12_A49AlbRFen, H00C12_A44AlbRecCod
            }
            , new Object[] {
            H00C13_A840TrnCod, H00C13_n840TrnCod, H00C13_A970ProceCod, H00C13_n970ProceCod, H00C13_A1211TipEntCod, H00C13_n1211TipEntCod, H00C13_A396EmprCod, H00C13_A252CliCod, H00C13_A55AlbRReo, H00C13_A50AlbRLoc,
            H00C13_A52AlbRPieEnt, H00C13_A56AlbRUni, H00C13_A58AlbRUniEnt, H00C13_A1291AlbRDes, H00C13_A1212TipEntNom, H00C13_n1212TipEntNom, H00C13_A841TrnNom, H00C13_n841TrnNom, H00C13_A971ProceNom, H00C13_n971ProceNom,
            H00C13_A3613AlbRefDsc, H00C13_A45AlbRef, H00C13_A279CliNom, H00C13_A4606AlbRHEn, H00C13_n4606AlbRHEn, H00C13_A49AlbRFen, H00C13_A44AlbRecCod
            }
         }
      );
      AV170Pgmname = "TALBDET1WW" ;
      /* GeneXus formulas. */
      AV170Pgmname = "TALBDET1WW" ;
      Gx_err = (short)(0) ;
      edtavDetallepiezas_Enabled = 0 ;
      edtavEliminar_Enabled = 0 ;
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
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV136GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int AV46TFAlbRecCod ;
   private int AV47TFAlbRecCod_To ;
   private int AV104TFAlbRPieEnt ;
   private int AV105TFAlbRPieEnt_To ;
   private int A252CliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int subGrid_Islastpage ;
   private int edtavDetallepiezas_Enabled ;
   private int edtavEliminar_Enabled ;
   private int AV144Talbdet1wwds_2_tfalbreccod ;
   private int AV145Talbdet1wwds_3_tfalbreccod_to ;
   private int AV165Talbdet1wwds_23_tfalbrpieent ;
   private int AV166Talbdet1wwds_24_tfalbrpieent_to ;
   private int AV164Talbdet1wwds_22_tfalbruni_sels_size ;
   private int AV169Talbdet1wwds_27_tfalbrreo_sels_size ;
   private int edtAlbRecCod_Visible ;
   private int edtAlbRFen_Visible ;
   private int edtAlbRHEn_Visible ;
   private int edtCliNom_Visible ;
   private int edtAlbRef_Visible ;
   private int edtAlbRefDsc_Visible ;
   private int edtProceNom_Visible ;
   private int edtTrnNom_Visible ;
   private int edtTipEntNom_Visible ;
   private int edtAlbRDes_Visible ;
   private int edtAlbRUniEnt_Visible ;
   private int edtAlbRPieEnt_Visible ;
   private int edtAlbRLoc_Visible ;
   private int AV120PageToGo ;
   private int AV171GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetallepiezas_Visible ;
   private int edtavEliminar_Visible ;
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
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV162Talbdet1wwds_20_tfalbrunient ;
   private java.math.BigDecimal AV163Talbdet1wwds_21_tfalbrunient_to ;
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
   private String AV170Pgmname ;
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
   private String AV132DetallePiezas ;
   private String edtavDetallepiezas_Internalname ;
   private String AV125Eliminar ;
   private String edtavEliminar_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRHEn_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Internalname ;
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
   private String edtavFilterfulltext_Internalname ;
   private String AV148Talbdet1wwds_6_tfclinom ;
   private String AV149Talbdet1wwds_7_tfclinom_sel ;
   private String AV150Talbdet1wwds_8_tfalbref ;
   private String AV151Talbdet1wwds_9_tfalbref_sel ;
   private String AV152Talbdet1wwds_10_tfalbrefdsc ;
   private String AV153Talbdet1wwds_11_tfalbrefdsc_sel ;
   private String AV154Talbdet1wwds_12_tfprocenom ;
   private String AV155Talbdet1wwds_13_tfprocenom_sel ;
   private String AV156Talbdet1wwds_14_tftrnnom ;
   private String AV157Talbdet1wwds_15_tftrnnom_sel ;
   private String AV158Talbdet1wwds_16_tftipentnom ;
   private String AV159Talbdet1wwds_17_tftipentnom_sel ;
   private String AV160Talbdet1wwds_18_tfalbrdes ;
   private String AV161Talbdet1wwds_19_tfalbrdes_sel ;
   private String AV167Talbdet1wwds_25_tfalbrloc ;
   private String AV168Talbdet1wwds_26_tfalbrloc_sel ;
   private String scmdbuf ;
   private String lV148Talbdet1wwds_6_tfclinom ;
   private String lV150Talbdet1wwds_8_tfalbref ;
   private String lV152Talbdet1wwds_10_tfalbrefdsc ;
   private String lV154Talbdet1wwds_12_tfprocenom ;
   private String lV156Talbdet1wwds_14_tftrnnom ;
   private String lV158Talbdet1wwds_16_tftipentnom ;
   private String lV160Talbdet1wwds_18_tfalbrdes ;
   private String lV167Talbdet1wwds_25_tfalbrloc ;
   private String AV139Station ;
   private String AV140Emprcod ;
   private String AV141Emprnom ;
   private String AV142Usurcod ;
   private String edtavDetallepiezas_Link ;
   private String edtavEliminar_Link ;
   private String edtCliNom_Link ;
   private String GXt_char1 ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
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
   private String edtavDetallepiezas_Jsonclick ;
   private String edtavEliminar_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbRHEn_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtProceNom_Jsonclick ;
   private String edtTrnNom_Jsonclick ;
   private String edtTipEntNom_Jsonclick ;
   private String edtAlbRDes_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRLoc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV60TFAlbRHEn ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV147Talbdet1wwds_5_tfalbrhen ;
   private java.util.Date AV55TFAlbRFen ;
   private java.util.Date AV57DDO_AlbRFenAuxDate ;
   private java.util.Date AV62DDO_AlbRHEnAuxDate ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV146Talbdet1wwds_4_tfalbrfen ;
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
   private boolean n4606AlbRHEn ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n1212TipEntNom ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV134TFAlbRUni_SelsJson ;
   private String AV110TFAlbRReo_SelsJson ;
   private String AV37ColumnsSelectorXML ;
   private String AV43ManageFiltersXml ;
   private String AV38UserCustomValue ;
   private String AV133FilterFullText ;
   private String AV143Talbdet1wwds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private IDataStoreProvider pr_default ;
   private short[] H00C12_A840TrnCod ;
   private boolean[] H00C12_n840TrnCod ;
   private short[] H00C12_A970ProceCod ;
   private boolean[] H00C12_n970ProceCod ;
   private short[] H00C12_A1211TipEntCod ;
   private boolean[] H00C12_n1211TipEntCod ;
   private String[] H00C12_A396EmprCod ;
   private int[] H00C12_A252CliCod ;
   private String[] H00C12_A55AlbRReo ;
   private String[] H00C12_A50AlbRLoc ;
   private int[] H00C12_A52AlbRPieEnt ;
   private String[] H00C12_A56AlbRUni ;
   private java.math.BigDecimal[] H00C12_A58AlbRUniEnt ;
   private String[] H00C12_A1291AlbRDes ;
   private String[] H00C12_A1212TipEntNom ;
   private boolean[] H00C12_n1212TipEntNom ;
   private String[] H00C12_A841TrnNom ;
   private boolean[] H00C12_n841TrnNom ;
   private String[] H00C12_A971ProceNom ;
   private boolean[] H00C12_n971ProceNom ;
   private String[] H00C12_A3613AlbRefDsc ;
   private String[] H00C12_A45AlbRef ;
   private String[] H00C12_A279CliNom ;
   private java.util.Date[] H00C12_A4606AlbRHEn ;
   private boolean[] H00C12_n4606AlbRHEn ;
   private java.util.Date[] H00C12_A49AlbRFen ;
   private int[] H00C12_A44AlbRecCod ;
   private short[] H00C13_A840TrnCod ;
   private boolean[] H00C13_n840TrnCod ;
   private short[] H00C13_A970ProceCod ;
   private boolean[] H00C13_n970ProceCod ;
   private short[] H00C13_A1211TipEntCod ;
   private boolean[] H00C13_n1211TipEntCod ;
   private String[] H00C13_A396EmprCod ;
   private int[] H00C13_A252CliCod ;
   private String[] H00C13_A55AlbRReo ;
   private String[] H00C13_A50AlbRLoc ;
   private int[] H00C13_A52AlbRPieEnt ;
   private String[] H00C13_A56AlbRUni ;
   private java.math.BigDecimal[] H00C13_A58AlbRUniEnt ;
   private String[] H00C13_A1291AlbRDes ;
   private String[] H00C13_A1212TipEntNom ;
   private boolean[] H00C13_n1212TipEntNom ;
   private String[] H00C13_A841TrnNom ;
   private boolean[] H00C13_n841TrnNom ;
   private String[] H00C13_A971ProceNom ;
   private boolean[] H00C13_n971ProceNom ;
   private String[] H00C13_A3613AlbRefDsc ;
   private String[] H00C13_A45AlbRef ;
   private String[] H00C13_A279CliNom ;
   private java.util.Date[] H00C13_A4606AlbRHEn ;
   private boolean[] H00C13_n4606AlbRHEn ;
   private java.util.Date[] H00C13_A49AlbRFen ;
   private int[] H00C13_A44AlbRecCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV135TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV111TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV164Talbdet1wwds_22_tfalbruni_sels ;
   private GXSimpleCollection<String> AV169Talbdet1wwds_27_tfalbrreo_sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV42ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV119DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class talbdet1ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00C12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV164Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV169Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV144Talbdet1wwds_2_tfalbreccod ,
                                          int AV145Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV146Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV147Talbdet1wwds_5_tfalbrhen ,
                                          String AV149Talbdet1wwds_7_tfclinom_sel ,
                                          String AV148Talbdet1wwds_6_tfclinom ,
                                          String AV151Talbdet1wwds_9_tfalbref_sel ,
                                          String AV150Talbdet1wwds_8_tfalbref ,
                                          String AV153Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV152Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV155Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV154Talbdet1wwds_12_tfprocenom ,
                                          String AV157Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV156Talbdet1wwds_14_tftrnnom ,
                                          String AV159Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV158Talbdet1wwds_16_tftipentnom ,
                                          String AV161Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV160Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV162Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV163Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV164Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV165Talbdet1wwds_23_tfalbrpieent ,
                                          int AV166Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV168Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV167Talbdet1wwds_25_tfalbrloc ,
                                          int AV169Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV143Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[24];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.EmprCod, T1.CliCod, T1.AlbRReo, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUni, T1.AlbRUniEnt, T1.AlbRDes, T4.TipEntNom, T2.TrnNom," ;
      scmdbuf += " T3.ProceNom, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod FROM ((((TXPALBREC T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T4 ON T4.EmprCod = T1.EmprCod AND T4.TipEntCod" ;
      scmdbuf += " = T1.TipEntCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV144Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
      }
      if ( ! (0==AV145Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV147Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV148Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV150Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV152Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV154Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProceNom = ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV156Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV158Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipEntNom = ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV160Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( AV164Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV164Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV165Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV166Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV167Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( AV169Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV169Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ProceNom" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ProceNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipEntNom" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipEntNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H00C13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV164Talbdet1wwds_22_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV169Talbdet1wwds_27_tfalbrreo_sels ,
                                          int AV144Talbdet1wwds_2_tfalbreccod ,
                                          int AV145Talbdet1wwds_3_tfalbreccod_to ,
                                          java.util.Date AV146Talbdet1wwds_4_tfalbrfen ,
                                          java.util.Date AV147Talbdet1wwds_5_tfalbrhen ,
                                          String AV149Talbdet1wwds_7_tfclinom_sel ,
                                          String AV148Talbdet1wwds_6_tfclinom ,
                                          String AV151Talbdet1wwds_9_tfalbref_sel ,
                                          String AV150Talbdet1wwds_8_tfalbref ,
                                          String AV153Talbdet1wwds_11_tfalbrefdsc_sel ,
                                          String AV152Talbdet1wwds_10_tfalbrefdsc ,
                                          String AV155Talbdet1wwds_13_tfprocenom_sel ,
                                          String AV154Talbdet1wwds_12_tfprocenom ,
                                          String AV157Talbdet1wwds_15_tftrnnom_sel ,
                                          String AV156Talbdet1wwds_14_tftrnnom ,
                                          String AV159Talbdet1wwds_17_tftipentnom_sel ,
                                          String AV158Talbdet1wwds_16_tftipentnom ,
                                          String AV161Talbdet1wwds_19_tfalbrdes_sel ,
                                          String AV160Talbdet1wwds_18_tfalbrdes ,
                                          java.math.BigDecimal AV162Talbdet1wwds_20_tfalbrunient ,
                                          java.math.BigDecimal AV163Talbdet1wwds_21_tfalbrunient_to ,
                                          int AV164Talbdet1wwds_22_tfalbruni_sels_size ,
                                          int AV165Talbdet1wwds_23_tfalbrpieent ,
                                          int AV166Talbdet1wwds_24_tfalbrpieent_to ,
                                          String AV168Talbdet1wwds_26_tfalbrloc_sel ,
                                          String AV167Talbdet1wwds_25_tfalbrloc ,
                                          int AV169Talbdet1wwds_27_tfalbrreo_sels_size ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A971ProceNom ,
                                          String A841TrnNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV143Talbdet1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[24];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT T1.TrnCod, T1.ProceCod, T1.TipEntCod, T1.EmprCod, T1.CliCod, T1.AlbRReo, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUni, T1.AlbRUniEnt, T1.AlbRDes, T4.TipEntNom, T2.TrnNom," ;
      scmdbuf += " T3.ProceNom, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.AlbRHEn, T1.AlbRFen, T1.AlbRecCod FROM ((((TXPALBREC T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T3 ON T3.EmprCod = T1.EmprCod AND T3.ProceCod = T1.ProceCod) LEFT JOIN TXPENTRAD T4 ON T4.EmprCod = T1.EmprCod AND T4.TipEntCod" ;
      scmdbuf += " = T1.TipEntCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV144Talbdet1wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int32[0] = (byte)(1) ;
      }
      if ( ! (0==AV145Talbdet1wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int32[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Talbdet1wwds_4_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV147Talbdet1wwds_5_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Talbdet1wwds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV148Talbdet1wwds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Talbdet1wwds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Talbdet1wwds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV150Talbdet1wwds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Talbdet1wwds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV153Talbdet1wwds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV152Talbdet1wwds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV153Talbdet1wwds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV155Talbdet1wwds_13_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV154Talbdet1wwds_12_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV155Talbdet1wwds_13_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ProceNom = ?)");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV157Talbdet1wwds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV156Talbdet1wwds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Talbdet1wwds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV159Talbdet1wwds_17_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV158Talbdet1wwds_16_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Talbdet1wwds_17_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipEntNom = ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV161Talbdet1wwds_19_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV160Talbdet1wwds_18_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV161Talbdet1wwds_19_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Talbdet1wwds_20_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Talbdet1wwds_21_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( AV164Talbdet1wwds_22_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV164Talbdet1wwds_22_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV165Talbdet1wwds_23_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (0==AV166Talbdet1wwds_24_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Talbdet1wwds_26_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV167Talbdet1wwds_25_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Talbdet1wwds_26_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( AV169Talbdet1wwds_27_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV169Talbdet1wwds_27_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.ProceNom" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.ProceNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipEntNom" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipEntNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV13OrderedBy == 15 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
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
                  return conditional_H00C12(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] );
            case 1 :
                  return conditional_H00C13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00C12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00C13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((String[]) buf[14])[0] = rslt.getString(12, 25);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((String[]) buf[22])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((int[]) buf[26])[0] = rslt.getInt(20);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 3);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 2);
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 20);
               ((String[]) buf[14])[0] = rslt.getString(12, 25);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(15, 26);
               ((String[]) buf[21])[0] = rslt.getString(16, 16);
               ((String[]) buf[22])[0] = rslt.getString(17, 30);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((int[]) buf[26])[0] = rslt.getInt(20);
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
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 25);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 25);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 10);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 10);
               }
               return;
      }
   }

}

