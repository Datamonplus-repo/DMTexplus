package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprocedww_impl extends GXDataArea
{
   public tprocedww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprocedww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprocedww_impl.class ));
   }

   public tprocedww_impl( int remoteHandle ,
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
      AV94FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36ColumnsSelector);
      AV89TFProceNom = httpContext.GetPar( "TFProceNom") ;
      AV90TFProceNom_Sel = httpContext.GetPar( "TFProceNom_Sel") ;
      AV46TFProceCod = (short)(GXutil.lval( httpContext.GetPar( "TFProceCod"))) ;
      AV47TFProceCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFProceCod_To"))) ;
      AV52TFProceDom = httpContext.GetPar( "TFProceDom") ;
      AV53TFProceDom_Sel = httpContext.GetPar( "TFProceDom_Sel") ;
      AV55TFProcePob = httpContext.GetPar( "TFProcePob") ;
      AV56TFProcePob_Sel = httpContext.GetPar( "TFProcePob_Sel") ;
      AV58TFPrvCod = (short)(GXutil.lval( httpContext.GetPar( "TFPrvCod"))) ;
      AV59TFPrvCod_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrvCod_To"))) ;
      AV61TFPrvDsc = httpContext.GetPar( "TFPrvDsc") ;
      AV62TFPrvDsc_Sel = httpContext.GetPar( "TFPrvDsc_Sel") ;
      AV64TFPoceCp = httpContext.GetPar( "TFPoceCp") ;
      AV65TFPoceCp_Sel = httpContext.GetPar( "TFPoceCp_Sel") ;
      AV67TFProceTel1 = httpContext.GetPar( "TFProceTel1") ;
      AV68TFProceTel1_Sel = httpContext.GetPar( "TFProceTel1_Sel") ;
      AV70TFProceTel2 = httpContext.GetPar( "TFProceTel2") ;
      AV71TFProceTel2_Sel = httpContext.GetPar( "TFProceTel2_Sel") ;
      AV73TFProceTelex = httpContext.GetPar( "TFProceTelex") ;
      AV74TFProceTelex_Sel = httpContext.GetPar( "TFProceTelex_Sel") ;
      AV76TFProPers = httpContext.GetPar( "TFProPers") ;
      AV77TFProPers_Sel = httpContext.GetPar( "TFProPers_Sel") ;
      AV79TFProEmail = httpContext.GetPar( "TFProEmail") ;
      AV80TFProEmail_Sel = httpContext.GetPar( "TFProEmail_Sel") ;
      AV49TFProceNif = httpContext.GetPar( "TFProceNif") ;
      AV50TFProceNif_Sel = httpContext.GetPar( "TFProceNif_Sel") ;
      AV96TFPoceCp2 = httpContext.GetPar( "TFPoceCp2") ;
      AV97TFPoceCp2_Sel = httpContext.GetPar( "TFPoceCp2_Sel") ;
      AV100Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV94FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89TFProceNom, AV90TFProceNom_Sel, AV46TFProceCod, AV47TFProceCod_To, AV52TFProceDom, AV53TFProceDom_Sel, AV55TFProcePob, AV56TFProcePob_Sel, AV58TFPrvCod, AV59TFPrvCod_To, AV61TFPrvDsc, AV62TFPrvDsc_Sel, AV64TFPoceCp, AV65TFPoceCp_Sel, AV67TFProceTel1, AV68TFProceTel1_Sel, AV70TFProceTel2, AV71TFProceTel2_Sel, AV73TFProceTelex, AV74TFProceTelex_Sel, AV76TFProPers, AV77TFProPers_Sel, AV79TFProEmail, AV80TFProEmail_Sel, AV49TFProceNif, AV50TFProceNif_Sel, AV96TFPoceCp2, AV97TFPoceCp2_Sel, AV100Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
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
      paAE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startAE2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprocedww", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPROCEDWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV100Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tprocedww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV94FilterFullText);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV84GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV85GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV82DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV82DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENOM", GXutil.rtrim( AV89TFProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENOM_SEL", GXutil.rtrim( AV90TFProceNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCECOD", GXutil.ltrim( localUtil.ntoc( AV46TFProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCECOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFProceCod_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCEDOM", GXutil.rtrim( AV52TFProceDom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCEDOM_SEL", GXutil.rtrim( AV53TFProceDom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCEPOB", GXutil.rtrim( AV55TFProcePob));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCEPOB_SEL", GXutil.rtrim( AV56TFProcePob_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCOD", GXutil.ltrim( localUtil.ntoc( AV58TFPrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVCOD_TO", GXutil.ltrim( localUtil.ntoc( AV59TFPrvCod_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDSC", GXutil.rtrim( AV61TFPrvDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRVDSC_SEL", GXutil.rtrim( AV62TFPrvDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPOCECP", GXutil.rtrim( AV64TFPoceCp));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPOCECP_SEL", GXutil.rtrim( AV65TFPoceCp_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCETEL1", GXutil.rtrim( AV67TFProceTel1));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCETEL1_SEL", GXutil.rtrim( AV68TFProceTel1_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCETEL2", GXutil.rtrim( AV70TFProceTel2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCETEL2_SEL", GXutil.rtrim( AV71TFProceTel2_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCETELEX", GXutil.rtrim( AV73TFProceTelex));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCETELEX_SEL", GXutil.rtrim( AV74TFProceTelex_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROPERS", GXutil.rtrim( AV76TFProPers));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROPERS_SEL", GXutil.rtrim( AV77TFProPers_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROEMAIL", GXutil.rtrim( AV79TFProEmail));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROEMAIL_SEL", GXutil.rtrim( AV80TFProEmail_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENIF", GXutil.rtrim( AV49TFProceNif));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCENIF_SEL", GXutil.rtrim( AV50TFProceNif_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPOCECP2", GXutil.rtrim( AV96TFPoceCp2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPOCECP2_SEL", GXutil.rtrim( AV97TFPoceCp2_Sel));
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
         weAE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtAE2( ) ;
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
      return formatLink("app.tprocedww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPROCEDWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " PROCEDENCIAS", "") ;
   }

   public void wbAE0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 45, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPROCEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_AE2( true) ;
      }
      else
      {
         wb_table1_27_AE2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_AE2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV84GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV85GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV100Pgmname), GXutil.rtrim( localUtil.format( AV100Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPROCEDWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV82DDO_TitleSettingsIcons);
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

   public void startAE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " PROCEDENCIAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupAE0( ) ;
   }

   public void wsAE2( )
   {
      startAE2( ) ;
      evtAE2( ) ;
   }

   public void evtAE2( )
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
                           e11AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e16AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e18AE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e19AE2 ();
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
                           AV95GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95GridActions), 4, 0));
                           A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
                           n971ProceNom = false ;
                           A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A994ProceDom = httpContext.cgiGet( edtProceDom_Internalname) ;
                           n994ProceDom = false ;
                           A988ProcePob = httpContext.cgiGet( edtProcePob_Internalname) ;
                           n988ProcePob = false ;
                           A781PrvCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPrvCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n781PrvCod = false ;
                           A787PrvDsc = GXutil.upper( httpContext.cgiGet( edtPrvDsc_Internalname)) ;
                           n787PrvDsc = false ;
                           A989PoceCp = httpContext.cgiGet( edtPoceCp_Internalname) ;
                           n989PoceCp = false ;
                           A990ProceTel1 = httpContext.cgiGet( edtProceTel1_Internalname) ;
                           n990ProceTel1 = false ;
                           A991ProceTel2 = httpContext.cgiGet( edtProceTel2_Internalname) ;
                           n991ProceTel2 = false ;
                           A992ProceTelex = httpContext.cgiGet( edtProceTelex_Internalname) ;
                           n992ProceTelex = false ;
                           A10390ProPers = httpContext.cgiGet( edtProPers_Internalname) ;
                           n10390ProPers = false ;
                           A10391ProEmail = httpContext.cgiGet( edtProEmail_Internalname) ;
                           n10391ProEmail = false ;
                           A993ProceNif = httpContext.cgiGet( edtProceNif_Internalname) ;
                           n993ProceNif = false ;
                           A13820ProceNomID = httpContext.cgiGet( edtProceNomID_Internalname) ;
                           A14029PoceCp2 = httpContext.cgiGet( edtPoceCp2_Internalname) ;
                           n14029PoceCp2 = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e20AE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e21AE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22AE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV94FilterFullText) != 0 )
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

   public void weAE2( )
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

   public void paAE2( )
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
                                 String AV94FilterFullText ,
                                 byte AV41ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ,
                                 String AV89TFProceNom ,
                                 String AV90TFProceNom_Sel ,
                                 short AV46TFProceCod ,
                                 short AV47TFProceCod_To ,
                                 String AV52TFProceDom ,
                                 String AV53TFProceDom_Sel ,
                                 String AV55TFProcePob ,
                                 String AV56TFProcePob_Sel ,
                                 short AV58TFPrvCod ,
                                 short AV59TFPrvCod_To ,
                                 String AV61TFPrvDsc ,
                                 String AV62TFPrvDsc_Sel ,
                                 String AV64TFPoceCp ,
                                 String AV65TFPoceCp_Sel ,
                                 String AV67TFProceTel1 ,
                                 String AV68TFProceTel1_Sel ,
                                 String AV70TFProceTel2 ,
                                 String AV71TFProceTel2_Sel ,
                                 String AV73TFProceTelex ,
                                 String AV74TFProceTelex_Sel ,
                                 String AV76TFProPers ,
                                 String AV77TFProPers_Sel ,
                                 String AV79TFProEmail ,
                                 String AV80TFProEmail_Sel ,
                                 String AV49TFProceNif ,
                                 String AV50TFProceNif_Sel ,
                                 String AV96TFPoceCp2 ,
                                 String AV97TFPoceCp2_Sel ,
                                 String AV100Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e21AE2 ();
      GRID_nCurrentRecord = 0 ;
      rfAE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TPROCEDWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV100Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tprocedww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCECOD", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
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
      rfAE2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV100Pgmname = "TPROCEDWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfAE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(45) ;
      /* Execute user event: Refresh */
      e21AE2 ();
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
                                              AV105Tprocedwwds_1_filterfulltext ,
                                              AV107Tprocedwwds_3_tfprocenom_sel ,
                                              AV106Tprocedwwds_2_tfprocenom ,
                                              Short.valueOf(AV108Tprocedwwds_4_tfprocecod) ,
                                              Short.valueOf(AV109Tprocedwwds_5_tfprocecod_to) ,
                                              AV111Tprocedwwds_7_tfprocedom_sel ,
                                              AV110Tprocedwwds_6_tfprocedom ,
                                              AV113Tprocedwwds_9_tfprocepob_sel ,
                                              AV112Tprocedwwds_8_tfprocepob ,
                                              Short.valueOf(AV114Tprocedwwds_10_tfprvcod) ,
                                              Short.valueOf(AV115Tprocedwwds_11_tfprvcod_to) ,
                                              AV117Tprocedwwds_13_tfprvdsc_sel ,
                                              AV116Tprocedwwds_12_tfprvdsc ,
                                              AV119Tprocedwwds_15_tfpocecp_sel ,
                                              AV118Tprocedwwds_14_tfpocecp ,
                                              AV121Tprocedwwds_17_tfprocetel1_sel ,
                                              AV120Tprocedwwds_16_tfprocetel1 ,
                                              AV123Tprocedwwds_19_tfprocetel2_sel ,
                                              AV122Tprocedwwds_18_tfprocetel2 ,
                                              AV125Tprocedwwds_21_tfprocetelex_sel ,
                                              AV124Tprocedwwds_20_tfprocetelex ,
                                              AV127Tprocedwwds_23_tfpropers_sel ,
                                              AV126Tprocedwwds_22_tfpropers ,
                                              AV129Tprocedwwds_25_tfproemail_sel ,
                                              AV128Tprocedwwds_24_tfproemail ,
                                              AV131Tprocedwwds_27_tfprocenif_sel ,
                                              AV130Tprocedwwds_26_tfprocenif ,
                                              AV133Tprocedwwds_29_tfpocecp2_sel ,
                                              AV132Tprocedwwds_28_tfpocecp2 ,
                                              A971ProceNom ,
                                              Short.valueOf(A970ProceCod) ,
                                              A994ProceDom ,
                                              A988ProcePob ,
                                              Short.valueOf(A781PrvCod) ,
                                              A787PrvDsc ,
                                              A989PoceCp ,
                                              A990ProceTel1 ,
                                              A991ProceTel2 ,
                                              A992ProceTelex ,
                                              A10390ProPers ,
                                              A10391ProEmail ,
                                              A993ProceNif ,
                                              A14029PoceCp2 ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
         lV106Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV106Tprocedwwds_2_tfprocenom), 30, "%") ;
         lV110Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV110Tprocedwwds_6_tfprocedom), 34, "%") ;
         lV112Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV112Tprocedwwds_8_tfprocepob), 30, "%") ;
         lV116Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV116Tprocedwwds_12_tfprvdsc), 30, "%") ;
         lV118Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV118Tprocedwwds_14_tfpocecp), 6, "%") ;
         lV120Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV120Tprocedwwds_16_tfprocetel1), 9, "%") ;
         lV122Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV122Tprocedwwds_18_tfprocetel2), 9, "%") ;
         lV124Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV124Tprocedwwds_20_tfprocetelex), 14, "%") ;
         lV126Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV126Tprocedwwds_22_tfpropers), 40, "%") ;
         lV128Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV128Tprocedwwds_24_tfproemail), 40, "%") ;
         lV130Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV130Tprocedwwds_26_tfprocenif), 20, "%") ;
         lV132Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV132Tprocedwwds_28_tfpocecp2), 6, "%") ;
         /* Using cursor H00AE2 */
         pr_default.execute(0, new Object[] {lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV106Tprocedwwds_2_tfprocenom, AV107Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV108Tprocedwwds_4_tfprocecod), Short.valueOf(AV109Tprocedwwds_5_tfprocecod_to), lV110Tprocedwwds_6_tfprocedom, AV111Tprocedwwds_7_tfprocedom_sel, lV112Tprocedwwds_8_tfprocepob, AV113Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV114Tprocedwwds_10_tfprvcod), Short.valueOf(AV115Tprocedwwds_11_tfprvcod_to), lV116Tprocedwwds_12_tfprvdsc, AV117Tprocedwwds_13_tfprvdsc_sel, lV118Tprocedwwds_14_tfpocecp, AV119Tprocedwwds_15_tfpocecp_sel, lV120Tprocedwwds_16_tfprocetel1, AV121Tprocedwwds_17_tfprocetel1_sel, lV122Tprocedwwds_18_tfprocetel2, AV123Tprocedwwds_19_tfprocetel2_sel, lV124Tprocedwwds_20_tfprocetelex, AV125Tprocedwwds_21_tfprocetelex_sel, lV126Tprocedwwds_22_tfpropers, AV127Tprocedwwds_23_tfpropers_sel, lV128Tprocedwwds_24_tfproemail, AV129Tprocedwwds_25_tfproemail_sel, lV130Tprocedwwds_26_tfprocenif, AV131Tprocedwwds_27_tfprocenif_sel, lV132Tprocedwwds_28_tfpocecp2, AV133Tprocedwwds_29_tfpocecp2_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_45_idx = 1 ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_452( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00AE2_A396EmprCod[0] ;
            A14029PoceCp2 = H00AE2_A14029PoceCp2[0] ;
            n14029PoceCp2 = H00AE2_n14029PoceCp2[0] ;
            A993ProceNif = H00AE2_A993ProceNif[0] ;
            n993ProceNif = H00AE2_n993ProceNif[0] ;
            A10391ProEmail = H00AE2_A10391ProEmail[0] ;
            n10391ProEmail = H00AE2_n10391ProEmail[0] ;
            A10390ProPers = H00AE2_A10390ProPers[0] ;
            n10390ProPers = H00AE2_n10390ProPers[0] ;
            A992ProceTelex = H00AE2_A992ProceTelex[0] ;
            n992ProceTelex = H00AE2_n992ProceTelex[0] ;
            A991ProceTel2 = H00AE2_A991ProceTel2[0] ;
            n991ProceTel2 = H00AE2_n991ProceTel2[0] ;
            A990ProceTel1 = H00AE2_A990ProceTel1[0] ;
            n990ProceTel1 = H00AE2_n990ProceTel1[0] ;
            A989PoceCp = H00AE2_A989PoceCp[0] ;
            n989PoceCp = H00AE2_n989PoceCp[0] ;
            A787PrvDsc = H00AE2_A787PrvDsc[0] ;
            n787PrvDsc = H00AE2_n787PrvDsc[0] ;
            A781PrvCod = H00AE2_A781PrvCod[0] ;
            n781PrvCod = H00AE2_n781PrvCod[0] ;
            A988ProcePob = H00AE2_A988ProcePob[0] ;
            n988ProcePob = H00AE2_n988ProcePob[0] ;
            A994ProceDom = H00AE2_A994ProceDom[0] ;
            n994ProceDom = H00AE2_n994ProceDom[0] ;
            A971ProceNom = H00AE2_A971ProceNom[0] ;
            n971ProceNom = H00AE2_n971ProceNom[0] ;
            A970ProceCod = H00AE2_A970ProceCod[0] ;
            A787PrvDsc = H00AE2_A787PrvDsc[0] ;
            n787PrvDsc = H00AE2_n787PrvDsc[0] ;
            A13820ProceNomID = GXutil.trim( GXutil.str( A970ProceCod, 4, 0)) + "-" + GXutil.trim( A971ProceNom) ;
            e22AE2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(45) ;
         wbAE0( ) ;
      }
      bGXsfl_45_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesAE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCECOD"+"_"+sGXsfl_45_idx, getSecureSignedToken( sGXsfl_45_idx, localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9")));
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
      AV105Tprocedwwds_1_filterfulltext = AV94FilterFullText ;
      AV106Tprocedwwds_2_tfprocenom = AV89TFProceNom ;
      AV107Tprocedwwds_3_tfprocenom_sel = AV90TFProceNom_Sel ;
      AV108Tprocedwwds_4_tfprocecod = AV46TFProceCod ;
      AV109Tprocedwwds_5_tfprocecod_to = AV47TFProceCod_To ;
      AV110Tprocedwwds_6_tfprocedom = AV52TFProceDom ;
      AV111Tprocedwwds_7_tfprocedom_sel = AV53TFProceDom_Sel ;
      AV112Tprocedwwds_8_tfprocepob = AV55TFProcePob ;
      AV113Tprocedwwds_9_tfprocepob_sel = AV56TFProcePob_Sel ;
      AV114Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV115Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV116Tprocedwwds_12_tfprvdsc = AV61TFPrvDsc ;
      AV117Tprocedwwds_13_tfprvdsc_sel = AV62TFPrvDsc_Sel ;
      AV118Tprocedwwds_14_tfpocecp = AV64TFPoceCp ;
      AV119Tprocedwwds_15_tfpocecp_sel = AV65TFPoceCp_Sel ;
      AV120Tprocedwwds_16_tfprocetel1 = AV67TFProceTel1 ;
      AV121Tprocedwwds_17_tfprocetel1_sel = AV68TFProceTel1_Sel ;
      AV122Tprocedwwds_18_tfprocetel2 = AV70TFProceTel2 ;
      AV123Tprocedwwds_19_tfprocetel2_sel = AV71TFProceTel2_Sel ;
      AV124Tprocedwwds_20_tfprocetelex = AV73TFProceTelex ;
      AV125Tprocedwwds_21_tfprocetelex_sel = AV74TFProceTelex_Sel ;
      AV126Tprocedwwds_22_tfpropers = AV76TFProPers ;
      AV127Tprocedwwds_23_tfpropers_sel = AV77TFProPers_Sel ;
      AV128Tprocedwwds_24_tfproemail = AV79TFProEmail ;
      AV129Tprocedwwds_25_tfproemail_sel = AV80TFProEmail_Sel ;
      AV130Tprocedwwds_26_tfprocenif = AV49TFProceNif ;
      AV131Tprocedwwds_27_tfprocenif_sel = AV50TFProceNif_Sel ;
      AV132Tprocedwwds_28_tfpocecp2 = AV96TFPoceCp2 ;
      AV133Tprocedwwds_29_tfpocecp2_sel = AV97TFPoceCp2_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV105Tprocedwwds_1_filterfulltext ,
                                           AV107Tprocedwwds_3_tfprocenom_sel ,
                                           AV106Tprocedwwds_2_tfprocenom ,
                                           Short.valueOf(AV108Tprocedwwds_4_tfprocecod) ,
                                           Short.valueOf(AV109Tprocedwwds_5_tfprocecod_to) ,
                                           AV111Tprocedwwds_7_tfprocedom_sel ,
                                           AV110Tprocedwwds_6_tfprocedom ,
                                           AV113Tprocedwwds_9_tfprocepob_sel ,
                                           AV112Tprocedwwds_8_tfprocepob ,
                                           Short.valueOf(AV114Tprocedwwds_10_tfprvcod) ,
                                           Short.valueOf(AV115Tprocedwwds_11_tfprvcod_to) ,
                                           AV117Tprocedwwds_13_tfprvdsc_sel ,
                                           AV116Tprocedwwds_12_tfprvdsc ,
                                           AV119Tprocedwwds_15_tfpocecp_sel ,
                                           AV118Tprocedwwds_14_tfpocecp ,
                                           AV121Tprocedwwds_17_tfprocetel1_sel ,
                                           AV120Tprocedwwds_16_tfprocetel1 ,
                                           AV123Tprocedwwds_19_tfprocetel2_sel ,
                                           AV122Tprocedwwds_18_tfprocetel2 ,
                                           AV125Tprocedwwds_21_tfprocetelex_sel ,
                                           AV124Tprocedwwds_20_tfprocetelex ,
                                           AV127Tprocedwwds_23_tfpropers_sel ,
                                           AV126Tprocedwwds_22_tfpropers ,
                                           AV129Tprocedwwds_25_tfproemail_sel ,
                                           AV128Tprocedwwds_24_tfproemail ,
                                           AV131Tprocedwwds_27_tfprocenif_sel ,
                                           AV130Tprocedwwds_26_tfprocenif ,
                                           AV133Tprocedwwds_29_tfpocecp2_sel ,
                                           AV132Tprocedwwds_28_tfpocecp2 ,
                                           A971ProceNom ,
                                           Short.valueOf(A970ProceCod) ,
                                           A994ProceDom ,
                                           A988ProcePob ,
                                           Short.valueOf(A781PrvCod) ,
                                           A787PrvDsc ,
                                           A989PoceCp ,
                                           A990ProceTel1 ,
                                           A991ProceTel2 ,
                                           A992ProceTelex ,
                                           A10390ProPers ,
                                           A10391ProEmail ,
                                           A993ProceNif ,
                                           A14029PoceCp2 ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV105Tprocedwwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV105Tprocedwwds_1_filterfulltext), "%", "") ;
      lV106Tprocedwwds_2_tfprocenom = GXutil.padr( GXutil.rtrim( AV106Tprocedwwds_2_tfprocenom), 30, "%") ;
      lV110Tprocedwwds_6_tfprocedom = GXutil.padr( GXutil.rtrim( AV110Tprocedwwds_6_tfprocedom), 34, "%") ;
      lV112Tprocedwwds_8_tfprocepob = GXutil.padr( GXutil.rtrim( AV112Tprocedwwds_8_tfprocepob), 30, "%") ;
      lV116Tprocedwwds_12_tfprvdsc = GXutil.padr( GXutil.rtrim( AV116Tprocedwwds_12_tfprvdsc), 30, "%") ;
      lV118Tprocedwwds_14_tfpocecp = GXutil.padr( GXutil.rtrim( AV118Tprocedwwds_14_tfpocecp), 6, "%") ;
      lV120Tprocedwwds_16_tfprocetel1 = GXutil.padr( GXutil.rtrim( AV120Tprocedwwds_16_tfprocetel1), 9, "%") ;
      lV122Tprocedwwds_18_tfprocetel2 = GXutil.padr( GXutil.rtrim( AV122Tprocedwwds_18_tfprocetel2), 9, "%") ;
      lV124Tprocedwwds_20_tfprocetelex = GXutil.padr( GXutil.rtrim( AV124Tprocedwwds_20_tfprocetelex), 14, "%") ;
      lV126Tprocedwwds_22_tfpropers = GXutil.padr( GXutil.rtrim( AV126Tprocedwwds_22_tfpropers), 40, "%") ;
      lV128Tprocedwwds_24_tfproemail = GXutil.padr( GXutil.rtrim( AV128Tprocedwwds_24_tfproemail), 40, "%") ;
      lV130Tprocedwwds_26_tfprocenif = GXutil.padr( GXutil.rtrim( AV130Tprocedwwds_26_tfprocenif), 20, "%") ;
      lV132Tprocedwwds_28_tfpocecp2 = GXutil.padr( GXutil.rtrim( AV132Tprocedwwds_28_tfpocecp2), 6, "%") ;
      /* Using cursor H00AE3 */
      pr_default.execute(1, new Object[] {lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV105Tprocedwwds_1_filterfulltext, lV106Tprocedwwds_2_tfprocenom, AV107Tprocedwwds_3_tfprocenom_sel, Short.valueOf(AV108Tprocedwwds_4_tfprocecod), Short.valueOf(AV109Tprocedwwds_5_tfprocecod_to), lV110Tprocedwwds_6_tfprocedom, AV111Tprocedwwds_7_tfprocedom_sel, lV112Tprocedwwds_8_tfprocepob, AV113Tprocedwwds_9_tfprocepob_sel, Short.valueOf(AV114Tprocedwwds_10_tfprvcod), Short.valueOf(AV115Tprocedwwds_11_tfprvcod_to), lV116Tprocedwwds_12_tfprvdsc, AV117Tprocedwwds_13_tfprvdsc_sel, lV118Tprocedwwds_14_tfpocecp, AV119Tprocedwwds_15_tfpocecp_sel, lV120Tprocedwwds_16_tfprocetel1, AV121Tprocedwwds_17_tfprocetel1_sel, lV122Tprocedwwds_18_tfprocetel2, AV123Tprocedwwds_19_tfprocetel2_sel, lV124Tprocedwwds_20_tfprocetelex, AV125Tprocedwwds_21_tfprocetelex_sel, lV126Tprocedwwds_22_tfpropers, AV127Tprocedwwds_23_tfpropers_sel, lV128Tprocedwwds_24_tfproemail, AV129Tprocedwwds_25_tfproemail_sel, lV130Tprocedwwds_26_tfprocenif, AV131Tprocedwwds_27_tfprocenif_sel, lV132Tprocedwwds_28_tfpocecp2, AV133Tprocedwwds_29_tfpocecp2_sel});
      GRID_nRecordCount = H00AE3_AGRID_nRecordCount[0] ;
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
      AV105Tprocedwwds_1_filterfulltext = AV94FilterFullText ;
      AV106Tprocedwwds_2_tfprocenom = AV89TFProceNom ;
      AV107Tprocedwwds_3_tfprocenom_sel = AV90TFProceNom_Sel ;
      AV108Tprocedwwds_4_tfprocecod = AV46TFProceCod ;
      AV109Tprocedwwds_5_tfprocecod_to = AV47TFProceCod_To ;
      AV110Tprocedwwds_6_tfprocedom = AV52TFProceDom ;
      AV111Tprocedwwds_7_tfprocedom_sel = AV53TFProceDom_Sel ;
      AV112Tprocedwwds_8_tfprocepob = AV55TFProcePob ;
      AV113Tprocedwwds_9_tfprocepob_sel = AV56TFProcePob_Sel ;
      AV114Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV115Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV116Tprocedwwds_12_tfprvdsc = AV61TFPrvDsc ;
      AV117Tprocedwwds_13_tfprvdsc_sel = AV62TFPrvDsc_Sel ;
      AV118Tprocedwwds_14_tfpocecp = AV64TFPoceCp ;
      AV119Tprocedwwds_15_tfpocecp_sel = AV65TFPoceCp_Sel ;
      AV120Tprocedwwds_16_tfprocetel1 = AV67TFProceTel1 ;
      AV121Tprocedwwds_17_tfprocetel1_sel = AV68TFProceTel1_Sel ;
      AV122Tprocedwwds_18_tfprocetel2 = AV70TFProceTel2 ;
      AV123Tprocedwwds_19_tfprocetel2_sel = AV71TFProceTel2_Sel ;
      AV124Tprocedwwds_20_tfprocetelex = AV73TFProceTelex ;
      AV125Tprocedwwds_21_tfprocetelex_sel = AV74TFProceTelex_Sel ;
      AV126Tprocedwwds_22_tfpropers = AV76TFProPers ;
      AV127Tprocedwwds_23_tfpropers_sel = AV77TFProPers_Sel ;
      AV128Tprocedwwds_24_tfproemail = AV79TFProEmail ;
      AV129Tprocedwwds_25_tfproemail_sel = AV80TFProEmail_Sel ;
      AV130Tprocedwwds_26_tfprocenif = AV49TFProceNif ;
      AV131Tprocedwwds_27_tfprocenif_sel = AV50TFProceNif_Sel ;
      AV132Tprocedwwds_28_tfpocecp2 = AV96TFPoceCp2 ;
      AV133Tprocedwwds_29_tfpocecp2_sel = AV97TFPoceCp2_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV94FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89TFProceNom, AV90TFProceNom_Sel, AV46TFProceCod, AV47TFProceCod_To, AV52TFProceDom, AV53TFProceDom_Sel, AV55TFProcePob, AV56TFProcePob_Sel, AV58TFPrvCod, AV59TFPrvCod_To, AV61TFPrvDsc, AV62TFPrvDsc_Sel, AV64TFPoceCp, AV65TFPoceCp_Sel, AV67TFProceTel1, AV68TFProceTel1_Sel, AV70TFProceTel2, AV71TFProceTel2_Sel, AV73TFProceTelex, AV74TFProceTelex_Sel, AV76TFProPers, AV77TFProPers_Sel, AV79TFProEmail, AV80TFProEmail_Sel, AV49TFProceNif, AV50TFProceNif_Sel, AV96TFPoceCp2, AV97TFPoceCp2_Sel, AV100Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV105Tprocedwwds_1_filterfulltext = AV94FilterFullText ;
      AV106Tprocedwwds_2_tfprocenom = AV89TFProceNom ;
      AV107Tprocedwwds_3_tfprocenom_sel = AV90TFProceNom_Sel ;
      AV108Tprocedwwds_4_tfprocecod = AV46TFProceCod ;
      AV109Tprocedwwds_5_tfprocecod_to = AV47TFProceCod_To ;
      AV110Tprocedwwds_6_tfprocedom = AV52TFProceDom ;
      AV111Tprocedwwds_7_tfprocedom_sel = AV53TFProceDom_Sel ;
      AV112Tprocedwwds_8_tfprocepob = AV55TFProcePob ;
      AV113Tprocedwwds_9_tfprocepob_sel = AV56TFProcePob_Sel ;
      AV114Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV115Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV116Tprocedwwds_12_tfprvdsc = AV61TFPrvDsc ;
      AV117Tprocedwwds_13_tfprvdsc_sel = AV62TFPrvDsc_Sel ;
      AV118Tprocedwwds_14_tfpocecp = AV64TFPoceCp ;
      AV119Tprocedwwds_15_tfpocecp_sel = AV65TFPoceCp_Sel ;
      AV120Tprocedwwds_16_tfprocetel1 = AV67TFProceTel1 ;
      AV121Tprocedwwds_17_tfprocetel1_sel = AV68TFProceTel1_Sel ;
      AV122Tprocedwwds_18_tfprocetel2 = AV70TFProceTel2 ;
      AV123Tprocedwwds_19_tfprocetel2_sel = AV71TFProceTel2_Sel ;
      AV124Tprocedwwds_20_tfprocetelex = AV73TFProceTelex ;
      AV125Tprocedwwds_21_tfprocetelex_sel = AV74TFProceTelex_Sel ;
      AV126Tprocedwwds_22_tfpropers = AV76TFProPers ;
      AV127Tprocedwwds_23_tfpropers_sel = AV77TFProPers_Sel ;
      AV128Tprocedwwds_24_tfproemail = AV79TFProEmail ;
      AV129Tprocedwwds_25_tfproemail_sel = AV80TFProEmail_Sel ;
      AV130Tprocedwwds_26_tfprocenif = AV49TFProceNif ;
      AV131Tprocedwwds_27_tfprocenif_sel = AV50TFProceNif_Sel ;
      AV132Tprocedwwds_28_tfpocecp2 = AV96TFPoceCp2 ;
      AV133Tprocedwwds_29_tfpocecp2_sel = AV97TFPoceCp2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV94FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89TFProceNom, AV90TFProceNom_Sel, AV46TFProceCod, AV47TFProceCod_To, AV52TFProceDom, AV53TFProceDom_Sel, AV55TFProcePob, AV56TFProcePob_Sel, AV58TFPrvCod, AV59TFPrvCod_To, AV61TFPrvDsc, AV62TFPrvDsc_Sel, AV64TFPoceCp, AV65TFPoceCp_Sel, AV67TFProceTel1, AV68TFProceTel1_Sel, AV70TFProceTel2, AV71TFProceTel2_Sel, AV73TFProceTelex, AV74TFProceTelex_Sel, AV76TFProPers, AV77TFProPers_Sel, AV79TFProEmail, AV80TFProEmail_Sel, AV49TFProceNif, AV50TFProceNif_Sel, AV96TFPoceCp2, AV97TFPoceCp2_Sel, AV100Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV105Tprocedwwds_1_filterfulltext = AV94FilterFullText ;
      AV106Tprocedwwds_2_tfprocenom = AV89TFProceNom ;
      AV107Tprocedwwds_3_tfprocenom_sel = AV90TFProceNom_Sel ;
      AV108Tprocedwwds_4_tfprocecod = AV46TFProceCod ;
      AV109Tprocedwwds_5_tfprocecod_to = AV47TFProceCod_To ;
      AV110Tprocedwwds_6_tfprocedom = AV52TFProceDom ;
      AV111Tprocedwwds_7_tfprocedom_sel = AV53TFProceDom_Sel ;
      AV112Tprocedwwds_8_tfprocepob = AV55TFProcePob ;
      AV113Tprocedwwds_9_tfprocepob_sel = AV56TFProcePob_Sel ;
      AV114Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV115Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV116Tprocedwwds_12_tfprvdsc = AV61TFPrvDsc ;
      AV117Tprocedwwds_13_tfprvdsc_sel = AV62TFPrvDsc_Sel ;
      AV118Tprocedwwds_14_tfpocecp = AV64TFPoceCp ;
      AV119Tprocedwwds_15_tfpocecp_sel = AV65TFPoceCp_Sel ;
      AV120Tprocedwwds_16_tfprocetel1 = AV67TFProceTel1 ;
      AV121Tprocedwwds_17_tfprocetel1_sel = AV68TFProceTel1_Sel ;
      AV122Tprocedwwds_18_tfprocetel2 = AV70TFProceTel2 ;
      AV123Tprocedwwds_19_tfprocetel2_sel = AV71TFProceTel2_Sel ;
      AV124Tprocedwwds_20_tfprocetelex = AV73TFProceTelex ;
      AV125Tprocedwwds_21_tfprocetelex_sel = AV74TFProceTelex_Sel ;
      AV126Tprocedwwds_22_tfpropers = AV76TFProPers ;
      AV127Tprocedwwds_23_tfpropers_sel = AV77TFProPers_Sel ;
      AV128Tprocedwwds_24_tfproemail = AV79TFProEmail ;
      AV129Tprocedwwds_25_tfproemail_sel = AV80TFProEmail_Sel ;
      AV130Tprocedwwds_26_tfprocenif = AV49TFProceNif ;
      AV131Tprocedwwds_27_tfprocenif_sel = AV50TFProceNif_Sel ;
      AV132Tprocedwwds_28_tfpocecp2 = AV96TFPoceCp2 ;
      AV133Tprocedwwds_29_tfpocecp2_sel = AV97TFPoceCp2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV94FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89TFProceNom, AV90TFProceNom_Sel, AV46TFProceCod, AV47TFProceCod_To, AV52TFProceDom, AV53TFProceDom_Sel, AV55TFProcePob, AV56TFProcePob_Sel, AV58TFPrvCod, AV59TFPrvCod_To, AV61TFPrvDsc, AV62TFPrvDsc_Sel, AV64TFPoceCp, AV65TFPoceCp_Sel, AV67TFProceTel1, AV68TFProceTel1_Sel, AV70TFProceTel2, AV71TFProceTel2_Sel, AV73TFProceTelex, AV74TFProceTelex_Sel, AV76TFProPers, AV77TFProPers_Sel, AV79TFProEmail, AV80TFProEmail_Sel, AV49TFProceNif, AV50TFProceNif_Sel, AV96TFPoceCp2, AV97TFPoceCp2_Sel, AV100Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV105Tprocedwwds_1_filterfulltext = AV94FilterFullText ;
      AV106Tprocedwwds_2_tfprocenom = AV89TFProceNom ;
      AV107Tprocedwwds_3_tfprocenom_sel = AV90TFProceNom_Sel ;
      AV108Tprocedwwds_4_tfprocecod = AV46TFProceCod ;
      AV109Tprocedwwds_5_tfprocecod_to = AV47TFProceCod_To ;
      AV110Tprocedwwds_6_tfprocedom = AV52TFProceDom ;
      AV111Tprocedwwds_7_tfprocedom_sel = AV53TFProceDom_Sel ;
      AV112Tprocedwwds_8_tfprocepob = AV55TFProcePob ;
      AV113Tprocedwwds_9_tfprocepob_sel = AV56TFProcePob_Sel ;
      AV114Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV115Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV116Tprocedwwds_12_tfprvdsc = AV61TFPrvDsc ;
      AV117Tprocedwwds_13_tfprvdsc_sel = AV62TFPrvDsc_Sel ;
      AV118Tprocedwwds_14_tfpocecp = AV64TFPoceCp ;
      AV119Tprocedwwds_15_tfpocecp_sel = AV65TFPoceCp_Sel ;
      AV120Tprocedwwds_16_tfprocetel1 = AV67TFProceTel1 ;
      AV121Tprocedwwds_17_tfprocetel1_sel = AV68TFProceTel1_Sel ;
      AV122Tprocedwwds_18_tfprocetel2 = AV70TFProceTel2 ;
      AV123Tprocedwwds_19_tfprocetel2_sel = AV71TFProceTel2_Sel ;
      AV124Tprocedwwds_20_tfprocetelex = AV73TFProceTelex ;
      AV125Tprocedwwds_21_tfprocetelex_sel = AV74TFProceTelex_Sel ;
      AV126Tprocedwwds_22_tfpropers = AV76TFProPers ;
      AV127Tprocedwwds_23_tfpropers_sel = AV77TFProPers_Sel ;
      AV128Tprocedwwds_24_tfproemail = AV79TFProEmail ;
      AV129Tprocedwwds_25_tfproemail_sel = AV80TFProEmail_Sel ;
      AV130Tprocedwwds_26_tfprocenif = AV49TFProceNif ;
      AV131Tprocedwwds_27_tfprocenif_sel = AV50TFProceNif_Sel ;
      AV132Tprocedwwds_28_tfpocecp2 = AV96TFPoceCp2 ;
      AV133Tprocedwwds_29_tfpocecp2_sel = AV97TFPoceCp2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV94FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89TFProceNom, AV90TFProceNom_Sel, AV46TFProceCod, AV47TFProceCod_To, AV52TFProceDom, AV53TFProceDom_Sel, AV55TFProcePob, AV56TFProcePob_Sel, AV58TFPrvCod, AV59TFPrvCod_To, AV61TFPrvDsc, AV62TFPrvDsc_Sel, AV64TFPoceCp, AV65TFPoceCp_Sel, AV67TFProceTel1, AV68TFProceTel1_Sel, AV70TFProceTel2, AV71TFProceTel2_Sel, AV73TFProceTelex, AV74TFProceTelex_Sel, AV76TFProPers, AV77TFProPers_Sel, AV79TFProEmail, AV80TFProEmail_Sel, AV49TFProceNif, AV50TFProceNif_Sel, AV96TFPoceCp2, AV97TFPoceCp2_Sel, AV100Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV105Tprocedwwds_1_filterfulltext = AV94FilterFullText ;
      AV106Tprocedwwds_2_tfprocenom = AV89TFProceNom ;
      AV107Tprocedwwds_3_tfprocenom_sel = AV90TFProceNom_Sel ;
      AV108Tprocedwwds_4_tfprocecod = AV46TFProceCod ;
      AV109Tprocedwwds_5_tfprocecod_to = AV47TFProceCod_To ;
      AV110Tprocedwwds_6_tfprocedom = AV52TFProceDom ;
      AV111Tprocedwwds_7_tfprocedom_sel = AV53TFProceDom_Sel ;
      AV112Tprocedwwds_8_tfprocepob = AV55TFProcePob ;
      AV113Tprocedwwds_9_tfprocepob_sel = AV56TFProcePob_Sel ;
      AV114Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV115Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV116Tprocedwwds_12_tfprvdsc = AV61TFPrvDsc ;
      AV117Tprocedwwds_13_tfprvdsc_sel = AV62TFPrvDsc_Sel ;
      AV118Tprocedwwds_14_tfpocecp = AV64TFPoceCp ;
      AV119Tprocedwwds_15_tfpocecp_sel = AV65TFPoceCp_Sel ;
      AV120Tprocedwwds_16_tfprocetel1 = AV67TFProceTel1 ;
      AV121Tprocedwwds_17_tfprocetel1_sel = AV68TFProceTel1_Sel ;
      AV122Tprocedwwds_18_tfprocetel2 = AV70TFProceTel2 ;
      AV123Tprocedwwds_19_tfprocetel2_sel = AV71TFProceTel2_Sel ;
      AV124Tprocedwwds_20_tfprocetelex = AV73TFProceTelex ;
      AV125Tprocedwwds_21_tfprocetelex_sel = AV74TFProceTelex_Sel ;
      AV126Tprocedwwds_22_tfpropers = AV76TFProPers ;
      AV127Tprocedwwds_23_tfpropers_sel = AV77TFProPers_Sel ;
      AV128Tprocedwwds_24_tfproemail = AV79TFProEmail ;
      AV129Tprocedwwds_25_tfproemail_sel = AV80TFProEmail_Sel ;
      AV130Tprocedwwds_26_tfprocenif = AV49TFProceNif ;
      AV131Tprocedwwds_27_tfprocenif_sel = AV50TFProceNif_Sel ;
      AV132Tprocedwwds_28_tfpocecp2 = AV96TFPoceCp2 ;
      AV133Tprocedwwds_29_tfpocecp2_sel = AV97TFPoceCp2_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV94FilterFullText, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89TFProceNom, AV90TFProceNom_Sel, AV46TFProceCod, AV47TFProceCod_To, AV52TFProceDom, AV53TFProceDom_Sel, AV55TFProcePob, AV56TFProcePob_Sel, AV58TFPrvCod, AV59TFPrvCod_To, AV61TFPrvDsc, AV62TFPrvDsc_Sel, AV64TFPoceCp, AV65TFPoceCp_Sel, AV67TFProceTel1, AV68TFProceTel1_Sel, AV70TFProceTel2, AV71TFProceTel2_Sel, AV73TFProceTelex, AV74TFProceTelex_Sel, AV76TFProPers, AV77TFProPers_Sel, AV79TFProEmail, AV80TFProEmail_Sel, AV49TFProceNif, AV50TFProceNif_Sel, AV96TFPoceCp2, AV97TFPoceCp2_Sel, AV100Pgmname, AV13OrderedBy, AV14OrderedDsc, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV100Pgmname = "TPROCEDWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupAE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e20AE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV82DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV36ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV84GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV85GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV94FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94FilterFullText", AV94FilterFullText);
         AV100Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TPROCEDWW");
         AV100Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100Pgmname", AV100Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV100Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("tprocedww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV94FilterFullText) != 0 )
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
      e20AE2 ();
      if (returnInSub) return;
   }

   public void e20AE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV101Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tprocedww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV101Station = GXt_char1 ;
      GXv_char2[0] = AV102Emprcod ;
      GXv_char3[0] = AV103Emprnom ;
      GXv_char4[0] = AV104Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV101Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprocedww_impl.this.AV102Emprcod = GXv_char2[0] ;
      tprocedww_impl.this.AV103Emprnom = GXv_char3[0] ;
      tprocedww_impl.this.AV104Usurcod = GXv_char4[0] ;
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
      Form.setCaption( httpContext.getMessage( " PROCEDENCIAS", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV82DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV82DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e21AE2( )
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
      if ( GXutil.strcmp(AV38Session.getValue("TPROCEDWWColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV38Session.getValue("TPROCEDWWColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtProceNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceDom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceDom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceDom_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProcePob_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProcePob_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProcePob_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvCod_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPrvDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvDsc_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPoceCp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPoceCp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPoceCp_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceTel1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceTel1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTel1_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceTel2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceTel2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTel2_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceTelex_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceTelex_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceTelex_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProPers_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProPers_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProPers_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProEmail_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProEmail_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProEmail_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtProceNif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNif_Visible), 5, 0), !bGXsfl_45_Refreshing);
      edtPoceCp2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPoceCp2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPoceCp2_Visible), 5, 0), !bGXsfl_45_Refreshing);
      AV84GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84GridCurrentPage), 10, 0));
      AV85GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridPageCount), 10, 0));
      AV105Tprocedwwds_1_filterfulltext = AV94FilterFullText ;
      AV106Tprocedwwds_2_tfprocenom = AV89TFProceNom ;
      AV107Tprocedwwds_3_tfprocenom_sel = AV90TFProceNom_Sel ;
      AV108Tprocedwwds_4_tfprocecod = AV46TFProceCod ;
      AV109Tprocedwwds_5_tfprocecod_to = AV47TFProceCod_To ;
      AV110Tprocedwwds_6_tfprocedom = AV52TFProceDom ;
      AV111Tprocedwwds_7_tfprocedom_sel = AV53TFProceDom_Sel ;
      AV112Tprocedwwds_8_tfprocepob = AV55TFProcePob ;
      AV113Tprocedwwds_9_tfprocepob_sel = AV56TFProcePob_Sel ;
      AV114Tprocedwwds_10_tfprvcod = AV58TFPrvCod ;
      AV115Tprocedwwds_11_tfprvcod_to = AV59TFPrvCod_To ;
      AV116Tprocedwwds_12_tfprvdsc = AV61TFPrvDsc ;
      AV117Tprocedwwds_13_tfprvdsc_sel = AV62TFPrvDsc_Sel ;
      AV118Tprocedwwds_14_tfpocecp = AV64TFPoceCp ;
      AV119Tprocedwwds_15_tfpocecp_sel = AV65TFPoceCp_Sel ;
      AV120Tprocedwwds_16_tfprocetel1 = AV67TFProceTel1 ;
      AV121Tprocedwwds_17_tfprocetel1_sel = AV68TFProceTel1_Sel ;
      AV122Tprocedwwds_18_tfprocetel2 = AV70TFProceTel2 ;
      AV123Tprocedwwds_19_tfprocetel2_sel = AV71TFProceTel2_Sel ;
      AV124Tprocedwwds_20_tfprocetelex = AV73TFProceTelex ;
      AV125Tprocedwwds_21_tfprocetelex_sel = AV74TFProceTelex_Sel ;
      AV126Tprocedwwds_22_tfpropers = AV76TFProPers ;
      AV127Tprocedwwds_23_tfpropers_sel = AV77TFProPers_Sel ;
      AV128Tprocedwwds_24_tfproemail = AV79TFProEmail ;
      AV129Tprocedwwds_25_tfproemail_sel = AV80TFProEmail_Sel ;
      AV130Tprocedwwds_26_tfprocenif = AV49TFProceNif ;
      AV131Tprocedwwds_27_tfprocenif_sel = AV50TFProceNif_Sel ;
      AV132Tprocedwwds_28_tfpocecp2 = AV96TFPoceCp2 ;
      AV133Tprocedwwds_29_tfpocecp2_sel = AV97TFPoceCp2_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12AE2( )
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
         AV83PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV83PageToGo) ;
      }
   }

   public void e13AE2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14AE2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceNom") == 0 )
         {
            AV89TFProceNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFProceNom", AV89TFProceNom);
            AV90TFProceNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFProceNom_Sel", AV90TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceCod") == 0 )
         {
            AV46TFProceCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFProceCod), 4, 0));
            AV47TFProceCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFProceCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceDom") == 0 )
         {
            AV52TFProceDom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFProceDom", AV52TFProceDom);
            AV53TFProceDom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFProceDom_Sel", AV53TFProceDom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProcePob") == 0 )
         {
            AV55TFProcePob = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFProcePob", AV55TFProcePob);
            AV56TFProcePob_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFProcePob_Sel", AV56TFProcePob_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvCod") == 0 )
         {
            AV58TFPrvCod = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFPrvCod), 3, 0));
            AV59TFPrvCod_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFPrvCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvDsc") == 0 )
         {
            AV61TFPrvDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrvDsc", AV61TFPrvDsc);
            AV62TFPrvDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrvDsc_Sel", AV62TFPrvDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PoceCp") == 0 )
         {
            AV64TFPoceCp = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPoceCp", AV64TFPoceCp);
            AV65TFPoceCp_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPoceCp_Sel", AV65TFPoceCp_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceTel1") == 0 )
         {
            AV67TFProceTel1 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFProceTel1", AV67TFProceTel1);
            AV68TFProceTel1_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFProceTel1_Sel", AV68TFProceTel1_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceTel2") == 0 )
         {
            AV70TFProceTel2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFProceTel2", AV70TFProceTel2);
            AV71TFProceTel2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFProceTel2_Sel", AV71TFProceTel2_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceTelex") == 0 )
         {
            AV73TFProceTelex = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFProceTelex", AV73TFProceTelex);
            AV74TFProceTelex_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFProceTelex_Sel", AV74TFProceTelex_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProPers") == 0 )
         {
            AV76TFProPers = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFProPers", AV76TFProPers);
            AV77TFProPers_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFProPers_Sel", AV77TFProPers_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProEmail") == 0 )
         {
            AV79TFProEmail = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFProEmail", AV79TFProEmail);
            AV80TFProEmail_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFProEmail_Sel", AV80TFProEmail_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProceNif") == 0 )
         {
            AV49TFProceNif = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFProceNif", AV49TFProceNif);
            AV50TFProceNif_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFProceNif_Sel", AV50TFProceNif_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PoceCp2") == 0 )
         {
            AV96TFPoceCp2 = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFPoceCp2", AV96TFPoceCp2);
            AV97TFPoceCp2_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFPoceCp2_Sel", AV97TFPoceCp2_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e22AE2( )
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV95GridActions, 4, 0)) );
   }

   public void e15AE2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV36ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "TPROCEDWWColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV36ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11AE2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("TPROCEDWWFilters")),GXutil.URLEncode(GXutil.rtrim(AV100Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("TPROCEDWWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV40ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "TPROCEDWWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         tprocedww_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV100Pgmname+"GridState", AV40ManageFiltersXml) ;
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

   public void e16AE2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tproced", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","ProceCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e17AE2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.tprocedwwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      tprocedww_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      tprocedww_impl.this.AV33ErrorMessage = GXv_char3[0] ;
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

   public void e18AE2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.tprocedwwexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19AE2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.tprocedwwexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceNom", "", "Nombre", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceCod", "", "Codigo", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceDom", "", "Domicilio", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProcePob", "", "Población", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvCod", "", "Codigo", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrvDsc", "", "Provincia", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PoceCp", "", "Código Postal", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceTel1", "", "Teléfono", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceTel2", "", "Teléfono", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceTelex", "", "Telex", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProPers", "", "Persona Contacto", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProEmail", "", "Email", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "ProceNif", "", "Nif", false, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PoceCp2", "", "Postal (PT)", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV35UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPROCEDWWColumnsSelector", GXv_char4) ;
      tprocedww_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "TPROCEDWWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV94FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94FilterFullText", AV94FilterFullText);
      AV89TFProceNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89TFProceNom", AV89TFProceNom);
      AV90TFProceNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFProceNom_Sel", AV90TFProceNom_Sel);
      AV46TFProceCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFProceCod), 4, 0));
      AV47TFProceCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFProceCod_To), 4, 0));
      AV52TFProceDom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFProceDom", AV52TFProceDom);
      AV53TFProceDom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFProceDom_Sel", AV53TFProceDom_Sel);
      AV55TFProcePob = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFProcePob", AV55TFProcePob);
      AV56TFProcePob_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFProcePob_Sel", AV56TFProcePob_Sel);
      AV58TFPrvCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFPrvCod), 3, 0));
      AV59TFPrvCod_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFPrvCod_To), 3, 0));
      AV61TFPrvDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrvDsc", AV61TFPrvDsc);
      AV62TFPrvDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrvDsc_Sel", AV62TFPrvDsc_Sel);
      AV64TFPoceCp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TFPoceCp", AV64TFPoceCp);
      AV65TFPoceCp_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFPoceCp_Sel", AV65TFPoceCp_Sel);
      AV67TFProceTel1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFProceTel1", AV67TFProceTel1);
      AV68TFProceTel1_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFProceTel1_Sel", AV68TFProceTel1_Sel);
      AV70TFProceTel2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70TFProceTel2", AV70TFProceTel2);
      AV71TFProceTel2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71TFProceTel2_Sel", AV71TFProceTel2_Sel);
      AV73TFProceTelex = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TFProceTelex", AV73TFProceTelex);
      AV74TFProceTelex_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TFProceTelex_Sel", AV74TFProceTelex_Sel);
      AV76TFProPers = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TFProPers", AV76TFProPers);
      AV77TFProPers_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TFProPers_Sel", AV77TFProPers_Sel);
      AV79TFProEmail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TFProEmail", AV79TFProEmail);
      AV80TFProEmail_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TFProEmail_Sel", AV80TFProEmail_Sel);
      AV49TFProceNif = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFProceNif", AV49TFProceNif);
      AV50TFProceNif_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFProceNif_Sel", AV50TFProceNif_Sel);
      AV96TFPoceCp2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96TFPoceCp2", AV96TFPoceCp2);
      AV97TFPoceCp2_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97TFPoceCp2_Sel", AV97TFPoceCp2_Sel);
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
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.tproced", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A970ProceCod,4,0))}, new String[] {"Mode","EmprCod","ProceCod"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      callWebObject(formatLink("app.tproced", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A970ProceCod,4,0))}, new String[] {"Mode","EmprCod","ProceCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tproced", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A970ProceCod,4,0))}, new String[] {"Mode","EmprCod","ProceCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tproced", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A970ProceCod,4,0))}, new String[] {"Mode","EmprCod","ProceCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV100Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV100Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV38Session.getValue(AV100Pgmname+"GridState"), null, null);
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
      AV134GXV1 = 1 ;
      while ( AV134GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV134GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV94FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94FilterFullText", AV94FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV89TFProceNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFProceNom", AV89TFProceNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV90TFProceNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFProceNom_Sel", AV90TFProceNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV46TFProceCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFProceCod), 4, 0));
            AV47TFProceCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFProceCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFProceCod_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM") == 0 )
         {
            AV52TFProceDom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFProceDom", AV52TFProceDom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEDOM_SEL") == 0 )
         {
            AV53TFProceDom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFProceDom_Sel", AV53TFProceDom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB") == 0 )
         {
            AV55TFProcePob = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFProcePob", AV55TFProcePob);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCEPOB_SEL") == 0 )
         {
            AV56TFProcePob_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFProcePob_Sel", AV56TFProcePob_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCOD") == 0 )
         {
            AV58TFPrvCod = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFPrvCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFPrvCod), 3, 0));
            AV59TFPrvCod_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFPrvCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFPrvCod_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC") == 0 )
         {
            AV61TFPrvDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFPrvDsc", AV61TFPrvDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDSC_SEL") == 0 )
         {
            AV62TFPrvDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFPrvDsc_Sel", AV62TFPrvDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP") == 0 )
         {
            AV64TFPoceCp = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFPoceCp", AV64TFPoceCp);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP_SEL") == 0 )
         {
            AV65TFPoceCp_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPoceCp_Sel", AV65TFPoceCp_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1") == 0 )
         {
            AV67TFProceTel1 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFProceTel1", AV67TFProceTel1);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL1_SEL") == 0 )
         {
            AV68TFProceTel1_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFProceTel1_Sel", AV68TFProceTel1_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2") == 0 )
         {
            AV70TFProceTel2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFProceTel2", AV70TFProceTel2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETEL2_SEL") == 0 )
         {
            AV71TFProceTel2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFProceTel2_Sel", AV71TFProceTel2_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX") == 0 )
         {
            AV73TFProceTelex = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFProceTelex", AV73TFProceTelex);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCETELEX_SEL") == 0 )
         {
            AV74TFProceTelex_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFProceTelex_Sel", AV74TFProceTelex_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS") == 0 )
         {
            AV76TFProPers = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76TFProPers", AV76TFProPers);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROPERS_SEL") == 0 )
         {
            AV77TFProPers_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFProPers_Sel", AV77TFProPers_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL") == 0 )
         {
            AV79TFProEmail = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFProEmail", AV79TFProEmail);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROEMAIL_SEL") == 0 )
         {
            AV80TFProEmail_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFProEmail_Sel", AV80TFProEmail_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF") == 0 )
         {
            AV49TFProceNif = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFProceNif", AV49TFProceNif);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENIF_SEL") == 0 )
         {
            AV50TFProceNif_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFProceNif_Sel", AV50TFProceNif_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2") == 0 )
         {
            AV96TFPoceCp2 = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96TFPoceCp2", AV96TFPoceCp2);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPOCECP2_SEL") == 0 )
         {
            AV97TFPoceCp2_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97TFPoceCp2_Sel", AV97TFPoceCp2_Sel);
         }
         AV134GXV1 = (int)(AV134GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFProceNom_Sel)==0), AV90TFProceNom_Sel, GXv_char4) ;
      tprocedww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFProceDom_Sel)==0), AV53TFProceDom_Sel, GXv_char3) ;
      tprocedww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFProcePob_Sel)==0), AV56TFProcePob_Sel, GXv_char2) ;
      tprocedww_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFPrvDsc_Sel)==0), AV62TFPrvDsc_Sel, GXv_char15) ;
      tprocedww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFPoceCp_Sel)==0), AV65TFPoceCp_Sel, GXv_char17) ;
      tprocedww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFProceTel1_Sel)==0), AV68TFProceTel1_Sel, GXv_char19) ;
      tprocedww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFProceTel2_Sel)==0), AV71TFProceTel2_Sel, GXv_char21) ;
      tprocedww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV74TFProceTelex_Sel)==0), AV74TFProceTelex_Sel, GXv_char23) ;
      tprocedww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV77TFProPers_Sel)==0), AV77TFProPers_Sel, GXv_char25) ;
      tprocedww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFProEmail_Sel)==0), AV80TFProEmail_Sel, GXv_char27) ;
      tprocedww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFProceNif_Sel)==0), AV50TFProceNif_Sel, GXv_char29) ;
      tprocedww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV97TFPoceCp2_Sel)==0), AV97TFPoceCp2_Sel, GXv_char31) ;
      tprocedww_impl.this.GXt_char30 = GXv_char31[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"||"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"|"+GXt_char22+"|"+GXt_char24+"|"+GXt_char26+"|"+GXt_char28+"|"+GXt_char30 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char31[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFProceNom)==0), AV89TFProceNom, GXv_char31) ;
      tprocedww_impl.this.GXt_char30 = GXv_char31[0] ;
      GXt_char28 = "" ;
      GXv_char29[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFProceDom)==0), AV52TFProceDom, GXv_char29) ;
      tprocedww_impl.this.GXt_char28 = GXv_char29[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFProcePob)==0), AV55TFProcePob, GXv_char27) ;
      tprocedww_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFPrvDsc)==0), AV61TFPrvDsc, GXv_char25) ;
      tprocedww_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFPoceCp)==0), AV64TFPoceCp, GXv_char23) ;
      tprocedww_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFProceTel1)==0), AV67TFProceTel1, GXv_char21) ;
      tprocedww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFProceTel2)==0), AV70TFProceTel2, GXv_char19) ;
      tprocedww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV73TFProceTelex)==0), AV73TFProceTelex, GXv_char17) ;
      tprocedww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFProPers)==0), AV76TFProPers, GXv_char15) ;
      tprocedww_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFProEmail)==0), AV79TFProEmail, GXv_char4) ;
      tprocedww_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFProceNif)==0), AV49TFProceNif, GXv_char3) ;
      tprocedww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV96TFPoceCp2)==0), AV96TFPoceCp2, GXv_char2) ;
      tprocedww_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char30+"|"+((0==AV46TFProceCod) ? "" : GXutil.str( AV46TFProceCod, 4, 0))+"|"+GXt_char28+"|"+GXt_char26+"|"+((0==AV58TFPrvCod) ? "" : GXutil.str( AV58TFPrvCod, 3, 0))+"|"+GXt_char24+"|"+GXt_char22+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV47TFProceCod_To) ? "" : GXutil.str( AV47TFProceCod_To, 4, 0))+"|||"+((0==AV59TFPrvCod_To) ? "" : GXutil.str( AV59TFPrvCod_To, 3, 0))+"|||||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV38Session.getValue(AV100Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV94FilterFullText)==0), (short)(0), AV94FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCENOM", "", !(GXutil.strcmp("", AV89TFProceNom)==0), (short)(0), AV89TFProceNom, "", !(GXutil.strcmp("", AV90TFProceNom_Sel)==0), AV90TFProceNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCECOD", "", !((0==AV46TFProceCod)&&(0==AV47TFProceCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFProceCod, 4, 0)), GXutil.trim( GXutil.str( AV47TFProceCod_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCEDOM", "", !(GXutil.strcmp("", AV52TFProceDom)==0), (short)(0), AV52TFProceDom, "", !(GXutil.strcmp("", AV53TFProceDom_Sel)==0), AV53TFProceDom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCEPOB", "", !(GXutil.strcmp("", AV55TFProcePob)==0), (short)(0), AV55TFProcePob, "", !(GXutil.strcmp("", AV56TFProcePob_Sel)==0), AV56TFProcePob_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPRVCOD", "", !((0==AV58TFPrvCod)&&(0==AV59TFPrvCod_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFPrvCod, 3, 0)), GXutil.trim( GXutil.str( AV59TFPrvCod_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPRVDSC", "", !(GXutil.strcmp("", AV61TFPrvDsc)==0), (short)(0), AV61TFPrvDsc, "", !(GXutil.strcmp("", AV62TFPrvDsc_Sel)==0), AV62TFPrvDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPOCECP", "", !(GXutil.strcmp("", AV64TFPoceCp)==0), (short)(0), AV64TFPoceCp, "", !(GXutil.strcmp("", AV65TFPoceCp_Sel)==0), AV65TFPoceCp_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCETEL1", "", !(GXutil.strcmp("", AV67TFProceTel1)==0), (short)(0), AV67TFProceTel1, "", !(GXutil.strcmp("", AV68TFProceTel1_Sel)==0), AV68TFProceTel1_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCETEL2", "", !(GXutil.strcmp("", AV70TFProceTel2)==0), (short)(0), AV70TFProceTel2, "", !(GXutil.strcmp("", AV71TFProceTel2_Sel)==0), AV71TFProceTel2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCETELEX", "", !(GXutil.strcmp("", AV73TFProceTelex)==0), (short)(0), AV73TFProceTelex, "", !(GXutil.strcmp("", AV74TFProceTelex_Sel)==0), AV74TFProceTelex_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROPERS", "", !(GXutil.strcmp("", AV76TFProPers)==0), (short)(0), AV76TFProPers, "", !(GXutil.strcmp("", AV77TFProPers_Sel)==0), AV77TFProPers_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROEMAIL", "", !(GXutil.strcmp("", AV79TFProEmail)==0), (short)(0), AV79TFProEmail, "", !(GXutil.strcmp("", AV80TFProEmail_Sel)==0), AV80TFProEmail_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPROCENIF", "", !(GXutil.strcmp("", AV49TFProceNif)==0), (short)(0), AV49TFProceNif, "", !(GXutil.strcmp("", AV50TFProceNif_Sel)==0), AV50TFProceNif_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPOCECP2", "", !(GXutil.strcmp("", AV96TFPoceCp2)==0), (short)(0), AV96TFPoceCp2, "", !(GXutil.strcmp("", AV97TFPoceCp2_Sel)==0), AV97TFPoceCp2_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState32[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV100Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV100Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TPROCED" );
      AV38Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_AE2( boolean wbgen )
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
         wb_table2_32_AE2( true) ;
      }
      else
      {
         wb_table2_32_AE2( false) ;
      }
      return  ;
   }

   public void wb_table2_32_AE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_AE2e( true) ;
      }
      else
      {
         wb_table1_27_AE2e( false) ;
      }
   }

   public void wb_table2_32_AE2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV94FilterFullText, GXutil.rtrim( localUtil.format( AV94FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_TPROCEDWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_32_AE2e( true) ;
      }
      else
      {
         wb_table2_32_AE2e( false) ;
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
      paAE2( ) ;
      wsAE2( ) ;
      weAE2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116113611", true, true);
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
      httpContext.AddJavascriptSource("tprocedww.js", "?202682116113612", false, true);
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
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_45_idx ;
      edtProceCod_Internalname = "PROCECOD_"+sGXsfl_45_idx ;
      edtProceDom_Internalname = "PROCEDOM_"+sGXsfl_45_idx ;
      edtProcePob_Internalname = "PROCEPOB_"+sGXsfl_45_idx ;
      edtPrvCod_Internalname = "PRVCOD_"+sGXsfl_45_idx ;
      edtPrvDsc_Internalname = "PRVDSC_"+sGXsfl_45_idx ;
      edtPoceCp_Internalname = "POCECP_"+sGXsfl_45_idx ;
      edtProceTel1_Internalname = "PROCETEL1_"+sGXsfl_45_idx ;
      edtProceTel2_Internalname = "PROCETEL2_"+sGXsfl_45_idx ;
      edtProceTelex_Internalname = "PROCETELEX_"+sGXsfl_45_idx ;
      edtProPers_Internalname = "PROPERS_"+sGXsfl_45_idx ;
      edtProEmail_Internalname = "PROEMAIL_"+sGXsfl_45_idx ;
      edtProceNif_Internalname = "PROCENIF_"+sGXsfl_45_idx ;
      edtProceNomID_Internalname = "PROCENOMID_"+sGXsfl_45_idx ;
      edtPoceCp2_Internalname = "POCECP2_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_452( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_45_fel_idx );
      edtProceNom_Internalname = "PROCENOM_"+sGXsfl_45_fel_idx ;
      edtProceCod_Internalname = "PROCECOD_"+sGXsfl_45_fel_idx ;
      edtProceDom_Internalname = "PROCEDOM_"+sGXsfl_45_fel_idx ;
      edtProcePob_Internalname = "PROCEPOB_"+sGXsfl_45_fel_idx ;
      edtPrvCod_Internalname = "PRVCOD_"+sGXsfl_45_fel_idx ;
      edtPrvDsc_Internalname = "PRVDSC_"+sGXsfl_45_fel_idx ;
      edtPoceCp_Internalname = "POCECP_"+sGXsfl_45_fel_idx ;
      edtProceTel1_Internalname = "PROCETEL1_"+sGXsfl_45_fel_idx ;
      edtProceTel2_Internalname = "PROCETEL2_"+sGXsfl_45_fel_idx ;
      edtProceTelex_Internalname = "PROCETELEX_"+sGXsfl_45_fel_idx ;
      edtProPers_Internalname = "PROPERS_"+sGXsfl_45_fel_idx ;
      edtProEmail_Internalname = "PROEMAIL_"+sGXsfl_45_fel_idx ;
      edtProceNif_Internalname = "PROCENIF_"+sGXsfl_45_fel_idx ;
      edtProceNomID_Internalname = "PROCENOMID_"+sGXsfl_45_fel_idx ;
      edtPoceCp2_Internalname = "POCECP2_"+sGXsfl_45_fel_idx ;
   }

   public void sendrow_452( )
   {
      subsflControlProps_452( ) ;
      wbAE0( ) ;
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
               AV95GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV95GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV95GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e23ae2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,46);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV95GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_45_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNom_Internalname,GXutil.rtrim( A971ProceNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtProceNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceDom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceDom_Internalname,GXutil.rtrim( A994ProceDom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceDom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProcePob_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProcePob_Internalname,GXutil.rtrim( A988ProcePob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProcePob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProcePob_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvCod_Internalname,GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A781PrvCod), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvDsc_Internalname,GXutil.rtrim( A787PrvDsc),GXutil.rtrim( localUtil.format( A787PrvDsc, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrvDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPoceCp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPoceCp_Internalname,GXutil.rtrim( A989PoceCp),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPoceCp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPoceCp_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceTel1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceTel1_Internalname,GXutil.rtrim( A990ProceTel1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceTel1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceTel1_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceTel2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceTel2_Internalname,GXutil.rtrim( A991ProceTel2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceTel2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceTel2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceTelex_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceTelex_Internalname,GXutil.rtrim( A992ProceTelex),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceTelex_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceTelex_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProPers_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProPers_Internalname,GXutil.rtrim( A10390ProPers),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProPers_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProPers_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProEmail_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProEmail_Internalname,GXutil.rtrim( A10391ProEmail),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProEmail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProEmail_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtProceNif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNif_Internalname,GXutil.rtrim( A993ProceNif),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtProceNif_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProceNomID_Internalname,A13820ProceNomID,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProceNomID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPoceCp2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPoceCp2_Internalname,GXutil.rtrim( A14029PoceCp2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPoceCp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPoceCp2_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesAE2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceDom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProcePob_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Población", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Provincia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPoceCp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Postal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceTel1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teléfono", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceTel2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teléfono", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceTelex_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Telex", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProPers_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Persona Contacto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProEmail_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Email", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtProceNif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPoceCp2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Postal (PT)", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV95GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A971ProceNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A994ProceDom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceDom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A988ProcePob));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProcePob_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A781PrvCod, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A787PrvDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A989PoceCp));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPoceCp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A990ProceTel1));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceTel1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A991ProceTel2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceTel2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A992ProceTelex));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceTelex_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10390ProPers));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProPers_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10391ProEmail));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProEmail_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A993ProceNif));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtProceNif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13820ProceNomID);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14029PoceCp2));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPoceCp2_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtProceNom_Internalname = "PROCENOM" ;
      edtProceCod_Internalname = "PROCECOD" ;
      edtProceDom_Internalname = "PROCEDOM" ;
      edtProcePob_Internalname = "PROCEPOB" ;
      edtPrvCod_Internalname = "PRVCOD" ;
      edtPrvDsc_Internalname = "PRVDSC" ;
      edtPoceCp_Internalname = "POCECP" ;
      edtProceTel1_Internalname = "PROCETEL1" ;
      edtProceTel2_Internalname = "PROCETEL2" ;
      edtProceTelex_Internalname = "PROCETELEX" ;
      edtProPers_Internalname = "PROPERS" ;
      edtProEmail_Internalname = "PROEMAIL" ;
      edtProceNif_Internalname = "PROCENIF" ;
      edtProceNomID_Internalname = "PROCENOMID" ;
      edtPoceCp2_Internalname = "POCECP2" ;
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
      edtPoceCp2_Jsonclick = "" ;
      edtProceNomID_Jsonclick = "" ;
      edtProceNif_Jsonclick = "" ;
      edtProEmail_Jsonclick = "" ;
      edtProPers_Jsonclick = "" ;
      edtProceTelex_Jsonclick = "" ;
      edtProceTel2_Jsonclick = "" ;
      edtProceTel1_Jsonclick = "" ;
      edtPoceCp_Jsonclick = "" ;
      edtPrvDsc_Jsonclick = "" ;
      edtPrvCod_Jsonclick = "" ;
      edtProcePob_Jsonclick = "" ;
      edtProceDom_Jsonclick = "" ;
      edtProceCod_Jsonclick = "" ;
      edtProceNom_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtPoceCp2_Visible = -1 ;
      edtProceNif_Visible = -1 ;
      edtProEmail_Visible = -1 ;
      edtProPers_Visible = -1 ;
      edtProceTelex_Visible = -1 ;
      edtProceTel2_Visible = -1 ;
      edtProceTel1_Visible = -1 ;
      edtPoceCp_Visible = -1 ;
      edtPrvDsc_Visible = -1 ;
      edtPrvCod_Visible = -1 ;
      edtProcePob_Visible = -1 ;
      edtProceDom_Visible = -1 ;
      edtProceCod_Visible = -1 ;
      edtProceNom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "TPROCEDWWGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T||T|T||T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "|T|||T|||||||||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Character|Character|Numeric|Character|Character|Character|Character|Character|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14" ;
      Ddo_grid_Columnids = "1:ProceNom|2:ProceCod|3:ProceDom|4:ProcePob|5:PrvCod|6:PrvDsc|7:PoceCp|8:ProceTel1|9:ProceTel2|10:ProceTelex|11:ProPers|12:ProEmail|13:ProceNif|15:PoceCp2" ;
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
      Form.setCaption( httpContext.getMessage( " PROCEDENCIAS", "") );
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
         AV95GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV95GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceDom_Visible',ctrl:'PROCEDOM',prop:'Visible'},{av:'edtProcePob_Visible',ctrl:'PROCEPOB',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtPoceCp_Visible',ctrl:'POCECP',prop:'Visible'},{av:'edtProceTel1_Visible',ctrl:'PROCETEL1',prop:'Visible'},{av:'edtProceTel2_Visible',ctrl:'PROCETEL2',prop:'Visible'},{av:'edtProceTelex_Visible',ctrl:'PROCETELEX',prop:'Visible'},{av:'edtProPers_Visible',ctrl:'PROPERS',prop:'Visible'},{av:'edtProEmail_Visible',ctrl:'PROEMAIL',prop:'Visible'},{av:'edtProceNif_Visible',ctrl:'PROCENIF',prop:'Visible'},{av:'edtPoceCp2_Visible',ctrl:'POCECP2',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12AE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13AE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14AE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e22AE2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV95GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15AE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceDom_Visible',ctrl:'PROCEDOM',prop:'Visible'},{av:'edtProcePob_Visible',ctrl:'PROCEPOB',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtPoceCp_Visible',ctrl:'POCECP',prop:'Visible'},{av:'edtProceTel1_Visible',ctrl:'PROCETEL1',prop:'Visible'},{av:'edtProceTel2_Visible',ctrl:'PROCETEL2',prop:'Visible'},{av:'edtProceTelex_Visible',ctrl:'PROCETELEX',prop:'Visible'},{av:'edtProPers_Visible',ctrl:'PROPERS',prop:'Visible'},{av:'edtProEmail_Visible',ctrl:'PROEMAIL',prop:'Visible'},{av:'edtProceNif_Visible',ctrl:'PROCENIF',prop:'Visible'},{av:'edtPoceCp2_Visible',ctrl:'POCECP2',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11AE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtProceNom_Visible',ctrl:'PROCENOM',prop:'Visible'},{av:'edtProceCod_Visible',ctrl:'PROCECOD',prop:'Visible'},{av:'edtProceDom_Visible',ctrl:'PROCEDOM',prop:'Visible'},{av:'edtProcePob_Visible',ctrl:'PROCEPOB',prop:'Visible'},{av:'edtPrvCod_Visible',ctrl:'PRVCOD',prop:'Visible'},{av:'edtPrvDsc_Visible',ctrl:'PRVDSC',prop:'Visible'},{av:'edtPoceCp_Visible',ctrl:'POCECP',prop:'Visible'},{av:'edtProceTel1_Visible',ctrl:'PROCETEL1',prop:'Visible'},{av:'edtProceTel2_Visible',ctrl:'PROCETEL2',prop:'Visible'},{av:'edtProceTelex_Visible',ctrl:'PROCETELEX',prop:'Visible'},{av:'edtProPers_Visible',ctrl:'PROPERS',prop:'Visible'},{av:'edtProEmail_Visible',ctrl:'PROEMAIL',prop:'Visible'},{av:'edtProceNif_Visible',ctrl:'PROCENIF',prop:'Visible'},{av:'edtPoceCp2_Visible',ctrl:'POCECP2',prop:'Visible'},{av:'AV84GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV85GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e23AE2',iparms:[{av:'cmbavGridactions'},{av:'AV95GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV95GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e16AE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17AE2',iparms:[{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e18AE2',iparms:[{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e19AE2',iparms:[{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV94FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89TFProceNom',fld:'vTFPROCENOM',pic:''},{av:'AV90TFProceNom_Sel',fld:'vTFPROCENOM_SEL',pic:''},{av:'AV46TFProceCod',fld:'vTFPROCECOD',pic:'ZZZ9'},{av:'AV47TFProceCod_To',fld:'vTFPROCECOD_TO',pic:'ZZZ9'},{av:'AV52TFProceDom',fld:'vTFPROCEDOM',pic:''},{av:'AV53TFProceDom_Sel',fld:'vTFPROCEDOM_SEL',pic:''},{av:'AV55TFProcePob',fld:'vTFPROCEPOB',pic:''},{av:'AV56TFProcePob_Sel',fld:'vTFPROCEPOB_SEL',pic:''},{av:'AV58TFPrvCod',fld:'vTFPRVCOD',pic:'ZZ9'},{av:'AV59TFPrvCod_To',fld:'vTFPRVCOD_TO',pic:'ZZ9'},{av:'AV61TFPrvDsc',fld:'vTFPRVDSC',pic:'@!'},{av:'AV62TFPrvDsc_Sel',fld:'vTFPRVDSC_SEL',pic:'@!'},{av:'AV64TFPoceCp',fld:'vTFPOCECP',pic:''},{av:'AV65TFPoceCp_Sel',fld:'vTFPOCECP_SEL',pic:''},{av:'AV67TFProceTel1',fld:'vTFPROCETEL1',pic:''},{av:'AV68TFProceTel1_Sel',fld:'vTFPROCETEL1_SEL',pic:''},{av:'AV70TFProceTel2',fld:'vTFPROCETEL2',pic:''},{av:'AV71TFProceTel2_Sel',fld:'vTFPROCETEL2_SEL',pic:''},{av:'AV73TFProceTelex',fld:'vTFPROCETELEX',pic:''},{av:'AV74TFProceTelex_Sel',fld:'vTFPROCETELEX_SEL',pic:''},{av:'AV76TFProPers',fld:'vTFPROPERS',pic:''},{av:'AV77TFProPers_Sel',fld:'vTFPROPERS_SEL',pic:''},{av:'AV79TFProEmail',fld:'vTFPROEMAIL',pic:''},{av:'AV80TFProEmail_Sel',fld:'vTFPROEMAIL_SEL',pic:''},{av:'AV49TFProceNif',fld:'vTFPROCENIF',pic:''},{av:'AV50TFProceNif_Sel',fld:'vTFPROCENIF_SEL',pic:''},{av:'AV96TFPoceCp2',fld:'vTFPOCECP2',pic:''},{av:'AV97TFPoceCp2_Sel',fld:'vTFPOCECP2_SEL',pic:''},{av:'AV100Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_PROCENOM","{handler:'valid_Procenom',iparms:[]");
      setEventMetadata("VALID_PROCENOM",",oparms:[]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[]");
      setEventMetadata("VALID_PROCECOD",",oparms:[]}");
      setEventMetadata("VALID_PRVCOD","{handler:'valid_Prvcod',iparms:[]");
      setEventMetadata("VALID_PRVCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pocecp2',iparms:[]");
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
      AV94FilterFullText = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV89TFProceNom = "" ;
      AV90TFProceNom_Sel = "" ;
      AV52TFProceDom = "" ;
      AV53TFProceDom_Sel = "" ;
      AV55TFProcePob = "" ;
      AV56TFProcePob_Sel = "" ;
      AV61TFPrvDsc = "" ;
      AV62TFPrvDsc_Sel = "" ;
      AV64TFPoceCp = "" ;
      AV65TFPoceCp_Sel = "" ;
      AV67TFProceTel1 = "" ;
      AV68TFProceTel1_Sel = "" ;
      AV70TFProceTel2 = "" ;
      AV71TFProceTel2_Sel = "" ;
      AV73TFProceTelex = "" ;
      AV74TFProceTelex_Sel = "" ;
      AV76TFProPers = "" ;
      AV77TFProPers_Sel = "" ;
      AV79TFProEmail = "" ;
      AV80TFProEmail_Sel = "" ;
      AV49TFProceNif = "" ;
      AV50TFProceNif_Sel = "" ;
      AV96TFPoceCp2 = "" ;
      AV97TFPoceCp2_Sel = "" ;
      AV100Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV82DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      A971ProceNom = "" ;
      A994ProceDom = "" ;
      A988ProcePob = "" ;
      A787PrvDsc = "" ;
      A989PoceCp = "" ;
      A990ProceTel1 = "" ;
      A991ProceTel2 = "" ;
      A992ProceTelex = "" ;
      A10390ProPers = "" ;
      A10391ProEmail = "" ;
      A993ProceNif = "" ;
      A13820ProceNomID = "" ;
      A14029PoceCp2 = "" ;
      scmdbuf = "" ;
      lV105Tprocedwwds_1_filterfulltext = "" ;
      lV106Tprocedwwds_2_tfprocenom = "" ;
      lV110Tprocedwwds_6_tfprocedom = "" ;
      lV112Tprocedwwds_8_tfprocepob = "" ;
      lV116Tprocedwwds_12_tfprvdsc = "" ;
      lV118Tprocedwwds_14_tfpocecp = "" ;
      lV120Tprocedwwds_16_tfprocetel1 = "" ;
      lV122Tprocedwwds_18_tfprocetel2 = "" ;
      lV124Tprocedwwds_20_tfprocetelex = "" ;
      lV126Tprocedwwds_22_tfpropers = "" ;
      lV128Tprocedwwds_24_tfproemail = "" ;
      lV130Tprocedwwds_26_tfprocenif = "" ;
      lV132Tprocedwwds_28_tfpocecp2 = "" ;
      AV105Tprocedwwds_1_filterfulltext = "" ;
      AV107Tprocedwwds_3_tfprocenom_sel = "" ;
      AV106Tprocedwwds_2_tfprocenom = "" ;
      AV111Tprocedwwds_7_tfprocedom_sel = "" ;
      AV110Tprocedwwds_6_tfprocedom = "" ;
      AV113Tprocedwwds_9_tfprocepob_sel = "" ;
      AV112Tprocedwwds_8_tfprocepob = "" ;
      AV117Tprocedwwds_13_tfprvdsc_sel = "" ;
      AV116Tprocedwwds_12_tfprvdsc = "" ;
      AV119Tprocedwwds_15_tfpocecp_sel = "" ;
      AV118Tprocedwwds_14_tfpocecp = "" ;
      AV121Tprocedwwds_17_tfprocetel1_sel = "" ;
      AV120Tprocedwwds_16_tfprocetel1 = "" ;
      AV123Tprocedwwds_19_tfprocetel2_sel = "" ;
      AV122Tprocedwwds_18_tfprocetel2 = "" ;
      AV125Tprocedwwds_21_tfprocetelex_sel = "" ;
      AV124Tprocedwwds_20_tfprocetelex = "" ;
      AV127Tprocedwwds_23_tfpropers_sel = "" ;
      AV126Tprocedwwds_22_tfpropers = "" ;
      AV129Tprocedwwds_25_tfproemail_sel = "" ;
      AV128Tprocedwwds_24_tfproemail = "" ;
      AV131Tprocedwwds_27_tfprocenif_sel = "" ;
      AV130Tprocedwwds_26_tfprocenif = "" ;
      AV133Tprocedwwds_29_tfpocecp2_sel = "" ;
      AV132Tprocedwwds_28_tfpocecp2 = "" ;
      H00AE2_A396EmprCod = new String[] {""} ;
      H00AE2_A14029PoceCp2 = new String[] {""} ;
      H00AE2_n14029PoceCp2 = new boolean[] {false} ;
      H00AE2_A993ProceNif = new String[] {""} ;
      H00AE2_n993ProceNif = new boolean[] {false} ;
      H00AE2_A10391ProEmail = new String[] {""} ;
      H00AE2_n10391ProEmail = new boolean[] {false} ;
      H00AE2_A10390ProPers = new String[] {""} ;
      H00AE2_n10390ProPers = new boolean[] {false} ;
      H00AE2_A992ProceTelex = new String[] {""} ;
      H00AE2_n992ProceTelex = new boolean[] {false} ;
      H00AE2_A991ProceTel2 = new String[] {""} ;
      H00AE2_n991ProceTel2 = new boolean[] {false} ;
      H00AE2_A990ProceTel1 = new String[] {""} ;
      H00AE2_n990ProceTel1 = new boolean[] {false} ;
      H00AE2_A989PoceCp = new String[] {""} ;
      H00AE2_n989PoceCp = new boolean[] {false} ;
      H00AE2_A787PrvDsc = new String[] {""} ;
      H00AE2_n787PrvDsc = new boolean[] {false} ;
      H00AE2_A781PrvCod = new short[1] ;
      H00AE2_n781PrvCod = new boolean[] {false} ;
      H00AE2_A988ProcePob = new String[] {""} ;
      H00AE2_n988ProcePob = new boolean[] {false} ;
      H00AE2_A994ProceDom = new String[] {""} ;
      H00AE2_n994ProceDom = new boolean[] {false} ;
      H00AE2_A971ProceNom = new String[] {""} ;
      H00AE2_n971ProceNom = new boolean[] {false} ;
      H00AE2_A970ProceCod = new short[1] ;
      H00AE3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV101Station = "" ;
      AV102Emprcod = "" ;
      AV103Emprnom = "" ;
      AV104Usurcod = "" ;
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
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprocedww__default(),
         new Object[] {
             new Object[] {
            H00AE2_A396EmprCod, H00AE2_A14029PoceCp2, H00AE2_n14029PoceCp2, H00AE2_A993ProceNif, H00AE2_n993ProceNif, H00AE2_A10391ProEmail, H00AE2_n10391ProEmail, H00AE2_A10390ProPers, H00AE2_n10390ProPers, H00AE2_A992ProceTelex,
            H00AE2_n992ProceTelex, H00AE2_A991ProceTel2, H00AE2_n991ProceTel2, H00AE2_A990ProceTel1, H00AE2_n990ProceTel1, H00AE2_A989PoceCp, H00AE2_n989PoceCp, H00AE2_A787PrvDsc, H00AE2_n787PrvDsc, H00AE2_A781PrvCod,
            H00AE2_n781PrvCod, H00AE2_A988ProcePob, H00AE2_n988ProcePob, H00AE2_A994ProceDom, H00AE2_n994ProceDom, H00AE2_A971ProceNom, H00AE2_n971ProceNom, H00AE2_A970ProceCod
            }
            , new Object[] {
            H00AE3_AGRID_nRecordCount
            }
         }
      );
      AV100Pgmname = "TPROCEDWW" ;
      /* GeneXus formulas. */
      AV100Pgmname = "TPROCEDWW" ;
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
   private short AV46TFProceCod ;
   private short AV47TFProceCod_To ;
   private short AV58TFPrvCod ;
   private short AV59TFPrvCod_To ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV95GridActions ;
   private short A970ProceCod ;
   private short A781PrvCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV108Tprocedwwds_4_tfprocecod ;
   private short AV109Tprocedwwds_5_tfprocecod_to ;
   private short AV114Tprocedwwds_10_tfprvcod ;
   private short AV115Tprocedwwds_11_tfprvcod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtProceNom_Visible ;
   private int edtProceCod_Visible ;
   private int edtProceDom_Visible ;
   private int edtProcePob_Visible ;
   private int edtPrvCod_Visible ;
   private int edtPrvDsc_Visible ;
   private int edtPoceCp_Visible ;
   private int edtProceTel1_Visible ;
   private int edtProceTel2_Visible ;
   private int edtProceTelex_Visible ;
   private int edtProPers_Visible ;
   private int edtProEmail_Visible ;
   private int edtProceNif_Visible ;
   private int edtPoceCp2_Visible ;
   private int AV83PageToGo ;
   private int AV134GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV84GridCurrentPage ;
   private long AV85GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
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
   private String AV89TFProceNom ;
   private String AV90TFProceNom_Sel ;
   private String AV52TFProceDom ;
   private String AV53TFProceDom_Sel ;
   private String AV55TFProcePob ;
   private String AV56TFProcePob_Sel ;
   private String AV61TFPrvDsc ;
   private String AV62TFPrvDsc_Sel ;
   private String AV64TFPoceCp ;
   private String AV65TFPoceCp_Sel ;
   private String AV67TFProceTel1 ;
   private String AV68TFProceTel1_Sel ;
   private String AV70TFProceTel2 ;
   private String AV71TFProceTel2_Sel ;
   private String AV73TFProceTelex ;
   private String AV74TFProceTelex_Sel ;
   private String AV76TFProPers ;
   private String AV77TFProPers_Sel ;
   private String AV79TFProEmail ;
   private String AV80TFProEmail_Sel ;
   private String AV49TFProceNif ;
   private String AV50TFProceNif_Sel ;
   private String AV96TFPoceCp2 ;
   private String AV97TFPoceCp2_Sel ;
   private String AV100Pgmname ;
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
   private String A971ProceNom ;
   private String edtProceNom_Internalname ;
   private String edtProceCod_Internalname ;
   private String A994ProceDom ;
   private String edtProceDom_Internalname ;
   private String A988ProcePob ;
   private String edtProcePob_Internalname ;
   private String edtPrvCod_Internalname ;
   private String A787PrvDsc ;
   private String edtPrvDsc_Internalname ;
   private String A989PoceCp ;
   private String edtPoceCp_Internalname ;
   private String A990ProceTel1 ;
   private String edtProceTel1_Internalname ;
   private String A991ProceTel2 ;
   private String edtProceTel2_Internalname ;
   private String A992ProceTelex ;
   private String edtProceTelex_Internalname ;
   private String A10390ProPers ;
   private String edtProPers_Internalname ;
   private String A10391ProEmail ;
   private String edtProEmail_Internalname ;
   private String A993ProceNif ;
   private String edtProceNif_Internalname ;
   private String edtProceNomID_Internalname ;
   private String A14029PoceCp2 ;
   private String edtPoceCp2_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV106Tprocedwwds_2_tfprocenom ;
   private String lV110Tprocedwwds_6_tfprocedom ;
   private String lV112Tprocedwwds_8_tfprocepob ;
   private String lV116Tprocedwwds_12_tfprvdsc ;
   private String lV118Tprocedwwds_14_tfpocecp ;
   private String lV120Tprocedwwds_16_tfprocetel1 ;
   private String lV122Tprocedwwds_18_tfprocetel2 ;
   private String lV124Tprocedwwds_20_tfprocetelex ;
   private String lV126Tprocedwwds_22_tfpropers ;
   private String lV128Tprocedwwds_24_tfproemail ;
   private String lV130Tprocedwwds_26_tfprocenif ;
   private String lV132Tprocedwwds_28_tfpocecp2 ;
   private String AV107Tprocedwwds_3_tfprocenom_sel ;
   private String AV106Tprocedwwds_2_tfprocenom ;
   private String AV111Tprocedwwds_7_tfprocedom_sel ;
   private String AV110Tprocedwwds_6_tfprocedom ;
   private String AV113Tprocedwwds_9_tfprocepob_sel ;
   private String AV112Tprocedwwds_8_tfprocepob ;
   private String AV117Tprocedwwds_13_tfprvdsc_sel ;
   private String AV116Tprocedwwds_12_tfprvdsc ;
   private String AV119Tprocedwwds_15_tfpocecp_sel ;
   private String AV118Tprocedwwds_14_tfpocecp ;
   private String AV121Tprocedwwds_17_tfprocetel1_sel ;
   private String AV120Tprocedwwds_16_tfprocetel1 ;
   private String AV123Tprocedwwds_19_tfprocetel2_sel ;
   private String AV122Tprocedwwds_18_tfprocetel2 ;
   private String AV125Tprocedwwds_21_tfprocetelex_sel ;
   private String AV124Tprocedwwds_20_tfprocetelex ;
   private String AV127Tprocedwwds_23_tfpropers_sel ;
   private String AV126Tprocedwwds_22_tfpropers ;
   private String AV129Tprocedwwds_25_tfproemail_sel ;
   private String AV128Tprocedwwds_24_tfproemail ;
   private String AV131Tprocedwwds_27_tfprocenif_sel ;
   private String AV130Tprocedwwds_26_tfprocenif ;
   private String AV133Tprocedwwds_29_tfpocecp2_sel ;
   private String AV132Tprocedwwds_28_tfpocecp2 ;
   private String hsh ;
   private String AV101Station ;
   private String AV102Emprcod ;
   private String AV103Emprnom ;
   private String AV104Usurcod ;
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
   private String edtProceNom_Jsonclick ;
   private String edtProceCod_Jsonclick ;
   private String edtProceDom_Jsonclick ;
   private String edtProcePob_Jsonclick ;
   private String edtPrvCod_Jsonclick ;
   private String edtPrvDsc_Jsonclick ;
   private String edtPoceCp_Jsonclick ;
   private String edtProceTel1_Jsonclick ;
   private String edtProceTel2_Jsonclick ;
   private String edtProceTelex_Jsonclick ;
   private String edtProPers_Jsonclick ;
   private String edtProEmail_Jsonclick ;
   private String edtProceNif_Jsonclick ;
   private String edtProceNomID_Jsonclick ;
   private String edtPoceCp2_Jsonclick ;
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
   private boolean n971ProceNom ;
   private boolean n994ProceDom ;
   private boolean n988ProcePob ;
   private boolean n781PrvCod ;
   private boolean n787PrvDsc ;
   private boolean n989PoceCp ;
   private boolean n990ProceTel1 ;
   private boolean n991ProceTel2 ;
   private boolean n992ProceTelex ;
   private boolean n10390ProPers ;
   private boolean n10391ProEmail ;
   private boolean n993ProceNif ;
   private boolean n14029PoceCp2 ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV34ColumnsSelectorXML ;
   private String AV40ManageFiltersXml ;
   private String AV35UserCustomValue ;
   private String AV94FilterFullText ;
   private String A13820ProceNomID ;
   private String lV105Tprocedwwds_1_filterfulltext ;
   private String AV105Tprocedwwds_1_filterfulltext ;
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
   private String[] H00AE2_A396EmprCod ;
   private String[] H00AE2_A14029PoceCp2 ;
   private boolean[] H00AE2_n14029PoceCp2 ;
   private String[] H00AE2_A993ProceNif ;
   private boolean[] H00AE2_n993ProceNif ;
   private String[] H00AE2_A10391ProEmail ;
   private boolean[] H00AE2_n10391ProEmail ;
   private String[] H00AE2_A10390ProPers ;
   private boolean[] H00AE2_n10390ProPers ;
   private String[] H00AE2_A992ProceTelex ;
   private boolean[] H00AE2_n992ProceTelex ;
   private String[] H00AE2_A991ProceTel2 ;
   private boolean[] H00AE2_n991ProceTel2 ;
   private String[] H00AE2_A990ProceTel1 ;
   private boolean[] H00AE2_n990ProceTel1 ;
   private String[] H00AE2_A989PoceCp ;
   private boolean[] H00AE2_n989PoceCp ;
   private String[] H00AE2_A787PrvDsc ;
   private boolean[] H00AE2_n787PrvDsc ;
   private short[] H00AE2_A781PrvCod ;
   private boolean[] H00AE2_n781PrvCod ;
   private String[] H00AE2_A988ProcePob ;
   private boolean[] H00AE2_n988ProcePob ;
   private String[] H00AE2_A994ProceDom ;
   private boolean[] H00AE2_n994ProceDom ;
   private String[] H00AE2_A971ProceNom ;
   private boolean[] H00AE2_n971ProceNom ;
   private short[] H00AE2_A970ProceCod ;
   private long[] H00AE3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV82DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tprocedww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00AE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV105Tprocedwwds_1_filterfulltext ,
                                          String AV107Tprocedwwds_3_tfprocenom_sel ,
                                          String AV106Tprocedwwds_2_tfprocenom ,
                                          short AV108Tprocedwwds_4_tfprocecod ,
                                          short AV109Tprocedwwds_5_tfprocecod_to ,
                                          String AV111Tprocedwwds_7_tfprocedom_sel ,
                                          String AV110Tprocedwwds_6_tfprocedom ,
                                          String AV113Tprocedwwds_9_tfprocepob_sel ,
                                          String AV112Tprocedwwds_8_tfprocepob ,
                                          short AV114Tprocedwwds_10_tfprvcod ,
                                          short AV115Tprocedwwds_11_tfprvcod_to ,
                                          String AV117Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV116Tprocedwwds_12_tfprvdsc ,
                                          String AV119Tprocedwwds_15_tfpocecp_sel ,
                                          String AV118Tprocedwwds_14_tfpocecp ,
                                          String AV121Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV120Tprocedwwds_16_tfprocetel1 ,
                                          String AV123Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV122Tprocedwwds_18_tfprocetel2 ,
                                          String AV125Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV124Tprocedwwds_20_tfprocetelex ,
                                          String AV127Tprocedwwds_23_tfpropers_sel ,
                                          String AV126Tprocedwwds_22_tfpropers ,
                                          String AV129Tprocedwwds_25_tfproemail_sel ,
                                          String AV128Tprocedwwds_24_tfproemail ,
                                          String AV131Tprocedwwds_27_tfprocenif_sel ,
                                          String AV130Tprocedwwds_26_tfprocenif ,
                                          String AV133Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV132Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[47];
      Object[] GXv_Object34 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.PoceCp2, T1.ProceNif, T1.ProEmail, T1.ProPers, T1.ProceTelex, T1.ProceTel2, T1.ProceTel1, T1.PoceCp, T2.PrvDsc, T1.PrvCod, T1.ProcePob, T1.ProceDom," ;
      sSelectString += " T1.ProceNom, T1.ProceCod" ;
      sFromString = " FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      sOrderString = "" ;
      if ( ! (GXutil.strcmp("", AV105Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int33[0] = (byte)(1) ;
         GXv_int33[1] = (byte)(1) ;
         GXv_int33[2] = (byte)(1) ;
         GXv_int33[3] = (byte)(1) ;
         GXv_int33[4] = (byte)(1) ;
         GXv_int33[5] = (byte)(1) ;
         GXv_int33[6] = (byte)(1) ;
         GXv_int33[7] = (byte)(1) ;
         GXv_int33[8] = (byte)(1) ;
         GXv_int33[9] = (byte)(1) ;
         GXv_int33[10] = (byte)(1) ;
         GXv_int33[11] = (byte)(1) ;
         GXv_int33[12] = (byte)(1) ;
         GXv_int33[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! (0==AV108Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! (0==AV109Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV118Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV122Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV124Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV126Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV128Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV130Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV132Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProceNom" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProceNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProceDom" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProceDom DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProcePob" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProcePob DESC" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrvCod" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrvCod DESC" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrvDsc" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrvDsc DESC" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PoceCp" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PoceCp DESC" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProceTel1" ;
      }
      else if ( ( AV13OrderedBy == 8 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProceTel1 DESC" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProceTel2" ;
      }
      else if ( ( AV13OrderedBy == 9 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProceTel2 DESC" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProceTelex" ;
      }
      else if ( ( AV13OrderedBy == 10 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProceTelex DESC" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProPers" ;
      }
      else if ( ( AV13OrderedBy == 11 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProPers DESC" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProEmail" ;
      }
      else if ( ( AV13OrderedBy == 12 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProEmail DESC" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProceNif" ;
      }
      else if ( ( AV13OrderedBy == 13 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProceNif DESC" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PoceCp2" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PoceCp2 DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ProceCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H00AE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV105Tprocedwwds_1_filterfulltext ,
                                          String AV107Tprocedwwds_3_tfprocenom_sel ,
                                          String AV106Tprocedwwds_2_tfprocenom ,
                                          short AV108Tprocedwwds_4_tfprocecod ,
                                          short AV109Tprocedwwds_5_tfprocecod_to ,
                                          String AV111Tprocedwwds_7_tfprocedom_sel ,
                                          String AV110Tprocedwwds_6_tfprocedom ,
                                          String AV113Tprocedwwds_9_tfprocepob_sel ,
                                          String AV112Tprocedwwds_8_tfprocepob ,
                                          short AV114Tprocedwwds_10_tfprvcod ,
                                          short AV115Tprocedwwds_11_tfprvcod_to ,
                                          String AV117Tprocedwwds_13_tfprvdsc_sel ,
                                          String AV116Tprocedwwds_12_tfprvdsc ,
                                          String AV119Tprocedwwds_15_tfpocecp_sel ,
                                          String AV118Tprocedwwds_14_tfpocecp ,
                                          String AV121Tprocedwwds_17_tfprocetel1_sel ,
                                          String AV120Tprocedwwds_16_tfprocetel1 ,
                                          String AV123Tprocedwwds_19_tfprocetel2_sel ,
                                          String AV122Tprocedwwds_18_tfprocetel2 ,
                                          String AV125Tprocedwwds_21_tfprocetelex_sel ,
                                          String AV124Tprocedwwds_20_tfprocetelex ,
                                          String AV127Tprocedwwds_23_tfpropers_sel ,
                                          String AV126Tprocedwwds_22_tfpropers ,
                                          String AV129Tprocedwwds_25_tfproemail_sel ,
                                          String AV128Tprocedwwds_24_tfproemail ,
                                          String AV131Tprocedwwds_27_tfprocenif_sel ,
                                          String AV130Tprocedwwds_26_tfprocenif ,
                                          String AV133Tprocedwwds_29_tfpocecp2_sel ,
                                          String AV132Tprocedwwds_28_tfpocecp2 ,
                                          String A971ProceNom ,
                                          short A970ProceCod ,
                                          String A994ProceDom ,
                                          String A988ProcePob ,
                                          short A781PrvCod ,
                                          String A787PrvDsc ,
                                          String A989PoceCp ,
                                          String A990ProceTel1 ,
                                          String A991ProceTel2 ,
                                          String A992ProceTelex ,
                                          String A10390ProPers ,
                                          String A10391ProEmail ,
                                          String A993ProceNif ,
                                          String A14029PoceCp2 ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[42];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPPROCED T1 LEFT JOIN TXPPROVIN T2 ON T2.PrvCod = T1.PrvCod)" ;
      if ( ! (GXutil.strcmp("", AV105Tprocedwwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.ProceNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.ProceCod,'9990'), 2) like '%' || ?) or ( UPPER(T1.ProceDom) like '%' || UPPER(?)) or ( UPPER(T1.ProcePob) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrvCod,'990'), 2) like '%' || ?) or ( UPPER(T2.PrvDsc) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel1) like '%' || UPPER(?)) or ( UPPER(T1.ProceTel2) like '%' || UPPER(?)) or ( UPPER(T1.ProceTelex) like '%' || UPPER(?)) or ( UPPER(T1.ProPers) like '%' || UPPER(?)) or ( UPPER(T1.ProEmail) like '%' || UPPER(?)) or ( UPPER(T1.ProceNif) like '%' || UPPER(?)) or ( UPPER(T1.PoceCp2) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int35[0] = (byte)(1) ;
         GXv_int35[1] = (byte)(1) ;
         GXv_int35[2] = (byte)(1) ;
         GXv_int35[3] = (byte)(1) ;
         GXv_int35[4] = (byte)(1) ;
         GXv_int35[5] = (byte)(1) ;
         GXv_int35[6] = (byte)(1) ;
         GXv_int35[7] = (byte)(1) ;
         GXv_int35[8] = (byte)(1) ;
         GXv_int35[9] = (byte)(1) ;
         GXv_int35[10] = (byte)(1) ;
         GXv_int35[11] = (byte)(1) ;
         GXv_int35[12] = (byte)(1) ;
         GXv_int35[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprocedwwds_3_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprocedwwds_2_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprocedwwds_3_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNom = ?)");
      }
      else
      {
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! (0==AV108Tprocedwwds_4_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( ! (0==AV109Tprocedwwds_5_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Tprocedwwds_7_tfprocedom_sel)==0) && ( ! (GXutil.strcmp("", AV110Tprocedwwds_6_tfprocedom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceDom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Tprocedwwds_7_tfprocedom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceDom = ?)");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Tprocedwwds_9_tfprocepob_sel)==0) && ( ! (GXutil.strcmp("", AV112Tprocedwwds_8_tfprocepob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProcePob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Tprocedwwds_9_tfprocepob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProcePob = ?)");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (0==AV114Tprocedwwds_10_tfprvcod) )
      {
         addWhere(sWhereString, "(T1.PrvCod >= ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( ! (0==AV115Tprocedwwds_11_tfprvcod_to) )
      {
         addWhere(sWhereString, "(T1.PrvCod <= ?)");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Tprocedwwds_13_tfprvdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Tprocedwwds_12_tfprvdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Tprocedwwds_13_tfprvdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvDsc = ?)");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Tprocedwwds_15_tfpocecp_sel)==0) && ( ! (GXutil.strcmp("", AV118Tprocedwwds_14_tfpocecp)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Tprocedwwds_15_tfpocecp_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp = ?)");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Tprocedwwds_17_tfprocetel1_sel)==0) && ( ! (GXutil.strcmp("", AV120Tprocedwwds_16_tfprocetel1)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel1) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Tprocedwwds_17_tfprocetel1_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel1 = ?)");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Tprocedwwds_19_tfprocetel2_sel)==0) && ( ! (GXutil.strcmp("", AV122Tprocedwwds_18_tfprocetel2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTel2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Tprocedwwds_19_tfprocetel2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTel2 = ?)");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tprocedwwds_21_tfprocetelex_sel)==0) && ( ! (GXutil.strcmp("", AV124Tprocedwwds_20_tfprocetelex)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceTelex) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tprocedwwds_21_tfprocetelex_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceTelex = ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Tprocedwwds_23_tfpropers_sel)==0) && ( ! (GXutil.strcmp("", AV126Tprocedwwds_22_tfpropers)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProPers) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Tprocedwwds_23_tfpropers_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProPers = ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Tprocedwwds_25_tfproemail_sel)==0) && ( ! (GXutil.strcmp("", AV128Tprocedwwds_24_tfproemail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProEmail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Tprocedwwds_25_tfproemail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProEmail = ?)");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Tprocedwwds_27_tfprocenif_sel)==0) && ( ! (GXutil.strcmp("", AV130Tprocedwwds_26_tfprocenif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProceNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Tprocedwwds_27_tfprocenif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProceNif = ?)");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Tprocedwwds_29_tfpocecp2_sel)==0) && ( ! (GXutil.strcmp("", AV132Tprocedwwds_28_tfpocecp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PoceCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Tprocedwwds_29_tfpocecp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PoceCp2 = ?)");
      }
      else
      {
         GXv_int35[41] = (byte)(1) ;
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
      else if ( ( AV13OrderedBy == 14 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 14 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H00AE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() );
            case 1 :
                  return conditional_H00AE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00AE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00AE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 14);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 34);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(15);
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
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 34);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 34);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 9);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 9);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 9);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 9);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 14);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 14);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 40);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 40);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 6);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 6);
               }
               return;
      }
   }

}

